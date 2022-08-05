import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub1_Sub1 extends DrawingArea {
	public static int anInt1397;
	public static int anInt1403;
	public static int anInt1404;
	public static boolean aBoolean1398;
	public static int anInt1402;
	public static int[] anIntArray1417;
	public static boolean aBoolean1401;
	public static int[] anIntArray1409;
	public static int[][] anIntArrayArray1415;
	public static Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array1411;
	public static int anInt1414;
	public static boolean[] aBooleanArray1412;
	public static int[] anIntArray1413;
	public static int[][] anIntArrayArray1416;
	public static boolean aBoolean1399;
	public static int[] anIntArray1419;
	public static int[][] anIntArrayArray1420;
	public static int[] anIntArray1405;
	public static final int[] anIntArray1406;
	public static int[] anIntArray1407;
	public static int[] anIntArray1408;
	public static int anInt1418;
	public static boolean aBoolean1400;
	public static int anInt1410;

	static {
		anInt1397 = -593;
		aBoolean1398 = true;
		aBoolean1401 = true;
		aClass44_Sub3_Sub1_Sub3Array1411 = new Class44_Sub3_Sub1_Sub3[50];
		aBooleanArray1412 = new boolean[50];
		anIntArray1413 = new int[50];
		anIntArrayArray1416 = new int[50][];
		anIntArray1417 = new int[50];
		anIntArray1419 = new int[65536];
		anIntArrayArray1420 = new int[50][];
		anIntArray1405 = new int[512];
		anIntArray1406 = new int[2048];
		anIntArray1407 = new int[2048];
		anIntArray1408 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			anIntArray1405[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			anIntArray1406[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			anIntArray1407[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			anIntArray1408[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2972"
	)
	public static void method422(int var0) {
		if (anIntArrayArray1415 == null) {
			anInt1414 = var0;
			if (aBoolean1398) {
				anIntArrayArray1415 = new int[anInt1414][16384];
			} else {
				anIntArrayArray1415 = new int[anInt1414][65536];
			}

			for (int var1 = 0; var1 < 50; ++var1) {
				anIntArrayArray1416[var1] = null;
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-18849"
	)
	public static void method421() {
		anIntArrayArray1415 = null;

		for (int var0 = 0; var0 < 50; ++var0) {
			anIntArrayArray1416[var0] = null;
		}

	}

	public static void method427(int var0, double var1) {
		var1 += Math.random() * 0.03D - 0.015D;
		int var3 = 0;

		int var4;
		for (var4 = 0; var4 < 512; ++var4) {
			double var5 = (double)(var4 / 8) / 64.0D + 0.0078125D;
			double var7 = (double)(var4 & 7) / 8.0D + 0.0625D;

			for (int var9 = 0; var9 < 128; ++var9) {
				double var10 = (double)var9 / 128.0D;
				double var12 = var10;
				double var14 = var10;
				double var16 = var10;
				if (var7 != 0.0D) {
					double var18;
					if (var10 < 0.5D) {
						var18 = var10 * (1.0D + var7);
					} else {
						var18 = var10 + var7 - var10 * var7;
					}

					double var20 = 2.0D * var10 - var18;
					double var22 = var5 + 0.3333333333333333D;
					if (var22 > 1.0D) {
						--var22;
					}

					double var26 = var5 - 0.3333333333333333D;
					if (var26 < 0.0D) {
						++var26;
					}

					if (6.0D * var22 < 1.0D) {
						var12 = var20 + (var18 - var20) * 6.0D * var22;
					} else if (2.0D * var22 < 1.0D) {
						var12 = var18;
					} else if (3.0D * var22 < 2.0D) {
						var12 = var20 + (var18 - var20) * (0.6666666666666666D - var22) * 6.0D;
					} else {
						var12 = var20;
					}

					if (6.0D * var5 < 1.0D) {
						var14 = var20 + (var18 - var20) * 6.0D * var5;
					} else if (2.0D * var5 < 1.0D) {
						var14 = var18;
					} else if (3.0D * var5 < 2.0D) {
						var14 = var20 + (var18 - var20) * (0.6666666666666666D - var5) * 6.0D;
					} else {
						var14 = var20;
					}

					if (6.0D * var26 < 1.0D) {
						var16 = var20 + (var18 - var20) * 6.0D * var26;
					} else if (2.0D * var26 < 1.0D) {
						var16 = var18;
					} else if (3.0D * var26 < 2.0D) {
						var16 = var20 + (var18 - var20) * (0.6666666666666666D - var26) * 6.0D;
					} else {
						var16 = var20;
					}
				}

				int var29 = (int)(var12 * 256.0D);
				int var19 = (int)(var14 * 256.0D);
				int var30 = (int)(var16 * 256.0D);
				int var21 = var30 + (var19 << 8) + (var29 << 16);
				var21 = method428(var21, var1);
				anIntArray1419[var3++] = var21;
			}
		}

		for (var4 = 0; var4 < 50; ++var4) {
			if (aClass44_Sub3_Sub1_Sub3Array1411[var4] != null) {
				int[] var28 = aClass44_Sub3_Sub1_Sub3Array1411[var4].anIntArray1446;
				anIntArrayArray1420[var4] = new int[var28.length];

				for (int var6 = 0; var6 < var28.length; ++var6) {
					anIntArrayArray1420[var4][var6] = method428(var28[var6], var1);
					if ((anIntArrayArray1420[var4][var6] & 16316671) == 0 && var6 != 0) {
						anIntArrayArray1420[var4][var6] = 1;
					}
				}
			}
		}

		for (var4 = 0; var4 < 50; ++var4) {
			method425(var4);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	public static void method425(int var0) {
		if (anIntArrayArray1416[var0] != null) {
			anIntArrayArray1415[anInt1414++] = anIntArrayArray1416[var0];
			anIntArrayArray1416[var0] = null;
		}
	}

	public static int method428(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16);
	}

	public static void method431(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var0 != var1) {
			var7 = (var4 - var3 << 16) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 16) / (var2 - var1);
		}

		int var9 = 0;
		if (var0 != var2) {
			var9 = (var3 - var5 << 16) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < DrawingArea.anInt1355) {
				if (var1 > DrawingArea.anInt1355) {
					var1 = DrawingArea.anInt1355;
				}

				if (var2 > DrawingArea.anInt1355) {
					var2 = DrawingArea.anInt1355;
				}

				if (var1 < var2) {
					var5 = var3 <<= 16;
					if (var0 < 0) {
						var5 -= var0 * var9;
						var3 -= var0 * var7;
						var0 = 0;
					}

					var4 <<= 16;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var0, var6, 0, var5 >> 16, var4 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var0, var6, 0, var5 >> 16, var3 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += DrawingArea.anInt1352;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var0, var6, 0, var4 >> 16, var5 >> 16);
									var5 += var9;
									var4 += var8;
									var0 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var0, var6, 0, var3 >> 16, var5 >> 16);
							var5 += var9;
							var3 += var7;
							var0 += DrawingArea.anInt1352;
						}
					}
				} else {
					var4 = var3 <<= 16;
					if (var0 < 0) {
						var4 -= var0 * var9;
						var3 -= var0 * var7;
						var0 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var0, var6, 0, var5 >> 16, var3 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var0, var6, 0, var4 >> 16, var3 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += DrawingArea.anInt1352;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var0, var6, 0, var3 >> 16, var5 >> 16);
									var5 += var8;
									var3 += var7;
									var0 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var0, var6, 0, var3 >> 16, var4 >> 16);
							var4 += var9;
							var3 += var7;
							var0 += DrawingArea.anInt1352;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < DrawingArea.anInt1355) {
				if (var2 > DrawingArea.anInt1355) {
					var2 = DrawingArea.anInt1355;
				}

				if (var0 > DrawingArea.anInt1355) {
					var0 = DrawingArea.anInt1355;
				}

				if (var2 < var0) {
					var3 = var4 <<= 16;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if ((var2 == var1 || var7 >= var8) && (var2 != var1 || var7 <= var9)) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var1, var6, 0, var5 >> 16, var3 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var1, var6, 0, var4 >> 16, var3 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += DrawingArea.anInt1352;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var1, var6, 0, var3 >> 16, var5 >> 16);
									var3 += var7;
									var5 += var9;
									var1 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var1, var6, 0, var3 >> 16, var4 >> 16);
							var3 += var7;
							var4 += var8;
							var1 += DrawingArea.anInt1352;
						}
					}
				} else {
					var5 = var4 <<= 16;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					if (var0 < 0) {
						var3 -= var0 * var9;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var1, var6, 0, var3 >> 16, var4 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var1, var6, 0, var5 >> 16, var4 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += DrawingArea.anInt1352;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method432(DrawingArea.anIntArray1351, var1, var6, 0, var4 >> 16, var3 >> 16);
									var3 += var9;
									var4 += var8;
									var1 += DrawingArea.anInt1352;
								}
							}

							method432(DrawingArea.anIntArray1351, var1, var6, 0, var4 >> 16, var5 >> 16);
							var5 += var7;
							var4 += var8;
							var1 += DrawingArea.anInt1352;
						}
					}
				}
			}
		} else if (var2 < DrawingArea.anInt1355) {
			if (var0 > DrawingArea.anInt1355) {
				var0 = DrawingArea.anInt1355;
			}

			if (var1 > DrawingArea.anInt1355) {
				var1 = DrawingArea.anInt1355;
			}

			if (var0 < var1) {
				var4 = var5 <<= 16;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				if (var0 < 0) {
					var3 -= var0 * var7;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method432(DrawingArea.anIntArray1351, var2, var6, 0, var4 >> 16, var3 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += DrawingArea.anInt1352;
							}
						}

						method432(DrawingArea.anIntArray1351, var2, var6, 0, var4 >> 16, var5 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += DrawingArea.anInt1352;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method432(DrawingArea.anIntArray1351, var2, var6, 0, var3 >> 16, var4 >> 16);
								var4 += var8;
								var3 += var7;
								var2 += DrawingArea.anInt1352;
							}
						}

						method432(DrawingArea.anIntArray1351, var2, var6, 0, var5 >> 16, var4 >> 16);
						var4 += var8;
						var5 += var9;
						var2 += DrawingArea.anInt1352;
					}
				}
			} else {
				var3 = var5 <<= 16;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method432(DrawingArea.anIntArray1351, var2, var6, 0, var4 >> 16, var5 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += DrawingArea.anInt1352;
							}
						}

						method432(DrawingArea.anIntArray1351, var2, var6, 0, var3 >> 16, var5 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += DrawingArea.anInt1352;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method432(DrawingArea.anIntArray1351, var2, var6, 0, var5 >> 16, var4 >> 16);
								var4 += var7;
								var5 += var9;
								var2 += DrawingArea.anInt1352;
							}
						}

						method432(DrawingArea.anIntArray1351, var2, var6, 0, var5 >> 16, var3 >> 16);
						var3 += var8;
						var5 += var9;
						var2 += DrawingArea.anInt1352;
					}
				}
			}
		}
	}

	public static void method429(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = 0;
		int var10 = 0;
		if (var0 != var1) {
			var9 = (var4 - var3 << 16) / (var1 - var0);
			var10 = (var7 - var6 << 15) / (var1 - var0);
		}

		int var11 = 0;
		int var12 = 0;
		if (var2 != var1) {
			var11 = (var5 - var4 << 16) / (var2 - var1);
			var12 = (var8 - var7 << 15) / (var2 - var1);
		}

		int var13 = 0;
		int var14 = 0;
		if (var0 != var2) {
			var13 = (var3 - var5 << 16) / (var0 - var2);
			var14 = (var6 - var8 << 15) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < DrawingArea.anInt1355) {
				if (var1 > DrawingArea.anInt1355) {
					var1 = DrawingArea.anInt1355;
				}

				if (var2 > DrawingArea.anInt1355) {
					var2 = DrawingArea.anInt1355;
				}

				if (var1 < var2) {
					var5 = var3 <<= 16;
					var8 = var6 <<= 15;
					if (var0 < 0) {
						var5 -= var0 * var13;
						var3 -= var0 * var9;
						var8 -= var0 * var14;
						var6 -= var0 * var10;
						var0 = 0;
					}

					var4 <<= 16;
					var7 <<= 15;
					if (var1 < 0) {
						var4 -= var11 * var1;
						var7 -= var12 * var1;
						var1 = 0;
					}

					if (var0 != var1 && var13 < var9 || var0 == var1 && var13 > var11) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var0, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
									var5 += var13;
									var4 += var11;
									var8 += var14;
									var7 += var12;
									var0 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var0, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
							var5 += var13;
							var3 += var9;
							var8 += var14;
							var6 += var10;
							var0 += DrawingArea.anInt1352;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var0, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
									var5 += var13;
									var4 += var11;
									var8 += var14;
									var7 += var12;
									var0 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var0, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
							var5 += var13;
							var3 += var9;
							var8 += var14;
							var6 += var10;
							var0 += DrawingArea.anInt1352;
						}
					}
				} else {
					var4 = var3 <<= 16;
					var7 = var6 <<= 15;
					if (var0 < 0) {
						var4 -= var0 * var13;
						var3 -= var0 * var9;
						var7 -= var0 * var14;
						var6 -= var0 * var10;
						var0 = 0;
					}

					var5 <<= 16;
					var8 <<= 15;
					if (var2 < 0) {
						var5 -= var11 * var2;
						var8 -= var12 * var2;
						var2 = 0;
					}

					if (var0 != var2 && var13 < var9 || var0 == var2 && var11 > var9) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var0, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
									var5 += var11;
									var3 += var9;
									var8 += var12;
									var6 += var10;
									var0 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var0, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
							var4 += var13;
							var3 += var9;
							var7 += var14;
							var6 += var10;
							var0 += DrawingArea.anInt1352;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var0, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
									var5 += var11;
									var3 += var9;
									var8 += var12;
									var6 += var10;
									var0 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var0, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
							var4 += var13;
							var3 += var9;
							var7 += var14;
							var6 += var10;
							var0 += DrawingArea.anInt1352;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < DrawingArea.anInt1355) {
				if (var2 > DrawingArea.anInt1355) {
					var2 = DrawingArea.anInt1355;
				}

				if (var0 > DrawingArea.anInt1355) {
					var0 = DrawingArea.anInt1355;
				}

				if (var2 < var0) {
					var3 = var4 <<= 16;
					var6 = var7 <<= 15;
					if (var1 < 0) {
						var3 -= var9 * var1;
						var4 -= var11 * var1;
						var6 -= var10 * var1;
						var7 -= var12 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					var8 <<= 15;
					if (var2 < 0) {
						var5 -= var13 * var2;
						var8 -= var14 * var2;
						var2 = 0;
					}

					if ((var2 == var1 || var9 >= var11) && (var2 != var1 || var9 <= var13)) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var1, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
									var3 += var9;
									var5 += var13;
									var6 += var10;
									var8 += var14;
									var1 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var1, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
							var3 += var9;
							var4 += var11;
							var6 += var10;
							var7 += var12;
							var1 += DrawingArea.anInt1352;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var1, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
									var3 += var9;
									var5 += var13;
									var6 += var10;
									var8 += var14;
									var1 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var1, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
							var3 += var9;
							var4 += var11;
							var6 += var10;
							var7 += var12;
							var1 += DrawingArea.anInt1352;
						}
					}
				} else {
					var5 = var4 <<= 16;
					var8 = var7 <<= 15;
					if (var1 < 0) {
						var5 -= var9 * var1;
						var4 -= var11 * var1;
						var8 -= var10 * var1;
						var7 -= var12 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					var6 <<= 15;
					if (var0 < 0) {
						var3 -= var0 * var13;
						var6 -= var0 * var14;
						var0 = 0;
					}

					if (var9 < var11) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var1, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
									var3 += var13;
									var4 += var11;
									var6 += var14;
									var7 += var12;
									var1 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var1, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
							var5 += var9;
							var4 += var11;
							var8 += var10;
							var7 += var12;
							var1 += DrawingArea.anInt1352;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method430(DrawingArea.anIntArray1351, var1, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
									var3 += var13;
									var4 += var11;
									var6 += var14;
									var7 += var12;
									var1 += DrawingArea.anInt1352;
								}
							}

							method430(DrawingArea.anIntArray1351, var1, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
							var5 += var9;
							var4 += var11;
							var8 += var10;
							var7 += var12;
							var1 += DrawingArea.anInt1352;
						}
					}
				}
			}
		} else if (var2 < DrawingArea.anInt1355) {
			if (var0 > DrawingArea.anInt1355) {
				var0 = DrawingArea.anInt1355;
			}

			if (var1 > DrawingArea.anInt1355) {
				var1 = DrawingArea.anInt1355;
			}

			if (var0 < var1) {
				var4 = var5 <<= 16;
				var7 = var8 <<= 15;
				if (var2 < 0) {
					var4 -= var11 * var2;
					var5 -= var13 * var2;
					var7 -= var12 * var2;
					var8 -= var14 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				var6 <<= 15;
				if (var0 < 0) {
					var3 -= var0 * var9;
					var6 -= var0 * var10;
					var0 = 0;
				}

				if (var11 < var13) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method430(DrawingArea.anIntArray1351, var2, 0, 0, var4 >> 16, var3 >> 16, var7 >> 7, var6 >> 7);
								var4 += var11;
								var3 += var9;
								var7 += var12;
								var6 += var10;
								var2 += DrawingArea.anInt1352;
							}
						}

						method430(DrawingArea.anIntArray1351, var2, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
						var4 += var11;
						var5 += var13;
						var7 += var12;
						var8 += var14;
						var2 += DrawingArea.anInt1352;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method430(DrawingArea.anIntArray1351, var2, 0, 0, var3 >> 16, var4 >> 16, var6 >> 7, var7 >> 7);
								var4 += var11;
								var3 += var9;
								var7 += var12;
								var6 += var10;
								var2 += DrawingArea.anInt1352;
							}
						}

						method430(DrawingArea.anIntArray1351, var2, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
						var4 += var11;
						var5 += var13;
						var7 += var12;
						var8 += var14;
						var2 += DrawingArea.anInt1352;
					}
				}
			} else {
				var3 = var5 <<= 16;
				var6 = var8 <<= 15;
				if (var2 < 0) {
					var3 -= var11 * var2;
					var5 -= var13 * var2;
					var6 -= var12 * var2;
					var8 -= var14 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				var7 <<= 15;
				if (var1 < 0) {
					var4 -= var9 * var1;
					var7 -= var10 * var1;
					var1 = 0;
				}

				if (var11 < var13) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method430(DrawingArea.anIntArray1351, var2, 0, 0, var4 >> 16, var5 >> 16, var7 >> 7, var8 >> 7);
								var4 += var9;
								var5 += var13;
								var7 += var10;
								var8 += var14;
								var2 += DrawingArea.anInt1352;
							}
						}

						method430(DrawingArea.anIntArray1351, var2, 0, 0, var3 >> 16, var5 >> 16, var6 >> 7, var8 >> 7);
						var3 += var11;
						var5 += var13;
						var6 += var12;
						var8 += var14;
						var2 += DrawingArea.anInt1352;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method430(DrawingArea.anIntArray1351, var2, 0, 0, var5 >> 16, var4 >> 16, var8 >> 7, var7 >> 7);
								var4 += var9;
								var5 += var13;
								var7 += var10;
								var8 += var14;
								var2 += DrawingArea.anInt1352;
							}
						}

						method430(DrawingArea.anIntArray1351, var2, 0, 0, var5 >> 16, var3 >> 16, var8 >> 7, var6 >> 7);
						var3 += var11;
						var5 += var13;
						var6 += var12;
						var8 += var14;
						var2 += DrawingArea.anInt1352;
					}
				}
			}
		}
	}

	public static int[] method426(int var0) {
		anIntArray1417[var0] = anInt1418++;
		if (anIntArrayArray1416[var0] != null) {
			return anIntArrayArray1416[var0];
		} else {
			int[] var1;
			int var4;
			if (anInt1414 > 0) {
				var1 = anIntArrayArray1415[--anInt1414];
				anIntArrayArray1415[anInt1414] = null;
			} else {
				int var2 = 0;
				int var3 = -1;

				for (var4 = 0; var4 < anInt1410; ++var4) {
					if (anIntArrayArray1416[var4] != null && (anIntArray1417[var4] < var2 || var3 == -1)) {
						var2 = anIntArray1417[var4];
						var3 = var4;
					}
				}

				var1 = anIntArrayArray1416[var3];
				anIntArrayArray1416[var3] = null;
			}

			anIntArrayArray1416[var0] = var1;
			Class44_Sub3_Sub1_Sub3 var6 = aClass44_Sub3_Sub1_Sub3Array1411[var0];
			int[] var7 = anIntArrayArray1420[var0];
			int var5;
			if (aBoolean1398) {
				aBooleanArray1412[var0] = false;

				for (var4 = 0; var4 < 4096; ++var4) {
					var5 = var1[var4] = var7[var6.aByteArray1445[var4]] & 16316671;
					if (var5 == 0) {
						aBooleanArray1412[var0] = true;
					}

					var1[var4 + 4096] = var5 - (var5 >>> 3) & 16316671;
					var1[var4 + 8192] = var5 - (var5 >>> 2) & 16316671;
					var1[var4 + 12288] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
				}
			} else {
				if (var6.anInt1447 != 64) {
					for (var4 = 0; var4 < 16384; ++var4) {
						var1[var4] = var7[var6.aByteArray1445[var4]];
					}
				} else {
					for (var4 = 0; var4 < 128; ++var4) {
						for (var5 = 0; var5 < 128; ++var5) {
							var1[var5 + (var4 << 7)] = var7[var6.aByteArray1445[(var4 >> 1 << 6) + (var5 >> 1)]];
						}
					}
				}

				aBooleanArray1412[var0] = false;

				for (var4 = 0; var4 < 16384; ++var4) {
					var1[var4] &= 16316671;
					var5 = var1[var4];
					if (var5 == 0) {
						aBooleanArray1412[var0] = true;
					}

					var1[var4 + 16384] = var5 - (var5 >>> 3) & 16316671;
					var1[var4 + 32768] = var5 - (var5 >>> 2) & 16316671;
					var1[var4 + 49152] = var5 - (var5 >>> 2) - (var5 >>> 3) & 16316671;
				}
			}

			return var1;
		}
	}

	public static void method433(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = method426(var18);
		aBoolean1400 = !aBooleanArray1412[var18];
		var10 = var9 - var10;
		var13 = var12 - var13;
		var16 = var15 - var16;
		var11 -= var9;
		var14 -= var12;
		var17 -= var15;
		int var20 = var11 * var12 - var9 * var14 << 14;
		int var21 = var15 * var14 - var17 * var12 << 8;
		int var22 = var17 * var9 - var11 * var15 << 5;
		int var23 = var10 * var12 - var13 * var9 << 14;
		int var24 = var13 * var15 - var16 * var12 << 8;
		int var25 = var16 * var9 - var10 * var15 << 5;
		int var26 = var13 * var11 - var10 * var14 << 14;
		int var27 = var16 * var14 - var13 * var17 << 8;
		int var28 = var17 * var10 - var11 * var16 << 5;
		int var29 = 0;
		int var30 = 0;
		if (var0 != var1) {
			var29 = (var4 - var3 << 16) / (var1 - var0);
			var30 = (var7 - var6 << 16) / (var1 - var0);
		}

		int var31 = 0;
		int var32 = 0;
		if (var2 != var1) {
			var31 = (var5 - var4 << 16) / (var2 - var1);
			var32 = (var8 - var7 << 16) / (var2 - var1);
		}

		int var33 = 0;
		int var34 = 0;
		if (var0 != var2) {
			var33 = (var3 - var5 << 16) / (var0 - var2);
			var34 = (var6 - var8 << 16) / (var0 - var2);
		}

		int var35;
		if (var0 <= var1 && var0 <= var2) {
			if (var0 < DrawingArea.anInt1355) {
				if (var1 > DrawingArea.anInt1355) {
					var1 = DrawingArea.anInt1355;
				}

				if (var2 > DrawingArea.anInt1355) {
					var2 = DrawingArea.anInt1355;
				}

				if (var1 < var2) {
					var5 = var3 <<= 16;
					var8 = var6 <<= 16;
					if (var0 < 0) {
						var5 -= var0 * var33;
						var3 -= var0 * var29;
						var8 -= var0 * var34;
						var6 -= var0 * var30;
						var0 = 0;
					}

					var4 <<= 16;
					var7 <<= 16;
					if (var1 < 0) {
						var4 -= var31 * var1;
						var7 -= var32 * var1;
						var1 = 0;
					}

					var35 = var0 - anInt1404;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if ((var0 == var1 || var33 >= var29) && (var0 != var1 || var33 <= var31)) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
									var5 += var33;
									var4 += var31;
									var8 += var34;
									var7 += var32;
									var0 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
							var5 += var33;
							var3 += var29;
							var8 += var34;
							var6 += var30;
							var0 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
									var5 += var33;
									var4 += var31;
									var8 += var34;
									var7 += var32;
									var0 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
							var5 += var33;
							var3 += var29;
							var8 += var34;
							var6 += var30;
							var0 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					var4 = var3 <<= 16;
					var7 = var6 <<= 16;
					if (var0 < 0) {
						var4 -= var0 * var33;
						var3 -= var0 * var29;
						var7 -= var0 * var34;
						var6 -= var0 * var30;
						var0 = 0;
					}

					var5 <<= 16;
					var8 <<= 16;
					if (var2 < 0) {
						var5 -= var31 * var2;
						var8 -= var32 * var2;
						var2 = 0;
					}

					var35 = var0 - anInt1404;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (var0 != var2 && var33 < var29 || var0 == var2 && var31 > var29) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
									var5 += var31;
									var3 += var29;
									var8 += var32;
									var6 += var30;
									var0 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
							var4 += var33;
							var3 += var29;
							var7 += var34;
							var6 += var30;
							var0 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray1409[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
									var5 += var31;
									var3 += var29;
									var8 += var32;
									var6 += var30;
									var0 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var0, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
							var4 += var33;
							var3 += var29;
							var7 += var34;
							var6 += var30;
							var0 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < DrawingArea.anInt1355) {
				if (var2 > DrawingArea.anInt1355) {
					var2 = DrawingArea.anInt1355;
				}

				if (var0 > DrawingArea.anInt1355) {
					var0 = DrawingArea.anInt1355;
				}

				if (var2 < var0) {
					var3 = var4 <<= 16;
					var6 = var7 <<= 16;
					if (var1 < 0) {
						var3 -= var29 * var1;
						var4 -= var31 * var1;
						var6 -= var30 * var1;
						var7 -= var32 * var1;
						var1 = 0;
					}

					var5 <<= 16;
					var8 <<= 16;
					if (var2 < 0) {
						var5 -= var33 * var2;
						var8 -= var34 * var2;
						var2 = 0;
					}

					var35 = var1 - anInt1404;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if ((var2 == var1 || var29 >= var31) && (var2 != var1 || var29 <= var33)) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
									var3 += var29;
									var5 += var33;
									var6 += var30;
									var8 += var34;
									var1 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
							var3 += var29;
							var4 += var31;
							var6 += var30;
							var7 += var32;
							var1 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
									var3 += var29;
									var5 += var33;
									var6 += var30;
									var8 += var34;
									var1 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
							var3 += var29;
							var4 += var31;
							var6 += var30;
							var7 += var32;
							var1 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				} else {
					var5 = var4 <<= 16;
					var8 = var7 <<= 16;
					if (var1 < 0) {
						var5 -= var29 * var1;
						var4 -= var31 * var1;
						var8 -= var30 * var1;
						var7 -= var32 * var1;
						var1 = 0;
					}

					var3 <<= 16;
					var6 <<= 16;
					if (var0 < 0) {
						var3 -= var0 * var33;
						var6 -= var0 * var34;
						var0 = 0;
					}

					var35 = var1 - anInt1404;
					var20 += var22 * var35;
					var23 += var25 * var35;
					var26 += var28 * var35;
					if (var29 < var31) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
									var3 += var33;
									var4 += var31;
									var6 += var34;
									var7 += var32;
									var1 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
							var5 += var29;
							var4 += var31;
							var8 += var30;
							var7 += var32;
							var1 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray1409[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
									var3 += var33;
									var4 += var31;
									var6 += var34;
									var7 += var32;
									var1 += DrawingArea.anInt1352;
									var20 += var22;
									var23 += var25;
									var26 += var28;
								}
							}

							method434(DrawingArea.anIntArray1351, var19, 0, 0, var1, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
							var5 += var29;
							var4 += var31;
							var8 += var30;
							var7 += var32;
							var1 += DrawingArea.anInt1352;
							var20 += var22;
							var23 += var25;
							var26 += var28;
						}
					}
				}
			}
		} else if (var2 < DrawingArea.anInt1355) {
			if (var0 > DrawingArea.anInt1355) {
				var0 = DrawingArea.anInt1355;
			}

			if (var1 > DrawingArea.anInt1355) {
				var1 = DrawingArea.anInt1355;
			}

			if (var0 < var1) {
				var4 = var5 <<= 16;
				var7 = var8 <<= 16;
				if (var2 < 0) {
					var4 -= var31 * var2;
					var5 -= var33 * var2;
					var7 -= var32 * var2;
					var8 -= var34 * var2;
					var2 = 0;
				}

				var3 <<= 16;
				var6 <<= 16;
				if (var0 < 0) {
					var3 -= var0 * var29;
					var6 -= var0 * var30;
					var0 = 0;
				}

				var35 = var2 - anInt1404;
				var20 += var22 * var35;
				var23 += var25 * var35;
				var26 += var28 * var35;
				if (var31 < var33) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var4 >> 16, var3 >> 16, var7 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
								var4 += var31;
								var3 += var29;
								var7 += var32;
								var6 += var30;
								var2 += DrawingArea.anInt1352;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}

						method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
						var4 += var31;
						var5 += var33;
						var7 += var32;
						var8 += var34;
						var2 += DrawingArea.anInt1352;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var3 >> 16, var4 >> 16, var6 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
								var4 += var31;
								var3 += var29;
								var7 += var32;
								var6 += var30;
								var2 += DrawingArea.anInt1352;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}

						method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
						var4 += var31;
						var5 += var33;
						var7 += var32;
						var8 += var34;
						var2 += DrawingArea.anInt1352;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				}
			} else {
				var3 = var5 <<= 16;
				var6 = var8 <<= 16;
				if (var2 < 0) {
					var3 -= var31 * var2;
					var5 -= var33 * var2;
					var6 -= var32 * var2;
					var8 -= var34 * var2;
					var2 = 0;
				}

				var4 <<= 16;
				var7 <<= 16;
				if (var1 < 0) {
					var4 -= var29 * var1;
					var7 -= var30 * var1;
					var1 = 0;
				}

				var35 = var2 - anInt1404;
				var20 += var22 * var35;
				var23 += var25 * var35;
				var26 += var28 * var35;
				if (var31 < var33) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var4 >> 16, var5 >> 16, var7 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
								var4 += var29;
								var5 += var33;
								var7 += var30;
								var8 += var34;
								var2 += DrawingArea.anInt1352;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}

						method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var3 >> 16, var5 >> 16, var6 >> 8, var8 >> 8, var20, var23, var26, var21, var24, var27);
						var3 += var31;
						var5 += var33;
						var6 += var32;
						var8 += var34;
						var2 += DrawingArea.anInt1352;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray1409[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var5 >> 16, var4 >> 16, var8 >> 8, var7 >> 8, var20, var23, var26, var21, var24, var27);
								var4 += var29;
								var5 += var33;
								var7 += var30;
								var8 += var34;
								var2 += DrawingArea.anInt1352;
								var20 += var22;
								var23 += var25;
								var26 += var28;
							}
						}

						method434(DrawingArea.anIntArray1351, var19, 0, 0, var2, var5 >> 16, var3 >> 16, var8 >> 8, var6 >> 8, var20, var23, var26, var21, var24, var27);
						var3 += var31;
						var5 += var33;
						var6 += var32;
						var8 += var34;
						var2 += DrawingArea.anInt1352;
						var20 += var22;
						var23 += var25;
						var26 += var28;
					}
				}
			}
		}
	}

	public static void method432(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBoolean1399) {
			if (var5 > DrawingArea.anInt1358) {
				var5 = DrawingArea.anInt1358;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (anInt1402 == 0) {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			} else {
				int var6 = anInt1402;
				int var7 = 256 - anInt1402;
				var2 = (var7 * (var2 & 65280) >> 8 & 65280) + (var7 * (var2 & 16711935) >> 8 & 16711935);

				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = (var6 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var6 * (var0[var1] & 65280) >> 8 & 65280);
						}
					}

					var0[var1++] = (var6 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var6 * (var0[var1] & 65280) >> 8 & 65280);
					var0[var1++] = (var6 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var6 * (var0[var1] & 65280) >> 8 & 65280);
					var0[var1++] = (var6 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var6 * (var0[var1] & 65280) >> 8 & 65280);
					var0[var1++] = (var6 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var6 * (var0[var1] & 65280) >> 8 & 65280);
				}
			}
		}
	}

	public static void method430(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8;
		int var9;
		int var10;
		if (aBoolean1401) {
			if (aBoolean1399) {
				if (var5 - var4 > 3) {
					var8 = (var7 - var6) / (var5 - var4);
				} else {
					var8 = 0;
				}

				if (var5 > DrawingArea.anInt1358) {
					var5 = DrawingArea.anInt1358;
				}

				if (var4 < 0) {
					var6 -= var8 * var4;
					var4 = 0;
				}

				if (var4 >= var5) {
					return;
				}

				var1 += var4;
				var3 = var5 - var4 >> 2;
				var8 <<= 2;
			} else {
				if (var4 >= var5) {
					return;
				}

				var1 += var4;
				var3 = var5 - var4 >> 2;
				if (var3 > 0) {
					var8 = (var7 - var6) * anIntArray1405[var3] >> 15;
				} else {
					var8 = 0;
				}
			}

			if (anInt1402 != 0) {
				var9 = anInt1402;
				var10 = 256 - anInt1402;

				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						if (var3 > 0) {
							var2 = anIntArray1419[var6 >> 8];
							var2 = (var10 * (var2 & 65280) >> 8 & 65280) + (var10 * (var2 & 16711935) >> 8 & 16711935);

							do {
								var0[var1++] = (var9 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var9 * (var0[var1] & 65280) >> 8 & 65280);
								--var3;
							} while(var3 > 0);
						}
						break;
					}

					var2 = anIntArray1419[var6 >> 8];
					var6 += var8;
					var2 = (var10 * (var2 & 65280) >> 8 & 65280) + (var10 * (var2 & 16711935) >> 8 & 16711935);
					var0[var1++] = (var9 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var9 * (var0[var1] & 65280) >> 8 & 65280);
					var0[var1++] = (var9 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var9 * (var0[var1] & 65280) >> 8 & 65280);
					var0[var1++] = (var9 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var9 * (var0[var1] & 65280) >> 8 & 65280);
					var0[var1++] = (var9 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var9 * (var0[var1] & 65280) >> 8 & 65280);
				}
			} else {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;
						if (var3 > 0) {
							var2 = anIntArray1419[var6 >> 8];

							do {
								var0[var1++] = var2;
								--var3;
							} while(var3 > 0);

							return;
						}
						break;
					}

					var2 = anIntArray1419[var6 >> 8];
					var6 += var8;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			}

		} else if (var4 < var5) {
			var8 = (var7 - var6) / (var5 - var4);
			if (aBoolean1399) {
				if (var5 > DrawingArea.anInt1358) {
					var5 = DrawingArea.anInt1358;
				}

				if (var4 < 0) {
					var6 -= var8 * var4;
					var4 = 0;
				}

				if (var4 >= var5) {
					return;
				}
			}

			var1 += var4;
			var3 = var5 - var4;
			if (anInt1402 == 0) {
				do {
					var0[var1++] = anIntArray1419[var6 >> 8];
					var6 += var8;
					--var3;
				} while(var3 > 0);

			} else {
				var9 = anInt1402;
				var10 = 256 - anInt1402;

				do {
					var2 = anIntArray1419[var6 >> 8];
					var6 += var8;
					var2 = (var10 * (var2 & 65280) >> 8 & 65280) + (var10 * (var2 & 16711935) >> 8 & 16711935);
					var0[var1++] = (var9 * (var0[var1] & 16711935) >> 8 & 16711935) + var2 + (var9 * (var0[var1] & 65280) >> 8 & 65280);
					--var3;
				} while(var3 > 0);

			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public static void method419() {
		anIntArray1409 = new int[DrawingArea.anInt1353];

		for (int var0 = 0; var0 < DrawingArea.anInt1353; ++var0) {
			anIntArray1409[var0] = var0 * DrawingArea.anInt1352;
		}

		anInt1403 = DrawingArea.anInt1352 / 2;
		anInt1404 = DrawingArea.anInt1353 / 2;
	}

	public static void method434(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (var5 < var6) {
			int var15;
			int var16;
			if (aBoolean1399) {
				var15 = (var8 - var7) / (var6 - var5);
				if (var6 > DrawingArea.anInt1358) {
					var6 = DrawingArea.anInt1358;
				}

				if (var5 < 0) {
					var7 -= var5 * var15;
					var5 = 0;
				}

				if (var5 >= var6) {
					return;
				}

				var16 = var6 - var5 >> 3;
				var15 <<= 12;
				var7 <<= 9;
			} else {
				if (var6 - var5 > 7) {
					var16 = var6 - var5 >> 3;
					var15 = anIntArray1405[var16] * (var8 - var7) >> 6;
				} else {
					var16 = 0;
					var15 = 0;
				}

				var7 <<= 9;
			}

			var4 += var5;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			int var24;
			int var25;
			if (aBoolean1398) {
				var17 = 0;
				var18 = 0;
				var19 = var5 - anInt1403;
				var9 += var19 * (var12 >> 3);
				var10 += (var13 >> 3) * var19;
				var11 += var19 * (var14 >> 3);
				var20 = var11 >> 12;
				if (var20 != 0) {
					var2 = var9 / var20;
					var3 = var10 / var20;
					if (var2 < 0) {
						var2 = 0;
					} else if (var2 > 4032) {
						var2 = 4032;
					}
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var20 = var11 >> 12;
				if (var20 != 0) {
					var17 = var9 / var20;
					var18 = var10 / var20;
					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 4032) {
						var17 = 4032;
					}
				}

				var21 = var17 - var2 >> 3;
				var22 = var18 - var3 >> 3;
				var2 += (var7 & 6291456) >> 3;
				var23 = var7 >> 23;
				if (!aBoolean1400) {
					while (var16-- > 0) {
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var25 = var11 >> 12;
						if (var25 != 0) {
							var17 = var9 / var25;
							var18 = var10 / var25;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += (var7 & 6291456) >> 3;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
						if ((var24 = var1[(var2 >> 6) + (var3 & 4032)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
					}

				} else {
					while (var16-- > 0) {
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var24 = var11 >> 12;
						if (var24 != 0) {
							var17 = var9 / var24;
							var18 = var10 / var24;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 4032) {
								var17 = 4032;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += (var7 & 6291456) >> 3;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
						var0[var4++] = var1[(var2 >> 6) + (var3 & 4032)] >>> var23;
						var2 += var21;
					}

				}
			} else {
				var17 = 0;
				var18 = 0;
				var19 = var5 - anInt1403;
				var9 += var19 * (var12 >> 3);
				var10 += (var13 >> 3) * var19;
				var11 += var19 * (var14 >> 3);
				var20 = var11 >> 14;
				if (var20 != 0) {
					var2 = var9 / var20;
					var3 = var10 / var20;
					if (var2 < 0) {
						var2 = 0;
					} else if (var2 > 16256) {
						var2 = 16256;
					}
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var20 = var11 >> 14;
				if (var20 != 0) {
					var17 = var9 / var20;
					var18 = var10 / var20;
					if (var17 < 7) {
						var17 = 7;
					} else if (var17 > 16256) {
						var17 = 16256;
					}
				}

				var21 = var17 - var2 >> 3;
				var22 = var18 - var3 >> 3;
				var2 += var7 & 6291456;
				var23 = var7 >> 23;
				if (!aBoolean1400) {
					while (var16-- > 0) {
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 += var21;
						var3 += var22;
						if ((var24 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var24;
						}

						++var4;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var25 = var11 >> 14;
						if (var25 != 0) {
							var17 = var9 / var25;
							var18 = var10 / var25;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 16256) {
								var17 = 16256;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += var7 & 6291456;
						var23 = var7 >> 23;
					}

					for (var24 = var6 - var5 & 7; var24-- > 0; var3 += var22) {
						if ((var25 = var1[(var3 & 16256) + (var2 >> 7)] >>> var23) != 0) {
							var0[var4] = var25;
						}

						++var4;
						var2 += var21;
					}

				} else {
					while (var16-- > 0) {
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
						var3 += var22;
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 = var17;
						var3 = var18;
						var9 += var12;
						var10 += var13;
						var11 += var14;
						var24 = var11 >> 14;
						if (var24 != 0) {
							var17 = var9 / var24;
							var18 = var10 / var24;
							if (var17 < 7) {
								var17 = 7;
							} else if (var17 > 16256) {
								var17 = 16256;
							}
						}

						var21 = var17 - var2 >> 3;
						var22 = var18 - var3 >> 3;
						var7 += var15;
						var2 += var7 & 6291456;
						var23 = var7 >> 23;
					}

					for (var16 = var6 - var5 & 7; var16-- > 0; var3 += var22) {
						var0[var4++] = var1[(var3 & 16256) + (var2 >> 7)] >>> var23;
						var2 += var21;
					}

				}
			}
		}
	}

	public static int method424(boolean var0, int var1) {
		if (anIntArray1413[var1] != 0) {
			return anIntArray1413[var1];
		} else {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = anIntArrayArray1420[var1].length;

			int var6;
			for (var6 = 0; var6 < var5; ++var6) {
				var2 += anIntArrayArray1420[var1][var6] >> 16 & 255;
				var3 += anIntArrayArray1420[var1][var6] >> 8 & 255;
				var4 += anIntArrayArray1420[var1][var6] & 255;
			}

			var6 = var4 / var5 + (var2 / var5 << 16) + (var3 / var5 << 8);
			var6 = method428(var6, 1.4D);
			if (var6 == 0) {
				var6 = 1;
			}

			anIntArray1413[var1] = var6;
			return var6;
		}
	}

	public static void method418(byte var0) {
		anIntArray1405 = null;
		anIntArray1405 = null;
		anIntArray1407 = null;
		anIntArray1408 = null;
		anIntArray1409 = null;
		aClass44_Sub3_Sub1_Sub3Array1411 = null;
		aBooleanArray1412 = null;
		anIntArray1413 = null;
		anIntArrayArray1415 = null;
		anIntArrayArray1416 = null;
		anIntArray1417 = null;
		if (var0 == 1) {
			boolean var2 = false;
		} else {
			for (int var1 = 1; var1 > 0; ++var1) {
			}
		}

		anIntArray1419 = null;
		anIntArrayArray1420 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(LClass47;I)V",
		garbageValue = "0"
	)
	public static void method423(Class47 var0) {
		anInt1410 = 0;

		for (int var1 = 0; var1 < 50; ++var1) {
			try {
				aClass44_Sub3_Sub1_Sub3Array1411[var1] = new Class44_Sub3_Sub1_Sub3(var0, String.valueOf(var1), 0);
				if (aBoolean1398 && aClass44_Sub3_Sub1_Sub3Array1411[var1].anInt1451 == 128) {
					aClass44_Sub3_Sub1_Sub3Array1411[var1].method448((byte)9);
				} else {
					aClass44_Sub3_Sub1_Sub3Array1411[var1].method449();
				}

				++anInt1410;
			} catch (Exception var3) {
			}
		}

	}

	public static void method420(int var0, int var1, int var2) {
		anIntArray1409 = new int[var2];

		for (int var3 = 0; var3 < var2; ++var3) {
			anIntArray1409[var3] = var0 * var3;
		}

		anInt1403 = var0 / 2;
		anInt1404 = var2 / 2;
	}
}
