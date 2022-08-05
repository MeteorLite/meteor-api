public class Class42 {
	public final Class44[] aClass44Array758;
	public int anInt753;
	public final int anInt757;
	public final int anInt754;
	public final byte aByte755;
	public final boolean aBoolean756;

	public Class42(int var1, int var2) {
		this.anInt753 = 7;
		this.anInt754 = 7228;
		this.aByte755 = 0;
		this.aBoolean756 = false;
		this.anInt757 = var1;
		if (var2 != this.anInt754) {
			this.anInt753 = 236;
		}

		this.aClass44Array758 = new Class44[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			Class44 var4 = this.aClass44Array758[var3] = new Class44();
			var4.aClass44_761 = var4;
			var4.aClass44_762 = var4;
		}

	}

	public Class44 method380(long var1) {
		Class44 var3 = this.aClass44Array758[(int)(var1 & (long)(this.anInt757 - 1))];

		for (Class44 var4 = var3.aClass44_761; var4 != var3; var4 = var4.aClass44_761) {
			if (var4.aLong760 == var1) {
				return var4;
			}
		}

		return null;
	}

	public void method381(boolean var1, long var2, Class44 var4) {
		if (var4.aClass44_762 != null) {
			var4.unlink();
		}

		Class44 var5 = this.aClass44Array758[(int)(var2 & (long)(this.anInt757 - 1))];
		var4.aClass44_762 = var5.aClass44_762;
		var4.aClass44_761 = var5;
		var4.aClass44_762.aClass44_761 = var4;
		var4.aClass44_761.aClass44_762 = var4;
		var4.aLong760 = var2;
	}
}
