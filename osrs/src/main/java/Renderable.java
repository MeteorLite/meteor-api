public class Renderable extends CacheableNode {

  public VertexNormal[] aClass40Array1474;
  public int modelHeight;

  public Renderable() {
    modelHeight = 1000;
  }

  public void render(int i, int j, int k, int l, int i1, int j1, int k1,
      int l1, int i2) {
    Model model = getRotatedModel();
    if (model != null) {
      modelHeight = model.modelHeight;
      model.render(i, j, k, l, i1, j1, k1, l1, i2);
    }
  }

  public Model getRotatedModel() {
    return null;
  }

}