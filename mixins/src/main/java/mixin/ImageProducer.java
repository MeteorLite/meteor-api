package mixin;

import meteor.Logger;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSGameWindow;

import java.awt.*;

@SuppressWarnings("ALL")
@Mixin(RSGameWindow.class)
abstract class ImageProducer extends Frame implements RSGameWindow {

    @Shadow("logger")
    public static Logger logger;
}
