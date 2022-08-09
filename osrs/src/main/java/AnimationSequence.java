public class AnimationSequence {

  public static byte aByte290 = 6;
  public static int length;
  public static AnimationSequence[] animationSequences;
  public static int anInt309;
  public boolean aBoolean291;
  public int anInt294;
  public int[] anIntArray295;
  public int[] anIntArray296;
  public int[] anIntArray297;
  public int anInt298;
  public int[] anIntArray299;
  public boolean aBoolean300;
  public int anInt301;
  public int anInt302;
  public int anInt303;
  public int anInt304;
  public int anInt305;
  public int anInt306;
  public int anInt307;
  public int anInt308;
  public AnimationSequence() {
    aBoolean291 = false;
    anInt298 = -1;
    aBoolean300 = false;
    anInt301 = 5;
    anInt302 = -1;
    anInt303 = -1;
    anInt304 = 99;
    anInt305 = -1;
    anInt306 = -1;
    anInt307 = 2;
  }

  public static void init(Archive archive) {
    Buffer buffer = new Buffer(archive.extract("seq.dat"));
    length = buffer.readUShort();
    if (animationSequences == null) {
      animationSequences = new AnimationSequence[length];
    }
    for (int j = 0; j < length; j++) {
      if (animationSequences[j] == null) {
        animationSequences[j] = new AnimationSequence();
      }
      animationSequences[j].readValues(buffer);
    }
  }

  public int method205(int i, int j) {
    int k = anIntArray297[j];
    if (i != 0) {
      return 1;
    }
    if (k == 0) {
      Animation class21 = Animation.getAnimation(anIntArray295[j]);
      if (class21 != null) {
        k = anIntArray297[j] = class21.anInt431;
      }
    }
    if (k == 0) {
      k = 1;
    }
    return k;
  }

  public void readValues(Buffer buffer) {
    do {
      int opcode = buffer.readUByte();
      if (opcode == 0) {
        break;
      }
      if (opcode == 1) {
        anInt294 = buffer.readUByte();
        anIntArray295 = new int[anInt294];
        anIntArray296 = new int[anInt294];
        anIntArray297 = new int[anInt294];
        for (int j = 0; j < anInt294; j++) {
          anIntArray295[j] = buffer.readUShort();
          anIntArray296[j] = buffer.readUShort();
          if (anIntArray296[j] == 65535) {
            anIntArray296[j] = -1;
          }
          anIntArray297[j] = buffer.readUShort();
        }

      } else if (opcode == 2) {
        anInt298 = buffer.readUShort();
      } else if (opcode == 3) {
        int k = buffer.readUByte();
        anIntArray299 = new int[k + 1];
        for (int l = 0; l < k; l++) {
          anIntArray299[l] = buffer.readUByte();
        }

        anIntArray299[k] = 0x98967f;
      } else if (opcode == 4) {
        aBoolean300 = true;
      } else if (opcode == 5) {
        anInt301 = buffer.readUByte();
      } else if (opcode == 6) {
        anInt302 = buffer.readUShort();
      } else if (opcode == 7) {
        anInt303 = buffer.readUShort();
      } else if (opcode == 8) {
        anInt304 = buffer.readUByte();
      } else if (opcode == 9) {
        anInt305 = buffer.readUByte();
      } else if (opcode == 10) {
        anInt306 = buffer.readUByte();
      } else if (opcode == 11) {
        anInt307 = buffer.readUByte();
      } else if (opcode == 12) {
        anInt308 = buffer.readInt();
      } else {
        System.out.println("Error unrecognised seq config code: " + opcode);
      }
    } while (true);
    if (anInt294 == 0) {
      anInt294 = 1;
      anIntArray295 = new int[1];
      anIntArray295[0] = -1;
      anIntArray296 = new int[1];
      anIntArray296[0] = -1;
      anIntArray297 = new int[1];
      anIntArray297[0] = -1;
    }
    if (anInt305 == -1) {
      if (anIntArray299 != null) {
        anInt305 = 2;
      } else {
        anInt305 = 0;
      }
    }
    if (anInt306 == -1) {
      if (anIntArray299 != null) {
        anInt306 = 2;
        return;
      }
      anInt306 = 0;
    }
  }

}