import sign.SignLink;

public class Class33 {

  public int anInt592;
  public int anInt593;
  public int anInt594;
  public CacheableNode aClass50_Sub1_595;
  public int anInt596;
  public int anInt597;
  public HashTable aClass19_598;
  public Queue aClass9_599;
  public Class33(int i) {
    anInt592 = 256;
    aClass50_Sub1_595 = new CacheableNode();
    aClass9_599 = new Queue();
    anInt596 = i;
    anInt597 = i;
    aClass19_598 = new HashTable(1024);
  }

  public CacheableNode method345(long l) {
    CacheableNode class50_sub1 = (CacheableNode) aClass19_598.method233(l);
    if (class50_sub1 != null) {
      aClass9_599.insertBack(class50_sub1);
      anInt594++;
    } else {
      anInt593++;
    }
    return class50_sub1;
  }

  public void method346(CacheableNode class50_sub1, long l, int i) {
    try {
      if (i != 5) {
        anInt592 = 150;
      }
      if (anInt597 == 0) {
        CacheableNode class50_sub1_1 = aClass9_599.popFront();
        class50_sub1_1.unlink();
        class50_sub1_1.unlinkCacheable();
        if (class50_sub1_1 == aClass50_Sub1_595) {
          CacheableNode class50_sub1_2 = aClass9_599.popFront();
          class50_sub1_2.unlink();
          class50_sub1_2.unlinkCacheable();
        }
      } else {
        anInt597--;
      }
      aClass19_598.method234(class50_sub1, l);
      aClass9_599.insertBack(class50_sub1);
      return;
    } catch (RuntimeException runtimeexception) {
      SignLink.reporterror("76413, " + class50_sub1 + ", " + l + ", " + i
          + ", " + runtimeexception);
    }
    throw new RuntimeException();
  }

  public void method347() {
    do {
      CacheableNode class50_sub1 = aClass9_599.popFront();
      if (class50_sub1 != null) {
        class50_sub1.unlink();
        class50_sub1.unlinkCacheable();
      } else {
        anInt597 = anInt596;
        return;
      }
    } while (true);
  }
}
