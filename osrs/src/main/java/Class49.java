public class Class49 {
	public static final char[] aCharArray795;
	public static final char[] aCharArray796;

	static {
		aCharArray795 = new char[100];
		aCharArray796 = new char[]{' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']'};
	}

	public static void method555(String var0, byte var1, Class44_Sub3_Sub2 var2) {
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
					var2.put1(var6);
				}
			} else if (var6 < 13) {
				var2.put1(var6 + (var3 << 4));
				var3 = -1;
			} else {
				var2.put1((var6 >> 4) + (var3 << 4));
				var3 = var6 & 15;
			}
		}

		if (var3 != -1) {
			var2.put1(var3 << 4);
		}

	}

	public static String method554(byte var0, int var1, Class44_Sub3_Sub2 var2) {
		int var3 = 0;
		int var4 = -1;

		int var6;
		for (int var5 = 0; var5 < var1; ++var5) {
			var6 = var2.get1();
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
}
