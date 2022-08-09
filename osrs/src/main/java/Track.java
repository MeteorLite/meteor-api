public class Track {

  public static Track[] tracks = new Track[5000];
  public static int[] delays = new int[5000];
  public static byte[] output;
  public static Buffer riffBuffer;
  public Synthesizer[] synthesizers;
  public int loopBeginning;
  public int loopEnd;

  public Track() {
    synthesizers = new Synthesizer[10];
  }

  public static void load(Buffer soundsBuffer) {
    output = new byte[0x6baa8];
    riffBuffer = new Buffer(output);
    Synthesizer.init();
    do {
      int i = soundsBuffer.readUShort();
      if (i == 65535) {
        return;
      }
      tracks[i] = new Track();
      tracks[i].decode(soundsBuffer);
      delays[i] = tracks[i].calculateDelay();
    } while (true);
  }

  public static Buffer data(int loops, int id) {
    if (tracks[id] != null) {
      Track track = tracks[id];
      return track.pack(loops);
    }
    return null;
  }

  public void decode(Buffer buffer) {
    for (int i = 0; i < 10; i++) {
      int j = buffer.readUByte();
      if (j != 0) {
        buffer.offset--;
        synthesizers[i] = new Synthesizer();
        synthesizers[i].decode(buffer);
      }
    }

    loopBeginning = buffer.readUShort();
    loopEnd = buffer.readUShort();
  }

  public int calculateDelay() {
    int offset = 0x98967f;
    for (int i = 0; i < 10; i++) {
      if (synthesizers[i] != null && synthesizers[i].offset / 20 < offset) {
        offset = synthesizers[i].offset / 20;
      }
    }

    if (loopBeginning < loopEnd && loopBeginning / 20 < offset) {
      offset = loopBeginning / 20;
    }
    if (offset == 0x98967f || offset == 0) {
      return 0;
    }
    for (int i = 0; i < 10; i++) {
      if (synthesizers[i] != null) {
        synthesizers[i].offset -= offset * 20;
      }
    }
    if (loopBeginning < loopEnd) {
      loopBeginning -= offset * 20;
      loopEnd -= offset * 20;
    }
    return offset;
  }

  public Buffer pack(int loops) {
    int size = mix(loops);
    riffBuffer.offset = 0;
    riffBuffer.writeInt(0x52494646);
    riffBuffer.writeIntLE(36 + size);
    riffBuffer.writeInt(0x57415645);
    riffBuffer.writeInt(0x666d7420);
    riffBuffer.writeIntLE(16);
    riffBuffer.writeShortLE(1);
    riffBuffer.writeShortLE(1);
    riffBuffer.writeIntLE(22050);
    riffBuffer.writeIntLE(22050);
    riffBuffer.writeShortLE(1);
    riffBuffer.writeShortLE(8);
    riffBuffer.writeInt(0x64617461);
    riffBuffer.writeIntLE(size);
    riffBuffer.offset += size;
    return riffBuffer;
  }

  private final int mix(int loops) {
    int duration = 0;
    for (int i = 0; i < 10; i++) {
      if (synthesizers[i] != null
          && synthesizers[i].duration + synthesizers[i].offset > duration) {
        duration = synthesizers[i].duration + synthesizers[i].offset;
      }
    }

    if (duration == 0) {
      return 0;
    }
    int sampleCount = 22050 * duration / 1000;
    int loopBeginning = 22050 * this.loopBeginning / 1000;
    int loopEnd = 22050 * this.loopEnd / 1000;
    if (loopBeginning < 0 || loopBeginning > sampleCount || loopEnd < 0
        || loopEnd > sampleCount || loopBeginning >= loopEnd) {
      loops = 0;
    }
    int dataLength = sampleCount + (loopEnd - loopBeginning) * (loops - 1);
    for (int offset = 44; offset < dataLength + 44; offset++) {
      output[offset] = -128;
    }

    for (int i = 0; i < 10; i++) {
      if (synthesizers[i] != null) {
        int dur = synthesizers[i].duration * 22050 / 1000;
        int off = synthesizers[i].offset * 22050 / 1000;
        int[] samples = synthesizers[i].synthesise(dur,
            synthesizers[i].duration);
        for (int j = 0; j < dur; j++) {
          int out = (output[j + off + 44] & 0xff) + (samples[j] >> 8);
          if ((out & 0xffffff00) != 0) {
            out = ~(out >> 31);
          }
          output[j + off + 44] = (byte) out;
        }

      }
    }

    if (loops > 1) {
      loopBeginning += 44;
      loopEnd += 44;
      sampleCount += 44;
      int k2 = (dataLength += 44) - sampleCount;
      for (int j3 = sampleCount - 1; j3 >= loopEnd; j3--) {
        output[j3 + k2] = output[j3];
      }

      for (int k3 = 1; k3 < loops; k3++) {
        int l2 = (loopEnd - loopBeginning) * k3;
        for (int i4 = loopBeginning; i4 < loopEnd; i4++) {
          output[i4 + l2] = output[i4];
        }

      }

      dataLength -= 44;
    }
    return dataLength;
  }

}