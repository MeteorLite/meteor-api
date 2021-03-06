package eventbus

enum class Events {
    ACTOR_DEATH,
    ADDED_FRIEND,
    ANIMATION_CHANGED,
    APPLET_LOADED,
    AREA_SOUND_EFFECT_PLAYED,
    AUTOMATED_MENU,
    BEFORE_MENU_RENDER,
    BEFORE_RENDER,
    CANVAS_SIZE_CHANGED,
    CHAT_MESSAGE,
    CHEAT_ENTERED,
    CLAN_CHANNEL_CHANGED,
    CLAN_MEMBER_JOINED,
    CLAN_MEMBER_LEFT,
    CLIENT_LOADED,
    CLIENT_TICK,
    COMMAND_EXECUTED,
    CONFIG_CHANGED,
    DECORATIVE_OBJECT_CHANGED,
    DECORATIVE_OBJECT_DESPAWNED,
    DECORATIVE_OBJECT_SPAWNED,
    DIALOG_PROCESSED,
    DRAGGING_WIDGET_CHANGED,
    DYNAMIC_OBJECT_ANIMATION_CHANGED,
    EXPERIENCE_GAINED,
    FOCUS_CHANGED,
    FRIENDS_CHAT_CHANGED,
    FRIENDS_CHAT_MEMBER_JOINED,
    FRIENDS_CHAT_MEMBER_LEFT,
    GAME_OBJECT_CHANGED,
    GAME_OBJECT_DESPAWNED,
    GAME_OBJECT_SPAWNED,
    GAME_STATE_CHANGED,
    GAME_TICK,
    GRAND_EXCHANGE_OFFER_CHANGED,
    GRAND_EXCHANGE_OFFER_COMPLETED,
    GRAND_EXCHANGE_SEARCHED,
    GRAPHIC_CHANGED,
    GRAPHICS_OBJECT_CREATED,
    GROUND_OBJECT_CHANGED,
    GROUND_OBJECT_SPAWNED,
    GROUND_OBJECT_DESPAWNED,
    HEALTH_BAR_UPDATED,
    HITSPLAT_APPLIED,
    INTERACTING_CHANGED,
    INVENTORY_CHANGED,
    INVOKE_MENU_ACTION,
    ITEM_CONTAINER_CHANGED,
    ITEM_DESPAWNED,
    ITEM_ADDED,
    ITEM_REMOVED,
    ITEM_OBTAINED,
    ITEM_QUANTITY_CHANGED,
    ITEM_SPAWNED,
    LOGIN_STATE_CHANGED,
    MENU,
    MENU_ACTION_PROCESSED,
    MENU_ENTRY_ADDED,
    MENU_OPENED,
    MENU_OPTION_CLICKED,
    MENU_SHOULD_LEFT_CLICK,
    NAMEABLE_NAME_CHANGED,
    NPC_ACTION_CHANGED,
    NPC_CHANGED,
    NPC_DESPAWNED,
    NPC_SPAWNED,
    OVERHEAD_TEXT_CHANGED,
    OVERHEAD_PRAYER_CHANGED,
    OVERLAY_MENU_CHANGED,
    PACKET_SENT,
    PLANE_CHANGED,
    PLAYER_CHANGED,
    PLAYER_COMPOSITION_CHANGED,
    PLAYER_DESPAWNED,
    PLAYER_MENU_OPTIONS_CHANGED,
    PLAYER_SKULL_CHANGED,
    PLAYER_SPAWNED,
    PLUGIN_CHANGED,
    POST_HEALTHBAR,
    POST_ITEM_COMPOSITION,
    POST_STRUCT_COMPOSITION,
    PROJECTILE_MOVED,
    PROJECTILE_SPAWNED,
    REMOVED_FRIEND,
    RESUME_PAUSE_SENT,
    RESIZEABLE_CHANGED,
    SCRIPT_CALLBACK,
    SCRIPT_POST_FIRED,
    SCRIPT_PRE_FIRED,
    SOUND_EFFECT_PLAYED,
    STAT_CHANGED,
    USERNAME_CHANGED,
    VARCLIENT_INT_CHANGED,
    VARCLIENT_STR_CHANGED,
    VARBIT_CHANGED,
    VOLUME_CHANGED,
    WALL_OBJECT_CHANGED,
    WALL_OBJECT_DESPAWNED,
    WALL_OBJECT_SPAWNED,
    WIDGET_MENU_OPTION_CLICKED,
    WIDGET_HIDDEN_CHANGED,
    WIDGET_LOADED,
    WIDGET_POSITIONED,
    WIDGET_PRESSED,
    WIDGET_CLOSED,
    WORLD_CHANGED,
    WORLD_LIST_LOAD
}