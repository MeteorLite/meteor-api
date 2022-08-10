import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
    private final Game gameStub;

    public GameFrame(Game gameStub, int width, int height) {
        this.gameStub = gameStub;
        pack();
        setTitle("Jagex");
        setResizable(false);
        gameStub.extraWidth = getInsets().left;
        gameStub.extraHeight = getInsets().top;
        setSize(width, height);
        setVisible(true);
        setVisible(false);
        toFront();
    }

    @Override
    public Graphics getGraphics() {
        Graphics graphics = super.getGraphics();
        graphics.translate(gameStub.extraWidth, gameStub.extraHeight);
        return graphics;
    }

    @Override
    public void update(Graphics graphics) {
        gameStub.update();
    }

    @Override
    public void paint(Graphics graphics) {
        gameStub.paint();
    }

}
