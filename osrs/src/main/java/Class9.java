public class Class9 {
	public final int anInt254;
	public final int[] anIntArray255;
	public final int[][] anIntArrayArray256;

	public Class9(int var1, Class44_Sub3_Sub2 var2) {
		this.anInt254 = var2.get1();
		this.anIntArray255 = new int[this.anInt254];
		this.anIntArrayArray256 = new int[this.anInt254][];

		int var3;
		for (var3 = 0; var3 < this.anInt254; ++var3) {
			this.anIntArray255[var3] = var2.get1();
		}

		for (var3 = 0; var3 < this.anInt254; ++var3) {
			int var4 = var2.get1();
			this.anIntArrayArray256[var3] = new int[var4];

			for (int var5 = 0; var5 < var4; ++var5) {
				this.anIntArrayArray256[var3][var5] = var2.get1();
			}
		}

	}
}
