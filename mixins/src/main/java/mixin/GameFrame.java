package mixin;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import meteor.Logger;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameFrame;
import net.runelite.rs.api.RSImageProducer;

@SuppressWarnings("ALL")
@Mixin(RSGameFrame.class)
abstract class GameFrame extends Frame implements RSGameFrame {

    @Shadow("client")
    public static RSClient client;

    @Shadow("logger")
    public static Logger logger;

}