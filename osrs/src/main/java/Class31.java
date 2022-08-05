public class Class31 {
	public Class44_Sub3 aClass44_Sub3_544;
	public final Class44_Sub3 aClass44_Sub3_543;
	public boolean aBoolean542;

	public Class31(byte var1) {
		this.aBoolean542 = true;
		this.aClass44_Sub3_543 = new Class44_Sub3();
		if (var1 == 8) {
			boolean var2 = false;
			this.aClass44_Sub3_543.aClass44_Sub3_1345 = this.aClass44_Sub3_543;
			this.aClass44_Sub3_543.aClass44_Sub3_1346 = this.aClass44_Sub3_543;
		} else {
			throw new NullPointerException();
		}
	}

	public Class44_Sub3 method265() {
		Class44_Sub3 var1 = this.aClass44_Sub3_543.aClass44_Sub3_1345;
		if (var1 == this.aClass44_Sub3_543) {
			return null;
		} else {
			var1.method405();
			return var1;
		}
	}

	public int method268() {
		int var1 = 0;

		for (Class44_Sub3 var2 = this.aClass44_Sub3_543.aClass44_Sub3_1345; var2 != this.aClass44_Sub3_543; var2 = var2.aClass44_Sub3_1345) {
			++var1;
		}

		return var1;
	}

	public void method264(Class44_Sub3 var1) {
		if (var1.aClass44_Sub3_1346 != null) {
			var1.method405();
		}

		var1.aClass44_Sub3_1346 = this.aClass44_Sub3_543.aClass44_Sub3_1346;
		var1.aClass44_Sub3_1345 = this.aClass44_Sub3_543;
		var1.aClass44_Sub3_1346.aClass44_Sub3_1345 = var1;
		var1.aClass44_Sub3_1345.aClass44_Sub3_1346 = var1;
	}

	public Class44_Sub3 method266() {
		Class44_Sub3 var1 = this.aClass44_Sub3_543.aClass44_Sub3_1345;
		if (var1 == this.aClass44_Sub3_543) {
			this.aClass44_Sub3_544 = null;
			return null;
		} else {
			this.aClass44_Sub3_544 = var1.aClass44_Sub3_1345;
			return var1;
		}
	}

	public Class44_Sub3 method267(byte var1) {
		Class44_Sub3 var2 = this.aClass44_Sub3_544;
		if (var2 == this.aClass44_Sub3_543) {
			this.aClass44_Sub3_544 = null;
			return null;
		} else {
			this.aClass44_Sub3_544 = var2.aClass44_Sub3_1345;
			if (var1 == 0) {
				boolean var3 = false;
			} else {
				this.aBoolean542 = !this.aBoolean542;
			}

			return var2;
		}
	}
}
