// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import net.runelite.mapping.Export;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends Frame {

    public final Game game;

    public Graphics graphics;

    public GameWindow(Game game, int width, int height, int k) {
        this.game = game;
        setTitle("Jagex");
        //setResizable(false);
        show();
        toFront();
        graphics = this.getGraphics();
        if (k != 0) {
            throw new NullPointerException();
        } else {
            resize(width, height);
        }
    }
}
