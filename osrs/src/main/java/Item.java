import net.runelite.mapping.ObfuscatedSignature;

public class Item extends Renderable {

  public int id;
  public boolean aBoolean1479;
  public int quantity;

  public Item() {
    this.aBoolean1479 = false;
  }

  @ObfuscatedSignature(
      descriptor = "(Z)LModel;",
      garbageValue = "0"
  )
  public Model getModel(boolean var1) {
    ItemDefinition definition = ItemDefinition.get(this.id);
    return definition.getModel(this.quantity);
  }
}
