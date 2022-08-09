public class MouseCapturer implements Runnable {

  public boolean running;
  public int[] anIntArray132;
  public Object synchronizedObject;
  public Client client;
  public int anInt135;
  public int anInt136;
  public int[] anIntArray137;
  public MouseCapturer(Client client1, byte byte0) {
    running = true;
    anIntArray132 = new int[500];
    synchronizedObject = new Object();
    anInt135 = 8;
    anIntArray137 = new int[500];
    client = client1;
  }

  @Override
  public void run() {
    while (running) {
      synchronized (synchronizedObject) {
        if (anInt136 < 500) {
          anIntArray137[anInt136] = client.anInt22;
          anIntArray132[anInt136] = client.anInt23;
          anInt136++;
        }
      }
      try {
        Thread.sleep(50L);
      } catch (Exception _ex) {
      }
    }
  }

}