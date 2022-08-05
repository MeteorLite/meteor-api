package mixin;

import meteor.Logger;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSComponentImageProducer;

import java.awt.*;
import java.awt.image.BufferedImage;

@SuppressWarnings("ALL")
@Mixin(RSComponentImageProducer.class)
abstract class ComponentImageProducer extends Frame implements RSComponentImageProducer {

    @Shadow("client")
    public static RSClient client;

    @Shadow("logger")
    public static Logger logger;

    @Shadow("gameImage")
    public static BufferedImage gameImage;

    @Inject
    public static BufferedImage componentImage;



    @Copy("drawComponentImage")
    @Replace("drawComponentImage")
    public void drawComponentImage$api(Graphics g, int i, int j) {
        if (gameImage == null) {
            try {
                gameImage = new BufferedImage(((Frame)client.getGameWindow()).getWidth(), ((Frame)client.getGameWindow()).getHeight(), BufferedImage.TYPE_INT_ARGB);
            } catch (Exception ignore){
                ignore.printStackTrace();
            }
        }
        drawPixels$api();
        gameImage.getGraphics().drawImage(getComponentImage$api(), i, j, this);
    }
}
