// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub5 extends Renderable {

    public final Class32 aClass32_1589;
    public int anInt1590;
    public int anInt1591;
    public int anInt1592;
    public int anInt1593;
    public int anInt1594;
    public int anInt1595;
    public int anInt1596;
    public boolean aBoolean1597;
    public Class44_Sub3_Sub4_Sub5(int i, int j, int k, int l, int i1, int j1, int k1,
                                  int l1) {
        aBoolean1597 = false;
        aClass32_1589 = Class32.aClass32Array547[k1];
        if (i1 != 0) {
            throw new NullPointerException();
        } else {
            anInt1591 = l;
            anInt1592 = k;
            anInt1593 = j;
            anInt1594 = j1;
            anInt1590 = l1 + i;
            aBoolean1597 = false;
        }
    }

    public void method528(int i, int j) {
        anInt1596 += j;
        if (i != 0)
            return;
        while (anInt1596 > aClass32_1589.aClass26_551.getFrameLength(anInt1595, 41645)) {
            anInt1596 -= aClass32_1589.aClass26_551.getFrameLength(anInt1595, 41645) + 1;
            anInt1595++;
            if (anInt1595 >= aClass32_1589.aClass26_551.anInt498 && (anInt1595 < 0 || anInt1595 >= aClass32_1589.aClass26_551.anInt498)) {
                anInt1595 = 0;
                aBoolean1597 = true;
            }
        }
    }

    public Model getModel(boolean flag) {
        Model model = aClass32_1589.method271();
        if (flag)
            throw new NullPointerException();
        if (model == null)
            return null;
        int i = aClass32_1589.aClass26_551.primaryFrames[anInt1595];
        Model model_1 = new Model(true, Class11.method211(i, 0), model, true, false);
        if (!aBoolean1597) {
            model_1.method510(9);
            model_1.method511(i, -284);
            model_1.anIntArrayArray1554 = null;
            model_1.anIntArrayArray1553 = null;
        }
        if (aClass32_1589.anInt554 != 128 || aClass32_1589.anInt555 != 128)
            model_1.method519(9, aClass32_1589.anInt554, aClass32_1589.anInt554, aClass32_1589.anInt555);
        if (aClass32_1589.anInt556 != 0) {
            if (aClass32_1589.anInt556 == 90)
                model_1.method514((byte) 89);
            if (aClass32_1589.anInt556 == 180) {
                model_1.method514((byte) 89);
                model_1.method514((byte) 89);
            }
            if (aClass32_1589.anInt556 == 270) {
                model_1.method514((byte) 89);
                model_1.method514((byte) 89);
                model_1.method514((byte) 89);
            }
        }
        model_1.method520(64 + aClass32_1589.anInt557, 850 + aClass32_1589.anInt558, -30, -50, -30, true);
        return model_1;
    }
}
