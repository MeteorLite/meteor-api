public class Class46 {

  public int anInt772;
  public int anInt776;
  public int anInt777;
  public int[] anIntArray774;
  public int[] anIntArray773;
  public int anInt775;

  public Class46(boolean var1, int[] var2) {
    this.anIntArray774 = new int[256];
    this.anIntArray773 = new int[256];
    System.arraycopy(var2, 0, this.anIntArray773, 0, var2.length);
    this.method544();
  }

  public void method543() {
    this.anInt776 += ++this.anInt777;

    for (int var1 = 0; var1 < 256; ++var1) {
      int var2 = this.anIntArray774[var1];
      switch (var1 & 3) {
        case 0:
          this.anInt775 ^= this.anInt775 << 13;
          break;
        case 1:
          this.anInt775 ^= this.anInt775 >>> 6;
          break;
        case 2:
          this.anInt775 ^= this.anInt775 << 2;
          break;
        case 3:
          this.anInt775 ^= this.anInt775 >>> 16;
          break;
        default:
          break;
      }

      this.anInt775 += this.anIntArray774[var1 + 128 & 255];
      int var3;
      this.anIntArray774[var1] = var3 =
          this.anIntArray774[(var2 & 1020) >> 2] + this.anInt775 + this.anInt776;
      this.anIntArray773[var1] = this.anInt776 = this.anIntArray774[(var3 >> 8 & 1020) >> 2] + var2;
    }

  }

  public int method542() {
    if (this.anInt772-- == 0) {
      this.method543();
      this.anInt772 = 255;
    }

    return this.anIntArray773[this.anInt772];
  }

  public void method544() {
    int var7 = -1640531527;
    int var6 = -1640531527;
    int var5 = -1640531527;
    int var4 = -1640531527;
    int var3 = -1640531527;
    int var2 = -1640531527;
    int var1 = -1640531527;
    int var8 = -1640531527;

    int var9;
    for (var9 = 0; var9 < 4; ++var9) {
      var8 ^= var1 << 11;
      var3 += var8;
      var1 += var2;
      var1 ^= var2 >>> 2;
      var4 += var1;
      var2 += var3;
      var2 ^= var3 << 8;
      var5 += var2;
      var3 += var4;
      var3 ^= var4 >>> 16;
      var6 += var3;
      var4 += var5;
      var4 ^= var5 << 10;
      var7 += var4;
      var5 += var6;
      var5 ^= var6 >>> 4;
      var8 += var5;
      var6 += var7;
      var6 ^= var7 << 8;
      var1 += var6;
      var7 += var8;
      var7 ^= var8 >>> 9;
      var2 += var7;
      var8 += var1;
    }

    for (var9 = 0; var9 < 256; var9 += 8) {
      var8 += this.anIntArray773[var9];
      var1 += this.anIntArray773[var9 + 1];
      var2 += this.anIntArray773[var9 + 2];
      var3 += this.anIntArray773[var9 + 3];
      var4 += this.anIntArray773[var9 + 4];
      var5 += this.anIntArray773[var9 + 5];
      var6 += this.anIntArray773[var9 + 6];
      var7 += this.anIntArray773[var9 + 7];
      var8 ^= var1 << 11;
      var3 += var8;
      var1 += var2;
      var1 ^= var2 >>> 2;
      var4 += var1;
      var2 += var3;
      var2 ^= var3 << 8;
      var5 += var2;
      var3 += var4;
      var3 ^= var4 >>> 16;
      var6 += var3;
      var4 += var5;
      var4 ^= var5 << 10;
      var7 += var4;
      var5 += var6;
      var5 ^= var6 >>> 4;
      var8 += var5;
      var6 += var7;
      var6 ^= var7 << 8;
      var1 += var6;
      var7 += var8;
      var7 ^= var8 >>> 9;
      var2 += var7;
      var8 += var1;
      this.anIntArray774[var9] = var8;
      this.anIntArray774[var9 + 1] = var1;
      this.anIntArray774[var9 + 2] = var2;
      this.anIntArray774[var9 + 3] = var3;
      this.anIntArray774[var9 + 4] = var4;
      this.anIntArray774[var9 + 5] = var5;
      this.anIntArray774[var9 + 6] = var6;
      this.anIntArray774[var9 + 7] = var7;
    }

    for (var9 = 0; var9 < 256; var9 += 8) {
      var8 += this.anIntArray774[var9];
      var1 += this.anIntArray774[var9 + 1];
      var2 += this.anIntArray774[var9 + 2];
      var3 += this.anIntArray774[var9 + 3];
      var4 += this.anIntArray774[var9 + 4];
      var5 += this.anIntArray774[var9 + 5];
      var6 += this.anIntArray774[var9 + 6];
      var7 += this.anIntArray774[var9 + 7];
      var8 ^= var1 << 11;
      var3 += var8;
      var1 += var2;
      var1 ^= var2 >>> 2;
      var4 += var1;
      var2 += var3;
      var2 ^= var3 << 8;
      var5 += var2;
      var3 += var4;
      var3 ^= var4 >>> 16;
      var6 += var3;
      var4 += var5;
      var4 ^= var5 << 10;
      var7 += var4;
      var5 += var6;
      var5 ^= var6 >>> 4;
      var8 += var5;
      var6 += var7;
      var6 ^= var7 << 8;
      var1 += var6;
      var7 += var8;
      var7 ^= var8 >>> 9;
      var2 += var7;
      var8 += var1;
      this.anIntArray774[var9] = var8;
      this.anIntArray774[var9 + 1] = var1;
      this.anIntArray774[var9 + 2] = var2;
      this.anIntArray774[var9 + 3] = var3;
      this.anIntArray774[var9 + 4] = var4;
      this.anIntArray774[var9 + 5] = var5;
      this.anIntArray774[var9 + 6] = var6;
      this.anIntArray774[var9 + 7] = var7;
    }

    this.method543();
    this.anInt772 = 256;
  }
}
