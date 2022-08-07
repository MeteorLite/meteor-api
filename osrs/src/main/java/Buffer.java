import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedSignature;

public class Buffer extends DualNode {

  public static final int[] anIntArray1377;
  public static final Tile aClass28_1382;
  public static final Tile aClass28_1383;
  public static final Tile aClass28_1384;
  public static final int[] anIntArray1376;
  public static int anInt1379;
  public static int anInt1380;
  public static int anInt1381;
  public int anInt1375;
  public byte[] array;
  public int offset;
  public Class46 aClass46_1378;
  public int anInt1363;
  public char[] aCharArray1385;
  public boolean aBoolean1362;
  public int anInt1364;
  public int anInt1365;
  public boolean aBoolean1366;
  public int anInt1367;
  public boolean aBoolean1368;
  public boolean aBoolean1369;
  public boolean aBoolean1370;
  public boolean aBoolean1371;
  public int anInt1372;

  static {
    anIntArray1377 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383,
        32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215,
        33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
    aClass28_1382 = new Tile(-822);
    aClass28_1383 = new Tile(-822);
    aClass28_1384 = new Tile(-822);
    anIntArray1376 = new int[256];

    for (int var0 = 0; var0 < 256; ++var0) {
      int var1 = var0;

      for (int var2 = 0; var2 < 8; ++var2) {
        if ((var1 & 1) == 1) {
          var1 = var1 >>> 1 ^ -306674912;
        } else {
          var1 >>>= 1;
        }
      }

      anIntArray1376[var0] = var1;
    }

  }

  @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "1"
  )
  public Buffer(byte[] var1, byte var2) {
    this.aCharArray1385 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    this.aBoolean1362 = true;
    this.anInt1363 = 9;
    this.anInt1364 = -442;
    this.anInt1365 = -41441;
    this.aBoolean1366 = true;
    this.anInt1367 = 368;
    this.aBoolean1368 = true;
    this.aBoolean1369 = true;
    this.aBoolean1370 = false;
    this.aBoolean1371 = false;
    this.anInt1372 = -186;
    this.array = var1;
    this.offset = 0;
  }

  @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "3"
  )
  public Buffer(byte var1) {
    this.aCharArray1385 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
        'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    this.aBoolean1362 = true;
    this.anInt1363 = 9;
    this.anInt1364 = -442;
    this.anInt1365 = -41441;
    this.aBoolean1366 = true;
    this.anInt1367 = 368;
    this.aBoolean1368 = true;
    this.aBoolean1369 = true;
    this.aBoolean1370 = false;
    this.aBoolean1371 = false;
    this.anInt1372 = -186;
  }

  @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-96"
  )
  public int readBit(int var1, byte var2) {
    int var3 = this.anInt1375 >> 3;
    int var4 = 8 - (this.anInt1375 & 7);
    int var5 = 0;

    for (this.anInt1375 += var1; var1 > var4; var4 = 8) {
      var5 += (this.array[var3++] & anIntArray1377[var4]) << var1 - var4;
      var1 -= var4;
    }

    if (var4 == var1) {
      var5 += this.array[var3] & anIntArray1377[var4];
    } else {
      var5 += this.array[var3] >> var4 - var1 & anIntArray1377[var1];
    }

    return var5;
  }

  //1
  public int readUByte() {
    return this.array[this.offset++] & 255;
  }

  //1
  public byte readByte() {
    return this.array[this.offset++];
  }

  //2
  public int readUShort() {
    this.offset += 2;
    return (this.array[this.offset - 1] & 255)
        + ((this.array[this.offset - 2] & 255) << 8);
  }

  //2
  public int readShort() {
    this.offset += 2;
    int var1 = (this.array[this.offset - 1] & 255)
        + ((this.array[this.offset - 2] & 255) << 8);
    if (var1 > 32767) {
      var1 -= 65536;
    }

    return var1;
  }

  //3
  public int readMedium() {
    this.offset += 3;
    return ((this.array[this.offset - 3] & 255) << 16)
        + (this.array[this.offset - 1] & 255)
        + ((this.array[this.offset - 2] & 255) << 8);
  }

  //4
  public int readInt() {
    this.offset += 4;
    return ((this.array[this.offset - 3] & 255) << 16)
        + (this.array[this.offset - 1] & 255)
        + ((this.array[this.offset - 2] & 255) << 8)
        + ((this.array[this.offset - 4] & 255) << 24);
  }

  //8
  @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "0"
  )
  public long readLong(int var1) {
    long var2 = (long) this.readInt() & 4294967295L;
    long var4 = (long) this.readInt() & 4294967295L;
    return (var2 << 32) + var4;
  }

  //Variable
  public int readUShortSmart() {
    int var1 = this.array[this.offset] & 255;
    return var1 < 128 ? this.readUByte() : this.readUShort() - 32768;
  }

  //Variable
  public int readShortSmart() {
    int var1 = this.array[this.offset] & 255;
    return var1 < 128 ? this.readUByte() - 64 : this.readUShort() - 49152;
  }

  //Variable
  public String readString() {
    int var1 = this.offset;

    while (this.array[this.offset++] != 10) {
    }

    return new String(this.array, var1, this.offset - var1 - 1);
  }

  //Variable
  public byte[] readStringArray(int var1) {
    int var2 = this.offset;

    while (this.array[this.offset++] != 10) {
    }

    byte[] var3 = new byte[this.offset - var2 - 1];
    if (var1 != -32952) {
      this.anInt1363 = 127;
    }

    if (this.offset - 1 - var2 >= 0) {
      System.arraycopy(this.array, var2, var3, 0, this.offset - 1 - var2);
    }

    return var3;
  }

  //Variable
  @ObfuscatedSignature(
      descriptor = "(I[BII)V",
      garbageValue = "0"
  )
  public void readArray(int var1, byte[] var2, int var3, int var4) {
    for (int var5 = var3; var5 < var3 + var1; ++var5) {
      var2[var5] = this.array[this.offset++];
    }
  }

  //1
  public void writeOpcode(int var1) {
    this.array[this.offset++] = (byte) (var1 + this.aClass46_1378.method542());
  }

  //1
  public void writeSize(int var1, int var2) {
    if (var2 == 0) {
      this.array[this.offset - var1 - 1] = (byte) var1;
    }
  }

  //1
  public void writeByte(int var1) {
    this.array[this.offset++] = (byte) var1;
  }

  //2
  public void writeShort(int var1) {
    this.array[this.offset++] = (byte) (var1 >> 8);
    this.array[this.offset++] = (byte) var1;
  }

  //2
  public void writeShortLE(boolean var1, int var2) {
    this.array[this.offset++] = (byte) var2;
    this.array[this.offset++] = (byte) (var2 >> 8);
  }

  //3
  public void writeMedium(int var1) {
    this.array[this.offset++] = (byte) (var1 >> 16);
    this.array[this.offset++] = (byte) (var1 >> 8);
    this.array[this.offset++] = (byte) var1;
  }

  //4
  public void writeInt(int var1) {
    this.array[this.offset++] = (byte) (var1 >> 24);
    this.array[this.offset++] = (byte) (var1 >> 16);
    this.array[this.offset++] = (byte) (var1 >> 8);
    this.array[this.offset++] = (byte) var1;
  }

  //4
  public void writeIntME(boolean var1, int var2) {
    this.array[this.offset++] = (byte) var2;
    this.array[this.offset++] = (byte) (var2 >> 8);
    this.array[this.offset++] = (byte) (var2 >> 16);
    this.array[this.offset++] = (byte) (var2 >> 24);
  }

  //4
  @ObfuscatedSignature(
      descriptor = "(JI)V",
      garbageValue = "0"
  )
  public void writeLong(long var1, int var3) {
    this.array[this.offset++] = (byte) ((int) (var1 >> 56));
    this.array[this.offset++] = (byte) ((int) (var1 >> 48));
    this.array[this.offset++] = (byte) ((int) (var1 >> 40));
    this.array[this.offset++] = (byte) ((int) (var1 >> 32));
    this.array[this.offset++] = (byte) ((int) (var1 >> 24));
    this.array[this.offset++] = (byte) ((int) (var1 >> 16));
    this.array[this.offset++] = (byte) ((int) (var1 >> 8));
    this.array[this.offset++] = (byte) ((int) var1);
  }

  //Variable
  public void writeArray(byte[] var1, boolean var2, int var3, int var4) {
    for (int var5 = var3; var5 < var3 + var4; ++var5) {
      this.array[this.offset++] = var1[var5];
    }
  }

  //Variable
  public void writeString(String var1) {
    var1.getBytes(0, var1.length(), this.array, this.offset);
    this.offset += var1.length();
    this.array[this.offset++] = 10;
  }

  @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "4"
  )
  public void accessBits(byte var1) {
    this.anInt1375 = this.offset * 8;
  }


  public void accessBytes(int var1) {
    this.offset = (this.anInt1375 + 7) / 8;
    var1 = 88 / var1;
  }

  @ObfuscatedSignature(
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "4"
  )
  public void rsa(BigInteger var1, BigInteger var2) {
    int var3 = this.offset;
    this.offset = 0;
    byte[] var4 = new byte[var3];
    this.readArray(var3, var4, 0, 0);
    BigInteger var5 = new BigInteger(var4);
    BigInteger var6 = var5.modPow(var2, var1);
    byte[] var7 = var6.toByteArray();
    this.offset = 0;
    this.writeByte(var7.length);
    this.writeArray(var7, false, 0, var7.length);
  }

  public static Buffer createBuffer(int var0, int sizeType) {
    synchronized (aClass28_1383) {
      Buffer var3 = null;
      if (sizeType == 0 && anInt1379 > 0) {
        --anInt1379;
        var3 = (Buffer) aClass28_1382.method258();
      } else if (sizeType == 1 && anInt1380 > 0) {
        --anInt1380;
        var3 = (Buffer) aClass28_1383.method258();
      } else if (sizeType == 2 && anInt1381 > 0) {
        --anInt1381;
        var3 = (Buffer) aClass28_1384.method258();
      }

      if (var3 != null) {
        var3.offset = 0;
        return var3;
      }
    }

    Buffer var2 = new Buffer((byte) 3);
    var2.offset = 0;
    var2.array = new byte[40000];

    return var2;
  }
}
