public class Queue {

  public CacheableNode head;
  public CacheableNode current;

  public Queue() {
    head = new CacheableNode();
    head.nextCacheable = head;
    head.previousCacheable = head;
  }

  public void insertBack(CacheableNode cacheableNode) {
    if (cacheableNode.previousCacheable != null) {
      cacheableNode.unlinkCacheable();
    }
    cacheableNode.previousCacheable = head.previousCacheable;
    cacheableNode.nextCacheable = head;
    cacheableNode.previousCacheable.nextCacheable = cacheableNode;
    cacheableNode.nextCacheable.previousCacheable = cacheableNode;
  }

  public CacheableNode popFront() {
    CacheableNode cacheableNode = head.nextCacheable;
    if (cacheableNode == head) {
      return null;
    }
    cacheableNode.unlinkCacheable();
    return cacheableNode;
  }

  public CacheableNode getFront() {
    CacheableNode cacheableNode = head.nextCacheable;
    if (cacheableNode == head) {
      current = null;
      return null;
    }
    current = cacheableNode.nextCacheable;
    return cacheableNode;
  }

  public CacheableNode getNext() {
    CacheableNode node = current;
    if (node == head) {
      current = null;
      return null;
    }
    current = node.nextCacheable;
    return node;
  }

  public int size() {
    int count = 0;
    for (CacheableNode next = head.nextCacheable; next != head; next = next.nextCacheable) {
      count++;
    }

    return count;
  }
}
