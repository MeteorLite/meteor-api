// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44_Sub3_Sub4_Sub6_Sub1 extends Class44_Sub3_Sub4_Sub6 {

    public static Class39 aClass39_1680 = new Class39(260, 0);
    public int anInt1654;
    public int anInt1655;
    public int anInt1656;
    public String aString1657;
    public boolean aBoolean1658;
    public int anInt1659;
    public int anInt1660;
    public final int[] anIntArray1661;
    public final int[] anIntArray1662;
    public int anInt1663;
    public int anInt1664;
    public long aLong1665;
    public int anInt1666;
    public int anInt1667;
    public int anInt1668;
    public int anInt1669;
    public int anInt1670;
    public int anInt1671;
    public Model aModel_1672;
    public int anInt1673;
    public int anInt1674;
    public int anInt1675;
    public int anInt1676;
    public boolean aBoolean1677;
    public long aLong1678;
    public Class12 aClass12_1679;
    public Class44_Sub3_Sub4_Sub6_Sub1() {
        anInt1655 = -12792;
        anInt1656 = -582;
        aBoolean1658 = false;
        anIntArray1661 = new int[12];
        anIntArray1662 = new int[5];
        aBoolean1677 = false;
        aLong1678 = -1L;
    }

    public void method534(Class44_Sub3_Sub2 class44_sub3_sub2, int i) {
        class44_sub3_sub2.anInt1374 = 0;
        anInt1659 = class44_sub3_sub2.get1();
        anInt1660 = class44_sub3_sub2.get1();
        aClass12_1679 = null;
        for (int j = 0; j < 12; j++) {
            int k = class44_sub3_sub2.get1();
            if (k == 0) {
                anIntArray1661[j] = 0;
                continue;
            }
            int i1 = class44_sub3_sub2.get1();
            anIntArray1661[j] = (k << 8) + i1;
            if (j != 0 || anIntArray1661[0] != 65535)
                continue;
            aClass12_1679 = Class12.method214(class44_sub3_sub2.get2());
            break;
        }

        i = 2 / i;
        for (int l = 0; l < 5; l++) {
            int j1 = class44_sub3_sub2.get1();
            if (j1 < 0 || j1 >= Client.anIntArrayArray1241[l].length)
                j1 = 0;
            anIntArray1662[l] = j1;
        }

        super.anInt1604 = class44_sub3_sub2.get2();
        if (super.anInt1604 == 65535)
            super.anInt1604 = -1;
        super.anInt1605 = class44_sub3_sub2.get2();
        if (super.anInt1605 == 65535)
            super.anInt1605 = -1;
        super.anInt1606 = class44_sub3_sub2.get2();
        if (super.anInt1606 == 65535)
            super.anInt1606 = -1;
        super.anInt1607 = class44_sub3_sub2.get2();
        if (super.anInt1607 == 65535)
            super.anInt1607 = -1;
        super.anInt1608 = class44_sub3_sub2.get2();
        if (super.anInt1608 == 65535)
            super.anInt1608 = -1;
        super.anInt1609 = class44_sub3_sub2.get2();
        if (super.anInt1609 == 65535)
            super.anInt1609 = -1;
        super.anInt1610 = class44_sub3_sub2.get2();
        if (super.anInt1610 == 65535)
            super.anInt1610 = -1;
        aString1657 = Class48.method551(131, Class48.method548(0, class44_sub3_sub2.get8(0)));
        anInt1663 = class44_sub3_sub2.get1();
        anInt1664 = class44_sub3_sub2.get2();
        aBoolean1658 = true;
        aLong1665 = 0L;
        for (int k1 = 0; k1 < 12; k1++) {
            aLong1665 <<= 4;
            if (anIntArray1661[k1] >= 256)
                aLong1665 += anIntArray1661[k1] - 256;
        }

        if (anIntArray1661[0] >= 256)
            aLong1665 += anIntArray1661[0] - 256 >> 4;
        if (anIntArray1661[1] >= 256)
            aLong1665 += anIntArray1661[1] - 256 >> 8;
        for (int l1 = 0; l1 < 5; l1++) {
            aLong1665 <<= 3;
            aLong1665 += anIntArray1662[l1];
        }

        aLong1665 <<= 1;
        aLong1665 += anInt1659;
    }

    public Model getModel(boolean flag) {
        if (!aBoolean1658)
            return null;
        Model model = method535(true);
        if (model == null)
            return null;
        super.anInt1645 = model.anInt1394;
        if (flag)
            anInt1655 = -399;
        model.aBoolean1555 = true;
        if (aBoolean1677)
            return model;
        if (super.anInt1632 != -1 && super.anInt1633 != -1) {
            Class32 class32 = Class32.aClass32Array547[super.anInt1632];
            Model model_2 = class32.method271();
            if (model_2 != null) {
                Model class44_sub3_sub4_sub4_3 = new Model(true, Class11.method211(super.anInt1633, 0), model_2, true, false);
                class44_sub3_sub4_sub4_3.method516(0, -super.anInt1636, (byte) 10, 0);
                class44_sub3_sub4_sub4_3.method510(9);
                class44_sub3_sub4_sub4_3.method511(class32.aClass26_551.primaryFrames[super.anInt1633], -284);
                class44_sub3_sub4_sub4_3.anIntArrayArray1554 = null;
                class44_sub3_sub4_sub4_3.anIntArrayArray1553 = null;
                if (class32.anInt554 != 128 || class32.anInt555 != 128)
                    class44_sub3_sub4_sub4_3.method519(9, class32.anInt554, class32.anInt554, class32.anInt555);
                class44_sub3_sub4_sub4_3.method520(64 + class32.anInt557, 850 + class32.anInt558, -30, -50, -30, true);
                Model[] aclass44_sub3_sub4_sub4_1 = {
                        model, class44_sub3_sub4_sub4_3
                };
                model = new Model(true, (byte) 72, aclass44_sub3_sub4_sub4_1, 2);
            }
        }
        if (aModel_1672 != null) {
            if (Client.tick >= anInt1668)
                aModel_1672 = null;
            if (Client.tick >= anInt1667 && Client.tick < anInt1668) {
                Model model_1 = aModel_1672;
                model_1.method516(anInt1669 - super.anInt1599, anInt1670 - anInt1666, (byte) 10, anInt1671 - super.anInt1600);
                if (super.anInt1646 == 512) {
                    model_1.method514((byte) 89);
                    model_1.method514((byte) 89);
                    model_1.method514((byte) 89);
                } else if (super.anInt1646 == 1024) {
                    model_1.method514((byte) 89);
                    model_1.method514((byte) 89);
                } else if (super.anInt1646 == 1536)
                    model_1.method514((byte) 89);
                Model[] aclass44_sub3_sub4_sub4 = {
                        model, model_1
                };
                model = new Model(true, (byte) 72, aclass44_sub3_sub4_sub4, 2);
                if (super.anInt1646 == 512)
                    model_1.method514((byte) 89);
                else if (super.anInt1646 == 1024) {
                    model_1.method514((byte) 89);
                    model_1.method514((byte) 89);
                } else if (super.anInt1646 == 1536) {
                    model_1.method514((byte) 89);
                    model_1.method514((byte) 89);
                    model_1.method514((byte) 89);
                }
                model_1.method516(super.anInt1599 - anInt1669, anInt1666 - anInt1670, (byte) 10, super.anInt1600 - anInt1671);
            }
        }
        model.aBoolean1555 = true;
        return model;
    }

    public Model method535(boolean flag) {
        if (!flag) {
            for (int i = 1; i > 0; i++) ;
        }
        if (aClass12_1679 != null) {
            int j = -1;
            if (super.anInt1627 >= 0 && super.anInt1630 == 0)
                j = Class26.aClass26Array497[super.anInt1627].primaryFrames[super.anInt1628];
            else if (super.anInt1624 >= 0)
                j = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
            Model model = aClass12_1679.method216(j, -1, 811, null);
            return model;
        }
        long l = aLong1665;
        int k = -1;
        int i1 = -1;
        int j1 = -1;
        int k1 = -1;
        if (super.anInt1627 >= 0 && super.anInt1630 == 0) {
            Class26 class26 = Class26.aClass26Array497[super.anInt1627];
            k = class26.primaryFrames[super.anInt1628];
            if (super.anInt1624 >= 0 && super.anInt1624 != super.anInt1604)
                i1 = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
            if (class26.anInt506 >= 0) {
                j1 = class26.anInt506;
                l += j1 - anIntArray1661[5] << 40;
            }
            if (class26.anInt507 >= 0) {
                k1 = class26.anInt507;
                l += k1 - anIntArray1661[3] << 48;
            }
        } else if (super.anInt1624 >= 0)
            k = Class26.aClass26Array497[super.anInt1624].primaryFrames[super.anInt1625];
        Model model_1 = (Model) aClass39_1680.method339(l);
        if (model_1 == null) {
            boolean flag1 = false;
            for (int l1 = 0; l1 < 12; l1++) {
                int j2 = anIntArray1661[l1];
                if (k1 >= 0 && l1 == 3)
                    j2 = k1;
                if (j1 >= 0 && l1 == 5)
                    j2 = j1;
                if (j2 >= 256 && j2 < 512 && !Class22.aClass22Array455[j2 - 256].method249(3))
                    flag1 = true;
                if (j2 >= 512 && !Class14.method220(j2 - 512).method227(anInt1659, 0))
                    flag1 = true;
            }

            if (flag1) {
                if (aLong1678 != -1L)
                    model_1 = (Model) aClass39_1680.method339(aLong1678);
                if (model_1 == null)
                    return null;
            }
        }
        if (model_1 == null) {
            Model[] aclass44_sub3_sub4_sub4 = new Model[12];
            int i2 = 0;
            for (int k2 = 0; k2 < 12; k2++) {
                int l2 = anIntArray1661[k2];
                if (k1 >= 0 && k2 == 3)
                    l2 = k1;
                if (j1 >= 0 && k2 == 5)
                    l2 = j1;
                if (l2 >= 256 && l2 < 512) {
                    Model class44_sub3_sub4_sub4_3 = Class22.aClass22Array455[l2 - 256].method250((byte) 0);
                    if (class44_sub3_sub4_sub4_3 != null)
                        aclass44_sub3_sub4_sub4[i2++] = class44_sub3_sub4_sub4_3;
                }
                if (l2 >= 512) {
                    Model class44_sub3_sub4_sub4_4 = Class14.method220(l2 - 512).method228(-269, anInt1659);
                    if (class44_sub3_sub4_sub4_4 != null)
                        aclass44_sub3_sub4_sub4[i2++] = class44_sub3_sub4_sub4_4;
                }
            }

            model_1 = new Model(i2, -643, aclass44_sub3_sub4_sub4);
            for (int i3 = 0; i3 < 5; i3++)
                if (anIntArray1662[i3] != 0) {
                    model_1.method517(Client.anIntArrayArray1241[i3][0], Client.anIntArrayArray1241[i3][anIntArray1662[i3]]);
                    if (i3 == 1)
                        model_1.method517(Client.anIntArray1134[0], Client.anIntArray1134[anIntArray1662[i3]]);
                }

            model_1.method510(9);
            model_1.method520(64, 850, -30, -50, -30, true);
            aClass39_1680.method340(201, l, model_1);
            aLong1678 = l;
        }
        if (aBoolean1677)
            return model_1;
        Model model_2 = Model.A_MODEL___1517;
        model_2.method505(0, model_1, Class11.method211(k, 0) & Class11.method211(i1, 0));
        if (k != -1 && i1 != -1)
            model_2.method512(-32031, Class26.aClass26Array497[super.anInt1627].anIntArray503, k, i1);
        else if (k != -1)
            model_2.method511(k, -284);
        model_2.method507(486);
        model_2.anIntArrayArray1554 = null;
        model_2.anIntArrayArray1553 = null;
        return model_2;
    }

    public Model method536(boolean flag) {
        if (!aBoolean1658)
            return null;
        boolean flag1 = false;
        for (int i = 0; i < 12; i++) {
            int j = anIntArray1661[i];
            if (j >= 256 && j < 512 && !Class22.aClass22Array455[j - 256].method251(0))
                flag1 = true;
            if (j >= 512 && !Class14.method220(j - 512).method229(anInt1659, (byte) 1))
                flag1 = true;
        }

        if (flag1)
            return null;
        Model[] aclass44_sub3_sub4_sub4 = new Model[12];
        int k = 0;
        for (int l = 0; l < 12; l++) {
            int i1 = anIntArray1661[l];
            if (i1 >= 256 && i1 < 512) {
                Model model_1 = Class22.aClass22Array455[i1 - 256].method252((byte) 7);
                if (model_1 != null)
                    aclass44_sub3_sub4_sub4[k++] = model_1;
            }
            if (i1 >= 512) {
                Model model_2 = Class14.method220(i1 - 512).method230(false, anInt1659);
                if (model_2 != null)
                    aclass44_sub3_sub4_sub4[k++] = model_2;
            }
        }

        Model model = new Model(k, -643, aclass44_sub3_sub4_sub4);
        for (int j1 = 0; j1 < 5; j1++)
            if (anIntArray1662[j1] != 0) {
                model.method517(Client.anIntArrayArray1241[j1][0], Client.anIntArrayArray1241[j1][anIntArray1662[j1]]);
                if (j1 == 1)
                    model.method517(Client.anIntArray1134[0], Client.anIntArray1134[anIntArray1662[j1]]);
            }

        if (!flag)
            anInt1656 = -127;
        return model;
    }

    public boolean method532(int i) {
        if (i != 0)
            anInt1654 = -56;
        return aBoolean1658;
    }

}
