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

	public static final String[] aStringArray751;
	public static int anInt733;
	public static boolean aBoolean735;
	public static int anInt742;
	public static int anInt744;
	public static char[][] aCharArrayArray746;
	public static int anInt740;
	public static byte[][][] aByteArrayArrayArray747;
	public static int anInt734;
	public static int[] anIntArray745;
	public static char[][] aCharArrayArray748;
	public static char[][] aCharArrayArray749;
	public static int[] anIntArray750;

	public static final Class40 aClass40_656;

	public static int anInt481;
	public static int anInt482;
	public static int anInt483;
	public static Statics[] aStaticsArray480;

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
		aStringArray751 = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
		anInt733 = -226;
		aBoolean735 = true;
		anInt742 = 5;
		anInt744 = 443;
		aClass40_656 = new Class40();
		anInt481 = -1;
		anInt482 = -1;
		anInt483 = -1;
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


	public static String method352(byte var0, String var1) {
		long var2 = System.currentTimeMillis();
		char[] var4 = var1.toCharArray();
		method350(var4);
		String var5 = (new String(var4)).trim();
		var4 = var5.toLowerCase().toCharArray();
		String var6 = var5.toLowerCase();
		method355(var4, (byte)6);
		method369(var4);
		String[] var7 = aStringArray751;
		int var8 = var7.length;

		for (int var9 = 0; var9 < var8; ++var9) {
			String var10 = var7[var9];
			int var11 = -1;

			while ((var11 = var6.indexOf(var10, var11 + 1)) != -1) {
				char[] var12 = var10.toCharArray();
				System.arraycopy(var12, 0, var4, var11, var12.length);
			}
		}

		method353(var4, var5.toCharArray());
		method354((byte)7, var4);
		long var13 = System.currentTimeMillis();
		return (new String(var4)).trim();
	}

	@ObfuscatedSignature(
			descriptor = "([CI)V",
			garbageValue = "-59"
	)
	public static void method350(char[] var0) {
		int var1 = 0;

		int var2;
		for (var2 = 0; var2 < var0.length; ++var2) {
			if (method351(var0[var2])) {
				var0[var1] = var0[var2];
			} else {
				var0[var1] = ' ';
			}

			if (var1 == 0 || var0[var1] != ' ' || var0[var1 - 1] != ' ') {
				++var1;
			}
		}

		for (var2 = var1; var2 < var0.length; ++var2) {
			var0[var2] = ' ';
		}

	}

	public static void method355(char[] var0, byte var1) {
		int var2;
		for (var2 = 0; var2 < 2; ++var2) {
			for (int var3 = aCharArrayArray746.length - 1; var3 >= 0; --var3) {
				method364(var0, aCharArrayArray746[var3], 3, aByteArrayArrayArray747[var3]);
			}
		}

		if (var1 == 6) {
			boolean var4 = false;
		} else {
			for (var2 = 1; var2 > 0; ++var2) {
			}

		}
	}

	@ObfuscatedSignature(
			descriptor = "([CI)V",
			garbageValue = "9"
	)
	public static void method369(char[] var0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;

		while (true) {
			int var7;
			do {
				int var8;
				if ((var8 = method370(var0, anInt740, var2)) == -1) {
					return;
				}

				boolean var5 = false;

				int var6;
				for (var6 = var2; var6 >= 0 && var6 < var8 && !var5; ++var6) {
					if (!method372(0, var0[var6]) && !method373(var0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var8;
				}

				var2 = method371(9, var0, var8);
				var6 = 0;

				for (var7 = var8; var7 < var2; ++var7) {
					var6 = var0[var7] + var6 * 10 - 48;
				}

				if (var6 <= 255 && var2 - var8 <= 8) {
					++var3;
				} else {
					var3 = 0;
				}
			} while(var3 != 4);

			for (var7 = var4; var7 < var2; ++var7) {
				var0[var7] = '*';
			}

			var3 = 0;
		}
	}

	@ObfuscatedSignature(
			descriptor = "([C[CI)V",
			garbageValue = "-51"
	)
	public static void method353(char[] var0, char[] var1) {
		for (int var2 = 0; var2 < var1.length; ++var2) {
			if (var0[var2] != '*' && method377(anInt742, var1[var2])) {
				var0[var2] = var1[var2];
			}
		}

	}

	public static void method354(byte var0, char[] var1) {
		boolean var2 = true;
		int var3;
		if (var0 == 7) {
			boolean var5 = false;
		} else {
			for (var3 = 1; var3 > 0; ++var3) {
			}
		}

		for (var3 = 0; var3 < var1.length; ++var3) {
			char var4 = var1[var3];
			if (method374((byte)-17, var4)) {
				if (var2) {
					if (method376(0, var4)) {
						var2 = false;
					}
				} else if (method377(anInt742, var4)) {
					var1[var3] = (char)(var4 + 'a' - 65);
				}
			} else {
				var2 = true;
			}
		}

	}

	@ObfuscatedSignature(
			descriptor = "(CI)Z",
			garbageValue = "0"
	)
	public static boolean method351(char var0) {
		return var0 >= ' ' && var0 <= 127 || var0 == ' ' || var0 == '\n' || var0 == '\t' || var0 == 163 || var0 == 8364;
	}

	public static int method370(char[] var0, int var1, int var2) {
		if (var1 != 0) {
			anInt744 = 256;
		}

		for (int var3 = var2; var3 < var0.length && var3 >= 0; ++var3) {
			if (var0[var3] >= '0' && var0[var3] <= '9') {
				return var3;
			}
		}

		return -1;
	}

	public static void method364(char[] var0, char[] var1, int var2, byte[][] var3) {
		if (var1.length <= var0.length) {
			boolean var4 = true;

			int var5;
			for (int var6 = 0; var6 <= var0.length - var1.length; var6 += var5) {
				int var7 = var6;
				int var8 = 0;
				int var9 = 0;
				var5 = 1;
				boolean var10 = false;
				boolean var11 = false;
				boolean var12 = false;

				boolean var13;
				char var14;
				char var15;
				label178:
				while (true) {
					while (true) {
						if (var7 >= var0.length || var11 && var12) {
							break label178;
						}

						var13 = false;
						var14 = var0[var7];
						var15 = 0;
						if (var7 + 1 < var0.length) {
							var15 = var0[var7 + 1];
						}

						int var21;
						if (var8 < var1.length && (var21 = method367(var14, var15, var1[var8])) > 0) {
							if (var21 == 1 && method375(636, var14)) {
								var11 = true;
							}

							if (var21 == 2 && (method375(636, var14) || method375(636, var15))) {
								var11 = true;
							}

							var7 += var21;
							++var8;
						} else {
							if (var8 == 0) {
								break label178;
							}

							if ((var21 = method367(var14, var15, var1[var8 - 1])) > 0) {
								var7 += var21;
								if (var8 == 1) {
									++var5;
								}
							} else {
								if (var8 >= var1.length || !method373(var14)) {
									break label178;
								}

								if (method372(0, var14) && var14 != '\'') {
									var10 = true;
								}

								if (method375(636, var14)) {
									var12 = true;
								}

								++var7;
								++var9;
								if (var9 * 100 / (var7 - var6) > 90) {
									break label178;
								}
							}
						}
					}
				}

				if (var8 >= var1.length && (!var11 || !var12)) {
					var13 = true;
					int var27;
					if (!var10) {
						var14 = ' ';
						if (var6 - 1 >= 0) {
							var14 = var0[var6 - 1];
						}

						var15 = ' ';
						if (var7 < var0.length) {
							var15 = var0[var7];
						}

						byte var16 = method368(var14, 9);
						byte var17 = method368(var15, 9);
						if (var3 != null && method365(-484, var3, var16, var17)) {
							var13 = false;
						}
					} else {
						boolean var22 = false;
						boolean var26 = false;
						if (var6 - 1 < 0 || method372(0, var0[var6 - 1]) && var0[var6 - 1] != '\'') {
							var22 = true;
						}

						if (var7 >= var0.length || method372(0, var0[var7]) && var0[var7] != '\'') {
							var26 = true;
						}

						if (!var22 || !var26) {
							boolean var23 = false;
							var27 = var6 - 2;
							if (var22) {
								var27 = var6;
							}

							for (; !var23 && var27 < var7; ++var27) {
								if (var27 >= 0 && (!method372(0, var0[var27]) || var0[var27] == '\'')) {
									char[] var18 = new char[3];

									int var19;
									for (var19 = 0; var19 < 3 && var27 + var19 < var0.length && (!method372(0, var0[var27 + var19]) || var0[var27 + var19] == '\''); ++var19) {
										var18[var19] = var0[var27 + var19];
									}

									boolean var20 = var19 != 0;
									if (var19 < 3 && var27 - 1 >= 0 && (!method372(0, var0[var27 - 1]) || var0[var27 - 1] == '\'')) {
										var20 = false;
									}

									if (var20 && !method378(var18)) {
										var23 = true;
									}
								}
							}

							if (!var23) {
								var13 = false;
							}
						}
					}

					if (var13) {
						int var24 = 0;
						int var28 = 0;
						int var25 = -1;

						for (var27 = var6; var27 < var7; ++var27) {
							if (method375(636, var0[var27])) {
								++var24;
							} else if (method374((byte)-17, var0[var27])) {
								++var28;
								var25 = var27;
							}
						}

						if (var25 > -1) {
							var24 -= var7 - 1 - var25;
						}

						if (var24 <= var28) {
							for (var27 = var6; var27 < var7; ++var27) {
								var0[var27] = '*';
							}
						} else {
							var5 = 1;
						}
					}
				}
			}

		}
	}

	public static int method371(int var0, char[] var1, int var2) {
		int var3 = var2;

		while (true) {
			if (var3 < var1.length && var3 >= 0) {
				if (var1[var3] >= '0' && var1[var3] <= '9') {
					++var3;
					continue;
				}

				return var3;
			}

			return var1.length;
		}
	}

	public static boolean method374(byte var0, char var1) {
		return var1 >= 'a' && var1 <= 'z' || var1 >= 'A' && var1 <= 'Z';
	}

	public static boolean method372(int var0, char var1) {
		return !method374((byte)-17, var1) && !method375(636, var1);
	}

	@ObfuscatedSignature(
			descriptor = "(CCCI)I",
			garbageValue = "-726"
	)
	public static int method367(char var0, char var1, char var2) {
		if (var0 == var2) {
			return 1;
		} else {
			if (var2 >= 'a' && var2 <= 'm') {
				if (var2 == 'a') {
					if (var0 != '4' && var0 != '@' && var0 != '^') {
						return var0 == '/' && var1 == '\\' ? 2 : 0;
					}

					return 1;
				}

				if (var2 == 'b') {
					if (var0 != '6' && var0 != '8') {
						return (var0 != '1' || var1 != '3') && (var0 != 'i' || var1 != '3') ? 0 : 2;
					}

					return 1;
				}

				if (var2 == 'c') {
					return var0 != '(' && var0 != '<' && var0 != '{' && var0 != '[' ? 0 : 1;
				}

				if (var2 == 'd') {
					return (var0 != '[' || var1 != ')') && (var0 != 'i' || var1 != ')') ? 0 : 2;
				}

				if (var2 == 'e') {
					return var0 != '3' && var0 != 8364 ? 0 : 1;
				}

				if (var2 == 'f') {
					if (var0 == 'p' && var1 == 'h') {
						return 2;
					}

					return var0 != 163 ? 0 : 1;
				}

				if (var2 == 'g') {
					return var0 != '9' && var0 != '6' && var0 != 'q' ? 0 : 1;
				}

				if (var2 == 'h') {
					return var0 != '#' ? 0 : 1;
				}

				if (var2 == 'i') {
					return var0 != 'y' && var0 != 'l' && var0 != 'j' && var0 != '1' && var0 != '!' && var0 != ':' && var0 != ';' && var0 != '|' ? 0 : 1;
				}

				if (var2 == 'j') {
					return 0;
				}

				if (var2 == 'k') {
					return 0;
				}

				if (var2 == 'l') {
					return var0 != '1' && var0 != '|' && var0 != 'i' ? 0 : 1;
				}

				if (var2 == 'm') {
					return 0;
				}
			}

			if (var2 >= 'n' && var2 <= 'z') {
				if (var2 == 'n') {
					return 0;
				}

				if (var2 == 'o') {
					if (var0 != '0' && var0 != '*') {
						return var0 == '(' && var1 == ')' || var0 == '[' && var1 == ']' || var0 == '{' && var1 == '}' || var0 == '<' && var1 == '>' ? 2 : 0;
					}

					return 1;
				}

				if (var2 == 'p') {
					return 0;
				}

				if (var2 == 'q') {
					return 0;
				}

				if (var2 == 'r') {
					return 0;
				}

				if (var2 == 's') {
					return var0 != '5' && var0 != 'z' && var0 != '$' && var0 != '2' ? 0 : 1;
				}

				if (var2 == 't') {
					return var0 != '7' && var0 != '+' ? 0 : 1;
				}

				if (var2 == 'u') {
					if (var0 == 'v') {
						return 1;
					}

					return (var0 != '\\' || var1 != '/') && (var0 != '\\' || var1 != '|') && (var0 != '|' || var1 != '/') ? 0 : 2;
				}

				if (var2 == 'v') {
					return (var0 != '\\' || var1 != '/') && (var0 != '\\' || var1 != '|') && (var0 != '|' || var1 != '/') ? 0 : 2;
				}

				if (var2 == 'w') {
					return var0 == 'v' && var1 == 'v' ? 2 : 0;
				}

				if (var2 == 'x') {
					return (var0 != ')' || var1 != '(') && (var0 != '}' || var1 != '{') && (var0 != ']' || var1 != '[') && (var0 != '>' || var1 != '<') ? 0 : 2;
				}

				if (var2 == 'y') {
					return 0;
				}

				if (var2 == 'z') {
					return 0;
				}
			}

			if (var2 >= '0' && var2 <= '9') {
				if (var2 != '0') {
					if (var2 == '1') {
						return var0 != 'l' ? 0 : 1;
					} else {
						return 0;
					}
				} else if (var0 != 'o' && var0 != 'O') {
					return (var0 != '(' || var1 != ')') && (var0 != '{' || var1 != '}') && (var0 != '[' || var1 != ']') ? 0 : 2;
				} else {
					return 1;
				}
			} else if (var2 == ',') {
				return var0 != '.' ? 0 : 1;
			} else if (var2 == '.') {
				return var0 != ',' ? 0 : 1;
			} else if (var2 == '!') {
				return var0 != 'i' ? 0 : 1;
			} else {
				return 0;
			}
		}
	}

	public static byte method368(char var0, int var1) {
		if (var1 < 9 || var1 > 9) {
			anInt734 = -479;
		}

		if (var0 >= 'a' && var0 <= 'z') {
			return (byte)(var0 - 'a' + 1);
		} else if (var0 == '\'') {
			return 28;
		} else {
			return var0 >= '0' && var0 <= '9' ? (byte)(var0 - '0' + 29) : 27;
		}
	}

	public static boolean method377(int var0, char var1) {
		if (var0 != 5) {
			throw new NullPointerException();
		} else {
			return var1 >= 'A' && var1 <= 'Z';
		}
	}

	public static boolean method375(int var0, char var1) {
		var0 = 8 / var0;
		return var1 >= '0' && var1 <= '9';
	}

	@ObfuscatedSignature(
			descriptor = "(CI)Z",
			garbageValue = "-972"
	)
	public static boolean method373(char var0) {
		if (var0 >= 'a' && var0 <= 'z') {
			return var0 == 'v' || var0 == 'x' || var0 == 'j' || var0 == 'q' || var0 == 'z';
		} else {
			return true;
		}
	}

	public static boolean method376(int var0, char var1) {
		return var1 >= 'a' && var1 <= 'z';
	}

	public static boolean method365(int var0, byte[][] var1, byte var2, byte var3) {
		int var4 = 0;
		if (var1[var4][0] == var2 && var3 == var1[var4][1]) {
			return true;
		} else {
			int var5 = var1.length - 1;
			if (var1[var5][0] == var2 && var3 == var1[var5][1]) {
				return true;
			} else {
				do {
					int var6 = (var4 + var5) / 2;
					if (var1[var6][0] == var2 && var3 == var1[var6][1]) {
						return true;
					}

					if (var2 >= var1[var6][0] && (var1[var6][0] != var2 || var3 >= var1[var6][1])) {
						var4 = var6;
					} else {
						var5 = var6;
					}
				} while(var4 != var5 && var5 != var4 + 1);

				return false;
			}
		}
	}

	@ObfuscatedSignature(
			descriptor = "([CI)Z",
			garbageValue = "6"
	)
	public static boolean method378(char[] var0) {
		boolean var1 = true;
		char[] var2 = var0;
		int var3 = var0.length;

		int var4;
		for (var4 = 0; var4 < var3; ++var4) {
			char var5 = var2[var4];
			if (!method375(636, var5) && var5 != 0) {
				var1 = false;
				break;
			}
		}

		if (var1) {
			return true;
		} else {
			int var6 = method379((byte)-119, var0);
			var3 = 0;
			var4 = anIntArray745.length - 1;
			if (anIntArray745[var3] != var6 && anIntArray745[var4] != var6) {
				do {
					int var7 = (var3 + var4) / 2;
					if (anIntArray745[var7] == var6) {
						return true;
					}

					if (var6 < anIntArray745[var7]) {
						var4 = var7;
					} else {
						var3 = var7;
					}
				} while(var3 != var4 && var4 != var3 + 1);

				return false;
			} else {
				return true;
			}
		}
	}

	public static int method379(byte var0, char[] var1) {
		if (var1.length > 6) {
			return 0;
		} else {
			int var2 = 0;

			for (int var3 = 0; var3 < var1.length; ++var3) {
				char var4 = var1[var1.length - var3 - 1];
				if (var4 >= 'a' && var4 <= 'z') {
					var2 = var2 * 38 + (var4 - 'a') + 1;
				} else if (var4 == '\'') {
					var2 = var2 * 38 + 27;
				} else if (var4 >= '0' && var4 <= '9') {
					var2 = var2 * 38 + (var4 - '0') + 28;
				} else if (var4 != 0) {
					return 0;
				}
			}

			return var2;
		}
	}

	public static void method342(Class47 var0) {
		Buffer var1 = new Buffer(var0.method546("fragmentsenc.txt", (byte[])null), (byte)1);
		Buffer var2 = new Buffer(var0.method546("badenc.txt", (byte[])null), (byte)1);
		Buffer var3 = new Buffer(var0.method546("domainenc.txt", (byte[])null), (byte)1);
		Buffer var4 = new Buffer(var0.method546("tldlist.txt", (byte[])null), (byte)1);
		method343(var1, var2, var3, var4);
	}

	public static void method343(Buffer var0, Buffer var1, Buffer var2, Buffer var3) {
		method345(804, var1);
		method346(var2);
		method347(-534, var0);
		method344(var3);
	}

	public static void method345(int var0, Buffer var1) {
		int var2 = var1.readInt();
		aCharArrayArray746 = new char[var2][];
		aByteArrayArrayArray747 = new byte[var2][][];
		var0 = 88 / var0;
		method348(var1, aByteArrayArrayArray747, aCharArrayArray746);
	}

	@ObfuscatedSignature(
			descriptor = "(LClass44_Sub3_Sub2;[[[B[[CZ)V",
			garbageValue = "0"
	)
	public static void method348(Buffer var0, byte[][][] var1, char[][] var2) {
		for (int var3 = 0; var3 < var2.length; ++var3) {
			char[] var4 = new char[var0.readUByte()];

			for (int var5 = 0; var5 < var4.length; ++var5) {
				var4[var5] = (char)var0.readUByte();
			}

			var2[var3] = var4;
			byte[][] var7 = new byte[var0.readUByte()][2];

			for (int var6 = 0; var6 < var7.length; ++var6) {
				var7[var6][0] = (byte)var0.readUByte();
				var7[var6][1] = (byte)var0.readUByte();
			}

			if (var7.length > 0) {
				var1[var3] = var7;
			}
		}

	}

	@ObfuscatedSignature(
			descriptor = "(LClass44_Sub3_Sub2;Z)V",
			garbageValue = "0"
	)
	public static void method346(Buffer var0) {
		int var1 = var0.readInt();
		aCharArrayArray748 = new char[var1][];
		method349(false, aCharArrayArray748, var0);
	}

	public static void method349(boolean var0, char[][] var1, Buffer var2) {
		for (int var3 = 0; var3 < var1.length; ++var3) {
			char[] var4 = new char[var2.readUByte()];

			for (int var5 = 0; var5 < var4.length; ++var5) {
				var4[var5] = (char)var2.readUByte();
			}

			var1[var3] = var4;
		}

	}

	public static void method347(int var0, Buffer var1) {
		anIntArray745 = new int[var1.readInt()];

		for (int var2 = 0; var2 < anIntArray745.length; ++var2) {
			anIntArray745[var2] = var1.readUShort();
		}

	}

	@ObfuscatedSignature(
			descriptor = "(LClass44_Sub3_Sub2;B)V",
			garbageValue = "14"
	)
	public static void method344(Buffer var0) {
		int var1 = var0.readInt();
		aCharArrayArray749 = new char[var1][];
		anIntArray750 = new int[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			anIntArray750[var2] = var0.readUByte();
			char[] var3 = new char[var0.readUByte()];

			for (int var4 = 0; var4 < var3.length; ++var4) {
				var3[var4] = (char)var0.readUByte();
			}

			aCharArrayArray749[var2] = var3;
		}

	}


	public static void method329(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(aClass40_656) {
			aClass40_656.aByteArray693 = var2;
			aClass40_656.anInt694 = var4;
			aClass40_656.aByteArray698 = var0;
			aClass40_656.anInt699 = 0;
			aClass40_656.anInt695 = var3;
			aClass40_656.anInt700 = var1;
			aClass40_656.anInt707 = 0;
			aClass40_656.anInt706 = 0;
			aClass40_656.anInt696 = 0;
			aClass40_656.anInt697 = 0;
			aClass40_656.anInt701 = 0;
			aClass40_656.anInt702 = 0;
			aClass40_656.anInt709 = 0;
			method331(aClass40_656);
			var1 -= aClass40_656.anInt700;
		}
	}

	public static void method331(Class40 var0) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		int var20 = 0;
		int[] var21 = null;
		int[] var22 = null;
		int[] var23 = null;
		var0.anInt708 = 1;
		if (Class40.anIntArray717 == null) {
			Class40.anIntArray717 = new int[var0.anInt708 * 100000];
		}

		for (boolean var24 = true; var24; var24 = var0.anInt731 + 1 == var0.anInt714 && var0.anInt704 == 0) {
			byte var25 = method332(var0);
			if (var25 == 23) {
				return;
			}

			var25 = method332(var0);
			var25 = method332(var0);
			var25 = method332(var0);
			var25 = method332(var0);
			var25 = method332(var0);
			++var0.anInt709;
			var25 = method332(var0);
			var25 = method332(var0);
			var25 = method332(var0);
			var25 = method332(var0);
			var25 = method333(var0);
			var0.aBoolean705 = var25 != 0;
			if (var0.aBoolean705) {
				System.out.println("PANIC! RANDOMISED BLOCK!");
			}

			var0.anInt710 = 0;
			var25 = method332(var0);
			var0.anInt710 = var0.anInt710 << 8 | var25 & 255;
			var25 = method332(var0);
			var0.anInt710 = var0.anInt710 << 8 | var25 & 255;
			var25 = method332(var0);
			var0.anInt710 = var0.anInt710 << 8 | var25 & 255;

			int var26;
			for (var26 = 0; var26 < 16; ++var26) {
				byte var27 = method333(var0);
				var0.aBooleanArray720[var26] = var27 == 1;
			}

			for (var26 = 0; var26 < 256; ++var26) {
				var0.aBooleanArray719[var26] = false;
			}

			int var48;
			for (var26 = 0; var26 < 16; ++var26) {
				if (var0.aBooleanArray720[var26]) {
					for (var48 = 0; var48 < 16; ++var48) {
						byte var28 = method333(var0);
						if (var28 == 1) {
							var0.aBooleanArray719[var48 + var26 * 16] = true;
						}
					}
				}
			}

			method335(var0);
			var26 = var0.anInt718 + 2;
			var48 = method334(3, var0);
			int var49 = method334(15, var0);

			int var30;
			byte var31;
			for (int var29 = 0; var29 < var49; ++var29) {
				var30 = 0;

				while (true) {
					var31 = method333(var0);
					if (var31 == 0) {
						var0.aByteArray725[var29] = (byte)var30;
						break;
					}

					++var30;
				}
			}

			byte[] var50 = new byte[6];

			for (byte var51 = 0; var51 < var48; var50[var51] = var51++) {
			}

			byte var32;
			for (var30 = 0; var30 < var49; ++var30) {
				var31 = var0.aByteArray725[var30];

				for (var32 = var50[var31]; var31 > 0; --var31) {
					var50[var31] = var50[var31 - 1];
				}

				var50[0] = var32;
				var0.aByteArray724[var30] = var32;
			}

			int var52;
			int var53;
			for (var30 = 0; var30 < var48; ++var30) {
				var52 = method334(5, var0);

				for (var53 = 0; var53 < var26; ++var53) {
					while (true) {
						byte var33 = method333(var0);
						if (var33 == 0) {
							var0.aByteArrayArray726[var30][var53] = (byte)var52;
							break;
						}

						var33 = method333(var0);
						if (var33 == 0) {
							++var52;
						} else {
							--var52;
						}
					}
				}
			}

			int var54;
			for (var30 = 0; var30 < var48; ++var30) {
				var31 = 32;
				var32 = 0;

				for (var54 = 0; var54 < var26; ++var54) {
					if (var0.aByteArrayArray726[var30][var54] > var32) {
						var32 = var0.aByteArrayArray726[var30][var54];
					}

					if (var0.aByteArrayArray726[var30][var54] < var31) {
						var31 = var0.aByteArrayArray726[var30][var54];
					}
				}

				method336(var0.anIntArrayArray727[var30], var0.anIntArrayArray728[var30], var0.anIntArrayArray729[var30], var0.aByteArrayArray726[var30], var31, var32, var26);
				var0.anIntArray730[var30] = var31;
			}

			var30 = var0.anInt718 + 1;
			var52 = var0.anInt708 * 100000;
			var53 = -1;
			byte var55 = 0;

			int var34;
			for (var34 = 0; var34 <= 255; ++var34) {
				var0.anIntArray713[var34] = 0;
			}

			var34 = 4095;

			int var35;
			int var36;
			for (var35 = 15; var35 >= 0; --var35) {
				for (var36 = 15; var36 >= 0; --var36) {
					var0.aByteArray722[var34] = (byte)(var36 + var35 * 16);
					--var34;
				}

				var0.anIntArray723[var35] = var34 + 1;
			}

			var35 = 0;
			if (var55 == 0) {
				++var53;
				var55 = 50;
				byte var56 = var0.aByteArray724[var53];
				var20 = var0.anIntArray730[var56];
				var21 = var0.anIntArrayArray727[var56];
				var23 = var0.anIntArrayArray729[var56];
				var22 = var0.anIntArrayArray728[var56];
			}

			var54 = var55 - 1;
			var36 = var20;

			int var37;
			byte var38;
			for (var37 = method334(var20, var0); var37 > var21[var36]; var37 = var37 << 1 | var38) {
				++var36;
				var38 = method333(var0);
			}

			int var39 = var23[var37 - var22[var36]];

			while (true) {
				int[] var10000;
				int var10002;
				while (var39 != var30) {
					int var40;
					byte var42;
					int var43;
					byte var44;
					int var58;
					if (var39 != 0 && var39 != 1) {
						var40 = var39 - 1;
						byte var57;
						if (var40 < 16) {
							var58 = var0.anIntArray723[0];

							for (var57 = var0.aByteArray722[var58 + var40]; var40 > 3; var40 -= 4) {
								var43 = var58 + var40;
								var0.aByteArray722[var43] = var0.aByteArray722[var43 - 1];
								var0.aByteArray722[var43 - 1] = var0.aByteArray722[var43 - 2];
								var0.aByteArray722[var43 - 2] = var0.aByteArray722[var43 - 3];
								var0.aByteArray722[var43 - 3] = var0.aByteArray722[var43 - 4];
							}

							while (var40 > 0) {
								var0.aByteArray722[var58 + var40] = var0.aByteArray722[var58 + var40 - 1];
								--var40;
							}

							var0.aByteArray722[var58] = var57;
						} else {
							var58 = var40 / 16;
							var43 = var40 % 16;
							int var60 = var0.anIntArray723[var58] + var43;

							for (var57 = var0.aByteArray722[var60]; var60 > var0.anIntArray723[var58]; --var60) {
								var0.aByteArray722[var60] = var0.aByteArray722[var60 - 1];
							}

							for (var10002 = var0.anIntArray723[var58]++; var58 > 0; --var58) {
								var10002 = var0.anIntArray723[var58]--;
								var0.aByteArray722[var0.anIntArray723[var58]] = var0.aByteArray722[var0.anIntArray723[var58 - 1] + 16 - 1];
							}

							var10002 = var0.anIntArray723[0]--;
							var0.aByteArray722[var0.anIntArray723[0]] = var57;
							if (var0.anIntArray723[0] == 0) {
								int var45 = 4095;

								for (int var46 = 15; var46 >= 0; --var46) {
									for (int var47 = 15; var47 >= 0; --var47) {
										var0.aByteArray722[var45] = var0.aByteArray722[var0.anIntArray723[var46] + var47];
										--var45;
									}

									var0.anIntArray723[var46] = var45 + 1;
								}
							}
						}

						var10002 = var0.anIntArray713[var0.aByteArray721[var57 & 255] & 255]++;
						Class40.anIntArray717[var35] = var0.aByteArray721[var57 & 255] & 255;
						++var35;
						if (var54 == 0) {
							++var53;
							var54 = 50;
							var42 = var0.aByteArray724[var53];
							var20 = var0.anIntArray730[var42];
							var21 = var0.anIntArrayArray727[var42];
							var23 = var0.anIntArrayArray729[var42];
							var22 = var0.anIntArrayArray728[var42];
						}

						--var54;
						var58 = var20;

						for (var43 = method334(var20, var0); var43 > var21[var58]; var43 = var43 << 1 | var44) {
							++var58;
							var44 = method333(var0);
						}

						var39 = var23[var43 - var22[var58]];
					} else {
						var40 = -1;
						int var41 = 1;

						do {
							if (var39 == 0) {
								var40 += var41;
							} else if (var39 == 1) {
								var40 += var41 * 2;
							}

							var41 *= 2;
							if (var54 == 0) {
								++var53;
								var54 = 50;
								var42 = var0.aByteArray724[var53];
								var20 = var0.anIntArray730[var42];
								var21 = var0.anIntArrayArray727[var42];
								var23 = var0.anIntArrayArray729[var42];
								var22 = var0.anIntArrayArray728[var42];
							}

							--var54;
							var58 = var20;

							for (var43 = method334(var20, var0); var43 > var21[var58]; var43 = var43 << 1 | var44) {
								++var58;
								var44 = method333(var0);
							}

							var39 = var23[var43 - var22[var58]];
						} while(var39 == 0 || var39 == 1);

						++var40;
						var42 = var0.aByteArray721[var0.aByteArray722[var0.anIntArray723[0]] & 255];
						var10000 = var0.anIntArray713;

						for (var10000[var42 & 255] += var40; var40 > 0; --var40) {
							Class40.anIntArray717[var35] = var42 & 255;
							++var35;
						}
					}
				}

				var0.anInt704 = 0;
				var0.aByte703 = 0;
				var0.anIntArray715[0] = 0;
				System.arraycopy(var0.anIntArray713, 0, var0.anIntArray715, 1, 256);

				for (var39 = 1; var39 <= 256; ++var39) {
					var10000 = var0.anIntArray715;
					var10000[var39] += var0.anIntArray715[var39 - 1];
				}

				for (var39 = 0; var39 < var35; ++var39) {
					byte var59 = (byte)(Class40.anIntArray717[var39] & 255);
					var10000 = Class40.anIntArray717;
					int var10001 = var0.anIntArray715[var59 & 255];
					var10000[var10001] |= var39 << 8;
					var10002 = var0.anIntArray715[var59 & 255]++;
				}

				var0.anInt711 = Class40.anIntArray717[var0.anInt710] >> 8;
				var0.anInt714 = 0;
				var0.anInt711 = Class40.anIntArray717[var0.anInt711];
				var0.anInt712 = (byte)(var0.anInt711 & 255);
				var0.anInt711 >>= 8;
				++var0.anInt714;
				var0.anInt731 = var35;
				method330(var0);
				break;
			}
		}

	}

	public static byte method332(Class40 var0) {
		return (byte)method334(8, var0);
	}

	public static int method334(int var0, Class40 var1) {
		while (var1.anInt707 < var0) {
			var1.anInt706 = var1.anInt706 << 8 | var1.aByteArray693[var1.anInt694] & 255;
			var1.anInt707 += 8;
			++var1.anInt694;
			--var1.anInt695;
			++var1.anInt696;
			if (var1.anInt696 == 0) {
				++var1.anInt697;
			}
		}

		int var3 = var1.anInt706 >> var1.anInt707 - var0 & (1 << var0) - 1;
		var1.anInt707 -= var0;
		return var3;
	}

	public static byte method333(Class40 var0) {
		return (byte)method334(1, var0);
	}

	public static void method335(Class40 var0) {
		var0.anInt718 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.aBooleanArray719[var1]) {
				var0.aByteArray721[var0.anInt718] = (byte)var1;
				++var0.anInt718;
			}
		}

	}

	public static void method336(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		int var9;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				if (var8 == var3[var9]) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		var8 = 0;

		for (var9 = var4; var9 <= var5; ++var9) {
			var8 += var1[var9 + 1] - var1[var9];
			var0[var9] = var8 - 1;
			var8 <<= 1;
		}

		for (var9 = var4 + 1; var9 <= var5; ++var9) {
			var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
		}

	}

	public static void method330(Class40 var0) {
		byte var1 = var0.aByte703;
		int var2 = var0.anInt704;
		int var3 = var0.anInt714;
		int var4 = var0.anInt712;
		int[] var5 = Class40.anIntArray717;
		int var6 = var0.anInt711;
		byte[] var7 = var0.aByteArray698;
		int var8 = var0.anInt699;
		int var9 = var0.anInt700;
		int var11 = var0.anInt731 + 1;

		label77:
		while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label77;
					}

					if (var2 == 1) {
						if (var9 == 0) {
							var2 = 1;
							break label77;
						}

						var7[var8] = var1;
						++var8;
						--var9;
						break;
					}

					var7[var8] = var1;
					--var2;
					++var8;
					--var9;
				}
			}

			boolean var12 = true;

			byte var13;
			while (var12) {
				var12 = false;
				if (var3 == var11) {
					var2 = 0;
					break label77;
				}

				var1 = (byte)var4;
				var6 = var5[var6];
				var13 = (byte)(var6 & 255);
				var6 >>= 8;
				++var3;
				if (var13 != var4) {
					var4 = var13;
					if (var9 == 0) {
						var2 = 1;
						break label77;
					}

					var7[var8] = var1;
					++var8;
					--var9;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label77;
					}

					var7[var8] = var1;
					++var8;
					--var9;
					var12 = true;
				}
			}

			var2 = 2;
			var6 = var5[var6];
			var13 = (byte)(var6 & 255);
			var6 >>= 8;
			++var3;
			if (var3 != var11) {
				if (var13 != var4) {
					var4 = var13;
				} else {
					var2 = 3;
					var6 = var5[var6];
					byte var14 = (byte)(var6 & 255);
					var6 >>= 8;
					++var3;
					if (var3 != var11) {
						if (var14 != var4) {
							var4 = var14;
						} else {
							var6 = var5[var6];
							byte var15 = (byte)(var6 & 255);
							var6 >>= 8;
							++var3;
							var2 = (var15 & 255) + 4;
							var6 = var5[var6];
							var4 = (byte)(var6 & 255);
							var6 >>= 8;
							++var3;
						}
					}
				}
			}
		}

		int var16 = var0.anInt701;
		var0.anInt701 += var9 - var9;
		if (var0.anInt701 < var16) {
			++var0.anInt702;
		}

		var0.aByte703 = var1;
		var0.anInt704 = var2;
		var0.anInt714 = var3;
		var0.anInt712 = var4;
		Class40.anIntArray717 = var5;
		var0.anInt711 = var6;
		var0.aByteArray698 = var7;
		var0.anInt699 = var8;
		var0.anInt700 = var9;
	}
}
