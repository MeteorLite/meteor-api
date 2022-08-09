import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class ProducingGraphicsBuffer implements ImageProducer, ImageObserver {

  public boolean aBoolean391;
  public int[] pixels;
  public int width;
  public int height;
  public ColorModel colorModel;
  public ImageConsumer imageConsumer;
  public Image image;

  public ProducingGraphicsBuffer(int i, byte byte0, Component component, int j) {
    aBoolean391 = true;
    width = j;
    height = i;
    pixels = new int[j * i];
    colorModel = new DirectColorModel(32, 0xff0000, 65280, 255);
    image = component.createImage(this);
    method232();
    component.prepareImage(image, this);
    method232();
    component.prepareImage(image, this);
    if (byte0 != -12) {
      throw new NullPointerException();
    } else {
      method232();
      component.prepareImage(image, this);
      method230();
    }
  }

  public void method230() {
    Rasterizer.method444(width, height, pixels);
  }

  public void method231(int i, int j, Graphics g, boolean flag) {
    if (flag) {
    } else {
      method232();
      g.drawImage(image, j, i, this);
    }
  }

  @Override
  public synchronized void addConsumer(ImageConsumer imageconsumer) {
    imageConsumer = imageconsumer;
    imageconsumer.setDimensions(width, height);
    imageconsumer.setProperties(null);
    imageconsumer.setColorModel(colorModel);
    imageconsumer.setHints(14);
  }

  @Override
  public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
    return imageConsumer == imageconsumer;
  }

  @Override
  public synchronized void removeConsumer(ImageConsumer imageconsumer) {
    if (imageConsumer == imageconsumer) {
      imageConsumer = null;
    }
  }

  @Override
  public void startProduction(ImageConsumer imageconsumer) {
    addConsumer(imageconsumer);
  }

  @Override
  public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
    System.out.println("TDLR");
  }

  public synchronized void method232() {
    if (imageConsumer == null) {
    } else {
      imageConsumer.setPixels(0, 0, width, height, colorModel, pixels, 0,
          width);
      imageConsumer.imageComplete(2);
    }
  }

  @Override
  public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1) {
    return true;
  }
}
