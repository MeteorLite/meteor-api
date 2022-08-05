public class Node {
	public Node nextNode;
	public Node previousNode;
	public long key;

	public void removeNode() {
		if (this.nextNode != null) {
			this.nextNode.previousNode = this.previousNode;
			this.previousNode.nextNode = this.nextNode;
			this.previousNode = null;
			this.nextNode = null;
		}

	}
}
