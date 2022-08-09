import audio.music.AudioPlayer;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import packets.ServerPackets;
import sign.SignLink;

@SuppressWarnings("serial")
public class Client extends GameStub {

  public static final int[][] anIntArrayArray1008 = {
      {6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983,
          54193},
      {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153,
          56621, 4783, 1341, 16578, 35003, 25239},
      {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
          10153, 56621, 4783, 1341, 16578, 35003},
      {4626, 11146, 6439, 12, 4758, 10270},
      {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
  public static final int[] anIntArray1268 = {9104, 10275, 7595, 3610, 7975,
      8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991,
      25486};
  private static final BigInteger RSA_MODULUS = new BigInteger(
      "118493108262563113081728654637136380851141768451007344391179090679661619564296188819307778250748364798346920986488828194635677437597089675347360621571027924883268649961939807975486601199005206372204164589075986879871232560822901080412347432020367077499053945602250484541379059468298010926499357871311490931511");
  private static final BigInteger RSA_EXPONENT = new BigInteger("65537");
  public static int anInt841;
  public static boolean aBoolean868;
  public static int anInt895;
  public static int nodeId = 10;
  public static int portOffset;
  public static boolean membersServer = true;
  public static boolean lowMemory;
  public static int[] anIntArray952;
  public static boolean aBoolean962;
  public static boolean aBoolean963 = true;
  public static int anInt978;
  public static boolean aBoolean999;
  public static String aString1007 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
  public static int anInt1013;
  public static int anInt1025 = -352;
  public static int anInt1049;
  public static int anInt1052;
  public static int anInt1082;
  public static int anInt1100;
  public static int anInt1139;
  public static int anInt1160;
  public static int anInt1162;
  public static int anInt1165;
  public static Player localPlayer;
  public static int anInt1168;
  public static boolean aBoolean1190 = true;
  public static boolean aBoolean1207;
  public static int[] anIntArray1214;
  public static int anInt1230;
  public static int anInt1235;
  public static int anInt1237;
  public static boolean aBoolean1242 = true;
  public static int anInt1309;
  public static int anInt1325;
  public static int anInt1333;

  static {
    anIntArray952 = new int[99];
    int i = 0;
    for (int j = 0; j < 99; j++) {
      int l = j + 1;
      int i1 = (int) ((double) l + 300D * Math.pow(2D, (double) l / 7D));
      i += i1;
      anIntArray952[j] = i / 4;
    }

    anIntArray1214 = new int[32];
    i = 2;
    for (int k = 0; k < 32; k++) {
      anIntArray1214[k] = i - 1;
      i += i;
    }

  }

  public final int[] anIntArray1032 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2,
      2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
  public final int anInt1257 = 100;
  public int[] archiveCRCs;
  public byte[][] aByteArrayArray838;
  public String aString839;
  public int[] anIntArray842 = {0xffff00, 0xff0000, 65280, 65535, 0xff00ff,
      0xffffff};
  public int[] anIntArray843;
  public int anInt844;
  public int anInt845;
  public int anInt846;
  public int anInt847;
  public int anInt848;
  public String[] aStringArray849;
  public int anInt850;
  public int anInt851;
  public int[] anIntArray852;
  public int anInt853;
  public int anInt854;
  public int anInt855;
  public int[] anIntArray856;
  public int[] anIntArray857;
  public int[] anIntArray858;
  public int anInt859;
  public int anInt860;
  public String aString861;
  public int anInt862;
  public String[] aStringArray863;
  public int[] anIntArray864;
  public int anInt865;
  public boolean aBoolean866;
  public int anInt867;
  public int anInt869;
  public int incomingPacketOpcode;
  public int anInt871;
  public int anInt872;
  public int anInt873;
  public int anInt874;
  public int anInt875;
  public int anInt876;
  public int anInt877;
  public int anInt878;
  public int[][][] anIntArrayArrayArray879;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_880;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_881;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_882;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_883;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_884;
  public int[][] anIntArrayArray885;
  public int[][] anIntArrayArray886;
  public int anInt887;
  public Archive aClass2_888;
  public int anInt889;
  public int anInt890;
  public int[][][] anIntArrayArrayArray891;
  public boolean aBoolean892;
  public int anInt893;
  public int anInt894;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array896;
  public int anInt897;
  public byte aByte898;
  public IsaacCipher encryption;
  public boolean aBoolean900;
  public byte aByte901;
  public long aLong902;
  public int anInt903;
  public int anInt904;
  public int anInt905;
  public ProducingGraphicsBuffer aClass18_906;
  public ProducingGraphicsBuffer aClass18_907;
  public ProducingGraphicsBuffer aClass18_908;
  public ProducingGraphicsBuffer aClass18_909;
  public ProducingGraphicsBuffer aClass18_910;
  public ProducingGraphicsBuffer aClass18_911;
  public ProducingGraphicsBuffer aClass18_912;
  public ProducingGraphicsBuffer aClass18_913;
  public ProducingGraphicsBuffer aClass18_914;
  public int anInt915;
  public int anInt916;
  public int anInt917;
  public boolean aBoolean918;
  public boolean aBoolean919;
  public int[] anIntArray920;
  public int anInt921;
  public int anInt922;
  public boolean[] aBooleanArray927;
  public int anInt928;
  public Buffer loginBuffer;
  public long aLong930;
  public int anInt931;
  public int anInt932;
  public int anInt933;
  public boolean aBoolean934;
  public int anInt935;
  public byte aByte936;
  public String aString937;
  public int anInt938;
  public int anInt939;
  public int anInt940;
  public int[] anIntArray941;
  public int[] anIntArray942;
  public int[] anIntArray943;
  public int[] anIntArray944;
  public int[] anIntArray945;
  public int[] anIntArray946;
  public int[] anIntArray947;
  public String[] aStringArray948;
  public String aString949;
  public boolean aBoolean950;
  public int anInt951;
  public boolean aBoolean953;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array954;
  public int anInt955;
  public byte aByte956;
  public String aString957;
  public String aString958;
  public boolean aBoolean959;
  public int anInt960;
  public int anInt961;
  public Buffer outgoingBuffer;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_965;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_966;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_967;
  public int anInt968;
  public int anInt969;
  public Player[] activePlayers;
  public int anInt971;
  public int[] anIntArray972;
  public int anInt973;
  public int[] anIntArray974;
  public Buffer[] aClass50_Sub1_Sub2Array975;
  public IndexedImage[] aClass50_Sub1_Sub1_Sub3Array976;
  public int anInt977;
  public int[] anIntArray979;
  public int[] anIntArray980;
  public int[] anIntArray981;
  public int[] anIntArray982;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_983;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_984;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_985;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_986;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_987;
  public int anInt988;
  public int anInt989;
  public int anInt990;
  public int[] anIntArray991;
  public int anInt992;
  public int anInt993;
  public int anInt994;
  public int anInt995;
  public int anInt996;
  public int anInt997;
  public int anInt998;
  public int[] anIntArray1000;
  public int[] anIntArray1001;
  public int[] anIntArray1002;
  public int[] anIntArray1003;
  public int anInt1004;
  public int[] anIntArray1005;
  public int anInt1006;
  public int anInt1009;
  public int anInt1010;
  public int anInt1011;
  public int anInt1012;
  public boolean aBoolean1014;
  public int anInt1015;
  public boolean aBoolean1016;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1017;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1018;
  public int[] anIntArray1019;
  public int anInt1020;
  public int anInt1021;
  public int anInt1022;
  public int anInt1023;
  public BufferedConnection primaryConnection;
  public String aString1026;
  public String aString1027;
  public boolean aBoolean1028;
  public int[] anIntArray1029;
  public int anInt1030;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array1031;
  public boolean aBoolean1033;
  public int anInt1034;
  public int pendingSounds;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1036;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1037;
  public boolean aBoolean1038;
  public int[] anIntArray1039;
  public int anInt1040;
  public int anInt1041;
  public int anInt1042;
  public int anInt1043;
  public int anInt1044;
  public int anInt1045;
  public boolean aBoolean1046;
  public int anInt1047;
  public int anInt1048;
  public int anInt1050;
  public int anInt1051;
  public int anInt1053;
  public int[] anIntArray1054;
  public int anInt1055;
  public int anInt1056;
  public int anInt1057;
  public String aString1058;
  public Class50_Sub1_Sub1_Sub2 aClass50_Sub1_Sub1_Sub2_1059;
  public Class50_Sub1_Sub1_Sub2 aClass50_Sub1_Sub1_Sub2_1060;
  public Class50_Sub1_Sub1_Sub2 aClass50_Sub1_Sub1_Sub2_1061;
  public Class50_Sub1_Sub1_Sub2 aClass50_Sub1_Sub1_Sub2_1062;
  public int anInt1063;
  public int anInt1064;
  public boolean aBoolean1065;
  public byte aByte1066;
  public boolean aBoolean1067;
  public int anInt1068;
  public String[] aStringArray1069;
  public boolean[] aBooleanArray1070;
  public int anInt1071;
  public int anInt1072;
  public long[] aLongArray1073;
  public boolean aBoolean1074;
  public int anInt1075;
  public int anInt1076;
  public int[] anIntArray1077;
  public int[] anIntArray1078;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array1079;
  public int anInt1080;
  public int[] anIntArray1081 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1};
  public int anInt1083;
  public int[] anIntArray1084;
  public int[] anIntArray1085;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1086;
  public int anInt1087;
  public CRC32 aCRC32_1088;
  public int anInt1089;
  public int[] pendingSoundIDs;
  public int anInt1091;
  public String aString1092;
  public String aString1093;
  public int anInt1094;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1095;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1096;
  public boolean aBoolean1097;
  public boolean aBoolean1098;
  public int[] anIntArray1099;
  public int anInt1101;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1102;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1103;
  public String aString1104;
  public int[] anIntArray1105;
  public int anInt1106;
  public int anInt1107;
  public ProducingGraphicsBuffer aClass18_1108;
  public ProducingGraphicsBuffer aClass18_1109;
  public ProducingGraphicsBuffer aClass18_1110;
  public int anInt1111;
  public int anInt1112;
  public int anInt1113;
  public int anInt1114;
  public int anInt1115;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1116;
  public IndexedImage[] aClass50_Sub1_Sub1_Sub3Array1117;
  public int anInt1118;
  public int anInt1119;
  public int anInt1120;
  public int anInt1121;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1122;
  public int[] anIntArray1123;
  public int[] anIntArray1124;
  public byte[][][] aByteArrayArrayArray1125;
  public int anInt1126;
  public boolean aBoolean1127;
  public int previousSong;
  public int anInt1129;
  public long[] aLongArray1130;
  public Buffer aClass50_Sub1_Sub2_1131;
  public Npc[] activeNpcs;
  public int anInt1133;
  public int[] anIntArray1134;
  public int anInt1135;
  public boolean aBoolean1136;
  public boolean aBoolean1137;
  public int anInt1138;
  public int anInt1140;
  public long aLong1141;
  public IndexedImage[] aClass50_Sub1_Sub1_Sub3Array1142;
  public byte aByte1143;
  public boolean aBoolean1144;
  public int[] anIntArray1145;
  public int anInt1146;
  public int anInt1147;
  public int anInt1148;
  public int anInt1149;
  public String selectedItem;
  public int anInt1151;
  public int anInt1152;
  public IndexedImage[] aClass50_Sub1_Sub1_Sub3Array1153;
  public int anInt1154;
  public boolean aBoolean1155;
  public ProducingGraphicsBuffer aClass18_1156;
  public ProducingGraphicsBuffer aClass18_1157;
  public ProducingGraphicsBuffer aClass18_1158;
  public ProducingGraphicsBuffer aClass18_1159;
  public byte aByte1161;
  public boolean aBoolean1163;
  public Scene aClass22_1164;
  public int[] anIntArray1166;
  public int anInt1169;
  public int anInt1170;
  public int anInt1171;
  public int anInt1172;
  public int anInt1173;
  public String aString1174;
  public int anInt1175;
  public int[] anIntArray1176;
  public int[] anIntArray1177;
  public int anInt1178;
  public int anInt1179;
  public int[] anIntArray1180;
  public boolean aBoolean1181;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array1182;
  public int anInt1183;
  public String[] aStringArray1184;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1185;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1186;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1187;
  public Buffer buffer;
  public int[][] anIntArrayArray1189;
  public int anInt1191;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1192;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1193;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1194;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1195;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1196;
  public int anInt1197;
  public ProducingGraphicsBuffer aClass18_1198;
  public ProducingGraphicsBuffer aClass18_1199;
  public ProducingGraphicsBuffer aClass18_1200;
  public ProducingGraphicsBuffer aClass18_1201;
  public ProducingGraphicsBuffer aClass18_1202;
  public ProducingGraphicsBuffer aClass18_1203;
  public ProducingGraphicsBuffer aClass18_1204;
  public ProducingGraphicsBuffer aClass18_1205;
  public ProducingGraphicsBuffer aClass18_1206;
  public int anInt1208;
  public boolean aBoolean1209;
  public Deque aClass6_1210;
  public boolean aBoolean1211;
  public boolean aBoolean1212;
  public int anInt1213;
  public int anInt1215;
  public int anInt1216;
  public int anInt1217;
  public int anInt1218;
  public int anInt1219;
  public int anInt1220;
  public int anInt1221;
  public int anInt1222;
  public int anInt1223;
  public Socket aSocket1224;
  public int anInt1225;
  public int anInt1226;
  public int anInt1227;
  public Index[] aClass23Array1228;
  public long aLong1229;
  public int anInt1231;
  public byte[][] aByteArrayArray1232;
  public int anInt1233;
  public int anInt1234;
  public int anInt1236;
  public int anInt1238;
  public boolean aBoolean1239;
  public boolean aBoolean1240;
  public int anInt1241;
  public volatile boolean aBoolean1243;
  public int anInt1244;
  public byte[] aByteArray1245;
  public int anInt1246;
  public ImageRGB aClass50_Sub1_Sub1_Sub1_1247;
  public MouseCapturer aClass7_1248;
  public Widget aClass13_1249;
  public long aLong1250;
  public int anInt1251;
  public int anInt1252;
  public int anInt1253;
  public int anInt1254;
  public int anInt1255;
  public int anInt1256;
  public int[] anIntArray1258;
  public int[] pendingSoundDelays;
  public CollisionMap[] aClass46Array1260;
  public Deque aClass6_1261;
  public int anInt1262;
  public int anInt1263;
  public int anInt1264;
  public boolean aBoolean1265;
  public boolean musicEnabled;
  public int[] anIntArray1267;
  public int anInt1269;
  public int nextSong;
  public boolean songChanging;
  public int anInt1272;
  public int anInt1273;
  public boolean aBoolean1274;
  public boolean aBoolean1275;
  public int anInt1276;
  public boolean aBoolean1277;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array1278;
  public int anInt1279;
  public int anInt1280;
  public int anInt1281;
  public Deque aClass6_1282;
  public boolean aBoolean1283;
  public int anInt1284;
  public int anInt1285;
  public int[] anIntArray1286;
  public int anInt1287;
  public ImageRGB[] aClass50_Sub1_Sub1_Sub1Array1288;
  public int anInt1289;
  public int[] anIntArray1290 = {17, 24, 34, 40};
  public OnDemandRequester requester;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1292;
  public IndexedImage aClass50_Sub1_Sub1_Sub3_1293;
  public int anInt1294;
  public int[] anIntArray1295;
  public int[] anIntArray1296;
  public String[] aStringArray1297;
  public String[] aStringArray1298;
  public int anInt1299;
  public int anInt1300;
  public boolean soundEffectsVolume;
  public int anInt1302;
  public int anInt1303;
  public int anInt1304;
  public int anInt1305;
  public int anInt1306;
  public int anInt1307;
  public int anInt1308;
  public int[] anIntArray1310;
  public int[] anIntArray1311;
  public int[] anIntArray1312;
  public int[] anIntArray1313;
  public volatile boolean aBoolean1314;
  public int anInt1315;
  public byte aByte1317;
  public int anInt1318;
  public int anInt1319;
  public volatile boolean aBoolean1320;
  public int[] pendingSoundTypes;
  public int anInt1322;
  public Deque[][][] aClass6ArrayArrayArray1323;
  public int anInt1324;
  public int[] anIntArray1326;
  public int currentSong;
  public int anInt1328;
  public int anInt1329;
  public int anInt1330;
  public int anInt1331;
  public int anInt1332;
  public Client() {
    archiveCRCs = new int[9];
    aString839 = "";
    anIntArray843 = new int[Class42.anInt700];
    aStringArray849 = new String[200];
    anIntArray852 = new int[5];
    anInt854 = 2;
    aString861 = "";
    aStringArray863 = new String[100];
    anIntArray864 = new int[100];
    aBoolean866 = false;
    anIntArrayArrayArray879 = new int[4][13][13];
    anIntArrayArray885 = new int[104][104];
    anIntArrayArray886 = new int[104][104];
    aBoolean892 = false;
    anInt894 = -992;
    aClass50_Sub1_Sub1_Sub1Array896 = new ImageRGB[8];
    anInt897 = 559;
    aByte898 = 6;
    aBoolean900 = false;
    aByte901 = -123;
    anInt917 = 2;
    aBoolean918 = true;
    aBoolean919 = true;
    anIntArray920 = new int[151];
    anInt921 = 8;
    aBooleanArray927 = new boolean[5];
    anInt928 = -188;
    loginBuffer = Buffer.create(1);
    anInt931 = 0x23201b;
    anInt932 = -1;
    anInt933 = -1;
    aBoolean934 = true;
    anInt935 = -1;
    aByte936 = -113;
    aString937 = "";
    anInt938 = -214;
    anInt940 = 50;
    anIntArray941 = new int[anInt940];
    anIntArray942 = new int[anInt940];
    anIntArray943 = new int[anInt940];
    anIntArray944 = new int[anInt940];
    anIntArray945 = new int[anInt940];
    anIntArray946 = new int[anInt940];
    anIntArray947 = new int[anInt940];
    aStringArray948 = new String[anInt940];
    aString949 = "";
    aBoolean950 = false;
    aBoolean953 = false;
    aClass50_Sub1_Sub1_Sub1Array954 = new ImageRGB[32];
    aByte956 = 1;
    aString957 = "";
    aString958 = "";
    aBoolean959 = true;
    anInt960 = -1;
    anInt961 = -1;
    outgoingBuffer = Buffer.create(1);
    anInt968 = 2048;
    anInt969 = 2047;
    activePlayers = new Player[anInt968];
    anIntArray972 = new int[anInt968];
    anIntArray974 = new int[anInt968];
    aClass50_Sub1_Sub2Array975 = new Buffer[anInt968];
    aClass50_Sub1_Sub1_Sub3Array976 = new IndexedImage[13];
    anIntArray979 = new int[500];
    anIntArray980 = new int[500];
    anIntArray981 = new int[500];
    anIntArray982 = new int[500];
    anInt988 = -1;
    anIntArray991 = new int[5];
    anIntArray1005 = new int[2000];
    anInt1010 = 2;
    aBoolean1014 = false;
    aBoolean1016 = false;
    anIntArray1019 = new int[151];
    aString1026 = "";
    aBoolean1028 = false;
    anIntArray1029 = new int[Class42.anInt700];
    aClass50_Sub1_Sub1_Sub1Array1031 = new ImageRGB[100];
    aBoolean1033 = false;
    aBoolean1038 = true;
    anIntArray1039 = new int[2000];
    aBoolean1046 = false;
    anInt1051 = 69;
    anInt1053 = -1;
    anIntArray1054 = new int[Class42.anInt700];
    anInt1055 = 2;
    anInt1056 = 3;
    aBoolean1065 = false;
    aByte1066 = 1;
    aBoolean1067 = false;
    aStringArray1069 = new String[5];
    aBooleanArray1070 = new boolean[5];
    anInt1072 = 20411;
    aLongArray1073 = new long[100];
    aBoolean1074 = false;
    anIntArray1077 = new int[1000];
    anIntArray1078 = new int[1000];
    aClass50_Sub1_Sub1_Sub1Array1079 = new ImageRGB[32];
    anInt1080 = 0x4d4233;
    aCRC32_1088 = new CRC32();
    anInt1089 = -1;
    pendingSoundIDs = new int[50];
    aString1092 = "";
    aString1093 = "";
    aBoolean1097 = false;
    aBoolean1098 = false;
    anIntArray1099 = new int[5];
    aString1104 = "";
    anIntArray1105 = new int[5];
    anInt1107 = 78;
    anInt1119 = -30658;
    anIntArray1123 = new int[4000];
    anIntArray1124 = new int[4000];
    aBoolean1127 = false;
    aLongArray1130 = new long[200];
    aClass50_Sub1_Sub2_1131 = new Buffer(new byte[5000]);
    activeNpcs = new Npc[16384];
    anIntArray1134 = new int[16384];
    anInt1135 = 0x766654;
    aBoolean1136 = false;
    aBoolean1137 = false;
    anInt1140 = -110;
    aClass50_Sub1_Sub1_Sub3Array1142 = new IndexedImage[2];
    aByte1143 = -80;
    aBoolean1144 = true;
    anIntArray1145 = new int[5];
    aClass50_Sub1_Sub1_Sub3Array1153 = new IndexedImage[100];
    anInt1154 = -916;
    aBoolean1155 = false;
    aByte1161 = 97;
    aBoolean1163 = false;
    anIntArray1166 = new int[256];
    anInt1169 = -1;
    anInt1175 = -89;
    anInt1178 = 300;
    anIntArray1180 = new int[33];
    aBoolean1181 = false;
    aClass50_Sub1_Sub1_Sub1Array1182 = new ImageRGB[20];
    aStringArray1184 = new String[500];
    buffer = Buffer.create(1);
    anIntArrayArray1189 = new int[104][104];
    anInt1191 = -1;
    aBoolean1209 = false;
    aClass6_1210 = new Deque();
    aBoolean1211 = false;
    aBoolean1212 = false;
    anInt1213 = -1;
    aClass23Array1228 = new Index[5];
    anInt1231 = -1;
    anInt1234 = 1;
    anInt1236 = 326;
    aBoolean1239 = false;
    aBoolean1240 = false;
    aBoolean1243 = false;
    aByteArray1245 = new byte[16384];
    aClass13_1249 = new Widget();
    anInt1251 = 128;
    anInt1256 = 1;
    anIntArray1258 = new int[100];
    pendingSoundDelays = new int[50];
    aClass46Array1260 = new CollisionMap[4];
    aClass6_1261 = new Deque();
    aBoolean1265 = false;
    musicEnabled = true;
    anIntArray1267 = new int[200];
    songChanging = true;
    anInt1272 = -1;
    aBoolean1274 = true;
    aBoolean1275 = true;
    anInt1276 = -1;
    aBoolean1277 = false;
    aClass50_Sub1_Sub1_Sub1Array1278 = new ImageRGB[1000];
    anInt1279 = -1;
    anInt1281 = -939;
    aClass6_1282 = new Deque();
    aBoolean1283 = false;
    anInt1285 = 3;
    anIntArray1286 = new int[33];
    anInt1287 = 0x332d25;
    aClass50_Sub1_Sub1_Sub1Array1288 = new ImageRGB[32];
    anIntArray1295 = new int[1000];
    anIntArray1296 = new int[100];
    aStringArray1297 = new String[100];
    aStringArray1298 = new String[100];
    soundEffectsVolume = true;
    aBoolean1314 = false;
    aByte1317 = -58;
    anInt1318 = 416;
    aBoolean1320 = false;
    pendingSoundTypes = new int[50];
    aClass6ArrayArrayArray1323 = new Deque[4][104][104];
    anIntArray1326 = new int[7];
    currentSong = -1;
    anInt1328 = 409;
  }

  public static void main(String[] args) {
    try {
      System.out.println("RS2 user client - release #" + 377);
      if (args.length != 5) {
        System.out
            .println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
        return;
      }
      nodeId = Integer.parseInt(args[0]);
      portOffset = Integer.parseInt(args[1]);
      if (args[2].equals("lowmem")) {
        setLowMemory(true);
      } else if (args[2].equals("highmem")) {
        setHighMemory(true);
      } else {
        System.out
            .println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
        return;
      }
      if (args[3].equals("free")) {
        membersServer = false;
      } else if (args[3].equals("members")) {
        membersServer = true;
      } else {
        System.out
            .println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
        return;
      }
      SignLink.storeId = Integer.parseInt(args[4]);
      SignLink.startPriv(InetAddress.getLocalHost());
      Client client = new Client();
      client.method1(anInt1025, 503, 765);
		} catch (Exception exception) {
		}
  }

  public static String method20(int i, int j) {
    if (j >= 0) {
      throw new NullPointerException();
    }
    if (i < 0x186a0) {
      return String.valueOf(i);
    }
    if (i < 0x989680) {
      return i / 1000 + "K";
    } else {
      return i / 0xf4240 + "M";
    }
  }

  public static void setHighMemory(boolean flag) {
    Scene.aBoolean451 = false;
    Canvas.aBoolean1527 = false;
    lowMemory = false;
    Region.aBoolean169 = false;
    if (!flag) {
      anInt1025 = 143;
    }
    GameObjectDefinition.aBoolean772 = false;
  }

  public static String getCombatLevelColour(int i, int j) {
    int difference = j - i;
    if (difference < -9) {
      return "@red@";
    }
    if (difference < -6) {
      return "@or3@";
    }
    if (difference < -3) {
      return "@or2@";
    }
    if (difference < 0) {
      return "@or1@";
    }
    if (difference > 9) {
      return "@gre@";
    }
    if (difference > 6) {
      return "@gr3@";
    }
    if (difference > 3) {
      return "@gr2@";
    }
    if (difference > 0) {
      return "@gr1@";
    } else {
      return "@yel@";
    }
  }

  public static void setLowMemory(boolean flag) {
    Scene.aBoolean451 = true;
    if (!flag) {
      aBoolean1242 = !aBoolean1242;
    }
    Canvas.aBoolean1527 = true;
    lowMemory = true;
    Region.aBoolean169 = true;
    GameObjectDefinition.aBoolean772 = true;
  }

  public static String getNameFromAmount(int amount) {
    String s = String.valueOf(amount);
    for (int k = s.length() - 3; k > 0; k -= 3) {
      s = s.substring(0, k) + "," + s.substring(k);
    }

    if (s.length() > 8) {
      s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@("
          + s + ")";
    } else if (s.length() > 4) {
      s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
    }
    return " " + s;
  }

  public void method14(String s) {
    if (s == null || s.length() == 0) {
      anInt862 = 0;
      return;
    }
    String s1 = s;
    String[] as = new String[100];
    int j = 0;
    do {
      int k = s1.indexOf(" ");
      if (k == -1) {
        break;
      }
      String s2 = s1.substring(0, k).trim();
      if (s2.length() > 0) {
        as[j++] = s2.toLowerCase();
      }
      s1 = s1.substring(k + 1);
    } while (true);
    s1 = s1.trim();
    if (s1.length() > 0) {
      as[j++] = s1.toLowerCase();
    }
    anInt862 = 0;
    label0:
    for (int l = 0; l < ItemDefinition.anInt335; l++) {
      ItemDefinition definition = ItemDefinition.getDefinition(l);
      if (definition.anInt343 != -1 || definition.name == null) {
        continue;
      }
      String s3 = definition.name.toLowerCase();
      for (int i1 = 0; i1 < j; i1++) {
        if (s3.indexOf(as[i1]) == -1) {
          continue label0;
        }
      }

      aStringArray863[anInt862] = s3;
      anIntArray864[anInt862] = l;
      anInt862++;
      if (anInt862 >= aStringArray863.length) {
        return;
      }
    }

  }

  public void method15() {
    outgoingBuffer.writeByteIsaac(110);
    if (anInt1089 != -1) {
      method44(anInt1089);
      anInt1089 = -1;
      aBoolean1181 = true;
      aBoolean1239 = false;
      aBoolean950 = true;
    }
    if (anInt988 != -1) {
      method44(anInt988);
      anInt988 = -1;
      aBoolean1240 = true;
      aBoolean1239 = false;
    }
    if (anInt1053 != -1) {
      method44(anInt1053);
      anInt1053 = -1;
      aBoolean1046 = true;
    }
    if (anInt960 != -1) {
      method44(anInt960);
      anInt960 = -1;
    }
    if (anInt1169 != -1) {
      method44(anInt1169);
      anInt1169 = -1;
    }
  }

  public void method16(int i, byte byte0, Buffer buffer) {
    while (buffer.bitIndex + 10 < i * 8) {
      int index = buffer.readBits(11);
      if (index == 2047) {
        break;
      }
      if (activePlayers[index] == null) {
        activePlayers[index] = new Player();
        if (aClass50_Sub1_Sub2Array975[index] != null) {
          activePlayers[index].method572(
              aClass50_Sub1_Sub2Array975[index], 0);
        }
      }
      anIntArray972[anInt971++] = index;
      Player player = activePlayers[index];
      player.anInt1585 = anInt1325;
      int k = buffer.readBits(5);
      if (k > 15) {
        k -= 32;
      }
      int l = buffer.readBits(1);
      if (l == 1) {
        anIntArray974[anInt973++] = index;
      }
      int i1 = buffer.readBits(1);
      int j1 = buffer.readBits(5);
      if (j1 > 15) {
        j1 -= 32;
      }
      player.method568(localPlayer.anIntArray1587[0] + j1,
          (byte) 5, i1 == 1,
          localPlayer.anIntArray1586[0] + k);
    }
    buffer.disableBitAccess();
    if (byte0 == 6) {
      byte0 = 0;
		} else {
      incomingPacketOpcode = -1;
		}
  }

  public void method17() {
    aBoolean1320 = true;
    try {
      long l = System.currentTimeMillis();
      int i = 0;
      int j = 20;
      while (aBoolean1243) {
        anInt1101++;
        method81((byte) 1);
        method81((byte) 1);
        method98(47);
        if (++i > 10) {
          long l1 = System.currentTimeMillis();
          int k = (int) (l1 - l) / 10 - j;
          j = 40 - k;
          if (j < 5) {
            j = 5;
          }
          i = 0;
          l = l1;
        }
        try {
          Thread.sleep(j);
        } catch (Exception _ex) {
        }
      }
    } catch (Exception _ex) {
    }
    aBoolean1320 = false;
  }

  public void method18(byte byte0) {
    if (byte0 != 3) {
      return;
    }
    for (SpawnObjectNode class50_sub2 = (SpawnObjectNode) aClass6_1261
        .method158(); class50_sub2 != null; class50_sub2 = (SpawnObjectNode) aClass6_1261
        .method160()) {
      if (class50_sub2.anInt1390 == -1) {
        class50_sub2.anInt1395 = 0;
        method140((byte) -61, class50_sub2);
      } else {
        class50_sub2.unlink();
      }
    }

  }

  public void method19(String s) {
    System.out.println(s);
    try {
      getAppletContext().showDocument(
          new URL(getCodeBase(), "loaderror_" + s + ".html"));
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    do {
      try {
        Thread.sleep(1000L);
      } catch (Exception _ex) {
      }
    } while (true);
  }

  @Override
  public void method8(int i) {
    activePlayers = null;
    anIntArray972 = null;
    anIntArray974 = null;
    aClass50_Sub1_Sub2Array975 = null;
    anIntArray1295 = null;
    aClass18_906 = null;
    aClass18_907 = null;
    aClass18_908 = null;
    aClass18_909 = null;
    aClass50_Sub1_Sub1_Sub3_880 = null;
    aClass50_Sub1_Sub1_Sub3_881 = null;
    aClass50_Sub1_Sub1_Sub3_882 = null;
    aClass50_Sub1_Sub1_Sub3_883 = null;
    aClass50_Sub1_Sub1_Sub3_884 = null;
    aClass50_Sub1_Sub1_Sub3_983 = null;
    aClass50_Sub1_Sub1_Sub3_984 = null;
    aClass50_Sub1_Sub1_Sub3_985 = null;
    aClass50_Sub1_Sub1_Sub3_986 = null;
    aClass50_Sub1_Sub1_Sub3_987 = null;
    aStringArray849 = null;
    aLongArray1130 = null;
    anIntArray1267 = null;
    aClass18_1108 = null;
    aClass18_1109 = null;
    aClass18_1110 = null;
    anIntArray1039 = null;
    anIntArray856 = null;
    aByteArrayArray838 = null;
    aByteArrayArray1232 = null;
    anIntArray857 = null;
    anIntArray858 = null;
    aClass18_1203 = null;
    aClass18_1204 = null;
    aClass18_1205 = null;
    aClass18_1206 = null;
    anIntArrayArray885 = null;
    anIntArrayArray1189 = null;
    anIntArray1123 = null;
    anIntArray1124 = null;
    aClass50_Sub1_Sub1_Sub1_1192 = null;
    aClass50_Sub1_Sub1_Sub1_1193 = null;
    aClass50_Sub1_Sub1_Sub1_1194 = null;
    aClass50_Sub1_Sub1_Sub1_1195 = null;
    aClass50_Sub1_Sub1_Sub1_1196 = null;
    if (aClass7_1248 != null) {
      aClass7_1248.running = false;
    }
    aClass7_1248 = null;
    aClass50_Sub1_Sub1_Sub3_965 = null;
    aClass50_Sub1_Sub1_Sub3_966 = null;
    aClass50_Sub1_Sub1_Sub3_967 = null;
    aClass18_910 = null;
    aClass18_911 = null;
    aClass18_912 = null;
    aClass18_913 = null;
    aClass18_914 = null;
    anIntArrayArrayArray891 = null;
    aByteArrayArrayArray1125 = null;
    aClass22_1164 = null;
    aClass46Array1260 = null;
    aClass50_Sub1_Sub1_Sub1_1122 = null;
    aClass18_1201 = null;
    aClass18_1202 = null;
    aClass18_1198 = null;
    aClass18_1199 = null;
    aClass18_1200 = null;
    aClass50_Sub1_Sub1_Sub1_1116 = null;
    aClass50_Sub1_Sub1_Sub1Array1182 = null;
    aClass50_Sub1_Sub1_Sub1Array1288 = null;
    aClass50_Sub1_Sub1_Sub1Array1079 = null;
    aClass50_Sub1_Sub1_Sub1Array954 = null;
    aClass50_Sub1_Sub1_Sub1Array896 = null;
    stopMusic(false);
    outgoingBuffer = null;
    loginBuffer = null;
    buffer = null;
    aClass18_1156 = null;
    aClass18_1157 = null;
    aClass18_1158 = null;
    aClass18_1159 = null;
    aClass50_Sub1_Sub1_Sub3_1185 = null;
    aClass50_Sub1_Sub1_Sub3_1186 = null;
    aClass50_Sub1_Sub1_Sub3_1187 = null;
    try {
      if (primaryConnection != null) {
        primaryConnection.close();
      }
    } catch (Exception _ex) {
    }
    primaryConnection = null;
    anIntArray1077 = null;
    anIntArray1078 = null;
    aClass50_Sub1_Sub1_Sub1Array1278 = null;
    activeNpcs = null;
    anIntArray1134 = null;
    aByteArray1245 = null;
    aClass50_Sub1_Sub2_1131 = null;
    aClass50_Sub1_Sub1_Sub3Array1153 = null;
    aClass50_Sub1_Sub1_Sub1Array1031 = null;
    anIntArrayArray886 = null;
    aClass50_Sub1_Sub1_Sub3Array976 = null;
    aClass6_1282 = null;
    aClass6_1210 = null;
    aClass50_Sub1_Sub1_Sub1_1086 = null;
    if (requester != null) {
      requester.method339();
    }
    requester = null;
    anIntArray979 = null;
    anIntArray980 = null;
    anIntArray981 = null;
    anIntArray982 = null;
    aStringArray1184 = null;
    aClass6ArrayArrayArray1323 = null;
    i = 96 / i;
    aClass6_1261 = null;
    method141(28614);
    GameObjectDefinition.method433(false);
    NpcDefinition.method358(false);
    ItemDefinition.method222(false);
    Widget.method202();
    Floor.floors = null;
    Class48.aClass48Array815 = null;
    Class4.aClass4Array103 = null;
    AnimationSequence.animationSequences = null;
    SpotAnimation.spotAnimations = null;
    SpotAnimation.aClass33_566 = null;
    Varp.aClass43Array704 = null;
    super.aClass18_15 = null;
    Player.aClass33_1761 = null;
    Canvas.method492(false);
    Scene.method240(false);
    Model.method573(false);
    Animation.method237();
    System.gc();
  }

  public void method21(boolean flag) {
    if (flag) {
      return;
    }
    if (super.anInt28 == 1) {
      if (super.anInt29 >= 539 && super.anInt29 <= 573
          && super.anInt30 >= 169 && super.anInt30 < 205
          && anIntArray1081[0] != -1) {
        aBoolean1181 = true;
        anInt1285 = 0;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 569 && super.anInt29 <= 599
          && super.anInt30 >= 168 && super.anInt30 < 205
          && anIntArray1081[1] != -1) {
        aBoolean1181 = true;
        anInt1285 = 1;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 597 && super.anInt29 <= 627
          && super.anInt30 >= 168 && super.anInt30 < 205
          && anIntArray1081[2] != -1) {
        aBoolean1181 = true;
        anInt1285 = 2;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 625 && super.anInt29 <= 669
          && super.anInt30 >= 168 && super.anInt30 < 203
          && anIntArray1081[3] != -1) {
        aBoolean1181 = true;
        anInt1285 = 3;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 666 && super.anInt29 <= 696
          && super.anInt30 >= 168 && super.anInt30 < 205
          && anIntArray1081[4] != -1) {
        aBoolean1181 = true;
        anInt1285 = 4;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 694 && super.anInt29 <= 724
          && super.anInt30 >= 168 && super.anInt30 < 205
          && anIntArray1081[5] != -1) {
        aBoolean1181 = true;
        anInt1285 = 5;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 722 && super.anInt29 <= 756
          && super.anInt30 >= 169 && super.anInt30 < 205
          && anIntArray1081[6] != -1) {
        aBoolean1181 = true;
        anInt1285 = 6;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 540 && super.anInt29 <= 574
          && super.anInt30 >= 466 && super.anInt30 < 502
          && anIntArray1081[7] != -1) {
        aBoolean1181 = true;
        anInt1285 = 7;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 572 && super.anInt29 <= 602
          && super.anInt30 >= 466 && super.anInt30 < 503
          && anIntArray1081[8] != -1) {
        aBoolean1181 = true;
        anInt1285 = 8;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 599 && super.anInt29 <= 629
          && super.anInt30 >= 466 && super.anInt30 < 503
          && anIntArray1081[9] != -1) {
        aBoolean1181 = true;
        anInt1285 = 9;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 627 && super.anInt29 <= 671
          && super.anInt30 >= 467 && super.anInt30 < 502
          && anIntArray1081[10] != -1) {
        aBoolean1181 = true;
        anInt1285 = 10;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 669 && super.anInt29 <= 699
          && super.anInt30 >= 466 && super.anInt30 < 503
          && anIntArray1081[11] != -1) {
        aBoolean1181 = true;
        anInt1285 = 11;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 696 && super.anInt29 <= 726
          && super.anInt30 >= 466 && super.anInt30 < 503
          && anIntArray1081[12] != -1) {
        aBoolean1181 = true;
        anInt1285 = 12;
        aBoolean950 = true;
      }
      if (super.anInt29 >= 724 && super.anInt29 <= 758
          && super.anInt30 >= 466 && super.anInt30 < 502
          && anIntArray1081[13] != -1) {
        aBoolean1181 = true;
        anInt1285 = 13;
        aBoolean950 = true;
      }
    }
  }

  public void method22(int i) {
    i = 61 / i;
    try {
      int j = localPlayer.anInt1610 + anInt853;
      int k = localPlayer.anInt1611 + anInt1009;
      if (anInt1262 - j < -500 || anInt1262 - j > 500
          || anInt1263 - k < -500 || anInt1263 - k > 500) {
        anInt1262 = j;
        anInt1263 = k;
      }
      if (anInt1262 != j) {
        anInt1262 += (j - anInt1262) / 16;
      }
      if (anInt1263 != k) {
        anInt1263 += (k - anInt1263) / 16;
      }
      if (super.anIntArray32[1] == 1) {
        anInt1253 += (-24 - anInt1253) / 2;
      } else if (super.anIntArray32[2] == 1) {
        anInt1253 += (24 - anInt1253) / 2;
      } else {
        anInt1253 /= 2;
      }
      if (super.anIntArray32[3] == 1) {
        anInt1254 += (12 - anInt1254) / 2;
      } else if (super.anIntArray32[4] == 1) {
        anInt1254 += (-12 - anInt1254) / 2;
      } else {
        anInt1254 /= 2;
      }
      anInt1252 = anInt1252 + anInt1253 / 2 & 0x7ff;
      anInt1251 += anInt1254 / 2;
      if (anInt1251 < 128) {
        anInt1251 = 128;
      }
      if (anInt1251 > 383) {
        anInt1251 = 383;
      }
      int l = anInt1262 >> 7;
      int i1 = anInt1263 >> 7;
      int j1 = method110(anInt1263, anInt1262, (byte) 9, anInt1091);
      int k1 = 0;
      if (l > 3 && i1 > 3 && l < 100 && i1 < 100) {
        for (int l1 = l - 4; l1 <= l + 4; l1++) {
          for (int j2 = i1 - 4; j2 <= i1 + 4; j2++) {
            int k2 = anInt1091;
            if (k2 < 3
                && (aByteArrayArrayArray1125[1][l1][j2] & 2) == 2) {
              k2++;
            }
            int l2 = j1 - anIntArrayArrayArray891[k2][l1][j2];
            if (l2 > k1) {
              k1 = l2;
            }
          }

        }

      }
      int i2 = k1 * 192;
      if (i2 > 0x17f00) {
        i2 = 0x17f00;
      }
      if (i2 < 32768) {
        i2 = 32768;
      }
      if (i2 > anInt1289) {
        anInt1289 += (i2 - anInt1289) / 24;
        return;
      }
      if (i2 < anInt1289) {
        anInt1289 += (i2 - anInt1289) / 80;
			}
    } catch (Exception _ex) {
      SignLink.reporterror("glfc_ex "
          + localPlayer.anInt1610 + ","
          + localPlayer.anInt1611 + "," + anInt1262
          + "," + anInt1263 + "," + anInt889 + "," + anInt890 + ","
          + anInt1040 + "," + anInt1041);
      throw new RuntimeException("eek");
    }
  }

  public boolean method23(Widget class13, int i) {
    i = 98 / i;
    int j = class13.anInt242;
    if (j >= 1 && j <= 200 || j >= 701 && j <= 900) {
      if (j >= 801) {
        j -= 701;
      } else if (j >= 701) {
        j -= 601;
      } else if (j >= 101) {
        j -= 101;
      } else {
        j--;
      }
      aStringArray1184[anInt1183] = "Remove @whi@" + aStringArray849[j];
      anIntArray981[anInt1183] = 775;
      anInt1183++;
      aStringArray1184[anInt1183] = "Message @whi@" + aStringArray849[j];
      anIntArray981[anInt1183] = 984;
      anInt1183++;
      return true;
    }
    if (j >= 401 && j <= 500) {
      aStringArray1184[anInt1183] = "Remove @whi@" + class13.aString230;
      anIntArray981[anInt1183] = 859;
      anInt1183++;
      return true;
    } else {
      return false;
    }
  }

  public void method24(boolean flag, byte[] abyte0, int i) {
    if (!musicEnabled) {
		} else {
      SignLink.midifade = flag ? 1 : 0;
      SignLink.midisave(abyte0, abyte0.length);
      i = 71 / i;
		}
  }

  public void method25(int i) {
    if (i != 0) {
      outgoingBuffer.writeByte(186);
    }
    aBoolean1277 = true;
    for (int j = 0; j < 7; j++) {
      anIntArray1326[j] = -1;
      for (int k = 0; k < Class48.anInt814; k++) {
        if (Class48.aClass48Array815[k].aBoolean821
            || Class48.aClass48Array815[k].anInt816 != j
            + (aBoolean1144 ? 0 : 7)) {
          continue;
        }
        anIntArray1326[j] = k;
        break;
      }

    }

  }

  public void method26(int i, int j) {
    Deque class6 = aClass6ArrayArrayArray1323[anInt1091][i][j];
    if (class6 == null) {
      aClass22_1164.method262(anInt1091, i, j);
      return;
    }
    int k = 0xfa0a1f01;
    Object obj = null;
    for (Item class50_sub1_sub4_sub1 = (Item) class6.method158(); class50_sub1_sub4_sub1 != null;
        class50_sub1_sub4_sub1 = (Item) class6
            .method160()) {
      ItemDefinition class16 = ItemDefinition
          .getDefinition(class50_sub1_sub4_sub1.id);
      int l = class16.anInt345;
      if (class16.aBoolean371) {
        l *= class50_sub1_sub4_sub1.stackSize + 1;
      }
      if (l > k) {
        k = l;
        obj = class50_sub1_sub4_sub1;
      }
    }

    class6.method156((Node) obj);
    Object obj1 = null;
    Object obj2 = null;
    for (Item class50_sub1_sub4_sub1_1 = (Item) class6.method158();
        class50_sub1_sub4_sub1_1 != null; class50_sub1_sub4_sub1_1 = (Item) class6
        .method160()) {
      if (class50_sub1_sub4_sub1_1.id != ((Item) obj).id && obj1 == null) {
        obj1 = class50_sub1_sub4_sub1_1;
      }
      if (class50_sub1_sub4_sub1_1.id != ((Item) obj).id
          && class50_sub1_sub4_sub1_1.id != ((Item) obj1).id
          && obj2 == null) {
        obj2 = class50_sub1_sub4_sub1_1;
      }
    }

    int i1 = i + (j << 7) + 0x60000000;
    aClass22_1164.method248(
        method110(j * 128 + 64, i * 128 + 64, (byte) 9, anInt1091),
        anInt1091, (Renderable) obj, (Renderable) obj1, i1,
        (Renderable) obj2, 2, j, i);
  }

  public void method28(byte byte0) {
    if (anInt1057 > 1) {
      anInt1057--;
    }
    if (anInt873 > 0) {
      anInt873--;
    }
    for (int i = 0; i < 5; i++) {
      if (!method33()) {
        break;
      }
    }

    if (!aBoolean1137) {
      return;
    }
    synchronized (aClass7_1248.synchronizedObject) {
      if (aBoolean962) {
        if (super.anInt28 != 0 || aClass7_1248.anInt136 >= 40) {
          outgoingBuffer.writeByteIsaac(171);
          outgoingBuffer.writeByte(0);
          int i2 = outgoingBuffer.offset;
          int i3 = 0;
          for (int i4 = 0; i4 < aClass7_1248.anInt136; i4++) {
            if (i2 - outgoingBuffer.offset >= 240) {
              break;
            }
            i3++;
            int k4 = aClass7_1248.anIntArray132[i4];
            if (k4 < 0) {
              k4 = 0;
            } else if (k4 > 502) {
              k4 = 502;
            }
            int j5 = aClass7_1248.anIntArray137[i4];
            if (j5 < 0) {
              j5 = 0;
            } else if (j5 > 764) {
              j5 = 764;
            }
            int l5 = k4 * 765 + j5;
            if (aClass7_1248.anIntArray132[i4] == -1
                && aClass7_1248.anIntArray137[i4] == -1) {
              j5 = -1;
              k4 = -1;
              l5 = 0x7ffff;
            }
            if (j5 == anInt1011 && k4 == anInt1012) {
              if (anInt1299 < 2047) {
                anInt1299++;
              }
            } else {
              int i6 = j5 - anInt1011;
              anInt1011 = j5;
              int j6 = k4 - anInt1012;
              anInt1012 = k4;
              if (anInt1299 < 8 && i6 >= -32 && i6 <= 31
                  && j6 >= -32 && j6 <= 31) {
                i6 += 32;
                j6 += 32;
                outgoingBuffer.writeShort((anInt1299 << 12)
                    + (i6 << 6) + j6);
                anInt1299 = 0;
              } else if (anInt1299 < 8) {
                outgoingBuffer.writeMedium(0x800000
                    + (anInt1299 << 19) + l5);
                anInt1299 = 0;
              } else {
                outgoingBuffer.writeInt(0xc0000000
                    + (anInt1299 << 19) + l5);
                anInt1299 = 0;
              }
            }
          }

          outgoingBuffer.writeSizeByte(outgoingBuffer.offset - i2);
          if (i3 >= aClass7_1248.anInt136) {
            aClass7_1248.anInt136 = 0;
          } else {
            aClass7_1248.anInt136 -= i3;
            for (int l4 = 0; l4 < aClass7_1248.anInt136; l4++) {
              aClass7_1248.anIntArray137[l4] = aClass7_1248.anIntArray137[l4
                  + i3];
              aClass7_1248.anIntArray132[l4] = aClass7_1248.anIntArray132[l4
                  + i3];
            }

          }
        }
      } else {
        aClass7_1248.anInt136 = 0;
      }
    }
    if (super.anInt28 != 0) {
      long l = (super.aLong31 - aLong902) / 50L;
      if (l > 4095L) {
        l = 4095L;
      }
      aLong902 = super.aLong31;
      int j2 = super.anInt30;
      if (j2 < 0) {
        j2 = 0;
      } else if (j2 > 502) {
        j2 = 502;
      }
      int j3 = super.anInt29;
      if (j3 < 0) {
        j3 = 0;
      } else if (j3 > 764) {
        j3 = 764;
      }
      int j4 = j2 * 765 + j3;
      int i5 = 0;
      if (super.anInt28 == 2) {
        i5 = 1;
      }
      int k5 = (int) l;
      outgoingBuffer.writeByteIsaac(19);
      outgoingBuffer.writeInt((k5 << 20) + (i5 << 19) + j4);
    }
    if (anInt1264 > 0) {
      anInt1264--;
    }
    if (super.anIntArray32[1] == 1 || super.anIntArray32[2] == 1
        || super.anIntArray32[3] == 1 || super.anIntArray32[4] == 1) {
      aBoolean1265 = true;
    }
    if (aBoolean1265 && anInt1264 <= 0) {
      anInt1264 = 20;
      aBoolean1265 = false;
      outgoingBuffer.writeByteIsaac(140);
      outgoingBuffer.writeShortLE(anInt1251);
      outgoingBuffer.writeShortLE(anInt1252);
    }
    if (super.aBoolean19 && !aBoolean1275) {
      aBoolean1275 = true;
      outgoingBuffer.writeByteIsaac(187);
      outgoingBuffer.writeByte(1);
    }
    if (!super.aBoolean19 && aBoolean1275) {
      aBoolean1275 = false;
      outgoingBuffer.writeByteIsaac(187);
      outgoingBuffer.writeByte(0);
    }
    method143((byte) -40);
    method36(16220);
    method152(-23763);
    anInt871++;
    if (anInt871 > 750) {
      method59(1);
    }
    method100(0);
    method67(-37214);
    method85(0);
    anInt951++;
    if (anInt1023 != 0) {
      anInt1022 += 20;
      if (anInt1022 >= 400) {
        anInt1023 = 0;
      }
    }
    if (anInt1332 != 0) {
      anInt1329++;
      if (anInt1329 >= 15) {
        if (anInt1332 == 2) {
          aBoolean1181 = true;
        }
        if (anInt1332 == 3) {
          aBoolean1240 = true;
        }
        anInt1332 = 0;
      }
    }
    if (anInt1113 != 0) {
      anInt1269++;
      if (super.anInt22 > anInt1114 + 5 || super.anInt22 < anInt1114 - 5
          || super.anInt23 > anInt1115 + 5
          || super.anInt23 < anInt1115 - 5) {
        aBoolean1155 = true;
      }
      if (super.anInt21 == 0) {
        if (anInt1113 == 2) {
          aBoolean1181 = true;
        }
        if (anInt1113 == 3) {
          aBoolean1240 = true;
        }
        anInt1113 = 0;
        if (aBoolean1155 && anInt1269 >= 5) {
          anInt1064 = -1;
          method91(-521);
          if (anInt1064 == anInt1111 && anInt1063 != anInt1112) {
            Widget class13 = Widget.getWidget(anInt1111);
            int i1 = 0;
            if (anInt955 == 1 && class13.anInt242 == 206) {
              i1 = 1;
            }
            if (class13.anIntArray269[anInt1063] <= 0) {
              i1 = 0;
            }
            if (class13.aBoolean217) {
              int k2 = anInt1112;
              int k3 = anInt1063;
              class13.anIntArray269[k3] = class13.anIntArray269[k2];
              class13.anIntArray224[k3] = class13.anIntArray224[k2];
              class13.anIntArray269[k2] = -1;
              class13.anIntArray224[k2] = 0;
            } else if (i1 == 1) {
              int l2 = anInt1112;
              for (int l3 = anInt1063; l2 != l3; ) {
                if (l2 > l3) {
                  class13.method196(l2 - 1, -291, l2);
                  l2--;
                } else if (l2 < l3) {
                  class13.method196(l2 + 1, -291, l2);
                  l2++;
                }
              }

            } else {
              class13.method196(anInt1063, -291, anInt1112);
            }
            outgoingBuffer.writeByteIsaac(123);
            outgoingBuffer.writeShortAddLE(anInt1063);
            outgoingBuffer.writeByteAdd(i1);
            outgoingBuffer.writeShortAdd(anInt1111);
            outgoingBuffer.writeShortLE(anInt1112);
          }
        } else if ((anInt1300 == 1 || method126(anInt1183 - 1,
            aByte1161)) && anInt1183 > 2) {
          method108(811);
        } else if (anInt1183 > 0) {
          method120(anInt1183 - 1, 8);
        }
        anInt1329 = 10;
        super.anInt28 = 0;
      }
    }
    if (Scene.anInt485 != -1) {
      int j = Scene.anInt485;
      int j1 = Scene.anInt486;
      boolean flag = method35(true, false, j1,
          localPlayer.anIntArray1587[0], 0, 0, 0, 0, j,
          0, 0, localPlayer.anIntArray1586[0]);
      Scene.anInt485 = -1;
      if (flag) {
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 1;
        anInt1022 = 0;
      }
    }
    if (super.anInt28 == 1 && aString1058 != null) {
      aString1058 = null;
      aBoolean1240 = true;
      super.anInt28 = 0;
    }
    method54(0);
    if (anInt1053 == -1) {
      method146((byte) 4);
      method21(false);
      method39();
    }
    if (super.anInt21 == 1 || super.anInt28 == 1) {
      anInt1094++;
    }
    if (anInt1284 != 0 || anInt1044 != 0 || anInt1129 != 0) {
      if (anInt893 < 100) {
        anInt893++;
        if (anInt893 == 100) {
          if (anInt1284 != 0) {
            aBoolean1240 = true;
          }
          if (anInt1044 != 0) {
            aBoolean1181 = true;
          }
        }
      }
    } else if (anInt893 > 0) {
      anInt893--;
    }
    if (anInt1071 == 2) {
      method22(409);
    }
    if (anInt1071 == 2 && aBoolean1211) {
      method29(aBoolean959);
    }
    for (int k = 0; k < 5; k++) {
      anIntArray1145[k]++;
    }

    method30((byte) 2);
    super.anInt20++;
    if (super.anInt20 > 4500) {
      anInt873 = 250;
      super.anInt20 -= 500;
      outgoingBuffer.writeByteIsaac(202);
    }
    anInt1118++;
    if (anInt1118 > 500) {
      anInt1118 = 0;
      int k1 = (int) (Math.random() * 8D);
      if ((k1 & 1) == 1) {
        anInt853 += anInt854;
      }
      if ((k1 & 2) == 2) {
        anInt1009 += anInt1010;
      }
      if ((k1 & 4) == 4) {
        anInt1255 += anInt1256;
      }
    }
    if (anInt853 < -50) {
      anInt854 = 2;
    }
    if (anInt853 > 50) {
      anInt854 = -2;
    }
    if (anInt1009 < -55) {
      anInt1010 = 2;
    }
    if (anInt1009 > 55) {
      anInt1010 = -2;
    }
    if (anInt1255 < -40) {
      anInt1256 = 1;
    }
    if (anInt1255 > 40) {
      anInt1256 = -1;
    }
    anInt1045++;
    if (anInt1045 > 500) {
      anInt1045 = 0;
      int l1 = (int) (Math.random() * 8D);
      if ((l1 & 1) == 1) {
        anInt916 += anInt917;
      }
      if ((l1 & 2) == 2) {
        anInt1233 += anInt1234;
      }
    }
    if (anInt916 < -60) {
      anInt917 = 2;
    }
    if (anInt916 > 60) {
      anInt917 = -2;
    }
    if (anInt1233 < -20) {
      anInt1234 = 1;
    }
    if (anInt1233 > 10) {
      anInt1234 = -1;
    }
    anInt872++;
    if (byte0 != 4) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (anInt872 > 50) {
      outgoingBuffer.writeByteIsaac(40);
    }
    try {
      if (primaryConnection != null && outgoingBuffer.offset > 0) {
        primaryConnection.write(0, outgoingBuffer.offset, 0,
            outgoingBuffer.payload);
        outgoingBuffer.offset = 0;
        anInt872 = 0;
			}
    } catch (IOException _ex) {
      method59(1);
		} catch (Exception exception) {
      disconnect(true);
    }
  }

  public void method29(boolean flag) {
    int i = anInt874 * 128 + 64;
    int j = anInt875 * 128 + 64;
    int k = method110(j, i, (byte) 9, anInt1091) - anInt876;
    if (anInt1216 < i) {
      anInt1216 += anInt877 + (i - anInt1216) * anInt878 / 1000;
      if (anInt1216 > i) {
        anInt1216 = i;
      }
    }
    if (anInt1216 > i) {
      anInt1216 -= anInt877 + (anInt1216 - i) * anInt878 / 1000;
      if (anInt1216 < i) {
        anInt1216 = i;
      }
    }
    if (anInt1217 < k) {
      anInt1217 += anInt877 + (k - anInt1217) * anInt878 / 1000;
      if (anInt1217 > k) {
        anInt1217 = k;
      }
    }
    if (anInt1217 > k) {
      anInt1217 -= anInt877 + (anInt1217 - k) * anInt878 / 1000;
      if (anInt1217 < k) {
        anInt1217 = k;
      }
    }
    if (anInt1218 < j) {
      anInt1218 += anInt877 + (j - anInt1218) * anInt878 / 1000;
      if (anInt1218 > j) {
        anInt1218 = j;
      }
    }
    if (anInt1218 > j) {
      anInt1218 -= anInt877 + (anInt1218 - j) * anInt878 / 1000;
      if (anInt1218 < j) {
        anInt1218 = j;
      }
    }
    i = anInt993 * 128 + 64;
    j = anInt994 * 128 + 64;
    k = method110(j, i, (byte) 9, anInt1091) - anInt995;
    int l = i - anInt1216;
    int i1 = k - anInt1217;
    int j1 = j - anInt1218;
    int k1 = (int) Math.sqrt(l * l + j1 * j1);
    int l1 = (int) (Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
    if (!flag) {
      for (int i2 = 1; i2 > 0; i2++) {
			}
    }
    int j2 = (int) (Math.atan2(l, j1) * -325.94900000000001D) & 0x7ff;
    if (l1 < 128) {
      l1 = 128;
    }
    if (l1 > 383) {
      l1 = 383;
    }
    if (anInt1219 < l1) {
      anInt1219 += anInt996 + (l1 - anInt1219) * anInt997 / 1000;
      if (anInt1219 > l1) {
        anInt1219 = l1;
      }
    }
    if (anInt1219 > l1) {
      anInt1219 -= anInt996 + (anInt1219 - l1) * anInt997 / 1000;
      if (anInt1219 < l1) {
        anInt1219 = l1;
      }
    }
    int k2 = j2 - anInt1220;
    if (k2 > 1024) {
      k2 -= 2048;
    }
    if (k2 < -1024) {
      k2 += 2048;
    }
    if (k2 > 0) {
      anInt1220 += anInt996 + k2 * anInt997 / 1000;
      anInt1220 &= 0x7ff;
    }
    if (k2 < 0) {
      anInt1220 -= anInt996 + -k2 * anInt997 / 1000;
      anInt1220 &= 0x7ff;
    }
    int l2 = j2 - anInt1220;
    if (l2 > 1024) {
      l2 -= 2048;
    }
    if (l2 < -1024) {
      l2 += 2048;
    }
    if (l2 < 0 && k2 > 0 || l2 > 0 && k2 < 0) {
      anInt1220 = j2;
    }
  }

  public void method30(byte byte0) {
    if (byte0 == 2) {
      byte0 = 0;
    } else {
      return;
    }
    do {
      int i = method5(-983);
      if (i == -1) {
        break;
      }
      if (anInt1169 != -1 && anInt1169 == anInt1231) {
        if (i == 8 && aString839.length() > 0) {
          aString839 = aString839.substring(0,
              aString839.length() - 1);
        }
        if ((i >= 97 && i <= 122 || i >= 65 && i <= 90 || i >= 48
            && i <= 57 || i == 32)
            && aString839.length() < 12) {
          aString839 += (char) i;
        }
      } else if (aBoolean866) {
        if (i >= 32 && i <= 122 && aString1026.length() < 80) {
          aString1026 += (char) i;
          aBoolean1240 = true;
        }
        if (i == 8 && aString1026.length() > 0) {
          aString1026 = aString1026.substring(0,
              aString1026.length() - 1);
          aBoolean1240 = true;
        }
        if (i == 13 || i == 10) {
          aBoolean866 = false;
          aBoolean1240 = true;
          if (anInt1221 == 1) {
            long l = TextUtils.encodeBase37(aString1026);
            method102(l, -45229);
          }
          if (anInt1221 == 2 && anInt859 > 0) {
            long l1 = TextUtils.encodeBase37(aString1026);
            method53(l1, 0);
          }
          if (anInt1221 == 3 && aString1026.length() > 0) {
            outgoingBuffer.writeByteIsaac(227);
            outgoingBuffer.writeByte(0);
            int j = outgoingBuffer.offset;
            outgoingBuffer.writeLong(aLong1141);
            Class31.method321(aString1026, 569, outgoingBuffer);
            outgoingBuffer.writeSizeByte(outgoingBuffer.offset - j);
            aString1026 = Class31.method322((byte) 0, aString1026);
            aString1026 = ChatCensor.method383((byte) 0,
                aString1026);
            addChatMessage(TextUtils.method303(TextUtils
                .decodeBase37(aLong1141)), aString1026, 6);
            if (anInt887 == 2) {
              anInt887 = 1;
              aBoolean1212 = true;
              outgoingBuffer.writeByteIsaac(176);
              outgoingBuffer.writeByte(anInt1006);
              outgoingBuffer.writeByte(anInt887);
              outgoingBuffer.writeByte(anInt1227);
            }
          }
          if (anInt1221 == 4 && anInt855 < 100) {
            long l2 = TextUtils.encodeBase37(aString1026);
            method90(anInt1154, l2);
          }
          if (anInt1221 == 5 && anInt855 > 0) {
            long l3 = TextUtils.encodeBase37(aString1026);
            method97(325, l3);
          }
        }
      } else if (anInt1244 == 1) {
        if (i >= 48 && i <= 57 && aString949.length() < 10) {
          aString949 += (char) i;
          aBoolean1240 = true;
        }
        if (i == 8 && aString949.length() > 0) {
          aString949 = aString949.substring(0,
              aString949.length() - 1);
          aBoolean1240 = true;
        }
        if (i == 13 || i == 10) {
          if (aString949.length() > 0) {
            int k = 0;
            try {
              k = Integer.parseInt(aString949);
            } catch (Exception _ex) {
            }
            outgoingBuffer.writeByteIsaac(75);
            outgoingBuffer.writeInt(k);
          }
          anInt1244 = 0;
          aBoolean1240 = true;
        }
      } else if (anInt1244 == 2) {
        if (i >= 32 && i <= 122 && aString949.length() < 12) {
          aString949 += (char) i;
          aBoolean1240 = true;
        }
        if (i == 8 && aString949.length() > 0) {
          aString949 = aString949.substring(0,
              aString949.length() - 1);
          aBoolean1240 = true;
        }
        if (i == 13 || i == 10) {
          if (aString949.length() > 0) {
            outgoingBuffer.writeByteIsaac(206);
            outgoingBuffer.writeLong(TextUtils
                .encodeBase37(aString949));
          }
          anInt1244 = 0;
          aBoolean1240 = true;
        }
      } else if (anInt1244 == 3) {
        if (i >= 32 && i <= 122 && aString949.length() < 40) {
          aString949 += (char) i;
          aBoolean1240 = true;
        }
        if (i == 8 && aString949.length() > 0) {
          aString949 = aString949.substring(0,
              aString949.length() - 1);
          aBoolean1240 = true;
        }
      } else if (anInt988 == -1 && anInt1053 == -1) {
        if (i >= 32 && i <= 122 && aString1104.length() < 80) {
          aString1104 += (char) i;
          aBoolean1240 = true;
        }
        if (i == 8 && aString1104.length() > 0) {
          aString1104 = aString1104.substring(0,
              aString1104.length() - 1);
          aBoolean1240 = true;
        }
        if ((i == 13 || i == 10) && aString1104.length() > 0) {
          if (anInt867 == 2) {
            if (aString1104.equals("::clientdrop")) {
              method59(1);
            }
            if (aString1104.equals("::lag")) {
              method138(false);
            }
            if (aString1104.equals("::prefetchmusic")) {
              for (int i1 = 0; i1 < requester
                  .method340(2, -31140); i1++) {
                requester.method327(-44, 2, (byte) 1, i1);
              }

            }
            if (aString1104.equals("::fpson")) {
              aBoolean868 = true;
            }
            if (aString1104.equals("::fpsoff")) {
              aBoolean868 = false;
            }
            if (aString1104.equals("::noclip")) {
              for (int j1 = 0; j1 < 4; j1++) {
                for (int k1 = 1; k1 < 103; k1++) {
                  for (int j2 = 1; j2 < 103; j2++) {
                    aClass46Array1260[j1].anIntArrayArray757[k1][j2] = 0;
                  }

                }

              }

            }
          }
          if (aString1104.startsWith("::")) {
            outgoingBuffer.writeByteIsaac(56);
            outgoingBuffer.writeByte(aString1104.length() - 1);
            outgoingBuffer.writeString(aString1104.substring(2));
          } else {
            String s = aString1104.toLowerCase();
            int i2 = 0;
            if (s.startsWith("yellow:")) {
              i2 = 0;
              aString1104 = aString1104.substring(7);
            } else if (s.startsWith("red:")) {
              i2 = 1;
              aString1104 = aString1104.substring(4);
            } else if (s.startsWith("green:")) {
              i2 = 2;
              aString1104 = aString1104.substring(6);
            } else if (s.startsWith("cyan:")) {
              i2 = 3;
              aString1104 = aString1104.substring(5);
            } else if (s.startsWith("purple:")) {
              i2 = 4;
              aString1104 = aString1104.substring(7);
            } else if (s.startsWith("white:")) {
              i2 = 5;
              aString1104 = aString1104.substring(6);
            } else if (s.startsWith("flash1:")) {
              i2 = 6;
              aString1104 = aString1104.substring(7);
            } else if (s.startsWith("flash2:")) {
              i2 = 7;
              aString1104 = aString1104.substring(7);
            } else if (s.startsWith("flash3:")) {
              i2 = 8;
              aString1104 = aString1104.substring(7);
            } else if (s.startsWith("glow1:")) {
              i2 = 9;
              aString1104 = aString1104.substring(6);
            } else if (s.startsWith("glow2:")) {
              i2 = 10;
              aString1104 = aString1104.substring(6);
            } else if (s.startsWith("glow3:")) {
              i2 = 11;
              aString1104 = aString1104.substring(6);
            }
            s = aString1104.toLowerCase();
            int k2 = 0;
            if (s.startsWith("wave:")) {
              k2 = 1;
              aString1104 = aString1104.substring(5);
            } else if (s.startsWith("wave2:")) {
              k2 = 2;
              aString1104 = aString1104.substring(6);
            } else if (s.startsWith("shake:")) {
              k2 = 3;
              aString1104 = aString1104.substring(6);
            } else if (s.startsWith("scroll:")) {
              k2 = 4;
              aString1104 = aString1104.substring(7);
            } else if (s.startsWith("slide:")) {
              k2 = 5;
              aString1104 = aString1104.substring(6);
            }
            outgoingBuffer.writeByteIsaac(49);
            outgoingBuffer.writeByte(0);
            int i3 = outgoingBuffer.offset;
            outgoingBuffer.writeByteNeg(i2);
            outgoingBuffer.writeByteAdd(k2);
            aClass50_Sub1_Sub2_1131.offset = 0;
            Class31.method321(aString1104, 569,
                aClass50_Sub1_Sub2_1131);
            outgoingBuffer.writeBytes(
                aClass50_Sub1_Sub2_1131.payload, 0,
                aClass50_Sub1_Sub2_1131.offset);
            outgoingBuffer
                .writeSizeByte(outgoingBuffer.offset - i3);
            aString1104 = Class31.method322((byte) 0, aString1104);
            aString1104 = ChatCensor.method383((byte) 0,
                aString1104);
            localPlayer.aString1580 = aString1104;
            localPlayer.anInt1583 = i2;
            localPlayer.anInt1593 = k2;
            localPlayer.anInt1582 = 150;
            if (anInt867 == 2) {
              addChatMessage("@cr2@" + localPlayer.name,
                  localPlayer.aString1580, 2);
            } else if (anInt867 == 1) {
              addChatMessage("@cr1@" + localPlayer.name,
                  localPlayer.aString1580, 2);
            } else {
              addChatMessage(localPlayer.name,
                  localPlayer.aString1580, 2);
            }
            if (anInt1006 == 2) {
              anInt1006 = 3;
              aBoolean1212 = true;
              outgoingBuffer.writeByteIsaac(176);
              outgoingBuffer.writeByte(anInt1006);
              outgoingBuffer.writeByte(anInt887);
              outgoingBuffer.writeByte(anInt1227);
            }
          }
          aString1104 = "";
          aBoolean1240 = true;
        }
      }
    } while (true);
  }

  public DataInputStream method31(String s) throws IOException {
    if (!aBoolean900) {
      if (SignLink.mainapp != null) {
        return SignLink.openurl(s);
      } else {
        return new DataInputStream(
            new URL(getCodeBase(), s).openStream());
      }
    }
    if (aSocket1224 != null) {
      try {
        aSocket1224.close();
      } catch (Exception _ex) {
      }
      aSocket1224 = null;
    }
    aSocket1224 = openSocket(43595);
    aSocket1224.setSoTimeout(10000);
    java.io.InputStream inputstream = aSocket1224.getInputStream();
    OutputStream outputstream = aSocket1224.getOutputStream();
    outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
    return new DataInputStream(inputstream);
  }

  public Socket openSocket(int port) throws IOException {
    if (SignLink.mainapp != null) {
      return SignLink.opensocket(port);
    }
    return new Socket(InetAddress.getByName(getCodeBase().getHost()), port);
  }

  public boolean method33() {
    if (primaryConnection == null) {
      return false;
    }
    try {
      int available = primaryConnection.available();
      if (available == 0) {
        return false;
      }
      if (incomingPacketOpcode == -1) {
        primaryConnection.read(buffer.payload, 0, 1);
        incomingPacketOpcode = buffer.payload[0] & 0xff;
        if (encryption != null) {
          incomingPacketOpcode = incomingPacketOpcode - encryption.nextKey() & 0xff;
        }
        anInt869 = PacketConstants.PACKET_LENGTHS[incomingPacketOpcode];
        available--;
      }
      if (anInt869 == -1) {
        if (available > 0) {
          primaryConnection.read(buffer.payload, 0, 1);
          anInt869 = buffer.payload[0] & 0xff;
          available--;
        } else {
          return false;
        }
      }
      if (anInt869 == -2) {
        if (available > 1) {
          primaryConnection.read(buffer.payload, 0, 2);
          buffer.offset = 0;
          anInt869 = buffer.readUShort();
          available -= 2;
        } else {
          return false;
        }
      }
      if (available < anInt869) {
        return false;
      }
      buffer.offset = 0;
      primaryConnection.read(buffer.payload, 0, anInt869);
      anInt871 = 0;
      anInt905 = anInt904;
      anInt904 = anInt903;
      anInt903 = incomingPacketOpcode;
      if (incomingPacketOpcode == 166) {
        int l = buffer.readShortLE();
        int l10 = buffer.readShortLE();
        int k16 = buffer.readUShort();
        Widget widget = Widget.getWidget(k16);
        widget.anInt228 = l10;
        widget.anInt259 = l;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 186) {
        int i1 = buffer.readUShortSub();
        int widgetId = buffer.readShortLESub();
        int l16 = buffer.readUShortSub();
        int i22 = buffer.readUShortLE();
        Widget.getWidget(widgetId).anInt252 = i1;
        Widget.getWidget(widgetId).anInt253 = i22;
        Widget.getWidget(widgetId).anInt251 = l16;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 216) {
        int j1 = buffer.readShortLESub();
        int widgetId = buffer.readShortLESub();
        Widget.getWidget(widgetId).anInt283 = 1;
        Widget.getWidget(widgetId).anInt284 = j1;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 26) {
        int id = buffer.readUShort();
        int type = buffer.readUByte();
        int delay = buffer.readUShort();
        if (delay == 65535) {
          if (pendingSounds < 50) {
            pendingSoundIDs[pendingSounds] = (short) id;
            pendingSoundTypes[pendingSounds] = type;
            pendingSoundDelays[pendingSounds] = 0;
            pendingSounds++;
          }
        } else if (soundEffectsVolume && !lowMemory && pendingSounds < 50) {
          pendingSoundIDs[pendingSounds] = id;
          pendingSoundTypes[pendingSounds] = type;
          pendingSoundDelays[pendingSounds] = delay + Track.delays[id];
          pendingSounds++;
        }
        Track.tracks[id].pack(0);
        AudioPlayer.playSound(Track.output);
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 182) {
        int l1 = buffer.readUShortSub();
        byte byte0 = buffer.readByteSub();
        anIntArray1005[l1] = byte0;
        if (anIntArray1039[l1] != byte0) {
          anIntArray1039[l1] = byte0;
          updateSettings(0, l1);
          aBoolean1181 = true;
          if (anInt1191 != -1) {
            aBoolean1240 = true;
          }
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 13) {
        for (int i2 = 0; i2 < activePlayers.length; i2++) {
          if (activePlayers[i2] != null) {
            activePlayers[i2].animation = -1;
          }
        }

        for (int l11 = 0; l11 < activeNpcs.length; l11++) {
          if (activeNpcs[l11] != null) {
            activeNpcs[l11].animation = -1;
          }
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 156) {
        anInt1050 = buffer.readUByte();
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 162) {
        int j2 = buffer.readUShortSub();
        int widgetId = buffer.readUShortLE();
        Widget.getWidget(widgetId).anInt283 = 2;
        Widget.getWidget(widgetId).anInt284 = j2;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 109) {
        int k2 = buffer.readUShort();
        method112((byte) 36, k2);
        if (anInt1089 != -1) {
          method44(anInt1089);
          anInt1089 = -1;
          aBoolean1181 = true;
          aBoolean950 = true;
        }
        if (anInt1053 != -1) {
          method44(anInt1053);
          anInt1053 = -1;
          aBoolean1046 = true;
        }
        if (anInt960 != -1) {
          method44(anInt960);
          anInt960 = -1;
        }
        if (anInt1169 != -1) {
          method44(anInt1169);
          anInt1169 = -1;
        }
        if (anInt988 != k2) {
          method44(anInt988);
          anInt988 = k2;
        }
        aBoolean1239 = false;
        aBoolean1240 = true;
        incomingPacketOpcode = -1;
        return true;
      }

      if (ServerPackets.PLAY_SONG.equals(incomingPacketOpcode)) {
        int songID = buffer.readShort();
        if (songID == 65535) {
          songID = -1;
        }
        if (songID != currentSong && musicEnabled && !lowMemory && previousSong == 0) {
          nextSong = songID;
          songChanging = true;
          requester.request(2, nextSong);
        }
        Logger.getAnonymousLogger().info("currentSong :" + songID);
        currentSong = songID;
        incomingPacketOpcode = -1;
        return true;
      }
      if (ServerPackets.PLAY_TEMP_SONG.equals(incomingPacketOpcode)) {
        int i3 = buffer.readUShortLE();
        int j12 = buffer.method554();
        if (musicEnabled && !lowMemory) {
          nextSong = i3;
          songChanging = false;
          requester.request(2, nextSong);
          previousSong = j12;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 158) {
        int j3 = buffer.readShortLE();
        if (j3 != anInt1191) {
          method44(anInt1191);
          anInt1191 = j3;
        }
        aBoolean1240 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 218) {
        int k3 = buffer.readUShort();
        int k12 = buffer.readUShortSub();
        int j17 = k12 >> 10 & 0x1f;
        int j22 = k12 >> 5 & 0x1f;
        int l24 = k12 & 0x1f;
        Widget.getWidget(k3).anInt240 = (j17 << 19) + (j22 << 11)
            + (l24 << 3);
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 157) {
        int l3 = buffer.readUByteNeg();
        String s2 = buffer.readJString();
        int k17 = buffer.readUByte();
        if (l3 >= 1 && l3 <= 5) {
          if (s2.equalsIgnoreCase("null")) {
            s2 = null;
          }
          aStringArray1069[l3 - 1] = s2;
          aBooleanArray1070[l3 - 1] = k17 == 0;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 6) {
        aBoolean866 = false;
        anInt1244 = 2;
        aString949 = "";
        aBoolean1240 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 201) {
        anInt1006 = buffer.readUByte();
        anInt887 = buffer.readUByte();
        anInt1227 = buffer.readUByte();
        aBoolean1212 = true;
        aBoolean1240 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 199) {
        anInt1197 = buffer.readUByte();
        if (anInt1197 == 1) {
          anInt1226 = buffer.readUShort();
        }
        if (anInt1197 >= 2 && anInt1197 <= 6) {
          if (anInt1197 == 2) {
            anInt847 = 64;
            anInt848 = 64;
          }
          if (anInt1197 == 3) {
            anInt847 = 0;
            anInt848 = 64;
          }
          if (anInt1197 == 4) {
            anInt847 = 128;
            anInt848 = 64;
          }
          if (anInt1197 == 5) {
            anInt847 = 64;
            anInt848 = 0;
          }
          if (anInt1197 == 6) {
            anInt847 = 64;
            anInt848 = 128;
          }
          anInt1197 = 2;
          anInt844 = buffer.readUShort();
          anInt845 = buffer.readUShort();
          anInt846 = buffer.readUByte();
        }
        if (anInt1197 == 10) {
          anInt1151 = buffer.readUShort();
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 167) {
        aBoolean1211 = true;
        anInt993 = buffer.readUByte();
        anInt994 = buffer.readUByte();
        anInt995 = buffer.readUShort();
        anInt996 = buffer.readUByte();
        anInt997 = buffer.readUByte();
        if (anInt997 >= 100) {
          int i4 = anInt993 * 128 + 64;
          int l12 = anInt994 * 128 + 64;
          int l17 = method110(l12, i4, (byte) 9, anInt1091)
              - anInt995;
          int k22 = i4 - anInt1216;
          int i25 = l17 - anInt1217;
          int k27 = l12 - anInt1218;
          int i30 = (int) Math.sqrt(k22 * k22 + k27 * k27);
          anInt1219 = (int) (Math.atan2(i25, i30) * 325.94900000000001D) & 0x7ff;
          anInt1220 = (int) (Math.atan2(k22, k27) * -325.94900000000001D) & 0x7ff;
          if (anInt1219 < 128) {
            anInt1219 = 128;
          }
          if (anInt1219 > 383) {
            anInt1219 = 383;
          }
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 5) {
        disconnect(true);
        incomingPacketOpcode = -1;
        return false;
      }
      if (incomingPacketOpcode == 115) {
        int j4 = buffer.method557();
        int i13 = buffer.readUShortLE();
        anIntArray1005[i13] = j4;
        if (anIntArray1039[i13] != j4) {
          anIntArray1039[i13] = j4;
          updateSettings(0, i13);
          aBoolean1181 = true;
          if (anInt1191 != -1) {
            aBoolean1240 = true;
          }
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 29) {
        if (anInt1089 != -1) {
          method44(anInt1089);
          anInt1089 = -1;
          aBoolean1181 = true;
          aBoolean950 = true;
        }
        if (anInt988 != -1) {
          method44(anInt988);
          anInt988 = -1;
          aBoolean1240 = true;
        }
        if (anInt1053 != -1) {
          method44(anInt1053);
          anInt1053 = -1;
          aBoolean1046 = true;
        }
        if (anInt960 != -1) {
          method44(anInt960);
          anInt960 = -1;
        }
        if (anInt1169 != -1) {
          method44(anInt1169);
          anInt1169 = -1;
        }
        if (anInt1244 != 0) {
          anInt1244 = 0;
          aBoolean1240 = true;
        }
        aBoolean1239 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 76) {
        anInt1083 = buffer.readUShortLE();
        anInt1075 = buffer.readShortLESub();
        buffer.readUShort();
        anInt1208 = buffer.readUShort();
        anInt1170 = buffer.readUShortLE();
        anInt1273 = buffer.readUShortSub();
        anInt1215 = buffer.readUShortSub();
        anInt992 = buffer.readUShort();
        anInt1241 = buffer.method555();
        anInt1034 = buffer.readShortLESub();
        buffer.readUByteAdd();
        SignLink.dnslookup(TextUtils.decodeDNS(anInt1241));
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 63) {
        String s = buffer.readJString();
        if (s.endsWith(":tradereq:")) {
          String s3 = s.substring(0, s.indexOf(":"));
          long l18 = TextUtils.encodeBase37(s3);
          boolean flag1 = false;
          for (int l27 = 0; l27 < anInt855; l27++) {
            if (aLongArray1073[l27] != l18) {
              continue;
            }
            flag1 = true;
            break;
          }

          if (!flag1 && anInt1246 == 0) {
            addChatMessage(s3, "wishes to trade with you.", 4);
          }
        } else if (s.endsWith(":duelreq:")) {
          String s4 = s.substring(0, s.indexOf(":"));
          long l19 = TextUtils.encodeBase37(s4);
          boolean flag2 = false;
          for (int i28 = 0; i28 < anInt855; i28++) {
            if (aLongArray1073[i28] != l19) {
              continue;
            }
            flag2 = true;
            break;
          }

          if (!flag2 && anInt1246 == 0) {
            addChatMessage(s4, "wishes to duel with you.", 8);
          }
        } else if (s.endsWith(":chalreq:")) {
          String s5 = s.substring(0, s.indexOf(":"));
          long l20 = TextUtils.encodeBase37(s5);
          boolean flag3 = false;
          for (int j28 = 0; j28 < anInt855; j28++) {
            if (aLongArray1073[j28] != l20) {
              continue;
            }
            flag3 = true;
            break;
          }

          if (!flag3 && anInt1246 == 0) {
            String s8 = s.substring(s.indexOf(":") + 1,
                s.length() - 9);
            addChatMessage(s5, s8, 8);
          }
        } else {
          addChatMessage("", s, 0);
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 50) {
        int k4 = buffer.readShort();
        if (k4 >= 0) {
          method112((byte) 36, k4);
        }
        if (k4 != anInt1279) {
          method44(anInt1279);
          anInt1279 = k4;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 82) {
        boolean flag = buffer.readUByte() == 1;
        int j13 = buffer.readUShort();
        Widget.getWidget(j13).aBoolean219 = flag;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 174) {
        if (anInt1285 == 12) {
          aBoolean1181 = true;
        }
        anInt1030 = buffer.readShort();
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 233) {
        anInt1319 = buffer.readUByte();
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 61) {
        anInt1120 = 0;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 128) {
        int l4 = buffer.readUShortSub();
        int k13 = buffer.readShortLESub();
        if (anInt988 != -1) {
          method44(anInt988);
          anInt988 = -1;
          aBoolean1240 = true;
        }
        if (anInt1053 != -1) {
          method44(anInt1053);
          anInt1053 = -1;
          aBoolean1046 = true;
        }
        if (anInt960 != -1) {
          method44(anInt960);
          anInt960 = -1;
        }
        if (anInt1169 != l4) {
          method44(anInt1169);
          anInt1169 = l4;
        }
        if (anInt1089 != k13) {
          method44(anInt1089);
          anInt1089 = k13;
        }
        if (anInt1244 != 0) {
          anInt1244 = 0;
          aBoolean1240 = true;
        }
        aBoolean1181 = true;
        aBoolean950 = true;
        aBoolean1239 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 67) {
        int i5 = buffer.readUByte();
        int l13 = buffer.readUByte();
        int i18 = buffer.readUByte();
        int l22 = buffer.readUByte();
        aBooleanArray927[i5] = true;
        anIntArray1105[i5] = l13;
        anIntArray852[i5] = i18;
        anIntArray991[i5] = l22;
        anIntArray1145[i5] = 0;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 134) {
        aBoolean1181 = true;
        int j5 = buffer.readUShort();
        Widget class13 = Widget.getWidget(j5);
        while (buffer.offset < anInt869) {
          int j18 = buffer.method535();
          int i23 = buffer.readUShort();
          int j25 = buffer.readUByte();
          if (j25 == 255) {
            j25 = buffer.readInt();
          }
          if (j18 >= 0 && j18 < class13.anIntArray269.length) {
            class13.anIntArray269[j18] = i23;
            class13.anIntArray224[j18] = j25;
          }
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 78) {
        long l5 = buffer.readLong();
        int k18 = buffer.readUByte();
        String s7 = TextUtils.method303(TextUtils.decodeBase37(l5));
        for (int k25 = 0; k25 < anInt859; k25++) {
          if (l5 != aLongArray1130[k25]) {
            continue;
          }
          if (anIntArray1267[k25] != k18) {
            anIntArray1267[k25] = k18;
            aBoolean1181 = true;
            if (k18 > 0) {
              addChatMessage("", s7 + " has logged in.", 5);
            }
            if (k18 == 0) {
              addChatMessage("", s7 + " has logged out.", 5);
            }
          }
          s7 = null;
          break;
        }

        if (s7 != null && anInt859 < 200) {
          aLongArray1130[anInt859] = l5;
          aStringArray849[anInt859] = s7;
          anIntArray1267[anInt859] = k18;
          anInt859++;
          aBoolean1181 = true;
        }
        for (boolean flag5 = false; !flag5; ) {
          flag5 = true;
          for (int j30 = 0; j30 < anInt859 - 1; j30++) {
            if (anIntArray1267[j30] != nodeId
                && anIntArray1267[j30 + 1] == nodeId
                || anIntArray1267[j30] == 0
                && anIntArray1267[j30 + 1] != 0) {
              int l31 = anIntArray1267[j30];
              anIntArray1267[j30] = anIntArray1267[j30 + 1];
              anIntArray1267[j30 + 1] = l31;
              String s10 = aStringArray849[j30];
              aStringArray849[j30] = aStringArray849[j30 + 1];
              aStringArray849[j30 + 1] = s10;
              long l33 = aLongArray1130[j30];
              aLongArray1130[j30] = aLongArray1130[j30 + 1];
              aLongArray1130[j30 + 1] = l33;
              aBoolean1181 = true;
              flag5 = false;
            }
          }

        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 58) {
        aBoolean866 = false;
        anInt1244 = 1;
        aString949 = "";
        aBoolean1240 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 252) {
        anInt1285 = buffer.readUByteNeg();
        aBoolean1181 = true;
        aBoolean950 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 40) {
        anInt990 = buffer.readUByteSub();
        anInt989 = buffer.readUByteNeg();
        for (int k5 = anInt989; k5 < anInt989 + 8; k5++) {
          for (int i14 = anInt990; i14 < anInt990 + 8; i14++) {
            if (aClass6ArrayArrayArray1323[anInt1091][k5][i14] != null) {
              aClass6ArrayArrayArray1323[anInt1091][k5][i14] = null;
              method26(k5, i14);
            }
          }

        }

        for (SpawnObjectNode class50_sub2 = (SpawnObjectNode) aClass6_1261
            .method158(); class50_sub2 != null; class50_sub2 = (SpawnObjectNode) aClass6_1261
            .method160()) {
          if (class50_sub2.anInt1393 >= anInt989
              && class50_sub2.anInt1393 < anInt989 + 8
              && class50_sub2.anInt1394 >= anInt990
              && class50_sub2.anInt1394 < anInt990 + 8
              && class50_sub2.anInt1391 == anInt1091) {
            class50_sub2.anInt1390 = 0;
          }
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 255) {
        int i6 = buffer.readShortLESub();
        Widget.getWidget(i6).anInt283 = 3;
        if (localPlayer.aClass37_1757 == null) {
          Widget.getWidget(i6).anInt284 = (localPlayer.anIntArray1760[0] << 25)
              + (localPlayer.anIntArray1760[4] << 20)
              + (localPlayer.anIntArray1752[0] << 15)
              + (localPlayer.anIntArray1752[8] << 10)
              + (localPlayer.anIntArray1752[11] << 5)
              + localPlayer.anIntArray1752[1];
        } else {
          Widget.getWidget(i6).anInt284 = (int) (0x12345678L + localPlayer.aClass37_1757.aLong628);
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 135) {
        long l6 = buffer.readLong();
        int i19 = buffer.readInt();
        int j23 = buffer.readUByte();
        boolean flag4 = false;
        for (int k28 = 0; k28 < 100; k28++) {
          if (anIntArray1258[k28] != i19) {
            continue;
          }
          flag4 = true;
          break;
        }

        if (j23 <= 1) {
          for (int k30 = 0; k30 < anInt855; k30++) {
            if (aLongArray1073[k30] != l6) {
              continue;
            }
            flag4 = true;
            break;
          }

        }
        if (!flag4 && anInt1246 == 0) {
          try {
            anIntArray1258[anInt1152] = i19;
            anInt1152 = (anInt1152 + 1) % 100;
            String s9 = Class31.method320(0, buffer,
                anInt869 - 13);
            if (j23 != 3) {
              s9 = ChatCensor.method383((byte) 0, s9);
            }
            if (j23 == 2 || j23 == 3) {
              addChatMessage(
                  "@cr2@"
                      + TextUtils.method303(TextUtils
                      .decodeBase37(l6)), s9, 7);
            } else if (j23 == 1) {
              addChatMessage(
                  "@cr1@"
                      + TextUtils.method303(TextUtils
                      .decodeBase37(l6)), s9, 7);
            } else {
              addChatMessage(TextUtils.method303(TextUtils
                  .decodeBase37(l6)), s9, 3);
            }
          } catch (Exception exception1) {
            SignLink.reporterror("cde1");
          }
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 183) {
        anInt989 = buffer.readUByte();
        anInt990 = buffer.readUByteAdd();
        while (buffer.offset < anInt869) {
          int j6 = buffer.readUByte();
          method133(buffer, 0, j6);
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 159) {
        int k6 = buffer.readShortLESub();
        method112((byte) 36, k6);
        if (anInt1089 != -1) {
          method44(anInt1089);
          anInt1089 = -1;
          aBoolean1181 = true;
          aBoolean950 = true;
        }
        if (anInt988 != -1) {
          method44(anInt988);
          anInt988 = -1;
          aBoolean1240 = true;
        }
        if (anInt1053 != -1) {
          method44(anInt1053);
          anInt1053 = -1;
          aBoolean1046 = true;
        }
        if (anInt960 != -1) {
          method44(anInt960);
          anInt960 = -1;
        }
        if (anInt1169 != k6) {
          method44(anInt1169);
          anInt1169 = k6;
        }
        if (anInt1244 != 0) {
          anInt1244 = 0;
          aBoolean1240 = true;
        }
        aBoolean1239 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 246) {
        int i7 = buffer.readShortLESub();
        method112((byte) 36, i7);
        if (anInt988 != -1) {
          method44(anInt988);
          anInt988 = -1;
          aBoolean1240 = true;
        }
        if (anInt1053 != -1) {
          method44(anInt1053);
          anInt1053 = -1;
          aBoolean1046 = true;
        }
        if (anInt960 != -1) {
          method44(anInt960);
          anInt960 = -1;
        }
        if (anInt1169 != -1) {
          method44(anInt1169);
          anInt1169 = -1;
        }
        if (anInt1089 != i7) {
          method44(anInt1089);
          anInt1089 = i7;
        }
        if (anInt1244 != 0) {
          anInt1244 = 0;
          aBoolean1240 = true;
        }
        aBoolean1181 = true;
        aBoolean950 = true;
        aBoolean1239 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 49) {
        aBoolean1181 = true;
        int j7 = buffer.readUByteNeg();
        int j14 = buffer.readUByte();
        int j19 = buffer.readInt();
        anIntArray843[j7] = j19;
        anIntArray1029[j7] = j14;
        anIntArray1054[j7] = 1;
        for (int k23 = 0; k23 < 98; k23++) {
          if (j19 >= anIntArray952[k23]) {
            anIntArray1054[j7] = k23 + 2;
          }
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 206) {
        aBoolean1181 = true;
        int k7 = buffer.readUShort();
        Widget class13_1 = Widget.getWidget(k7);
        int k19 = buffer.readUShort();
        for (int l23 = 0; l23 < k19; l23++) {
          class13_1.anIntArray269[l23] = buffer.readShortLESub();
          int l25 = buffer.readUByteNeg();
          if (l25 == 255) {
            l25 = buffer.method555();
          }
          class13_1.anIntArray224[l23] = l25;
        }

        for (int i26 = k19; i26 < class13_1.anIntArray269.length; i26++) {
          class13_1.anIntArray269[i26] = 0;
          class13_1.anIntArray224[i26] = 0;
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 222 || incomingPacketOpcode == 53) {
        int l7 = anInt889;
        int k14 = anInt890;
        if (incomingPacketOpcode == 222) {
          k14 = buffer.readUShort();
          l7 = buffer.readShortLESub();
          aBoolean1163 = false;
        }
        if (incomingPacketOpcode == 53) {
          l7 = buffer.readUShortSub();
          buffer.enableBitAccess();
          for (int i20 = 0; i20 < 4; i20++) {
            for (int i24 = 0; i24 < 13; i24++) {
              for (int j26 = 0; j26 < 13; j26++) {
                int l28 = buffer.readBits(1);
                if (l28 == 1) {
                  anIntArrayArrayArray879[i20][i24][j26] = buffer
                      .readBits(26);
                } else {
                  anIntArrayArrayArray879[i20][i24][j26] = -1;
                }
              }

            }

          }

          buffer.disableBitAccess();
          k14 = buffer.readUShortSub();
          aBoolean1163 = true;
        }
        if (anInt889 == l7 && anInt890 == k14 && anInt1071 == 2) {
          incomingPacketOpcode = -1;
          return true;
        }
        anInt889 = l7;
        anInt890 = k14;
        anInt1040 = (anInt889 - 6) * 8;
        anInt1041 = (anInt890 - 6) * 8;
				aBoolean1067 = (anInt889 / 8 == 48 || anInt889 / 8 == 49)
						&& anInt890 / 8 == 48;
        if (anInt889 / 8 == 48 && anInt890 / 8 == 148) {
          aBoolean1067 = true;
        }
        anInt1071 = 1;
        aLong1229 = System.currentTimeMillis();
        method125(-332, null, "Loading - please wait.");
        if (incomingPacketOpcode == 222) {
          int j20 = 0;
          for (int j24 = (anInt889 - 6) / 8; j24 <= (anInt889 + 6) / 8; j24++) {
            for (int k26 = (anInt890 - 6) / 8; k26 <= (anInt890 + 6) / 8; k26++) {
              j20++;
            }

          }

          aByteArrayArray838 = new byte[j20][];
          aByteArrayArray1232 = new byte[j20][];
          anIntArray856 = new int[j20];
          anIntArray857 = new int[j20];
          anIntArray858 = new int[j20];
          j20 = 0;
          for (int l26 = (anInt889 - 6) / 8; l26 <= (anInt889 + 6) / 8; l26++) {
            for (int i29 = (anInt890 - 6) / 8; i29 <= (anInt890 + 6) / 8; i29++) {
              anIntArray856[j20] = (l26 << 8) + i29;
              if (aBoolean1067
                  && (i29 == 49 || i29 == 149 || i29 == 147
                  || l26 == 50 || l26 == 49
                  && i29 == 47)) {
                anIntArray857[j20] = -1;
                anIntArray858[j20] = -1;
                j20++;
              } else {
                int l30 = anIntArray857[j20] = requester
                    .method344(0, l26, i29, 0);
                if (l30 != -1) {
                  requester.request(3, l30);
                }
                int i32 = anIntArray858[j20] = requester
                    .method344(0, l26, i29, 1);
                if (i32 != -1) {
                  requester.request(3, i32);
                }
                j20++;
              }
            }

          }

        }
        if (incomingPacketOpcode == 53) {
          int k20 = 0;
          int[] ai = new int[676];
          for (int i27 = 0; i27 < 4; i27++) {
            for (int j29 = 0; j29 < 13; j29++) {
              for (int i31 = 0; i31 < 13; i31++) {
                int j32 = anIntArrayArrayArray879[i27][j29][i31];
                if (j32 != -1) {
                  int i33 = j32 >> 14 & 0x3ff;
                  int k33 = j32 >> 3 & 0x7ff;
                  int j34 = (i33 / 8 << 8) + k33 / 8;
                  for (int l34 = 0; l34 < k20; l34++) {
                    if (ai[l34] != j34) {
                      continue;
                    }
                    j34 = -1;
                    break;
                  }

                  if (j34 != -1) {
                    ai[k20++] = j34;
                  }
                }
              }

            }

          }

          aByteArrayArray838 = new byte[k20][];
          aByteArrayArray1232 = new byte[k20][];
          anIntArray856 = new int[k20];
          anIntArray857 = new int[k20];
          anIntArray858 = new int[k20];
          for (int k29 = 0; k29 < k20; k29++) {
            int j31 = anIntArray856[k29] = ai[k29];
            int k32 = j31 >> 8 & 0xff;
            int j33 = j31 & 0xff;
            int i34 = anIntArray857[k29] = requester.method344(0,
                k32, j33, 0);
            if (i34 != -1) {
              requester.request(3, i34);
            }
            int k34 = anIntArray858[k29] = requester.method344(0,
                k32, j33, 1);
            if (k34 != -1) {
              requester.request(3, k34);
            }
          }

        }
        int i21 = anInt1040 - anInt1042;
        int k24 = anInt1041 - anInt1043;
        anInt1042 = anInt1040;
        anInt1043 = anInt1041;
        for (int j27 = 0; j27 < 16384; j27++) {
          Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[j27];
          if (class50_sub1_sub4_sub3_sub1 != null) {
            for (int k31 = 0; k31 < 10; k31++) {
              class50_sub1_sub4_sub3_sub1.anIntArray1586[k31] -= i21;
              class50_sub1_sub4_sub3_sub1.anIntArray1587[k31] -= k24;
            }

            class50_sub1_sub4_sub3_sub1.anInt1610 -= i21 * 128;
            class50_sub1_sub4_sub3_sub1.anInt1611 -= k24 * 128;
          }
        }

        for (int l29 = 0; l29 < anInt968; l29++) {
          Player class50_sub1_sub4_sub3_sub2 = activePlayers[l29];
          if (class50_sub1_sub4_sub3_sub2 != null) {
            for (int l32 = 0; l32 < 10; l32++) {
              class50_sub1_sub4_sub3_sub2.anIntArray1586[l32] -= i21;
              class50_sub1_sub4_sub3_sub2.anIntArray1587[l32] -= k24;
            }

            class50_sub1_sub4_sub3_sub2.anInt1610 -= i21 * 128;
            class50_sub1_sub4_sub3_sub2.anInt1611 -= k24 * 128;
          }
        }

        aBoolean1209 = true;
        byte byte1 = 0;
        byte byte2 = 104;
        byte byte3 = 1;
        if (i21 < 0) {
          byte1 = 103;
          byte2 = -1;
          byte3 = -1;
        }
        byte byte4 = 0;
        byte byte5 = 104;
        byte byte6 = 1;
        if (k24 < 0) {
          byte4 = 103;
          byte5 = -1;
          byte6 = -1;
        }
        for (int i35 = byte1; i35 != byte2; i35 += byte3) {
          for (int j35 = byte4; j35 != byte5; j35 += byte6) {
            int k35 = i35 + i21;
            int l35 = j35 + k24;
            for (int i36 = 0; i36 < 4; i36++) {
              if (k35 >= 0 && l35 >= 0 && k35 < 104 && l35 < 104) {
                aClass6ArrayArrayArray1323[i36][i35][j35] = aClass6ArrayArrayArray1323[i36][k35][l35];
              } else {
                aClass6ArrayArrayArray1323[i36][i35][j35] = null;
              }
            }

          }

        }

        for (SpawnObjectNode class50_sub2_1 = (SpawnObjectNode) aClass6_1261
            .method158(); class50_sub2_1 != null; class50_sub2_1 = (SpawnObjectNode) aClass6_1261
            .method160()) {
          class50_sub2_1.anInt1393 -= i21;
          class50_sub2_1.anInt1394 -= k24;
          if (class50_sub2_1.anInt1393 < 0
              || class50_sub2_1.anInt1394 < 0
              || class50_sub2_1.anInt1393 >= 104
              || class50_sub2_1.anInt1394 >= 104) {
            class50_sub2_1.unlink();
          }
        }

        if (anInt1120 != 0) {
          anInt1120 -= i21;
          anInt1121 -= k24;
        }
        aBoolean1211 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 190) {
        anInt1057 = buffer.readUShortLE() * 30;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 41 || incomingPacketOpcode == 121 || incomingPacketOpcode == 203 || incomingPacketOpcode
          == 106
          || incomingPacketOpcode == 59 || incomingPacketOpcode == 181 || incomingPacketOpcode == 208
          || incomingPacketOpcode == 107 || incomingPacketOpcode == 142 || incomingPacketOpcode == 88
          || incomingPacketOpcode == 152) {
        method133(buffer, 0, incomingPacketOpcode);
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 125) {
        if (anInt1285 == 12) {
          aBoolean1181 = true;
        }
        anInt1324 = buffer.readUByte();
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 21) {
        int i8 = buffer.readUShort();
        int l14 = buffer.readUShortLE();
        int j21 = buffer.readShortLESub();
        if (l14 == 65535) {
          Widget.getWidget(j21).anInt283 = 0;
          incomingPacketOpcode = -1;
          return true;
        } else {
          ItemDefinition class16 = ItemDefinition.getDefinition(l14);
          Widget.getWidget(j21).anInt283 = 4;
          Widget.getWidget(j21).anInt284 = l14;
          Widget.getWidget(j21).anInt252 = class16.anInt359;
          Widget.getWidget(j21).anInt253 = class16.anInt356;
          Widget.getWidget(j21).anInt251 = class16.anInt369 * 100
              / i8;
          incomingPacketOpcode = -1;
          return true;
        }
      }
      if (incomingPacketOpcode == 3) {
        aBoolean1211 = true;
        anInt874 = buffer.readUByte();
        anInt875 = buffer.readUByte();
        anInt876 = buffer.readUShort();
        anInt877 = buffer.readUByte();
        anInt878 = buffer.readUByte();
        if (anInt878 >= 100) {
          anInt1216 = anInt874 * 128 + 64;
          anInt1218 = anInt875 * 128 + 64;
          anInt1217 = method110(anInt1218, anInt1216, (byte) 9,
              anInt1091) - anInt876;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 2) {
        int j8 = buffer.readShortLESub();
        int i15 = buffer.readShortSub();
        Widget class13_3 = Widget.getWidget(j8);
        if (class13_3.anInt286 != i15 || i15 == -1) {
          class13_3.anInt286 = i15;
          class13_3.anInt235 = 0;
          class13_3.anInt227 = 0;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 71) {
        updateNpcs(buffer, aBoolean1038, anInt869);
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 226) {
        anInt855 = anInt869 / 8;
        for (int k8 = 0; k8 < anInt855; k8++) {
          aLongArray1073[k8] = buffer.readLong();
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 10) {
        int l8 = buffer.readUByteSub();
        int j15 = buffer.readUShortSub();
        if (j15 == 65535) {
          j15 = -1;
        }
        if (anIntArray1081[l8] != j15) {
          method44(anIntArray1081[l8]);
          anIntArray1081[l8] = j15;
        }
        aBoolean1181 = true;
        aBoolean950 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 219) {
        int i9 = buffer.readUShortLE();
        Widget class13_2 = Widget.getWidget(i9);
        for (int k21 = 0; k21 < class13_2.anIntArray269.length; k21++) {
          class13_2.anIntArray269[k21] = -1;
          class13_2.anIntArray269[k21] = 0;
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 238) {
        anInt1213 = buffer.readUByte();
        if (anInt1213 == anInt1285) {
          if (anInt1213 == 3) {
            anInt1285 = 1;
          } else {
            anInt1285 = 3;
          }
          aBoolean1181 = true;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 148) {
        aBoolean1211 = false;
        for (int j9 = 0; j9 < 5; j9++) {
          aBooleanArray927[j9] = false;
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 126) {
        anInt1068 = buffer.readUByte();
        anInt961 = buffer.readUShortLE();
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 75) {
        anInt989 = buffer.readUByteNeg();
        anInt990 = buffer.readUByteAdd();
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 253) {
        int k9 = buffer.readUShortLE();
        int k15 = buffer.readUShortSub();
        method112((byte) 36, k15);
        if (k9 != -1) {
          method112((byte) 36, k9);
        }
        if (anInt1169 != -1) {
          method44(anInt1169);
          anInt1169 = -1;
        }
        if (anInt1089 != -1) {
          method44(anInt1089);
          anInt1089 = -1;
        }
        if (anInt988 != -1) {
          method44(anInt988);
          anInt988 = -1;
        }
        if (anInt1053 != k15) {
          method44(anInt1053);
          anInt1053 = k15;
        }
        if (anInt960 != k15) {
          method44(anInt960);
          anInt960 = k9;
        }
        anInt1244 = 0;
        aBoolean1239 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 251) {
        anInt860 = buffer.readUByte();
        aBoolean1181 = true;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 18) {
        int l9 = buffer.readUShort();
        int l15 = buffer.readUShortSub();
        int l21 = buffer.readUShortLE();
        Widget.getWidget(l15).anInt218 = (l9 << 16) + l21;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 90) {
        method96(anInt869, 69, buffer);
        aBoolean1209 = false;
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 113) {
        for (int i10 = 0; i10 < anIntArray1039.length; i10++) {
          if (anIntArray1039[i10] != anIntArray1005[i10]) {
            anIntArray1039[i10] = anIntArray1005[i10];
            updateSettings(0, i10);
            aBoolean1181 = true;
          }
        }

        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 232) {
        int j10 = buffer.readShortLESub();
        String s6 = buffer.readJString();
        Widget.getWidget(j10).aString230 = s6;
        if (Widget.getWidget(j10).anInt248 == anIntArray1081[anInt1285]) {
          aBoolean1181 = true;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      if (incomingPacketOpcode == 200) {
        int k10 = buffer.readUShort();
        int i16 = buffer.readShortLESub();
        Widget class13_4 = Widget.getWidget(k10);
        if (class13_4 != null && class13_4.anInt236 == 0) {
          if (i16 < 0) {
            i16 = 0;
          }
          if (i16 > class13_4.anInt285 - class13_4.anInt238) {
            i16 = class13_4.anInt285 - class13_4.anInt238;
          }
          class13_4.anInt231 = i16;
        }
        incomingPacketOpcode = -1;
        return true;
      }
      SignLink.reporterror("T1 - " + incomingPacketOpcode + "," + anInt869 + " - "
          + anInt904 + "," + anInt905);
      disconnect(true);
    } catch (IOException _ex) {
      method59(1);
    } catch (Exception exception) {
      String s1 = "T2 - " + incomingPacketOpcode + "," + anInt904 + "," + anInt905
          + " - " + anInt869 + ","
          + (anInt1040 + localPlayer.anIntArray1586[0])
          + ","
          + (anInt1041 + localPlayer.anIntArray1587[0])
          + " - ";
      for (int j16 = 0; j16 < anInt869 && j16 < 50; j16++) {
        s1 = s1 + buffer.payload[j16] + ",";
      }

      SignLink.reporterror(s1);
      disconnect(true);
    }
    return true;
  }

  public void method34(byte byte0) {
    if (anInt1183 < 2 && anInt1146 == 0 && anInt1171 == 0) {
      return;
    }
    if (byte0 != -79) {
      return;
    }
    String s;
    if (anInt1146 == 1 && anInt1183 < 2) {
      s = "Use " + selectedItem + " with...";
    } else if (anInt1171 == 1 && anInt1183 < 2) {
      s = aString1174 + "...";
    } else {
      s = aStringArray1184[anInt1183 - 1];
    }
    if (anInt1183 > 2) {
      s = s + "@whi@ / " + (anInt1183 - 2) + " more options";
    }
    aClass50_Sub1_Sub1_Sub2_1061.method479(true, anInt1325 / 1000, 4,
        0xffffff, 15, s, 0);
  }

  public boolean method35(boolean flag, boolean flag1, int i, int j, int k,
      int l, int i1, int j1, int k1, int l1, int i2, int j2) {
    byte byte0 = 104;
    byte byte1 = 104;
    for (int k2 = 0; k2 < byte0; k2++) {
      for (int l2 = 0; l2 < byte1; l2++) {
        anIntArrayArray885[k2][l2] = 0;
        anIntArrayArray1189[k2][l2] = 0x5f5e0ff;
      }

    }

    int i3 = j2;
    int j3 = j;
    anIntArrayArray885[j2][j] = 99;
    anIntArrayArray1189[j2][j] = 0;
    int k3 = 0;
    int l3 = 0;
    anIntArray1123[k3] = j2;
    anIntArray1124[k3++] = j;
    boolean flag2 = false;
    int i4 = anIntArray1123.length;
    int[][] ai = aClass46Array1260[anInt1091].anIntArrayArray757;
    while (l3 != k3) {
      i3 = anIntArray1123[l3];
      j3 = anIntArray1124[l3];
      l3 = (l3 + 1) % i4;
      if (i3 == k1 && j3 == i) {
        flag2 = true;
        break;
      }
      if (j1 != 0) {
        if ((j1 < 5 || j1 == 10)
            && aClass46Array1260[anInt1091].method420(k1, 0, i,
            j1 - 1, i3, j3, i2)) {
          flag2 = true;
          break;
        }
        if (j1 < 10
            && aClass46Array1260[anInt1091].method421(-37, j3, k1,
            i3, i2, j1 - 1, i)) {
          flag2 = true;
          break;
        }
      }
      if (k != 0
          && l != 0
          && aClass46Array1260[anInt1091].method422(k, i3, true, k1,
          l1, l, i, j3)) {
        flag2 = true;
        break;
      }
      int k4 = anIntArrayArray1189[i3][j3] + 1;
      if (i3 > 0 && anIntArrayArray885[i3 - 1][j3] == 0
          && (ai[i3 - 1][j3] & 0x1280108) == 0) {
        anIntArray1123[k3] = i3 - 1;
        anIntArray1124[k3] = j3;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3 - 1][j3] = 2;
        anIntArrayArray1189[i3 - 1][j3] = k4;
      }
      if (i3 < byte0 - 1 && anIntArrayArray885[i3 + 1][j3] == 0
          && (ai[i3 + 1][j3] & 0x1280180) == 0) {
        anIntArray1123[k3] = i3 + 1;
        anIntArray1124[k3] = j3;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3 + 1][j3] = 8;
        anIntArrayArray1189[i3 + 1][j3] = k4;
      }
      if (j3 > 0 && anIntArrayArray885[i3][j3 - 1] == 0
          && (ai[i3][j3 - 1] & 0x1280102) == 0) {
        anIntArray1123[k3] = i3;
        anIntArray1124[k3] = j3 - 1;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3][j3 - 1] = 1;
        anIntArrayArray1189[i3][j3 - 1] = k4;
      }
      if (j3 < byte1 - 1 && anIntArrayArray885[i3][j3 + 1] == 0
          && (ai[i3][j3 + 1] & 0x1280120) == 0) {
        anIntArray1123[k3] = i3;
        anIntArray1124[k3] = j3 + 1;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3][j3 + 1] = 4;
        anIntArrayArray1189[i3][j3 + 1] = k4;
      }
      if (i3 > 0 && j3 > 0 && anIntArrayArray885[i3 - 1][j3 - 1] == 0
          && (ai[i3 - 1][j3 - 1] & 0x128010e) == 0
          && (ai[i3 - 1][j3] & 0x1280108) == 0
          && (ai[i3][j3 - 1] & 0x1280102) == 0) {
        anIntArray1123[k3] = i3 - 1;
        anIntArray1124[k3] = j3 - 1;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3 - 1][j3 - 1] = 3;
        anIntArrayArray1189[i3 - 1][j3 - 1] = k4;
      }
      if (i3 < byte0 - 1 && j3 > 0
          && anIntArrayArray885[i3 + 1][j3 - 1] == 0
          && (ai[i3 + 1][j3 - 1] & 0x1280183) == 0
          && (ai[i3 + 1][j3] & 0x1280180) == 0
          && (ai[i3][j3 - 1] & 0x1280102) == 0) {
        anIntArray1123[k3] = i3 + 1;
        anIntArray1124[k3] = j3 - 1;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3 + 1][j3 - 1] = 9;
        anIntArrayArray1189[i3 + 1][j3 - 1] = k4;
      }
      if (i3 > 0 && j3 < byte1 - 1
          && anIntArrayArray885[i3 - 1][j3 + 1] == 0
          && (ai[i3 - 1][j3 + 1] & 0x1280138) == 0
          && (ai[i3 - 1][j3] & 0x1280108) == 0
          && (ai[i3][j3 + 1] & 0x1280120) == 0) {
        anIntArray1123[k3] = i3 - 1;
        anIntArray1124[k3] = j3 + 1;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3 - 1][j3 + 1] = 6;
        anIntArrayArray1189[i3 - 1][j3 + 1] = k4;
      }
      if (i3 < byte0 - 1 && j3 < byte1 - 1
          && anIntArrayArray885[i3 + 1][j3 + 1] == 0
          && (ai[i3 + 1][j3 + 1] & 0x12801e0) == 0
          && (ai[i3 + 1][j3] & 0x1280180) == 0
          && (ai[i3][j3 + 1] & 0x1280120) == 0) {
        anIntArray1123[k3] = i3 + 1;
        anIntArray1124[k3] = j3 + 1;
        k3 = (k3 + 1) % i4;
        anIntArrayArray885[i3 + 1][j3 + 1] = 12;
        anIntArrayArray1189[i3 + 1][j3 + 1] = k4;
      }
    }
    anInt1126 = 0;
    if (!flag2) {
      if (flag) {
        int l4 = 1000;
        int j5 = 100;
        byte byte2 = 10;
        for (int i6 = k1 - byte2; i6 <= k1 + byte2; i6++) {
          for (int k6 = i - byte2; k6 <= i + byte2; k6++) {
            if (i6 >= 0 && k6 >= 0 && i6 < 104 && k6 < 104
                && anIntArrayArray1189[i6][k6] < 100) {
              int i7 = 0;
              if (i6 < k1) {
                i7 = k1 - i6;
              } else if (i6 > k1 + k - 1) {
                i7 = i6 - (k1 + k - 1);
              }
              int j7 = 0;
              if (k6 < i) {
                j7 = i - k6;
              } else if (k6 > i + l - 1) {
                j7 = k6 - (i + l - 1);
              }
              int k7 = i7 * i7 + j7 * j7;
              if (k7 < l4 || k7 == l4
                  && anIntArrayArray1189[i6][k6] < j5) {
                l4 = k7;
                j5 = anIntArrayArray1189[i6][k6];
                i3 = i6;
                j3 = k6;
              }
            }
          }

        }

        if (l4 == 1000) {
          return false;
        }
        if (i3 == j2 && j3 == j) {
          return false;
        }
        anInt1126 = 1;
      } else {
        return false;
      }
    }
    l3 = 0;
    if (flag1) {
      method6();
    }
    anIntArray1123[l3] = i3;
    anIntArray1124[l3++] = j3;
    int k5;
    for (int i5 = k5 = anIntArrayArray885[i3][j3]; i3 != j2 || j3 != j;
        i5 = anIntArrayArray885[i3][j3]) {
      if (i5 != k5) {
        k5 = i5;
        anIntArray1123[l3] = i3;
        anIntArray1124[l3++] = j3;
      }
      if ((i5 & 2) != 0) {
        i3++;
      } else if ((i5 & 8) != 0) {
        i3--;
      }
      if ((i5 & 1) != 0) {
        j3++;
      } else if ((i5 & 4) != 0) {
        j3--;
      }
    }

    if (l3 > 0) {
      int j4 = l3;
      if (j4 > 25) {
        j4 = 25;
      }
      l3--;
      int l5 = anIntArray1123[l3];
      int j6 = anIntArray1124[l3];
      if (i1 == 0) {
        outgoingBuffer.writeByteIsaac(28);
        outgoingBuffer.writeByte(j4 + j4 + 3);
      }
      if (i1 == 1) {
        outgoingBuffer.writeByteIsaac(213);
        outgoingBuffer.writeByte(j4 + j4 + 3 + 14);
      }
      if (i1 == 2) {
        outgoingBuffer.writeByteIsaac(247);
        outgoingBuffer.writeByte(j4 + j4 + 3);
      }
      outgoingBuffer.writeShortAddLE(l5 + anInt1040);
      outgoingBuffer.writeByte(super.anIntArray32[5] != 1 ? 0 : 1);
      outgoingBuffer.writeShortAddLE(j6 + anInt1041);
      anInt1120 = anIntArray1123[0];
      anInt1121 = anIntArray1124[0];
      for (int l6 = 1; l6 < j4; l6++) {
        l3--;
        outgoingBuffer.writeByte(anIntArray1123[l3] - l5);
        outgoingBuffer.writeByteSub(anIntArray1124[l3] - j6);
      }

      return true;
    }
    return i1 != 1;
  }

  public void method36(int i) {
    if (i != 16220) {
      anInt1328 = 458;
    }
    if (anInt1071 == 2) {
      for (SpawnObjectNode class50_sub2 = (SpawnObjectNode) aClass6_1261
          .method158(); class50_sub2 != null; class50_sub2 = (SpawnObjectNode) aClass6_1261
          .method160()) {
        if (class50_sub2.anInt1390 > 0) {
          class50_sub2.anInt1390--;
        }
        if (class50_sub2.anInt1390 == 0) {
          if (class50_sub2.anInt1387 < 0
              || Region.method170(class50_sub2.anInt1389,
              aByte1143, class50_sub2.anInt1387)) {
            method45(class50_sub2.anInt1388,
                class50_sub2.anInt1393, class50_sub2.anInt1387,
                class50_sub2.anInt1394, class50_sub2.anInt1391,
                class50_sub2.anInt1389, class50_sub2.anInt1392);
            class50_sub2.unlink();
          }
        } else {
          if (class50_sub2.anInt1395 > 0) {
            class50_sub2.anInt1395--;
          }
          if (class50_sub2.anInt1395 == 0
              && class50_sub2.anInt1393 >= 1
              && class50_sub2.anInt1394 >= 1
              && class50_sub2.anInt1393 <= 102
              && class50_sub2.anInt1394 <= 102
              && (class50_sub2.anInt1384 < 0 || Region.method170(
              class50_sub2.anInt1386, aByte1143,
              class50_sub2.anInt1384))) {
            method45(class50_sub2.anInt1385,
                class50_sub2.anInt1393, class50_sub2.anInt1384,
                class50_sub2.anInt1394, class50_sub2.anInt1391,
                class50_sub2.anInt1386, class50_sub2.anInt1392);
            class50_sub2.anInt1395 = -1;
            if (class50_sub2.anInt1384 == class50_sub2.anInt1387
                && class50_sub2.anInt1387 == -1) {
              class50_sub2.unlink();
            } else if (class50_sub2.anInt1384 == class50_sub2.anInt1387
                && class50_sub2.anInt1385 == class50_sub2.anInt1388
                && class50_sub2.anInt1386 == class50_sub2.anInt1389) {
              class50_sub2.unlink();
            }
          }
        }
      }

    }
  }

  public String method37(int i) {
    if (i != -42588) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (SignLink.mainapp != null) {
      return SignLink.mainapp.getDocumentBase().getHost().toLowerCase();
    }
    if (super.aFrame_Sub1_17 != null) {
      return "runescape.com";
    } else {
      return super.getDocumentBase().getHost().toLowerCase();
    }
  }

  public void method38(int i, int j, int k, Player player) {
    if (player == localPlayer) {
      return;
    }
    if (anInt1183 >= 400) {
      return;
    }
    String name;
    if (player.anInt1759 == 0) {
      name = player.name
          + getCombatLevelColour(player.combatLevel,
          localPlayer.combatLevel) + " (level-"
          + player.combatLevel + ")";
    } else {
      name = player.name + " (skill-" + player.anInt1759 + ")";
    }
    if (anInt1146 == 1) {
      aStringArray1184[anInt1183] = "Use " + selectedItem + " with @whi@"
          + name;
      anIntArray981[anInt1183] = 596;
      anIntArray982[anInt1183] = i;
      anIntArray979[anInt1183] = k;
      anIntArray980[anInt1183] = j;
      anInt1183++;
    } else if (anInt1171 == 1) {
      if ((anInt1173 & 8) == 8) {
        aStringArray1184[anInt1183] = aString1174 + " @whi@" + name;
        anIntArray981[anInt1183] = 918;
        anIntArray982[anInt1183] = i;
        anIntArray979[anInt1183] = k;
        anIntArray980[anInt1183] = j;
        anInt1183++;
      }
    } else {
      for (int i1 = 4; i1 >= 0; i1--) {
        if (aStringArray1069[i1] != null) {
          aStringArray1184[anInt1183] = aStringArray1069[i1]
              + " @whi@" + name;
          char c = '\0';
          if (aStringArray1069[i1].equalsIgnoreCase("attack")) {
            if (player.combatLevel > localPlayer.combatLevel) {
              c = '\u07D0';
            }
            if (localPlayer.anInt1766 != 0 && player.anInt1766 != 0) {
              if (localPlayer.anInt1766 == player.anInt1766) {
                c = '\u07D0';
              } else {
                c = '\0';
              }
            }
          } else if (aBooleanArray1070[i1]) {
            c = '\u07D0';
          }
          if (i1 == 0) {
            anIntArray981[anInt1183] = 200 + c;
          }
          if (i1 == 1) {
            anIntArray981[anInt1183] = 493 + c;
          }
          if (i1 == 2) {
            anIntArray981[anInt1183] = 408 + c;
          }
          if (i1 == 3) {
            anIntArray981[anInt1183] = 677 + c;
          }
          if (i1 == 4) {
            anIntArray981[anInt1183] = 876 + c;
          }
          anIntArray982[anInt1183] = i;
          anIntArray979[anInt1183] = k;
          anIntArray980[anInt1183] = j;
          anInt1183++;
        }
      }

    }
    for (int j1 = 0; j1 < anInt1183; j1++) {
      if (anIntArray981[j1] == 14) {
        aStringArray1184[j1] = "Walk here @whi@" + name;
        return;
      }
    }

  }

  public void method39() {
    if (super.anInt28 == 1) {
      if (super.anInt29 >= 6 && super.anInt29 <= 106
          && super.anInt30 >= 467 && super.anInt30 <= 499) {
        anInt1006 = (anInt1006 + 1) % 4;
        aBoolean1212 = true;
        aBoolean1240 = true;
        outgoingBuffer.writeByteIsaac(176);
        outgoingBuffer.writeByte(anInt1006);
        outgoingBuffer.writeByte(anInt887);
        outgoingBuffer.writeByte(anInt1227);
      }
      if (super.anInt29 >= 135 && super.anInt29 <= 235
          && super.anInt30 >= 467 && super.anInt30 <= 499) {
        anInt887 = (anInt887 + 1) % 3;
        aBoolean1212 = true;
        aBoolean1240 = true;
        outgoingBuffer.writeByteIsaac(176);
        outgoingBuffer.writeByte(anInt1006);
        outgoingBuffer.writeByte(anInt887);
        outgoingBuffer.writeByte(anInt1227);
      }
      if (super.anInt29 >= 273 && super.anInt29 <= 373
          && super.anInt30 >= 467 && super.anInt30 <= 499) {
        anInt1227 = (anInt1227 + 1) % 3;
        aBoolean1212 = true;
        aBoolean1240 = true;
        outgoingBuffer.writeByteIsaac(176);
        outgoingBuffer.writeByte(anInt1006);
        outgoingBuffer.writeByte(anInt887);
        outgoingBuffer.writeByte(anInt1227);
      }
      if (super.anInt29 >= 412 && super.anInt29 <= 512
          && super.anInt30 >= 467 && super.anInt30 <= 499) {
        if (anInt1169 == -1) {
          method15();
          aString839 = "";
          aBoolean1098 = false;
          anInt1231 = anInt1169 = Widget.anInt246;
        } else {
          addChatMessage(
              "",
              "Please close the interface you have open before using 'report abuse'",
              0);
        }
      }
      anInt1160++;
      if (anInt1160 > 161) {
        anInt1160 = 0;
        outgoingBuffer.writeByteIsaac(22);
        outgoingBuffer.writeShort(38304);
      }
    }
  }

  public void method40(int i, Buffer class50_sub1_sub2, int j) {
    for (int k = 0; k < anInt973; k++) {
      int l = anIntArray974[k];
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[l];
      int i1 = class50_sub1_sub2.readUByte();
      if ((i1 & 0x20) != 0) {
        i1 += class50_sub1_sub2.readUByte() << 8;
      }
      method63(2, l, class50_sub1_sub4_sub3_sub2, i1, class50_sub1_sub2);
    }

    i = 70 / i;
  }

  public void method41(int i, boolean flag, Buffer class50_sub1_sub2) {
    class50_sub1_sub2.enableBitAccess();
    int j = class50_sub1_sub2.readBits(1);
    if (j == 0) {
      return;
    }
    int k = class50_sub1_sub2.readBits(2);
    aBoolean1137 &= flag;
    if (k == 0) {
      anIntArray974[anInt973++] = anInt969;
      return;
    }
    if (k == 1) {
      int l = class50_sub1_sub2.readBits(3);
      localPlayer.method566(false, l, -808);
      int k1 = class50_sub1_sub2.readBits(1);
      if (k1 == 1) {
        anIntArray974[anInt973++] = anInt969;
      }
      return;
    }
    if (k == 2) {
      int i1 = class50_sub1_sub2.readBits(3);
      localPlayer.method566(true, i1, -808);
      int l1 = class50_sub1_sub2.readBits(3);
      localPlayer.method566(true, l1, -808);
      int j2 = class50_sub1_sub2.readBits(1);
      if (j2 == 1) {
        anIntArray974[anInt973++] = anInt969;
      }
      return;
    }
    if (k == 3) {
      int j1 = class50_sub1_sub2.readBits(1);
      anInt1091 = class50_sub1_sub2.readBits(2);
      int i2 = class50_sub1_sub2.readBits(7);
      int k2 = class50_sub1_sub2.readBits(7);
      int l2 = class50_sub1_sub2.readBits(1);
      if (l2 == 1) {
        anIntArray974[anInt973++] = anInt969;
      }
      localPlayer.method568(i2, (byte) 5, j1 == 1, k2);
    }
  }

  public void method42(int i, int j, Widget class13, byte byte0, int k,
      int l, int i1, int j1, int k1) {
    if (aBoolean1127) {
      anInt1303 = 32;
    } else {
      anInt1303 = 0;
    }
    aBoolean1127 = false;
    if (byte0 != 102) {
      for (int l1 = 1; l1 > 0; l1++) {
			}
    }
    if (i1 >= k1 && i1 < k1 + 16 && k >= j && k < j + 16) {
      class13.anInt231 -= anInt1094 * 4;
      if (l == 1) {
        aBoolean1181 = true;
      }
      if (l == 2 || l == 3) {
        aBoolean1240 = true;
      }
      return;
    }
    if (i1 >= k1 && i1 < k1 + 16 && k >= j + j1 - 16 && k < j + j1) {
      class13.anInt231 += anInt1094 * 4;
      if (l == 1) {
        aBoolean1181 = true;
      }
      if (l == 2 || l == 3) {
        aBoolean1240 = true;
      }
      return;
    }
    if (i1 >= k1 - anInt1303 && i1 < k1 + 16 + anInt1303 && k >= j + 16
        && k < j + j1 - 16 && anInt1094 > 0) {
      int i2 = (j1 - 32) * j1 / i;
      if (i2 < 8) {
        i2 = 8;
      }
      int j2 = k - j - 16 - i2 / 2;
      int k2 = j1 - 32 - i2;
      class13.anInt231 = (i - j1) * j2 / k2;
      if (l == 1) {
        aBoolean1181 = true;
      }
      if (l == 2 || l == 3) {
        aBoolean1240 = true;
      }
      aBoolean1127 = true;
    }
  }

  public void method43(byte byte0) {
    if (anInt1146 == 0 && anInt1171 == 0) {
      aStringArray1184[anInt1183] = "Walk here";
      anIntArray981[anInt1183] = 14;
      anIntArray979[anInt1183] = super.anInt22;
      anIntArray980[anInt1183] = super.anInt23;
      anInt1183++;
    }
    int i = -1;
    if (byte0 != 7) {
      incomingPacketOpcode = -1;
    }
    for (int j = 0; j < Model.anInt1708; j++) {
      int k = Model.anIntArray1709[j];
      int l = k & 0x7f;
      int i1 = k >> 7 & 0x7f;
      int j1 = k >> 29 & 3;
      int k1 = k >> 14 & 0x7fff;
      if (k == i) {
        continue;
      }
      i = k;
      if (j1 == 2 && aClass22_1164.method271(anInt1091, l, i1, k) >= 0) {
        GameObjectDefinition class47 = GameObjectDefinition.forId(k1);
        if (class47.anIntArray805 != null) {
          class47 = class47.method424(0);
        }
        if (class47 == null) {
          continue;
        }
        if (anInt1146 == 1) {
          aStringArray1184[anInt1183] = "Use " + selectedItem
              + " with @cya@" + class47.aString776;
          anIntArray981[anInt1183] = 467;
          anIntArray982[anInt1183] = k;
          anIntArray979[anInt1183] = l;
          anIntArray980[anInt1183] = i1;
          anInt1183++;
        } else if (anInt1171 == 1) {
          if ((anInt1173 & 4) == 4) {
            aStringArray1184[anInt1183] = aString1174 + " @cya@"
                + class47.aString776;
            anIntArray981[anInt1183] = 376;
            anIntArray982[anInt1183] = k;
            anIntArray979[anInt1183] = l;
            anIntArray980[anInt1183] = i1;
            anInt1183++;
          }
        } else {
          if (class47.aStringArray790 != null) {
            for (int l1 = 4; l1 >= 0; l1--) {
              if (class47.aStringArray790[l1] != null) {
                aStringArray1184[anInt1183] = class47.aStringArray790[l1]
                    + " @cya@" + class47.aString776;
                if (l1 == 0) {
                  anIntArray981[anInt1183] = 35;
                }
                if (l1 == 1) {
                  anIntArray981[anInt1183] = 389;
                }
                if (l1 == 2) {
                  anIntArray981[anInt1183] = 888;
                }
                if (l1 == 3) {
                  anIntArray981[anInt1183] = 892;
                }
                if (l1 == 4) {
                  anIntArray981[anInt1183] = 1280;
                }
                anIntArray982[anInt1183] = k;
                anIntArray979[anInt1183] = l;
                anIntArray980[anInt1183] = i1;
                anInt1183++;
              }
            }

          }
          aStringArray1184[anInt1183] = "Examine @cya@"
              + class47.aString776;
          anIntArray981[anInt1183] = 1412;
          anIntArray982[anInt1183] = class47.anInt773 << 14;
          anIntArray979[anInt1183] = l;
          anIntArray980[anInt1183] = i1;
          anInt1183++;
        }
      }
      if (j1 == 1) {
        Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[k1];
        if (class50_sub1_sub4_sub3_sub1.definition.aByte642 == 1
            && (class50_sub1_sub4_sub3_sub1.anInt1610 & 0x7f) == 64
            && (class50_sub1_sub4_sub3_sub1.anInt1611 & 0x7f) == 64) {
          for (int i2 = 0; i2 < anInt1133; i2++) {
            Npc class50_sub1_sub4_sub3_sub1_1 = activeNpcs[anIntArray1134[i2]];
            if (class50_sub1_sub4_sub3_sub1_1 != null
                && class50_sub1_sub4_sub3_sub1_1 != class50_sub1_sub4_sub3_sub1
                && class50_sub1_sub4_sub3_sub1_1.definition.aByte642 == 1
                && class50_sub1_sub4_sub3_sub1_1.anInt1610
                == class50_sub1_sub4_sub3_sub1.anInt1610
                && class50_sub1_sub4_sub3_sub1_1.anInt1611
                == class50_sub1_sub4_sub3_sub1.anInt1611) {
              method82(class50_sub1_sub4_sub3_sub1_1.definition,
                  i1, l, anIntArray1134[i2]);
            }
          }

          for (int k2 = 0; k2 < anInt971; k2++) {
            Player class50_sub1_sub4_sub3_sub2_1 = activePlayers[anIntArray972[k2]];
            if (class50_sub1_sub4_sub3_sub2_1 != null
                && class50_sub1_sub4_sub3_sub2_1.anInt1610
                == class50_sub1_sub4_sub3_sub1.anInt1610
                && class50_sub1_sub4_sub3_sub2_1.anInt1611
                == class50_sub1_sub4_sub3_sub1.anInt1611) {
              method38(anIntArray972[k2], i1, l,
                  class50_sub1_sub4_sub3_sub2_1);
            }
          }

        }
        method82(class50_sub1_sub4_sub3_sub1.definition, i1, l, k1);
      }
      if (j1 == 0) {
        Player player = activePlayers[k1];
        if ((player.anInt1610 & 0x7f) == 64
            && (player.anInt1611 & 0x7f) == 64) {
          for (int j2 = 0; j2 < anInt1133; j2++) {
            Npc npc = activeNpcs[anIntArray1134[j2]];
            if (npc != null
                && npc.definition.aByte642 == 1
                && npc.anInt1610 == player.anInt1610
                && npc.anInt1611 == player.anInt1611) {
              method82(npc.definition, i1, l, anIntArray1134[j2]);
            }
          }

          for (int l2 = 0; l2 < anInt971; l2++) {
            Player class50_sub1_sub4_sub3_sub2_2 = activePlayers[anIntArray972[l2]];
            if (class50_sub1_sub4_sub3_sub2_2 != null
                && class50_sub1_sub4_sub3_sub2_2 != player
                && class50_sub1_sub4_sub3_sub2_2.anInt1610
                == player.anInt1610
                && class50_sub1_sub4_sub3_sub2_2.anInt1611
                == player.anInt1611) {
              method38(anIntArray972[l2], i1, l,
                  class50_sub1_sub4_sub3_sub2_2);
            }
          }

        }
        method38(k1, i1, l, player);
      }
      if (j1 == 3) {
        Deque class6 = aClass6ArrayArrayArray1323[anInt1091][l][i1];
        if (class6 != null) {
          for (Item item = (Item) class6.method159(); item != null; item = (Item) class6
              .method161()) {
            ItemDefinition definition = ItemDefinition
                .getDefinition(item.id);
            if (anInt1146 == 1) {
              aStringArray1184[anInt1183] = "Use " + selectedItem
                  + " with @lre@" + definition.name;
              anIntArray981[anInt1183] = 100;
              anIntArray982[anInt1183] = item.id;
              anIntArray979[anInt1183] = l;
              anIntArray980[anInt1183] = i1;
              anInt1183++;
            } else if (anInt1171 == 1) {
              if ((anInt1173 & 1) == 1) {
                aStringArray1184[anInt1183] = aString1174
                    + " @lre@" + definition.name;
                anIntArray981[anInt1183] = 199;
                anIntArray982[anInt1183] = item.id;
                anIntArray979[anInt1183] = l;
                anIntArray980[anInt1183] = i1;
                anInt1183++;
              }
            } else {
              for (int i3 = 4; i3 >= 0; i3--) {
                if (definition.aStringArray338 != null
                    && definition.aStringArray338[i3] != null) {
                  aStringArray1184[anInt1183] = definition.aStringArray338[i3]
                      + " @lre@" + definition.name;
                  if (i3 == 0) {
                    anIntArray981[anInt1183] = 68;
                  }
                  if (i3 == 1) {
                    anIntArray981[anInt1183] = 26;
                  }
                  if (i3 == 2) {
                    anIntArray981[anInt1183] = 684;
                  }
                  if (i3 == 3) {
                    anIntArray981[anInt1183] = 930;
                  }
                  if (i3 == 4) {
                    anIntArray981[anInt1183] = 270;
                  }
                  anIntArray982[anInt1183] = item.id;
                  anIntArray979[anInt1183] = l;
                  anIntArray980[anInt1183] = i1;
                  anInt1183++;
                } else if (i3 == 2) {
                  aStringArray1184[anInt1183] = "Take @lre@"
                      + definition.name;
                  anIntArray981[anInt1183] = 684;
                  anIntArray982[anInt1183] = item.id;
                  anIntArray979[anInt1183] = l;
                  anIntArray980[anInt1183] = i1;
                  anInt1183++;
                }
              }

              aStringArray1184[anInt1183] = "Examine @lre@"
                  + definition.name;
              anIntArray981[anInt1183] = 1564;
              anIntArray982[anInt1183] = item.id;
              anIntArray979[anInt1183] = l;
              anIntArray980[anInt1183] = i1;
              anInt1183++;
            }
          }

        }
      }
    }

  }

  public void method44(int i) {
    Widget.method200(i);
  }

  public void method45(int i, int j, int k, int l, int i1, int j1, int k1) {
    if (j >= 1 && l >= 1 && j <= 102 && l <= 102) {
      if (lowMemory && i1 != anInt1091) {
        return;
      }
      int l1 = 0;
      if (k1 == 0) {
        l1 = aClass22_1164.method267(i1, j, l);
      }
      if (k1 == 1) {
        l1 = aClass22_1164.method268(j, (byte) 4, i1, l);
      }
      if (k1 == 2) {
        l1 = aClass22_1164.method269(i1, j, l);
      }
      if (k1 == 3) {
        l1 = aClass22_1164.method270(i1, j, l);
      }
      if (l1 != 0) {
        int l2 = aClass22_1164.method271(i1, j, l, l1);
        int i2 = l1 >> 14 & 0x7fff;
        int j2 = l2 & 0x1f;
        int k2 = l2 >> 6;
        if (k1 == 0) {
          aClass22_1164.method258(l, i1, j, true);
          GameObjectDefinition class47 = GameObjectDefinition
              .forId(i2);
          if (class47.aBoolean810) {
            aClass46Array1260[i1].method416(k2, j, 0, l, j2,
                class47.aBoolean809);
          }
        }
        if (k1 == 1) {
          aClass22_1164.method259(false, j, l, i1);
        }
        if (k1 == 2) {
          aClass22_1164.method260(l, i1, -779, j);
          GameObjectDefinition class47_1 = GameObjectDefinition
              .forId(i2);
          if (j + class47_1.anInt801 > 103
              || l + class47_1.anInt801 > 103
              || j + class47_1.anInt775 > 103
              || l + class47_1.anInt775 > 103) {
            return;
          }
          if (class47_1.aBoolean810) {
            aClass46Array1260[i1].method417(anInt1055, l, j, k2,
                class47_1.anInt775, class47_1.aBoolean809,
                class47_1.anInt801);
          }
        }
        if (k1 == 3) {
          aClass22_1164.method261(j, l, true, i1);
          GameObjectDefinition class47_2 = GameObjectDefinition
              .forId(i2);
          if (class47_2.aBoolean810 && class47_2.aBoolean759) {
            aClass46Array1260[i1].method419(j, (byte) -122, l);
          }
        }
      }
      if (k >= 0) {
        int i3 = i1;
        if (i3 < 3 && (aByteArrayArrayArray1125[1][j][l] & 2) == 2) {
          i3++;
        }
        Region.method165(k, i3, j1, l, aClass46Array1260[i1], i, j, 0,
            i1, aClass22_1164, anIntArrayArrayArray891);
      }
    }
  }

  public void method46(int i, byte byte0, Buffer class50_sub1_sub2) {
    class50_sub1_sub2.enableBitAccess();
    int j = class50_sub1_sub2.readBits(8);
    if (byte0 != aByte1317) {
      anInt1281 = -460;
    }
    if (j < anInt1133) {
      for (int k = j; k < anInt1133; k++) {
        anIntArray1295[anInt1294++] = anIntArray1134[k];
      }

    }
    if (j > anInt1133) {
      SignLink.reporterror(aString1092 + " Too many npcs");
      throw new RuntimeException("eek");
    }
    anInt1133 = 0;
    for (int l = 0; l < j; l++) {
      int i1 = anIntArray1134[l];
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[i1];
      int j1 = class50_sub1_sub2.readBits(1);
      if (j1 == 0) {
        anIntArray1134[anInt1133++] = i1;
        class50_sub1_sub4_sub3_sub1.anInt1585 = anInt1325;
      } else {
        int k1 = class50_sub1_sub2.readBits(2);
        if (k1 == 0) {
          anIntArray1134[anInt1133++] = i1;
          class50_sub1_sub4_sub3_sub1.anInt1585 = anInt1325;
          anIntArray974[anInt973++] = i1;
        } else if (k1 == 1) {
          anIntArray1134[anInt1133++] = i1;
          class50_sub1_sub4_sub3_sub1.anInt1585 = anInt1325;
          int l1 = class50_sub1_sub2.readBits(3);
          class50_sub1_sub4_sub3_sub1.method566(false, l1, -808);
          int j2 = class50_sub1_sub2.readBits(1);
          if (j2 == 1) {
            anIntArray974[anInt973++] = i1;
          }
        } else if (k1 == 2) {
          anIntArray1134[anInt1133++] = i1;
          class50_sub1_sub4_sub3_sub1.anInt1585 = anInt1325;
          int i2 = class50_sub1_sub2.readBits(3);
          class50_sub1_sub4_sub3_sub1.method566(true, i2, -808);
          int k2 = class50_sub1_sub2.readBits(3);
          class50_sub1_sub4_sub3_sub1.method566(true, k2, -808);
          int l2 = class50_sub1_sub2.readBits(1);
          if (l2 == 1) {
            anIntArray974[anInt973++] = i1;
          }
        } else if (k1 == 3) {
          anIntArray1295[anInt1294++] = i1;
        }
      }
    }

  }

  public void addChatMessage(String s, String s1, int i) {
    if (i == 0 && anInt1191 != -1) {
      aString1058 = s1;
      super.anInt28 = 0;
    }
    if (anInt988 == -1) {
      aBoolean1240 = true;
    }
    for (int j = 99; j > 0; j--) {
      anIntArray1296[j] = anIntArray1296[j - 1];
      aStringArray1297[j] = aStringArray1297[j - 1];
      aStringArray1298[j] = aStringArray1298[j - 1];
    }
    anIntArray1296[0] = i;
    aStringArray1297[0] = s;
    aStringArray1298[0] = s1;
  }

  public void updateNpcs(Buffer buffer, boolean flag, int packetSize) {
    anInt1294 = 0;
    anInt973 = 0;
    method46(packetSize, (byte) -58, buffer);
    method132(buffer, packetSize, false);
    method62(buffer, packetSize, 838);
    for (int j = 0; j < anInt1294; j++) {
      int i = anIntArray1295[j];
      if (activeNpcs[i].anInt1585 != anInt1325) {
        activeNpcs[i].definition = null;
        activeNpcs[i] = null;
      }
    }

    if (buffer.offset != packetSize) {
      SignLink.reporterror(aString1092
          + " size mismatch in getnpcpos - pos:" + buffer.offset
          + " psize:" + packetSize);
      throw new RuntimeException("eek");
    }
    for (int l = 0; l < anInt1133; l++) {
      if (activeNpcs[anIntArray1134[l]] == null) {
        SignLink.reporterror(aString1092
            + " null entry in npc list - pos:" + l + " size:"
            + anInt1133);
        throw new RuntimeException("eek");
      }
    }

  }

  public void method49(int i) {
    GameObjectDefinition.aClass33_779.method347();
    GameObjectDefinition.aClass33_762.method347();
    if (i <= 0) {
      for (int j = 1; j > 0; j++) {
			}
    }
    NpcDefinition.aClass33_635.method347();
    ItemDefinition.aClass33_337.method347();
    ItemDefinition.aClass33_346.method347();
    Player.aClass33_1761.method347();
    SpotAnimation.aClass33_566.method347();
  }

  public void stopMusic(boolean flag) {
    SignLink.midiplay = false;
    if (flag) {
      anInt1119 = 466;
    }
    SignLink.midifade = 0;
    SignLink.midi = "stop";
  }

  public void method51(boolean flag) {
    Projectile class50_sub1_sub4_sub2 = (Projectile) aClass6_1282
        .method158();
    if (flag) {
      anInt1328 = 153;
    }
    for (; class50_sub1_sub4_sub2 != null; class50_sub1_sub4_sub2 = (Projectile) aClass6_1282
        .method160()) {
      if (class50_sub1_sub4_sub2.anInt1554 != anInt1091
          || anInt1325 > class50_sub1_sub4_sub2.anInt1566) {
        class50_sub1_sub4_sub2.unlink();
      } else if (anInt1325 >= class50_sub1_sub4_sub2.anInt1565) {
        if (class50_sub1_sub4_sub2.anInt1560 > 0) {
          Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[class50_sub1_sub4_sub2.anInt1560 - 1];
          if (class50_sub1_sub4_sub3_sub1 != null
              && class50_sub1_sub4_sub3_sub1.anInt1610 >= 0
              && class50_sub1_sub4_sub3_sub1.anInt1610 < 13312
              && class50_sub1_sub4_sub3_sub1.anInt1611 >= 0
              && class50_sub1_sub4_sub3_sub1.anInt1611 < 13312) {
            class50_sub1_sub4_sub2
                .method562(
                    class50_sub1_sub4_sub3_sub1.anInt1610,
                    class50_sub1_sub4_sub3_sub1.anInt1611,
                    method110(
                        class50_sub1_sub4_sub3_sub1.anInt1611,
                        class50_sub1_sub4_sub3_sub1.anInt1610,
                        (byte) 9,
                        class50_sub1_sub4_sub2.anInt1554)
                        - class50_sub1_sub4_sub2.anInt1579,
                    anInt1325);
          }
        }
        if (class50_sub1_sub4_sub2.anInt1560 < 0) {
          int i = -class50_sub1_sub4_sub2.anInt1560 - 1;
          Player class50_sub1_sub4_sub3_sub2;
          if (i == anInt961) {
            class50_sub1_sub4_sub3_sub2 = localPlayer;
          } else {
            class50_sub1_sub4_sub3_sub2 = activePlayers[i];
          }
          if (class50_sub1_sub4_sub3_sub2 != null
              && class50_sub1_sub4_sub3_sub2.anInt1610 >= 0
              && class50_sub1_sub4_sub3_sub2.anInt1610 < 13312
              && class50_sub1_sub4_sub3_sub2.anInt1611 >= 0
              && class50_sub1_sub4_sub3_sub2.anInt1611 < 13312) {
            class50_sub1_sub4_sub2
                .method562(
                    class50_sub1_sub4_sub3_sub2.anInt1610,
                    class50_sub1_sub4_sub3_sub2.anInt1611,
                    method110(
                        class50_sub1_sub4_sub3_sub2.anInt1611,
                        class50_sub1_sub4_sub3_sub2.anInt1610,
                        (byte) 9,
                        class50_sub1_sub4_sub2.anInt1554)
                        - class50_sub1_sub4_sub2.anInt1579,
                    anInt1325);
          }
        }
        class50_sub1_sub4_sub2.method563(anInt951, false);
        aClass22_1164.method252(-1, class50_sub1_sub4_sub2,
            (int) class50_sub1_sub4_sub2.aDouble1555,
            (int) class50_sub1_sub4_sub2.aDouble1557, false, 0,
            anInt1091, 60,
            (int) class50_sub1_sub4_sub2.aDouble1556,
            class50_sub1_sub4_sub2.anInt1562);
      }
    }

    anInt1168++;
    if (anInt1168 > 51) {
      anInt1168 = 0;
      outgoingBuffer.writeByteIsaac(248);
    }
  }

  public void method52(boolean flag) {
    aClass50_Sub1_Sub1_Sub3_1292 = new IndexedImage(aClass2_888,
        "titlebox", 0);
    aClass50_Sub1_Sub1_Sub3_1293 = new IndexedImage(aClass2_888,
        "titlebutton", 0);
    aClass50_Sub1_Sub1_Sub3Array1117 = new IndexedImage[12];
    if (flag) {
      method6();
    }
    for (int i = 0; i < 12; i++) {
      aClass50_Sub1_Sub1_Sub3Array1117[i] = new IndexedImage(aClass2_888,
          "runes", i);
    }

    aClass50_Sub1_Sub1_Sub1_1017 = new ImageRGB(128, 265);
    aClass50_Sub1_Sub1_Sub1_1018 = new ImageRGB(128, 265);
		System.arraycopy(aClass18_1201.pixels, 0, aClass50_Sub1_Sub1_Sub1_1017.anIntArray1489, 0,
				33920);

		System.arraycopy(aClass18_1202.pixels, 0, aClass50_Sub1_Sub1_Sub1_1018.anIntArray1489, 0,
				33920);

    anIntArray1311 = new int[256];
    for (int l = 0; l < 64; l++) {
      anIntArray1311[l] = l * 0x40000;
    }

    for (int i1 = 0; i1 < 64; i1++) {
      anIntArray1311[i1 + 64] = 0xff0000 + 1024 * i1;
    }

    for (int j1 = 0; j1 < 64; j1++) {
      anIntArray1311[j1 + 128] = 0xffff00 + 4 * j1;
    }

    for (int k1 = 0; k1 < 64; k1++) {
      anIntArray1311[k1 + 192] = 0xffffff;
    }

    anIntArray1312 = new int[256];
    for (int l1 = 0; l1 < 64; l1++) {
      anIntArray1312[l1] = l1 * 1024;
    }

    for (int i2 = 0; i2 < 64; i2++) {
      anIntArray1312[i2 + 64] = 65280 + 4 * i2;
    }

    for (int j2 = 0; j2 < 64; j2++) {
      anIntArray1312[j2 + 128] = 65535 + 0x40000 * j2;
    }

    for (int k2 = 0; k2 < 64; k2++) {
      anIntArray1312[k2 + 192] = 0xffffff;
    }

    anIntArray1313 = new int[256];
    for (int l2 = 0; l2 < 64; l2++) {
      anIntArray1313[l2] = l2 * 4;
    }

    for (int i3 = 0; i3 < 64; i3++) {
      anIntArray1313[i3 + 64] = 255 + 0x40000 * i3;
    }

    for (int j3 = 0; j3 < 64; j3++) {
      anIntArray1313[j3 + 128] = 0xff00ff + 1024 * j3;
    }

    for (int k3 = 0; k3 < 64; k3++) {
      anIntArray1313[k3 + 192] = 0xffffff;
    }

    anIntArray1310 = new int[256];
    anIntArray1176 = new int[32768];
    anIntArray1177 = new int[32768];
    method83(null, 0);
    anIntArray1084 = new int[32768];
    anIntArray1085 = new int[32768];
    method13(10, true, "Connecting to fileserver");
    if (!aBoolean1243) {
      aBoolean1314 = true;
      aBoolean1243 = true;
      method12(this, 2);
    }
  }

  public void method53(long l, int i) {
    try {
      if (l == 0L) {
        return;
      }
      for (int j = 0; j < anInt859; j++) {
        if (aLongArray1130[j] != l) {
          continue;
        }
        anInt859--;
        aBoolean1181 = true;
        for (int k = j; k < anInt859; k++) {
          aStringArray849[k] = aStringArray849[k + 1];
          anIntArray1267[k] = anIntArray1267[k + 1];
          aLongArray1130[k] = aLongArray1130[k + 1];
        }

        outgoingBuffer.writeByteIsaac(141);
        outgoingBuffer.writeLong(l);
        break;
      }

      anInt869 += i;
      return;
    } catch (RuntimeException runtimeexception) {
      SignLink.reporterror("38799, " + l + ", " + i + ", "
          + runtimeexception);
    }
    throw new RuntimeException();
  }

  public void method54(int i) {
    if (anInt1113 != 0) {
      return;
    }
    int j = super.anInt28;
    if (i != 0) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (anInt1171 == 1 && super.anInt29 >= 516 && super.anInt30 >= 160
        && super.anInt29 <= 765 && super.anInt30 <= 205) {
      j = 0;
    }
    if (aBoolean1065) {
      if (j != 1) {
        int k = super.anInt22;
        int j1 = super.anInt23;
        if (anInt1304 == 0) {
          k -= 4;
          j1 -= 4;
        }
        if (anInt1304 == 1) {
          k -= 553;
          j1 -= 205;
        }
        if (anInt1304 == 2) {
          k -= 17;
          j1 -= 357;
        }
        if (k < anInt1305 - 10 || k > anInt1305 + anInt1307 + 10
            || j1 < anInt1306 - 10
            || j1 > anInt1306 + anInt1308 + 10) {
          aBoolean1065 = false;
          if (anInt1304 == 1) {
            aBoolean1181 = true;
          }
          if (anInt1304 == 2) {
            aBoolean1240 = true;
          }
        }
      }
      if (j == 1) {
        int l = anInt1305;
        int k1 = anInt1306;
        int i2 = anInt1307;
        int k2 = super.anInt29;
        int l2 = super.anInt30;
        if (anInt1304 == 0) {
          k2 -= 4;
          l2 -= 4;
        }
        if (anInt1304 == 1) {
          k2 -= 553;
          l2 -= 205;
        }
        if (anInt1304 == 2) {
          k2 -= 17;
          l2 -= 357;
        }
        int i3 = -1;
        for (int j3 = 0; j3 < anInt1183; j3++) {
          int k3 = k1 + 31 + (anInt1183 - 1 - j3) * 15;
          if (k2 > l && k2 < l + i2 && l2 > k3 - 13 && l2 < k3 + 3) {
            i3 = j3;
          }
        }

        if (i3 != -1) {
          method120(i3, 8);
        }
        aBoolean1065 = false;
        if (anInt1304 == 1) {
          aBoolean1181 = true;
        }
        if (anInt1304 == 2) {
          aBoolean1240 = true;
				}
      }
    } else {
      if (j == 1 && anInt1183 > 0) {
        int i1 = anIntArray981[anInt1183 - 1];
        if (i1 == 9 || i1 == 225 || i1 == 444 || i1 == 564 || i1 == 894
            || i1 == 961 || i1 == 399 || i1 == 324 || i1 == 227
            || i1 == 891 || i1 == 52 || i1 == 1094) {
          int l1 = anIntArray979[anInt1183 - 1];
          int j2 = anIntArray980[anInt1183 - 1];
          Widget class13 = Widget.getWidget(j2);
          if (class13.aBoolean274 || class13.aBoolean217) {
            aBoolean1155 = false;
            anInt1269 = 0;
            anInt1111 = j2;
            anInt1112 = l1;
            anInt1113 = 2;
            anInt1114 = super.anInt29;
            anInt1115 = super.anInt30;
            if (Widget.getWidget(j2).anInt248 == anInt1169) {
              anInt1113 = 1;
            }
            if (Widget.getWidget(j2).anInt248 == anInt988) {
              anInt1113 = 3;
            }
            return;
          }
        }
      }
      if (j == 1
          && (anInt1300 == 1 || method126(anInt1183 - 1, aByte1161))
          && anInt1183 > 2) {
        j = 2;
      }
      if (j == 1 && anInt1183 > 0) {
        method120(anInt1183 - 1, 8);
      }
      if (j == 2 && anInt1183 > 0) {
        method108(811);
      }
    }
  }

  public void method55(int i, ImageRGB class50_sub1_sub1_sub1, int j, int k) {
    int l = k * k + i * i;
    while (j >= 0) {
      incomingPacketOpcode = -1;
    }
    if (l > 4225 && l < 0x15f90) {
      int i1 = anInt1252 + anInt916 & 0x7ff;
      int j1 = Model.anIntArray1710[i1];
      int k1 = Model.anIntArray1711[i1];
      j1 = j1 * 256 / (anInt1233 + 256);
      k1 = k1 * 256 / (anInt1233 + 256);
      int l1 = i * j1 + k * k1 >> 16;
      int i2 = i * k1 - k * j1 >> 16;
      double d = Math.atan2(l1, i2);
      int j2 = (int) (Math.sin(d) * 63D);
      int k2 = (int) (Math.cos(d) * 57D);
      aClass50_Sub1_Sub1_Sub1_1247.method466(256, 15, 94 + j2 + 4 - 10,
          15, 20, anInt1119, 20, d, 83 - k2 - 20);
		} else {
      method130(i, true, class50_sub1_sub1_sub1, k);
		}
  }

  public void method56(boolean flag, int i, int j, int k, int l, int i1) {
    aClass50_Sub1_Sub1_Sub3_1095.method490(i1, j, -488);
    aClass50_Sub1_Sub1_Sub3_1096.method490(i1 + k - 16, j, -488);
    Rasterizer.method449(k - 32, i1 + 16, anInt931, (byte) -24, 16, j);
    int j1 = (k - 32) * k / l;
    if (j1 < 8) {
      j1 = 8;
    }
    int k1 = (k - 32 - j1) * i / (l - k);
    Rasterizer.method449(j1, i1 + 16 + k1, anInt1080, (byte) -24, 16, j);
    Rasterizer.method454(j, anInt1135, j1, false, i1 + 16 + k1);
    Rasterizer.method454(j + 1, anInt1135, j1, false, i1 + 16 + k1);
    if (!flag) {
      anInt921 = -136;
    }
    Rasterizer.method452(j, anInt1135, i1 + 16 + k1, 16, true);
    Rasterizer.method452(j, anInt1135, i1 + 17 + k1, 16, true);
    Rasterizer.method454(j + 15, anInt1287, j1, false, i1 + 16 + k1);
    Rasterizer.method454(j + 14, anInt1287, j1 - 1, false, i1 + 17 + k1);
    Rasterizer.method452(j, anInt1287, i1 + 15 + k1 + j1, 16, true);
    Rasterizer.method452(j + 1, anInt1287, i1 + 14 + k1 + j1, 15, true);
  }

  public void method57(int i, boolean flag) {
    i = 26 / i;
    for (int j = 0; j < anInt1133; j++) {
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[anIntArray1134[j]];
      int k = 0x20000000 + (anIntArray1134[j] << 14);
      if (class50_sub1_sub4_sub3_sub1 == null
          || !class50_sub1_sub4_sub3_sub1.method565()
          || class50_sub1_sub4_sub3_sub1.definition.aBoolean644 != flag
          || !class50_sub1_sub4_sub3_sub1.definition.method360(-993)) {
        continue;
      }
      int l = class50_sub1_sub4_sub3_sub1.anInt1610 >> 7;
      int i1 = class50_sub1_sub4_sub3_sub1.anInt1611 >> 7;
      if (l < 0 || l >= 104 || i1 < 0 || i1 >= 104) {
        continue;
      }
      if (class50_sub1_sub4_sub3_sub1.anInt1601 == 1
          && (class50_sub1_sub4_sub3_sub1.anInt1610 & 0x7f) == 64
          && (class50_sub1_sub4_sub3_sub1.anInt1611 & 0x7f) == 64) {
        if (anIntArrayArray886[l][i1] == anInt1138) {
          continue;
        }
        anIntArrayArray886[l][i1] = anInt1138;
      }
      if (!class50_sub1_sub4_sub3_sub1.definition.aBoolean631) {
        k += 0x80000000;
      }
      aClass22_1164
          .method252(
              k,
              class50_sub1_sub4_sub3_sub1,
              class50_sub1_sub4_sub3_sub1.anInt1610,
              method110(
                  class50_sub1_sub4_sub3_sub1.anInt1611,
                  class50_sub1_sub4_sub3_sub1.anInt1610,
                  (byte) 9, anInt1091),
              class50_sub1_sub4_sub3_sub1.aBoolean1592,
              0,
              anInt1091,
              (class50_sub1_sub4_sub3_sub1.anInt1601 - 1) * 64 + 60,
              class50_sub1_sub4_sub3_sub1.anInt1611,
              class50_sub1_sub4_sub3_sub1.anInt1612);
    }

  }

  public void updateSoundEffectsVolume(int i, int j) {
    SignLink.wavevol = j;
    if (i <= 0) {
      anInt1051 = 57;
    }
  }

  public void method59(int i) {
    if (anInt873 > 0) {
      disconnect(true);
      return;
    }
    method125(-332, "Please wait - attempting to reestablish",
        "Connection lost");
    anInt1050 = 0;
    if (i != 1) {
      aBoolean1242 = !aBoolean1242;
    }
    anInt1120 = 0;
    BufferedConnection class17 = primaryConnection;
    aBoolean1137 = false;
    anInt850 = 0;
    method79(aString1092, aString1093, true);
    if (!aBoolean1137) {
      disconnect(true);
    }
    try {
      class17.close();
		} catch (Exception _ex) {
		}
  }

  public boolean method60(int i, Widget class13) {
    int j = class13.anInt242;
    if (i <= 0) {
      incomingPacketOpcode = -1;
    }
    if (anInt860 == 2) {
      if (j == 201) {
        aBoolean1240 = true;
        anInt1244 = 0;
        aBoolean866 = true;
        aString1026 = "";
        anInt1221 = 1;
        aString937 = "Enter name of friend to add to list";
      }
      if (j == 202) {
        aBoolean1240 = true;
        anInt1244 = 0;
        aBoolean866 = true;
        aString1026 = "";
        anInt1221 = 2;
        aString937 = "Enter name of friend to delete from list";
      }
    }
    if (j == 205) {
      anInt873 = 250;
      return true;
    }
    if (j == 501) {
      aBoolean1240 = true;
      anInt1244 = 0;
      aBoolean866 = true;
      aString1026 = "";
      anInt1221 = 4;
      aString937 = "Enter name of player to add to list";
    }
    if (j == 502) {
      aBoolean1240 = true;
      anInt1244 = 0;
      aBoolean866 = true;
      aString1026 = "";
      anInt1221 = 5;
      aString937 = "Enter name of player to delete from list";
    }
    if (j >= 300 && j <= 313) {
      int k = (j - 300) / 2;
      int j1 = j & 1;
      int i2 = anIntArray1326[k];
      if (i2 != -1) {
        do {
          if (j1 == 0 && --i2 < 0) {
            i2 = Class48.anInt814 - 1;
          }
          if (j1 == 1 && ++i2 >= Class48.anInt814) {
            i2 = 0;
          }
        } while (Class48.aClass48Array815[i2].aBoolean821
            || Class48.aClass48Array815[i2].anInt816 != k
            + (aBoolean1144 ? 0 : 7));
        anIntArray1326[k] = i2;
        aBoolean1277 = true;
      }
    }
    if (j >= 314 && j <= 323) {
      int l = (j - 314) / 2;
      int k1 = j & 1;
      int j2 = anIntArray1099[l];
      if (k1 == 0 && --j2 < 0) {
        j2 = anIntArrayArray1008[l].length - 1;
      }
      if (k1 == 1 && ++j2 >= anIntArrayArray1008[l].length) {
        j2 = 0;
      }
      anIntArray1099[l] = j2;
      aBoolean1277 = true;
    }
    if (j == 324 && !aBoolean1144) {
      aBoolean1144 = true;
      method25(anInt1015);
    }
    if (j == 325 && aBoolean1144) {
      aBoolean1144 = false;
      method25(anInt1015);
    }
    if (j == 326) {
      outgoingBuffer.writeByteIsaac(163);
      outgoingBuffer.writeByte(aBoolean1144 ? 0 : 1);
      for (int i1 = 0; i1 < 7; i1++) {
        outgoingBuffer.writeByte(anIntArray1326[i1]);
      }

      for (int l1 = 0; l1 < 5; l1++) {
        outgoingBuffer.writeByte(anIntArray1099[l1]);
      }

      return true;
    }
    if (j == 620) {
      aBoolean1098 = !aBoolean1098;
    }
    if (j >= 601 && j <= 613) {
      method15();
      if (aString839.length() > 0) {
        outgoingBuffer.writeByteIsaac(184);
        outgoingBuffer.writeLong(TextUtils.encodeBase37(aString839));
        outgoingBuffer.writeByte(j - 601);
        outgoingBuffer.writeByte(aBoolean1098 ? 1 : 0);
      }
    }
    return false;
  }

  public Archive method61(int i, int j, String s, int k, int l, String s1) {
    byte[] abyte0 = null;
    int i1 = 5;
    try {
      if (aClass23Array1228[0] != null) {
        abyte0 = aClass23Array1228[0].decompress(l);
      }
    } catch (Exception _ex) {
    }
    if (abyte0 != null) {
      aCRC32_1088.reset();
      aCRC32_1088.update(abyte0);
      int j1 = (int) aCRC32_1088.getValue();
      if (j1 != j) {
        abyte0 = null;
      }
    }
    if (abyte0 != null) {
      Archive class2 = new Archive(abyte0);
      return class2;
    }
    int k1 = 0;
    if (i != 14076) {
      anInt1281 = -343;
    }
    while (abyte0 == null) {
      String s2 = "Unknown error";
      method13(k, true, "Requesting " + s1);
      try {
        int l1 = 0;
        DataInputStream datainputstream = method31(s + j);
        byte[] abyte1 = new byte[6];
        datainputstream.readFully(abyte1, 0, 6);
        Buffer class50_sub1_sub2 = new Buffer(abyte1);
        class50_sub1_sub2.offset = 3;
        int j2 = class50_sub1_sub2.readMedium() + 6;
        int k2 = 6;
        abyte0 = new byte[j2];
				System.arraycopy(abyte1, 0, abyte0, 0, 6);

        while (k2 < j2) {
          int i3 = j2 - k2;
          if (i3 > 1000) {
            i3 = 1000;
          }
          int k3 = datainputstream.read(abyte0, k2, i3);
          if (k3 < 0) {
            s2 = "Length error: " + k2 + "/" + j2;
            throw new IOException("EOF");
          }
          k2 += k3;
          int l3 = k2 * 100 / j2;
          if (l3 != l1) {
            method13(k, true, "Loading " + s1 + " - " + l3 + "%");
          }
          l1 = l3;
        }
        datainputstream.close();
        try {
          if (aClass23Array1228[0] != null) {
            aClass23Array1228[0].put(abyte0, abyte0.length, l);
          }
        } catch (Exception _ex) {
          aClass23Array1228[0] = null;
        }
        if (abyte0 != null) {
          aCRC32_1088.reset();
          aCRC32_1088.update(abyte0);
          int j3 = (int) aCRC32_1088.getValue();
          if (j3 != j) {
            abyte0 = null;
            k1++;
            s2 = "Checksum error: " + j3;
          }
        }
      } catch (IOException ioexception) {
        if (s2.equals("Unknown error")) {
          s2 = "Connection error";
        }
        abyte0 = null;
      } catch (NullPointerException _ex) {
        s2 = "Null error";
        abyte0 = null;
        if (!SignLink.reporterror) {
          return null;
        }
      } catch (ArrayIndexOutOfBoundsException _ex) {
        s2 = "Bounds error";
        abyte0 = null;
        if (!SignLink.reporterror) {
          return null;
        }
      } catch (Exception _ex) {
        s2 = "Unexpected error";
        abyte0 = null;
        if (!SignLink.reporterror) {
          return null;
        }
      }
      if (abyte0 == null) {
        for (int i2 = i1; i2 > 0; i2--) {
          if (k1 >= 3) {
            method13(k, true, "Game updated - please reload page");
            i2 = 10;
          } else {
            method13(k, true, s2 + " - Retrying in " + i2);
          }
          try {
            Thread.sleep(1000L);
          } catch (Exception _ex) {
          }
        }

        i1 *= 2;
        if (i1 > 60) {
          i1 = 60;
        }
        aBoolean900 = !aBoolean900;
      }
    }
    Archive class2_1 = new Archive(abyte0);
    return class2_1;
  }

  @Override
  public void method10(byte byte0) {
    aBoolean1046 = true;
    if (byte0 == -99) {
		}
  }

  public void method62(Buffer class50_sub1_sub2, int i, int j) {
    j = 24 / j;
    for (int k = 0; k < anInt973; k++) {
      int l = anIntArray974[k];
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[l];
      int i1 = class50_sub1_sub2.readUByte();
      if ((i1 & 1) != 0) {
        class50_sub1_sub4_sub3_sub1.definition = NpcDefinition
            .method364(class50_sub1_sub2.readUShortSub());
        class50_sub1_sub4_sub3_sub1.anInt1601 = class50_sub1_sub4_sub3_sub1.definition.aByte642;
        class50_sub1_sub4_sub3_sub1.anInt1600 = class50_sub1_sub4_sub3_sub1.definition.anInt651;
        class50_sub1_sub4_sub3_sub1.anInt1619 = class50_sub1_sub4_sub3_sub1.definition.anInt645;
        class50_sub1_sub4_sub3_sub1.anInt1620 = class50_sub1_sub4_sub3_sub1.definition.anInt643;
        class50_sub1_sub4_sub3_sub1.anInt1621 = class50_sub1_sub4_sub3_sub1.definition.anInt641;
        class50_sub1_sub4_sub3_sub1.anInt1622 = class50_sub1_sub4_sub3_sub1.definition.anInt633;
        class50_sub1_sub4_sub3_sub1.anInt1634 = class50_sub1_sub4_sub3_sub1.definition.anInt621;
      }
      if ((i1 & 0x40) != 0) {
        class50_sub1_sub4_sub3_sub1.anInt1609 = class50_sub1_sub2
            .readUShortLE();
        if (class50_sub1_sub4_sub3_sub1.anInt1609 == 65535) {
          class50_sub1_sub4_sub3_sub1.anInt1609 = -1;
        }
      }
      if ((i1 & 0x80) != 0) {
        int j1 = class50_sub1_sub2.readUByteAdd();
        int j2 = class50_sub1_sub2.readUByteAdd();
        class50_sub1_sub4_sub3_sub1.method567(anInt1325, false, j1, j2);
        class50_sub1_sub4_sub3_sub1.anInt1595 = anInt1325 + 300;
        class50_sub1_sub4_sub3_sub1.anInt1596 = class50_sub1_sub2
            .readUByte();
        class50_sub1_sub4_sub3_sub1.anInt1597 = class50_sub1_sub2
            .readUByteSub();
      }
      if ((i1 & 4) != 0) {
        class50_sub1_sub4_sub3_sub1.anInt1614 = class50_sub1_sub2
            .readUShort();
        int k1 = class50_sub1_sub2.method556();
        class50_sub1_sub4_sub3_sub1.anInt1618 = k1 >> 16;
        class50_sub1_sub4_sub3_sub1.anInt1617 = anInt1325
            + (k1 & 0xffff);
        class50_sub1_sub4_sub3_sub1.anInt1615 = 0;
        class50_sub1_sub4_sub3_sub1.anInt1616 = 0;
        if (class50_sub1_sub4_sub3_sub1.anInt1617 > anInt1325) {
          class50_sub1_sub4_sub3_sub1.anInt1615 = -1;
        }
        if (class50_sub1_sub4_sub3_sub1.anInt1614 == 65535) {
          class50_sub1_sub4_sub3_sub1.anInt1614 = -1;
        }
      }
      if ((i1 & 0x20) != 0) {
        class50_sub1_sub4_sub3_sub1.aString1580 = class50_sub1_sub2
            .readJString();
        class50_sub1_sub4_sub3_sub1.anInt1582 = 100;
      }
      if ((i1 & 8) != 0) {
        class50_sub1_sub4_sub3_sub1.anInt1598 = class50_sub1_sub2
            .readShortLESub();
        class50_sub1_sub4_sub3_sub1.anInt1599 = class50_sub1_sub2
            .readUShortLE();
      }
      if ((i1 & 2) != 0) {
        int l1 = class50_sub1_sub2.readUShort();
        if (l1 == 65535) {
          l1 = -1;
        }
        int k2 = class50_sub1_sub2.readUByteSub();
        if (l1 == class50_sub1_sub4_sub3_sub1.animation
            && l1 != -1) {
          int i3 = AnimationSequence.animationSequences[l1].anInt307;
          if (i3 == 1) {
            class50_sub1_sub4_sub3_sub1.anInt1625 = 0;
            class50_sub1_sub4_sub3_sub1.anInt1626 = 0;
            class50_sub1_sub4_sub3_sub1.anInt1627 = k2;
            class50_sub1_sub4_sub3_sub1.anInt1628 = 0;
          }
          if (i3 == 2) {
            class50_sub1_sub4_sub3_sub1.anInt1628 = 0;
          }
        } else if (l1 == -1
            || class50_sub1_sub4_sub3_sub1.animation == -1
            || AnimationSequence.animationSequences[l1].anInt301
            >= AnimationSequence.animationSequences[class50_sub1_sub4_sub3_sub1.animation].anInt301) {
          class50_sub1_sub4_sub3_sub1.animation = l1;
          class50_sub1_sub4_sub3_sub1.anInt1625 = 0;
          class50_sub1_sub4_sub3_sub1.anInt1626 = 0;
          class50_sub1_sub4_sub3_sub1.anInt1627 = k2;
          class50_sub1_sub4_sub3_sub1.anInt1628 = 0;
          class50_sub1_sub4_sub3_sub1.anInt1613 = class50_sub1_sub4_sub3_sub1.anInt1633;
        }
      }
      if ((i1 & 0x10) != 0) {
        int i2 = class50_sub1_sub2.readUByteSub();
        int l2 = class50_sub1_sub2.readUByteSub();
        class50_sub1_sub4_sub3_sub1.method567(anInt1325, false, i2, l2);
        class50_sub1_sub4_sub3_sub1.anInt1595 = anInt1325 + 300;
        class50_sub1_sub4_sub3_sub1.anInt1596 = class50_sub1_sub2
            .readUByte();
        class50_sub1_sub4_sub3_sub1.anInt1597 = class50_sub1_sub2
            .readUByteNeg();
      }
    }

  }

  public void method63(int i, int j, Player class50_sub1_sub4_sub3_sub2,
      int k, Buffer class50_sub1_sub2) {
    if (i != 2) {
      for (int l = 1; l > 0; l++) {
			}
    }
    if ((k & 8) != 0) {
      int i1 = class50_sub1_sub2.readUShort();
      if (i1 == 65535) {
        i1 = -1;
      }
      int k2 = class50_sub1_sub2.readUByteSub();
      if (i1 == class50_sub1_sub4_sub3_sub2.animation
          && i1 != -1) {
        int k3 = AnimationSequence.animationSequences[i1].anInt307;
        if (k3 == 1) {
          class50_sub1_sub4_sub3_sub2.anInt1625 = 0;
          class50_sub1_sub4_sub3_sub2.anInt1626 = 0;
          class50_sub1_sub4_sub3_sub2.anInt1627 = k2;
          class50_sub1_sub4_sub3_sub2.anInt1628 = 0;
        }
        if (k3 == 2) {
          class50_sub1_sub4_sub3_sub2.anInt1628 = 0;
        }
      } else if (i1 == -1
          || class50_sub1_sub4_sub3_sub2.animation == -1
          || AnimationSequence.animationSequences[i1].anInt301
          >= AnimationSequence.animationSequences[class50_sub1_sub4_sub3_sub2.animation].anInt301) {
        class50_sub1_sub4_sub3_sub2.animation = i1;
        class50_sub1_sub4_sub3_sub2.anInt1625 = 0;
        class50_sub1_sub4_sub3_sub2.anInt1626 = 0;
        class50_sub1_sub4_sub3_sub2.anInt1627 = k2;
        class50_sub1_sub4_sub3_sub2.anInt1628 = 0;
        class50_sub1_sub4_sub3_sub2.anInt1613 = class50_sub1_sub4_sub3_sub2.anInt1633;
      }
    }
    if ((k & 0x10) != 0) {
      class50_sub1_sub4_sub3_sub2.aString1580 = class50_sub1_sub2
          .readJString();
      if (class50_sub1_sub4_sub3_sub2.aString1580.charAt(0) == '~') {
        class50_sub1_sub4_sub3_sub2.aString1580 = class50_sub1_sub4_sub3_sub2.aString1580
            .substring(1);
        addChatMessage(class50_sub1_sub4_sub3_sub2.name,
            class50_sub1_sub4_sub3_sub2.aString1580,
            2);
      } else if (class50_sub1_sub4_sub3_sub2 == localPlayer) {
        addChatMessage(class50_sub1_sub4_sub3_sub2.name,
            class50_sub1_sub4_sub3_sub2.aString1580,
            2);
      }
      class50_sub1_sub4_sub3_sub2.anInt1583 = 0;
      class50_sub1_sub4_sub3_sub2.anInt1593 = 0;
      class50_sub1_sub4_sub3_sub2.anInt1582 = 150;
    }
    if ((k & 0x100) != 0) {
      class50_sub1_sub4_sub3_sub2.anInt1602 = class50_sub1_sub2
          .readUByteAdd();
      class50_sub1_sub4_sub3_sub2.anInt1604 = class50_sub1_sub2
          .readUByteNeg();
      class50_sub1_sub4_sub3_sub2.anInt1603 = class50_sub1_sub2
          .readUByteSub();
      class50_sub1_sub4_sub3_sub2.anInt1605 = class50_sub1_sub2
          .readUByte();
      class50_sub1_sub4_sub3_sub2.anInt1606 = class50_sub1_sub2
          .readUShort() + anInt1325;
      class50_sub1_sub4_sub3_sub2.anInt1607 = class50_sub1_sub2
          .readUShortSub() + anInt1325;
      class50_sub1_sub4_sub3_sub2.anInt1608 = class50_sub1_sub2
          .readUByte();
      class50_sub1_sub4_sub3_sub2.method564(-56);
    }
    if ((k & 1) != 0) {
      class50_sub1_sub4_sub3_sub2.anInt1609 = class50_sub1_sub2
          .readUShortSub();
      if (class50_sub1_sub4_sub3_sub2.anInt1609 == 65535) {
        class50_sub1_sub4_sub3_sub2.anInt1609 = -1;
      }
    }
    if ((k & 2) != 0) {
      class50_sub1_sub4_sub3_sub2.anInt1598 = class50_sub1_sub2
          .readUShort();
      class50_sub1_sub4_sub3_sub2.anInt1599 = class50_sub1_sub2
          .readUShort();
    }
    if ((k & 0x200) != 0) {
      class50_sub1_sub4_sub3_sub2.anInt1614 = class50_sub1_sub2
          .readUShortSub();
      int j1 = class50_sub1_sub2.method556();
      class50_sub1_sub4_sub3_sub2.anInt1618 = j1 >> 16;
      class50_sub1_sub4_sub3_sub2.anInt1617 = anInt1325 + (j1 & 0xffff);
      class50_sub1_sub4_sub3_sub2.anInt1615 = 0;
      class50_sub1_sub4_sub3_sub2.anInt1616 = 0;
      if (class50_sub1_sub4_sub3_sub2.anInt1617 > anInt1325) {
        class50_sub1_sub4_sub3_sub2.anInt1615 = -1;
      }
      if (class50_sub1_sub4_sub3_sub2.anInt1614 == 65535) {
        class50_sub1_sub4_sub3_sub2.anInt1614 = -1;
      }
    }
    if ((k & 4) != 0) {
      int k1 = class50_sub1_sub2.readUByte();
      byte[] abyte0 = new byte[k1];
      Buffer class50_sub1_sub2_1 = new Buffer(abyte0);
      class50_sub1_sub2.readReverseData(abyte0, k1, 0);
      aClass50_Sub1_Sub2Array975[j] = class50_sub1_sub2_1;
      class50_sub1_sub4_sub3_sub2.method572(class50_sub1_sub2_1, 0);
    }
    if ((k & 0x400) != 0) {
      int l1 = class50_sub1_sub2.readUByteAdd();
      int l2 = class50_sub1_sub2.readUByteSub();
      class50_sub1_sub4_sub3_sub2.method567(anInt1325, false, l1, l2);
      class50_sub1_sub4_sub3_sub2.anInt1595 = anInt1325 + 300;
      class50_sub1_sub4_sub3_sub2.anInt1596 = class50_sub1_sub2
          .readUByteNeg();
      class50_sub1_sub4_sub3_sub2.anInt1597 = class50_sub1_sub2
          .readUByte();
    }
    if ((k & 0x40) != 0) {
      int i2 = class50_sub1_sub2.readUShort();
      int i3 = class50_sub1_sub2.readUByteNeg();
      int l3 = class50_sub1_sub2.readUByteAdd();
      int i4 = class50_sub1_sub2.offset;
      if (class50_sub1_sub4_sub3_sub2.name != null
          && class50_sub1_sub4_sub3_sub2.aBoolean1758) {
        long l4 = TextUtils
            .encodeBase37(class50_sub1_sub4_sub3_sub2.name);
        boolean flag = false;
        if (i3 <= 1) {
          for (int j4 = 0; j4 < anInt855; j4++) {
            if (aLongArray1073[j4] != l4) {
              continue;
            }
            flag = true;
            break;
          }

        }
        if (!flag && anInt1246 == 0) {
          try {
            aClass50_Sub1_Sub2_1131.offset = 0;
            class50_sub1_sub2.readDataA(
                aClass50_Sub1_Sub2_1131.payload, l3, 0);
            aClass50_Sub1_Sub2_1131.offset = 0;
            String s = Class31.method320(0,
                aClass50_Sub1_Sub2_1131, l3);
            s = ChatCensor.method383((byte) 0, s);
            class50_sub1_sub4_sub3_sub2.aString1580 = s;
            class50_sub1_sub4_sub3_sub2.anInt1583 = i2 >> 8;
            class50_sub1_sub4_sub3_sub2.anInt1593 = i2 & 0xff;
            class50_sub1_sub4_sub3_sub2.anInt1582 = 150;
            if (i3 == 2 || i3 == 3) {
              addChatMessage("@cr2@"
                  + class50_sub1_sub4_sub3_sub2.name, s, 1);
            } else if (i3 == 1) {
              addChatMessage("@cr1@"
                  + class50_sub1_sub4_sub3_sub2.name, s, 1);
            } else {
              addChatMessage(class50_sub1_sub4_sub3_sub2.name, s,
                  2);
            }
          } catch (Exception exception) {
            SignLink.reporterror("cde2");
          }
        }
      }
      class50_sub1_sub2.offset = i4 + l3;
    }
    if ((k & 0x80) != 0) {
      int j2 = class50_sub1_sub2.readUByteSub();
      int j3 = class50_sub1_sub2.readUByteNeg();
      class50_sub1_sub4_sub3_sub2.method567(anInt1325, false, j2, j3);
      class50_sub1_sub4_sub3_sub2.anInt1595 = anInt1325 + 300;
      class50_sub1_sub4_sub3_sub2.anInt1596 = class50_sub1_sub2
          .readUByteSub();
      class50_sub1_sub4_sub3_sub2.anInt1597 = class50_sub1_sub2
          .readUByte();
    }
  }

  public void method64(int i) {
    if (aClass18_1198 != null) {
      return;
    }
    super.aClass18_15 = null;
    aClass18_1159 = null;
    aClass18_1157 = null;
    aClass18_1156 = null;
    aClass18_1158 = null;
    aClass18_1108 = null;
    aClass18_1109 = null;
    for (aClass18_1110 = null; i >= 0; ) {
      return;
    }

    aClass18_1201 = new ProducingGraphicsBuffer(265, (byte) -12,
        method11(-756), 128);
    Rasterizer.method447(4);
    aClass18_1202 = new ProducingGraphicsBuffer(265, (byte) -12,
        method11(-756), 128);
    Rasterizer.method447(4);
    aClass18_1198 = new ProducingGraphicsBuffer(171, (byte) -12,
        method11(-756), 509);
    Rasterizer.method447(4);
    aClass18_1199 = new ProducingGraphicsBuffer(132, (byte) -12,
        method11(-756), 360);
    Rasterizer.method447(4);
    aClass18_1200 = new ProducingGraphicsBuffer(200, (byte) -12,
        method11(-756), 360);
    Rasterizer.method447(4);
    aClass18_1203 = new ProducingGraphicsBuffer(238, (byte) -12,
        method11(-756), 202);
    Rasterizer.method447(4);
    aClass18_1204 = new ProducingGraphicsBuffer(238, (byte) -12,
        method11(-756), 203);
    Rasterizer.method447(4);
    aClass18_1205 = new ProducingGraphicsBuffer(94, (byte) -12,
        method11(-756), 74);
    Rasterizer.method447(4);
    aClass18_1206 = new ProducingGraphicsBuffer(94, (byte) -12,
        method11(-756), 75);
    Rasterizer.method447(4);
    if (aClass2_888 != null) {
      method139(aBoolean1207);
      method52(false);
    }
    aBoolean1046 = true;
  }

  @Override
  public void method6() {
    method13(20, true, "Starting up");
    if (SignLink.sunjava) {
      super.anInt8 = 5;
    }
    if (aBoolean999) {
      aBoolean1016 = true;
      return;
    }
    aBoolean999 = true;
    boolean flag = false;
    String s = method37(-42588);
    if (s.endsWith("jagex.com")) {
      flag = true;
    }
    if (s.endsWith("runescape.com")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.2")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.231")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.229")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.228")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.227")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.226")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.224")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.223")) {
      flag = true;
    }
    if (s.endsWith("192.168.1.221")) {
      flag = true;
    }
    if (s.endsWith("127.0.0.1")) {
      flag = true;
    }
    if (!flag) {
      aBoolean1097 = true;
      return;
    }
    if (SignLink.cache_dat != null) {
      for (int i = 0; i < 5; i++) {
        aClass23Array1228[i] = new Index(SignLink.cache_idx[i],
            SignLink.cache_dat, i + 1, 0x927c0);
      }

    }
    try {
      method86(false);
      aClass2_888 = method61(14076, archiveCRCs[1], "title", 25, 1,
          "title screen");
      aClass50_Sub1_Sub1_Sub2_1059 = new Class50_Sub1_Sub1_Sub2(false,
          aClass2_888, -914, "p11_full");
      aClass50_Sub1_Sub1_Sub2_1060 = new Class50_Sub1_Sub1_Sub2(false,
          aClass2_888, -914, "p12_full");
      aClass50_Sub1_Sub1_Sub2_1061 = new Class50_Sub1_Sub1_Sub2(false,
          aClass2_888, -914, "b12_full");
      aClass50_Sub1_Sub1_Sub2_1062 = new Class50_Sub1_Sub1_Sub2(true,
          aClass2_888, -914, "q8_full");
      method139(aBoolean1207);
      method52(false);
      Archive class2 = method61(14076, archiveCRCs[2], "config", 30, 2,
          "config");
      Archive class2_1 = method61(14076, archiveCRCs[3], "interface", 35,
          3, "interface");
      Archive class2_2 = method61(14076, archiveCRCs[4], "media", 40, 4,
          "2d graphics");
      Archive class2_3 = method61(14076, archiveCRCs[6], "textures", 45,
          6, "textures");
      Archive class2_4 = method61(14076, archiveCRCs[7], "wordenc", 50,
          7, "chat system");
      Archive class2_5 = method61(14076, archiveCRCs[8], "sounds", 55, 8,
          "sound effects");
      aByteArrayArrayArray1125 = new byte[4][104][104];
      anIntArrayArrayArray891 = new int[4][105][105];
      aClass22_1164 = new Scene(anIntArrayArrayArray891, 104, 4, 104,
          (byte) 5);
      for (int j = 0; j < 4; j++) {
        aClass46Array1260[j] = new CollisionMap(104, 0, 104);
      }

      aClass50_Sub1_Sub1_Sub1_1122 = new ImageRGB(512, 512);
      Archive class2_6 = method61(14076, archiveCRCs[5], "versionlist",
          60, 5, "update list");
      method13(60, true, "Connecting to update server");
      requester = new OnDemandRequester();
      requester.method335(class2_6, this);
      Animation.init(requester.method343(553));
      Model.method574(requester.method340(0, -31140), requester);
      if (!lowMemory) {
        nextSong = 0;
        songChanging = true;
        requester.request(2, nextSong);
        while (requester.method333() > 0) {
          method77(false);
          try {
            Thread.sleep(100L);
          } catch (Exception _ex) {
          }
          if (requester.anInt1379 > 3) {
            method19("ondemand");
            return;
          }
        }
      }
      method13(65, true, "Requesting animations");
      int k = requester.method340(1, -31140);
      for (int l = 0; l < k; l++) {
        requester.request(1, l);
      }

      while (requester.method333() > 0) {
        int i1 = k - requester.method333();
        if (i1 > 0) {
          method13(65, true, "Loading animations - " + i1 * 100 / k
              + "%");
        }
        method77(false);
        try {
          Thread.sleep(100L);
        } catch (Exception _ex) {
        }
        if (requester.anInt1379 > 3) {
          method19("ondemand");
          return;
        }
      }
      method13(70, true, "Requesting models");
      k = requester.method340(0, -31140);
      for (int j1 = 0; j1 < k; j1++) {
        int k1 = requester.method325(j1, -493);
        if ((k1 & 1) != 0) {
          requester.request(0, j1);
        }
      }

      k = requester.method333();
      while (requester.method333() > 0) {
        int l1 = k - requester.method333();
        if (l1 > 0) {
          method13(70, true, "Loading models - " + l1 * 100 / k + "%");
        }
        method77(false);
        try {
          Thread.sleep(100L);
        } catch (Exception _ex) {
        }
      }
      if (aClass23Array1228[0] != null) {
        method13(75, true, "Requesting maps");
        requester.request(3, requester.method344(0, 47, 48, 0));
        requester.request(3, requester.method344(0, 47, 48, 1));
        requester.request(3, requester.method344(0, 48, 48, 0));
        requester.request(3, requester.method344(0, 48, 48, 1));
        requester.request(3, requester.method344(0, 49, 48, 0));
        requester.request(3, requester.method344(0, 49, 48, 1));
        requester.request(3, requester.method344(0, 47, 47, 0));
        requester.request(3, requester.method344(0, 47, 47, 1));
        requester.request(3, requester.method344(0, 48, 47, 0));
        requester.request(3, requester.method344(0, 48, 47, 1));
        requester.request(3, requester.method344(0, 48, 148, 0));
        requester.request(3, requester.method344(0, 48, 148, 1));
        k = requester.method333();
        while (requester.method333() > 0) {
          int i2 = k - requester.method333();
          if (i2 > 0) {
            method13(75, true, "Loading maps - " + i2 * 100 / k
                + "%");
          }
          method77(false);
          try {
            Thread.sleep(100L);
          } catch (Exception _ex) {
          }
        }
      }
      k = requester.method340(0, -31140);
      for (int j2 = 0; j2 < k; j2++) {
        int k2 = requester.method325(j2, -493);
        byte byte0 = 0;
        if ((k2 & 8) != 0) {
          byte0 = 10;
        } else if ((k2 & 0x20) != 0) {
          byte0 = 9;
        } else if ((k2 & 0x10) != 0) {
          byte0 = 8;
        } else if ((k2 & 0x40) != 0) {
          byte0 = 7;
        } else if ((k2 & 0x80) != 0) {
          byte0 = 6;
        } else if ((k2 & 2) != 0) {
          byte0 = 5;
        } else if ((k2 & 4) != 0) {
          byte0 = 4;
        }
        if ((k2 & 1) != 0) {
          byte0 = 3;
        }
        if (byte0 != 0) {
          requester.method327(-44, 0, byte0, j2);
        }
      }

      requester.method332(membersServer, (byte) 109);
      if (!lowMemory) {
        k = requester.method340(2, -31140);
        for (int l2 = 1; l2 < k; l2++) {
          if (requester.method328(l2, aBoolean963)) {
            requester.method327(-44, 2, (byte) 1, l2);
          }
        }

      }
      k = requester.method340(0, -31140);
      for (int i3 = 0; i3 < k; i3++) {
        int j3 = requester.method325(i3, -493);
        if (j3 == 0 && requester.anInt1350 < 200) {
          requester.method327(-44, 0, (byte) 1, i3);
        }
      }

      method13(80, true, "Unpacking media");
      aClass50_Sub1_Sub1_Sub3_1185 = new IndexedImage(class2_2,
          "invback", 0);
      aClass50_Sub1_Sub1_Sub3_1187 = new IndexedImage(class2_2,
          "chatback", 0);
      aClass50_Sub1_Sub1_Sub3_1186 = new IndexedImage(class2_2,
          "mapback", 0);
      aClass50_Sub1_Sub1_Sub3_965 = new IndexedImage(class2_2,
          "backbase1", 0);
      aClass50_Sub1_Sub1_Sub3_966 = new IndexedImage(class2_2,
          "backbase2", 0);
      aClass50_Sub1_Sub1_Sub3_967 = new IndexedImage(class2_2,
          "backhmid1", 0);
      for (int k3 = 0; k3 < 13; k3++) {
        aClass50_Sub1_Sub1_Sub3Array976[k3] = new IndexedImage(
            class2_2, "sideicons", k3);
      }

      aClass50_Sub1_Sub1_Sub1_1116 = new ImageRGB(class2_2, "compass", 0);
      aClass50_Sub1_Sub1_Sub1_1247 = new ImageRGB(class2_2, "mapedge", 0);
      aClass50_Sub1_Sub1_Sub1_1247.method458(1790);
      for (int l3 = 0; l3 < 72; l3++) {
        aClass50_Sub1_Sub1_Sub3Array1153[l3] = new IndexedImage(
            class2_2, "mapscene", l3);
      }

      for (int i4 = 0; i4 < 70; i4++) {
        aClass50_Sub1_Sub1_Sub1Array1031[i4] = new ImageRGB(class2_2,
            "mapfunction", i4);
      }

      for (int j4 = 0; j4 < 5; j4++) {
        aClass50_Sub1_Sub1_Sub1Array1182[j4] = new ImageRGB(class2_2,
            "hitmarks", j4);
      }

      for (int k4 = 0; k4 < 6; k4++) {
        aClass50_Sub1_Sub1_Sub1Array1288[k4] = new ImageRGB(class2_2,
            "headicons_pk", k4);
      }

      for (int l4 = 0; l4 < 9; l4++) {
        aClass50_Sub1_Sub1_Sub1Array1079[l4] = new ImageRGB(class2_2,
            "headicons_prayer", l4);
      }

      for (int i5 = 0; i5 < 6; i5++) {
        aClass50_Sub1_Sub1_Sub1Array954[i5] = new ImageRGB(class2_2,
            "headicons_hint", i5);
      }

      aClass50_Sub1_Sub1_Sub1_1086 = new ImageRGB(class2_2,
          "overlay_multiway", 0);
      aClass50_Sub1_Sub1_Sub1_1036 = new ImageRGB(class2_2, "mapmarker",
          0);
      aClass50_Sub1_Sub1_Sub1_1037 = new ImageRGB(class2_2, "mapmarker",
          1);
      for (int j5 = 0; j5 < 8; j5++) {
        aClass50_Sub1_Sub1_Sub1Array896[j5] = new ImageRGB(class2_2,
            "cross", j5);
      }

      aClass50_Sub1_Sub1_Sub1_1192 = new ImageRGB(class2_2, "mapdots", 0);
      aClass50_Sub1_Sub1_Sub1_1193 = new ImageRGB(class2_2, "mapdots", 1);
      aClass50_Sub1_Sub1_Sub1_1194 = new ImageRGB(class2_2, "mapdots", 2);
      aClass50_Sub1_Sub1_Sub1_1195 = new ImageRGB(class2_2, "mapdots", 3);
      aClass50_Sub1_Sub1_Sub1_1196 = new ImageRGB(class2_2, "mapdots", 4);
      aClass50_Sub1_Sub1_Sub3_1095 = new IndexedImage(class2_2,
          "scrollbar", 0);
      aClass50_Sub1_Sub1_Sub3_1096 = new IndexedImage(class2_2,
          "scrollbar", 1);
      aClass50_Sub1_Sub1_Sub3_880 = new IndexedImage(class2_2,
          "redstone1", 0);
      aClass50_Sub1_Sub1_Sub3_881 = new IndexedImage(class2_2,
          "redstone2", 0);
      aClass50_Sub1_Sub1_Sub3_882 = new IndexedImage(class2_2,
          "redstone3", 0);
      aClass50_Sub1_Sub1_Sub3_883 = new IndexedImage(class2_2,
          "redstone1", 0);
      aClass50_Sub1_Sub1_Sub3_883.method487(0);
      aClass50_Sub1_Sub1_Sub3_884 = new IndexedImage(class2_2,
          "redstone2", 0);
      aClass50_Sub1_Sub1_Sub3_884.method487(0);
      aClass50_Sub1_Sub1_Sub3_983 = new IndexedImage(class2_2,
          "redstone1", 0);
      aClass50_Sub1_Sub1_Sub3_983.method488((byte) 7);
      aClass50_Sub1_Sub1_Sub3_984 = new IndexedImage(class2_2,
          "redstone2", 0);
      aClass50_Sub1_Sub1_Sub3_984.method488((byte) 7);
      aClass50_Sub1_Sub1_Sub3_985 = new IndexedImage(class2_2,
          "redstone3", 0);
      aClass50_Sub1_Sub1_Sub3_985.method488((byte) 7);
      aClass50_Sub1_Sub1_Sub3_986 = new IndexedImage(class2_2,
          "redstone1", 0);
      aClass50_Sub1_Sub1_Sub3_986.method487(0);
      aClass50_Sub1_Sub1_Sub3_986.method488((byte) 7);
      aClass50_Sub1_Sub1_Sub3_987 = new IndexedImage(class2_2,
          "redstone2", 0);
      aClass50_Sub1_Sub1_Sub3_987.method487(0);
      aClass50_Sub1_Sub1_Sub3_987.method488((byte) 7);
      for (int k5 = 0; k5 < 2; k5++) {
        aClass50_Sub1_Sub1_Sub3Array1142[k5] = new IndexedImage(
            class2_2, "mod_icons", k5);
      }

      ImageRGB class50_sub1_sub1_sub1 = new ImageRGB(class2_2,
          "backleft1", 0);
      aClass18_906 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backleft2", 0);
      aClass18_907 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backright1", 0);
      aClass18_908 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backright2", 0);
      aClass18_909 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backtop1", 0);
      aClass18_910 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backvmid1", 0);
      aClass18_911 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backvmid2", 0);
      aClass18_912 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backvmid3", 0);
      aClass18_913 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      class50_sub1_sub1_sub1 = new ImageRGB(class2_2, "backhmid2", 0);
      aClass18_914 = new ProducingGraphicsBuffer(
          class50_sub1_sub1_sub1.anInt1491, (byte) -12,
          method11(-756), class50_sub1_sub1_sub1.anInt1490);
      class50_sub1_sub1_sub1.method459(0, -192, 0);
      int l5 = (int) (Math.random() * 21D) - 10;
      int i6 = (int) (Math.random() * 21D) - 10;
      int j6 = (int) (Math.random() * 21D) - 10;
      int k6 = (int) (Math.random() * 41D) - 20;
      for (int l6 = 0; l6 < 100; l6++) {
        if (aClass50_Sub1_Sub1_Sub1Array1031[l6] != null) {
          aClass50_Sub1_Sub1_Sub1Array1031[l6].method457(j6 + k6, i6
              + k6, l5 + k6, -235);
        }
        if (aClass50_Sub1_Sub1_Sub3Array1153[l6] != null) {
          aClass50_Sub1_Sub1_Sub3Array1153[l6].method489(j6 + k6, i6
              + k6, l5 + k6, -235);
        }
      }

      method13(83, true, "Unpacking textures");
      Canvas.method497(class2_3);
      Canvas.updateBrightness(0.80000000000000004D, (byte) 6);
      Canvas.method496((byte) 7, 20);
      method13(86, true, "Unpacking config");
      AnimationSequence.init(class2);
      GameObjectDefinition.method426(class2);
      Floor.init(class2);
      ItemDefinition.method214(class2);
      NpcDefinition.method361(class2);
      Class48.method434(class2, 36135);
      SpotAnimation.method305(class2, 36135);
      Varp.method371(class2, 36135);
      VarBit.method440(class2);
      ItemDefinition.membersServer = membersServer;
      if (!lowMemory) {
        method13(90, true, "Unpacking sounds");
        byte[] sounds = class2_5.extract("sounds.dat");
        Buffer soundsBuffer = new Buffer(sounds);
        Track.load(soundsBuffer);
      }
      method13(95, true, "Unpacking interfaces");
      Class50_Sub1_Sub1_Sub2[] aclass50_sub1_sub1_sub2 = {
          aClass50_Sub1_Sub1_Sub2_1059, aClass50_Sub1_Sub1_Sub2_1060,
          aClass50_Sub1_Sub1_Sub2_1061, aClass50_Sub1_Sub1_Sub2_1062};
      Widget.method199(-845, aclass50_sub1_sub1_sub2, class2_1, class2_2);
      method13(100, true, "Preparing game engine");
      for (int i7 = 0; i7 < 33; i7++) {
        int j7 = 999;
        int l7 = 0;
        for (int j8 = 0; j8 < 34; j8++) {
          if (aClass50_Sub1_Sub1_Sub3_1186.aByteArray1516[j8 + i7
              * aClass50_Sub1_Sub1_Sub3_1186.anInt1518] == 0) {
            if (j7 == 999) {
              j7 = j8;
            }
            continue;
          }
          if (j7 == 999) {
            continue;
          }
          l7 = j8;
          break;
        }

        anIntArray1180[i7] = j7;
        anIntArray1286[i7] = l7 - j7;
      }

      for (int k7 = 5; k7 < 156; k7++) {
        int i8 = 999;
        int k8 = 0;
        for (int i9 = 25; i9 < 172; i9++) {
          if (aClass50_Sub1_Sub1_Sub3_1186.aByteArray1516[i9 + k7
              * aClass50_Sub1_Sub1_Sub3_1186.anInt1518] == 0
              && (i9 > 34 || k7 > 34)) {
            if (i8 == 999) {
              i8 = i9;
            }
            continue;
          }
          if (i8 == 999) {
            continue;
          }
          k8 = i9;
          break;
        }

        anIntArray1019[k7 - 5] = i8 - 25;
        anIntArray920[k7 - 5] = k8 - i8;
      }

      Canvas.method494(503, 7, 765);
      anIntArray1003 = Canvas.anIntArray1538;
      Canvas.method494(96, 7, 479);
      anIntArray1000 = Canvas.anIntArray1538;
      Canvas.method494(261, 7, 190);
      anIntArray1001 = Canvas.anIntArray1538;
      Canvas.method494(334, 7, 512);
      anIntArray1002 = Canvas.anIntArray1538;
      int[] ai = new int[9];
      for (int l8 = 0; l8 < 9; l8++) {
        int j9 = 128 + l8 * 32 + 15;
        int k9 = 600 + j9 * 3;
        int l9 = Canvas.anIntArray1536[j9];
        ai[l8] = k9 * l9 >> 16;
      }

      Scene.method277(334, 22845, ai, 800, 500, 512);
      ChatCensor.method373(class2_4);
      aClass7_1248 = new MouseCapturer(this, (byte) -116);
      method12(aClass7_1248, 10);
      Class50_Sub1_Sub4_Sub5.aClient1723 = this;
      GameObjectDefinition.aClient770 = this;
      NpcDefinition.aClient629 = this;
      return;
    } catch (Exception exception) {
      SignLink.reporterror("loaderror " + aString1027 + " " + anInt1322);
    }
    aBoolean1283 = true;
  }

  public void method65(int i, int j) {
    while (j >= 0) {
      return;
    }
    if (!lowMemory) {
      for (int l : anIntArray1290) {
        if (Canvas.anIntArray1546[l] >= i) {
          IndexedImage class50_sub1_sub1_sub3 = Canvas.aClass50_Sub1_Sub1_Sub3Array1540[l];
          int i1 = class50_sub1_sub1_sub3.anInt1518
              * class50_sub1_sub1_sub3.anInt1519 - 1;
          int j1 = class50_sub1_sub1_sub3.anInt1518 * anInt951 * 2;
          byte[] abyte0 = class50_sub1_sub1_sub3.aByteArray1516;
          byte[] abyte1 = aByteArray1245;
          for (int k1 = 0; k1 <= i1; k1++) {
            abyte1[k1] = abyte0[k1 - j1 & i1];
          }

          class50_sub1_sub1_sub3.aByteArray1516 = abyte1;
          aByteArray1245 = abyte0;
          Canvas.method499(l, 9);
        }
      }

    }
  }

  public void method66(int i, Widget class13, int j, int k, int l, int i1,
      int j1, int k1) {
    if (j1 != 23658) {
      return;
    }
    if (class13.anInt236 != 0 || class13.anIntArray258 == null
        || class13.aBoolean219) {
      return;
    }
    if (i1 < l || k1 < i || i1 > l + class13.anInt241
        || k1 > i + class13.anInt238) {
      return;
    }
    int l1 = class13.anIntArray258.length;
    for (int i2 = 0; i2 < l1; i2++) {
      int j2 = class13.anIntArray232[i2] + l;
      int k2 = class13.anIntArray276[i2] + i - k;
      Widget class13_1 = Widget.getWidget(class13.anIntArray258[i2]);
      j2 += class13_1.anInt228;
      k2 += class13_1.anInt259;
      if ((class13_1.anInt254 >= 0 || class13_1.anInt261 != 0)
          && i1 >= j2 && k1 >= k2 && i1 < j2 + class13_1.anInt241
          && k1 < k2 + class13_1.anInt238) {
        if (class13_1.anInt254 >= 0) {
          anInt915 = class13_1.anInt254;
        } else {
          anInt915 = class13_1.anInt215;
        }
      }
      if (class13_1.anInt236 == 8 && i1 >= j2 && k1 >= k2
          && i1 < j2 + class13_1.anInt241
          && k1 < k2 + class13_1.anInt238) {
        anInt1315 = class13_1.anInt215;
      }
      if (class13_1.anInt236 == 0) {
        method66(k2, class13_1, j, class13_1.anInt231, j2, i1, 23658,
            k1);
        if (class13_1.anInt285 > class13_1.anInt238) {
          method42(class13_1.anInt285, k2, class13_1, (byte) 102, k1,
              j, i1, class13_1.anInt238, j2 + class13_1.anInt241);
        }
      } else {
        if (class13_1.anInt289 == 1 && i1 >= j2 && k1 >= k2
            && i1 < j2 + class13_1.anInt241
            && k1 < k2 + class13_1.anInt238) {
          boolean flag = false;
          if (class13_1.anInt242 != 0) {
            flag = method23(class13_1, 8);
          }
          if (!flag) {
            aStringArray1184[anInt1183] = class13_1.aString268;
            anIntArray981[anInt1183] = 352;
            anIntArray980[anInt1183] = class13_1.anInt215;
            anInt1183++;
          }
        }
        if (class13_1.anInt289 == 2 && anInt1171 == 0 && i1 >= j2
            && k1 >= k2 && i1 < j2 + class13_1.anInt241
            && k1 < k2 + class13_1.anInt238) {
          String s = class13_1.aString281;
          if (s.indexOf(" ") != -1) {
            s = s.substring(0, s.indexOf(" "));
          }
          aStringArray1184[anInt1183] = s + " @gre@"
              + class13_1.aString211;
          anIntArray981[anInt1183] = 70;
          anIntArray980[anInt1183] = class13_1.anInt215;
          anInt1183++;
        }
        if (class13_1.anInt289 == 3 && i1 >= j2 && k1 >= k2
            && i1 < j2 + class13_1.anInt241
            && k1 < k2 + class13_1.anInt238) {
          aStringArray1184[anInt1183] = "Close";
          if (j == 3) {
            anIntArray981[anInt1183] = 55;
          } else {
            anIntArray981[anInt1183] = 639;
          }
          anIntArray980[anInt1183] = class13_1.anInt215;
          anInt1183++;
        }
        if (class13_1.anInt289 == 4 && i1 >= j2 && k1 >= k2
            && i1 < j2 + class13_1.anInt241
            && k1 < k2 + class13_1.anInt238) {
          aStringArray1184[anInt1183] = class13_1.aString268;
          anIntArray981[anInt1183] = 890;
          anIntArray980[anInt1183] = class13_1.anInt215;
          anInt1183++;
        }
        if (class13_1.anInt289 == 5 && i1 >= j2 && k1 >= k2
            && i1 < j2 + class13_1.anInt241
            && k1 < k2 + class13_1.anInt238) {
          aStringArray1184[anInt1183] = class13_1.aString268;
          anIntArray981[anInt1183] = 518;
          anIntArray980[anInt1183] = class13_1.anInt215;
          anInt1183++;
        }
        if (class13_1.anInt289 == 6 && !aBoolean1239 && i1 >= j2
            && k1 >= k2 && i1 < j2 + class13_1.anInt241
            && k1 < k2 + class13_1.anInt238) {
          aStringArray1184[anInt1183] = class13_1.aString268;
          anIntArray981[anInt1183] = 575;
          anIntArray980[anInt1183] = class13_1.anInt215;
          anInt1183++;
        }
        if (class13_1.anInt236 == 2) {
          int l2 = 0;
          for (int i3 = 0; i3 < class13_1.anInt238; i3++) {
            for (int j3 = 0; j3 < class13_1.anInt241; j3++) {
              int k3 = j2 + j3 * (32 + class13_1.anInt263);
              int l3 = k2 + i3 * (32 + class13_1.anInt244);
              if (l2 < 20) {
                k3 += class13_1.anIntArray221[l2];
                l3 += class13_1.anIntArray213[l2];
              }
              if (i1 >= k3 && k1 >= l3 && i1 < k3 + 32
                  && k1 < l3 + 32) {
                anInt1063 = l2;
                anInt1064 = class13_1.anInt215;
                if (class13_1.anIntArray269[l2] > 0) {
                  ItemDefinition class16 = ItemDefinition
                      .getDefinition(class13_1.anIntArray269[l2] - 1);
                  if (anInt1146 == 1 && class13_1.aBoolean229) {
                    if (class13_1.anInt215 != anInt1148
                        || l2 != anInt1147) {
                      aStringArray1184[anInt1183] = "Use "
                          + selectedItem
                          + " with @lre@"
                          + class16.name;
                      anIntArray981[anInt1183] = 903;
                      anIntArray982[anInt1183] = class16.anInt363;
                      anIntArray979[anInt1183] = l2;
                      anIntArray980[anInt1183] = class13_1.anInt215;
                      anInt1183++;
                    }
                  } else if (anInt1171 == 1
                      && class13_1.aBoolean229) {
                    if ((anInt1173 & 0x10) == 16) {
                      aStringArray1184[anInt1183] = aString1174
                          + " @lre@" + class16.name;
                      anIntArray981[anInt1183] = 361;
                      anIntArray982[anInt1183] = class16.anInt363;
                      anIntArray979[anInt1183] = l2;
                      anIntArray980[anInt1183] = class13_1.anInt215;
                      anInt1183++;
                    }
                  } else {
                    if (class13_1.aBoolean229) {
                      for (int i4 = 4; i4 >= 3; i4--) {
                        if (class16.aStringArray348 != null
                            && class16.aStringArray348[i4] != null) {
                          aStringArray1184[anInt1183] = class16.aStringArray348[i4]
                              + " @lre@"
                              + class16.name;
                          if (i4 == 3) {
                            anIntArray981[anInt1183] = 227;
                          }
                          if (i4 == 4) {
                            anIntArray981[anInt1183] = 891;
                          }
                          anIntArray982[anInt1183] = class16.anInt363;
                          anIntArray979[anInt1183] = l2;
                          anIntArray980[anInt1183] = class13_1.anInt215;
                          anInt1183++;
                        } else if (i4 == 4) {
                          aStringArray1184[anInt1183] = "Drop @lre@"
                              + class16.name;
                          anIntArray981[anInt1183] = 891;
                          anIntArray982[anInt1183] = class16.anInt363;
                          anIntArray979[anInt1183] = l2;
                          anIntArray980[anInt1183] = class13_1.anInt215;
                          anInt1183++;
                        }
                      }

                    }
                    if (class13_1.aBoolean288) {
                      aStringArray1184[anInt1183] = "Use @lre@"
                          + class16.name;
                      anIntArray981[anInt1183] = 52;
                      anIntArray982[anInt1183] = class16.anInt363;
                      anIntArray979[anInt1183] = l2;
                      anIntArray980[anInt1183] = class13_1.anInt215;
                      anInt1183++;
                    }
                    if (class13_1.aBoolean229
                        && class16.aStringArray348 != null) {
                      for (int j4 = 2; j4 >= 0; j4--) {
                        if (class16.aStringArray348[j4] != null) {
                          aStringArray1184[anInt1183] = class16.aStringArray348[j4]
                              + " @lre@"
                              + class16.name;
                          if (j4 == 0) {
                            anIntArray981[anInt1183] = 961;
                          }
                          if (j4 == 1) {
                            anIntArray981[anInt1183] = 399;
                          }
                          if (j4 == 2) {
                            anIntArray981[anInt1183] = 324;
                          }
                          anIntArray982[anInt1183] = class16.anInt363;
                          anIntArray979[anInt1183] = l2;
                          anIntArray980[anInt1183] = class13_1.anInt215;
                          anInt1183++;
                        }
                      }

                    }
                    if (class13_1.aStringArray262 != null) {
                      for (int k4 = 4; k4 >= 0; k4--) {
                        if (class13_1.aStringArray262[k4] != null) {
                          aStringArray1184[anInt1183] = class13_1.aStringArray262[k4]
                              + " @lre@"
                              + class16.name;
                          if (k4 == 0) {
                            anIntArray981[anInt1183] = 9;
                          }
                          if (k4 == 1) {
                            anIntArray981[anInt1183] = 225;
                          }
                          if (k4 == 2) {
                            anIntArray981[anInt1183] = 444;
                          }
                          if (k4 == 3) {
                            anIntArray981[anInt1183] = 564;
                          }
                          if (k4 == 4) {
                            anIntArray981[anInt1183] = 894;
                          }
                          anIntArray982[anInt1183] = class16.anInt363;
                          anIntArray979[anInt1183] = l2;
                          anIntArray980[anInt1183] = class13_1.anInt215;
                          anInt1183++;
                        }
                      }

                    }
                    aStringArray1184[anInt1183] = "Examine @lre@"
                        + class16.name;
                    anIntArray981[anInt1183] = 1094;
                    anIntArray982[anInt1183] = class16.anInt363;
                    anIntArray979[anInt1183] = l2;
                    anIntArray980[anInt1183] = class13_1.anInt215;
                    anInt1183++;
                  }
                }
              }
              l2++;
            }

          }

        }
      }
    }

  }

  public void method67(int i) {
    for (int j = 0; j < anInt1133; j++) {
      int k = anIntArray1134[j];
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[k];
      if (class50_sub1_sub4_sub3_sub1 != null) {
        method68(class50_sub1_sub4_sub3_sub1.definition.aByte642,
            (byte) -97, class50_sub1_sub4_sub3_sub1);
      }
    }

    if (i != -37214) {
      outgoingBuffer.writeByte(41);
    }
  }

  public void method68(int i, byte byte0, Character class50_sub1_sub4_sub3) {
    if (class50_sub1_sub4_sub3.anInt1610 < 128
        || class50_sub1_sub4_sub3.anInt1611 < 128
        || class50_sub1_sub4_sub3.anInt1610 >= 13184
        || class50_sub1_sub4_sub3.anInt1611 >= 13184) {
      class50_sub1_sub4_sub3.animation = -1;
      class50_sub1_sub4_sub3.anInt1614 = -1;
      class50_sub1_sub4_sub3.anInt1606 = 0;
      class50_sub1_sub4_sub3.anInt1607 = 0;
      class50_sub1_sub4_sub3.anInt1610 = class50_sub1_sub4_sub3.anIntArray1586[0]
          * 128 + class50_sub1_sub4_sub3.anInt1601 * 64;
      class50_sub1_sub4_sub3.anInt1611 = class50_sub1_sub4_sub3.anIntArray1587[0]
          * 128 + class50_sub1_sub4_sub3.anInt1601 * 64;
      class50_sub1_sub4_sub3.method564(-56);
    }
    if (class50_sub1_sub4_sub3 == localPlayer
        && (class50_sub1_sub4_sub3.anInt1610 < 1536
        || class50_sub1_sub4_sub3.anInt1611 < 1536
        || class50_sub1_sub4_sub3.anInt1610 >= 11776
        || class50_sub1_sub4_sub3.anInt1611 >= 11776)) {
      class50_sub1_sub4_sub3.animation = -1;
      class50_sub1_sub4_sub3.anInt1614 = -1;
      class50_sub1_sub4_sub3.anInt1606 = 0;
      class50_sub1_sub4_sub3.anInt1607 = 0;
      class50_sub1_sub4_sub3.anInt1610 = class50_sub1_sub4_sub3.anIntArray1586[0]
          * 128 + class50_sub1_sub4_sub3.anInt1601 * 64;
      class50_sub1_sub4_sub3.anInt1611 = class50_sub1_sub4_sub3.anIntArray1587[0]
          * 128 + class50_sub1_sub4_sub3.anInt1601 * 64;
      class50_sub1_sub4_sub3.method564(-56);
    }
    if (class50_sub1_sub4_sub3.anInt1606 > anInt1325) {
      method69(class50_sub1_sub4_sub3, true);
    } else if (class50_sub1_sub4_sub3.anInt1607 >= anInt1325) {
      method70(class50_sub1_sub4_sub3, -31135);
    } else {
      method71(class50_sub1_sub4_sub3, 0);
    }
    method72((byte) 8, class50_sub1_sub4_sub3);
    method73(class50_sub1_sub4_sub3, -136);
    if (byte0 == -97) {
		}
  }

  public void method69(Character class50_sub1_sub4_sub3, boolean flag) {
    if (!flag) {
      aBoolean963 = !aBoolean963;
    }
    int i = class50_sub1_sub4_sub3.anInt1606 - anInt1325;
    int j = class50_sub1_sub4_sub3.anInt1602 * 128
        + class50_sub1_sub4_sub3.anInt1601 * 64;
    int k = class50_sub1_sub4_sub3.anInt1604 * 128
        + class50_sub1_sub4_sub3.anInt1601 * 64;
    class50_sub1_sub4_sub3.anInt1610 += (j - class50_sub1_sub4_sub3.anInt1610)
        / i;
    class50_sub1_sub4_sub3.anInt1611 += (k - class50_sub1_sub4_sub3.anInt1611)
        / i;
    class50_sub1_sub4_sub3.anInt1623 = 0;
    if (class50_sub1_sub4_sub3.anInt1608 == 0) {
      class50_sub1_sub4_sub3.anInt1584 = 1024;
    }
    if (class50_sub1_sub4_sub3.anInt1608 == 1) {
      class50_sub1_sub4_sub3.anInt1584 = 1536;
    }
    if (class50_sub1_sub4_sub3.anInt1608 == 2) {
      class50_sub1_sub4_sub3.anInt1584 = 0;
    }
    if (class50_sub1_sub4_sub3.anInt1608 == 3) {
      class50_sub1_sub4_sub3.anInt1584 = 512;
    }
  }

  public void method70(Character class50_sub1_sub4_sub3, int i) {
    if (class50_sub1_sub4_sub3.anInt1607 == anInt1325
        || class50_sub1_sub4_sub3.animation == -1
        || class50_sub1_sub4_sub3.anInt1627 != 0
        || class50_sub1_sub4_sub3.anInt1626 + 1
        > AnimationSequence.animationSequences[class50_sub1_sub4_sub3.animation]
        .method205(0, class50_sub1_sub4_sub3.anInt1625)) {
      int j = class50_sub1_sub4_sub3.anInt1607
          - class50_sub1_sub4_sub3.anInt1606;
      int k = anInt1325 - class50_sub1_sub4_sub3.anInt1606;
      int l = class50_sub1_sub4_sub3.anInt1602 * 128
          + class50_sub1_sub4_sub3.anInt1601 * 64;
      int i1 = class50_sub1_sub4_sub3.anInt1604 * 128
          + class50_sub1_sub4_sub3.anInt1601 * 64;
      int j1 = class50_sub1_sub4_sub3.anInt1603 * 128
          + class50_sub1_sub4_sub3.anInt1601 * 64;
      int k1 = class50_sub1_sub4_sub3.anInt1605 * 128
          + class50_sub1_sub4_sub3.anInt1601 * 64;
      class50_sub1_sub4_sub3.anInt1610 = (l * (j - k) + j1 * k) / j;
      class50_sub1_sub4_sub3.anInt1611 = (i1 * (j - k) + k1 * k) / j;
    }
    class50_sub1_sub4_sub3.anInt1623 = 0;
    if (class50_sub1_sub4_sub3.anInt1608 == 0) {
      class50_sub1_sub4_sub3.anInt1584 = 1024;
    }
    if (class50_sub1_sub4_sub3.anInt1608 == 1) {
      class50_sub1_sub4_sub3.anInt1584 = 1536;
    }
    if (class50_sub1_sub4_sub3.anInt1608 == 2) {
      class50_sub1_sub4_sub3.anInt1584 = 0;
    }
    if (class50_sub1_sub4_sub3.anInt1608 == 3) {
      class50_sub1_sub4_sub3.anInt1584 = 512;
    }
    class50_sub1_sub4_sub3.anInt1612 = class50_sub1_sub4_sub3.anInt1584;
    if (i == -31135) {
		}
  }

  public void method71(Character class50_sub1_sub4_sub3, int i) {
    class50_sub1_sub4_sub3.anInt1588 = class50_sub1_sub4_sub3.anInt1634;
    if (class50_sub1_sub4_sub3.anInt1633 == 0) {
      class50_sub1_sub4_sub3.anInt1623 = 0;
      return;
    }
    if (class50_sub1_sub4_sub3.animation != -1
        && class50_sub1_sub4_sub3.anInt1627 == 0) {
      AnimationSequence class14 = AnimationSequence.animationSequences[class50_sub1_sub4_sub3.animation];
      if (class50_sub1_sub4_sub3.anInt1613 > 0 && class14.anInt305 == 0) {
        class50_sub1_sub4_sub3.anInt1623++;
        return;
      }
      if (class50_sub1_sub4_sub3.anInt1613 <= 0 && class14.anInt306 == 0) {
        class50_sub1_sub4_sub3.anInt1623++;
        return;
      }
    }
    int j = class50_sub1_sub4_sub3.anInt1610;
    int k = class50_sub1_sub4_sub3.anInt1611;
    int l = class50_sub1_sub4_sub3.anIntArray1586[class50_sub1_sub4_sub3.anInt1633 - 1]
        * 128 + class50_sub1_sub4_sub3.anInt1601 * 64;
    int i1 = class50_sub1_sub4_sub3.anIntArray1587[class50_sub1_sub4_sub3.anInt1633 - 1]
        * 128 + class50_sub1_sub4_sub3.anInt1601 * 64;
    if (l - j > 256 || l - j < -256 || i1 - k > 256 || i1 - k < -256) {
      class50_sub1_sub4_sub3.anInt1610 = l;
      class50_sub1_sub4_sub3.anInt1611 = i1;
      return;
    }
    if (j < l) {
      if (k < i1) {
        class50_sub1_sub4_sub3.anInt1584 = 1280;
      } else if (k > i1) {
        class50_sub1_sub4_sub3.anInt1584 = 1792;
      } else {
        class50_sub1_sub4_sub3.anInt1584 = 1536;
      }
    } else if (j > l) {
      if (k < i1) {
        class50_sub1_sub4_sub3.anInt1584 = 768;
      } else if (k > i1) {
        class50_sub1_sub4_sub3.anInt1584 = 256;
      } else {
        class50_sub1_sub4_sub3.anInt1584 = 512;
      }
    } else if (k < i1) {
      class50_sub1_sub4_sub3.anInt1584 = 1024;
    } else {
      class50_sub1_sub4_sub3.anInt1584 = 0;
    }
    int j1 = class50_sub1_sub4_sub3.anInt1584
        - class50_sub1_sub4_sub3.anInt1612 & 0x7ff;
    if (j1 > 1024) {
      j1 -= 2048;
    }
    int k1 = class50_sub1_sub4_sub3.anInt1620;
    if (i != 0) {
      outgoingBuffer.writeByte(34);
    }
    if (j1 >= -256 && j1 <= 256) {
      k1 = class50_sub1_sub4_sub3.anInt1619;
    } else if (j1 >= 256 && j1 < 768) {
      k1 = class50_sub1_sub4_sub3.anInt1622;
    } else if (j1 >= -768 && j1 <= -256) {
      k1 = class50_sub1_sub4_sub3.anInt1621;
    }
    if (k1 == -1) {
      k1 = class50_sub1_sub4_sub3.anInt1619;
    }
    class50_sub1_sub4_sub3.anInt1588 = k1;
    int l1 = 4;
    if (class50_sub1_sub4_sub3.anInt1612 != class50_sub1_sub4_sub3.anInt1584
        && class50_sub1_sub4_sub3.anInt1609 == -1
        && class50_sub1_sub4_sub3.anInt1600 != 0) {
      l1 = 2;
    }
    if (class50_sub1_sub4_sub3.anInt1633 > 2) {
      l1 = 6;
    }
    if (class50_sub1_sub4_sub3.anInt1633 > 3) {
      l1 = 8;
    }
    if (class50_sub1_sub4_sub3.anInt1623 > 0
        && class50_sub1_sub4_sub3.anInt1633 > 1) {
      l1 = 8;
      class50_sub1_sub4_sub3.anInt1623--;
    }
    if (class50_sub1_sub4_sub3.aBooleanArray1591[class50_sub1_sub4_sub3.anInt1633 - 1]) {
      l1 <<= 1;
    }
    if (l1 >= 8
        && class50_sub1_sub4_sub3.anInt1588 == class50_sub1_sub4_sub3.anInt1619
        && class50_sub1_sub4_sub3.anInt1629 != -1) {
      class50_sub1_sub4_sub3.anInt1588 = class50_sub1_sub4_sub3.anInt1629;
    }
    if (j < l) {
      class50_sub1_sub4_sub3.anInt1610 += l1;
      if (class50_sub1_sub4_sub3.anInt1610 > l) {
        class50_sub1_sub4_sub3.anInt1610 = l;
      }
    } else if (j > l) {
      class50_sub1_sub4_sub3.anInt1610 -= l1;
      if (class50_sub1_sub4_sub3.anInt1610 < l) {
        class50_sub1_sub4_sub3.anInt1610 = l;
      }
    }
    if (k < i1) {
      class50_sub1_sub4_sub3.anInt1611 += l1;
      if (class50_sub1_sub4_sub3.anInt1611 > i1) {
        class50_sub1_sub4_sub3.anInt1611 = i1;
      }
    } else if (k > i1) {
      class50_sub1_sub4_sub3.anInt1611 -= l1;
      if (class50_sub1_sub4_sub3.anInt1611 < i1) {
        class50_sub1_sub4_sub3.anInt1611 = i1;
      }
    }
    if (class50_sub1_sub4_sub3.anInt1610 == l
        && class50_sub1_sub4_sub3.anInt1611 == i1) {
      class50_sub1_sub4_sub3.anInt1633--;
      if (class50_sub1_sub4_sub3.anInt1613 > 0) {
        class50_sub1_sub4_sub3.anInt1613--;
      }
    }
  }

  public void method72(byte byte0, Character class50_sub1_sub4_sub3) {
    if (byte0 != 8) {
      anInt928 = encryption.nextKey();
    }
    if (class50_sub1_sub4_sub3.anInt1600 == 0) {
      return;
    }
    if (class50_sub1_sub4_sub3.anInt1609 != -1
        && class50_sub1_sub4_sub3.anInt1609 < 32768) {
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[class50_sub1_sub4_sub3.anInt1609];
      if (class50_sub1_sub4_sub3_sub1 != null) {
        int l = class50_sub1_sub4_sub3.anInt1610
            - class50_sub1_sub4_sub3_sub1.anInt1610;
        int j1 = class50_sub1_sub4_sub3.anInt1611
            - class50_sub1_sub4_sub3_sub1.anInt1611;
        if (l != 0 || j1 != 0) {
          class50_sub1_sub4_sub3.anInt1584 =
              (int) (Math.atan2(l, j1) * 325.94900000000001D) & 0x7ff;
        }
      }
    }
    if (class50_sub1_sub4_sub3.anInt1609 >= 32768) {
      int i = class50_sub1_sub4_sub3.anInt1609 - 32768;
      if (i == anInt961) {
        i = anInt969;
      }
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[i];
      if (class50_sub1_sub4_sub3_sub2 != null) {
        int k1 = class50_sub1_sub4_sub3.anInt1610
            - class50_sub1_sub4_sub3_sub2.anInt1610;
        int l1 = class50_sub1_sub4_sub3.anInt1611
            - class50_sub1_sub4_sub3_sub2.anInt1611;
        if (k1 != 0 || l1 != 0) {
          class50_sub1_sub4_sub3.anInt1584 = (int) (Math
              .atan2(k1, l1) * 325.94900000000001D) & 0x7ff;
        }
      }
    }
    if ((class50_sub1_sub4_sub3.anInt1598 != 0 || class50_sub1_sub4_sub3.anInt1599 != 0)
        && (class50_sub1_sub4_sub3.anInt1633 == 0 || class50_sub1_sub4_sub3.anInt1623 > 0)) {
      int j = class50_sub1_sub4_sub3.anInt1610
          - (class50_sub1_sub4_sub3.anInt1598 - anInt1040 - anInt1040)
          * 64;
      int i1 = class50_sub1_sub4_sub3.anInt1611
          - (class50_sub1_sub4_sub3.anInt1599 - anInt1041 - anInt1041)
          * 64;
      if (j != 0 || i1 != 0) {
        class50_sub1_sub4_sub3.anInt1584 = (int) (Math.atan2(j, i1) * 325.94900000000001D) & 0x7ff;
      }
      class50_sub1_sub4_sub3.anInt1598 = 0;
      class50_sub1_sub4_sub3.anInt1599 = 0;
    }
    int k = class50_sub1_sub4_sub3.anInt1584
        - class50_sub1_sub4_sub3.anInt1612 & 0x7ff;
    if (k != 0) {
      if (k < class50_sub1_sub4_sub3.anInt1600
          || k > 2048 - class50_sub1_sub4_sub3.anInt1600) {
        class50_sub1_sub4_sub3.anInt1612 = class50_sub1_sub4_sub3.anInt1584;
      } else if (k > 1024) {
        class50_sub1_sub4_sub3.anInt1612 -= class50_sub1_sub4_sub3.anInt1600;
      } else {
        class50_sub1_sub4_sub3.anInt1612 += class50_sub1_sub4_sub3.anInt1600;
      }
      class50_sub1_sub4_sub3.anInt1612 &= 0x7ff;
      if (class50_sub1_sub4_sub3.anInt1588 == class50_sub1_sub4_sub3.anInt1634
          && class50_sub1_sub4_sub3.anInt1612 != class50_sub1_sub4_sub3.anInt1584) {
        if (class50_sub1_sub4_sub3.anInt1635 != -1) {
          class50_sub1_sub4_sub3.anInt1588 = class50_sub1_sub4_sub3.anInt1635;
          return;
        }
        class50_sub1_sub4_sub3.anInt1588 = class50_sub1_sub4_sub3.anInt1619;
      }
    }
  }

  public void method73(Character class50_sub1_sub4_sub3, int i) {
    while (i >= 0) {
      anInt1328 = encryption.nextKey();
    }
    class50_sub1_sub4_sub3.aBoolean1592 = false;
    if (class50_sub1_sub4_sub3.anInt1588 != -1) {
      AnimationSequence class14 = AnimationSequence.animationSequences[class50_sub1_sub4_sub3.anInt1588];
      class50_sub1_sub4_sub3.anInt1590++;
      if (class50_sub1_sub4_sub3.anInt1589 < class14.anInt294
          && class50_sub1_sub4_sub3.anInt1590 > class14.method205(0,
          class50_sub1_sub4_sub3.anInt1589)) {
        class50_sub1_sub4_sub3.anInt1590 = 1;
        class50_sub1_sub4_sub3.anInt1589++;
      }
      if (class50_sub1_sub4_sub3.anInt1589 >= class14.anInt294) {
        class50_sub1_sub4_sub3.anInt1590 = 1;
        class50_sub1_sub4_sub3.anInt1589 = 0;
      }
    }
    if (class50_sub1_sub4_sub3.anInt1614 != -1
        && anInt1325 >= class50_sub1_sub4_sub3.anInt1617) {
      if (class50_sub1_sub4_sub3.anInt1615 < 0) {
        class50_sub1_sub4_sub3.anInt1615 = 0;
      }
      AnimationSequence class14_1 = SpotAnimation.spotAnimations[class50_sub1_sub4_sub3.anInt1614].aClass14_558;
      class50_sub1_sub4_sub3.anInt1616++;
      if (class50_sub1_sub4_sub3.anInt1615 < class14_1.anInt294
          && class50_sub1_sub4_sub3.anInt1616 > class14_1.method205(
          0, class50_sub1_sub4_sub3.anInt1615)) {
        class50_sub1_sub4_sub3.anInt1616 = 1;
        class50_sub1_sub4_sub3.anInt1615++;
      }
      if (class50_sub1_sub4_sub3.anInt1615 >= class14_1.anInt294
          && (class50_sub1_sub4_sub3.anInt1615 < 0
          || class50_sub1_sub4_sub3.anInt1615 >= class14_1.anInt294)) {
        class50_sub1_sub4_sub3.anInt1614 = -1;
      }
    }
    if (class50_sub1_sub4_sub3.animation != -1
        && class50_sub1_sub4_sub3.anInt1627 <= 1) {
      AnimationSequence class14_2 = AnimationSequence.animationSequences[class50_sub1_sub4_sub3.animation];
      if (class14_2.anInt305 == 1 && class50_sub1_sub4_sub3.anInt1613 > 0
          && class50_sub1_sub4_sub3.anInt1606 <= anInt1325
          && class50_sub1_sub4_sub3.anInt1607 < anInt1325) {
        class50_sub1_sub4_sub3.anInt1627 = 1;
        return;
      }
    }
    if (class50_sub1_sub4_sub3.animation != -1
        && class50_sub1_sub4_sub3.anInt1627 == 0) {
      AnimationSequence class14_3 = AnimationSequence.animationSequences[class50_sub1_sub4_sub3.animation];
      class50_sub1_sub4_sub3.anInt1626++;
      if (class50_sub1_sub4_sub3.anInt1625 < class14_3.anInt294
          && class50_sub1_sub4_sub3.anInt1626 > class14_3.method205(
          0, class50_sub1_sub4_sub3.anInt1625)) {
        class50_sub1_sub4_sub3.anInt1626 = 1;
        class50_sub1_sub4_sub3.anInt1625++;
      }
      if (class50_sub1_sub4_sub3.anInt1625 >= class14_3.anInt294) {
        class50_sub1_sub4_sub3.anInt1625 -= class14_3.anInt298;
        class50_sub1_sub4_sub3.anInt1628++;
        if (class50_sub1_sub4_sub3.anInt1628 >= class14_3.anInt304) {
          class50_sub1_sub4_sub3.animation = -1;
        }
        if (class50_sub1_sub4_sub3.anInt1625 < 0
            || class50_sub1_sub4_sub3.anInt1625 >= class14_3.anInt294) {
          class50_sub1_sub4_sub3.animation = -1;
        }
      }
      class50_sub1_sub4_sub3.aBoolean1592 = class14_3.aBoolean300;
    }
    if (class50_sub1_sub4_sub3.anInt1627 > 0) {
      class50_sub1_sub4_sub3.anInt1627--;
    }
  }

  public void method74(int i) {
    if (anInt1053 != -1 && (anInt1071 == 2 || super.aClass18_15 != null)) {
      if (anInt1071 == 2) {
        method88(anInt951, anInt1053, (byte) 5);
        if (anInt960 != -1) {
          method88(anInt951, anInt960, (byte) 5);
        }
        anInt951 = 0;
        method147(anInt1140);
        super.aClass18_15.method230();
        Canvas.anIntArray1538 = anIntArray1003;
        Rasterizer.method447(4);
        aBoolean1046 = true;
        Widget class13 = Widget.getWidget(anInt1053);
        if (class13.anInt241 == 512 && class13.anInt238 == 334
            && class13.anInt236 == 0) {
          class13.anInt241 = 765;
          class13.anInt238 = 503;
        }
        method142(0, 0, class13, 0, 8);
        if (anInt960 != -1) {
          Widget class13_1 = Widget.getWidget(anInt960);
          if (class13_1.anInt241 == 512 && class13_1.anInt238 == 334
              && class13_1.anInt236 == 0) {
            class13_1.anInt241 = 765;
            class13_1.anInt238 = 503;
          }
          method142(0, 0, class13_1, 0, 8);
        }
        if (!aBoolean1065) {
          method91(-521);
          method34((byte) -79);
        } else {
          method128(false);
        }
      }
      super.aClass18_15.method231(0, 0, super.aGraphics14, aBoolean1074);
      return;
    }
    if (aBoolean1046) {
      method122(-906);
      aBoolean1046 = false;
      aClass18_906.method231(4, 0, super.aGraphics14, aBoolean1074);
      aClass18_907.method231(357, 0, super.aGraphics14, aBoolean1074);
      aClass18_908.method231(4, 722, super.aGraphics14, aBoolean1074);
      aClass18_909.method231(205, 743, super.aGraphics14, aBoolean1074);
      aClass18_910.method231(0, 0, super.aGraphics14, aBoolean1074);
      aClass18_911.method231(4, 516, super.aGraphics14, aBoolean1074);
      aClass18_912.method231(205, 516, super.aGraphics14, aBoolean1074);
      aClass18_913.method231(357, 496, super.aGraphics14, aBoolean1074);
      aClass18_914.method231(338, 0, super.aGraphics14, aBoolean1074);
      aBoolean1181 = true;
      aBoolean1240 = true;
      aBoolean950 = true;
      aBoolean1212 = true;
      if (anInt1071 != 2) {
        aClass18_1158.method231(4, 4, super.aGraphics14, aBoolean1074);
        aClass18_1157
            .method231(4, 550, super.aGraphics14, aBoolean1074);
      }
      anInt1237++;
      if (anInt1237 > 85) {
        anInt1237 = 0;
        outgoingBuffer.writeByteIsaac(168);
      }
    }
    if (anInt1071 == 2) {
      method151(2);
    }
    if (aBoolean1065 && anInt1304 == 1) {
      aBoolean1181 = true;
    }
    if (anInt1089 != -1) {
      boolean flag = method88(anInt951, anInt1089, (byte) 5);
      if (flag) {
        aBoolean1181 = true;
      }
    }
    if (anInt1332 == 2) {
      aBoolean1181 = true;
    }
    if (anInt1113 == 2) {
      aBoolean1181 = true;
    }
    if (aBoolean1181) {
      method134();
      aBoolean1181 = false;
    }
    if (anInt988 == -1 && anInt1244 == 0) {
      aClass13_1249.anInt231 = anInt1107 - anInt851 - 77;
      if (super.anInt22 > 448 && super.anInt22 < 560
          && super.anInt23 > 332) {
        method42(anInt1107, 0, aClass13_1249, (byte) 102,
            super.anInt23 - 357, -1, super.anInt22 - 17, 77, 463);
      }
      int j = anInt1107 - 77 - aClass13_1249.anInt231;
      if (j < 0) {
        j = 0;
      }
      if (j > anInt1107 - 77) {
        j = anInt1107 - 77;
      }
      if (anInt851 != j) {
        anInt851 = j;
        aBoolean1240 = true;
      }
    }
    if (anInt988 == -1 && anInt1244 == 3) {
      int k = anInt862 * 14 + 7;
      aClass13_1249.anInt231 = anInt865;
      if (super.anInt22 > 448 && super.anInt22 < 560
          && super.anInt23 > 332) {
        method42(k, 0, aClass13_1249, (byte) 102, super.anInt23 - 357,
            -1, super.anInt22 - 17, 77, 463);
      }
      int i1 = aClass13_1249.anInt231;
      if (i1 < 0) {
        i1 = 0;
      }
      if (i1 > k - 77) {
        i1 = k - 77;
      }
      if (anInt865 != i1) {
        anInt865 = i1;
        aBoolean1240 = true;
      }
    }
    if (anInt988 != -1) {
      boolean flag1 = method88(anInt951, anInt988, (byte) 5);
      if (flag1) {
        aBoolean1240 = true;
      }
    }
    if (anInt1332 == 3) {
      aBoolean1240 = true;
    }
    if (anInt1113 == 3) {
      aBoolean1240 = true;
    }
    if (aString1058 != null) {
      aBoolean1240 = true;
    }
    if (aBoolean1065 && anInt1304 == 2) {
      aBoolean1240 = true;
    }
    if (aBoolean1240) {
      method84(0);
      aBoolean1240 = false;
    }
    if (anInt1071 == 2) {
      method87(503);
      aClass18_1157.method231(4, 550, super.aGraphics14, aBoolean1074);
    }
    if (anInt1213 != -1) {
      aBoolean950 = true;
    }
    if (aBoolean950) {
      if (anInt1213 != -1 && anInt1213 == anInt1285) {
        anInt1213 = -1;
        outgoingBuffer.writeByteIsaac(119);
        outgoingBuffer.writeByte(anInt1285);
      }
      aBoolean950 = false;
      aClass18_1110.method230();
      aClass50_Sub1_Sub1_Sub3_967.method490(0, 0, -488);
      if (anInt1089 == -1) {
        if (anIntArray1081[anInt1285] != -1) {
          if (anInt1285 == 0) {
            aClass50_Sub1_Sub1_Sub3_880.method490(10, 22, -488);
          }
          if (anInt1285 == 1) {
            aClass50_Sub1_Sub1_Sub3_881.method490(8, 54, -488);
          }
          if (anInt1285 == 2) {
            aClass50_Sub1_Sub1_Sub3_881.method490(8, 82, -488);
          }
          if (anInt1285 == 3) {
            aClass50_Sub1_Sub1_Sub3_882.method490(8, 110, -488);
          }
          if (anInt1285 == 4) {
            aClass50_Sub1_Sub1_Sub3_884.method490(8, 153, -488);
          }
          if (anInt1285 == 5) {
            aClass50_Sub1_Sub1_Sub3_884.method490(8, 181, -488);
          }
          if (anInt1285 == 6) {
            aClass50_Sub1_Sub1_Sub3_883.method490(9, 209, -488);
          }
        }
        if (anIntArray1081[0] != -1
            && (anInt1213 != 0 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[0].method490(13, 29, -488);
        }
        if (anIntArray1081[1] != -1
            && (anInt1213 != 1 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[1].method490(11, 53, -488);
        }
        if (anIntArray1081[2] != -1
            && (anInt1213 != 2 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[2].method490(11, 82, -488);
        }
        if (anIntArray1081[3] != -1
            && (anInt1213 != 3 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[3].method490(12, 115, -488);
        }
        if (anIntArray1081[4] != -1
            && (anInt1213 != 4 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[4].method490(13, 153, -488);
        }
        if (anIntArray1081[5] != -1
            && (anInt1213 != 5 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[5].method490(11, 180, -488);
        }
        if (anIntArray1081[6] != -1
            && (anInt1213 != 6 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[6].method490(13, 208, -488);
        }
      }
      aClass18_1110.method231(160, 516, super.aGraphics14, aBoolean1074);
      aClass18_1109.method230();
      aClass50_Sub1_Sub1_Sub3_966.method490(0, 0, -488);
      if (anInt1089 == -1) {
        if (anIntArray1081[anInt1285] != -1) {
          if (anInt1285 == 7) {
            aClass50_Sub1_Sub1_Sub3_983.method490(0, 42, -488);
          }
          if (anInt1285 == 8) {
            aClass50_Sub1_Sub1_Sub3_984.method490(0, 74, -488);
          }
          if (anInt1285 == 9) {
            aClass50_Sub1_Sub1_Sub3_984.method490(0, 102, -488);
          }
          if (anInt1285 == 10) {
            aClass50_Sub1_Sub1_Sub3_985.method490(1, 130, -488);
          }
          if (anInt1285 == 11) {
            aClass50_Sub1_Sub1_Sub3_987.method490(0, 173, -488);
          }
          if (anInt1285 == 12) {
            aClass50_Sub1_Sub1_Sub3_987.method490(0, 201, -488);
          }
          if (anInt1285 == 13) {
            aClass50_Sub1_Sub1_Sub3_986.method490(0, 229, -488);
          }
        }
        if (anIntArray1081[8] != -1
            && (anInt1213 != 8 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[7].method490(2, 74, -488);
        }
        if (anIntArray1081[9] != -1
            && (anInt1213 != 9 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[8].method490(3, 102, -488);
        }
        if (anIntArray1081[10] != -1
            && (anInt1213 != 10 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[9].method490(4, 137, -488);
        }
        if (anIntArray1081[11] != -1
            && (anInt1213 != 11 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[10].method490(2, 174, -488);
        }
        if (anIntArray1081[12] != -1
            && (anInt1213 != 12 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[11].method490(2, 201, -488);
        }
        if (anIntArray1081[13] != -1
            && (anInt1213 != 13 || anInt1325 % 20 < 10)) {
          aClass50_Sub1_Sub1_Sub3Array976[12].method490(2, 226, -488);
        }
      }
      aClass18_1109.method231(466, 496, super.aGraphics14, aBoolean1074);
      aClass18_1158.method230();
      Canvas.anIntArray1538 = anIntArray1002;
    }
    if (aBoolean1212) {
      aBoolean1212 = false;
      aClass18_1108.method230();
      aClass50_Sub1_Sub1_Sub3_965.method490(0, 0, -488);
      aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 0xffffff,
          28, 55, "Public chat");
      if (anInt1006 == 0) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 65280,
            41, 55, "On");
      }
      if (anInt1006 == 1) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056,
            0xffff00, 41, 55, "Friends");
      }
      if (anInt1006 == 2) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056,
            0xff0000, 41, 55, "Off");
      }
      if (anInt1006 == 3) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 65535,
            41, 55, "Hide");
      }
      aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 0xffffff,
          28, 184, "Private chat");
      if (anInt887 == 0) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 65280,
            41, 184, "On");
      }
      if (anInt887 == 1) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056,
            0xffff00, 41, 184, "Friends");
      }
      if (anInt887 == 2) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056,
            0xff0000, 41, 184, "Off");
      }
      aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 0xffffff,
          28, 324, "Trade/compete");
      if (anInt1227 == 0) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 65280,
            41, 324, "On");
      }
      if (anInt1227 == 1) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056,
            0xffff00, 41, 324, "Friends");
      }
      if (anInt1227 == 2) {
        aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056,
            0xff0000, 41, 324, "Off");
      }
      aClass50_Sub1_Sub1_Sub2_1060.method471(true, anInt1056, 0xffffff,
          33, 458, "Report abuse");
      aClass18_1108.method231(453, 0, super.aGraphics14, aBoolean1074);
      aClass18_1158.method230();
      Canvas.anIntArray1538 = anIntArray1002;
    }
    anInt951 = 0;
    if (i != 7) {
      for (int l = 1; l > 0; l++) {
			}
    }
  }

  public void method75(int i) {
    anInt869 += i;
    if (anInt1223 == 0) {
      return;
    }
    Class50_Sub1_Sub1_Sub2 class50_sub1_sub1_sub2 = aClass50_Sub1_Sub1_Sub2_1060;
    int j = 0;
    if (anInt1057 != 0) {
      j = 1;
    }
    for (int k = 0; k < 100; k++) {
      if (aStringArray1298[k] != null) {
        int l = anIntArray1296[k];
        String s = aStringArray1297[k];
        byte byte0 = 0;
        if (s != null && s.startsWith("@cr1@")) {
          s = s.substring(5);
          byte0 = 1;
        }
        if (s != null && s.startsWith("@cr2@")) {
          s = s.substring(5);
          byte0 = 2;
        }
        if ((l == 3 || l == 7)
            && (l == 7 || anInt887 == 0 || anInt887 == 1
            && method148(13292, s))) {
          int i1 = 329 - j * 13;
          int l1 = 4;
          class50_sub1_sub1_sub2.method474(2245, l1, 0, i1, "From");
          class50_sub1_sub1_sub2.method474(2245, l1, 65535, i1 - 1,
              "From");
          l1 += class50_sub1_sub1_sub2.method472((byte) 35, "From ");
          if (byte0 == 1) {
            aClass50_Sub1_Sub1_Sub3Array1142[0].method490(i1 - 12,
                l1, -488);
            l1 += 14;
          }
          if (byte0 == 2) {
            aClass50_Sub1_Sub1_Sub3Array1142[1].method490(i1 - 12,
                l1, -488);
            l1 += 14;
          }
          class50_sub1_sub1_sub2.method474(2245, l1, 0, i1, s + ": "
              + aStringArray1298[k]);
          class50_sub1_sub1_sub2.method474(2245, l1, 65535, i1 - 1, s
              + ": " + aStringArray1298[k]);
          if (++j >= 5) {
            return;
          }
        }
        if (l == 5 && anInt887 < 2) {
          int j1 = 329 - j * 13;
          class50_sub1_sub1_sub2.method474(2245, 4, 0, j1,
              aStringArray1298[k]);
          class50_sub1_sub1_sub2.method474(2245, 4, 65535, j1 - 1,
              aStringArray1298[k]);
          if (++j >= 5) {
            return;
          }
        }
        if (l == 6 && anInt887 < 2) {
          int k1 = 329 - j * 13;
          class50_sub1_sub1_sub2.method474(2245, 4, 0, k1, "To " + s
              + ": " + aStringArray1298[k]);
          class50_sub1_sub1_sub2.method474(2245, 4, 65535, k1 - 1,
              "To " + s + ": " + aStringArray1298[k]);
          if (++j >= 5) {
            return;
          }
        }
      }
    }

  }

  @Override
  public void init() {
    nodeId = Integer.parseInt(getParameter("nodeid"));
    portOffset = Integer.parseInt(getParameter("portoff"));
    String s = getParameter("lowmem");
    if (s != null && s.equals("1")) {
      setLowMemory(true);
    } else {
      setHighMemory(true);
    }
    String s1 = getParameter("free");
		membersServer = s1 == null || !s1.equals("1");
    method2(765, 503, 2);
  }

  public void method76(int i) {
    while (i >= 0) {
      aClass6ArrayArrayArray1323 = null;
    }
    for (Class50_Sub1_Sub4_Sub6 class50_sub1_sub4_sub6 = (Class50_Sub1_Sub4_Sub6) aClass6_1210
        .method158(); class50_sub1_sub4_sub6 != null;
        class50_sub1_sub4_sub6 = (Class50_Sub1_Sub4_Sub6) aClass6_1210
            .method160()) {
      if (class50_sub1_sub4_sub6.anInt1731 != anInt1091
          || class50_sub1_sub4_sub6.aBoolean1736) {
        class50_sub1_sub4_sub6.unlink();
      } else if (anInt1325 >= class50_sub1_sub4_sub6.anInt1740) {
        class50_sub1_sub4_sub6.method604(anInt951);
        if (class50_sub1_sub4_sub6.aBoolean1736) {
          class50_sub1_sub4_sub6.unlink();
        } else {
          aClass22_1164.method252(-1, class50_sub1_sub4_sub6,
              class50_sub1_sub4_sub6.anInt1732,
              class50_sub1_sub4_sub6.anInt1734, false, 0,
              class50_sub1_sub4_sub6.anInt1731, 60,
              class50_sub1_sub4_sub6.anInt1733, 0);
        }
      }
    }

  }

  public void method77(boolean flag) {
    if (flag) {
      incomingPacketOpcode = -1;
    }
    do {
      OnDemandNode onDemandRequest;
      do {
        onDemandRequest = requester.method330();
        if (onDemandRequest == null) {
          return;
        }
        if (onDemandRequest.type == 0) {
          Model.method575(onDemandRequest.aByteArray1470,
              onDemandRequest.id, (byte) 7);
          if ((requester.method325(onDemandRequest.id, -493) & 0x62) != 0) {
            aBoolean1181 = true;
            if (anInt988 != -1 || anInt1191 != -1) {
              aBoolean1240 = true;
            }
          }
        }
        if (onDemandRequest.type == 1
            && onDemandRequest.aByteArray1470 != null) {
          Animation.load(onDemandRequest.aByteArray1470);
        }
        if (onDemandRequest.type == 2
            && onDemandRequest.id == nextSong
            && onDemandRequest.aByteArray1470 != null) {
          AudioPlayer.playSong(onDemandRequest.aByteArray1470);
          method24(songChanging, onDemandRequest.aByteArray1470,
              659);
        }
        if (onDemandRequest.type == 3 && anInt1071 == 1) {
          for (int i = 0; i < aByteArrayArray838.length; i++) {
            if (anIntArray857[i] == onDemandRequest.id) {
              aByteArrayArray838[i] = onDemandRequest.aByteArray1470;
              if (onDemandRequest.aByteArray1470 == null) {
                anIntArray857[i] = -1;
              }
              break;
            }
            if (anIntArray858[i] != onDemandRequest.id) {
              continue;
            }
            aByteArrayArray1232[i] = onDemandRequest.aByteArray1470;
            if (onDemandRequest.aByteArray1470 == null) {
              anIntArray858[i] = -1;
            }
            break;
          }

        }
      } while (onDemandRequest.type != 93
          || !requester.method334(onDemandRequest.id, false));
      Region.method169(requester, new Buffer(
          onDemandRequest.aByteArray1470), (byte) -3);
    } while (true);
  }

  public boolean method78(int i) {
    if (i <= 0) {
      for (int j = 1; j > 0; j++) {
			}
    }
    return SignLink.wavereplay();
  }

  public void method79(String name, String s1, boolean reconnecting) {
    SignLink.errorname = name;
    try {
      if (!reconnecting) {
        aString957 = "";
        aString958 = "Connecting to server...";
        method131((byte) -50, true);
      }
      primaryConnection = new BufferedConnection(
          openSocket(43594 + portOffset), this);
      long encodedName = TextUtils.encodeBase37(name);
      int nameHash = (int) (encodedName >> 16 & 31L);
      outgoingBuffer.offset = 0;
      outgoingBuffer.writeByte(14);
      outgoingBuffer.writeByte(nameHash);
      primaryConnection.write(0, 2, 0, outgoingBuffer.payload);
      for (int j = 0; j < 8; j++) {
        primaryConnection.read();
      }

      int k = primaryConnection.read();
      int i1 = k;
      if (k == 0) {
        primaryConnection.read(buffer.payload, 0, 8);
        buffer.offset = 0;
        aLong930 = buffer.readLong();
        int[] seed = new int[4];
        seed[0] = (int) (Math.random() * 99999999D);
        seed[1] = (int) (Math.random() * 99999999D);
        seed[2] = (int) (aLong930 >> 32);
        seed[3] = (int) aLong930;
        outgoingBuffer.offset = 0;
        outgoingBuffer.writeByte(10);
        outgoingBuffer.writeInt(seed[0]);
        outgoingBuffer.writeInt(seed[1]);
        outgoingBuffer.writeInt(seed[2]);
        outgoingBuffer.writeInt(seed[3]);
        outgoingBuffer.writeInt(SignLink.uid);
        outgoingBuffer.writeString(name);
        outgoingBuffer.writeString(s1);
        outgoingBuffer.encodeRSA(RSA_MODULUS, RSA_EXPONENT);
        loginBuffer.offset = 0;
        if (reconnecting) {
          loginBuffer.writeByte(18);
        } else {
          loginBuffer.writeByte(16);
        }
        loginBuffer.writeByte(outgoingBuffer.offset + 36 + 1 + 1 + 2);
        loginBuffer.writeByte(255);
        loginBuffer.writeShort(377);
        loginBuffer.writeByte(lowMemory ? 1 : 0);
        for (int l1 = 0; l1 < 9; l1++) {
          loginBuffer.writeInt(archiveCRCs[l1]);
        }

        loginBuffer.writeBytes(outgoingBuffer.payload, 0,
            outgoingBuffer.offset);
        outgoingBuffer.encryption = new IsaacCipher(seed);
        for (int j2 = 0; j2 < 4; j2++) {
          seed[j2] += 50;
        }

        encryption = new IsaacCipher(seed);
        primaryConnection.write(0, loginBuffer.offset, 0,
            loginBuffer.payload);
        k = primaryConnection.read();
      }
      if (k == 1) {
        try {
          Thread.sleep(2000L);
        } catch (Exception _ex) {
        }
        method79(name, s1, reconnecting);
        return;
      }
      if (k == 2) {
        anInt867 = primaryConnection.read();
        aBoolean962 = primaryConnection.read() == 1;
        aLong902 = 0L;
        anInt1299 = 0;
        aClass7_1248.anInt136 = 0;
        super.aBoolean19 = true;
        aBoolean1275 = true;
        aBoolean1137 = true;
        outgoingBuffer.offset = 0;
        buffer.offset = 0;
        incomingPacketOpcode = -1;
        anInt903 = -1;
        anInt904 = -1;
        anInt905 = -1;
        anInt869 = 0;
        anInt871 = 0;
        anInt1057 = 0;
        anInt873 = 0;
        anInt1197 = 0;
        anInt1183 = 0;
        aBoolean1065 = false;
        super.anInt20 = 0;
        for (int j1 = 0; j1 < 100; j1++) {
          aStringArray1298[j1] = null;
        }

        anInt1146 = 0;
        anInt1171 = 0;
        anInt1071 = 0;
        pendingSounds = 0;
        anInt853 = (int) (Math.random() * 100D) - 50;
        anInt1009 = (int) (Math.random() * 110D) - 55;
        anInt1255 = (int) (Math.random() * 80D) - 40;
        anInt916 = (int) (Math.random() * 120D) - 60;
        anInt1233 = (int) (Math.random() * 30D) - 20;
        anInt1252 = (int) (Math.random() * 20D) - 10 & 0x7ff;
        anInt1050 = 0;
        anInt1276 = -1;
        anInt1120 = 0;
        anInt1121 = 0;
        anInt971 = 0;
        anInt1133 = 0;
        for (int i2 = 0; i2 < anInt968; i2++) {
          activePlayers[i2] = null;
          aClass50_Sub1_Sub2Array975[i2] = null;
        }

        for (int k2 = 0; k2 < 16384; k2++) {
          activeNpcs[k2] = null;
        }

        localPlayer = activePlayers[anInt969] = new Player();
        aClass6_1282.method162();
        aClass6_1210.method162();
        for (int l2 = 0; l2 < 4; l2++) {
          for (int i3 = 0; i3 < 104; i3++) {
            for (int k3 = 0; k3 < 104; k3++) {
              aClass6ArrayArrayArray1323[l2][i3][k3] = null;
            }

          }

        }

        aClass6_1261 = new Deque();
        anInt860 = 0;
        anInt859 = 0;
        method44(anInt1191);
        anInt1191 = -1;
        method44(anInt988);
        anInt988 = -1;
        method44(anInt1169);
        anInt1169 = -1;
        method44(anInt1053);
        anInt1053 = -1;
        method44(anInt960);
        anInt960 = -1;
        method44(anInt1089);
        anInt1089 = -1;
        method44(anInt1279);
        anInt1279 = -1;
        aBoolean1239 = false;
        anInt1285 = 3;
        anInt1244 = 0;
        aBoolean1065 = false;
        aBoolean866 = false;
        aString1058 = null;
        anInt1319 = 0;
        anInt1213 = -1;
        aBoolean1144 = true;
        method25(anInt1015);
        for (int j3 = 0; j3 < 5; j3++) {
          anIntArray1099[j3] = 0;
        }

        for (int l3 = 0; l3 < 5; l3++) {
          aStringArray1069[l3] = null;
          aBooleanArray1070[l3] = false;
        }

        anInt1100 = 0;
        anInt1165 = 0;
        anInt1235 = 0;
        anInt1052 = 0;
        anInt1139 = 0;
        anInt841 = 0;
        anInt1230 = 0;
        anInt1013 = 0;
        anInt1049 = 0;
        anInt1162 = 0;
        method122(-906);
        return;
      }
      if (k == 3) {
        aString957 = "";
        aString958 = "Invalid username or password.";
        return;
      }
      if (k == 4) {
        aString957 = "Your account has been disabled.";
        aString958 = "Please check your message-centre for details.";
        return;
      }
      if (k == 5) {
        aString957 = "Your account is already logged in.";
        aString958 = "Try again in 60 secs...";
        return;
      }
      if (k == 6) {
        aString957 = "RuneScape has been updated!";
        aString958 = "Please reload this page.";
        return;
      }
      if (k == 7) {
        aString957 = "This world is full.";
        aString958 = "Please use a different world.";
        return;
      }
      if (k == 8) {
        aString957 = "Unable to connect.";
        aString958 = "Login server offline.";
        return;
      }
      if (k == 9) {
        aString957 = "Login limit exceeded.";
        aString958 = "Too many connections from your address.";
        return;
      }
      if (k == 10) {
        aString957 = "Unable to connect.";
        aString958 = "Bad session id.";
        return;
      }
      if (k == 12) {
        aString957 = "You need a members account to login to this world.";
        aString958 = "Please subscribe, or use a different world.";
        return;
      }
      if (k == 13) {
        aString957 = "Could not complete login.";
        aString958 = "Please try using a different world.";
        return;
      }
      if (k == 14) {
        aString957 = "The server is being updated.";
        aString958 = "Please wait 1 minute and try again.";
        return;
      }
      if (k == 15) {
        aBoolean1137 = true;
        outgoingBuffer.offset = 0;
        buffer.offset = 0;
        incomingPacketOpcode = -1;
        anInt903 = -1;
        anInt904 = -1;
        anInt905 = -1;
        anInt869 = 0;
        anInt871 = 0;
        anInt1057 = 0;
        anInt1183 = 0;
        aBoolean1065 = false;
        aLong1229 = System.currentTimeMillis();
        return;
      }
      if (k == 16) {
        aString957 = "Login attempts exceeded.";
        aString958 = "Please wait 1 minute and try again.";
        return;
      }
      if (k == 17) {
        aString957 = "You are standing in a members-only area.";
        aString958 = "To play on this world move to a free area first";
        return;
      }
      if (k == 18) {
        aString957 = "Account locked as we suspect it has been stolen.";
        aString958 = "Press 'recover a locked account' on front page.";
        return;
      }
      if (k == 20) {
        aString957 = "Invalid loginserver requested";
        aString958 = "Please try using a different world.";
        return;
      }
      if (k == 21) {
        int k1 = primaryConnection.read();
        for (k1 += 3; k1 >= 0; k1--) {
          aString957 = "You have only just left another world";
          aString958 = "Your profile will be transferred in: " + k1;
          method131((byte) -50, true);
          try {
            Thread.sleep(1200L);
          } catch (Exception _ex) {
          }
        }

        method79(name, s1, reconnecting);
        return;
      }
      if (k == 22) {
        aString957 = "Malformed login packet.";
        aString958 = "Please try again.";
        return;
      }
      if (k == 23) {
        aString957 = "No reply from loginserver.";
        aString958 = "Please try again.";
        return;
      }
      if (k == 24) {
        aString957 = "Error loading your profile.";
        aString958 = "Please contact customer support.";
        return;
      }
      if (k == 25) {
        aString957 = "Unexpected loginserver response.";
        aString958 = "Please try using a different world.";
        return;
      }
      if (k == 26) {
        aString957 = "This computers address has been blocked";
        aString958 = "as it was used to break our rules";
        return;
      }
      if (k == -1) {
        if (i1 == 0) {
          if (anInt850 < 2) {
            try {
              Thread.sleep(2000L);
            } catch (Exception _ex) {
            }
            anInt850++;
            method79(name, s1, reconnecting);
            return;
          } else {
            aString957 = "No response from loginserver";
            aString958 = "Please wait 1 minute and try again.";
            return;
          }
        } else {
          aString957 = "No response from server";
          aString958 = "Please try using a different world.";
          return;
        }
      } else {
        System.out.println("response:" + k);
        aString957 = "Unexpected server response";
        aString958 = "Please try using a different world.";
        return;
      }
    } catch (IOException _ex) {
      aString957 = "";
    }
    aString958 = "Error connecting to server.";
  }

  public boolean method80(int i, int j, int k, int clickedItem) {
    int id = clickedItem >> 14 & 0x7fff;
    int j1 = aClass22_1164.method271(anInt1091, k, i, clickedItem);
    if (j1 == -1) {
      return false;
    }
    int k1 = j1 & 0x1f;
    int l1 = j1 >> 6 & 3;
    if (k1 == 10 || k1 == 11 || k1 == 22) {
      GameObjectDefinition definition = GameObjectDefinition.forId(id);
      int i2;
      int j2;
      if (l1 == 0 || l1 == 2) {
        i2 = definition.anInt801;
        j2 = definition.anInt775;
      } else {
        i2 = definition.anInt775;
        j2 = definition.anInt801;
      }
      int k2 = definition.anInt764;
      if (l1 != 0) {
        k2 = (k2 << l1 & 0xf) + (k2 >> 4 - l1);
      }
      method35(true, false, i,
          localPlayer.anIntArray1587[0], i2, j2, 2, 0,
          k, k2, 0, localPlayer.anIntArray1586[0]);
    } else {
      method35(true, false, i,
          localPlayer.anIntArray1587[0], 0, 0, 2,
          k1 + 1, k, 0, l1,
          localPlayer.anIntArray1586[0]);
    }
    anInt1020 = super.anInt29;
    anInt1021 = super.anInt30;
    anInt1023 = 2;
    anInt1022 = 0;
    anInt869 += j;
    return true;
  }

  public void method81(byte byte0) {
    char c = '\u0100';
    for (int i = 10; i < 117; i++) {
      int j = (int) (Math.random() * 100D);
      if (j < 50) {
        anIntArray1084[i + (c - 2 << 7)] = 255;
      }
    }

    for (int k = 0; k < 100; k++) {
      int l = (int) (Math.random() * 124D) + 2;
      int j1 = (int) (Math.random() * 128D) + 128;
      int j2 = l + (j1 << 7);
      anIntArray1084[j2] = 192;
    }

    for (int i1 = 1; i1 < c - 1; i1++) {
      for (int k1 = 1; k1 < 127; k1++) {
        int k2 = k1 + (i1 << 7);
        anIntArray1085[k2] = (anIntArray1084[k2 - 1]
            + anIntArray1084[k2 + 1] + anIntArray1084[k2 - 128] + anIntArray1084[k2 + 128]) / 4;
      }

    }

    anInt1238 += 128;
    if (anInt1238 > anIntArray1176.length) {
      anInt1238 -= anIntArray1176.length;
      int l1 = (int) (Math.random() * 12D);
      method83(aClass50_Sub1_Sub1_Sub3Array1117[l1], 0);
    }
    for (int i2 = 1; i2 < c - 1; i2++) {
      for (int l2 = 1; l2 < 127; l2++) {
        int k3 = l2 + (i2 << 7);
        int i4 = anIntArray1085[k3 + 128]
            - anIntArray1176[k3 + anInt1238 & anIntArray1176.length
            - 1] / 5;
        if (i4 < 0) {
          i4 = 0;
        }
        anIntArray1084[k3] = i4;
      }

    }

    if (byte0 == 1) {
      byte0 = 0;
    } else {
      for (int i3 = 1; i3 > 0; i3++) {
			}
    }
    for (int j3 = 0; j3 < c - 1; j3++) {
      anIntArray1166[j3] = anIntArray1166[j3 + 1];
    }

    anIntArray1166[c - 1] = (int) (Math.sin((double) anInt1325 / 14D) * 16D
        + Math.sin((double) anInt1325 / 15D) * 14D + Math
        .sin((double) anInt1325 / 16D) * 12D);
    if (anInt1047 > 0) {
      anInt1047 -= 4;
    }
    if (anInt1048 > 0) {
      anInt1048 -= 4;
    }
    if (anInt1047 == 0 && anInt1048 == 0) {
      int l3 = (int) (Math.random() * 2000D);
      if (l3 == 0) {
        anInt1047 = 1024;
      }
      if (l3 == 1) {
        anInt1048 = 1024;
      }
    }
  }

  public void method82(NpcDefinition definition, int i, int j, int k) {
    if (anInt1183 >= 400) {
      return;
    }
    if (definition.anIntArray622 != null) {
      definition = definition.method363(false);
    }
    if (definition == null) {
      return;
    }
    if (!definition.aBoolean631) {
      return;
    }
    String s = definition.name;
    if (definition.combatLevel != 0) {
      s = s
          + getCombatLevelColour(definition.combatLevel,
          localPlayer.combatLevel) + " (level-"
          + definition.combatLevel + ")";
    }
    if (anInt1146 == 1) {
      aStringArray1184[anInt1183] = "Use " + selectedItem + " with @yel@"
          + s;
      anIntArray981[anInt1183] = 347;
      anIntArray982[anInt1183] = k;
      anIntArray979[anInt1183] = j;
      anIntArray980[anInt1183] = i;
      anInt1183++;
      return;
    }
    if (anInt1171 == 1) {
      if ((anInt1173 & 2) == 2) {
        aStringArray1184[anInt1183] = aString1174 + " @yel@" + s;
        anIntArray981[anInt1183] = 67;
        anIntArray982[anInt1183] = k;
        anIntArray979[anInt1183] = j;
        anIntArray980[anInt1183] = i;
        anInt1183++;
			}
    } else {
      if (definition.aStringArray646 != null) {
        for (int l = 4; l >= 0; l--) {
          if (definition.aStringArray646[l] != null
              && !definition.aStringArray646[l]
              .equalsIgnoreCase("attack")) {
            aStringArray1184[anInt1183] = definition.aStringArray646[l]
                + " @yel@" + s;
            if (l == 0) {
              anIntArray981[anInt1183] = 318;
            }
            if (l == 1) {
              anIntArray981[anInt1183] = 921;
            }
            if (l == 2) {
              anIntArray981[anInt1183] = 118;
            }
            if (l == 3) {
              anIntArray981[anInt1183] = 553;
            }
            if (l == 4) {
              anIntArray981[anInt1183] = 432;
            }
            anIntArray982[anInt1183] = k;
            anIntArray979[anInt1183] = j;
            anIntArray980[anInt1183] = i;
            anInt1183++;
          }
        }

      }
      if (definition.aStringArray646 != null) {
        for (int i1 = 4; i1 >= 0; i1--) {
          if (definition.aStringArray646[i1] != null
              && definition.aStringArray646[i1]
              .equalsIgnoreCase("attack")) {
            char c = '\0';
            if (definition.combatLevel > localPlayer.combatLevel) {
              c = '\u07D0';
            }
            aStringArray1184[anInt1183] = definition.aStringArray646[i1]
                + " @yel@" + s;
            if (i1 == 0) {
              anIntArray981[anInt1183] = 318 + c;
            }
            if (i1 == 1) {
              anIntArray981[anInt1183] = 921 + c;
            }
            if (i1 == 2) {
              anIntArray981[anInt1183] = 118 + c;
            }
            if (i1 == 3) {
              anIntArray981[anInt1183] = 553 + c;
            }
            if (i1 == 4) {
              anIntArray981[anInt1183] = 432 + c;
            }
            anIntArray982[anInt1183] = k;
            anIntArray979[anInt1183] = j;
            anIntArray980[anInt1183] = i;
            anInt1183++;
          }
        }

      }
      aStringArray1184[anInt1183] = "Examine @yel@" + s;
      anIntArray981[anInt1183] = 1668;
      anIntArray982[anInt1183] = k;
      anIntArray979[anInt1183] = j;
      anIntArray980[anInt1183] = i;
      anInt1183++;
    }
  }

  public void method83(IndexedImage class50_sub1_sub1_sub3, int i) {
    anInt869 += i;
    int j = 256;
    for (int k = 0; k < anIntArray1176.length; k++) {
      anIntArray1176[k] = 0;
    }

    for (int l = 0; l < 5000; l++) {
      int i1 = (int) (Math.random() * 128D * (double) j);
      anIntArray1176[i1] = (int) (Math.random() * 256D);
    }

    for (int j1 = 0; j1 < 20; j1++) {
      for (int k1 = 1; k1 < j - 1; k1++) {
        for (int i2 = 1; i2 < 127; i2++) {
          int k2 = i2 + (k1 << 7);
          anIntArray1177[k2] = (anIntArray1176[k2 - 1]
              + anIntArray1176[k2 + 1] + anIntArray1176[k2 - 128] + anIntArray1176[k2 + 128]) / 4;
        }

      }

      int[] ai = anIntArray1176;
      anIntArray1176 = anIntArray1177;
      anIntArray1177 = ai;
    }

    if (class50_sub1_sub1_sub3 != null) {
      int l1 = 0;
      for (int j2 = 0; j2 < class50_sub1_sub1_sub3.anInt1519; j2++) {
        for (int l2 = 0; l2 < class50_sub1_sub1_sub3.anInt1518; l2++) {
          if (class50_sub1_sub1_sub3.aByteArray1516[l1++] != 0) {
            int i3 = l2 + 16 + class50_sub1_sub1_sub3.anInt1520;
            int j3 = j2 + 16 + class50_sub1_sub1_sub3.anInt1521;
            int k3 = i3 + (j3 << 7);
            anIntArray1176[k3] = 0;
          }
        }

      }

    }
  }

  public void method84(int i) {
    aClass18_1159.method230();
    Canvas.anIntArray1538 = anIntArray1000;
    aClass50_Sub1_Sub1_Sub3_1187.method490(0, 0, -488);
    if (aBoolean866) {
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 40, 0, aString937);
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 60, 128,
          aString1026 + "*");
    } else if (anInt1244 == 1) {
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 40, 0,
          "Enter amount:");
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 60, 128,
          aString949 + "*");
    } else if (anInt1244 == 2) {
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 40, 0,
          "Enter name:");
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 60, 128,
          aString949 + "*");
    } else if (anInt1244 == 3) {
      if (aString949 != aString861) {
        method14(aString949);
        aString861 = aString949;
      }
      Class50_Sub1_Sub1_Sub2 class50_sub1_sub1_sub2 = aClass50_Sub1_Sub1_Sub2_1060;
      Rasterizer.method446(0, 0, 77, 463, true);
      for (int j = 0; j < anInt862; j++) {
        int l = 18 + j * 14 - anInt865;
        if (l > 0 && l < 110) {
          class50_sub1_sub1_sub2.method470(239, 452, l, 0,
              aStringArray863[j]);
        }
      }

      Rasterizer.method445((byte) 82);
      if (anInt862 > 5) {
        method56(true, anInt865, 463, 77, anInt862 * 14 + 7, 0);
      }
      if (aString949.length() == 0) {
        aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 40, 255,
            "Enter object name");
      } else if (anInt862 == 0) {
        aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 40, 0,
            "No matching objects found, please shorten search");
      }
      class50_sub1_sub1_sub2.method470(239, 452, 90, 0, aString949 + "*");
      Rasterizer.method452(0, 0, 77, 479, true);
    } else if (aString1058 != null) {
      aClass50_Sub1_Sub1_Sub2_1061
          .method470(239, 452, 40, 0, aString1058);
      aClass50_Sub1_Sub1_Sub2_1061.method470(239, 452, 60, 128,
          "Click to continue");
    } else if (anInt988 != -1) {
      method142(0, 0, Widget.getWidget(anInt988), 0, 8);
    } else if (anInt1191 != -1) {
      method142(0, 0, Widget.getWidget(anInt1191), 0, 8);
    } else {
      Class50_Sub1_Sub1_Sub2 class50_sub1_sub1_sub2_1 = aClass50_Sub1_Sub1_Sub2_1060;
      int k = 0;
      Rasterizer.method446(0, 0, 77, 463, true);
      for (int i1 = 0; i1 < 100; i1++) {
        if (aStringArray1298[i1] != null) {
          int j1 = anIntArray1296[i1];
          int k1 = 70 - k * 14 + anInt851;
          String s1 = aStringArray1297[i1];
          byte byte0 = 0;
          if (s1 != null && s1.startsWith("@cr1@")) {
            s1 = s1.substring(5);
            byte0 = 1;
          }
          if (s1 != null && s1.startsWith("@cr2@")) {
            s1 = s1.substring(5);
            byte0 = 2;
          }
          if (j1 == 0) {
            if (k1 > 0 && k1 < 110) {
              class50_sub1_sub1_sub2_1.method474(2245, 4, 0, k1,
                  aStringArray1298[i1]);
            }
            k++;
          }
          if ((j1 == 1 || j1 == 2)
              && (j1 == 1 || anInt1006 == 0 || anInt1006 == 1
              && method148(13292, s1))) {
            if (k1 > 0 && k1 < 110) {
              int l1 = 4;
              if (byte0 == 1) {
                aClass50_Sub1_Sub1_Sub3Array1142[0].method490(
                    k1 - 12, l1, -488);
                l1 += 14;
              }
              if (byte0 == 2) {
                aClass50_Sub1_Sub1_Sub3Array1142[1].method490(
                    k1 - 12, l1, -488);
                l1 += 14;
              }
              class50_sub1_sub1_sub2_1.method474(2245, l1, 0, k1,
                  s1 + ":");
              l1 += class50_sub1_sub1_sub2_1.method472((byte) 35,
                  s1) + 8;
              class50_sub1_sub1_sub2_1.method474(2245, l1, 255,
                  k1, aStringArray1298[i1]);
            }
            k++;
          }
          if ((j1 == 3 || j1 == 7)
              && anInt1223 == 0
              && (j1 == 7 || anInt887 == 0 || anInt887 == 1
              && method148(13292, s1))) {
            if (k1 > 0 && k1 < 110) {
              int i2 = 4;
              class50_sub1_sub1_sub2_1.method474(2245, i2, 0, k1,
                  "From");
              i2 += class50_sub1_sub1_sub2_1.method472((byte) 35,
                  "From ");
              if (byte0 == 1) {
                aClass50_Sub1_Sub1_Sub3Array1142[0].method490(
                    k1 - 12, i2, -488);
                i2 += 14;
              }
              if (byte0 == 2) {
                aClass50_Sub1_Sub1_Sub3Array1142[1].method490(
                    k1 - 12, i2, -488);
                i2 += 14;
              }
              class50_sub1_sub1_sub2_1.method474(2245, i2, 0, k1,
                  s1 + ":");
              i2 += class50_sub1_sub1_sub2_1.method472((byte) 35,
                  s1) + 8;
              class50_sub1_sub1_sub2_1.method474(2245, i2,
                  0x800000, k1, aStringArray1298[i1]);
            }
            k++;
          }
          if (j1 == 4
              && (anInt1227 == 0 || anInt1227 == 1
              && method148(13292, s1))) {
            if (k1 > 0 && k1 < 110) {
              class50_sub1_sub1_sub2_1.method474(2245, 4,
                  0x800080, k1, s1 + " "
                      + aStringArray1298[i1]);
            }
            k++;
          }
          if (j1 == 5 && anInt1223 == 0 && anInt887 < 2) {
            if (k1 > 0 && k1 < 110) {
              class50_sub1_sub1_sub2_1.method474(2245, 4,
                  0x800000, k1, aStringArray1298[i1]);
            }
            k++;
          }
          if (j1 == 6 && anInt1223 == 0 && anInt887 < 2) {
            if (k1 > 0 && k1 < 110) {
              class50_sub1_sub1_sub2_1.method474(2245, 4, 0, k1,
                  "To " + s1 + ":");
              class50_sub1_sub1_sub2_1.method474(2245,
                  12 + class50_sub1_sub1_sub2_1.method472(
                      (byte) 35, "To " + s1), 0x800000,
                  k1, aStringArray1298[i1]);
            }
            k++;
          }
          if (j1 == 8
              && (anInt1227 == 0 || anInt1227 == 1
              && method148(13292, s1))) {
            if (k1 > 0 && k1 < 110) {
              class50_sub1_sub1_sub2_1.method474(2245, 4,
                  0x7e3200, k1, s1 + " "
                      + aStringArray1298[i1]);
            }
            k++;
          }
        }
      }

      Rasterizer.method445((byte) 82);
      anInt1107 = k * 14 + 7;
      if (anInt1107 < 78) {
        anInt1107 = 78;
      }
      method56(true, anInt1107 - anInt851 - 77, 463, 77, anInt1107, 0);
      String s;
      if (localPlayer != null && localPlayer.name != null) {
        s = localPlayer.name;
      } else {
        s = TextUtils.method303(aString1092);
      }
      class50_sub1_sub1_sub2_1.method474(2245, 4, 0, 90, s + ":");
      class50_sub1_sub1_sub2_1
          .method474(
              2245,
              6 + class50_sub1_sub1_sub2_1.method472((byte) 35, s
                  + ": "), 255, 90, aString1104 + "*");
      Rasterizer.method452(0, 0, 77, 479, true);
    }
    if (aBoolean1065 && anInt1304 == 2) {
      method128(false);
    }
    aClass18_1159.method231(357, 17, super.aGraphics14, aBoolean1074);
    aClass18_1158.method230();
    Canvas.anIntArray1538 = anIntArray1002;
    if (i != 0) {
      aClass6ArrayArrayArray1323 = null;
    }
  }

  public void method85(int i) {
    for (int j = -1; j < anInt971; j++) {
      int k;
      if (j == -1) {
        k = anInt969;
      } else {
        k = anIntArray972[j];
      }
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[k];
      if (class50_sub1_sub4_sub3_sub2 != null
          && class50_sub1_sub4_sub3_sub2.anInt1582 > 0) {
        class50_sub1_sub4_sub3_sub2.anInt1582--;
        if (class50_sub1_sub4_sub3_sub2.anInt1582 == 0) {
          class50_sub1_sub4_sub3_sub2.aString1580 = null;
        }
      }
    }

    anInt869 += i;
    for (int l = 0; l < anInt1133; l++) {
      int i1 = anIntArray1134[l];
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[i1];
      if (class50_sub1_sub4_sub3_sub1 != null
          && class50_sub1_sub4_sub3_sub1.anInt1582 > 0) {
        class50_sub1_sub4_sub3_sub1.anInt1582--;
        if (class50_sub1_sub4_sub3_sub1.anInt1582 == 0) {
          class50_sub1_sub4_sub3_sub1.aString1580 = null;
        }
      }
    }

  }

  public void method86(boolean flag) {
    int i = 5;
    archiveCRCs[8] = 0;
    if (flag) {
      for (int j = 1; j > 0; j++) {
			}
    }
    int k = 0;
    while (archiveCRCs[8] == 0) {
      String s = "Unknown problem";
      method13(20, true, "Connecting to web server");
      try {
        DataInputStream datainputstream = method31("crc"
            + (int) (Math.random() * 99999999D) + "-" + 377);
        Buffer class50_sub1_sub2 = new Buffer(new byte[40]);
        datainputstream.readFully(class50_sub1_sub2.payload, 0, 40);
        datainputstream.close();
        for (int i1 = 0; i1 < 9; i1++) {
          archiveCRCs[i1] = class50_sub1_sub2.readInt();
        }

        int j1 = class50_sub1_sub2.readInt();
        int k1 = 1234;
        for (int l1 = 0; l1 < 9; l1++) {
          k1 = (k1 << 1) + archiveCRCs[l1];
        }

        if (j1 != k1) {
          s = "checksum problem";
          archiveCRCs[8] = 0;
        }
      } catch (EOFException _ex) {
        s = "EOF problem";
        archiveCRCs[8] = 0;
      } catch (IOException _ex) {
        s = "connection problem";
        archiveCRCs[8] = 0;
      } catch (Exception _ex) {
        s = "logic problem";
        archiveCRCs[8] = 0;
        if (!SignLink.reporterror) {
          return;
        }
      }
      if (archiveCRCs[8] == 0) {
        k++;
        for (int l = i; l > 0; l--) {
          if (k >= 10) {
            method13(10, true, "Game updated - please reload page");
            l = 10;
          } else {
            method13(10, true, s + " - Will retry in " + l
                + " secs.");
          }
          try {
            Thread.sleep(1000L);
          } catch (Exception _ex) {
          }
        }

        i *= 2;
        if (i > 60) {
          i = 60;
        }
        aBoolean900 = !aBoolean900;
      }
    }
  }

  public void method87(int i) {
    aClass18_1157.method230();
    if (anInt1050 == 2) {
      byte[] abyte0 = aClass50_Sub1_Sub1_Sub3_1186.aByteArray1516;
      int[] ai = Rasterizer.anIntArray1424;
      int l2 = abyte0.length;
      for (int j5 = 0; j5 < l2; j5++) {
        if (abyte0[j5] == 0) {
          ai[j5] = 0;
        }
      }

      aClass50_Sub1_Sub1_Sub1_1116.method465(0, 567, 33, 25, 33,
          anIntArray1286, 0, anInt1252, 256, anIntArray1180, 25);
      aClass18_1158.method230();
      Canvas.anIntArray1538 = anIntArray1002;
      return;
    }
    int j = anInt1252 + anInt916 & 0x7ff;
    int k = 48 + localPlayer.anInt1610 / 32;
    i = 58 / i;
    int i3 = 464 - localPlayer.anInt1611 / 32;
    aClass50_Sub1_Sub1_Sub1_1122.method465(5, 567, 151, k, 146,
        anIntArray920, 25, j, 256 + anInt1233, anIntArray1019, i3);
    aClass50_Sub1_Sub1_Sub1_1116.method465(0, 567, 33, 25, 33,
        anIntArray1286, 0, anInt1252, 256, anIntArray1180, 25);
    for (int k5 = 0; k5 < anInt1076; k5++) {
      int l = anIntArray1077[k5] * 4 + 2
          - localPlayer.anInt1610 / 32;
      int j3 = anIntArray1078[k5] * 4 + 2
          - localPlayer.anInt1611 / 32;
      method130(j3, true, aClass50_Sub1_Sub1_Sub1Array1278[k5], l);
    }

    for (int l5 = 0; l5 < 104; l5++) {
      for (int i6 = 0; i6 < 104; i6++) {
        Deque class6 = aClass6ArrayArrayArray1323[anInt1091][l5][i6];
        if (class6 != null) {
          int i1 = l5 * 4 + 2 - localPlayer.anInt1610
              / 32;
          int k3 = i6 * 4 + 2 - localPlayer.anInt1611
              / 32;
          method130(k3, true, aClass50_Sub1_Sub1_Sub1_1192, i1);
        }
      }

    }

    for (int j6 = 0; j6 < anInt1133; j6++) {
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[anIntArray1134[j6]];
      if (class50_sub1_sub4_sub3_sub1 != null
          && class50_sub1_sub4_sub3_sub1.method565()) {
        NpcDefinition class37 = class50_sub1_sub4_sub3_sub1.definition;
        if (class37.anIntArray622 != null) {
          class37 = class37.method363(false);
        }
        if (class37 != null && class37.aBoolean636
            && class37.aBoolean631) {
          int j1 = class50_sub1_sub4_sub3_sub1.anInt1610
              / 32 - localPlayer.anInt1610 / 32;
          int l3 = class50_sub1_sub4_sub3_sub1.anInt1611
              / 32 - localPlayer.anInt1611 / 32;
          method130(l3, true, aClass50_Sub1_Sub1_Sub1_1193, j1);
        }
      }
    }

    for (int k6 = 0; k6 < anInt971; k6++) {
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[anIntArray972[k6]];
      if (class50_sub1_sub4_sub3_sub2 != null
          && class50_sub1_sub4_sub3_sub2.method565()) {
        int k1 = class50_sub1_sub4_sub3_sub2.anInt1610
            / 32 - localPlayer.anInt1610 / 32;
        int i4 = class50_sub1_sub4_sub3_sub2.anInt1611
            / 32 - localPlayer.anInt1611 / 32;
        boolean flag = false;
        long l6 = TextUtils
            .encodeBase37(class50_sub1_sub4_sub3_sub2.name);
        for (int i7 = 0; i7 < anInt859; i7++) {
          if (l6 != aLongArray1130[i7] || anIntArray1267[i7] == 0) {
            continue;
          }
          flag = true;
          break;
        }

        boolean flag1 = localPlayer.anInt1766 != 0
						&& class50_sub1_sub4_sub3_sub2.anInt1766 != 0
						&& localPlayer.anInt1766 == class50_sub1_sub4_sub3_sub2.anInt1766;
				if (flag) {
          method130(i4, true, aClass50_Sub1_Sub1_Sub1_1195, k1);
        } else if (flag1) {
          method130(i4, true, aClass50_Sub1_Sub1_Sub1_1196, k1);
        } else {
          method130(i4, true, aClass50_Sub1_Sub1_Sub1_1194, k1);
        }
      }
    }

    if (anInt1197 != 0 && anInt1325 % 20 < 10) {
      if (anInt1197 == 1 && anInt1226 >= 0
          && anInt1226 < activeNpcs.length) {
        Npc class50_sub1_sub4_sub3_sub1_1 = activeNpcs[anInt1226];
        if (class50_sub1_sub4_sub3_sub1_1 != null) {
          int l1 = class50_sub1_sub4_sub3_sub1_1.anInt1610
              / 32 - localPlayer.anInt1610 / 32;
          int j4 = class50_sub1_sub4_sub3_sub1_1.anInt1611
              / 32 - localPlayer.anInt1611 / 32;
          method55(j4, aClass50_Sub1_Sub1_Sub1_1037, -687, l1);
        }
      }
      if (anInt1197 == 2) {
        int i2 = (anInt844 - anInt1040) * 4 + 2
            - localPlayer.anInt1610 / 32;
        int k4 = (anInt845 - anInt1041) * 4 + 2
            - localPlayer.anInt1611 / 32;
        method55(k4, aClass50_Sub1_Sub1_Sub1_1037, -687, i2);
      }
      if (anInt1197 == 10 && anInt1151 >= 0
          && anInt1151 < activePlayers.length) {
        Player class50_sub1_sub4_sub3_sub2_1 = activePlayers[anInt1151];
        if (class50_sub1_sub4_sub3_sub2_1 != null) {
          int j2 = class50_sub1_sub4_sub3_sub2_1.anInt1610
              / 32 - localPlayer.anInt1610 / 32;
          int l4 = class50_sub1_sub4_sub3_sub2_1.anInt1611
              / 32 - localPlayer.anInt1611 / 32;
          method55(l4, aClass50_Sub1_Sub1_Sub1_1037, -687, j2);
        }
      }
    }
    if (anInt1120 != 0) {
      int k2 = anInt1120 * 4 + 2 - localPlayer.anInt1610
          / 32;
      int i5 = anInt1121 * 4 + 2 - localPlayer.anInt1611
          / 32;
      method130(i5, true, aClass50_Sub1_Sub1_Sub1_1036, k2);
    }
    Rasterizer.method449(3, 78, 0xffffff, (byte) -24, 3, 97);
    aClass18_1158.method230();
    Canvas.anIntArray1538 = anIntArray1002;
  }

  @Override
  public URL getCodeBase() {
    if (SignLink.mainapp != null) {
      return SignLink.mainapp.getCodeBase();
    }
    try {
      if (super.aFrame_Sub1_17 != null) {
        return new URL("http://127.0.0.1:" + (80 + portOffset));
      }
    } catch (Exception _ex) {
    }
    return super.getCodeBase();
  }

  public boolean method88(int i, int j, byte byte0) {
    boolean flag = false;
    Widget class13 = Widget.getWidget(j);
    for (int element : class13.anIntArray258) {
      if (element == -1) {
        break;
      }
      Widget class13_1 = Widget.getWidget(element);
      if (class13_1.anInt236 == 0) {
        flag |= method88(i, class13_1.anInt215, (byte) 5);
      }
      if (class13_1.anInt236 == 6
          && (class13_1.anInt286 != -1 || class13_1.anInt287 != -1)) {
        boolean flag1 = method95(class13_1, -693);
        int i1;
        if (flag1) {
          i1 = class13_1.anInt287;
        } else {
          i1 = class13_1.anInt286;
        }
        if (i1 != -1) {
          AnimationSequence class14 = AnimationSequence.animationSequences[i1];
          for (class13_1.anInt227 += i; class13_1.anInt227 > class14
              .method205(0, class13_1.anInt235); ) {
            class13_1.anInt227 -= class14.method205(0,
                class13_1.anInt235);
            class13_1.anInt235++;
            if (class13_1.anInt235 >= class14.anInt294) {
              class13_1.anInt235 -= class14.anInt298;
              if (class13_1.anInt235 < 0
                  || class13_1.anInt235 >= class14.anInt294) {
                class13_1.anInt235 = 0;
              }
            }
            flag = true;
          }

        }
      }
      if (class13_1.anInt236 == 6 && class13_1.anInt218 != 0) {
        int l = class13_1.anInt218 >> 16;
        int j1 = class13_1.anInt218 << 16 >> 16;
        l *= i;
        j1 *= i;
        class13_1.anInt252 = class13_1.anInt252 + l & 0x7ff;
        class13_1.anInt253 = class13_1.anInt253 + j1 & 0x7ff;
        flag = true;
      }
    }

    if (byte0 == 5) {
      byte0 = 0;
    } else {
      anInt1236 = -424;
    }
    return flag;
  }

  public String method89(int i, int j) {
    if (j < 8 || j > 8) {
      throw new NullPointerException();
    }
    if (i < 0x3b9ac9ff) {
      return String.valueOf(i);
    } else {
      return "*";
    }
  }

  public void method90(int i, long l) {
    try {
      if (i != -916) {
        incomingPacketOpcode = buffer.readUByte();
      }
      if (l == 0L) {
        return;
      }
      if (anInt855 >= 100) {
        addChatMessage("", "Your ignore list is full. Max of 100 hit",
            0);
        return;
      }
      String s = TextUtils.method303(TextUtils.decodeBase37(l));
      for (int j = 0; j < anInt855; j++) {
        if (aLongArray1073[j] == l) {
          addChatMessage("", s + " is already on your ignore list", 0);
          return;
        }
      }

      for (int k = 0; k < anInt859; k++) {
        if (aLongArray1130[k] == l) {
          addChatMessage("", "Please remove " + s
              + " from your friend list first", 0);
          return;
        }
      }

      aLongArray1073[anInt855++] = l;
      aBoolean1181 = true;
      outgoingBuffer.writeByteIsaac(217);
      outgoingBuffer.writeLong(l);
      return;
    } catch (RuntimeException runtimeexception) {
      SignLink.reporterror("27939, " + i + ", " + l + ", "
          + runtimeexception);
    }
    throw new RuntimeException();
  }

  @Override
  public void method7(byte byte0) {
    if (aBoolean1016 || aBoolean1283 || aBoolean1097) {
      return;
    }
    anInt1325++;
    if (byte0 != -111) {
      return;
    }
    if (!aBoolean1137) {
      method149(-724);
    } else {
      method28((byte) 4);
    }
    method77(false);
  }

  public void method91(int i) {
    if (anInt1113 != 0) {
      return;
    }
    aStringArray1184[0] = "Cancel";
    anIntArray981[0] = 1016;
    anInt1183 = 1;
    if (i >= 0) {
      anInt1004 = encryption.nextKey();
    }
    if (anInt1053 != -1) {
      anInt915 = 0;
      anInt1315 = 0;
      method66(0, Widget.getWidget(anInt1053), 0, 0, 0, super.anInt22,
          23658, super.anInt23);
      if (anInt915 != anInt1302) {
        anInt1302 = anInt915;
      }
      if (anInt1315 != anInt1129) {
        anInt1129 = anInt1315;
      }
      return;
    }
    method111(anInt1178);
    anInt915 = 0;
    anInt1315 = 0;
    if (super.anInt22 > 4 && super.anInt23 > 4 && super.anInt22 < 516
        && super.anInt23 < 338) {
      if (anInt1169 != -1) {
        method66(4, Widget.getWidget(anInt1169), 0, 0, 4,
            super.anInt22, 23658, super.anInt23);
      } else {
        method43((byte) 7);
      }
    }
    if (anInt915 != anInt1302) {
      anInt1302 = anInt915;
    }
    if (anInt1315 != anInt1129) {
      anInt1129 = anInt1315;
    }
    anInt915 = 0;
    anInt1315 = 0;
    if (super.anInt22 > 553 && super.anInt23 > 205 && super.anInt22 < 743
        && super.anInt23 < 466) {
      if (anInt1089 != -1) {
        method66(205, Widget.getWidget(anInt1089), 1, 0, 553,
            super.anInt22, 23658, super.anInt23);
      } else if (anIntArray1081[anInt1285] != -1) {
        method66(205, Widget.getWidget(anIntArray1081[anInt1285]), 1,
            0, 553, super.anInt22, 23658, super.anInt23);
      }
    }
    if (anInt915 != anInt1280) {
      aBoolean1181 = true;
      anInt1280 = anInt915;
    }
    if (anInt1315 != anInt1044) {
      aBoolean1181 = true;
      anInt1044 = anInt1315;
    }
    anInt915 = 0;
    anInt1315 = 0;
    if (super.anInt22 > 17 && super.anInt23 > 357 && super.anInt22 < 496
        && super.anInt23 < 453) {
      if (anInt988 != -1) {
        method66(357, Widget.getWidget(anInt988), 2, 0, 17,
            super.anInt22, 23658, super.anInt23);
      } else if (anInt1191 != -1) {
        method66(357, Widget.getWidget(anInt1191), 3, 0, 17,
            super.anInt22, 23658, super.anInt23);
      } else if (super.anInt23 < 434 && super.anInt22 < 426
          && anInt1244 == 0) {
        method113(466, super.anInt22 - 17, super.anInt23 - 357);
      }
    }
    if ((anInt988 != -1 || anInt1191 != -1) && anInt915 != anInt1106) {
      aBoolean1240 = true;
      anInt1106 = anInt915;
    }
    if ((anInt988 != -1 || anInt1191 != -1) && anInt1315 != anInt1284) {
      aBoolean1240 = true;
      anInt1284 = anInt1315;
    }
    for (boolean flag = false; !flag; ) {
      flag = true;
      for (int j = 0; j < anInt1183 - 1; j++) {
        if (anIntArray981[j] < 1000 && anIntArray981[j + 1] > 1000) {
          String s = aStringArray1184[j];
          aStringArray1184[j] = aStringArray1184[j + 1];
          aStringArray1184[j + 1] = s;
          int k = anIntArray981[j];
          anIntArray981[j] = anIntArray981[j + 1];
          anIntArray981[j + 1] = k;
          k = anIntArray979[j];
          anIntArray979[j] = anIntArray979[j + 1];
          anIntArray979[j + 1] = k;
          k = anIntArray980[j];
          anIntArray980[j] = anIntArray980[j + 1];
          anIntArray980[j + 1] = k;
          k = anIntArray982[j];
          anIntArray982[j] = anIntArray982[j + 1];
          anIntArray982[j + 1] = k;
          flag = false;
        }
      }

    }

  }

  public void method93(int i) {
    try {
      anInt1276 = -1;
      aClass6_1210.method162();
      aClass6_1282.method162();
      Canvas.method495((byte) 71);
      method49(383);
      aClass22_1164.method241((byte) 7);
      System.gc();
      for (int j = 0; j < 4; j++) {
        aClass46Array1260[j].method411();
      }

      for (int i1 = 0; i1 < 4; i1++) {
        for (int l1 = 0; l1 < 104; l1++) {
          for (int k2 = 0; k2 < 104; k2++) {
            aByteArrayArrayArray1125[i1][l1][k2] = 0;
          }

        }

      }

      Region class8 = new Region(anIntArrayArrayArray891, 14290,
          aByteArrayArrayArray1125, 104, 104);
      int l2 = aByteArrayArray838.length;
      outgoingBuffer.writeByteIsaac(40);
      if (!aBoolean1163) {
        for (int j3 = 0; j3 < l2; j3++) {
          int j4 = (anIntArray856[j3] >> 8) * 64 - anInt1040;
          int l5 = (anIntArray856[j3] & 0xff) * 64 - anInt1041;
          byte[] abyte0 = aByteArrayArray838[j3];
          if (abyte0 != null) {
            class8.method174(l5, false, (anInt890 - 6) * 8, j4,
                abyte0, (anInt889 - 6) * 8, aClass46Array1260);
          }
        }

        for (int k4 = 0; k4 < l2; k4++) {
          int i6 = (anIntArray856[k4] >> 8) * 64 - anInt1040;
          int l7 = (anIntArray856[k4] & 0xff) * 64 - anInt1041;
          byte[] abyte2 = aByteArrayArray838[k4];
          if (abyte2 == null && anInt890 < 800) {
            class8.method180(i6, l7, 64, -810, 64);
          }
        }

        outgoingBuffer.writeByteIsaac(40);
        for (int j6 = 0; j6 < l2; j6++) {
          byte[] abyte1 = aByteArrayArray1232[j6];
          if (abyte1 != null) {
            int l8 = (anIntArray856[j6] >> 8) * 64 - anInt1040;
            int k9 = (anIntArray856[j6] & 0xff) * 64 - anInt1041;
            class8.method179(k9, aClass46Array1260, l8, -571,
                aClass22_1164, abyte1);
          }
        }

      }
      if (aBoolean1163) {
        for (int k3 = 0; k3 < 4; k3++) {
          for (int l4 = 0; l4 < 13; l4++) {
            for (int k6 = 0; k6 < 13; k6++) {
              boolean flag = false;
              int i9 = anIntArrayArrayArray879[k3][l4][k6];
              if (i9 != -1) {
                int l9 = i9 >> 24 & 3;
                int j10 = i9 >> 1 & 3;
                int l10 = i9 >> 14 & 0x3ff;
                int j11 = i9 >> 3 & 0x7ff;
                int l11 = (l10 / 8 << 8) + j11 / 8;
                for (int j12 = 0; j12 < anIntArray856.length; j12++) {
                  if (anIntArray856[j12] != l11
                      || aByteArrayArray838[j12] == null) {
                    continue;
                  }
                  class8.method168(j10, (j11 & 7) * 8, false,
                      aByteArrayArray838[j12], k3, l9,
                      l4 * 8, aClass46Array1260, k6 * 8,
                      (l10 & 7) * 8);
                  flag = true;
                  break;
                }

              }
              if (!flag) {
                class8.method166(anInt1072, k3, k6 * 8, l4 * 8);
              }
            }

          }

        }

        for (int i5 = 0; i5 < 13; i5++) {
          for (int l6 = 0; l6 < 13; l6++) {
            int i8 = anIntArrayArrayArray879[0][i5][l6];
            if (i8 == -1) {
              class8.method180(i5 * 8, l6 * 8, 8, -810, 8);
            }
          }

        }

        outgoingBuffer.writeByteIsaac(40);
        for (int i7 = 0; i7 < 4; i7++) {
          for (int j8 = 0; j8 < 13; j8++) {
            for (int j9 = 0; j9 < 13; j9++) {
              int i10 = anIntArrayArrayArray879[i7][j8][j9];
              if (i10 != -1) {
                int k10 = i10 >> 24 & 3;
                int i11 = i10 >> 1 & 3;
                int k11 = i10 >> 14 & 0x3ff;
                int i12 = i10 >> 3 & 0x7ff;
                int k12 = (k11 / 8 << 8) + i12 / 8;
                for (int l12 = 0; l12 < anIntArray856.length; l12++) {
                  if (anIntArray856[l12] != k12
                      || aByteArrayArray1232[l12] == null) {
                    continue;
                  }
                  class8.method172(i7, aClass46Array1260,
                      aClass22_1164, false,
                      aByteArrayArray1232[l12], j9 * 8,
                      i11, (k11 & 7) * 8, j8 * 8,
                      (i12 & 7) * 8, k10);
                  break;
                }

              }
            }

          }

        }

      }
      outgoingBuffer.writeByteIsaac(40);
      class8.method167(aClass46Array1260, anInt1318, aClass22_1164);
      if (aClass18_1158 != null) {
        aClass18_1158.method230();
        Canvas.anIntArray1538 = anIntArray1002;
      }
      outgoingBuffer.writeByteIsaac(40);
      int l3 = Region.anInt150;
      if (l3 > anInt1091) {
        l3 = anInt1091;
      }
      if (l3 < anInt1091 - 1) {
        l3 = anInt1091 - 1;
      }
      if (lowMemory) {
        aClass22_1164.method242(Region.anInt150, true);
      } else {
        aClass22_1164.method242(0, true);
      }
      for (int j5 = 0; j5 < 104; j5++) {
        for (int j7 = 0; j7 < 104; j7++) {
          method26(j5, j7);
        }

      }

      method18((byte) 3);
    } catch (Exception exception) {
    }
    GameObjectDefinition.aClass33_779.method347();
    if (super.aFrame_Sub1_17 != null) {
      outgoingBuffer.writeByteIsaac(78);
      outgoingBuffer.writeInt(0x3f008edd);
    }
    if (lowMemory && SignLink.cache_dat != null) {
      int k = requester.method340(0, -31140);
      for (int j1 = 0; j1 < k; j1++) {
        int i2 = requester.method325(j1, -493);
        if ((i2 & 0x79) == 0) {
          Model.method576(j1, 1);
        }
      }

    }
    System.gc();
    Canvas.method496((byte) 7, 20);
    requester.method336((byte) -125);
    int l = (anInt889 - 6) / 8 - 1;
    int k1 = (anInt889 + 6) / 8 + 1;
    int j2 = (anInt890 - 6) / 8 - 1;
    int i3 = (anInt890 + 6) / 8 + 1;
    i = 94 / i;
    if (aBoolean1067) {
      l = 49;
      k1 = 50;
      j2 = 49;
      i3 = 50;
    }
    for (int i4 = l; i4 <= k1; i4++) {
      for (int k5 = j2; k5 <= i3; k5++) {
        if (i4 == l || i4 == k1 || k5 == j2 || k5 == i3) {
          int k7 = requester.method344(0, i4, k5, 0);
          if (k7 != -1) {
            requester.method337(k7, 3, aByte936);
          }
          int k8 = requester.method344(0, i4, k5, 1);
          if (k8 != -1) {
            requester.method337(k8, 3, aByte936);
          }
        }
      }

    }

  }

  public void method94(int i, int j, int k, int l, int i1, int j1, byte byte0) {
    int k1 = 2048 - k & 0x7ff;
    int l1 = 2048 - i1 & 0x7ff;
    if (byte0 != -103) {
      incomingPacketOpcode = -1;
    }
    int i2 = 0;
    int j2 = 0;
    int k2 = l;
    if (k1 != 0) {
      int l2 = Model.anIntArray1710[k1];
      int j3 = Model.anIntArray1711[k1];
      int l3 = j2 * j3 - k2 * l2 >> 16;
      k2 = j2 * l2 + k2 * j3 >> 16;
      j2 = l3;
    }
    if (l1 != 0) {
      int i3 = Model.anIntArray1710[l1];
      int k3 = Model.anIntArray1711[l1];
      int i4 = k2 * i3 + i2 * k3 >> 16;
      k2 = k2 * k3 - i2 * i3 >> 16;
      i2 = i4;
    }
    anInt1216 = j - i2;
    anInt1217 = i - j2;
    anInt1218 = j1 - k2;
    anInt1219 = k;
    anInt1220 = i1;
  }

  public boolean method95(Widget class13, int i) {
    if (i >= 0) {
      anInt1175 = 276;
    }
    if (class13.anIntArray273 == null) {
      return false;
    }
    for (int j = 0; j < class13.anIntArray273.length; j++) {
      int k = method129(3, j, class13);
      int l = class13.anIntArray256[j];
      if (class13.anIntArray273[j] == 2) {
        if (k >= l) {
          return false;
        }
      } else if (class13.anIntArray273[j] == 3) {
        if (k <= l) {
          return false;
        }
      } else if (class13.anIntArray273[j] == 4) {
        if (k == l) {
          return false;
        }
      } else if (k != l) {
        return false;
      }
    }

    return true;
  }

  public void method96(int i, int j, Buffer class50_sub1_sub2) {
    anInt1294 = 0;
    anInt973 = 0;
    method41(i, aBoolean1274, class50_sub1_sub2);
    method114(i, -138, class50_sub1_sub2);
    j = 40 / j;
    method16(i, (byte) 6, class50_sub1_sub2);
    method40(808, class50_sub1_sub2, i);
    for (int k = 0; k < anInt1294; k++) {
      int l = anIntArray1295[k];
      if (activePlayers[l].anInt1585 != anInt1325) {
        activePlayers[l] = null;
      }
    }

    if (class50_sub1_sub2.offset != i) {
      SignLink.reporterror("Error packet size mismatch in getplayer pos:"
          + class50_sub1_sub2.offset + " psize:" + i);
      throw new RuntimeException("eek");
    }
    for (int i1 = 0; i1 < anInt971; i1++) {
      if (activePlayers[anIntArray972[i1]] == null) {
        SignLink.reporterror(aString1092
            + " null entry in pl list - pos:" + i1 + " size:"
            + anInt971);
        throw new RuntimeException("eek");
      }
    }

  }

  public void method97(int i, long l) {
    try {
      if (l == 0L) {
        return;
      }
      for (int j = 0; j < anInt855; j++) {
        if (aLongArray1073[j] != l) {
          continue;
        }
        anInt855--;
        aBoolean1181 = true;
        for (int k = j; k < anInt855; k++) {
          aLongArray1073[k] = aLongArray1073[k + 1];
        }

        outgoingBuffer.writeByteIsaac(160);
        outgoingBuffer.writeLong(l);
        break;
      }

      i = 42 / i;
      return;
    } catch (RuntimeException runtimeexception) {
      SignLink.reporterror("45745, " + i + ", " + l + ", "
          + runtimeexception);
    }
    throw new RuntimeException();
  }

  @Override
  public String getParameter(String s) {
    if (SignLink.mainapp != null) {
      return SignLink.mainapp.getParameter(s);
    } else {
      return super.getParameter(s);
    }
  }

  public void method98(int i) {
    char c = '\u0100';
    if (anInt1047 > 0) {
      for (int j = 0; j < 256; j++) {
        if (anInt1047 > 768) {
          anIntArray1310[j] = method106(anIntArray1311[j],
              anIntArray1312[j], 1024 - anInt1047, 8);
        } else if (anInt1047 > 256) {
          anIntArray1310[j] = anIntArray1312[j];
        } else {
          anIntArray1310[j] = method106(anIntArray1312[j],
              anIntArray1311[j], 256 - anInt1047, 8);
        }
      }

    } else if (anInt1048 > 0) {
      for (int k = 0; k < 256; k++) {
        if (anInt1048 > 768) {
          anIntArray1310[k] = method106(anIntArray1311[k],
              anIntArray1313[k], 1024 - anInt1048, 8);
        } else if (anInt1048 > 256) {
          anIntArray1310[k] = anIntArray1313[k];
        } else {
          anIntArray1310[k] = method106(anIntArray1313[k],
              anIntArray1311[k], 256 - anInt1048, 8);
        }
      }

    } else {
			System.arraycopy(anIntArray1311, 0, anIntArray1310, 0, 256);

    }
		System.arraycopy(aClass50_Sub1_Sub1_Sub1_1017.anIntArray1489, 0, aClass18_1201.pixels, 0,
				33920);

    int j1 = 0;
    int k1 = 1152;
    for (int l1 = 1; l1 < c - 1; l1++) {
      int i2 = anIntArray1166[l1] * (c - l1) / c;
      int k2 = 22 + i2;
      if (k2 < 0) {
        k2 = 0;
      }
      j1 += k2;
      for (int i3 = k2; i3 < 128; i3++) {
        int k3 = anIntArray1084[j1++];
        if (k3 != 0) {
          int i4 = k3;
          int k4 = 256 - k3;
          k3 = anIntArray1310[k3];
          int i5 = aClass18_1201.pixels[k1];
          aClass18_1201.pixels[k1++] = ((k3 & 0xff00ff) * i4
              + (i5 & 0xff00ff) * k4 & 0xff00ff00)
              + ((k3 & 0xff00) * i4 + (i5 & 0xff00) * k4 & 0xff0000) >> 8;
        } else {
          k1++;
        }
      }

      k1 += k2;
    }

    aClass18_1201.method231(0, 0, super.aGraphics14, aBoolean1074);
    i = 66 / i;
		System.arraycopy(aClass50_Sub1_Sub1_Sub1_1018.anIntArray1489, 0, aClass18_1202.pixels, 0,
				33920);

    j1 = 0;
    k1 = 1176;
    for (int l2 = 1; l2 < c - 1; l2++) {
      int j3 = anIntArray1166[l2] * (c - l2) / c;
      int l3 = 103 - j3;
      k1 += j3;
      for (int j4 = 0; j4 < l3; j4++) {
        int l4 = anIntArray1084[j1++];
        if (l4 != 0) {
          int j5 = l4;
          int k5 = 256 - l4;
          l4 = anIntArray1310[l4];
          int l5 = aClass18_1202.pixels[k1];
          aClass18_1202.pixels[k1++] = ((l4 & 0xff00ff) * j5
              + (l5 & 0xff00ff) * k5 & 0xff00ff00)
              + ((l4 & 0xff00) * j5 + (l5 & 0xff00) * k5 & 0xff0000) >> 8;
        } else {
          k1++;
        }
      }

      j1 += 128 - l3;
      k1 += 128 - l3 - j3;
    }

    aClass18_1202.method231(0, 637, super.aGraphics14, aBoolean1074);
  }

  public void updateMusicVolume(boolean flag, byte byte0, int i) {
    if (byte0 != 8) {
      outgoingBuffer.writeByte(49);
    }
    SignLink.midivol = i;
    if (flag) {
      SignLink.midi = "voladjust";
    }
  }

  public void method100(int i) {
    for (int j = -1; j < anInt971; j++) {
      int k;
      if (j == -1) {
        k = anInt969;
      } else {
        k = anIntArray972[j];
      }
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[k];
      if (class50_sub1_sub4_sub3_sub2 != null) {
        method68(1, (byte) -97, class50_sub1_sub4_sub3_sub2);
      }
    }

    if (i < anInt1222 || i > anInt1222) {
      for (int l = 1; l > 0; l++) {
			}
    }
  }

  public void method102(long l, int i) {
    try {
      if (l == 0L) {
        return;
      }
      if (anInt859 >= 100 && anInt1068 != 1) {
        addChatMessage(
            "",
            "Your friendlist is full. Max of 100 for free users, and 200 for members",
            0);
        return;
      }
      if (anInt859 >= 200) {
        addChatMessage(
            "",
            "Your friendlist is full. Max of 100 for free users, and 200 for members",
            0);
        return;
      }
      String s = TextUtils.method303(TextUtils.decodeBase37(l));
      for (int j = 0; j < anInt859; j++) {
        if (aLongArray1130[j] == l) {
          addChatMessage("", s + " is already on your friend list", 0);
          return;
        }
      }

      for (int k = 0; k < anInt855; k++) {
        if (aLongArray1073[k] == l) {
          addChatMessage("", "Please remove " + s
              + " from your ignore list first", 0);
          return;
        }
      }

      if (s.equals(localPlayer.name)) {
        return;
      }
      aStringArray849[anInt859] = s;
      if (i != -45229) {
        anInt1178 = -30;
      }
      aLongArray1130[anInt859] = l;
      anIntArray1267[anInt859] = 0;
      anInt859++;
      aBoolean1181 = true;
      outgoingBuffer.writeByteIsaac(120);
      outgoingBuffer.writeLong(l);
      return;
    } catch (RuntimeException runtimeexception) {
      SignLink.reporterror("94629, " + l + ", " + i + ", "
          + runtimeexception);
    }
    throw new RuntimeException();
  }

  public void method103(byte byte0, Widget class13) {
    if (byte0 == 2) {
      byte0 = 0;
    } else {
      anInt1004 = -82;
    }
    int i = class13.anInt242;
    if (i >= 1 && i <= 100 || i >= 701 && i <= 800) {
      if (i == 1 && anInt860 == 0) {
        class13.aString230 = "Loading friend list";
        class13.anInt289 = 0;
        return;
      }
      if (i == 1 && anInt860 == 1) {
        class13.aString230 = "Connecting to friendserver";
        class13.anInt289 = 0;
        return;
      }
      if (i == 2 && anInt860 != 2) {
        class13.aString230 = "Please wait...";
        class13.anInt289 = 0;
        return;
      }
      int j = anInt859;
      if (anInt860 != 2) {
        j = 0;
      }
      if (i > 700) {
        i -= 601;
      } else {
        i--;
      }
      if (i >= j) {
        class13.aString230 = "";
        class13.anInt289 = 0;
        return;
      } else {
        class13.aString230 = aStringArray849[i];
        class13.anInt289 = 1;
        return;
      }
    }
    if (i >= 101 && i <= 200 || i >= 801 && i <= 900) {
      int k = anInt859;
      if (anInt860 != 2) {
        k = 0;
      }
      if (i > 800) {
        i -= 701;
      } else {
        i -= 101;
      }
      if (i >= k) {
        class13.aString230 = "";
        class13.anInt289 = 0;
        return;
      }
      if (anIntArray1267[i] == 0) {
        class13.aString230 = "@red@Offline";
      } else if (anIntArray1267[i] < 200) {
        if (anIntArray1267[i] == nodeId) {
          class13.aString230 = "@gre@World" + (anIntArray1267[i] - 9);
        } else {
          class13.aString230 = "@yel@World" + (anIntArray1267[i] - 9);
        }
      } else if (anIntArray1267[i] == nodeId) {
        class13.aString230 = "@gre@Classic" + (anIntArray1267[i] - 219);
      } else {
        class13.aString230 = "@yel@Classic" + (anIntArray1267[i] - 219);
      }
      class13.anInt289 = 1;
      return;
    }
    if (i == 203) {
      int l = anInt859;
      if (anInt860 != 2) {
        l = 0;
      }
      class13.anInt285 = l * 15 + 20;
      if (class13.anInt285 <= class13.anInt238) {
        class13.anInt285 = class13.anInt238 + 1;
      }
      return;
    }
    if (i >= 401 && i <= 500) {
      if ((i -= 401) == 0 && anInt860 == 0) {
        class13.aString230 = "Loading ignore list";
        class13.anInt289 = 0;
        return;
      }
      if (i == 1 && anInt860 == 0) {
        class13.aString230 = "Please wait...";
        class13.anInt289 = 0;
        return;
      }
      int i1 = anInt855;
      if (anInt860 == 0) {
        i1 = 0;
      }
      if (i >= i1) {
        class13.aString230 = "";
        class13.anInt289 = 0;
        return;
      } else {
        class13.aString230 = TextUtils.method303(TextUtils
            .decodeBase37(aLongArray1073[i]));
        class13.anInt289 = 1;
        return;
      }
    }
    if (i == 503) {
      class13.anInt285 = anInt855 * 15 + 20;
      if (class13.anInt285 <= class13.anInt238) {
        class13.anInt285 = class13.anInt238 + 1;
      }
      return;
    }
    if (i == 327) {
      class13.anInt252 = 150;
      class13.anInt253 = (int) (Math.sin((double) anInt1325 / 40D) * 256D) & 0x7ff;
      if (aBoolean1277) {
        for (int j1 = 0; j1 < 7; j1++) {
          int i2 = anIntArray1326[j1];
          if (i2 >= 0 && !Class48.aClass48Array815[i2].method436(256)) {
            return;
          }
        }

        aBoolean1277 = false;
        Model[] aclass50_sub1_sub4_sub4 = new Model[7];
        int j2 = 0;
        for (int k2 = 0; k2 < 7; k2++) {
          int l2 = anIntArray1326[k2];
          if (l2 >= 0) {
            aclass50_sub1_sub4_sub4[j2++] = Class48.aClass48Array815[l2]
                .method437((byte) 2);
          }
        }

        Model class50_sub1_sub4_sub4 = new Model(j2,
            aclass50_sub1_sub4_sub4, (byte) -89);
        for (int i3 = 0; i3 < 5; i3++) {
          if (anIntArray1099[i3] != 0) {
            class50_sub1_sub4_sub4.method591(
                anIntArrayArray1008[i3][0],
                anIntArrayArray1008[i3][anIntArray1099[i3]]);
            if (i3 == 1) {
              class50_sub1_sub4_sub4.method591(anIntArray1268[0],
                  anIntArray1268[anIntArray1099[i3]]);
            }
          }
        }

        class50_sub1_sub4_sub4.createBones();
        class50_sub1_sub4_sub4
            .transform(
                AnimationSequence.animationSequences[localPlayer.anInt1634].anIntArray295[0]);
        class50_sub1_sub4_sub4.lighten(64, 850, -30, -50, -30, true);
        class13.anInt283 = 5;
        class13.anInt284 = 0;
        Widget.method201(5, class50_sub1_sub4_sub4, 0);
      }
      return;
    }
    if (i == 324) {
      if (aClass50_Sub1_Sub1_Sub1_1102 == null) {
        aClass50_Sub1_Sub1_Sub1_1102 = class13.aClass50_Sub1_Sub1_Sub1_212;
        aClass50_Sub1_Sub1_Sub1_1103 = class13.aClass50_Sub1_Sub1_Sub1_245;
      }
      if (aBoolean1144) {
        class13.aClass50_Sub1_Sub1_Sub1_212 = aClass50_Sub1_Sub1_Sub1_1103;
        return;
      } else {
        class13.aClass50_Sub1_Sub1_Sub1_212 = aClass50_Sub1_Sub1_Sub1_1102;
        return;
      }
    }
    if (i == 325) {
      if (aClass50_Sub1_Sub1_Sub1_1102 == null) {
        aClass50_Sub1_Sub1_Sub1_1102 = class13.aClass50_Sub1_Sub1_Sub1_212;
        aClass50_Sub1_Sub1_Sub1_1103 = class13.aClass50_Sub1_Sub1_Sub1_245;
      }
      if (aBoolean1144) {
        class13.aClass50_Sub1_Sub1_Sub1_212 = aClass50_Sub1_Sub1_Sub1_1102;
        return;
      } else {
        class13.aClass50_Sub1_Sub1_Sub1_212 = aClass50_Sub1_Sub1_Sub1_1103;
        return;
      }
    }
    if (i == 600) {
      class13.aString230 = aString839;
      if (anInt1325 % 20 < 10) {
        class13.aString230 += "|";
        return;
      } else {
        class13.aString230 += " ";
        return;
      }
    }
    if (i == 620) {
      if (anInt867 >= 1) {
        if (aBoolean1098) {
          class13.anInt240 = 0xff0000;
          class13.aString230 = "Moderator option: Mute player for 48 hours: <ON>";
        } else {
          class13.anInt240 = 0xffffff;
          class13.aString230 = "Moderator option: Mute player for 48 hours: <OFF>";
        }
      } else {
        class13.aString230 = "";
      }
    }
    if (i == 660) {
      int k1 = anInt1170 - anInt1215;
      String s1;
      if (k1 <= 0) {
        s1 = "earlier today";
      } else if (k1 == 1) {
        s1 = "yesterday";
      } else {
        s1 = k1 + " days ago";
      }
      class13.aString230 = "You last logged in @red@" + s1
          + "@bla@ from: @red@" + SignLink.dns;
    }
    if (i == 661) {
      if (anInt1034 == 0) {
        class13.aString230 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
      } else if (anInt1034 <= anInt1170) {
        class13.aString230 = "\\n\\nRecovery Questions Last Set:\\n@gre@"
            + method104(anInt1034, (byte) 83);
      } else {
        int l1 = anInt1170 + 14 - anInt1034;
        String s2;
        if (l1 <= 0) {
          s2 = "Earlier today";
        } else if (l1 == 1) {
          s2 = "Yesterday";
        } else {
          s2 = l1 + " days ago";
        }
        class13.aString230 = s2
            + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@"
            + method104(anInt1034, (byte) 83)
            + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
      }
    }
    if (i == 662) {
      String s;
      if (anInt1273 == 0) {
        s = "@yel@0 unread messages";
      } else if (anInt1273 == 1) {
        s = "@gre@1 unread message";
      } else {
        s = "@gre@" + anInt1273 + " unread messages";
      }
      class13.aString230 = "You have " + s + "\\nin your message centre.";
    }
    if (i == 663) {
      if (anInt1083 <= 0 || anInt1083 > anInt1170 + 10) {
        class13.aString230 = "Last password change:\\n@gre@Never changed";
      } else {
        class13.aString230 = "Last password change:\\n@gre@"
            + method104(anInt1083, (byte) 83);
      }
    }
    if (i == 665) {
      if (anInt992 > 2 && !membersServer) {
        class13.aString230 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
      } else if (anInt992 > 2) {
        class13.aString230 = "\\n\\nYou have @gre@" + anInt992
            + "@yel@ days of\\nmember credit remaining.";
      } else if (anInt992 > 0) {
        class13.aString230 = "You have @gre@"
            + anInt992
            + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
      } else {
        class13.aString230 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
      }
    }
    if (i == 667) {
      if (anInt992 > 2 && !membersServer) {
        class13.aString230 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
      } else if (anInt992 > 0) {
        class13.aString230 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
      } else {
        class13.aString230 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
      }
    }
    if (i == 668) {
      if (anInt1034 > anInt1170) {
        class13.aString230 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
        return;
      }
      class13.aString230 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
    }
  }

  public String method104(int i, byte byte0) {
    if (byte0 != 83) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (i > anInt1170 + 10) {
      return "Unknown";
    } else {
      long l = ((long) i + 11745L) * 0x5265c00L;
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(new Date(l));
      int j = calendar.get(5);
      int k = calendar.get(2);
      int i1 = calendar.get(1);
      String[] as = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
          "Aug", "Sep", "Oct", "Nov", "Dec"};
      return j + "-" + as[k] + "-" + i1;
    }
  }

  public void updateSettings(int i, int j) {
    anInt869 += i;
    int k = Varp.aClass43Array704[j].anInt712;
    if (k == 0) {
      return;
    }
    int l = anIntArray1039[j];
    if (k == 1) {
      if (l == 1) {
        Canvas
            .updateBrightness(0.90000000000000002D, (byte) 6);
      }
      if (l == 2) {
        Canvas
            .updateBrightness(0.80000000000000004D, (byte) 6);
      }
      if (l == 3) {
        Canvas
            .updateBrightness(0.69999999999999996D, (byte) 6);
      }
      if (l == 4) {
        Canvas
            .updateBrightness(0.59999999999999998D, (byte) 6);
      }
      ItemDefinition.aClass33_346.method347();
      aBoolean1046 = true;
    }
    if (k == 3) {
      boolean flag = musicEnabled;
      if (l == 0) {
        updateMusicVolume(musicEnabled, (byte) 8, 0);
        musicEnabled = true;
      }
      if (l == 1) {
        updateMusicVolume(musicEnabled, (byte) 8, -400);
        musicEnabled = true;
      }
      if (l == 2) {
        updateMusicVolume(musicEnabled, (byte) 8, -800);
        musicEnabled = true;
      }
      if (l == 3) {
        updateMusicVolume(musicEnabled, (byte) 8, -1200);
        musicEnabled = true;
      }
      if (l == 4) {
        musicEnabled = false;
      }
      if (musicEnabled != flag && !lowMemory) {
        if (musicEnabled) {
          nextSong = currentSong;
          songChanging = true;
          requester.request(2, nextSong);
        } else {
          stopMusic(false);
        }
        previousSong = 0;
      }
    }
    if (k == 4) {
      if (l == 0) {
        soundEffectsVolume = true;
        updateSoundEffectsVolume(822, 0);
      }
      if (l == 1) {
        soundEffectsVolume = true;
        updateSoundEffectsVolume(822, -400);
      }
      if (l == 2) {
        soundEffectsVolume = true;
        updateSoundEffectsVolume(822, -800);
      }
      if (l == 3) {
        soundEffectsVolume = true;
        updateSoundEffectsVolume(822, -1200);
      }
      if (l == 4) {
        soundEffectsVolume = false;
      }
    }
    if (k == 5) {
      anInt1300 = l;
    }
    if (k == 6) {
      anInt998 = l;
    }
    if (k == 8) {
      anInt1223 = l;
      aBoolean1240 = true;
    }
    if (k == 9) {
      anInt955 = l;
    }
  }

  public int method106(int i, int j, int k, int l) {
    if (l < 8 || l > 8) {
      outgoingBuffer.writeByte(235);
    }
    int i1 = 256 - k;
    return ((i & 0xff00ff) * i1 + (j & 0xff00ff) * k & 0xff00ff00)
        + ((i & 0xff00) * i1 + (j & 0xff00) * k & 0xff0000) >> 8;
  }

  public void method107(int i) {
    anInt1246 = 0;
    int j = (localPlayer.anInt1610 >> 7) + anInt1040;
    int k;
    for (k = (localPlayer.anInt1611 >> 7) + anInt1041; i >= 0; ) {
      return;
    }

    if (j >= 3053 && j <= 3156 && k >= 3056 && k <= 3136) {
      anInt1246 = 1;
    }
    if (j >= 3072 && j <= 3118 && k >= 9492 && k <= 9535) {
      anInt1246 = 1;
    }
    if (anInt1246 == 1 && j >= 3139 && j <= 3199 && k >= 3008 && k <= 3062) {
      anInt1246 = 0;
    }
  }

  public void method108(int i) {
    int j = aClass50_Sub1_Sub1_Sub2_1061.method472((byte) 35,
        "Choose Option");
    for (int k = 0; k < anInt1183; k++) {
      int l = aClass50_Sub1_Sub1_Sub2_1061.method472((byte) 35,
          aStringArray1184[k]);
      if (l > j) {
        j = l;
      }
    }

    j += 8;
    if (i <= 0) {
      aBoolean1190 = !aBoolean1190;
    }
    int i1 = 15 * anInt1183 + 21;
    if (super.anInt29 > 4 && super.anInt30 > 4 && super.anInt29 < 516
        && super.anInt30 < 338) {
      int j1 = super.anInt29 - 4 - j / 2;
      if (j1 + j > 512) {
        j1 = 512 - j;
      }
      if (j1 < 0) {
        j1 = 0;
      }
      int i2 = super.anInt30 - 4;
      if (i2 + i1 > 334) {
        i2 = 334 - i1;
      }
      if (i2 < 0) {
        i2 = 0;
      }
      aBoolean1065 = true;
      anInt1304 = 0;
      anInt1305 = j1;
      anInt1306 = i2;
      anInt1307 = j;
      anInt1308 = 15 * anInt1183 + 22;
    }
    if (super.anInt29 > 553 && super.anInt30 > 205 && super.anInt29 < 743
        && super.anInt30 < 466) {
      int k1 = super.anInt29 - 553 - j / 2;
      if (k1 < 0) {
        k1 = 0;
      } else if (k1 + j > 190) {
        k1 = 190 - j;
      }
      int j2 = super.anInt30 - 205;
      if (j2 < 0) {
        j2 = 0;
      } else if (j2 + i1 > 261) {
        j2 = 261 - i1;
      }
      aBoolean1065 = true;
      anInt1304 = 1;
      anInt1305 = k1;
      anInt1306 = j2;
      anInt1307 = j;
      anInt1308 = 15 * anInt1183 + 22;
    }
    if (super.anInt29 > 17 && super.anInt30 > 357 && super.anInt29 < 496
        && super.anInt30 < 453) {
      int l1 = super.anInt29 - 17 - j / 2;
      if (l1 < 0) {
        l1 = 0;
      } else if (l1 + j > 479) {
        l1 = 479 - j;
      }
      int k2 = super.anInt30 - 357;
      if (k2 < 0) {
        k2 = 0;
      } else if (k2 + i1 > 96) {
        k2 = 96 - i1;
      }
      aBoolean1065 = true;
      anInt1304 = 2;
      anInt1305 = l1;
      anInt1306 = k2;
      anInt1307 = j;
      anInt1308 = 15 * anInt1183 + 22;
    }
  }

  public void method109(int i) {
    if (i != 30729) {
      anInt1056 = encryption.nextKey();
    }
    method75(0);
    if (anInt1023 == 1) {
      aClass50_Sub1_Sub1_Sub1Array896[anInt1022 / 100].method461(
          anInt1021 - 8 - 4, anInt1020 - 8 - 4, -488);
    }
    if (anInt1023 == 2) {
      aClass50_Sub1_Sub1_Sub1Array896[4 + anInt1022 / 100].method461(
          anInt1021 - 8 - 4, anInt1020 - 8 - 4, -488);
    }
    if (anInt1279 != -1) {
      method88(anInt951, anInt1279, (byte) 5);
      method142(0, 0, Widget.getWidget(anInt1279), 0, 8);
    }
    if (anInt1169 != -1) {
      method88(anInt951, anInt1169, (byte) 5);
      method142(0, 0, Widget.getWidget(anInt1169), 0, 8);
    }
    method107(-7);
    if (!aBoolean1065) {
      method91(-521);
      method34((byte) -79);
    } else if (anInt1304 == 0) {
      method128(false);
    }
    if (anInt1319 == 1) {
      aClass50_Sub1_Sub1_Sub1_1086.method461(296, 472, -488);
    }
    if (aBoolean868) {
      char c = '\u01FB';
      int k = 20;
      int i1 = 0xffff00;
      if (super.anInt10 < 30 && lowMemory) {
        i1 = 0xff0000;
      }
      if (super.anInt10 < 20 && !lowMemory) {
        i1 = 0xff0000;
      }
      aClass50_Sub1_Sub1_Sub2_1060.method469(true,
          "Fps:" + super.anInt10, i1, c, k);
      k += 15;
      Runtime runtime = Runtime.getRuntime();
      int j1 = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
      i1 = 0xffff00;
      if (j1 > 0x2000000 && lowMemory) {
        i1 = 0xff0000;
      }
      if (j1 > 0x4000000 && !lowMemory) {
        i1 = 0xff0000;
      }
      aClass50_Sub1_Sub1_Sub2_1060.method469(true, "Mem:" + j1 + "k",
          0xffff00, c, k);
      k += 15;
    }
    if (anInt1057 != 0) {
      int j = anInt1057 / 50;
      int l = j / 60;
      j %= 60;
      if (j < 10) {
        aClass50_Sub1_Sub1_Sub2_1060.method474(2245, 4, 0xffff00, 329,
            "System update in: " + l + ":0" + j);
      } else {
        aClass50_Sub1_Sub1_Sub2_1060.method474(2245, 4, 0xffff00, 329,
            "System update in: " + l + ":" + j);
      }
      anInt895++;
      if (anInt895 > 112) {
        anInt895 = 0;
        outgoingBuffer.writeByteIsaac(197);
        outgoingBuffer.writeInt(0);
      }
    }
  }

  @Override
  public void run() {
    if (aBoolean1314) {
      method17();
		} else {
      super.run();
		}
  }

  public int method110(int i, int j, byte byte0, int k) {
    int l = j >> 7;
    int i1 = i >> 7;
    if (l < 0 || i1 < 0 || l > 103 || i1 > 103) {
      return 0;
    }
    int j1 = k;
    if (j1 < 3 && (aByteArrayArrayArray1125[1][l][i1] & 2) == 2) {
      j1++;
    }
    int k1 = j & 0x7f;
    int l1 = i & 0x7f;
    if (byte0 != 9) {
      aBoolean953 = !aBoolean953;
    }
    int i2 = anIntArrayArrayArray891[j1][l][i1] * (128 - k1)
        + anIntArrayArrayArray891[j1][l + 1][i1] * k1 >> 7;
    int j2 = anIntArrayArrayArray891[j1][l][i1 + 1] * (128 - k1)
        + anIntArrayArrayArray891[j1][l + 1][i1 + 1] * k1 >> 7;
    return i2 * (128 - l1) + j2 * l1 >> 7;
  }

  @Override
  public AppletContext getAppletContext() {
    if (SignLink.mainapp != null) {
      return SignLink.mainapp.getAppletContext();
    } else {
      return super.getAppletContext();
    }
  }

  public void method111(int i) {
    i = 21 / i;
    if (anInt1223 == 0) {
      return;
    }
    int j = 0;
    if (anInt1057 != 0) {
      j = 1;
    }
    for (int k = 0; k < 100; k++) {
      if (aStringArray1298[k] != null) {
        int l = anIntArray1296[k];
        String s = aStringArray1297[k];
        if (s != null && s.startsWith("@cr1@")) {
          s = s.substring(5);
        }
        if (s != null && s.startsWith("@cr2@")) {
          s = s.substring(5);
        }
        if ((l == 3 || l == 7)
            && (l == 7 || anInt887 == 0 || anInt887 == 1
            && method148(13292, s))) {
          int i1 = 329 - j * 13;
          if (super.anInt22 > 4 && super.anInt23 - 4 > i1 - 10
              && super.anInt23 - 4 <= i1 + 3) {
            int j1 = aClass50_Sub1_Sub1_Sub2_1060.method472(
                (byte) 35, "From:  " + s + aStringArray1298[k]) + 25;
            if (j1 > 450) {
              j1 = 450;
            }
            if (super.anInt22 < 4 + j1) {
              if (anInt867 >= 1) {
                aStringArray1184[anInt1183] = "Report abuse @whi@"
                    + s;
                anIntArray981[anInt1183] = 2507;
                anInt1183++;
              }
              aStringArray1184[anInt1183] = "Add ignore @whi@"
                  + s;
              anIntArray981[anInt1183] = 2574;
              anInt1183++;
              aStringArray1184[anInt1183] = "Add friend @whi@"
                  + s;
              anIntArray981[anInt1183] = 2762;
              anInt1183++;
            }
          }
          if (++j >= 5) {
            return;
          }
        }
        if ((l == 5 || l == 6) && anInt887 < 2 && ++j >= 5) {
          return;
        }
      }
    }

  }

  public void method112(byte byte0, int i) {
    if (byte0 != 36) {
      outgoingBuffer.writeByte(6);
    }
    Widget class13 = Widget.getWidget(i);
    for (int element : class13.anIntArray258) {
      if (element == -1) {
        break;
      }
      Widget class13_1 = Widget.getWidget(element);
      if (class13_1.anInt236 == 1) {
        method112((byte) 36, class13_1.anInt215);
      }
      class13_1.anInt235 = 0;
      class13_1.anInt227 = 0;
    }

  }

  public void method113(int i, int j, int k) {
    int l = 0;
    i = 44 / i;
    for (int i1 = 0; i1 < 100; i1++) {
      if (aStringArray1298[i1] == null) {
        continue;
      }
      int j1 = anIntArray1296[i1];
      int k1 = 70 - l * 14 + anInt851 + 4;
      if (k1 < -20) {
        break;
      }
      String s = aStringArray1297[i1];
      if (s != null && s.startsWith("@cr1@")) {
        s = s.substring(5);
      }
      if (s != null && s.startsWith("@cr2@")) {
        s = s.substring(5);
      }
      if (j1 == 0) {
        l++;
      }
      if ((j1 == 1 || j1 == 2)
          && (j1 == 1 || anInt1006 == 0 || anInt1006 == 1
          && method148(13292, s))) {
        if (k > k1 - 14 && k <= k1 && !s.equals(localPlayer.name)) {
          if (anInt867 >= 1) {
            aStringArray1184[anInt1183] = "Report abuse @whi@" + s;
            anIntArray981[anInt1183] = 507;
            anInt1183++;
          }
          aStringArray1184[anInt1183] = "Add ignore @whi@" + s;
          anIntArray981[anInt1183] = 574;
          anInt1183++;
          aStringArray1184[anInt1183] = "Add friend @whi@" + s;
          anIntArray981[anInt1183] = 762;
          anInt1183++;
        }
        l++;
      }
      if ((j1 == 3 || j1 == 7)
          && anInt1223 == 0
          && (j1 == 7 || anInt887 == 0 || anInt887 == 1
          && method148(13292, s))) {
        if (k > k1 - 14 && k <= k1) {
          if (anInt867 >= 1) {
            aStringArray1184[anInt1183] = "Report abuse @whi@" + s;
            anIntArray981[anInt1183] = 507;
            anInt1183++;
          }
          aStringArray1184[anInt1183] = "Add ignore @whi@" + s;
          anIntArray981[anInt1183] = 574;
          anInt1183++;
          aStringArray1184[anInt1183] = "Add friend @whi@" + s;
          anIntArray981[anInt1183] = 762;
          anInt1183++;
        }
        l++;
      }
      if (j1 == 4
          && (anInt1227 == 0 || anInt1227 == 1 && method148(13292, s))) {
        if (k > k1 - 14 && k <= k1) {
          aStringArray1184[anInt1183] = "Accept trade @whi@" + s;
          anIntArray981[anInt1183] = 544;
          anInt1183++;
        }
        l++;
      }
      if ((j1 == 5 || j1 == 6) && anInt1223 == 0 && anInt887 < 2) {
        l++;
      }
      if (j1 == 8
          && (anInt1227 == 0 || anInt1227 == 1 && method148(13292, s))) {
        if (k > k1 - 14 && k <= k1) {
          aStringArray1184[anInt1183] = "Accept challenge @whi@" + s;
          anIntArray981[anInt1183] = 695;
          anInt1183++;
        }
        l++;
      }
    }

  }

  public void method114(int i, int j, Buffer class50_sub1_sub2) {
    int k = class50_sub1_sub2.readBits(8);
    if (k < anInt971) {
      for (int l = k; l < anInt971; l++) {
        anIntArray1295[anInt1294++] = anIntArray972[l];
      }

    }
    if (k > anInt971) {
      SignLink.reporterror(aString1092 + " Too many players");
      throw new RuntimeException("eek");
    }
    anInt971 = 0;
    if (j >= 0) {
      incomingPacketOpcode = -1;
    }
    for (int i1 = 0; i1 < k; i1++) {
      int j1 = anIntArray972[i1];
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[j1];
      int k1 = class50_sub1_sub2.readBits(1);
      if (k1 == 0) {
        anIntArray972[anInt971++] = j1;
        class50_sub1_sub4_sub3_sub2.anInt1585 = anInt1325;
      } else {
        int l1 = class50_sub1_sub2.readBits(2);
        if (l1 == 0) {
          anIntArray972[anInt971++] = j1;
          class50_sub1_sub4_sub3_sub2.anInt1585 = anInt1325;
          anIntArray974[anInt973++] = j1;
        } else if (l1 == 1) {
          anIntArray972[anInt971++] = j1;
          class50_sub1_sub4_sub3_sub2.anInt1585 = anInt1325;
          int i2 = class50_sub1_sub2.readBits(3);
          class50_sub1_sub4_sub3_sub2.method566(false, i2, -808);
          int k2 = class50_sub1_sub2.readBits(1);
          if (k2 == 1) {
            anIntArray974[anInt973++] = j1;
          }
        } else if (l1 == 2) {
          anIntArray972[anInt971++] = j1;
          class50_sub1_sub4_sub3_sub2.anInt1585 = anInt1325;
          int j2 = class50_sub1_sub2.readBits(3);
          class50_sub1_sub4_sub3_sub2.method566(true, j2, -808);
          int l2 = class50_sub1_sub2.readBits(3);
          class50_sub1_sub4_sub3_sub2.method566(true, l2, -808);
          int i3 = class50_sub1_sub2.readBits(1);
          if (i3 == 1) {
            anIntArray974[anInt973++] = j1;
          }
        } else if (l1 == 3) {
          anIntArray1295[anInt1294++] = j1;
        }
      }
    }

  }

  public void method115(int i, int j) {
    int[] ai = aClass50_Sub1_Sub1_Sub1_1122.anIntArray1489;
    int k = ai.length;
    for (int l = 0; l < k; l++) {
      ai[l] = 0;
    }

    for (int i1 = 1; i1 < 103; i1++) {
      int j1 = 24628 + (103 - i1) * 512 * 4;
      for (int l1 = 1; l1 < 103; l1++) {
        if ((aByteArrayArrayArray1125[i][l1][i1] & 0x18) == 0) {
          aClass22_1164.method276(ai, j1, 512, i, l1, i1);
        }
        if (i < 3 && (aByteArrayArrayArray1125[i + 1][l1][i1] & 8) != 0) {
          aClass22_1164.method276(ai, j1, 512, i + 1, l1, i1);
        }
        j1 += 4;
      }

    }

    int k1 = (238 + (int) (Math.random() * 20D) - 10 << 16)
        + (238 + (int) (Math.random() * 20D) - 10 << 8) + 238
        + (int) (Math.random() * 20D) - 10;
    if (j != 0) {
      incomingPacketOpcode = buffer.readUByte();
    }
    int i2 = 238 + (int) (Math.random() * 20D) - 10 << 16;
    aClass50_Sub1_Sub1_Sub1_1122.method456(false);
    for (int j2 = 1; j2 < 103; j2++) {
      for (int k2 = 1; k2 < 103; k2++) {
        if ((aByteArrayArrayArray1125[i][k2][j2] & 0x18) == 0) {
          method150(j2, i, k2, i2, 563, k1);
        }
        if (i < 3 && (aByteArrayArrayArray1125[i + 1][k2][j2] & 8) != 0) {
          method150(j2, i + 1, k2, i2, 563, k1);
        }
      }

    }

    if (aClass18_1158 != null) {
      aClass18_1158.method230();
      Canvas.anIntArray1538 = anIntArray1002;
    }
    anInt1082++;
    if (anInt1082 > 177) {
      anInt1082 = 0;
      outgoingBuffer.writeByteIsaac(173);
      outgoingBuffer.writeMedium(0x288b80);
    }
    anInt1076 = 0;
    for (int l2 = 0; l2 < 104; l2++) {
      for (int i3 = 0; i3 < 104; i3++) {
        int j3 = aClass22_1164.method270(anInt1091, l2, i3);
        if (j3 != 0) {
          j3 = j3 >> 14 & 0x7fff;
          int k3 = GameObjectDefinition.forId(j3).anInt806;
          if (k3 >= 0) {
            int l3 = l2;
            int i4 = i3;
            if (k3 != 22 && k3 != 29 && k3 != 34 && k3 != 36
                && k3 != 46 && k3 != 47 && k3 != 48) {
              byte byte0 = 104;
              byte byte1 = 104;
              int[][] ai1 = aClass46Array1260[anInt1091].anIntArrayArray757;
              for (int j4 = 0; j4 < 10; j4++) {
                int k4 = (int) (Math.random() * 4D);
                if (k4 == 0 && l3 > 0 && l3 > l2 - 3
                    && (ai1[l3 - 1][i4] & 0x1280108) == 0) {
                  l3--;
                }
                if (k4 == 1 && l3 < byte0 - 1 && l3 < l2 + 3
                    && (ai1[l3 + 1][i4] & 0x1280180) == 0) {
                  l3++;
                }
                if (k4 == 2 && i4 > 0 && i4 > i3 - 3
                    && (ai1[l3][i4 - 1] & 0x1280102) == 0) {
                  i4--;
                }
                if (k4 == 3 && i4 < byte1 - 1 && i4 < i3 + 3
                    && (ai1[l3][i4 + 1] & 0x1280120) == 0) {
                  i4++;
                }
              }

            }
            aClass50_Sub1_Sub1_Sub1Array1278[anInt1076] = aClass50_Sub1_Sub1_Sub1Array1031[k3];
            anIntArray1077[anInt1076] = l3;
            anIntArray1078[anInt1076] = i4;
            anInt1076++;
          }
        }
      }

    }

  }

  public boolean saveWaveFile(int i, int j, byte[] abyte0) {
    if (i < 3 || i > 3) {
      throw new NullPointerException();
    }
    if (abyte0 == null) {
      return true;
    } else {
      return SignLink.wavesave(abyte0, j);
    }
  }

  public int method117(byte byte0) {
    int i = 3;
    if (byte0 == aByte956) {
      byte0 = 0;
    } else {
      method6();
    }
    if (anInt1219 < 310) {
      anInt978++;
      if (anInt978 > 1457) {
        anInt978 = 0;
        outgoingBuffer.writeByteIsaac(244);
        outgoingBuffer.writeByte(0);
        int j = outgoingBuffer.offset;
        outgoingBuffer.writeByte(219);
        outgoingBuffer.writeShort(37745);
        outgoingBuffer.writeByte(61);
        outgoingBuffer.writeShort(43756);
        outgoingBuffer.writeShort((int) (Math.random() * 65536D));
        outgoingBuffer.writeByte((int) (Math.random() * 256D));
        outgoingBuffer.writeShort(51171);
        if ((int) (Math.random() * 2D) == 0) {
          outgoingBuffer.writeShort(15808);
        }
        outgoingBuffer.writeByte(97);
        outgoingBuffer.writeByte((int) (Math.random() * 256D));
        outgoingBuffer.writeSizeByte(outgoingBuffer.offset - j);
      }
      int k = anInt1216 >> 7;
      int l = anInt1218 >> 7;
      int i1 = localPlayer.anInt1610 >> 7;
      int j1 = localPlayer.anInt1611 >> 7;
      if ((aByteArrayArrayArray1125[anInt1091][k][l] & 4) != 0) {
        i = anInt1091;
      }
      int k1;
      if (i1 > k) {
        k1 = i1 - k;
      } else {
        k1 = k - i1;
      }
      int l1;
      if (j1 > l) {
        l1 = j1 - l;
      } else {
        l1 = l - j1;
      }
      if (k1 > l1) {
        int i2 = l1 * 0x10000 / k1;
        int k2 = 32768;
        while (k != i1) {
          if (k < i1) {
            k++;
          } else if (k > i1) {
            k--;
          }
          if ((aByteArrayArrayArray1125[anInt1091][k][l] & 4) != 0) {
            i = anInt1091;
          }
          k2 += i2;
          if (k2 >= 0x10000) {
            k2 -= 0x10000;
            if (l < j1) {
              l++;
            } else if (l > j1) {
              l--;
            }
            if ((aByteArrayArrayArray1125[anInt1091][k][l] & 4) != 0) {
              i = anInt1091;
            }
          }
        }
      } else {
        int j2 = k1 * 0x10000 / l1;
        int l2 = 32768;
        while (l != j1) {
          if (l < j1) {
            l++;
          } else if (l > j1) {
            l--;
          }
          if ((aByteArrayArrayArray1125[anInt1091][k][l] & 4) != 0) {
            i = anInt1091;
          }
          l2 += j2;
          if (l2 >= 0x10000) {
            l2 -= 0x10000;
            if (k < i1) {
              k++;
            } else if (k > i1) {
              k--;
            }
            if ((aByteArrayArrayArray1125[anInt1091][k][l] & 4) != 0) {
              i = anInt1091;
            }
          }
        }
      }
    }
    if ((aByteArrayArrayArray1125[anInt1091][localPlayer.anInt1610 >> 7][
        localPlayer.anInt1611 >> 7] & 4) != 0) {
      i = anInt1091;
    }
    return i;
  }

  public int method118(int i) {
    int j = method110(anInt1218, anInt1216, (byte) 9, anInt1091);
    while (i >= 0) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (j - anInt1217 < 800
        && (aByteArrayArrayArray1125[anInt1091][anInt1216 >> 7][anInt1218 >> 7] & 4) != 0) {
      return anInt1091;
    } else {
      return 3;
    }
  }

  @Override
  public void method12(Runnable runnable, int i) {
    if (i > 10) {
      i = 10;
    }
    if (SignLink.mainapp != null) {
      SignLink.startthread(runnable, i);
		} else {
      super.method12(runnable, i);
		}
  }

  public void method119(int i, boolean flag) {
    if (localPlayer.anInt1610 >> 7 == anInt1120
        && localPlayer.anInt1611 >> 7 == anInt1121) {
      anInt1120 = 0;
    }
    int j = anInt971;
    if (flag) {
      j = 1;
    }
    for (int k = 0; k < j; k++) {
      Player class50_sub1_sub4_sub3_sub2;
      int l;
      if (flag) {
        class50_sub1_sub4_sub3_sub2 = localPlayer;
        l = anInt969 << 14;
      } else {
        class50_sub1_sub4_sub3_sub2 = activePlayers[anIntArray972[k]];
        l = anIntArray972[k] << 14;
      }
      if (class50_sub1_sub4_sub3_sub2 == null
          || !class50_sub1_sub4_sub3_sub2.method565()) {
        continue;
      }
			class50_sub1_sub4_sub3_sub2.aBoolean1763 = (lowMemory && anInt971 > 50 || anInt971 > 200)
					&& !flag
					&& class50_sub1_sub4_sub3_sub2.anInt1588
					== class50_sub1_sub4_sub3_sub2.anInt1634;
      int i1 = class50_sub1_sub4_sub3_sub2.anInt1610 >> 7;
      int j1 = class50_sub1_sub4_sub3_sub2.anInt1611 >> 7;
      if (i1 < 0 || i1 >= 104 || j1 < 0 || j1 >= 104) {
        continue;
      }
      if (class50_sub1_sub4_sub3_sub2.aClass50_Sub1_Sub4_Sub4_1746 != null
          && anInt1325 >= class50_sub1_sub4_sub3_sub2.anInt1764
          && anInt1325 < class50_sub1_sub4_sub3_sub2.anInt1765) {
        class50_sub1_sub4_sub3_sub2.aBoolean1763 = false;
        class50_sub1_sub4_sub3_sub2.anInt1750 = method110(
            class50_sub1_sub4_sub3_sub2.anInt1611,
            class50_sub1_sub4_sub3_sub2.anInt1610,
            (byte) 9, anInt1091);
        aClass22_1164.method253(class50_sub1_sub4_sub3_sub2.anInt1750,
            class50_sub1_sub4_sub3_sub2.anInt1769, 60, 7,
            class50_sub1_sub4_sub3_sub2,
            class50_sub1_sub4_sub3_sub2.anInt1768,
            class50_sub1_sub4_sub3_sub2.anInt1611,
            class50_sub1_sub4_sub3_sub2.anInt1771,
            class50_sub1_sub4_sub3_sub2.anInt1610,
            class50_sub1_sub4_sub3_sub2.anInt1612,
            class50_sub1_sub4_sub3_sub2.anInt1770, anInt1091, l);
        continue;
      }
      if ((class50_sub1_sub4_sub3_sub2.anInt1610 & 0x7f) == 64
          && (class50_sub1_sub4_sub3_sub2.anInt1611 & 0x7f) == 64) {
        if (anIntArrayArray886[i1][j1] == anInt1138) {
          continue;
        }
        anIntArrayArray886[i1][j1] = anInt1138;
      }
      class50_sub1_sub4_sub3_sub2.anInt1750 = method110(
          class50_sub1_sub4_sub3_sub2.anInt1611,
          class50_sub1_sub4_sub3_sub2.anInt1610,
          (byte) 9, anInt1091);
      aClass22_1164.method252(l, class50_sub1_sub4_sub3_sub2,
          class50_sub1_sub4_sub3_sub2.anInt1610,
          class50_sub1_sub4_sub3_sub2.anInt1750,
          class50_sub1_sub4_sub3_sub2.aBoolean1592, 0,
          anInt1091, 60,
          class50_sub1_sub4_sub3_sub2.anInt1611,
          class50_sub1_sub4_sub3_sub2.anInt1612);
    }

    if (i == 0) {
		}
  }

  public void method120(int i, int j) {
    if (i < 0) {
      return;
    }
    int k = anIntArray979[i];
    int l = anIntArray980[i];
    int opcode = anIntArray981[i];
    int clickedItem = anIntArray982[i];
    if (j < anInt921 || j > anInt921) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (opcode >= 2000) {
      opcode -= 2000;
    }
    if (anInt1244 != 0 && opcode != 1016) {
      anInt1244 = 0;
      aBoolean1240 = true;
    }
    if (opcode == 200) {
      Player class50_sub1_sub4_sub3_sub2 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(245);
        outgoingBuffer.writeShortAddLE(clickedItem);
      }
    }
    if (opcode == 227) {
      anInt1165++;
      if (anInt1165 >= 62) {
        outgoingBuffer.writeByteIsaac(165);
        outgoingBuffer.writeByte(206);
        anInt1165 = 0;
      }
      outgoingBuffer.writeByteIsaac(228);
      outgoingBuffer.writeShortLE(k);
      outgoingBuffer.writeShortAdd(clickedItem);
      outgoingBuffer.writeShort(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 876) {
      Player class50_sub1_sub4_sub3_sub2_1 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2_1 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2_1.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2_1.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(45);
        outgoingBuffer.writeShortAdd(clickedItem);
      }
    }
    if (opcode == 921) {
      Npc npc = activeNpcs[clickedItem];
      if (npc != null) {
        method35(false, false, npc.anIntArray1587[0],
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, npc.anIntArray1586[0], 0, 0,
            localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(67);
        outgoingBuffer.writeShortAdd(clickedItem);
      }
    }
    if (opcode == 961) {
      anInt1139 += clickedItem;
      if (anInt1139 >= 115) {
        outgoingBuffer.writeByteIsaac(126);
        outgoingBuffer.writeByte(125);
        anInt1139 = 0;
      }
      outgoingBuffer.writeByteIsaac(203);
      outgoingBuffer.writeShortAdd(l);
      outgoingBuffer.writeShortLE(k);
      outgoingBuffer.writeShortLE(clickedItem);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 467 && method80(l, 0, k, clickedItem)) {
      outgoingBuffer.writeByteIsaac(152); // other values are x, y, slot,
      // item id, and one unknown one
      // (interface? probably)
      outgoingBuffer.writeShortLE(clickedItem >> 14 & 0x7fff); // object
      outgoingBuffer.writeShortLE(anInt1148);
      outgoingBuffer.writeShortLE(anInt1149);
      outgoingBuffer.writeShortLE(l + anInt1041);
      outgoingBuffer.writeShort(anInt1147);
      outgoingBuffer.writeShortAddLE(k + anInt1040);
    }
    if (opcode == 9) {
      outgoingBuffer.writeByteIsaac(3);
      outgoingBuffer.writeShortAdd(clickedItem);
      outgoingBuffer.writeShort(l);
      outgoingBuffer.writeShort(k);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 553) {
      Npc class50_sub1_sub4_sub3_sub1_1 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_1 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub1_1.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub1_1.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(42);
        outgoingBuffer.writeShortLE(clickedItem);
      }
    }
    if (opcode == 677) {
      Player class50_sub1_sub4_sub3_sub2_2 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2_2 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2_2.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2_2.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(116);
        outgoingBuffer.writeShortLE(clickedItem);
      }
    }
    if (opcode == 762 || opcode == 574 || opcode == 775 || opcode == 859) {
      String s = aStringArray1184[i];
      int l1 = s.indexOf("@whi@");
      if (l1 != -1) {
        long l3 = TextUtils.encodeBase37(s.substring(l1 + 5).trim());
        if (opcode == 762) {
          method102(l3, -45229);
        }
        if (opcode == 574) {
          method90(anInt1154, l3);
        }
        if (opcode == 775) {
          method53(l3, 0);
        }
        if (opcode == 859) {
          method97(325, l3);
        }
      }
    }
    if (opcode == 930) {
      boolean flag = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag) {
        flag = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      outgoingBuffer.writeByteIsaac(54);
      outgoingBuffer.writeShortAdd(clickedItem);
      outgoingBuffer.writeShortLE(l + anInt1041);
      outgoingBuffer.writeShort(k + anInt1040);
    }
    if (opcode == 399) {
      outgoingBuffer.writeByteIsaac(24);
      outgoingBuffer.writeShortLE(l);
      outgoingBuffer.writeShortLE(clickedItem);
      outgoingBuffer.writeShortAdd(k);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 347) {
      Npc class50_sub1_sub4_sub3_sub1_2 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_2 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub1_2.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub1_2.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(57);
        outgoingBuffer.writeShort(clickedItem);
        outgoingBuffer.writeShortLE(anInt1149);
        outgoingBuffer.writeShortAddLE(anInt1148);
        outgoingBuffer.writeShort(anInt1147);
      }
    }
    if (opcode == 890) {
      outgoingBuffer.writeByteIsaac(79);
      outgoingBuffer.writeShort(l);
      Widget class13 = Widget.getWidget(l);
      if (class13.anIntArrayArray234 != null
          && class13.anIntArrayArray234[0][0] == 5) {
        int i2 = class13.anIntArrayArray234[0][1];
        anIntArray1039[i2] = 1 - anIntArray1039[i2];
        updateSettings(0, i2);
        aBoolean1181 = true;
      }
    }
    if (opcode == 493) {
      Player class50_sub1_sub4_sub3_sub2_3 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2_3 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2_3.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2_3.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(233);
        outgoingBuffer.writeShortAdd(clickedItem);
      }
    }
    if (opcode == 14) {
      if (!aBoolean1065) {
        aClass22_1164
            .method279(0, super.anInt29 - 4, super.anInt30 - 4);
      } else {
        aClass22_1164.method279(0, k - 4, l - 4);
      }
    }
    if (opcode == 903) {
      outgoingBuffer.writeByteIsaac(1);
      outgoingBuffer.writeShort(clickedItem);
      outgoingBuffer.writeShortLE(anInt1147);
      outgoingBuffer.writeShortLE(anInt1149);
      outgoingBuffer.writeShortAddLE(anInt1148);
      outgoingBuffer.writeShortAdd(k);
      outgoingBuffer.writeShortAdd(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 361) {
      outgoingBuffer.writeByteIsaac(36);
      outgoingBuffer.writeShort(anInt1172);
      outgoingBuffer.writeShortAdd(l);
      outgoingBuffer.writeShortAdd(k);
      outgoingBuffer.writeShortAdd(clickedItem);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 118) {
      Npc class50_sub1_sub4_sub3_sub1_3 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_3 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub1_3.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub1_3.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        anInt1235 += clickedItem;
        if (anInt1235 >= 143) {
          outgoingBuffer.writeByteIsaac(157);
          outgoingBuffer.writeInt(0);
          anInt1235 = 0;
        }
        outgoingBuffer.writeByteIsaac(13);
        outgoingBuffer.writeShortAddLE(clickedItem);
      }
    }
    if (opcode == 376 && method80(l, 0, k, clickedItem)) {
      outgoingBuffer.writeByteIsaac(210);
      outgoingBuffer.writeShort(anInt1172);
      outgoingBuffer.writeShortLE(clickedItem >> 14 & 0x7fff);
      outgoingBuffer.writeShortAdd(k + anInt1040);
      outgoingBuffer.writeShortLE(l + anInt1041);
    }
    if (opcode == 432) {
      Npc class50_sub1_sub4_sub3_sub1_4 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_4 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub1_4.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub1_4.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(8);
        outgoingBuffer.writeShortLE(clickedItem);
      }
    }
    if (opcode == 639) {
      method15();
    }
    if (opcode == 918) {
      Player class50_sub1_sub4_sub3_sub2_4 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2_4 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2_4.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2_4.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(31);
        outgoingBuffer.writeShort(clickedItem);
        outgoingBuffer.writeShortLE(anInt1172);
      }
    }
    if (opcode == 67) {
      Npc class50_sub1_sub4_sub3_sub1_5 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_5 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub1_5.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub1_5.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(104);
        outgoingBuffer.writeShortAdd(anInt1172);
        outgoingBuffer.writeShortLE(clickedItem);
      }
    }
    if (opcode == 68) {
      boolean flag1 = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag1) {
        flag1 = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      outgoingBuffer.writeByteIsaac(77);
      outgoingBuffer.writeShortAdd(k + anInt1040);
      outgoingBuffer.writeShort(l + anInt1041);
      outgoingBuffer.writeShortAddLE(clickedItem);
    }
    if (opcode == 684) {
      boolean flag2 = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag2) {
        flag2 = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      if ((clickedItem & 3) == 0) {
        anInt1052++;
      }
      if (anInt1052 >= 84) {
        outgoingBuffer.writeByteIsaac(222);
        outgoingBuffer.writeMedium(0xabc842);
        anInt1052 = 0;
      }
      outgoingBuffer.writeByteIsaac(71);
      outgoingBuffer.writeShortAddLE(clickedItem);
      outgoingBuffer.writeShortAddLE(k + anInt1040);
      outgoingBuffer.writeShortAdd(l + anInt1041);
    }
    if (opcode == 544 || opcode == 695) {
      String s1 = aStringArray1184[i];
      int j2 = s1.indexOf("@whi@");
      if (j2 != -1) {
        s1 = s1.substring(j2 + 5).trim();
        String s7 = TextUtils.method303(TextUtils
            .decodeBase37(TextUtils.encodeBase37(s1)));
        boolean flag8 = false;
        for (int j3 = 0; j3 < anInt971; j3++) {
          Player class50_sub1_sub4_sub3_sub2_7 = activePlayers[anIntArray972[j3]];
          if (class50_sub1_sub4_sub3_sub2_7 == null
              || class50_sub1_sub4_sub3_sub2_7.name == null
              || !class50_sub1_sub4_sub3_sub2_7.name
              .equalsIgnoreCase(s7)) {
            continue;
          }
          method35(
              false,
              false,
              class50_sub1_sub4_sub3_sub2_7.anIntArray1587[0],
              localPlayer.anIntArray1587[0],
              1,
              1,
              2,
              0,
              class50_sub1_sub4_sub3_sub2_7.anIntArray1586[0],
              0, 0, localPlayer.anIntArray1586[0]);
          if (opcode == 544) {
            outgoingBuffer.writeByteIsaac(116);
            outgoingBuffer.writeShortLE(anIntArray972[j3]);
          }
          if (opcode == 695) {
            outgoingBuffer.writeByteIsaac(245);
            outgoingBuffer.writeShortAddLE(anIntArray972[j3]);
          }
          flag8 = true;
          break;
        }

        if (!flag8) {
          addChatMessage("", "Unable to find " + s7, 0);
        }
      }
    }
    if (opcode == 225) {
      outgoingBuffer.writeByteIsaac(177);
      outgoingBuffer.writeShortAdd(k);
      outgoingBuffer.writeShortLE(clickedItem);
      outgoingBuffer.writeShortLE(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 70) {
      Widget class13_1 = Widget.getWidget(l);
      anInt1171 = 1;
      anInt1172 = l;
      anInt1173 = class13_1.anInt222;
      anInt1146 = 0;
      aBoolean1181 = true;
      String s4 = class13_1.aString281;
      if (s4.indexOf(" ") != -1) {
        s4 = s4.substring(0, s4.indexOf(" "));
      }
      String s8 = class13_1.aString281;
      if (s8.indexOf(" ") != -1) {
        s8 = s8.substring(s8.indexOf(" ") + 1);
      }
      aString1174 = s4 + " " + class13_1.aString211 + " " + s8;
      if (anInt1173 == 16) {
        aBoolean1181 = true;
        anInt1285 = 3;
        aBoolean950 = true;
      }
      return;
    }
    if (opcode == 891) {
      outgoingBuffer.writeByteIsaac(4);
      outgoingBuffer.writeShortLE(k);
      outgoingBuffer.writeShortAddLE(clickedItem);
      outgoingBuffer.writeShortAddLE(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 894) {
      outgoingBuffer.writeByteIsaac(158);
      outgoingBuffer.writeShortAddLE(k);
      outgoingBuffer.writeShortAddLE(clickedItem);
      outgoingBuffer.writeShortLE(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 1280) {
      method80(l, 0, k, clickedItem);
      outgoingBuffer.writeByteIsaac(55);
      outgoingBuffer.writeShortLE(clickedItem >> 14 & 0x7fff);
      outgoingBuffer.writeShortLE(l + anInt1041);
      outgoingBuffer.writeShort(k + anInt1040);
    }
    if (opcode == 35) {
      method80(l, 0, k, clickedItem);
      outgoingBuffer.writeByteIsaac(181);
      outgoingBuffer.writeShortAdd(k + anInt1040);
      outgoingBuffer.writeShortLE(l + anInt1041);
      outgoingBuffer.writeShortLE(clickedItem >> 14 & 0x7fff);
    }
    if (opcode == 888) {
      method80(l, 0, k, clickedItem);
      outgoingBuffer.writeByteIsaac(50);
      outgoingBuffer.writeShortAdd(l + anInt1041);
      outgoingBuffer.writeShortLE(clickedItem >> 14 & 0x7fff);
      outgoingBuffer.writeShortAddLE(k + anInt1040);
    }
    if (opcode == 324) {
      outgoingBuffer.writeByteIsaac(161);
      outgoingBuffer.writeShortAddLE(k);
      outgoingBuffer.writeShortAddLE(clickedItem);
      outgoingBuffer.writeShortLE(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 1094) {
      ItemDefinition class16 = ItemDefinition.getDefinition(clickedItem);
      Widget class13_4 = Widget.getWidget(l);
      String s5;
      if (class13_4 != null && class13_4.anIntArray224[k] >= 0x186a0) {
        s5 = class13_4.anIntArray224[k] + " x " + class16.name;
      } else if (class16.description != null) {
        s5 = new String(class16.description);
      } else {
        s5 = "It's a " + class16.name + ".";
      }
      addChatMessage("", s5, 0);
    }
    if (opcode == 352) {
      Widget class13_2 = Widget.getWidget(l);
      boolean flag7 = true;
      if (class13_2.anInt242 > 0) {
        flag7 = method60(631, class13_2);
      }
      if (flag7) {
        outgoingBuffer.writeByteIsaac(79);
        outgoingBuffer.writeShort(l);
      }
    }
    if (opcode == 1412) {
      int k1 = clickedItem >> 14 & 0x7fff;
      GameObjectDefinition class47 = GameObjectDefinition.forId(k1);
      String s9;
      if (class47.aByteArray783 != null) {
        s9 = new String(class47.aByteArray783);
      } else {
        s9 = "It's a " + class47.aString776 + ".";
      }
      addChatMessage("", s9, 0);
    }
    if (opcode == 575 && !aBoolean1239) {
      outgoingBuffer.writeByteIsaac(226);
      outgoingBuffer.writeShort(l);
      aBoolean1239 = true;
    }
    if (opcode == 892) {
      method80(l, 0, k, clickedItem);
      outgoingBuffer.writeByteIsaac(136);
      outgoingBuffer.writeShort(k + anInt1040);
      outgoingBuffer.writeShortLE(l + anInt1041);
      outgoingBuffer.writeShort(clickedItem >> 14 & 0x7fff);
    }
    if (opcode == 270) {
      boolean flag3 = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag3) {
        flag3 = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      outgoingBuffer.writeByteIsaac(230);
      outgoingBuffer.writeShortLE(clickedItem);
      outgoingBuffer.writeShortAdd(k + anInt1040);
      outgoingBuffer.writeShort(l + anInt1041);
    }
    if (opcode == 596) {
      Player class50_sub1_sub4_sub3_sub2_5 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2_5 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2_5.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2_5.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(143);
        outgoingBuffer.writeShortLE(anInt1149);
        outgoingBuffer.writeShortAddLE(anInt1147);
        outgoingBuffer.writeShort(anInt1148);
        outgoingBuffer.writeShortAdd(clickedItem);
      }
    }
    if (opcode == 100) {
      boolean flag4 = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag4) {
        flag4 = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      outgoingBuffer.writeByteIsaac(211);
      outgoingBuffer.writeShortAddLE(anInt1147);
      outgoingBuffer.writeShortAdd(anInt1149);
      outgoingBuffer.writeShortAddLE(l + anInt1041);
      outgoingBuffer.writeShortAddLE(k + anInt1040);
      outgoingBuffer.writeShortLE(anInt1148);
      outgoingBuffer.writeShortLE(clickedItem);
    }
    if (opcode == 1668) {
      Npc class50_sub1_sub4_sub3_sub1_6 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_6 != null) {
        NpcDefinition class37 = class50_sub1_sub4_sub3_sub1_6.definition;
        if (class37.anIntArray622 != null) {
          class37 = class37.method363(false);
        }
        if (class37 != null) {
          String s10;
          if (class37.aByteArray660 != null) {
            s10 = new String(class37.aByteArray660);
          } else {
            s10 = "It's a " + class37.name + ".";
          }
          addChatMessage("", s10, 0);
        }
      }
    }
    if (opcode == 26) {
      boolean flag5 = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag5) {
        flag5 = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      anInt1100++;
      if (anInt1100 >= 120) {
        outgoingBuffer.writeByteIsaac(95);
        outgoingBuffer.writeInt(0);
        anInt1100 = 0;
      }
      outgoingBuffer.writeByteIsaac(100);
      outgoingBuffer.writeShort(k + anInt1040);
      outgoingBuffer.writeShortAdd(l + anInt1041);
      outgoingBuffer.writeShortAddLE(clickedItem);
    }
    if (opcode == 444) {
      outgoingBuffer.writeByteIsaac(91);
      outgoingBuffer.writeShortLE(clickedItem);
      outgoingBuffer.writeShortAddLE(k);
      outgoingBuffer.writeShort(l);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 507) {
      String s2 = aStringArray1184[i];
      int k2 = s2.indexOf("@whi@");
      if (k2 != -1) {
        if (anInt1169 == -1) {
          method15();
          aString839 = s2.substring(k2 + 5).trim();
          aBoolean1098 = false;
          anInt1231 = anInt1169 = Widget.anInt246;
        } else {
          addChatMessage(
              "",
              "Please close the interface you have open before using 'report abuse'",
              0);
        }
      }
    }
    if (opcode == 389) {
      method80(l, 0, k, clickedItem);
      outgoingBuffer.writeByteIsaac(241);
      outgoingBuffer.writeShort(clickedItem >> 14 & 0x7fff);
      outgoingBuffer.writeShort(k + anInt1040);
      outgoingBuffer.writeShortAdd(l + anInt1041);
    }
    if (opcode == 564) {
      outgoingBuffer.writeByteIsaac(231);
      outgoingBuffer.writeShortAddLE(l);
      outgoingBuffer.writeShortLE(k);
      outgoingBuffer.writeShort(clickedItem);
      anInt1329 = 0;
      anInt1330 = l;
      anInt1331 = k;
      anInt1332 = 2;
      if (Widget.getWidget(l).anInt248 == anInt1169) {
        anInt1332 = 1;
      }
      if (Widget.getWidget(l).anInt248 == anInt988) {
        anInt1332 = 3;
      }
    }
    if (opcode == 984) {
      String s3 = aStringArray1184[i];
      int l2 = s3.indexOf("@whi@");
      if (l2 != -1) {
        long l4 = TextUtils.encodeBase37(s3.substring(l2 + 5).trim());
        int k3 = -1;
        for (int i4 = 0; i4 < anInt859; i4++) {
          if (aLongArray1130[i4] != l4) {
            continue;
          }
          k3 = i4;
          break;
        }

        if (k3 != -1 && anIntArray1267[k3] > 0) {
          aBoolean1240 = true;
          anInt1244 = 0;
          aBoolean866 = true;
          aString1026 = "";
          anInt1221 = 3;
          aLong1141 = aLongArray1130[k3];
          aString937 = "Enter message to send to "
              + aStringArray849[k3];
        }
      }
    }
    if (opcode == 518) {
      outgoingBuffer.writeByteIsaac(79);
      outgoingBuffer.writeShort(l);
      Widget class13_3 = Widget.getWidget(l);
      if (class13_3.anIntArrayArray234 != null
          && class13_3.anIntArrayArray234[0][0] == 5) {
        int i3 = class13_3.anIntArrayArray234[0][1];
        if (anIntArray1039[i3] != class13_3.anIntArray256[0]) {
          anIntArray1039[i3] = class13_3.anIntArray256[0];
          updateSettings(0, i3);
          aBoolean1181 = true;
        }
      }
    }
    if (opcode == 318) {
      Npc class50_sub1_sub4_sub3_sub1_7 = activeNpcs[clickedItem];
      if (class50_sub1_sub4_sub3_sub1_7 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub1_7.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub1_7.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(112);
        outgoingBuffer.writeShortLE(clickedItem);
      }
    }
    if (opcode == 199) {
      boolean flag6 = method35(false, false, l,
          localPlayer.anIntArray1587[0], 0, 0, 2, 0, k,
          0, 0, localPlayer.anIntArray1586[0]);
      if (!flag6) {
        flag6 = method35(false, false, l,
            localPlayer.anIntArray1587[0], 1, 1, 2,
            0, k, 0, 0, localPlayer.anIntArray1586[0]);
      }
      anInt1020 = super.anInt29;
      anInt1021 = super.anInt30;
      anInt1023 = 2;
      anInt1022 = 0;
      outgoingBuffer.writeByteIsaac(83);
      outgoingBuffer.writeShortLE(clickedItem);
      outgoingBuffer.writeShort(l + anInt1041);
      outgoingBuffer.writeShortLE(anInt1172);
      outgoingBuffer.writeShortAddLE(k + anInt1040);
    }
    if (opcode == 55) {
      method44(anInt1191);
      anInt1191 = -1;
      aBoolean1240 = true;
    }
    if (opcode == 52) {
      anInt1146 = 1;
      anInt1147 = k;
      anInt1148 = l;
      anInt1149 = clickedItem;
      selectedItem = String.valueOf(ItemDefinition
          .getDefinition(clickedItem).name);
      anInt1171 = 0;
      aBoolean1181 = true;
      return;
    }
    if (opcode == 1564) {
      ItemDefinition class16_1 = ItemDefinition
          .getDefinition(clickedItem);
      String s6;
      if (class16_1.description != null) {
        s6 = new String(class16_1.description);
      } else {
        s6 = "It's a " + class16_1.name + ".";
      }
      addChatMessage("", s6, 0);
    }
    if (opcode == 408) {
      Player class50_sub1_sub4_sub3_sub2_6 = activePlayers[clickedItem];
      if (class50_sub1_sub4_sub3_sub2_6 != null) {
        method35(
            false,
            false,
            class50_sub1_sub4_sub3_sub2_6.anIntArray1587[0],
            localPlayer.anIntArray1587[0],
            1,
            1,
            2,
            0,
            class50_sub1_sub4_sub3_sub2_6.anIntArray1586[0],
            0, 0, localPlayer.anIntArray1586[0]);
        anInt1020 = super.anInt29;
        anInt1021 = super.anInt30;
        anInt1023 = 2;
        anInt1022 = 0;
        outgoingBuffer.writeByteIsaac(194);
        outgoingBuffer.writeShortLE(clickedItem);
      }
    }
    anInt1146 = 0;
    anInt1171 = 0;
    aBoolean1181 = true;
  }

  public void method121(boolean flag) {
    anInt939 = 0;
    for (int i = -1; i < anInt971 + anInt1133; i++) {
      Object obj;
      if (i == -1) {
        obj = localPlayer;
      } else if (i < anInt971) {
        obj = activePlayers[anIntArray972[i]];
      } else {
        obj = activeNpcs[anIntArray1134[i - anInt971]];
      }
      if (obj == null || !((Character) obj).method565()) {
        continue;
      }
      if (obj instanceof Npc) {
        NpcDefinition class37 = ((Npc) obj).definition;
        if (class37.anIntArray622 != null) {
          class37 = class37.method363(false);
        }
        if (class37 == null) {
          continue;
        }
      }
      if (i < anInt971) {
        int k = 30;
        Player class50_sub1_sub4_sub3_sub2 = (Player) obj;
        if (class50_sub1_sub4_sub3_sub2.anInt1756 != -1
            || class50_sub1_sub4_sub3_sub2.anInt1748 != -1) {
          method136((Character) obj, ((Character) obj).anInt1594 + 15);
          if (anInt932 > -1) {
            if (class50_sub1_sub4_sub3_sub2.anInt1756 != -1) {
              aClass50_Sub1_Sub1_Sub1Array1288[class50_sub1_sub4_sub3_sub2.anInt1756]
                  .method461(anInt933 - k, anInt932 - 12,
                      -488);
              k += 25;
            }
            if (class50_sub1_sub4_sub3_sub2.anInt1748 != -1) {
              aClass50_Sub1_Sub1_Sub1Array1079[class50_sub1_sub4_sub3_sub2.anInt1748]
                  .method461(anInt933 - k, anInt932 - 12,
                      -488);
              k += 25;
            }
          }
        }
        if (i >= 0 && anInt1197 == 10 && anInt1151 == anIntArray972[i]) {
          method136((Character) obj, ((Character) obj).anInt1594 + 15);
          if (anInt932 > -1) {
            aClass50_Sub1_Sub1_Sub1Array954[1].method461(anInt933
                - k, anInt932 - 12, -488);
          }
        }
      } else {
        NpcDefinition class37_1 = ((Npc) obj).definition;
        if (class37_1.anInt638 >= 0
            && class37_1.anInt638 < aClass50_Sub1_Sub1_Sub1Array1079.length) {
          method136((Character) obj, ((Character) obj).anInt1594 + 15);
          if (anInt932 > -1) {
            aClass50_Sub1_Sub1_Sub1Array1079[class37_1.anInt638]
                .method461(anInt933 - 30, anInt932 - 12, -488);
          }
        }
        if (anInt1197 == 1 && anInt1226 == anIntArray1134[i - anInt971]
            && anInt1325 % 20 < 10) {
          method136((Character) obj, ((Character) obj).anInt1594 + 15);
          if (anInt932 > -1) {
            aClass50_Sub1_Sub1_Sub1Array954[0].method461(
                anInt933 - 28, anInt932 - 12, -488);
          }
        }
      }
      if (((Character) obj).aString1580 != null
          && (i >= anInt971 || anInt1006 == 0 || anInt1006 == 3 || anInt1006 == 1
          && method148(13292, ((Player) obj).name))) {
        method136((Character) obj, ((Character) obj).anInt1594);
        if (anInt932 > -1 && anInt939 < anInt940) {
          anIntArray944[anInt939] = aClass50_Sub1_Sub1_Sub2_1061
              .method473(((Character) obj).aString1580,
                  (byte) -53) / 2;
          anIntArray943[anInt939] = aClass50_Sub1_Sub1_Sub2_1061.anInt1506;
          anIntArray941[anInt939] = anInt932;
          anIntArray942[anInt939] = anInt933;
          anIntArray945[anInt939] = ((Character) obj).anInt1583;
          anIntArray946[anInt939] = ((Character) obj).anInt1593;
          anIntArray947[anInt939] = ((Character) obj).anInt1582;
          aStringArray948[anInt939++] = ((Character) obj).aString1580;
          if (anInt998 == 0 && ((Character) obj).anInt1593 >= 1
              && ((Character) obj).anInt1593 <= 3) {
            anIntArray943[anInt939] += 10;
            anIntArray942[anInt939] += 5;
          }
          if (anInt998 == 0 && ((Character) obj).anInt1593 == 4) {
            anIntArray944[anInt939] = 60;
          }
          if (anInt998 == 0 && ((Character) obj).anInt1593 == 5) {
            anIntArray943[anInt939] += 5;
          }
        }
      }
      if (((Character) obj).anInt1595 > anInt1325) {
        method136((Character) obj, ((Character) obj).anInt1594 + 15);
        if (anInt932 > -1) {
          int l = ((Character) obj).anInt1596 * 30
              / ((Character) obj).anInt1597;
          if (l > 30) {
            l = 30;
          }
          Rasterizer.method449(5, anInt933 - 3, 65280, (byte) -24, l,
              anInt932 - 15);
          Rasterizer.method449(5, anInt933 - 3, 0xff0000, (byte) -24,
              30 - l, anInt932 - 15 + l);
        }
      }
      for (int i1 = 0; i1 < 4; i1++) {
        if (((Character) obj).anIntArray1632[i1] > anInt1325) {
          method136((Character) obj, ((Character) obj).anInt1594 / 2);
          if (anInt932 > -1) {
            if (i1 == 1) {
              anInt933 -= 20;
            }
            if (i1 == 2) {
              anInt932 -= 15;
              anInt933 -= 10;
            }
            if (i1 == 3) {
              anInt932 += 15;
              anInt933 -= 10;
            }
            aClass50_Sub1_Sub1_Sub1Array1182[((Character) obj).anIntArray1631[i1]]
                .method461(anInt933 - 12, anInt932 - 12, -488);
            aClass50_Sub1_Sub1_Sub2_1059
                .method470(
                    anInt932,
                    452,
                    anInt933 + 4,
                    0,
                    String.valueOf(((Character) obj).anIntArray1630[i1]));
            aClass50_Sub1_Sub1_Sub2_1059
                .method470(
                    anInt932 - 1,
                    452,
                    anInt933 + 3,
                    0xffffff,
                    String.valueOf(((Character) obj).anIntArray1630[i1]));
          }
        }
      }

    }

    for (int j = 0; j < anInt939; j++) {
      int j1 = anIntArray941[j];
      int k1 = anIntArray942[j];
      int l1 = anIntArray944[j];
      int i2 = anIntArray943[j];
      boolean flag1 = true;
      while (flag1) {
        flag1 = false;
        for (int j2 = 0; j2 < j; j2++) {
          if (k1 + 2 > anIntArray942[j2] - anIntArray943[j2]
              && k1 - i2 < anIntArray942[j2] + 2
              && j1 - l1 < anIntArray941[j2] + anIntArray944[j2]
              && j1 + l1 > anIntArray941[j2] - anIntArray944[j2]
              && anIntArray942[j2] - anIntArray943[j2] < k1) {
            k1 = anIntArray942[j2] - anIntArray943[j2];
            flag1 = true;
          }
        }

      }
      anInt932 = anIntArray941[j];
      anInt933 = anIntArray942[j] = k1;
      String s = aStringArray948[j];
      if (anInt998 == 0) {
        int k2 = 0xffff00;
        if (anIntArray945[j] < 6) {
          k2 = anIntArray842[anIntArray945[j]];
        }
        if (anIntArray945[j] == 6) {
          k2 = anInt1138 % 20 >= 10 ? 0xffff00 : 0xff0000;
        }
        if (anIntArray945[j] == 7) {
          k2 = anInt1138 % 20 >= 10 ? 65535 : 255;
        }
        if (anIntArray945[j] == 8) {
          k2 = anInt1138 % 20 >= 10 ? 0x80ff80 : 45056;
        }
        if (anIntArray945[j] == 9) {
          int l2 = 150 - anIntArray947[j];
          if (l2 < 50) {
            k2 = 0xff0000 + 1280 * l2;
          } else if (l2 < 100) {
            k2 = 0xffff00 - 0x50000 * (l2 - 50);
          } else if (l2 < 150) {
            k2 = 65280 + 5 * (l2 - 100);
          }
        }
        if (anIntArray945[j] == 10) {
          int i3 = 150 - anIntArray947[j];
          if (i3 < 50) {
            k2 = 0xff0000 + 5 * i3;
          } else if (i3 < 100) {
            k2 = 0xff00ff - 0x50000 * (i3 - 50);
          } else if (i3 < 150) {
            k2 = 255 + 0x50000 * (i3 - 100) - 5 * (i3 - 100);
          }
        }
        if (anIntArray945[j] == 11) {
          int j3 = 150 - anIntArray947[j];
          if (j3 < 50) {
            k2 = 0xffffff - 0x50005 * j3;
          } else if (j3 < 100) {
            k2 = 65280 + 0x50005 * (j3 - 50);
          } else if (j3 < 150) {
            k2 = 0xffffff - 0x50000 * (j3 - 100);
          }
        }
        if (anIntArray946[j] == 0) {
          aClass50_Sub1_Sub1_Sub2_1061.method470(anInt932, 452,
              anInt933 + 1, 0, s);
          aClass50_Sub1_Sub1_Sub2_1061.method470(anInt932, 452,
              anInt933, k2, s);
        }
        if (anIntArray946[j] == 1) {
          aClass50_Sub1_Sub1_Sub2_1061.method475(anInt933 + 1,
              (byte) 4, anInt1138, s, anInt932, 0);
          aClass50_Sub1_Sub1_Sub2_1061.method475(anInt933, (byte) 4,
              anInt1138, s, anInt932, k2);
        }
        if (anIntArray946[j] == 2) {
          aClass50_Sub1_Sub1_Sub2_1061.method476(anInt933 + 1, 0,
              (byte) 1, s, anInt932, anInt1138);
          aClass50_Sub1_Sub1_Sub2_1061.method476(anInt933, k2,
              (byte) 1, s, anInt932, anInt1138);
        }
        if (anIntArray946[j] == 3) {
          aClass50_Sub1_Sub1_Sub2_1061.method477(-601, s, 0,
              anInt932, anInt933 + 1, 150 - anIntArray947[j],
              anInt1138);
          aClass50_Sub1_Sub1_Sub2_1061.method477(-601, s, k2,
              anInt932, anInt933, 150 - anIntArray947[j],
              anInt1138);
        }
        if (anIntArray946[j] == 4) {
          int k3 = aClass50_Sub1_Sub1_Sub2_1061.method473(s,
              (byte) -53);
          int i4 = (150 - anIntArray947[j]) * (k3 + 100) / 150;
          Rasterizer.method446(0, anInt932 - 50, 334, anInt932 + 50,
              true);
          aClass50_Sub1_Sub1_Sub2_1061.method474(2245, anInt932 + 50
              - i4, 0, anInt933 + 1, s);
          aClass50_Sub1_Sub1_Sub2_1061.method474(2245, anInt932 + 50
              - i4, k2, anInt933, s);
          Rasterizer.method445((byte) 82);
        }
        if (anIntArray946[j] == 5) {
          int l3 = 150 - anIntArray947[j];
          int j4 = 0;
          if (l3 < 25) {
            j4 = l3 - 25;
          } else if (l3 > 125) {
            j4 = l3 - 125;
          }
          Rasterizer.method446(anInt933
                  - aClass50_Sub1_Sub1_Sub2_1061.anInt1506 - 1, 0,
              anInt933 + 5, 512, true);
          aClass50_Sub1_Sub1_Sub2_1061.method470(anInt932, 452,
              anInt933 + 1 + j4, 0, s);
          aClass50_Sub1_Sub1_Sub2_1061.method470(anInt932, 452,
              anInt933 + j4, k2, s);
          Rasterizer.method445((byte) 82);
        }
      } else {
        aClass50_Sub1_Sub1_Sub2_1061.method470(anInt932, 452,
            anInt933 + 1, 0, s);
        aClass50_Sub1_Sub1_Sub2_1061.method470(anInt932, 452, anInt933,
            0xffff00, s);
      }
    }

    if (flag) {
      incomingPacketOpcode = -1;
    }
  }

  public void method122(int i) {
    while (i >= 0) {
      aBoolean1242 = !aBoolean1242;
    }
    if (aClass18_1159 != null) {
		} else {
      method141(28614);
      super.aClass18_15 = null;
      aClass18_1198 = null;
      aClass18_1199 = null;
      aClass18_1200 = null;
      aClass18_1201 = null;
      aClass18_1202 = null;
      aClass18_1203 = null;
      aClass18_1204 = null;
      aClass18_1205 = null;
      aClass18_1206 = null;
      aClass18_1159 = new ProducingGraphicsBuffer(96, (byte) -12,
          method11(-756), 479);
      aClass18_1157 = new ProducingGraphicsBuffer(156, (byte) -12,
          method11(-756), 172);
      Rasterizer.method447(4);
      aClass50_Sub1_Sub1_Sub3_1186.method490(0, 0, -488);
      aClass18_1156 = new ProducingGraphicsBuffer(261, (byte) -12,
          method11(-756), 190);
      aClass18_1158 = new ProducingGraphicsBuffer(334, (byte) -12,
          method11(-756), 512);
      Rasterizer.method447(4);
      aClass18_1108 = new ProducingGraphicsBuffer(50, (byte) -12,
          method11(-756), 496);
      aClass18_1109 = new ProducingGraphicsBuffer(37, (byte) -12,
          method11(-756), 269);
      aClass18_1110 = new ProducingGraphicsBuffer(45, (byte) -12,
          method11(-756), 249);
      aBoolean1046 = true;
      aClass18_1158.method230();
      Canvas.anIntArray1538 = anIntArray1002;
		}
  }

  public void method123(int i) {
    Graphics g = method11(-756).getGraphics();
    g.setColor(Color.black);
    i = 68 / i;
    g.fillRect(0, 0, 765, 503);
    method4((byte) 103, 1);
    if (aBoolean1283) {
      aBoolean1243 = false;
      g.setFont(new Font("Helvetica", 1, 16));
      g.setColor(Color.yellow);
      int j = 35;
      g.drawString(
          "Sorry, an error has occured whilst loading RuneScape", 30,
          j);
      j += 50;
      g.setColor(Color.white);
      g.drawString("To fix this try the following (in order):", 30, j);
      j += 50;
      g.setColor(Color.white);
      g.setFont(new Font("Helvetica", 1, 12));
      g.drawString(
          "1: Try closing ALL open web-browser windows, and reloading",
          30, j);
      j += 30;
      g.drawString(
          "2: Try clearing your web-browsers cache from tools->internet options",
          30, j);
      j += 30;
      g.drawString("3: Try using a different game-world", 30, j);
      j += 30;
      g.drawString("4: Try rebooting your computer", 30, j);
      j += 30;
      g.drawString(
          "5: Try selecting a different version of Java from the play-game menu",
          30, j);
    }
    if (aBoolean1097) {
      aBoolean1243 = false;
      g.setFont(new Font("Helvetica", 1, 20));
      g.setColor(Color.white);
      g.drawString("Error - unable to load game!", 50, 50);
      g.drawString("To play RuneScape make sure you play from", 50, 100);
      g.drawString("http://www.runescape.com", 50, 150);
    }
    if (aBoolean1016) {
      aBoolean1243 = false;
      g.setColor(Color.yellow);
      int k = 35;
      g.drawString(
          "Error a copy of RuneScape already appears to be loaded",
          30, k);
      k += 50;
      g.setColor(Color.white);
      g.drawString("To fix this try the following (in order):", 30, k);
      k += 50;
      g.setColor(Color.white);
      g.setFont(new Font("Helvetica", 1, 12));
      g.drawString(
          "1: Try closing ALL open web-browser windows, and reloading",
          30, k);
      k += 30;
      g.drawString("2: Try rebooting your computer, and reloading", 30, k);
      k += 30;
    }
  }

  public void disconnect(boolean flag) {
    try {
      if (primaryConnection != null) {
        primaryConnection.close();
      }
    } catch (Exception _ex) {
    }
    primaryConnection = null;
    aBoolean1137 = false;
    anInt1225 = 0;
    aString1092 = "";
    aString1093 = "";
    method49(383);
    aBoolean1137 &= flag;
    aClass22_1164.method241((byte) 7);
    for (int i = 0; i < 4; i++) {
      aClass46Array1260[i].method411();
    }

    System.gc();
    stopMusic(false);
    currentSong = -1;
    nextSong = -1;
    previousSong = 0;
  }

  public void method125(int i, String s, String s1) {
    while (i >= 0) {
      return;
    }
    if (aClass18_1158 != null) {
      aClass18_1158.method230();
      Canvas.anIntArray1538 = anIntArray1002;
      int j = 151;
      if (s != null) {
        j -= 7;
      }
      aClass50_Sub1_Sub1_Sub2_1060.method470(257, 452, j, 0, s1);
      aClass50_Sub1_Sub1_Sub2_1060.method470(256, 452, j - 1, 0xffffff,
          s1);
      j += 15;
      if (s != null) {
        aClass50_Sub1_Sub1_Sub2_1060.method470(257, 452, j, 0, s);
        aClass50_Sub1_Sub1_Sub2_1060.method470(256, 452, j - 1,
            0xffffff, s);
      }
      aClass18_1158.method231(4, 4, super.aGraphics14, aBoolean1074);
      return;
    }
    if (super.aClass18_15 != null) {
      super.aClass18_15.method230();
      Canvas.anIntArray1538 = anIntArray1003;
      int k = 251;
      char c = '\u012C';
      byte byte0 = 50;
      Rasterizer.method449(byte0, k - 5 - byte0 / 2, 0, (byte) -24, c,
          383 - c / 2);
      Rasterizer.method450(0, k - 5 - byte0 / 2, byte0, 0xffffff,
          383 - c / 2, c);
      if (s != null) {
        k -= 7;
      }
      aClass50_Sub1_Sub1_Sub2_1060.method470(383, 452, k, 0, s1);
      aClass50_Sub1_Sub1_Sub2_1060.method470(382, 452, k - 1, 0xffffff,
          s1);
      k += 15;
      if (s != null) {
        aClass50_Sub1_Sub1_Sub2_1060.method470(383, 452, k, 0, s);
        aClass50_Sub1_Sub1_Sub2_1060.method470(382, 452, k - 1,
            0xffffff, s);
      }
      super.aClass18_15.method231(0, 0, super.aGraphics14, aBoolean1074);
    }
  }

  public boolean method126(int i, byte byte0) {
    if (i < 0) {
      return false;
    }
    int j = anIntArray981[i];
    if (byte0 != 97) {
      throw new NullPointerException();
    }
    if (j >= 2000) {
      j -= 2000;
    }
    return j == 762;
  }

  public void method127(boolean flag) {
    if (!flag) {
      anInt1056 = encryption.nextKey();
    }
    if (anInt1197 != 2) {
      return;
    }
    method137((anInt844 - anInt1040 << 7) + anInt847, anInt846 * 2,
        (anInt845 - anInt1041 << 7) + anInt848);
    if (anInt932 > -1 && anInt1325 % 20 < 10) {
      aClass50_Sub1_Sub1_Sub1Array954[0].method461(anInt933 - 28,
          anInt932 - 12, -488);
    }
  }

  @Override
  public void method9(int i) {
    if (aBoolean1016 || aBoolean1283 || aBoolean1097) {
      method123(281);
      return;
    }
    anInt1309++;
    if (i <= 0) {
      anInt1004 = -382;
    }
    if (!aBoolean1137) {
      method131((byte) -50, false);
    } else {
      method74(7);
    }
    anInt1094 = 0;
  }

  public void method128(boolean flag) {
    if (flag) {
      outgoingBuffer.writeByte(23);
    }
    int i = anInt1305;
    int j = anInt1306;
    int k = anInt1307;
    int l = anInt1308;
    int i1 = 0x5d5447;
    Rasterizer.method449(l, j, i1, (byte) -24, k, i);
    Rasterizer.method449(16, j + 1, 0, (byte) -24, k - 2, i + 1);
    Rasterizer.method450(0, j + 18, l - 19, 0, i + 1, k - 2);
    aClass50_Sub1_Sub1_Sub2_1061.method474(2245, i + 3, i1, j + 14,
        "Choose Option");
    int j1 = super.anInt22;
    int k1 = super.anInt23;
    if (anInt1304 == 0) {
      j1 -= 4;
      k1 -= 4;
    }
    if (anInt1304 == 1) {
      j1 -= 553;
      k1 -= 205;
    }
    if (anInt1304 == 2) {
      j1 -= 17;
      k1 -= 357;
    }
    for (int l1 = 0; l1 < anInt1183; l1++) {
      int i2 = j + 31 + (anInt1183 - 1 - l1) * 15;
      int j2 = 0xffffff;
      if (j1 > i && j1 < i + k && k1 > i2 - 13 && k1 < i2 + 3) {
        j2 = 0xffff00;
      }
      aClass50_Sub1_Sub1_Sub2_1061.method478(j2, i + 3, i2, true,
          aStringArray1184[l1], -39629);
    }

  }

  public int method129(int i, int j, Widget class13) {
    if (i != 3) {
      return anInt1222;
    }
    if (class13.anIntArrayArray234 == null
        || j >= class13.anIntArrayArray234.length) {
      return -2;
    }
    try {
      int[] ai = class13.anIntArrayArray234[j];
      int k = 0;
      int l = 0;
      int i1 = 0;
      do {
        int j1 = ai[l++];
        int k1 = 0;
        byte byte0 = 0;
        if (j1 == 0) {
          return k;
        }
        if (j1 == 1) {
          k1 = anIntArray1029[ai[l++]];
        }
        if (j1 == 2) {
          k1 = anIntArray1054[ai[l++]];
        }
        if (j1 == 3) {
          k1 = anIntArray843[ai[l++]];
        }
        if (j1 == 4) {
          Widget class13_1 = Widget.getWidget(ai[l++]);
          int k2 = ai[l++];
          if (k2 >= 0
              && k2 < ItemDefinition.anInt335
              && (!ItemDefinition.getDefinition(k2).membersItem || membersServer)) {
            for (int j3 = 0; j3 < class13_1.anIntArray269.length; j3++) {
              if (class13_1.anIntArray269[j3] == k2 + 1) {
                k1 += class13_1.anIntArray224[j3];
              }
            }

          }
        }
        if (j1 == 5) {
          k1 = anIntArray1039[ai[l++]];
        }
        if (j1 == 6) {
          k1 = anIntArray952[anIntArray1054[ai[l++]] - 1];
        }
        if (j1 == 7) {
          k1 = anIntArray1039[ai[l++]] * 100 / 46875;
        }
        if (j1 == 8) {
          k1 = localPlayer.combatLevel;
        }
        if (j1 == 9) {
          for (int l1 = 0; l1 < Class42.anInt700; l1++) {
            if (Class42.aBooleanArray702[l1]) {
              k1 += anIntArray1054[l1];
            }
          }

        }
        if (j1 == 10) {
          Widget class13_2 = Widget.getWidget(ai[l++]);
          int l2 = ai[l++] + 1;
          if (l2 >= 0
              && l2 < ItemDefinition.anInt335
              && (!ItemDefinition.getDefinition(l2).membersItem || membersServer)) {
            for (int element : class13_2.anIntArray269) {
              if (element != l2) {
                continue;
              }
              k1 = 0x3b9ac9ff;
              break;
            }

          }
        }
        if (j1 == 11) {
          k1 = anInt1324;
        }
        if (j1 == 12) {
          k1 = anInt1030;
        }
        if (j1 == 13) {
          int i2 = anIntArray1039[ai[l++]];
          int i3 = ai[l++];
          k1 = (i2 & 1 << i3) == 0 ? 0 : 1;
        }
        if (j1 == 14) {
          int j2 = ai[l++];
          VarBit class49 = VarBit.varbits[j2];
          int l3 = class49.anInt826;
          int i4 = class49.anInt827;
          int j4 = class49.anInt828;
          int k4 = anIntArray1214[j4 - i4];
          k1 = anIntArray1039[l3] >> i4 & k4;
        }
        if (j1 == 15) {
          byte0 = 1;
        }
        if (j1 == 16) {
          byte0 = 2;
        }
        if (j1 == 17) {
          byte0 = 3;
        }
        if (j1 == 18) {
          k1 = (localPlayer.anInt1610 >> 7) + anInt1040;
        }
        if (j1 == 19) {
          k1 = (localPlayer.anInt1611 >> 7) + anInt1041;
        }
        if (j1 == 20) {
          k1 = ai[l++];
        }
        if (byte0 == 0) {
          if (i1 == 0) {
            k += k1;
          }
          if (i1 == 1) {
            k -= k1;
          }
          if (i1 == 2 && k1 != 0) {
            k /= k1;
          }
          if (i1 == 3) {
            k *= k1;
          }
          i1 = 0;
        } else {
          i1 = byte0;
        }
      } while (true);
    } catch (Exception _ex) {
      return -1;
    }
  }

  public void method130(int i, boolean flag, ImageRGB class50_sub1_sub1_sub1,
      int j) {
    if (class50_sub1_sub1_sub1 == null) {
      return;
    }
    int k = anInt1252 + anInt916 & 0x7ff;
    int l = j * j + i * i;
    if (l > 6400) {
      return;
    }
    int i1 = Model.anIntArray1710[k];
    int j1 = Model.anIntArray1711[k];
    i1 = i1 * 256 / (anInt1233 + 256);
    j1 = j1 * 256 / (anInt1233 + 256);
    if (!flag) {
      incomingPacketOpcode = buffer.readUByte();
    }
    int k1 = i * i1 + j * j1 >> 16;
    int l1 = i * j1 - j * i1 >> 16;
    if (l > 2500) {
      class50_sub1_sub1_sub1.method467(aClass50_Sub1_Sub1_Sub3_1186, 83
          - l1 - class50_sub1_sub1_sub1.anInt1495 / 2 - 4, -49993, 94
          + k1 - class50_sub1_sub1_sub1.anInt1494 / 2 + 4);
		} else {
      class50_sub1_sub1_sub1.method461(83 - l1
          - class50_sub1_sub1_sub1.anInt1495 / 2 - 4, 94 + k1
          - class50_sub1_sub1_sub1.anInt1494 / 2 + 4, -488);
		}
  }

  public void method131(byte byte0, boolean flag) {
    method64(-188);
    aClass18_1200.method230();
    aClass50_Sub1_Sub1_Sub3_1292.method490(0, 0, -488);
    char c = '\u0168';
    char c1 = '\310';
    if (byte0 != -50) {
      for (int i = 1; i > 0; i++) {
			}
    }
    if (anInt1225 == 0) {
      int j = c1 / 2 + 80;
      aClass50_Sub1_Sub1_Sub2_1059.method471(true, anInt1056, 0x75a9a9,
          j, c / 2, requester.aString1347);
      j = c1 / 2 - 20;
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffff00,
          j, c / 2, "Welcome to RuneScape");
      j += 30;
      int i1 = c / 2 - 80;
      int l1 = c1 / 2 + 20;
      aClass50_Sub1_Sub1_Sub3_1293.method490(l1 - 20, i1 - 73, -488);
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          l1 + 5, i1, "New User");
      i1 = c / 2 + 80;
      aClass50_Sub1_Sub1_Sub3_1293.method490(l1 - 20, i1 - 73, -488);
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          l1 + 5, i1, "Existing User");
    }
    if (anInt1225 == 2) {
      int k = c1 / 2 - 40;
      if (aString957.length() > 0) {
        aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056,
            0xffff00, k - 15, c / 2, aString957);
        aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056,
            0xffff00, k, c / 2, aString958);
        k += 30;
      } else {
        aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056,
            0xffff00, k - 7, c / 2, aString958);
        k += 30;
      }
      aClass50_Sub1_Sub1_Sub2_1061.method478(0xffffff, c / 2 - 90, k,
          true, "Username: "
              + aString1092
              + (anInt977 == 0 & anInt1325 % 40 < 20 ? "@yel@|"
              : ""), -39629);
      k += 15;
      aClass50_Sub1_Sub1_Sub2_1061.method478(0xffffff, c / 2 - 88, k,
          true, "Password: "
              + TextUtils.appendAsterisks(aString1093)
              + (anInt977 == 1 & anInt1325 % 40 < 20 ? "@yel@|"
              : ""), -39629);
      k += 15;
      if (!flag) {
        int j1 = c / 2 - 80;
        int i2 = c1 / 2 + 50;
        aClass50_Sub1_Sub1_Sub3_1293.method490(i2 - 20, j1 - 73, -488);
        aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056,
            0xffffff, i2 + 5, j1, "Login");
        j1 = c / 2 + 80;
        aClass50_Sub1_Sub1_Sub3_1293.method490(i2 - 20, j1 - 73, -488);
        aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056,
            0xffffff, i2 + 5, j1, "Cancel");
      }
    }
    if (anInt1225 == 3) {
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffff00,
          c1 / 2 - 60, c / 2, "Create a free account");
      int l = c1 / 2 - 35;
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          l, c / 2, "To create a new account you need to");
      l += 15;
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          l, c / 2, "go back to the main RuneScape webpage");
      l += 15;
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          l, c / 2, "and choose the 'create account'");
      l += 15;
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          l, c / 2, "button near the top of that page.");
      l += 15;
      int k1 = c / 2;
      int j2 = c1 / 2 + 50;
      aClass50_Sub1_Sub1_Sub3_1293.method490(j2 - 20, k1 - 73, -488);
      aClass50_Sub1_Sub1_Sub2_1061.method471(true, anInt1056, 0xffffff,
          j2 + 5, k1, "Cancel");
    }
    aClass18_1200.method231(171, 202, super.aGraphics14, aBoolean1074);
    if (aBoolean1046) {
      aBoolean1046 = false;
      aClass18_1198.method231(0, 128, super.aGraphics14, aBoolean1074);
      aClass18_1199.method231(371, 202, super.aGraphics14, aBoolean1074);
      aClass18_1203.method231(265, 0, super.aGraphics14, aBoolean1074);
      aClass18_1204.method231(265, 562, super.aGraphics14, aBoolean1074);
      aClass18_1205.method231(171, 128, super.aGraphics14, aBoolean1074);
      aClass18_1206.method231(171, 562, super.aGraphics14, aBoolean1074);
    }
  }

  public void method132(Buffer class50_sub1_sub2, int i, boolean flag) {
    if (flag) {
      anInt1140 = 287;
    }
    while (class50_sub1_sub2.bitIndex + 21 < i * 8) {
      int j = class50_sub1_sub2.readBits(14);
      if (j == 16383) {
        break;
      }
      if (activeNpcs[j] == null) {
        activeNpcs[j] = new Npc();
      }
      Npc class50_sub1_sub4_sub3_sub1 = activeNpcs[j];
      anIntArray1134[anInt1133++] = j;
      class50_sub1_sub4_sub3_sub1.anInt1585 = anInt1325;
      int k = class50_sub1_sub2.readBits(1);
      if (k == 1) {
        anIntArray974[anInt973++] = j;
      }
      int l = class50_sub1_sub2.readBits(5);
      if (l > 15) {
        l -= 32;
      }
      int i1 = class50_sub1_sub2.readBits(5);
      if (i1 > 15) {
        i1 -= 32;
      }
      int j1 = class50_sub1_sub2.readBits(1);
      class50_sub1_sub4_sub3_sub1.definition = NpcDefinition
          .method364(class50_sub1_sub2.readBits(13));
      class50_sub1_sub4_sub3_sub1.anInt1601 = class50_sub1_sub4_sub3_sub1.definition.aByte642;
      class50_sub1_sub4_sub3_sub1.anInt1600 = class50_sub1_sub4_sub3_sub1.definition.anInt651;
      class50_sub1_sub4_sub3_sub1.anInt1619 = class50_sub1_sub4_sub3_sub1.definition.anInt645;
      class50_sub1_sub4_sub3_sub1.anInt1620 = class50_sub1_sub4_sub3_sub1.definition.anInt643;
      class50_sub1_sub4_sub3_sub1.anInt1621 = class50_sub1_sub4_sub3_sub1.definition.anInt641;
      class50_sub1_sub4_sub3_sub1.anInt1622 = class50_sub1_sub4_sub3_sub1.definition.anInt633;
      class50_sub1_sub4_sub3_sub1.anInt1634 = class50_sub1_sub4_sub3_sub1.definition.anInt621;
      class50_sub1_sub4_sub3_sub1.method568(
          localPlayer.anIntArray1587[0] + l, (byte) 5,
          j1 == 1, localPlayer.anIntArray1586[0] + i1);
    }
    class50_sub1_sub2.disableBitAccess();
  }

  public void method133(Buffer class50_sub1_sub2, int i, int j) {
    if (i != 0) {
      aClass6ArrayArrayArray1323 = null;
    }
    if (j == 203) {
      int k = class50_sub1_sub2.readUShort();
      int j3 = class50_sub1_sub2.readUByte();
      int i6 = j3 >> 2;
      int l8 = j3 & 3;
      int k11 = anIntArray1032[i6];
      byte byte0 = class50_sub1_sub2.readByteNeg();
      int i16 = class50_sub1_sub2.readUByteAdd();
      int k17 = anInt989 + (i16 >> 4 & 7);
      int k18 = anInt990 + (i16 & 7);
      byte byte1 = class50_sub1_sub2.readByteAdd();
      int l19 = class50_sub1_sub2.readUShortSub();
      int k20 = class50_sub1_sub2.readUShortLE();
      byte byte2 = class50_sub1_sub2.readByte();
      byte byte3 = class50_sub1_sub2.readByteAdd();
      int l21 = class50_sub1_sub2.readUShort();
      Player class50_sub1_sub4_sub3_sub2;
      if (k20 == anInt961) {
        class50_sub1_sub4_sub3_sub2 = localPlayer;
      } else {
        class50_sub1_sub4_sub3_sub2 = activePlayers[k20];
      }
      if (class50_sub1_sub4_sub3_sub2 != null) {
        GameObjectDefinition class47 = GameObjectDefinition.forId(k);
        int i22 = anIntArrayArrayArray891[anInt1091][k17][k18];
        int j22 = anIntArrayArrayArray891[anInt1091][k17 + 1][k18];
        int k22 = anIntArrayArrayArray891[anInt1091][k17 + 1][k18 + 1];
        int l22 = anIntArrayArrayArray891[anInt1091][k17][k18 + 1];
        Model class50_sub1_sub4_sub4 = class47.method431(i6, l8, i22,
            j22, k22, l22, -1);
        if (class50_sub1_sub4_sub4 != null) {
          method145(true, anInt1091, k17, 0, l19 + 1, 0, -1, l21 + 1,
              k11, k18);
          class50_sub1_sub4_sub3_sub2.anInt1764 = l21 + anInt1325;
          class50_sub1_sub4_sub3_sub2.anInt1765 = l19 + anInt1325;
          class50_sub1_sub4_sub3_sub2.aClass50_Sub1_Sub4_Sub4_1746 = class50_sub1_sub4_sub4;
          int i23 = class47.anInt801;
          int j23 = class47.anInt775;
          if (l8 == 1 || l8 == 3) {
            i23 = class47.anInt775;
            j23 = class47.anInt801;
          }
          class50_sub1_sub4_sub3_sub2.anInt1743 = k17 * 128 + i23
              * 64;
          class50_sub1_sub4_sub3_sub2.anInt1745 = k18 * 128 + j23
              * 64;
          class50_sub1_sub4_sub3_sub2.anInt1744 = method110(
              class50_sub1_sub4_sub3_sub2.anInt1745,
              class50_sub1_sub4_sub3_sub2.anInt1743, (byte) 9,
              anInt1091);
          if (byte1 > byte0) {
            byte byte4 = byte1;
            byte1 = byte0;
            byte0 = byte4;
          }
          if (byte3 > byte2) {
            byte byte5 = byte3;
            byte3 = byte2;
            byte2 = byte5;
          }
          class50_sub1_sub4_sub3_sub2.anInt1768 = k17 + byte1;
          class50_sub1_sub4_sub3_sub2.anInt1770 = k17 + byte0;
          class50_sub1_sub4_sub3_sub2.anInt1769 = k18 + byte3;
          class50_sub1_sub4_sub3_sub2.anInt1771 = k18 + byte2;
        }
      }
    }
    if (j == 106) {
      int l = class50_sub1_sub2.readUByteAdd();
      int k3 = anInt989 + (l >> 4 & 7);
      int j6 = anInt990 + (l & 7);
      int i9 = class50_sub1_sub2.readShortLESub();
      int l11 = class50_sub1_sub2.readUShortSub();
      int i14 = class50_sub1_sub2.readUShortSub();
      if (k3 >= 0 && j6 >= 0 && k3 < 104 && j6 < 104 && i14 != anInt961) {
        Item class50_sub1_sub4_sub1_2 = new Item();
        class50_sub1_sub4_sub1_2.id = l11;
        class50_sub1_sub4_sub1_2.stackSize = i9;
        if (aClass6ArrayArrayArray1323[anInt1091][k3][j6] == null) {
          aClass6ArrayArrayArray1323[anInt1091][k3][j6] = new Deque();
        }
        aClass6ArrayArrayArray1323[anInt1091][k3][j6]
            .method155(class50_sub1_sub4_sub1_2);
        method26(k3, j6);
      }
      return;
    }
    if (j == 142) {
      int i1 = class50_sub1_sub2.readUShort();
      int l3 = class50_sub1_sub2.readUByteAdd();
      int k6 = l3 >> 2;
      int j9 = l3 & 3;
      int i12 = anIntArray1032[k6];
      int j14 = class50_sub1_sub2.readUByte();
      int j16 = anInt989 + (j14 >> 4 & 7);
      int l17 = anInt990 + (j14 & 7);
      if (j16 >= 0 && l17 >= 0 && j16 < 103 && l17 < 103) {
        int l18 = anIntArrayArrayArray891[anInt1091][j16][l17];
        int j19 = anIntArrayArrayArray891[anInt1091][j16 + 1][l17];
        int i20 = anIntArrayArrayArray891[anInt1091][j16 + 1][l17 + 1];
        int l20 = anIntArrayArrayArray891[anInt1091][j16][l17 + 1];
        if (i12 == 0) {
          Class44 class44 = aClass22_1164.method263(anInt1091, 17734,
              j16, l17);
          if (class44 != null) {
            int k21 = class44.anInt726 >> 14 & 0x7fff;
            if (k6 == 2) {
              class44.aClass50_Sub1_Sub4_724 = new Class50_Sub1_Sub4_Sub5(
                  i1, i20, l20, j19, 2, k21, false, l18,
                  4 + j9);
              class44.aClass50_Sub1_Sub4_725 = new Class50_Sub1_Sub4_Sub5(
                  i1, i20, l20, j19, 2, k21, false, l18,
                  j9 + 1 & 3);
            } else {
              class44.aClass50_Sub1_Sub4_724 = new Class50_Sub1_Sub4_Sub5(
                  i1, i20, l20, j19, k6, k21, false, l18, j9);
            }
          }
        }
        if (i12 == 1) {
          Class35 class35 = aClass22_1164.method264(anInt1091, l17,
              j16, false);
          if (class35 != null) {
            class35.aClass50_Sub1_Sub4_608 = new Class50_Sub1_Sub4_Sub5(
                i1, i20, l20, j19, 4,
                class35.anInt609 >> 14 & 0x7fff, false, l18, 0);
          }
        }
        if (i12 == 2) {
          Class5 class5 = aClass22_1164.method265(j16, (byte) 32,
              l17, anInt1091);
          if (k6 == 11) {
            k6 = 10;
          }
          if (class5 != null) {
            class5.renderable = new Class50_Sub1_Sub4_Sub5(i1, i20,
                l20, j19, k6, class5.anInt125 >> 14 & 0x7fff,
                false, l18, j9);
          }
        }
        if (i12 == 3) {
          FloorDecoration class28 = aClass22_1164.method266(
              anInt1091, l17, 0, j16);
          if (class28 != null) {
            class28.renderable = new Class50_Sub1_Sub4_Sub5(i1,
                i20, l20, j19, 22,
                class28.anInt571 >> 14 & 0x7fff, false, l18, j9);
          }
        }
      }
      return;
    }
    if (j == 107) {
      int j1 = class50_sub1_sub2.readUShort();
      int i4 = class50_sub1_sub2.readUByteNeg();
      int l6 = anInt989 + (i4 >> 4 & 7);
      int k9 = anInt990 + (i4 & 7);
      int j12 = class50_sub1_sub2.readUShortSub();
      if (l6 >= 0 && k9 >= 0 && l6 < 104 && k9 < 104) {
        Item class50_sub1_sub4_sub1 = new Item();
        class50_sub1_sub4_sub1.id = j1;
        class50_sub1_sub4_sub1.stackSize = j12;
        if (aClass6ArrayArrayArray1323[anInt1091][l6][k9] == null) {
          aClass6ArrayArrayArray1323[anInt1091][l6][k9] = new Deque();
        }
        aClass6ArrayArrayArray1323[anInt1091][l6][k9]
            .method155(class50_sub1_sub4_sub1);
        method26(l6, k9);
      }
      return;
    }

    //Queue Song
    if (j == 121) {
      int k1 = class50_sub1_sub2.readUByte();
      int j4 = anInt989 + (k1 >> 4 & 7);
      int i7 = anInt990 + (k1 & 7);
      int l9 = class50_sub1_sub2.readUShort();
      int k12 = class50_sub1_sub2.readUShort();
      int k14 = class50_sub1_sub2.readUShort();
      if (j4 >= 0 && i7 >= 0 && j4 < 104 && i7 < 104) {
        Deque class6_1 = aClass6ArrayArrayArray1323[anInt1091][j4][i7];
        if (class6_1 != null) {
          for (Item class50_sub1_sub4_sub1_3 = (Item) class6_1
              .method158(); class50_sub1_sub4_sub1_3 != null;
              class50_sub1_sub4_sub1_3 = (Item) class6_1
                  .method160()) {
            if (class50_sub1_sub4_sub1_3.id != (l9 & 0x7fff)
                || class50_sub1_sub4_sub1_3.stackSize != k12) {
              continue;
            }
            class50_sub1_sub4_sub1_3.stackSize = k14;
            break;
          }

          method26(j4, i7);
        }
      }
      return;
    }
    if (j == 181) {
      int l1 = class50_sub1_sub2.readUByte();
      int k4 = anInt989 + (l1 >> 4 & 7);
      int j7 = anInt990 + (l1 & 7);
      int i10 = k4 + class50_sub1_sub2.readByte();
      int l12 = j7 + class50_sub1_sub2.readByte();
      int l14 = class50_sub1_sub2.readShort();
      int k16 = class50_sub1_sub2.readUShort();
      int i18 = class50_sub1_sub2.readUByte() * 4;
      int i19 = class50_sub1_sub2.readUByte() * 4;
      int k19 = class50_sub1_sub2.readUShort();
      int j20 = class50_sub1_sub2.readUShort();
      int i21 = class50_sub1_sub2.readUByte();
      int j21 = class50_sub1_sub2.readUByte();
      if (k4 >= 0 && j7 >= 0 && k4 < 104 && j7 < 104 && i10 >= 0
          && l12 >= 0 && i10 < 104 && l12 < 104 && k16 != 65535) {
        k4 = k4 * 128 + 64;
        j7 = j7 * 128 + 64;
        i10 = i10 * 128 + 64;
        l12 = l12 * 128 + 64;
        Projectile class50_sub1_sub4_sub2 = new Projectile(anInt1091,
            i19, j21, j7, k16, j20 + anInt1325, i21, l14,
            (byte) -41, method110(j7, k4, (byte) 9, anInt1091)
            - i18, k4, k19 + anInt1325);
        class50_sub1_sub4_sub2.method562(i10, l12,
            method110(l12, i10, (byte) 9, anInt1091) - i19, k19
                + anInt1325);
        aClass6_1282.method155(class50_sub1_sub4_sub2);
      }
      return;
    }
    if (j == 41) {
      int i2 = class50_sub1_sub2.readUByte();
      int l4 = anInt989 + (i2 >> 4 & 7);
      int k7 = anInt990 + (i2 & 7);
      int j10 = class50_sub1_sub2.readUShort();
      int i13 = class50_sub1_sub2.readUByte();
      int i15 = i13 >> 4 & 0xf;
      int l16 = i13 & 7;
      if (localPlayer.anIntArray1586[0] >= l4 - i15
          && localPlayer.anIntArray1586[0] <= l4 + i15
          && localPlayer.anIntArray1587[0] >= k7 - i15
          && localPlayer.anIntArray1587[0] <= k7 + i15
          && soundEffectsVolume && !lowMemory && pendingSounds < 50) {
        pendingSoundIDs[pendingSounds] = j10;
        pendingSoundTypes[pendingSounds] = l16;
        pendingSoundDelays[pendingSounds] = Track.delays[j10];
        pendingSounds++;
      }
    }
    if (j == 59) {
      int j2 = class50_sub1_sub2.readUByte();
      int i5 = anInt989 + (j2 >> 4 & 7);
      int l7 = anInt990 + (j2 & 7);
      int k10 = class50_sub1_sub2.readUShort();
      int j13 = class50_sub1_sub2.readUByte();
      int j15 = class50_sub1_sub2.readUShort();
      if (i5 >= 0 && l7 >= 0 && i5 < 104 && l7 < 104) {
        i5 = i5 * 128 + 64;
        l7 = l7 * 128 + 64;
        Class50_Sub1_Sub4_Sub6 class50_sub1_sub4_sub6 = new Class50_Sub1_Sub4_Sub6(
            i5, anInt1091, method110(l7, i5, (byte) 9, anInt1091)
            - j13, j15, k10, anInt1325, l7);
        aClass6_1210.method155(class50_sub1_sub4_sub6);
      }
      return;
    }
    if (j == 152) {
      int k2 = class50_sub1_sub2.readUByteNeg();
      int j5 = k2 >> 2;
      int i8 = k2 & 3;
      int l10 = anIntArray1032[j5];
      int k13 = class50_sub1_sub2.readShortLESub();
      int k15 = class50_sub1_sub2.readUByteAdd();
      int i17 = anInt989 + (k15 >> 4 & 7);
      int j18 = anInt990 + (k15 & 7);
      if (i17 >= 0 && j18 >= 0 && i17 < 104 && j18 < 104) {
        method145(true, anInt1091, i17, i8, -1, j5, k13, 0, l10, j18);
      }
      return;
    }
    if (j == 208) {
      int l2 = class50_sub1_sub2.readUShortSub();
      int k5 = class50_sub1_sub2.readUByteAdd();
      int j8 = anInt989 + (k5 >> 4 & 7);
      int i11 = anInt990 + (k5 & 7);
      if (j8 >= 0 && i11 >= 0 && j8 < 104 && i11 < 104) {
        Deque class6 = aClass6ArrayArrayArray1323[anInt1091][j8][i11];
        if (class6 != null) {
          for (Item class50_sub1_sub4_sub1_1 = (Item) class6
              .method158(); class50_sub1_sub4_sub1_1 != null;
              class50_sub1_sub4_sub1_1 = (Item) class6
                  .method160()) {
            if (class50_sub1_sub4_sub1_1.id != (l2 & 0x7fff)) {
              continue;
            }
            class50_sub1_sub4_sub1_1.unlink();
            break;
          }

          if (class6.method158() == null) {
            aClass6ArrayArrayArray1323[anInt1091][j8][i11] = null;
          }
          method26(j8, i11);
        }
      }
      return;
    }
    if (j == 88) {
      int i3 = class50_sub1_sub2.readUByteSub();
      int l5 = anInt989 + (i3 >> 4 & 7);
      int k8 = anInt990 + (i3 & 7);
      int j11 = class50_sub1_sub2.readUByteSub();
      int l13 = j11 >> 2;
      int l15 = j11 & 3;
      int j17 = anIntArray1032[l13];
      if (l5 >= 0 && k8 >= 0 && l5 < 104 && k8 < 104) {
        method145(true, anInt1091, l5, l15, -1, l13, -1, 0, j17, k8);
      }
    }
  }

  public void method134() {
    aClass18_1156.method230();
    Canvas.anIntArray1538 = anIntArray1001;
    aClass50_Sub1_Sub1_Sub3_1185.method490(0, 0, -488);
    if (anInt1089 != -1) {
      method142(0, 0, Widget.getWidget(anInt1089), 0, 8);
    } else if (anIntArray1081[anInt1285] != -1) {
      method142(0, 0, Widget.getWidget(anIntArray1081[anInt1285]), 0, 8);
    }
    if (aBoolean1065 && anInt1304 == 1) {
      method128(false);
    }
    aClass18_1156.method231(205, 553, super.aGraphics14, aBoolean1074);
    aClass18_1158.method230();
    Canvas.anIntArray1538 = anIntArray1002;
  }

  public void method136(Character character, int i) {
    method137(character.anInt1610, i, character.anInt1611);
  }

  public void method137(int i, int j, int k) {
    if (i < 128 || k < 128 || i > 13056 || k > 13056) {
      anInt932 = -1;
      anInt933 = -1;
      return;
    }
    int i1 = method110(k, i, (byte) 9, anInt1091) - j;
    i -= anInt1216;
    i1 -= anInt1217;
    k -= anInt1218;
    int j1 = Model.anIntArray1710[anInt1219];
    int k1 = Model.anIntArray1711[anInt1219];
    int l1 = Model.anIntArray1710[anInt1220];
    int i2 = Model.anIntArray1711[anInt1220];
    int j2 = k * l1 + i * i2 >> 16;
    k = k * i2 - i * l1 >> 16;
    i = j2;
    j2 = i1 * k1 - k * j1 >> 16;
    k = i1 * j1 + k * k1 >> 16;
    i1 = j2;
    if (k >= 50) {
      anInt932 = Canvas.anInt1532 + (i << 9) / k;
      anInt933 = Canvas.anInt1533 + (i1 << 9) / k;
		} else {
      anInt932 = -1;
      anInt933 = -1;
		}
  }

  public void method138(boolean flag) {
    System.out.println("============");
    System.out.println("flame-cycle:" + anInt1101);
    if (requester != null) {
      System.out.println("Od-cycle:" + requester.anInt1348);
    }
    System.out.println("loop-cycle:" + anInt1325);
    System.out.println("draw-cycle:" + anInt1309);
    System.out.println("ptype:" + incomingPacketOpcode);
    System.out.println("psize:" + anInt869);
    if (flag) {
      aBoolean1028 = !aBoolean1028;
    }
    if (primaryConnection != null) {
      primaryConnection.debug();
    }
    super.aBoolean11 = true;
  }

  @Override
  public Component method11(int i) {
    while (i >= 0) {
      for (int j = 1; j > 0; j++) {
			}
    }
    if (SignLink.mainapp != null) {
      return SignLink.mainapp;
    }
    if (super.aFrame_Sub1_17 != null) {
      return super.aFrame_Sub1_17;
    } else {
      return this;
    }
  }

  @Override
  public void method13(int i, boolean flag, String s) {
    anInt1322 = i;
    if (!flag) {
      aBoolean934 = !aBoolean934;
    }
    aString1027 = s;
    method64(-188);
    if (aClass2_888 == null) {
      super.method13(i, true, s);
      return;
    }
    aClass18_1200.method230();
    char c = '\u0168';
    char c1 = '\310';
    byte byte0 = 20;
    aClass50_Sub1_Sub1_Sub2_1061.method470(c / 2, 452, c1 / 2 - 26 - byte0,
        0xffffff, "RuneScape is loading - please wait...");
    int j = c1 / 2 - 18 - byte0;
    Rasterizer.method450(0, j, 34, 0x8c1111, c / 2 - 152, 304);
    Rasterizer.method450(0, j + 1, 32, 0, c / 2 - 151, 302);
    Rasterizer.method449(30, j + 2, 0x8c1111, (byte) -24, i * 3,
        c / 2 - 150);
    Rasterizer.method449(30, j + 2, 0, (byte) -24, 300 - i * 3, c / 2 - 150
        + i * 3);
    aClass50_Sub1_Sub1_Sub2_1061.method470(c / 2, 452, c1 / 2 + 5 - byte0,
        0xffffff, s);
    aClass18_1200.method231(171, 202, super.aGraphics14, aBoolean1074);
    if (aBoolean1046) {
      aBoolean1046 = false;
      if (!aBoolean1243) {
        aClass18_1201.method231(0, 0, super.aGraphics14, aBoolean1074);
        aClass18_1202
            .method231(0, 637, super.aGraphics14, aBoolean1074);
      }
      aClass18_1198.method231(0, 128, super.aGraphics14, aBoolean1074);
      aClass18_1199.method231(371, 202, super.aGraphics14, aBoolean1074);
      aClass18_1203.method231(265, 0, super.aGraphics14, aBoolean1074);
      aClass18_1204.method231(265, 562, super.aGraphics14, aBoolean1074);
      aClass18_1205.method231(171, 128, super.aGraphics14, aBoolean1074);
      aClass18_1206.method231(171, 562, super.aGraphics14, aBoolean1074);
    }
  }

  public void method139(boolean flag) {
    byte[] abyte0 = aClass2_888.extract("title.dat");
    ImageRGB class50_sub1_sub1_sub1 = new ImageRGB(abyte0, this);
    aClass18_1201.method230();
    class50_sub1_sub1_sub1.method459(0, -192, 0);
    aClass18_1202.method230();
    class50_sub1_sub1_sub1.method459(0, -192, -637);
    aClass18_1198.method230();
    class50_sub1_sub1_sub1.method459(0, -192, -128);
    aClass18_1199.method230();
    class50_sub1_sub1_sub1.method459(-371, -192, -202);
    aClass18_1200.method230();
    class50_sub1_sub1_sub1.method459(-171, -192, -202);
    aClass18_1203.method230();
    class50_sub1_sub1_sub1.method459(-265, -192, 0);
    aClass18_1204.method230();
    class50_sub1_sub1_sub1.method459(-265, -192, -562);
    aClass18_1205.method230();
    class50_sub1_sub1_sub1.method459(-171, -192, -128);
    aClass18_1206.method230();
    class50_sub1_sub1_sub1.method459(-171, -192, -562);
    int[] ai = new int[class50_sub1_sub1_sub1.anInt1490];
    for (int i = 0; i < class50_sub1_sub1_sub1.anInt1491; i++) {
      for (int j = 0; j < class50_sub1_sub1_sub1.anInt1490; j++) {
        ai[j] = class50_sub1_sub1_sub1.anIntArray1489[class50_sub1_sub1_sub1.anInt1490
            - j - 1 + class50_sub1_sub1_sub1.anInt1490 * i];
      }

			if (class50_sub1_sub1_sub1.anInt1490 >= 0)
				System.arraycopy(ai, 0, class50_sub1_sub1_sub1.anIntArray1489,
						0 + class50_sub1_sub1_sub1.anInt1490 * i, class50_sub1_sub1_sub1.anInt1490);

    }

    aClass18_1201.method230();
    class50_sub1_sub1_sub1.method459(0, -192, 382);
    aClass18_1202.method230();
    class50_sub1_sub1_sub1.method459(0, -192, -255);
    aClass18_1198.method230();
    class50_sub1_sub1_sub1.method459(0, -192, 254);
    aClass18_1199.method230();
    class50_sub1_sub1_sub1.method459(-371, -192, 180);
    aClass18_1200.method230();
    class50_sub1_sub1_sub1.method459(-171, -192, 180);
    aClass18_1203.method230();
    if (flag) {
      for (int k = 1; k > 0; k++) {
			}
    }
    class50_sub1_sub1_sub1.method459(-265, -192, 382);
    aClass18_1204.method230();
    class50_sub1_sub1_sub1.method459(-265, -192, -180);
    aClass18_1205.method230();
    class50_sub1_sub1_sub1.method459(-171, -192, 254);
    aClass18_1206.method230();
    class50_sub1_sub1_sub1.method459(-171, -192, -180);
    class50_sub1_sub1_sub1 = new ImageRGB(aClass2_888, "logo", 0);
    aClass18_1198.method230();
    class50_sub1_sub1_sub1.method461(18,
        382 - class50_sub1_sub1_sub1.anInt1490 / 2 - 128, -488);
    class50_sub1_sub1_sub1 = null;
    abyte0 = null;
    ai = null;
    System.gc();
  }

  public void method140(byte byte0, SpawnObjectNode class50_sub2) {
    int i = 0;
    int j = -1;
    int k = 0;
    int l = 0;
    if (byte0 != -61) {
      outgoingBuffer.writeByte(175);
    }
    if (class50_sub2.anInt1392 == 0) {
      i = aClass22_1164.method267(class50_sub2.anInt1391,
          class50_sub2.anInt1393, class50_sub2.anInt1394);
    }
    if (class50_sub2.anInt1392 == 1) {
      i = aClass22_1164.method268(class50_sub2.anInt1393, (byte) 4,
          class50_sub2.anInt1391, class50_sub2.anInt1394);
    }
    if (class50_sub2.anInt1392 == 2) {
      i = aClass22_1164.method269(class50_sub2.anInt1391,
          class50_sub2.anInt1393, class50_sub2.anInt1394);
    }
    if (class50_sub2.anInt1392 == 3) {
      i = aClass22_1164.method270(class50_sub2.anInt1391,
          class50_sub2.anInt1393, class50_sub2.anInt1394);
    }
    if (i != 0) {
      int i1 = aClass22_1164.method271(class50_sub2.anInt1391,
          class50_sub2.anInt1393, class50_sub2.anInt1394, i);
      j = i >> 14 & 0x7fff;
      k = i1 & 0x1f;
      l = i1 >> 6;
    }
    class50_sub2.anInt1387 = j;
    class50_sub2.anInt1389 = k;
    class50_sub2.anInt1388 = l;
  }

  public void method141(int i) {
    aBoolean1243 = false;
    while (aBoolean1320) {
      aBoolean1243 = false;
      try {
        Thread.sleep(50L);
      } catch (Exception _ex) {
      }
    }
    aClass50_Sub1_Sub1_Sub3_1292 = null;
    aClass50_Sub1_Sub1_Sub3_1293 = null;
    aClass50_Sub1_Sub1_Sub3Array1117 = null;
    anIntArray1310 = null;
    anIntArray1311 = null;
    if (i != 28614) {
      aBoolean1074 = !aBoolean1074;
    }
    anIntArray1312 = null;
    anIntArray1313 = null;
    anIntArray1176 = null;
    anIntArray1177 = null;
    anIntArray1084 = null;
    anIntArray1085 = null;
    aClass50_Sub1_Sub1_Sub1_1017 = null;
    aClass50_Sub1_Sub1_Sub1_1018 = null;
  }

  public void method142(int i, int j, Widget class13, int k, int l) {
    if (class13.anInt236 != 0 || class13.anIntArray258 == null) {
      return;
    }
    if (class13.aBoolean219 && anInt1302 != class13.anInt215
        && anInt1280 != class13.anInt215
        && anInt1106 != class13.anInt215) {
      return;
    }
    int i1 = Rasterizer.anInt1429;
    int j1 = Rasterizer.anInt1427;
    int k1 = Rasterizer.anInt1430;
    int l1 = Rasterizer.anInt1428;
    Rasterizer.method446(i, j, i + class13.anInt238, j + class13.anInt241,
        true);
    int i2 = class13.anIntArray258.length;
    if (l != 8) {
      incomingPacketOpcode = -1;
    }
    for (int j2 = 0; j2 < i2; j2++) {
      int k2 = class13.anIntArray232[j2] + j;
      int l2 = class13.anIntArray276[j2] + i - k;
      Widget class13_1 = Widget.getWidget(class13.anIntArray258[j2]);
      k2 += class13_1.anInt228;
      l2 += class13_1.anInt259;
      if (class13_1.anInt242 > 0) {
        method103((byte) 2, class13_1);
      }
      if (class13_1.anInt236 == 0) {
        if (class13_1.anInt231 > class13_1.anInt285
            - class13_1.anInt238) {
          class13_1.anInt231 = class13_1.anInt285
              - class13_1.anInt238;
        }
        if (class13_1.anInt231 < 0) {
          class13_1.anInt231 = 0;
        }
        method142(l2, k2, class13_1, class13_1.anInt231, 8);
        if (class13_1.anInt285 > class13_1.anInt238) {
          method56(true, class13_1.anInt231, k2 + class13_1.anInt241,
              class13_1.anInt238, class13_1.anInt285, l2);
        }
      } else if (class13_1.anInt236 != 1) {
        if (class13_1.anInt236 == 2) {
          int i3 = 0;
          for (int i4 = 0; i4 < class13_1.anInt238; i4++) {
            for (int j5 = 0; j5 < class13_1.anInt241; j5++) {
              int i6 = k2 + j5 * (32 + class13_1.anInt263);
              int l6 = l2 + i4 * (32 + class13_1.anInt244);
              if (i3 < 20) {
                i6 += class13_1.anIntArray221[i3];
                l6 += class13_1.anIntArray213[i3];
              }
              if (class13_1.anIntArray269[i3] > 0) {
                int i7 = 0;
                int j8 = 0;
                int l10 = class13_1.anIntArray269[i3] - 1;
                if (i6 > Rasterizer.anInt1429 - 32
                    && i6 < Rasterizer.anInt1430
                    && l6 > Rasterizer.anInt1427 - 32
                    && l6 < Rasterizer.anInt1428
                    || anInt1113 != 0 && anInt1112 == i3) {
                  int k11 = 0;
                  if (anInt1146 == 1 && anInt1147 == i3
                      && anInt1148 == class13_1.anInt215) {
                    k11 = 0xffffff;
                  }
                  ImageRGB class50_sub1_sub1_sub1_2 = ItemDefinition
                      .method221(
                          (byte) -33,
                          k11,
                          class13_1.anIntArray224[i3],
                          l10);
                  if (class50_sub1_sub1_sub1_2 != null) {
                    if (anInt1113 != 0
                        && anInt1112 == i3
                        && anInt1111 == class13_1.anInt215) {
                      i7 = super.anInt22 - anInt1114;
                      j8 = super.anInt23 - anInt1115;
                      if (i7 < 5 && i7 > -5) {
                        i7 = 0;
                      }
                      if (j8 < 5 && j8 > -5) {
                        j8 = 0;
                      }
                      if (anInt1269 < 5) {
                        i7 = 0;
                        j8 = 0;
                      }
                      class50_sub1_sub1_sub1_2.method463(
                          0, i6 + i7, l6 + j8, 128);
                      if (l6 + j8 < Rasterizer.anInt1427
                          && class13.anInt231 > 0) {
                        int i12 = anInt951
                            * (Rasterizer.anInt1427
                            - l6 - j8) / 3;
                        if (i12 > anInt951 * 10) {
                          i12 = anInt951 * 10;
                        }
                        if (i12 > class13.anInt231) {
                          i12 = class13.anInt231;
                        }
                        class13.anInt231 -= i12;
                        anInt1115 += i12;
                      }
                      if (l6 + j8 + 32 > Rasterizer.anInt1428
                          && class13.anInt231 < class13.anInt285
                          - class13.anInt238) {
                        int j12 = anInt951
                            * (l6 + j8 + 32 - Rasterizer.anInt1428)
                            / 3;
                        if (j12 > anInt951 * 10) {
                          j12 = anInt951 * 10;
                        }
                        if (j12 > class13.anInt285
                            - class13.anInt238
                            - class13.anInt231) {
                          j12 = class13.anInt285
                              - class13.anInt238
                              - class13.anInt231;
                        }
                        class13.anInt231 += j12;
                        anInt1115 -= j12;
                      }
                    } else if (anInt1332 != 0
                        && anInt1331 == i3
                        && anInt1330 == class13_1.anInt215) {
                      class50_sub1_sub1_sub1_2.method463(
                          0, i6, l6, 128);
                    } else {
                      class50_sub1_sub1_sub1_2.method461(
                          l6, i6, -488);
                    }
                    if (class50_sub1_sub1_sub1_2.anInt1494 == 33
                        || class13_1.anIntArray224[i3] != 1) {
                      int k12 = class13_1.anIntArray224[i3];
                      aClass50_Sub1_Sub1_Sub2_1059
                          .method474(2245, i6 + 1
                                  + i7, 0, l6 + 10
                                  + j8,
                              method20(k12, -243));
                      aClass50_Sub1_Sub1_Sub2_1059
                          .method474(2245, i6 + i7,
                              0xffff00, l6 + 9
                                  + j8,
                              method20(k12, -243));
                    }
                  }
                }
              } else if (class13_1.aClass50_Sub1_Sub1_Sub1Array265 != null
                  && i3 < 20) {
                ImageRGB class50_sub1_sub1_sub1_1 = class13_1.aClass50_Sub1_Sub1_Sub1Array265[i3];
                if (class50_sub1_sub1_sub1_1 != null) {
                  class50_sub1_sub1_sub1_1.method461(l6, i6,
                      -488);
                }
              }
              i3++;
            }

          }

        } else if (class13_1.anInt236 == 3) {
          boolean flag = anInt1106 == class13_1.anInt215
							|| anInt1280 == class13_1.anInt215
							|| anInt1302 == class13_1.anInt215;
					int j3;
          if (method95(class13_1, -693)) {
            j3 = class13_1.anInt260;
            if (flag && class13_1.anInt226 != 0) {
              j3 = class13_1.anInt226;
            }
          } else {
            j3 = class13_1.anInt240;
            if (flag && class13_1.anInt261 != 0) {
              j3 = class13_1.anInt261;
            }
          }
          if (class13_1.aByte220 == 0) {
            if (class13_1.aBoolean239) {
              Rasterizer.method449(class13_1.anInt238, l2, j3,
                  (byte) -24, class13_1.anInt241, k2);
            } else {
              Rasterizer.method450(0, l2, class13_1.anInt238, j3,
                  k2, class13_1.anInt241);
            }
          } else if (class13_1.aBoolean239) {
            Rasterizer.method448(false, j3, l2, class13_1.anInt241,
                class13_1.anInt238,
                256 - (class13_1.aByte220 & 0xff), k2);
          } else {
            Rasterizer.method451(k2, class13_1.anInt241, j3,
                class13_1.anInt238, l2,
                256 - (class13_1.aByte220 & 0xff), (byte) -113);
          }
        } else if (class13_1.anInt236 == 4) {
          Class50_Sub1_Sub1_Sub2 class50_sub1_sub1_sub2 = class13_1.aClass50_Sub1_Sub1_Sub2_237;
          String s = class13_1.aString230;
          boolean flag1 = anInt1106 == class13_1.anInt215
							|| anInt1280 == class13_1.anInt215
							|| anInt1302 == class13_1.anInt215;
					int j4;
          if (method95(class13_1, -693)) {
            j4 = class13_1.anInt260;
            if (flag1 && class13_1.anInt226 != 0) {
              j4 = class13_1.anInt226;
            }
            if (class13_1.aString249.length() > 0) {
              s = class13_1.aString249;
            }
          } else {
            j4 = class13_1.anInt240;
            if (flag1 && class13_1.anInt261 != 0) {
              j4 = class13_1.anInt261;
            }
          }
          if (class13_1.anInt289 == 6 && aBoolean1239) {
            s = "Please wait...";
            j4 = class13_1.anInt240;
          }
          if (Rasterizer.anInt1425 == 479) {
            if (j4 == 0xffff00) {
              j4 = 255;
            }
            if (j4 == 49152) {
              j4 = 0xffffff;
            }
          }
          for (int j7 = l2 + class50_sub1_sub1_sub2.anInt1506; s
              .length() > 0; j7 += class50_sub1_sub1_sub2.anInt1506) {
            if (s.indexOf("%") != -1) {
              do {
                int k8 = s.indexOf("%1");
                if (k8 == -1) {
                  break;
                }
                s = s.substring(0, k8)
                    + method89(method129(3, 0, class13_1),
                    8) + s.substring(k8 + 2);
              } while (true);
              do {
                int l8 = s.indexOf("%2");
                if (l8 == -1) {
                  break;
                }
                s = s.substring(0, l8)
                    + method89(method129(3, 1, class13_1),
                    8) + s.substring(l8 + 2);
              } while (true);
              do {
                int i9 = s.indexOf("%3");
                if (i9 == -1) {
                  break;
                }
                s = s.substring(0, i9)
                    + method89(method129(3, 2, class13_1),
                    8) + s.substring(i9 + 2);
              } while (true);
              do {
                int j9 = s.indexOf("%4");
                if (j9 == -1) {
                  break;
                }
                s = s.substring(0, j9)
                    + method89(method129(3, 3, class13_1),
                    8) + s.substring(j9 + 2);
              } while (true);
              do {
                int k9 = s.indexOf("%5");
                if (k9 == -1) {
                  break;
                }
                s = s.substring(0, k9)
                    + method89(method129(3, 4, class13_1),
                    8) + s.substring(k9 + 2);
              } while (true);
            }
            int l9 = s.indexOf("\\n");
            String s3;
            if (l9 != -1) {
              s3 = s.substring(0, l9);
              s = s.substring(l9 + 2);
            } else {
              s3 = s;
              s = "";
            }
            if (class13_1.aBoolean272) {
              class50_sub1_sub1_sub2.method471(
                  class13_1.aBoolean247, anInt1056, j4, j7,
                  k2 + class13_1.anInt241 / 2, s3);
            } else {
              class50_sub1_sub1_sub2.method478(j4, k2, j7,
                  class13_1.aBoolean247, s3, -39629);
            }
          }

        } else if (class13_1.anInt236 == 5) {
          ImageRGB class50_sub1_sub1_sub1;
          if (method95(class13_1, -693)) {
            class50_sub1_sub1_sub1 = class13_1.aClass50_Sub1_Sub1_Sub1_245;
          } else {
            class50_sub1_sub1_sub1 = class13_1.aClass50_Sub1_Sub1_Sub1_212;
          }
          if (class50_sub1_sub1_sub1 != null) {
            class50_sub1_sub1_sub1.method461(l2, k2, -488);
          }
        } else if (class13_1.anInt236 == 6) {
          int k3 = Canvas.anInt1532;
          int k4 = Canvas.anInt1533;
          Canvas.anInt1532 = k2 + class13_1.anInt241
              / 2;
          Canvas.anInt1533 = l2 + class13_1.anInt238
              / 2;
          int k5 = Canvas.anIntArray1536[class13_1.anInt252]
              * class13_1.anInt251 >> 16;
          int j6 = Canvas.anIntArray1537[class13_1.anInt252]
              * class13_1.anInt251 >> 16;
          boolean flag2 = method95(class13_1, -693);
          int k7;
          if (flag2) {
            k7 = class13_1.anInt287;
          } else {
            k7 = class13_1.anInt286;
          }
          Model class50_sub1_sub4_sub4;
          if (k7 == -1) {
            class50_sub1_sub4_sub4 = class13_1.method203(-1, -1, 0,
                flag2);
          } else {
            AnimationSequence class14 = AnimationSequence.animationSequences[k7];
            class50_sub1_sub4_sub4 = class13_1.method203(
                class14.anIntArray295[class13_1.anInt235],
                class14.anIntArray296[class13_1.anInt235], 0,
                flag2);
          }
          if (class50_sub1_sub4_sub4 != null) {
            class50_sub1_sub4_sub4.method598(0, class13_1.anInt253,
                0, class13_1.anInt252, 0, k5, j6);
          }
          Canvas.anInt1532 = k3;
          Canvas.anInt1533 = k4;
        } else {
          if (class13_1.anInt236 == 7) {
            Class50_Sub1_Sub1_Sub2 class50_sub1_sub1_sub2_1 = class13_1.aClass50_Sub1_Sub1_Sub2_237;
            int l4 = 0;
            for (int l5 = 0; l5 < class13_1.anInt238; l5++) {
              for (int k6 = 0; k6 < class13_1.anInt241; k6++) {
                if (class13_1.anIntArray269[l4] > 0) {
                  ItemDefinition definition = ItemDefinition
                      .getDefinition(class13_1.anIntArray269[l4] - 1);
                  String s6 = String.valueOf(definition.name);
                  if (definition.aBoolean371
                      || class13_1.anIntArray224[l4] != 1) {
                    s6 = s6
                        + " x"
                        + getNameFromAmount(class13_1.anIntArray224[l4]);
                  }
                  int i10 = k2 + k6
                      * (115 + class13_1.anInt263);
                  int i11 = l2 + l5
                      * (12 + class13_1.anInt244);
                  if (class13_1.aBoolean272) {
                    class50_sub1_sub1_sub2_1.method471(
                        class13_1.aBoolean247,
                        anInt1056, class13_1.anInt240,
                        i11, i10 + class13_1.anInt241
                            / 2, s6);
                  } else {
                    class50_sub1_sub1_sub2_1.method478(
                        class13_1.anInt240, i10, i11,
                        class13_1.aBoolean247, s6,
                        -39629);
                  }
                }
                l4++;
              }

            }

          }
          if (class13_1.anInt236 == 8
              && (anInt1284 == class13_1.anInt215
              || anInt1044 == class13_1.anInt215 || anInt1129 == class13_1.anInt215)
              && anInt893 == 100) {
            int l3 = 0;
            int i5 = 0;
            Class50_Sub1_Sub1_Sub2 class50_sub1_sub1_sub2_2 = aClass50_Sub1_Sub1_Sub2_1060;
            for (String s1 = class13_1.aString230; s1.length() > 0; ) {
              int l7 = s1.indexOf("\\n");
              String s4;
              if (l7 != -1) {
                s4 = s1.substring(0, l7);
                s1 = s1.substring(l7 + 2);
              } else {
                s4 = s1;
                s1 = "";
              }
              int j10 = class50_sub1_sub1_sub2_2.method472(
                  (byte) 35, s4);
              if (j10 > l3) {
                l3 = j10;
              }
              i5 += class50_sub1_sub1_sub2_2.anInt1506 + 1;
            }

            l3 += 6;
            i5 += 7;
            int i8 = k2 + class13_1.anInt241 - 5 - l3;
            int k10 = l2 + class13_1.anInt238 + 5;
            if (i8 < k2 + 5) {
              i8 = k2 + 5;
            }
            if (i8 + l3 > j + class13.anInt241) {
              i8 = j + class13.anInt241 - l3;
            }
            if (k10 + i5 > i + class13.anInt238) {
              k10 = i + class13.anInt238 - i5;
            }
            Rasterizer.method449(i5, k10, 0xffffa0, (byte) -24, l3,
                i8);
            Rasterizer.method450(0, k10, i5, 0, i8, l3);
            String s2 = class13_1.aString230;
            for (int j11 = k10 + class50_sub1_sub1_sub2_2.anInt1506
                + 2; s2.length() > 0; j11 += class50_sub1_sub1_sub2_2.anInt1506 + 1) {
              int l11 = s2.indexOf("\\n");
              String s5;
              if (l11 != -1) {
                s5 = s2.substring(0, l11);
                s2 = s2.substring(l11 + 2);
              } else {
                s5 = s2;
                s2 = "";
              }
              class50_sub1_sub1_sub2_2.method478(0, i8 + 3, j11,
                  false, s5, -39629);
            }

          }
        }
      }
    }

    Rasterizer.method446(j1, i1, l1, k1, true);
  }

  public void method143(byte byte0) {
    if (byte0 != -40) {
      aBoolean1207 = !aBoolean1207;
    }
    if (lowMemory && anInt1071 == 2 && Region.anInt162 != anInt1091) {
      method125(-332, null, "Loading - please wait.");
      anInt1071 = 1;
      aLong1229 = System.currentTimeMillis();
    }
    if (anInt1071 == 1) {
      int i = method144(5);
      if (i != 0 && System.currentTimeMillis() - aLong1229 > 0x57e40L) {
        SignLink.reporterror(aString1092 + " glcfb " + aLong930 + ","
            + i + "," + lowMemory + "," + aClass23Array1228[0]
            + "," + requester.method333() + "," + anInt1091 + ","
            + anInt889 + "," + anInt890);
        aLong1229 = System.currentTimeMillis();
      }
    }
    if (anInt1071 == 2 && anInt1091 != anInt1276) {
      anInt1276 = anInt1091;
      method115(anInt1091, 0);
    }
  }

  public int method144(int i) {
    for (int j = 0; j < aByteArrayArray838.length; j++) {
      if (aByteArrayArray838[j] == null && anIntArray857[j] != -1) {
        return -1;
      }
      if (aByteArrayArray1232[j] == null && anIntArray858[j] != -1) {
        return -2;
      }
    }

    boolean flag = true;
    if (i < 5 || i > 5) {
      aBoolean953 = !aBoolean953;
    }
    for (int k = 0; k < aByteArrayArray838.length; k++) {
      byte[] abyte0 = aByteArrayArray1232[k];
      if (abyte0 != null) {
        int l = (anIntArray856[k] >> 8) * 64 - anInt1040;
        int i1 = (anIntArray856[k] & 0xff) * 64 - anInt1041;
        if (aBoolean1163) {
          l = 10;
          i1 = 10;
        }
        flag &= Region.method181(l, i1, abyte0, 24515);
      }
    }

    if (!flag) {
      return -3;
    }
    if (aBoolean1209) {
      return -4;
    } else {
      anInt1071 = 2;
      Region.anInt162 = anInt1091;
      method93(175);
      outgoingBuffer.writeByteIsaac(6);
      return 0;
    }
  }

  public void method145(boolean flag, int i, int j, int k, int l, int i1,
      int j1, int k1, int l1, int i2) {
    SpawnObjectNode class50_sub2 = null;
    for (SpawnObjectNode class50_sub2_1 = (SpawnObjectNode) aClass6_1261
        .method158(); class50_sub2_1 != null; class50_sub2_1 = (SpawnObjectNode) aClass6_1261
        .method160()) {
      if (class50_sub2_1.anInt1391 != i || class50_sub2_1.anInt1393 != j
          || class50_sub2_1.anInt1394 != i2
          || class50_sub2_1.anInt1392 != l1) {
        continue;
      }
      class50_sub2 = class50_sub2_1;
      break;
    }

    if (class50_sub2 == null) {
      class50_sub2 = new SpawnObjectNode();
      class50_sub2.anInt1391 = i;
      class50_sub2.anInt1392 = l1;
      class50_sub2.anInt1393 = j;
      class50_sub2.anInt1394 = i2;
      method140((byte) -61, class50_sub2);
      aClass6_1261.method155(class50_sub2);
    }
    class50_sub2.anInt1384 = j1;
    class50_sub2.anInt1386 = i1;
    class50_sub2.anInt1385 = k;
    class50_sub2.anInt1395 = k1;
    class50_sub2.anInt1390 = l;
    aBoolean1137 &= flag;
  }

  public void method146(byte byte0) {
    if (byte0 != 4) {
      return;
    }
    if (anInt1050 != 0) {
      return;
    }
    if (super.anInt28 == 1) {
      int i = super.anInt29 - 25 - 550;
      int j = super.anInt30 - 5 - 4;
      if (i >= 0 && j >= 0 && i < 146 && j < 151) {
        i -= 73;
        j -= 75;
        int k = anInt1252 + anInt916 & 0x7ff;
        int l = Canvas.anIntArray1536[k];
        int i1 = Canvas.anIntArray1537[k];
        l = l * (anInt1233 + 256) >> 8;
        i1 = i1 * (anInt1233 + 256) >> 8;
        int j1 = j * l + i * i1 >> 11;
        int k1 = j * i1 - i * l >> 11;
        int l1 = localPlayer.anInt1610 + j1 >> 7;
        int i2 = localPlayer.anInt1611 - k1 >> 7;
        boolean flag = method35(true, false, i2,
            localPlayer.anIntArray1587[0], 0, 0, 1,
            0, l1, 0, 0,
            localPlayer.anIntArray1586[0]);
        if (flag) {
          outgoingBuffer.writeByte(i);
          outgoingBuffer.writeByte(j);
          outgoingBuffer.writeShort(anInt1252);
          outgoingBuffer.writeByte(57);
          outgoingBuffer.writeByte(anInt916);
          outgoingBuffer.writeByte(anInt1233);
          outgoingBuffer.writeByte(89);
          outgoingBuffer
              .writeShort(localPlayer.anInt1610);
          outgoingBuffer
              .writeShort(localPlayer.anInt1611);
          outgoingBuffer.writeByte(anInt1126);
          outgoingBuffer.writeByte(63);
        }
      }
    }
  }

  public void method147(int i) {
    if (super.aClass18_15 != null) {
      return;
    }
    method141(28614);
    aClass18_1198 = null;
    aClass18_1199 = null;
    aClass18_1200 = null;
    if (i >= 0) {
      anInt1004 = -4;
    }
    aClass18_1201 = null;
    aClass18_1202 = null;
    aClass18_1203 = null;
    aClass18_1204 = null;
    aClass18_1205 = null;
    aClass18_1206 = null;
    aClass18_1159 = null;
    aClass18_1157 = null;
    aClass18_1156 = null;
    aClass18_1158 = null;
    aClass18_1108 = null;
    aClass18_1109 = null;
    aClass18_1110 = null;
    super.aClass18_15 = new ProducingGraphicsBuffer(503, (byte) -12,
        method11(-756), 765);
    aBoolean1046 = true;
  }

  public boolean method148(int i, String s) {
    if (s == null) {
      return false;
    }
    for (int j = 0; j < anInt859; j++) {
      if (s.equalsIgnoreCase(aStringArray849[j])) {
        return true;
      }
    }

    if (i != 13292) {
      aBoolean1014 = !aBoolean1014;
    }
    return s.equalsIgnoreCase(localPlayer.name);
  }

  public void method149(int i) {
    while (i >= 0) {
      incomingPacketOpcode = buffer.readUByte();
    }
    if (anInt1225 == 0) {
      int j = super.anInt12 / 2 - 80;
      int i1 = super.anInt13 / 2 + 20;
      i1 += 20;
      if (super.anInt28 == 1 && super.anInt29 >= j - 75
          && super.anInt29 <= j + 75 && super.anInt30 >= i1 - 20
          && super.anInt30 <= i1 + 20) {
        anInt1225 = 3;
        anInt977 = 0;
      }
      j = super.anInt12 / 2 + 80;
      if (super.anInt28 == 1 && super.anInt29 >= j - 75
          && super.anInt29 <= j + 75 && super.anInt30 >= i1 - 20
          && super.anInt30 <= i1 + 20) {
        aString957 = "";
        aString958 = "Enter your username & password.";
        anInt1225 = 2;
        anInt977 = 0;
			}
    } else {
      if (anInt1225 == 2) {
        int k = super.anInt13 / 2 - 40;
        k += 30;
        k += 25;
        if (super.anInt28 == 1 && super.anInt30 >= k - 15
            && super.anInt30 < k) {
          anInt977 = 0;
        }
        k += 15;
        if (super.anInt28 == 1 && super.anInt30 >= k - 15
            && super.anInt30 < k) {
          anInt977 = 1;
        }
        k += 15;
        int j1 = super.anInt12 / 2 - 80;
        int l1 = super.anInt13 / 2 + 50;
        l1 += 20;
        if (super.anInt28 == 1 && super.anInt29 >= j1 - 75
            && super.anInt29 <= j1 + 75 && super.anInt30 >= l1 - 20
            && super.anInt30 <= l1 + 20) {
          anInt850 = 0;
          method79(aString1092, aString1093, false);
          if (aBoolean1137) {
            return;
          }
        }
        j1 = super.anInt12 / 2 + 80;
        if (super.anInt28 == 1 && super.anInt29 >= j1 - 75
            && super.anInt29 <= j1 + 75 && super.anInt30 >= l1 - 20
            && super.anInt30 <= l1 + 20) {
          anInt1225 = 0;
          aString1092 = "";
          aString1093 = "";
        }
        do {
          int i2 = method5(-983);
          if (i2 == -1) {
            break;
          }
          boolean flag = false;
          for (int j2 = 0; j2 < aString1007.length(); j2++) {
            if (i2 != aString1007.charAt(j2)) {
              continue;
            }
            flag = true;
            break;
          }

          if (anInt977 == 0) {
            if (i2 == 8 && aString1092.length() > 0) {
              aString1092 = aString1092.substring(0,
                  aString1092.length() - 1);
            }
            if (i2 == 9 || i2 == 10 || i2 == 13) {
              anInt977 = 1;
            }
            if (flag) {
              aString1092 += (char) i2;
            }
            if (aString1092.length() > 12) {
              aString1092 = aString1092.substring(0, 12);
            }
          } else if (anInt977 == 1) {
            if (i2 == 8 && aString1093.length() > 0) {
              aString1093 = aString1093.substring(0,
                  aString1093.length() - 1);
            }
            if (i2 == 9 || i2 == 10 || i2 == 13) {
              anInt977 = 0;
            }
            if (flag) {
              aString1093 += (char) i2;
            }
            if (aString1093.length() > 20) {
              aString1093 = aString1093.substring(0, 20);
            }
          }
        } while (true);
        return;
      }
      if (anInt1225 == 3) {
        int l = super.anInt12 / 2;
        int k1 = super.anInt13 / 2 + 50;
        k1 += 20;
        if (super.anInt28 == 1 && super.anInt29 >= l - 75
            && super.anInt29 <= l + 75 && super.anInt30 >= k1 - 20
            && super.anInt30 <= k1 + 20) {
          anInt1225 = 0;
        }
      }
    }
  }

  public void method150(int i, int j, int k, int l, int i1, int j1) {
    int k1 = aClass22_1164.method267(j, k, i);
    i1 = 62 / i1;
    if (k1 != 0) {
      int l1 = aClass22_1164.method271(j, k, i, k1);
      int k2 = l1 >> 6 & 3;
      int i3 = l1 & 0x1f;
      int k3 = j1;
      if (k1 > 0) {
        k3 = l;
      }
      int[] ai = aClass50_Sub1_Sub1_Sub1_1122.anIntArray1489;
      int k4 = 24624 + k * 4 + (103 - i) * 512 * 4;
      int i5 = k1 >> 14 & 0x7fff;
      GameObjectDefinition class47_2 = GameObjectDefinition.forId(i5);
      if (class47_2.anInt795 != -1) {
        IndexedImage class50_sub1_sub1_sub3_2 = aClass50_Sub1_Sub1_Sub3Array1153[class47_2.anInt795];
        if (class50_sub1_sub1_sub3_2 != null) {
          int i6 = (class47_2.anInt801 * 4 - class50_sub1_sub1_sub3_2.anInt1518) / 2;
          int j6 = (class47_2.anInt775 * 4 - class50_sub1_sub1_sub3_2.anInt1519) / 2;
          class50_sub1_sub1_sub3_2.method490(48
              + (104 - i - class47_2.anInt775) * 4 + j6, 48 + k
              * 4 + i6, -488);
        }
      } else {
        if (i3 == 0 || i3 == 2) {
          if (k2 == 0) {
            ai[k4] = k3;
            ai[k4 + 512] = k3;
            ai[k4 + 1024] = k3;
            ai[k4 + 1536] = k3;
          } else if (k2 == 1) {
            ai[k4] = k3;
            ai[k4 + 1] = k3;
            ai[k4 + 2] = k3;
            ai[k4 + 3] = k3;
          } else if (k2 == 2) {
            ai[k4 + 3] = k3;
            ai[k4 + 3 + 512] = k3;
            ai[k4 + 3 + 1024] = k3;
            ai[k4 + 3 + 1536] = k3;
          } else if (k2 == 3) {
            ai[k4 + 1536] = k3;
            ai[k4 + 1536 + 1] = k3;
            ai[k4 + 1536 + 2] = k3;
            ai[k4 + 1536 + 3] = k3;
          }
        }
        if (i3 == 3) {
          if (k2 == 0) {
            ai[k4] = k3;
          } else if (k2 == 1) {
            ai[k4 + 3] = k3;
          } else if (k2 == 2) {
            ai[k4 + 3 + 1536] = k3;
          } else if (k2 == 3) {
            ai[k4 + 1536] = k3;
          }
        }
        if (i3 == 2) {
          if (k2 == 3) {
            ai[k4] = k3;
            ai[k4 + 512] = k3;
            ai[k4 + 1024] = k3;
            ai[k4 + 1536] = k3;
          } else if (k2 == 0) {
            ai[k4] = k3;
            ai[k4 + 1] = k3;
            ai[k4 + 2] = k3;
            ai[k4 + 3] = k3;
          } else if (k2 == 1) {
            ai[k4 + 3] = k3;
            ai[k4 + 3 + 512] = k3;
            ai[k4 + 3 + 1024] = k3;
            ai[k4 + 3 + 1536] = k3;
          } else if (k2 == 2) {
            ai[k4 + 1536] = k3;
            ai[k4 + 1536 + 1] = k3;
            ai[k4 + 1536 + 2] = k3;
            ai[k4 + 1536 + 3] = k3;
          }
        }
      }
    }
    k1 = aClass22_1164.method269(j, k, i);
    if (k1 != 0) {
      int i2 = aClass22_1164.method271(j, k, i, k1);
      int l2 = i2 >> 6 & 3;
      int j3 = i2 & 0x1f;
      int l3 = k1 >> 14 & 0x7fff;
      GameObjectDefinition class47_1 = GameObjectDefinition.forId(l3);
      if (class47_1.anInt795 != -1) {
        IndexedImage class50_sub1_sub1_sub3_1 = aClass50_Sub1_Sub1_Sub3Array1153[class47_1.anInt795];
        if (class50_sub1_sub1_sub3_1 != null) {
          int j5 = (class47_1.anInt801 * 4 - class50_sub1_sub1_sub3_1.anInt1518) / 2;
          int k5 = (class47_1.anInt775 * 4 - class50_sub1_sub1_sub3_1.anInt1519) / 2;
          class50_sub1_sub1_sub3_1.method490(48
              + (104 - i - class47_1.anInt775) * 4 + k5, 48 + k
              * 4 + j5, -488);
        }
      } else if (j3 == 9) {
        int l4 = 0xeeeeee;
        if (k1 > 0) {
          l4 = 0xee0000;
        }
        int[] ai1 = aClass50_Sub1_Sub1_Sub1_1122.anIntArray1489;
        int l5 = 24624 + k * 4 + (103 - i) * 512 * 4;
        if (l2 == 0 || l2 == 2) {
          ai1[l5 + 1536] = l4;
          ai1[l5 + 1024 + 1] = l4;
          ai1[l5 + 512 + 2] = l4;
          ai1[l5 + 3] = l4;
        } else {
          ai1[l5] = l4;
          ai1[l5 + 512 + 1] = l4;
          ai1[l5 + 1024 + 2] = l4;
          ai1[l5 + 1536 + 3] = l4;
        }
      }
    }
    k1 = aClass22_1164.method270(j, k, i);
    if (k1 != 0) {
      int j2 = k1 >> 14 & 0x7fff;
      GameObjectDefinition class47 = GameObjectDefinition.forId(j2);
      if (class47.anInt795 != -1) {
        IndexedImage class50_sub1_sub1_sub3 = aClass50_Sub1_Sub1_Sub3Array1153[class47.anInt795];
        if (class50_sub1_sub1_sub3 != null) {
          int i4 = (class47.anInt801 * 4 - class50_sub1_sub1_sub3.anInt1518) / 2;
          int j4 = (class47.anInt775 * 4 - class50_sub1_sub1_sub3.anInt1519) / 2;
          class50_sub1_sub1_sub3.method490(48
              + (104 - i - class47.anInt775) * 4 + j4, 48 + k * 4
              + i4, -488);
        }
      }
    }
  }

  public void method151(int i) {
    anInt1138++;
    method119(0, true);
    method57(751, true);
    method119(0, false);
    method57(751, false);
    method51(false);
    method76(-992);
    if (!aBoolean1211) {
      int j = anInt1251;
      if (anInt1289 / 256 > j) {
        j = anInt1289 / 256;
      }
      if (aBooleanArray927[4] && anIntArray852[4] + 128 > j) {
        j = anIntArray852[4] + 128;
      }
      int l = anInt1252 + anInt1255 & 0x7ff;
      method94(
          method110(localPlayer.anInt1611,
              localPlayer.anInt1610, (byte) 9,
              anInt1091) - 50, anInt1262, j, 600 + j * 3, l,
          anInt1263, (byte) -103);
    }
    int k;
    if (!aBoolean1211) {
      k = method117((byte) 1);
    } else {
      k = method118(-276);
    }
    int i1 = anInt1216;
    int j1 = anInt1217;
    int k1 = anInt1218;
    int l1 = anInt1219;
    int i2 = anInt1220;
    if (i != 2) {
      anInt1004 = encryption.nextKey();
    }
    for (int j2 = 0; j2 < 5; j2++) {
      if (aBooleanArray927[j2]) {
        int k2 = (int) (Math.random()
            * (double) (anIntArray1105[j2] * 2 + 1)
            - (double) anIntArray1105[j2] + Math
            .sin((double) anIntArray1145[j2]
                * ((double) anIntArray991[j2] / 100D))
            * (double) anIntArray852[j2]);
        if (j2 == 0) {
          anInt1216 += k2;
        }
        if (j2 == 1) {
          anInt1217 += k2;
        }
        if (j2 == 2) {
          anInt1218 += k2;
        }
        if (j2 == 3) {
          anInt1220 = anInt1220 + k2 & 0x7ff;
        }
        if (j2 == 4) {
          anInt1219 += k2;
          if (anInt1219 < 128) {
            anInt1219 = 128;
          }
          if (anInt1219 > 383) {
            anInt1219 = 383;
          }
        }
      }
    }

    int l2 = Canvas.anInt1547;
    Model.aBoolean1705 = true;
    Model.anInt1708 = 0;
    Model.anInt1706 = super.anInt22 - 4;
    Model.anInt1707 = super.anInt23 - 4;
    Rasterizer.method447(4);
    aClass22_1164.method280(anInt1216, k, 0, anInt1217, anInt1218,
        anInt1220, anInt1219);
    aClass22_1164.method255(anInt897);
    method121(false);
    method127(true);
    method65(l2, -927);
    method109(30729);
    aClass18_1158.method231(4, 4, super.aGraphics14, aBoolean1074);
    anInt1216 = i1;
    anInt1217 = j1;
    anInt1218 = k1;
    anInt1219 = l1;
    anInt1220 = i2;
  }

  public void method152(int i) {
    if (i != -23763) {
      method6();
    }
    for (int j = 0; j < pendingSounds; j++) {
      if (pendingSoundDelays[j] <= 0) {
        boolean flag = false;
        try {
          if (pendingSoundIDs[j] == anInt1272
              && pendingSoundTypes[j] == anInt935) {
            if (!method78(295)) {
              flag = true;
            }
          } else {
            Buffer soundBuffer = Track.data(
                pendingSoundTypes[j], pendingSoundIDs[j]);
            if (System.currentTimeMillis()
                + (long) (soundBuffer.offset / 22) > aLong1250
                + (long) (anInt1179 / 22)) {
              anInt1179 = soundBuffer.offset;
              aLong1250 = System.currentTimeMillis();
              if (saveWaveFile(3, soundBuffer.offset,
                  soundBuffer.payload)) {
                anInt1272 = pendingSoundIDs[j];
                anInt935 = pendingSoundTypes[j];
              } else {
                flag = true;
              }
            }
          }
        } catch (Exception exception) {
          if (SignLink.reporterror) {
            outgoingBuffer.writeByteIsaac(80);
            outgoingBuffer.writeShort(pendingSoundIDs[j] & 0x7fff);
          } else {
            outgoingBuffer.writeByteIsaac(80);
            outgoingBuffer.writeShort(-1);
          }
        }
        if (!flag || pendingSoundDelays[j] == -5) {
          pendingSounds--;
          for (int k = j; k < pendingSounds; k++) {
            pendingSoundIDs[k] = pendingSoundIDs[k + 1];
            pendingSoundTypes[k] = pendingSoundTypes[k + 1];
            pendingSoundDelays[k] = pendingSoundDelays[k + 1];
          }

          j--;
        } else {
          pendingSoundDelays[j] = -5;
        }
      } else {
        pendingSoundDelays[j]--;
      }
    }

    if (previousSong > 0) {
      previousSong -= 20;
      if (previousSong < 0) {
        previousSong = 0;
      }
      if (previousSong == 0 && musicEnabled && !lowMemory) {
        nextSong = currentSong;
        songChanging = true;
        requester.request(2, nextSong);
      }
    }
  }
}
