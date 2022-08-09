public class Archive {

  public int anInt86;
  public boolean aBoolean87;
  public byte[] aByteArray88;
  public int anInt89;
  public int[] anIntArray90;
  public int[] anIntArray91;
  public int[] anIntArray92;
  public int[] anIntArray93;
  public boolean aBoolean94;
  public Archive(byte[] abyte0) {
    anInt86 = -766;
    aBoolean87 = true;
    method153(0, abyte0);
  }

  public void method153(int i, byte[] abyte0) {
    Buffer class50_sub1_sub2 = new Buffer(abyte0);
    int j = class50_sub1_sub2.readMedium();
    int k = class50_sub1_sub2.readMedium();
    if (k != j) {
      byte[] abyte1 = new byte[j];
      BZip2Decompressor.method312(abyte1, j, abyte0, k, 6);
      aByteArray88 = abyte1;
      class50_sub1_sub2 = new Buffer(aByteArray88);
      aBoolean94 = true;
    } else {
      aByteArray88 = abyte0;
      aBoolean94 = false;
    }
    anInt89 = class50_sub1_sub2.readUShort();
    anIntArray90 = new int[anInt89];
    anIntArray91 = new int[anInt89];
    anIntArray92 = new int[anInt89];
    if (i != 0) {
      return;
    }
    anIntArray93 = new int[anInt89];
    int l = class50_sub1_sub2.offset + anInt89 * 10;
    for (int i1 = 0; i1 < anInt89; i1++) {
      anIntArray90[i1] = class50_sub1_sub2.readInt();
      anIntArray91[i1] = class50_sub1_sub2.readMedium();
      anIntArray92[i1] = class50_sub1_sub2.readMedium();
      anIntArray93[i1] = l;
      l += anIntArray92[i1];
    }

  }

  public byte[] extract(String s) {
    byte[] abyte0 = null;
    int i = 0;
    s = s.toUpperCase();
    for (int j = 0; j < s.length(); j++) {
      i = i * 61 + s.charAt(j) - 32;
    }

    for (int k = 0; k < anInt89; k++) {
      if (anIntArray90[k] == i) {
        if (abyte0 == null) {
          abyte0 = new byte[anIntArray91[k]];
        }
        if (!aBoolean94) {
          BZip2Decompressor.method312(abyte0, anIntArray91[k],
              aByteArray88, anIntArray92[k], anIntArray93[k]);
        } else {
					if (anIntArray91[k] >= 0)
						System.arraycopy(aByteArray88, anIntArray93[k] + 0, abyte0, 0, anIntArray91[k]);

        }
        return abyte0;
      }
    }

    return null;
  }
}
