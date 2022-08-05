import net.runelite.mapping.ObfuscatedSignature;

public class Class22 {
	public static int anInt454;
	public static Class22[] aClass22Array455;
	public final byte aByte452;
	public int[] anIntArray457;
	public final int[] anIntArray460;
	public boolean aBoolean453;
	public final int[] anIntArray458;
	public int anInt456;
	public boolean aBoolean461;
	public final int[] anIntArray459;

	public Class22() {
		this.anIntArray460 = new int[]{-1, -1, -1, -1, -1};
		this.aByte452 = 0;
		this.aBoolean453 = false;
		this.anInt456 = -1;
		this.anIntArray458 = new int[6];
		this.anIntArray459 = new int[6];
		this.aBoolean461 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "0"
	)
	public boolean method251() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.anIntArray460[var2] != -1 && !Model.method504(this.anIntArray460[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	public Model method252(byte var1) {
		Model[] var2 = new Model[5];
		int var3 = 0;
		if (var1 != 7) {
			throw new NullPointerException();
		} else {
			boolean var6 = false;

			for (int var4 = 0; var4 < 5; ++var4) {
				if (this.anIntArray460[var4] != -1) {
					var2[var3++] = Model.method503(this.anIntArray460[var4]);
				}
			}

			Model var7 = new Model(var3, -643, var2);

			for (int var5 = 0; var5 < 6 && this.anIntArray458[var5] != 0; ++var5) {
				var7.method517(this.anIntArray458[var5], this.anIntArray459[var5]);
			}

			return var7;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "3"
	)
	public boolean method249() {
		if (this.anIntArray457 == null) {
			return true;
		} else {
			boolean var1 = true;
			int[] var2 = this.anIntArray457;
			int var3 = var2.length;

			for (int var4 = 0; var4 < var3; ++var4) {
				int var5 = var2[var4];
				if (!Model.method504(var5)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	public Model method250(byte var1) {
		if (this.aByte452 != var1) {
			this.aBoolean453 = !this.aBoolean453;
		}

		if (this.anIntArray457 == null) {
			return null;
		} else {
			Model[] var2 = new Model[this.anIntArray457.length];

			for (int var3 = 0; var3 < this.anIntArray457.length; ++var3) {
				var2[var3] = Model.method503(this.anIntArray457[var3]);
			}

			Model var5;
			if (var2.length == 1) {
				var5 = var2[0];
			} else {
				var5 = new Model(var2.length, -643, var2);
			}

			for (int var4 = 0; var4 < 6 && this.anIntArray458[var4] != 0; ++var4) {
				var5.method517(this.anIntArray458[var4], this.anIntArray459[var4]);
			}

			return var5;
		}
	}

	public void method248(byte var1, Buffer var2) {
		while (true) {
			int var3 = var2.readUByte();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				this.anInt456 = var2.readUByte();
			} else if (var3 == 2) {
				int var4 = var2.readUByte();
				this.anIntArray457 = new int[var4];

				for (int var5 = 0; var5 < var4; ++var5) {
					this.anIntArray457[var5] = var2.readUShort();
				}
			} else if (var3 == 3) {
				this.aBoolean461 = true;
			} else if (var3 >= 40 && var3 < 50) {
				this.anIntArray458[var3 - 40] = var2.readUShort();
			} else if (var3 >= 50 && var3 < 60) {
				this.anIntArray459[var3 - 50] = var2.readUShort();
			} else if (var3 >= 60 && var3 < 70) {
				this.anIntArray460[var3 - 60] = var2.readUShort();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}

	public static void method247(boolean var0, Class47 var1) {
		Buffer var2 = new Buffer(var1.method546("idk.dat", (byte[])null), (byte)1);
		anInt454 = var2.readUShort();
		if (aClass22Array455 == null) {
			aClass22Array455 = new Class22[anInt454];
		}

		for (int var3 = 0; var3 < anInt454; ++var3) {
			if (aClass22Array455[var3] == null) {
				aClass22Array455[var3] = new Class22();
			}

			aClass22Array455[var3].method248((byte)2, var2);
		}

	}
}
