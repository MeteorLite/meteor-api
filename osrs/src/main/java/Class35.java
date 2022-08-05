public class Class35 {
	public static boolean aBoolean578;
	public static Class35[] aClass35Array580;
	public static int anInt579;
	public int anInt582;
	public String aString581;
	public int anInt583;
	public int anInt584;

	static {
		aBoolean578 = true;
	}

	public void method276(Class44_Sub3_Sub2 var1, byte var2, int var3) {
		while (true) {
			int var4 = var1.get1();
			if (var4 == 0) {
				return;
			}

			if (var4 == 1) {
				this.anInt582 = var1.get2();
				this.anInt583 = var1.get1();
				this.anInt584 = var1.get1();
			} else if (var4 == 10) {
				this.aString581 = var1.getString();
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}

	public static void method275(boolean var0, Class47 var1) {
		Class44_Sub3_Sub2 var2 = new Class44_Sub3_Sub2(var1.method546("varbit.dat", (byte[])null), (byte)1);
		anInt579 = var2.get2();
		if (aClass35Array580 == null) {
			aClass35Array580 = new Class35[anInt579];
		}

		for (int var3 = 0; var3 < anInt579; ++var3) {
			if (aClass35Array580[var3] == null) {
				aClass35Array580[var3] = new Class35();
			}

			aClass35Array580[var3].method276(var2, (byte)6, var3);
		}

		if (var2.aByteArray1373.length != var2.anInt1374) {
			System.out.println("varbit load mismatch");
		}

	}
}
