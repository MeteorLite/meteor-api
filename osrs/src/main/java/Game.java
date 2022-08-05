// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Game extends Applet
        implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    public static boolean aBoolean36;
    public final boolean aBoolean1;
    public final byte aByte2;
    public final int anInt3;
    public int anInt4;
    public boolean aBoolean5;
    public int anInt6;
    public int anInt7;
    public int anInt8;
    public final long[] aLongArray9;
    public int anInt10;
    public boolean aBoolean11;
    public int gameWidth;
    public int gameHeight;
    public Graphics graphics;
    public ComponentImageProducer aComponentImageProducer_15;
    public final Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array16;
    public GameWindow gameWindow;
    public boolean shouldFillBackground;
    public boolean aBoolean19;
    public int mouseIdleMs;
    public int lastMouseButtonPressed;
    public int anInt22;
    public int anInt23;
    public int mouseEventButtonPressed;
    public int mouseEventClickX;
    public int mouseEventClickY;
    public long mouseEventTime;
    public int anInt28;
    public int anInt29;
    public int anInt30;
    public long aLong31;
    public final int[] anIntArray32;
    public final int[] anIntArray33;
    public int anInt34;
    public int anInt35;

    public Game() {
        aBoolean1 = true;
        aByte2 = 7;
        anInt3 = 2;
        anInt4 = 5;
        aBoolean5 = false;
        anInt7 = 20;
        anInt8 = 1;
        aLongArray9 = new long[10];
        aBoolean11 = false;
        aClass44_Sub3_Sub1_Sub2Array16 = new Class44_Sub3_Sub1_Sub2[6];
        shouldFillBackground = true;
        aBoolean19 = true;
        anIntArray32 = new int[128];
        anIntArray33 = new int[128];
    }

    public void createClientFrame(boolean flag, int width, int height) {
        if (flag)
            anInt4 = 171;
        gameWidth = width;
        gameHeight = height;
        gameWindow = new GameWindow(this, gameWidth, gameHeight, 0);
    }

    public void createClientFramePost() {
        graphics = getGameWindow(aByte2).getGraphics();
        aComponentImageProducer_15 = new ComponentImageProducer(gameHeight, gameWidth, getGameWindow(aByte2));
        startRunnable(this, 1);
    }



    public void method2(int i, int j, byte byte0) {
        if (byte0 != 23) {
        } else {
            gameWidth = j;
            gameHeight = i;
            graphics = getGameWindow(aByte2).getGraphics();
            aComponentImageProducer_15 = new ComponentImageProducer(gameHeight, gameWidth, getGameWindow(aByte2));
            startRunnable(this, 1);
        }
    }

    public void run() {
        getGameWindow(aByte2).addMouseListener(this);
        getGameWindow(aByte2).addMouseMotionListener(this);
        getGameWindow(aByte2).addKeyListener(this);
        getGameWindow(aByte2).addFocusListener(this);
        if (gameWindow != null)
            gameWindow.addWindowListener(this);
        drawString("Loading...", 0, 7);
        startup();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for (int k1 = 0; k1 < 10; k1++)
            aLongArray9[k1] = System.currentTimeMillis();

        long l = System.currentTimeMillis();
        while (anInt6 >= 0) {
            if (anInt6 > 0) {
                anInt6--;
                if (anInt6 == 0) {
                    method3(6568);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if (aLongArray9[i] == 0L) {
                j = i2;
                k = j2;
            } else if (l1 > aLongArray9[i])
                j = (int) ((long) (2560 * anInt7) / (l1 - aLongArray9[i]));
            if (j < 25)
                j = 25;
            if (j > 256) {
                j = 256;
                k = (int) ((long) anInt7 - (l1 - aLongArray9[i]) / 10L);
            }
            if (k > anInt7)
                k = anInt7;
            aLongArray9[i] = l1;
            i = (i + 1) % 10;
            if (k > 1) {
                for (int k2 = 0; k2 < 10; k2++)
                    if (aLongArray9[k2] != 0L)
                        aLongArray9[k2] += k;

            }
            if (k < anInt8)
                k = anInt8;
            try {
                Thread.sleep(k);
            } catch (InterruptedException _ex) {
                j1++;
            }
            for (; i1 < 256; i1 += j) {
                anInt28 = mouseEventButtonPressed;
                anInt29 = mouseEventClickX;
                anInt30 = mouseEventClickY;
                aLong31 = mouseEventTime;
                mouseEventButtonPressed = 0;
                method7(0);
                anInt34 = anInt35;
            }

            i1 &= 0xff;
            if (anInt7 > 0)
                anInt10 = (1000 * j) / (anInt7 * 256);
            method9(true);
            if (aBoolean11) {
                System.out.println("ntime:" + l1);
                for (int l2 = 0; l2 < 10; l2++) {
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray9[i3]);
                }

                System.out.println("fps:" + anInt10 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt7 + " mindel:" + anInt8);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean11 = false;
                j1 = 0;
            }
        }
        if (anInt6 == -1)
            method3(6568);
    }

    public void method3(int i) {
        anInt6 = -2;
        method8(22257);
        if (i != 6568) {
            for (int j = 1; j > 0; j++) ;
        }
        try {
            Thread.sleep(1000L);
        } catch (Exception ignored) {
        }
        try {
            System.exit(0);
        } catch (Throwable ignored) {
        }
    }

    public void method4(int i, int j) {
        anInt7 = 1000 / j;
        if (i != -27605)
            aBoolean5 = !aBoolean5;
    }

    public void start() {
        if (anInt6 >= 0)
            anInt6 = 0;
    }

    public void stop() {
        if (anInt6 >= 0)
            anInt6 = 4000 / anInt7;
    }

    public void destroy() {
        anInt6 = -1;
        try {
            Thread.sleep(5000L);
        } catch (Exception ignored) {
        }
        if (anInt6 == -1)
            method3(6568);
    }

    public void update(Graphics g) {
        if (graphics == null)
            graphics = g;
        shouldFillBackground = true;
        method10(148);
    }

    public void paint(Graphics g) {
        if (graphics == null)
            graphics = g;
        shouldFillBackground = true;
        method10(148);
    }

    public void mousePressed(MouseEvent mouseEvent) {
        int i = mouseEvent.getX();
        int j = mouseEvent.getY();
        mouseIdleMs = 0;
        mouseEventClickX = i;
        mouseEventClickY = j;
        mouseEventTime = System.currentTimeMillis();
        if (mouseEvent.getButton() == 1) {
            mouseEventButtonPressed = 1;
        } else {
            mouseEventButtonPressed = 2;
        }
        lastMouseButtonPressed = mouseEventButtonPressed;
    }

    public void mouseReleased(MouseEvent mouseevent) {
        mouseIdleMs = 0;
        lastMouseButtonPressed = 0;
    }

    public void mouseClicked(MouseEvent mouseevent) {
    }

    public void mouseEntered(MouseEvent mouseevent) {
    }

    public void mouseExited(MouseEvent mouseevent) {
        mouseIdleMs = 0;
        anInt22 = -1;
        anInt23 = -1;
    }

    public void mouseDragged(MouseEvent mouseevent) {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        mouseIdleMs = 0;
        anInt22 = i;
        anInt23 = j;
    }

    public void mouseMoved(MouseEvent mouseevent) {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        mouseIdleMs = 0;
        anInt22 = i;
        anInt23 = j;
    }

    public void keyPressed(KeyEvent keyevent) {
        mouseIdleMs = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
        if (j < 30)
            j = 0;
        if (i == 37)
            j = 1;
        if (i == 39)
            j = 2;
        if (i == 38)
            j = 3;
        if (i == 40)
            j = 4;
        if (i == 17)
            j = 5;
        if (i == 8)
            j = 8;
        if (i == 127)
            j = 8;
        if (i == 9)
            j = 9;
        if (i == 10)
            j = 10;
        if (i >= 112 && i <= 123)
            j = (1008 + i) - 112;
        if (i == 36)
            j = 1000;
        if (i == 35)
            j = 1001;
        if (i == 33)
            j = 1002;
        if (i == 34)
            j = 1003;
        if (j > 0 && j < 128)
            anIntArray32[j] = 1;
        if (j > 4) {
            anIntArray33[anInt35] = j;
            anInt35 = anInt35 + 1 & 0x7f;
        }
    }

    public void keyReleased(KeyEvent keyevent) {
        mouseIdleMs = 0;
        int i = keyevent.getKeyCode();
        char c = keyevent.getKeyChar();
        if (c < '\036')
            c = '\0';
        if (i == 37)
            c = '\001';
        if (i == 39)
            c = '\002';
        if (i == 38)
            c = '\003';
        if (i == 40)
            c = '\004';
        if (i == 17)
            c = '\005';
        if (i == 8)
            c = '\b';
        if (i == 127)
            c = '\b';
        if (i == 9)
            c = '\t';
        if (i == 10)
            c = '\n';
        if (c > 0 && c < '\200')
            anIntArray32[c] = 0;
    }

    public void keyTyped(KeyEvent keyevent) {
    }

    public int method5(byte byte0) {
        if (byte0 != 5)
            return 0;
        int i = -1;
        if (anInt35 != anInt34) {
            i = anIntArray33[anInt34];
            anInt34 = anInt34 + 1 & 0x7f;
        }
        return i;
    }

    public void focusGained(FocusEvent focusevent) {
        aBoolean19 = true;
        shouldFillBackground = true;
        method10(148);
    }

    public void focusLost(FocusEvent focusevent) {
        aBoolean19 = false;
        for (int i = 0; i < 128; i++)
            anIntArray32[i] = 0;

    }

    public void windowActivated(WindowEvent windowevent) {
    }

    public void windowClosed(WindowEvent windowevent) {
    }

    public void windowClosing(WindowEvent windowevent) {
        destroy();
    }

    public void windowDeactivated(WindowEvent windowevent) {
    }

    public void windowDeiconified(WindowEvent windowevent) {
    }

    public void windowIconified(WindowEvent windowevent) {
    }

    public void windowOpened(WindowEvent windowevent) {
    }

    public void startup() {
    }

    public void method7(int i) {
        if (i == 0) ;
    }

    public void method8(int i) {
        if (i != 22257) {
            for (int j = 1; j > 0; j++) ;
        }
    }

    public void method9(boolean flag) {
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
    }

    public void method10(int i) {
        i = 36 / i;
    }

    public Component getGameWindow(byte byte0) {

        return this;
    }

    public void startRunnable(Runnable runnable, int priority) {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(priority);
    }

    public void drawString(String text, int x, int j) {
        while (graphics == null) {
            graphics = getGameWindow(aByte2).getGraphics();
            try {
                getGameWindow(aByte2).repaint();
            } catch (Exception ignored) {
            }
            try {
                Thread.sleep(1000L);
            } catch (Exception ignored) {
            }
        }
        Font font = new Font("Helvetica", 1, 13);
        if (j != 7) {
            for (int k = 1; k > 0; k++) ;
        }
        FontMetrics fontmetrics = getGameWindow(aByte2).getFontMetrics(font);
        Font font1 = new Font("Helvetica", 0, 13);
        getGameWindow(aByte2).getFontMetrics(font1);
        if (shouldFillBackground) {
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, gameWidth, gameHeight);
            shouldFillBackground = false;
        }
        Color color = new Color(140, 17, 17);
        int l = gameHeight / 2 - 18;
        graphics.setColor(color);
        graphics.drawRect(gameWidth / 2 - 152, l, 304, 34);
        graphics.fillRect(gameWidth / 2 - 150, l + 2, x * 3, 30);
        graphics.setColor(Color.black);
        graphics.fillRect((gameWidth / 2 - 150) + x * 3, l + 2, 300 - x * 3, 30);
        graphics.setFont(font);
        graphics.setColor(Color.white);
        graphics.drawString(text, (gameWidth - fontmetrics.stringWidth(text)) / 2, l + 22);
    }
}
