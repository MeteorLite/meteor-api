import java.math.BigInteger;

public class Buffer extends CacheableNode {

  public static final int[] BIT_MASKS = {0, 1, 3, 7, 15, 31, 63, 127, 255,
      511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff,
      0x7ffff, 0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff,
      0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff, 0x3fffffff,
      0x7fffffff, -1};
  public static boolean ENABLE_RSA = true;
  public static int anInt1459;
  public static int anInt1460;
  public static int anInt1461;
  public static Deque smallBufferPool = new Deque();
  public static Deque defaultBufferPool = new Deque();
  public static Deque largeBufferPool = new Deque();
  public byte[] payload;
  public int offset;
  public int bitIndex;
  public IsaacCipher encryption;

  public Buffer() {
  }

  public Buffer(byte[] data) {
    payload = data;
    offset = 0;
  }

  public static Buffer create(int type) {
    synchronized (defaultBufferPool) {
      Buffer buffer = null;
      if (type == 0 && anInt1459 > 0) {
        anInt1459--;
        buffer = (Buffer) smallBufferPool.method157();
      } else if (type == 1 && anInt1460 > 0) {
        anInt1460--;
        buffer = (Buffer) defaultBufferPool.method157();
      } else if (type == 2 && anInt1461 > 0) {
        anInt1461--;
        buffer = (Buffer) largeBufferPool.method157();
      }
      if (buffer != null) {
        buffer.offset = 0;
        return buffer;
      }
    }
    Buffer buffer = new Buffer();
    buffer.offset = 0;
    if (type == 0) {
      buffer.payload = new byte[100];
    } else if (type == 1) {
      buffer.payload = new byte[5000];
    } else {
      buffer.payload = new byte[30000];
    }
    return buffer;
  }


  public void writeShortLE(int i) {
    payload[offset++] = (byte) i;
    payload[offset++] = (byte) (i >> 8);
  }

  public void writeShortAdd(int i) {
    payload[offset++] = (byte) (i >> 8);
    payload[offset++] = (byte) (i + 128);
  }

  public void writeShortAddLE(int i) {
    payload[offset++] = (byte) (i + 128);
    payload[offset++] = (byte) (i >> 8);
  }

  public void writeByte(int i) {
    payload[offset++] = (byte) i;
  }

  public void writeShort(int i) {
    payload[offset++] = (byte) (i >> 8);
    payload[offset++] = (byte) i;
  }

  public void writeMedium(int i) {
    payload[offset++] = (byte) (i >> 16);
    payload[offset++] = (byte) (i >> 8);
    payload[offset++] = (byte) i;
  }

  public void writeInt(int i) {
    payload[offset++] = (byte) (i >> 24);
    payload[offset++] = (byte) (i >> 16);
    payload[offset++] = (byte) (i >> 8);
    payload[offset++] = (byte) i;
  }

  public void writeIntLE(int i) {
    payload[offset++] = (byte) i;
    payload[offset++] = (byte) (i >> 8);
    payload[offset++] = (byte) (i >> 16);
    payload[offset++] = (byte) (i >> 24);
  }

  public void writeLong(long l) {
    payload[offset++] = (byte) (int) (l >> 56);
    payload[offset++] = (byte) (int) (l >> 48);
    payload[offset++] = (byte) (int) (l >> 40);
    payload[offset++] = (byte) (int) (l >> 32);
    payload[offset++] = (byte) (int) (l >> 24);
    payload[offset++] = (byte) (int) (l >> 16);
    payload[offset++] = (byte) (int) (l >> 8);
    payload[offset++] = (byte) (int) l;
  }

  public void writeString(String s) {
    s.getBytes(0, s.length(), payload, offset);
    offset += s.length();
    payload[offset++] = 10;
  }

  public void writeBytes(byte[] data, int offset, int length) {
    for (int i = offset; i < offset + length; i++) {
      payload[this.offset++] = data[i];
    }
  }

  public void writeSizeByte(int i) {
    payload[offset - i - 1] = (byte) i;
  }

  public int readUByte() {
    return payload[offset++] & 0xff;
  }
  public byte readByte() {
    return payload[offset++];
  }

  public int readUShort() {
    offset += 2;
    return ((payload[offset - 2] & 0xff) << 8)
        + (payload[offset - 1] & 0xff);
  }

  public int readUShortSub() {
    offset += 2;
    return ((payload[offset - 2] & 0xff) << 8)
        + (payload[offset - 1] - 128 & 0xff);
  }

  public int readUShortLE() {
    offset += 2;
    return ((payload[offset - 1] & 0xff) << 8)
        + (payload[offset - 2] & 0xff);
  }

  public int readShort() {
    offset += 2;
    int i = ((payload[offset - 2] & 0xff) << 8)
        + (payload[offset - 1] & 0xff);
    if (i > 32767) {
      i -= 0x10000;
    }
    return i;
  }

  public int readShortSub() {
    offset += 2;
    int i = ((payload[offset - 2] & 0xff) << 8)
        + (payload[offset - 1] - 128 & 0xff);
    if (i > 32767) {
      i -= 0x10000;
    }
    return i;
  }

  public int readShortLE() {
    offset += 2;
    int j = ((payload[offset - 1] & 0xff) << 8)
        + (payload[offset - 2] & 0xff);
    if (j > 32767) {
      j -= 0x10000;
    }
    return j;
  }

  public int readShortLESub() {
    offset += 2;
    return ((payload[offset - 1] & 0xff) << 8)
        + (payload[offset - 2] - 128 & 0xff);
  }

  public int readMedium() {
    offset += 3;
    return ((payload[offset - 3] & 0xff) << 16)
        + ((payload[offset - 2] & 0xff) << 8)
        + (payload[offset - 1] & 0xff);
  }

  public int readInt() {
    offset += 4;
    return ((payload[offset - 4] & 0xff) << 24)
        + ((payload[offset - 3] & 0xff) << 16)
        + ((payload[offset - 2] & 0xff) << 8)
        + (payload[offset - 1] & 0xff);
  }

  public int method555() {
    offset += 4;
    return ((payload[offset - 1] & 0xff) << 24)
        + ((payload[offset - 2] & 0xff) << 16)
        + ((payload[offset - 3] & 0xff) << 8)
        + (payload[offset - 4] & 0xff);
  }

  public int method556() {
    offset += 4;
    return ((payload[offset - 2] & 0xff) << 24)
        + ((payload[offset - 1] & 0xff) << 16)
        + ((payload[offset - 4] & 0xff) << 8)
        + (payload[offset - 3] & 0xff);
  }

  public int method557() {
    offset += 4;
    return ((payload[offset - 3] & 0xff) << 24)
        + ((payload[offset - 4] & 0xff) << 16)
        + ((payload[offset - 1] & 0xff) << 8)
        + (payload[offset - 2] & 0xff);
  }

  public long readLong() {
    long l = (long) readInt() & 0xffffffffL;
    long l1 = (long) readInt() & 0xffffffffL;
    return (l << 32) + l1;
  }

  public String readJString() {
    int off = offset;
    while (payload[offset++] != 10) {
    }
    return new String(payload, off, offset - off - 1);
  }

  public byte[] readBytesString() {
    int j = offset;
    while (payload[offset++] != 10) {
    }
    byte[] bytes = new byte[offset - j - 1];
    if (offset - 1 - j >= 0)
      System.arraycopy(payload, j, bytes, j - j, offset - 1 - j);

    return bytes;
  }

  public void readBytes(byte[] data, int offset, int length) {
    for (int l = offset; l < offset + length; l++) {
      data[l] = payload[this.offset++];
    }
  }

  public void writeByteAdd(int i) {
    payload[offset++] = (byte) (i + 128);
  }

  public void writeByteNeg(int i) {
    payload[offset++] = (byte) -i;
  }

  public void writeByteSub(int i) {
    payload[offset++] = (byte) (128 - i);
  }

  public int readUByteAdd() {
    return payload[offset++] - 128 & 0xff;
  }

  public int readUByteNeg() {
    return -payload[offset++] & 0xff;
  }

  public int readUByteSub() {
    return 128 - payload[offset++] & 0xff;
  }

  public byte readByteAdd() {
    return (byte) (payload[offset++] - 128);
  }

  public byte readByteNeg() {
    return (byte) -payload[offset++];
  }

  public byte readByteSub() {
    return (byte) (128 - payload[offset++]);
  }

  public void writeByteIsaac(int i) {
    payload[offset++] = (byte) (i + encryption.nextKey());
  }

  public void enableBitAccess() {
    bitIndex = offset * 8;
  }

  public int readBits(int numBits) {
    int k = bitIndex >> 3;
    int l = 8 - (bitIndex & 7);
    int bit = 0;
    bitIndex += numBits;
    for (; numBits > l; l = 8) {
      bit += (payload[k++] & BIT_MASKS[l]) << numBits - l;
      numBits -= l;
    }

    if (numBits == l) {
      bit += payload[k] & BIT_MASKS[l];
    } else {
      bit += payload[k] >> l - numBits & BIT_MASKS[numBits];
    }
    return bit;
  }

  public void disableBitAccess() {
    offset = (bitIndex + 7) / 8;
  }

  public int method534() {
    int i = payload[offset] & 0xff;
    if (i < 128) {
      return readUByte() - 64;
    } else {
      return readUShort() - 49152;
    }
  }

  public int method535() {
    int i = payload[offset] & 0xff;
    if (i < 128) {
      return readUByte();
    } else {
      return readUShort() - 32768;
    }
  }

  public void encodeRSA(BigInteger modulus, BigInteger exponent) {
    int length = offset;
    offset = 0;
    byte[] buffer = new byte[length];
    readBytes(buffer, 0, length);
    byte[] rsaBuffer = buffer;
    if (ENABLE_RSA) {
      BigInteger bigInteger = new BigInteger(buffer);
      BigInteger rsa = bigInteger.modPow(exponent, modulus);
      rsaBuffer = rsa.toByteArray();
    }
    offset = 0;
    writeByte(rsaBuffer.length);
    writeBytes(rsaBuffer, 0, rsaBuffer.length);
  }

  public int method554() {
    offset += 3;
    return ((payload[offset - 2] & 0xff) << 16)
        + ((payload[offset - 3] & 0xff) << 8)
        + (payload[offset - 1] & 0xff);
  }

  public void readReverseData(byte[] data, int offset, int length) {
    for (int k = length + offset - 1; k >= length; k--) {
      data[k] = payload[this.offset++];
    }
  }

  public void readDataA(byte[] data, int length, int offset) {
    for (int l = offset; l < offset + length; l++) {
      data[l] = (byte) (payload[this.offset++] - 128);
    }
  }

}