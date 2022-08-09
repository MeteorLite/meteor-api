public class Class29 {

  public static int anInt585;
  public boolean aBoolean573;
  public int anInt574;
  public int[] anIntArray575;
  public int[] anIntArray576;
  public int anInt577;
  public int anInt578;
  public int anInt579;
  public int anInt580;
  public int anInt581;
  public int anInt582;
  public int anInt583;
  public int anInt584;
  public Class29() {
    aBoolean573 = true;
  }

  public void method308(Buffer buffer) {
    anInt579 = buffer.readUByte();
    anInt577 = buffer.readInt();
    anInt578 = buffer.readInt();
    method309(buffer);
  }

  public void method309(Buffer buffer) {
    anInt574 = buffer.readUByte();
    anIntArray575 = new int[anInt574];
    anIntArray576 = new int[anInt574];
    for (int j = 0; j < anInt574; j++) {
      anIntArray575[j] = buffer.readUShort();
      anIntArray576[j] = buffer.readUShort();
    }

  }

  public void method310(boolean flag) {
    anInt580 = 0;
    anInt581 = 0;
    if (!flag) {
    } else {
      anInt582 = 0;
      anInt583 = 0;
      anInt584 = 0;
    }
  }

  public int method311(int j) {
    if (anInt584 >= anInt580) {
      anInt583 = anIntArray576[anInt581++] << 15;
      if (anInt581 >= anInt574) {
        anInt581 = anInt574 - 1;
      }
      anInt580 = (int) ((double) anIntArray575[anInt581] / 65536D * (double) j);
      if (anInt580 > anInt584) {
        anInt582 = ((anIntArray576[anInt581] << 15) - anInt583)
            / (anInt580 - anInt584);
      }
    }
    anInt583 += anInt582;
    anInt584++;
    return anInt583 - anInt582 >> 15;
  }
}
