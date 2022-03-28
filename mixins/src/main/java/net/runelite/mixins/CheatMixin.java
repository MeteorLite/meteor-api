package net.runelite.mixins;

import eventbus.Events;
import eventbus.events.CheatEntered;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;

/**
 * Class to check clickboxes of models. Mostly refactored code from the client.
 */
@Mixin(RSClient.class)
public abstract class CheatMixin implements RSClient
{
	@Shadow("client")
	public static RSClient client;

	@Copy("doCheat")
	public static void rs$doCheat(String s) {

	}

	@Replace("doCheat")
	public static void m$doCheat(String s) {
		CheatEntered event = new CheatEntered(s);
		client.getCallbacks().post(Events.CHEAT_ENTERED, event);
		if (!event.getConsumed())
			rs$doCheat(s);
	}
}
