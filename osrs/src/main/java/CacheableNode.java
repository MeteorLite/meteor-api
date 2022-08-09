public class CacheableNode extends Node {

  public CacheableNode nextCacheable;
  public CacheableNode previousCacheable;

  public void unlinkCacheable() {
    if (previousCacheable == null) {
      return;
    }
    previousCacheable.nextCacheable = nextCacheable;
    nextCacheable.previousCacheable = previousCacheable;
    nextCacheable = null;
    previousCacheable = null;
  }

}