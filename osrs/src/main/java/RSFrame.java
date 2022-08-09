import java.awt.Frame;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class RSFrame extends Frame {

  public GameStub anApplet_Sub1_37;

  @SuppressWarnings("deprecation")
  public RSFrame(int j, GameStub applet_sub1, int k) {
    anApplet_Sub1_37 = applet_sub1;
    setTitle("Jagex");
    setResizable(false);
    show();
    toFront();
    resize(k + 8, j + 28);
  }

  @Override
  public Graphics getGraphics() {
    Graphics g = super.getGraphics();
    g.translate(4, 24);
    return g;
  }

  @Override
  public void update(Graphics g) {
    anApplet_Sub1_37.update(g);
  }

  @Override
  public void paint(Graphics g) {
    anApplet_Sub1_37.paint(g);
  }
}
