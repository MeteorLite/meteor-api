public class Animation {

  public static int anInt428 = 217;
  public static boolean aBoolean429;
  public static Animation[] animations;
  public static boolean[] aBooleanArray438;
  public int anInt431;
  public Skins aClass41_432;
  public int stepCount;
  public int[] opcodeLinkTable;
  public int[] anIntArray435;
  public int[] anIntArray436;
  public int[] anIntArray437;
  public Animation() {
  }

  public static void init(int size) {
    animations = new Animation[size + 1];
    aBooleanArray438 = new boolean[size + 1];
    for (int j = 0; j < size + 1; j++) {
      aBooleanArray438[j] = true;
    }

  }

  public static void load(byte[] data) {
    Buffer buffer = new Buffer(data);
    buffer.offset = data.length - 8;
    int i = buffer.readUShort();
    int j = buffer.readUShort();
    int k = buffer.readUShort();
    int l = buffer.readUShort();
    int i1 = 0;
    Buffer class50_sub1_sub2_1 = new Buffer(data);
    class50_sub1_sub2_1.offset = i1;
    i1 += i + 2;
    Buffer class50_sub1_sub2_2 = new Buffer(data);
    class50_sub1_sub2_2.offset = i1;
    i1 += j;
    Buffer class50_sub1_sub2_3 = new Buffer(data);
    class50_sub1_sub2_3.offset = i1;
    i1 += k;
    Buffer class50_sub1_sub2_4 = new Buffer(data);
    class50_sub1_sub2_4.offset = i1;
    i1 += l;
    Buffer class50_sub1_sub2_5 = new Buffer(data);
    class50_sub1_sub2_5.offset = i1;
    Skins skins = new Skins(class50_sub1_sub2_5);
    int j1 = class50_sub1_sub2_1.readUShort();
    int[] ai = new int[500];
    int[] ai1 = new int[500];
    int[] ai2 = new int[500];
    int[] ai3 = new int[500];
    for (int k1 = 0; k1 < j1; k1++) {
      int l1 = class50_sub1_sub2_1.readUShort();
      Animation animation = animations[l1] = new Animation();
      animation.anInt431 = class50_sub1_sub2_4.readUByte();
      animation.aClass41_432 = skins;
      int i2 = class50_sub1_sub2_1.readUByte();
      int j2 = -1;
      int stepCount = 0;
      for (int l2 = 0; l2 < i2; l2++) {
        int i3 = class50_sub1_sub2_2.readUByte();
        if (i3 > 0) {
          if (skins.opcodes[l2] != 0) {
            for (int k3 = l2 - 1; k3 > j2; k3--) {
              if (skins.opcodes[k3] != 0) {
                continue;
              }
              ai[stepCount] = k3;
              ai1[stepCount] = 0;
              ai2[stepCount] = 0;
              ai3[stepCount] = 0;
              stepCount++;
              break;
            }

          }
          ai[stepCount] = l2;
          char c = '\0';
          if (skins.opcodes[l2] == 3) {
            c = '\200';
          }
          if ((i3 & 1) != 0) {
            ai1[stepCount] = class50_sub1_sub2_3.method534();
          } else {
            ai1[stepCount] = c;
          }
          if ((i3 & 2) != 0) {
            ai2[stepCount] = class50_sub1_sub2_3.method534();
          } else {
            ai2[stepCount] = c;
          }
          if ((i3 & 4) != 0) {
            ai3[stepCount] = class50_sub1_sub2_3.method534();
          } else {
            ai3[stepCount] = c;
          }
          j2 = l2;
          stepCount++;
          if (skins.opcodes[l2] == 5) {
            aBooleanArray438[l1] = false;
          }
        }
      }

      animation.stepCount = stepCount;
      animation.opcodeLinkTable = new int[stepCount];
      animation.anIntArray435 = new int[stepCount];
      animation.anIntArray436 = new int[stepCount];
      animation.anIntArray437 = new int[stepCount];
      for (int j3 = 0; j3 < stepCount; j3++) {
        animation.opcodeLinkTable[j3] = ai[j3];
        animation.anIntArray435[j3] = ai1[j3];
        animation.anIntArray436[j3] = ai2[j3];
        animation.anIntArray437[j3] = ai3[j3];
      }

    }

  }

  public static void method237() {
    animations = null;
  }

  public static Animation getAnimation(int animationId) {
    if (animations == null) {
      return null;
    }
    return animations[animationId];
  }

  public static boolean frameIsNull(int frame) {
    return frame == -1;
  }

}
