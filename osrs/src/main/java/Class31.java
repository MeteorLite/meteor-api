public class Class31 {
	public DualNode aDualNode_544;
	public final DualNode aDualNode_543;
	public boolean aBoolean542;

	public Class31(byte var1) {
		this.aBoolean542 = true;
		this.aDualNode_543 = new DualNode();
		if (var1 == 8) {
			boolean var2 = false;
			this.aDualNode_543.previousDualNode = this.aDualNode_543;
			this.aDualNode_543.nextDualNode = this.aDualNode_543;
		} else {
			throw new NullPointerException();
		}
	}

	public DualNode method265() {
		DualNode var1 = this.aDualNode_543.previousDualNode;
		if (var1 == this.aDualNode_543) {
			return null;
		} else {
			var1.removeDualNode();
			return var1;
		}
	}

	public int method268() {
		int var1 = 0;

		for (DualNode var2 = this.aDualNode_543.previousDualNode; var2 != this.aDualNode_543; var2 = var2.previousDualNode) {
			++var1;
		}

		return var1;
	}

	public void method264(DualNode var1) {
		if (var1.nextDualNode != null) {
			var1.removeDualNode();
		}

		var1.nextDualNode = this.aDualNode_543.nextDualNode;
		var1.previousDualNode = this.aDualNode_543;
		var1.nextDualNode.previousDualNode = var1;
		var1.previousDualNode.nextDualNode = var1;
	}

	public DualNode method266() {
		DualNode var1 = this.aDualNode_543.previousDualNode;
		if (var1 == this.aDualNode_543) {
			this.aDualNode_544 = null;
			return null;
		} else {
			this.aDualNode_544 = var1.previousDualNode;
			return var1;
		}
	}

	public DualNode method267(byte var1) {
		DualNode var2 = this.aDualNode_544;
		if (var2 == this.aDualNode_543) {
			this.aDualNode_544 = null;
			return null;
		} else {
			this.aDualNode_544 = var2.previousDualNode;
			if (var1 == 0) {
				boolean var3 = false;
			} else {
				this.aBoolean542 = !this.aBoolean542;
			}

			return var2;
		}
	}
}
