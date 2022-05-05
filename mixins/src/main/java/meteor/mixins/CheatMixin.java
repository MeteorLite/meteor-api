package meteor.mixins;

import eventbus.Events;
import eventbus.events.CheatEntered;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class CheatMixin implements RSClient {
    @Shadow("client")
    private static RSClient client;

    @Copy("doCheat")
    @Replace("doCheat")
    public static void copy$doCheat(String cheat) {
        CheatEntered cheatEnteredEvent = new CheatEntered(cheat);
        client.getCallbacks().post(Events.CHEAT_ENTERED, cheatEnteredEvent);

        if (!cheatEnteredEvent.getConsumed())
        {
            System.out.println("Command not consumed");
            copy$doCheat(cheat);
        }
    }
}
