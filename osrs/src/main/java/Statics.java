import net.runelite.mapping.ObfuscatedSignature;

/*
	This is where we will put static members waiting to be inlined to their proper location
 */

public class Statics extends DualNode {
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

	public static final char[] aCharArray795;
	public static final char[] aCharArray796;

	public static final char[] aCharArray794;
	public static boolean aBoolean788;
	public static int anInt789;
	public static byte aByte791;
	public static int anInt792;
	public static int anInt793;

	static {
		aBoolean1348 = true;
		anInt1350 = 436;
		aCharArray795 = new char[100];
		aCharArray796 = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']'};
		aCharArray794 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		aBoolean788 = true;
		anInt789 = 618;
		aByte791 = 7;
		anInt792 = -407;
		anInt793 = 1;
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


	public static void method555(String var0, byte var1, Buffer var2) {
		if (var0.length() > 80) {
			var0 = var0.substring(0, 80);
		}

		var0 = var0.toLowerCase();
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			int var6 = 0;

			for (int var7 = 0; var7 < aCharArray796.length; ++var7) {
				if (var5 == aCharArray796[var7]) {
					var6 = var7;
					break;
				}
			}

			if (var6 > 12) {
				var6 += 195;
			}

			if (var3 == -1) {
				if (var6 < 13) {
					var3 = var6;
				} else {
					var2.writeByte(var6);
				}
			} else if (var6 < 13) {
				var2.writeByte(var6 + (var3 << 4));
				var3 = -1;
			} else {
				var2.writeByte((var6 >> 4) + (var3 << 4));
				var3 = var6 & 15;
			}
		}

		if (var3 != -1) {
			var2.writeByte(var3 << 4);
		}

	}

	public static String method554(byte var0, int var1, Buffer var2) {
		int var3 = 0;
		int var4 = -1;

		int var6;
		for (int var5 = 0; var5 < var1; ++var5) {
			var6 = var2.readUByte();
			int var7 = var6 >> 4 & 15;
			if (var4 == -1) {
				if (var7 < 13) {
					aCharArray795[var3++] = aCharArray796[var7];
				} else {
					var4 = var7;
				}
			} else {
				aCharArray795[var3++] = aCharArray796[var7 + (var4 << 4) - 195];
				var4 = -1;
			}

			var7 = var6 & 15;
			if (var4 == -1) {
				if (var7 < 13) {
					aCharArray795[var3++] = aCharArray796[var7];
				} else {
					var4 = var7;
				}
			} else {
				aCharArray795[var3++] = aCharArray796[var7 + (var4 << 4) - 195];
				var4 = -1;
			}
		}

		if (var0 != 8) {
			throw new NullPointerException();
		} else {
			boolean var8 = false;
			boolean var9 = true;

			for (var6 = 0; var6 < var3; ++var6) {
				char var10 = aCharArray795[var6];
				if (var9 && var10 >= 'a' && var10 <= 'z') {
					char[] var10000 = aCharArray795;
					var10000[var6] += '￠';
					var9 = false;
				}

				if (var10 == '.' || var10 == '!') {
					var9 = true;
				}
			}

			return new String(aCharArray795, 0, var3);
		}
	}

	public static String method548(int var0, long var1) {
		if (var1 > 0L && var1 < 6582952005840035281L) {
			if (var1 % 37L == 0L) {
				return "invalid_name";
			} else {
				int var3 = 0;

				char[] var4;
				long var5;
				for (var4 = new char[12]; var1 != 0L; var4[11 - var3++] = aCharArray794[(int)(var5 - var1 * 37L)]) {
					var5 = var1;
					var1 /= 37L;
				}

				return new String(var4, 12 - var3, var3);
			}
		} else {
			return "invalid_name";
		}
	}

	public static String method551(int var0, String var1) {
		if (var1.length() > 0) {
			char[] var2 = var1.toCharArray();

			for (int var3 = 0; var3 < var2.length; ++var3) {
				if (var2[var3] == '_') {
					var2[var3] = ' ';
					if (var3 + 1 < var2.length && var2[var3 + 1] >= 'a' && var2[var3 + 1] <= 'z') {
						var2[var3 + 1] = (char)(var2[var3 + 1] + 'A' - 97);
					}
				}
			}

			if (var2[0] >= 'a' && var2[0] <= 'z') {
				var2[0] = (char)(var2[0] + 'A' - 97);
			}

			return new String(var2);
		} else {
			return var1;
		}
	}

	public static long method547(String var0) {
		long var1 = 0L;

		for (int var3 = 0; var3 < var0.length() && var3 < 12; ++var3) {
			char var4 = var0.charAt(var3);
			var1 *= 37L;
			if (var4 >= 'A' && var4 <= 'Z') {
				var1 += (long)(var4 + 1 - 65);
			} else if (var4 >= 'a' && var4 <= 'z') {
				var1 += (long)(var4 + 1 - 97);
			} else if (var4 >= '0' && var4 <= '9') {
				var1 += (long)(var4 + 27 - 48);
			}
		}

		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedSignature(
			descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
			garbageValue = "-407"
	)
	public static String method552(String var0) {
		var0 = var0.toLowerCase();
		char[] var1 = var0.toCharArray();
		int var2 = var1.length;
		boolean var3 = true;

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var1[var4];
			if (var3 && var5 >= 'a' && var5 <= 'z') {
				var1[var4] += '￠';
				var3 = false;
			}

			if (var5 == '.' || var5 == '!') {
				var3 = true;
			}
		}

		return new String(var1);
	}

	@ObfuscatedSignature(
			descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;",
			garbageValue = "0"
	)
	public static String method553(String var0) {
		StringBuilder var1 = new StringBuilder();

		for (int var2 = 0; var2 < var0.length(); ++var2) {
			var1.append("*");
		}

		return var1.toString();
	}

	public static String method550(byte var0, int var1) {
		return (var1 >> 24 & 255) + "." + (var1 >> 16 & 255) + "." + (var1 >> 8 & 255) + "." + (var1 & 255);
	}

	public static long method549(int var0, String var1) {
		var1 = var1.toUpperCase();
		if (var0 < 7 || var0 > 7) {
			aBoolean788 = !aBoolean788;
		}

		long var2 = 0L;

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			var2 = var2 * 61L + (long)var1.charAt(var4) - 32L;
			var2 = var2 + (var2 >> 56) & 72057594037927935L;
		}

		return var2;
	}
}
