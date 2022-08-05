public class DualNode extends Node {
	public DualNode next;
	public DualNode previous;

	public void unlinktwo() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
