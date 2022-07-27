package mixin;

import meteor.Logger;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameWindow;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("ALL")
@Mixin(RSGameWindow.class)
abstract class GameWindow extends Frame implements RSGameWindow {

    @Shadow("logger")
    public static Logger logger;
}
