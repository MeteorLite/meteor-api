import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub1_Sub3 extends DrawingArea {
	public int anInt1451;
	public int anInt1449;
	public final int[] anIntArray1446;
	public int anInt1447;
	public int anInt1448;
	public int anInt1438;
	public int anInt1450;
	public final boolean aBoolean1439;
	public int anInt1452;
	public byte[] aByteArray1445;
	public final int anInt1440;
	public final int anInt1441;
	public final byte aByte1442;
	public final boolean aBoolean1443;

	public Class44_Sub3_Sub1_Sub3(Class47 var1, String var2, int var3) {
		this.anInt1438 = -41441;
		this.aBoolean1439 = true;
		this.anInt1440 = 35961;
		this.anInt1441 = -676;
		this.aByte1442 = 9;
		this.aBoolean1443 = true;
		Buffer var4 = new Buffer(var1.method546(var2 + ".dat", (byte[])null), (byte)1);
		Buffer var5 = new Buffer(var1.method546("index.dat", (byte[])null), (byte)1);
		var5.anInt1374 = var4.get2();
		this.anInt1451 = var5.get2();
		this.anInt1452 = var5.get2();
		int var6 = var5.get1();
		this.anIntArray1446 = new int[var6];

		int var7;
		for (var7 = 0; var7 < var6 - 1; ++var7) {
			this.anIntArray1446[var7 + 1] = var5.get3();
		}

		for (var7 = 0; var7 < var3; ++var7) {
			var5.anInt1374 += 2;
			var4.anInt1374 += var5.get2() * var5.get2();
			++var5.anInt1374;
		}

		this.anInt1449 = var5.get1();
		this.anInt1450 = var5.get1();
		this.anInt1447 = var5.get2();
		this.anInt1448 = var5.get2();
		var7 = var5.get1();
		int var8 = this.anInt1447 * this.anInt1448;
		this.aByteArray1445 = new byte[var8];
		int var9;
		if (var7 == 0) {
			for (var9 = 0; var9 < var8; ++var9) {
				this.aByteArray1445[var9] = var4.get1Signed();
			}

		} else {
			if (var7 == 1) {
				for (var9 = 0; var9 < this.anInt1447; ++var9) {
					for (int var10 = 0; var10 < this.anInt1448; ++var10) {
						this.aByteArray1445[var9 + var10 * this.anInt1447] = var4.get1Signed();
					}
				}
			}

		}
	}

	public void method453(byte var1, int var2, int var3) {
		var2 += this.anInt1449;
		var3 += this.anInt1450;
		int var4 = var3 * DrawingArea.anInt1352 + var2;
		int var5 = 0;
		int var6 = this.anInt1448;
		int var7 = this.anInt1447;
		int var8 = DrawingArea.anInt1352 - var7;
		int var9 = 0;
		int var10;
		if (var3 < DrawingArea.anInt1354) {
			var10 = DrawingArea.anInt1354 - var3;
			var6 -= var10;
			var3 = DrawingArea.anInt1354;
			var5 += var10 * var7;
			var4 += var10 * DrawingArea.anInt1352;
		}

		if (var3 + var6 > DrawingArea.anInt1355) {
			var6 -= var3 + var6 - DrawingArea.anInt1355;
		}

		if (var2 < DrawingArea.anInt1356) {
			var10 = DrawingArea.anInt1356 - var2;
			var7 -= var10;
			var2 = DrawingArea.anInt1356;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 + var2 > DrawingArea.anInt1357) {
			var10 = var7 + var2 - DrawingArea.anInt1357;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			this.method454(var9, (byte)-55, var8, var5, var6, var7, DrawingArea.anIntArray1351, this.aByteArray1445, var4, this.anIntArray1446);
			if (var1 != 7) {
				this.anInt1438 = -485;
			}

		}
	}

	public void method454(int var1, byte var2, int var3, int var4, int var5, int var6, int[] var7, byte[] var8, int var9, int[] var10) {
		int var11 = -(var6 >> 2);
		var6 = -(var6 & 3);

		for (int var12 = -var5; var12 < 0; ++var12) {
			int var13;
			byte var14;
			for (var13 = var11; var13 < 0; ++var13) {
				var14 = var8[var4++];
				if (var14 != 0) {
					var7[var9++] = var10[var14 & 255];
				} else {
					++var9;
				}

				var14 = var8[var4++];
				if (var14 != 0) {
					var7[var9++] = var10[var14 & 255];
				} else {
					++var9;
				}

				var14 = var8[var4++];
				if (var14 != 0) {
					var7[var9++] = var10[var14 & 255];
				} else {
					++var9;
				}

				var14 = var8[var4++];
				if (var14 != 0) {
					var7[var9++] = var10[var14 & 255];
				} else {
					++var9;
				}
			}

			for (var13 = var6; var13 < 0; ++var13) {
				var14 = var8[var4++];
				if (var14 != 0) {
					var7[var9++] = var10[var14 & 255];
				} else {
					++var9;
				}
			}

			var9 += var3;
			var4 += var1;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	public void method450() {
		byte[] var1 = new byte[this.anInt1447 * this.anInt1448];
		int var2 = 0;

		for (int var3 = 0; var3 < this.anInt1448; ++var3) {
			for (int var4 = this.anInt1447 - 1; var4 >= 0; --var4) {
				var1[var2++] = this.aByteArray1445[var4 + var3 * this.anInt1447];
			}
		}

		this.aByteArray1445 = var1;
		this.anInt1449 = this.anInt1451 - this.anInt1447 - this.anInt1449;
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	public void method451() {
		byte[] var1 = new byte[this.anInt1447 * this.anInt1448];
		int var2 = 0;

		for (int var3 = this.anInt1448 - 1; var3 >= 0; --var3) {
			for (int var4 = 0; var4 < this.anInt1447; ++var4) {
				var1[var2++] = this.aByteArray1445[var4 + var3 * this.anInt1447];
			}
		}

		this.aByteArray1445 = var1;
		this.anInt1450 = this.anInt1452 - this.anInt1448 - this.anInt1450;
	}

	public void method452(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.anIntArray1446.length; ++var5) {
			int var6 = this.anIntArray1446[var5] >> 16 & 255;
			var6 += var3;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.anIntArray1446[var5] >> 8 & 255;
			var7 += var4;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			int var8 = this.anIntArray1446[var5] & 255;
			var8 += var1;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 255) {
				var8 = 255;
			}

			this.anIntArray1446[var5] = var8 + (var7 << 8) + (var6 << 16);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method449() {
		if (this.anInt1447 != this.anInt1451 || this.anInt1448 != this.anInt1452) {
			byte[] var1 = new byte[this.anInt1451 * this.anInt1452];
			int var2 = 0;

			for (int var3 = 0; var3 < this.anInt1448; ++var3) {
				for (int var4 = 0; var4 < this.anInt1447; ++var4) {
					var1[var4 + (var3 + this.anInt1450) * this.anInt1451 + this.anInt1449] = this.aByteArray1445[var2++];
				}
			}

			this.aByteArray1445 = var1;
			this.anInt1447 = this.anInt1451;
			this.anInt1448 = this.anInt1452;
			this.anInt1449 = 0;
			this.anInt1450 = 0;
		}
	}

	public void method448(byte var1) {
		this.anInt1451 /= 2;
		this.anInt1452 /= 2;
		byte[] var2 = new byte[this.anInt1451 * this.anInt1452];
		int var3 = 0;

		for (int var4 = 0; var4 < this.anInt1448; ++var4) {
			for (int var5 = 0; var5 < this.anInt1447; ++var5) {
				var2[(var4 + this.anInt1450 >> 1) * this.anInt1451 + (var5 + this.anInt1449 >> 1)] = this.aByteArray1445[var3++];
			}
		}

		this.aByteArray1445 = var2;
		this.anInt1447 = this.anInt1451;
		this.anInt1448 = this.anInt1452;
		this.anInt1449 = 0;
		if (this.aByte1442 == var1) {
			boolean var6 = false;
			this.anInt1450 = 0;
		}
	}
}
