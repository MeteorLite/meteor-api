public class Class47 {

  public int anInt778;
  public final int anInt779;
  public int anInt782;
  public boolean aBoolean780;
  public int[] anIntArray783;
  public byte[] aByteArray781;
  public boolean aBoolean787;
  public int[] anIntArray784;
  public int[] anIntArray785;
  public int[] anIntArray786;

  public Class47(int var1, byte[] var2) {
    this.anInt778 = 9;
    this.anInt779 = 29615;
    this.aBoolean780 = true;
    this.method545(-6097, var2);
  }

  public byte[] method546(String var1, byte[] var2) {
    int var3 = 0;
    var1 = var1.toUpperCase();

    int var4;
    for (var4 = 0; var4 < var1.length(); ++var4) {
      var3 = var3 * 61 + var1.charAt(var4) - 32;
    }

    for (var4 = 0; var4 < this.anInt782; ++var4) {
      if (var3 == this.anIntArray783[var4]) {
        if (var2 == null) {
          var2 = new byte[this.anIntArray784[var4]];
        }

        if (!this.aBoolean787) {
          Statics.method329(var2, this.anIntArray784[var4], this.aByteArray781,
              this.anIntArray785[var4], this.anIntArray786[var4]);
        } else if (this.anIntArray784[var4] >= 0) {
          System.arraycopy(this.aByteArray781, this.anIntArray786[var4], var2, 0,
              this.anIntArray784[var4]);
        }

        return var2;
      }
    }

    return null;
  }

  public void method545(int var1, byte[] var2) {
    Buffer var3 = new Buffer(var2, (byte) 1);
    int var4 = var3.readMedium();
    int var5 = var3.readMedium();
    if (var5 != var4) {
      byte[] var6 = new byte[var4];
      Statics.method329(var6, var4, var2, var5, 6);
      this.aByteArray781 = var6;
      var3 = new Buffer(this.aByteArray781, (byte) 1);
      this.aBoolean787 = true;
    } else {
      this.aByteArray781 = var2;
      this.aBoolean787 = false;
    }

    this.anInt782 = var3.readUShort();
    this.anIntArray783 = new int[this.anInt782];
    this.anIntArray784 = new int[this.anInt782];
    this.anIntArray785 = new int[this.anInt782];
    this.anIntArray786 = new int[this.anInt782];
    int var8 = var3.offset + this.anInt782 * 10;

    for (int var7 = 0; var7 < this.anInt782; ++var7) {
      this.anIntArray783[var7] = var3.readInt();
      this.anIntArray784[var7] = var3.readMedium();
      this.anIntArray785[var7] = var3.readMedium();
      this.anIntArray786[var7] = var8;
      var8 += this.anIntArray785[var7];
    }
  }
}
