import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	field1282(2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	field1275(4);

	@ObfuscatedName("bp")
	static String field1279;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -706271717
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1076800384"
	)
	public static void method2557() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-867433724"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1131 * 799674368 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = class259.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					MusicPatchNode.scene.drawEntity(Tiles.Client_plane, var2.x, var2.y, class120.getTileHeight(var2.field1131 * -360448000 - 64 + var2.x, var2.field1131 * -360448000 - 64 + var2.y, Tiles.Client_plane), var2.field1131 * -360448000 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
