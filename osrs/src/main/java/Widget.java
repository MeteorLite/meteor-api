public class Widget {

  public static int anInt210;
  public static Archive aClass2_214;
  public static Widget[] widgets;
  public static Class50_Sub1_Sub1_Sub2[] aClass50_Sub1_Sub1_Sub2Array223;
  public static int anInt243;
  public static int anInt246 = -1;
  public static Class33 aClass33_250;
  public static int anInt255 = -1;
  public static boolean aBoolean257;
  public static Class33 aClass33_264 = new Class33(30);
  public static int anInt275 = -291;
  public static int anInt277 = -1;
  public static boolean aBoolean278 = true;
  public static int anInt279 = 373;
  public static int anInt280;
  public static byte[][] aByteArrayArray282;
  public String aString211;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_212;
  public int[] anIntArray213;
  public int anInt215;
  public boolean aBoolean217;
  public int anInt218;
  public boolean aBoolean219;
  public byte aByte220;
  public int[] anIntArray221;
  public int anInt222;
  public int[] anIntArray224;
  public int anInt225;
  public int anInt226;
  public int anInt227;
  public int anInt228;
  public boolean aBoolean229;
  public String aString230;
  public int anInt231;
  public int[] anIntArray232;
  public boolean aBoolean233;
  public int[][] anIntArrayArray234;
  public int anInt235;
  public int anInt236;
  public Class50_Sub1_Sub1_Sub2 aClass50_Sub1_Sub1_Sub2_237;
  public int anInt238;
  public boolean aBoolean239;
  public int anInt240;
  public int anInt241;
  public int anInt242;
  public int anInt244;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_245;
  public boolean aBoolean247;
  public int anInt248;
  public String aString249;
  public int anInt251;
  public int anInt252;
  public int anInt253;
  public int anInt254;
  public int[] anIntArray256;
  public int[] anIntArray258;
  public int anInt259;
  public int anInt260;
  public int anInt261;
  public String[] aStringArray262;
  public int anInt263;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array265;
  public int anInt266;
  public int anInt267;
  public String aString268;
  public int[] anIntArray269;
  public int anInt270;
  public boolean aBoolean271;
  public boolean aBoolean272;
  public int[] anIntArray273;
  public boolean aBoolean274;
  public int[] anIntArray276;
  public String aString281;
  public int anInt283;
  public int anInt284;
  public int anInt285;
  public int anInt286;
  public int anInt287;
  public boolean aBoolean288;
  public int anInt289;
  public Widget() {
    anInt270 = -68;
    aBoolean271 = true;
  }

  public static ImageRGB method194(int i, String s) {
    long l = (TextUtils.method301(183, s) << 8) + (long) i;
    ImageRGB imageRGB = (ImageRGB) aClass33_250.method345(l);
    if (imageRGB != null) {
      return imageRGB;
    }
    if (aClass2_214 == null) {
      return null;
    }
    try {
      imageRGB = new ImageRGB(aClass2_214, s, i);
      aClass33_250.method346(imageRGB, l, 5);
    } catch (Exception _ex) {
      return null;
    }
    return imageRGB;
  }

  public static Widget getWidget(int id) {
    if (widgets[id] == null) {
      Buffer buffer = new Buffer(aByteArrayArray282[id]);
      int j = buffer.readUShort();
      widgets[id] = method198(j, buffer, id);
    }
    return widgets[id];
  }

  public static Widget method198(int i, Buffer buffer, int k) {
    Widget widget = new Widget();
    widget.anInt215 = k;
    widget.anInt248 = i;
    widget.anInt236 = buffer.readUByte();
    widget.anInt289 = buffer.readUByte();
    widget.anInt242 = buffer.readUShort();
    widget.anInt241 = buffer.readUShort();
    widget.anInt238 = buffer.readUShort();
    widget.aByte220 = (byte) buffer.readUByte();
    widget.anInt254 = buffer.readUByte();
    if (widget.anInt254 != 0) {
      widget.anInt254 = (widget.anInt254 - 1 << 8) + buffer.readUByte();
    } else {
      widget.anInt254 = -1;
    }
    if (widget.anInt242 == 600) {
      anInt246 = i;
    }
    if (widget.anInt242 == 650) {
      anInt255 = i;
    }
    if (widget.anInt242 == 655) {
      anInt277 = i;
    }
    int l = buffer.readUByte();
    if (l > 0) {
      widget.anIntArray273 = new int[l];
      widget.anIntArray256 = new int[l];
      for (int i1 = 0; i1 < l; i1++) {
        widget.anIntArray273[i1] = buffer.readUByte();
        widget.anIntArray256[i1] = buffer.readUShort();
      }

    }
    int j1 = buffer.readUByte();
    if (j1 > 0) {
      widget.anIntArrayArray234 = new int[j1][];
      for (int k1 = 0; k1 < j1; k1++) {
        int l2 = buffer.readUShort();
        widget.anIntArrayArray234[k1] = new int[l2];
        for (int k4 = 0; k4 < l2; k4++) {
          widget.anIntArrayArray234[k1][k4] = buffer.readUShort();
        }

      }

    }
    if (widget.anInt236 == 0) {
      widget.anInt285 = buffer.readUShort();
      widget.aBoolean219 = buffer.readUByte() == 1;
      int l1 = buffer.readUShort();
      widget.anIntArray258 = new int[l1];
      widget.anIntArray232 = new int[l1];
      widget.anIntArray276 = new int[l1];
      for (int i3 = 0; i3 < l1; i3++) {
        widget.anIntArray258[i3] = buffer.readUShort();
        widget.anIntArray232[i3] = buffer.readShort();
        widget.anIntArray276[i3] = buffer.readShort();
      }

    }
    if (widget.anInt236 == 1) {
      widget.anInt225 = buffer.readUShort();
      widget.aBoolean233 = buffer.readUByte() == 1;
    }
    if (widget.anInt236 == 2) {
      widget.anIntArray269 = new int[widget.anInt241 * widget.anInt238];
      widget.anIntArray224 = new int[widget.anInt241 * widget.anInt238];
      widget.aBoolean274 = buffer.readUByte() == 1;
      widget.aBoolean229 = buffer.readUByte() == 1;
      widget.aBoolean288 = buffer.readUByte() == 1;
      widget.aBoolean217 = buffer.readUByte() == 1;
      widget.anInt263 = buffer.readUByte();
      widget.anInt244 = buffer.readUByte();
      widget.anIntArray221 = new int[20];
      widget.anIntArray213 = new int[20];
      widget.aClass50_Sub1_Sub1_Sub1Array265 = new ImageRGB[20];
      for (int i2 = 0; i2 < 20; i2++) {
        int j3 = buffer.readUByte();
        if (j3 == 1) {
          widget.anIntArray221[i2] = buffer.readShort();
          widget.anIntArray213[i2] = buffer.readShort();
          String s1 = buffer.readJString();
          if (s1.length() > 0) {
            int l4 = s1.lastIndexOf(",");
            widget.aClass50_Sub1_Sub1_Sub1Array265[i2] = method194(
                Integer.parseInt(s1.substring(l4 + 1)),
                s1.substring(0, l4));
          }
        }
      }

      widget.aStringArray262 = new String[5];
      for (int k3 = 0; k3 < 5; k3++) {
        widget.aStringArray262[k3] = buffer.readJString();
        if (widget.aStringArray262[k3].length() == 0) {
          widget.aStringArray262[k3] = null;
        }
      }

    }
    if (widget.anInt236 == 3) {
      widget.aBoolean239 = buffer.readUByte() == 1;
    }
    if (widget.anInt236 == 4 || widget.anInt236 == 1) {
      widget.aBoolean272 = buffer.readUByte() == 1;
      int j2 = buffer.readUByte();
      if (aClass50_Sub1_Sub1_Sub2Array223 != null) {
        widget.aClass50_Sub1_Sub1_Sub2_237 = aClass50_Sub1_Sub1_Sub2Array223[j2];
      }
      widget.aBoolean247 = buffer.readUByte() == 1;
    }
    if (widget.anInt236 == 4) {
      widget.aString230 = buffer.readJString();
      widget.aString249 = buffer.readJString();
    }
    if (widget.anInt236 == 1 || widget.anInt236 == 3
        || widget.anInt236 == 4) {
      widget.anInt240 = buffer.readInt();
    }
    if (widget.anInt236 == 3 || widget.anInt236 == 4) {
      widget.anInt260 = buffer.readInt();
      widget.anInt261 = buffer.readInt();
      widget.anInt226 = buffer.readInt();
    }
    if (widget.anInt236 == 5) {
      String s = buffer.readJString();
      if (s.length() > 0) {
        int l3 = s.lastIndexOf(",");
        widget.aClass50_Sub1_Sub1_Sub1_212 = method194(
            Integer.parseInt(s.substring(l3 + 1)),
            s.substring(0, l3));
      }
      s = buffer.readJString();
      if (s.length() > 0) {
        int i4 = s.lastIndexOf(",");
        widget.aClass50_Sub1_Sub1_Sub1_245 = method194(
            Integer.parseInt(s.substring(i4 + 1)),
            s.substring(0, i4));
      }
    }
    if (widget.anInt236 == 6) {
      k = buffer.readUByte();
      if (k != 0) {
        widget.anInt283 = 1;
        widget.anInt284 = (k - 1 << 8) + buffer.readUByte();
      }
      k = buffer.readUByte();
      if (k != 0) {
        widget.anInt266 = 1;
        widget.anInt267 = (k - 1 << 8) + buffer.readUByte();
      }
      k = buffer.readUByte();
      if (k != 0) {
        widget.anInt286 = (k - 1 << 8) + buffer.readUByte();
      } else {
        widget.anInt286 = -1;
      }
      k = buffer.readUByte();
      if (k != 0) {
        widget.anInt287 = (k - 1 << 8) + buffer.readUByte();
      } else {
        widget.anInt287 = -1;
      }
      widget.anInt251 = buffer.readUShort();
      widget.anInt252 = buffer.readUShort();
      widget.anInt253 = buffer.readUShort();
    }
    if (widget.anInt236 == 7) {
      widget.anIntArray269 = new int[widget.anInt241 * widget.anInt238];
      widget.anIntArray224 = new int[widget.anInt241 * widget.anInt238];
      widget.aBoolean272 = buffer.readUByte() == 1;
      int k2 = buffer.readUByte();
      if (aClass50_Sub1_Sub1_Sub2Array223 != null) {
        widget.aClass50_Sub1_Sub1_Sub2_237 = aClass50_Sub1_Sub1_Sub2Array223[k2];
      }
      widget.aBoolean247 = buffer.readUByte() == 1;
      widget.anInt240 = buffer.readInt();
      widget.anInt263 = buffer.readShort();
      widget.anInt244 = buffer.readShort();
      widget.aBoolean229 = buffer.readUByte() == 1;
      widget.aStringArray262 = new String[5];
      for (int j4 = 0; j4 < 5; j4++) {
        widget.aStringArray262[j4] = buffer.readJString();
        if (widget.aStringArray262[j4].length() == 0) {
          widget.aStringArray262[j4] = null;
        }
      }

    }
    if (widget.anInt236 == 8) {
      widget.aString230 = buffer.readJString();
    }
    if (widget.anInt289 == 2 || widget.anInt236 == 2) {
      widget.aString281 = buffer.readJString();
      widget.aString211 = buffer.readJString();
      widget.anInt222 = buffer.readUShort();
    }
    if (widget.anInt289 == 1 || widget.anInt289 == 4
        || widget.anInt289 == 5 || widget.anInt289 == 6) {
      widget.aString268 = buffer.readJString();
      if (widget.aString268.length() == 0) {
        if (widget.anInt289 == 1) {
          widget.aString268 = "Ok";
        }
        if (widget.anInt289 == 4) {
          widget.aString268 = "Select";
        }
        if (widget.anInt289 == 5) {
          widget.aString268 = "Select";
        }
        if (widget.anInt289 == 6) {
          widget.aString268 = "Continue";
        }
      }
    }
    return widget;
  }

  public static void method199(int i,
      Class50_Sub1_Sub1_Sub2[] aclass50_sub1_sub1_sub2, Archive class2,
      Archive class2_1) {
    aClass33_250 = new Class33(50000);
    aClass2_214 = class2_1;
    aClass50_Sub1_Sub1_Sub2Array223 = aclass50_sub1_sub1_sub2;
    int j = -1;
    Buffer class50_sub1_sub2 = new Buffer(class2.extract("data"));
    int k = class50_sub1_sub2.readUShort();
    widgets = new Widget[k];
    aByteArrayArray282 = new byte[k][];
    while (class50_sub1_sub2.offset < class50_sub1_sub2.payload.length) {
      int l = class50_sub1_sub2.readUShort();
      if (l == 65535) {
        j = class50_sub1_sub2.readUShort();
        l = class50_sub1_sub2.readUShort();
      }
      int i1 = class50_sub1_sub2.offset;
      Widget class13 = method198(j, class50_sub1_sub2, l);
      byte[] abyte0 = aByteArrayArray282[class13.anInt215] = new byte[class50_sub1_sub2.offset
          - i1 + 2];
      if (class50_sub1_sub2.offset - i1 >= 0)
        System.arraycopy(class50_sub1_sub2.payload, i1, abyte0, i1 - i1 + 2,
            class50_sub1_sub2.offset - i1);

      abyte0[0] = (byte) (j >> 8);
      abyte0[1] = (byte) j;
    }
    aClass2_214 = null;
    if (i >= 0) {
      anInt210 = 391;
    }
  }

  public static void method200(int i) {
    if (i == -1) {
      return;
    }
    for (int j = 0; j < widgets.length; j++) {
      if (widgets[j] != null && widgets[j].anInt248 == i
          && widgets[j].anInt236 != 2) {
        widgets[j] = null;
      }
    }
  }

  public static void method201(int i, Model model, int j) {
    aClass33_264.method347();
    if (model != null && i != 4) {
      aClass33_264.method346(model, ((long) i << 16) + j, 5);
    }
  }

  public static void method202() {
    widgets = null;
    aClass2_214 = null;
    aClass33_250 = null;
    aClass50_Sub1_Sub1_Sub2Array223 = null;
    aByteArrayArray282 = null;
  }

  public void method196(int i, int j, int k) {
    int l = anIntArray269[k];
    anIntArray269[k] = anIntArray269[i];
    anIntArray269[i] = l;
    l = anIntArray224[k];
    anIntArray224[k] = anIntArray224[i];
    if (j >= 0) {
    } else {
      anIntArray224[i] = l;
    }
  }

  public Model method197(int i, int j) {
    ItemDefinition definition = null;
    if (i == 4) {
      definition = ItemDefinition.getDefinition(j);
      anInt280 += definition.anInt354;
      anInt243 += definition.anInt358;
    }
    Model class50_sub1_sub4_sub4 = (Model) aClass33_264.method345(((long) i << 16)
        + j);
    if (class50_sub1_sub4_sub4 != null) {
      return class50_sub1_sub4_sub4;
    }
    if (i == 1) {
      class50_sub1_sub4_sub4 = Model.method577(j);
    }
    if (i == 2) {
      class50_sub1_sub4_sub4 = NpcDefinition.method364(j).method359(858);
    }
    if (i == 3) {
      class50_sub1_sub4_sub4 = Client.localPlayer
          .method570(true);
    }
    if (i == 4) {
      class50_sub1_sub4_sub4 = definition.method217(anInt270, 50);
    }
    if (i == 5) {
      class50_sub1_sub4_sub4 = null;
    }
    if (class50_sub1_sub4_sub4 != null) {
      aClass33_264.method346(class50_sub1_sub4_sub4, (i << 16) + j, 5);
    }
    return class50_sub1_sub4_sub4;
  }

  public Model method203(int i, int j, int k, boolean flag) {
    anInt280 = 64;
    anInt243 = 768;
    Model model;
    if (flag) {
      model = method197(anInt266, anInt267);
    } else {
      model = method197(anInt283, anInt284);
    }
    if (model == null) {
      return null;
    }
    if (i == -1 && j == -1 && model.anIntArray1662 == null) {
      return model;
    }
    Model class50_sub1_sub4_sub4_1 = new Model(false, false, true, model,
        Animation.frameIsNull(i) & Animation.frameIsNull(j));
    if (k != 0) {
      aBoolean271 = !aBoolean271;
    }
    if (i != -1 || j != -1) {
      class50_sub1_sub4_sub4_1.createBones();
    }
    if (i != -1) {
      class50_sub1_sub4_sub4_1.transform(i);
    }
    if (j != -1) {
      class50_sub1_sub4_sub4_1.transform(j);
    }
    class50_sub1_sub4_sub4_1.lighten(anInt280, anInt243, -50, -10, -50,
        true);
    return class50_sub1_sub4_sub4_1;
  }

}
