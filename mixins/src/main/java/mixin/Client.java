package mixin;

import meteor.Logger;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
abstract class Client implements RSClient {

    @Inject
    public static Logger logger = new Logger();

    @Inject
    @MethodHook("startup")
    public void beforeStartup() {
        logger.debug("!Pre-Startup!");
    }
}
