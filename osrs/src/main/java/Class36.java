public class Class36 {

  public static float[][] aFloatArrayArray617 = new float[2][8];
  public static int[][] anIntArrayArray618 = new int[2][8];
  public static float aFloat619;
  public static int anInt620;
  public int anInt611;
  public boolean aBoolean612;
  public int[] anIntArray613;
  public int[][][] anIntArrayArrayArray614;
  public int[][][] anIntArrayArrayArray615;
  public int[] anIntArray616;
  public Class36() {
    aBoolean612 = true;
    anIntArray613 = new int[2];
    anIntArrayArrayArray614 = new int[2][2][4];
    anIntArrayArrayArray615 = new int[2][2][4];
    anIntArray616 = new int[2];
  }

  public float method352(int i, int j, float f, int k) {
    float f1 = (float) anIntArrayArrayArray615[i][0][k]
        + f
        * (float) (anIntArrayArrayArray615[i][1][k] - anIntArrayArrayArray615[i][0][k]);
    f1 *= 0.001525879F;
    j = 34 / j;
    return 1.0F - (float) Math.pow(10D, -f1 / 20F);
  }

  public float method353(float f) {
    float f1 = 32.7032F * (float) Math.pow(2D, f);
    return f1 * 3.141593F / 11025F;
  }

  public float method354(int i, int k, float f) {
    float f1 = (float) anIntArrayArrayArray614[k][0][i]
        + f
        * (float) (anIntArrayArrayArray614[k][1][i] - anIntArrayArrayArray614[k][0][i]);
    f1 *= 0.0001220703F;
    return method353(f1);
  }

  public int method355(int i, float f) {
    if (i == 0) {
      float f1 = (float) anIntArray616[0]
          + (float) (anIntArray616[1] - anIntArray616[0]) * f;
      f1 *= 0.003051758F;
      aFloat619 = (float) Math.pow(0.10000000000000001D, f1 / 20F);
      anInt620 = (int) (aFloat619 * 65536F);
    }
    if (anIntArray613[i] == 0) {
      return 0;
    }
    float f2 = method352(i, 849, f, 0);
    aFloatArrayArray617[i][0] = -2F * f2
        * (float) Math.cos(method354(0, i, f));
    aFloatArrayArray617[i][1] = f2 * f2;
    for (int k = 1; k < anIntArray613[i]; k++) {
      float f3 = method352(i, 849, f, k);
      float f4 = -2F * f3 * (float) Math.cos(method354(k, i, f));
      float f5 = f3 * f3;
      aFloatArrayArray617[i][k * 2 + 1] = aFloatArrayArray617[i][k * 2 - 1]
          * f5;
      aFloatArrayArray617[i][k * 2] = aFloatArrayArray617[i][k * 2 - 1]
          * f4 + aFloatArrayArray617[i][k * 2 - 2] * f5;
      for (int j1 = k * 2 - 1; j1 >= 2; j1--) {
        aFloatArrayArray617[i][j1] += aFloatArrayArray617[i][j1 - 1]
            * f4 + aFloatArrayArray617[i][j1 - 2] * f5;
      }

      aFloatArrayArray617[i][1] += aFloatArrayArray617[i][0] * f4 + f5;
      aFloatArrayArray617[i][0] += f4;
    }

    if (i == 0) {
      for (int l = 0; l < anIntArray613[0] * 2; l++) {
        aFloatArrayArray617[0][l] *= aFloat619;
      }

    }
    for (int i1 = 0; i1 < anIntArray613[i] * 2; i1++) {
      anIntArrayArray618[i][i1] = (int) (aFloatArrayArray617[i][i1] * 65536F);
    }

    return anIntArray613[i] * 2;
  }

  public void method356(Class29 class29, Buffer buffer) {
    int j = buffer.readUByte();
    anIntArray613[0] = j >> 4;
    anIntArray613[1] = j & 0xf;
    if (j != 0) {
      anIntArray616[0] = buffer.readUShort();
      anIntArray616[1] = buffer.readUShort();
      int l = buffer.readUByte();
      for (int i1 = 0; i1 < 2; i1++) {
        for (int j1 = 0; j1 < anIntArray613[i1]; j1++) {
          anIntArrayArrayArray614[i1][0][j1] = buffer
              .readUShort();
          anIntArrayArrayArray615[i1][0][j1] = buffer
              .readUShort();
        }

      }

      for (int k1 = 0; k1 < 2; k1++) {
        for (int l1 = 0; l1 < anIntArray613[k1]; l1++) {
          if ((l & 1 << k1 * 4 << l1) != 0) {
            anIntArrayArrayArray614[k1][1][l1] = buffer
                .readUShort();
            anIntArrayArrayArray615[k1][1][l1] = buffer
                .readUShort();
          } else {
            anIntArrayArrayArray614[k1][1][l1] = anIntArrayArrayArray614[k1][0][l1];
            anIntArrayArrayArray615[k1][1][l1] = anIntArrayArrayArray615[k1][0][l1];
          }
        }

      }

      if (l != 0 || anIntArray616[1] != anIntArray616[0]) {
        class29.method309(buffer);
      }
    } else {
      anIntArray616[0] = anIntArray616[1] = 0;
    }
  }

}
