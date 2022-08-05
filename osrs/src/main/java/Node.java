public class Node {
	public Node aNode_762;
	public final int anInt759;
	public Node aNode_761;
	public long aLong760;

	public Node() {
		this.anInt759 = 587;
	}

	public void remove() {
		if (this.aNode_762 != null) {
			this.aNode_762.aNode_761 = this.aNode_761;
			this.aNode_761.aNode_762 = this.aNode_762;
			this.aNode_761 = null;
			this.aNode_762 = null;
		}

	}
}
