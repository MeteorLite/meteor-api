package eventbus.events

import meteor.Event
import net.runelite.api.GameState

class GameStateChanged(val gamestate: GameState): Event()