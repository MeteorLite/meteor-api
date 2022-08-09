public class Npc extends Character {

  public boolean aBoolean1741;
  public NpcDefinition definition;

  public Npc() {
    aBoolean1741 = true;
  }

  public Model method569() {
    if (super.animation >= 0 && super.anInt1627 == 0) {
      int i = AnimationSequence.animationSequences[super.animation].anIntArray295[super.anInt1625];
      int k = -1;
      if (super.anInt1588 >= 0 && super.anInt1588 != super.anInt1634) {
        k = AnimationSequence.animationSequences[super.anInt1588].anIntArray295[super.anInt1589];
      }
      return definition.method362(i, k, 0,
          AnimationSequence.animationSequences[super.animation].anIntArray299);
    }
    int j = -1;
    if (super.anInt1588 >= 0) {
      j = AnimationSequence.animationSequences[super.anInt1588].anIntArray295[super.anInt1589];
    }
    return definition.method362(j, -1, 0, null);
  }

  @Override
  public Model getRotatedModel() {
    if (definition == null) {
      return null;
    }
    Model class50_sub1_sub4_sub4 = method569();
    if (class50_sub1_sub4_sub4 == null) {
      return null;
    }
    super.anInt1594 = class50_sub1_sub4_sub4.modelHeight;
    if (super.anInt1614 != -1 && super.anInt1615 != -1) {
      SpotAnimation class27 = SpotAnimation.spotAnimations[super.anInt1614];
      Model class50_sub1_sub4_sub4_1 = class27
          .getModel();
      if (class50_sub1_sub4_sub4_1 != null) {
        int i = class27.aClass14_558.anIntArray295[super.anInt1615];
        Model class50_sub1_sub4_sub4_2 = new Model(
            false, false, true, class50_sub1_sub4_sub4_1,
            Animation.frameIsNull(i));
        class50_sub1_sub4_sub4_2.method590(0, 0, false,
            -super.anInt1618);
        class50_sub1_sub4_sub4_2.createBones();
        class50_sub1_sub4_sub4_2.transform(i);
        class50_sub1_sub4_sub4_2.anIntArrayArray1679 = null;
        class50_sub1_sub4_sub4_2.anIntArrayArray1678 = null;
        if (class27.anInt561 != 128 || class27.anInt562 != 128) {
          class50_sub1_sub4_sub4_2.scale(class27.anInt562,
              class27.anInt561, class27.anInt561);
        }
        class50_sub1_sub4_sub4_2.lighten(64 + class27.anInt564,
            850 + class27.anInt565, -30, -50, -30, true);
        Model[] aclass50_sub1_sub4_sub4 = {
            class50_sub1_sub4_sub4, class50_sub1_sub4_sub4_2};
        class50_sub1_sub4_sub4 = new Model(2, true, 0,
            aclass50_sub1_sub4_sub4);
      }
    }
    if (definition.aByte642 == 1) {
      class50_sub1_sub4_sub4.aBoolean1680 = true;
    }
    return class50_sub1_sub4_sub4;
  }

  @Override
  public boolean method565() {
    return definition != null;
  }

}