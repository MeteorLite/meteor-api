package mixin;

import meteor.Logger;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameWindow;
import net.runelite.rs.api.RSImageProducer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("ALL")
@Mixin(RSImageProducer.class)
abstract class ImageProducer extends Frame implements RSImageProducer {

    @Shadow("client")
    public static RSClient client;

    @Shadow("logger")
    public static Logger logger;

    @Shadow("gameImage")
    public static BufferedImage gameImage;

    @Inject
    public static BufferedImage componentImage;



    @Copy("drawGameImage")
    @Replace("drawGameImage")
    public void drawGameImage(Graphics g, int i, int j) {
        if (gameImage == null) {
            try {
                gameImage = new BufferedImage(((Frame)client.getGameWindow()).getWidth(), ((Frame)client.getGameWindow()).getHeight(), BufferedImage.TYPE_INT_ARGB);
            } catch (Exception ignore){
                ignore.printStackTrace();
            }
        }
        drawPixels$api();
        gameImage.getGraphics().drawImage(getGameImage$api(), i, j, this);
    }
}
