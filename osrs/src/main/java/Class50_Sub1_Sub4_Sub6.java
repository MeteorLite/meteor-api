public class Class50_Sub1_Sub4_Sub6 extends Renderable {

  public int anInt1731;
  public int anInt1732;
  public int anInt1733;
  public int anInt1734;
  public boolean aBoolean1735;
  public boolean aBoolean1736;
  public int anInt1737;
  public int anInt1738;
  public SpotAnimation spotAnimation;
  public int anInt1740;
  public Class50_Sub1_Sub4_Sub6(int i, int j, int k, int l, int i1, int j1,
      int k1) {
    aBoolean1735 = true;
    aBoolean1736 = false;
    spotAnimation = SpotAnimation.spotAnimations[i1];
    anInt1731 = j;
    anInt1732 = i;
    anInt1733 = k1;
    anInt1734 = k;
    anInt1740 = j1 + l;
    aBoolean1736 = false;
  }

  public void method604(int i) {
    anInt1738 += i;
    while (anInt1738 > spotAnimation.aClass14_558.method205(0, anInt1737)) {
      anInt1738 -= spotAnimation.aClass14_558.method205(0, anInt1737);
      anInt1737++;
      if (anInt1737 >= spotAnimation.aClass14_558.anInt294
          && (anInt1737 < 0 || anInt1737 >= spotAnimation.aClass14_558.anInt294)) {
        anInt1737 = 0;
        aBoolean1736 = true;
      }
    }
  }

  @Override
  public Model getRotatedModel() {
    Model spotAnimationModel = spotAnimation.getModel();
    if (spotAnimationModel == null) {
      return null;
    }
    int i = spotAnimation.aClass14_558.anIntArray295[anInt1737];
    Model model = new Model(false, false, true, spotAnimationModel,
        Animation.frameIsNull(i));
    if (!aBoolean1736) {
      model.createBones();
      model.transform(i);
      model.anIntArrayArray1679 = null;
      model.anIntArrayArray1678 = null;
    }
    if (spotAnimation.anInt561 != 128 || spotAnimation.anInt562 != 128) {
      model.scale(spotAnimation.anInt562, spotAnimation.anInt561,
          spotAnimation.anInt561);
    }
    if (spotAnimation.anInt563 != 0) {
      if (spotAnimation.anInt563 == 90) {
        model.rotate90Degrees();
      }
      if (spotAnimation.anInt563 == 180) {
        model.rotate90Degrees();
        model.rotate90Degrees();
      }
      if (spotAnimation.anInt563 == 270) {
        model.rotate90Degrees();
        model.rotate90Degrees();
        model.rotate90Degrees();
      }
    }
    model.lighten(64 + spotAnimation.anInt564,
        850 + spotAnimation.anInt565, -30, -50, -30, true);
    return model;
  }
}
