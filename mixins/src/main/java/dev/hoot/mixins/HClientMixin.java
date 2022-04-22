package dev.hoot.mixins;

import dev.hoot.api.events.AutomatedMenu;
import dev.hoot.api.events.MenuActionProcessed;
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

import static net.runelite.api.MenuAction.UNKNOWN;

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

	@Inject
	private static final AtomicReference<AutomatedMenu> automatedMenu = new AtomicReference<>(null);

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
	public static RSRuneLiteMenuEntry newBareRuneliteMenuEntry()
	{
		throw new NotImplementedException();
	}

	@Copy("menuAction")
	@Replace("menuAction")
	static void copy$menuAction(int param0, int param1, int opcode, int id, String option, String target, int canvasX, int canvasY)
	{
		RSRuneLiteMenuEntry menuEntry = null;
		int i;
		for (i = client.getMenuOptionCount() - 1; i >= 0; --i)
		{
			if (client.getMenuOptions()[i].equals(option) && client.getMenuTargets()[i].equals(target)  && client.getMenuIdentifiers()[i] == id && client.getMenuOpcodes()[i] == opcode)
			{
				menuEntry = rl$menuEntries[i];
				break;
			}
		}

		if (menuEntry == null && option.equals(target))
		{
			if (client.getTmpMenuOptionsCount() < 500)
			{
				int var10000 = client.getTmpMenuOptionsCount();
				client.setTmpMenuOptionsCount(var10000 + 1);
				i = var10000;
			}
			else
			{
				i = 0;
			}

			client.getMenuOpcodes()[i] = opcode;
			client.getMenuIdentifiers()[i] = id;
			client.getMenuOptions()[i] = option;
			client.getMenuTargets()[i] = target;
			client.getMenuArguments1()[i] = param0;
			client.getMenuArguments2()[i] = param1;
			client.getMenuForceLeftClick()[i] = false;
			menuEntry = rl$menuEntries[i];
		}

		MenuOptionClicked menuOptionClicked = null;

		if (menuEntry == null)
		{
			menuOptionClicked = new MenuOptionClicked();
			menuOptionClicked.setMenuEntry(newBareRuneliteMenuEntry());
			if (canvasX != -1 || canvasY != -1)
			{
				client.getLogger().warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {}", option, target, opcode, id, param0, param1);
			}
		}
		else
		{
			menuOptionClicked = new MenuOptionClicked();
			menuOptionClicked.setMenuEntry(menuEntry);

			AutomatedMenu replacement = automatedMenu.get();
			if (replacement != null)
			{
				menuOptionClicked = replacement.toMenuOptionClicked(client);
				lastInteractionTime = Instant.now();
			}
			else
			{
				menuOptionClicked = new MenuOptionClicked();
				menuOptionClicked.setMenuEntry(menuEntry);
				menuOptionClicked.setSelectedItemIndex(client.getSelectedItemSlot());
				menuOptionClicked.setCanvasX(canvasX);
				menuOptionClicked.setCanvasY(canvasY);
			}

			client.getCallbacks().post(Events.MENU_OPTION_CLICKED, menuOptionClicked);

			if (menuEntry.getConsumer() != null)
			{
				menuEntry.getConsumer().accept(menuEntry);
			}

			if (menuOptionClicked.getConsumed())
			{
				return;
			}
		}

		/*
		 * The RuneScape client may deprioritize an action in the menu by incrementing the opcode with 2000,
		 * undo it here so we can get the correct opcode
		 */
		boolean decremented = false;
		if (opcode >= 2000)
		{
			decremented = true;
			opcode -= 2000;
		}

		if (menuOptionClicked.getConsumed())
		{
			automatedMenu.set(null);
			return;
		}

		copy$menuAction(menuOptionClicked.getParam0(), menuOptionClicked.getParam1(),
				menuOptionClicked.getMenuAction() == UNKNOWN ? opcode : menuOptionClicked.getMenuAction().getId(),
				menuOptionClicked.getId(), menuOptionClicked.getMenuOption(), menuOptionClicked.getMenuTarget(),
				canvasX, canvasY);
		automatedMenu.set(null);
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
