import java.awt.Frame;
import net.runelite.mapping.ObfuscatedSignature;

public class GameWindow extends Frame {

  public final Game game;

  @ObfuscatedSignature(
      descriptor = "(LGame;III)V",
      garbageValue = "0"
  )
  public GameWindow(Game var1, int var2, int var3, int var4) {
    this.game = var1;
    this.setTitle("Jagex");
    this.show();
    this.hide();
    this.resize(var2, var3);
  }
}
