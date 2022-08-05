public class Class38 {
	public static int anInt657;
	public static Class38[] aClass38Array660;
	public static int[] anIntArray662;
	public static int anInt661;
	public static int anInt659;
	public boolean aBoolean666;
	public int anInt668;
	public boolean aBoolean667;
	public boolean aBoolean669;
	public int anInt664;
	public boolean aBoolean672;
	public int anInt665;
	public int anInt673;
	public int anInt671;
	public int anInt670;
	public String aString663;

	static {
		anInt657 = -643;
	}

	public Class38() {
		this.aBoolean666 = false;
		this.aBoolean667 = true;
		this.aBoolean669 = false;
		this.aBoolean672 = false;
		this.anInt673 = -1;
	}

	public void method338(Buffer var1, byte var2, int var3) {
		int var4;
		if (var2 == 6) {
			boolean var5 = false;
		} else {
			for (var4 = 1; var4 > 0; ++var4) {
			}
		}

		while (true) {
			var4 = var1.get1();
			if (var4 == 0) {
				return;
			}

			if (var4 == 1) {
				this.anInt664 = var1.get1();
			} else if (var4 == 2) {
				this.anInt665 = var1.get1();
			} else if (var4 == 3) {
				this.aBoolean666 = true;
				anIntArray662[anInt661++] = var3;
			} else if (var4 == 4) {
				this.aBoolean667 = false;
			} else if (var4 == 5) {
				this.anInt668 = var1.get2();
			} else if (var4 == 6) {
				this.aBoolean669 = true;
			} else if (var4 == 7) {
				this.anInt670 = var1.get4();
			} else if (var4 == 8) {
				this.anInt671 = 1;
				this.aBoolean672 = true;
			} else if (var4 == 10) {
				this.aString663 = var1.getString();
			} else if (var4 == 11) {
				this.aBoolean672 = true;
			} else if (var4 == 12) {
				this.anInt673 = var1.get4();
			} else if (var4 == 13) {
				this.anInt671 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}

	public static void method337(boolean var0, Class47 var1) {
		Buffer var2 = new Buffer(var1.method546("varp.dat", (byte[])null), (byte)1);
		anInt661 = 0;
		anInt659 = var2.get2();
		if (aClass38Array660 == null) {
			aClass38Array660 = new Class38[anInt659];
		}

		if (anIntArray662 == null) {
			anIntArray662 = new int[anInt659];
		}

		for (int var3 = 0; var3 < anInt659; ++var3) {
			if (aClass38Array660[var3] == null) {
				aClass38Array660[var3] = new Class38();
			}

			aClass38Array660[var3].method338(var2, (byte)6, var3);
		}

		if (var2.aByteArray1373.length != var2.anInt1374) {
			System.out.println("varptype load mismatch");
		}

	}
}
