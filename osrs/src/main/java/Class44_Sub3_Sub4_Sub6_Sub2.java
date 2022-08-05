import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub4_Sub6_Sub2 extends Class44_Sub3_Sub4_Sub6 {
	public Class12 aClass12_1682;
	public boolean aBoolean1681;

	public Class44_Sub3_Sub4_Sub6_Sub2() {
		this.aBoolean1681 = true;
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LModel;",
		garbageValue = "1"
	)
	public Model method537() {
		int var1;
		if (super.anInt1627 >= 0 && super.anInt1630 == 0) {
			var1 = Class26.aClass26Array497[super.anInt1627].primaryFrames[super.anInt1628];
			int var2 = -1;
			if (super.anInt1624 >= 0 && super.anInt1624 != super.anInt1604) {
				var2 = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
			}

			return this.aClass12_1682.method216(var1, var2, 811, Class26.aClass26Array497[super.anInt1627].anIntArray503);
		} else {
			var1 = -1;
			if (super.anInt1624 >= 0) {
				var1 = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
			}

			return this.aClass12_1682.method216(var1, -1, 811, (int[])null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LModel;",
		garbageValue = "0"
	)
	public Model getModel(boolean var1) {
		if (this.aClass12_1682 == null) {
			return null;
		} else {
			Model var2 = this.method537();
			if (var2 == null) {
				return null;
			} else {
				super.anInt1645 = var2.anInt1394;
				if (super.anInt1632 != -1 && super.anInt1633 != -1) {
					Class32 var3 = Class32.aClass32Array547[super.anInt1632];
					Model var4 = var3.method271();
					if (var4 != null) {
						int var5 = var3.aClass26_551.primaryFrames[super.anInt1633];
						Model var6 = new Model(true, Class11.method211(var5), var4, true, false);
						var6.method516(0, -super.anInt1636, (byte)10, 0);
						var6.method510();
						var6.method511(var5);
						var6.anIntArrayArray1554 = null;
						var6.anIntArrayArray1553 = null;
						if (var3.anInt554 != 128 || var3.anInt555 != 128) {
							var6.method519(9, var3.anInt554, var3.anInt554, var3.anInt555);
						}

						var6.method520(var3.anInt557 + 64, var3.anInt558 + 850, -30, -50, -30, true);
						Model[] var7 = new Model[]{var2, var6};
						var2 = new Model(true, (byte)72, var7, 2);
					}
				}

				if (this.aClass12_1682.aByte283 == 1) {
					var2.aBoolean1555 = true;
				}

				return var2;
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "0"
	)
	public boolean method532() {
		return this.aClass12_1682 != null;
	}
}
