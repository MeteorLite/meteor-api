public class Class50_Sub1_Sub4_Sub5 extends Renderable {

  public static Client aClient1723;
  public boolean aBoolean1714;
  public int anInt1715;
  public int anInt1716;
  public int anInt1717;
  public int anInt1718;
  public int anInt1719;
  public int anInt1720;
  public int anInt1721;
  public int anInt1722;
  public AnimationSequence aClass14_1724;
  public int anInt1725;
  public int anInt1726;
  public int[] anIntArray1727;
  public int anInt1728;
  public int anInt1729;
  public int anInt1730;
  public Class50_Sub1_Sub4_Sub5(int i, int j, int k, int l, int i1,
      int j1, boolean flag, int k1, int l1) {
    aBoolean1714 = false;
    anInt1720 = j1;
    anInt1721 = i1;
    anInt1722 = l1;
    anInt1715 = k1;
    anInt1716 = l;
    anInt1717 = j;
    anInt1718 = k;
    if (i != -1) {
      aClass14_1724 = AnimationSequence.animationSequences[i];
      anInt1730 = 0;
      anInt1729 = Client.anInt1325 - 1;
      if (flag && aClass14_1724.anInt298 != -1) {
        anInt1730 = (int) (Math.random() * (double) aClass14_1724.anInt294);
        anInt1729 -= (int) (Math.random() * (double) aClass14_1724
            .method205(0, anInt1730));
      }
    }
    GameObjectDefinition class47 = GameObjectDefinition.forId(anInt1720);
    anInt1725 = class47.anInt778;
    anInt1726 = class47.anInt781;
    anIntArray1727 = class47.anIntArray805;
  }

  public GameObjectDefinition method603() {
    int j = -1;
    if (anInt1725 != -1) {
      VarBit varbit = VarBit.varbits[anInt1725];
      int k = varbit.anInt826;
      int l = varbit.anInt827;
      int i1 = varbit.anInt828;
      int j1 = Client.anIntArray1214[i1 - l];
      j = aClient1723.anIntArray1039[k] >> l & j1;
    } else if (anInt1726 != -1) {
      j = aClient1723.anIntArray1039[anInt1726];
    }
    if (j < 0 || j >= anIntArray1727.length || anIntArray1727[j] == -1) {
      return null;
    } else {
      return GameObjectDefinition.forId(anIntArray1727[j]);
    }
  }

  @Override
  public Model getRotatedModel() {
    int i = -1;
    if (aClass14_1724 != null) {
      int j = Client.anInt1325 - anInt1729;
      if (j > 100 && aClass14_1724.anInt298 > 0) {
        j = 100;
      }
      while (j > aClass14_1724.method205(0, anInt1730)) {
        j -= aClass14_1724.method205(0, anInt1730);
        anInt1730++;
        if (anInt1730 < aClass14_1724.anInt294) {
          continue;
        }
        anInt1730 -= aClass14_1724.anInt298;
        if (anInt1730 >= 0 && anInt1730 < aClass14_1724.anInt294) {
          continue;
        }
        aClass14_1724 = null;
        break;
      }
      anInt1729 = Client.anInt1325 - j;
      if (aClass14_1724 != null) {
        i = aClass14_1724.anIntArray295[anInt1730];
      }
    }
    GameObjectDefinition definition;
    if (anIntArray1727 != null) {
      definition = method603();
    } else {
      definition = GameObjectDefinition.forId(anInt1720);
    }
    if (definition == null) {
      return null;
    } else {
      Model class50_sub1_sub4_sub4 = definition.method431(anInt1721,
          anInt1722, anInt1715, anInt1716, anInt1717, anInt1718, i);
      return class50_sub1_sub4_sub4;
    }
  }
}
