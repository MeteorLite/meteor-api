public class Node {

  public long uid;
  public Node aClass50_834;
  public Node aClass50_835;

  public void unlink() {
    if (aClass50_835 == null) {
    } else {
      aClass50_835.aClass50_834 = aClass50_834;
      aClass50_834.aClass50_835 = aClass50_835;
      aClass50_834 = null;
      aClass50_835 = null;
    }
  }

}