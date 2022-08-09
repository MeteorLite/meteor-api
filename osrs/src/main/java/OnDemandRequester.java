import audio.music.MidiPlayer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.SignLink;

public class OnDemandRequester extends Requester implements Runnable {

  public int anInt1334;
  public byte[] aByteArray1335;
  public int[] anIntArray1336;
  public byte[][] aByteArrayArray1337;
  public boolean aBoolean1338;
  public boolean aBoolean1339;
  public Deque aClass6_1340;
  public int anInt1341;
  public int anInt1342;
  public int anInt1343;
  public int[][] anIntArrayArray1344;
  public int anInt1345;
  public int[] anIntArray1346;
  public String aString1347;
  public int anInt1348;
  public OutputStream anOutputStream1349;
  public int anInt1350;
  public Deque aClass6_1351;
  public boolean aBoolean1352;
  public int anInt1353;
  public CRC32 aCRC32_1354;
  public Socket aSocket1355;
  public boolean aBoolean1356;
  public Deque aClass6_1357;
  public Deque aClass6_1358;
  public byte[] aByteArray1359;
  public int[] anIntArray1360;
  public int anInt1361;
  public int anInt1362;
  public int anInt1363;
  public byte[] aByteArray1364;
  public int[] anIntArray1365;
  public int[] anIntArray1366;
  public int anInt1367;
  public int anInt1368;
  public Queue priorityRequests;
  public InputStream anInputStream1370;
  public byte aByte1371;
  public OnDemandNode aClass50_Sub1_Sub3_1372;
  public Client aClient1373;
  public Deque aClass6_1374;
  public int anInt1375;
  public int[] anIntArray1376;
  public int[][] fileVersions;
  public long aLong1378;
  public int anInt1379;
  public boolean aBoolean1380;
  public OnDemandRequester() {
    aByteArrayArray1337 = new byte[4][];
    aBoolean1338 = false;
    aBoolean1339 = true;
    aClass6_1340 = new Deque();
    anIntArrayArray1344 = new int[4][];
    aString1347 = "";
    aClass6_1351 = new Deque();
    aBoolean1352 = false;
    aCRC32_1354 = new CRC32();
    aBoolean1356 = false;
    aClass6_1357 = new Deque();
    aClass6_1358 = new Deque();
    aByteArray1359 = new byte[65000];
    aByteArray1364 = new byte[500];
    anInt1367 = 591;
    priorityRequests = new Queue();
    aByte1371 = 6;
    aClass6_1374 = new Deque();
    fileVersions = new int[4][];
    aBoolean1380 = false;
  }

  public void method324() {
    try {
      int i = anInputStream1370.available();
      if (anInt1362 == 0 && i >= 6) {
        aBoolean1338 = true;
        for (int j = 0; j < 6; j += anInputStream1370.read(
            aByteArray1364, j, 6 - j)) {
        }
        int k = aByteArray1364[0] & 0xff;
        int i1 = ((aByteArray1364[1] & 0xff) << 8)
            + (aByteArray1364[2] & 0xff);
        int k1 = ((aByteArray1364[3] & 0xff) << 8)
            + (aByteArray1364[4] & 0xff);
        int l1 = aByteArray1364[5] & 0xff;
        aClass50_Sub1_Sub3_1372 = null;
        for (OnDemandNode class50_sub1_sub3 = (OnDemandNode) aClass6_1374
            .method158(); class50_sub1_sub3 != null;
            class50_sub1_sub3 = (OnDemandNode) aClass6_1374
                .method160()) {
          if (class50_sub1_sub3.type == k
              && class50_sub1_sub3.id == i1) {
            aClass50_Sub1_Sub3_1372 = class50_sub1_sub3;
          }
          if (aClass50_Sub1_Sub3_1372 != null) {
            class50_sub1_sub3.anInt1469 = 0;
          }
        }

        if (aClass50_Sub1_Sub3_1372 != null) {
          anInt1353 = 0;
          if (k1 == 0) {
            SignLink.reporterror("Rej: " + k + "," + i1);
            aClass50_Sub1_Sub3_1372.aByteArray1470 = null;
            if (aClass50_Sub1_Sub3_1372.priority) {
              synchronized (aClass6_1357) {
                aClass6_1357.method155(aClass50_Sub1_Sub3_1372);
              }
            } else {
              aClass50_Sub1_Sub3_1372.unlink();
            }
            aClass50_Sub1_Sub3_1372 = null;
          } else {
            if (aClass50_Sub1_Sub3_1372.aByteArray1470 == null
                && l1 == 0) {
              aClass50_Sub1_Sub3_1372.aByteArray1470 = new byte[k1];
            }
            if (aClass50_Sub1_Sub3_1372.aByteArray1470 == null
                && l1 != 0) {
              throw new IOException("missing start of file");
            }
          }
        }
        anInt1361 = l1 * 500;
        anInt1362 = 500;
        if (anInt1362 > k1 - l1 * 500) {
          anInt1362 = k1 - l1 * 500;
        }
      }
      if (anInt1362 > 0 && i >= anInt1362) {
        aBoolean1338 = true;
        byte[] abyte0 = aByteArray1364;
        int l = 0;
        if (aClass50_Sub1_Sub3_1372 != null) {
          abyte0 = aClass50_Sub1_Sub3_1372.aByteArray1470;
          l = anInt1361;
        }
        for (int j1 = 0; j1 < anInt1362; j1 += anInputStream1370.read(
            abyte0, j1 + l, anInt1362 - j1)) {
        }
        if (anInt1362 + anInt1361 >= abyte0.length
            && aClass50_Sub1_Sub3_1372 != null) {
          if (aClient1373.aClass23Array1228[0] != null) {
            aClient1373.aClass23Array1228[aClass50_Sub1_Sub3_1372.type + 1]
                .put(abyte0, abyte0.length,
                    aClass50_Sub1_Sub3_1372.id);
          }
          if (!aClass50_Sub1_Sub3_1372.priority
              && aClass50_Sub1_Sub3_1372.type == 3) {
            aClass50_Sub1_Sub3_1372.priority = true;
            aClass50_Sub1_Sub3_1372.type = 93;
          }
          if (aClass50_Sub1_Sub3_1372.priority) {
            synchronized (aClass6_1357) {
              aClass6_1357.method155(aClass50_Sub1_Sub3_1372);
            }
          } else {
            aClass50_Sub1_Sub3_1372.unlink();
          }
        }
        anInt1362 = 0;
      }
    } catch (IOException ioexception) {
      try {
        aSocket1355.close();
      } catch (Exception _ex) {
      }
      aSocket1355 = null;
      anInputStream1370 = null;
      anOutputStream1349 = null;
      anInt1362 = 0;
    }
  }

  public int method325(int i, int j) {
    while (j >= 0) {
      return anInt1367;
    }
    return aByteArray1335[i] & 0xff;
  }

  @Override
  public void method323(int i) {
    request(0, i);
  }

  public void method326(int i) {
    if (i != 0) {
      return;
    }
    while (anInt1342 == 0 && anInt1343 < 10) {
      if (anInt1341 == 0) {
        break;
      }
      OnDemandNode class50_sub1_sub3;
      synchronized (aClass6_1358) {
        class50_sub1_sub3 = (OnDemandNode) aClass6_1358
            .method157();
      }
      while (class50_sub1_sub3 != null) {
        if (aByteArrayArray1337[class50_sub1_sub3.type][class50_sub1_sub3.id] != 0) {
          aByteArrayArray1337[class50_sub1_sub3.type][class50_sub1_sub3.id] = 0;
          aClass6_1374.method155(class50_sub1_sub3);
          method342(anInt1345, class50_sub1_sub3);
          aBoolean1338 = true;
          if (anInt1334 < anInt1350) {
            anInt1334++;
          }
          aString1347 = "Loading extra files - " + anInt1334 * 100
              / anInt1350 + "%";
          anInt1343++;
          if (anInt1343 == 10) {
            return;
          }
        }
        synchronized (aClass6_1358) {
          class50_sub1_sub3 = (OnDemandNode) aClass6_1358
              .method157();
        }
      }
      for (int j = 0; j < 4; j++) {
        byte[] abyte0 = aByteArrayArray1337[j];
        int k = abyte0.length;
        for (int l = 0; l < k; l++) {
          if (abyte0[l] == anInt1341) {
            abyte0[l] = 0;
            OnDemandNode class50_sub1_sub3_1 = new OnDemandNode();
            class50_sub1_sub3_1.type = j;
            class50_sub1_sub3_1.id = l;
            class50_sub1_sub3_1.priority = false;
            aClass6_1374.method155(class50_sub1_sub3_1);
            method342(anInt1345, class50_sub1_sub3_1);
            aBoolean1338 = true;
            if (anInt1334 < anInt1350) {
              anInt1334++;
            }
            aString1347 = "Loading extra files - " + anInt1334
                * 100 / anInt1350 + "%";
            anInt1343++;
            if (anInt1343 == 10) {
              return;
            }
          }
        }

      }

      anInt1341--;
    }
  }

  public void method327(int i, int j, byte byte0, int k) {
    while (i >= 0) {
      return;
    }
    if (aClient1373.aClass23Array1228[0] == null) {
      return;
    }
    if (fileVersions[j][k] == 0) {
      return;
    }
    byte[] abyte0 = aClient1373.aClass23Array1228[j + 1].decompress(k);
    if (method341(abyte0, 764, fileVersions[j][k],
        anIntArrayArray1344[j][k])) {
      return;
    }
    aByteArrayArray1337[j][k] = byte0;
    if (byte0 > anInt1341) {
      anInt1341 = byte0;
    }
    anInt1350++;
  }

  public boolean method328(int i, boolean flag) {
    if (!flag) {
      throw new NullPointerException();
    }
    return anIntArray1366[i] == 1;
  }

  public void request(int type, int id) {
    if (type < 0 || type > fileVersions.length || id < 0
        || id > fileVersions[type].length) {
      return;
    }
    if (fileVersions[type][id] == 0) {
      return;
    }

    synchronized (priorityRequests) {

      for (OnDemandNode onDemandRequests = (OnDemandNode) priorityRequests
          .getFront(); onDemandRequests != null;
          onDemandRequests = (OnDemandNode) priorityRequests
              .getNext()) {
        if (onDemandRequests.type == type
            && onDemandRequests.id == id) {
          return;
        }
      }

      OnDemandNode onDemandRequest = new OnDemandNode();
      onDemandRequest.type = type;
      onDemandRequest.id = id;
      onDemandRequest.priority = true;
      synchronized (aClass6_1340) {
        aClass6_1340.method155(onDemandRequest);
      }
      priorityRequests.insertBack(onDemandRequest);
    }
  }

  public OnDemandNode method330() {
    OnDemandNode class50_sub1_sub3;
    synchronized (aClass6_1357) {
      class50_sub1_sub3 = (OnDemandNode) aClass6_1357.method157();
    }
    if (class50_sub1_sub3 == null) {
      return null;
    }
    synchronized (priorityRequests) {
      class50_sub1_sub3.unlinkCacheable();
    }
    if (class50_sub1_sub3.aByteArray1470 == null) {
      return class50_sub1_sub3;
    }
    int i = 0;
    try {
      GZIPInputStream gzipinputstream = new GZIPInputStream(
          new ByteArrayInputStream(class50_sub1_sub3.aByteArray1470));
      do {
        if (i == aByteArray1359.length) {
          throw new RuntimeException("buffer overflow!");
        }
        int k = gzipinputstream.read(aByteArray1359, i,
            aByteArray1359.length - i);
        if (k == -1) {
          break;
        }
        i += k;
      } while (true);
    } catch (IOException _ex) {
      throw new RuntimeException("error unzipping");
    }
    class50_sub1_sub3.aByteArray1470 = new byte[i];
    System.arraycopy(aByteArray1359, 0, class50_sub1_sub3.aByteArray1470, 0, i);

    return class50_sub1_sub3;
  }

  @Override
  public void run() {
    try {
      while (aBoolean1339) {
        anInt1348++;
        int i = 20;
        if (anInt1341 == 0 && aClient1373.aClass23Array1228[0] != null) {
          i = 50;
        }
        try {
          Thread.sleep(i);
        } catch (Exception _ex) {
        }
        aBoolean1338 = true;
        for (int j = 0; j < 100; j++) {
          if (!aBoolean1338) {
            break;
          }
          aBoolean1338 = false;
          method338(true);
          method331(0);
          if (anInt1342 == 0 && j >= 5) {
            break;
          }
          method326(0);
          if (anInputStream1370 != null) {
            method324();
          }
        }

        boolean flag = false;
        for (OnDemandNode class50_sub1_sub3 = (OnDemandNode) aClass6_1374
            .method158(); class50_sub1_sub3 != null;
            class50_sub1_sub3 = (OnDemandNode) aClass6_1374
                .method160()) {
          if (class50_sub1_sub3.priority) {
            flag = true;
            class50_sub1_sub3.anInt1469++;
            if (class50_sub1_sub3.anInt1469 > 50) {
              class50_sub1_sub3.anInt1469 = 0;
              method342(anInt1345, class50_sub1_sub3);
            }
          }
        }

        if (!flag) {
          for (OnDemandNode class50_sub1_sub3_1 = (OnDemandNode) aClass6_1374
              .method158(); class50_sub1_sub3_1 != null;
              class50_sub1_sub3_1 = (OnDemandNode) aClass6_1374
                  .method160()) {
            flag = true;
            class50_sub1_sub3_1.anInt1469++;
            if (class50_sub1_sub3_1.anInt1469 > 50) {
              class50_sub1_sub3_1.anInt1469 = 0;
              method342(anInt1345, class50_sub1_sub3_1);
            }
          }

        }
        if (flag) {
          anInt1353++;
          if (anInt1353 > 750) {
            try {
              aSocket1355.close();
            } catch (Exception _ex) {
            }
            aSocket1355 = null;
            anInputStream1370 = null;
            anOutputStream1349 = null;
            anInt1362 = 0;
          }
        } else {
          anInt1353 = 0;
          aString1347 = "";
        }
        if (aClient1373.aBoolean1137
            && aSocket1355 != null
            && anOutputStream1349 != null
            && (anInt1341 > 0 || aClient1373.aClass23Array1228[0] == null)) {
          anInt1375++;
          if (anInt1375 > 500) {
            anInt1375 = 0;
            aByteArray1364[0] = 0;
            aByteArray1364[1] = 0;
            aByteArray1364[2] = 0;
            aByteArray1364[3] = 10;
            try {
              anOutputStream1349.write(aByteArray1364, 0, 4);
            } catch (IOException _ex) {
              anInt1353 = 5000;
            }
          }
        }
      }
    } catch (Exception exception) {
      SignLink.reporterror("od_ex " + exception.getMessage());
    }
  }

  public void method331(int i) {
    anInt1342 = 0;
    anInt1343 = 0;
    if (i != 0) {
      return;
    }
    for (OnDemandNode class50_sub1_sub3 = (OnDemandNode) aClass6_1374
        .method158(); class50_sub1_sub3 != null;
        class50_sub1_sub3 = (OnDemandNode) aClass6_1374
            .method160()) {
      if (class50_sub1_sub3.priority) {
        anInt1342++;
      } else {
        anInt1343++;
      }
    }

    while (anInt1342 < 10) {
      OnDemandNode class50_sub1_sub3_1 = (OnDemandNode) aClass6_1351
          .method157();
      if (class50_sub1_sub3_1 == null) {
        break;
      }
      if (aByteArrayArray1337[class50_sub1_sub3_1.type][class50_sub1_sub3_1.id] != 0) {
        anInt1334++;
      }
      aByteArrayArray1337[class50_sub1_sub3_1.type][class50_sub1_sub3_1.id] = 0;
      aClass6_1374.method155(class50_sub1_sub3_1);
      anInt1342++;
      method342(anInt1345, class50_sub1_sub3_1);
      aBoolean1338 = true;
    }
  }

  public void method332(boolean flag, byte byte0) {
    if (byte0 != 109) {
      aBoolean1352 = !aBoolean1352;
    }
    int i = anIntArray1346.length;
    for (int j = 0; j < i; j++) {
      if (flag || anIntArray1336[j] != 0) {
        method327(-44, 3, (byte) 2, anIntArray1365[j]);
        method327(-44, 3, (byte) 2, anIntArray1360[j]);
      }
    }

  }

  public int method333() {
    synchronized (priorityRequests) {
      int i = priorityRequests.size();
      return i;
    }
  }

  public boolean method334(int i, boolean flag) {
    for (int j = 0; j < anIntArray1346.length; j++) {
      if (anIntArray1365[j] == i) {
        return true;
      }
    }

    if (flag) {
      anInt1363 = -405;
    }
    return false;
  }

  public void method335(Archive archive, Client client1) {
    String[] as = {"model_version", "anim_version", "midi_version",
        "map_version"};
    for (int i = 0; i < 4; i++) {
      byte[] abyte0 = archive.extract(as[i]);
      int j = abyte0.length / 2;
      Buffer class50_sub1_sub2 = new Buffer(abyte0);
      fileVersions[i] = new int[j];
      aByteArrayArray1337[i] = new byte[j];
      for (int l = 0; l < j; l++) {
        fileVersions[i][l] = class50_sub1_sub2.readUShort();
      }

    }

    String[] as1 = {"model_crc", "anim_crc", "midi_crc", "map_crc"};
    for (int k = 0; k < 4; k++) {
      byte[] abyte1 = archive.extract(as1[k]);
      int i1 = abyte1.length / 4;
      Buffer class50_sub1_sub2_1 = new Buffer(abyte1);
      anIntArrayArray1344[k] = new int[i1];
      for (int l1 = 0; l1 < i1; l1++) {
        anIntArrayArray1344[k][l1] = class50_sub1_sub2_1.readInt();
      }

    }

    byte[] abyte2 = archive.extract("model_index");
    int j1 = fileVersions[0].length;
    aByteArray1335 = new byte[j1];
    for (int k1 = 0; k1 < j1; k1++) {
      if (k1 < abyte2.length) {
        aByteArray1335[k1] = abyte2[k1];
      } else {
        aByteArray1335[k1] = 0;
      }
    }

    abyte2 = archive.extract("map_index");
    Buffer class50_sub1_sub2_2 = new Buffer(abyte2);
    j1 = abyte2.length / 7;
    anIntArray1346 = new int[j1];
    anIntArray1360 = new int[j1];
    anIntArray1365 = new int[j1];
    anIntArray1336 = new int[j1];
    for (int i2 = 0; i2 < j1; i2++) {
      anIntArray1346[i2] = class50_sub1_sub2_2.readUShort();
      anIntArray1360[i2] = class50_sub1_sub2_2.readUShort();
      anIntArray1365[i2] = class50_sub1_sub2_2.readUShort();
      anIntArray1336[i2] = class50_sub1_sub2_2.readUByte();
    }

    abyte2 = archive.extract("anim_index");
    class50_sub1_sub2_2 = new Buffer(abyte2);
    j1 = abyte2.length / 2;
    anIntArray1376 = new int[j1];
    for (int j2 = 0; j2 < j1; j2++) {
      anIntArray1376[j2] = class50_sub1_sub2_2.readUShort();
    }

    abyte2 = archive.extract("midi_index");
    class50_sub1_sub2_2 = new Buffer(abyte2);
    j1 = abyte2.length;
    anIntArray1366 = new int[j1];
    for (int k2 = 0; k2 < j1; k2++) {
      anIntArray1366[k2] = class50_sub1_sub2_2.readUByte();
    }

    aClient1373 = client1;
    aBoolean1339 = true;
    aClient1373.method12(this, 2);
  }

  public void method336(byte byte0) {
    synchronized (aClass6_1358) {
      aClass6_1358.method162();
    }
    if (byte0 != -125) {
      aBoolean1352 = !aBoolean1352;
    }
  }

  public void method337(int i, int j, byte byte0) {
    if (aClient1373.aClass23Array1228[0] == null) {
      return;
    }
    if (fileVersions[j][i] == 0) {
      return;
    }
    if (aByteArrayArray1337[j][i] == 0) {
      return;
    }
    if (anInt1341 == 0) {
      return;
    }
    OnDemandNode class50_sub1_sub3 = new OnDemandNode();
    if (byte0 != -113) {
      anInt1367 = 244;
    }
    class50_sub1_sub3.type = j;
    class50_sub1_sub3.id = i;
    class50_sub1_sub3.priority = false;
    synchronized (aClass6_1358) {
      aClass6_1358.method155(class50_sub1_sub3);
    }
  }

  public void method338(boolean flag) {
    OnDemandNode class50_sub1_sub3;
    synchronized (aClass6_1340) {
      class50_sub1_sub3 = (OnDemandNode) aClass6_1340.method157();
    }
    if (!flag) {
      for (int i = 1; i > 0; i++) {
      }
    }
    while (class50_sub1_sub3 != null) {
      aBoolean1338 = true;
      byte[] abyte0 = null;
      if (aClient1373.aClass23Array1228[0] != null) {
        abyte0 = aClient1373.aClass23Array1228[class50_sub1_sub3.type + 1]
            .decompress(class50_sub1_sub3.id);
      }
      if (!method341(
          abyte0,
          764,
          fileVersions[class50_sub1_sub3.type][class50_sub1_sub3.id],
          anIntArrayArray1344[class50_sub1_sub3.type][class50_sub1_sub3.id])) {
        abyte0 = null;
      }
      synchronized (aClass6_1340) {
        if (abyte0 == null) {
          aClass6_1351.method155(class50_sub1_sub3);
        } else {
          class50_sub1_sub3.aByteArray1470 = abyte0;
          synchronized (aClass6_1357) {
            aClass6_1357.method155(class50_sub1_sub3);
          }
        }
        class50_sub1_sub3 = (OnDemandNode) aClass6_1340
            .method157();
      }
    }
  }

  public void method339() {
    aBoolean1339 = false;
  }

  public int method340(int i, int j) {
    if (j != -31140) {
      aBoolean1380 = !aBoolean1380;
    }
    return fileVersions[i].length;
  }

  public boolean method341(byte[] abyte0, int i, int j, int k) {
    i = 22 / i;
    if (abyte0 == null || abyte0.length < 2) {
      return false;
    }
    int l = abyte0.length - 2;
    int i1 = ((abyte0[l] & 0xff) << 8) + (abyte0[l + 1] & 0xff);
    aCRC32_1354.reset();
    aCRC32_1354.update(abyte0, 0, l);
    int j1 = (int) aCRC32_1354.getValue();
    if (i1 != j) {
      return false;
    }
    return j1 == k;
  }

  public void method342(int i, OnDemandNode class50_sub1_sub3) {
    if (i != 0) {
      return;
    }
    try {
      if (aSocket1355 == null) {
        long l = System.currentTimeMillis();
        if (l - aLong1378 < 4000L) {
          return;
        }
        aLong1378 = l;
        aSocket1355 = aClient1373.openSocket(43594 + Client.portOffset);
        anInputStream1370 = aSocket1355.getInputStream();
        anOutputStream1349 = aSocket1355.getOutputStream();
        anOutputStream1349.write(15);
        for (int j = 0; j < 8; j++) {
          anInputStream1370.read();
        }

        anInt1353 = 0;
      }
      aByteArray1364[0] = (byte) class50_sub1_sub3.type;
      aByteArray1364[1] = (byte) (class50_sub1_sub3.id >> 8);
      aByteArray1364[2] = (byte) class50_sub1_sub3.id;
      if (class50_sub1_sub3.priority) {
        aByteArray1364[3] = 2;
      } else if (!aClient1373.aBoolean1137) {
        aByteArray1364[3] = 1;
      } else {
        aByteArray1364[3] = 0;
      }
      anOutputStream1349.write(aByteArray1364, 0, 4);
      anInt1375 = 0;
      anInt1379 = -10000;
      return;
    } catch (IOException ioexception) {
    }
    try {
      aSocket1355.close();
    } catch (Exception _ex) {
    }
    aSocket1355 = null;
    anInputStream1370 = null;
    anOutputStream1349 = null;
    anInt1362 = 0;
    anInt1379++;
  }

  public int method343(int i) {
    i = 0 / i;
    return anIntArray1376.length;
  }

  public int method344(int i, int j, int k, int l) {
    if (i != 0) {
      return 1;
    }
    int i1 = (j << 8) + k;
    for (int j1 = 0; j1 < anIntArray1346.length; j1++) {
      if (anIntArray1346[j1] == i1) {
        if (l == 0) {
          return anIntArray1360[j1];
        } else {
          return anIntArray1365[j1];
        }
      }
    }

    return -1;
  }
}
