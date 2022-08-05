import net.runelite.mapping.ObfuscatedSignature;

public class Class14 {
	public static int anInt317;
	public static Class39 aClass39_364;
	public static boolean aBoolean324;
	public static int anInt323;
	public static Class14[] aClass14Array322;
	public static Class44_Sub3_Sub2 aClass44_Sub3_Sub2_321;
	public static int[] anIntArray320;
	public static Class39 aClass39_365;
	public static int anInt319;
	public int anInt351;
	public int anInt343;
	public int anInt326;
	public int[] anIntArray355;
	public int anInt358;
	public final int anInt315;
	public int anInt352;
	public int anInt344;
	public int anInt349;
	public String aString327;
	public boolean aBoolean318;
	public int anInt353;
	public int anInt325;
	public int anInt354;
	public int anInt346;
	public int[] anIntArray356;
	public byte[] aByteArray328;
	public int anInt347;
	public int anInt350;
	public int[] anIntArray329;
	public int[] anIntArray330;
	public int anInt331;
	public int anInt332;
	public int anInt359;
	public int anInt333;
	public int anInt335;
	public int anInt339;
	public int anInt360;
	public int anInt361;
	public byte aByte345;
	public int anInt336;
	public boolean aBoolean338;
	public int anInt337;
	public byte aByte348;
	public boolean aBoolean340;
	public int anInt334;
	public String[] aStringArray341;
	public String[] aStringArray342;
	public int anInt362;
	public int anInt363;
	public int anInt357;

	static {
		anInt317 = 5;
		aBoolean324 = true;
		aClass39_364 = new Class39(50, 0);
		aClass39_365 = new Class39(100, 0);
	}

	public Class14() {
		this.anInt315 = -32952;
		this.aBoolean318 = true;
		this.anInt325 = -1;
	}

	public Model method224(int var1) {
		int var3;
		if (this.anIntArray355 != null && var1 > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (var1 >= this.anIntArray356[var3] && this.anIntArray356[var3] != 0) {
					var2 = this.anIntArray355[var3];
				}
			}

			if (var2 != -1) {
				return method220(var2).method224(1);
			}
		}

		Model var4 = (Model)aClass39_364.method339((long)this.anInt325);
		if (var4 != null) {
			return var4;
		} else {
			var4 = Model.method503(this.anInt326);
			if (var4 == null) {
				return null;
			} else {
				if (this.anInt359 != 128 || this.anInt360 != 128 || this.anInt361 != 128) {
					var4.method519(9, this.anInt361, this.anInt359, this.anInt360);
				}

				if (this.anIntArray329 != null) {
					for (var3 = 0; var3 < this.anIntArray329.length; ++var3) {
						var4.method517(this.anIntArray329[var3], this.anIntArray330[var3]);
					}
				}

				var4.method520(this.anInt362 + 64, this.anInt363 + 768, -50, -10, -50, true);
				var4.aBoolean1555 = true;
				aClass39_364.method340(201, (long)this.anInt325, var4);
				return var4;
			}
		}
	}

	public Model method225(byte var1, int var2) {
		int var4;
		if (this.anIntArray355 != null && var2 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; ++var4) {
				if (var2 >= this.anIntArray356[var4] && this.anIntArray356[var4] != 0) {
					var3 = this.anIntArray355[var4];
				}
			}

			if (var3 != -1) {
				return method220(var3).method225((byte)7, 1);
			}
		}

		Model var6 = Model.method503(this.anInt326);
		if (var1 == 7) {
			boolean var5 = false;
			if (var6 == null) {
				return null;
			} else {
				if (this.anIntArray329 != null) {
					for (var4 = 0; var4 < this.anIntArray329.length; ++var4) {
						var6.method517(this.anIntArray329[var4], this.anIntArray330[var4]);
					}
				}

				return var6;
			}
		} else {
			throw new NullPointerException();
		}
	}

	public boolean method229(int var1, byte var2) {
		int var3 = this.anInt351;
		int var4 = this.anInt352;
		if (var1 == 1) {
			var3 = this.anInt353;
			var4 = this.anInt354;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (var2 == 1) {
				boolean var6 = false;
				if (!Model.method504(var3)) {
					var5 = false;
				}

				if (var4 != -1 && !Model.method504(var4)) {
					var5 = false;
				}

				return var5;
			} else {
				throw new NullPointerException();
			}
		}
	}

	public Model method230(boolean var1, int var2) {
		int var3 = this.anInt351;
		int var4 = this.anInt352;
		if (var2 == 1) {
			var3 = this.anInt353;
			var4 = this.anInt354;
		}

		if (var3 == -1) {
			return null;
		} else {
			Model var5 = Model.method503(var3);
			if (var4 != -1) {
				Model var6 = Model.method503(var4);
				Model[] var7 = new Model[]{var5, var6};
				var5 = new Model(2, -643, var7);
			}

			if (this.anIntArray329 != null) {
				for (int var8 = 0; var8 < this.anIntArray329.length; ++var8) {
					var5.method517(this.anIntArray329[var8], this.anIntArray330[var8]);
				}
			}

			return var5;
		}
	}

	public void method221() {
		this.anInt326 = 0;
		this.aString327 = null;
		this.aByteArray328 = null;
		this.anIntArray329 = null;
		this.anIntArray330 = null;
		this.anInt331 = 2000;
		this.anInt332 = 0;
		this.anInt333 = 0;
		this.anInt334 = 0;
		this.anInt335 = 0;
		this.anInt336 = 0;
		this.anInt337 = -1;
		this.aBoolean338 = false;
		this.anInt339 = 1;
		this.aBoolean340 = false;
		this.aStringArray341 = null;
		this.aStringArray342 = null;
		this.anInt343 = -1;
		this.anInt344 = -1;
		this.aByte345 = 0;
		this.anInt346 = -1;
		this.anInt347 = -1;
		this.aByte348 = 0;
		this.anInt349 = -1;
		this.anInt350 = -1;
		this.anInt351 = -1;
		this.anInt352 = -1;
		this.anInt353 = -1;
		this.anInt354 = -1;
		this.anIntArray355 = null;
		this.anIntArray356 = null;
		this.anInt357 = -1;
		this.anInt358 = -1;
		this.anInt359 = 128;
		this.anInt360 = 128;
		this.anInt361 = 128;
		this.anInt362 = 0;
		this.anInt363 = 0;
	}

	public void method222(byte var1, Class44_Sub3_Sub2 var2) {
		while (true) {
			int var3 = var2.get1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				this.anInt326 = var2.get2();
			} else if (var3 == 2) {
				this.aString327 = var2.getString();
			} else if (var3 == 3) {
				this.aByteArray328 = var2.getStringArray(this.anInt315);
			} else if (var3 == 4) {
				this.anInt331 = var2.get2();
			} else if (var3 == 5) {
				this.anInt332 = var2.get2();
			} else if (var3 == 6) {
				this.anInt333 = var2.get2();
			} else if (var3 == 7) {
				this.anInt335 = var2.get2();
				if (this.anInt335 > 32767) {
					this.anInt335 -= 65536;
				}
			} else if (var3 == 8) {
				this.anInt336 = var2.get2();
				if (this.anInt336 > 32767) {
					this.anInt336 -= 65536;
				}
			} else if (var3 == 10) {
				this.anInt337 = var2.get2();
			} else if (var3 == 11) {
				this.aBoolean338 = true;
			} else if (var3 == 12) {
				this.anInt339 = var2.get4();
			} else if (var3 == 16) {
				this.aBoolean340 = true;
			} else if (var3 == 23) {
				this.anInt343 = var2.get2();
				this.aByte345 = var2.get1Signed();
			} else if (var3 == 24) {
				this.anInt344 = var2.get2();
			} else if (var3 == 25) {
				this.anInt346 = var2.get2();
				this.aByte348 = var2.get1Signed();
			} else if (var3 == 26) {
				this.anInt347 = var2.get2();
			} else if (var3 >= 30 && var3 < 35) {
				if (this.aStringArray341 == null) {
					this.aStringArray341 = new String[5];
				}

				this.aStringArray341[var3 - 30] = var2.getString();
				if (this.aStringArray341[var3 - 30].equalsIgnoreCase("hidden")) {
					this.aStringArray341[var3 - 30] = null;
				}
			} else if (var3 >= 35 && var3 < 40) {
				if (this.aStringArray342 == null) {
					this.aStringArray342 = new String[5];
				}

				this.aStringArray342[var3 - 35] = var2.getString();
			} else if (var3 == 40) {
				int var4 = var2.get1();
				this.anIntArray329 = new int[var4];
				this.anIntArray330 = new int[var4];

				for (int var5 = 0; var5 < var4; ++var5) {
					this.anIntArray329[var5] = var2.get2();
					this.anIntArray330[var5] = var2.get2();
				}
			} else if (var3 == 78) {
				this.anInt349 = var2.get2();
			} else if (var3 == 79) {
				this.anInt350 = var2.get2();
			} else if (var3 == 90) {
				this.anInt351 = var2.get2();
			} else if (var3 == 91) {
				this.anInt353 = var2.get2();
			} else if (var3 == 92) {
				this.anInt352 = var2.get2();
			} else if (var3 == 93) {
				this.anInt354 = var2.get2();
			} else if (var3 == 95) {
				this.anInt334 = var2.get2();
			} else if (var3 == 97) {
				this.anInt357 = var2.get2();
			} else if (var3 == 98) {
				this.anInt358 = var2.get2();
			} else if (var3 >= 100 && var3 < 110) {
				if (this.anIntArray355 == null) {
					this.anIntArray355 = new int[10];
					this.anIntArray356 = new int[10];
				}

				this.anIntArray355[var3 - 100] = var2.get2();
				this.anIntArray356[var3 - 100] = var2.get2();
			} else if (var3 == 110) {
				this.anInt359 = var2.get2();
			} else if (var3 == 111) {
				this.anInt360 = var2.get2();
			} else if (var3 == 112) {
				this.anInt361 = var2.get2();
			} else if (var3 == 113) {
				this.anInt362 = var2.get1Signed();
			} else if (var3 == 114) {
				this.anInt363 = var2.get1Signed() * 5;
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method223() {
		Class14 var1 = method220(this.anInt358);
		this.anInt326 = var1.anInt326;
		this.anInt331 = var1.anInt331;
		this.anInt332 = var1.anInt332;
		this.anInt333 = var1.anInt333;
		this.anInt334 = var1.anInt334;
		this.anInt335 = var1.anInt335;
		this.anInt336 = var1.anInt336;
		this.anIntArray329 = var1.anIntArray329;
		this.anIntArray330 = var1.anIntArray330;
		Class14 var2 = method220(this.anInt357);
		this.aString327 = var2.aString327;
		this.aBoolean340 = var2.aBoolean340;
		this.anInt339 = var2.anInt339;
		String var3 = "a";
		char var4 = var2.aString327.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		this.aByteArray328 = ("Swap this note at any bank for " + var3 + " " + var2.aString327 + ".").getBytes();
		this.aBoolean338 = true;
	}

	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "0"
	)
	public boolean method227(int var1) {
		int var2 = this.anInt343;
		int var3 = this.anInt344;
		int var4 = this.anInt349;
		if (var1 == 1) {
			var2 = this.anInt346;
			var3 = this.anInt347;
			var4 = this.anInt350;
		}

		if (var2 == -1) {
			return true;
		} else {
			boolean var5 = Model.method504(var2);
			if (var3 != -1 && !Model.method504(var3)) {
				var5 = false;
			}

			if (var4 != -1 && !Model.method504(var4)) {
				var5 = false;
			}

			return var5;
		}
	}

	public Model method228(int var1, int var2) {
		int var3 = this.anInt343;
		int var4 = this.anInt344;
		int var5 = this.anInt349;
		if (var2 == 1) {
			var3 = this.anInt346;
			var4 = this.anInt347;
			var5 = this.anInt350;
		}

		if (var3 == -1) {
			return null;
		} else {
			Model var6 = Model.method503(var3);
			if (var4 != -1) {
				Model var7;
				if (var5 != -1) {
					var7 = Model.method503(var4);
					Model var8 = Model.method503(var5);
					Model[] var9 = new Model[]{var6, var7, var8};
					var6 = new Model(3, -643, var9);
				} else {
					var7 = Model.method503(var4);
					Model[] var11 = new Model[]{var6, var7};
					var6 = new Model(2, -643, var11);
				}
			}

			if (var2 == 0 && this.aByte345 != 0) {
				var6.method516(0, this.aByte345, (byte)10, 0);
			}

			if (var2 == 1 && this.aByte348 != 0) {
				var6.method516(0, this.aByte348, (byte)10, 0);
			}

			if (this.anIntArray329 != null) {
				for (int var10 = 0; var10 < this.anIntArray329.length; ++var10) {
					var6.method517(this.anIntArray329[var10], this.anIntArray330[var10]);
				}
			}

			return var6;
		}
	}

	public static Class14 method220(int var0) {
		for (int var1 = 0; var1 < 10; ++var1) {
			if (var0 == aClass14Array322[var1].anInt325) {
				return aClass14Array322[var1];
			}
		}

		anInt323 = (anInt323 + 1) % 10;
		Class14 var2 = aClass14Array322[anInt323];
		aClass44_Sub3_Sub2_321.anInt1374 = anIntArray320[var0];
		var2.anInt325 = var0;
		var2.method221();
		var2.method222((byte)2, aClass44_Sub3_Sub2_321);
		if (var2.anInt358 != -1) {
			var2.method223();
		}

		if (!aBoolean324 && var2.aBoolean340) {
			var2.aString327 = "Members Object";
			var2.aByteArray328 = "Login to a members' server to use this object.".getBytes();
			var2.aStringArray341 = null;
			var2.aStringArray342 = null;
		}

		return var2;
	}

	public static Class44_Sub3_Sub1_Sub2 method226(int var0, int var1, int var2, int var3) {
		if (var1 == 0) {
			Class44_Sub3_Sub1_Sub2 var4 = (Class44_Sub3_Sub1_Sub2)aClass39_365.method339((long)var0);
			if (var4 != null && var3 != var4.anInt1437 && var4.anInt1437 != -1) {
				var4.unlink();
				var4 = null;
			}

			if (var4 != null) {
				return var4;
			}
		}

		Class14 var23 = method220(var0);
		if (var23.anIntArray355 == null) {
			var3 = -1;
		}

		if (var3 > 1) {
			int var5 = -1;

			for (int var6 = 0; var6 < 10; ++var6) {
				if (var3 >= var23.anIntArray356[var6] && var23.anIntArray356[var6] != 0) {
					var5 = var23.anIntArray355[var6];
				}
			}

			if (var5 != -1) {
				var23 = method220(var5);
			}
		}

		Model var24 = var23.method224(1);
		if (var24 == null) {
			return null;
		} else {
			Class44_Sub3_Sub1_Sub2 var25 = null;
			if (var23.anInt358 != -1) {
				var25 = method226(var23.anInt357, -1, 45926, 10);
				if (var25 == null) {
					return null;
				}
			}

			Class44_Sub3_Sub1_Sub2 var7 = new Class44_Sub3_Sub1_Sub2(32, 32);
			int var8 = Class44_Sub3_Sub1_Sub1.anInt1403;
			int var9 = Class44_Sub3_Sub1_Sub1.anInt1404;
			int[] var10 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
			int[] var11 = DrawingArea.anIntArray1351;
			int var12 = DrawingArea.anInt1352;
			int var13 = DrawingArea.anInt1353;
			int var14 = DrawingArea.anInt1356;
			int var15 = DrawingArea.anInt1357;
			int var16 = DrawingArea.anInt1354;
			int var17 = DrawingArea.anInt1355;
			Class44_Sub3_Sub1_Sub1.aBoolean1401 = false;
			DrawingArea.initDrawingArea(32, 32, var7.anIntArray1431, 9);
			DrawingArea.method411(32, 0, 32, 0, 0, 0);
			Class44_Sub3_Sub1_Sub1.method419();
			int var18 = var23.anInt331;
			if (var1 == -1) {
				var18 = (int)((double)var18 * 1.5D);
			}

			if (var1 > 0) {
				var18 = (int)((double)var18 * 1.04D);
			}

			int var19 = var18 * Class44_Sub3_Sub1_Sub1.anIntArray1407[var23.anInt332] >> 16;
			int var20 = var18 * Class44_Sub3_Sub1_Sub1.anIntArray1408[var23.anInt332] >> 16;
			var24.method523(0, var23.anInt333, var23.anInt334, var23.anInt332, var23.anInt335, var24.anInt1394 / 2 + var19 + var23.anInt336, var20 + var23.anInt336);

			int var21;
			int var22;
			for (var21 = 31; var21 >= 0; --var21) {
				for (var22 = 31; var22 >= 0; --var22) {
					if (var7.anIntArray1431[var21 + var22 * 32] == 0) {
						if (var21 > 0 && var7.anIntArray1431[var22 * 32 + (var21 - 1)] > 1) {
							var7.anIntArray1431[var21 + var22 * 32] = 1;
						} else if (var22 > 0 && var7.anIntArray1431[var21 + (var22 - 1) * 32] > 1) {
							var7.anIntArray1431[var21 + var22 * 32] = 1;
						} else if (var21 < 31 && var7.anIntArray1431[var21 + var22 * 32 + 1] > 1) {
							var7.anIntArray1431[var21 + var22 * 32] = 1;
						} else if (var22 < 31 && var7.anIntArray1431[(var22 + 1) * 32 + var21] > 1) {
							var7.anIntArray1431[var21 + var22 * 32] = 1;
						}
					}
				}
			}

			if (var1 > 0) {
				for (var21 = 31; var21 >= 0; --var21) {
					for (var22 = 31; var22 >= 0; --var22) {
						if (var7.anIntArray1431[var21 + var22 * 32] == 0) {
							if (var21 > 0 && var7.anIntArray1431[var22 * 32 + (var21 - 1)] == 1) {
								var7.anIntArray1431[var21 + var22 * 32] = var1;
							} else if (var22 > 0 && var7.anIntArray1431[var21 + (var22 - 1) * 32] == 1) {
								var7.anIntArray1431[var21 + var22 * 32] = var1;
							} else if (var21 < 31 && var7.anIntArray1431[var21 + var22 * 32 + 1] == 1) {
								var7.anIntArray1431[var21 + var22 * 32] = var1;
							} else if (var22 < 31 && var7.anIntArray1431[(var22 + 1) * 32 + var21] == 1) {
								var7.anIntArray1431[var21 + var22 * 32] = var1;
							}
						}
					}
				}
			} else if (var1 == 0) {
				for (var21 = 31; var21 >= 0; --var21) {
					for (var22 = 31; var22 >= 0; --var22) {
						if (var7.anIntArray1431[var21 + var22 * 32] == 0 && var21 > 0 && var22 > 0 && var7.anIntArray1431[var21 - 1 + (var22 - 1) * 32] > 0) {
							var7.anIntArray1431[var21 + var22 * 32] = 3153952;
						}
					}
				}
			}

			if (var23.anInt358 != -1) {
				var21 = var25.anInt1436;
				var22 = var25.anInt1437;
				var25.anInt1436 = 32;
				var25.anInt1437 = 32;
				var25.method440((byte)7, 0, 0);
				var25.anInt1436 = var21;
				var25.anInt1437 = var22;
			}

			if (var1 == 0) {
				aClass39_365.method340(201, (long)var0, var7);
			}

			DrawingArea.initDrawingArea(var12, var13, var11, 9);
			DrawingArea.method408(5, var17, var15, var14, var16);
			Class44_Sub3_Sub1_Sub1.anInt1403 = var8;
			Class44_Sub3_Sub1_Sub1.anInt1404 = var9;
			Class44_Sub3_Sub1_Sub1.anIntArray1409 = var10;
			Class44_Sub3_Sub1_Sub1.aBoolean1401 = true;
			if (var23.aBoolean338) {
				var7.anInt1436 = 33;
			} else {
				var7.anInt1436 = 32;
			}

			var7.anInt1437 = var3;
			return var7;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method219() {
		aClass39_364 = null;
		aClass39_365 = null;
		anIntArray320 = null;
		aClass14Array322 = null;
		aClass44_Sub3_Sub2_321 = null;
	}

	public static void method218(Class47 var0) {
		aClass44_Sub3_Sub2_321 = new Class44_Sub3_Sub2(var0.method546("obj.dat", (byte[])null), (byte)1);
		Class44_Sub3_Sub2 var1 = new Class44_Sub3_Sub2(var0.method546("obj.idx", (byte[])null), (byte)1);
		anInt319 = var1.get2();
		anIntArray320 = new int[anInt319];
		int var2 = 2;

		int var3;
		for (var3 = 0; var3 < anInt319; ++var3) {
			anIntArray320[var3] = var2;
			var2 += var1.get2();
		}

		aClass14Array322 = new Class14[10];

		for (var3 = 0; var3 < 10; ++var3) {
			aClass14Array322[var3] = new Class14();
		}

	}
}
