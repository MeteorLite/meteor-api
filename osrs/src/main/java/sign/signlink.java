package sign;

import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class signlink implements Runnable {
	public static int threadreqpri;
	public static int midifade;
	public static String dns;
	public static int storeid;
	public static String urlreq;
	public static int socketreq;
	public static String errorname;
	public static String savereq;
	public static boolean active;
	public static boolean reporterror;
	public static final Applet mainapp;
	public static int threadliveid;
	public static int wavevol;
	public static byte[] savebuf;
	public static Runnable threadreq;
	public static String midi;
	public static String dnsreq;
	public static RandomAccessFile cache_dat;
	public static boolean sunjava;
	public static int midipos;
	public static int wavepos;
	public static int midivol;
	public static DataInputStream urlstream;
	public static Socket socket;
	public static boolean waveplay;
	public static final RandomAccessFile[] cache_idx;
	public static int savelen;
	public static boolean midiplay;
	public static InetAddress socketip;
	public static String wave;
	public static int uid;

	static {
		storeid = 32;
		cache_dat = null;
		cache_idx = new RandomAccessFile[5];
		mainapp = null;
		socket = null;
		threadreqpri = 1;
		threadreq = null;
		dnsreq = null;
		dns = null;
		urlreq = null;
		urlstream = null;
		savereq = null;
		savebuf = null;
		midi = null;
		wave = null;
		reporterror = true;
		errorname = "";
	}

	public void run() {
		active = true;
		String var1 = findcachedir();
		uid = getuid(var1);

		try {
			File var2 = new File(var1 + "main_file_cache.dat");
			if (var2.exists() && var2.length() > 52428800L) {
				var2.delete();
			}

			cache_dat = new RandomAccessFile(var1 + "main_file_cache.dat", "rw");

			for (int var3 = 0; var3 < 5; ++var3) {
				cache_idx[var3] = new RandomAccessFile(var1 + "main_file_cache.idx" + var3, "rw");
			}
		} catch (Exception var9) {
			var9.printStackTrace();
		}

		int var10 = threadliveid;

		while (var10 == threadliveid) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (Exception var4) {
					socket = null;
				}

				socketreq = 0;
			} else if (threadreq != null) {
				Thread var11 = new Thread(threadreq);
				var11.setDaemon(true);
				var11.start();
				var11.setPriority(threadreqpri);
				threadreq = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (Exception var8) {
					dns = "unknown";
				}

				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null) {
					try {
						FileOutputStream var12 = new FileOutputStream(var1 + savereq);
						var12.write(savebuf, 0, savelen);
						var12.close();
					} catch (Exception var7) {
					}
				}

				if (waveplay) {
					wave = var1 + savereq;
					waveplay = false;
				}

				if (midiplay) {
					midi = var1 + savereq;
					midiplay = false;
				}

				savereq = null;
			} else if (urlreq != null) {
				try {
					urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
				} catch (Exception var6) {
					urlstream = null;
				}

				urlreq = null;
			}

			try {
				Thread.sleep(50L);
			} catch (Exception var5) {
			}
		}

	}

	public static synchronized boolean wavereplay() {
		if (savereq != null) {
			return false;
		} else {
			savebuf = null;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		}
	}

	public static synchronized boolean wavesave(byte[] var0, int var1) {
		if (var1 > 2000000) {
			return false;
		} else if (savereq != null) {
			return false;
		} else {
			wavepos = (wavepos + 1) % 5;
			savelen = var1;
			savebuf = var0;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		}
	}

	public static String findcachedir() {
		String[] var0 = new String[]{"c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", "~/", "/tmp/", "", "c:/rscache", "/rscache"};
		if (storeid < 32 || storeid > 34) {
			storeid = 32;
		}

		String var1 = ".file_store_" + storeid;
		String[] var2 = var0;
		int var3 = var0.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			String var5 = var2[var4];

			try {
				File var7;
				if (var5.length() > 0) {
					var7 = new File(var5);
					if (!var7.exists()) {
						continue;
					}
				}

				var7 = new File(var5 + var1);
				if (var7.exists() || var7.mkdir()) {
					return var5 + var1 + "/";
				}
			} catch (Exception var8) {
			}
		}

		return null;
	}

	public static synchronized Socket opensocket(int var0) throws IOException {
		socketreq = var0;

		while (socketreq != 0) {
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}

		if (socket == null) {
			throw new IOException("could not open socket");
		} else {
			return socket;
		}
	}

	public static synchronized void midisave(byte[] var0, int var1) {
		if (var1 <= 2000000) {
			if (savereq == null) {
				midipos = (midipos + 1) % 5;
				savelen = var1;
				savebuf = var0;
				midiplay = true;
				savereq = "jingle" + midipos + ".mid";
			}

		}
	}

	public static synchronized DataInputStream openurl(String var0) throws IOException {
		urlreq = var0;

		while (urlreq != null) {
			try {
				Thread.sleep(50L);
			} catch (Exception var2) {
			}
		}

		if (urlstream == null) {
			throw new IOException("could not open: " + var0);
		} else {
			return urlstream;
		}
	}

	public static void reporterror(String var0) {
		if (reporterror) {
			if (active) {
				System.out.println("Error: " + var0);

				try {
					var0 = var0.replace(':', '_');
					var0 = var0.replace('@', '_');
					var0 = var0.replace('&', '_');
					var0 = var0.replace('#', '_');
					DataInputStream var1 = openurl("reporterror274.cgi?error=" + errorname + " " + var0);
					var1.readLine();
					var1.close();
				} catch (IOException var2) {
				}

			}
		}
	}

	public static void startpriv(InetAddress var0) {
		threadliveid = (int)(Math.random() * 9.9999999E7D);
		if (active) {
			try {
				Thread.sleep(500L);
			} catch (Exception var4) {
			}

			active = false;
		}

		socketreq = 0;
		threadreq = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = var0;
		Thread var1 = new Thread(new signlink());
		var1.setDaemon(true);
		var1.start();

		while (!active) {
			try {
				Thread.sleep(50L);
			} catch (Exception var3) {
			}
		}

	}

	public static int getuid(String var0) {
		try {
			File var1 = new File(var0 + "uid.dat");
			if (!var1.exists() || var1.length() < 4L) {
				DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var0 + "uid.dat"));
				var2.writeInt((int)(Math.random() * 9.9999999E7D));
				var2.close();
			}
		} catch (Exception var4) {
		}

		try {
			DataInputStream var5 = new DataInputStream(new FileInputStream(var0 + "uid.dat"));
			int var6 = var5.readInt();
			var5.close();
			return var6 + 1;
		} catch (Exception var3) {
			return 0;
		}
	}

	public static synchronized void dnslookup(String var0) {
		dns = var0;
		dnsreq = var0;
	}

	public static synchronized void startthread(Runnable var0, int var1) {
		threadreqpri = var1;
		threadreq = var0;
	}
}
