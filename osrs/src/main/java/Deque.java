public class Deque {

  public Node aClass50_129;
  public Node aClass50_130;

  public Deque() {
    aClass50_129 = new Node();
    aClass50_129.aClass50_834 = aClass50_129;
    aClass50_129.aClass50_835 = aClass50_129;
  }

  public void method155(Node node) {
    if (node.aClass50_835 != null) {
      node.unlink();
    }
    node.aClass50_835 = aClass50_129.aClass50_835;
    node.aClass50_834 = aClass50_129;
    node.aClass50_835.aClass50_834 = node;
    node.aClass50_834.aClass50_835 = node;
  }

  public void method156(Node node) {
    if (node.aClass50_835 != null) {
      node.unlink();
    }
    node.aClass50_835 = aClass50_129;
    node.aClass50_834 = aClass50_129.aClass50_834;
    node.aClass50_835.aClass50_834 = node;
    node.aClass50_834.aClass50_835 = node;
  }

  public Node method157() {
    Node node = aClass50_129.aClass50_834;
    if (node == aClass50_129) {
      return null;
    } else {
      node.unlink();
      return node;
    }
  }

  public Node method158() {
    Node node = aClass50_129.aClass50_834;
    if (node == aClass50_129) {
      aClass50_130 = null;
      return null;
    } else {
      aClass50_130 = node.aClass50_834;
      return node;
    }
  }

  public Node method159() {
    Node node = aClass50_129.aClass50_835;
    if (node == aClass50_129) {
      aClass50_130 = null;
      return null;
    } else {
      aClass50_130 = node.aClass50_835;
      return node;
    }
  }

  public Node method160() {
    Node node = aClass50_130;
    if (node == aClass50_129) {
      aClass50_130 = null;
      return null;
    }
    aClass50_130 = node.aClass50_834;
    return node;
  }

  public Node method161() {
    Node node = aClass50_130;
    if (node == aClass50_129) {
      aClass50_130 = null;
      return null;
    }
    aClass50_130 = node.aClass50_835;
    return node;
  }

  public void method162() {
    if (aClass50_129.aClass50_834 == aClass50_129) {
      return;
    }
    do {
      Node node = aClass50_129.aClass50_834;
      if (node == aClass50_129) {
        return;
      }
      node.unlink();
    } while (true);
  }

}