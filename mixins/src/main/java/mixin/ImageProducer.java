package mixin;

import meteor.Logger;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;

import java.awt.*;
import java.awt.image.BufferedImage;
import net.runelite.rs.api.RSImageProducer;

@SuppressWarnings("ALL")
@Mixin(RSImageProducer.class)
abstract class ImageProducer implements RSImageProducer {

    @Shadow("client")
    public static RSClient client;

    @Shadow("logger")
    public static Logger logger;

    @Shadow("gameImage")
    public static BufferedImage gameImage;

    @Inject
    @MethodHook(value = "drawImage", end = true)
    public void drawImage$mixin(int x, int y, Graphics graphics) {
        if (gameImage == null) {
            try {
                gameImage = new BufferedImage(((Frame)client.getGameFrame$api()).getWidth(), ((Frame)client.getGameFrame$api()).getHeight(), BufferedImage.TYPE_INT_ARGB);
            } catch (Exception ignore){
                ignore.printStackTrace();
            }
        }

        gameImage.getGraphics().drawImage(getImage$api(), x, y, this);
    }
}