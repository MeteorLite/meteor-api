import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
public class class93 {
	@ObfuscatedName("ul")
	static List field1281;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -340699385
	)
	int field1277;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 882908169
	)
	int field1276;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1947140465
	)
	int field1279;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -23287801
	)
	int field1278;

	class93(int var1, int var2, int var3, int var4) {
		this.field1277 = var1;
		this.field1276 = var2;
		this.field1279 = var3;
		this.field1278 = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	int method2354() {
		return this.field1277;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2096471202"
	)
	int method2346() {
		return this.field1276;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-23"
	)
	int method2352() {
		return this.field1279;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-82"
	)
	int method2347() {
		return this.field1278;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-19"
	)
	static int method2345(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 4000) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4 + var3;
			return 1;
		} else if (var0 == 4001) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 - var4;
			return 1;
		} else if (var0 == 4002) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 * var4;
			return 1;
		} else if (var0 == 4003) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 / var4;
			return 1;
		} else if (var0 == 4004) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
			return 1;
		} else if (var0 == 4005) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == 4006) {
				User.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == 4007) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
				return 1;
			} else if (var0 == 4008) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 | 1 << var4;
				return 1;
			} else if (var0 == 4009) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
				return 1;
			} else if (var0 == 4010) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == 4011) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 % var4;
				return 1;
			} else if (var0 == 4012) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
				}

				return 1;
			} else if (var0 == 4013) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
						break;
					default:
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == 4014) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 & var4;
				return 1;
			} else if (var0 == 4015) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 | var4;
				return 1;
			} else if (var0 == 4018) {
				User.Interpreter_intStackSize -= 3;
				long var9 = (long)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				long var11 = (long)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				long var13 = (long)Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11);
				return 1;
			} else if (var0 == 4025) {
				var3 = WorldMapManager.method4750(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3;
				return 1;
			} else if (var0 == 4026) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
				return 1;
			} else if (var0 == 4027) {
				User.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = Tile.method3935(var3, var4, var5);
				return 1;
			} else if (var0 == 4028) {
				User.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = NPC.method2334(var3, var4, var5);
				return 1;
			} else if (var0 == 4029) {
				User.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				User.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
				var3 = NPC.method2334(var3, var5, var6);
				var7 = class14.method171(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = class16.method205(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = WorldMapLabelSize.method4459(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				User.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
				var5 = class343.method6236(var3, var4);
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}
