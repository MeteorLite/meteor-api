import java.io.File;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public final class class267 {
	@ObfuscatedName("q")
	static final HashMap field3162;
	@ObfuscatedName("f")
	@Export("JagexCache_locationFile")
	static File JagexCache_locationFile;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("compass")
	static SpritePixels compass;

	static {
		field3162 = new HashMap();
		TimeZone var0;
		synchronized(field3162) {
			TimeZone var2 = (TimeZone)field3162.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3162.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}
}
