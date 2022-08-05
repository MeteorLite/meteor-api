public class Class10 implements Runnable {
	public boolean aBoolean259;
	public boolean aBoolean257;
	public final Object anObject260;
	public int anInt261;
	public final int[] anIntArray262;
	public final Client aClient258;
	public final int[] anIntArray263;

	public Class10(int var1, Client var2) {
		this.aBoolean257 = true;
		this.aBoolean259 = true;
		this.anObject260 = new Object();
		this.anIntArray262 = new int[500];
		this.anIntArray263 = new int[500];
		this.aClient258 = var2;
		if (var1 != -39788) {
			this.aBoolean257 = !this.aBoolean257;
		}

	}

	public void run() {
		while (this.aBoolean259) {
			synchronized(this.anObject260) {
				if (this.anInt261 < 500) {
					this.anIntArray262[this.anInt261] = this.aClient258.anInt22;
					this.anIntArray263[this.anInt261] = this.aClient258.anInt23;
					++this.anInt261;
				}
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var3) {
			}
		}

	}
}
