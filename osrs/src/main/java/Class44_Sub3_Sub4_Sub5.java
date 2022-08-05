import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub4_Sub5 extends Renderable {

  public int anInt1596;
  public final Class32 aClass32_1589;
  public boolean aBoolean1597;
  public int anInt1591;
  public int anInt1595;
  public int anInt1590;
  public int anInt1592;
  public int anInt1593;
  public int anInt1594;

  public Class44_Sub3_Sub4_Sub5(int var1, int var2, int var3, int var4, int var5, int var6,
      int var7, int var8) {
    this.aBoolean1597 = false;
    this.aClass32_1589 = Class32.aClass32Array547[var7];
    this.anInt1591 = var4;
    this.anInt1592 = var3;
    this.anInt1593 = var2;
    this.anInt1594 = var6;
    this.anInt1590 = var8 + var1;
    this.aBoolean1597 = false;
  }

  @ObfuscatedSignature(
      descriptor = "(Z)LModel;",
      garbageValue = "0"
  )
  public Model getModel(boolean var1) {
    Model var2 = this.aClass32_1589.method271();
    if (var2 == null) {
      return null;
    } else {
      int var3 = this.aClass32_1589.aClass26_551.primaryFrames[this.anInt1595];
      Model var4 = new Model(true, Class11.method211(var3), var2, true, false);
      if (!this.aBoolean1597) {
        var4.method510();
        var4.method511(var3);
        var4.anIntArrayArray1554 = null;
        var4.anIntArrayArray1553 = null;
      }

      if (this.aClass32_1589.anInt554 != 128 || this.aClass32_1589.anInt555 != 128) {
        var4.method519(9, this.aClass32_1589.anInt554, this.aClass32_1589.anInt554,
            this.aClass32_1589.anInt555);
      }

      if (this.aClass32_1589.anInt556 != 0) {
        if (this.aClass32_1589.anInt556 == 90) {
          var4.method514();
        }

        if (this.aClass32_1589.anInt556 == 180) {
          var4.method514();
          var4.method514();
        }

        if (this.aClass32_1589.anInt556 == 270) {
          var4.method514();
          var4.method514();
          var4.method514();
        }
      }

      var4.method520(this.aClass32_1589.anInt557 + 64, this.aClass32_1589.anInt558 + 850, -30, -50,
          -30, true);
      return var4;
    }
  }

  public void method528(int var1, int var2) {
    this.anInt1596 += var2;

    while (true) {
      do {
        do {
          if (this.anInt1596 <= this.aClass32_1589.aClass26_551.getFrameLength(this.anInt1595,
              41645)) {
            return;
          }

          this.anInt1596 -=
              this.aClass32_1589.aClass26_551.getFrameLength(this.anInt1595, 41645) + 1;
          ++this.anInt1595;
        } while (this.anInt1595 < this.aClass32_1589.aClass26_551.anInt498);
      } while (this.anInt1595 >= 0 && this.anInt1595 < this.aClass32_1589.aClass26_551.anInt498);

      this.anInt1595 = 0;
      this.aBoolean1597 = true;
    }
  }
}
