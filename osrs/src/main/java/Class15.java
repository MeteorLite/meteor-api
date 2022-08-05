public class Class15 {

  public static final int[] anIntArray382;
  public static final int[] anIntArray383;
  public static final int[][] anIntArrayArray390;
  public static final int[] anIntArray384;
  public static final int[] anIntArray385;
  public static final int[] anIntArray386;
  public static final int[][] anIntArrayArray391;
  public static int[] anIntArray387;
  public static int[] anIntArray388;
  public static int[] anIntArray389;
  public final int[] anIntArray367;
  public boolean aBoolean366;
  public final boolean aBoolean377;
  public final int[] anIntArray373;
  public final int anInt378;
  public final int[] anIntArray368;
  public final int[] anIntArray374;
  public final int anInt379;
  public final int[] anIntArray375;
  public final int[] anIntArray369;
  public final int anInt380;
  public final int anInt381;
  public int[] anIntArray376;
  public final int[] anIntArray370;
  public final int[] anIntArray371;
  public final int[] anIntArray372;

  static {
    anIntArrayArray390 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6},
        {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8},
        {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
    anIntArrayArray391 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3},
        {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3},
        {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4},
        {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3},
        {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5},
        {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5},
        {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3},
        {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3},
        {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    anIntArray382 = new int[6];
    anIntArray383 = new int[6];
    anIntArray384 = new int[6];
    anIntArray385 = new int[6];
    anIntArray386 = new int[6];
    anIntArray387 = new int[]{1, 0};
    anIntArray388 = new int[]{2, 1};
    anIntArray389 = new int[]{3, 3};
  }

  public Class15(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8,
      int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16,
      int var17, int var18, int var19, int var20) {
    this.aBoolean366 = true;
    this.aBoolean377 = var15 == var2 && var3 == var2 && var2 == var14;
    this.anInt378 = var7;
    this.anInt379 = var17;
    this.anInt380 = var5;
    this.anInt381 = var8;
    short var21 = 128;
    int var22 = var21 / 2;
    int var23 = var21 / 4;
    int var24 = var21 * 3 / 4;
    int[] var25 = anIntArrayArray390[var7];
    int var26 = var25.length;
    this.anIntArray367 = new int[var26];
    this.anIntArray368 = new int[var26];
    this.anIntArray369 = new int[var26];
    int[] var27 = new int[var26];
    int[] var28 = new int[var26];
    int var29 = var21 * var16;
    int var30 = var21 * var12;

    int var32;
    int var33;
    int var34;
    int var35;
    int var36;
    int var37;
    for (int var31 = 0; var31 < var26; ++var31) {
      var32 = var25[var31];
      if ((var32 & 1) == 0 && var32 <= 8) {
        var32 = (var32 - var17 - var17 - 1 & 7) + 1;
      }

      if (var32 > 8 && var32 <= 12) {
        var32 = (var32 - 9 - var17 & 3) + 9;
      }

      if (var32 > 12 && var32 <= 16) {
        var32 = (var32 - 13 - var17 & 3) + 13;
      }

      if (var32 == 1) {
        var33 = var29;
        var34 = var30;
        var35 = var2;
        var36 = var9;
        var37 = var1;
      } else if (var32 == 2) {
        var33 = var29 + var22;
        var34 = var30;
        var35 = var15 + var2 >> 1;
        var36 = var10 + var9 >> 1;
        var37 = var19 + var1 >> 1;
      } else if (var32 == 3) {
        var33 = var29 + var21;
        var34 = var30;
        var35 = var15;
        var36 = var10;
        var37 = var19;
      } else if (var32 == 4) {
        var33 = var29 + var21;
        var34 = var30 + var22;
        var35 = var3 + var15 >> 1;
        var36 = var11 + var10 >> 1;
        var37 = var19 + var20 >> 1;
      } else if (var32 == 5) {
        var33 = var29 + var21;
        var34 = var30 + var21;
        var35 = var3;
        var36 = var11;
        var37 = var20;
      } else if (var32 == 6) {
        var33 = var29 + var22;
        var34 = var30 + var21;
        var35 = var3 + var14 >> 1;
        var36 = var13 + var11 >> 1;
        var37 = var20 + var4 >> 1;
      } else if (var32 == 7) {
        var33 = var29;
        var34 = var30 + var21;
        var35 = var14;
        var36 = var13;
        var37 = var4;
      } else if (var32 == 8) {
        var33 = var29;
        var34 = var30 + var22;
        var35 = var2 + var14 >> 1;
        var36 = var13 + var9 >> 1;
        var37 = var4 + var1 >> 1;
      } else if (var32 == 9) {
        var33 = var29 + var22;
        var34 = var30 + var23;
        var35 = var15 + var2 >> 1;
        var36 = var10 + var9 >> 1;
        var37 = var19 + var1 >> 1;
      } else if (var32 == 10) {
        var33 = var29 + var24;
        var34 = var30 + var22;
        var35 = var3 + var15 >> 1;
        var36 = var11 + var10 >> 1;
        var37 = var19 + var20 >> 1;
      } else if (var32 == 11) {
        var33 = var29 + var22;
        var34 = var30 + var24;
        var35 = var3 + var14 >> 1;
        var36 = var13 + var11 >> 1;
        var37 = var20 + var4 >> 1;
      } else if (var32 == 12) {
        var33 = var29 + var23;
        var34 = var30 + var22;
        var35 = var2 + var14 >> 1;
        var36 = var13 + var9 >> 1;
        var37 = var4 + var1 >> 1;
      } else if (var32 == 13) {
        var33 = var29 + var23;
        var34 = var30 + var23;
        var35 = var2;
        var36 = var9;
        var37 = var1;
      } else if (var32 == 14) {
        var33 = var29 + var24;
        var34 = var30 + var23;
        var35 = var15;
        var36 = var10;
        var37 = var19;
      } else if (var32 == 15) {
        var33 = var29 + var24;
        var34 = var30 + var24;
        var35 = var3;
        var36 = var11;
        var37 = var20;
      } else {
        var33 = var29 + var23;
        var34 = var30 + var24;
        var35 = var14;
        var36 = var13;
        var37 = var4;
      }

      this.anIntArray367[var31] = var33;
      this.anIntArray368[var31] = var35;
      this.anIntArray369[var31] = var34;
      var27[var31] = var36;
      var28[var31] = var37;
    }

    int[] var39 = anIntArrayArray391[var7];
    var32 = var39.length / 4;
    this.anIntArray373 = new int[var32];
    this.anIntArray374 = new int[var32];
    this.anIntArray375 = new int[var32];
    this.anIntArray370 = new int[var32];
    this.anIntArray371 = new int[var32];
    this.anIntArray372 = new int[var32];
    if (var6 != -1) {
      this.anIntArray376 = new int[var32];
    }

    var33 = 0;

    for (var34 = 0; var34 < var32; ++var34) {
      var35 = var39[var33];
      var36 = var39[var33 + 1];
      var37 = var39[var33 + 2];
      int var38 = var39[var33 + 3];
      var33 += 4;
      if (var36 < 4) {
        var36 = var36 - var17 & 3;
      }

      if (var37 < 4) {
        var37 = var37 - var17 & 3;
      }

      if (var38 < 4) {
        var38 = var38 - var17 & 3;
      }

      this.anIntArray373[var34] = var36;
      this.anIntArray374[var34] = var37;
      this.anIntArray375[var34] = var38;
      if (var35 == 0) {
        this.anIntArray370[var34] = var27[var36];
        this.anIntArray371[var34] = var27[var37];
        this.anIntArray372[var34] = var27[var38];
        if (this.anIntArray376 != null) {
          this.anIntArray376[var34] = -1;
        }
      } else {
        this.anIntArray370[var34] = var28[var36];
        this.anIntArray371[var34] = var28[var37];
        this.anIntArray372[var34] = var28[var38];
        if (this.anIntArray376 != null) {
          this.anIntArray376[var34] = var6;
        }
      }
    }

    var34 = var2;
    var35 = var15;
    if (var15 < var2) {
      var34 = var15;
    }

    if (var15 > var15) {
      var35 = var15;
    }

    if (var3 < var34) {
      var34 = var3;
    }

    if (var3 > var35) {
      var35 = var3;
    }

    if (var14 < var34) {
      var34 = var14;
    }

    if (var14 > var35) {
      var35 = var14;
    }

    var34 /= 14;
    var35 /= 14;
  }
}
