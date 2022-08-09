public class Player extends Character {

  public static Class33 aClass33_1761 = new Class33(260);
  public int anInt1743;
  public int anInt1744;
  public int anInt1745;
  public Model aClass50_Sub1_Sub4_Sub4_1746;
  public boolean aBoolean1747;
  public int anInt1748;
  public long aLong1749;
  public int anInt1750;
  public String name;
  public int[] anIntArray1752;
  public int combatLevel;
  public long aLong1754;
  public int anInt1755;
  public int anInt1756;
  public NpcDefinition aClass37_1757;
  public boolean aBoolean1758;
  public int anInt1759;
  public int[] anIntArray1760;
  public boolean aBoolean1762;
  public boolean aBoolean1763;
  public int anInt1764;
  public int anInt1765;
  public int anInt1766;
  public boolean aBoolean1767;
  public int anInt1768;
  public int anInt1769;
  public int anInt1770;
  public int anInt1771;
  public int anInt1772;
  public Player() {
    aBoolean1747 = false;
    anInt1748 = -1;
    aLong1749 = -1L;
    anIntArray1752 = new int[12];
    anInt1756 = -1;
    aBoolean1758 = false;
    anIntArray1760 = new int[5];
    aBoolean1762 = true;
    aBoolean1763 = false;
    aBoolean1767 = false;
    anInt1772 = 932;
  }

  public Model method570(boolean flag) {
    if (!aBoolean1758) {
      return null;
    }
    if (aClass37_1757 != null) {
      return aClass37_1757.method359(858);
    }
    boolean flag1 = false;
    for (int i = 0; i < 12; i++) {
      int j = anIntArray1752[i];
      if (j >= 256 && j < 512
          && !Class48.aClass48Array815[j - 256].method438(-10584)) {
        flag1 = true;
      }
      if (j >= 512
          && !ItemDefinition.getDefinition(j - 512).method211(anInt1755, 0)) {
        flag1 = true;
      }
    }

    if (flag1) {
      return null;
    }
    Model[] aclass50_sub1_sub4_sub4 = new Model[12];
    int k = 0;
    for (int l = 0; l < 12; l++) {
      int i1 = anIntArray1752[l];
      if (i1 >= 256 && i1 < 512) {
        Model class50_sub1_sub4_sub4_1 = Class48.aClass48Array815[i1 - 256]
            .method439(aBoolean1747);
        if (class50_sub1_sub4_sub4_1 != null) {
          aclass50_sub1_sub4_sub4[k++] = class50_sub1_sub4_sub4_1;
        }
      }
      if (i1 >= 512) {
        Model class50_sub1_sub4_sub4_2 = ItemDefinition.getDefinition(i1 - 512)
            .method219(true, anInt1755);
        if (class50_sub1_sub4_sub4_2 != null) {
          aclass50_sub1_sub4_sub4[k++] = class50_sub1_sub4_sub4_2;
        }
      }
    }

    Model class50_sub1_sub4_sub4 = new Model(k, aclass50_sub1_sub4_sub4,
        (byte) -89);
    if (!flag) {
      throw new NullPointerException();
    }
    for (int j1 = 0; j1 < 5; j1++) {
      if (anIntArray1760[j1] != 0) {
        class50_sub1_sub4_sub4.method591(
            Client.anIntArrayArray1008[j1][0],
            Client.anIntArrayArray1008[j1][anIntArray1760[j1]]);
        if (j1 == 1) {
          class50_sub1_sub4_sub4.method591(Client.anIntArray1268[0],
              Client.anIntArray1268[anIntArray1760[j1]]);
        }
      }
    }

    return class50_sub1_sub4_sub4;
  }

  public Model method571(byte byte0) {
    if (aClass37_1757 != null) {
      int i = -1;
      if (super.animation >= 0 && super.anInt1627 == 0) {
        i = AnimationSequence.animationSequences[super.animation].anIntArray295[super.anInt1625];
      } else if (super.anInt1588 >= 0) {
        i = AnimationSequence.animationSequences[super.anInt1588].anIntArray295[super.anInt1589];
      }
      Model class50_sub1_sub4_sub4 = aClass37_1757.method362(i, -1, 0,
          null);
      return class50_sub1_sub4_sub4;
    }
    long l = aLong1754;
    int j = -1;
    int k = -1;
    int i1 = -1;
    int j1 = -1;
    if (byte0 != 122) {
      aBoolean1767 = !aBoolean1767;
    }
    if (super.animation >= 0 && super.anInt1627 == 0) {
      AnimationSequence class14 = AnimationSequence.animationSequences[super.animation];
      j = class14.anIntArray295[super.anInt1625];
      if (super.anInt1588 >= 0 && super.anInt1588 != super.anInt1634) {
        k = AnimationSequence.animationSequences[super.anInt1588].anIntArray295[super.anInt1589];
      }
      if (class14.anInt302 >= 0) {
        i1 = class14.anInt302;
        l += (long) i1 - anIntArray1752[5] << 40;
      }
      if (class14.anInt303 >= 0) {
        j1 = class14.anInt303;
        l += (long) j1 - anIntArray1752[3] << 48;
      }
    } else if (super.anInt1588 >= 0) {
      j = AnimationSequence.animationSequences[super.anInt1588].anIntArray295[super.anInt1589];
    }
    Model class50_sub1_sub4_sub4_1 = (Model) aClass33_1761.method345(l);
    if (class50_sub1_sub4_sub4_1 == null) {
      boolean flag = false;
      for (int k1 = 0; k1 < 12; k1++) {
        int i2 = anIntArray1752[k1];
        if (j1 >= 0 && k1 == 3) {
          i2 = j1;
        }
        if (i1 >= 0 && k1 == 5) {
          i2 = i1;
        }
        if (i2 >= 256 && i2 < 512
            && !Class48.aClass48Array815[i2 - 256].method436(256)) {
          flag = true;
        }
        if (i2 >= 512
            && !ItemDefinition.getDefinition(i2 - 512).method216(-861,
            anInt1755)) {
          flag = true;
        }
      }

      if (flag) {
        if (aLong1749 != -1L) {
          class50_sub1_sub4_sub4_1 = (Model) aClass33_1761
              .method345(aLong1749);
        }
        if (class50_sub1_sub4_sub4_1 == null) {
          return null;
        }
      }
    }
    if (class50_sub1_sub4_sub4_1 == null) {
      Model[] aclass50_sub1_sub4_sub4 = new Model[12];
      int l1 = 0;
      for (int j2 = 0; j2 < 12; j2++) {
        int k2 = anIntArray1752[j2];
        if (j1 >= 0 && j2 == 3) {
          k2 = j1;
        }
        if (i1 >= 0 && j2 == 5) {
          k2 = i1;
        }
        if (k2 >= 256 && k2 < 512) {
          Model class50_sub1_sub4_sub4_3 = Class48.aClass48Array815[k2 - 256]
              .method437((byte) 2);
          if (class50_sub1_sub4_sub4_3 != null) {
            aclass50_sub1_sub4_sub4[l1++] = class50_sub1_sub4_sub4_3;
          }
        }
        if (k2 >= 512) {
          Model class50_sub1_sub4_sub4_4 = ItemDefinition.getDefinition(
              k2 - 512).method213((byte) -98, anInt1755);
          if (class50_sub1_sub4_sub4_4 != null) {
            aclass50_sub1_sub4_sub4[l1++] = class50_sub1_sub4_sub4_4;
          }
        }
      }

      class50_sub1_sub4_sub4_1 = new Model(l1, aclass50_sub1_sub4_sub4,
          (byte) -89);
      for (int l2 = 0; l2 < 5; l2++) {
        if (anIntArray1760[l2] != 0) {
          class50_sub1_sub4_sub4_1.method591(
              Client.anIntArrayArray1008[l2][0],
              Client.anIntArrayArray1008[l2][anIntArray1760[l2]]);
          if (l2 == 1) {
            class50_sub1_sub4_sub4_1.method591(
                Client.anIntArray1268[0],
                Client.anIntArray1268[anIntArray1760[l2]]);
          }
        }
      }

      class50_sub1_sub4_sub4_1.createBones();
      class50_sub1_sub4_sub4_1.lighten(64, 850, -30, -50, -30, true);
      aClass33_1761.method346(class50_sub1_sub4_sub4_1, l, 5);
      aLong1749 = l;
    }
    if (aBoolean1763) {
      return class50_sub1_sub4_sub4_1;
    }
    Model class50_sub1_sub4_sub4_2 = Model.aClass50_Sub1_Sub4_Sub4_1643;
    class50_sub1_sub4_sub4_2.method579(Animation.frameIsNull(j)
            & Animation.frameIsNull(k), class50_sub1_sub4_sub4_1,
        1244);
    if (j != -1 && k != -1) {
      class50_sub1_sub4_sub4_2
          .method586(
              k,
              0,
              j,
              AnimationSequence.animationSequences[super.animation].anIntArray299);
    } else if (j != -1) {
      class50_sub1_sub4_sub4_2.transform(j);
    }
    class50_sub1_sub4_sub4_2.method581(anInt1772);
    class50_sub1_sub4_sub4_2.anIntArrayArray1679 = null;
    class50_sub1_sub4_sub4_2.anIntArrayArray1678 = null;
    return class50_sub1_sub4_sub4_2;
  }

  @Override
  public boolean method565() {
    return aBoolean1758;
  }

  @Override
  public Model getRotatedModel() {
    if (!aBoolean1758) {
      return null;
    }
    Model class50_sub1_sub4_sub4 = method571((byte) 122);
    if (class50_sub1_sub4_sub4 == null) {
      return null;
    }
    super.anInt1594 = class50_sub1_sub4_sub4.modelHeight;
    class50_sub1_sub4_sub4.aBoolean1680 = true;
    if (aBoolean1763) {
      return class50_sub1_sub4_sub4;
    }
    if (super.anInt1614 != -1 && super.anInt1615 != -1) {
      SpotAnimation class27 = SpotAnimation.spotAnimations[super.anInt1614];
      Model class50_sub1_sub4_sub4_2 = class27.getModel();
      if (class50_sub1_sub4_sub4_2 != null) {
        Model class50_sub1_sub4_sub4_3 = new Model(false, false, true,
            class50_sub1_sub4_sub4_2, Animation.frameIsNull(
            super.anInt1615));
        class50_sub1_sub4_sub4_3.method590(0, 0, false,
            -super.anInt1618);
        class50_sub1_sub4_sub4_3.createBones();
        class50_sub1_sub4_sub4_3
            .transform(class27.aClass14_558.anIntArray295[super.anInt1615]);
        class50_sub1_sub4_sub4_3.anIntArrayArray1679 = null;
        class50_sub1_sub4_sub4_3.anIntArrayArray1678 = null;
        if (class27.anInt561 != 128 || class27.anInt562 != 128) {
          class50_sub1_sub4_sub4_3.scale(class27.anInt562,
              class27.anInt561, class27.anInt561);
        }
        class50_sub1_sub4_sub4_3.lighten(64 + class27.anInt564,
            850 + class27.anInt565, -30, -50, -30, true);
        Model[] aclass50_sub1_sub4_sub4_1 = {class50_sub1_sub4_sub4,
            class50_sub1_sub4_sub4_3};
        class50_sub1_sub4_sub4 = new Model(2, true, 0,
            aclass50_sub1_sub4_sub4_1);
      }
    }
    if (aClass50_Sub1_Sub4_Sub4_1746 != null) {
      if (Client.anInt1325 >= anInt1765) {
        aClass50_Sub1_Sub4_Sub4_1746 = null;
      }
      if (Client.anInt1325 >= anInt1764 && Client.anInt1325 < anInt1765) {
        Model class50_sub1_sub4_sub4_1 = aClass50_Sub1_Sub4_Sub4_1746;
        class50_sub1_sub4_sub4_1.method590(anInt1743 - super.anInt1610,
            anInt1745 - super.anInt1611, false, anInt1744
                - anInt1750);
        if (super.anInt1584 == 512) {
          class50_sub1_sub4_sub4_1.rotate90Degrees();
          class50_sub1_sub4_sub4_1.rotate90Degrees();
          class50_sub1_sub4_sub4_1.rotate90Degrees();
        } else if (super.anInt1584 == 1024) {
          class50_sub1_sub4_sub4_1.rotate90Degrees();
          class50_sub1_sub4_sub4_1.rotate90Degrees();
        } else if (super.anInt1584 == 1536) {
          class50_sub1_sub4_sub4_1.rotate90Degrees();
        }
        Model[] aclass50_sub1_sub4_sub4 = {class50_sub1_sub4_sub4,
            class50_sub1_sub4_sub4_1};
        class50_sub1_sub4_sub4 = new Model(2, true, 0,
            aclass50_sub1_sub4_sub4);
        if (super.anInt1584 == 512) {
          class50_sub1_sub4_sub4_1.rotate90Degrees();
        } else if (super.anInt1584 == 1024) {
          class50_sub1_sub4_sub4_1.rotate90Degrees();
          class50_sub1_sub4_sub4_1.rotate90Degrees();
        } else if (super.anInt1584 == 1536) {
          class50_sub1_sub4_sub4_1.rotate90Degrees();
          class50_sub1_sub4_sub4_1.rotate90Degrees();
          class50_sub1_sub4_sub4_1.rotate90Degrees();
        }
        class50_sub1_sub4_sub4_1.method590(super.anInt1610 - anInt1743,
            super.anInt1611 - anInt1745, false, anInt1750
                - anInt1744);
      }
    }
    class50_sub1_sub4_sub4.aBoolean1680 = true;
    return class50_sub1_sub4_sub4;
  }

  public void method572(Buffer class50_sub1_sub2, int i) {
    class50_sub1_sub2.offset = 0;
    anInt1755 = class50_sub1_sub2.readUByte();
    anInt1756 = class50_sub1_sub2.readByte();
    anInt1748 = class50_sub1_sub2.readByte();
    aClass37_1757 = null;
    anInt1766 = 0;
    for (int j = 0; j < 12; j++) {
      int k = class50_sub1_sub2.readUByte();
      if (k == 0) {
        anIntArray1752[j] = 0;
        continue;
      }
      int i1 = class50_sub1_sub2.readUByte();
      anIntArray1752[j] = (k << 8) + i1;
      if (j == 0 && anIntArray1752[0] == 65535) {
        aClass37_1757 = NpcDefinition.method364(class50_sub1_sub2
            .readUShort());
        break;
      }
      if (anIntArray1752[j] >= 512
          && anIntArray1752[j] - 512 < ItemDefinition.anInt335) {
        int l1 = ItemDefinition.getDefinition(anIntArray1752[j] - 512).anInt332;
        if (l1 != 0) {
          anInt1766 = l1;
        }
      }
    }

    for (int l = 0; l < 5; l++) {
      int j1 = class50_sub1_sub2.readUByte();
      if (j1 < 0 || j1 >= Client.anIntArrayArray1008[l].length) {
        j1 = 0;
      }
      anIntArray1760[l] = j1;
    }

    super.anInt1634 = class50_sub1_sub2.readUShort();
    if (super.anInt1634 == 65535) {
      super.anInt1634 = -1;
    }
    super.anInt1635 = class50_sub1_sub2.readUShort();
    if (super.anInt1635 == 65535) {
      super.anInt1635 = -1;
    }
    super.anInt1619 = class50_sub1_sub2.readUShort();
    if (super.anInt1619 == 65535) {
      super.anInt1619 = -1;
    }
    super.anInt1620 = class50_sub1_sub2.readUShort();
    if (super.anInt1620 == 65535) {
      super.anInt1620 = -1;
    }
    super.anInt1621 = class50_sub1_sub2.readUShort();
    if (super.anInt1621 == 65535) {
      super.anInt1621 = -1;
    }
    super.anInt1622 = class50_sub1_sub2.readUShort();
    if (super.anInt1622 == 65535) {
      super.anInt1622 = -1;
    }
    super.anInt1629 = class50_sub1_sub2.readUShort();
    if (super.anInt1629 == 65535) {
      super.anInt1629 = -1;
    }
    name = TextUtils.method303(
        TextUtils.decodeBase37(class50_sub1_sub2.readLong()));
    combatLevel = class50_sub1_sub2.readUByte();
    anInt1759 = class50_sub1_sub2.readUShort();
    aBoolean1758 = true;
    aLong1754 = 0L;
    int k1 = anIntArray1752[5];
    int i2 = anIntArray1752[9];
    if (i != 0) {
      return;
    }
    anIntArray1752[5] = i2;
    anIntArray1752[9] = k1;
    for (int j2 = 0; j2 < 12; j2++) {
      aLong1754 <<= 4;
      if (anIntArray1752[j2] >= 256) {
        aLong1754 += anIntArray1752[j2] - 256;
      }
    }

    if (anIntArray1752[0] >= 256) {
      aLong1754 += anIntArray1752[0] - 256 >> 4;
    }
    if (anIntArray1752[1] >= 256) {
      aLong1754 += anIntArray1752[1] - 256 >> 8;
    }
    anIntArray1752[5] = k1;
    anIntArray1752[9] = i2;
    for (int k2 = 0; k2 < 5; k2++) {
      aLong1754 <<= 3;
      aLong1754 += anIntArray1760[k2];
    }

    aLong1754 <<= 1;
    aLong1754 += anInt1755;
  }

}
