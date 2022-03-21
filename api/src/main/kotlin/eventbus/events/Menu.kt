package eventbus.events

/**
 * Gets sent before menu handling code is ran, once per client tick.
 * Can be consumed, skipping this method this tick.
 */
class Menu private constructor() {
    private var run = false
    fun reset() {
        run = true
    }

    fun dontRun() {
        run = false
    }

    fun shouldRun(): Boolean {
        return run
    }

    companion object {
        val MENU = Menu()
    }
}