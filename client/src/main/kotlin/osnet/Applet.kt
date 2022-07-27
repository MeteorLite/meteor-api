package osnet

import eventbus.Events
import net.runelite.api.Client
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.applet.AudioClip
import java.awt.Desktop
import java.awt.Dimension
import java.awt.Image
import java.io.File
import java.io.InputStream
import java.net.URL
import java.net.URLClassLoader
import java.util.*
import org.rationalityfrontline.kevent.KEVENT as EventBus

class AppletBootstrap {

    companion object {
        var panelSize = 375
        lateinit var applet: Applet
        var mainThread: Thread? = null
        var clientThread: Thread? = null

        fun asClient(applet: Applet): Client {
            return applet as Client
        }
    }

    fun init() {
        applet = configureApplet()
        applet.init()
    }

    private fun configureApplet(): Applet {
        val classloader = URLClassLoader(arrayOf(File("./src/main/resources/injected-client.osrs").toURI().toURL()), ClassLoader.getSystemClassLoader())
        val applet = classloader.loadClass("Client").newInstance() as Applet
        return applet
    }
}