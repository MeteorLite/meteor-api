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
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.rs.api;

import net.runelite.api.*;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

import java.math.BigInteger;
import java.util.Map;

public interface RSClient extends RSGameEngine, Client {

  @Import("cameraX")
  @Override
  int getCameraX$api();

  @Import("cameraZ") // <--- This is correct!
  @Override
  int getCameraY$api();

  @Import("cameraY") // <--- This is correct!
  @Override
  int getCameraZ$api();

  @Import("Scene_cameraX")
  @Override
  int getCameraX2();

  @Import("Scene_cameraX")
  void setCameraX2(int cameraX2);

  @Import("Scene_cameraY")
  @Override
  int getCameraY2();

  @Import("Scene_cameraY")
  void setCameraY2(int cameraY2);

  @Import("Scene_cameraZ")
  @Override
  int getCameraZ2();

  @Import("Scene_cameraZ")
  void setCameraZ2(int cameraZ2);

  @Import("Client_plane")
  @Override
  int getPlane();

  @Import("cameraPitch")
  @Override
  int getCameraPitch();

  @Import("cameraPitch")
  void setCameraPitch(int cameraPitch);

  @Import("cameraYaw")
  @Override
  int getCameraYaw();

  @Import("worldId")
  int getWorld();

  @Import("fps")
  @Override
  int getFPS();

  @Import("camAngleY")
  @Override
  int getMapAngle();

  @Import("camAngleY")
  @Override
  void setCameraYawTarget(int cameraYawTarget);

  @Import("Tiles_heights")
  @Override
  int[][][] getTileHeights();

  @Import("Tiles_renderFlags")
  @Override
  byte[][][] getTileSettings();

  @Import("Varps_main")
  @Override
  int[] getVarps();

  @Import("varcs")
  RSVarcs getVarcs();

  @Import("runEnergy")
  @Override
  int getEnergy();

  @Import("weight")
  @Override
  int getWeight();

  @Import("baseX")
  @Override
  int getBaseX();

  @Import("baseY")
  @Override
  int getBaseY();

  @Import("currentLevels")
  @Override
  int[] getBoostedSkillLevels();

  @Import("levels")
  @Override
  int[] getRealSkillLevels();

  @Import("experience")
  @Override
  int[] getSkillExperiences();

  @Import("changedSkills")
  int[] getChangedSkills();

  @Import("changedSkillsCount")
  int getChangedSkillsCount();

  @Import("changedSkillsCount")
  void setChangedSkillsCount(int i);

  @Import("gameState")
  @Override
  int getRSGameState$api();

  @Import("updateGameState")
  void setRSGameState(int gameState);

  @Import("Scene_selectedScreenX")
  void setMouseCanvasHoverPositionX(int x);

  @Import("Scene_selectedScreenY")
  void setMouseCanvasHoverPositionY(int y);

  @Import("MouseHandler_currentButton")
  @Override
  int getMouseCurrentButton();

  @Import("Scene_selectedX")
  int getSelectedSceneTileX();

  @Import("Scene_selectedX")
  void setSelectedSceneTileX(int selectedSceneTileX);

  @Import("Scene_selectedY")
  int getSelectedSceneTileY();

  @Import("Scene_selectedY")
  void setSelectedSceneTileY(int selectedSceneTileY);

  @Import("isDraggingWidget")
  @Override
  boolean isDraggingWidget();

  @Import("clickedWidget")
  @Override
  RSWidget getDraggedWidget();

  @Import("draggedOnWidget")
  @Override
  RSWidget getDraggedOnWidget();

  @Import("draggedOnWidget")
  @Override
  void setDraggedOnWidget(Widget widget);

  @Import("Widget_interfaceComponents")
  @Override
  RSWidget[][] getWidgets();

  /**
   * Gets an array of widgets that correspond to the passed group ID.
   *
   * @param groupId the group ID
   * @return the widget group
   * @see net.runelite.api.widgets.WidgetID
   */
  RSWidget[] getGroup(int groupId);

  @Import("scene")
  @Override
  RSScene getScene();

  @Import("localPlayer")
  @Override
  RSPlayer getLocalPlayer();

  @Import("localPlayerIndex")
  @Override
  int getLocalPlayerIndex();

  @Import("npcCount")
  int getNpcIndexesCount();

  @Import("npcIndices")
  int[] getNpcIndices();

  @Import("npcs")
  @Override
  RSNPC[] getCachedNPCs();

  @Import("collisionMaps")
  RSCollisionMap[] getCollisionMaps();

  @Import("Players_count")
  int getPlayerIndexesCount();

  @Import("Players_indices")
  int[] getPlayerIndices();

  @Import("players")
  @Override
  RSPlayer[] getCachedPlayers();

  @Import("combatTargetPlayerIndex")
  int getLocalInteractingIndex();

  @Import("combatTargetPlayerIndex")
  void setLocalInteractingIndex(int idx);

  @Import("groundItems")
  RSNodeDeque[][][] getGroundItemDeque();

  @Import("projectiles")
  RSNodeDeque getProjectilesDeque();

  @Import("graphicsObjects")
  RSNodeDeque getGraphicsObjectDeque();

  @Import("Login_username")
  @Override
  String getUsername();

  @Import("Login_username")
  @Override
  void setUsername(String username);

  @Import("Login_password")
  @Override
  void setPassword(String password);

  @Import("Login_response0")
  String getLoginResponse0();

  @Import("Login_response1")
  String getLoginResponse1();

  @Import("Login_response2")
  String getLoginResponse2();

  @Import("Login_response3")
  String getLoginResponse3();

  @Import("Login_banType")
  int getBanType();

  @Import("otp")
  @Override
  void setOtp(String otp);

  @Import("currentLoginField")
  @Override
  int getCurrentLoginField();

  @Import("loginIndex")
  @Override
  int getLoginIndex();

  @Import("loginIndex")
  @Override
  void setLoginIndex(int index);

  @Import("playerMenuActions")
  @Override
  String[] getPlayerOptions();

  @Import("playerOptionsPriorities")
  @Override
  boolean[] getPlayerOptionsPriorities();

  @Import("playerMenuOpcodes")
  @Override
  int[] getPlayerMenuTypes();

  @Import("MouseHandler_xVolatile")
  int getMouseX();

  @Import("MouseHandler_yVolatile")
  int getMouseY();

  @Import("Scene_selectedScreenX")
  int getMouseX2();

  @Import("Scene_selectedScreenY")
  int getMouseY2();

  @Import("containsBounds")
  boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                         int var7);

  @Import("checkClick")
  boolean isCheckClick();

  @Import("checkClick")
  @Override
  void setCheckClick(boolean checkClick);

  @Import("menuOptionsCount")
  @Override
  int getMenuOptionCount();

  @Import("menuOptionsCount")
  @Override
  void setMenuOptionCount(int menuOptionCount);

  @Import("menuActions")
  String[] getMenuOptions();

  @Import("menuTargets")
  String[] getMenuTargets();

  @Import("menuIdentifiers")
  int[] getMenuIdentifiers();

  @Import("menuOpcodes")
  int[] getMenuOpcodes();

  @Import("menuArguments1")
  int[] getMenuArguments1();

  @Import("menuArguments2")
  int[] getMenuArguments2();

  @Import("menuShiftClick")
  boolean[] getMenuForceLeftClick();

  @Import("World_worlds")
  @Override
  RSWorld[] getWorldList();

  @Import("addChatMessage")
  void addRSChatMessage(int type, String name, String message, String sender);

  @Import("getObjectDefinition")
  RSObjectComposition getRSObjectComposition(int objectId);

  @Import("getNpcDefinition")
  RSNPCComposition getRSNpcComposition(int npcId);

  @Import("viewportZoom")
  @Override
  int getScale();

  @Import("canvasHeight")
  @Override
  int getCanvasHeight();

  @Import("canvasWidth")
  @Override
  int getCanvasWidth();

  @Import("viewportHeight")
  @Override
  int getViewportHeight();

  @Import("viewportWidth")
  @Override
  int getViewportWidth();

  @Import("viewportOffsetX")
  @Override
  int getViewportXOffset();

  @Import("viewportOffsetY")
  @Override
  int getViewportYOffset();

  @Import("isResizable")
  @Override
  boolean isResized();

  @Import("rootWidgetXs")
  @Override
  int[] getWidgetPositionsX();

  @Import("rootWidgetYs")
  @Override
  int[] getWidgetPositionsY();

  @Import("mouseCam")
  boolean isMouseCam();

  @Import("camAngleDX")
  int getCamAngleDX();

  @Import("camAngleDX")
  void setCamAngleDX(int angle);

  @Import("camAngleDY")
  int getCamAngleDY();

  @Import("camAngleDY")
  void setCamAngleDY(int angle);

  @Import("itemContainers")
  RSNodeHashTable getItemContainers();

  @Import("ItemDefinition_get")
  RSItemComposition getRSItemDefinition(int itemId);

  @Import("getItemSprite")
  RSSpritePixels createRSItemSprite(int itemId, int quantity, int thickness, int borderColor,
                                    int stackable, boolean noted);

  @Import("menuAction")
  void sendMenuAction(int n2, int n3, int n4, int n5, String string, String string2, int n6,
                      int n7);

  @Import("SpriteBuffer_decode")
  void decodeSprite(byte[] data);

  @Import("SpriteBuffer_spriteCount")
  int getIndexedSpriteCount();

  @Import("SpriteBuffer_spriteWidth")
  int getIndexedSpriteWidth();

  @Import("SpriteBuffer_spriteHeight")
  int getIndexedSpriteHeight();

  @Import("SpriteBuffer_xOffsets")
  int[] getIndexedSpriteOffsetXs();

  @Import("SpriteBuffer_xOffsets")
  void setIndexedSpriteOffsetXs(int[] indexedSpriteOffsetXs);

  @Import("SpriteBuffer_yOffsets")
  int[] getIndexedSpriteOffsetYs();

  @Import("SpriteBuffer_yOffsets")
  void setIndexedSpriteOffsetYs(int[] indexedSpriteOffsetYs);

  @Import("SpriteBuffer_spriteWidths")
  int[] getIndexedSpriteWidths();

  @Import("SpriteBuffer_spriteWidths")
  void setIndexedSpriteWidths(int[] indexedSpriteWidths);

  @Import("SpriteBuffer_spriteHeights")
  int[] getIndexedSpriteHeights();

  @Import("SpriteBuffer_spriteHeights")
  void setIndexedSpriteHeights(int[] indexedSpriteHeights);

  @Import("SpriteBuffer_pixels")
  byte[][] getSpritePixels();

  @Import("SpriteBuffer_pixels")
  void setSpritePixels(byte[][] spritePixels);

  @Import("SpriteBuffer_spritePalette")
  int[] getIndexedSpritePalette();

  @Import("SpriteBuffer_spritePalette")
  void setIndexedSpritePalette(int[] indexedSpritePalette);

  @Import("archive2")
  @Override
  RSArchive getIndexConfig();

  @Import("archive6")
  RSArchive getMusicTracks();

  @Import("archive8")
  @Override
  RSArchive getIndexSprites();

  @Import("archive12")
  @Override
  RSArchive getIndexScripts();

  @Import("widgetFlags")
  @Override
  RSNodeHashTable getWidgetFlags();

  @Import("interfaceParents")
  @Override
  RSNodeHashTable getComponentTable();

  @Import("grandExchangeOffers")
  RSGrandExchangeOffer[] getGrandExchangeOffers();

  @Import("foundItemIdCount")
  @Override
  void setGeSearchResultCount(int count);

  @Import("foundItemIds")
  @Override
  void setGeSearchResultIds(short[] ids);

  @Import("foundItemIndex")
  @Override
  void setGeSearchResultIndex(int index);

  @Import("isMenuOpen")
  @Override
  boolean isMenuOpen();

  @Import("cycle")
  @Override
  int getGameCycle();

  @Import("Messages_channels")
  @Override
  Map getChatLineMap();

  @Import("Messages_hashTable")
  @Override
  RSIterableNodeHashTable getMessages();

  @Import("RunException_revision")
  @Override
  int getRevision();

  @Import("regions")
  @Override
  int[] getMapRegions();

  @Import("instanceChunkTemplates")
  @Override
  int[][][] getInstanceTemplateChunks();

  @Import("xteaKeys")
  @Override
  int[][] getXteaKeys();

  @Import("gameDrawingMode")
  @Override
  int getGameDrawingMode();

  @Import("gameDrawingMode")
  @Override
  void setGameDrawingMode(int gameDrawingMode);

  @Import("cycleCntr")
  int getCycleCntr();

  @Import("chatCycle")
  void setChatCycle(int value);

  /**
   * Get the widget top group. widgets[topGroup] contains widgets with parentId -1, which are the
   * widget roots.
   */
  @Import("rootInterface")
  int getTopLevelInterfaceId();

  @Import("WorldMapElement_cached")
  @Override
  RSWorldMapElement[] getMapElementConfigs();

  @Import("mapSceneSprites")
  @Override
  RSIndexedSprite[] getMapScene();

  @Import("mapIcons")
  @Override
  RSSpritePixels[] getMapIcons();

  @Import("mapDotSprites")
  RSSpritePixels[] getMapDots();

  @Import("AbstractFont_modIconSprites")
  @Override
  RSIndexedSprite[] getModIcons();

  @Import("AbstractFont_modIconSprites")
  void setRSModIcons(RSIndexedSprite[] modIcons);

  @Construct
  @Override
  RSIndexedSprite createIndexedSprite();

  @Construct
  @Override
  RSSpritePixels createSpritePixels(int[] pixels, int width, int height);

  @Import("destinationX")
  int getDestinationX();

  @Import("destinationY")
  int getDestinationY();

  @Import("destinationX")
  void setDestinationX(int sceneX);

  @Import("destinationY")
  void setDestinationY(int sceneY);

  @Import("soundEffects")
  RSSoundEffect[] getAudioEffects();

  @Import("soundEffectIds")
  int[] getQueuedSoundEffectIDs();

  @Import("soundLocations")
  int[] getSoundLocations();

  @Import("queuedSoundEffectLoops")
  int[] getQueuedSoundEffectLoops();

  @Import("queuedSoundEffectDelays")
  int[] getQueuedSoundEffectDelays();

  @Import("soundEffectCount")
  int getQueuedSoundEffectCount();

  @Import("soundEffectCount")
  void setQueuedSoundEffectCount(int queuedSoundEffectCount);

  @Import("queueSoundEffect")
  void queueSoundEffect(int id, int numLoops, int delay);

  @Import("rasterProvider")
  @Override
  RSAbstractRasterProvider getBufferProvider();

  @Import("MouseHandler_idleCycles")
  @Override
  int getMouseIdleTicks();

  @Import("MouseHandler_idleCycles")
  @Override
  void setMouseIdleTicks(int cycles);

  @Import("MouseHandler_lastPressedTimeMillis")
  @Override
  long getMouseLastPressedMillis();

  @Import("MouseHandler_lastPressedTimeMillis")
  @Override
  void setMouseLastPressedMillis(long time);

  @Import("KeyHandler_idleCycles")
  @Override
  int getKeyboardIdleTicks();

  @Import("KeyHandler_idleCycles")
  @Override
  void setKeyboardIdleTicks(int cycles);

  @Import("KeyHandler_pressedKeys")
  @Override
  boolean[] getPressedKeys();

  @Import("isLowDetail")
  void setLowMemory(boolean lowMemory);

  @Import("Scene_isLowDetail")
  void setSceneLowMemory(boolean lowMemory);

  @Import("PcmPlayer_stereo")
  void setAudioHighMemory(boolean highMemory);

  @Import("ObjectDefinition_isLowDetail")
  void setObjectDefinitionLowDetail(boolean lowDetail);

  @Import("Interpreter_intStackSize")
  @Override
  int getIntStackSize();

  @Import("Interpreter_intStackSize")
  @Override
  void setIntStackSize(int stackSize);

  @Import("Interpreter_intStack")
  @Override
  int[] getIntStack();

  @Import("Interpreter_stringStackSize")
  @Override
  int getStringStackSize();

  @Import("Interpreter_stringStackSize")
  @Override
  void setStringStackSize(int stackSize);

  @Import("Interpreter_stringStack")
  @Override
  String[] getStringStack();

  @Import("friendSystem")
  RSFriendSystem getFriendManager();

  @Import("friendsChat")
  RSFriendsChat getFriendsChatManager();

  @Import("loginType")
  RSLoginType getLoginType();

  @Construct
  RSUsername createName(String name, RSLoginType type);

  @Import("getVarbit")
  int rs$getVarbit(int varbitId);

  @Import("VarbitDefinition_cached")
  RSEvictingDualNodeHashTable getVarbitCache();

  @Import("clientPreferences")
  @Override
  RSClientPreferences getPreferences();

  /**
   * This is the pitch the user has set the camera to. It should be between 128 and
   * (pitchUnlimiter?512:383) JAUs(1). The difference between this and cameraPitch is that
   * cameraPitch has a lower limit, imposed by the surrounding terrain.
   * <p>
   * (1) JAU - Jagex Angle Unit; 1/1024 of a revolution
   */
  @Import("camAngleX")
  int getCameraPitchTarget();

  @Import("camAngleX")
  void setCameraPitchTarget(int pitch);

  @Import("Scene_cameraPitchSine")
  void setPitchSin(int v);

  @Import("Scene_cameraPitchCosine")
  void setPitchCos(int v);

  @Import("Scene_cameraYawSine")
  void setYawSin(int v);

  @Import("Scene_cameraYawCosine")
  void setYawCos(int v);

  @Import("Rasterizer3D_zoom")
  @Override
  int get3dZoom();

  @Import("Rasterizer3D_zoom")
  void set3dZoom(int zoom);

  @Import("Rasterizer3D_clipMidX2")
  @Override
  int getRasterizer3D_clipMidX2();

  @Import("Rasterizer3D_clipNegativeMidX")
  @Override
  int getRasterizer3D_clipNegativeMidX();

  @Import("Rasterizer3D_clipNegativeMidY")
  @Override
  int getRasterizer3D_clipNegativeMidY();

  @Import("Rasterizer3D_clipMidY2")
  @Override
  int getRasterizer3D_clipMidY2();

  @Import("Rasterizer3D_clipMidX")
  @Override
  int getCenterX();

  @Import("Rasterizer3D_clipMidY")
  @Override
  int getCenterY();

  @Import("getWorldMap")
  RSWorldMap getRenderOverview();

  @Import("changeWorld")
  @Override
  void changeWorld(World world);

  @Construct
  @Override
  RSWorld createWorld();

  @Import("Model_transformTempX")
  void setAnimOffsetX(int animOffsetX);

  @Import("Model_transformTempY")
  void setAnimOffsetY(int animOffsetY);

  @Import("Model_transformTempZ")
  void setAnimOffsetZ(int animOffsetZ);

  @Import("getFrames")
  @Override
  RSFrames getFrames(int frameId);

  @Import("sceneMinimapSprite")
  RSSpritePixels getMinimapSprite();

  @Import("sceneMinimapSprite")
  void setMinimapSprite(SpritePixels spritePixels);

  @Import("drawObject")
  void drawObject(int z, int x, int y, int randomColor1, int randomColor2);

  @Construct
  RSScriptEvent createScriptEvent();

  @Import("runScript")
  void runScript(RSScriptEvent ev, int ex, int var2);

  @Import("hintArrowType")
  int getHintArrowTargetType();

  @Import("hintArrowType")
  void setHintArrowTargetType(int value);

  @Import("hintArrowX")
  int getHintArrowX();

  @Import("hintArrowX")
  void setHintArrowX(int value);

  @Import("hintArrowY")
  int getHintArrowY();

  @Import("hintArrowY")
  void setHintArrowY(int value);

  @Import("hintArrowSubX")
  void setHintArrowOffsetX(int value);

  @Import("hintArrowSubY")
  void setHintArrowOffsetY(int value);

  @Import("hintArrowNpcIndex")
  int getHintArrowNpcTargetIdx();

  @Import("hintArrowNpcIndex")
  void setHintArrowNpcTargetIdx(int value);

  @Import("hintArrowPlayerIndex")
  int getHintArrowPlayerTargetIdx();

  @Import("hintArrowPlayerIndex")
  void setHintArrowPlayerTargetIdx(int value);

  @Import("isInInstance")
  @Override
  boolean isInInstancedRegion();

  @Import("itemDragDuration")
  @Override
  int getItemPressedDuration();

  @Import("itemDragDuration")
  void setItemPressedDuration(int duration);

  @Import("worldProperties")
  int getFlags();

  @Import("compass")
  void setCompass(SpritePixels spritePixels);

  @Import("Widget_cachedSprites")
  @Override
  RSEvictingDualNodeHashTable getWidgetSpriteCache();

  @Import("ItemDefinition_cached")
  @Override
  RSEvictingDualNodeHashTable getItemCompositionCache();

  @Import("oculusOrbState")
  @Override
  int getOculusOrbState();

  @Import("oculusOrbState")
  @Override
  void setOculusOrbState(int state);

  @Import("oculusOrbNormalSpeed")
  @Override
  void setOculusOrbNormalSpeed(int state);

  @Import("oculusOrbFocalPointX")
  @Override
  int getOculusOrbFocalPointX();

  @Import("oculusOrbFocalPointY")
  @Override
  int getOculusOrbFocalPointY();

  RSTileItem getLastItemDespawn();

  void setLastItemDespawn(RSTileItem lastItemDespawn);

  @Construct
  RSWidget createWidget();

  @Import("alignWidget")
  void revalidateWidget(Widget w);

  @Import("revalidateWidgetScroll")
  void revalidateWidgetScroll(Widget[] group, Widget w, boolean postEvent);

  @Import("ViewportMouse_entityCount")
  int getEntitiesAtMouseCount();

  @Import("ViewportMouse_entityCount")
  void setEntitiesAtMouseCount(int i);

  @Import("ViewportMouse_entityTags")
  long[] getEntitiesAtMouse();

  @Import("ViewportMouse_x")
  int getViewportMouseX();

  @Import("ViewportMouse_y")
  int getViewportMouseY();

  @Import("textureProvider")
  @Override
  RSTextureProvider getTextureProvider();

  @Import("tileLastDrawnActor")
  int[][] getOccupiedTilesTick();

  @Import("ObjectDefinition_cachedModels")
  RSEvictingDualNodeHashTable getCachedModels2();

  @Import("Scene_drawnCount")
  int getCycle();

  @Import("Scene_drawnCount")
  void setCycle(int cycle);

  @Import("visibilityMap")
  boolean[][][][] getVisibilityMaps();

  @Import("visibleTiles")
  void setRenderArea(boolean[][] renderArea);

  @Import("Scene_cameraXTile")
  void setScreenCenterX(int screenCenterX);

  @Import("Scene_cameraYTile")
  void setScreenCenterZ(int screenCenterZ); // <-- This is correct!

  @Import("Scene_plane")
  void setScenePlane(int scenePlane);

  @Import("Scene_cameraXTileMin")
  void setMinTileX(int i);

  @Import("Scene_cameraYTileMin")
  void setMinTileZ(int i); // <-- This is correct!

  @Import("Scene_cameraXTileMax")
  void setMaxTileX(int i);

  @Import("Scene_cameraYTileMax")
  void setMaxTileZ(int i); // <-- This is correct!

  @Import("tileUpdateCount")
  int getTileUpdateCount();

  @Import("tileUpdateCount")
  void setTileUpdateCount(int tileUpdateCount);

  @Import("ViewportMouse_isInViewport")
  boolean getViewportContainsMouse();

  @Import("Rasterizer2D_pixels")
  @Override
  int[] getGraphicsPixels();

  @Import("Rasterizer2D_width")
  int getGraphicsPixelsWidth();

  @Import("Rasterizer2D_height")
  int getGraphicsPixelsHeight();

  @Import("Rasterizer2D_fillRectangle")
  void rasterizerFillRectangle(int x, int y, int w, int h, int rgb);

  @Import("Rasterizer2D_xClipStart")
  int getStartX();

  @Import("Rasterizer2D_yClipStart")
  int getStartY();

  @Import("Rasterizer2D_xClipEnd")
  int getEndX();

  @Import("Rasterizer2D_yClipEnd")
  int getEndY();

  @Import("dragInventoryWidget")
  @Override
  RSWidget getIf1DraggedWidget();

  @Import("dragItemSlotSource")
  @Override
  int getIf1DraggedItemIndex();

  @Import("getEnum")
  RSEnumComposition getRsEnum(int id);

  @Import("menuX")
  int getMenuX();

  @Import("menuY")
  int getMenuY();

  @Import("menuHeight")
  int getMenuHeight();

  @Import("menuWidth")
  int getMenuWidth();

  @Import("fontBold12")
  RSFont getFontBold12();

  @Import("Rasterizer2D_drawHorizontalLine")
  void rasterizerDrawHorizontalLine(int x, int y, int w, int rgb);

  @Import("Rasterizer2D_drawHorizontalLineAlpha")
  void rasterizerDrawHorizontalLineAlpha(int x, int y, int w, int rgb, int a);

  @Import("Rasterizer2D_drawVerticalLine")
  void rasterizerDrawVerticalLine(int x, int y, int h, int rgb);

  @Import("Rasterizer2D_drawVerticalLineAlpha")
  void rasterizerDrawVerticalLineAlpha(int x, int y, int h, int rgb, int a);

  @Import("Rasterizer2D_fillRectangleGradient")
  void rasterizerDrawGradient(int x, int y, int w, int h, int rgbTop, int rgbBottom);

  @Import("Rasterizer2D_fillRectangleGradientAlpha")
  void rasterizerDrawGradientAlpha(int x, int y, int w, int h, int rgbTop, int rgbBottom,
                                   int alphaTop, int alphaBottom);

  @Import("Rasterizer2D_fillRectangleAlpha")
  void rasterizerFillRectangleAlpha(int x, int y, int w, int h, int rgb, int a);

  @Import("Rasterizer2D_drawRectangle")
  void rasterizerDrawRectangle(int x, int y, int w, int h, int rgb);

  @Import("Rasterizer2D_drawRectangleAlpha")
  void rasterizerDrawRectangleAlpha(int x, int y, int w, int h, int rgb, int a);

  @Import("drawCircle")
  void rasterizerDrawCircle(int x, int y, int r, int rgb);

  @Import("Rasterizer2D_drawCircleAlpha")
  void rasterizerDrawCircleAlpha(int x, int y, int r, int rgb, int a);

  @Import("HealthBarDefinition_cached")
  RSEvictingDualNodeHashTable getHealthBarCache();

  @Import("HealthBarDefinition_cachedSprites")
  RSEvictingDualNodeHashTable getHealthBarSpriteCache();

  @Import("renderSelf")
  @Override
  boolean getRenderSelf();

  @Import("renderSelf")
  @Override
  void setRenderSelf(boolean enabled);

  @Import("mouseRecorder")
  RSMouseRecorder getMouseRecorder();

  @Import("selectedSpellName")
  String getSelectedSpellName();

  @Import("selectedSpellName")
  @Override
  void setSelectedSpellName(String name);

  @Override
  @Import("selectedSpellActionName")
  String getSelectedSpellActionName();

  @Override
  @Import("selectedSpellFlags")
  int getSelectedSpellFlags();

  @Import("isSpellSelected")
  boolean getSpellSelected();

  @Import("isSpellSelected")
  @Override
  void setSpellSelected(boolean selected);

  @Import("readSoundEffect")
  RSSoundEffect getTrack(RSAbstractArchive indexData, int id, int var0);

  @Import("createRawPcmStream")
  RSRawPcmStream createRawPcmStream(RSRawSound audioNode, int var0, int volume);

  @Import("pcmStreamMixer")
  RSPcmStreamMixer getSoundEffectAudioQueue();

  @Import("archive4")
  RSArchive getIndexCache4();

  @Import("decimator")
  RSDecimator getSoundEffectResampler();

  @Import("musicTrackVolume")
  void setMusicTrackVolume(int volume);

  @Import("viewportWalking")
  @Override
  void setViewportWalking(boolean viewportWalking);

  void playMusicTrack(int var0, RSAbstractArchive var1, int var2, int var3, int var4, boolean var5);

  @Import("midiPcmStream")
  RSMidiPcmStream getMidiPcmStream();

  @Import("currentTrackGroupId")
  int getCurrentTrackGroupId();

  @Import("crossSprites")
  @Override
  RSSpritePixels[] getCrossSprites();

  void setModulus(BigInteger modulus);

  @Import("ItemDefinition_fileCount")
  int getItemCount();

  @Import("insertMenuItem")
  @Override
  void insertMenuItem(String action, String target, int opcode, int identifier, int argument1,
                      int argument2, boolean forceLeftClick);

  @Import("selectedItemId")
  @Override
  void setSelectedItemID(int id);

  @Import("selectedItemSlot")
  @Override
  int getSelectedItemSlot();

  @Import("selectedItemSlot")
  @Override
  void setSelectedItemSlot(int index);

  @Import("selectedItemWidget")
  @Override
  int getSelectedItemWidget();

  @Import("selectedItemWidget")
  @Override
  void setSelectedItemWidget(int widgetID);

  @Import("selectedSpellWidget")
  @Override
  int getSelectedSpellWidget();

  @Import("selectedSpellWidget")
  @Override
  void setSelectedSpellWidget(int widgetID);

  @Import("selectedSpellChildIndex")
  @Override
  int getSelectedSpellChildIndex();

  @Import("selectedSpellChildIndex")
  @Override
  void setSelectedSpellChildIndex(int index);

  @Import("Sprite_drawScaled")
  @Override
  void scaleSprite(int[] canvas, int[] pixels, int color, int pixelX, int pixelY, int canvasIdx,
                   int canvasOffset, int newWidth, int newHeight, int pixelWidth, int pixelHeight, int oldWidth);

  /**
   * This sets the login screen to where it asks for username/pass
   */
  @Import("Login_promptCredentials")
  void promptCredentials(boolean clearPass);

  @Import("VarpDefinition_get")
  RSVarpDefinition getVarpDefinition(int id);

  @Construct
  RSTileItem newTileItem();

  @Construct
  RSNodeDeque newNodeDeque();

  @Import("updateItemPile")
  void updateItemPile(int localX, int localY);

  @Import("showMouseCross")
  @Override
  void setShowMouseCross(boolean show);

  @Import("draggedWidgetX")
  int getDraggedWidgetX(); // these should probably have if1 in their names somewhere

  @Import("draggedWidgetY")
  int getDraggedWidgetY();

  @Import("changedSkills")
  int[] getChangedSkillLevels();

  @Import("mouseLastLastPressedTimeMillis")
  @Override
  long getClientMouseLastPressedMillis();

  @Import("mouseLastLastPressedTimeMillis")
  @Override
  void setClientMouseLastPressedMillis(long time);

  @Import("rootWidgetCount")
  int getRootWidgetCount();

  @Import("widgetClickX")
  int getWidgetClickX();

  @Import("widgetClickY")
  int getWidgetClickY();

  @Import("staffModLevel")
  int getStaffModLevel();

  @Import("tradeChatMode")
  int getTradeChatMode();

  @Import("publicChatMode")
  int getPublicChatMode();

  @Import("clientType")
  int getClientType();

  @Import("onMobile")
  boolean isOnMobile();

  @Import("hadFocus")
  boolean hadFocus();

  @Import("mouseCrossColor")
  int getMouseCrossColor();

  @Import("mouseCrossColor")
  void setMouseCrossColor(int color);

  @Import("leftClickOpensMenu")
  int getLeftClickOpensMenu();

  @Import("showMouseOverText")
  boolean getShowMouseOverText();

  @Import("showMouseOverText")
  void setShowMouseOverText(boolean showMouseOverText);

  @Import("defaultRotations")
  int[] getDefaultRotations();

  @Import("showLoadingMessages")
  boolean getShowLoadingMessages();

  @Import("showLoadingMessages")
  void setShowLoadingMessages(boolean showLoadingMessages);

  @Import("stopTimeMs")
  void setStopTimeMs(long time);

  @Import("clearLoginScreen")
  @Override
  void clearLoginScreen(boolean shouldClear);

  @Import("leftTitleSprite")
  void setLeftTitleSprite(SpritePixels background);

  @Import("rightTitleSprite")
  void setRightTitleSprite(SpritePixels background);

  @Construct
  RSBuffer newBuffer(byte[] bytes);

  @Construct
  RSVarbitComposition newVarbitDefinition();

  @Override
  @Import("followerIndex")
  int getFollowerIndex();

  @Override
  @Import("isItemSelected")
  int isItemSelected();

  @Override
  @Import("selectedItemName")
  String getSelectedItemName();

  @Import("meslayerContinueWidget")
  Widget getMessageContinueWidget();

  @Import("musicPlayerStatus")
  void setMusicPlayerStatus(int var0);

  @Import("musicTrackArchive")
  void setMusicTrackArchive(RSAbstractArchive var0);

  @Import("musicTrackGroupId")
  void setMusicTrackGroupId(int var0);

  @Import("musicTrackFileId")
  void setMusicTrackFileId(int var0);

  @Import("musicTrackBoolean")
  void setMusicTrackBoolean(boolean var0);

  @Import("pcmSampleLength")
  void setPcmSampleLength(int var0);

  @Import("changedVarps")
  int[] getChangedVarps();

  @Import("changedVarpCount")
  int getChangedVarpCount();

  @Import("changedVarpCount")
  void setChangedVarpCount(int changedVarpCount);

  @Import("scriptActiveWidget")
  RSWidget getScriptActiveWidget();

  @Import("scriptDotWidget")
  RSWidget getScriptDotWidget();

  RSScriptEvent createRSScriptEvent(Object... args);

  void runScriptEvent(RSScriptEvent event);

  @Import("Script_cached")
  RSEvictingDualNodeHashTable getScriptCache();

  @Import("StructDefinition_cached")
  RSEvictingDualNodeHashTable getRSStructCompositionCache();

  @Import("StructDefinition_getStructDefinition")
  RSStructComposition getRSStructComposition(int id);

  @Import("getParamDefinition")
  RSParamComposition getRSParamComposition(int id);

  @Import("SequenceDefinition_get")
  @Override
  RSSequenceDefinition getSequenceDefinition(int id);

  @Construct
  RSIntegerNode newIntegerNode(int contents);

  @Construct
  RSObjectNode newObjectNode(Object contents);

  @Construct
  RSIterableNodeHashTable newIterableNodeHashTable(int size);

  RSVarbitComposition getVarbitComposition(int id);

  @Override
  @Import("SequenceDefinition_skeletonsArchive")
  RSAbstractArchive getSequenceDefinition_skeletonsArchive();

  @Override
  @Import("SequenceDefinition_archive")
  RSAbstractArchive getSequenceDefinition_archive();

  @Override
  @Import("SequenceDefinition_animationsArchive")
  RSAbstractArchive getSequenceDefinition_animationsArchive();

  @Override
  @Import("NpcDefinition_archive")
  RSAbstractArchive getNpcDefinition_archive();

  @Override
  @Import("ObjectDefinition_modelsArchive")
  RSAbstractArchive getObjectDefinition_modelsArchive();

  @Override
  @Import("ObjectDefinition_archive")
  RSAbstractArchive getObjectDefinition_archive();

  @Override
  @Import("ItemDefinition_archive")
  RSAbstractArchive getItemDefinition_archive();

  @Override
  @Import("KitDefinition_archive")
  RSAbstractArchive getKitDefinition_archive();

  @Override
  @Import("KitDefinition_modelsArchive")
  RSAbstractArchive getKitDefinition_modelsArchive();

  @Override
  @Import("SpotAnimationDefinition_archive")
  RSAbstractArchive getSpotAnimationDefinition_archive();

  @Override
  @Import("SpotAnimationDefinition_modelArchive")
  RSAbstractArchive getSpotAnimationDefinition_modelArchive();

  @Construct
  RSBuffer createBuffer(byte[] bytes);

  @Construct
  RSSceneTilePaint createSceneTilePaint(int swColor, int seColor, int neColor, int nwColor,
                                        int texture, int rgb, boolean isFlat);

  @Import("crossWorldMessageIds")
  long[] getCrossWorldMessageIds();

  @Import("crossWorldMessageIdsIndex")
  int getCrossWorldMessageIdsIndex();

  @Import("currentClanChannels")
  RSClanChannel[] getCurrentClanChannels();

  @Import("currentClanSettings")
  RSClanSettings[] getCurrentClanSettingsAry();

  @Import("guestClanChannel")
  @Override
  RSClanChannel getGuestClanChannel();

  @Import("guestClanSettings")
  @Override
  RSClanSettings getGuestClanSettings();

  ClanRank getClanRankFromRs(int rank);

  @Import("MouseHandler_lastPressedX")
  @Override
  int getMouseLastPressedX();

  @Import("MouseHandler_lastPressedX")
  @Override
  void setMouseLastPressedX(int x);

  @Import("MouseHandler_lastPressedY")
  @Override
  int getMouseLastPressedY();

  @Import("MouseHandler_lastPressedY")
  @Override
  void setMouseLastPressedY(int y);

  @Import("packetWriter")
  @Override
  RSPacketWriter getPacketWriter();

  @Import("getPacketBufferNode")
  @Override
  RSPacketBufferNode preparePacket(ClientPacket packet, IsaacCipher isaac);

  @Import("loadWorlds")
  @Override
  boolean loadWorlds();

  @Import("logoSprite")
  @Override
  void setLogoSprite(IndexedSprite indexedSprite);

  @Import("titleboxSprite")
  @Override
  void setLoginBoxSprite(IndexedSprite indexedSprite);

  @Import("titlebuttonSprite")
  @Override
  void setLoginButtonSprite(IndexedSprite indexedSprite);

  @Import("loginWorldsButton")
  @Override
  void setLoginWorldsButtonSprite(IndexedSprite indexedSprite);

  @Import("title_muteSprite")
  @Override
  RSIndexedSprite[] getTitleMuteSprites();

  @Import("optionSprite")
  @Override
  void setOptionSprite(IndexedSprite indexedSprite);

  @Import("options_buttons_0Sprite")
  @Override
  void setOptionSprite1(IndexedSprite indexedSprite);

  @Import("options_buttons_2Sprite")
  @Override
  void setOptionSprite2(IndexedSprite indexedSprite);

  @Import("optionEnabledSprite")
  @Override
  void setOptionSprite3(IndexedSprite indexedSprite);

  @Import("logoSprite")
  @Override
  RSIndexedSprite getLogoSprite();

  @Import("titleboxSprite")
  @Override
  RSIndexedSprite getLoginBoxSprite();

  @Import("titlebuttonSprite")
  @Override
  RSIndexedSprite getLoginButtonSprite();

  @Import("loginWorldsButton")
  @Override
  RSIndexedSprite getLoginWorldsButtonSprite();

  @Import("optionSprite")
  @Override
  RSIndexedSprite getOptionSprite();

  @Import("options_buttons_0Sprite")
  @Override
  RSIndexedSprite getOptionSprite1();

  @Import("options_buttons_2Sprite")
  @Override
  RSIndexedSprite getOptionSprite2();

  @Import("optionEnabledSprite")
  @Override
  RSIndexedSprite getOptionSprite3();

  @Import("resumePauseWidget")
  @Override
  void processDialog(int widgetUid, int menuIndex);

  @Import("loginTitleColor")
  void setLoginTitleColor(int colorHex);

  @Import("loginTitleMessage")
  void setLoginTitleMessage(String message);

  @Import("rndHue")
  int getRndHue();

  @Import("Tiles_underlays")
  byte[][][] getTileUnderlays();

  @Import("Tiles_overlays")
  byte[][][] getTileOverlays();

  @Import("Tiles_shapes")
  byte[][][] getTileShapes();

  @Import("Scene_tilesDeque")
  RSNodeDeque getTilesDeque();

  @Import("worldSelectOpen")
  @Override
  boolean isWorldSelectOpen();

  @Import("worldSelectOpen")
  @Override
  void setWorldSelectOpen(boolean open);

  @Import("setWindowedMode")
  @Override
  void setWindowedMode(int mode);

  @Import("getWindowedMode")
  @Override
  int getWindowedMode();

  @Import("MouseHandler_instance")
  @Override
  RSMouseHandler getMouseHandler();

  @Import("getServerTime")
  @Override
  long getCurrentTime();

  @Import("hasFocus")
  @Override
  boolean isFocused();

  @Import("volatileFocus")
  @Override
  void setFocused(boolean focused);

  @Import("mouseCrossX")
  @Override
  void setClickCrossX(int x);

  @Import("mouseCrossY")
  @Override
  void setClickCrossY(int y);

  @Import("SpotAnimationDefinition_get")
  RSSpotAnimationDefinition getSpotAnimationDefinition(int id);

  @Import("ModelData_get")
  RSModelData getModelData(RSAbstractArchive var0, int var1, int var2);

  @Import("readStringIntParameters")
  RSIterableNodeHashTable readStringIntParameters(RSBuffer buffer, RSIterableNodeHashTable table);

  @Import("isCameraLocked")
  boolean isCameraLocked();

  @Import("oculusOrbFocalPointX")
  @Override
  void setOculusOrbFocalPointX(int state);

  @Import("oculusOrbFocalPointY")
  @Override
  void setOculusOrbFocalPointY(int state);

  @Import("objectSounds")
  Deque<AmbientSoundEffect> getAmbientSoundEffects();

  long getUnlockedFpsTarget();
}