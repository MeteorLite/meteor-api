import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public enum class453 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field4778(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	field4783(2, 2);

	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 112722803
	)
	public final int field4781;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 773830597
	)
	final int field4782;

	class453(int var3, int var4) {
		this.field4781 = var3;
		this.field4782 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4782;
	}
}
