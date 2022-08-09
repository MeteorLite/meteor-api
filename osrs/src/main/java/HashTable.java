public class HashTable {

  public int bucketCount;
  public Node[] buckets;

  public HashTable(int i) {
    bucketCount = i;
    buckets = new Node[i];
    for (int j = 0; j < i; j++) {
      Node node = buckets[j] = new Node();
      node.aClass50_834 = node;
      node.aClass50_835 = node;
    }
  }

  public Node method233(long l) {
    Node class50 = buckets[(int) (l & (long) (bucketCount - 1))];
    for (Node class50_1 = class50.aClass50_834; class50_1 != class50;
        class50_1 = class50_1.aClass50_834) {
      if (class50_1.uid == l) {
        return class50_1;
      }
    }

    return null;
  }

  public void method234(Node node, long uid) {
    if (node.aClass50_835 != null) {
      node.unlink();
    }
    Node class50_1 = buckets[(int) (uid & (long) (bucketCount - 1))];
    node.aClass50_835 = class50_1.aClass50_835;
    node.aClass50_834 = class50_1;
    node.aClass50_835.aClass50_834 = node;
    node.aClass50_834.aClass50_835 = node;
    node.uid = uid;
  }
}
