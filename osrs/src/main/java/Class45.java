import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedSignature;

public class Class45 {

  public static final byte[] aByteArray767;
  public boolean aBoolean764;
  public final RandomAccessFile aRandomAccessFile769;
  public final RandomAccessFile aRandomAccessFile768;
  public final int anInt765;
  public int anInt766;
  public int anInt771;
  public final int anInt770;

  static {
    aByteArray767 = new byte[520];
  }

  public Class45(RandomAccessFile var1, int var2, RandomAccessFile var3, int var4, int var5) {
    this.aBoolean764 = true;
    this.anInt765 = 29615;
    this.anInt766 = 7228;
    this.anInt771 = 65000;
    this.anInt770 = var4;
    this.aRandomAccessFile768 = var1;
    if (var2 != this.anInt765) {
      for (int var6 = 1; var6 > 0; ++var6) {
      }
    }

    this.aRandomAccessFile769 = var3;
    this.anInt771 = var5;
  }

  @ObfuscatedSignature(
      descriptor = "(Z[BIIB)Z",
      garbageValue = "-48"
  )
  public synchronized boolean method540(boolean var1, byte[] var2, int var3, int var4) {
    try {
      int var5;
      int var6;
      int var7;
      if (!var1) {
        var5 = (int) ((this.aRandomAccessFile768.length() + 519L) / 520L);
        if (var5 == 0) {
          var5 = 1;
        }
      } else {
        this.method541(var3 * 6, false, this.aRandomAccessFile769);
        var7 = 0;

        while (true) {
          if (var7 >= 6) {
            var5 = (aByteArray767[5] & 255) + ((aByteArray767[3] & 255) << 16) + (
                (aByteArray767[4] & 255) << 8);
            if (var5 <= 0 || (long) var5 > this.aRandomAccessFile768.length() / 520L) {
              return false;
            }
            break;
          }

          var6 = this.aRandomAccessFile769.read(aByteArray767, var7, 6 - var7);
          if (var6 == -1) {
            return false;
          }

          var7 += var6;
        }
      }

      aByteArray767[0] = (byte) (var4 >> 16);
      aByteArray767[1] = (byte) (var4 >> 8);
      aByteArray767[2] = (byte) var4;
      aByteArray767[3] = (byte) (var5 >> 16);
      aByteArray767[4] = (byte) (var5 >> 8);
      aByteArray767[5] = (byte) var5;
      this.method541(var3 * 6, false, this.aRandomAccessFile769);
      this.aRandomAccessFile769.write(aByteArray767, 0, 6);
      var6 = 0;

      for (var7 = 0; var6 < var4; ++var7) {
        int var8 = 0;
        int var9;
        if (var1) {
          this.method541(var5 * 520, false, this.aRandomAccessFile768);

          int var10;
          for (var9 = 0; var9 < 8; var9 += var10) {
            var10 = this.aRandomAccessFile768.read(aByteArray767, var9, 8 - var9);
            if (var10 == -1) {
              break;
            }
          }

          if (var9 == 8) {
            label120:
            {
              int var11 = (aByteArray767[1] & 255) + ((aByteArray767[0] & 255) << 8);
              int var12 = (aByteArray767[3] & 255) + ((aByteArray767[2] & 255) << 8);
              var8 = ((aByteArray767[5] & 255) << 8) + ((aByteArray767[4] & 255) << 16) + (
                  aByteArray767[6] & 255);
              int var13 = aByteArray767[7] & 255;
              if (var3 == var11 && var12 == var7 && var13 == this.anInt770) {
                if (var8 >= 0 && (long) var8 <= this.aRandomAccessFile768.length() / 520L) {
                  break label120;
                }

                return false;
              }

              return false;
            }
          }
        }

        if (var8 == 0) {
          var1 = false;
          var8 = (int) ((this.aRandomAccessFile768.length() + 519L) / 520L);
          if (var8 == 0) {
            ++var8;
          }

          if (var8 == var5) {
            ++var8;
          }
        }

        if (var4 - var6 <= 512) {
          var8 = 0;
        }

        aByteArray767[0] = (byte) (var3 >> 8);
        aByteArray767[1] = (byte) var3;
        aByteArray767[2] = (byte) (var7 >> 8);
        aByteArray767[3] = (byte) var7;
        aByteArray767[4] = (byte) (var8 >> 16);
        aByteArray767[5] = (byte) (var8 >> 8);
        aByteArray767[6] = (byte) var8;
        aByteArray767[7] = (byte) this.anInt770;
        this.method541(var5 * 520, false, this.aRandomAccessFile768);
        this.aRandomAccessFile768.write(aByteArray767, 0, 8);
        var9 = var4 - var6;
        if (var9 > 512) {
          var9 = 512;
        }

        this.aRandomAccessFile768.write(var2, var6, var9);
        var6 += var9;
        var5 = var8;
      }

      return true;
    } catch (IOException var14) {
      return false;
    }
  }

  public synchronized void method541(int var1, boolean var2, RandomAccessFile var3)
      throws IOException {
    if (var1 < 0 || var1 > 62914560) {
      System.out.println("Badseek - pos:" + var1 + " len:" + var3.length());
      var1 = 62914560;

      try {
        Thread.sleep(1000L);
      } catch (Exception var5) {
        //ignore
      }
    }

    var3.seek(var1);
  }

  public synchronized byte[] method538(byte var1, int var2) {
    if (var1 == 2) {
      boolean var18 = false;

      try {
        this.method541(var2 * 6, false, this.aRandomAccessFile769);

        int var3;
        int var4;
        for (var4 = 0; var4 < 6; var4 += var3) {
          var3 = this.aRandomAccessFile769.read(aByteArray767, var4, 6 - var4);
          if (var3 == -1) {
            return null;
          }
        }

        var4 =
            ((aByteArray767[0] & 255) << 16) + (aByteArray767[2] & 255) + ((aByteArray767[1] & 255)
                << 8);
        int var5 =
            (aByteArray767[5] & 255) + ((aByteArray767[3] & 255) << 16) + ((aByteArray767[4] & 255)
                << 8);
        if (var4 >= 0 && var4 <= this.anInt771) {
          if (var5 > 0 && (long) var5 <= this.aRandomAccessFile768.length() / 520L) {
            byte[] var6 = new byte[var4];
            int var7 = 0;
            int var8 = 0;

            while (var7 < var4) {
              if (var5 == 0) {
                return null;
              }

              this.method541(var5 * 520, false, this.aRandomAccessFile768);
              int var9 = 0;
              int var10 = var4 - var7;
              if (var10 > 512) {
                var10 = 512;
              }

              while (var9 < var10 + 8) {
                int var11 = this.aRandomAccessFile768.read(aByteArray767, var9, var10 + 8 - var9);
                if (var11 == -1) {
                  return null;
                }

                var9 += var11;
              }

              int var12 = (aByteArray767[1] & 255) + ((aByteArray767[0] & 255) << 8);
              int var13 = (aByteArray767[3] & 255) + ((aByteArray767[2] & 255) << 8);
              int var14 = ((aByteArray767[5] & 255) << 8) + ((aByteArray767[4] & 255) << 16) + (
                  aByteArray767[6] & 255);
              int var15 = aByteArray767[7] & 255;
              if (var12 == var2 && var13 == var8 && var15 == this.anInt770) {
                if (var14 >= 0 && (long) var14 <= this.aRandomAccessFile768.length() / 520L) {
                  for (int var16 = 0; var16 < var10; ++var16) {
                    var6[var7++] = aByteArray767[var16 + 8];
                  }

                  var5 = var14;
                  ++var8;
                  continue;
                }

                return null;
              }

              return null;
            }

            return var6;
          } else {
            return null;
          }
        } else {
          return null;
        }
      } catch (IOException var17) {
        return null;
      }
    } else {
      throw new NullPointerException();
    }
  }

  public synchronized void method539(int var1, int var2, byte[] var3, byte var4) {
    if (var4 == 8) {
      boolean var6 = false;
      boolean var5 = this.method540(true, var3, var2, var1);
      if (!var5) {
        this.method540(false, var3, var2, var1);
      }

    } else {
      throw new NullPointerException();
    }
  }
}
