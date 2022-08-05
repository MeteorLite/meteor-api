import net.runelite.mapping.ObfuscatedSignature;

public class Class44_Sub3_Sub4_Sub6 extends Renderable {
	public boolean aBoolean1602;
	public int anInt1604;
	public int anInt1641;
	public int anInt1647;
	public int anInt1627;
	public int anInt1599;
	public int anInt1648;
	public final int[] anIntArray1649;
	public final int[] anIntArray1617;
	public int anInt1624;
	public int anInt1600;
	public boolean aBoolean1598;
	public int anInt1630;
	public int anInt1653;
	public int anInt1621;
	public final int[] anIntArray1650;
	public final int[] anIntArray1615;
	public int anInt1637;
	public int anInt1642;
	public int anInt1632;
	public int anInt1652;
	public int anInt1603;
	public final int[] anIntArray1616;
	public int anInt1645;
	public int anInt1626;
	public int anInt1639;
	public int anInt1635;
	public int anInt1612;
	public int anInt1625;
	public int anInt1628;
	public int anInt1631;
	public int anInt1633;
	public int anInt1605;
	public int anInt1629;
	public int anInt1606;
	public int anInt1607;
	public String aString1611;
	public int anInt1608;
	public int anInt1634;
	public int anInt1644;
	public int anInt1609;
	public int anInt1618;
	public int anInt1646;
	public int anInt1638;
	public int anInt1610;
	public int anInt1640;
	public int anInt1643;
	public int anInt1619;
	public int anInt1622;
	public int anInt1623;
	public int anInt1636;
	public int anInt1620;
	public int anInt1613;
	public int anInt1614;
	public final boolean[] aBooleanArray1651;
	public int anInt1601;

	public Class44_Sub3_Sub4_Sub6() {
		this.aBoolean1598 = true;
		this.aBoolean1602 = false;
		this.anInt1603 = 1;
		this.anInt1604 = -1;
		this.anInt1605 = -1;
		this.anInt1606 = -1;
		this.anInt1607 = -1;
		this.anInt1608 = -1;
		this.anInt1609 = -1;
		this.anInt1610 = -1;
		this.anInt1612 = 100;
		this.anIntArray1615 = new int[4];
		this.anIntArray1616 = new int[4];
		this.anIntArray1617 = new int[4];
		this.anInt1618 = -1000;
		this.anInt1621 = -1;
		this.anInt1624 = -1;
		this.anInt1627 = -1;
		this.anInt1632 = -1;
		this.anInt1645 = 200;
		this.anInt1647 = 32;
		this.anIntArray1649 = new int[10];
		this.anIntArray1650 = new int[10];
		this.aBooleanArray1651 = new boolean[10];
	}

	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "0"
	)
	public boolean method532() {
		return false;
	}

	public void method530(boolean var1, int var2, boolean var3) {
		int var4 = this.anIntArray1649[0];
		int var5 = this.anIntArray1650[0];
		if (var2 == 0) {
			--var4;
			++var5;
		}

		if (var2 == 1) {
			++var5;
		}

		if (var2 == 2) {
			++var4;
			++var5;
		}

		if (var2 == 3) {
			--var4;
		}

		if (var2 == 4) {
			++var4;
		}

		if (var2 == 5) {
			--var4;
			--var5;
		}

		if (var2 == 6) {
			--var5;
		}

		if (var2 == 7) {
			++var4;
			--var5;
		}

		if (this.anInt1627 != -1 && Class26.aClass26Array497[this.anInt1627].anInt510 == 1) {
			this.anInt1627 = -1;
		}

		if (this.anInt1648 < 9) {
			++this.anInt1648;
		}

		for (int var6 = this.anInt1648; var6 > 0; --var6) {
			this.anIntArray1649[var6] = this.anIntArray1649[var6 - 1];
			this.anIntArray1650[var6] = this.anIntArray1650[var6 - 1];
			this.aBooleanArray1651[var6] = this.aBooleanArray1651[var6 - 1];
		}

		this.anIntArray1649[0] = var4;
		this.anIntArray1650[0] = var5;
		this.aBooleanArray1651[0] = var3;
	}

	public void method533(int var1, byte var2, int var3, int var4) {
		for (int var5 = 0; var5 < 4; ++var5) {
			if (this.anIntArray1617[var5] <= var1) {
				this.anIntArray1615[var5] = var3;
				this.anIntArray1616[var5] = var4;
				this.anIntArray1617[var5] = var1 + 70;
				return;
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method531() {
		this.anInt1648 = 0;
		this.anInt1653 = 0;
	}

	public void method529(int var1, boolean var2, boolean var3, int var4) {
		if (this.anInt1627 != -1 && Class26.aClass26Array497[this.anInt1627].anInt510 == 1) {
			this.anInt1627 = -1;
		}

		if (!var2) {
			int var5 = var1 - this.anIntArray1649[0];
			int var6 = var4 - this.anIntArray1650[0];
			if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
				if (this.anInt1648 < 9) {
					++this.anInt1648;
				}

				for (int var7 = this.anInt1648; var7 > 0; --var7) {
					this.anIntArray1649[var7] = this.anIntArray1649[var7 - 1];
					this.anIntArray1650[var7] = this.anIntArray1650[var7 - 1];
					this.aBooleanArray1651[var7] = this.aBooleanArray1651[var7 - 1];
				}

				this.anIntArray1649[0] = var1;
				this.anIntArray1650[0] = var4;
				this.aBooleanArray1651[0] = false;
				return;
			}
		}

		this.anInt1648 = 0;
		this.anInt1653 = 0;
		this.anInt1652 = 0;
		this.anIntArray1649[0] = var1;
		this.anIntArray1650[0] = var4;
		this.anInt1599 = this.anIntArray1649[0] * 128 + this.anInt1603 * 64;
		this.anInt1600 = this.anIntArray1650[0] * 128 + this.anInt1603 * 64;
	}
}
