import net.runelite.mapping.ObfuscatedSignature;

public class Class4 {
	public static final Class4[] aClass4Array94;
	public static final int[] anIntArray95;
	public static Buffer aBuffer_97;
	public static byte[] aByteArray96;
	public final byte aByte92;
	public int anInt99;
	public final Class6[] aClass6Array98;
	public int anInt91;
	public int anInt100;

	static {
		aClass4Array94 = new Class4[1000];
		anIntArray95 = new int[1000];
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-46900"
	)
	public Class4(int var1) {
		this.aByte92 = 5;
		this.aClass6Array98 = new Class6[10];
	}

	public int method180(int var1) {
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < 10; ++var3) {
			if (this.aClass6Array98[var3] != null && this.aClass6Array98[var3].anInt184 + this.aClass6Array98[var3].anInt185 > var2) {
				var2 = this.aClass6Array98[var3].anInt184 + this.aClass6Array98[var3].anInt185;
			}
		}

		if (var2 == 0) {
			return 0;
		} else {
			var3 = var2 * 22050 / 1000;
			int var4 = this.anInt99 * 22050 / 1000;
			int var5 = this.anInt100 * 22050 / 1000;
			if (var4 < 0 || var5 < 0 || var5 > var3 || var4 >= var5) {
				var1 = 0;
			}

			int var6 = (var5 - var4) * (var1 - 1) + var3;

			int var7;
			for (var7 = 44; var7 < var6 + 44; ++var7) {
				aByteArray96[var7] = -128;
			}

			int var8;
			int var9;
			for (var7 = 0; var7 < 10; ++var7) {
				if (this.aClass6Array98[var7] != null) {
					var8 = this.aClass6Array98[var7].anInt184 * 22050 / 1000;
					var9 = this.aClass6Array98[var7].anInt185 * 22050 / 1000;
					int[] var10 = this.aClass6Array98[var7].method188(var8, this.aClass6Array98[var7].anInt184);

					for (int var11 = 0; var11 < var8; ++var11) {
						byte[] var10000 = aByteArray96;
						var10000[var11 + var9 + 44] += (byte)(var10[var11] >> 8);
					}
				}
			}

			if (var1 > 1) {
				var4 += 44;
				var5 += 44;
				var3 += 44;
				var6 += 44;
				var7 = var6 - var3;
				if (var3 - var5 >= 0) {
					System.arraycopy(aByteArray96, var5, aByteArray96, var5 + var7, var3 - var5);
				}

				for (var8 = 1; var8 < var1; ++var8) {
					var9 = var8 * (var5 - var4);
					if (var5 - var4 >= 0) {
						System.arraycopy(aByteArray96, var4, aByteArray96, var4 + var9, var5 - var4);
					}
				}

				var6 -= 44;
			}

			return var6;
		}
	}

	public Buffer method179(int var1, byte var2) {
		int var3 = this.method180(var1);
		aBuffer_97.anInt1374 = 0;
		aBuffer_97.put4(1380533830);
		aBuffer_97.put4LE(true, var3 + 36);
		aBuffer_97.put4(1463899717);
		aBuffer_97.put4(1718449184);
		aBuffer_97.put4LE(true, 16);
		aBuffer_97.put2LE(false, 1);
		aBuffer_97.put2LE(false, 1);
		aBuffer_97.put4LE(true, 22050);
		aBuffer_97.put4LE(true, 22050);
		aBuffer_97.put2LE(false, 1);
		aBuffer_97.put2LE(false, 8);
		aBuffer_97.put4(1684108385);
		aBuffer_97.put4LE(true, var3);
		if (var2 != this.aByte92) {
			throw new NullPointerException();
		} else {
			Buffer var10000 = aBuffer_97;
			var10000.anInt1374 += var3;
			return aBuffer_97;
		}
	}

	public void method177(byte var1, Buffer var2) {
		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var2.get1();
			if (var4 != 0) {
				--var2.anInt1374;
				this.aClass6Array98[var3] = new Class6();
				this.aClass6Array98[var3].method190((byte)2, var2);
			}
		}

		if (var1 == 2) {
			boolean var5 = false;
		} else {
			this.anInt91 = -185;
		}

		this.anInt99 = var2.get2();
		this.anInt100 = var2.get2();
	}

	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "788"
	)
	public int method178() {
		int var1 = 9999999;

		int var2;
		for (var2 = 0; var2 < 10; ++var2) {
			if (this.aClass6Array98[var2] != null && this.aClass6Array98[var2].anInt185 / 20 < var1) {
				var1 = this.aClass6Array98[var2].anInt185 / 20;
			}
		}

		if (this.anInt99 < this.anInt100 && this.anInt99 / 20 < var1) {
			var1 = this.anInt99 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (var2 = 0; var2 < 10; ++var2) {
				if (this.aClass6Array98[var2] != null) {
					Class6 var10000 = this.aClass6Array98[var2];
					var10000.anInt185 -= var1 * 20;
				}
			}

			if (this.anInt99 < this.anInt100) {
				this.anInt99 -= var1 * 20;
				this.anInt100 -= var1 * 20;
			}

			return var1;
		} else {
			return 0;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(IIB)LClass44_Sub3_Sub2;",
		garbageValue = "5"
	)
	public static Buffer method176(int var0, int var1) {
		if (aClass4Array94[var0] != null) {
			Class4 var2 = aClass4Array94[var0];
			return var2.method179(var1, (byte)5);
		} else {
			return null;
		}
	}

	public static void method175(boolean var0, Buffer var1) {
		aByteArray96 = new byte[441000];
		aBuffer_97 = new Buffer(aByteArray96, (byte)1);
		Class6.method187();

		while (true) {
			int var2 = var1.get2();
			if (var2 == 65535) {
				return;
			}

			aClass4Array94[var2] = new Class4(-46900);
			aClass4Array94[var2].method177((byte)2, var1);
			anIntArray95[var2] = aClass4Array94[var2].method178();
		}
	}
}
