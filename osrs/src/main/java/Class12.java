import net.runelite.mapping.ObfuscatedSignature;

public class Class12 {

  public static boolean aBoolean274;
  public static Class39 aClass39_306;
  public static int anInt279;
  public static Class12[] aClass12Array278;
  public static Buffer aBuffer_277;
  public static int[] anIntArray276;
  public static int anInt275;
  public int[] anIntArray285;
  public final int anInt273;
  public long aLong280;
  public String aString281;
  public int anInt298;
  public int[] anIntArray284;
  public byte aByte283;
  public int anInt286;
  public int anInt287;
  public String[] aStringArray293;
  public int[] anIntArray291;
  public byte[] aByteArray282;
  public int anInt288;
  public int anInt289;
  public int anInt290;
  public int anInt299;
  public boolean aBoolean301;
  public int[] anIntArray292;
  public int anInt294;
  public int anInt304;
  public int anInt302;
  public int anInt300;
  public int anInt295;
  public boolean aBoolean297;
  public int anInt296;
  public int anInt303;
  public int anInt305;

  static {
    aBoolean274 = true;
    aClass39_306 = new Class39(30, 0);
  }

  public Class12() {
    this.anInt273 = -32952;
    this.aLong280 = -1L;
    this.aByte283 = 1;
    this.anInt286 = -1;
    this.anInt287 = -1;
    this.anInt288 = -1;
    this.anInt289 = -1;
    this.anInt290 = -1;
    this.anInt294 = -1;
    this.anInt295 = -1;
    this.anInt296 = -1;
    this.aBoolean297 = true;
    this.anInt298 = -1;
    this.anInt299 = 128;
    this.anInt300 = 128;
    this.aBoolean301 = false;
    this.anInt304 = -1;
    this.anInt305 = 32;
  }

  public Model method216(int var1, int var2, int var3, int[] var4) {
    Model var5 = (Model) aClass39_306.method339(this.aLong280);
    if (var5 == null) {
      boolean var6 = false;
      int[] var7 = this.anIntArray284;
      int var8 = var7.length;

      for (int var9 = 0; var9 < var8; ++var9) {
        int var10 = var7[var9];
        if (!Model.method504(var10)) {
          var6 = true;
        }
      }

      if (var6) {
        return null;
      }

      Model[] var12 = new Model[this.anIntArray284.length];

      for (var8 = 0; var8 < this.anIntArray284.length; ++var8) {
        var12[var8] = Model.method503(this.anIntArray284[var8]);
      }

      if (var12.length == 1) {
        var5 = var12[0];
      } else {
        var5 = new Model(var12.length, -643, var12);
      }

      if (this.anIntArray291 != null) {
        for (var8 = 0; var8 < this.anIntArray291.length; ++var8) {
          var5.method517(this.anIntArray291[var8], this.anIntArray292[var8]);
        }
      }

      var5.method510();
      var5.method520(this.anInt302 + 64, this.anInt303 + 850, -30, -50, -30, true);
      aClass39_306.method340(201, this.aLong280, var5);
    }

    Model var11 = Model.A_MODEL___1517;
    var3 = 62 / var3;
    var11.method505(0, var5, Class11.method211(var1) & Class11.method211(var2));
    if (var1 != -1 && var2 != -1) {
      var11.method512(-32031, var4, var1, var2);
    } else if (var1 != -1) {
      var11.method511(var1);
    }

    if (this.anInt299 != 128 || this.anInt300 != 128) {
      var11.method519(9, this.anInt299, this.anInt299, this.anInt300);
    }

    var11.method507(486);
    var11.anIntArrayArray1554 = null;
    var11.anIntArrayArray1553 = null;
    if (this.aByte283 == 1) {
      var11.aBoolean1555 = true;
    }

    return var11;
  }

  @ObfuscatedSignature(
      descriptor = "(B)LModel;",
      garbageValue = "0"
  )
  public Model method217() {
    if (this.anIntArray285 == null) {
      return null;
    } else {
      boolean var1 = false;
      int[] var2 = this.anIntArray285;
      int var3 = var2.length;

      int var4;
      for (var4 = 0; var4 < var3; ++var4) {
        int var5 = var2[var4];
        if (!Model.method504(var5)) {
          var1 = true;
        }
      }

      if (var1) {
        return null;
      } else {
        Model[] var6 = new Model[this.anIntArray285.length];

        for (var3 = 0; var3 < this.anIntArray285.length; ++var3) {
          var6[var3] = Model.method503(this.anIntArray285[var3]);
        }

        Model var7;
        if (var6.length == 1) {
          var7 = var6[0];
        } else {
          var7 = new Model(var6.length, -643, var6);
        }

        if (this.anIntArray291 != null) {
          for (var4 = 0; var4 < this.anIntArray291.length; ++var4) {
            var7.method517(this.anIntArray291[var4], this.anIntArray292[var4]);
          }
        }

        return var7;
      }
    }
  }

  public void method215(byte var1, Buffer var2) {
    int var3;
    if (var1 == 2) {
      boolean var6 = false;
    } else {
      for (var3 = 1; var3 > 0; ++var3) {
      }
    }

    while (true) {
      while (true) {
        var3 = var2.readUByte();
        if (var3 == 0) {
          return;
        }

        int var4;
        int var5;
        if (var3 == 1) {
          var4 = var2.readUByte();
          this.anIntArray284 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray284[var5] = var2.readUShort();
          }
        } else if (var3 == 2) {
          this.aString281 = var2.readString();
        } else if (var3 == 3) {
          this.aByteArray282 = var2.readStringArray(this.anInt273);
        } else if (var3 == 12) {
          this.aByte283 = var2.readByte();
        } else if (var3 == 13) {
          this.anInt286 = var2.readUShort();
        } else if (var3 == 14) {
          this.anInt287 = var2.readUShort();
        } else if (var3 == 17) {
          this.anInt287 = var2.readUShort();
          this.anInt288 = var2.readUShort();
          this.anInt289 = var2.readUShort();
          this.anInt290 = var2.readUShort();
        } else if (var3 >= 30 && var3 < 40) {
          if (this.aStringArray293 == null) {
            this.aStringArray293 = new String[5];
          }

          this.aStringArray293[var3 - 30] = var2.readString();
          if (this.aStringArray293[var3 - 30].equalsIgnoreCase("hidden")) {
            this.aStringArray293[var3 - 30] = null;
          }
        } else if (var3 == 40) {
          var4 = var2.readUByte();
          this.anIntArray291 = new int[var4];
          this.anIntArray292 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray291[var5] = var2.readUShort();
            this.anIntArray292[var5] = var2.readUShort();
          }
        } else if (var3 == 60) {
          var4 = var2.readUByte();
          this.anIntArray285 = new int[var4];

          for (var5 = 0; var5 < var4; ++var5) {
            this.anIntArray285[var5] = var2.readUShort();
          }
        } else if (var3 == 90) {
          this.anInt294 = var2.readUShort();
        } else if (var3 == 91) {
          this.anInt295 = var2.readUShort();
        } else if (var3 == 92) {
          this.anInt296 = var2.readUShort();
        } else if (var3 == 93) {
          this.aBoolean297 = false;
        } else if (var3 == 95) {
          this.anInt298 = var2.readUShort();
        } else if (var3 == 97) {
          this.anInt299 = var2.readUShort();
        } else if (var3 == 98) {
          this.anInt300 = var2.readUShort();
        } else if (var3 == 99) {
          this.aBoolean301 = true;
        } else if (var3 == 100) {
          this.anInt302 = var2.readByte();
        } else if (var3 == 101) {
          this.anInt303 = var2.readByte() * 5;
        } else if (var3 == 102) {
          this.anInt304 = var2.readUShort();
        } else if (var3 == 103) {
          this.anInt305 = var2.readUShort();
        }
      }
    }
  }

  public static Class12 method214(int var0) {
    for (int var1 = 0; var1 < 20; ++var1) {
      if (aClass12Array278[var1].aLong280 == (long) var0) {
        return aClass12Array278[var1];
      }
    }

    anInt279 = (anInt279 + 1) % 20;
    Class12 var2 = aClass12Array278[anInt279] = new Class12();
    aBuffer_277.offset = anIntArray276[var0];
    var2.aLong280 = var0;
    var2.method215((byte) 2, aBuffer_277);
    return var2;
  }

  public static void method213(byte var0) {
    aClass39_306 = null;
    anIntArray276 = null;
    aClass12Array278 = null;
    aBuffer_277 = null;
    if (var0 == 1) {
      boolean var1 = false;
    } else {
      aBoolean274 = !aBoolean274;
    }

  }

  public static void method212(Class47 var0) {
    aBuffer_277 = new Buffer(var0.method546("npc.dat", null), (byte) 1);
    Buffer var1 = new Buffer(var0.method546("npc.idx", null), (byte) 1);
    anInt275 = var1.readUShort();
    anIntArray276 = new int[anInt275];
    int var2 = 2;

    int var3;
    for (var3 = 0; var3 < anInt275; ++var3) {
      anIntArray276[var3] = var2;
      var2 += var1.readUShort();
    }

    aClass12Array278 = new Class12[20];

    for (var3 = 0; var3 < 20; ++var3) {
      aClass12Array278[var3] = new Class12();
    }

  }
}
