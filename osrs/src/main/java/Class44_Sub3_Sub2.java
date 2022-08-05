import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub2 extends Class44_Sub3 {
	public static final int[] anIntArray1377;
	public static final Class28 aClass28_1382;
	public static final Class28 aClass28_1383;
	public static final Class28 aClass28_1384;
	public static final int[] anIntArray1376;
	public static int anInt1379;
	public static int anInt1380;
	public static int anInt1381;
	public int anInt1375;
	public byte[] aByteArray1373;
	public int anInt1374;
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
		anIntArray1377 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
		aClass28_1382 = new Class28(-822);
		aClass28_1383 = new Class28(-822);
		aClass28_1384 = new Class28(-822);
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
	public Class44_Sub3_Sub2(byte[] var1, byte var2) {
		this.aCharArray1385 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
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
		this.aByteArray1373 = var1;
		this.anInt1374 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public Class44_Sub3_Sub2(byte var1) {
		this.aCharArray1385 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
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
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public void accessBits(byte var1) {
		this.anInt1375 = this.anInt1374 * 8;
	}

	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-96"
	)
	public int getBit(int var1, byte var2) {
		int var3 = this.anInt1375 >> 3;
		int var4 = 8 - (this.anInt1375 & 7);
		int var5 = 0;

		for (this.anInt1375 += var1; var1 > var4; var4 = 8) {
			var5 += (this.aByteArray1373[var3++] & anIntArray1377[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += this.aByteArray1373[var3] & anIntArray1377[var4];
		} else {
			var5 += this.aByteArray1373[var3] >> var4 - var1 & anIntArray1377[var1];
		}

		return var5;
	}

	public int get4() {
		this.anInt1374 += 4;
		return ((this.aByteArray1373[this.anInt1374 - 3] & 255) << 16) + (this.aByteArray1373[this.anInt1374 - 1] & 255) + ((this.aByteArray1373[this.anInt1374 - 2] & 255) << 8) + ((this.aByteArray1373[this.anInt1374 - 4] & 255) << 24);
	}

	public int get1() {
		return this.aByteArray1373[this.anInt1374++] & 255;
	}

	public void putOpcode(int var1) {
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 + this.aClass46_1378.method542());
	}

	public int method493() {
		int var1 = this.aByteArray1373[this.anInt1374] & 255;
		return var1 < 128 ? this.get1() : this.get2() - 32768;
	}

	public int get3() {
		this.anInt1374 += 3;
		return ((this.aByteArray1373[this.anInt1374 - 3] & 255) << 16) + (this.aByteArray1373[this.anInt1374 - 1] & 255) + ((this.aByteArray1373[this.anInt1374 - 2] & 255) << 8);
	}

	public void put1(int var1) {
		this.aByteArray1373[this.anInt1374++] = (byte)var1;
	}

	public int get2() {
		this.anInt1374 += 2;
		return (this.aByteArray1373[this.anInt1374 - 1] & 255) + ((this.aByteArray1373[this.anInt1374 - 2] & 255) << 8);
	}

	@ObfuscatedSignature(
		descriptor = "(I[BII)V",
		garbageValue = "0"
	)
	public void getArray(int var1, byte[] var2, int var3, int var4) {
		for (int var5 = var3; var5 < var3 + var1; ++var5) {
			var2[var5] = this.aByteArray1373[this.anInt1374++];
		}

	}

	public void accessBytes(int var1) {
		this.anInt1374 = (this.anInt1375 + 7) / 8;
		var1 = 88 / var1;
	}

	public String getString() {
		int var1 = this.anInt1374;

		while (this.aByteArray1373[this.anInt1374++] != 10) {
		}

		return new String(this.aByteArray1373, var1, this.anInt1374 - var1 - 1);
	}

	public void put4(int var1) {
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 >> 24);
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 >> 16);
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 >> 8);
		this.aByteArray1373[this.anInt1374++] = (byte)var1;
	}

	public byte[] getStringArray(int var1) {
		int var2 = this.anInt1374;

		while (this.aByteArray1373[this.anInt1374++] != 10) {
		}

		byte[] var3 = new byte[this.anInt1374 - var2 - 1];
		if (var1 != -32952) {
			this.anInt1363 = 127;
		}

		if (this.anInt1374 - 1 - var2 >= 0) {
			System.arraycopy(this.aByteArray1373, var2, var3, 0, this.anInt1374 - 1 - var2);
		}

		return var3;
	}

	public byte get1Signed() {
		return this.aByteArray1373[this.anInt1374++];
	}

	public void put4LE(boolean var1, int var2) {
		this.aByteArray1373[this.anInt1374++] = (byte)var2;
		this.aByteArray1373[this.anInt1374++] = (byte)(var2 >> 8);
		this.aByteArray1373[this.anInt1374++] = (byte)(var2 >> 16);
		this.aByteArray1373[this.anInt1374++] = (byte)(var2 >> 24);
	}

	public void putArray(byte[] var1, boolean var2, int var3, int var4) {
		for (int var5 = var3; var5 < var3 + var4; ++var5) {
			this.aByteArray1373[this.anInt1374++] = var1[var5];
		}

	}

	public int get2Signed() {
		this.anInt1374 += 2;
		int var1 = (this.aByteArray1373[this.anInt1374 - 1] & 255) + ((this.aByteArray1373[this.anInt1374 - 2] & 255) << 8);
		if (var1 > 32767) {
			var1 -= 65536;
		}

		return var1;
	}

	@ObfuscatedSignature(
		descriptor = "(JI)V",
		garbageValue = "0"
	)
	public void put8(long var1, int var3) {
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 56));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 48));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 40));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 32));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 24));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 16));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)(var1 >> 8));
		this.aByteArray1373[this.anInt1374++] = (byte)((int)var1);
	}

	public void put2LE(boolean var1, int var2) {
		this.aByteArray1373[this.anInt1374++] = (byte)var2;
		this.aByteArray1373[this.anInt1374++] = (byte)(var2 >> 8);
	}

	public void put2(int var1) {
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 >> 8);
		this.aByteArray1373[this.anInt1374++] = (byte)var1;
	}

	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "0"
	)
	public long get8(int var1) {
		long var2 = (long)this.get4() & 4294967295L;
		long var4 = (long)this.get4() & 4294967295L;
		return (var2 << 32) + var4;
	}

	public void putSize(int var1, int var2) {
		if (var2 == 0) {
			this.aByteArray1373[this.anInt1374 - var1 - 1] = (byte)var1;
		}

	}

	public void putString(String var1) {
		var1.getBytes(0, var1.length(), this.aByteArray1373, this.anInt1374);
		this.anInt1374 += var1.length();
		this.aByteArray1373[this.anInt1374++] = 10;
	}

	public void put3(int var1) {
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 >> 16);
		this.aByteArray1373[this.anInt1374++] = (byte)(var1 >> 8);
		this.aByteArray1373[this.anInt1374++] = (byte)var1;
	}

	public int method492() {
		int var1 = this.aByteArray1373[this.anInt1374] & 255;
		return var1 < 128 ? this.get1() - 64 : this.get2() - 49152;
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
		garbageValue = "4"
	)
	public void rsa(BigInteger var1, BigInteger var2) {
		int var3 = this.anInt1374;
		this.anInt1374 = 0;
		byte[] var4 = new byte[var3];
		this.getArray(var3, var4, 0, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(var2, var1);
		byte[] var7 = var6.toByteArray();
		this.anInt1374 = 0;
		this.put1(var7.length);
		this.putArray(var7, false, 0, var7.length);
	}

	public static Class44_Sub3_Sub2 method467(int var0, int var1) {
		synchronized(aClass28_1383) {
			Class44_Sub3_Sub2 var3 = null;
			if (var1 == 0 && anInt1379 > 0) {
				--anInt1379;
				var3 = (Class44_Sub3_Sub2)aClass28_1382.method258();
			} else if (var1 == 1 && anInt1380 > 0) {
				--anInt1380;
				var3 = (Class44_Sub3_Sub2)aClass28_1383.method258();
			} else if (var1 == 2 && anInt1381 > 0) {
				--anInt1381;
				var3 = (Class44_Sub3_Sub2)aClass28_1384.method258();
			}

			if (var3 != null) {
				var3.anInt1374 = 0;
				return var3;
			}
		}

		Class44_Sub3_Sub2 var2 = new Class44_Sub3_Sub2((byte)3);
		var2.anInt1374 = 0;
		if (var1 == 0) {
			var2.aByteArray1373 = new byte[100];
		} else if (var1 == 1) {
			var2.aByteArray1373 = new byte[5000];
		} else {
			var2.aByteArray1373 = new byte[30000];
		}

		return var2;
	}
}
