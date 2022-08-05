import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class44_Sub3_Sub1_Sub2 extends DrawingArea {
	public int anInt1434;
	public int anInt1436;
	public int[] anIntArray1431;
	public int anInt1421;
	public int anInt1437;
	public int anInt1432;
	public boolean aBoolean1430;
	public int anInt1435;
	public int anInt1433;
	public boolean aBoolean1422;
	public boolean aBoolean1429;
	public final byte aByte1423;
	public final int anInt1424;
	public final int anInt1425;
	public final byte aByte1427;
	public final int anInt1428;
	public int anInt1426;

	public Class44_Sub3_Sub1_Sub2(byte[] var1, Component var2) {
		this.anInt1421 = -407;
		this.aBoolean1422 = true;
		this.aByte1423 = -65;
		this.anInt1424 = 35961;
		this.anInt1425 = -676;
		this.aByte1427 = 3;
		this.anInt1428 = -582;
		this.aBoolean1429 = false;
		this.aBoolean1430 = false;

		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(var1);
			MediaTracker var4 = new MediaTracker(var2);
			var4.addImage(var3, 0);
			var4.waitForAll();
			this.anInt1432 = var3.getWidth(var2);
			this.anInt1433 = var3.getHeight(var2);
			this.anInt1436 = this.anInt1432;
			this.anInt1437 = this.anInt1433;
			this.anInt1434 = 0;
			this.anInt1435 = 0;
			this.anIntArray1431 = new int[this.anInt1432 * this.anInt1433];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.anInt1432, this.anInt1433, this.anIntArray1431, 0, this.anInt1432);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}

	}

	public Class44_Sub3_Sub1_Sub2(int var1, int var2) {
		this.anInt1421 = -407;
		this.aBoolean1422 = true;
		this.aByte1423 = -65;
		this.anInt1424 = 35961;
		this.anInt1425 = -676;
		this.aByte1427 = 3;
		this.anInt1428 = -582;
		this.aBoolean1429 = false;
		this.aBoolean1430 = false;
		this.anIntArray1431 = new int[var2 * var1];
		this.anInt1432 = this.anInt1436 = var1;
		this.anInt1433 = this.anInt1437 = var2;
		this.anInt1434 = this.anInt1435 = 0;
	}

	public Class44_Sub3_Sub1_Sub2(Class47 var1, String var2, int var3) {
		this.anInt1421 = -407;
		this.aBoolean1422 = true;
		this.aByte1423 = -65;
		this.anInt1424 = 35961;
		this.anInt1425 = -676;
		this.aByte1427 = 3;
		this.anInt1428 = -582;
		this.aBoolean1429 = false;
		this.aBoolean1430 = false;
		Buffer var4 = new Buffer(var1.method546(var2 + ".dat", (byte[])null), (byte)1);
		Buffer var5 = new Buffer(var1.method546("index.dat", (byte[])null), (byte)1);
		var5.offset = var4.readUShort();
		this.anInt1436 = var5.readUShort();
		this.anInt1437 = var5.readUShort();
		int var6 = var5.readUByte();
		int[] var7 = new int[var6];

		int var8;
		for (var8 = 0; var8 < var6 - 1; ++var8) {
			var7[var8 + 1] = var5.readMedium();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (var8 = 0; var8 < var3; ++var8) {
			var5.offset += 2;
			var4.offset += var5.readUShort() * var5.readUShort();
			++var5.offset;
		}

		this.anInt1434 = var5.readUByte();
		this.anInt1435 = var5.readUByte();
		this.anInt1432 = var5.readUShort();
		this.anInt1433 = var5.readUShort();
		var8 = var5.readUByte();
		int var9 = this.anInt1432 * this.anInt1433;
		this.anIntArray1431 = new int[var9];
		int var10;
		if (var8 == 0) {
			for (var10 = 0; var10 < var9; ++var10) {
				this.anIntArray1431[var10] = var7[var4.readUByte()];
			}

		} else {
			if (var8 == 1) {
				for (var10 = 0; var10 < this.anInt1432; ++var10) {
					for (int var11 = 0; var11 < this.anInt1433; ++var11) {
						this.anIntArray1431[var10 + var11 * this.anInt1432] = var7[var4.readUByte()];
					}
				}
			}

		}
	}

	public void method438(int var1, boolean var2, int var3) {
		var3 += this.anInt1434;
		var1 += this.anInt1435;
		int var4 = var3 + DrawingArea.anInt1352 * var1;
		int var5 = 0;
		int var6 = this.anInt1433;
		int var7 = this.anInt1432;
		int var8 = DrawingArea.anInt1352 - var7;
		int var9 = 0;
		int var10;
		if (var1 < DrawingArea.anInt1354) {
			var10 = DrawingArea.anInt1354 - var1;
			var6 -= var10;
			var1 = DrawingArea.anInt1354;
			var5 += var10 * var7;
			var4 += var10 * DrawingArea.anInt1352;
		}

		if (var6 + var1 > DrawingArea.anInt1355) {
			var6 -= var6 + var1 - DrawingArea.anInt1355;
		}

		if (var3 < DrawingArea.anInt1356) {
			var10 = DrawingArea.anInt1356 - var3;
			var7 -= var10;
			var3 = DrawingArea.anInt1356;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var3 + var7 > DrawingArea.anInt1357) {
			var10 = var3 + var7 - DrawingArea.anInt1357;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			this.method439(var9, var5, this.anIntArray1431, this.aBoolean1422, var6, var7, var8, var4, DrawingArea.anIntArray1351);
		}

	}

	public void method444(int var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int[] var8, int var9, int var10, int var11) {
		try {
			int var12 = -var3 / 2;
			int var13 = -var4 / 2;
			int var14 = (int)(Math.sin((double)var10 / 326.11D) * 65536.0D);
			int var15 = (int)(Math.cos((double)var10 / 326.11D) * 65536.0D);
			var14 = var14 * var1 >> 8;
			var15 = var15 * var1 >> 8;
			int var16 = var13 * var14 + var12 * var15 + (var2 << 16);
			int var17 = var13 * var15 - var12 * var14 + (var7 << 16);
			int var18 = var5 + var11 * DrawingArea.anInt1352;

			for (var11 = 0; var11 < var4; ++var11) {
				int var19 = var8[var11];
				int var20 = var18 + var19;
				int var21 = var16 + var15 * var19;
				int var22 = var17 - var14 * var19;

				for (var5 = -var6[var11]; var5 < 0; ++var5) {
					DrawingArea.anIntArray1351[var20++] = this.anIntArray1431[this.anInt1432 * (var22 >> 16) + (var21 >> 16)];
					var21 += var15;
					var22 -= var14;
				}

				var16 += var14;
				var17 += var15;
				var18 += DrawingArea.anInt1352;
			}
		} catch (Exception var23) {
		}

	}

	public void method440(byte var1, int var2, int var3) {
		var2 += this.anInt1434;
		var3 += this.anInt1435;
		int var4 = var3 * DrawingArea.anInt1352 + var2;
		int var5 = 0;
		int var6;
		if (var1 != 7) {
			for (var6 = 1; var6 > 0; ++var6) {
			}
		}

		var6 = this.anInt1433;
		int var7 = this.anInt1432;
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
			this.method441(DrawingArea.anIntArray1351, this.anIntArray1431, 0, var5, var4, var7, var6, var8, var9);
		}

	}

	public void method435(boolean var1) {
		if (!var1) {
			this.anInt1421 = 192;
		}

		DrawingArea.initDrawingArea(this.anInt1432, this.anInt1433, this.anIntArray1431, 9);
	}

	public void method445(int var1, int var2, int var3, int var4, double var5, int var7, byte var8, int var9, int var10) {
		try {
			int var11 = -var10 / 2;
			int var12 = -var2 / 2;
			int var13 = (int)(Math.sin(var5) * 65536.0D);
			int var14 = (int)(Math.cos(var5) * 65536.0D);
			var13 = var13 * var7 >> 8;
			var14 = var14 * var7 >> 8;
			int var15 = var12 * var13 + var11 * var14 + (var1 << 16);
			int var16 = var12 * var14 - var11 * var13 + (var9 << 16);
			int var17 = var3 + var4 * DrawingArea.anInt1352;

			for (var4 = 0; var4 < var2; ++var4) {
				int var18 = var17;
				int var19 = var15;
				int var20 = var16;

				for (var3 = -var10; var3 < 0; ++var3) {
					int var21 = this.anIntArray1431[this.anInt1432 * (var20 >> 16) + (var19 >> 16)];
					if (var21 != 0) {
						DrawingArea.anIntArray1351[var18++] = var21;
					} else {
						++var18;
					}

					var19 += var14;
					var20 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += DrawingArea.anInt1352;
			}
		} catch (Exception var22) {
		}

	}

	public void method446(int var1, int var2, Class44_Sub3_Sub1_Sub3 var3, int var4) {
		var2 += this.anInt1434;
		var4 += this.anInt1435;
		int var5 = var2 + var4 * DrawingArea.anInt1352;
		int var6 = 0;
		int var7 = this.anInt1433;
		int var8 = this.anInt1432;
		int var9 = DrawingArea.anInt1352 - var8;
		int var10 = 0;
		int var11;
		if (var4 < DrawingArea.anInt1354) {
			var11 = DrawingArea.anInt1354 - var4;
			var7 -= var11;
			var4 = DrawingArea.anInt1354;
			var6 += var11 * var8;
			var5 += var11 * DrawingArea.anInt1352;
		}

		if (var7 + var4 > DrawingArea.anInt1355) {
			var7 -= var7 + var4 - DrawingArea.anInt1355;
		}

		if (var2 < DrawingArea.anInt1356) {
			var11 = DrawingArea.anInt1356 - var2;
			var8 -= var11;
			var2 = DrawingArea.anInt1356;
			var6 += var11;
			var5 += var11;
			var10 += var11;
			var9 += var11;
		}

		if (var8 + var2 > DrawingArea.anInt1357) {
			var11 = var8 + var2 - DrawingArea.anInt1357;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}

		if (var8 > 0 && var7 > 0) {
			this.method447(DrawingArea.anIntArray1351, var5, var6, var7, 5, var10, var8, 0, var3.aByteArray1445, var9, this.anIntArray1431);
		}

	}

	public void method447(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte[] var9, int var10, int[] var11) {
		int var12 = -(var7 >> 2);
		var7 = -(var7 & 3);

		for (int var13 = -var4; var13 < 0; ++var13) {
			int var14;
			for (var14 = var12; var14 < 0; ++var14) {
				var8 = var11[var3++];
				if (var8 != 0 && var9[var2] == 0) {
					var1[var2++] = var8;
				} else {
					++var2;
				}

				var8 = var11[var3++];
				if (var8 != 0 && var9[var2] == 0) {
					var1[var2++] = var8;
				} else {
					++var2;
				}

				var8 = var11[var3++];
				if (var8 != 0 && var9[var2] == 0) {
					var1[var2++] = var8;
				} else {
					++var2;
				}

				var8 = var11[var3++];
				if (var8 != 0 && var9[var2] == 0) {
					var1[var2++] = var8;
				} else {
					++var2;
				}
			}

			for (var14 = var7; var14 < 0; ++var14) {
				var8 = var11[var3++];
				if (var8 != 0 && var9[var2] == 0) {
					var1[var2++] = var8;
				} else {
					++var2;
				}
			}

			var2 += var10;
			var3 += var6;
		}

	}

	public void method443(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int[] var11) {
		int var12 = 256 - var3;
		if (var8 != 0) {
			this.aBoolean1430 = !this.aBoolean1430;
		}

		for (int var13 = -var10; var13 < 0; ++var13) {
			for (int var14 = -var4; var14 < 0; ++var14) {
				var6 = var11[var9++];
				if (var6 != 0) {
					int var15 = var5[var7];
					var5[var7++] = (var3 * (var6 & 65280) + var12 * (var15 & 65280) & 16711680) + ((var15 & 16711935) * var12 + var3 * (var6 & 16711935) & -16711936) >> 8;
				} else {
					++var7;
				}
			}

			var7 += var1;
			var9 += var2;
		}

	}

	public void method441(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = -(var6 >> 2);
		var6 = -(var6 & 3);

		for (int var11 = -var7; var11 < 0; ++var11) {
			int var12;
			for (var12 = var10; var12 < 0; ++var12) {
				var3 = var2[var4++];
				if (var3 != 0) {
					var1[var5++] = var3;
				} else {
					++var5;
				}

				var3 = var2[var4++];
				if (var3 != 0) {
					var1[var5++] = var3;
				} else {
					++var5;
				}

				var3 = var2[var4++];
				if (var3 != 0) {
					var1[var5++] = var3;
				} else {
					++var5;
				}

				var3 = var2[var4++];
				if (var3 != 0) {
					var1[var5++] = var3;
				} else {
					++var5;
				}
			}

			for (var12 = var6; var12 < 0; ++var12) {
				var3 = var2[var4++];
				if (var3 != 0) {
					var1[var5++] = var3;
				} else {
					++var5;
				}
			}

			var5 += var8;
			var4 += var9;
		}

	}

	public void method439(int var1, int var2, int[] var3, boolean var4, int var5, int var6, int var7, int var8, int[] var9) {
		int var10 = -(var6 >> 2);
		if (!var4) {
			this.anInt1421 = 362;
		}

		var6 = -(var6 & 3);

		for (int var11 = -var5; var11 < 0; ++var11) {
			int var12;
			for (var12 = var10; var12 < 0; ++var12) {
				var9[var8++] = var3[var2++];
				var9[var8++] = var3[var2++];
				var9[var8++] = var3[var2++];
				var9[var8++] = var3[var2++];
			}

			for (var12 = var6; var12 < 0; ++var12) {
				var9[var8++] = var3[var2++];
			}

			var8 += var7;
			var2 += var1;
		}

	}

	public void method442(int var1, int var2, int var3, int var4) {
		var2 += this.anInt1434;
		var1 += this.anInt1435;
		int var5 = var2 + DrawingArea.anInt1352 * var1;
		int var6 = 0;
		int var7 = this.anInt1433;
		int var8 = this.anInt1432;
		int var9 = DrawingArea.anInt1352 - var8;
		int var10 = 0;
		int var11;
		if (var1 < DrawingArea.anInt1354) {
			var11 = DrawingArea.anInt1354 - var1;
			var7 -= var11;
			var1 = DrawingArea.anInt1354;
			var6 += var11 * var8;
			var5 += var11 * DrawingArea.anInt1352;
		}

		if (var7 + var1 > DrawingArea.anInt1355) {
			var7 -= var7 + var1 - DrawingArea.anInt1355;
		}

		if (var2 < DrawingArea.anInt1356) {
			var11 = DrawingArea.anInt1356 - var2;
			var8 -= var11;
			var2 = DrawingArea.anInt1356;
			var6 += var11;
			var5 += var11;
			var10 += var11;
			var9 += var11;
		}

		if (var8 + var2 > DrawingArea.anInt1357) {
			var11 = var8 + var2 - DrawingArea.anInt1357;
			var8 -= var11;
			var10 += var11;
			var9 += var11;
		}

		if (var8 > 0 && var7 > 0) {
			this.method443(var9, var10, var4, var8, DrawingArea.anIntArray1351, 0, var5, this.anInt1426, var6, var7, this.anIntArray1431);
		}

	}

	public void method437(byte var1) {
		int[] var2 = new int[this.anInt1436 * this.anInt1437];

		for (int var3 = 0; var3 < this.anInt1433; ++var3) {
			if (this.anInt1432 >= 0) {
				System.arraycopy(this.anIntArray1431, var3 * this.anInt1432, var2, (var3 + this.anInt1435) * this.anInt1436 + this.anInt1434, this.anInt1432);
			}
		}

		if (var1 == 3) {
			boolean var4 = false;
		} else {
			this.aBoolean1429 = !this.aBoolean1429;
		}

		this.anIntArray1431 = var2;
		this.anInt1432 = this.anInt1436;
		this.anInt1433 = this.anInt1437;
		this.anInt1434 = 0;
		this.anInt1435 = 0;
	}

	public void method436(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.anIntArray1431.length; ++var5) {
			int var6 = this.anIntArray1431[var5];
			if (var6 != 0) {
				int var7 = var6 >> 16 & 255;
				var7 += var3;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var6 >> 8 & 255;
				var8 += var4;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				int var9 = var6 & 255;
				var9 += var1;
				if (var9 < 1) {
					var9 = 1;
				} else if (var9 > 255) {
					var9 = 255;
				}

				this.anIntArray1431[var5] = var9 + (var8 << 8) + (var7 << 16);
			}
		}

	}
}
