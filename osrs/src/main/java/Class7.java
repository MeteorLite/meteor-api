import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedSignature;

public class Class7 implements Runnable {
	public boolean aBoolean205;
	public boolean aBoolean200;
	public int anInt194;
	public boolean aBoolean206;
	public InputStream anInputStream197;
	public int anInt204;
	public final int anInt195;
	public int anInt203;
	public OutputStream anOutputStream198;
	public byte[] aByteArray202;
	public boolean aBoolean196;
	public Socket aSocket199;
	public final Game anGame_201;

	public Class7(int var1, Socket var2, Game var3) throws IOException {
		this.anInt194 = 416;
		this.anInt195 = -2584;
		this.aBoolean196 = false;
		this.aBoolean200 = false;
		this.aBoolean205 = false;
		this.aBoolean206 = false;
		this.anGame_201 = var3;
		this.aSocket199 = var2;
		this.aSocket199.setSoTimeout(30000);
		this.aSocket199.setTcpNoDelay(true);
		this.anInputStream197 = this.aSocket199.getInputStream();
		this.anOutputStream198 = this.aSocket199.getOutputStream();
	}

	public int method193() throws IOException {
		return this.aBoolean200 ? 0 : this.anInputStream197.available();
	}

	public void method191() {
		this.aBoolean200 = true;

		try {
			if (this.anInputStream197 != null) {
				this.anInputStream197.close();
			}

			if (this.anOutputStream198 != null) {
				this.anOutputStream198.close();
			}

			if (this.aSocket199 != null) {
				this.aSocket199.close();
			}
		} catch (IOException var4) {
			System.out.println("Error closing stream");
		}

		this.aBoolean205 = false;
		synchronized(this) {
			this.notify();
		}

		this.aByteArray202 = null;
	}

	public void method194(byte[] var1, int var2, int var3) throws IOException {
		if (!this.aBoolean200) {
			while (var3 > 0) {
				int var4 = this.anInputStream197.read(var1, var2, var3);
				if (var4 <= 0) {
					throw new IOException("EOF");
				}

				var2 += var4;
				var3 -= var4;
			}

		}
	}

	public void method195(int var1, int var2, byte[] var3, int var4) throws IOException {
		if (!this.aBoolean200) {
			if (this.aBoolean206) {
				this.aBoolean206 = false;
				throw new IOException("Error in writer thread");
			} else {
				if (this.aByteArray202 == null) {
					this.aByteArray202 = new byte[5000];
				}

				synchronized(this) {
					for (int var6 = 0; var6 < var1; ++var6) {
						this.aByteArray202[this.anInt204] = var3[var6 + var4];
						this.anInt204 = (this.anInt204 + 1) % 5000;
						if ((this.anInt203 + 4900) % 5000 == this.anInt204) {
							throw new IOException("buffer overflow");
						}
					}

					if (!this.aBoolean205) {
						this.aBoolean205 = true;
						this.anGame_201.startRunnable(this, 3);
					}

					this.notify();
				}

				if (var2 != this.anInt195) {
					this.anInt194 = -158;
				}

			}
		}
	}

	public int method192() throws IOException {
		return this.aBoolean200 ? 0 : this.anInputStream197.read();
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public void method196() {
		System.out.println("dummy:" + this.aBoolean200);
		System.out.println("tcycl:" + this.anInt203);
		System.out.println("tnum:" + this.anInt204);
		System.out.println("writer:" + this.aBoolean205);
		System.out.println("ioerror:" + this.aBoolean206);

		try {
			System.out.println("available:" + this.method193());
		} catch (IOException var2) {
		}

	}

	public void run() {
		while (this.aBoolean205) {
			int var1;
			int var2;
			synchronized(this) {
				if (this.anInt204 == this.anInt203) {
					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}

				if (!this.aBoolean205) {
					return;
				}

				var2 = this.anInt203;
				if (this.anInt204 >= this.anInt203) {
					var1 = this.anInt204 - this.anInt203;
				} else {
					var1 = 5000 - this.anInt203;
				}
			}

			if (var1 > 0) {
				try {
					this.anOutputStream198.write(this.aByteArray202, var2, var1);
				} catch (IOException var7) {
					this.aBoolean206 = true;
				}

				this.anInt203 = (var1 + this.anInt203) % 5000;

				try {
					if (this.anInt204 == this.anInt203) {
						this.anOutputStream198.flush();
					}
				} catch (IOException var6) {
					this.aBoolean206 = true;
				}
			}
		}

	}
}
