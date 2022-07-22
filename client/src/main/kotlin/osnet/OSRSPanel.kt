package osnet

import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JPanel


object OSRSPanel {
    val panel = JPanel()
    var applet: java.applet.Applet? = null

    fun init() {
        val frame = JFrame("OSNet-Client")
        applet = Applet.applet
        frame.size = Dimension(781,540)
        panel.size = frame.size
        panel.layout = BorderLayout()
        panel.add(Applet.applet, null)
        frame.add(panel)
        Applet.applet.init()
        frame.isVisible = true
        Applet.applet.start()
        //Main.finishStartup()
        OSNetClient.loaded = true
    }
}
