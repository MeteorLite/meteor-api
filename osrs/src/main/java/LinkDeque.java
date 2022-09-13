import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class LinkDeque {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	Link field4174;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	Link field4173;

	public LinkDeque() {
		this.field4174 = new Link();
		this.field4174.field4495 = this.field4174;
		this.field4174.field4494 = this.field4174;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Loy;)V"
	)
	public void method6384(Link var1) {
		if (var1.field4494 != null) {
			var1.method7333();
		}

		var1.field4494 = this.field4174.field4494;
		var1.field4495 = this.field4174;
		var1.field4494.field4495 = var1;
		var1.field4495.field4494 = var1;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "()Loy;"
	)
	public Link method6386() {
		Link var1 = this.field4174.field4495;
		if (var1 == this.field4174) {
			this.field4173 = null;
			return null;
		} else {
			this.field4173 = var1.field4495;
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "()Loy;"
	)
	public Link method6393() {
		Link var1 = this.field4173;
		if (var1 == this.field4174) {
			this.field4173 = null;
			return null;
		} else {
			this.field4173 = var1.field4495;
			return var1;
		}
	}
}
