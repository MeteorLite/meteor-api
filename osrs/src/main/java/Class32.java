public class Class32 {
	public static Class39 aClass39_559;
	public static Class32[] aClass32Array547;
	public static int anInt546;
	public boolean aBoolean545;
	public int anInt548;
	public int anInt550;
	public int anInt549;
	public final int[] anIntArray552;
	public Class26 aClass26_551;
	public final int[] anIntArray553;
	public int anInt554;
	public int anInt555;
	public int anInt556;
	public int anInt557;
	public int anInt558;

	static {
		aClass39_559 = new Class39(30, 0);
	}

	public Class32() {
		this.aBoolean545 = false;
		this.anInt550 = -1;
		this.anIntArray552 = new int[6];
		this.anIntArray553 = new int[6];
		this.anInt554 = 128;
		this.anInt555 = 128;
	}

	public Model method271() {
		Model var1 = (Model)aClass39_559.method339((long)this.anInt548);
		if (var1 != null) {
			return var1;
		} else {
			var1 = Model.method503(this.anInt549);
			if (var1 == null) {
				return null;
			} else {
				for (int var2 = 0; var2 < 6; ++var2) {
					if (this.anIntArray552[0] != 0) {
						var1.method517(this.anIntArray552[var2], this.anIntArray553[var2]);
					}
				}

				aClass39_559.method340(201, (long)this.anInt548, var1);
				return var1;
			}
		}
	}

	public void method270(byte var1, Buffer var2) {
		if (var1 == 2) {
			boolean var4 = false;
		} else {
			this.aBoolean545 = !this.aBoolean545;
		}

		while (true) {
			while (true) {
				int var3 = var2.get1();
				if (var3 == 0) {
					return;
				}

				if (var3 == 1) {
					this.anInt549 = var2.get2();
				} else if (var3 == 2) {
					this.anInt550 = var2.get2();
					if (Class26.aClass26Array497 != null) {
						this.aClass26_551 = Class26.aClass26Array497[this.anInt550];
					}
				} else if (var3 == 4) {
					this.anInt554 = var2.get2();
				} else if (var3 == 5) {
					this.anInt555 = var2.get2();
				} else if (var3 == 6) {
					this.anInt556 = var2.get2();
				} else if (var3 == 7) {
					this.anInt557 = var2.get1();
				} else if (var3 == 8) {
					this.anInt558 = var2.get1();
				} else if (var3 >= 40 && var3 < 50) {
					this.anIntArray552[var3 - 40] = var2.get2();
				} else if (var3 >= 50 && var3 < 60) {
					this.anIntArray553[var3 - 50] = var2.get2();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + var3);
				}
			}
		}
	}

	public static void method269(boolean var0, Class47 var1) {
		Buffer var2 = new Buffer(var1.method546("spotanim.dat", (byte[])null), (byte)1);
		anInt546 = var2.get2();
		if (aClass32Array547 == null) {
			aClass32Array547 = new Class32[anInt546];
		}

		for (int var3 = 0; var3 < anInt546; ++var3) {
			if (aClass32Array547[var3] == null) {
				aClass32Array547[var3] = new Class32();
			}

			aClass32Array547[var3].anInt548 = var3;
			aClass32Array547[var3].method270((byte)2, var2);
		}

	}
}
