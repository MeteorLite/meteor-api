// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;
import java.awt.image.*;

public class ImageProducer
        implements java.awt.image.ImageProducer, ImageObserver {
    public final int[] pixels;
    public final int width;
    public final int height;
    public final ColorModel colorModel;
    public ImageConsumer anImageConsumer575;
    public final Image gameImage;

    public ImageProducer(int height, int width, Component component) {
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
        colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
        gameImage = component.createImage(this);
        drawPixels();
        component.prepareImage(gameImage, this);
        drawPixels();
        component.prepareImage(gameImage, this);
        drawPixels();
        component.prepareImage(gameImage, this);
        initDrawingArea();
    }

    public void initDrawingArea() {
        DrawingArea.initDrawingArea(width, height, pixels, 9);
    }

    public void method273(int i, Graphics g, byte byte0, int j) {
        drawPixels();
        g.drawImage(gameImage, i, j, this);
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer) {
        anImageConsumer575 = imageconsumer;
        imageconsumer.setDimensions(width, height);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(colorModel);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        return anImageConsumer575 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
        if (anImageConsumer575 == imageconsumer)
            anImageConsumer575 = null;
    }

    public void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public synchronized void drawPixels() {
        if (anImageConsumer575 == null) {
        } else {
            anImageConsumer575.setPixels(0, 0, width, height, colorModel, pixels, 0, width);
            anImageConsumer575.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
        return true;
    }
}
