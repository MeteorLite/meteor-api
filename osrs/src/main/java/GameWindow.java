// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import net.runelite.mapping.Export;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends Frame {

    public final Game game;

    public JPanel panel = new JPanel();

    public GameWindow(Game game, int width, int height, int k) {
        this.game = game;
        setTitle("Jagex");
        //setResizable(false);
        show();
        toFront();
        if (k != 0) {
            throw new NullPointerException();
        } else {
            resize(width + 8, height + 28);
        }
    }

    //This fixes a natural offset the game has in the frame
    public Graphics getGraphics() {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }
}
