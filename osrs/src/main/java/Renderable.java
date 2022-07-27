// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Renderable extends Class44_Sub3 {

    public static boolean aBoolean1395;
    public int anInt1392;
    public Class25[] aClass25Array1393;
    public int anInt1394;
    public Renderable() {
        anInt1394 = 1000;
    }

    public void method495(int i, int j, int k, int l, int i1, int j1, int k1,
                          int l1, int i2) {
        Model model = getModel(false);
        if (model != null) {
            anInt1394 = model.anInt1394;
            model.method495(i, j, k, l, i1, j1, k1, l1, i2);
        }
    }

    public Model getModel(boolean flag) {
        if (flag)
            anInt1392 = -394;
        return null;
    }
}
