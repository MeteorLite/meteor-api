import net.runelite.mapping.ObfuscatedSignature;

public class Class39 {
	public final Class42 aClass42_682;
	public final Class31 aClass31_683;
	public final int anInt674;
	public int anInt681;
	public final boolean aBoolean675;
	public final int anInt680;
	public int anInt677;
	public boolean aBoolean676;
	public int anInt678;
	public final DualNode aDualNode_679;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	public Class39(int var1, int var2) {
		this.anInt674 = 7228;
		this.aBoolean675 = false;
		this.aBoolean676 = false;
		this.aDualNode_679 = new DualNode();
		this.aClass31_683 = new Class31((byte)8);
		this.anInt680 = var1;
		this.anInt681 = var1;
		this.aClass42_682 = new Class42(1024, this.anInt674);
	}

	public void method341() {
		while (true) {
			DualNode var1 = this.aClass31_683.method265();
			if (var1 == null) {
				this.anInt681 = this.anInt680;
				return;
			}

			var1.removeNode();
			var1.removeDualNode();
		}
	}

	public DualNode method339(long var1) {
		DualNode var3 = (DualNode)this.aClass42_682.method380(var1);
		if (var3 != null) {
			this.aClass31_683.method264(var3);
			++this.anInt678;
		} else {
			++this.anInt677;
		}

		return var3;
	}

	public void method340(int var1, long var2, DualNode var4) {
		var1 = 72 / var1;
		if (this.anInt681 == 0) {
			DualNode var5 = this.aClass31_683.method265();
			var5.removeNode();
			var5.removeDualNode();
			if (var5 == this.aDualNode_679) {
				DualNode var6 = this.aClass31_683.method265();
				var6.removeNode();
				var6.removeDualNode();
			}
		} else {
			--this.anInt681;
		}

		this.aClass42_682.method381(true, var2, var4);
		this.aClass31_683.method264(var4);
	}
}
