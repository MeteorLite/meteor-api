public class Class42 {

  public final Node[] aNodeArray758;
  public int anInt753;
  public final int anInt757;
  public final int anInt754;
  public final byte aByte755;
  public final boolean aBoolean756;

  public Class42(int var1, int var2) {
    this.anInt753 = 7;
    this.anInt754 = 7228;
    this.aByte755 = 0;
    this.aBoolean756 = false;
    this.anInt757 = var1;
    if (var2 != this.anInt754) {
      this.anInt753 = 236;
    }

    this.aNodeArray758 = new Node[var1];

    for (int var3 = 0; var3 < var1; ++var3) {
      Node var4 = this.aNodeArray758[var3] = new Node();
      var4.previousNode = var4;
      var4.nextNode = var4;
    }

  }

  public Node method380(long var1) {
    Node var3 = this.aNodeArray758[(int) (var1 & (long) (this.anInt757 - 1))];

    for (Node var4 = var3.previousNode; var4 != var3; var4 = var4.previousNode) {
      if (var4.key == var1) {
        return var4;
      }
    }

    return null;
  }

  public void method381(boolean var1, long var2, Node var4) {
    if (var4.nextNode != null) {
      var4.removeNode();
    }

    Node var5 = this.aNodeArray758[(int) (var2 & (long) (this.anInt757 - 1))];
    var4.nextNode = var5.nextNode;
    var4.previousNode = var5;
    var4.nextNode.previousNode = var4;
    var4.previousNode.nextNode = var4;
    var4.key = var2;
  }
}
