import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import net.runelite.mapping.ObfuscatedSignature;
import sign.signlink;

public class Class43_Sub1 extends Class43 implements Runnable {
	public int[] anIntArray1280;
	public int[] anIntArray1281;
	public boolean aBoolean1282;
	public int anInt1286;
	public final Class28 aClass28_1293;
	public final Class28 aClass28_1292;
	public Client aClient1283;
	public Socket aSocket1297;
	public InputStream anInputStream1298;
	public int[] anIntArray1276;
	public final Class31 aClass31_1288;
	public int anInt1268;
	public byte[] aByteArray1275;
	public boolean aBoolean1267;
	public final Class28 aClass28_1289;
	public final int[][] anIntArrayArray1271;
	public int anInt1309;
	public int[] anIntArray1278;
	public int anInt1287;
	public int anInt1303;
	public final byte[] aByteArray1304;
	public int[] anIntArray1279;
	public long aLong1308;
	public int anInt1274;
	public final Class28 aClass28_1291;
	public OutputStream anOutputStream1299;
	public final byte aByte1269;
	public boolean aBoolean1285;
	public int anInt1270;
	public final CRC32 aCRC32_1284;
	public int[] anIntArray1277;
	public final byte[][] aByteArrayArray1273;
	public int anInt1300;
	public final Class28 aClass28_1290;
	public final int[][] anIntArrayArray1272;
	public Class44_Sub3_Sub3 aClass44_Sub3_Sub3_1301;
	public final byte[] aByteArray1305;
	public int anInt1302;
	public String loginScreenBottomText;
	public int anInt1307;
	public int anInt1295;
	public int anInt1306;
	public int anInt1296;

	public Class43_Sub1() {
		this.aBoolean1267 = true;
		this.aByte1269 = 0;
		this.anInt1270 = 477;
		this.anIntArrayArray1271 = new int[4][];
		this.anIntArrayArray1272 = new int[4][];
		this.aByteArrayArray1273 = new byte[4][];
		this.aBoolean1282 = true;
		this.aCRC32_1284 = new CRC32();
		this.aBoolean1285 = false;
		this.aClass31_1288 = new Class31((byte)8);
		this.aClass28_1289 = new Class28(-822);
		this.aClass28_1290 = new Class28(-822);
		this.aClass28_1291 = new Class28(-822);
		this.aClass28_1292 = new Class28(-822);
		this.aClass28_1293 = new Class28(-822);
		this.loginScreenBottomText = "";
		this.aByteArray1304 = new byte[500];
		this.aByteArray1305 = new byte[65000];
	}

	public void method392(int var1, int var2) {
		if (var1 >= 0 && var1 <= this.anIntArrayArray1271.length && var2 >= 0 && var2 <= this.anIntArrayArray1271[var1].length) {
			if (this.anIntArrayArray1271[var1][var2] != 0) {
				synchronized(this.aClass31_1288) {
					Class44_Sub3_Sub3 var4;
					for (var4 = (Class44_Sub3_Sub3)this.aClass31_1288.method266(); var4 != null; var4 = (Class44_Sub3_Sub3)this.aClass31_1288.method267(this.aByte1269)) {
						if (var4.anInt1387 == var1 && var2 == var4.anInt1388) {
							return;
						}
					}

					var4 = new Class44_Sub3_Sub3();
					var4.anInt1387 = var1;
					var4.anInt1388 = var2;
					var4.aBoolean1391 = true;
					synchronized(this.aClass28_1289) {
						this.aClass28_1289.method256(var4);
					}

					this.aClass31_1288.method264(var4);
				}
			}
		}
	}

	public Class44_Sub3_Sub3 method394() {
		Class44_Sub3_Sub3 var1;
		synchronized(this.aClass28_1292) {
			var1 = (Class44_Sub3_Sub3)this.aClass28_1292.method258();
		}

		if (var1 == null) {
			return null;
		} else {
			synchronized(this.aClass31_1288) {
				var1.method405();
			}

			if (var1.aByteArray1389 == null) {
				return var1;
			} else {
				int var2 = 0;

				try {
					GZIPInputStream var3 = new GZIPInputStream(new ByteArrayInputStream(var1.aByteArray1389));

					while (true) {
						if (this.aByteArray1305.length == var2) {
							throw new RuntimeException("buffer overflow!");
						}

						int var4 = var3.read(this.aByteArray1305, var2, this.aByteArray1305.length - var2);
						if (var4 == -1) {
							break;
						}

						var2 += var4;
					}
				} catch (IOException var7) {
					throw new RuntimeException("error unzipping");
				}

				var1.aByteArray1389 = new byte[var2];
				System.arraycopy(this.aByteArray1305, 0, var1.aByteArray1389, 0, var2);
				return var1;
			}
		}
	}

	public void method397(int var1, int var2, int var3) {
		if (this.aClient1283.aClass45Array1225[0] != null) {
			if (this.anIntArrayArray1271[var2][var3] != 0) {
				if (this.aByteArrayArray1273[var2][var3] != 0) {
					if (this.anInt1274 != 0) {
						Class44_Sub3_Sub3 var4 = new Class44_Sub3_Sub3();
						var4.anInt1387 = var2;
						var4.anInt1388 = var3;
						var4.aBoolean1391 = false;
						synchronized(this.aClass28_1293) {
							this.aClass28_1293.method256(var4);
						}
					}
				}
			}
		}
	}

	public void method395(byte var1, int var2, int var3, byte var4) {
		if (this.aClient1283.aClass45Array1225[0] != null) {
			if (this.anIntArrayArray1271[var3][var2] != 0) {
				byte[] var5 = this.aClient1283.aClass45Array1225[var3 + 1].method538((byte)2, var2);
				if (!this.method402((byte)103, this.anIntArrayArray1272[var3][var2], this.anIntArrayArray1271[var3][var2], var5)) {
					this.aByteArrayArray1273[var3][var2] = var4;
					if (var4 > this.anInt1274) {
						this.anInt1274 = var4;
					}

					++this.anInt1296;
				}
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "41"
	)
	public void method396() {
		synchronized(this.aClass28_1293) {
			this.aClass28_1293.method263();
		}
	}

	public int method385(int var1, int var2) {
		if (var1 != 0) {
			this.aBoolean1267 = !this.aBoolean1267;
		}

		return this.anIntArrayArray1271[var2].length;
	}

	public void method382(int var1) {
		this.method392(0, var1);
	}

	public int method390(int var1, byte var2) {
		if (var2 == 9) {
			boolean var3 = false;
		} else {
			this.anInt1268 = 154;
		}

		return this.aByteArray1275[var1] & 255;
	}

	public void method384() {
		this.aBoolean1282 = false;
	}

	public void method398(byte var1) {
		if (var1 == 7) {
			boolean var11 = false;
			Class44_Sub3_Sub3 var2;
			synchronized(this.aClass28_1289) {
				var2 = (Class44_Sub3_Sub3)this.aClass28_1289.method258();
			}

			while (var2 != null) {
				this.aBoolean1285 = true;
				byte[] var3 = null;
				if (this.aClient1283.aClass45Array1225[0] != null) {
					var3 = this.aClient1283.aClass45Array1225[var2.anInt1387 + 1].method538((byte)2, var2.anInt1388);
				}

				if (!this.method402((byte)103, this.anIntArrayArray1272[var2.anInt1387][var2.anInt1388], this.anIntArrayArray1271[var2.anInt1387][var2.anInt1388], var3)) {
					var3 = null;
				}

				synchronized(this.aClass28_1289) {
					if (var3 == null) {
						this.aClass28_1290.method256(var2);
					} else {
						var2.aByteArray1389 = var3;
						synchronized(this.aClass28_1292) {
							this.aClass28_1292.method256(var2);
						}
					}

					var2 = (Class44_Sub3_Sub3)this.aClass28_1289.method258();
				}
			}

		}
	}

	public boolean method402(byte var1, int var2, int var3, byte[] var4) {
		if (var4 != null && var4.length >= 2) {
			int var5 = var4.length - 2;
			int var6 = (var4[var5 + 1] & 255) + ((var4[var5] & 255) << 8);
			this.aCRC32_1284.reset();
			this.aCRC32_1284.update(var4, 0, var5);
			int var7 = (int)this.aCRC32_1284.getValue();
			if (var3 != var6) {
				return false;
			} else {
				return var7 == var2;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method399() {
		this.anInt1286 = 0;
		this.anInt1287 = 0;

		for (Class44_Sub3_Sub3 var1 = (Class44_Sub3_Sub3)this.aClass28_1291.peekFront(); var1 != null; var1 = (Class44_Sub3_Sub3)this.aClass28_1291.getPrevious(this.aByte1269)) {
			if (var1.aBoolean1391) {
				++this.anInt1286;
			} else {
				++this.anInt1287;
			}
		}

		while (this.anInt1286 < 10) {
			Class44_Sub3_Sub3 var2 = (Class44_Sub3_Sub3)this.aClass28_1290.method258();
			if (var2 == null) {
				break;
			}

			if (this.aByteArrayArray1273[var2.anInt1387][var2.anInt1388] != 0) {
				++this.anInt1295;
			}

			this.aByteArrayArray1273[var2.anInt1387][var2.anInt1388] = 0;
			this.aClass28_1291.method256(var2);
			++this.anInt1286;
			this.method403(var2);
			this.aBoolean1285 = true;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(LClass44_Sub3_Sub3;I)V",
		garbageValue = "295"
	)
	public void method403(Class44_Sub3_Sub3 var1) {
		try {
			if (this.aSocket1297 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - this.aLong1308 < 4000L) {
					return;
				}

				this.aLong1308 = var2;
				this.aSocket1297 = this.aClient1283.method72(Client.portOffset + 43594);
				this.anInputStream1298 = this.aSocket1297.getInputStream();
				this.anOutputStream1299 = this.aSocket1297.getOutputStream();
				this.anOutputStream1299.write(15);

				for (int var4 = 0; var4 < 8; ++var4) {
					this.anInputStream1298.read();
				}

				this.anInt1306 = 0;
			}

			this.aByteArray1304[0] = (byte)var1.anInt1387;
			this.aByteArray1304[1] = (byte)(var1.anInt1388 >> 8);
			this.aByteArray1304[2] = (byte)var1.anInt1388;
			if (var1.aBoolean1391) {
				this.aByteArray1304[3] = 2;
			} else if (!this.aClient1283.aBoolean905) {
				this.aByteArray1304[3] = 1;
			} else {
				this.aByteArray1304[3] = 0;
			}

			this.anOutputStream1299.write(this.aByteArray1304, 0, 4);
			this.anInt1307 = 0;
			this.anInt1300 = -10000;
		} catch (IOException var6) {
			try {
				this.aSocket1297.close();
			} catch (Exception var5) {
			}

			this.aSocket1297 = null;
			this.anInputStream1298 = null;
			this.anOutputStream1299 = null;
			this.anInt1303 = 0;
			++this.anInt1300;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method400() {
		while (this.anInt1286 == 0 && this.anInt1287 < 10 && this.anInt1274 != 0) {
			Class44_Sub3_Sub3 var1;
			synchronized(this.aClass28_1293) {
				var1 = (Class44_Sub3_Sub3)this.aClass28_1293.method258();
			}

			while (var1 != null) {
				if (this.aByteArrayArray1273[var1.anInt1387][var1.anInt1388] != 0) {
					this.aByteArrayArray1273[var1.anInt1387][var1.anInt1388] = 0;
					this.aClass28_1291.method256(var1);
					this.method403(var1);
					this.aBoolean1285 = true;
					if (this.anInt1295 < this.anInt1296) {
						++this.anInt1295;
					}

					this.loginScreenBottomText = "Loading extra files - " + this.anInt1295 * 100 / this.anInt1296 + "%";
					++this.anInt1287;
					if (this.anInt1287 == 10) {
						return;
					}
				}

				synchronized(this.aClass28_1293) {
					var1 = (Class44_Sub3_Sub3)this.aClass28_1293.method258();
				}
			}

			for (int var2 = 0; var2 < 4; ++var2) {
				byte[] var3 = this.aByteArrayArray1273[var2];
				int var4 = var3.length;

				for (int var5 = 0; var5 < var4; ++var5) {
					if (var3[var5] == this.anInt1274) {
						var3[var5] = 0;
						Class44_Sub3_Sub3 var6 = new Class44_Sub3_Sub3();
						var6.anInt1387 = var2;
						var6.anInt1388 = var5;
						var6.aBoolean1391 = false;
						this.aClass28_1291.method256(var6);
						this.method403(var6);
						this.aBoolean1285 = true;
						if (this.anInt1295 < this.anInt1296) {
							++this.anInt1295;
						}

						this.loginScreenBottomText = "Loading extra files - " + this.anInt1295 * 100 / this.anInt1296 + "%";
						++this.anInt1287;
						if (this.anInt1287 == 10) {
							return;
						}
					}
				}
			}

			--this.anInt1274;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-194"
	)
	public void method401() {
		try {
			int var1 = this.anInputStream1298.available();
			int var3;
			int var4;
			if (this.anInt1303 == 0 && var1 >= 6) {
				this.aBoolean1285 = true;

				int var2;
				for (var2 = 0; var2 < 6; var2 += this.anInputStream1298.read(this.aByteArray1304, var2, 6 - var2)) {
				}

				var2 = this.aByteArray1304[0] & 255;
				var3 = ((this.aByteArray1304[1] & 255) << 8) + (this.aByteArray1304[2] & 255);
				var4 = ((this.aByteArray1304[3] & 255) << 8) + (this.aByteArray1304[4] & 255);
				int var5 = this.aByteArray1304[5] & 255;
				this.aClass44_Sub3_Sub3_1301 = null;

				for (Class44_Sub3_Sub3 var6 = (Class44_Sub3_Sub3)this.aClass28_1291.peekFront(); var6 != null; var6 = (Class44_Sub3_Sub3)this.aClass28_1291.getPrevious(this.aByte1269)) {
					if (var2 == var6.anInt1387 && var3 == var6.anInt1388) {
						this.aClass44_Sub3_Sub3_1301 = var6;
					}

					if (this.aClass44_Sub3_Sub3_1301 != null) {
						var6.anInt1390 = 0;
					}
				}

				if (this.aClass44_Sub3_Sub3_1301 != null) {
					this.anInt1306 = 0;
					if (var4 == 0) {
						signlink.reporterror("Rej: " + var2 + "," + var3);
						this.aClass44_Sub3_Sub3_1301.aByteArray1389 = null;
						if (this.aClass44_Sub3_Sub3_1301.aBoolean1391) {
							synchronized(this.aClass28_1292) {
								this.aClass28_1292.method256(this.aClass44_Sub3_Sub3_1301);
							}
						} else {
							this.aClass44_Sub3_Sub3_1301.unlink();
						}

						this.aClass44_Sub3_Sub3_1301 = null;
					} else {
						if (this.aClass44_Sub3_Sub3_1301.aByteArray1389 == null && var5 == 0) {
							this.aClass44_Sub3_Sub3_1301.aByteArray1389 = new byte[var4];
						}

						if (this.aClass44_Sub3_Sub3_1301.aByteArray1389 == null && var5 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				this.anInt1302 = var5 * 500;
				this.anInt1303 = 500;
				if (this.anInt1303 > var4 - var5 * 500) {
					this.anInt1303 = var4 - var5 * 500;
				}
			}

			if (this.anInt1303 > 0 && var1 >= this.anInt1303) {
				this.aBoolean1285 = true;
				byte[] var13 = this.aByteArray1304;
				var3 = 0;
				if (this.aClass44_Sub3_Sub3_1301 != null) {
					var13 = this.aClass44_Sub3_Sub3_1301.aByteArray1389;
					var3 = this.anInt1302;
				}

				for (var4 = 0; var4 < this.anInt1303; var4 += this.anInputStream1298.read(var13, var4 + var3, this.anInt1303 - var4)) {
				}

				if (this.anInt1303 + this.anInt1302 >= var13.length && this.aClass44_Sub3_Sub3_1301 != null) {
					if (this.aClient1283.aClass45Array1225[0] != null) {
						this.aClient1283.aClass45Array1225[this.aClass44_Sub3_Sub3_1301.anInt1387 + 1].method539(var13.length, this.aClass44_Sub3_Sub3_1301.anInt1388, var13, (byte)8);
					}

					if (!this.aClass44_Sub3_Sub3_1301.aBoolean1391 && this.aClass44_Sub3_Sub3_1301.anInt1387 == 3) {
						this.aClass44_Sub3_Sub3_1301.aBoolean1391 = true;
						this.aClass44_Sub3_Sub3_1301.anInt1387 = 93;
					}

					if (this.aClass44_Sub3_Sub3_1301.aBoolean1391) {
						synchronized(this.aClass28_1292) {
							this.aClass28_1292.method256(this.aClass44_Sub3_Sub3_1301);
						}
					} else {
						this.aClass44_Sub3_Sub3_1301.unlink();
					}
				}

				this.anInt1303 = 0;
			}
		} catch (IOException var12) {
			try {
				this.aSocket1297.close();
			} catch (Exception var9) {
			}

			this.aSocket1297 = null;
			this.anInputStream1298 = null;
			this.anOutputStream1299 = null;
			this.anInt1303 = 0;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1"
	)
	public boolean method389(int var1) {
		for (int var2 = 0; var2 < this.anIntArray1276.length; ++var2) {
			if (this.anIntArray1278[var2] == var1) {
				return true;
			}
		}

		return false;
	}

	public int method393() {
		synchronized(this.aClass31_1288) {
			int var2 = this.aClass31_1288.method268();
			return var2;
		}
	}

	public int method387(int var1, int var2, boolean var3, int var4) {
		int var5 = (var2 << 8) + var4;

		for (int var6 = 0; var6 < this.anIntArray1276.length; ++var6) {
			if (var5 == this.anIntArray1276[var6]) {
				if (var1 == 0) {
					return this.anIntArray1277[var6];
				}

				return this.anIntArray1278[var6];
			}
		}

		return -1;
	}

	public void method383(Class47 var1, Client var2) {
		String[] var3 = new String[]{"model_version", "anim_version", "midi_version", "map_version"};

		byte[] var5;
		int var6;
		Class44_Sub3_Sub2 var7;
		int var8;
		for (int var4 = 0; var4 < 4; ++var4) {
			var5 = var1.method546(var3[var4], (byte[])null);
			var6 = var5.length / 2;
			var7 = new Class44_Sub3_Sub2(var5, (byte)1);
			this.anIntArrayArray1271[var4] = new int[var6];
			this.aByteArrayArray1273[var4] = new byte[var6];

			for (var8 = 0; var8 < var6; ++var8) {
				this.anIntArrayArray1271[var4][var8] = var7.get2();
			}
		}

		String[] var10 = new String[]{"model_crc", "anim_crc", "midi_crc", "map_crc"};

		int var13;
		for (int var11 = 0; var11 < 4; ++var11) {
			byte[] var12 = var1.method546(var10[var11], (byte[])null);
			var13 = var12.length / 4;
			Class44_Sub3_Sub2 var14 = new Class44_Sub3_Sub2(var12, (byte)1);
			this.anIntArrayArray1272[var11] = new int[var13];

			for (int var9 = 0; var9 < var13; ++var9) {
				this.anIntArrayArray1272[var11][var9] = var14.get4();
			}
		}

		var5 = var1.method546("model_index", (byte[])null);
		var6 = this.anIntArrayArray1271[0].length;
		this.aByteArray1275 = new byte[var6];

		for (var13 = 0; var13 < var6; ++var13) {
			if (var13 < var5.length) {
				this.aByteArray1275[var13] = var5[var13];
			} else {
				this.aByteArray1275[var13] = 0;
			}
		}

		var5 = var1.method546("map_index", (byte[])null);
		var7 = new Class44_Sub3_Sub2(var5, (byte)1);
		var6 = var5.length / 7;
		this.anIntArray1276 = new int[var6];
		this.anIntArray1277 = new int[var6];
		this.anIntArray1278 = new int[var6];
		this.anIntArray1279 = new int[var6];

		for (var8 = 0; var8 < var6; ++var8) {
			this.anIntArray1276[var8] = var7.get2();
			this.anIntArray1277[var8] = var7.get2();
			this.anIntArray1278[var8] = var7.get2();
			this.anIntArray1279[var8] = var7.get1();
		}

		var5 = var1.method546("anim_index", (byte[])null);
		var7 = new Class44_Sub3_Sub2(var5, (byte)1);
		var6 = var5.length / 2;
		this.anIntArray1280 = new int[var6];

		for (var8 = 0; var8 < var6; ++var8) {
			this.anIntArray1280[var8] = var7.get2();
		}

		var5 = var1.method546("midi_index", (byte[])null);
		var7 = new Class44_Sub3_Sub2(var5, (byte)1);
		var6 = var5.length;
		this.anIntArray1281 = new int[var6];

		for (var8 = 0; var8 < var6; ++var8) {
			this.anIntArray1281[var8] = var7.get1();
		}

		this.aClient1283 = var2;
		this.aBoolean1282 = true;
		this.aClient1283.startRunnable(this, 2);
	}

	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "836"
	)
	public int method386() {
		return this.anIntArray1280.length;
	}

	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-515"
	)
	public void method388(boolean var1) {
		int var2 = this.anIntArray1276.length;

		for (int var3 = 0; var3 < var2; ++var3) {
			if (var1 || this.anIntArray1279[var3] != 0) {
				this.method395((byte)5, this.anIntArray1278[var3], 3, (byte)2);
				this.method395((byte)5, this.anIntArray1277[var3], 3, (byte)2);
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(IZ)Z",
		garbageValue = "0"
	)
	public boolean method391(int var1) {
		return this.anIntArray1281[var1] == 1;
	}

	public void run() {
		while (true) {
			try {
				if (this.aBoolean1282) {
					++this.anInt1309;
					byte var1 = 20;
					if (this.anInt1274 == 0 && this.aClient1283.aClass45Array1225[0] != null) {
						var1 = 50;
					}

					try {
						Thread.sleep((long)var1);
					} catch (Exception var6) {
					}

					this.aBoolean1285 = true;

					for (int var2 = 0; var2 < 100 && this.aBoolean1285; ++var2) {
						this.aBoolean1285 = false;
						this.method398((byte)7);
						this.method399();
						if (this.anInt1286 == 0 && var2 >= 5) {
							break;
						}

						this.method400();
						if (this.anInputStream1298 != null) {
							this.method401();
						}
					}

					boolean var8 = false;

					Class44_Sub3_Sub3 var3;
					for (var3 = (Class44_Sub3_Sub3)this.aClass28_1291.peekFront(); var3 != null; var3 = (Class44_Sub3_Sub3)this.aClass28_1291.getPrevious(this.aByte1269)) {
						if (var3.aBoolean1391) {
							var8 = true;
							++var3.anInt1390;
							if (var3.anInt1390 > 50) {
								var3.anInt1390 = 0;
								this.method403(var3);
							}
						}
					}

					if (!var8) {
						for (var3 = (Class44_Sub3_Sub3)this.aClass28_1291.peekFront(); var3 != null; var3 = (Class44_Sub3_Sub3)this.aClass28_1291.getPrevious(this.aByte1269)) {
							var8 = true;
							++var3.anInt1390;
							if (var3.anInt1390 > 50) {
								var3.anInt1390 = 0;
								this.method403(var3);
							}
						}
					}

					if (var8) {
						++this.anInt1306;
						if (this.anInt1306 > 750) {
							try {
								this.aSocket1297.close();
							} catch (Exception var5) {
							}

							this.aSocket1297 = null;
							this.anInputStream1298 = null;
							this.anOutputStream1299 = null;
							this.anInt1303 = 0;
						}
					} else {
						this.anInt1306 = 0;
						this.loginScreenBottomText = "";
					}

					if (!this.aClient1283.aBoolean905 || this.aSocket1297 == null || this.anOutputStream1299 == null || this.anInt1274 <= 0 && this.aClient1283.aClass45Array1225[0] != null) {
						continue;
					}

					++this.anInt1307;
					if (this.anInt1307 <= 500) {
						continue;
					}

					this.anInt1307 = 0;
					this.aByteArray1304[0] = 0;
					this.aByteArray1304[1] = 0;
					this.aByteArray1304[2] = 0;
					this.aByteArray1304[3] = 10;

					try {
						this.anOutputStream1299.write(this.aByteArray1304, 0, 4);
					} catch (IOException var4) {
						this.anInt1306 = 5000;
					}
					continue;
				}
			} catch (Exception var7) {
				signlink.reporterror("od_ex " + var7.getMessage());
			}

			return;
		}
	}
}
