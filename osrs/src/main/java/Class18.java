import net.runelite.mapping.ObfuscatedSignature;

public class Class18 {

  public final int anInt404;
  public int anInt409;
  public int anInt407;
  public int[][] anIntArrayArray411;
  public int anInt400;
  public int anInt410;
  public int anInt408;
  public int anInt401;
  public final int anInt402;
  public final boolean aBoolean403;
  public boolean aBoolean405;
  public boolean aBoolean406;

  @ObfuscatedSignature(
      descriptor = "(IIZ)V",
      garbageValue = "1"
  )
  public Class18(int var1, int var2, boolean var3) {
    this.anInt400 = 701;
    this.anInt401 = 1;
    this.anInt402 = 1;
    this.aBoolean403 = false;
    this.anInt404 = 1;
    this.aBoolean405 = false;
    this.aBoolean406 = false;
    this.anInt407 = 0;
    this.anInt408 = 0;
    this.anInt409 = var2;
    this.anInt410 = var1;
    this.anIntArrayArray411 = new int[this.anInt409][this.anInt410];
    this.method231((byte) 5);
  }

  public void method235(int var1, int var2, int var3) {
    int[] var10000 = this.anIntArrayArray411[var1];
    var10000[var2] |= var3;
  }

  public void method238(int var1, int var2, int var3, int var4) {
    int[] var10000 = this.anIntArrayArray411[var4];
    var10000[var1] &= 16777215 - var3;
  }

  public void markBlocked(boolean var1, int var2, int var3) {
    var2 -= this.anInt407;
    var3 -= this.anInt408;
    int[] var10000 = this.anIntArrayArray411[var2];
    var10000[var3] |= 2097152;
  }

  public void method231(byte var1) {
    int var2;
    for (var2 = 0; var2 < this.anInt409; ++var2) {
      for (int var3 = 0; var3 < this.anInt410; ++var3) {
        if (var2 != 0 && var3 != 0 && var2 != this.anInt409 - 1 && var3 != this.anInt410 - 1) {
          this.anIntArrayArray411[var2][var3] = 0;
        } else {
          this.anIntArrayArray411[var2][var3] = 16777215;
        }
      }
    }

    if (var1 == 5) {
      boolean var4 = false;
    } else {
      for (var2 = 1; var2 > 0; ++var2) {
      }

    }
  }

  public boolean method240(boolean var1, int var2, int var3, int var4, int var5, int var6,
      int var7) {
    if (var2 == var4 && var5 == var7) {
      return true;
    } else {
      var2 -= this.anInt407;
      var7 -= this.anInt408;
      var4 -= this.anInt407;
      var5 -= this.anInt408;
      if (var6 == 0) {
        if (var3 == 0) {
          if (var2 == var4 - 1 && var5 == var7) {
            return true;
          }

          if (var2 == var4 && var7 == var5 + 1
              && (this.anIntArrayArray411[var2][var7] & 2621728) == 0) {
            return true;
          }

          if (var2 == var4 && var5 - 1 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621698) == 0) {
            return true;
          }
        } else if (var3 == 1) {
          if (var2 == var4 && var7 == var5 + 1) {
            return true;
          }

          if (var2 == var4 - 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621704) == 0) {
            return true;
          }

          if (var2 == var4 + 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621824) == 0) {
            return true;
          }
        } else if (var3 == 2) {
          if (var2 == var4 + 1 && var5 == var7) {
            return true;
          }

          if (var2 == var4 && var7 == var5 + 1
              && (this.anIntArrayArray411[var2][var7] & 2621728) == 0) {
            return true;
          }

          if (var2 == var4 && var5 - 1 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621698) == 0) {
            return true;
          }
        } else if (var3 == 3) {
          if (var2 == var4 && var5 - 1 == var7) {
            return true;
          }

          if (var2 == var4 - 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621704) == 0) {
            return true;
          }

          if (var2 == var4 + 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621824) == 0) {
            return true;
          }
        }
      }

      if (var6 == 2) {
        if (var3 == 0) {
          if (var2 == var4 - 1 && var5 == var7) {
            return true;
          }

          if (var2 == var4 && var7 == var5 + 1) {
            return true;
          }

          if (var2 == var4 + 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621824) == 0) {
            return true;
          }

          if (var2 == var4 && var5 - 1 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621698) == 0) {
            return true;
          }
        } else if (var3 == 1) {
          if (var2 == var4 - 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621704) == 0) {
            return true;
          }

          if (var2 == var4 && var7 == var5 + 1) {
            return true;
          }

          if (var2 == var4 + 1 && var5 == var7) {
            return true;
          }

          if (var2 == var4 && var5 - 1 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621698) == 0) {
            return true;
          }
        } else if (var3 == 2) {
          if (var2 == var4 - 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621704) == 0) {
            return true;
          }

          if (var2 == var4 && var7 == var5 + 1
              && (this.anIntArrayArray411[var2][var7] & 2621728) == 0) {
            return true;
          }

          if (var2 == var4 + 1 && var5 == var7) {
            return true;
          }

          if (var2 == var4 && var5 - 1 == var7) {
            return true;
          }
        } else if (var3 == 3) {
          if (var2 == var4 - 1 && var5 == var7) {
            return true;
          }

          if (var2 == var4 && var7 == var5 + 1
              && (this.anIntArrayArray411[var2][var7] & 2621728) == 0) {
            return true;
          }

          if (var2 == var4 + 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 2621824) == 0) {
            return true;
          }

          if (var2 == var4 && var5 - 1 == var7) {
            return true;
          }
        }
      }

      if (var6 == 9) {
        if (var2 == var4 && var7 == var5 + 1 && (this.anIntArrayArray411[var2][var7] & 32) == 0) {
          return true;
        } else if (var2 == var4 && var5 - 1 == var7
            && (this.anIntArrayArray411[var2][var7] & 2) == 0) {
          return true;
        } else if (var2 == var4 - 1 && var5 == var7
            && (this.anIntArrayArray411[var2][var7] & 8) == 0) {
          return true;
        } else {
          return var2 == var4 + 1 && var5 == var7
              && (this.anIntArrayArray411[var2][var7] & 128) == 0;
        }
      } else {
        return false;
      }
    }
  }

  public boolean method242(int var1, int var2, int var3, int var4, int var5, int var6, int var7,
      int var8) {
    int var9;
    if (var4 != this.anInt404) {
      for (var9 = 1; var9 > 0; ++var9) {
      }
    }

    var9 = var2 + var1 - 1;
    int var10 = var5 + var8 - 1;
    if (var7 >= var1 && var7 <= var9 && var6 >= var5 && var6 <= var10) {
      return true;
    } else if (var7 == var1 - 1 && var6 >= var5 && var6 <= var10
        && (this.anIntArrayArray411[var7 - this.anInt407][var6 - this.anInt408] & 8) == 0
        && (var3 & 8) == 0) {
      return true;
    } else if (var9 + 1 == var7 && var6 >= var5 && var6 <= var10
        && (this.anIntArrayArray411[var7 - this.anInt407][var6 - this.anInt408] & 128) == 0
        && (var3 & 2) == 0) {
      return true;
    } else if (var5 - 1 == var6 && var7 >= var1 && var7 <= var9
        && (this.anIntArrayArray411[var7 - this.anInt407][var6 - this.anInt408] & 2) == 0
        && (var3 & 4) == 0) {
      return true;
    } else {
      return var10 + 1 == var6 && var7 >= var1 && var7 <= var9
          && (this.anIntArrayArray411[var7 - this.anInt407][var6 - this.anInt408] & 32) == 0
          && (var3 & 1) == 0;
    }
  }

  @ObfuscatedSignature(
      descriptor = "(IIIIIII)Z",
      garbageValue = "6"
  )
  public boolean method241(int var1, int var2, int var3, int var4, int var5, int var6) {
    if (var3 == var1 && var2 == var6) {
      return true;
    } else {
      var3 -= this.anInt407;
      var6 -= this.anInt408;
      var1 -= this.anInt407;
      var2 -= this.anInt408;
      if (var4 == 6 || var4 == 7) {
        if (var4 == 7) {
          var5 = var5 + 2 & 3;
        }

        if (var5 == 0) {
          if (var3 == var1 + 1 && var2 == var6
              && (this.anIntArrayArray411[var3][var6] & 128) == 0) {
            return true;
          }

          if (var3 == var1 && var2 - 1 == var6 && (this.anIntArrayArray411[var3][var6] & 2) == 0) {
            return true;
          }
        } else if (var5 == 1) {
          if (var3 == var1 - 1 && var2 == var6 && (this.anIntArrayArray411[var3][var6] & 8) == 0) {
            return true;
          }

          if (var3 == var1 && var2 - 1 == var6 && (this.anIntArrayArray411[var3][var6] & 2) == 0) {
            return true;
          }
        } else if (var5 == 2) {
          if (var3 == var1 - 1 && var2 == var6 && (this.anIntArrayArray411[var3][var6] & 8) == 0) {
            return true;
          }

          if (var3 == var1 && var2 + 1 == var6 && (this.anIntArrayArray411[var3][var6] & 32) == 0) {
            return true;
          }
        } else if (var5 == 3) {
          if (var3 == var1 + 1 && var2 == var6
              && (this.anIntArrayArray411[var3][var6] & 128) == 0) {
            return true;
          }

          if (var3 == var1 && var2 + 1 == var6 && (this.anIntArrayArray411[var3][var6] & 32) == 0) {
            return true;
          }
        }
      }

      if (var4 == 8) {
        if (var3 == var1 && var2 + 1 == var6 && (this.anIntArrayArray411[var3][var6] & 32) == 0) {
          return true;
        } else if (var3 == var1 && var2 - 1 == var6
            && (this.anIntArrayArray411[var3][var6] & 2) == 0) {
          return true;
        } else if (var3 == var1 - 1 && var2 == var6
            && (this.anIntArrayArray411[var3][var6] & 8) == 0) {
          return true;
        } else {
          return var3 == var1 + 1 && var2 == var6
              && (this.anIntArrayArray411[var3][var6] & 128) == 0;
        }
      } else {
        return false;
      }
    }
  }

  public void unmarkWall(byte var1, int var2, boolean var3, int var4, int var5, int var6) {
    var6 -= this.anInt407;
    var5 -= this.anInt408;
    if (var2 == 0) {
      if (var4 == 0) {
        this.method238(var5, this.anInt401, 128, var6);
        this.method238(var5, this.anInt401, 8, var6 - 1);
      }

      if (var4 == 1) {
        this.method238(var5, this.anInt401, 2, var6);
        this.method238(var5 + 1, this.anInt401, 32, var6);
      }

      if (var4 == 2) {
        this.method238(var5, this.anInt401, 8, var6);
        this.method238(var5, this.anInt401, 128, var6 + 1);
      }

      if (var4 == 3) {
        this.method238(var5, this.anInt401, 32, var6);
        this.method238(var5 - 1, this.anInt401, 2, var6);
      }
    }

    if (var2 == 1 || var2 == 3) {
      if (var4 == 0) {
        this.method238(var5, this.anInt401, 1, var6);
        this.method238(var5 + 1, this.anInt401, 16, var6 - 1);
      }

      if (var4 == 1) {
        this.method238(var5, this.anInt401, 4, var6);
        this.method238(var5 + 1, this.anInt401, 64, var6 + 1);
      }

      if (var4 == 2) {
        this.method238(var5, this.anInt401, 16, var6);
        this.method238(var5 - 1, this.anInt401, 1, var6 + 1);
      }

      if (var4 == 3) {
        this.method238(var5, this.anInt401, 64, var6);
        this.method238(var5 - 1, this.anInt401, 4, var6 - 1);
      }
    }

    if (var2 == 2) {
      if (var4 == 0) {
        this.method238(var5, this.anInt401, 130, var6);
        this.method238(var5, this.anInt401, 8, var6 - 1);
        this.method238(var5 + 1, this.anInt401, 32, var6);
      }

      if (var4 == 1) {
        this.method238(var5, this.anInt401, 10, var6);
        this.method238(var5 + 1, this.anInt401, 32, var6);
        this.method238(var5, this.anInt401, 128, var6 + 1);
      }

      if (var4 == 2) {
        this.method238(var5, this.anInt401, 40, var6);
        this.method238(var5, this.anInt401, 128, var6 + 1);
        this.method238(var5 - 1, this.anInt401, 2, var6);
      }

      if (var4 == 3) {
        this.method238(var5, this.anInt401, 160, var6);
        this.method238(var5 - 1, this.anInt401, 2, var6);
        this.method238(var5, this.anInt401, 8, var6 - 1);
      }
    }

    if (var3) {
      if (var2 == 0) {
        if (var4 == 0) {
          this.method238(var5, this.anInt401, 65536, var6);
          this.method238(var5, this.anInt401, 4096, var6 - 1);
        }

        if (var4 == 1) {
          this.method238(var5, this.anInt401, 1024, var6);
          this.method238(var5 + 1, this.anInt401, 16384, var6);
        }

        if (var4 == 2) {
          this.method238(var5, this.anInt401, 4096, var6);
          this.method238(var5, this.anInt401, 65536, var6 + 1);
        }

        if (var4 == 3) {
          this.method238(var5, this.anInt401, 16384, var6);
          this.method238(var5 - 1, this.anInt401, 1024, var6);
        }
      }

      if (var2 == 1 || var2 == 3) {
        if (var4 == 0) {
          this.method238(var5, this.anInt401, 512, var6);
          this.method238(var5 + 1, this.anInt401, 8192, var6 - 1);
        }

        if (var4 == 1) {
          this.method238(var5, this.anInt401, 2048, var6);
          this.method238(var5 + 1, this.anInt401, 32768, var6 + 1);
        }

        if (var4 == 2) {
          this.method238(var5, this.anInt401, 8192, var6);
          this.method238(var5 - 1, this.anInt401, 512, var6 + 1);
        }

        if (var4 == 3) {
          this.method238(var5, this.anInt401, 32768, var6);
          this.method238(var5 - 1, this.anInt401, 2048, var6 - 1);
        }
      }

      if (var2 == 2) {
        if (var4 == 0) {
          this.method238(var5, this.anInt401, 66560, var6);
          this.method238(var5, this.anInt401, 4096, var6 - 1);
          this.method238(var5 + 1, this.anInt401, 16384, var6);
        }

        if (var4 == 1) {
          this.method238(var5, this.anInt401, 5120, var6);
          this.method238(var5 + 1, this.anInt401, 16384, var6);
          this.method238(var5, this.anInt401, 65536, var6 + 1);
        }

        if (var4 == 2) {
          this.method238(var5, this.anInt401, 20480, var6);
          this.method238(var5, this.anInt401, 65536, var6 + 1);
          this.method238(var5 - 1, this.anInt401, 1024, var6);
        }

        if (var4 == 3) {
          this.method238(var5, this.anInt401, 81920, var6);
          this.method238(var5 - 1, this.anInt401, 1024, var6);
          this.method238(var5, this.anInt401, 4096, var6 - 1);
        }
      }
    }

  }

  @ObfuscatedSignature(
      descriptor = "(IIIIIZI)V",
      garbageValue = "9"
  )
  public void markSolidOccupant(int var1, int var2, int var3, int var4, int var5, boolean var6,
      int var7) {
    int var8 = 256;
    if (var6) {
      var8 += 131072;
    }

    var2 -= this.anInt407;
    var4 -= this.anInt408;
    int var9;
    if (var5 == 1 || var5 == 3) {
      var9 = var1;
      var1 = var3;
      var3 = var9;
    }

    for (var9 = var2; var9 < var2 + var1; ++var9) {
      if (var9 >= 0 && var9 < this.anInt409) {
        for (int var10 = var4; var10 < var3 + var4; ++var10) {
          if (var10 >= 0 && var10 < this.anInt410) {
            this.method235(var9, var10, var8);
          }
        }
      }
    }

  }

  public void markWall(int var1, int var2, boolean var3, int var4, byte var5, int var6) {
    var6 -= this.anInt407;
    var4 -= this.anInt408;
    if (var2 == 0) {
      if (var1 == 0) {
        this.method235(var6, var4, 128);
        this.method235(var6 - 1, var4, 8);
      }

      if (var1 == 1) {
        this.method235(var6, var4, 2);
        this.method235(var6, var4 + 1, 32);
      }

      if (var1 == 2) {
        this.method235(var6, var4, 8);
        this.method235(var6 + 1, var4, 128);
      }

      if (var1 == 3) {
        this.method235(var6, var4, 32);
        this.method235(var6, var4 - 1, 2);
      }
    }

    if (var2 == 1 || var2 == 3) {
      if (var1 == 0) {
        this.method235(var6, var4, 1);
        this.method235(var6 - 1, var4 + 1, 16);
      }

      if (var1 == 1) {
        this.method235(var6, var4, 4);
        this.method235(var6 + 1, var4 + 1, 64);
      }

      if (var1 == 2) {
        this.method235(var6, var4, 16);
        this.method235(var6 + 1, var4 - 1, 1);
      }

      if (var1 == 3) {
        this.method235(var6, var4, 64);
        this.method235(var6 - 1, var4 - 1, 4);
      }
    }

    if (var2 == 2) {
      if (var1 == 0) {
        this.method235(var6, var4, 130);
        this.method235(var6 - 1, var4, 8);
        this.method235(var6, var4 + 1, 32);
      }

      if (var1 == 1) {
        this.method235(var6, var4, 10);
        this.method235(var6, var4 + 1, 32);
        this.method235(var6 + 1, var4, 128);
      }

      if (var1 == 2) {
        this.method235(var6, var4, 40);
        this.method235(var6 + 1, var4, 128);
        this.method235(var6, var4 - 1, 2);
      }

      if (var1 == 3) {
        this.method235(var6, var4, 160);
        this.method235(var6, var4 - 1, 2);
        this.method235(var6 - 1, var4, 8);
      }
    }

    if (var3) {
      if (var2 == 0) {
        if (var1 == 0) {
          this.method235(var6, var4, 65536);
          this.method235(var6 - 1, var4, 4096);
        }

        if (var1 == 1) {
          this.method235(var6, var4, 1024);
          this.method235(var6, var4 + 1, 16384);
        }

        if (var1 == 2) {
          this.method235(var6, var4, 4096);
          this.method235(var6 + 1, var4, 65536);
        }

        if (var1 == 3) {
          this.method235(var6, var4, 16384);
          this.method235(var6, var4 - 1, 1024);
        }
      }

      if (var2 == 1 || var2 == 3) {
        if (var1 == 0) {
          this.method235(var6, var4, 512);
          this.method235(var6 - 1, var4 + 1, 8192);
        }

        if (var1 == 1) {
          this.method235(var6, var4, 2048);
          this.method235(var6 + 1, var4 + 1, 32768);
        }

        if (var1 == 2) {
          this.method235(var6, var4, 8192);
          this.method235(var6 + 1, var4 - 1, 512);
        }

        if (var1 == 3) {
          this.method235(var6, var4, 32768);
          this.method235(var6 - 1, var4 - 1, 2048);
        }
      }

      if (var2 == 2) {
        if (var1 == 0) {
          this.method235(var6, var4, 66560);
          this.method235(var6 - 1, var4, 4096);
          this.method235(var6, var4 + 1, 16384);
        }

        if (var1 == 1) {
          this.method235(var6, var4, 5120);
          this.method235(var6, var4 + 1, 16384);
          this.method235(var6 + 1, var4, 65536);
        }

        if (var1 == 2) {
          this.method235(var6, var4, 20480);
          this.method235(var6 + 1, var4, 65536);
          this.method235(var6, var4 - 1, 1024);
        }

        if (var1 == 3) {
          this.method235(var6, var4, 81920);
          this.method235(var6, var4 - 1, 1024);
          this.method235(var6 - 1, var4, 4096);
        }
      }
    }

  }

  public void unmarkHidden(int var1, int var2, int var3) {
    var1 -= this.anInt407;
    var3 -= this.anInt408;
    int[] var10000 = this.anIntArrayArray411[var1];
    var10000[var3] &= 14680063;
  }

  public void removeCollisionArea(int var1, int var2, int var3, int var4, int var5, boolean var6,
      int var7) {
    int var8 = 256;
    if (var6) {
      var8 += 131072;
    }

    var3 -= this.anInt407;
    var4 -= this.anInt408;
    int var9;
    if (var5 == 1 || var5 == 3) {
      var9 = var2;
      var2 = var7;
      var7 = var9;
    }

    for (var9 = var3; var9 < var3 + var2; ++var9) {
      if (var9 >= 0 && var9 < this.anInt409) {
        for (int var10 = var4; var10 < var4 + var7; ++var10) {
          if (var10 >= 0 && var10 < this.anInt410) {
            this.method238(var10, this.anInt401, var8, var9);
          }
        }
      }
    }

  }
}
