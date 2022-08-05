import java.util.Random;
import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub1_Sub4 extends Statics {

  public boolean aBoolean1466;
  public final int anInt1454;
  public final Random aRandom1465;
  public int anInt1464;
  public int anInt1455;
  public final int[] anIntArray1463;
  public boolean aBoolean1456;
  public final byte[][] aByteArrayArray1458;
  public final int[] anIntArray1461;
  public final int[] anIntArray1459;
  public final int[] anIntArray1460;
  public final int[] anIntArray1462;

  public Class44_Sub3_Sub1_Sub4(Class47 var1, boolean var2, String var3, byte var4) {
    this.anInt1454 = 436;
    this.anInt1455 = 436;
    this.aBoolean1456 = false;
    this.aByteArrayArray1458 = new byte[256][];
    this.anIntArray1459 = new int[256];
    this.anIntArray1460 = new int[256];
    this.anIntArray1461 = new int[256];
    this.anIntArray1462 = new int[256];
    this.anIntArray1463 = new int[256];
    this.aRandom1465 = new Random();
    this.aBoolean1466 = false;
    Buffer var5 = new Buffer(var1.method546(var3 + ".dat", null), (byte) 1);
    Buffer var6 = new Buffer(var1.method546("index.dat", null), (byte) 1);
    boolean var7 = true;
    var6.offset = var5.readUShort() + 4;
    int var8 = var6.readUByte();
    if (var8 > 0) {
      var6.offset += 3 * (var8 - 1);
    }

    for (int var9 = 0; var9 < 256; ++var9) {
      this.anIntArray1461[var9] = var6.readUByte();
      this.anIntArray1462[var9] = var6.readUByte();
      int var11 = this.anIntArray1459[var9] = var6.readUShort();
      int var12 = this.anIntArray1460[var9] = var6.readUShort();
      int var13 = var6.readUByte();
      int var14 = var11 * var12;
      this.aByteArrayArray1458[var9] = new byte[var14];
      int var15;
      int var16;
      if (var13 == 0) {
        for (var15 = 0; var15 < var14; ++var15) {
          this.aByteArrayArray1458[var9][var15] = var5.readByte();
        }
      } else if (var13 == 1) {
        for (var15 = 0; var15 < var11; ++var15) {
          for (var16 = 0; var16 < var12; ++var16) {
            this.aByteArrayArray1458[var9][var15 + var16 * var11] = var5.readByte();
          }
        }
      }

      if (var12 > this.anInt1464 && var9 < 128) {
        this.anInt1464 = var12;
      }

      this.anIntArray1461[var9] = 1;
      this.anIntArray1463[var9] = var11 + 2;
      var15 = 0;

      for (var16 = var12 / 7; var16 < var12; ++var16) {
        var15 += this.aByteArrayArray1458[var9][var16 * var11];
      }

      int var10002;
      if (var15 <= var12 / 7) {
        var10002 = this.anIntArray1463[var9]--;
        this.anIntArray1461[var9] = 0;
      }

      var15 = 0;

      for (var16 = var12 / 7; var16 < var12; ++var16) {
        var15 += this.aByteArrayArray1458[var9][var16 * var11 + (var11 - 1)];
      }

      if (var15 <= var12 / 7) {
        var10002 = this.anIntArray1463[var9]--;
      }
    }

    if (var4 == 0) {
      boolean var17 = false;
    } else {
      this.aBoolean1456 = !this.aBoolean1456;
    }

    if (var2) {
      this.anIntArray1463[32] = this.anIntArray1463[73];
    } else {
      this.anIntArray1463[32] = this.anIntArray1463[105];
    }

  }

  public int method457(int var1, String var2) {
    if (var2 == null) {
      return 0;
    } else {
      int var3 = 0;

      for (int var4 = 0; var4 < var2.length(); ++var4) {
        if (var2.charAt(var4) == '@' && var4 + 4 < var2.length() && var2.charAt(var4 + 4) == '@') {
          var4 += 4;
        } else {
          var3 += this.anIntArray1463[var2.charAt(var4)];
        }
      }

      return var3;
    }
  }

  @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;IIZ)V",
      garbageValue = "1"
  )
  public void method458(int var1, String var2, int var3, int var4) {
    if (var2 != null) {
      var4 -= this.anInt1464;

      for (int var5 = 0; var5 < var2.length(); ++var5) {
        char var6 = var2.charAt(var5);
        if (var6 != ' ') {
          this.method463(this.aByteArrayArray1458[var6], this.anIntArray1461[var6] + var1,
              var4 + this.anIntArray1462[var6], this.anIntArray1459[var6],
              this.anIntArray1460[var6], var3);
        }

        var1 += this.anIntArray1463[var6];
      }

    }
  }

  public void method460(String var1, int var2, boolean var3, int var4, int var5, int var6) {
    this.aBoolean1466 = false;
    int var7 = var5;
    if (var1 != null) {
      var4 -= this.anInt1464;

      for (int var8 = 0; var8 < var1.length(); ++var8) {
        if (var1.charAt(var8) == '@' && var8 + 4 < var1.length() && var1.charAt(var8 + 4) == '@') {
          int var10 = this.method462(var1.substring(var8 + 1, var8 + 4));
          if (var10 != -1) {
            var6 = var10;
          }

          var8 += 4;
        } else {
          char var9 = var1.charAt(var8);
          if (var9 != ' ') {
            if (var3) {
              this.method463(this.aByteArrayArray1458[var9], var5 + this.anIntArray1461[var9] + 1,
                  var4 + this.anIntArray1462[var9] + 1, this.anIntArray1459[var9],
                  this.anIntArray1460[var9], 0);
            }

            this.method463(this.aByteArrayArray1458[var9], var5 + this.anIntArray1461[var9],
                var4 + this.anIntArray1462[var9], this.anIntArray1459[var9],
                this.anIntArray1460[var9], var6);
          }

          var5 += this.anIntArray1463[var9];
        }
      }

      if (var2 > 0) {
        if (this.aBoolean1466) {
          Statics.method414(var5 - var7, 8388608, var7, (byte) 125,
              (int) ((double) this.anInt1464 * 0.7D) + var4);
        }

      }
    }
  }

  @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/String;Z)V",
      garbageValue = "0"
  )
  public void method455(int var1, int var2, int var3, String var4) {
    this.method458(var1 - this.method457(-43341, var4) / 2, var4, var3, var2);
  }

  @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;IIIZ)V",
      garbageValue = "1"
  )
  public void method461(int var1, int var2, String var3, int var4, int var5, int var6) {
    if (var3 != null) {
      this.aRandom1465.setSeed(var6);
      int var7 = 192 + (this.aRandom1465.nextInt() & 31);
      var4 -= this.anInt1464;

      for (int var8 = 0; var8 < var3.length(); ++var8) {
        if (var3.charAt(var8) == '@' && var8 + 4 < var3.length() && var3.charAt(var8 + 4) == '@') {
          int var10 = this.method462(var3.substring(var8 + 1, var8 + 4));
          if (var10 != -1) {
            var5 = var10;
          }

          var8 += 4;
        } else {
          char var9 = var3.charAt(var8);
          if (var9 != ' ') {
            this.method465(var4 + this.anIntArray1462[var9] + 1, this.aByteArrayArray1458[var9],
                var2 + this.anIntArray1461[var9] + 1, 0, this.anIntArray1460[var9], false, 192,
                this.anIntArray1459[var9]);
            this.method465(var4 + this.anIntArray1462[var9], this.aByteArrayArray1458[var9],
                var2 + this.anIntArray1461[var9], var5, this.anIntArray1460[var9], false, var7,
                this.anIntArray1459[var9]);
          }

          var2 += this.anIntArray1463[var9];
          if ((this.aRandom1465.nextInt() & 3) == 0) {
            ++var2;
          }
        }
      }
    }
  }

  @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-13619"
  )
  public int method462(String var1) {
    if (var1.equals("red")) {
      return 16711680;
    } else if (var1.equals("gre")) {
      return 65280;
    } else if (var1.equals("blu")) {
      return 255;
    } else if (var1.equals("yel")) {
      return 16776960;
    } else if (var1.equals("cya")) {
      return 65535;
    } else if (var1.equals("mag")) {
      return 16711935;
    } else if (var1.equals("whi")) {
      return 16777215;
    } else if (var1.equals("bla")) {
      return 0;
    } else if (var1.equals("lre")) {
      return 16748608;
    } else if (var1.equals("dre")) {
      return 8388608;
    } else if (var1.equals("dbl")) {
      return 128;
    } else if (var1.equals("or1")) {
      return 16756736;
    } else if (var1.equals("or2")) {
      return 16740352;
    } else if (var1.equals("or3")) {
      return 16723968;
    } else if (var1.equals("gr1")) {
      return 12648192;
    } else if (var1.equals("gr2")) {
      return 8453888;
    } else if (var1.equals("gr3")) {
      return 4259584;
    } else {
      if (var1.equals("str")) {
        this.aBoolean1466 = true;
      }

      return -1;
    }
  }

  public void method456(int var1, int var2, int var3, String var4, int var5, boolean var6) {
    this.method460(var4, this.anInt1454, var6, var3, var2 - this.method457(-43341, var4) / 2, var5);
  }

  public void method463(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
    int var7 = var3 * Statics.anInt1352 + var2;
    int var8 = Statics.anInt1352 - var4;
    int var9 = 0;
    int var10 = 0;
    int var11;
    if (var3 < Statics.anInt1354) {
      var11 = Statics.anInt1354 - var3;
      var5 -= var11;
      var3 = Statics.anInt1354;
      var10 += var11 * var4;
      var7 += var11 * Statics.anInt1352;
    }

    if (var3 + var5 >= Statics.anInt1355) {
      var5 -= var3 + var5 - Statics.anInt1355 + 1;
    }

    if (var2 < Statics.anInt1356) {
      var11 = Statics.anInt1356 - var2;
      var4 -= var11;
      var2 = Statics.anInt1356;
      var10 += var11;
      var7 += var11;
      var9 += var11;
      var8 += var11;
    }

    if (var2 + var4 >= Statics.anInt1357) {
      var11 = var2 + var4 - Statics.anInt1357 + 1;
      var4 -= var11;
      var9 += var11;
      var8 += var11;
    }

    if (var4 > 0 && var5 > 0) {
      this.method464(Statics.anIntArray1351, var1, var6, var10, var7, var4, var5, var8, var9);
    }

  }

  public void method465(int var1, byte[] var2, int var3, int var4, int var5, boolean var6, int var7,
      int var8) {
    int var9 = var3 + Statics.anInt1352 * var1;
    int var10 = Statics.anInt1352 - var8;
    int var11 = 0;
    int var12 = 0;
    int var13;
    if (var1 < Statics.anInt1354) {
      var13 = Statics.anInt1354 - var1;
      var5 -= var13;
      var1 = Statics.anInt1354;
      var12 += var13 * var8;
      var9 += var13 * Statics.anInt1352;
    }

    if (var5 + var1 >= Statics.anInt1355) {
      var5 -= var5 + var1 - Statics.anInt1355 + 1;
    }

    if (var3 < Statics.anInt1356) {
      var13 = Statics.anInt1356 - var3;
      var8 -= var13;
      var3 = Statics.anInt1356;
      var12 += var13;
      var9 += var13;
      var11 += var13;
      var10 += var13;
    }

    if (var3 + var8 >= Statics.anInt1357) {
      var13 = var3 + var8 - Statics.anInt1357 + 1;
      var8 -= var13;
      var11 += var13;
      var10 += var13;
    }

    if (var8 > 0 && var5 > 0) {
      this.method466(var5, var2, var4, var8, var11, var7, var9, Statics.anIntArray1351, -701, var12,
          var10);
    }

  }

  public void method466(int var1, byte[] var2, int var3, int var4, int var5, int var6, int var7,
      int[] var8, int var9, int var10, int var11) {
    var3 = ((var3 & 16711935) * var6 & -16711936) + ((var3 & 65280) * var6 & 16711680) >> 8;
    var6 = 256 - var6;

    for (int var12 = -var1; var12 < 0; ++var12) {
      for (int var13 = -var4; var13 < 0; ++var13) {
        if (var2[var10++] != 0) {
          int var14 = var8[var7];
          var8[var7++] =
              var3 + (((var14 & 16711935) * var6 & -16711936) + ((var14 & 65280) * var6 & 16711680)
                  >> 8);
        } else {
          ++var7;
        }
      }

      var7 += var11;
      var10 += var5;
    }

  }

  public void method464(int[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7,
      int var8, int var9) {
    int var10 = -(var6 >> 2);
    var6 = -(var6 & 3);

    for (int var11 = -var7; var11 < 0; ++var11) {
      int var12;
      for (var12 = var10; var12 < 0; ++var12) {
        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }

        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }
      }

      for (var12 = var6; var12 < 0; ++var12) {
        if (var2[var4++] != 0) {
          var1[var5++] = var3;
        } else {
          ++var5;
        }
      }

      var5 += var8;
      var4 += var9;
    }

  }

  public void method459(String var1, int var2, int var3, int var4, int var5, int var6) {
    if (var1 != null) {
      var3 -= this.method457(-43341, var1) / 2;
      var2 -= this.anInt1464;

      for (int var7 = 0; var7 < var1.length(); ++var7) {
        char var8 = var1.charAt(var7);
        if (var8 != ' ') {
          this.method463(this.aByteArrayArray1458[var8], var3 + this.anIntArray1461[var8],
              var2 + this.anIntArray1462[var8] + (int) (
                  Math.sin((double) var7 / 2.0D + (double) var6 / 5.0D) * 5.0D),
              this.anIntArray1459[var8], this.anIntArray1460[var8], var4);
        }

        var3 += this.anIntArray1463[var8];
      }

    }
  }
}
