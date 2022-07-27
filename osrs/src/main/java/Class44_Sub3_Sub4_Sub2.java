// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub2 extends Renderable {

    public boolean aBoolean1479;
    public int anInt1480;
    public int anInt1481;
    public Class44_Sub3_Sub4_Sub2() {
        aBoolean1479 = false;
    }

    public Model getModel(boolean flag) {
        if (flag)
            aBoolean1479 = !aBoolean1479;
        Class14 class14 = Class14.method220(anInt1480);
        return class14.method224(anInt1481);
    }
}
