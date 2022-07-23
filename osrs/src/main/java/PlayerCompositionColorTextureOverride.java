import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fy")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("q")
	public short[] field1814;
	@ObfuscatedName("f")
	public short[] field1815;

	PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = EnumComposition.ItemDefinition_get(var1);
		if (var2.method3737()) {
			this.field1814 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1814, 0, this.field1814.length);
		}

		if (var2.method3728()) {
			this.field1815 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1815, 0, this.field1815.length);
		}

	}
}
