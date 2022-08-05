// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;
import java.awt.image.*;

public class ComponentImageProducer
        implements java.awt.image.ImageProducer, ImageObserver {
    public final int[] pixels;
    public final int width;
    public final int height;
    public final ColorModel colorModel;
    public ImageConsumer imageConsumer;
    public final Image gameImage;

    public ComponentImageProducer(int height, int width, Component component) {
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

    public void drawComponentImage(Graphics g, int x, int y) {
        drawPixels();
        g.drawImage(gameImage, x, y, this);
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer) {
        imageConsumer = imageconsumer;
        imageconsumer.setDimensions(width, height);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(colorModel);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
        return imageConsumer == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer) {
        if (imageConsumer == imageconsumer)
            imageConsumer = null;
    }

    public void startProduction(ImageConsumer imageconsumer) {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public synchronized void drawPixels() {
        if (imageConsumer != null) {
            imageConsumer.setPixels(0, 0, width, height, colorModel, pixels, 0, width);
            imageConsumer.imageComplete(2);
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
        return true;
    }
}
