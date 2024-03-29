import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1686578925
	)
	int field4329;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lpn;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.field4329 = 1;
		this.friendLoginUpdates = new LinkDeque();
		this.loginType = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lnc;",
		garbageValue = "-25"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lnc;",
		garbageValue = "0"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqo;ZI)Z",
		garbageValue = "15565735"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1);
		if (var3 == null) {
			return false;
		} else {
			return !var2 || var3.world != 0;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "1793281005"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				boolean var3 = var1.readUnsignedByte() == 1;
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated();
					var1.readUnsignedByte();
					var1.readInt();
				}

				var1.readStringCp1252NullTerminated();
				if (var4 != null && var4.hasCleanName()) {
					Friend var11 = (Friend)this.getByCurrentUsername(var4);
					if (var3) {
						Friend var12 = (Friend)this.getByCurrentUsername(var5);
						if (var12 != null && var12 != var11) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}

					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true;

							for (class370 var13 = (class370)this.friendLoginUpdates.last(); var13 != null; var13 = (class370)this.friendLoginUpdates.previous()) {
								if (var13.field4345.equals(var4)) {
									if (var6 != 0 && var13.field4347 == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.field4347 != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}

							if (var14) {
								this.friendLoginUpdates.addFirst(new class370(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) {
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5);
					}

					if (var6 != var11.world) {
						var11.int2 = ++this.field4329 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * -287223117) * 597666939;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field4339 = var9;
					var11.field4340 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "37576687"
	)
	public static int method6799(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
