// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class SpotAnimation {

  public static byte aByte550 = 6;
  public static boolean aBoolean551 = true;
  public static int length;
  public static SpotAnimation[] spotAnimations;
  public static Class33 aClass33_566 = new Class33(30);
  public int anInt552;
  public int anInt555;
  public int anInt556;
  public int anInt557;
  public AnimationSequence aClass14_558;
  public int[] anIntArray559;
  public int[] anIntArray560;
  public int anInt561;
  public int anInt562;
  public int anInt563;
  public int anInt564;
  public int anInt565;
  public SpotAnimation() {
    anInt552 = -214;
    anInt557 = -1;
    anIntArray559 = new int[6];
    anIntArray560 = new int[6];
    anInt561 = 128;
    anInt562 = 128;
  }

  public static void method305(Archive archive, int i) {
    Buffer buffer = new Buffer(archive.extract("spotanim.dat"));
    length = buffer.readUShort();
    if (spotAnimations == null) {
      spotAnimations = new SpotAnimation[length];
    }
    for (int j = 0; j < length; j++) {
      if (spotAnimations[j] == null) {
        spotAnimations[j] = new SpotAnimation();
      }
      spotAnimations[j].anInt555 = j;
      spotAnimations[j].readValues(buffer);
    }

  }

  public void readValues(Buffer buffer) {
    do {
      int i = buffer.readUByte();
      if (i == 0) {
        return;
      }
      if (i == 1) {
        anInt556 = buffer.readUShort();
      } else if (i == 2) {
        anInt557 = buffer.readUShort();
        if (AnimationSequence.animationSequences != null) {
          aClass14_558 = AnimationSequence.animationSequences[anInt557];
        }
      } else if (i == 4) {
        anInt561 = buffer.readUShort();
      } else if (i == 5) {
        anInt562 = buffer.readUShort();
      } else if (i == 6) {
        anInt563 = buffer.readUShort();
      } else if (i == 7) {
        anInt564 = buffer.readUByte();
      } else if (i == 8) {
        anInt565 = buffer.readUByte();
      } else if (i >= 40 && i < 50) {
        anIntArray559[i - 40] = buffer.readUShort();
      } else if (i >= 50 && i < 60) {
        anIntArray560[i - 50] = buffer.readUShort();
      } else {
        System.out.println("Error unrecognised spotanim config code: "
            + i);
      }
    } while (true);
  }

  public Model getModel() {
    Model model = (Model) aClass33_566.method345(anInt555);
    if (model != null) {
      return model;
    }
    model = Model.method577(anInt556);
    if (model == null) {
      return null;
    }
    for (int i = 0; i < 6; i++) {
      if (anIntArray559[0] != 0) {
        model.method591(anIntArray559[i],
            anIntArray560[i]);
      }
    }

    aClass33_566.method346(model, anInt555, 5);
    return model;
  }

}
