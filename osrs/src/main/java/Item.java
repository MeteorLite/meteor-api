public class Item extends Renderable {
	public int itemId;
	public int itemCount;

	@Override
	public Model getRotatedModel() {
		ItemDefinition itemDefinition = ItemDefinition.lookup(itemId);
		return itemDefinition.asGroundStack(itemCount);
	}

}
