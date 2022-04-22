package dev.hoot.mixins;

import eventbus.Events;
import eventbus.events.InventoryChanged;
import eventbus.events.ItemContainerChanged;
import eventbus.events.ItemObtained;
import net.runelite.api.Item;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSItemContainer;
import net.runelite.rs.api.RSNodeHashTable;

@Mixin(RSItemContainer.class)
public abstract class HItemContainerMixin implements RSItemContainer
{
	@Shadow("changedItemContainers")
	private static int[] changedItemContainers;

	@Inject
	private static int[] itemIdCache = new int[28];

	@Inject
	private static int[] itemQuantityCache = new int[28];

	@Inject
	@Override
	public Item[] getItems()
	{
		int[] itemIds = getItemIds();
		int[] stackSizes = getStackSizes();
		Item[] items = new Item[itemIds.length];

		for (int i = 0; i < itemIds.length; ++i)
		{
			Item item = new Item(
					itemIds[i],
					stackSizes[i]
			);

			item.setSlot(i);
			items[i] = item;
		}

		return items;
	}

	@Inject
	@Override
	public Item getItem(int slot)
	{
		int[] itemIds = getItemIds();
		int[] stackSizes = getStackSizes();
		if (slot >= 0 && slot < itemIds.length && itemIds[slot] != -1)
		{
			Item item = new Item(
					itemIds[slot],
					stackSizes[slot]
			);

			item.setSlot(slot);
			return item;
		}

		return null;
	}

	@FieldHook("changedItemContainers")
	@Inject
	public static void onItemContainerUpdate(int idx)
	{
		if (idx != -1)
		{
			int changedId = idx - 1 & 31;
			int containerId = changedItemContainers[changedId];

			RSNodeHashTable itemContainers = (RSNodeHashTable) Item.client.getItemContainers();

			RSItemContainer changedContainer = (RSItemContainer) itemContainers.get(containerId);
			RSItemContainer changedContainerInvOther = (RSItemContainer) itemContainers.get(containerId | 0x8000);

			if (changedContainer != null)
			{
				if (containerId == 93)
				{
					for (int i = 0; i < 28; i++)
					{
						int oldId = itemIdCache[i];
						int oldStack = itemQuantityCache[i];
						int newId = changedContainer.getItemIds().length <= i ? -1 : changedContainer.getItemIds()[i];
						int newStack = changedContainer.getStackSizes().length <= i ? 0 : changedContainer.getStackSizes()[i];
						itemIdCache[i] = newId;
						itemQuantityCache[i] = newStack;

						if (oldId == newId)
						{
							if (oldStack > newStack)
							{
								InventoryChanged inventoryChanged = new InventoryChanged(InventoryChanged.ChangeType.ITEM_REMOVED, newId, Math.abs(oldStack - newStack));
								Item.client.getCallbacks().postDeferred(Events.INVENTORY_CHANGED, inventoryChanged);
								continue;
							}

							if (oldStack < newStack)
							{
								int amount = Math.abs(oldStack - newStack);
								InventoryChanged inventoryChanged = new InventoryChanged(InventoryChanged.ChangeType.ITEM_ADDED, newId, amount);
								Item.client.getCallbacks().postDeferred(Events.INVENTORY_CHANGED, inventoryChanged);
								Item.client.getCallbacks().postDeferred(Events.ITEM_OBTAINED, new ItemObtained(newId, amount));
								continue;
							}
						}

						if (oldId != newId)
						{
							if (oldId > 0)
							{
								InventoryChanged itemRemoved = new InventoryChanged(InventoryChanged.ChangeType.ITEM_REMOVED, oldId, oldStack);
								Item.client.getCallbacks().postDeferred(Events.ITEM_REMOVED, itemRemoved);
							}

							if (newId > 0 && oldId != 0)
							{
								InventoryChanged itemAdded = new InventoryChanged(InventoryChanged.ChangeType.ITEM_ADDED, newId, newStack);
								Item.client.getCallbacks().postDeferred(Events.ITEM_ADDED, itemAdded);
								Item.client.getCallbacks().postDeferred(Events.ITEM_OBTAINED, new ItemObtained(newId, newStack));
							}
						}
					}
				}

				ItemContainerChanged event = new ItemContainerChanged(containerId, changedContainer);
				Item.client.getCallbacks().postDeferred(Events.ITEM_CONTAINER_CHANGED, event);
			}

			if (changedContainerInvOther != null)
			{
				ItemContainerChanged event = new ItemContainerChanged(containerId | 0x8000, changedContainerInvOther);
				Item.client.getCallbacks().postDeferred(Events.ITEM_CONTAINER_CHANGED, event);
			}
		}
	}
}
