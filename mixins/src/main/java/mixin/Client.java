package mixin;

import meteor.Logger;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("ALL")
@Mixin(RSClient.class)
abstract class Client implements RSClient {

    @Inject
    public static Logger logger = new Logger();

    @Inject
    public static BufferedImage gameImage;

    @Inject
    @MethodHook("startup")
    public void beforeStartup() {
        logger.debug("!Pre-Startup!");
    }

    @Copy("loginScreen")
    @Replace("loginScreen")
    public void loginScreen$mixin(boolean b, boolean b1) {
        if (gameImage == null) {
            try {
                gameImage = new BufferedImage(((Frame)getGameWindow()).getWidth(), ((Frame)getGameWindow()).getHeight(), BufferedImage.TYPE_INT_ARGB);
            } catch (Exception ignore){
                ignore.printStackTrace();
            }
        }
        if (gameImage != null) {
            loginScreen$mixin(b, b1);
            getGameWindow().getGraphics$api().drawImage(gameImage, 0, 0, (Frame)getGameWindow());
        }

    }

    @Copy("drawFull")
    @Replace("drawFull")
    public void drawFull$mixin(int i) {
        drawFull$mixin(i);
        getGameWindow().getGraphics$api().drawImage(resize(gameImage, ((Frame)getGameWindow()).getWidth(), ((Frame)getGameWindow()).getHeight()), 0, 0, (Frame)getGameWindow());
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
}
