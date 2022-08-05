import net.runelite.mapping.ObfuscatedSignature;

public class Class48 {
	public static final char[] aCharArray794;
	public static boolean aBoolean788;
	public static int anInt789;
	public static byte aByte791;
	public static int anInt792;
	public static int anInt793;

	static {
		aCharArray794 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		aBoolean788 = true;
		anInt789 = 618;
		aByte791 = 7;
		anInt792 = -407;
		anInt793 = 1;
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
