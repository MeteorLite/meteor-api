package osnet

import java.io.File
import kotlin.system.exitProcess

object OSNetClient {
    private const val currentDir = "./"
    private const val parentDir = "../"
    var injected = File("")
    var loaded = false
    @JvmStatic
    fun main(args: Array<String>) {
        findInjected()
        AppletBootstrap().init()
    }

    fun findInjected() {
        val pathToInjected = "src/main/resources/injected-client.osrs"

        val currentDirInjected = File(currentDir + pathToInjected)
        val parentDirInjected = File(parentDir + pathToInjected)

        injected = if (currentDirInjected.exists()) {
            currentDirInjected
        } else if (parentDirInjected.exists()) {
            parentDirInjected
        } else {
            println("unable to find injected client... exiting")
            exitProcess(-1)
        }
    }
}