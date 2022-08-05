import net.runelite.mapping.ObfuscatedSignature;

public class Class1 {
	public int anInt46;
	public int anInt50;
	public int anInt38;
	public int anInt45;
	public int anInt40;
	public int anInt47;
	public boolean aBoolean39;
	public int[] anIntArray42;
	public int anInt49;
	public int anInt48;
	public int[] anIntArray41;
	public int anInt43;
	public int anInt44;

	public Class1() {
		this.anInt38 = 1;
		this.aBoolean39 = false;
	}

	public void method148(byte var1, Buffer var2) {
		this.anInt45 = var2.readUByte();
		if (var1 == 2) {
			boolean var3 = false;
		} else {
			this.aBoolean39 = !this.aBoolean39;
		}

		this.anInt43 = var2.readInt();
		this.anInt44 = var2.readInt();
		this.method149(var2);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method150() {
		this.anInt46 = 0;
		this.anInt47 = 0;
		this.anInt48 = 0;
		this.anInt49 = 0;
		this.anInt50 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(LClass44_Sub3_Sub2;I)V",
		garbageValue = "9"
	)
	public void method149(Buffer var1) {
		this.anInt40 = var1.readUByte();
		this.anIntArray41 = new int[this.anInt40];
		this.anIntArray42 = new int[this.anInt40];

		for (int var2 = 0; var2 < this.anInt40; ++var2) {
			this.anIntArray41[var2] = var1.readUShort();
			this.anIntArray42[var2] = var1.readUShort();
		}

	}

	public int method151(byte var1, int var2) {
		if (this.anInt50 >= this.anInt46) {
			this.anInt49 = this.anIntArray42[this.anInt47++] << 15;
			if (this.anInt47 >= this.anInt40) {
				this.anInt47 = this.anInt40 - 1;
			}

			this.anInt46 = (int)((double)this.anIntArray41[this.anInt47] / 65536.0D * (double)var2);
			if (this.anInt46 > this.anInt50) {
				this.anInt48 = ((this.anIntArray42[this.anInt47] << 15) - this.anInt49) / (this.anInt46 - this.anInt50);
			}
		}

		this.anInt49 += this.anInt48;
		++this.anInt50;
		return this.anInt49 - this.anInt48 >> 15;
	}
}
