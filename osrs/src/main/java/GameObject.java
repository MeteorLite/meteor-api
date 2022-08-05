import net.runelite.mapping.ObfuscatedSignature;

public class GameObject extends Renderable {
	public Class26 animation;
	public boolean aBoolean1468;
	public int nextFrameTime;
	public final int objectId;
	public final int type;
	public int frame;
	public final int orientation;
	public final int minX;
	public final int minY;
	public final int maxX;
	public final int maxY;
	public int anInt1467;

	public GameObject(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9, int var10) {
		this.aBoolean1468 = false;
		this.objectId = var4;
		this.type = var1;
		this.orientation = var2;
		this.minX = var10;
		this.minY = var8;
		this.maxX = var5;
		this.maxY = var9;
		this.animation = Class26.aClass26Array497[var3];
		this.frame = 0;
		this.nextFrameTime = Client.tick;
		if (var6 != 0) {
			this.anInt1467 = 429;
		}

		if (var7 && this.animation.frameStep != -1) {
			this.frame = (int)(Math.random() * (double)this.animation.anInt498);
			this.nextFrameTime -= (int)(Math.random() * (double)this.animation.getFrameLength(this.frame, 41645));
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Z)LModel;",
		garbageValue = "0"
	)
	public Model getModel(boolean var1) {
		int var2;
		if (this.animation != null) {
			var2 = Client.tick - this.nextFrameTime;
			if (var2 > 100 && this.animation.frameStep > 0) {
				var2 = 100;
			}

			label36: {
				do {
					do {
						if (var2 <= this.animation.getFrameLength(this.frame, 41645)) {
							break label36;
						}

						var2 -= this.animation.getFrameLength(this.frame, 41645);
						++this.frame;
					} while(this.frame < this.animation.anInt498);

					this.frame -= this.animation.frameStep;
				} while(this.frame >= 0 && this.frame < this.animation.anInt498);

				this.animation = null;
			}

			this.nextFrameTime = Client.tick - var2;
		}

		var2 = -1;
		if (this.animation != null) {
			var2 = this.animation.primaryFrames[this.frame];
		}

		GameObjectDefinition var3 = GameObjectDefinition.get(this.objectId);
		return var3.getModel(this.type, this.orientation, this.minX, this.minY, this.maxX, this.maxY, var2);
	}
}
