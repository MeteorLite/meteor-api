public class DualNode extends Node {

  public DualNode nextDualNode;
  public DualNode previousDualNode;

  public void removeDualNode() {
    if (this.nextDualNode != null) {
      this.nextDualNode.previousDualNode = this.previousDualNode;
      this.previousDualNode.nextDualNode = this.nextDualNode;
      this.previousDualNode = null;
      this.nextDualNode = null;
    }
  }
}
