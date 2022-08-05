import net.runelite.mapping.ObfuscatedSignature;

public class GameObjectDefinition {
	public static final Model[] A_MODEL_ARRAY_217;
	public static Class39 aClass39_252;
	public static int anInt216;
	public static GameObjectDefinition[] aClass8Array215;
	public static Class39 aClass39_253;
	public static Buffer aBuffer_214;
	public static int[] anIntArray213;
	public static int anInt212;
	public int[] anIntArray220;
	public int[] anIntArray219;
	public int anInt211;
	public final int anInt207;
	public final boolean aBoolean208;
	public int anInt218;
	public boolean aBoolean230;
	public String aString221;
	public boolean aBoolean210;
	public boolean aBoolean250;
	public boolean aBoolean231;
	public byte[] aByteArray222;
	public boolean hasActions;
	public boolean solid;
	public int[] anIntArray223;
	public String[] aStringArray237;
	public boolean walkable;
	public int[] anIntArray224;
	public int anInt251;
	public int sizeX;
	public int sizeY;
	public boolean aBoolean240;
	public int anInt239;
	public boolean aBoolean232;
	public int anInt242;
	public int animationId;
	public int anInt243;
	public int anInt234;
	public byte aByte235;
	public byte aByte236;
	public int anInt244;
	public int anInt245;
	public int anInt238;
	public int anInt246;
	public boolean aBoolean241;
	public int anInt247;
	public int anInt248;
	public boolean aBoolean249;

	static {
		A_MODEL_ARRAY_217 = new Model[4];
		aClass39_252 = new Class39(500, 0);
		aClass39_253 = new Class39(30, 0);
	}

	public GameObjectDefinition() {
		this.anInt207 = -32952;
		this.aBoolean208 = false;
		this.aBoolean210 = false;
		this.anInt218 = -1;
	}

	public Model method206(int var1, boolean var2, int var3, int var4) {
		Model var5 = null;
		long var6;
		boolean var9;
		int var10;
		int var11;
		if (this.anIntArray220 == null) {
			if (var4 != 10) {
				return null;
			}

			var6 = (long)((this.anInt218 << 6) + var1) + ((long)(var3 + 1) << 32);
			Model var8 = (Model)aClass39_253.method339(var6);
			if (var8 != null) {
				return var8;
			}

			if (this.anIntArray219 == null) {
				return null;
			}

			var9 = this.aBoolean240 ^ var1 > 3;
			var10 = this.anIntArray219.length;

			for (var11 = 0; var11 < var10; ++var11) {
				int var12 = this.anIntArray219[var11];
				if (var9) {
					var12 += 65536;
				}

				var5 = (Model)aClass39_252.method339((long)var12);
				if (var5 == null) {
					var5 = Model.method503(var12 & 65535);
					if (var5 == null) {
						return null;
					}

					if (var9) {
						var5.method518();
					}

					aClass39_252.method340(201, (long)var12, var5);
				}

				if (var10 > 1) {
					A_MODEL_ARRAY_217[var11] = var5;
				}
			}

			if (var10 > 1) {
				var5 = new Model(var10, -643, A_MODEL_ARRAY_217);
			}
		} else {
			int var13 = -1;

			for (int var14 = 0; var14 < this.anIntArray220.length; ++var14) {
				if (var4 == this.anIntArray220[var14]) {
					var13 = var14;
					break;
				}
			}

			if (var13 == -1) {
				return null;
			}

			var6 = (long)((this.anInt218 << 6) + (var13 << 3) + var1) + ((long)(var3 + 1) << 32);
			Model var16 = (Model)aClass39_253.method339(var6);
			if (var16 != null) {
				return var16;
			}

			var10 = this.anIntArray219[var13];
			boolean var18 = this.aBoolean240 ^ var1 > 3;
			if (var18) {
				var10 += 65536;
			}

			var5 = (Model)aClass39_252.method339((long)var10);
			if (var5 == null) {
				var5 = Model.method503(var10 & 65535);
				if (var5 == null) {
					return null;
				}

				if (var18) {
					var5.method518();
				}

				aClass39_252.method340(201, (long)var10, var5);
			}
		}

		boolean var15 = this.anInt242 != 128 || this.anInt243 != 128 || this.anInt244 != 128;
		var9 = this.anInt245 != 0 || this.anInt246 != 0 || this.anInt247 != 0;
		Model var17 = new Model(this.anIntArray223 == null, Class11.method211(var3), var5, true, var1 == 0 && var3 == -1 && !var15 && !var9);
		if (var3 != -1) {
			var17.method510();
			var17.method511(var3);
			var17.anIntArrayArray1554 = null;
			var17.anIntArrayArray1553 = null;
		}

		while (var1-- > 0) {
			var17.method514();
		}

		if (this.anIntArray223 != null) {
			for (var11 = 0; var11 < this.anIntArray223.length; ++var11) {
				var17.method517(this.anIntArray223[var11], this.anIntArray224[var11]);
			}
		}

		if (var15) {
			var17.method519(9, this.anInt244, this.anInt242, this.anInt243);
		}

		if (var9) {
			var17.method516(this.anInt245, this.anInt246, (byte)10, this.anInt247);
		}

		var17.method520(this.aByte235 + 64, this.aByte236 * 5 + 768, -50, -10, -50, !this.aBoolean231);
		if (this.anInt251 == 1) {
			var17.anInt1550 = var17.anInt1394;
		}

		aClass39_253.method340(201, var6, var17);
		return var17;
	}

	public boolean method202(int var1, int var2) {
		if (this.anIntArray220 != null) {
			for (int var8 = 0; var8 < this.anIntArray220.length; ++var8) {
				if (var2 == this.anIntArray220[var8]) {
					return Model.method504(this.anIntArray219[var8] & 65535);
				}
			}

			return true;
		} else if (this.anIntArray219 == null) {
			return true;
		} else if (var2 != 10) {
			return true;
		} else {
			boolean var3 = true;
			int[] var4 = this.anIntArray219;
			int var5 = var4.length;

			for (int var6 = 0; var6 < var5; ++var6) {
				int var7 = var4[var6];
				var3 &= Model.method504(var7 & 65535);
			}

			return var3;
		}
	}

	public Model getModel(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Model var8 = this.method206(var2, false, var7, var1);
		if (var8 == null) {
			return null;
		} else {
			if (this.aBoolean230 || this.aBoolean231) {
				var8 = new Model(this.aBoolean231, (byte)72, var8, this.aBoolean230);
			}

			if (this.aBoolean230) {
				int var9 = (var3 + var5 + var4 + var6) / 4;

				for (int var10 = 0; var10 < var8.anInt1522; ++var10) {
					int var11 = var8.anIntArray1523[var10];
					int var12 = var8.anIntArray1525[var10];
					int var13 = var3 + (var11 + 64) * (var4 - var3) / 128;
					int var14 = (var11 + 64) * (var5 - var6) / 128 + var6;
					int var15 = var13 + (var12 + 64) * (var14 - var13) / 128;
					int[] var10000 = var8.anIntArray1524;
					var10000[var10] += var15 - var9;
				}

				var8.method508();
			}

			return var8;
		}
	}

	public void method200() {
		this.anIntArray219 = null;
		this.anIntArray220 = null;
		this.aString221 = null;
		this.aByteArray222 = null;
		this.anIntArray223 = null;
		this.anIntArray224 = null;
		this.sizeX = 1;
		this.sizeY = 1;
		this.solid = true;
		this.walkable = true;
		this.hasActions = false;
		this.aBoolean230 = false;
		this.aBoolean231 = false;
		this.aBoolean232 = false;
		this.animationId = -1;
		this.anInt234 = 16;
		this.aByte235 = 0;
		this.aByte236 = 0;
		this.aStringArray237 = null;
		this.anInt238 = -1;
		this.anInt239 = -1;
		this.aBoolean240 = false;
		this.aBoolean241 = true;
		this.anInt242 = 128;
		this.anInt243 = 128;
		this.anInt244 = 128;
		this.anInt248 = 0;
		this.anInt245 = 0;
		this.anInt246 = 0;
		this.anInt247 = 0;
		this.aBoolean249 = false;
		this.aBoolean250 = false;
		this.anInt251 = -1;
	}

	public void method201(byte var1, Buffer var2) {
		if (var1 == 2) {
			boolean var7 = false;
		} else {
			this.anInt211 = -350;
		}

		int var3 = -1;

		while (true) {
			int var5;
			int var6;
			do {
				while (true) {
					int var4 = var2.readUByte();
					if (var4 == 0) {
						if (var3 == -1) {
							this.hasActions = this.anIntArray219 != null && (this.anIntArray220 == null || this.anIntArray220[0] == 10);
							if (this.aStringArray237 != null) {
								this.hasActions = true;
							}
						}

						if (this.aBoolean250) {
							this.solid = false;
							this.walkable = false;
						}

						if (this.anInt251 == -1) {
							this.anInt251 = this.solid ? 1 : 0;
						}

						return;
					}

					if (var4 == 1) {
						var5 = var2.readUByte();
						break;
					}

					if (var4 == 2) {
						this.aString221 = var2.readString();
					} else if (var4 == 3) {
						this.aByteArray222 = var2.readStringArray(this.anInt207);
					} else if (var4 == 5) {
						var5 = var2.readUByte();
						if (var5 > 0) {
							this.anIntArray220 = null;
							this.anIntArray219 = new int[var5];

							for (var6 = 0; var6 < var5; ++var6) {
								this.anIntArray219[var6] = var2.readUShort();
							}
						}
					} else if (var4 == 14) {
						this.sizeX = var2.readUByte();
					} else if (var4 == 15) {
						this.sizeY = var2.readUByte();
					} else if (var4 == 17) {
						this.solid = false;
					} else if (var4 == 18) {
						this.walkable = false;
					} else if (var4 == 19) {
						var3 = var2.readUByte();
						if (var3 == 1) {
							this.hasActions = true;
						}
					} else if (var4 == 21) {
						this.aBoolean230 = true;
					} else if (var4 == 22) {
						this.aBoolean231 = true;
					} else if (var4 == 23) {
						this.aBoolean232 = true;
					} else if (var4 == 24) {
						this.animationId = var2.readUShort();
						if (this.animationId == 65535) {
							this.animationId = -1;
						}
					} else if (var4 == 28) {
						this.anInt234 = var2.readUByte();
					} else if (var4 == 29) {
						this.aByte235 = var2.readByte();
					} else if (var4 == 39) {
						this.aByte236 = var2.readByte();
					} else if (var4 >= 30 && var4 < 39) {
						if (this.aStringArray237 == null) {
							this.aStringArray237 = new String[5];
						}

						this.aStringArray237[var4 - 30] = var2.readString();
						if (this.aStringArray237[var4 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray237[var4 - 30] = null;
						}
					} else if (var4 == 40) {
						var5 = var2.readUByte();
						this.anIntArray223 = new int[var5];
						this.anIntArray224 = new int[var5];

						for (var6 = 0; var6 < var5; ++var6) {
							this.anIntArray223[var6] = var2.readUShort();
							this.anIntArray224[var6] = var2.readUShort();
						}
					} else if (var4 == 60) {
						this.anInt238 = var2.readUShort();
					} else if (var4 == 62) {
						this.aBoolean240 = true;
					} else if (var4 == 64) {
						this.aBoolean241 = false;
					} else if (var4 == 65) {
						this.anInt242 = var2.readUShort();
					} else if (var4 == 66) {
						this.anInt243 = var2.readUShort();
					} else if (var4 == 67) {
						this.anInt244 = var2.readUShort();
					} else if (var4 == 68) {
						this.anInt239 = var2.readUShort();
					} else if (var4 == 69) {
						this.anInt248 = var2.readUByte();
					} else if (var4 == 70) {
						this.anInt245 = var2.readShort();
					} else if (var4 == 71) {
						this.anInt246 = var2.readShort();
					} else if (var4 == 72) {
						this.anInt247 = var2.readShort();
					} else if (var4 == 73) {
						this.aBoolean249 = true;
					} else if (var4 == 74) {
						this.aBoolean250 = true;
					} else if (var4 == 75) {
						this.anInt251 = var2.readUByte();
					}
				}
			} while(var5 <= 0);

			this.anIntArray220 = new int[var5];
			this.anIntArray219 = new int[var5];

			for (var6 = 0; var6 < var5; ++var6) {
				this.anIntArray219[var6] = var2.readUShort();
				this.anIntArray220[var6] = var2.readUByte();
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)Z",
		garbageValue = "1"
	)
	public boolean method203() {
		if (this.anIntArray219 == null) {
			return true;
		} else {
			boolean var1 = true;
			int[] var2 = this.anIntArray219;
			int var3 = var2.length;

			for (int var4 = 0; var4 < var3; ++var4) {
				int var5 = var2[var4];
				var1 &= Model.method504(var5 & 65535);
			}

			return var1;
		}
	}

	public void method204(byte var1, Class43_Sub1 var2) {
		if (this.anIntArray219 != null) {
			int[] var3 = this.anIntArray219;
			int var4 = var3.length;

			for (int var5 = 0; var5 < var4; ++var5) {
				int var6 = var3[var5];
				var2.method397(-21322, 0, var6 & 65535);
			}

		}
	}

	public static GameObjectDefinition get(int var0) {
		for (int var1 = 0; var1 < 10; ++var1) {
			if (var0 == aClass8Array215[var1].anInt218) {
				return aClass8Array215[var1];
			}
		}

		anInt216 = (anInt216 + 1) % 10;
		GameObjectDefinition var2 = aClass8Array215[anInt216];
		aBuffer_214.offset = anIntArray213[var0];
		var2.anInt218 = var0;
		var2.method200();
		var2.method201((byte)2, aBuffer_214);
		return var2;
	}

	public static void method198(byte var0) {
		aClass39_252 = null;
		aClass39_253 = null;
		anIntArray213 = null;
		aClass8Array215 = null;
		aBuffer_214 = null;
		if (var0 == 1) {
			boolean var2 = false;
		} else {
			for (int var1 = 1; var1 > 0; ++var1) {
			}

		}
	}

	public static void method197(Class47 var0) {
		aBuffer_214 = new Buffer(var0.method546("loc.dat", (byte[])null), (byte)1);
		Buffer var1 = new Buffer(var0.method546("loc.idx", (byte[])null), (byte)1);
		anInt212 = var1.readUShort();
		anIntArray213 = new int[anInt212];
		int var2 = 2;

		int var3;
		for (var3 = 0; var3 < anInt212; ++var3) {
			anIntArray213[var3] = var2;
			var2 += var1.readUShort();
		}

		aClass8Array215 = new GameObjectDefinition[10];

		for (var3 = 0; var3 < 10; ++var3) {
			aClass8Array215[var3] = new GameObjectDefinition();
		}

	}
}
