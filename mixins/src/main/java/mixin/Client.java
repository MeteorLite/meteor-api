package mixin;

import meteor.Logger;
import net.runelite.api.Callbacks;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;

import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("ALL")
@Mixin(RSClient.class)
abstract class Client implements RSClient {

    @Shadow("client")
    public static RSClient client;

    @Inject
    @javax.inject.Inject
    private Callbacks callbacks;

    @Inject
    @Override
    public Callbacks getCallbacks() {
        return callbacks;
    }

    @Inject
    @Override
    public void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Inject
    public static Logger logger = new Logger();

    @Inject
    public static BufferedImage gameImage;

    @Inject
    @MethodHook("startup")
    public void beforeStartup() {
        logger.debug("!Pre-Startup!");
    }

    @Inject
    public static Canvas gameCanvas;

    @Inject
    @Override
    public Canvas getCanvas() {
        return gameCanvas;
    }

    @Inject
    @Override
    public void setCanvas(Canvas gameCanvas) {
        this.gameCanvas =  gameCanvas;
    }

    @Inject
    Dimension stretchedDimensions = null;

    @Inject
    Dimension realDimensions;

    @Inject
    @Override
    public BufferedImage getGameImage() {
        return gameImage;
    }

    @Copy("loginScreen")
    @Replace("loginScreen")
    public void loginScreen$mixin(boolean b, boolean b1) {
        if (gameImage == null) {
            try {
                gameImage = new BufferedImage(getRealDimensions().width, getRealDimensions().height, BufferedImage.TYPE_INT_ARGB);
                if (gameCanvas != null) {
                    gameCanvas.setSize(gameCanvas.getParent().getSize());
                    stretchedDimensions = new Dimension(gameCanvas.getWidth(), gameCanvas.getHeight());
                }
            } catch (Exception ignore){
                ignore.printStackTrace();
            }
        }
        if (gameImage != null) {
            loginScreen$mixin(b, b1);
            client.getCallbacks().drawGameImage();
        }
    }

    @Copy("drawFull")
    @Replace("drawFull")
    public void drawFull$mixin(int i) {
        drawFull$mixin(i);
        if (gameCanvas != null) {
            gameCanvas.setSize(gameCanvas.getParent().getSize());
            stretchedDimensions = new Dimension(gameCanvas.getWidth(), gameCanvas.getHeight());
        }

        client.getCallbacks().drawGameImage();
    }

    @Inject
    public BufferedImage resize(BufferedImage source,
                                int width, int height) {
        return commonResize(source, width, height,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
    }

    @Inject
    public BufferedImage resizeBilinear(BufferedImage source,
                                        int width, int height) {
        return commonResize(source, width, height,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    }

    @Inject
    private static BufferedImage commonResize(BufferedImage source,
                                              int width, int height, Object hint) {
        BufferedImage img = new BufferedImage(width, height,
                source.getType());
        Graphics2D g = img.createGraphics();
        try {
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, hint);
            g.drawImage(source, 0, 0, width, height, null);
        } finally {
            g.dispose();
        }
        return img;
    }

    @Inject
    private static BufferedImage progressiveResize(BufferedImage source,
                                                   int width, int height, Object hint) {
        int w = Math.max(source.getWidth()/2, width);
        int h = Math.max(source.getHeight()/2, height);
        BufferedImage img = commonResize(source, w, h, hint);
        while (w != width || h != height) {
            BufferedImage prev = img;
            w = Math.max(w/2, width);
            h = Math.max(h/2, height);
            img = commonResize(prev, w, h, hint);
            prev.flush();
        }
        return img;
    }

    @Inject
    public boolean isStretchEnabled = true;

    //274 has no resizeable, so we can hardcode actual dimensions.

    @Inject
    @Override
    public Dimension getRealDimensions() {
        if (realDimensions == null)
            realDimensions = new Dimension(765, 503);
        return realDimensions;
    }

    @Inject
    @Override
    public Dimension getStretchedDimensions() {
        return stretchedDimensions;
    }

    @Inject
    @Override
    public void setStretchedDimensions(Dimension d) {
        stretchedDimensions = d;
    }

    @Inject
    @Override
    public boolean isClientThread() {
        return true;
    }

    @Inject
    @Override
    public boolean isStretchedEnabled() {
        return isStretchEnabled;
    }
}
