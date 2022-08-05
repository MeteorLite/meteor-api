import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub4_Sub6_Sub1 extends Class44_Sub3_Sub4_Sub6 {

  public static Class39 aClass39_1680;
  public Class12 aClass12_1679;
  public boolean aBoolean1658;
  public int anInt1655;
  public long aLong1665;
  public final int[] anIntArray1661;
  public int anInt1656;
  public int anInt1664;
  public int anInt1659;
  public String aString1657;
  public int anInt1660;
  public final int[] anIntArray1662;
  public int anInt1663;
  public boolean aBoolean1677;
  public long aLong1678;
  public Model aModel_1672;
  public int anInt1668;
  public int anInt1667;
  public int anInt1669;
  public int anInt1670;
  public int anInt1666;
  public int anInt1671;
  public int anInt1676;
  public int anInt1675;
  public int anInt1673;
  public int anInt1674;

  static {
    aClass39_1680 = new Class39(260, 0);
  }

  public Class44_Sub3_Sub4_Sub6_Sub1() {
    this.anInt1655 = -12792;
    this.anInt1656 = -582;
    this.aBoolean1658 = false;
    this.anIntArray1661 = new int[12];
    this.anIntArray1662 = new int[5];
    this.aBoolean1677 = false;
    this.aLong1678 = -1L;
  }

  @ObfuscatedSignature(
      descriptor = "(Z)LModel;",
      garbageValue = "1"
  )
  public Model method535() {
    if (this.aClass12_1679 != null) {
      int var13 = -1;
      if (super.anInt1627 >= 0 && super.anInt1630 == 0) {
        var13 = Class26.aClass26Array497[super.anInt1627].primaryFrames[super.anInt1628];
      } else if (super.anInt1624 >= 0) {
        var13 = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
      }

      Model var2 = this.aClass12_1679.method216(var13, -1, 811, null);
      return var2;
    } else {
      long var1 = this.aLong1665;
      int var3 = -1;
      int var4 = -1;
      int var5 = -1;
      int var6 = -1;
      if (super.anInt1627 >= 0 && super.anInt1630 == 0) {
        Class26 var7 = Class26.aClass26Array497[super.anInt1627];
        var3 = var7.primaryFrames[super.anInt1628];
        if (super.anInt1624 >= 0 && super.anInt1624 != super.anInt1604) {
          var4 = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
        }

        if (var7.anInt506 >= 0) {
          var5 = var7.anInt506;
          var1 += var5 - this.anIntArray1661[5] << 40;
        }

        if (var7.anInt507 >= 0) {
          var6 = var7.anInt507;
          var1 += var6 - this.anIntArray1661[3] << 48;
        }
      } else if (super.anInt1624 >= 0) {
        var3 = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
      }

      Model var14 = (Model) aClass39_1680.method339(var1);
      int var9;
      int var10;
      if (var14 == null) {
        boolean var8 = false;

        for (var9 = 0; var9 < 12; ++var9) {
          var10 = this.anIntArray1661[var9];
          if (var6 >= 0 && var9 == 3) {
            var10 = var6;
          }

          if (var5 >= 0 && var9 == 5) {
            var10 = var5;
          }

          if (var10 >= 256 && var10 < 512 && !Class22.aClass22Array455[var10 - 256].method249()) {
            var8 = true;
          }

          if (var10 >= 512 && !Class14.method220(var10 - 512).method227(this.anInt1659)) {
            var8 = true;
          }
        }

        if (var8) {
          if (this.aLong1678 != -1L) {
            var14 = (Model) aClass39_1680.method339(this.aLong1678);
          }

          if (var14 == null) {
            return null;
          }
        }
      }

      if (var14 == null) {
        Model[] var15 = new Model[12];
        var9 = 0;

        for (var10 = 0; var10 < 12; ++var10) {
          int var11 = this.anIntArray1661[var10];
          if (var6 >= 0 && var10 == 3) {
            var11 = var6;
          }

          if (var5 >= 0 && var10 == 5) {
            var11 = var5;
          }

          Model var12;
          if (var11 >= 256 && var11 < 512) {
            var12 = Class22.aClass22Array455[var11 - 256].method250((byte) 0);
            if (var12 != null) {
              var15[var9++] = var12;
            }
          }

          if (var11 >= 512) {
            var12 = Class14.method220(var11 - 512).method228(-269, this.anInt1659);
            if (var12 != null) {
              var15[var9++] = var12;
            }
          }
        }

        var14 = new Model(var9, -643, var15);

        for (var10 = 0; var10 < 5; ++var10) {
          if (this.anIntArray1662[var10] != 0) {
            var14.method517(Client.anIntArrayArray1241[var10][0],
                Client.anIntArrayArray1241[var10][this.anIntArray1662[var10]]);
            if (var10 == 1) {
              var14.method517(Client.anIntArray1134[0],
                  Client.anIntArray1134[this.anIntArray1662[var10]]);
            }
          }
        }

        var14.method510();
        var14.method520(64, 850, -30, -50, -30, true);
        aClass39_1680.method340(201, var1, var14);
        this.aLong1678 = var1;
      }

      if (this.aBoolean1677) {
        return var14;
      } else {
        Model var16 = Model.A_MODEL___1517;
        var16.method505(0, var14, Class11.method211(var3) & Class11.method211(var4));
        if (var3 != -1 && var4 != -1) {
          var16.method512(-32031, Class26.aClass26Array497[super.anInt1627].anIntArray503, var3,
              var4);
        } else if (var3 != -1) {
          var16.method511(var3);
        }

        var16.method507(486);
        var16.anIntArrayArray1554 = null;
        var16.anIntArrayArray1553 = null;
        return var16;
      }
    }
  }

  @ObfuscatedSignature(
      descriptor = "(Z)LModel;",
      garbageValue = "0"
  )
  public Model getModel(boolean var1) {
    if (!this.aBoolean1658) {
      return null;
    } else {
      Model var2 = this.method535();
      if (var2 == null) {
        return null;
      } else {
        super.anInt1645 = var2.anInt1394;
        var2.aBoolean1555 = true;
        if (this.aBoolean1677) {
          return var2;
        } else {
          if (super.anInt1632 != -1 && super.anInt1633 != -1) {
            Class32 var3 = Class32.aClass32Array547[super.anInt1632];
            Model var4 = var3.method271();
            if (var4 != null) {
              Model var5 = new Model(true, Class11.method211(super.anInt1633), var4, true, false);
              var5.method516(0, -super.anInt1636, (byte) 10, 0);
              var5.method510();
              var5.method511(var3.aClass26_551.primaryFrames[super.anInt1633]);
              var5.anIntArrayArray1554 = null;
              var5.anIntArrayArray1553 = null;
              if (var3.anInt554 != 128 || var3.anInt555 != 128) {
                var5.method519(9, var3.anInt554, var3.anInt554, var3.anInt555);
              }

              var5.method520(var3.anInt557 + 64, var3.anInt558 + 850, -30, -50, -30, true);
              Model[] var6 = new Model[]{var2, var5};
              var2 = new Model(true, (byte) 72, var6, 2);
            }
          }

          if (this.aModel_1672 != null) {
            if (Client.tick >= this.anInt1668) {
              this.aModel_1672 = null;
            }

            if (Client.tick >= this.anInt1667 && Client.tick < this.anInt1668) {
              Model var7 = this.aModel_1672;
              var7.method516(this.anInt1669 - super.anInt1599, this.anInt1670 - this.anInt1666,
                  (byte) 10, this.anInt1671 - super.anInt1600);
              if (super.anInt1646 == 512) {
                var7.method514();
                var7.method514();
                var7.method514();
              } else if (super.anInt1646 == 1024) {
                var7.method514();
                var7.method514();
              } else if (super.anInt1646 == 1536) {
                var7.method514();
              }

              Model[] var8 = new Model[]{var2, var7};
              var2 = new Model(true, (byte) 72, var8, 2);
              if (super.anInt1646 == 512) {
                var7.method514();
              } else if (super.anInt1646 == 1024) {
                var7.method514();
                var7.method514();
              } else if (super.anInt1646 == 1536) {
                var7.method514();
                var7.method514();
                var7.method514();
              }

              var7.method516(super.anInt1599 - this.anInt1669, this.anInt1666 - this.anInt1670,
                  (byte) 10, super.anInt1600 - this.anInt1671);
            }
          }

          var2.aBoolean1555 = true;
          return var2;
        }
      }
    }
  }

  @ObfuscatedSignature(
      descriptor = "(Z)LModel;",
      garbageValue = "1"
  )
  public Model method536() {
    if (!this.aBoolean1658) {
      return null;
    } else {
      boolean var1 = false;

      int var3;
      for (int var2 = 0; var2 < 12; ++var2) {
        var3 = this.anIntArray1661[var2];
        if (var3 >= 256 && var3 < 512 && !Class22.aClass22Array455[var3 - 256].method251()) {
          var1 = true;
        }

        if (var3 >= 512 && !Class14.method220(var3 - 512).method229(this.anInt1659, (byte) 1)) {
          var1 = true;
        }
      }

      if (var1) {
        return null;
      } else {
        Model[] var7 = new Model[12];
        var3 = 0;

        int var5;
        for (int var4 = 0; var4 < 12; ++var4) {
          var5 = this.anIntArray1661[var4];
          Model var6;
          if (var5 >= 256 && var5 < 512) {
            var6 = Class22.aClass22Array455[var5 - 256].method252((byte) 7);
            if (var6 != null) {
              var7[var3++] = var6;
            }
          }

          if (var5 >= 512) {
            var6 = Class14.method220(var5 - 512).method230(false, this.anInt1659);
            if (var6 != null) {
              var7[var3++] = var6;
            }
          }
        }

        Model var8 = new Model(var3, -643, var7);

        for (var5 = 0; var5 < 5; ++var5) {
          if (this.anIntArray1662[var5] != 0) {
            var8.method517(Client.anIntArrayArray1241[var5][0],
                Client.anIntArrayArray1241[var5][this.anIntArray1662[var5]]);
            if (var5 == 1) {
              var8.method517(Client.anIntArray1134[0],
                  Client.anIntArray1134[this.anIntArray1662[var5]]);
            }
          }
        }

        return var8;
      }
    }
  }

  @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "0"
  )
  public boolean method532() {
    return this.aBoolean1658;
  }

  public void method534(Buffer var1, int var2) {
    var1.offset = 0;
    this.anInt1659 = var1.readUByte();
    this.anInt1660 = var1.readUByte();
    this.aClass12_1679 = null;

    int var3;
    int var4;
    for (var3 = 0; var3 < 12; ++var3) {
      var4 = var1.readUByte();
      if (var4 == 0) {
        this.anIntArray1661[var3] = 0;
      } else {
        int var5 = var1.readUByte();
        this.anIntArray1661[var3] = var5 + (var4 << 8);
        if (var3 == 0 && this.anIntArray1661[0] == 65535) {
          this.aClass12_1679 = Class12.method214(var1.readUShort());
          break;
        }
      }
    }

    var2 = 2 / var2;

    for (var3 = 0; var3 < 5; ++var3) {
      var4 = var1.readUByte();
      if (var4 < 0 || var4 >= Client.anIntArrayArray1241[var3].length) {
        var4 = 0;
      }

      this.anIntArray1662[var3] = var4;
    }

    super.anInt1604 = var1.readUShort();
    if (super.anInt1604 == 65535) {
      super.anInt1604 = -1;
    }

    super.anInt1605 = var1.readUShort();
    if (super.anInt1605 == 65535) {
      super.anInt1605 = -1;
    }

    super.anInt1606 = var1.readUShort();
    if (super.anInt1606 == 65535) {
      super.anInt1606 = -1;
    }

    super.anInt1607 = var1.readUShort();
    if (super.anInt1607 == 65535) {
      super.anInt1607 = -1;
    }

    super.anInt1608 = var1.readUShort();
    if (super.anInt1608 == 65535) {
      super.anInt1608 = -1;
    }

    super.anInt1609 = var1.readUShort();
    if (super.anInt1609 == 65535) {
      super.anInt1609 = -1;
    }

    super.anInt1610 = var1.readUShort();
    if (super.anInt1610 == 65535) {
      super.anInt1610 = -1;
    }

    this.aString1657 = Statics.method551(131, Statics.method548(0, var1.readLong(0)));
    this.anInt1663 = var1.readUByte();
    this.anInt1664 = var1.readUShort();
    this.aBoolean1658 = true;
    this.aLong1665 = 0L;

    for (var3 = 0; var3 < 12; ++var3) {
      this.aLong1665 <<= 4;
      if (this.anIntArray1661[var3] >= 256) {
        this.aLong1665 += this.anIntArray1661[var3] - 256;
      }
    }

    if (this.anIntArray1661[0] >= 256) {
      this.aLong1665 += this.anIntArray1661[0] - 256 >> 4;
    }

    if (this.anIntArray1661[1] >= 256) {
      this.aLong1665 += this.anIntArray1661[1] - 256 >> 8;
    }

    for (var3 = 0; var3 < 5; ++var3) {
      this.aLong1665 <<= 3;
      this.aLong1665 += this.anIntArray1662[var3];
    }

    this.aLong1665 <<= 1;
    this.aLong1665 += this.anInt1659;
  }
}
