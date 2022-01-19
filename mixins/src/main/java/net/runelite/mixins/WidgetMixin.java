/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import eventbus.Events;
import net.runelite.api.Point;
import net.runelite.api.*;
import eventbus.events.WidgetHiddenChanged;
import eventbus.events.WidgetPositioned;
import net.runelite.api.mixins.*;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetType;
import net.runelite.rs.api.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static net.runelite.api.widgets.WidgetInfo.TO_CHILD;
import static net.runelite.api.widgets.WidgetInfo.TO_GROUP;

@Mixin(RSWidget.class)
public abstract class WidgetMixin implements RSWidget
{
  private static final int ITEM_SLOT_SIZE = 32;
  @Shadow("client")
  private static RSClient client;
  @Inject
  private static int rl$widgetLastPosChanged;
  @Inject
  private int rl$parentId;
  @Inject
  private int rl$x;
  @Inject
  private int rl$y;

  @Inject
  WidgetMixin()
  {
    rl$parentId = -1;
    rl$x = -1;
    rl$y = -1;
  }

  @Inject
  @Override
  public void broadcastHidden(boolean hidden)
  {
    WidgetHiddenChanged event = new WidgetHiddenChanged(this, hidden);

    client.getCallbacks().post(Events.WIDGET_HIDDEN_CHANGED, event);

    RSWidget[] children = getChildren();

    if (children != null)
    {
      // recursive through children
      for (RSWidget child : children)
      {
        // if the widget is hidden it will not magically unhide from its parent changing
        if (child == null || child.isSelfHidden())
        {
          continue;
        }

        child.broadcastHidden(hidden);
      }
    }

    // make sure we iterate nested children as well
    // cannot be null
    Widget[] nestedChildren = getNestedChildren();

    for (Widget nestedChild : nestedChildren)
    {
      if (nestedChild == null || nestedChild.isSelfHidden())
      {
        continue;
      }

      ((RSWidget) nestedChild).broadcastHidden(hidden);
    }
  }

  @Inject
  @Override
  public void setRenderParentId(int parentId)
  {
    rl$parentId = parentId;
  }

  @Inject
  @Override
  public void setRenderX(int x)
  {
    rl$x = x;
  }

  @Inject
  @Override
  public void setRenderY(int y)
  {
    rl$y = y;
  }

  @Inject
  @Override
  public Widget getParent()
  {
    int id = getParentId();
    if (id == -1)
    {
      return null;
    }

    return client.getWidget(TO_GROUP(id), TO_CHILD(id));
  }

  @Inject
  @Override
  public int getParentId()
  {
    assert client.isClientThread() : "getParentId must be called on client thread";

    int rsParentId = getRSParentId();
    if (rsParentId != -1)
    {
      return rsParentId;
    }

    final int id = getId();
    if (TO_GROUP(id) == client.getTopLevelInterfaceId())
    {
      // this is a root widget
      return -1;
    }

    int parentId = rl$parentId;
    if (parentId != -1)
    {
      // if this happens, the widget is or was nested.
      // rl$parentId is updated when drawing, but will not be updated when
      // the widget is no longer reachable in the tree, leaving
      // parent id potentially incorrect

      // check the parent in the component table
      @SuppressWarnings("unchecked") HashTable<WidgetNode> componentTable = client.getComponentTable();
      WidgetNode widgetNode = componentTable.get$api(parentId);
      if (widgetNode == null || widgetNode.getId() != TO_GROUP(id))
      {
        // invalidate parent
        rl$parentId = -1;
      }
      else
      {
        return parentId;
      }
    }

    // also the widget may not have been drawn, yet
    int groupId = TO_GROUP(getId());
    RSNodeHashTable componentTable = client.getComponentTable();
    RSNode[] buckets = componentTable.getBuckets();
    for (RSNode node : buckets)
    {
      // It looks like the first node in the bucket is always
      // a sentinel
      Node cur = node.getNext();
      while (cur != node)
      {
        WidgetNode wn = (WidgetNode) cur;

        if (groupId == wn.getId())
        {
          return (int) wn.getHash();
        }

        cur = cur.getNext();
      }
    }

    return -1;
  }

  @Inject
  @Override
  public String getButtonText()
  {
    return getRSButtonText().replace('\u00A0', ' ');
  }

  @Inject
  @Override
  public String getText()
  {
    return getRSText().replace('\u00A0', ' ');
  }

  @Inject
  @Override
  public String getName()
  {
    return getRSName().replace('\u00A0', ' ');
  }

  @Inject
  @Override
  public void setName(String name)
  {
    setRSName(name.replace(' ', '\u00A0'));
  }

  @Inject
  @Override
  public boolean isHidden()
  {
    assert client.isClientThread() : "isHidden must be called on client thread";

    if (isSelfHidden())
    {
      return true;
    }

    Widget parent = getParent();

    // If the parent is hidden, this widget is also hidden.
    // Widget has no parent and is not the root widget (which is always visible),
    // so it's not visible.
    return parent == null ? TO_GROUP(getId()) != client.getTopLevelInterfaceId() : parent.isHidden();
  }

  @Inject
  @Override
  public Point getCanvasLocation()
  {
    return new Point(rl$x, rl$y);
  }

  @Inject
  @Override
  public Rectangle getBounds()
  {
    Point canvasLocation = getCanvasLocation();
    return new Rectangle(canvasLocation.getX(), canvasLocation.getY(), getWidth(), getHeight());
  }

  @Inject
  @Override
  public List<WidgetItem> getWidgetItems()
  {
    int[] itemIds = getItemIds();

    if (itemIds == null)
    {
      return null;
    }

    List<WidgetItem> items = new ArrayList<WidgetItem>(itemIds.length);

    for (int i = 0; i < itemIds.length; ++i)
    {
      if (itemIds[i] <= 0)
      {
        continue;
      }

      WidgetItem item = getWidgetItem(i);

      if (item != null)
      {
        items.add(item);
      }
    }

    return items;
  }

  @Inject
  @Override
  public WidgetItem getWidgetItem(int index)
  {
    int[] itemIds = getItemIds();
    int[] itemQuantities = getItemQuantities();

    if (itemIds == null || itemQuantities == null)
    {
      return null;
    }

    int columns = getWidth(); // the number of item slot columns is stored here
    int xPitch = getXPitch();
    int yPitch = getYPitch();
    int itemId = itemIds[index];
    int itemQuantity = itemQuantities[index];

    if (columns <= 0)
    {
      return null;
    }

    int row = index / columns;
    int col = index % columns;
    int itemX = rl$x + ((ITEM_SLOT_SIZE + xPitch) * col);
    int itemY = rl$y + ((ITEM_SLOT_SIZE + yPitch) * row);

    boolean isDragged = isWidgetItemDragged(index);
    int dragOffsetX = 0;
    int dragOffsetY = 0;

    if (isDragged)
    {
      Point p = getWidgetItemDragOffsets();
      dragOffsetX = p.getX();
      dragOffsetY = p.getY();
    }

    Rectangle bounds = new Rectangle(itemX - 1, itemY - 1, ITEM_SLOT_SIZE, ITEM_SLOT_SIZE);
    Rectangle draggedBounds = new Rectangle(itemX + dragOffsetX, itemY + dragOffsetY, ITEM_SLOT_SIZE, ITEM_SLOT_SIZE);
    return new WidgetItem(client, itemId - 1, itemQuantity, index, bounds, this, draggedBounds);
  }

  @Inject
  @Override
  public Widget getChild(int index)
  {
    RSWidget[] widgets = getChildren();

    if (widgets == null || widgets[index] == null)
    {
      return null;
    }

    return widgets[index];
  }

  @Inject
  @Override
  public Widget[] getDynamicChildren()
  {
    RSWidget[] children = getChildren();

    if (children == null)
    {
      return new Widget[0];
    }

    List<Widget> widgets = new ArrayList<Widget>();
    for (RSWidget widget : children)
    {
      if (widget != null && widget.getRSParentId() == getId())
      {
        widgets.add(widget);
      }
    }
    return widgets.toArray(new Widget[widgets.size()]);
  }

  @Inject
  @Override
  public Widget[] getStaticChildren()
  {
    if (getRSParentId() == getId())
    {
      // This is a dynamic widget, so it can't have static children
      return new Widget[0];
    }

    List<Widget> widgets = new ArrayList<Widget>();
    for (RSWidget widget : client.getGroup(TO_GROUP(getId())))
    {
      if (widget != null && widget.getRSParentId() == getId())
      {
        widgets.add(widget);
      }
    }
    return widgets.toArray(new RSWidget[widgets.size()]);
  }

  @Inject
  @Override
  public Widget[] getNestedChildren()
  {
    assert client.isClientThread() : "getNestedChildren must be called on client thread";

    if (getRSParentId() == getId())
    {
      // This is a dynamic widget, so it can't have nested children
      return new Widget[0];
    }

    @SuppressWarnings("unchecked") HashTable<WidgetNode> componentTable = client.getComponentTable();

    WidgetNode wn = componentTable.get$api(getId());
    if (wn == null)
    {
      return new RSWidget[0];
    }

    int group = wn.getId();

    List<RSWidget> widgets = new ArrayList<RSWidget>();
    for (RSWidget widget : client.getGroup(group))
    {
      if (widget != null && widget.getRSParentId() == -1)
      {
        widgets.add(widget);
      }
    }
    return widgets.toArray(new RSWidget[widgets.size()]);
  }

  @Inject
  @Override
  public boolean contains(Point point)
  {
    Rectangle bounds = getBounds();
    return bounds != null && bounds.contains(new java.awt.Point(point.getX(), point.getY()));
  }

  @FieldHook("y")
  @Inject
  public void onPositionChanged(int idx)
  {
    int id = getId();
    if (id == -1)
    {
      return;
    }

    int tick = client.getGameCycle();
    if (tick == rl$widgetLastPosChanged)
    {
      return;
    }

    rl$widgetLastPosChanged = tick;
    WidgetPositioned widgetPositioned = WidgetPositioned.INSTANCE;
    client.getCallbacks().postDeferred(Events.WIDGET_POSITIONED, widgetPositioned);
  }

  @Inject
  @Override
  public Widget createChild(int index, int type)
  {
    assert client.isClientThread() : "createChild must be called on client thread";

    RSWidget w = client.createWidget();
    w.setType(type);
    w.setParentId(getId());
    w.setId(getId());
    w.setIsIf3(true);

    RSWidget[] siblings = getChildren();

    if (index < 0)
    {
      if (siblings == null)
      {
        index = 0;
      }
      else
      {
        index = 0;
        for (int i = siblings.length - 1; i >= 0; i--)
        {
          if (siblings[i] != null)
          {
            index = i + 1;
            break;
          }
        }
      }
    }

    if (siblings == null)
    {
      siblings = new RSWidget[index + 1];
      setChildren(siblings);
    }
    else if (siblings.length <= index)
    {
      RSWidget[] newSiblings = new RSWidget[index + 1];
      System.arraycopy(siblings, 0, newSiblings, 0, siblings.length);
      siblings = newSiblings;
      setChildren(siblings);
    }

    siblings[index] = w;
    w.setIndex(index);

    return w;
  }

  @Inject
  @Override
  public void revalidate()
  {
    assert client.isClientThread() : "revalidate must be called on client thread";

    client.revalidateWidget(this);
  }

  @Inject
  @Override
  public void revalidateScroll()
  {
    assert client.isClientThread() : "revalidateScroll must be called on client thread";

    client.revalidateWidget(this);
    client.revalidateWidgetScroll(client.getWidgets()[TO_GROUP(this.getId())], this, false);
  }

  @Inject
  @Override
  public void deleteAllChildren()
  {
    if (getChildren() != null)
    {
      Arrays.fill(getChildren(), null);
    }
  }

  @Copy("getModel")
  @Replace("getModel")
  @SuppressWarnings("InfiniteRecursion")
  public RSModel copy$getModel(RSSequenceDefinition sequence, int frame, boolean alternate, RSPlayerComposition playerComposition)
  {
    if (frame != -1 && client.isInterpolateWidgetAnimations())
    {
      frame = frame | getModelFrameCycle() << 16 | Integer.MIN_VALUE;
    }
    return copy$getModel(sequence, frame, alternate, playerComposition);
  }

  @Inject
  @Override
  public boolean isWidgetItemDragged(int index)
  {
    return client.getIf1DraggedWidget() == this && client.getItemPressedDuration() >= 5 &&
            client.getIf1DraggedItemIndex() == index;
  }

  @Inject
  public Point getWidgetItemDragOffsets()
  {
    int dragOffsetX = client.getMouseX() - client.getDraggedWidgetX();
    int dragOffsetY = client.getMouseY() - client.getDraggedWidgetY();

    if (dragOffsetX < 5 && dragOffsetX > -5)
    {
      dragOffsetX = 0;
    }

    if (dragOffsetY < 5 && dragOffsetY > -5)
    {
      dragOffsetY = 0;
    }

    return new Point(dragOffsetX, dragOffsetY);
  }

  @Inject
  @Override
  public int getActionId(int actionIndex) {
    switch (getType()) {
      case WidgetType.LAYER:
      case WidgetType.RECTANGLE:
        return MenuAction.CC_OP.getId();
      case WidgetType.GRAPHIC:
        return getTargetVerb() == null || getTargetVerb().isEmpty()
                ? MenuAction.CC_OP.getId() : MenuAction.WIDGET_TYPE_2.getId();
      case WidgetType.INVENTORY:
        return MenuAction.WIDGET_TYPE_2.getId();
      case WidgetType.TEXT:
        return MenuAction.WIDGET_TYPE_6.getId();
      case WidgetType.MODEL:
        return MenuAction.WIDGET_TYPE_1.getId();
      default:
        throw new IllegalArgumentException("Widget: no identifier for " + actionIndex);
    }
  }

  @Inject
  @Override
  public void interact(String action) {
    interact(getActions().indexOf(action));
  }

  @Inject
  @Override
  public void interact(int index) {
    interact(index, getActionId(index));
  }

  @Inject
  @Override
  public void interact(int index, int menuAction) {
    interact(getMenuIdentifier(index), menuAction, getIndex(), getId());
  }

  @Inject
  @Override
  public void interact(int identifier, int opcode, int param0, int param1) {
    Point coords = getScreenCoords();
    client.interact(identifier, opcode, param0, param1, coords.getX(), coords.getY());
  }

  @Inject
  public int getMenuIdentifier(int actionIndex) {
    switch (getType()) {
      case WidgetType.LAYER:
      case WidgetType.RECTANGLE:
        return actionIndex + 1;
      case WidgetType.GRAPHIC:
        return getTargetVerb() == null || getTargetVerb().isEmpty() ? actionIndex + 1 : 0;
      case WidgetType.TEXT:
      case WidgetType.MODEL:
        return 0;
      default:
        throw new IllegalArgumentException("Widget: no identifier for " + actionIndex);
    }
  }

  @Inject
  private Point getScreenCoords() {
    Rectangle bounds = getBounds();
    if (bounds != null) {
      ThreadLocalRandom random = ThreadLocalRandom.current();
      try {
        return new Point(random.nextInt(bounds.x, bounds.x + bounds.width), random.nextInt(bounds.y, bounds.y + bounds.height));
      } catch (IllegalArgumentException e) {
        return new Point(-1, -1);
      }
    }

    return getCanvasLocation();
  }
}
