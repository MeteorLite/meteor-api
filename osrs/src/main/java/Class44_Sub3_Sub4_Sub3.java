import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub4_Sub3 extends Renderable {
	public boolean aBoolean1495;
	public final Class32 aClass32_1484;
	public boolean aBoolean1483;
	public final int anInt1486;
	public final int anInt1491;
	public double aDouble1496;
	public double aDouble1499;
	public final int anInt1485;
	public final int anInt1487;
	public double aDouble1497;
	public double aDouble1500;
	public final int anInt1493;
	public int anInt1506;
	public final int anInt1490;
	public double aDouble1498;
	public final int anInt1494;
	public double aDouble1502;
	public double aDouble1503;
	public final int anInt1488;
	public final int anInt1492;
	public int anInt1505;
	public final int anInt1489;
	public int anInt1504;
	public double aDouble1501;
	public int anInt1507;

	public Class44_Sub3_Sub4_Sub3(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10, int var11, int var12) {
		this.aBoolean1483 = false;
		this.aBoolean1495 = false;
		this.aClass32_1484 = Class32.aClass32Array547[var8];
		this.anInt1485 = var7;
		this.anInt1486 = var1;
		this.anInt1487 = var12;
		this.anInt1488 = var10;
		this.anInt1490 = var6;
		this.anInt1491 = var4;
		this.anInt1492 = var5;
		this.anInt1493 = var2;
		this.anInt1494 = var11;
		this.anInt1489 = var3;
		this.aBoolean1495 = false;
		if (!var9) {
			this.aBoolean1483 = !this.aBoolean1483;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Z)LModel;",
		garbageValue = "0"
	)
	public Model getModel(boolean var1) {
		Model var2 = this.aClass32_1484.method271();
		if (var2 == null) {
			return null;
		} else {
			int var3 = -1;
			if (this.aClass32_1484.aClass26_551 != null) {
				var3 = this.aClass32_1484.aClass26_551.primaryFrames[this.anInt1506];
			}

			Model var4 = new Model(true, Class11.method211(var3), var2, true, false);
			if (var3 != -1) {
				var4.method510();
				var4.method511(var3);
				var4.anIntArrayArray1554 = null;
				var4.anIntArrayArray1553 = null;
			}

			if (this.aClass32_1484.anInt554 != 128 || this.aClass32_1484.anInt555 != 128) {
				var4.method519(9, this.aClass32_1484.anInt554, this.aClass32_1484.anInt554, this.aClass32_1484.anInt555);
			}

			var4.method515((byte)-44, this.anInt1505);
			var4.method520(this.aClass32_1484.anInt557 + 64, this.aClass32_1484.anInt558 + 850, -30, -50, -30, true);
			return var4;
		}
	}

	public void method497(int var1, int var2, int var3, byte var4, int var5) {
		double var6;
		if (!this.aBoolean1495) {
			var6 = (double)(var3 - this.anInt1486);
			double var8 = (double)(var5 - this.anInt1487);
			double var10 = Math.sqrt(var6 * var6 + var8 * var8);
			this.aDouble1496 = (double)this.anInt1486 + var6 * (double)this.anInt1493 / var10;
			this.aDouble1497 = (double)this.anInt1487 + var8 * (double)this.anInt1493 / var10;
			this.aDouble1498 = (double)this.anInt1488;
		}

		var6 = (double)(this.anInt1491 + 1 - var1);
		this.aDouble1499 = ((double)var3 - this.aDouble1496) / var6;
		this.aDouble1500 = ((double)var5 - this.aDouble1497) / var6;
		this.aDouble1501 = Math.sqrt(this.aDouble1499 * this.aDouble1499 + this.aDouble1500 * this.aDouble1500);
		if (!this.aBoolean1495) {
			this.aDouble1502 = -this.aDouble1501 * Math.tan((double)this.anInt1492 * 0.02454369D);
		}

		this.aDouble1503 = 2.0D * ((double)var2 - this.aDouble1498 - this.aDouble1502 * var6) / (var6 * var6);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	public void method498(int var1) {
		this.aBoolean1495 = true;
		this.aDouble1496 += this.aDouble1499 * (double)var1;
		this.aDouble1497 += this.aDouble1500 * (double)var1;
		this.aDouble1498 += this.aDouble1502 * (double)var1 + 0.5D * this.aDouble1503 * (double)var1 * (double)var1;
		this.aDouble1502 += this.aDouble1503 * (double)var1;
		this.anInt1504 = (int)(Math.atan2(this.aDouble1499, this.aDouble1500) * 325.949D) + 1024 & 2047;
		this.anInt1505 = (int)(Math.atan2(this.aDouble1502, this.aDouble1501) * 325.949D) & 2047;
		if (this.aClass32_1484.aClass26_551 != null) {
			this.anInt1507 += var1;

			while (this.anInt1507 > this.aClass32_1484.aClass26_551.getFrameLength(this.anInt1506, 41645)) {
				this.anInt1507 -= this.aClass32_1484.aClass26_551.getFrameLength(this.anInt1506, 41645) + 1;
				++this.anInt1506;
				if (this.anInt1506 >= this.aClass32_1484.aClass26_551.anInt498) {
					this.anInt1506 = 0;
				}
			}
		}

	}
}
