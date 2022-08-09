public class Floor {

  public static int length;
  public static Floor[] floors;
  public int anInt311;
  public boolean aBoolean312;
  public String name;
  public int anInt316;
  public int anInt317;
  public boolean aBoolean318;
  public boolean aBoolean319;
  public int anInt320;
  public int anInt321;
  public int anInt322;
  public int anInt323;
  public int anInt324;
  public int anInt325;
  public Floor() {
    aBoolean312 = true;
    anInt317 = -1;
    aBoolean318 = false;
    aBoolean319 = true;
  }

  public static void init(Archive archive) {
    Buffer buffer = new Buffer(archive.extract("flo.dat"));
    length = buffer.readUShort();
    if (floors == null) {
      floors = new Floor[length];
    }
    for (int j = 0; j < length; j++) {
      if (floors[j] == null) {
        floors[j] = new Floor();
      }
      floors[j].readValues(buffer);
    }

  }

  public void readValues(Buffer buffer) {
    do {
      int j = buffer.readUByte();
      if (j == 0) {
        return;
      }
      if (j == 1) {
        anInt316 = buffer.readMedium();
        method209(true, anInt316);
      } else if (j == 2) {
        anInt317 = buffer.readUByte();
      } else if (j == 3) {
        aBoolean318 = true;
      } else if (j == 5) {
        aBoolean319 = false;
      } else if (j == 6) {
        name = buffer.readJString();
      } else if (j == 7) {
        int k = anInt320;
        int l = anInt321;
        int i1 = anInt322;
        int j1 = anInt323;
        int k1 = buffer.readMedium();
        method209(true, k1);
        anInt320 = k;
        anInt321 = l;
        anInt322 = i1;
        anInt323 = j1;
        anInt324 = j1;
      } else {
        System.out.println("Error unrecognised config code: " + j);
      }
    } while (true);
  }

  public void method209(boolean flag, int i) {
    if (i == 0xff00ff) {
      i = 0;
    }
    double d = (double) (i >> 16 & 0xff) / 256D;
    double d1 = (double) (i >> 8 & 0xff) / 256D;
    double d2 = (double) (i & 0xff) / 256D;
    double d3 = d;
    if (d1 < d3) {
      d3 = d1;
    }
    if (d2 < d3) {
      d3 = d2;
    }
    double d4 = d;
    if (d1 > d4) {
      d4 = d1;
    }
    if (d2 > d4) {
      d4 = d2;
    }
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = (d3 + d4) / 2D;
    if (d3 != d4) {
      if (d7 < 0.5D) {
        d6 = (d4 - d3) / (d4 + d3);
      }
      if (d7 >= 0.5D) {
        d6 = (d4 - d3) / (2D - d4 - d3);
      }
      if (d == d4) {
        d5 = (d1 - d2) / (d4 - d3);
      } else if (d1 == d4) {
        d5 = 2D + (d2 - d) / (d4 - d3);
      } else if (d2 == d4) {
        d5 = 4D + (d - d1) / (d4 - d3);
      }
    }
    d5 /= 6D;
    anInt320 = (int) (d5 * 256D);
    anInt321 = (int) (d6 * 256D);
    anInt322 = (int) (d7 * 256D);
    if (!flag) {
      anInt311 = -244;
    }
    if (anInt321 < 0) {
      anInt321 = 0;
    } else if (anInt321 > 255) {
      anInt321 = 255;
    }
    if (anInt322 < 0) {
      anInt322 = 0;
    } else if (anInt322 > 255) {
      anInt322 = 255;
    }
    if (d7 > 0.5D) {
      anInt324 = (int) ((1.0D - d7) * d6 * 512D);
    } else {
      anInt324 = (int) (d7 * d6 * 512D);
    }
    if (anInt324 < 1) {
      anInt324 = 1;
    }
    anInt323 = (int) (d5 * (double) anInt324);
    int j = anInt320 + (int) (Math.random() * 16D) - 8;
    if (j < 0) {
      j = 0;
    } else if (j > 255) {
      j = 255;
    }
    int k = anInt321 + (int) (Math.random() * 48D) - 24;
    if (k < 0) {
      k = 0;
    } else if (k > 255) {
      k = 255;
    }
    int l = anInt322 + (int) (Math.random() * 48D) - 24;
    if (l < 0) {
      l = 0;
    } else if (l > 255) {
      l = 255;
    }
    anInt325 = method210(j, k, l);
  }

  public int method210(int i, int j, int k) {
    if (k > 179) {
      j /= 2;
    }
    if (k > 192) {
      j /= 2;
    }
    if (k > 217) {
      j /= 2;
    }
    if (k > 243) {
      j /= 2;
    }
    return (i / 4 << 10) + (j / 32 << 7) + k / 2;
  }

}