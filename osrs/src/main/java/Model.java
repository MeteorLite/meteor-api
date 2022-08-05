import net.runelite.mapping.ObfuscatedSignature;

public class Model extends Renderable {
	public static boolean[] aBooleanArray1560;
	public static int[] anIntArray1585;
	public static int anInt1577;
	public static final Model A_MODEL___1517;
	public static int[] anIntArray1567;
	public static int anInt1583;
	public static int[] anIntArray1586;
	public static int anInt1578;
	public static Class21[] aClass21Array1557;
	public static int[] anIntArray1518;
	public static int anInt1579;
	public static int[] anIntArray1519;
	public static int[] anIntArray1569;
	public static int[] anIntArray1520;
	public static Class43 aClass43_1558;
	public static int[] anIntArray1566;
	public static boolean[] aBooleanArray1559;
	public static int[] anIntArray1573;
	public static int[] anIntArray1521;
	public static int[][] anIntArrayArray1568;
	public static int[] anIntArray1561;
	public static final int[] anIntArray1574;
	public static int[] anIntArray1564;
	public static int anInt1516;
	public static int[] anIntArray1565;
	public static int[] anIntArray1562;
	public static final int[] anIntArray1575;
	public static int[] anIntArray1563;
	public static int[] anIntArray1588;
	public static int anInt1581;
	public static int[][] anIntArrayArray1570;
	public static final int[] anIntArray1576;
	public static final int[] anIntArray1584;
	public static int anInt1582;
	public static int[] anIntArray1571;
	public static int[] anIntArray1572;
	public static int[] anIntArray1587;
	public static boolean aBoolean1580;
	public int anInt1548;
	public int[][] anIntArrayArray1553;
	public int[] anIntArray1551;
	public int[] anIntArray1523;
	public int anInt1522;
	public int anInt1526;
	public boolean aBoolean1508;
	public int anInt1547;
	public int anInt1546;
	public int[] anIntArray1527;
	public int[] anIntArray1552;
	public int[] anIntArray1536;
	public int[] anIntArray1524;
	public int[] anIntArray1525;
	public int[] anIntArray1530;
	public byte aByte1509;
	public Class25[] aClass25Array1556;
	public int[] anIntArray1534;
	public int[] anIntArray1528;
	public int[] anIntArray1533;
	public int[][] anIntArrayArray1554;
	public int anInt1542;
	public byte aByte1510;
	public int[] anIntArray1529;
	public int anInt1538;
	public int[] anIntArray1535;
	public int anInt1543;
	public int anInt1512;
	public boolean aBoolean1555;
	public int[] anIntArray1531;
	public int anInt1544;
	public int anInt1513;
	public int anInt1545;
	public boolean aBoolean1514;
	public int[] anIntArray1532;
	public int anInt1549;
	public int[] anIntArray1539;
	public int[] anIntArray1540;
	public int anInt1537;
	public int[] anIntArray1541;
	public int anInt1550;

	static {
		A_MODEL___1517 = new Model((byte)7);
		anIntArray1518 = new int[2000];
		anIntArray1519 = new int[2000];
		anIntArray1520 = new int[2000];
		anIntArray1521 = new int[2000];
		aBooleanArray1559 = new boolean[4096];
		aBooleanArray1560 = new boolean[4096];
		anIntArray1561 = new int[4096];
		anIntArray1562 = new int[4096];
		anIntArray1563 = new int[4096];
		anIntArray1564 = new int[4096];
		anIntArray1565 = new int[4096];
		anIntArray1566 = new int[4096];
		anIntArray1567 = new int[1500];
		anIntArrayArray1568 = new int[1500][512];
		anIntArray1569 = new int[12];
		anIntArrayArray1570 = new int[12][2000];
		anIntArray1571 = new int[2000];
		anIntArray1572 = new int[2000];
		anIntArray1573 = new int[12];
		anIntArray1574 = new int[10];
		anIntArray1575 = new int[10];
		anIntArray1576 = new int[10];
		anIntArray1584 = new int[1000];
		anIntArray1585 = Class44_Sub3_Sub1_Sub1.anIntArray1407;
		anIntArray1586 = Class44_Sub3_Sub1_Sub1.anIntArray1408;
		anIntArray1587 = Class44_Sub3_Sub1_Sub1.anIntArray1419;
		anIntArray1588 = Class44_Sub3_Sub1_Sub1.anIntArray1406;
	}

	public Model(byte var1) {
		this.aBoolean1508 = true;
		this.aByte1509 = 7;
		this.aByte1510 = 72;
		this.anInt1512 = -643;
		this.anInt1513 = 368;
		this.aBoolean1514 = false;
		this.aBoolean1555 = false;
		if (this.aByte1509 != var1) {
			for (int var2 = 1; var2 > 0; ++var2) {
			}
		}

	}

	public Model(int var1, int var2, Model[] var3) {
		this.aBoolean1508 = true;
		this.aByte1509 = 7;
		this.aByte1510 = 72;
		this.anInt1512 = -643;
		this.anInt1513 = 368;
		this.aBoolean1514 = false;
		this.aBoolean1555 = false;
		++anInt1516;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		this.anInt1522 = 0;
		this.anInt1526 = 0;
		this.anInt1538 = 0;
		this.anInt1537 = -1;

		int var8;
		Model var9;
		for (var8 = 0; var8 < var1; ++var8) {
			var9 = var3[var8];
			if (var9 != null) {
				this.anInt1522 += var9.anInt1522;
				this.anInt1526 += var9.anInt1526;
				this.anInt1538 += var9.anInt1538;
				var4 |= var9.anIntArray1533 != null;
				if (var9.anIntArray1534 != null) {
					var5 = true;
				} else {
					if (this.anInt1537 == -1) {
						this.anInt1537 = var9.anInt1537;
					}

					if (this.anInt1537 != var9.anInt1537) {
						var5 = true;
					}
				}

				var6 |= var9.anIntArray1535 != null;
				var7 |= var9.anIntArray1552 != null;
			}
		}

		this.anIntArray1523 = new int[this.anInt1522];
		this.anIntArray1524 = new int[this.anInt1522];
		this.anIntArray1525 = new int[this.anInt1522];
		this.anIntArray1551 = new int[this.anInt1522];
		this.anIntArray1527 = new int[this.anInt1526];
		this.anIntArray1528 = new int[this.anInt1526];
		this.anIntArray1529 = new int[this.anInt1526];
		this.anIntArray1539 = new int[this.anInt1538];
		this.anIntArray1540 = new int[this.anInt1538];
		this.anIntArray1541 = new int[this.anInt1538];
		if (var4) {
			this.anIntArray1533 = new int[this.anInt1526];
		}

		if (var5) {
			this.anIntArray1534 = new int[this.anInt1526];
		}

		if (var6) {
			this.anIntArray1535 = new int[this.anInt1526];
		}

		if (var7) {
			this.anIntArray1552 = new int[this.anInt1526];
		}

		this.anIntArray1536 = new int[this.anInt1526];
		this.anInt1522 = 0;
		this.anInt1526 = 0;
		this.anInt1538 = 0;

		for (var8 = 0; var8 < var1; ++var8) {
			var9 = var3[var8];
			if (var9 != null) {
				int var10;
				for (var10 = 0; var10 < var9.anInt1526; ++var10) {
					if (var4) {
						if (var9.anIntArray1533 == null) {
							this.anIntArray1533[this.anInt1526] = 0;
						} else {
							this.anIntArray1533[this.anInt1526] = var9.anIntArray1533[var10];
						}
					}

					if (var5) {
						if (var9.anIntArray1534 == null) {
							this.anIntArray1534[this.anInt1526] = var9.anInt1537;
						} else {
							this.anIntArray1534[this.anInt1526] = var9.anIntArray1534[var10];
						}
					}

					if (var6) {
						if (var9.anIntArray1535 == null) {
							this.anIntArray1535[this.anInt1526] = 0;
						} else {
							this.anIntArray1535[this.anInt1526] = var9.anIntArray1535[var10];
						}
					}

					if (var7 && var9.anIntArray1552 != null) {
						this.anIntArray1552[this.anInt1526] = var9.anIntArray1552[var10];
					}

					this.anIntArray1536[this.anInt1526] = var9.anIntArray1536[var10];
					this.anIntArray1527[this.anInt1526] = this.method506(var9, var9.anIntArray1527[var10]);
					this.anIntArray1528[this.anInt1526] = this.method506(var9, var9.anIntArray1528[var10]);
					this.anIntArray1529[this.anInt1526] = this.method506(var9, var9.anIntArray1529[var10]);
					++this.anInt1526;
				}

				for (var10 = 0; var10 < var9.anInt1538; ++var10) {
					this.anIntArray1539[this.anInt1538] = this.method506(var9, var9.anIntArray1539[var10]);
					this.anIntArray1540[this.anInt1538] = this.method506(var9, var9.anIntArray1540[var10]);
					this.anIntArray1541[this.anInt1538] = this.method506(var9, var9.anIntArray1541[var10]);
					++this.anInt1538;
				}
			}
		}

	}

	public Model(boolean var1, byte var2, Model var3, boolean var4) {
		this.aBoolean1508 = true;
		this.aByte1509 = 7;
		this.aByte1510 = 72;
		this.anInt1512 = -643;
		this.anInt1513 = 368;
		this.aBoolean1514 = false;
		this.aBoolean1555 = false;
		++anInt1516;
		this.anInt1522 = var3.anInt1522;
		this.anInt1526 = var3.anInt1526;
		this.anInt1538 = var3.anInt1538;
		if (var4) {
			this.anIntArray1524 = new int[this.anInt1522];
			System.arraycopy(var3.anIntArray1524, 0, this.anIntArray1524, 0, this.anInt1522);
		} else {
			this.anIntArray1524 = var3.anIntArray1524;
		}

		if (var1) {
			this.anIntArray1530 = new int[this.anInt1526];
			this.anIntArray1531 = new int[this.anInt1526];
			this.anIntArray1532 = new int[this.anInt1526];

			int var5;
			for (var5 = 0; var5 < this.anInt1526; ++var5) {
				this.anIntArray1530[var5] = var3.anIntArray1530[var5];
				this.anIntArray1531[var5] = var3.anIntArray1531[var5];
				this.anIntArray1532[var5] = var3.anIntArray1532[var5];
			}

			this.anIntArray1533 = new int[this.anInt1526];
			if (var3.anIntArray1533 == null) {
				for (var5 = 0; var5 < this.anInt1526; ++var5) {
					this.anIntArray1533[var5] = 0;
				}
			} else {
				System.arraycopy(var3.anIntArray1533, 0, this.anIntArray1533, 0, this.anInt1526);
			}

			super.aClass25Array1393 = new Class25[this.anInt1522];

			for (var5 = 0; var5 < this.anInt1522; ++var5) {
				Class25 var6 = super.aClass25Array1393[var5] = new Class25();
				Class25 var7 = var3.aClass25Array1393[var5];
				var6.anInt492 = var7.anInt492;
				var6.anInt493 = var7.anInt493;
				var6.anInt494 = var7.anInt494;
				var6.anInt495 = var7.anInt495;
			}

			this.aClass25Array1556 = var3.aClass25Array1556;
		} else {
			this.anIntArray1530 = var3.anIntArray1530;
			this.anIntArray1531 = var3.anIntArray1531;
			this.anIntArray1532 = var3.anIntArray1532;
			this.anIntArray1533 = var3.anIntArray1533;
		}

		this.anIntArray1523 = var3.anIntArray1523;
		this.anIntArray1525 = var3.anIntArray1525;
		this.anIntArray1536 = var3.anIntArray1536;
		this.anIntArray1535 = var3.anIntArray1535;
		this.anIntArray1534 = var3.anIntArray1534;
		this.anInt1537 = var3.anInt1537;
		this.anIntArray1527 = var3.anIntArray1527;
		this.anIntArray1528 = var3.anIntArray1528;
		this.anIntArray1529 = var3.anIntArray1529;
		this.anIntArray1539 = var3.anIntArray1539;
		this.anIntArray1540 = var3.anIntArray1540;
		if (var2 != this.aByte1510) {
			this.aBoolean1508 = !this.aBoolean1508;
		}

		this.anIntArray1541 = var3.anIntArray1541;
		super.anInt1394 = var3.anInt1394;
		this.anInt1547 = var3.anInt1547;
		this.anInt1546 = var3.anInt1546;
		this.anInt1549 = var3.anInt1549;
		this.anInt1548 = var3.anInt1548;
		this.anInt1542 = var3.anInt1542;
		this.anInt1544 = var3.anInt1544;
		this.anInt1545 = var3.anInt1545;
		this.anInt1543 = var3.anInt1543;
	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2"
	)
	public Model(int var1, int var2) {
		this.aBoolean1508 = true;
		this.aByte1509 = 7;
		this.aByte1510 = 72;
		this.anInt1512 = -643;
		this.anInt1513 = 368;
		this.aBoolean1514 = false;
		this.aBoolean1555 = false;
		++anInt1516;
		Class21 var3 = aClass21Array1557[var1];
		this.anInt1522 = var3.anInt436;
		this.anInt1526 = var3.anInt437;
		this.anInt1538 = var3.anInt438;
		this.anIntArray1523 = new int[this.anInt1522];
		this.anIntArray1524 = new int[this.anInt1522];
		this.anIntArray1525 = new int[this.anInt1522];
		this.anIntArray1527 = new int[this.anInt1526];
		this.anIntArray1528 = new int[this.anInt1526];
		this.anIntArray1529 = new int[this.anInt1526];
		this.anIntArray1539 = new int[this.anInt1538];
		this.anIntArray1540 = new int[this.anInt1538];
		this.anIntArray1541 = new int[this.anInt1538];
		if (var3.anInt443 >= 0) {
			this.anIntArray1551 = new int[this.anInt1522];
		}

		if (var3.anInt447 >= 0) {
			this.anIntArray1533 = new int[this.anInt1526];
		}

		if (var3.anInt448 >= 0) {
			this.anIntArray1534 = new int[this.anInt1526];
		} else {
			this.anInt1537 = -var3.anInt448 - 1;
		}

		if (var3.anInt449 >= 0) {
			this.anIntArray1535 = new int[this.anInt1526];
		}

		if (var3.anInt450 >= 0) {
			this.anIntArray1552 = new int[this.anInt1526];
		}

		this.anIntArray1536 = new int[this.anInt1526];
		Buffer var4 = new Buffer(var3.aByteArray435, (byte)1);
		var4.offset = var3.anInt439;
		Buffer var5 = new Buffer(var3.aByteArray435, (byte)1);
		var5.offset = var3.anInt440;
		Buffer var6 = new Buffer(var3.aByteArray435, (byte)1);
		var6.offset = var3.anInt441;
		Buffer var7 = new Buffer(var3.aByteArray435, (byte)1);
		var7.offset = var3.anInt442;
		Buffer var8 = new Buffer(var3.aByteArray435, (byte)1);
		var8.offset = var3.anInt443;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		for (var12 = 0; var12 < this.anInt1522; ++var12) {
			var13 = var4.readUByte();
			var14 = 0;
			if ((var13 & 1) != 0) {
				var14 = var5.readShortSmart();
			}

			var15 = 0;
			if ((var13 & 2) != 0) {
				var15 = var6.readShortSmart();
			}

			var16 = 0;
			if ((var13 & 4) != 0) {
				var16 = var7.readShortSmart();
			}

			this.anIntArray1523[var12] = var9 + var14;
			this.anIntArray1524[var12] = var10 + var15;
			this.anIntArray1525[var12] = var11 + var16;
			var9 = this.anIntArray1523[var12];
			var10 = this.anIntArray1524[var12];
			var11 = this.anIntArray1525[var12];
			if (this.anIntArray1551 != null) {
				this.anIntArray1551[var12] = var8.readUByte();
			}
		}

		var4.offset = var3.anInt446;
		var5.offset = var3.anInt447;
		var6.offset = var3.anInt448;
		var7.offset = var3.anInt449;
		var8.offset = var3.anInt450;

		for (var12 = 0; var12 < this.anInt1526; ++var12) {
			this.anIntArray1536[var12] = var4.readUShort();
			if (this.anIntArray1533 != null) {
				this.anIntArray1533[var12] = var5.readUByte();
			}

			if (this.anIntArray1534 != null) {
				this.anIntArray1534[var12] = var6.readUByte();
			}

			if (this.anIntArray1535 != null) {
				this.anIntArray1535[var12] = var7.readUByte();
			}

			if (this.anIntArray1552 != null) {
				this.anIntArray1552[var12] = var8.readUByte();
			}
		}

		var4.offset = var3.anInt444;
		var5.offset = var3.anInt445;
		var12 = 0;
		var13 = 0;
		var14 = 0;
		var15 = 0;

		for (var16 = 0; var16 < this.anInt1526; ++var16) {
			int var17 = var5.readUByte();
			if (var17 == 1) {
				var12 = var4.readShortSmart() + var15;
				var13 = var4.readShortSmart() + var12;
				var14 = var4.readShortSmart() + var13;
				var15 = var14;
				this.anIntArray1527[var16] = var12;
				this.anIntArray1528[var16] = var13;
				this.anIntArray1529[var16] = var14;
			}

			if (var17 == 2) {
				var13 = var14;
				var14 = var4.readShortSmart() + var15;
				var15 = var14;
				this.anIntArray1527[var16] = var12;
				this.anIntArray1528[var16] = var13;
				this.anIntArray1529[var16] = var14;
			}

			if (var17 == 3) {
				var12 = var14;
				var14 = var4.readShortSmart() + var15;
				var15 = var14;
				this.anIntArray1527[var16] = var12;
				this.anIntArray1528[var16] = var13;
				this.anIntArray1529[var16] = var14;
			}

			if (var17 == 4) {
				int var18 = var12;
				var12 = var13;
				var13 = var18;
				var14 = var4.readShortSmart() + var15;
				var15 = var14;
				this.anIntArray1527[var16] = var12;
				this.anIntArray1528[var16] = var18;
				this.anIntArray1529[var16] = var14;
			}
		}

		var4.offset = var3.anInt451;

		for (var16 = 0; var16 < this.anInt1538; ++var16) {
			this.anIntArray1539[var16] = var4.readUShort();
			this.anIntArray1540[var16] = var4.readUShort();
			this.anIntArray1541[var16] = var4.readUShort();
		}

	}

	public Model(boolean var1, boolean var2, Model var3, boolean var4, boolean var5) {
		this.aBoolean1508 = true;
		this.aByte1509 = 7;
		this.aByte1510 = 72;
		this.anInt1512 = -643;
		this.anInt1513 = 368;
		this.aBoolean1514 = false;
		this.aBoolean1555 = false;
		++anInt1516;
		this.anInt1522 = var3.anInt1522;
		this.anInt1526 = var3.anInt1526;
		this.anInt1538 = var3.anInt1538;
		int var6;
		if (var5) {
			this.anIntArray1523 = var3.anIntArray1523;
			this.anIntArray1524 = var3.anIntArray1524;
			this.anIntArray1525 = var3.anIntArray1525;
		} else {
			this.anIntArray1523 = new int[this.anInt1522];
			this.anIntArray1524 = new int[this.anInt1522];
			this.anIntArray1525 = new int[this.anInt1522];

			for (var6 = 0; var6 < this.anInt1522; ++var6) {
				this.anIntArray1523[var6] = var3.anIntArray1523[var6];
				this.anIntArray1524[var6] = var3.anIntArray1524[var6];
				this.anIntArray1525[var6] = var3.anIntArray1525[var6];
			}
		}

		if (var1) {
			this.anIntArray1536 = var3.anIntArray1536;
		} else {
			this.anIntArray1536 = new int[this.anInt1526];
			System.arraycopy(var3.anIntArray1536, 0, this.anIntArray1536, 0, this.anInt1526);
		}

		if (var2) {
			this.anIntArray1535 = var3.anIntArray1535;
		} else {
			this.anIntArray1535 = new int[this.anInt1526];
			if (var3.anIntArray1535 == null) {
				for (var6 = 0; var6 < this.anInt1526; ++var6) {
					this.anIntArray1535[var6] = 0;
				}
			} else {
				System.arraycopy(var3.anIntArray1535, 0, this.anIntArray1535, 0, this.anInt1526);
			}
		}

		this.anIntArray1551 = var3.anIntArray1551;
		this.anIntArray1552 = var3.anIntArray1552;
		this.anIntArray1533 = var3.anIntArray1533;
		this.anIntArray1527 = var3.anIntArray1527;
		this.anIntArray1528 = var3.anIntArray1528;
		this.anIntArray1529 = var3.anIntArray1529;
		this.anIntArray1534 = var3.anIntArray1534;
		this.anInt1537 = var3.anInt1537;
		this.anIntArray1539 = var3.anIntArray1539;
		this.anIntArray1540 = var3.anIntArray1540;
		this.anIntArray1541 = var3.anIntArray1541;
	}

	public Model(boolean var1, byte var2, Model[] var3, int var4) {
		this.aBoolean1508 = true;
		this.aByte1509 = 7;
		this.aByte1510 = 72;
		this.anInt1512 = -643;
		this.anInt1513 = 368;
		this.aBoolean1514 = false;
		this.aBoolean1555 = false;
		++anInt1516;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		this.anInt1522 = 0;
		this.anInt1526 = 0;
		this.anInt1538 = 0;
		this.anInt1537 = -1;
		if (var2 != this.aByte1510) {
			throw new NullPointerException();
		} else {
			int var9;
			Model var10;
			for (var9 = 0; var9 < var4; ++var9) {
				var10 = var3[var9];
				if (var10 != null) {
					this.anInt1522 += var10.anInt1522;
					this.anInt1526 += var10.anInt1526;
					this.anInt1538 += var10.anInt1538;
					var5 |= var10.anIntArray1533 != null;
					if (var10.anIntArray1534 != null) {
						var6 = true;
					} else {
						if (this.anInt1537 == -1) {
							this.anInt1537 = var10.anInt1537;
						}

						if (this.anInt1537 != var10.anInt1537) {
							var6 = true;
						}
					}

					var7 |= var10.anIntArray1535 != null;
					var8 |= var10.anIntArray1536 != null;
				}
			}

			this.anIntArray1523 = new int[this.anInt1522];
			this.anIntArray1524 = new int[this.anInt1522];
			this.anIntArray1525 = new int[this.anInt1522];
			this.anIntArray1527 = new int[this.anInt1526];
			this.anIntArray1528 = new int[this.anInt1526];
			this.anIntArray1529 = new int[this.anInt1526];
			this.anIntArray1530 = new int[this.anInt1526];
			this.anIntArray1531 = new int[this.anInt1526];
			this.anIntArray1532 = new int[this.anInt1526];
			this.anIntArray1539 = new int[this.anInt1538];
			this.anIntArray1540 = new int[this.anInt1538];
			this.anIntArray1541 = new int[this.anInt1538];
			if (var5) {
				this.anIntArray1533 = new int[this.anInt1526];
			}

			if (var6) {
				this.anIntArray1534 = new int[this.anInt1526];
			}

			if (var7) {
				this.anIntArray1535 = new int[this.anInt1526];
			}

			if (var8) {
				this.anIntArray1536 = new int[this.anInt1526];
			}

			this.anInt1522 = 0;
			this.anInt1526 = 0;
			this.anInt1538 = 0;

			for (var9 = 0; var9 < var4; ++var9) {
				var10 = var3[var9];
				if (var10 != null) {
					int var11 = this.anInt1522;

					int var12;
					for (var12 = 0; var12 < var10.anInt1522; ++var12) {
						this.anIntArray1523[this.anInt1522] = var10.anIntArray1523[var12];
						this.anIntArray1524[this.anInt1522] = var10.anIntArray1524[var12];
						this.anIntArray1525[this.anInt1522] = var10.anIntArray1525[var12];
						++this.anInt1522;
					}

					for (var12 = 0; var12 < var10.anInt1526; ++var12) {
						this.anIntArray1527[this.anInt1526] = var11 + var10.anIntArray1527[var12];
						this.anIntArray1528[this.anInt1526] = var11 + var10.anIntArray1528[var12];
						this.anIntArray1529[this.anInt1526] = var11 + var10.anIntArray1529[var12];
						this.anIntArray1530[this.anInt1526] = var10.anIntArray1530[var12];
						this.anIntArray1531[this.anInt1526] = var10.anIntArray1531[var12];
						this.anIntArray1532[this.anInt1526] = var10.anIntArray1532[var12];
						if (var5) {
							if (var10.anIntArray1533 == null) {
								this.anIntArray1533[this.anInt1526] = 0;
							} else {
								this.anIntArray1533[this.anInt1526] = var10.anIntArray1533[var12];
							}
						}

						if (var6) {
							if (var10.anIntArray1534 == null) {
								this.anIntArray1534[this.anInt1526] = var10.anInt1537;
							} else {
								this.anIntArray1534[this.anInt1526] = var10.anIntArray1534[var12];
							}
						}

						if (var7) {
							if (var10.anIntArray1535 == null) {
								this.anIntArray1535[this.anInt1526] = 0;
							} else {
								this.anIntArray1535[this.anInt1526] = var10.anIntArray1535[var12];
							}
						}

						if (var8 && var10.anIntArray1536 != null) {
							this.anIntArray1536[this.anInt1526] = var10.anIntArray1536[var12];
						}

						++this.anInt1526;
					}

					for (var12 = 0; var12 < var10.anInt1538; ++var12) {
						this.anIntArray1539[this.anInt1538] = var11 + var10.anIntArray1539[var12];
						this.anIntArray1540[this.anInt1538] = var11 + var10.anIntArray1540[var12];
						this.anIntArray1541[this.anInt1538] = var11 + var10.anIntArray1541[var12];
						++this.anInt1538;
					}
				}
			}

			this.method507(486);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-284"
	)
	public void method511(int var1) {
		if (this.anIntArrayArray1553 != null) {
			if (var1 != -1) {
				Class11 var2 = Class11.method210(var1);
				if (var2 != null) {
					Class9 var3 = var2.aClass9_266;
					anInt1577 = 0;
					anInt1578 = 0;
					anInt1579 = 0;

					for (int var4 = 0; var4 < var2.anInt267; ++var4) {
						int var5 = var2.anIntArray268[var4];
						this.method513(var3.anIntArray255[var5], var3.anIntArrayArray256[var5], var2.anIntArray269[var4], var2.anIntArray270[var4], var2.anIntArray271[var4]);
					}

				}
			}
		}
	}

	public void method526(int var1) {
		int var2 = Class44_Sub3_Sub1_Sub1.anInt1403;
		int var3 = Class44_Sub3_Sub1_Sub1.anInt1404;
		int var4 = 0;
		int var5 = this.anIntArray1527[var1];
		int var6 = this.anIntArray1528[var1];
		int var7 = this.anIntArray1529[var1];
		int var8 = anIntArray1566[var5];
		int var9 = anIntArray1566[var6];
		int var10 = anIntArray1566[var7];
		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			anIntArray1574[var4] = anIntArray1561[var5];
			anIntArray1575[var4] = anIntArray1562[var5];
			anIntArray1576[var4++] = this.anIntArray1530[var1];
		} else {
			var11 = anIntArray1564[var5];
			var12 = anIntArray1565[var5];
			var13 = this.anIntArray1530[var1];
			if (var10 >= 50) {
				var14 = anIntArray1588[var10 - var8] * (50 - var8);
				anIntArray1574[var4] = var2 + (var11 + ((anIntArray1564[var7] - var11) * var14 >> 16) << 9) / 50;
				anIntArray1575[var4] = var3 + (var12 + ((anIntArray1565[var7] - var12) * var14 >> 16) << 9) / 50;
				anIntArray1576[var4++] = var13 + ((this.anIntArray1532[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = anIntArray1588[var9 - var8] * (50 - var8);
				anIntArray1574[var4] = var2 + (var11 + ((anIntArray1564[var6] - var11) * var14 >> 16) << 9) / 50;
				anIntArray1575[var4] = var3 + (var12 + ((anIntArray1565[var6] - var12) * var14 >> 16) << 9) / 50;
				anIntArray1576[var4++] = var13 + ((this.anIntArray1531[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			anIntArray1574[var4] = anIntArray1561[var6];
			anIntArray1575[var4] = anIntArray1562[var6];
			anIntArray1576[var4++] = this.anIntArray1531[var1];
		} else {
			var11 = anIntArray1564[var6];
			var12 = anIntArray1565[var6];
			var13 = this.anIntArray1531[var1];
			if (var8 >= 50) {
				var14 = anIntArray1588[var8 - var9] * (50 - var9);
				anIntArray1574[var4] = var2 + (var11 + ((anIntArray1564[var5] - var11) * var14 >> 16) << 9) / 50;
				anIntArray1575[var4] = var3 + (var12 + ((anIntArray1565[var5] - var12) * var14 >> 16) << 9) / 50;
				anIntArray1576[var4++] = var13 + ((this.anIntArray1530[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = anIntArray1588[var10 - var9] * (50 - var9);
				anIntArray1574[var4] = var2 + (var11 + ((anIntArray1564[var7] - var11) * var14 >> 16) << 9) / 50;
				anIntArray1575[var4] = var3 + (var12 + ((anIntArray1565[var7] - var12) * var14 >> 16) << 9) / 50;
				anIntArray1576[var4++] = var13 + ((this.anIntArray1532[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			anIntArray1574[var4] = anIntArray1561[var7];
			anIntArray1575[var4] = anIntArray1562[var7];
			anIntArray1576[var4++] = this.anIntArray1532[var1];
		} else {
			var11 = anIntArray1564[var7];
			var12 = anIntArray1565[var7];
			var13 = this.anIntArray1532[var1];
			if (var9 >= 50) {
				var14 = anIntArray1588[var9 - var10] * (50 - var10);
				anIntArray1574[var4] = var2 + (var11 + ((anIntArray1564[var6] - var11) * var14 >> 16) << 9) / 50;
				anIntArray1575[var4] = var3 + (var12 + ((anIntArray1565[var6] - var12) * var14 >> 16) << 9) / 50;
				anIntArray1576[var4++] = var13 + ((this.anIntArray1531[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = anIntArray1588[var8 - var10] * (50 - var10);
				anIntArray1574[var4] = var2 + (var11 + ((anIntArray1564[var5] - var11) * var14 >> 16) << 9) / 50;
				anIntArray1575[var4] = var3 + (var12 + ((anIntArray1565[var5] - var12) * var14 >> 16) << 9) / 50;
				anIntArray1576[var4++] = var13 + ((this.anIntArray1530[var1] - var13) * var14 >> 16);
			}
		}

		var11 = anIntArray1574[0];
		var12 = anIntArray1574[1];
		var13 = anIntArray1574[2];
		var14 = anIntArray1575[0];
		int var15 = anIntArray1575[1];
		int var16 = anIntArray1575[2];
		if ((var11 - var12) * (var16 - var15) - (var14 - var15) * (var13 - var12) > 0) {
			Class44_Sub3_Sub1_Sub1.aBoolean1399 = false;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			if (var4 == 3) {
				if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Statics.anInt1358 || var12 > Statics.anInt1358 || var13 > Statics.anInt1358) {
					Class44_Sub3_Sub1_Sub1.aBoolean1399 = true;
				}

				if (this.anIntArray1533 == null) {
					var17 = 0;
				} else {
					var17 = this.anIntArray1533[var1] & 3;
				}

				if (var17 == 0) {
					Class44_Sub3_Sub1_Sub1.method429(var14, var15, var16, var11, var12, var13, anIntArray1576[0], anIntArray1576[1], anIntArray1576[2]);
				} else if (var17 == 1) {
					Class44_Sub3_Sub1_Sub1.method431(var14, var15, var16, var11, var12, var13, anIntArray1587[this.anIntArray1530[var1]]);
				} else if (var17 == 2) {
					var18 = this.anIntArray1533[var1] >> 2;
					var19 = this.anIntArray1539[var18];
					var20 = this.anIntArray1540[var18];
					var21 = this.anIntArray1541[var18];
					Class44_Sub3_Sub1_Sub1.method433(var14, var15, var16, var11, var12, var13, anIntArray1576[0], anIntArray1576[1], anIntArray1576[2], anIntArray1564[var19], anIntArray1564[var20], anIntArray1564[var21], anIntArray1565[var19], anIntArray1565[var20], anIntArray1565[var21], anIntArray1566[var19], anIntArray1566[var20], anIntArray1566[var21], this.anIntArray1536[var1]);
				} else if (var17 == 3) {
					var18 = this.anIntArray1533[var1] >> 2;
					var19 = this.anIntArray1539[var18];
					var20 = this.anIntArray1540[var18];
					var21 = this.anIntArray1541[var18];
					Class44_Sub3_Sub1_Sub1.method433(var14, var15, var16, var11, var12, var13, this.anIntArray1530[var1], this.anIntArray1530[var1], this.anIntArray1530[var1], anIntArray1564[var19], anIntArray1564[var20], anIntArray1564[var21], anIntArray1565[var19], anIntArray1565[var20], anIntArray1565[var21], anIntArray1566[var19], anIntArray1566[var20], anIntArray1566[var21], this.anIntArray1536[var1]);
				}
			}

			if (var4 == 4) {
				if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Statics.anInt1358 || var12 > Statics.anInt1358 || var13 > Statics.anInt1358 || anIntArray1574[3] < 0 || anIntArray1574[3] > Statics.anInt1358) {
					Class44_Sub3_Sub1_Sub1.aBoolean1399 = true;
				}

				if (this.anIntArray1533 == null) {
					var17 = 0;
				} else {
					var17 = this.anIntArray1533[var1] & 3;
				}

				if (var17 == 0) {
					Class44_Sub3_Sub1_Sub1.method429(var14, var15, var16, var11, var12, var13, anIntArray1576[0], anIntArray1576[1], anIntArray1576[2]);
					Class44_Sub3_Sub1_Sub1.method429(var14, var16, anIntArray1575[3], var11, var13, anIntArray1574[3], anIntArray1576[0], anIntArray1576[2], anIntArray1576[3]);
					return;
				}

				if (var17 == 1) {
					var18 = anIntArray1587[this.anIntArray1530[var1]];
					Class44_Sub3_Sub1_Sub1.method431(var14, var15, var16, var11, var12, var13, var18);
					Class44_Sub3_Sub1_Sub1.method431(var14, var16, anIntArray1575[3], var11, var13, anIntArray1574[3], var18);
					return;
				}

				if (var17 == 2) {
					var18 = this.anIntArray1533[var1] >> 2;
					var19 = this.anIntArray1539[var18];
					var20 = this.anIntArray1540[var18];
					var21 = this.anIntArray1541[var18];
					Class44_Sub3_Sub1_Sub1.method433(var14, var15, var16, var11, var12, var13, anIntArray1576[0], anIntArray1576[1], anIntArray1576[2], anIntArray1564[var19], anIntArray1564[var20], anIntArray1564[var21], anIntArray1565[var19], anIntArray1565[var20], anIntArray1565[var21], anIntArray1566[var19], anIntArray1566[var20], anIntArray1566[var21], this.anIntArray1536[var1]);
					Class44_Sub3_Sub1_Sub1.method433(var14, var16, anIntArray1575[3], var11, var13, anIntArray1574[3], anIntArray1576[0], anIntArray1576[2], anIntArray1576[3], anIntArray1564[var19], anIntArray1564[var20], anIntArray1564[var21], anIntArray1565[var19], anIntArray1565[var20], anIntArray1565[var21], anIntArray1566[var19], anIntArray1566[var20], anIntArray1566[var21], this.anIntArray1536[var1]);
					return;
				}

				if (var17 == 3) {
					var18 = this.anIntArray1533[var1] >> 2;
					var19 = this.anIntArray1539[var18];
					var20 = this.anIntArray1540[var18];
					var21 = this.anIntArray1541[var18];
					Class44_Sub3_Sub1_Sub1.method433(var14, var15, var16, var11, var12, var13, this.anIntArray1530[var1], this.anIntArray1530[var1], this.anIntArray1530[var1], anIntArray1564[var19], anIntArray1564[var20], anIntArray1564[var21], anIntArray1565[var19], anIntArray1565[var20], anIntArray1565[var21], anIntArray1566[var19], anIntArray1566[var20], anIntArray1566[var21], this.anIntArray1536[var1]);
					Class44_Sub3_Sub1_Sub1.method433(var14, var16, anIntArray1575[3], var11, var13, anIntArray1574[3], this.anIntArray1530[var1], this.anIntArray1530[var1], this.anIntArray1530[var1], anIntArray1564[var19], anIntArray1564[var20], anIntArray1564[var21], anIntArray1565[var19], anIntArray1565[var20], anIntArray1565[var21], anIntArray1566[var19], anIntArray1566[var20], anIntArray1566[var21], this.anIntArray1536[var1]);
				}
			}
		}

	}

	public void method505(int var1, Model var2, boolean var3) {
		this.anInt1522 = var2.anInt1522;
		this.anInt1526 = var2.anInt1526;
		this.anInt1538 = var2.anInt1538;
		if (anIntArray1518.length < this.anInt1522) {
			anIntArray1518 = new int[this.anInt1522 + 100];
			anIntArray1519 = new int[this.anInt1522 + 100];
			anIntArray1520 = new int[this.anInt1522 + 100];
		}

		this.anIntArray1523 = anIntArray1518;
		this.anIntArray1524 = anIntArray1519;
		this.anIntArray1525 = anIntArray1520;

		int var4;
		for (var4 = 0; var4 < this.anInt1522; ++var4) {
			this.anIntArray1523[var4] = var2.anIntArray1523[var4];
			this.anIntArray1524[var4] = var2.anIntArray1524[var4];
			this.anIntArray1525[var4] = var2.anIntArray1525[var4];
		}

		if (var3) {
			this.anIntArray1535 = var2.anIntArray1535;
		} else {
			if (anIntArray1521.length < this.anInt1526) {
				anIntArray1521 = new int[this.anInt1526 + 100];
			}

			this.anIntArray1535 = anIntArray1521;
			if (var2.anIntArray1535 == null) {
				for (var4 = 0; var4 < this.anInt1526; ++var4) {
					this.anIntArray1535[var4] = 0;
				}
			} else if (this.anInt1526 >= 0) {
				System.arraycopy(var2.anIntArray1535, 0, this.anIntArray1535, 0, this.anInt1526);
			}
		}

		this.anIntArray1533 = var2.anIntArray1533;
		this.anIntArray1536 = var2.anIntArray1536;
		this.anIntArray1534 = var2.anIntArray1534;
		this.anInt1537 = var2.anInt1537;
		this.anIntArrayArray1554 = var2.anIntArrayArray1554;
		this.anIntArrayArray1553 = var2.anIntArrayArray1553;
		this.anIntArray1527 = var2.anIntArray1527;
		this.anIntArray1528 = var2.anIntArray1528;
		this.anIntArray1529 = var2.anIntArray1529;
		this.anIntArray1530 = var2.anIntArray1530;
		this.anIntArray1531 = var2.anIntArray1531;
		this.anIntArray1532 = var2.anIntArray1532;
		this.anIntArray1539 = var2.anIntArray1539;
		this.anIntArray1540 = var2.anIntArray1540;
		this.anIntArray1541 = var2.anIntArray1541;
	}

	public void method517(int var1, int var2) {
		for (int var3 = 0; var3 < this.anInt1526; ++var3) {
			if (this.anIntArray1536[var3] == var1) {
				this.anIntArray1536[var3] = var2;
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "9"
	)
	public void method510() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.anIntArray1551 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.anInt1522; ++var3) {
				var4 = this.anIntArray1551[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.anIntArrayArray1553 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.anIntArrayArray1553[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.anInt1522; this.anIntArrayArray1553[var4][var1[var4]++] = var3++) {
				var4 = this.anIntArray1551[var3];
			}

			this.anIntArray1551 = null;
		}

		if (this.anIntArray1552 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.anInt1526; ++var3) {
				var4 = this.anIntArray1552[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.anIntArrayArray1554 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.anIntArrayArray1554[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.anInt1526; this.anIntArrayArray1554[var4][var1[var4]++] = var3++) {
				var4 = this.anIntArray1552[var3];
			}

			this.anIntArray1552 = null;
		}

	}

	public void method495(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = var5 * var8 - var4 * var6 >> 16;
		int var11 = var2 * var7 + var3 * var10 >> 16;
		int var12 = var3 * this.anInt1546 >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var5 * var6 >> 16;
			int var15 = var14 - this.anInt1546 << 9;
			if (var15 / var13 < Statics.anInt1359) {
				int var16 = var14 + this.anInt1546 << 9;
				if (var16 / var13 > -Statics.anInt1359) {
					int var17 = var3 * var7 - var10 * var2 >> 16;
					int var18 = var2 * this.anInt1546 >> 16;
					int var19 = var17 + var18 << 9;
					if (var19 / var13 > -Statics.anInt1360) {
						int var20 = (var3 * super.anInt1394 >> 16) + var18;
						int var21 = var17 - var20 << 9;
						if (var21 / var13 < Statics.anInt1360) {
							int var22 = var12 + (var2 * super.anInt1394 >> 16);
							boolean var23 = var11 - var22 <= 50;
							boolean var24 = false;
							int var25;
							int var26;
							int var27;
							if (var9 > 0 && aBoolean1580) {
								var25 = var11 - var12;
								if (var25 <= 50) {
									var25 = 50;
								}

								if (var14 > 0) {
									var15 /= var13;
									var16 /= var25;
								} else {
									var16 /= var13;
									var15 /= var25;
								}

								if (var17 > 0) {
									var21 /= var13;
									var19 /= var25;
								} else {
									var19 /= var13;
									var21 /= var25;
								}

								var26 = anInt1581 - Class44_Sub3_Sub1_Sub1.anInt1403;
								var27 = anInt1582 - Class44_Sub3_Sub1_Sub1.anInt1404;
								if (var26 > var15 && var26 < var16 && var27 > var21 && var27 < var19) {
									if (this.aBoolean1555) {
										anIntArray1584[anInt1583++] = var9;
									} else {
										var24 = true;
									}
								}
							}

							var25 = Class44_Sub3_Sub1_Sub1.anInt1403;
							var26 = Class44_Sub3_Sub1_Sub1.anInt1404;
							var27 = 0;
							int var28 = 0;
							if (var1 != 0) {
								var27 = anIntArray1585[var1];
								var28 = anIntArray1586[var1];
							}

							for (int var29 = 0; var29 < this.anInt1522; ++var29) {
								int var30 = this.anIntArray1523[var29];
								int var31 = this.anIntArray1524[var29];
								int var32 = this.anIntArray1525[var29];
								int var33;
								if (var1 != 0) {
									var33 = var32 * var27 + var30 * var28 >> 16;
									var32 = var32 * var28 - var30 * var27 >> 16;
									var30 = var33;
								}

								var30 += var6;
								var31 += var7;
								var32 += var8;
								var33 = var32 * var4 + var5 * var30 >> 16;
								var32 = var5 * var32 - var30 * var4 >> 16;
								var30 = var33;
								var33 = var3 * var31 - var32 * var2 >> 16;
								var32 = var31 * var2 + var3 * var32 >> 16;
								anIntArray1563[var29] = var32 - var11;
								if (var32 >= 50) {
									anIntArray1561[var29] = var25 + (var30 << 9) / var32;
									anIntArray1562[var29] = var26 + (var33 << 9) / var32;
								} else {
									anIntArray1561[var29] = -5000;
									var23 = true;
								}

								if (var23 || this.anInt1538 > 0) {
									anIntArray1564[var29] = var30;
									anIntArray1565[var29] = var33;
									anIntArray1566[var29] = var32;
								}
							}

							try {
								this.method524(var23, var24, var9);
							} catch (Exception var34) {
							}

						}
					}
				}
			}
		}
	}

	public void method512(int var1, int[] var2, int var3, int var4) {
		if (var3 != -1) {
			if (var2 != null && var4 != -1) {
				Class11 var5 = Class11.method210(var3);
				if (var5 != null) {
					Class11 var6 = Class11.method210(var4);
					if (var6 == null) {
						this.method511(var3);
					} else {
						Class9 var7 = var5.aClass9_266;
						anInt1577 = 0;
						anInt1578 = 0;
						anInt1579 = 0;
						byte var8 = 0;
						int var12 = var8 + 1;
						int var9 = var2[var8];

						int var10;
						int var11;
						for (var10 = 0; var10 < var5.anInt267; ++var10) {
							for (var11 = var5.anIntArray268[var10]; var11 > var9; var9 = var2[var12++]) {
							}

							if (var11 != var9 || var7.anIntArray255[var11] == 0) {
								this.method513(var7.anIntArray255[var11], var7.anIntArrayArray256[var11], var5.anIntArray269[var10], var5.anIntArray270[var10], var5.anIntArray271[var10]);
							}
						}

						anInt1577 = 0;
						anInt1578 = 0;
						anInt1579 = 0;
						var8 = 0;
						var12 = var8 + 1;
						var9 = var2[var8];

						for (var10 = 0; var10 < var6.anInt267; ++var10) {
							for (var11 = var6.anIntArray268[var10]; var11 > var9; var9 = var2[var12++]) {
							}

							if (var11 == var9 || var7.anIntArray255[var11] == 0) {
								this.method513(var7.anIntArray255[var11], var7.anIntArrayArray256[var11], var6.anIntArray269[var10], var6.anIntArray270[var10], var6.anIntArray271[var10]);
							}
						}

					}
				}
			} else {
				this.method511(var3);
			}
		}
	}

	public void method525(int var1) {
		if (aBooleanArray1560[var1]) {
			this.method526(var1);
		} else {
			int var2 = this.anIntArray1527[var1];
			int var3 = this.anIntArray1528[var1];
			int var4 = this.anIntArray1529[var1];
			Class44_Sub3_Sub1_Sub1.aBoolean1399 = aBooleanArray1559[var1];
			if (this.anIntArray1535 == null) {
				Class44_Sub3_Sub1_Sub1.anInt1402 = 0;
			} else {
				Class44_Sub3_Sub1_Sub1.anInt1402 = this.anIntArray1535[var1];
			}

			int var5;
			if (this.anIntArray1533 == null) {
				var5 = 0;
			} else {
				var5 = this.anIntArray1533[var1] & 3;
			}

			if (var5 == 0) {
				Class44_Sub3_Sub1_Sub1.method429(anIntArray1562[var2], anIntArray1562[var3], anIntArray1562[var4], anIntArray1561[var2], anIntArray1561[var3], anIntArray1561[var4], this.anIntArray1530[var1], this.anIntArray1531[var1], this.anIntArray1532[var1]);
			} else if (var5 == 1) {
				Class44_Sub3_Sub1_Sub1.method431(anIntArray1562[var2], anIntArray1562[var3], anIntArray1562[var4], anIntArray1561[var2], anIntArray1561[var3], anIntArray1561[var4], anIntArray1587[this.anIntArray1530[var1]]);
			} else {
				int var6;
				int var7;
				int var8;
				int var9;
				if (var5 == 2) {
					var6 = this.anIntArray1533[var1] >> 2;
					var7 = this.anIntArray1539[var6];
					var8 = this.anIntArray1540[var6];
					var9 = this.anIntArray1541[var6];
					Class44_Sub3_Sub1_Sub1.method433(anIntArray1562[var2], anIntArray1562[var3], anIntArray1562[var4], anIntArray1561[var2], anIntArray1561[var3], anIntArray1561[var4], this.anIntArray1530[var1], this.anIntArray1531[var1], this.anIntArray1532[var1], anIntArray1564[var7], anIntArray1564[var8], anIntArray1564[var9], anIntArray1565[var7], anIntArray1565[var8], anIntArray1565[var9], anIntArray1566[var7], anIntArray1566[var8], anIntArray1566[var9], this.anIntArray1536[var1]);
				} else {
					if (var5 == 3) {
						var6 = this.anIntArray1533[var1] >> 2;
						var7 = this.anIntArray1539[var6];
						var8 = this.anIntArray1540[var6];
						var9 = this.anIntArray1541[var6];
						Class44_Sub3_Sub1_Sub1.method433(anIntArray1562[var2], anIntArray1562[var3], anIntArray1562[var4], anIntArray1561[var2], anIntArray1561[var3], anIntArray1561[var4], this.anIntArray1530[var1], this.anIntArray1530[var1], this.anIntArray1530[var1], anIntArray1564[var7], anIntArray1564[var8], anIntArray1564[var9], anIntArray1565[var7], anIntArray1565[var8], anIntArray1565[var9], anIntArray1566[var7], anIntArray1566[var8], anIntArray1566[var9], this.anIntArray1536[var1]);
					}

				}
			}
		}
	}

	public void method516(int var1, int var2, byte var3, int var4) {
		for (int var5 = 0; var5 < this.anInt1522; ++var5) {
			int[] var10000 = this.anIntArray1523;
			var10000[var5] += var1;
			var10000 = this.anIntArray1524;
			var10000[var5] += var2;
			var10000 = this.anIntArray1525;
			var10000[var5] += var4;
		}

	}

	public void method519(int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < this.anInt1522; ++var5) {
			this.anIntArray1523[var5] = var3 * this.anIntArray1523[var5] / 128;
			this.anIntArray1524[var5] = var4 * this.anIntArray1524[var5] / 128;
			this.anIntArray1525[var5] = var2 * this.anIntArray1525[var5] / 128;
		}

	}

	public void method521(int var1, int var2, int var3, int var4, int var5) {
		int var6;
		for (var6 = 0; var6 < this.anInt1526; ++var6) {
			int var7 = this.anIntArray1527[var6];
			int var8 = this.anIntArray1528[var6];
			int var9 = this.anIntArray1529[var6];
			int var10;
			if (this.anIntArray1533 == null) {
				var10 = this.anIntArray1536[var6];
				Class25 var11 = super.aClass25Array1393[var7];
				int var12 = (var4 * var11.anInt493 + var5 * var11.anInt494 + var3 * var11.anInt492) / (var2 * var11.anInt495) + var1;
				this.anIntArray1530[var6] = method522(var10, var12, 0);
				var11 = super.aClass25Array1393[var8];
				var12 = (var4 * var11.anInt493 + var5 * var11.anInt494 + var3 * var11.anInt492) / (var2 * var11.anInt495) + var1;
				this.anIntArray1531[var6] = method522(var10, var12, 0);
				var11 = super.aClass25Array1393[var9];
				var12 = (var4 * var11.anInt493 + var5 * var11.anInt494 + var3 * var11.anInt492) / (var2 * var11.anInt495) + var1;
				this.anIntArray1532[var6] = method522(var10, var12, 0);
			} else if ((this.anIntArray1533[var6] & 1) == 0) {
				var10 = this.anIntArray1536[var6];
				int var14 = this.anIntArray1533[var6];
				Class25 var15 = super.aClass25Array1393[var7];
				int var13 = (var4 * var15.anInt493 + var5 * var15.anInt494 + var3 * var15.anInt492) / (var2 * var15.anInt495) + var1;
				this.anIntArray1530[var6] = method522(var10, var13, var14);
				var15 = super.aClass25Array1393[var8];
				var13 = (var4 * var15.anInt493 + var5 * var15.anInt494 + var3 * var15.anInt492) / (var2 * var15.anInt495) + var1;
				this.anIntArray1531[var6] = method522(var10, var13, var14);
				var15 = super.aClass25Array1393[var9];
				var13 = (var4 * var15.anInt493 + var5 * var15.anInt494 + var3 * var15.anInt492) / (var2 * var15.anInt495) + var1;
				this.anIntArray1532[var6] = method522(var10, var13, var14);
			}
		}

		super.aClass25Array1393 = null;
		this.aClass25Array1556 = null;
		this.anIntArray1551 = null;
		this.anIntArray1552 = null;
		if (this.anIntArray1533 != null) {
			for (var6 = 0; var6 < this.anInt1526; ++var6) {
				if ((this.anIntArray1533[var6] & 2) == 2) {
					return;
				}
			}
		}

		this.anIntArray1536 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "368"
	)
	public void method508() {
		super.anInt1394 = 0;
		this.anInt1547 = 0;

		for (int var1 = 0; var1 < this.anInt1522; ++var1) {
			int var2 = this.anIntArray1524[var1];
			if (-var2 > super.anInt1394) {
				super.anInt1394 = -var2;
			}

			if (var2 > this.anInt1547) {
				this.anInt1547 = var2;
			}
		}

		this.anInt1549 = (int)(Math.sqrt((double)(this.anInt1546 * this.anInt1546 + super.anInt1394 * super.anInt1394)) + 0.99D);
		this.anInt1548 = this.anInt1549 + (int)(Math.sqrt((double)(this.anInt1546 * this.anInt1546 + this.anInt1547 * this.anInt1547)) + 0.99D);
	}

	public void method524(boolean var1, boolean var2, int var3) {
		int var4;
		for (var4 = 0; var4 < this.anInt1548; ++var4) {
			anIntArray1567[var4] = 0;
		}

		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var4 = 0; var4 < this.anInt1526; ++var4) {
			if (this.anIntArray1533 == null || this.anIntArray1533[var4] != -1) {
				var5 = this.anIntArray1527[var4];
				var6 = this.anIntArray1528[var4];
				var7 = this.anIntArray1529[var4];
				var8 = anIntArray1561[var5];
				var9 = anIntArray1561[var6];
				var10 = anIntArray1561[var7];
				if (var1 && (var8 == -5000 || var9 == -5000 || var10 == -5000)) {
					aBooleanArray1560[var4] = true;
					var11 = (anIntArray1563[var5] + anIntArray1563[var6] + anIntArray1563[var7]) / 3 + this.anInt1549;
					anIntArrayArray1568[var11][anIntArray1567[var11]++] = var4;
				} else {
					if (var2 && this.method527(anInt1581, anInt1582, anIntArray1562[var5], anIntArray1562[var6], anIntArray1562[var7], var8, var9, var10)) {
						anIntArray1584[anInt1583++] = var3;
						var2 = false;
					}

					if ((var8 - var9) * (anIntArray1562[var7] - anIntArray1562[var6]) - (var10 - var9) * (anIntArray1562[var5] - anIntArray1562[var6]) > 0) {
						aBooleanArray1560[var4] = false;
						aBooleanArray1559[var4] = var8 < 0 || var9 < 0 || var10 < 0 || var8 > Statics.anInt1358 || var9 > Statics.anInt1358 || var10 > Statics.anInt1358;
						var11 = (anIntArray1563[var5] + anIntArray1563[var6] + anIntArray1563[var7]) / 3 + this.anInt1549;
						anIntArrayArray1568[var11][anIntArray1567[var11]++] = var4;
					}
				}
			}
		}

		int[] var16;
		if (this.anIntArray1534 == null) {
			for (var4 = this.anInt1548 - 1; var4 >= 0; --var4) {
				var5 = anIntArray1567[var4];
				if (var5 > 0) {
					var16 = anIntArrayArray1568[var4];

					for (var7 = 0; var7 < var5; ++var7) {
						this.method525(var16[var7]);
					}
				}
			}

		} else {
			for (var4 = 0; var4 < 12; ++var4) {
				anIntArray1569[var4] = 0;
				anIntArray1573[var4] = 0;
			}

			for (var4 = this.anInt1548 - 1; var4 >= 0; --var4) {
				var5 = anIntArray1567[var4];
				if (var5 > 0) {
					var16 = anIntArrayArray1568[var4];

					for (var7 = 0; var7 < var5; ++var7) {
						var8 = var16[var7];
						var9 = this.anIntArray1534[var8];
						var10 = anIntArray1569[var9]++;
						anIntArrayArray1570[var9][var10] = var8;
						if (var9 < 10) {
							int[] var10000 = anIntArray1573;
							var10000[var9] += var4;
						} else if (var9 == 10) {
							anIntArray1571[var10] = var4;
						} else {
							anIntArray1572[var10] = var4;
						}
					}
				}
			}

			var4 = 0;
			if (anIntArray1569[1] > 0 || anIntArray1569[2] > 0) {
				var4 = (anIntArray1573[1] + anIntArray1573[2]) / (anIntArray1569[1] + anIntArray1569[2]);
			}

			var5 = 0;
			if (anIntArray1569[3] > 0 || anIntArray1569[4] > 0) {
				var5 = (anIntArray1573[3] + anIntArray1573[4]) / (anIntArray1569[3] + anIntArray1569[4]);
			}

			var6 = 0;
			if (anIntArray1569[6] > 0 || anIntArray1569[8] > 0) {
				var6 = (anIntArray1573[8] + anIntArray1573[6]) / (anIntArray1569[8] + anIntArray1569[6]);
			}

			var7 = 0;
			var8 = anIntArray1569[10];
			int[] var17 = anIntArrayArray1570[10];
			int[] var18 = anIntArray1571;
			if (var7 == var8) {
				var7 = 0;
				var8 = anIntArray1569[11];
				var17 = anIntArrayArray1570[11];
				var18 = anIntArray1572;
			}

			if (var7 < var8) {
				var11 = var18[var7];
			} else {
				var11 = -1000;
			}

			for (int var12 = 0; var12 < 10; ++var12) {
				while (var12 == 0 && var11 > var4) {
					this.method525(var17[var7++]);
					if (var7 == var8 && var17 != anIntArrayArray1570[11]) {
						var7 = 0;
						var8 = anIntArray1569[11];
						var17 = anIntArrayArray1570[11];
						var18 = anIntArray1572;
					}

					if (var7 < var8) {
						var11 = var18[var7];
					} else {
						var11 = -1000;
					}
				}

				while (var12 == 3 && var11 > var5) {
					this.method525(var17[var7++]);
					if (var7 == var8 && var17 != anIntArrayArray1570[11]) {
						var7 = 0;
						var8 = anIntArray1569[11];
						var17 = anIntArrayArray1570[11];
						var18 = anIntArray1572;
					}

					if (var7 < var8) {
						var11 = var18[var7];
					} else {
						var11 = -1000;
					}
				}

				while (var12 == 5 && var11 > var6) {
					this.method525(var17[var7++]);
					if (var7 == var8 && var17 != anIntArrayArray1570[11]) {
						var7 = 0;
						var8 = anIntArray1569[11];
						var17 = anIntArrayArray1570[11];
						var18 = anIntArray1572;
					}

					if (var7 < var8) {
						var11 = var18[var7];
					} else {
						var11 = -1000;
					}
				}

				int var13 = anIntArray1569[var12];
				int[] var14 = anIntArrayArray1570[var12];

				for (int var15 = 0; var15 < var13; ++var15) {
					this.method525(var14[var15]);
				}
			}

			while (var11 != -1000) {
				this.method525(var17[var7++]);
				if (var7 == var8 && var17 != anIntArrayArray1570[11]) {
					var7 = 0;
					var17 = anIntArrayArray1570[11];
					var8 = anIntArray1569[11];
					var18 = anIntArray1572;
				}

				if (var7 < var8) {
					var11 = var18[var7];
				} else {
					var11 = -1000;
				}
			}

		}
	}

	public void method507(int var1) {
		super.anInt1394 = 0;
		this.anInt1546 = 0;
		this.anInt1547 = 0;
		var1 = 65 / var1;

		for (int var2 = 0; var2 < this.anInt1522; ++var2) {
			int var3 = this.anIntArray1523[var2];
			int var4 = this.anIntArray1524[var2];
			int var5 = this.anIntArray1525[var2];
			if (-var4 > super.anInt1394) {
				super.anInt1394 = -var4;
			}

			if (var4 > this.anInt1547) {
				this.anInt1547 = var4;
			}

			int var6 = var3 * var3 + var5 * var5;
			if (var6 > this.anInt1546) {
				this.anInt1546 = var6;
			}
		}

		this.anInt1546 = (int)(Math.sqrt((double)this.anInt1546) + 0.99D);
		this.anInt1549 = (int)(Math.sqrt((double)(this.anInt1546 * this.anInt1546 + super.anInt1394 * super.anInt1394)) + 0.99D);
		this.anInt1548 = this.anInt1549 + (int)(Math.sqrt((double)(this.anInt1546 * this.anInt1546 + this.anInt1547 * this.anInt1547)) + 0.99D);
	}

	public void method520(int var1, int var2, int var3, int var4, int var5, boolean var6) {
		int var7 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
		int var8 = var7 * var2 >> 8;
		if (this.anIntArray1530 == null) {
			this.anIntArray1530 = new int[this.anInt1526];
			this.anIntArray1531 = new int[this.anInt1526];
			this.anIntArray1532 = new int[this.anInt1526];
		}

		int var9;
		if (super.aClass25Array1393 == null) {
			super.aClass25Array1393 = new Class25[this.anInt1522];

			for (var9 = 0; var9 < this.anInt1522; ++var9) {
				super.aClass25Array1393[var9] = new Class25();
			}
		}

		for (var9 = 0; var9 < this.anInt1526; ++var9) {
			int var10 = this.anIntArray1527[var9];
			int var11 = this.anIntArray1528[var9];
			int var12 = this.anIntArray1529[var9];
			int var13 = this.anIntArray1523[var11] - this.anIntArray1523[var10];
			int var14 = this.anIntArray1524[var11] - this.anIntArray1524[var10];
			int var15 = this.anIntArray1525[var11] - this.anIntArray1525[var10];
			int var16 = this.anIntArray1523[var12] - this.anIntArray1523[var10];
			int var17 = this.anIntArray1524[var12] - this.anIntArray1524[var10];
			int var18 = this.anIntArray1525[var12] - this.anIntArray1525[var10];
			int var19 = var14 * var18 - var17 * var15;
			int var20 = var15 * var16 - var18 * var13;

			int var21;
			for (var21 = var13 * var17 - var16 * var14; var19 > 8192 || var20 > 8192 || var21 > 8192 || var19 < -8192 || var20 < -8192 || var21 < -8192; var21 >>= 1) {
				var19 >>= 1;
				var20 >>= 1;
			}

			int var22 = (int)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21));
			if (var22 <= 0) {
				var22 = 1;
			}

			var19 = var19 * 256 / var22;
			var20 = var20 * 256 / var22;
			var21 = var21 * 256 / var22;
			if (this.anIntArray1533 != null && (this.anIntArray1533[var9] & 1) != 0) {
				int var26 = (var20 * var4 + var5 * var21 + var3 * var19) / (var8 / 2 + var8) + var1;
				this.anIntArray1530[var9] = method522(this.anIntArray1536[var9], var26, this.anIntArray1533[var9]);
			} else {
				Class25 var23 = super.aClass25Array1393[var10];
				var23.anInt492 += var19;
				var23.anInt493 += var20;
				var23.anInt494 += var21;
				++var23.anInt495;
				var23 = super.aClass25Array1393[var11];
				var23.anInt492 += var19;
				var23.anInt493 += var20;
				var23.anInt494 += var21;
				++var23.anInt495;
				var23 = super.aClass25Array1393[var12];
				var23.anInt492 += var19;
				var23.anInt493 += var20;
				var23.anInt494 += var21;
				++var23.anInt495;
			}
		}

		if (var6) {
			this.method521(var1, var8, var3, var4, var5);
		} else {
			this.aClass25Array1556 = new Class25[this.anInt1522];

			for (var9 = 0; var9 < this.anInt1522; ++var9) {
				Class25 var24 = super.aClass25Array1393[var9];
				Class25 var25 = this.aClass25Array1556[var9] = new Class25();
				var25.anInt492 = var24.anInt492;
				var25.anInt493 = var24.anInt493;
				var25.anInt494 = var24.anInt494;
				var25.anInt495 = var24.anInt495;
			}
		}

		if (var6) {
			this.method507(486);
		} else {
			this.method509();
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method509() {
		super.anInt1394 = 0;
		this.anInt1546 = 0;
		this.anInt1547 = 0;
		this.anInt1542 = 999999;
		this.anInt1543 = -999999;
		this.anInt1544 = -99999;
		this.anInt1545 = 99999;

		for (int var1 = 0; var1 < this.anInt1522; ++var1) {
			int var2 = this.anIntArray1523[var1];
			int var3 = this.anIntArray1524[var1];
			int var4 = this.anIntArray1525[var1];
			if (var2 < this.anInt1542) {
				this.anInt1542 = var2;
			}

			if (var2 > this.anInt1543) {
				this.anInt1543 = var2;
			}

			if (var4 < this.anInt1545) {
				this.anInt1545 = var4;
			}

			if (var4 > this.anInt1544) {
				this.anInt1544 = var4;
			}

			if (-var3 > super.anInt1394) {
				super.anInt1394 = -var3;
			}

			if (var3 > this.anInt1547) {
				this.anInt1547 = var3;
			}

			int var5 = var2 * var2 + var4 * var4;
			if (var5 > this.anInt1546) {
				this.anInt1546 = var5;
			}
		}

		this.anInt1546 = (int)Math.sqrt((double)this.anInt1546);
		this.anInt1549 = (int)Math.sqrt((double)(this.anInt1546 * this.anInt1546 + super.anInt1394 * super.anInt1394));
		this.anInt1548 = this.anInt1549 + (int)Math.sqrt((double)(this.anInt1546 * this.anInt1546 + this.anInt1547 * this.anInt1547));
	}

	public void method515(byte var1, int var2) {
		int var3 = anIntArray1585[var2];
		int var4 = anIntArray1586[var2];

		for (int var5 = 0; var5 < this.anInt1522; ++var5) {
			int var6 = var4 * this.anIntArray1524[var5] - var3 * this.anIntArray1525[var5] >> 16;
			this.anIntArray1525[var5] = var3 * this.anIntArray1524[var5] + var4 * this.anIntArray1525[var5] >> 16;
			this.anIntArray1524[var5] = var6;
		}

	}

	public void method513(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var9;
		int var10;
		int[] var12;
		int var14;
		int var15;
		int var16;
		if (var1 == 0) {
			int var22 = 0;
			anInt1577 = 0;
			anInt1578 = 0;
			anInt1579 = 0;
			int[] var23 = var2;
			var9 = var2.length;

			for (var10 = 0; var10 < var9; ++var10) {
				int var24 = var23[var10];
				if (var24 < this.anIntArrayArray1553.length) {
					var12 = this.anIntArrayArray1553[var24];
					int[] var25 = var12;
					var14 = var12.length;

					for (var15 = 0; var15 < var14; ++var15) {
						var16 = var25[var15];
						anInt1577 += this.anIntArray1523[var16];
						anInt1578 += this.anIntArray1524[var16];
						anInt1579 += this.anIntArray1525[var16];
						++var22;
					}
				}
			}

			if (var22 > 0) {
				anInt1577 = var3 + anInt1577 / var22;
				anInt1578 = var4 + anInt1578 / var22;
				anInt1579 = var5 + anInt1579 / var22;
			} else {
				anInt1577 = var3;
				anInt1578 = var4;
				anInt1579 = var5;
			}
		} else {
			int[] var7;
			int var8;
			int[] var11;
			int var13;
			int[] var10000;
			if (var1 == 1) {
				var7 = var2;
				var8 = var2.length;

				for (var9 = 0; var9 < var8; ++var9) {
					var10 = var7[var9];
					if (var10 < this.anIntArrayArray1553.length) {
						var11 = this.anIntArrayArray1553[var10];
						var12 = var11;
						var13 = var11.length;

						for (var14 = 0; var14 < var13; ++var14) {
							var15 = var12[var14];
							var10000 = this.anIntArray1523;
							var10000[var15] += var3;
							var10000 = this.anIntArray1524;
							var10000[var15] += var4;
							var10000 = this.anIntArray1525;
							var10000[var15] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				var7 = var2;
				var8 = var2.length;

				for (var9 = 0; var9 < var8; ++var9) {
					var10 = var7[var9];
					if (var10 < this.anIntArrayArray1553.length) {
						var11 = this.anIntArrayArray1553[var10];
						var12 = var11;
						var13 = var11.length;

						for (var14 = 0; var14 < var13; ++var14) {
							var15 = var12[var14];
							var10000 = this.anIntArray1523;
							var10000[var15] -= anInt1577;
							var10000 = this.anIntArray1524;
							var10000[var15] -= anInt1578;
							var10000 = this.anIntArray1525;
							var10000[var15] -= anInt1579;
							var16 = (var3 & 255) * 8;
							int var17 = (var4 & 255) * 8;
							int var18 = (var5 & 255) * 8;
							int var19;
							int var20;
							int var21;
							if (var18 != 0) {
								var19 = anIntArray1585[var18];
								var20 = anIntArray1586[var18];
								var21 = var19 * this.anIntArray1524[var15] + var20 * this.anIntArray1523[var15] >> 16;
								this.anIntArray1524[var15] = var20 * this.anIntArray1524[var15] - var19 * this.anIntArray1523[var15] >> 16;
								this.anIntArray1523[var15] = var21;
							}

							if (var16 != 0) {
								var19 = anIntArray1585[var16];
								var20 = anIntArray1586[var16];
								var21 = var20 * this.anIntArray1524[var15] - var19 * this.anIntArray1525[var15] >> 16;
								this.anIntArray1525[var15] = var19 * this.anIntArray1524[var15] + var20 * this.anIntArray1525[var15] >> 16;
								this.anIntArray1524[var15] = var21;
							}

							if (var17 != 0) {
								var19 = anIntArray1585[var17];
								var20 = anIntArray1586[var17];
								var21 = var19 * this.anIntArray1525[var15] + var20 * this.anIntArray1523[var15] >> 16;
								this.anIntArray1525[var15] = var20 * this.anIntArray1525[var15] - var19 * this.anIntArray1523[var15] >> 16;
								this.anIntArray1523[var15] = var21;
							}

							var10000 = this.anIntArray1523;
							var10000[var15] += anInt1577;
							var10000 = this.anIntArray1524;
							var10000[var15] += anInt1578;
							var10000 = this.anIntArray1525;
							var10000[var15] += anInt1579;
						}
					}
				}

			} else if (var1 == 3) {
				var7 = var2;
				var8 = var2.length;

				for (var9 = 0; var9 < var8; ++var9) {
					var10 = var7[var9];
					if (var10 < this.anIntArrayArray1553.length) {
						var11 = this.anIntArrayArray1553[var10];
						var12 = var11;
						var13 = var11.length;

						for (var14 = 0; var14 < var13; ++var14) {
							var15 = var12[var14];
							var10000 = this.anIntArray1523;
							var10000[var15] -= anInt1577;
							var10000 = this.anIntArray1524;
							var10000[var15] -= anInt1578;
							var10000 = this.anIntArray1525;
							var10000[var15] -= anInt1579;
							this.anIntArray1523[var15] = var3 * this.anIntArray1523[var15] / 128;
							this.anIntArray1524[var15] = var4 * this.anIntArray1524[var15] / 128;
							this.anIntArray1525[var15] = var5 * this.anIntArray1525[var15] / 128;
							var10000 = this.anIntArray1523;
							var10000[var15] += anInt1577;
							var10000 = this.anIntArray1524;
							var10000[var15] += anInt1578;
							var10000 = this.anIntArray1525;
							var10000[var15] += anInt1579;
						}
					}
				}

			} else {
				if (var1 == 5 && this.anIntArrayArray1554 != null && this.anIntArray1535 != null) {
					var7 = var2;
					var8 = var2.length;

					for (var9 = 0; var9 < var8; ++var9) {
						var10 = var7[var9];
						if (var10 < this.anIntArrayArray1554.length) {
							var11 = this.anIntArrayArray1554[var10];
							var12 = var11;
							var13 = var11.length;

							for (var14 = 0; var14 < var13; ++var14) {
								var15 = var12[var14];
								var10000 = this.anIntArray1535;
								var10000[var15] += var3 * 8;
								if (this.anIntArray1535[var15] < 0) {
									this.anIntArray1535[var15] = 0;
								}

								if (this.anIntArray1535[var15] > 255) {
									this.anIntArray1535[var15] = 255;
								}
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	public void method518() {
		int var1;
		for (var1 = 0; var1 < this.anInt1522; ++var1) {
			this.anIntArray1525[var1] = -this.anIntArray1525[var1];
		}

		for (var1 = 0; var1 < this.anInt1526; ++var1) {
			int var2 = this.anIntArray1527[var1];
			this.anIntArray1527[var1] = this.anIntArray1529[var1];
			this.anIntArray1529[var1] = var2;
		}

	}

	public boolean method527(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else {
			return var1 <= var6 || var1 <= var7 || var1 <= var8;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "89"
	)
	public void method514() {
		for (int var1 = 0; var1 < this.anInt1522; ++var1) {
			int var2 = this.anIntArray1523[var1];
			this.anIntArray1523[var1] = this.anIntArray1525[var1];
			this.anIntArray1525[var1] = -var2;
		}

	}

	public void method523(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = Class44_Sub3_Sub1_Sub1.anInt1403;
		int var9 = Class44_Sub3_Sub1_Sub1.anInt1404;
		int var10 = anIntArray1585[var1];
		int var11 = anIntArray1586[var1];
		int var12 = anIntArray1585[var2];
		int var13 = anIntArray1586[var2];
		int var14 = anIntArray1585[var3];
		int var15 = anIntArray1586[var3];
		int var16 = anIntArray1585[var4];
		int var17 = anIntArray1586[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.anInt1522; ++var19) {
			int var20 = this.anIntArray1523[var19];
			int var21 = this.anIntArray1524[var19];
			int var22 = this.anIntArray1525[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			anIntArray1563[var19] = var22 - var18;
			anIntArray1561[var19] = var8 + (var20 << 9) / var22;
			anIntArray1562[var19] = var9 + (var23 << 9) / var22;
			if (this.anInt1538 > 0) {
				anIntArray1564[var19] = var20;
				anIntArray1565[var19] = var23;
				anIntArray1566[var19] = var22;
			}
		}

		try {
			this.method524(false, false, 0);
		} catch (Exception var24) {
		}

	}

	public int method506(Model var1, int var2) {
		int var3 = -1;
		int var4 = var1.anIntArray1523[var2];
		int var5 = var1.anIntArray1524[var2];
		int var6 = var1.anIntArray1525[var2];

		for (int var7 = 0; var7 < this.anInt1522; ++var7) {
			if (var4 == this.anIntArray1523[var7] && var5 == this.anIntArray1524[var7] && var6 == this.anIntArray1525[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.anIntArray1523[this.anInt1522] = var4;
			this.anIntArray1524[this.anInt1522] = var5;
			this.anIntArray1525[this.anInt1522] = var6;
			if (var1.anIntArray1551 != null) {
				this.anIntArray1551[this.anInt1522] = var1.anIntArray1551[var2];
			}

			var3 = this.anInt1522++;
		}

		return var3;
	}

	@ObfuscatedSignature(
		descriptor = "(II)LModel;",
		garbageValue = "6"
	)
	public static Model method503(int var0) {
		if (aClass21Array1557 == null) {
			return null;
		} else {
			Class21 var1 = aClass21Array1557[var0];
			if (var1 == null) {
				aClass43_1558.method382(var0);
				return null;
			} else {
				return new Model(var0, 2);
			}
		}
	}

	public static boolean method504(int var0) {
		if (aClass21Array1557 == null) {
			return false;
		} else {
			Class21 var1 = aClass21Array1557[var0];
			if (var1 == null) {
				aClass43_1558.method382(var0);
				return false;
			} else {
				return true;
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I[BI)V",
		garbageValue = "6"
	)
	public static void method501(int var0, byte[] var1) {
		if (var1 == null) {
			Class21 var14 = aClass21Array1557[var0] = new Class21();
			var14.anInt436 = 0;
			var14.anInt437 = 0;
			var14.anInt438 = 0;
		} else {
			Buffer var2 = new Buffer(var1, (byte)1);
			var2.offset = var1.length - 18;
			Class21 var3 = aClass21Array1557[var0] = new Class21();
			var3.aByteArray435 = var1;
			var3.anInt436 = var2.readUShort();
			var3.anInt437 = var2.readUShort();
			var3.anInt438 = var2.readUByte();
			int var4 = var2.readUByte();
			int var5 = var2.readUByte();
			int var6 = var2.readUByte();
			int var7 = var2.readUByte();
			int var8 = var2.readUByte();
			int var9 = var2.readUShort();
			int var10 = var2.readUShort();
			int var11 = var2.readUShort();
			int var12 = var2.readUShort();
			byte var13 = 0;
			var3.anInt439 = var13;
			int var15 = var13 + var3.anInt436;
			var3.anInt445 = var15;
			var15 += var3.anInt437;
			var3.anInt448 = var15;
			if (var5 == 255) {
				var15 += var3.anInt437;
			} else {
				var3.anInt448 = -var5 - 1;
			}

			var3.anInt450 = var15;
			if (var7 == 1) {
				var15 += var3.anInt437;
			} else {
				var3.anInt450 = -1;
			}

			var3.anInt447 = var15;
			if (var4 == 1) {
				var15 += var3.anInt437;
			} else {
				var3.anInt447 = -1;
			}

			var3.anInt443 = var15;
			if (var8 == 1) {
				var15 += var3.anInt436;
			} else {
				var3.anInt443 = -1;
			}

			var3.anInt449 = var15;
			if (var6 == 1) {
				var15 += var3.anInt437;
			} else {
				var3.anInt449 = -1;
			}

			var3.anInt444 = var15;
			var15 += var12;
			var3.anInt446 = var15;
			var15 += var3.anInt437 * 2;
			var3.anInt451 = var15;
			var15 += var3.anInt438 * 6;
			var3.anInt440 = var15;
			var15 += var9;
			var3.anInt441 = var15;
			var15 += var10;
			var3.anInt442 = var15;
			int var10000 = var15 + var11;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-6375"
	)
	public static void method502(int var0) {
		aClass21Array1557[var0] = null;
	}

	public static int method522(int var0, int var1, int var2) {
		if ((var2 & 2) == 2) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 >> 7;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	public static void method500(int var0, Class43 var1) {
		aClass21Array1557 = new Class21[var0];
		aClass43_1558 = var1;
	}

	public static void method499(byte var0) {
		aClass21Array1557 = null;
		aBooleanArray1559 = null;
		aBooleanArray1560 = null;
		anIntArray1561 = null;
		anIntArray1562 = null;
		anIntArray1563 = null;
		anIntArray1564 = null;
		anIntArray1565 = null;
		anIntArray1566 = null;
		anIntArray1567 = null;
		anIntArrayArray1568 = null;
		anIntArray1569 = null;
		anIntArrayArray1570 = null;
		anIntArray1571 = null;
		if (var0 == 1) {
			boolean var1 = false;
			anIntArray1572 = null;
			anIntArray1573 = null;
			anIntArray1585 = null;
			anIntArray1586 = null;
			anIntArray1587 = null;
			anIntArray1588 = null;
		}
	}
}
