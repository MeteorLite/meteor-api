/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.api.widgets;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import net.runelite.api.*;

/**
 * An item that is being represented in a {@link Widget}.
 */
@AllArgsConstructor
@ToString
@Getter
public class WidgetItem implements Interactable {

  private final Client client;

  /**
   * The ID of the item represented.
   *
   * @see net.runelite.api.ItemID
   */
  private final int id;
  /**
   * The quantity of the represented item.
   */
  private final int quantity;
  /**
   * The index position of this WidgetItem inside its parents WidgetItem array.
   *
   * @see Widget#getWidgetItems()
   */
  private final int slot;
  /**
   * The area where the widget is drawn on the canvas.
   */
  private final Rectangle canvasBounds;
  /**
   * The widget which contains this item.
   */
  private final Widget widget;
  /**
   * The canvas bounds for the widget, if it is being dragged.
   */
  @Nullable
  private final Rectangle draggingCanvasBounds;

  /**
   * Get the area where the widget item is drawn on the canvas, accounting for drag
   *
   * @return
   */
  public Rectangle getCanvasBounds() {
    return draggingCanvasBounds == null ? canvasBounds : draggingCanvasBounds;
  }

  /**
   * Get the area where the widget item is drawn on the canvas
   *
   * @param dragging whether the returned area should account for widget drag
   * @return
   */
  public Rectangle getCanvasBounds(boolean dragging) {
    return dragging ? draggingCanvasBounds : canvasBounds;
  }

  /**
   * Gets the upper-left coordinate of where the widget is being drawn on the canvas, accounting for
   * drag.
   *
   * @return the upper-left coordinate of where this widget is drawn
   */
  public Point getCanvasLocation() {
    Rectangle bounds = getCanvasBounds();
    return new Point((int) bounds.getX(), (int) bounds.getY());
  }

  @Override
  public String[] getRawActions() {
    return client.getItemComposition(getId()).getInventoryActions();
  }

  @Override
  public void interact(String action) {
    interact(getActions().indexOf(action));
  }

  @Override
  public int getActionId(int action) {
    switch (action) {
      case 0:
        if (getRawActions()[0] == null) {
          return MenuAction.ITEM_USE.getId();
        }

        return MenuAction.ITEM_FIRST_OPTION.getId();
      case 1:
        return MenuAction.ITEM_SECOND_OPTION.getId();
      case 2:
        return MenuAction.ITEM_THIRD_OPTION.getId();
      case 3:
        return MenuAction.ITEM_FOURTH_OPTION.getId();
      case 4:
        return MenuAction.ITEM_FIFTH_OPTION.getId();
      default:
        throw new IllegalArgumentException("action = " + action);
    }
  }

  @Override
  public void interact(int action) {
    interact(getId(), getActionId(action));
  }

  @Override
  public void interact(int identifier, int opcode, int param0, int param1) {
    client.interact(identifier, opcode, param0, param1);
  }

  @Override
  public void interact(int index, int menuAction) {
    interact(getId(), menuAction, getSlot(), WidgetInfo.INVENTORY.getPackedId());
  }


  public String getName() {
    return client.getItemComposition(getId()).getName();
  }
}