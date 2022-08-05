import net.runelite.mapping.ObfuscatedSignature;

public class Class3 {

  public static boolean aBoolean67;
  public static int anInt89;
  public static final int[] POWERS_OF_TWO;
  public static int anInt68;
  public static final int[] WALL_CORNER_ORIENTATION;
  public static int anInt90;
  public static final int[] anIntArray87;
  public static final int[] anIntArray88;
  public static int anInt66;
  public final byte[][][] aByteArrayArrayArray72;
  public final int anInt63;
  public final int[][][] anIntArrayArrayArray71;
  public int anInt64;
  public boolean aBoolean65;
  public final int anInt69;
  public final int anInt70;
  public byte[][][] aByteArrayArrayArray77;
  public final byte[][][] aByteArrayArrayArray73;
  public final byte[][][] aByteArrayArrayArray74;
  public final byte[][][] aByteArrayArrayArray75;
  public byte[][][] aByteArrayArrayArray76;
  public int[][][] anIntArrayArrayArray84;
  public int[] anIntArray79;
  public int[] anIntArray80;
  public int[] anIntArray81;
  public int[] anIntArray82;
  public int[][] anIntArrayArray78;
  public int[] anIntArray83;

  static {
    POWERS_OF_TWO = new int[]{1, 2, 4, 8};
    WALL_CORNER_ORIENTATION = new int[]{16, 32, 64, 128};
    anIntArray87 = new int[]{1, 0, -1, 0};
    anIntArray88 = new int[]{0, -1, 0, 1};
    aBoolean67 = true;
    anInt89 = (int) (Math.random() * 17.0D) - 8;
    anInt90 = (int) (Math.random() * 33.0D) - 16;
  }

  public Class3(int var1, int[][][] var2, int var3, int var4, byte[][][] var5) {
    this.anInt63 = 618;
    this.anInt64 = 587;
    this.aBoolean65 = false;
    this.anInt69 = var1;
    this.anInt70 = var3;
    this.anIntArrayArrayArray71 = var2;
    this.aByteArrayArrayArray72 = var5;
    this.aByteArrayArrayArray73 = new byte[4][this.anInt69][this.anInt70];
    this.aByteArrayArrayArray74 = new byte[4][this.anInt69][this.anInt70];
    this.aByteArrayArrayArray75 = new byte[4][this.anInt69][this.anInt70];
    this.aByteArrayArrayArray76 = new byte[4][this.anInt69][this.anInt70];
    this.anIntArrayArrayArray84 = new int[4][this.anInt69 + 1][this.anInt70 + 1];
    this.aByteArrayArrayArray77 = new byte[4][this.anInt69 + 1][this.anInt70 + 1];
    this.anIntArrayArray78 = new int[this.anInt69 + 1][this.anInt70 + 1];
    this.anIntArray79 = new int[this.anInt70];
    this.anIntArray80 = new int[this.anInt70];
    this.anIntArray81 = new int[this.anInt70];
    this.anIntArray82 = new int[this.anInt70];
    this.anIntArray83 = new int[this.anInt70];
  }

  public int method164(int var1, int var2, int var3, int var4) {
    return (this.aByteArrayArrayArray72[var1][var4][var2] & 8) != 0 ? 0
        : (var1 > 0 && (this.aByteArrayArrayArray72[1][var4][var2] & 2) != 0 ? var1 - 1 : var1);
  }

  public void method162(int var1, int var2, Class18 var3, int var4, int var5, int var6,
      Class36 var7, int var8, int var9) {
    if (aBoolean67) {
      if ((this.aByteArrayArrayArray72[var2][var9][var6] & 16) != 0) {
        return;
      }

      if (this.method164(var2, var6, 11451, var9) != anInt68) {
        return;
      }
    }

    int var10 = this.anIntArrayArrayArray71[var2][var9][var6];
    int var11 = this.anIntArrayArrayArray71[var2][var9 + 1][var6];
    int var12 = this.anIntArrayArrayArray71[var2][var9 + 1][var6 + 1];
    int var13 = this.anIntArrayArrayArray71[var2][var9][var6 + 1];
    int var14 = var10 + var11 + var12 + var13 >> 2;
    GameObjectDefinition var15 = GameObjectDefinition.get(var8);
    int var16 = (var8 << 14) + var9 + (var6 << 7) + 1073741824;
    if (!var15.hasActions) {
      var16 -= Integer.MIN_VALUE;
    }

    byte var17 = (byte) (var5 + (var4 << 6));
    Object var18;
    if (var5 == 22) {
      if (!aBoolean67 || var15.hasActions || var15.aBoolean249) {
        if (var15.animationId == -1) {
          var18 = var15.getModel(22, var4, var10, var11, var12, var13, -1);
        } else {
          var18 = new GameObject(22, var4, var15.animationId, var8, var12, anInt66, true, var11,
              var13, var10);
        }

        var7.addGroundDecoration(var14, (Renderable) var18, var9, var2, var16, true, var17, var6);
        if (var15.solid && var15.hasActions && var3 != null) {
          var3.markBlocked(true, var9, var6);
        }
      }
    } else {
      int var19;
      int var20;
      if (var5 != 10 && var5 != 11) {
        int[] var10000;
        if (var5 >= 12) {
          if (var15.animationId == -1) {
            var18 = var15.getModel(var5, var4, var10, var11, var12, var13, -1);
          } else {
            var18 = new GameObject(var5, var4, var15.animationId, var8, var12, anInt66, true, var11,
                var13, var10);
          }

          var7.addRenderable(-323, var9, var6, 1, var2, var14, (Renderable) var18, var17, 1, 0,
              var16);
          if (var5 >= 12 && var5 <= 17 && var5 != 13 && var2 > 0) {
            var10000 = this.anIntArrayArrayArray84[var2][var9];
            var10000[var6] |= 2340;
          }

          if (var15.solid && var3 != null) {
            var3.markSolidOccupant(var15.sizeX, var9, var15.sizeY, var6, var4, var15.walkable, 9);
          }
        } else if (var5 == 0) {
          if (var15.animationId == -1) {
            var18 = var15.getModel(0, var4, var10, var11, var12, var13, -1);
          } else {
            var18 = new GameObject(0, var4, var15.animationId, var8, var12, anInt66, true, var11,
                var13, var10);
          }

          var7.addWall(POWERS_OF_TWO[var4], null, var14, var9, var2, var17, -30992, 0,
              var16, (Renderable) var18, var6);
          if (var4 == 0) {
            if (var15.aBoolean241) {
              this.aByteArrayArrayArray77[var2][var9][var6] = 50;
              this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
            }

            if (var15.aBoolean232) {
              var10000 = this.anIntArrayArrayArray84[var2][var9];
              var10000[var6] |= 585;
            }
          } else if (var4 == 1) {
            if (var15.aBoolean241) {
              this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
              this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
            }

            if (var15.aBoolean232) {
              var10000 = this.anIntArrayArrayArray84[var2][var9];
              var10000[var6 + 1] |= 1170;
            }
          } else if (var4 == 2) {
            if (var15.aBoolean241) {
              this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
              this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
            }

            if (var15.aBoolean232) {
              var10000 = this.anIntArrayArrayArray84[var2][var9 + 1];
              var10000[var6] |= 585;
            }
          } else if (var4 == 3) {
            if (var15.aBoolean241) {
              this.aByteArrayArrayArray77[var2][var9][var6] = 50;
              this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
            }

            if (var15.aBoolean232) {
              var10000 = this.anIntArrayArrayArray84[var2][var9];
              var10000[var6] |= 1170;
            }
          }

          if (var15.solid && var3 != null) {
            var3.markWall(var4, var5, var15.walkable, var6, (byte) 25, var9);
          }

          if (var15.anInt234 != 16) {
            var7.method294(false, var9, var6, var2, var15.anInt234);
          }
        } else if (var5 == 1) {
          if (var15.animationId == -1) {
            var18 = var15.getModel(1, var4, var10, var11, var12, var13, -1);
          } else {
            var18 = new GameObject(1, var4, var15.animationId, var8, var12, anInt66, true, var11,
                var13, var10);
          }

          var7.addWall(WALL_CORNER_ORIENTATION[var4], null, var14, var9, var2, var17,
              -30992, 0, var16, (Renderable) var18, var6);
          if (var15.aBoolean241) {
            if (var4 == 0) {
              this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
            } else if (var4 == 1) {
              this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
            } else if (var4 == 2) {
              this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
            } else if (var4 == 3) {
              this.aByteArrayArrayArray77[var2][var9][var6] = 50;
            }
          }

          if (var15.solid && var3 != null) {
            var3.markWall(var4, var5, var15.walkable, var6, (byte) 25, var9);
          }
        } else {
          Object var26;
          if (var5 == 2) {
            var20 = var4 + 1 & 3;
            Object var27;
            if (var15.animationId == -1) {
              var27 = var15.getModel(2, var4 + 4, var10, var11, var12, var13, -1);
              var26 = var15.getModel(2, var20, var10, var11, var12, var13, -1);
            } else {
              var27 = new GameObject(2, var4 + 4, var15.animationId, var8, var12, anInt66, true,
                  var11, var13, var10);
              var26 = new GameObject(2, var20, var15.animationId, var8, var12, anInt66, true, var11,
                  var13, var10);
            }

            var7.addWall(POWERS_OF_TWO[var4], (Renderable) var26, var14, var9, var2, var17, -30992,
                POWERS_OF_TWO[var20], var16, (Renderable) var27, var6);
            if (var15.aBoolean232) {
              if (var4 == 0) {
                var10000 = this.anIntArrayArrayArray84[var2][var9];
                var10000[var6] |= 585;
                var10000 = this.anIntArrayArrayArray84[var2][var9];
                var10000[var6 + 1] |= 1170;
              } else if (var4 == 1) {
                var10000 = this.anIntArrayArrayArray84[var2][var9];
                var10000[var6 + 1] |= 1170;
                var10000 = this.anIntArrayArrayArray84[var2][var9 + 1];
                var10000[var6] |= 585;
              } else if (var4 == 2) {
                var10000 = this.anIntArrayArrayArray84[var2][var9 + 1];
                var10000[var6] |= 585;
                var10000 = this.anIntArrayArrayArray84[var2][var9];
                var10000[var6] |= 1170;
              } else if (var4 == 3) {
                var10000 = this.anIntArrayArrayArray84[var2][var9];
                var10000[var6] |= 1170;
                var10000 = this.anIntArrayArrayArray84[var2][var9];
                var10000[var6] |= 585;
              }
            }

            if (var15.solid && var3 != null) {
              var3.markWall(var4, var5, var15.walkable, var6, (byte) 25, var9);
            }

            if (var15.anInt234 != 16) {
              var7.method294(false, var9, var6, var2, var15.anInt234);
            }
          } else if (var5 == 3) {
            if (var15.animationId == -1) {
              var18 = var15.getModel(3, var4, var10, var11, var12, var13, -1);
            } else {
              var18 = new GameObject(3, var4, var15.animationId, var8, var12, anInt66, true, var11,
                  var13, var10);
            }

            var7.addWall(WALL_CORNER_ORIENTATION[var4], null, var14, var9, var2, var17,
                -30992, 0, var16, (Renderable) var18, var6);
            if (var15.aBoolean241) {
              if (var4 == 0) {
                this.aByteArrayArrayArray77[var2][var9][var6 + 1] = 50;
              } else if (var4 == 1) {
                this.aByteArrayArrayArray77[var2][var9 + 1][var6 + 1] = 50;
              } else if (var4 == 2) {
                this.aByteArrayArrayArray77[var2][var9 + 1][var6] = 50;
              } else if (var4 == 3) {
                this.aByteArrayArrayArray77[var2][var9][var6] = 50;
              }
            }

            if (var15.solid && var3 != null) {
              var3.markWall(var4, var5, var15.walkable, var6, (byte) 25, var9);
            }
          } else if (var5 == 9) {
            if (var15.animationId == -1) {
              var18 = var15.getModel(var5, var4, var10, var11, var12, var13, -1);
            } else {
              var18 = new GameObject(var5, var4, var15.animationId, var8, var12, anInt66, true,
                  var11, var13, var10);
            }

            var7.addRenderable(-323, var9, var6, 1, var2, var14, (Renderable) var18, var17, 1, 0,
                var16);
            if (var15.solid && var3 != null) {
              var3.markSolidOccupant(var15.sizeX, var9, var15.sizeY, var6, var4, var15.walkable, 9);
            }
          } else {
            if (var15.aBoolean230) {
              if (var4 == 1) {
                var20 = var13;
                var13 = var12;
                var12 = var11;
                var11 = var10;
                var10 = var20;
              } else if (var4 == 2) {
                var20 = var13;
                var13 = var11;
                var11 = var20;
                var20 = var12;
                var12 = var10;
                var10 = var20;
              } else if (var4 == 3) {
                var20 = var13;
                var13 = var10;
                var10 = var11;
                var11 = var12;
                var12 = var20;
              }
            }

            if (var5 == 4) {
              if (var15.animationId == -1) {
                var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
              } else {
                var18 = new GameObject(4, 0, var15.animationId, var8, var12, anInt66, true, var11,
                    var13, var10);
              }

              var7.addWallDecoration(POWERS_OF_TWO[var4], (Renderable) var18, var17, var6, var14, 0,
                  (byte) -18, var4 * 512, var2, var9, 0, var16);
            } else if (var5 == 5) {
              var20 = 16;
              var19 = var7.getWallObjectHash(var2, var9, var6);
              if (var19 > 0) {
                var20 = GameObjectDefinition.get(var19 >> 14 & 32767).anInt234;
              }

              if (var15.animationId == -1) {
                var26 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
              } else {
                var26 = new GameObject(4, 0, var15.animationId, var8, var12, anInt66, true, var11,
                    var13, var10);
              }

              var7.addWallDecoration(POWERS_OF_TWO[var4], (Renderable) var26, var17, var6, var14,
                  var20 * anIntArray87[var4], (byte) -18, var4 * 512, var2, var9,
                  var20 * anIntArray88[var4], var16);
            } else if (var5 == 6) {
              if (var15.animationId == -1) {
                var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
              } else {
                var18 = new GameObject(4, 0, var15.animationId, var8, var12, anInt66, true, var11,
                    var13, var10);
              }

              var7.addWallDecoration(256, (Renderable) var18, var17, var6, var14, 0, (byte) -18,
                  var4, var2, var9, 0, var16);
            } else if (var5 == 7) {
              if (var15.animationId == -1) {
                var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
              } else {
                var18 = new GameObject(4, 0, var15.animationId, var8, var12, anInt66, true, var11,
                    var13, var10);
              }

              var7.addWallDecoration(512, (Renderable) var18, var17, var6, var14, 0, (byte) -18,
                  var4, var2, var9, 0, var16);
            } else if (var5 == 8) {
              if (var15.animationId == -1) {
                var18 = var15.getModel(4, 0, var10, var11, var12, var13, -1);
              } else {
                var18 = new GameObject(4, 0, var15.animationId, var8, var12, anInt66, true, var11,
                    var13, var10);
              }

              var7.addWallDecoration(768, (Renderable) var18, var17, var6, var14, 0, (byte) -18,
                  var4, var2, var9, 0, var16);
            }
          }
        }
      } else {
        if (var15.animationId == -1) {
          var18 = var15.getModel(10, var4, var10, var11, var12, var13, -1);
        } else {
          var18 = new GameObject(10, var4, var15.animationId, var8, var12, anInt66, true, var11,
              var13, var10);
        }

        if (var18 != null) {
          var20 = 0;
          if (var5 == 11) {
            var20 += 256;
          }

          int var21;
          if (var4 != 1 && var4 != 3) {
            var19 = var15.sizeX;
            var21 = var15.sizeY;
          } else {
            var19 = var15.sizeY;
            var21 = var15.sizeX;
          }

          if (var7.addRenderable(-323, var9, var6, var21, var2, var14, (Renderable) var18, var17,
              var19, var20, var16) && var15.aBoolean241) {
            Model var22;
            if (var18 instanceof Model) {
              var22 = (Model) var18;
            } else {
              var22 = var15.getModel(10, var4, var10, var11, var12, var13, -1);
            }

            if (var22 != null) {
              for (int var23 = 0; var23 <= var19; ++var23) {
                for (int var24 = 0; var24 <= var21; ++var24) {
                  int var25 = var22.anInt1546 / 4;
                  if (var25 > 30) {
                    var25 = 30;
                  }

                  if (var25 > this.aByteArrayArrayArray77[var2][var23 + var9][var24 + var6]) {
                    this.aByteArrayArrayArray77[var2][var23 + var9][var24 + var6] = (byte) var25;
                  }
                }
              }
            }
          }
        }

        if (var15.solid && var3 != null) {
          var3.markSolidOccupant(var15.sizeX, var9, var15.sizeY, var6, var4, var15.walkable, 9);
        }
      }
    }

  }

  public void method163(Class18[] var1, boolean var2, Class36 var3) {
    int var4;
    int var5;
    int var6;
    int var7;
    for (var7 = 0; var7 < 4; ++var7) {
      for (var4 = 0; var4 < 104; ++var4) {
        for (var5 = 0; var5 < 104; ++var5) {
          if ((this.aByteArrayArrayArray72[var7][var4][var5] & 1) == 1) {
            var6 = var7;
            if ((this.aByteArrayArrayArray72[1][var4][var5] & 2) == 2) {
              var6 = var7 - 1;
            }

            if (var6 >= 0) {
              var1[var6].markBlocked(true, var4, var5);
            }
          }
        }
      }
    }

    anInt89 += (int) (Math.random() * 5.0D) - 2;
    if (anInt89 < -8) {
      anInt89 = -8;
    }

    if (anInt89 > 8) {
      anInt89 = 8;
    }

    anInt90 += (int) (Math.random() * 5.0D) - 2;
    if (anInt90 < -16) {
      anInt90 = -16;
    }

    if (anInt90 > 16) {
      anInt90 = 16;
    }

    int var8;
    int var9;
    int var10;
    int var11;
    int var12;
    int var13;
    int var14;
    int var15;
    int var16;
    int[] var10000;
    int var17;
    int var18;
    for (var4 = 0; var4 < 4; ++var4) {
      byte[][] var19 = this.aByteArrayArrayArray77[var4];
      byte var20 = 96;
      short var21 = 768;
      byte var22 = -50;
      byte var23 = -10;
      byte var24 = -50;
      var7 = (int) Math.sqrt(var22 * var22 + var23 * var23 + var24 * var24);
      var8 = var21 * var7 >> 8;

      for (var9 = 1; var9 < this.anInt70 - 1; ++var9) {
        for (var10 = 1; var10 < this.anInt69 - 1; ++var10) {
          var11 = this.anIntArrayArrayArray71[var4][var10 + 1][var9]
              - this.anIntArrayArrayArray71[var4][var10 - 1][var9];
          var12 = this.anIntArrayArrayArray71[var4][var10][var9 + 1]
              - this.anIntArrayArrayArray71[var4][var10][var9 - 1];
          var13 = (int) Math.sqrt(var11 * var11 + var12 * var12 + 65536);
          var14 = (var11 << 8) / var13;
          var15 = 65536 / var13;
          var16 = (var12 << 8) / var13;
          var17 = (var22 * var14 + var23 * var15 + var24 * var16) / var8 + var20;
          var18 = (var19[var10 - 1][var9] >> 2) + (var19[var10][var9 - 1] >> 2) + (
              var19[var10 + 1][var9] >> 3) + (var19[var10][var9 + 1] >> 3) + (var19[var10][var9]
              >> 1);
          this.anIntArrayArray78[var10][var9] = var17 - var18;
        }
      }

      for (var10 = 0; var10 < this.anInt70; ++var10) {
        this.anIntArray79[var10] = 0;
        this.anIntArray80[var10] = 0;
        this.anIntArray81[var10] = 0;
        this.anIntArray82[var10] = 0;
        this.anIntArray83[var10] = 0;
      }

      for (var11 = -5; var11 < this.anInt69 + 5; ++var11) {
        for (var12 = 0; var12 < this.anInt70; ++var12) {
          var13 = var11 + 5;
          int var10002;
          Class20 var25;
          if (var13 >= 0 && var13 < this.anInt69) {
            var14 = this.aByteArrayArrayArray73[var4][var13][var12] & 255;
            if (var14 > 0) {
              var25 = Class20.aClass20Array423[var14 - 1];
              var10000 = this.anIntArray79;
              var10000[var12] += var25.anInt432;
              var10000 = this.anIntArray80;
              var10000[var12] += var25.anInt430;
              var10000 = this.anIntArray81;
              var10000[var12] += var25.anInt431;
              var10000 = this.anIntArray82;
              var10000[var12] += var25.anInt433;
              var10002 = this.anIntArray83[var12]++;
            }
          }

          var14 = var11 - 5;
          if (var14 >= 0 && var14 < this.anInt69) {
            var15 = this.aByteArrayArrayArray73[var4][var14][var12] & 255;
            if (var15 > 0) {
              var25 = Class20.aClass20Array423[var15 - 1];
              var10000 = this.anIntArray79;
              var10000[var12] -= var25.anInt432;
              var10000 = this.anIntArray80;
              var10000[var12] -= var25.anInt430;
              var10000 = this.anIntArray81;
              var10000[var12] -= var25.anInt431;
              var10000 = this.anIntArray82;
              var10000[var12] -= var25.anInt433;
              var10002 = this.anIntArray83[var12]--;
            }
          }
        }

        if (var11 >= 1 && var11 < this.anInt69 - 1) {
          var13 = 0;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = 0;

          for (var18 = -5; var18 < this.anInt70 + 5; ++var18) {
            int var51 = var18 + 5;
            if (var51 >= 0 && var51 < this.anInt70) {
              var13 += this.anIntArray79[var51];
              var14 += this.anIntArray80[var51];
              var15 += this.anIntArray81[var51];
              var16 += this.anIntArray82[var51];
              var17 += this.anIntArray83[var51];
            }

            int var26 = var18 - 5;
            if (var26 >= 0 && var26 < this.anInt70) {
              var13 -= this.anIntArray79[var26];
              var14 -= this.anIntArray80[var26];
              var15 -= this.anIntArray81[var26];
              var16 -= this.anIntArray82[var26];
              var17 -= this.anIntArray83[var26];
            }

            if (var18 >= 1 && var18 < this.anInt70 - 1 && (!aBoolean67
                || (this.aByteArrayArrayArray72[var4][var11][var18] & 16) == 0
                && this.method164(var4, var18, 11451, var11) == anInt68)) {
              int var27 = this.aByteArrayArrayArray73[var4][var11][var18] & 255;
              int var28 = this.aByteArrayArrayArray74[var4][var11][var18] & 255;
              if (var27 > 0 || var28 > 0) {
                int var29 = this.anIntArrayArrayArray71[var4][var11][var18];
                int var30 = this.anIntArrayArrayArray71[var4][var11 + 1][var18];
                int var31 = this.anIntArrayArrayArray71[var4][var11 + 1][var18 + 1];
                int var32 = this.anIntArrayArrayArray71[var4][var11][var18 + 1];
                int var33 = this.anIntArrayArray78[var11][var18];
                int var34 = this.anIntArrayArray78[var11 + 1][var18];
                int var35 = this.anIntArrayArray78[var11 + 1][var18 + 1];
                int var36 = this.anIntArrayArray78[var11][var18 + 1];
                int var37 = -1;
                int var38 = -1;
                int var39;
                int var40;
                if (var27 > 0) {
                  var39 = var13 * 256 / var16;
                  var40 = var14 / var17;
                  int var41 = var15 / var17;
                  var37 = this.method172(var39, var40, var41);
                  var39 = var39 + anInt89 & 255;
                  var41 += anInt90;
                  if (var41 < 0) {
                    var41 = 0;
                  } else if (var41 > 255) {
                    var41 = 255;
                  }

                  var38 = this.method172(var39, var40, var41);
                }

                if (var4 > 0) {
                  boolean var52 =
                      var27 != 0 || this.aByteArrayArrayArray75[var4][var11][var18] == 0;
                  if (var28 > 0 && !Class20.aClass20Array423[var28 - 1].aBoolean427) {
                    var52 = false;
                  }

                  if (var52 && var29 == var30 && var29 == var31 && var29 == var32) {
                    var10000 = this.anIntArrayArrayArray84[var4][var11];
                    var10000[var18] |= 2340;
                  }
                }

                var39 = 0;
                if (var37 != -1) {
                  var39 = Class44_Sub3_Sub1_Sub1.anIntArray1419[method170(var38, 96)];
                }

                if (var28 == 0) {
                  var3.method283(var4, var11, var18, 0, 0, -1, var29, var30, var31, var32,
                      method170(var37, var33), method170(var37, var34), method170(var37, var35),
                      method170(var37, var36), 0, 0, 0, 0, var39, 0);
                } else {
                  var40 = this.aByteArrayArrayArray75[var4][var11][var18] + 1;
                  byte var53 = this.aByteArrayArrayArray76[var4][var11][var18];
                  Class20 var42 = Class20.aClass20Array423[var28 - 1];
                  int var43 = var42.anInt425;
                  int var44;
                  int var45;
                  if (var43 >= 0) {
                    var45 = Class44_Sub3_Sub1_Sub1.method424(false, var43);
                    var44 = -1;
                  } else if (var42.anInt424 == 16711935) {
                    var45 = 0;
                    var44 = -2;
                    var43 = -1;
                  } else {
                    var44 = this.method172(var42.anInt429, var42.anInt430, var42.anInt431);
                    var45 = Class44_Sub3_Sub1_Sub1.anIntArray1419[this.method171(var42.anInt434,
                        96)];
                  }

                  var3.method283(var4, var11, var18, var40, var53, var43, var29, var30, var31,
                      var32, method170(var37, var33), method170(var37, var34),
                      method170(var37, var35), method170(var37, var36),
                      this.method171(var44, var33), this.method171(var44, var34),
                      this.method171(var44, var35), this.method171(var44, var36), var39, var45);
                }
              }
            }
          }
        }
      }

      for (var12 = 1; var12 < this.anInt70 - 1; ++var12) {
        for (var13 = 1; var13 < this.anInt69 - 1; ++var13) {
          var3.method282(var4, var13, var12, this.method164(var4, var12, 11451, var13));
        }
      }
    }

    var3.method309(-50, 64, -10, -52, -50, 768);

    for (var5 = 0; var5 < this.anInt69; ++var5) {
      for (var6 = 0; var6 < this.anInt70; ++var6) {
        if ((this.aByteArrayArrayArray72[1][var5][var6] & 2) == 2) {
          var3.method280((byte) -28, var5, var6);
        }
      }
    }

    var6 = 1;
    int var46 = 2;
    int var47 = 4;

    for (int var48 = 0; var48 < 4; ++var48) {
      if (var48 > 0) {
        var6 <<= 3;
        var46 <<= 3;
        var47 <<= 3;
      }

      for (int var49 = 0; var49 <= var48; ++var49) {
        for (var7 = 0; var7 <= this.anInt70; ++var7) {
          for (var8 = 0; var8 <= this.anInt69; ++var8) {
            short var50;
            if ((this.anIntArrayArrayArray84[var49][var8][var7] & var6) != 0) {
              var9 = var7;
              var10 = var7;
              var11 = var49;

              for (var12 = var49;
                  var9 > 0 && (this.anIntArrayArrayArray84[var49][var8][var9 - 1] & var6) != 0;
                  --var9) {
              }

              while (var10 < this.anInt70
                  && (this.anIntArrayArrayArray84[var49][var8][var10 + 1] & var6) != 0) {
                ++var10;
              }

              label344:
              while (var11 > 0) {
                for (var13 = var9; var13 <= var10; ++var13) {
                  if ((this.anIntArrayArrayArray84[var11 - 1][var8][var13] & var6) == 0) {
                    break label344;
                  }
                }

                --var11;
              }

              label333:
              while (var12 < var48) {
                for (var13 = var9; var13 <= var10; ++var13) {
                  if ((this.anIntArrayArrayArray84[var12 + 1][var8][var13] & var6) == 0) {
                    break label333;
                  }
                }

                ++var12;
              }

              var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
              if (var13 >= 8) {
                var50 = 240;
                var15 = this.anIntArrayArrayArray71[var12][var8][var9] - var50;
                var16 = this.anIntArrayArrayArray71[var11][var8][var9];
                Class36.method281(var48, var15, var10 * 128 + 128, (byte) 0, var8 * 128, var8 * 128,
                    var9 * 128, var16, 1);

                for (var17 = var11; var17 <= var12; ++var17) {
                  for (var18 = var9; var18 <= var10; ++var18) {
                    var10000 = this.anIntArrayArrayArray84[var17][var8];
                    var10000[var18] &= ~var6;
                  }
                }
              }
            }

            if ((this.anIntArrayArrayArray84[var49][var8][var7] & var46) != 0) {
              var9 = var8;
              var10 = var8;
              var11 = var49;

              for (var12 = var49;
                  var9 > 0 && (this.anIntArrayArrayArray84[var49][var9 - 1][var7] & var46) != 0;
                  --var9) {
              }

              while (var10 < this.anInt69
                  && (this.anIntArrayArrayArray84[var49][var10 + 1][var7] & var46) != 0) {
                ++var10;
              }

              label397:
              while (var11 > 0) {
                for (var13 = var9; var13 <= var10; ++var13) {
                  if ((this.anIntArrayArrayArray84[var11 - 1][var13][var7] & var46) == 0) {
                    break label397;
                  }
                }

                --var11;
              }

              label386:
              while (var12 < var48) {
                for (var13 = var9; var13 <= var10; ++var13) {
                  if ((this.anIntArrayArrayArray84[var12 + 1][var13][var7] & var46) == 0) {
                    break label386;
                  }
                }

                ++var12;
              }

              var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
              if (var13 >= 8) {
                var50 = 240;
                var15 = this.anIntArrayArrayArray71[var12][var9][var7] - var50;
                var16 = this.anIntArrayArrayArray71[var11][var9][var7];
                Class36.method281(var48, var15, var7 * 128, (byte) 0, var9 * 128, var10 * 128 + 128,
                    var7 * 128, var16, 2);

                for (var17 = var11; var17 <= var12; ++var17) {
                  for (var18 = var9; var18 <= var10; ++var18) {
                    var10000 = this.anIntArrayArrayArray84[var17][var18];
                    var10000[var7] &= ~var46;
                  }
                }
              }
            }

            if ((this.anIntArrayArrayArray84[var49][var8][var7] & var47) != 0) {
              var9 = var8;
              var10 = var8;
              var11 = var7;

              for (var12 = var7;
                  var11 > 0 && (this.anIntArrayArrayArray84[var49][var8][var11 - 1] & var47) != 0;
                  --var11) {
              }

              while (var12 < this.anInt70
                  && (this.anIntArrayArrayArray84[var49][var8][var12 + 1] & var47) != 0) {
                ++var12;
              }

              label450:
              while (var9 > 0) {
                for (var13 = var11; var13 <= var12; ++var13) {
                  if ((this.anIntArrayArrayArray84[var49][var9 - 1][var13] & var47) == 0) {
                    break label450;
                  }
                }

                --var9;
              }

              label439:
              while (var10 < this.anInt69) {
                for (var13 = var11; var13 <= var12; ++var13) {
                  if ((this.anIntArrayArrayArray84[var49][var10 + 1][var13] & var47) == 0) {
                    break label439;
                  }
                }

                ++var10;
              }

              if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
                var13 = this.anIntArrayArrayArray71[var49][var9][var11];
                Class36.method281(var48, var13, var12 * 128 + 128, (byte) 0, var9 * 128,
                    var10 * 128 + 128, var11 * 128, var13, 4);

                for (var14 = var9; var14 <= var10; ++var14) {
                  for (var15 = var11; var15 <= var12; ++var15) {
                    var10000 = this.anIntArrayArrayArray84[var49][var14];
                    var10000[var15] &= ~var47;
                  }
                }
              }
            }
          }
        }
      }
    }

  }

  public void method157(int var1, int var2, int var3, int var4, int var5) {
    for (int var6 = var1; var6 <= var5 + var1; ++var6) {
      for (int var7 = var2; var7 <= var2 + var4; ++var7) {
        if (var7 >= 0 && var7 < this.anInt69 && var6 >= 0 && var6 < this.anInt70) {
          this.aByteArrayArrayArray77[0][var7][var6] = 127;
          if (var7 == var2 && var7 > 0) {
            this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7
                - 1][var6];
          }

          if (var2 + var4 == var7 && var7 < this.anInt69 - 1) {
            this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7
                + 1][var6];
          }

          if (var6 == var1 && var6 > 0) {
            this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7][var6
                - 1];
          }

          if (var6 == var5 + var1 && var6 < this.anInt70 - 1) {
            this.anIntArrayArrayArray71[0][var7][var6] = this.anIntArrayArrayArray71[0][var7][var6
                + 1];
          }
        }
      }
    }

  }

  public void method158(boolean var1, int var2, byte[] var3, int var4, int var5, int var6) {
    Buffer var7 = new Buffer(var3, (byte) 1);

    for (int var8 = 0; var8 < 4; ++var8) {
      for (int var9 = 0; var9 < 64; ++var9) {
        for (int var10 = 0; var10 < 64; ++var10) {
          int var11 = var9 + var6;
          int var12 = var10 + var4;
          int var13;
          if (var11 >= 0 && var11 < 104 && var12 >= 0 && var12 < 104) {
            this.aByteArrayArrayArray72[var8][var11][var12] = 0;

            while (true) {
              var13 = var7.readUByte();
              if (var13 == 0) {
                if (var8 == 0) {
                  this.anIntArrayArrayArray71[0][var11][var12] =
                      -method165(932731 + var11 + var2, 556238 + var12 + var5) * 8;
                } else {
                  this.anIntArrayArrayArray71[var8][var11][var12] =
                      this.anIntArrayArrayArray71[var8 - 1][var11][var12] - 240;
                }
                break;
              }

              if (var13 == 1) {
                int var14 = var7.readUByte();
                if (var14 == 1) {
                  var14 = 0;
                }

                if (var8 == 0) {
                  this.anIntArrayArrayArray71[0][var11][var12] = -var14 * 8;
                } else {
                  this.anIntArrayArrayArray71[var8][var11][var12] =
                      this.anIntArrayArrayArray71[var8 - 1][var11][var12] - var14 * 8;
                }
                break;
              }

              if (var13 <= 49) {
                this.aByteArrayArrayArray74[var8][var11][var12] = var7.readByte();
                this.aByteArrayArrayArray75[var8][var11][var12] = (byte) ((var13 - 2) / 4);
                this.aByteArrayArrayArray76[var8][var11][var12] = (byte) (var13 - 2 & 3);
              } else if (var13 <= 81) {
                this.aByteArrayArrayArray72[var8][var11][var12] = (byte) (var13 - 49);
              } else {
                this.aByteArrayArrayArray73[var8][var11][var12] = (byte) (var13 - 81);
              }
            }
          } else {
            while (true) {
              var13 = var7.readUByte();
              if (var13 == 0) {
                break;
              }

              if (var13 == 1) {
                var7.readUByte();
                break;
              }

              if (var13 <= 49) {
                var7.readUByte();
              }
            }
          }
        }
      }
    }

  }

  public void method161(int var1, byte[] var2, boolean var3, Class36 var4, int var5,
      Class18[] var6) {
    Buffer var7 = new Buffer(var2, (byte) 1);
    int var8 = -1;

    while (true) {
      int var9 = var7.readUShortSmart();
      if (var9 == 0) {
        return;
      }

      var8 += var9;
      int var10 = 0;

      while (true) {
        int var11 = var7.readUShortSmart();
        if (var11 == 0) {
          break;
        }

        var10 += var11 - 1;
        int var12 = var10 & 63;
        int var13 = var10 >> 6 & 63;
        int var14 = var10 >> 12;
        int var15 = var7.readUByte();
        int var16 = var15 >> 2;
        int var17 = var15 & 3;
        int var18 = var5 + var13;
        int var19 = var12 + var1;
        if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
          int var20 = var14;
          if ((this.aByteArrayArrayArray72[1][var18][var19] & 2) == 2) {
            var20 = var14 - 1;
          }

          Class18 var21 = null;
          if (var20 >= 0) {
            var21 = var6[var20];
          }

          this.method162(8, var14, var21, var17, var16, var19, var4, var8, var18);
        }
      }
    }
  }

  public int method172(int var1, int var2, int var3) {
    if (var3 > 179) {
      var2 /= 2;
    }

    if (var3 > 192) {
      var2 /= 2;
    }

    if (var3 > 217) {
      var2 /= 2;
    }

    if (var3 > 243) {
      var2 /= 2;
    }

    int var4 = var3 / 2 + (var1 / 4 << 10) + (var2 / 32 << 7);
    return var4;
  }

  public int method171(int var1, int var2) {
    if (var1 == -2) {
      return 12345678;
    } else if (var1 == -1) {
      if (var2 < 0) {
        var2 = 0;
      } else if (var2 > 127) {
        var2 = 127;
      }

      var2 = 127 - var2;
      return var2;
    } else {
      var2 = (var1 & 127) * var2 / 128;
      if (var2 < 2) {
        var2 = 2;
      } else if (var2 > 126) {
        var2 = 126;
      }

      return var2 + (var1 & 65408);
    }
  }

  public static boolean method159(byte var0, byte[] var1, int var2, int var3) {
    boolean var4 = true;
    Buffer var5 = new Buffer(var1, (byte) 1);
    int var6 = -1;

    label55:
    while (true) {
      int var7 = var5.readUShortSmart();
      if (var7 == 0) {
        return var4;
      }

      var6 += var7;
      int var8 = 0;
      boolean var9 = false;

      while (true) {
        int var10;
        while (!var9) {
          var10 = var5.readUShortSmart();
          if (var10 == 0) {
            continue label55;
          }

          var8 += var10 - 1;
          int var11 = var8 & 63;
          int var12 = var8 >> 6 & 63;
          int var13 = var5.readUByte() >> 2;
          int var14 = var3 + var12;
          int var15 = var11 + var2;
          if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
            GameObjectDefinition var16 = GameObjectDefinition.get(var6);
            if (var13 != 22 || !aBoolean67 || var16.hasActions || var16.aBoolean249) {
              var4 &= var16.method203();
              var9 = true;
            }
          }
        }

        var10 = var5.readUShortSmart();
        if (var10 == 0) {
          break;
        }

        var5.readUByte();
      }
    }
  }

  @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "469"
  )
  public static boolean isModelCached(int var0, int var1, int var2) {
    GameObjectDefinition var3 = GameObjectDefinition.get(var0);
    if (var1 == 11) {
      var1 = 10;
    }

    if (var1 >= 5 && var1 <= 8) {
      var1 = 4;
    }

    return var3.method202(0, var1);
  }

  public static int method165(int var0, int var1) {
    int var2 = method166(var0 + 45365, var1 + 91923, 4) - 128 + (
        method166(var0 + 10294, var1 + 37821, 2) - 128 >> 1) + (method166(var0, var1, 1) - 128
        >> 2);
    var2 = (int) ((double) var2 * 0.3D) + 35;
    if (var2 < 10) {
      var2 = 10;
    } else if (var2 > 60) {
      var2 = 60;
    }

    return var2;
  }

  public static int method166(int var0, int var1, int var2) {
    int var3 = var0 / var2;
    int var4 = var0 & var2 - 1;
    int var5 = var1 / var2;
    int var6 = var1 & var2 - 1;
    int var7 = method168(var3, var5);
    int var8 = method168(var3 + 1, var5);
    int var9 = method168(var3, var5 + 1);
    int var10 = method168(var3 + 1, var5 + 1);
    int var11 = method167(var7, var8, var4, var2);
    int var12 = method167(var9, var10, var4, var2);
    return method167(var11, var12, var6, var2);
  }

  public static void forceRenderObject(Class36 var0, int var1, int var2, boolean var3, int var4,
      int var5, int var6, Class18 var7, int[][][] var8, int var9, int var10) {
    int var11 = var8[var1][var10][var9];
    int var12 = var8[var1][var10 + 1][var9];
    int var13 = var8[var1][var10 + 1][var9 + 1];
    int var14 = var8[var1][var10][var9 + 1];
    int var15 = var11 + var12 + var13 + var14 >> 2;
    if (var3) {
      GameObjectDefinition var16 = GameObjectDefinition.get(var4);
      int var17 = var10 + (var9 << 7) + (var4 << 14) + 1073741824;
      if (!var16.hasActions) {
        var17 -= Integer.MIN_VALUE;
      }

      byte var18 = (byte) (var5 + (var6 << 6));
      Object var19;
      if (var5 == 22) {
        if (var16.animationId == -1) {
          var19 = var16.getModel(22, var6, var11, var12, var13, var14, -1);
        } else {
          var19 = new GameObject(22, var6, var16.animationId, var4, var13, anInt66, true, var12,
              var14, var11);
        }

        var0.addGroundDecoration(var15, (Renderable) var19, var10, var2, var17, true, var18, var9);
        if (var16.solid && var16.hasActions) {
          var7.markBlocked(true, var10, var9);
        }
      } else {
        int var20;
        int var21;
        if (var5 != 10 && var5 != 11) {
          if (var5 >= 12) {
            if (var16.animationId == -1) {
              var19 = var16.getModel(var5, var6, var11, var12, var13, var14, -1);
            } else {
              var19 = new GameObject(var5, var6, var16.animationId, var4, var13, anInt66, true,
                  var12, var14, var11);
            }

            var0.addRenderable(-323, var10, var9, 1, var2, var15, (Renderable) var19, var18, 1, 0,
                var17);
            if (var16.solid) {
              var7.markSolidOccupant(var16.sizeX, var10, var16.sizeY, var9, var6, var16.walkable,
                  9);
            }
          } else if (var5 == 0) {
            if (var16.animationId == -1) {
              var19 = var16.getModel(0, var6, var11, var12, var13, var14, -1);
            } else {
              var19 = new GameObject(0, var6, var16.animationId, var4, var13, anInt66, true, var12,
                  var14, var11);
            }

            var0.addWall(POWERS_OF_TWO[var6], null, var15, var10, var2, var18, -30992,
                0, var17, (Renderable) var19, var9);
            if (var16.solid) {
              var7.markWall(var6, var5, var16.walkable, var9, (byte) 25, var10);
            }
          } else if (var5 == 1) {
            if (var16.animationId == -1) {
              var19 = var16.getModel(1, var6, var11, var12, var13, var14, -1);
            } else {
              var19 = new GameObject(1, var6, var16.animationId, var4, var13, anInt66, true, var12,
                  var14, var11);
            }

            var0.addWall(WALL_CORNER_ORIENTATION[var6], null, var15, var10, var2,
                var18, -30992, 0, var17, (Renderable) var19, var9);
            if (var16.solid) {
              var7.markWall(var6, var5, var16.walkable, var9, (byte) 25, var10);
            }
          } else {
            Object var24;
            if (var5 == 2) {
              var21 = var6 + 1 & 3;
              Object var23;
              if (var16.animationId == -1) {
                var23 = var16.getModel(2, var6 + 4, var11, var12, var13, var14, -1);
                var24 = var16.getModel(2, var21, var11, var12, var13, var14, -1);
              } else {
                var23 = new GameObject(2, var6 + 4, var16.animationId, var4, var13, anInt66, true,
                    var12, var14, var11);
                var24 = new GameObject(2, var21, var16.animationId, var4, var13, anInt66, true,
                    var12, var14, var11);
              }

              var0.addWall(POWERS_OF_TWO[var6], (Renderable) var24, var15, var10, var2, var18,
                  -30992, POWERS_OF_TWO[var21], var17, (Renderable) var23, var9);
              if (var16.solid) {
                var7.markWall(var6, var5, var16.walkable, var9, (byte) 25, var10);
              }
            } else if (var5 == 3) {
              if (var16.animationId == -1) {
                var19 = var16.getModel(3, var6, var11, var12, var13, var14, -1);
              } else {
                var19 = new GameObject(3, var6, var16.animationId, var4, var13, anInt66, true,
                    var12, var14, var11);
              }

              var0.addWall(WALL_CORNER_ORIENTATION[var6], null, var15, var10, var2,
                  var18, -30992, 0, var17, (Renderable) var19, var9);
              if (var16.solid) {
                var7.markWall(var6, var5, var16.walkable, var9, (byte) 25, var10);
              }
            } else if (var5 == 9) {
              if (var16.animationId == -1) {
                var19 = var16.getModel(var5, var6, var11, var12, var13, var14, -1);
              } else {
                var19 = new GameObject(var5, var6, var16.animationId, var4, var13, anInt66, true,
                    var12, var14, var11);
              }

              var0.addRenderable(-323, var10, var9, 1, var2, var15, (Renderable) var19, var18, 1, 0,
                  var17);
              if (var16.solid) {
                var7.markSolidOccupant(var16.sizeX, var10, var16.sizeY, var9, var6, var16.walkable,
                    9);
              }
            } else {
              if (var16.aBoolean230) {
                if (var6 == 1) {
                  var21 = var14;
                  var14 = var13;
                  var13 = var12;
                  var12 = var11;
                  var11 = var21;
                } else if (var6 == 2) {
                  var21 = var14;
                  var14 = var12;
                  var12 = var21;
                  var21 = var13;
                  var13 = var11;
                  var11 = var21;
                } else if (var6 == 3) {
                  var21 = var14;
                  var14 = var11;
                  var11 = var12;
                  var12 = var13;
                  var13 = var21;
                }
              }

              if (var5 == 4) {
                if (var16.animationId == -1) {
                  var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                  var19 = new GameObject(4, 0, var16.animationId, var4, var13, anInt66, true, var12,
                      var14, var11);
                }

                var0.addWallDecoration(POWERS_OF_TWO[var6], (Renderable) var19, var18, var9, var15,
                    0, (byte) -18, var6 * 512, var2, var10, 0, var17);
              } else if (var5 == 5) {
                var21 = 16;
                var20 = var0.getWallObjectHash(var2, var10, var9);
                if (var20 > 0) {
                  var21 = GameObjectDefinition.get(var20 >> 14 & 32767).anInt234;
                }

                if (var16.animationId == -1) {
                  var24 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                  var24 = new GameObject(4, 0, var16.animationId, var4, var13, anInt66, true, var12,
                      var14, var11);
                }

                var0.addWallDecoration(POWERS_OF_TWO[var6], (Renderable) var24, var18, var9, var15,
                    anIntArray87[var6] * var21, (byte) -18, var6 * 512, var2, var10,
                    anIntArray88[var6] * var21, var17);
              } else if (var5 == 6) {
                if (var16.animationId == -1) {
                  var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                  var19 = new GameObject(4, 0, var16.animationId, var4, var13, anInt66, true, var12,
                      var14, var11);
                }

                var0.addWallDecoration(256, (Renderable) var19, var18, var9, var15, 0, (byte) -18,
                    var6, var2, var10, 0, var17);
              } else if (var5 == 7) {
                if (var16.animationId == -1) {
                  var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                  var19 = new GameObject(4, 0, var16.animationId, var4, var13, anInt66, true, var12,
                      var14, var11);
                }

                var0.addWallDecoration(512, (Renderable) var19, var18, var9, var15, 0, (byte) -18,
                    var6, var2, var10, 0, var17);
              } else if (var5 == 8) {
                if (var16.animationId == -1) {
                  var19 = var16.getModel(4, 0, var11, var12, var13, var14, -1);
                } else {
                  var19 = new GameObject(4, 0, var16.animationId, var4, var13, anInt66, true, var12,
                      var14, var11);
                }

                var0.addWallDecoration(768, (Renderable) var19, var18, var9, var15, 0, (byte) -18,
                    var6, var2, var10, 0, var17);
              }
            }
          }
        } else {
          if (var16.animationId == -1) {
            var19 = var16.getModel(10, var6, var11, var12, var13, var14, -1);
          } else {
            var19 = new GameObject(10, var6, var16.animationId, var4, var13, anInt66, true, var12,
                var14, var11);
          }

          if (var19 != null) {
            var21 = 0;
            if (var5 == 11) {
              var21 += 256;
            }

            int var22;
            if (var6 != 1 && var6 != 3) {
              var20 = var16.sizeX;
              var22 = var16.sizeY;
            } else {
              var20 = var16.sizeY;
              var22 = var16.sizeX;
            }

            var0.addRenderable(-323, var10, var9, var22, var2, var15, (Renderable) var19, var18,
                var20, var21, var17);
          }

          if (var16.solid) {
            var7.markSolidOccupant(var16.sizeX, var10, var16.sizeY, var9, var6, var16.walkable, 9);
          }
        }
      }
    }

  }

  public static int method168(int var0, int var1) {
    int var2 = method169(var0 - 1, var1 - 1) + method169(var0 + 1, var1 - 1) + method169(var0 - 1,
        var1 + 1) + method169(var0 + 1, var1 + 1);
    int var3 = method169(var0 - 1, var1) + method169(var0 + 1, var1) + method169(var0, var1 - 1)
        + method169(var0, var1 + 1);
    int var4 = method169(var0, var1);
    return var2 / 16 + var3 / 8 + var4 / 4;
  }

  public static int method169(int var0, int var1) {
    int var2 = var1 * 57 + var0;
    var2 ^= var2 << 13;
    int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
    return var3 >> 19 & 255;
  }

  public static void method160(byte var0, Buffer var1, Class43_Sub1 var2) {
    int var3 = -1;

    while (true) {
      int var4 = var1.readUShortSmart();
      if (var4 == 0) {
        return;
      }

      var3 += var4;
      GameObjectDefinition var5 = GameObjectDefinition.get(var3);
      var5.method204((byte) 0, var2);

      while (true) {
        int var6 = var1.readUShortSmart();
        if (var6 == 0) {
          break;
        }

        var1.readUByte();
      }
    }
  }

  public static int method170(int var0, int var1) {
    if (var0 == -1) {
      return 12345678;
    } else {
      var1 = (var0 & 127) * var1 / 128;
      if (var1 < 2) {
        var1 = 2;
      } else if (var1 > 126) {
        var1 = 126;
      }

      return (var0 & 65408) + var1;
    }
  }

  public static int method167(int var0, int var1, int var2, int var3) {
    int var4 = 65536 - Class44_Sub3_Sub1_Sub1.anIntArray1408[var2 * 1024 / var3] >> 1;
    return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
  }
}
