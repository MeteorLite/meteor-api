import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class Link {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public Link field4495;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public Link field4494;

	@ObfuscatedName("c")
	public void method7333() {
		if (this.field4494 != null) {
			this.field4494.field4495 = this.field4495;
			this.field4495.field4494 = this.field4494;
			this.field4495 = null;
			this.field4494 = null;
		}
	}
}
