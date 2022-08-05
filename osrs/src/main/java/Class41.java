import net.runelite.mapping.ObfuscatedSignature;

public class Class41 {
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

	static {
		aStringArray751 = new String[]{"cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"};
		anInt733 = -226;
		aBoolean735 = true;
		anInt742 = 5;
		anInt744 = 443;
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
}
