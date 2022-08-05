public class Class6 {
	public static final int[] anIntArray189;
	public static int[] anIntArray186;
	public static final int[] anIntArray190;
	public static int[] anIntArray188;
	public static final int[] anIntArray191;
	public static int[] anIntArray187;
	public static final int[] anIntArray192;
	public static final int[] anIntArray193;
	public final byte aByte167;
	public Class1 aClass1_169;
	public final int[] anIntArray177;
	public final int[] anIntArray178;
	public int anInt184;
	public int anInt185;
	public final int[] anIntArray179;
	public Class1 aClass1_170;
	public int anInt181;
	public Class1 aClass1_171;
	public Class1 aClass1_173;
	public Class1 aClass1_172;
	public Class1 aClass1_174;
	public Class1 aClass1_175;
	public int anInt180;
	public Class2 aClass2_182;
	public Class1 aClass1_176;
	public Class1 aClass1_183;

	static {
		anIntArray189 = new int[5];
		anIntArray190 = new int[5];
		anIntArray191 = new int[5];
		anIntArray192 = new int[5];
		anIntArray193 = new int[5];
	}

	public Class6() {
		this.aByte167 = 6;
		this.anIntArray177 = new int[5];
		this.anIntArray178 = new int[5];
		this.anIntArray179 = new int[5];
		this.anInt181 = 100;
		this.anInt184 = 500;
	}

	public void method190(byte var1, Buffer var2) {
		this.aClass1_169 = new Class1();
		this.aClass1_169.method148((byte)2, var2);
		this.aClass1_170 = new Class1();
		this.aClass1_170.method148((byte)2, var2);
		int var3 = var2.readUByte();
		if (var3 != 0) {
			--var2.offset;
			this.aClass1_171 = new Class1();
			this.aClass1_171.method148((byte)2, var2);
			this.aClass1_172 = new Class1();
			this.aClass1_172.method148((byte)2, var2);
		}

		var3 = var2.readUByte();
		if (var3 != 0) {
			--var2.offset;
			this.aClass1_173 = new Class1();
			this.aClass1_173.method148((byte)2, var2);
			this.aClass1_174 = new Class1();
			this.aClass1_174.method148((byte)2, var2);
		}

		var3 = var2.readUByte();
		if (var3 != 0) {
			--var2.offset;
			this.aClass1_175 = new Class1();
			this.aClass1_175.method148((byte)2, var2);
			this.aClass1_176 = new Class1();
			this.aClass1_176.method148((byte)2, var2);
		}

		for (int var4 = 0; var4 < 10; ++var4) {
			int var5 = var2.readUShortSmart();
			if (var5 == 0) {
				break;
			}

			this.anIntArray177[var4] = var5;
			this.anIntArray178[var4] = var2.readShortSmart();
			this.anIntArray179[var4] = var2.readUShortSmart();
		}

		this.anInt180 = var2.readUShortSmart();
		this.anInt181 = var2.readUShortSmart();
		this.anInt184 = var2.readUShort();
		this.anInt185 = var2.readUShort();
		this.aClass2_182 = new Class2();
		this.aClass1_183 = new Class1();
		this.aClass2_182.method156(var2, this.aByte167, this.aClass1_183);
	}

	public int[] method188(int var1, int var2) {
		for (int var3 = 0; var3 < var1; ++var3) {
			anIntArray186[var3] = 0;
		}

		if (var2 < 10) {
			return anIntArray186;
		} else {
			double var19 = (double)var1 / ((double)var2 + 0.0D);
			this.aClass1_169.method150();
			this.aClass1_170.method150();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.aClass1_171 != null) {
				this.aClass1_171.method150();
				this.aClass1_172.method150();
				var5 = (int)((double)(this.aClass1_171.anInt44 - this.aClass1_171.anInt43) * 32.768D / var19);
				var6 = (int)((double)this.aClass1_171.anInt43 * 32.768D / var19);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.aClass1_173 != null) {
				this.aClass1_173.method150();
				this.aClass1_174.method150();
				var8 = (int)((double)(this.aClass1_173.anInt44 - this.aClass1_173.anInt43) * 32.768D / var19);
				var9 = (int)((double)this.aClass1_173.anInt43 * 32.768D / var19);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.anIntArray177[var11] != 0) {
					anIntArray189[var11] = 0;
					anIntArray190[var11] = (int)((double)this.anIntArray179[var11] * var19);
					anIntArray191[var11] = (this.anIntArray177[var11] << 14) / 100;
					anIntArray192[var11] = (int)((double)(this.aClass1_169.anInt44 - this.aClass1_169.anInt43) * 32.768D * Math.pow(1.0057929410678534D, (double)this.anIntArray178[var11]) / var19);
					anIntArray193[var11] = (int)((double)this.aClass1_169.anInt43 * 32.768D / var19);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.aClass1_169.method151((byte)-7, var1);
				var13 = this.aClass1_170.method151((byte)-7, var1);
				if (this.aClass1_171 != null) {
					var14 = this.aClass1_171.method151((byte)-7, var1);
					var15 = this.aClass1_172.method151((byte)-7, var1);
					var12 += this.method189(-339, this.aClass1_171.anInt45, var7, var15) >> 1;
					var7 = var7 + var6 + (var14 * var5 >> 16);
				}

				if (this.aClass1_173 != null) {
					var14 = this.aClass1_173.method151((byte)-7, var1);
					var15 = this.aClass1_174.method151((byte)-7, var1);
					var13 = var13 * ((this.method189(-339, this.aClass1_173.anInt45, var10, var15) >> 1) + 32768) >> 15;
					var10 = var10 + var9 + (var14 * var8 >> 16);
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.anIntArray177[var14] != 0) {
						var15 = anIntArray190[var14] + var11;
						if (var15 < var1) {
							var10000 = anIntArray186;
							var10000[var15] += this.method189(-339, this.aClass1_169.anInt45, anIntArray189[var14], var13 * anIntArray191[var14] >> 15);
							var10000 = anIntArray189;
							var10000[var14] += (var12 * anIntArray192[var14] >> 16) + anIntArray193[var14];
						}
					}
				}
			}

			int var16;
			int var17;
			if (this.aClass1_175 != null) {
				this.aClass1_175.method150();
				this.aClass1_176.method150();
				var11 = 0;
				boolean var20 = false;
				boolean var21 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.aClass1_175.method151((byte)-7, var1);
					var16 = this.aClass1_176.method151((byte)-7, var1);
					if (var21) {
						var17 = (var15 * (this.aClass1_175.anInt44 - this.aClass1_175.anInt43) >> 8) + this.aClass1_175.anInt43;
					} else {
						var17 = (var16 * (this.aClass1_175.anInt44 - this.aClass1_175.anInt43) >> 8) + this.aClass1_175.anInt43;
					}

					var11 += 256;
					if (var11 >= var17) {
						var11 = 0;
						var21 = !var21;
					}

					if (var21) {
						anIntArray186[var14] = 0;
					}
				}
			}

			if (this.anInt180 > 0 && this.anInt181 > 0) {
				var11 = (int)((double)this.anInt180 * var19);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = anIntArray186;
					var10000[var12] += anIntArray186[var12 - var11] * this.anInt181 / 100;
				}
			}

			if (this.aClass2_182.anIntArray55[0] > 0 || this.aClass2_182.anIntArray55[1] > 0) {
				this.aClass1_183.method150();
				var11 = this.aClass1_183.method151((byte)-7, var1 + 1);
				var12 = this.aClass2_182.method155(0, (float)var11 / 65536.0F, (byte)1);
				var13 = this.aClass2_182.method155(1, (float)var11 / 65536.0F, (byte)1);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					while (var14 < var15) {
						var16 = (int)((long)anIntArray186[var14 + var12] * (long)Class2.anInt62 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)anIntArray186[var14 + var12 - 1 - var17] * (long)Class2.anIntArrayArray60[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)anIntArray186[var14 - 1 - var17] * (long)Class2.anIntArrayArray60[1][var17] >> 16);
						}

						anIntArray186[var14] = var16;
						var11 = this.aClass1_183.method151((byte)-7, var1 + 1);
						++var14;
					}

					short var22 = 128;
					var15 = var22;

					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)anIntArray186[var14 + var12] * (long)Class2.anInt62 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)anIntArray186[var14 + var12 - 1 - var18] * (long)Class2.anIntArrayArray60[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)anIntArray186[var14 - 1 - var18] * (long)Class2.anIntArrayArray60[1][var18] >> 16);
							}

							anIntArray186[var14] = var17;
							var11 = this.aClass1_183.method151((byte)-7, var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)anIntArray186[var14 + var12 - 1 - var18] * (long)Class2.anIntArrayArray60[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)anIntArray186[var14 - 1 - var18] * (long)Class2.anIntArrayArray60[1][var18] >> 16);
								}

								anIntArray186[var14] = var17;
								this.aClass1_183.method151((byte)-7, var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.aClass2_182.method155(0, (float)var11 / 65536.0F, (byte)1);
						var13 = this.aClass2_182.method155(1, (float)var11 / 65536.0F, (byte)1);
						var15 += var22;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (anIntArray186[var11] < -32768) {
					anIntArray186[var11] = -32768;
				}

				if (anIntArray186[var11] > 32767) {
					anIntArray186[var11] = 32767;
				}
			}

			return anIntArray186;
		}
	}

	public int method189(int var1, int var2, int var3, int var4) {
		if (var2 == 1) {
			return (var3 & 32767) < 16384 ? var4 : -var4;
		} else if (var2 == 2) {
			return var4 * anIntArray188[var3 & 32767] >> 14;
		} else if (var2 == 3) {
			return ((var3 & 32767) * var4 >> 14) - var4;
		} else {
			return var2 == 4 ? var4 * anIntArray187[var3 / 2607 & 32767] : 0;
		}
	}

	public static void method187() {
		anIntArray187 = new int[32768];

		int var0;
		for (var0 = 0; var0 < 32768; ++var0) {
			if (Math.random() > 0.5D) {
				anIntArray187[var0] = 1;
			} else {
				anIntArray187[var0] = -1;
			}
		}

		anIntArray188 = new int[32768];

		for (var0 = 0; var0 < 32768; ++var0) {
			anIntArray188[var0] = (int)(Math.sin((double)var0 / 5215.1903D) * 16384.0D);
		}

		anIntArray186 = new int[220500];
	}
}
