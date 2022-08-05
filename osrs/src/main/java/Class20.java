import net.runelite.mapping.ObfuscatedSignature;

public class Class20 {
	public static Class20[] aClass20Array423;
	public static int anInt422;
	public boolean aBoolean420;
	public final int anInt421;
	public int anInt425;
	public boolean aBoolean426;
	public int anInt424;
	public boolean aBoolean427;
	public String aString428;
	public int anInt429;
	public int anInt430;
	public int anInt431;
	public int anInt433;
	public int anInt432;
	public int anInt434;

	public Class20() {
		this.aBoolean420 = true;
		this.anInt421 = -186;
		this.anInt425 = -1;
		this.aBoolean426 = false;
		this.aBoolean427 = true;
	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-186"
	)
	public void method245(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D;
		double var4 = (double)(var1 >> 8 & 255) / 256.0D;
		double var6 = (double)(var1 & 255) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var10 + var8);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8);
			}
		}

		var12 /= 6.0D;
		this.anInt429 = (int)(var12 * 256.0D);
		this.anInt430 = (int)(var14 * 256.0D);
		this.anInt431 = (int)(var16 * 256.0D);
		if (this.anInt430 < 0) {
			this.anInt430 = 0;
		} else if (this.anInt430 > 255) {
			this.anInt430 = 255;
		}

		if (this.anInt431 < 0) {
			this.anInt431 = 0;
		} else if (this.anInt431 > 255) {
			this.anInt431 = 255;
		}

		if (var16 > 0.5D) {
			this.anInt433 = (int)((1.0D - var16) * var14 * 512.0D);
		} else {
			this.anInt433 = (int)(var16 * var14 * 512.0D);
		}

		if (this.anInt433 < 1) {
			this.anInt433 = 1;
		}

		this.anInt432 = (int)(var12 * (double)this.anInt433);
		int var18 = this.anInt429 + (int)(Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = this.anInt430 + (int)(Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = this.anInt431 + (int)(Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		this.anInt434 = this.method246(var18, var19, var20);
	}

	public int method246(int var1, int var2, int var3) {
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

	public void method244(byte var1, Buffer var2) {
		while (true) {
			int var3 = var2.readUByte();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				this.anInt424 = var2.readMedium();
				this.method245(this.anInt424);
			} else if (var3 == 2) {
				this.anInt425 = var2.readUByte();
			} else if (var3 == 3) {
				this.aBoolean426 = true;
			} else if (var3 == 5) {
				this.aBoolean427 = false;
			} else if (var3 == 6) {
				this.aString428 = var2.readString();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}

	public static void method243(boolean var0, Class47 var1) {
		Buffer var2 = new Buffer(var1.method546("flo.dat", (byte[])null), (byte)1);
		anInt422 = var2.readUShort();
		if (aClass20Array423 == null) {
			aClass20Array423 = new Class20[anInt422];
		}

		for (int var3 = 0; var3 < anInt422; ++var3) {
			if (aClass20Array423[var3] == null) {
				aClass20Array423[var3] = new Class20();
			}

			aClass20Array423[var3].method244((byte)2, var2);
		}

	}
}
