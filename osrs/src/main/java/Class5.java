import net.runelite.mapping.ObfuscatedSignature;

public class Class5 {
	public static final Class39 aClass39_165;
	public static Class5[] aClass5Array103;
	public static Class39 aClass39_166;
	public int[] anIntArray119;
	public int anInt112;
	public int[] anIntArray104;
	public int anInt110;
	public int anInt154;
	public int anInt152;
	public int anInt155;
	public int anInt153;
	public int[] anIntArray125;
	public int[][] anIntArrayArray118;
	public boolean aBoolean124;
	public int[] anIntArray120;
	public int anInt108;
	public int[] anIntArray105;
	public int anInt113;
	public String aString144;
	public int anInt114;
	public int anInt111;
	public int anInt123;
	public int anInt159;
	public int anInt106;
	public int anInt122;
	public int anInt107;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_150;
	public int anInt156;
	public int[] anIntArray126;
	public int anInt160;
	public int anInt157;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_151;
	public int[] anIntArray127;
	public int anInt146;
	public int anInt116;
	public int anInt117;
	public boolean aBoolean130;
	public int anInt121;
	public boolean aBoolean133;
	public int anInt148;
	public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_143;
	public int anInt134;
	public int anInt135;
	public int[] anIntArray137;
	public int[] anIntArray138;
	public int anInt147;
	public int anInt149;
	public byte aByte115;
	public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array136;
	public String aString145;
	public boolean aBoolean140;
	public int anInt109;
	public int anInt158;
	public String aString161;
	public String aString164;
	public boolean aBoolean141;
	public String aString162;
	public boolean aBoolean142;
	public boolean aBoolean131;
	public boolean aBoolean132;
	public String[] aStringArray139;
	public int anInt128;
	public boolean aBoolean129;
	public int anInt163;

	static {
		aClass39_165 = new Class39(30, 0);
	}

	public Model method184(int var1, int var2) {
		Model var3 = (Model)aClass39_165.method339((long)((var1 << 16) + var2));
		if (var3 != null) {
			return var3;
		} else {
			if (var1 == 1) {
				var3 = Model.method503(var2);
			}

			if (var1 == 2) {
				var3 = Class12.method214(var2).method217();
			}

			if (var1 == 3) {
				var3 = Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.method536();
			}

			if (var1 == 4) {
				var3 = Class14.method220(var2).method225((byte)7, 50);
			}

			if (var1 == 5) {
				var3 = null;
			}

			if (var3 != null) {
				aClass39_165.method340(201, (long)((var1 << 16) + var2), var3);
			}

			return var3;
		}
	}

	public Model method183(int var1, int var2, int var3, boolean var4) {
		Model var5;
		if (var4) {
			var5 = this.method184(this.anInt154, this.anInt155);
		} else {
			var5 = this.method184(this.anInt152, this.anInt153);
		}

		if (var5 == null) {
			return null;
		} else if (var1 == -1 && var2 == -1 && var5.anIntArray1536 == null) {
			return var5;
		} else {
			Model var6 = new Model(true, Class11.method211(var1) & Class11.method211(var2), var5, true, false);
			if (var1 != -1 || var2 != -1) {
				var6.method510();
			}

			if (var1 != -1) {
				var6.method511(var1);
			}

			if (var2 != -1) {
				var6.method511(var2);
			}

			var6.method520(64, 768, -50, -10, -50, true);
			return var6;
		}
	}

	public void method182(int var1, int var2, int var3) {
		int var4 = this.anIntArray104[var1];
		this.anIntArray104[var1] = this.anIntArray104[var2];
		this.anIntArray104[var2] = var4;
		var4 = this.anIntArray105[var1];
		var3 = 66 / var3;
		this.anIntArray105[var1] = this.anIntArray105[var2];
		this.anIntArray105[var2] = var4;
	}

	public static void method185(int var0, int var1, Model var2, int var3) {
		aClass39_165.method341();
		if (var2 != null && var3 != 4) {
			aClass39_165.method340(201, (long)((var3 << 16) + var1), var2);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(LClass47;LClass47;[LClass44_Sub3_Sub1_Sub4;I)V",
		garbageValue = "-584"
	)
	public static void method181(Class47 var0, Class47 var1, Class44_Sub3_Sub1_Sub4[] var2) {
		aClass39_166 = new Class39(50000, 0);
		Class44_Sub3_Sub2 var3 = new Class44_Sub3_Sub2(var0.method546("data", (byte[])null), (byte)1);
		int var4 = -1;
		int var5 = var3.get2();
		aClass5Array103 = new Class5[var5];

		while (true) {
			Class5 var7;
			do {
				if (var3.anInt1374 >= var3.aByteArray1373.length) {
					aClass39_166 = null;
					return;
				}

				int var6 = var3.get2();
				if (var6 == 65535) {
					var4 = var3.get2();
					var6 = var3.get2();
				}

				var7 = aClass5Array103[var6] = new Class5();
				var7.anInt108 = var6;
				var7.anInt109 = var4;
				var7.anInt110 = var3.get1();
				var7.anInt111 = var3.get1();
				var7.anInt112 = var3.get2();
				var7.anInt113 = var3.get2();
				var7.anInt114 = var3.get2();
				var7.aByte115 = (byte)var3.get1();
				var7.anInt121 = var3.get1();
				if (var7.anInt121 != 0) {
					var7.anInt121 = (var7.anInt121 - 1 << 8) + var3.get1();
				} else {
					var7.anInt121 = -1;
				}

				int var8 = var3.get1();
				int var9;
				if (var8 > 0) {
					var7.anIntArray119 = new int[var8];
					var7.anIntArray120 = new int[var8];

					for (var9 = 0; var9 < var8; ++var9) {
						var7.anIntArray119[var9] = var3.get1();
						var7.anIntArray120[var9] = var3.get2();
					}
				}

				var9 = var3.get1();
				int var10;
				int var11;
				if (var9 > 0) {
					var7.anIntArrayArray118 = new int[var9][];

					for (var10 = 0; var10 < var9; ++var10) {
						var11 = var3.get2();
						var7.anIntArrayArray118[var10] = new int[var11];

						for (int var12 = 0; var12 < var11; ++var12) {
							var7.anIntArrayArray118[var10][var12] = var3.get2();
						}
					}
				}

				if (var7.anInt110 == 0) {
					var7.anInt122 = var3.get2();
					var7.aBoolean124 = var3.get1() == 1;
					var10 = var3.get2();
					var7.anIntArray125 = new int[var10];
					var7.anIntArray126 = new int[var10];
					var7.anIntArray127 = new int[var10];

					for (var11 = 0; var11 < var10; ++var11) {
						var7.anIntArray125[var11] = var3.get2();
						var7.anIntArray126[var11] = var3.get2Signed();
						var7.anIntArray127[var11] = var3.get2Signed();
					}
				}

				if (var7.anInt110 == 1) {
					var7.anInt128 = var3.get2();
					var7.aBoolean129 = var3.get1() == 1;
				}

				if (var7.anInt110 == 2) {
					var7.anIntArray104 = new int[var7.anInt113 * var7.anInt114];
					var7.anIntArray105 = new int[var7.anInt113 * var7.anInt114];
					var7.aBoolean130 = var3.get1() == 1;
					var7.aBoolean131 = var3.get1() == 1;
					var7.aBoolean132 = var3.get1() == 1;
					var7.aBoolean133 = var3.get1() == 1;
					var7.anInt134 = var3.get1();
					var7.anInt135 = var3.get1();
					var7.anIntArray137 = new int[20];
					var7.anIntArray138 = new int[20];
					var7.aClass44_Sub3_Sub1_Sub2Array136 = new Class44_Sub3_Sub1_Sub2[20];

					for (var10 = 0; var10 < 20; ++var10) {
						var11 = var3.get1();
						if (var11 == 1) {
							var7.anIntArray137[var10] = var3.get2Signed();
							var7.anIntArray138[var10] = var3.get2Signed();
							String var14 = var3.getString();
							if (var1 != null && var14.length() > 0) {
								int var13 = var14.lastIndexOf(",");
								var7.aClass44_Sub3_Sub1_Sub2Array136[var10] = method186(Integer.parseInt(var14.substring(var13 + 1)), true, var14.substring(0, var13), var1);
							}
						}
					}

					var7.aStringArray139 = new String[5];

					for (var10 = 0; var10 < 5; ++var10) {
						var7.aStringArray139[var10] = var3.getString();
						if (var7.aStringArray139[var10].length() == 0) {
							var7.aStringArray139[var10] = null;
						}
					}
				}

				if (var7.anInt110 == 3) {
					var7.aBoolean140 = var3.get1() == 1;
				}

				if (var7.anInt110 == 4 || var7.anInt110 == 1) {
					var7.aBoolean141 = var3.get1() == 1;
					var10 = var3.get1();
					if (var2 != null) {
						var7.aClass44_Sub3_Sub1_Sub4_143 = var2[var10];
					}

					var7.aBoolean142 = var3.get1() == 1;
				}

				if (var7.anInt110 == 4) {
					var7.aString144 = var3.getString();
					var7.aString145 = var3.getString();
				}

				if (var7.anInt110 == 1 || var7.anInt110 == 3 || var7.anInt110 == 4) {
					var7.anInt146 = var3.get4();
				}

				if (var7.anInt110 == 3 || var7.anInt110 == 4) {
					var7.anInt147 = var3.get4();
					var7.anInt148 = var3.get4();
					var7.anInt149 = var3.get4();
				}

				if (var7.anInt110 == 5) {
					String var15 = var3.getString();
					if (var1 != null && var15.length() > 0) {
						var11 = var15.lastIndexOf(",");
						var7.aClass44_Sub3_Sub1_Sub2_150 = method186(Integer.parseInt(var15.substring(var11 + 1)), true, var15.substring(0, var11), var1);
					}

					var15 = var3.getString();
					if (var1 != null && var15.length() > 0) {
						var11 = var15.lastIndexOf(",");
						var7.aClass44_Sub3_Sub1_Sub2_151 = method186(Integer.parseInt(var15.substring(var11 + 1)), true, var15.substring(0, var11), var1);
					}
				}

				if (var7.anInt110 == 6) {
					var10 = var3.get1();
					if (var10 != 0) {
						var7.anInt152 = 1;
						var7.anInt153 = (var10 - 1 << 8) + var3.get1();
					}

					var10 = var3.get1();
					if (var10 != 0) {
						var7.anInt154 = 1;
						var7.anInt155 = (var10 - 1 << 8) + var3.get1();
					}

					var10 = var3.get1();
					if (var10 != 0) {
						var7.anInt156 = (var10 - 1 << 8) + var3.get1();
					} else {
						var7.anInt156 = -1;
					}

					var10 = var3.get1();
					if (var10 != 0) {
						var7.anInt157 = (var10 - 1 << 8) + var3.get1();
					} else {
						var7.anInt157 = -1;
					}

					var7.anInt158 = var3.get2();
					var7.anInt159 = var3.get2();
					var7.anInt160 = var3.get2();
				}

				if (var7.anInt110 == 7) {
					var7.anIntArray104 = new int[var7.anInt113 * var7.anInt114];
					var7.anIntArray105 = new int[var7.anInt113 * var7.anInt114];
					var7.aBoolean141 = var3.get1() == 1;
					var10 = var3.get1();
					if (var2 != null) {
						var7.aClass44_Sub3_Sub1_Sub4_143 = var2[var10];
					}

					var7.aBoolean142 = var3.get1() == 1;
					var7.anInt146 = var3.get4();
					var7.anInt134 = var3.get2Signed();
					var7.anInt135 = var3.get2Signed();
					var7.aBoolean131 = var3.get1() == 1;
					var7.aStringArray139 = new String[5];

					for (var11 = 0; var11 < 5; ++var11) {
						var7.aStringArray139[var11] = var3.getString();
						if (var7.aStringArray139[var11].length() == 0) {
							var7.aStringArray139[var11] = null;
						}
					}
				}

				if (var7.anInt111 == 2 || var7.anInt110 == 2) {
					var7.aString161 = var3.getString();
					var7.aString162 = var3.getString();
					var7.anInt163 = var3.get2();
				}
			} while(var7.anInt111 != 1 && var7.anInt111 != 4 && var7.anInt111 != 5 && var7.anInt111 != 6);

			var7.aString164 = var3.getString();
			if (var7.aString164.length() == 0) {
				if (var7.anInt111 == 1) {
					var7.aString164 = "Ok";
				}

				if (var7.anInt111 == 4) {
					var7.aString164 = "Select";
				}

				if (var7.anInt111 == 5) {
					var7.aString164 = "Select";
				}

				if (var7.anInt111 == 6) {
					var7.aString164 = "Continue";
				}
			}
		}
	}

	public static Class44_Sub3_Sub1_Sub2 method186(int var0, boolean var1, String var2, Class47 var3) {
		long var4 = (Class48.method549(7, var2) << 8) + (long)var0;
		Class44_Sub3_Sub1_Sub2 var6 = (Class44_Sub3_Sub1_Sub2)aClass39_166.method339(var4);
		if (var6 != null) {
			return var6;
		} else {
			try {
				var6 = new Class44_Sub3_Sub1_Sub2(var3, var2, var0);
				aClass39_166.method340(201, var4, var6);
				return var6;
			} catch (Exception var8) {
				return null;
			}
		}
	}
}
