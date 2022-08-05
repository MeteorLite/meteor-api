import net.runelite.mapping.ObfuscatedSignature;

public class Class11 {

  public static Class11[] aClass11Array264;
  public static boolean[] aBooleanArray272;
  public Class9 aClass9_266;
  public int anInt265;
  public int anInt267;
  public int[] anIntArray268;
  public int[] anIntArray269;
  public int[] anIntArray270;
  public int[] anIntArray271;

  @ObfuscatedSignature(
      descriptor = "(II)LClass11;",
      garbageValue = "6"
  )
  public static Class11 method210(int var0) {
    return aClass11Array264 == null ? null : aClass11Array264[var0];
  }

  @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "0"
  )
  public static boolean method211(int var0) {
    return var0 == -1;
  }

  public static void method208(int var0, byte[] var1) {
    Buffer var2 = new Buffer(var1, (byte) 1);
    var2.offset = var1.length - 8;
    int var3 = var2.readUShort();
    int var4 = var2.readUShort();
    int var5 = var2.readUShort();
    int var6 = var2.readUShort();
    byte var7 = 0;
    Buffer var8 = new Buffer(var1, (byte) 1);
    var8.offset = var7;
    int var28 = var7 + var3 + 2;
    Buffer var9 = new Buffer(var1, (byte) 1);
    var9.offset = var28;
    var28 += var4;
    Buffer var10 = new Buffer(var1, (byte) 1);
    var10.offset = var28;
    var28 += var5;
    Buffer var11 = new Buffer(var1, (byte) 1);
    var11.offset = var28;
    var28 += var6;
    Buffer var12 = new Buffer(var1, (byte) 1);
    var12.offset = var28;
    Class9 var13 = new Class9(10470, var12);
    int var14 = var8.readUShort();
    int[] var15 = new int[500];
    int[] var16 = new int[500];
    int[] var17 = new int[500];
    int[] var18 = new int[500];

    for (int var19 = 0; var19 < var14; ++var19) {
      int var20 = var8.readUShort();
      Class11 var21 = aClass11Array264[var20] = new Class11();
      var21.anInt265 = var11.readUByte();
      var21.aClass9_266 = var13;
      int var22 = var8.readUByte();
      int var23 = -1;
      int var24 = 0;

      int var25;
      for (var25 = 0; var25 < var22; ++var25) {
        int var26 = var9.readUByte();
        if (var26 > 0) {
          if (var13.anIntArray255[var25] != 0) {
            for (int var27 = var25 - 1; var27 > var23; --var27) {
              if (var13.anIntArray255[var27] == 0) {
                var15[var24] = var27;
                var16[var24] = 0;
                var17[var24] = 0;
                var18[var24] = 0;
                ++var24;
                break;
              }
            }
          }

          var15[var24] = var25;
          short var29 = 0;
          if (var13.anIntArray255[var25] == 3) {
            var29 = 128;
          }

          if ((var26 & 1) != 0) {
            var16[var24] = var10.readShortSmart();
          } else {
            var16[var24] = var29;
          }

          if ((var26 & 2) != 0) {
            var17[var24] = var10.readShortSmart();
          } else {
            var17[var24] = var29;
          }

          if ((var26 & 4) != 0) {
            var18[var24] = var10.readShortSmart();
          } else {
            var18[var24] = var29;
          }

          var23 = var25;
          ++var24;
          if (var13.anIntArray255[var25] == 5) {
            aBooleanArray272[var20] = false;
          }
        }
      }

      var21.anInt267 = var24;
      var21.anIntArray268 = new int[var24];
      var21.anIntArray269 = new int[var24];
      var21.anIntArray270 = new int[var24];
      var21.anIntArray271 = new int[var24];

      for (var25 = 0; var25 < var24; ++var25) {
        var21.anIntArray268[var25] = var15[var25];
        var21.anIntArray269[var25] = var16[var25];
        var21.anIntArray270[var25] = var17[var25];
        var21.anIntArray271[var25] = var18[var25];
      }
    }

  }

  public static void method207(int var0) {
    aClass11Array264 = new Class11[var0 + 1];
    aBooleanArray272 = new boolean[var0 + 1];

    for (int var1 = 0; var1 < var0 + 1; ++var1) {
      aBooleanArray272[var1] = true;
    }

  }

  @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
  )
  public static void method209() {
    aClass11Array264 = null;
  }
}
