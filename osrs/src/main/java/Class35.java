public class Class35 {

  public static boolean aBoolean578;
  public static Class35[] aClass35Array580;
  public static int anInt579;
  public int anInt582;
  public String aString581;
  public int anInt583;
  public int anInt584;

  static {
    aBoolean578 = true;
  }

  public void method276(Buffer var1, byte var2, int var3) {
    while (true) {
      int var4 = var1.readUByte();
      if (var4 == 0) {
        return;
      }

      if (var4 == 1) {
        this.anInt582 = var1.readUShort();
        this.anInt583 = var1.readUByte();
        this.anInt584 = var1.readUByte();
      } else if (var4 == 10) {
        this.aString581 = var1.readString();
      } else {
        System.out.println("Error unrecognised config code: " + var4);
      }
    }
  }

  public static void method275(boolean var0, Class47 var1) {
    Buffer var2 = new Buffer(var1.method546("varbit.dat", null), (byte) 1);
    anInt579 = var2.readUShort();
    if (aClass35Array580 == null) {
      aClass35Array580 = new Class35[anInt579];
    }

    for (int var3 = 0; var3 < anInt579; ++var3) {
      if (aClass35Array580[var3] == null) {
        aClass35Array580[var3] = new Class35();
      }

      aClass35Array580[var3].method276(var2, (byte) 6, var3);
    }

    if (var2.array.length != var2.offset) {
      System.out.println("varbit load mismatch");
    }

  }
}
