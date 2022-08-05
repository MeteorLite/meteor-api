import net.runelite.mapping.ObfuscatedSignature;

public class Renderable extends DualNode {

  public int anInt1394;
  public Class25[] aClass25Array1393;

  public Renderable() {
    this.anInt1394 = 1000;
  }

  @ObfuscatedSignature(
      descriptor = "(Z)LModel;",
      garbageValue = "0"
  )
  public Model getModel(boolean var1) {
    return null;
  }

  public void method495(int var1, int var2, int var3, int var4, int var5, int var6, int var7,
      int var8, int var9) {
    Model var10 = this.getModel(false);
    if (var10 != null) {
      this.anInt1394 = var10.anInt1394;
      var10.method495(var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

  }
}
