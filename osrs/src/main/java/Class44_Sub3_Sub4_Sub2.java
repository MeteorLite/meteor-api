import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub4_Sub2 extends Renderable {
	public int anInt1480;
	public boolean aBoolean1479;
	public int anInt1481;

	public Class44_Sub3_Sub4_Sub2() {
		this.aBoolean1479 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LModel;",
		garbageValue = "0"
	)
	public Model getModel(boolean var1) {
		Class14 var2 = Class14.method220(this.anInt1480);
		return var2.method224(this.anInt1481);
	}
}
