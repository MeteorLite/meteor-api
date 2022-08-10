public class MouseCapturer implements Runnable {
	public Client _client;
	public boolean capturing = true;
	public int coordsY[] = new int[500];
	public Object objectLock = new Object();
	public Client client;
	public int coord;
	public int coordsX[] = new int[500];


	public void run() {
		while (capturing) {
			synchronized (objectLock) {
				if (coord < 500) {
					coordsX[coord] = client.mouseX;
					coordsY[coord] = client.mouseY;
					coord++;
				}
			}
			try {
				Thread.sleep(50L);
			} catch (Exception _ex) {
			}
		}
	}
	public MouseCapturer(Client _client) {
		client = _client;
	}

}
