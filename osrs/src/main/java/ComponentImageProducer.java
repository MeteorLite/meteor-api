import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

public class ComponentImageProducer implements ImageProducer, ImageObserver {
	public ImageConsumer imageConsumer;
	public final int width;
	public final int height;
	public final int[] pixels;
	public final Image gameImage;
	public final ColorModel colorModel;

	public ComponentImageProducer(int var1, int var2, Component var3) {
		this.width = var2;
		this.height = var1;
		this.pixels = new int[var2 * var1];
		this.colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		this.gameImage = var3.createImage(this);
		this.drawPixels();
		var3.prepareImage(this.gameImage, this);
		this.drawPixels();
		var3.prepareImage(this.gameImage, this);
		this.drawPixels();
		var3.prepareImage(this.gameImage, this);
		this.initDrawingArea();
	}

	public synchronized void addConsumer(ImageConsumer var1) {
		this.imageConsumer = var1;
		var1.setDimensions(this.width, this.height);
		var1.setProperties((Hashtable)null);
		var1.setColorModel(this.colorModel);
		var1.setHints(14);
	}

	public synchronized void drawPixels() {
		if (this.imageConsumer != null) {
			this.imageConsumer.setPixels(0, 0, this.width, this.height, this.colorModel, this.pixels, 0, this.width);
			this.imageConsumer.imageComplete(2);
		}

	}

	public void initDrawingArea() {
		Statics.initDrawingArea(this.width, this.height, this.pixels, 9);
	}

	public void drawComponentImage(Graphics var1, int var2, int var3) {
		this.drawPixels();
		var1.drawImage(this.gameImage, var2, var3, this);
	}

	public synchronized boolean isConsumer(ImageConsumer var1) {
		return var1 == this.imageConsumer;
	}

	public synchronized void removeConsumer(ImageConsumer var1) {
		if (var1 == this.imageConsumer) {
			this.imageConsumer = null;
		}

	}

	public void startProduction(ImageConsumer var1) {
		this.addConsumer(var1);
	}

	public void requestTopDownLeftRightResend(ImageConsumer var1) {
		System.out.println("TDLR");
	}

	public boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
		return true;
	}
}
