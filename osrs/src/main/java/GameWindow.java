// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;

public class GameWindow extends Frame {

    public final Game game;

    public GameWindow(Game game, int width, int height, int k) {
        this.game = game;
        setTitle("Jagex");
        setResizable(false);
        show();
        toFront();
        if (k != 0) {
            throw new NullPointerException();
        } else {
            resize(width + 8, height + 28);
        }
    }

    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public void update(Graphics g) {
        game.update(g);
    }

    public void paint(Graphics g) {
        game.paint(g);
    }
}
