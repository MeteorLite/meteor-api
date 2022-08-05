import java.io.IOException;
import net.runelite.mapping.ObfuscatedSignature;
import sign.signlink;

public class Packets {

  public static final int[] packetSizes;

  static {
    packetSizes = new int[]{0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 4, 2, -1, 0, 0, 0, 0, 0,
        2, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, 0, 3,
        0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 5, 0, 1,
        0, 6, 0, 0, 0, 2, 1, 10, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, -2, 15, 0, 0, 0, 0, 0, 0,
        3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, 2, 0, 0, 3, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 6, 0, 4, 0, 0, -1, 0, 0, 0, 0, 2, -2, 0, 0, 0, 0, -2, 2, 0,
        0, 14, 0, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 1, -2, 0, -2, 0, 0, 6, 0, 0, 3, 0,
        0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 4, 0, 6, 0,
        -1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 6, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  }

  @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "0"
  )
  public static boolean handleServerPacket(Client client) {
    if (client.aClass7_1108 == null) {
      return false;
    } else {
      int var3;
      try {
        int var1 = client.aClass7_1108.method193();
        if (var1 == 0) {
          return false;
        }

        if (client.incomingPacketOpcode == -1) {
          client.aClass7_1108.method194(client.buffer.array, 0, 1);
          client.incomingPacketOpcode = client.buffer.array[0] & 255;
          if (client.aClass46_944 != null) {
            client.incomingPacketOpcode =
                client.incomingPacketOpcode - client.aClass46_944.method542() & 255;
          }

          client.incomingPacketSize = packetSizes[client.incomingPacketOpcode];
          --var1;
        }

        if (client.incomingPacketSize == -1) {
          if (var1 <= 0) {
            return false;
          }

          client.aClass7_1108.method194(client.buffer.array, 0, 1);
          client.incomingPacketSize = client.buffer.array[0] & 255;
          --var1;
        }

        if (client.incomingPacketSize == -2) {
          if (var1 <= 1) {
            return false;
          }

          client.aClass7_1108.method194(client.buffer.array, 0, 2);
          client.buffer.offset = 0;
          client.incomingPacketSize = client.buffer.readUShort();
          var1 -= 2;
        }

        if (var1 < client.incomingPacketSize) {
          return false;
        }

        client.buffer.offset = 0;
        client.aClass7_1108.method194(client.buffer.array, 0, client.incomingPacketSize);
        client.anInt1221 = 0;
        client.anInt1140 = client.anInt1139;
        client.anInt1139 = client.anInt1138;
        client.anInt1138 = client.incomingPacketOpcode;
        if (client.incomingPacketOpcode == 207) {
          client.anInt818 = client.buffer.readUByte();
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 241) {
          client.anInt1013 = client.buffer.readUByte();
          client.aBoolean928 = true;
          client.aBoolean841 = true;
          client.incomingPacketOpcode = -1;
          return true;
        }

        int var22;
        if (client.incomingPacketOpcode == 203) {
          var22 = client.buffer.readUShort();
          byte var48 = client.buffer.readByte();
          client.anIntArray1172[var22] = var48;
          if (var48 != client.anIntArray1107[var22]) {
            client.anIntArray1107[var22] = var48;
            client.method40(false, var22);
            client.aBoolean928 = true;
            if (client.anInt1110 != -1) {
              client.aBoolean1109 = true;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 115) {
          client.anInt1025 = 0;
          client.incomingPacketOpcode = -1;
          return true;
        }

        int var4;
        int var5;
        if (client.incomingPacketOpcode == 64) {
          var22 = client.buffer.readUByte();
          var3 = client.buffer.readUByte();
          var4 = client.buffer.readUByte();
          var5 = client.buffer.readUByte();
          client.aBooleanArray1161[var22] = true;
          client.anIntArray998[var22] = var3;
          client.anIntArray904[var22] = var4;
          client.anIntArray844[var22] = var5;
          client.anIntArray968[var22] = 0;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 95 || client.incomingPacketOpcode == 176
            || client.incomingPacketOpcode == 219 || client.incomingPacketOpcode == 85
            || client.incomingPacketOpcode == 107 || client.incomingPacketOpcode == 52
            || client.incomingPacketOpcode == 81 || client.incomingPacketOpcode == 48
            || client.incomingPacketOpcode == 173 || client.incomingPacketOpcode == 138) {
          client.method67(client.incomingPacketOpcode, 220, client.buffer);
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 211) {
          var22 = client.buffer.readUShort();
          client.method28(var22);
          if (client.anInt1216 != -1) {
            client.anInt1216 = -1;
            client.aBoolean928 = true;
            client.aBoolean841 = true;
          }

          if (client.anInt1011 != -1) {
            client.anInt1011 = -1;
            client.aBoolean1109 = true;
          }

          if (client.aBoolean1104) {
            client.aBoolean1104 = false;
            client.aBoolean1109 = true;
          }

          client.anInt1037 = var22;
          client.aBoolean1168 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 192) {
          var22 = client.buffer.readUShort();
          Class5.aClass5Array103[var22].anInt152 = 3;
          Class5.aClass5Array103[var22].anInt153 =
              (Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1662[4] << 18) + (
                  Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1662[0] << 24) + (
                  Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[0] << 12)
                  + Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[11] + (
                  Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[8] << 6);
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 210) {
          client.aBoolean1265 = false;
          client.aBoolean1104 = true;
          client.aString1182 = "";
          client.aBoolean1109 = true;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 130) {
          var22 = client.buffer.readShort();
          client.anInt1110 = var22;
          client.aBoolean1109 = true;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 167) {
          client.method111(client.incomingPacketSize, (byte) -44, client.buffer);
          client.aBoolean1249 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 34) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUByte();
          var4 = client.buffer.readUShort();
          if (client.aBoolean1080 && !Client.isLowMemory && client.anInt929 < 50) {
            client.anIntArray1048[client.anInt929] = var22;
            client.anIntArray804[client.anInt929] = var3;
            client.anIntArray1083[client.anInt929] = Class4.anIntArray95[var22] + var4;
            ++client.anInt929;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 91) {
          client.anInt970 = client.buffer.readInt();
          client.anInt1010 = client.buffer.readUShort();
          client.anInt1029 = client.buffer.readUByte();
          client.anInt887 = client.buffer.readUShort();
          client.anInt1100 = client.buffer.readUByte();
          if (client.anInt970 != 0 && client.anInt1037 == -1) {
            signlink.dnslookup(Statics.method550((byte) 94, client.anInt970));
            client.method45();
            short var49 = 650;
            if (client.anInt1029 != 201 || client.anInt1100 == 1) {
              var49 = 655;
            }

            client.aString951 = "";
            client.aBoolean1128 = false;

            for (var3 = 0; var3 < Class5.aClass5Array103.length; ++var3) {
              if (Class5.aClass5Array103[var3] != null
                  && var49 == Class5.aClass5Array103[var3].anInt112) {
                client.anInt1037 = Class5.aClass5Array103[var3].anInt109;
                break;
              }
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 88) {
          client.method80();
          client.incomingPacketOpcode = -1;
          return false;
        }

        Class5 var39;
        if (client.incomingPacketOpcode == 134) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readShort();
          var39 = Class5.aClass5Array103[var22];
          var39.anInt156 = var3;
          if (var3 == -1) {
            var39.anInt106 = 0;
            var39.anInt107 = 0;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 156) {
          client.anInt1200 = client.buffer.readUByte();
          if (client.anInt1200 == 1) {
            client.anInt920 = client.buffer.readUShort();
          }

          if (client.anInt1200 >= 2 && client.anInt1200 <= 6) {
            if (client.anInt1200 == 2) {
              client.anInt1165 = 64;
              client.anInt1166 = 64;
            }

            if (client.anInt1200 == 3) {
              client.anInt1165 = 0;
              client.anInt1166 = 64;
            }

            if (client.anInt1200 == 4) {
              client.anInt1165 = 128;
              client.anInt1166 = 64;
            }

            if (client.anInt1200 == 5) {
              client.anInt1165 = 64;
              client.anInt1166 = 0;
            }

            if (client.anInt1200 == 6) {
              client.anInt1165 = 64;
              client.anInt1166 = 128;
            }

            client.anInt1200 = 2;
            client.anInt1162 = client.buffer.readUShort();
            client.anInt1163 = client.buffer.readUShort();
            client.anInt1164 = client.buffer.readUByte();
          }

          if (client.anInt1200 == 10) {
            client.anInt1181 = client.buffer.readUShort();
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 67) {
          if (client.anInt1013 == 12) {
            client.aBoolean928 = true;
          }

          client.anInt921 = client.buffer.readShort();
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 3) {
          client.anInt961 = client.incomingPacketSize / 8;

          for (var22 = 0; var22 < client.anInt961; ++var22) {
            client.aLongArray817[var22] = client.buffer.readLong(0);
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 142) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          Class5.aClass5Array103[var22].anInt152 = 2;
          Class5.aClass5Array103[var22].anInt153 = var3;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 215) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUByte();
          if (var22 == 65535) {
            var22 = -1;
          }

          client.anIntArray954[var3] = var22;
          client.aBoolean928 = true;
          client.aBoolean841 = true;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 153) {
          client.anInt918 = client.buffer.readUByte();
          client.anInt919 = client.buffer.readUByte();

          for (var22 = client.anInt918; var22 < client.anInt918 + 8; ++var22) {
            for (var3 = client.anInt919; var3 < client.anInt919 + 8; ++var3) {
              if (client.aClass28ArrayArrayArray816[client.clientPlane][var22][var3] != null) {
                client.aClass28ArrayArrayArray816[client.clientPlane][var22][var3] = null;
                client.method52(var22, var3);
              }
            }
          }

          for (GameObjectSpawnRequest var47
              = (GameObjectSpawnRequest) client.pendingObjectSpawns.peekFront();
              var47 != null;
              var47 = (GameObjectSpawnRequest) client.pendingObjectSpawns.getPrevious(
                  client.aByte958)) {
            if (var47.anInt1312 >= client.anInt918 && var47.anInt1312 < client.anInt918 + 8
                && var47.anInt1313 >= client.anInt919 && var47.anInt1313 < client.anInt919 + 8
                && var47.anInt1310 == client.clientPlane) {
              var47.delayUntilSpawn = 0;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 114) {
          client.anInt967 = client.buffer.readUByte();
          client.anInt972 = client.buffer.readUByte();
          client.anInt805 = client.buffer.readUByte();
          client.aBoolean1141 = true;
          client.aBoolean1109 = true;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 158) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          if (client.anInt1011 != -1) {
            client.anInt1011 = -1;
            client.aBoolean1109 = true;
          }

          if (client.aBoolean1104) {
            client.aBoolean1104 = false;
            client.aBoolean1109 = true;
          }

          client.anInt1037 = var22;
          client.anInt1216 = var3;
          client.aBoolean928 = true;
          client.aBoolean841 = true;
          client.aBoolean1168 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 240) {
          var22 = client.buffer.readShort();
          if (var22 >= 0) {
            client.method28(var22);
          }

          client.anInt1103 = var22;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 195) {
          client.anInt918 = client.buffer.readUByte();
          client.anInt919 = client.buffer.readUByte();

          while (client.buffer.offset < client.incomingPacketSize) {
            var22 = client.buffer.readUByte();
            client.method67(var22, 220, client.buffer);
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        boolean var6;
        int var7;
        String var37;
        if (client.incomingPacketOpcode == 161) {
          String var43 = client.buffer.readString();
          long var44;
          if (var43.endsWith(":tradereq:")) {
            var37 = var43.substring(0, var43.indexOf(":"));
            var44 = Statics.method547(var37);
            var6 = false;

            for (var7 = 0; var7 < client.anInt961; ++var7) {
              if (client.aLongArray817[var7] == var44) {
                var6 = true;
                break;
              }
            }

            if (!var6 && client.anInt890 == 0) {
              client.method49(-476, 4, var37, "wishes to trade with you.");
            }
          } else if (!var43.endsWith(":duelreq:")) {
            client.method49(-476, 0, "", var43);
          } else {
            var37 = var43.substring(0, var43.indexOf(":"));
            var44 = Statics.method547(var37);
            var6 = false;

            for (var7 = 0; var7 < client.anInt961; ++var7) {
              if (client.aLongArray817[var7] == var44) {
                var6 = true;
                break;
              }
            }

            if (!var6 && client.anInt890 == 0) {
              client.method49(-476, 8, var37, "wishes to duel with you.");
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 101) {
          client.aBoolean1008 = false;

          for (var22 = 0; var22 < 5; ++var22) {
            client.aBooleanArray1161[var22] = false;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 16) {
          var22 = client.buffer.readUShort();
          client.method28(var22);
          if (client.anInt1011 != -1) {
            client.anInt1011 = -1;
            client.aBoolean1109 = true;
          }

          if (client.aBoolean1104) {
            client.aBoolean1104 = false;
            client.aBoolean1109 = true;
          }

          client.anInt1216 = var22;
          client.aBoolean928 = true;
          client.aBoolean841 = true;
          client.anInt1037 = -1;
          client.aBoolean1168 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 44) {
          var22 = client.buffer.readUShort();
          var37 = client.buffer.readString();
          Class5.aClass5Array103[var22].aString144 = var37;
          if (Class5.aClass5Array103[var22].anInt109 == client.anIntArray954[client.anInt1013]) {
            client.aBoolean928 = true;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 245) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readInt();
          client.anIntArray1172[var22] = var3;
          if (var3 != client.anIntArray1107[var22]) {
            client.anIntArray1107[var22] = var3;
            client.method40(false, var22);
            client.aBoolean928 = true;
            if (client.anInt1110 != -1) {
              client.aBoolean1109 = true;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 166) {
          var22 = client.buffer.readUShort();
          client.method28(var22);
          if (client.anInt1216 != -1) {
            client.anInt1216 = -1;
            client.aBoolean928 = true;
            client.aBoolean841 = true;
          }

          client.anInt1011 = var22;
          client.aBoolean1109 = true;
          client.anInt1037 = -1;
          client.aBoolean1168 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 28) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          var4 = client.buffer.readUShort();
          Class14 var45 = Class14.method220(var3);
          Class5.aClass5Array103[var22].anInt152 = 4;
          Class5.aClass5Array103[var22].anInt153 = var3;
          Class5.aClass5Array103[var22].anInt159 = var45.anInt332;
          Class5.aClass5Array103[var22].anInt160 = var45.anInt333;
          Class5.aClass5Array103[var22].anInt158 = var45.anInt331 * 100 / var4;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 54) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          var39 = Class5.aClass5Array103[var22];
          if (var39 != null && var39.anInt110 == 0) {
            if (var3 < 0) {
              var3 = 0;
            }

            if (var3 > var39.anInt122 - var39.anInt114) {
              var3 = var39.anInt122 - var39.anInt114;
            }

            var39.anInt123 = var3;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 47) {
          Class44_Sub3_Sub4_Sub6_Sub1[] var29 = client.aClass44_Sub3_Sub4_Sub6_Sub1Array1120;
          var3 = var29.length;

          for (var4 = 0; var4 < var3; ++var4) {
            Class44_Sub3_Sub4_Sub6_Sub1 var40 = var29[var4];
            if (var40 != null) {
              var40.anInt1627 = -1;
            }
          }

          Class44_Sub3_Sub4_Sub6_Sub2[] var31 = client.aClass44_Sub3_Sub4_Sub6_Sub2Array1259;
          var3 = var31.length;

          for (var4 = 0; var4 < var3; ++var4) {
            Class44_Sub3_Sub4_Sub6_Sub2 var41 = var31[var4];
            if (var41 != null) {
              var41.anInt1627 = -1;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 194) {
          client.anInt1031 = client.buffer.readUByte();
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 90) {
          client.anInt1173 = client.buffer.readUByte();
          if (client.anInt1173 == client.anInt1013) {
            if (client.anInt1173 == 3) {
              client.anInt1013 = 1;
            } else {
              client.anInt1013 = 3;
            }

            client.aBoolean928 = true;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 89) {
          client.anInt803 = client.buffer.readUShort() * 30;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 190) {
          for (var22 = 0; var22 < client.anIntArray1107.length; ++var22) {
            if (client.anIntArray1107[var22] != client.anIntArray1172[var22]) {
              client.anIntArray1107[var22] = client.anIntArray1172[var22];
              client.method40(false, var22);
              client.aBoolean928 = true;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 83) {
          if (client.anInt1013 == 12) {
            client.aBoolean928 = true;
          }

          client.anInt840 = client.buffer.readUByte();
          client.incomingPacketOpcode = -1;
          return true;
        }

        int var8;
        int var27;
        if (client.incomingPacketOpcode == 231) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          if (var22 == client.anInt922 && var3 == client.anInt923 && client.loadingState == 2) {
            client.incomingPacketOpcode = -1;
            return true;
          }

          client.anInt922 = var22;
          client.anInt923 = var3;
          client.anInt1055 = (client.anInt922 - 6) * 8;
          client.anInt1056 = (client.anInt923 - 6) * 8;
          client.aBoolean1169 =
              (client.anInt922 / 8 == 48 || client.anInt922 / 8 == 49) && client.anInt923 / 8 == 48;
          if (client.anInt922 / 8 == 48 && client.anInt923 / 8 == 148) {
            client.aBoolean1169 = true;
          }

          client.loadingState = 1;
          client.aLong1127 = System.currentTimeMillis();
          client.componentImageProducer.initDrawingArea();
          client.aClass44_Sub3_Sub1_Sub4_1076.method455(257, 151, 0, "Loading - please wait.");
          client.aClass44_Sub3_Sub1_Sub4_1076.method455(256, 150, 16777215,
              "Loading - please wait.");
          client.componentImageProducer.drawComponentImage(client.graphics, 4, 4);
          var4 = 0;

          for (var5 = (client.anInt922 - 6) / 8; var5 <= (client.anInt922 + 6) / 8; ++var5) {
            for (var27 = (client.anInt923 - 6) / 8; var27 <= (client.anInt923 + 6) / 8; ++var27) {
              ++var4;
            }
          }

          client.aByteArrayArray886 = new byte[var4][];
          client.aByteArrayArray953 = new byte[var4][];
          client.anIntArray830 = new int[var4];
          client.anIntArray831 = new int[var4];
          client.anIntArray832 = new int[var4];
          var4 = 0;

          for (var5 = (client.anInt922 - 6) / 8; var5 <= (client.anInt922 + 6) / 8; ++var5) {
            for (var27 = (client.anInt923 - 6) / 8; var27 <= (client.anInt923 + 6) / 8; ++var27) {
              client.anIntArray830[var4] = var27 + (var5 << 8);
              if (!client.aBoolean1169
                  || var27 != 49 && var27 != 149 && var27 != 147 && var5 != 50 && (var5 != 49
                  || var27 != 47)) {
                var7 = client.anIntArray831[var4] = client.aClass43_Sub1_1015.method387(0, var5,
                    false, var27);
                if (var7 != -1) {
                  client.aClass43_Sub1_1015.method392(3, var7);
                }

                var8 = client.anIntArray832[var4] = client.aClass43_Sub1_1015.method387(1, var5,
                    false, var27);
                if (var8 != -1) {
                  client.aClass43_Sub1_1015.method392(3, var8);
                }

                ++var4;
              } else {
                client.anIntArray831[var4] = -1;
                client.anIntArray832[var4] = -1;
                ++var4;
              }
            }
          }

          var5 = client.anInt1055 - client.anInt1057;
          var27 = client.anInt1056 - client.anInt1058;
          client.anInt1057 = client.anInt1055;
          client.anInt1058 = client.anInt1056;

          int[] var10000;
          int var33;
          for (var7 = 0; var7 < 16384; ++var7) {
            Class44_Sub3_Sub4_Sub6_Sub2 var32 = client.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var7];
            if (var32 != null) {
              for (var33 = 0; var33 < 10; ++var33) {
                var10000 = var32.anIntArray1649;
                var10000[var33] -= var5;
                var10000 = var32.anIntArray1650;
                var10000[var33] -= var27;
              }

              var32.anInt1599 -= var5 * 128;
              var32.anInt1600 -= var27 * 128;
            }
          }

          for (var7 = 0; var7 < client.anInt1118; ++var7) {
            Class44_Sub3_Sub4_Sub6_Sub1 var34 = client.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var7];
            if (var34 != null) {
              for (var33 = 0; var33 < 10; ++var33) {
                var10000 = var34.anIntArray1649;
                var10000[var33] -= var5;
                var10000 = var34.anIntArray1650;
                var10000[var33] -= var27;
              }

              var34.anInt1599 -= var5 * 128;
              var34.anInt1600 -= var27 * 128;
            }
          }

          client.aBoolean1249 = true;
          byte var42 = 0;
          byte var35 = 104;
          byte var38 = 1;
          if (var5 < 0) {
            var42 = 103;
            var35 = -1;
            var38 = -1;
          }

          byte var36 = 0;
          byte var11 = 104;
          byte var12 = 1;
          if (var27 < 0) {
            var36 = 103;
            var11 = -1;
            var12 = -1;
          }

          for (int var13 = var42; var13 != var35; var13 += var38) {
            for (int var14 = var36; var14 != var11; var14 += var12) {
              int var15 = var13 + var5;
              int var16 = var14 + var27;

              for (int var17 = 0; var17 < 4; ++var17) {
                if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                  client.aClass28ArrayArrayArray816[var17][var13][var14]
                      = client.aClass28ArrayArrayArray816[var17][var15][var16];
                } else {
                  client.aClass28ArrayArrayArray816[var17][var13][var14] = null;
                }
              }
            }
          }

          for (GameObjectSpawnRequest var46 =
                  (GameObjectSpawnRequest) client.pendingObjectSpawns.peekFront();
              var46 != null;
              var46 = (GameObjectSpawnRequest) client.pendingObjectSpawns.getPrevious(
                  client.aByte958)) {
            var46.anInt1312 -= var5;
            var46.anInt1313 -= var27;
            if (var46.anInt1312 < 0 || var46.anInt1313 < 0 || var46.anInt1312 >= 104
                || var46.anInt1313 >= 104) {
              var46.removeNode();
            }
          }

          if (client.anInt1025 != 0) {
            client.anInt1025 -= var5;
            client.anInt1026 -= var27;
          }

          client.aBoolean1008 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 171) {
          if (client.anInt1216 != -1) {
            client.anInt1216 = -1;
            client.aBoolean928 = true;
            client.aBoolean841 = true;
          }

          if (client.anInt1011 != -1) {
            client.anInt1011 = -1;
            client.aBoolean1109 = true;
          }

          if (client.aBoolean1104) {
            client.aBoolean1104 = false;
            client.aBoolean1109 = true;
          }

          client.anInt1037 = -1;
          client.aBoolean1168 = false;
          client.incomingPacketOpcode = -1;
          return true;
        }

        long var21;
        if (client.incomingPacketOpcode == 247) {
          var21 = client.buffer.readLong(0);
          var4 = client.buffer.readUByte();
          String var30 = Statics.method551(131, Statics.method548(0, var21));

          for (var27 = 0; var27 < client.anInt1115; ++var27) {
            if (var21 == client.aLongArray1159[var27]) {
              if (var4 != client.anIntArray1073[var27]) {
                client.anIntArray1073[var27] = var4;
                client.aBoolean928 = true;
                if (var4 > 0) {
                  client.method49(-476, 5, "", var30 + " has logged in.");
                }

                if (var4 == 0) {
                  client.method49(-476, 5, "", var30 + " has logged out.");
                }
              }

              var30 = null;
              break;
            }
          }

          if (var30 != null && client.anInt1115 < 200) {
            client.aLongArray1159[client.anInt1115] = var21;
            client.aStringArray833[client.anInt1115] = var30;
            client.anIntArray1073[client.anInt1115] = var4;
            ++client.anInt1115;
            client.aBoolean928 = true;
          }

          var6 = false;

          while (!var6) {
            var6 = true;

            for (var7 = 0; var7 < client.anInt1115 - 1; ++var7) {
              if (Client.localWorldId != client.anIntArray1073[var7]
                  && client.anIntArray1073[var7 + 1] == Client.localWorldId
                  || client.anIntArray1073[var7] == 0 && client.anIntArray1073[var7 + 1] != 0) {
                var8 = client.anIntArray1073[var7];
                client.anIntArray1073[var7] = client.anIntArray1073[var7 + 1];
                client.anIntArray1073[var7 + 1] = var8;
                String var9 = client.aStringArray833[var7];
                client.aStringArray833[var7] = client.aStringArray833[var7 + 1];
                client.aStringArray833[var7 + 1] = var9;
                long var10 = client.aLongArray1159[var7];
                client.aLongArray1159[var7] = client.aLongArray1159[var7 + 1];
                client.aLongArray1159[var7 + 1] = var10;
                client.aBoolean928 = true;
                var6 = false;
              }
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 10) {
          var22 = client.buffer.readUShort();
          boolean var26 = client.buffer.readUByte() == 1;
          Class5.aClass5Array103[var22].aBoolean124 = var26;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 105) {
          client.aBoolean928 = true;
          var22 = client.buffer.readUByte();
          var3 = client.buffer.readInt();
          var4 = client.buffer.readUByte();
          client.anIntArray1253[var22] = var3;
          client.anIntArray884[var22] = var4;
          client.levels[var22] = 1;

          for (var5 = 0; var5 < 98; ++var5) {
            if (var3 >= Client.anIntArray1236[var5]) {
              client.levels[var22] = var5 + 2;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 23) {
          var22 = client.buffer.readUShort();
          if (var22 == 65535) {
            var22 = -1;
          }

          if (var22 != client.anInt1030 && client.aBoolean1069 && !Client.isLowMemory
              && client.anInt927 == 0) {
            client.anInt1183 = var22;
            client.aBoolean1184 = true;
            client.aClass43_Sub1_1015.method392(2, client.anInt1183);
          }

          client.anInt1030 = var22;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 15) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          if (client.aBoolean1069 && !Client.isLowMemory) {
            client.anInt1183 = var22;
            client.aBoolean1184 = false;
            client.aClass43_Sub1_1015.method392(2, client.anInt1183);
            client.anInt927 = var3;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 200) {
          client.aBoolean1008 = true;
          client.anInt869 = client.buffer.readUByte();
          client.anInt870 = client.buffer.readUByte();
          client.anInt871 = client.buffer.readUShort();
          client.anInt872 = client.buffer.readUByte();
          client.anInt873 = client.buffer.readUByte();
          if (client.anInt873 >= 100) {
            client.anInt820 = client.anInt869 * 128 + 64;
            client.anInt822 = client.anInt870 * 128 + 64;
            client.anInt821 =
                client.method50(client.anInt820, client.anInt822, 0, client.clientPlane)
                    - client.anInt871;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        Class5 var23;
        if (client.incomingPacketOpcode == 172) {
          client.aBoolean928 = true;
          var22 = client.buffer.readUShort();
          var23 = Class5.aClass5Array103[var22];

          while (client.buffer.offset < client.incomingPacketSize) {
            var4 = client.buffer.readUByte();
            var5 = client.buffer.readUShort();
            var27 = client.buffer.readUByte();
            if (var27 == 255) {
              var27 = client.buffer.readInt();
            }

            if (var4 >= 0 && var4 < var23.anIntArray104.length) {
              var23.anIntArray104[var4] = var5;
              var23.anIntArray105[var4] = var27;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 17) {
          var22 = client.buffer.readUByte();
          var3 = client.buffer.readUByte();
          String var25 = client.buffer.readString();
          if (var22 >= 1 && var22 <= 5) {
            if (var25.equalsIgnoreCase("null")) {
              var25 = null;
            }

            client.aStringArray799[var22 - 1] = var25;
            client.aBooleanArray800[var22 - 1] = var3 == 0;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 32) {
          client.anInt918 = client.buffer.readUByte();
          client.anInt919 = client.buffer.readUByte();
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 106) {
          client.aBoolean928 = true;
          var22 = client.buffer.readUShort();
          var23 = Class5.aClass5Array103[var22];
          var4 = client.buffer.readUByte();

          for (var5 = 0; var5 < var4; ++var5) {
            var23.anIntArray104[var5] = client.buffer.readUShort();
            var27 = client.buffer.readUByte();
            if (var27 == 255) {
              var27 = client.buffer.readInt();
            }

            var23.anIntArray105[var5] = var27;
          }

          for (var5 = var4; var5 < var23.anIntArray104.length; ++var5) {
            var23.anIntArray104[var5] = 0;
            var23.anIntArray105[var5] = 0;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 133) {
          client.anInt947 = client.buffer.readUShort();
          client.anInt808 = client.buffer.readUByte();
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 129) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          Class5.aClass5Array103[var22].anInt152 = 1;
          Class5.aClass5Array103[var22].anInt153 = var3;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 233) {
          client.aBoolean1008 = true;
          client.anInt909 = client.buffer.readUByte();
          client.anInt910 = client.buffer.readUByte();
          client.anInt911 = client.buffer.readUShort();
          client.anInt912 = client.buffer.readUByte();
          client.anInt913 = client.buffer.readUByte();
          if (client.anInt913 >= 100) {
            var22 = client.anInt909 * 128 + 64;
            var3 = client.anInt910 * 128 + 64;
            var4 = client.method50(var22, var3, 0, client.clientPlane) - client.anInt911;
            var5 = var22 - client.anInt820;
            var27 = var4 - client.anInt821;
            var7 = var3 - client.anInt822;
            var8 = (int) Math.sqrt(var5 * var5 + var7 * var7);
            client.anInt823 = (int) (Math.atan2(var27, var8) * 325.949D) & 2047;
            client.anInt824 = (int) (Math.atan2(var5, var7) * -325.949D) & 2047;
            if (client.anInt823 < 128) {
              client.anInt823 = 128;
            }

            if (client.anInt823 > 383) {
              client.anInt823 = 383;
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 227) {
          var22 = client.buffer.readUShort();
          var23 = Class5.aClass5Array103[var22];

          for (var4 = 0; var4 < var23.anIntArray104.length; ++var4) {
            var23.anIntArray104[var4] = -1;
            var23.anIntArray104[var4] = 0;
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 77) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readShort();
          var4 = client.buffer.readShort();
          Class5 var24 = Class5.aClass5Array103[var22];
          var24.anInt116 = var3;
          var24.anInt117 = var4;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 185) {
          client.anInt1116 = client.buffer.readUByte();
          client.aBoolean928 = true;
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 197) {
          client.method143(0, client.incomingPacketSize, client.buffer);
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 183) {
          var22 = client.buffer.readUShort();
          var3 = client.buffer.readUShort();
          var4 = var3 >> 10 & 31;
          var5 = var3 >> 5 & 31;
          var27 = var3 & 31;
          Class5.aClass5Array103[var22].anInt146 = (var5 << 11) + (var4 << 19) + (var27 << 3);
          client.incomingPacketOpcode = -1;
          return true;
        }

        if (client.incomingPacketOpcode == 235) {
          var21 = client.buffer.readLong(0);
          var4 = client.buffer.readInt();
          var5 = client.buffer.readUByte();
          var6 = false;

          for (var7 = 0; var7 < 100; ++var7) {
            if (var4 == client.anIntArray1068[var7]) {
              var6 = true;
              break;
            }
          }

          if (var5 <= 1) {
            for (var7 = 0; var7 < client.anInt961; ++var7) {
              if (client.aLongArray817[var7] == var21) {
                var6 = true;
                break;
              }
            }
          }

          if (!var6 && client.anInt890 == 0) {
            try {
              client.anIntArray1068[client.anInt1186] = var4;
              client.anInt1186 = (client.anInt1186 + 1) % 100;
              String var28 = Statics.method554((byte) 8, client.incomingPacketSize - 13,
                  client.buffer);
              var28 = Statics.method352((byte) 3, var28);
              if (var5 != 2 && var5 != 3) {
                if (var5 == 1) {
                  client.method49(-476, 7,
                      "@cr1@" + Statics.method551(131, Statics.method548(0, var21)), var28);
                } else {
                  client.method49(-476, 3, Statics.method551(131, Statics.method548(0, var21)),
                      var28);
                }
              } else {
                client.method49(-476, 7,
                    "@cr2@" + Statics.method551(131, Statics.method548(0, var21)), var28);
              }
            } catch (Exception var18) {
              signlink.reporterror("cde1");
            }
          }

          client.incomingPacketOpcode = -1;
          return true;
        }

        signlink.reporterror(
            "T1 - " + client.incomingPacketOpcode + "," + client.incomingPacketSize + " - "
                + client.anInt1139 + "," + client.anInt1140);
        client.method80();
      } catch (IOException var19) {
        client.method71(0);
      } catch (Exception var20) {
        StringBuilder var2 = new StringBuilder(
            "T2 - " + client.incomingPacketOpcode + "," + client.anInt1139 + "," + client.anInt1140
                + " - " + client.incomingPacketSize + "," + (
                Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0] + client.anInt1055) + ","
                + (Client.aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0] + client.anInt1056)
                + " - ");

        for (var3 = 0; var3 < client.incomingPacketSize && var3 < 50; ++var3) {
          var2.append(client.buffer.array[var3]).append(",");
        }

        signlink.reporterror(var2.toString());
        client.method80();
      }

      return true;
    }
  }
}
