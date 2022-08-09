public class Item extends Renderable {

  public int id;
  public int anInt1551;
  public int stackSize;
  public Item() {
  }

  @Override
  public Model getRotatedModel() {
    ItemDefinition definition = ItemDefinition.getDefinition(id);
    return definition.method220(stackSize);
  }

}