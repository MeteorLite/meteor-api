import net.runelite.mapping.ObfuscatedSignature;

public class Class28 {
	public Class44 aClass44_524;
	public final Class44 aClass44_523;
	public boolean aBoolean520;
	public boolean aBoolean521;
	public int anInt522;

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-822"
	)
	public Class28(int var1) {
		this.aBoolean520 = true;
		this.aBoolean521 = true;
		this.anInt522 = -676;
		this.aClass44_523 = new Class44();
		this.aClass44_523.aClass44_761 = this.aClass44_523;
		this.aClass44_523.aClass44_762 = this.aClass44_523;
	}

	public Class44 peekFront() {
		Class44 var1 = this.aClass44_523.aClass44_761;
		if (var1 == this.aClass44_523) {
			this.aClass44_524 = null;
			return null;
		} else {
			this.aClass44_524 = var1.aClass44_761;
			return var1;
		}
	}

	public void method256(Class44 var1) {
		if (var1.aClass44_762 != null) {
			var1.unlink();
		}

		var1.aClass44_762 = this.aClass44_523.aClass44_762;
		var1.aClass44_761 = this.aClass44_523;
		var1.aClass44_762.aClass44_761 = var1;
		var1.aClass44_761.aClass44_762 = var1;
	}

	public void method263() {
		if (this.aClass44_523.aClass44_761 != this.aClass44_523) {
			while (true) {
				Class44 var1 = this.aClass44_523.aClass44_761;
				if (var1 == this.aClass44_523) {
					return;
				}

				var1.unlink();
			}
		}
	}

	public Class44 method258() {
		Class44 var1 = this.aClass44_523.aClass44_761;
		if (var1 == this.aClass44_523) {
			return null;
		} else {
			var1.unlink();
			return var1;
		}
	}

	public Class44 getPrevious(byte var1) {
		Class44 var2 = this.aClass44_524;
		if (var2 == this.aClass44_523) {
			this.aClass44_524 = null;
			return null;
		} else {
			this.aClass44_524 = var2.aClass44_761;
			if (var1 == 0) {
				boolean var3 = false;
			} else {
				this.aBoolean521 = !this.aBoolean521;
			}

			return var2;
		}
	}

	public void method257(boolean var1, Class44 var2) {
		if (var2.aClass44_762 != null) {
			var2.unlink();
		}

		var2.aClass44_762 = this.aClass44_523;
		var2.aClass44_761 = this.aClass44_523.aClass44_761;
		var2.aClass44_762.aClass44_761 = var2;
		var2.aClass44_761.aClass44_762 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LClass44;",
		garbageValue = "0"
	)
	public Class44 method260() {
		Class44 var1 = this.aClass44_523.aClass44_762;
		if (var1 == this.aClass44_523) {
			this.aClass44_524 = null;
			return null;
		} else {
			this.aClass44_524 = var1.aClass44_762;
			return var1;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LClass44;",
		garbageValue = "0"
	)
	public Class44 method262() {
		Class44 var1 = this.aClass44_524;
		if (var1 == this.aClass44_523) {
			this.aClass44_524 = null;
			return null;
		} else {
			this.aClass44_524 = var1.aClass44_762;
			return var1;
		}
	}
}
