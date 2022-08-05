public class Class37 {
	public static final Class40 aClass40_656;

	static {
		aClass40_656 = new Class40();
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
