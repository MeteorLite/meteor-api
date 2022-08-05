import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import net.runelite.mapping.ObfuscatedSignature;

public class Game extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {
	public int mouseIdleMs;
	public int anInt6;
	public boolean aBoolean19;
	public int anInt35;
	public int anInt28;
	public final byte aByte2;
	public int gameWidth;
	public Graphics graphics;
	public final boolean aBoolean1;
	public int anInt7;
	public int anInt34;
	public ComponentImageProducer aComponentImageProducer_15;
	public int lastMouseButtonPressed;
	public boolean shouldFillBackground;
	public GameWindow gameWindow;
	public int gameHeight;
	public int anInt22;
	public int anInt29;
	public final int[] anIntArray33;
	public final int[] anIntArray32;
	public int mouseEventClickX;
	public int anInt23;
	public final int anInt3;
	public int anInt8;
	public int mouseEventClickY;
	public int anInt30;
	public int anInt4;
	public boolean aBoolean5;
	public long mouseEventTime;
	public int mouseEventButtonPressed;
	public final long[] aLongArray9;
	public boolean aBoolean11;
	public final Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array16;
	public long aLong31;
	public int anInt10;

	public Game() {
		this.aBoolean1 = true;
		this.aByte2 = 7;
		this.anInt3 = 2;
		this.anInt4 = 5;
		this.aBoolean5 = false;
		this.anInt7 = 20;
		this.anInt8 = 1;
		this.aLongArray9 = new long[10];
		this.aBoolean11 = false;
		this.aClass44_Sub3_Sub1_Sub2Array16 = new Class44_Sub3_Sub1_Sub2[6];
		this.shouldFillBackground = true;
		this.aBoolean19 = true;
		this.anIntArray32 = new int[128];
		this.anIntArray33 = new int[128];
	}

	public void destroy() {
		this.anInt6 = -1;

		try {
			Thread.sleep(5000L);
		} catch (Exception var2) {
		}

		if (this.anInt6 == -1) {
			this.method3();
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "7"
	)
	public void drawString(String var1, int var2, int var3) {
		while (this.graphics == null) {
			this.graphics = this.getGameWindow(this.aByte2).getGraphics();

			try {
				this.getGameWindow(this.aByte2).repaint();
			} catch (Exception var10) {
			}

			try {
				Thread.sleep(1000L);
			} catch (Exception var9) {
			}
		}

		Font var4 = new Font("Helvetica", 1, 13);
		FontMetrics var5 = this.getGameWindow(this.aByte2).getFontMetrics(var4);
		Font var6 = new Font("Helvetica", 0, 13);
		this.getGameWindow(this.aByte2).getFontMetrics(var6);
		if (this.shouldFillBackground) {
			this.graphics.setColor(Color.black);
			this.graphics.fillRect(0, 0, this.gameWidth, this.gameHeight);
			this.shouldFillBackground = false;
		}

		Color var7 = new Color(140, 17, 17);
		int var8 = this.gameHeight / 2 - 18;
		this.graphics.setColor(var7);
		this.graphics.drawRect(this.gameWidth / 2 - 152, var8, 304, 34);
		this.graphics.fillRect(this.gameWidth / 2 - 150, var8 + 2, var2 * 3, 30);
		this.graphics.setColor(Color.black);
		this.graphics.fillRect(this.gameWidth / 2 - 150 + var2 * 3, var8 + 2, 300 - var2 * 3, 30);
		this.graphics.setFont(var4);
		this.graphics.setColor(Color.white);
		this.graphics.drawString(var1, (this.gameWidth - var5.stringWidth(var1)) / 2, var8 + 22);
	}

	public Component getGameWindow(byte var1) {
		return this;
	}

	public void createClientFramePost() {
		this.graphics = this.getGameWindow(this.aByte2).getGraphics();
		this.aComponentImageProducer_15 = new ComponentImageProducer(this.gameHeight, this.gameWidth, this.getGameWindow(this.aByte2));
		this.startRunnable(this, 1);
	}

	public void startRunnable(Runnable var1, int var2) {
		Thread var3 = new Thread(var1);
		var3.start();
		var3.setPriority(var2);
	}

	public void run() {
		this.getGameWindow(this.aByte2).addMouseListener(this);
		this.getGameWindow(this.aByte2).addMouseMotionListener(this);
		this.getGameWindow(this.aByte2).addKeyListener(this);
		this.getGameWindow(this.aByte2).addFocusListener(this);
		if (this.gameWindow != null) {
			this.gameWindow.addWindowListener(this);
		}

		this.drawString("Loading...", 0, 7);
		this.startup();
		int var1 = 0;
		int var2 = 256;
		int var3 = 1;
		int var4 = 0;
		int var5 = 0;

		for (int var6 = 0; var6 < 10; ++var6) {
			this.aLongArray9[var6] = System.currentTimeMillis();
		}

		long var15 = System.currentTimeMillis();

		while (true) {
			long var10;
			int var12;
			do {
				if (this.anInt6 < 0) {
					if (this.anInt6 == -1) {
						this.method3();
					}

					return;
				}

				if (this.anInt6 > 0) {
					--this.anInt6;
					if (this.anInt6 == 0) {
						this.method3();
						return;
					}
				}

				int var8 = var2;
				int var9 = var3;
				var2 = 300;
				var3 = 1;
				var10 = System.currentTimeMillis();
				if (this.aLongArray9[var1] == 0L) {
					var2 = var8;
					var3 = var9;
				} else if (var10 > this.aLongArray9[var1]) {
					var2 = (int)((long)(this.anInt7 * 2560) / (var10 - this.aLongArray9[var1]));
				}

				if (var2 < 25) {
					var2 = 25;
				}

				if (var2 > 256) {
					var2 = 256;
					var3 = (int)((long)this.anInt7 - (var10 - this.aLongArray9[var1]) / 10L);
				}

				if (var3 > this.anInt7) {
					var3 = this.anInt7;
				}

				this.aLongArray9[var1] = var10;
				var1 = (var1 + 1) % 10;
				if (var3 > 1) {
					for (var12 = 0; var12 < 10; ++var12) {
						if (this.aLongArray9[var12] != 0L) {
							long[] var10000 = this.aLongArray9;
							var10000[var12] += (long)var3;
						}
					}
				}

				if (var3 < this.anInt8) {
					var3 = this.anInt8;
				}

				try {
					Thread.sleep((long)var3);
				} catch (InterruptedException var14) {
					++var5;
				}

				while (var4 < 256) {
					this.anInt28 = this.mouseEventButtonPressed;
					this.anInt29 = this.mouseEventClickX;
					this.anInt30 = this.mouseEventClickY;
					this.aLong31 = this.mouseEventTime;
					this.mouseEventButtonPressed = 0;
					this.method7(0);
					this.anInt34 = this.anInt35;
					var4 += var2;
				}

				var4 &= 255;
				if (this.anInt7 > 0) {
					this.anInt10 = var2 * 1000 / (this.anInt7 * 256);
				}

				this.method9();
			} while(!this.aBoolean11);

			System.out.println("ntime:" + var10);

			for (var12 = 0; var12 < 10; ++var12) {
				int var13 = (var1 - var12 - 1 + 20) % 10;
				System.out.println("otim" + var13 + ":" + this.aLongArray9[var13]);
			}

			System.out.println("fps:" + this.anInt10 + " ratio:" + var2 + " count:" + var4);
			System.out.println("del:" + var3 + " deltime:" + this.anInt7 + " mindel:" + this.anInt8);
			System.out.println("intex:" + var5 + " opos:" + var1);
			this.aBoolean11 = false;
			var5 = 0;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "22257"
	)
	public void method8() {
	}

	public void startup() {
	}

	public void method10(int var1) {
		var1 = 36 / var1;
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "6568"
	)
	public void method3() {
		this.anInt6 = -2;
		this.method8();

		try {
			Thread.sleep(1000L);
		} catch (Exception var3) {
		}

		try {
			System.exit(0);
		} catch (Throwable var2) {
		}

	}

	public void method4(int var1, int var2) {
		this.anInt7 = 1000 / var2;
	}

	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	public int method5() {
		int var1 = -1;
		if (this.anInt35 != this.anInt34) {
			var1 = this.anIntArray33[this.anInt34];
			this.anInt34 = this.anInt34 + 1 & 127;
		}

		return var1;
	}

	public void createClientFrame(boolean var1, int var2, int var3) {
		this.gameWidth = var2;
		this.gameHeight = var3;
		this.gameWindow = new GameWindow(this, this.gameWidth, this.gameHeight, 0);
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public void method9() {
	}

	public void method7(int var1) {
		if (var1 == 0) {
		}

	}

	public void start() {
		if (this.anInt6 >= 0) {
			this.anInt6 = 0;
		}

	}

	public void stop() {
		if (this.anInt6 >= 0) {
			this.anInt6 = 4000 / this.anInt7;
		}

	}

	public void update(Graphics var1) {
		if (this.graphics == null) {
			this.graphics = var1;
		}

		this.shouldFillBackground = true;
		this.method10(148);
	}

	public void paint(Graphics var1) {
		if (this.graphics == null) {
			this.graphics = var1;
		}

		this.shouldFillBackground = true;
		this.method10(148);
	}

	public void mousePressed(MouseEvent var1) {
		int var2 = var1.getX();
		int var3 = var1.getY();
		this.mouseIdleMs = 0;
		this.mouseEventClickX = var2;
		this.mouseEventClickY = var3;
		this.mouseEventTime = System.currentTimeMillis();
		if (var1.getButton() == 1) {
			this.mouseEventButtonPressed = 1;
		} else {
			this.mouseEventButtonPressed = 2;
		}

		this.lastMouseButtonPressed = this.mouseEventButtonPressed;
	}

	public void mouseReleased(MouseEvent var1) {
		this.mouseIdleMs = 0;
		this.lastMouseButtonPressed = 0;
	}

	public void mouseClicked(MouseEvent var1) {
	}

	public void mouseEntered(MouseEvent var1) {
	}

	public void mouseExited(MouseEvent var1) {
		this.mouseIdleMs = 0;
		this.anInt22 = -1;
		this.anInt23 = -1;
	}

	public void mouseDragged(MouseEvent var1) {
		int var2 = var1.getX();
		int var3 = var1.getY();
		this.mouseIdleMs = 0;
		this.anInt22 = var2;
		this.anInt23 = var3;
	}

	public void mouseMoved(MouseEvent var1) {
		int var2 = var1.getX();
		int var3 = var1.getY();
		this.mouseIdleMs = 0;
		this.anInt22 = var2;
		this.anInt23 = var3;
	}

	public void keyPressed(KeyEvent var1) {
		this.mouseIdleMs = 0;
		int var2 = var1.getKeyCode();
		int var3 = var1.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}

		if (var2 == 37) {
			var3 = 1;
		}

		if (var2 == 39) {
			var3 = 2;
		}

		if (var2 == 38) {
			var3 = 3;
		}

		if (var2 == 40) {
			var3 = 4;
		}

		if (var2 == 17) {
			var3 = 5;
		}

		if (var2 == 8) {
			var3 = 8;
		}

		if (var2 == 127) {
			var3 = 8;
		}

		if (var2 == 9) {
			var3 = 9;
		}

		if (var2 == 10) {
			var3 = 10;
		}

		if (var2 >= 112 && var2 <= 123) {
			var3 = var2 + 1008 - 112;
		}

		if (var2 == 36) {
			var3 = 1000;
		}

		if (var2 == 35) {
			var3 = 1001;
		}

		if (var2 == 33) {
			var3 = 1002;
		}

		if (var2 == 34) {
			var3 = 1003;
		}

		if (var3 > 0 && var3 < 128) {
			this.anIntArray32[var3] = 1;
		}

		if (var3 > 4) {
			this.anIntArray33[this.anInt35] = var3;
			this.anInt35 = this.anInt35 + 1 & 127;
		}

	}

	public void keyReleased(KeyEvent var1) {
		this.mouseIdleMs = 0;
		int var2 = var1.getKeyCode();
		char var3 = var1.getKeyChar();
		if (var3 < 30) {
			var3 = 0;
		}

		if (var2 == 37) {
			var3 = 1;
		}

		if (var2 == 39) {
			var3 = 2;
		}

		if (var2 == 38) {
			var3 = 3;
		}

		if (var2 == 40) {
			var3 = 4;
		}

		if (var2 == 17) {
			var3 = 5;
		}

		if (var2 == 8) {
			var3 = '\b';
		}

		if (var2 == 127) {
			var3 = '\b';
		}

		if (var2 == 9) {
			var3 = '\t';
		}

		if (var2 == 10) {
			var3 = '\n';
		}

		if (var3 > 0 && var3 < 128) {
			this.anIntArray32[var3] = 0;
		}

	}

	public void keyTyped(KeyEvent var1) {
	}

	public void focusGained(FocusEvent var1) {
		this.aBoolean19 = true;
		this.shouldFillBackground = true;
		this.method10(148);
	}

	public void focusLost(FocusEvent var1) {
		this.aBoolean19 = false;

		for (int var2 = 0; var2 < 128; ++var2) {
			this.anIntArray32[var2] = 0;
		}

	}

	public void windowActivated(WindowEvent var1) {
	}

	public void windowClosed(WindowEvent var1) {
	}

	public void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public void windowDeactivated(WindowEvent var1) {
	}

	public void windowDeiconified(WindowEvent var1) {
	}

	public void windowIconified(WindowEvent var1) {
	}

	public void windowOpened(WindowEvent var1) {
	}
}
