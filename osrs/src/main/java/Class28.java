import net.runelite.mapping.ObfuscatedSignature;

public class Class28 {
	public Node aNode_524;
	public final Node aNode_523;
	public boolean aBoolean520;
	public boolean aBoolean521;
	public int anInt522;

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-822"
	)
	public Class28(int var1) {
		this.aBoolean520 = true;
		this.aBoolean521 = true;
		this.anInt522 = -676;
		this.aNode_523 = new Node();
		this.aNode_523.aNode_761 = this.aNode_523;
		this.aNode_523.aNode_762 = this.aNode_523;
	}

	public Node peekFront() {
		Node var1 = this.aNode_523.aNode_761;
		if (var1 == this.aNode_523) {
			this.aNode_524 = null;
			return null;
		} else {
			this.aNode_524 = var1.aNode_761;
			return var1;
		}
	}

	public void method256(Node var1) {
		if (var1.aNode_762 != null) {
			var1.remove();
		}

		var1.aNode_762 = this.aNode_523.aNode_762;
		var1.aNode_761 = this.aNode_523;
		var1.aNode_762.aNode_761 = var1;
		var1.aNode_761.aNode_762 = var1;
	}

	public void method263() {
		if (this.aNode_523.aNode_761 != this.aNode_523) {
			while (true) {
				Node var1 = this.aNode_523.aNode_761;
				if (var1 == this.aNode_523) {
					return;
				}

				var1.remove();
			}
		}
	}

	public Node method258() {
		Node var1 = this.aNode_523.aNode_761;
		if (var1 == this.aNode_523) {
			return null;
		} else {
			var1.remove();
			return var1;
		}
	}

	public Node getPrevious(byte var1) {
		Node var2 = this.aNode_524;
		if (var2 == this.aNode_523) {
			this.aNode_524 = null;
			return null;
		} else {
			this.aNode_524 = var2.aNode_761;
			if (var1 == 0) {
				boolean var3 = false;
			} else {
				this.aBoolean521 = !this.aBoolean521;
			}

			return var2;
		}
	}

	public void method257(boolean var1, Node var2) {
		if (var2.aNode_762 != null) {
			var2.remove();
		}

		var2.aNode_762 = this.aNode_523;
		var2.aNode_761 = this.aNode_523.aNode_761;
		var2.aNode_762.aNode_761 = var2;
		var2.aNode_761.aNode_762 = var2;
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LClass44;",
		garbageValue = "0"
	)
	public Node method260() {
		Node var1 = this.aNode_523.aNode_762;
		if (var1 == this.aNode_523) {
			this.aNode_524 = null;
			return null;
		} else {
			this.aNode_524 = var1.aNode_762;
			return var1;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)LClass44;",
		garbageValue = "0"
	)
	public Node method262() {
		Node var1 = this.aNode_524;
		if (var1 == this.aNode_523) {
			this.aNode_524 = null;
			return null;
		} else {
			this.aNode_524 = var1.aNode_762;
			return var1;
		}
	}
}
