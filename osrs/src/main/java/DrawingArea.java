import net.runelite.mapping.ObfuscatedSignature;

public class DrawingArea extends Class44_Sub3 {
	public static boolean aBoolean1348;
	public static int[] anIntArray1351;
	public static int anInt1352;
	public static int anInt1350;
	public static int anInt1353;
	public static int anInt1354;
	public static int anInt1356;
	public static int anInt1355;
	public static int anInt1357;
	public static int anInt1359;
	public static int anInt1360;
	public static int anInt1358;
	public static int anInt1349;

	static {
		aBoolean1348 = true;
		anInt1350 = 436;
	}

	@ObfuscatedSignature(
		descriptor = "(II[II)V",
		garbageValue = "9"
	)
	public static void initDrawingArea(int var0, int var1, int[] var2, int var3) {
		anIntArray1351 = var2;
		anInt1352 = var0;
		anInt1353 = var1;
		method408(5, var1, var0, 0, 0);
	}

	public static void method411(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var3 < anInt1356) {
			var2 -= anInt1356 - var3;
			var3 = anInt1356;
		}

		if (var5 < anInt1354) {
			var0 -= anInt1354 - var5;
			var5 = anInt1354;
		}

		if (var3 + var2 > anInt1357) {
			var2 = anInt1357 - var3;
		}

		if (var5 + var0 > anInt1355) {
			var0 = anInt1355 - var5;
		}

		int var6 = anInt1352 - var2;
		int var7 = var3 + var5 * anInt1352;

		for (int var8 = -var0; var8 < 0; ++var8) {
			for (int var9 = -var2; var9 < 0; ++var9) {
				anIntArray1351[var7++] = var1;
			}

			var7 += var6;
		}

	}

	public static void method408(int var0, int var1, int var2, int var3, int var4) {
		if (var3 < 0) {
			var3 = 0;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		if (var2 > anInt1352) {
			var2 = anInt1352;
		}

		if (var1 > anInt1353) {
			var1 = anInt1353;
		}

		anInt1356 = var3;
		anInt1354 = var4;
		anInt1357 = var2;
		anInt1355 = var1;
		anInt1358 = anInt1357 - 1;
		anInt1359 = anInt1357 / 2;
		anInt1360 = anInt1355 / 2;
	}

	public static void method414(int var0, int var1, int var2, byte var3, int var4) {
		if (var4 >= anInt1354 && var4 < anInt1355) {
			if (var2 < anInt1356) {
				var0 -= anInt1356 - var2;
				var2 = anInt1356;
			}

			if (var0 + var2 > anInt1357) {
				var0 = anInt1357 - var2;
			}

			int var5 = var2 + var4 * anInt1352;

			for (int var6 = 0; var6 < var0; ++var6) {
				anIntArray1351[var5 + var6] = var1;
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "394"
	)
	public static void method412(int var0, int var1, int var2, int var3, int var4) {
		method414(var0, var1, var3, (byte)125, var4);
		method414(var0, var1, var3, (byte)125, var2 + var4 - 1);
		method416(var1, var2, var3, 384, var4);
		method416(var1, var2, var3 + var0 - 1, 384, var4);
	}

	public static void method416(int var0, int var1, int var2, int var3, int var4) {
		if (var2 >= anInt1356 && var2 < anInt1357) {
			if (var4 < anInt1354) {
				var1 -= anInt1354 - var4;
				var4 = anInt1354;
			}

			if (var4 + var1 > anInt1355) {
				var1 = anInt1355 - var4;
			}

			int var5 = var2 + var4 * anInt1352;
			var3 = 23 / var3;

			for (int var6 = 0; var6 < var1; ++var6) {
				anIntArray1351[var5 + var6 * anInt1352] = var0;
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public static void method407() {
		anInt1356 = 0;
		anInt1354 = 0;
		anInt1357 = anInt1352;
		anInt1355 = anInt1353;
		anInt1358 = anInt1357 - 1;
		anInt1359 = anInt1357 / 2;
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "8"
	)
	public static void method409() {
		int var0 = anInt1352 * anInt1353;

		for (int var1 = 0; var1 < var0; ++var1) {
			anIntArray1351[var1] = 0;
		}

	}

	public static void method410(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var4 < anInt1356) {
			var0 -= anInt1356 - var4;
			var4 = anInt1356;
		}

		if (var2 < anInt1354) {
			var1 -= anInt1354 - var2;
			var2 = anInt1354;
		}

		if (var0 + var4 > anInt1357) {
			var0 = anInt1357 - var4;
		}

		if (var2 + var1 > anInt1355) {
			var1 = anInt1355 - var2;
		}

		int var7 = 256 - var6;
		int var8 = (var3 >> 16 & 255) * var6;
		int var9 = (var3 >> 8 & 255) * var6;
		int var10 = (var3 & 255) * var6;
		int var11 = anInt1352 - var0;
		int var12 = var4 + var2 * anInt1352;

		for (int var13 = 0; var13 < var1; ++var13) {
			for (int var14 = -var0; var14 < 0; ++var14) {
				int var15 = var7 * (anIntArray1351[var12] >> 16 & 255);
				int var16 = (anIntArray1351[var12] >> 8 & 255) * var7;
				int var17 = var7 * (anIntArray1351[var12] & 255);
				int var18 = (var10 + var17 >> 8) + (var8 + var15 >> 8 << 16) + (var9 + var16 >> 8 << 8);
				anIntArray1351[var12++] = var18;
			}

			var12 += var11;
		}

	}

	public static void method413(int var0, boolean var1, int var2, int var3, int var4, int var5, int var6) {
		method415(var0, var2, var6, var3, anInt1349, var4);
		method415(var0, var5 + var2 - 1, var6, var3, anInt1349, var4);
		if (var5 >= 3) {
			method417(var3, var5 - 2, var2 + 1, true, var4, var6);
			method417(var3 + var0 - 1, var5 - 2, var2 + 1, true, var4, var6);
		}

	}

	public static void method415(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= anInt1354 && var1 < anInt1355) {
			if (var3 < anInt1356) {
				var0 -= anInt1356 - var3;
				var3 = anInt1356;
			}

			if (var3 + var0 > anInt1357) {
				var0 = anInt1357 - var3;
			}

			int var6 = 256 - var2;
			int var7 = (var5 >> 16 & 255) * var2;
			int var8 = var2 * (var5 >> 8 & 255);
			int var9 = (var5 & 255) * var2;
			int var10 = var3 + anInt1352 * var1;

			for (int var11 = 0; var11 < var0; ++var11) {
				int var12 = var6 * (anIntArray1351[var10] >> 16 & 255);
				int var13 = (anIntArray1351[var10] >> 8 & 255) * var6;
				int var14 = var6 * (anIntArray1351[var10] & 255);
				int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
				anIntArray1351[var10++] = var15;
			}

			if (var4 >= 0 && var4 <= 0) {
			}

		}
	}

	public static void method417(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		if (var0 >= anInt1356 && var0 < anInt1357) {
			if (var2 < anInt1354) {
				var1 -= anInt1354 - var2;
				var2 = anInt1354;
			}

			if (var2 + var1 > anInt1355) {
				var1 = anInt1355 - var2;
			}

			int var6 = 256 - var5;
			int var7 = (var4 >> 16 & 255) * var5;
			int var8 = var5 * (var4 >> 8 & 255);
			int var9 = var5 * (var4 & 255);
			int var10 = var0 + var2 * anInt1352;

			for (int var11 = 0; var11 < var1; ++var11) {
				int var12 = var6 * (anIntArray1351[var10] >> 16 & 255);
				int var13 = (anIntArray1351[var10] >> 8 & 255) * var6;
				int var14 = var6 * (anIntArray1351[var10] & 255);
				int var15 = (var9 + var14 >> 8) + (var7 + var12 >> 8 << 16) + (var8 + var13 >> 8 << 8);
				anIntArray1351[var10] = var15;
				var10 += anInt1352;
			}

		}
	}
}
