import net.runelite.mapping.ObfuscatedSignature;

public class Class26 {
	public static Class26[] aClass26Array497;
	public static int anInt496;
	public int[] anIntArray501;
	public int frameStep;
	public boolean aBoolean504;
	public int[] primaryFrames;
	public int anInt498;
	public int anInt505;
	public int anInt510;
	public int anInt509;
	public int anInt506;
	public int[] anIntArray503;
	public int anInt507;
	public int anInt508;
	public int[] anIntArray500;
	public int anInt511;

	public Class26() {
		this.frameStep = -1;
		this.aBoolean504 = false;
		this.anInt505 = 5;
		this.anInt506 = -1;
		this.anInt507 = -1;
		this.anInt508 = 99;
		this.anInt509 = -1;
		this.anInt510 = -1;
	}

	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "41645"
	)
	public int getFrameLength(int var1, int var2) {
		int var3 = this.anIntArray501[var1];
		if (var3 == 0) {
			Class11 var4 = Class11.method210(this.primaryFrames[var1]);
			if (var4 != null) {
				var3 = this.anIntArray501[var1] = var4.anInt265;
			}
		}

		if (var3 == 0) {
			var3 = 1;
		}

		return var3;
	}

	public void method255(byte var1, Buffer var2) {
		int var3;
		if (var1 == 2) {
			boolean var6 = false;
		} else {
			for (var3 = 1; var3 > 0; ++var3) {
			}
		}

		while (true) {
			while (true) {
				var3 = var2.get1();
				if (var3 == 0) {
					if (this.anInt498 == 0) {
						this.anInt498 = 1;
						this.primaryFrames = new int[1];
						this.primaryFrames[0] = -1;
						this.anIntArray500 = new int[1];
						this.anIntArray500[0] = -1;
						this.anIntArray501 = new int[1];
						this.anIntArray501[0] = -1;
					}

					if (this.anInt509 == -1) {
						if (this.anIntArray503 != null) {
							this.anInt509 = 2;
						} else {
							this.anInt509 = 0;
						}
					}

					if (this.anInt510 == -1) {
						if (this.anIntArray503 != null) {
							this.anInt510 = 2;
							return;
						}

						this.anInt510 = 0;
					}

					return;
				}

				int var4;
				if (var3 == 1) {
					this.anInt498 = var2.get1();
					this.primaryFrames = new int[this.anInt498];
					this.anIntArray500 = new int[this.anInt498];
					this.anIntArray501 = new int[this.anInt498];

					for (var4 = 0; var4 < this.anInt498; ++var4) {
						this.primaryFrames[var4] = var2.get2();
						this.anIntArray500[var4] = var2.get2();
						if (this.anIntArray500[var4] == 65535) {
							this.anIntArray500[var4] = -1;
						}

						this.anIntArray501[var4] = var2.get2();
					}
				} else if (var3 == 2) {
					this.frameStep = var2.get2();
				} else if (var3 != 3) {
					if (var3 == 4) {
						this.aBoolean504 = true;
					} else if (var3 == 5) {
						this.anInt505 = var2.get1();
					} else if (var3 == 6) {
						this.anInt506 = var2.get2();
					} else if (var3 == 7) {
						this.anInt507 = var2.get2();
					} else if (var3 == 8) {
						this.anInt508 = var2.get1();
					} else if (var3 == 9) {
						this.anInt509 = var2.get1();
					} else if (var3 == 10) {
						this.anInt510 = var2.get1();
					} else if (var3 == 11) {
						this.anInt511 = var2.get1();
					} else {
						System.out.println("Error unrecognised seq config code: " + var3);
					}
				} else {
					var4 = var2.get1();
					this.anIntArray503 = new int[var4 + 1];

					for (int var5 = 0; var5 < var4; ++var5) {
						this.anIntArray503[var5] = var2.get1();
					}

					this.anIntArray503[var4] = 9999999;
				}
			}
		}
	}

	public static void method253(boolean var0, Class47 var1) {
		Buffer var2 = new Buffer(var1.method546("seq.dat", (byte[])null), (byte)1);
		anInt496 = var2.get2();
		if (aClass26Array497 == null) {
			aClass26Array497 = new Class26[anInt496];
		}

		for (int var3 = 0; var3 < anInt496; ++var3) {
			if (aClass26Array497[var3] == null) {
				aClass26Array497[var3] = new Class26();
			}

			aClass26Array497[var3].method255((byte)2, var2);
		}

	}
}
