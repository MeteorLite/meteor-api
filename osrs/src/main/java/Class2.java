public class Class2 {

  public static final float[][] aFloatArrayArray59;
  public static final int[][] anIntArrayArray60;
  public static float aFloat61;
  public static int anInt62;
  public final int[][][] anIntArrayArrayArray56;
  public final int[][][] anIntArrayArrayArray57;
  public int anInt52;
  public boolean aBoolean53;
  public final int[] anIntArray58;
  public final int[] anIntArray55;
  public final byte aByte54;

  static {
    aFloatArrayArray59 = new float[2][8];
    anIntArrayArray60 = new int[2][8];
  }

  public Class2() {
    this.anInt52 = 181;
    this.aBoolean53 = true;
    this.aByte54 = 1;
    this.anIntArray55 = new int[2];
    this.anIntArrayArrayArray56 = new int[2][2][4];
    this.anIntArrayArrayArray57 = new int[2][2][4];
    this.anIntArray58 = new int[2];
  }

  public float method153(byte var1, float var2) {
    float var3 = 32.7032F * (float) Math.pow(2.0D, var2);
    return var3 * 3.141593F / 11025.0F;
  }

  public float method152(int var1, int var2, int var3, float var4) {
    float var5 = (float) this.anIntArrayArrayArray57[var3][0][var1] + var4 * (float) (
        this.anIntArrayArrayArray57[var3][1][var1] - this.anIntArrayArrayArray57[var3][0][var1]);
    var2 = 49 / var2;
    var5 *= 0.001525879F;
    return 1.0F - (float) Math.pow(10.0D, -var5 / 20.0F);
  }

  public float method154(byte var1, int var2, int var3, float var4) {
    float var5 = (float) this.anIntArrayArrayArray56[var2][0][var3] + var4 * (float) (
        this.anIntArrayArrayArray56[var2][1][var3] - this.anIntArrayArrayArray56[var2][0][var3]);
    if (this.aByte54 != var1) {
      this.anInt52 = -228;
    }

    var5 *= 1.220703E-4F;
    return this.method153((byte) -81, var5);
  }

  public int method155(int var1, float var2, byte var3) {
    if (var3 == 1) {
      boolean var10 = false;
    } else {
      this.aBoolean53 = !this.aBoolean53;
    }

    float var4;
    if (var1 == 0) {
      var4 = (float) this.anIntArray58[0]
          + (float) (this.anIntArray58[1] - this.anIntArray58[0]) * var2;
      var4 *= 0.003051758F;
      aFloat61 = (float) Math.pow(0.1D, var4 / 20.0F);
      anInt62 = (int) (aFloat61 * 65536.0F);
    }

    if (this.anIntArray55[var1] == 0) {
      return 0;
    } else {
      var4 = this.method152(0, 680, var1, var2);
      aFloatArrayArray59[var1][0] =
          -2.0F * var4 * (float) Math.cos(this.method154((byte) 1, var1, 0, var2));
      aFloatArrayArray59[var1][1] = var4 * var4;

      float[] var10000;
      int var5;
      for (var5 = 1; var5 < this.anIntArray55[var1]; ++var5) {
        float var6 = this.method152(var5, 680, var1, var2);
        float var7 =
            -2.0F * var6 * (float) Math.cos(this.method154((byte) 1, var1, var5, var2));
        float var8 = var6 * var6;
        aFloatArrayArray59[var1][var5 * 2 + 1] = aFloatArrayArray59[var1][var5 * 2 - 1] * var8;
        aFloatArrayArray59[var1][var5 * 2] = aFloatArrayArray59[var1][var5 * 2 - 1] * var7
            + aFloatArrayArray59[var1][var5 * 2 - 2] * var8;

        for (int var9 = var5 * 2 - 1; var9 >= 2; --var9) {
          var10000 = aFloatArrayArray59[var1];
          var10000[var9] +=
              aFloatArrayArray59[var1][var9 - 1] * var7 + aFloatArrayArray59[var1][var9 - 2] * var8;
        }

        var10000 = aFloatArrayArray59[var1];
        var10000[1] += aFloatArrayArray59[var1][0] * var7 + var8;
        var10000 = aFloatArrayArray59[var1];
        var10000[0] += var7;
      }

      if (var1 == 0) {
        for (var5 = 0; var5 < this.anIntArray55[0] * 2; ++var5) {
          var10000 = aFloatArrayArray59[0];
          var10000[var5] *= aFloat61;
        }
      }

      for (var5 = 0; var5 < this.anIntArray55[var1] * 2; ++var5) {
        anIntArrayArray60[var1][var5] = (int) (aFloatArrayArray59[var1][var5] * 65536.0F);
      }

      return this.anIntArray55[var1] * 2;
    }
  }

  public void method156(Buffer var1, byte var2, Class1 var3) {
    int var4 = var1.readUByte();
    this.anIntArray55[0] = var4 >> 4;
    this.anIntArray55[1] = var4 & 15;
    int var5;
    if (var2 != 6) {
      for (var5 = 1; var5 > 0; ++var5) {
      }
    }

    if (var4 != 0) {
      this.anIntArray58[0] = var1.readUShort();
      this.anIntArray58[1] = var1.readUShort();
      var5 = var1.readUByte();

      int var6;
      int var7;
      for (var6 = 0; var6 < 2; ++var6) {
        for (var7 = 0; var7 < this.anIntArray55[var6]; ++var7) {
          this.anIntArrayArrayArray56[var6][0][var7] = var1.readUShort();
          this.anIntArrayArrayArray57[var6][0][var7] = var1.readUShort();
        }
      }

      for (var6 = 0; var6 < 2; ++var6) {
        for (var7 = 0; var7 < this.anIntArray55[var6]; ++var7) {
          if ((var5 & 1 << var6 * 4 << var7) != 0) {
            this.anIntArrayArrayArray56[var6][1][var7] = var1.readUShort();
            this.anIntArrayArrayArray57[var6][1][var7] = var1.readUShort();
          } else {
            this.anIntArrayArrayArray56[var6][1][var7] = this.anIntArrayArrayArray56[var6][0][var7];
            this.anIntArrayArrayArray57[var6][1][var7] = this.anIntArrayArrayArray57[var6][0][var7];
          }
        }
      }

      if (var5 != 0 || this.anIntArray58[1] != this.anIntArray58[0]) {
        var3.method149(var1);
      }
    } else {
      this.anIntArray58[0] = this.anIntArray58[1] = 0;
    }

  }
}
