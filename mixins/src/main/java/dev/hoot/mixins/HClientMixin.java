package dev.hoot.mixins;

import dev.hoot.api.events.AutomatedMenu;
import dev.hoot.api.events.ResumePauseSent;
import dev.hoot.api.widgets.DialogOption;
import eventbus.Events;
import eventbus.events.*;
import net.runelite.api.*;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.rs.api.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.Nonnull;
import java.time.Instant;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;


@Mixin(RSClient.class)
public abstract class HClientMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("rl$menuEntries")
	private static RSRuneLiteMenuEntry[] rl$menuEntries;

	@Inject
	public static HashMap<Integer, RSItemComposition> itemDefCache = new HashMap<>();

	@Inject
	private static boolean lowCpu;

	@Inject
	private static final int[] previousExp = new int[23];

	@Shadow("automatedMenu")
	private static AtomicReference<AutomatedMenu> automatedMenu;

	@Inject
	private static long lastMenuChange = -1;

	@Inject
	private static Instant lastInteractionTime = Instant.ofEpochMilli(0);

	@Inject
	public void interact(AutomatedMenu automatedMenu)
	{
		client.getCallbacks().post(Events.AUTOMATED_MENU, automatedMenu);
	}

	@Inject
	@Override
	public String getLoginMessage()
	{
		if (getLoginIndex() == 14)
		{

		}

		if (getLoginIndex() == 3)
		{
			return "Invalid credentials.";
		}

		return getLoginResponse1() + " " + getLoginResponse2() + " " + getLoginResponse3();
	}

	@Override
	@Inject
	public boolean isTileObjectValid(Tile tile, TileObject t)
	{
		if (!(t instanceof RSGameObject))
		{
			return true;
		}

		// actors, projectiles, and graphics objects are added and removed from the scene each frame as GameObjects,
		// so ignore them.
		RSGameObject gameObject = (RSGameObject) t;
		RSRenderable renderable = gameObject.getRenderable();
		boolean invalid = renderable instanceof RSActor || renderable instanceof RSProjectile || renderable instanceof RSGraphicsObject;
		invalid |= gameObject.getStartX() != ((RSTile) tile).getX() || gameObject.getStartY() != ((RSTile) tile).getY();
		return !invalid;
	}

	@Inject
	@Override
	public boolean isItemDefinitionCached(int id)
	{
		return itemDefCache.containsKey(id);
	}

	@Inject
	@Override
	public boolean isLowCpu()
	{
		return lowCpu;
	}

	@Inject
	@Override
	public void setLowCpu(boolean enabled)
	{
		lowCpu = enabled;
	}

	@Copy("drawWidgets")
	@Replace("drawWidgets")
	static final void copy$drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7)
	{
		if (!lowCpu)
		{
			copy$drawWidgets(var0, var1, var2, var3, var4, var5, var6, var7);
		}
	}

	@Copy("drawModelComponents")
	@Replace("drawModelComponents")
	static void copy$drawModelComponents(Widget[] var0, int var1)
	{
		if (!lowCpu)
		{
			copy$drawModelComponents(var0, var1);
		}
	}

	@Inject
	@Override
	public void uncacheItem(int id)
	{
		itemDefCache.remove(id);
	}

	@Inject
	@Override
	public void cacheItem(int id, ItemComposition item)
	{
		itemDefCache.put(id, (RSItemComposition) item);
	}

	@Inject
	@Override
	public void clearItemCache()
	{
		itemDefCache.clear();
	}

	@Inject
	@MethodHook("resumePauseWidget")
	public static void onDialogProcessed(int widgetUid, int menuIndex)
	{
		client.getCallbacks().post(Events.RESUME_PAUSE_SENT, new ResumePauseSent(widgetUid, menuIndex));
		DialogOption dialogOption = DialogOption.of(widgetUid, menuIndex);
		if (dialogOption != null)
		{
			client.getCallbacks().post(Events.DIALOG_PROCESSED, new DialogProcessed(dialogOption));
		}
		else
		{
			client.getLogger().debug(
					"Unknown or unmapped dialog option for widgetUid: {} and menuIndex {}",
					widgetUid,
					menuIndex
			);
		}
	}

	@Inject
	@Override
	@Nonnull
	public ItemComposition getItemComposition(int id)
	{
		if (itemDefCache.containsKey(id))
		{
			return itemDefCache.get(id);
		}

		assert this.isClientThread() : "getItemComposition must be called on client thread";
		RSItemComposition def = getRSItemDefinition(id);
		itemDefCache.put(id, def);
		return def;
	}

	@Inject
	@FieldHook("loginIndex")
	public static void loginIndex(int idx)
	{
		client.getCallbacks().post(Events.LOGIN_STATE_CHANGED, new LoginStateChanged(client.getLoginIndex()));
	}

	@FieldHook("experience")
	@Inject
	public static void experiencedChanged(int idx)
	{
		Skill[] possibleSkills = Skill.values();

		// We subtract one here because 'Overall' isn't considered a skill that's updated.
		if (idx < possibleSkills.length - 1)
		{
			Skill updatedSkill = possibleSkills[idx];
			StatChanged statChanged = new StatChanged(
					updatedSkill,
					client.getSkillExperience(updatedSkill),
					client.getRealSkillLevel(updatedSkill),
					client.getBoostedSkillLevel(updatedSkill)
			);
			if (previousExp[idx] == 0 && client.getSkillExperience(updatedSkill) > 0)
			{
				previousExp[idx] = client.getSkillExperience(updatedSkill);
			}

			experienceGained(idx, client.getSkillExperience(updatedSkill), client.getRealSkillLevel(updatedSkill), updatedSkill);
			client.getCallbacks().post(Events.STAT_CHANGED, statChanged);
		}
	}

	@Inject
	public static void experienceGained(int idx, int exp, int skillLevel, Skill updatedSkill)
	{
		if (exp > previousExp[idx])
		{
			int gained = exp - previousExp[idx];

			ExperienceGained experienceGained = new ExperienceGained(
					updatedSkill,
					gained,
					exp,
					skillLevel
			);

			client.getCallbacks().post(Events.EXPERIENCE_GAINED, experienceGained);
			previousExp[idx] = exp;
		}
	}

	@Inject
	@FieldHook("Client_plane")
	public static void clientPlaneChanged(int idx)
	{
		client.getCallbacks().post(Events.PLANE_CHANGED, new PlaneChanged(client.getPlane()));
	}

	@Inject
	public static RSRuneLiteMenuEntry newBareRuneliteMenuEntryTwo()
	{
		throw new NotImplementedException();
	}

	@Inject
	public static RSRuneLiteMenuEntry newRuneliteMenuEntryTwo(int idx)
	{
		throw new NotImplementedException();
	}

	@Inject
	@Override
	public void setPendingAutomation(AutomatedMenu replacement)
	{
		if (lastMenuChange + 20 > System.currentTimeMillis() && replacement != null)
		{
			return;
		}

		lastMenuChange = System.currentTimeMillis();
		automatedMenu.set(replacement);
	}

	@Inject
	@Override
	public AutomatedMenu getPendingAutomation()
	{
		if (lastMenuChange + 100 < System.currentTimeMillis() && automatedMenu.get() != null)
		{
			automatedMenu.set(null);
		}

		return automatedMenu.get();
	}

	@Inject
	public Instant getLastInteractionTime()
	{
		return lastInteractionTime;
	}
}
