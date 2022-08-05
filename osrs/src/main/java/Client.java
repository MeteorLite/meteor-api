import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedSignature;
import sign.signlink;

public class Client extends Game {
	public static Client client;
	public static int anInt1038;
	public static Class44_Sub3_Sub4_Sub6_Sub1 aClass44_Sub3_Sub4_Sub6_Sub1_1252;
	public static int localWorldId;
	public static boolean isLowMemory;
	public static int tick;
	public static int portOffset;
	public static int anInt997;
	public static int anInt901;
	public static boolean aBoolean926;
	public static int anInt1132;
	public static boolean isMembersWorld;
	public static int anInt842;
	public static int anInt1235;
	public static int anInt981;
	public static final int[][] anIntArrayArray1241;
	public static final int[] anIntArray1134;
	public static boolean aBoolean960;
	public static int anInt1101;
	public static boolean aBoolean1167;
	public static final int[] anIntArray1236;
	public static int anInt996;
	public static final int[] anIntArray809;
	public static int anInt969;
	public static final BigInteger modulus;
	public static final BigInteger exponent;
	public static int anInt1224;
	public static int anInt1232;
	public static int anInt1151;
	public static int anInt900;
	public static int anInt1227;
	public static int anInt1052;
	public static int anInt1157;
	public static int anInt1195;
	public static int anInt880;
	public static int anInt1028;
	public static int anInt1137;
	public byte aByte836;
	public int anInt869;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1154;
	public byte aByte1014;
	public byte aByte959;
	public int anInt1064;
	public boolean aBoolean976;
	public int anInt994;
	public ComponentImageProducer aComponentImageProducer_862;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1027;
	public Class28 aClass28_924;
	public int anInt1223;
	public int anInt803;
	public boolean aBoolean1017;
	public boolean aBoolean1035;
	public int anInt1176;
	public boolean aBoolean1175;
	public int[] anIntArray1111;
	public byte aByte1251;
	public int anInt1123;
	public int anInt845;
	public int anInt868;
	public boolean aBoolean971;
	public Class28 aClass28_1156;
	public int anInt908;
	public boolean aBoolean1053;
	public ComponentImageProducer aComponentImageProducer_865;
	public int anInt929;
	public int anInt1005;
	public int anInt1260;
	public boolean aBoolean906;
	public ComponentImageProducer aComponentImageProducer_863;
	public int anInt890;
	public int anInt934;
	public ComponentImageProducer aComponentImageProducer_1039;
	public int anInt1255;
	public boolean aBoolean905;
	public int anInt820;
	public Class47 aClass47_942;
	public int anInt811;
	public Class45[] aClass45Array1225;
	public Class28[][][] aClass28ArrayArrayArray816;
	public int[] anIntArray885;
	public Class28 pendingObjectSpawns;
	public int anInt1200;
	public boolean aBoolean917;
	public Class7 aClass7_1108;
	public int anInt1121;
	public int anInt1090;
	public int loadingState;
	public int anInt823;
	public int anInt895;
	public int anInt1219;
	public Class36 worldController;
	public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1077;
	public int anInt1074;
	public Class43_Sub1 aClass43_Sub1_1015;
	public int anInt980;
	public Buffer aBuffer_843;
	public byte aByte1032;
	public int anInt1110;
	public int anInt907;
	public boolean aBoolean1104;
	public int anInt1256;
	public CRC32 aCRC32_979;
	public byte[][] aByteArrayArray886;
	public int anInt999;
	public int anInt1115;
	public int anInt822;
	public Buffer aBuffer_1135;
	public int anInt1220;
	public int anInt1011;
	public int clientPlane;
	public String[] aStringArray950;
	public int[] anIntArray1193;
	public byte aByte1070;
	public int anInt870;
	public int anInt1116;
	public int anInt1086;
	public int anInt1031;
	public Class46 aClass46_944;
	public boolean aBoolean899;
	public int anInt1162;
	public int anInt995;
	public Socket aSocket1004;
	public int[] anIntArray1124;
	public String aString828;
	public int anInt927;
	public int[] anIntArray1083;
	public boolean aBoolean1174;
	public int[] anIntArray1261;
	public int anInt1206;
	public int anInt1257;
	public int anInt1196;
	public byte[][][] tileFlags;
	public int anInt1025;
	public int anInt961;
	public String aString932;
	public Class44_Sub3_Sub4_Sub6_Sub2[] aClass44_Sub3_Sub4_Sub6_Sub2Array1259;
	public int anInt1145;
	public ComponentImageProducer componentImageProducer;
	public String[] aStringArray1114;
	public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1076;
	public int[][] anIntArrayArray986;
	public int anInt966;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1263;
	public int[] anIntArray1244;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_891;
	public int[] anIntArray1243;
	public int[] anIntArray810;
	public int anInt1119;
	public int anInt1258;
	public ComponentImageProducer aComponentImageProducer_1041;
	public int anInt1217;
	public String aString829;
	public String[] aStringArray833;
	public int anInt1000;
	public int[] anIntArray1122;
	public int[] anIntArray1191;
	public int anInt1216;
	public int anInt1055;
	public boolean aBoolean1109;
	public int anInt808;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1155;
	public ComponentImageProducer aComponentImageProducer_852;
	public int[] anIntArray937;
	public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array1215;
	public int anInt918;
	public boolean aBoolean898;
	public int[] anIntArray948;
	public long[] aLongArray1159;
	public String aString933;
	public Class44_Sub3_Sub4_Sub6_Sub1[] aClass44_Sub3_Sub4_Sub6_Sub1Array1120;
	public int[] anIntArray1107;
	public int anInt925;
	public int[] anIntArray936;
	public int[] anIntArray977;
	public byte[][] aByteArrayArray953;
	public int anInt1246;
	public int anInt1165;
	public ComponentImageProducer aComponentImageProducer_1042;
	public int[] anIntArray1048;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1202;
	public int[][][] anIntArrayArrayArray957;
	public int anInt1144;
	public int[] anIntArray1192;
	public int[][] anIntArrayArray1084;
	public int anInt1063;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1201;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1203;
	public boolean aBoolean1249;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1264;
	public Class10 aClass10_1160;
	public int anInt919;
	public int anInt1026;
	public int anInt1248;
	public int[] anIntArray831;
	public boolean aBoolean851;
	public int anInt871;
	public int[] anIntArray1112;
	public int[] anIntArray1065;
	public int anInt1163;
	public int anInt1242;
	public int anInt1082;
	public int anInt1139;
	public byte aByte958;
	public boolean aBoolean928;
	public int anInt806;
	public int[] anIntArray978;
	public ComponentImageProducer aComponentImageProducer_853;
	public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array1229;
	public int anInt1003;
	public int[] anIntArray938;
	public String aString815;
	public int[] anIntArray1092;
	public int[] anIntArray830;
	public int anInt947;
	public ComponentImageProducer aComponentImageProducer_1040;
	public String aString1147;
	public int anInt1254;
	public int anInt1056;
	public boolean aBoolean1069;
	public int[] anIntArray838;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1085;
	public String aString1199;
	public int anInt1198;
	public Buffer[] aBufferArray1125;
	public int anInt834;
	public int[] anIntArray804;
	public long aLong1127;
	public int[] anIntArray832;
	public boolean aBoolean1265;
	public int anInt1016;
	public int anInt821;
	public int[] anIntArray1194;
	public int anInt1142;
	public boolean aBoolean1168;
	public final int[] anIntArray973;
	public int[] anIntArray903;
	public int[] anIntArray939;
	public int[] anIntArray1054;
	public int anInt1166;
	public ComponentImageProducer aComponentImageProducer_1043;
	public int[] anIntArray1093;
	public long[] aLongArray817;
	public int anInt1170;
	public String[] aStringArray949;
	public int anInt1140;
	public boolean aBoolean1080;
	public int anInt1130;
	public int[] anIntArray839;
	public final int[] anIntArray954;
	public int anInt801;
	public byte aByte1071;
	public int[] anIntArray883;
	public int anInt1158;
	public int anInt1131;
	public int anInt922;
	public int anInt1021;
	public int anInt1183;
	public String aString984;
	public int anInt967;
	public boolean aBoolean841;
	public ComponentImageProducer aComponentImageProducer_854;
	public int anInt1164;
	public int[] anIntArray884;
	public int anInt1113;
	public boolean aBoolean1152;
	public int[] anIntArray1095;
	public int anInt872;
	public int anInt1066;
	public int anInt1143;
	public ComponentImageProducer aComponentImageProducer_990;
	public int anInt975;
	public byte aByte1087;
	public String aString1019;
	public int anInt993;
	public String aString1148;
	public int anInt1051;
	public int[] anIntArray1153;
	public Class18[] collisionMap;
	public int anInt1037;
	public int anInt1013;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1059;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_892;
	public byte[] aByteArray1088;
	public int anInt955;
	public int[] anIntArray1094;
	public boolean aBoolean982;
	public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1075;
	public ComponentImageProducer aComponentImageProducer_991;
	public int anInt946;
	public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array1018;
	public int anInt873;
	public boolean aBoolean1184;
	public int[] anIntArray1073;
	public boolean aBoolean1141;
	public int anInt972;
	public ComponentImageProducer aComponentImageProducer_855;
	public int anInt1030;
	public String aString951;
	public int anInt1022;
	public ComponentImageProducer aComponentImageProducer_992;
	public long aLong1231;
	public int[] anIntArray1253;
	public boolean aBoolean1008;
	public int anInt866;
	public ComponentImageProducer aComponentImageProducer_1044;
	public int anInt1049;
	public int anInt1006;
	public int anInt970;
	public long aLong1079;
	public int anInt1103;
	public String[] aStringArray799;
	public int[] anIntArray1150;
	public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array1001;
	public String aString1182;
	public boolean aBoolean1128;
	public ComponentImageProducer aComponentImageProducer_1045;
	public int anInt923;
	public int anInt1205;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1060;
	public ComponentImageProducer aComponentImageProducer_856;
	public int anInt874;
	public int anInt1081;
	public int[] anIntArray1136;
	public Buffer aBuffer_1106;
	public int anInt1072;
	public int anInt920;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1126;
	public int anInt1181;
	public ComponentImageProducer aComponentImageProducer_1046;
	public int anInt824;
	public int anInt850;
	public int anInt1007;
	public byte aByte798;
	public boolean[] aBooleanArray1161;
	public ComponentImageProducer aComponentImageProducer_1047;
	public ComponentImageProducer aComponentImageProducer_857;
	public String[] aStringArray1099;
	public int[] anIntArray904;
	public int anInt987;
	public final int anInt1067;
	public int anInt1177;
	public boolean aBoolean1149;
	public int anInt1061;
	public int anInt931;
	public String aString1009;
	public ComponentImageProducer aComponentImageProducer_858;
	public int anInt887;
	public int anInt1010;
	public boolean aBoolean1169;
	public int[] anIntArray1096;
	public int anInt888;
	public int[] anIntArray1089;
	public int[][] anIntArrayArray1020;
	public byte aByte846;
	public int[] anIntArray1245;
	public int anInt805;
	public final int[] anIntArray985;
	public ComponentImageProducer aComponentImageProducer_859;
	public int[] anIntArray988;
	public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array914;
	public ComponentImageProducer aComponentImageProducer_860;
	public boolean[] aBooleanArray800;
	public Class5 aClass5_861;
	public int anInt1207;
	public int anInt1091;
	public int[] anIntArray989;
	public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array1204;
	public int anInt1033;
	public int anInt1029;
	public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array943;
	public int anInt797;
	public int anInt882;
	public long aLong1230;
	public int anInt840;
	public int anInt921;
	public int anInt983;
	public boolean aBoolean1146;
	public int anInt825;
	public int anInt1250;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1187;
	public int anInt893;
	public int anInt814;
	public boolean aBoolean930;
	public int[] anIntArray1098;
	public int anInt894;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_964;
	public boolean aBoolean945;
	public int anInt1233;
	public int anInt812;
	public int anInt1234;
	public int anInt1138;
	public int anInt1023;
	public int anInt1208;
	public int anInt896;
	public int anInt813;
	public boolean aBoolean881;
	public Class44_Sub3_Sub1_Sub4 aClass44_Sub3_Sub1_Sub4_1078;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1188;
	public int anInt897;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_965;
	public int[] anIntArray998;
	public int anInt1221;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1189;
	public Class44_Sub3_Sub1_Sub2 aClass44_Sub3_Sub1_Sub2_1190;
	public int[] anIntArray1097;
	public int anInt1100;
	public int anInt1133;
	public int[] anIntArray968;
	public long aLong867;
	public boolean aBoolean819;
	public int anInt818;
	public int[] anIntArray844;
	public boolean aBoolean1262;
	public boolean aBoolean1024;
	public boolean aBoolean826;
	public boolean aBoolean974;
	public int anInt835;
	public byte aByte1117;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1178;
	public int anInt909;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1179;
	public int anInt849;
	public int anInt910;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1180;
	public int anInt848;
	public int[] anIntArray1172;
	public Class44_Sub3_Sub1_Sub3[] aClass44_Sub3_Sub1_Sub3Array952;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_875;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_876;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_877;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_878;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_879;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1210;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1211;
	public int anInt911;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1212;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1213;
	public Class44_Sub3_Sub1_Sub3 aClass44_Sub3_Sub1_Sub3_1214;
	public int anInt1173;
	public Class44_Sub3_Sub1_Sub2[] aClass44_Sub3_Sub1_Sub2Array935;
	public int anInt889;
	public byte aByte902;
	public byte aByte1034;
	public int anInt912;
	public int anInt913;
	public int anInt1118;
	public int anInt847;
	public int anInt941;
	public int anInt1197;
	public boolean aBoolean956;
	public int anInt963;
	public boolean aBoolean1002;
	public int anInt962;
	public int[] anIntArray1068;
	public int anInt1186;
	public int anInt1036;
	public int anInt1057;
	public int anInt1058;
	public int anInt837;
	public int anInt1171;
	public int anInt1247;
	public int anInt1209;
	public int anInt916;
	public int anInt1218;
	public boolean aBoolean1226;
	public int anInt1222;
	public int anInt1185;

	static {
		anIntArray1134 = new int[]{9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486};
		anIntArrayArray1241 = new int[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003}, {4626, 11146, 6439, 12, 4758, 10270}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574}};
		anInt901 = -303;
		aBoolean960 = true;
		modulus = new BigInteger("100516592448923952413787067914588391627080976337588958931655744831160363248598109717138107171726380227112385208133183610493286514631077129568650622281849424254709720997977032323965440119940461256560855776288036858499479246523106432074729155099646507878668916590641593396107544803321312668869645912252279416619");
		exponent = new BigInteger("65537");
		anInt1224 = -39788;
		localWorldId = 10;
		isMembersWorld = true;
		anIntArray809 = new int[32];
		int var0 = 2;

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			anIntArray809[var1] = var0 - 1;
			var0 += var0;
		}

		anIntArray1236 = new int[99];
		var0 = 0;

		for (var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			anIntArray1236[var1] = var0 / 4;
		}

	}

	public Client() {
		this.anIntArray973 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		this.anInt1067 = 100;
		this.anIntArray954 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		this.anIntArray985 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		this.aByte798 = 5;
		this.aStringArray799 = new String[5];
		this.aBooleanArray800 = new boolean[5];
		this.anInt801 = 443;
		this.anIntArray804 = new int[50];
		this.anInt806 = 477;
		this.anIntArray810 = new int[7];
		this.aClass28ArrayArrayArray816 = new Class28[4][104][104];
		this.aLongArray817 = new long[100];
		this.aBoolean819 = false;
		this.anInt825 = 3353893;
		this.aBoolean826 = false;
		this.aStringArray833 = new String[200];
		this.anInt835 = 2;
		this.aByte836 = 3;
		this.anIntArray838 = new int[4000];
		this.anIntArray839 = new int[4000];
		this.aBoolean841 = false;
		this.aBuffer_843 = Buffer.method467(-7939, 1);
		this.anIntArray844 = new int[5];
		this.anInt845 = -43664;
		this.aByte846 = -120;
		this.aBoolean851 = false;
		this.aClass5_861 = new Class5();
		this.aBoolean881 = true;
		this.anIntArray883 = new int[33];
		this.anIntArray884 = new int[25];
		this.anIntArray885 = new int[9];
		this.anInt889 = 1;
		this.aBoolean898 = false;
		this.aBoolean899 = false;
		this.aByte902 = 90;
		this.anIntArray903 = new int[256];
		this.anIntArray904 = new int[5];
		this.aBoolean905 = false;
		this.aBoolean906 = false;
		this.aClass44_Sub3_Sub1_Sub3Array914 = new Class44_Sub3_Sub1_Sub3[2];
		this.aBoolean917 = false;
		this.aClass28_924 = new Class28(-822);
		this.aBoolean928 = false;
		this.aBoolean930 = true;
		this.anInt931 = 78;
		this.aString932 = "";
		this.aString933 = "";
		this.anInt934 = -1;
		this.aClass44_Sub3_Sub1_Sub2Array935 = new Class44_Sub3_Sub1_Sub2[20];
		this.anInt941 = -501;
		this.aClass44_Sub3_Sub1_Sub2Array943 = new Class44_Sub3_Sub1_Sub2[100];
		this.aBoolean945 = true;
		this.anInt946 = 12122;
		this.anInt947 = -1;
		this.anIntArray948 = new int[100];
		this.aStringArray949 = new String[100];
		this.aStringArray950 = new String[100];
		this.aString951 = "";
		this.aClass44_Sub3_Sub1_Sub3Array952 = new Class44_Sub3_Sub1_Sub3[13];
		this.aBoolean956 = false;
		this.aByte958 = 0;
		this.aByte959 = 86;
		this.anIntArray968 = new int[5];
		this.aBoolean971 = false;
		this.aBoolean974 = false;
		this.aBoolean976 = false;
		this.aCRC32_979 = new CRC32();
		this.aBoolean982 = true;
		this.aString984 = "";
		this.anIntArrayArray986 = new int[104][104];
		this.anIntArray988 = new int[1000];
		this.anIntArray989 = new int[1000];
		this.anIntArray998 = new int[5];
		this.anInt999 = -1;
		this.anInt1000 = -1;
		this.aClass44_Sub3_Sub1_Sub2Array1001 = new Class44_Sub3_Sub1_Sub2[20];
		this.aBoolean1002 = false;
		this.anInt1003 = 833;
		this.anInt1007 = 5063219;
		this.aBoolean1008 = false;
		this.aString1009 = "";
		this.anInt1011 = -1;
		this.anInt1013 = 3;
		this.aByte1014 = 9;
		this.aBoolean1017 = false;
		this.aClass44_Sub3_Sub1_Sub3Array1018 = new Class44_Sub3_Sub1_Sub3[100];
		this.aString1019 = "";
		this.anIntArrayArray1020 = new int[104][104];
		this.aBoolean1024 = false;
		this.anInt1030 = -1;
		this.aByte1032 = -123;
		this.anInt1033 = 436;
		this.aByte1034 = 111;
		this.aBoolean1035 = false;
		this.anInt1036 = -593;
		this.anInt1037 = -1;
		this.anIntArray1048 = new int[50];
		this.aBoolean1053 = false;
		this.anIntArray1054 = new int[33];
		this.anIntArray1065 = new int[1000];
		this.anIntArray1068 = new int[100];
		this.aBoolean1069 = true;
		this.aByte1070 = 7;
		this.aByte1071 = 6;
		this.anIntArray1073 = new int[200];
		this.aBoolean1080 = true;
		this.anInt1081 = -1;
		this.anIntArray1083 = new int[50];
		this.anIntArrayArray1084 = new int[104][104];
		this.aByte1087 = -44;
		this.aByteArray1088 = new byte[16384];
		this.anIntArray1089 = new int[5];
		this.anInt1091 = 50;
		this.anIntArray1092 = new int[this.anInt1091];
		this.anIntArray1093 = new int[this.anInt1091];
		this.anIntArray1094 = new int[this.anInt1091];
		this.anIntArray1095 = new int[this.anInt1091];
		this.anIntArray1096 = new int[this.anInt1091];
		this.anIntArray1097 = new int[this.anInt1091];
		this.anIntArray1098 = new int[this.anInt1091];
		this.aStringArray1099 = new String[this.anInt1091];
		this.anInt1103 = -1;
		this.aBoolean1104 = false;
		this.collisionMap = new Class18[4];
		this.aBuffer_1106 = Buffer.method467(-7939, 1);
		this.anIntArray1107 = new int[2000];
		this.aBoolean1109 = false;
		this.anInt1110 = -1;
		this.anInt1113 = 5;
		this.aStringArray1114 = new String[500];
		this.aByte1117 = 86;
		this.anInt1118 = 2048;
		this.anInt1119 = 2047;
		this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120 = new Class44_Sub3_Sub4_Sub6_Sub1[this.anInt1118];
		this.anIntArray1122 = new int[this.anInt1118];
		this.anIntArray1124 = new int[this.anInt1118];
		this.aBufferArray1125 = new Buffer[this.anInt1118];
		this.aBoolean1128 = false;
		this.anInt1131 = -1;
		this.aBuffer_1135 = Buffer.method467(-7939, 1);
		this.anIntArray1136 = new int[151];
		this.aBoolean1141 = false;
		this.aBoolean1146 = false;
		this.aString1147 = "";
		this.aString1148 = "";
		this.aBoolean1149 = true;
		this.anIntArray1150 = new int[151];
		this.aBoolean1152 = true;
		this.anIntArray1153 = new int[25];
		this.aClass28_1156 = new Class28(-822);
		this.anInt1158 = 2301979;
		this.aLongArray1159 = new long[200];
		this.aBooleanArray1161 = new boolean[5];
		this.aBoolean1168 = false;
		this.aBoolean1169 = false;
		this.anInt1171 = 1;
		this.anIntArray1172 = new int[2000];
		this.anInt1173 = -1;
		this.aBoolean1174 = false;
		this.aBoolean1175 = false;
		this.anInt1176 = -48671;
		this.anInt1177 = 7759444;
		this.aString1182 = "";
		this.aBoolean1184 = true;
		this.anIntArray1191 = new int[500];
		this.anIntArray1192 = new int[500];
		this.anIntArray1193 = new int[500];
		this.anIntArray1194 = new int[500];
		this.aClass44_Sub3_Sub1_Sub2Array1204 = new Class44_Sub3_Sub1_Sub2[1000];
		this.anInt1205 = 128;
		this.anInt1209 = 814;
		this.aClass44_Sub3_Sub1_Sub2Array1215 = new Class44_Sub3_Sub1_Sub2[8];
		this.anInt1216 = -1;
		this.anInt1218 = 2;
		this.aClass45Array1225 = new Class45[5];
		this.aBoolean1226 = true;
		this.pendingObjectSpawns = new Class28(-822);
		this.anInt1242 = -1;
		this.anInt1247 = 2;
		this.aBoolean1249 = false;
		this.aByte1251 = -111;
		this.anIntArray1253 = new int[25];
		this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259 = new Class44_Sub3_Sub4_Sub6_Sub2[16384];
		this.anIntArray1261 = new int[16384];
		this.aBoolean1262 = false;
		this.aBoolean1265 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3"
	)
	public void method74() {
		if (this.anInt1074 != 0) {
			Class44_Sub3_Sub1_Sub4 var1 = this.aClass44_Sub3_Sub1_Sub4_1076;
			int var2 = 0;
			if (this.anInt803 != 0) {
				var2 = 1;
			}

			for (int var3 = 0; var3 < 100; ++var3) {
				if (this.aStringArray950[var3] != null) {
					int var4 = this.anIntArray948[var3];
					String var5 = this.aStringArray949[var3];
					byte var6 = 0;
					if (var5 != null && var5.startsWith("@cr1@")) {
						var5 = var5.substring(5);
						var6 = 1;
					}

					if (var5 != null && var5.startsWith("@cr2@")) {
						var5 = var5.substring(5);
						var6 = 2;
					}

					int var7;
					if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.anInt972 == 0 || this.anInt972 == 1 && this.method22(-238, var5))) {
						var7 = 329 - var2 * 13;
						byte var8 = 4;
						var1.method458(var8, "From", 0, var7);
						var1.method458(var8, "From", 65535, var7 - 1);
						int var9 = var8 + var1.method457(-43341, "From ");
						if (var6 == 1) {
							this.aClass44_Sub3_Sub1_Sub3Array914[0].method453(this.aByte1070, var9, var7 - 12);
							var9 += 14;
						}

						if (var6 == 2) {
							this.aClass44_Sub3_Sub1_Sub3Array914[1].method453(this.aByte1070, var9, var7 - 12);
							var9 += 14;
						}

						var1.method458(var9, var5 + ": " + this.aStringArray950[var3], 0, var7);
						var1.method458(var9, var5 + ": " + this.aStringArray950[var3], 65535, var7 - 1);
						++var2;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 5 && this.anInt972 < 2) {
						var7 = 329 - var2 * 13;
						var1.method458(4, this.aStringArray950[var3], 0, var7);
						var1.method458(4, this.aStringArray950[var3], 65535, var7 - 1);
						++var2;
						if (var2 >= 5) {
							return;
						}
					}

					if (var4 == 6 && this.anInt972 < 2) {
						var7 = 329 - var2 * 13;
						var1.method458(4, "To " + var5 + ": " + this.aStringArray950[var3], 0, var7);
						var1.method458(4, "To " + var5 + ": " + this.aStringArray950[var3], 65535, var7 - 1);
						++var2;
						if (var2 >= 5) {
							return;
						}
					}
				}
			}

		}
	}

	public AppletContext getAppletContext() {
		return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
	}

	public void method16(int var1) {
		if (this.aComponentImageProducer_1039 == null) {
			super.aComponentImageProducer_15 = null;
			this.aComponentImageProducer_865 = null;
			this.aComponentImageProducer_863 = null;
			this.aComponentImageProducer_862 = null;
			this.componentImageProducer = null;
			this.aComponentImageProducer_990 = null;
			this.aComponentImageProducer_991 = null;
			this.aComponentImageProducer_992 = null;
			this.aComponentImageProducer_1042 = new ComponentImageProducer(265, 128, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1043 = new ComponentImageProducer(265, 128, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1039 = new ComponentImageProducer(171, 509, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1040 = new ComponentImageProducer(132, 360, this.getGameWindow((byte)7));
			DrawingArea.method409();
			if (var1 != -43664) {
				for (int var2 = 1; var2 > 0; ++var2) {
				}
			}

			this.aComponentImageProducer_1041 = new ComponentImageProducer(200, 360, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1044 = new ComponentImageProducer(238, 202, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1045 = new ComponentImageProducer(238, 203, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1046 = new ComponentImageProducer(94, 74, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_1047 = new ComponentImageProducer(94, 75, this.getGameWindow((byte)7));
			DrawingArea.method409();
			if (this.aClass47_942 != null) {
				this.method59(0);
				this.method91();
			}

			this.aBoolean917 = true;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "7"
	)
	public void drawString(String var1, int var2, int var3) {
		this.anInt908 = var2;
		this.aString828 = var1;
		this.method16(this.anInt845);
		if (this.aClass47_942 == null) {
			super.drawString(var1, var2, 7);
		} else {
			this.aComponentImageProducer_1041.initDrawingArea();
			short var4 = 360;
			short var5 = 200;
			byte var6 = 20;
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(var4 / 2, var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...");
			int var7 = var5 / 2 - 18 - var6;
			DrawingArea.method412(304, 9179409, 34, var4 / 2 - 152, var7);
			DrawingArea.method412(302, 0, 32, var4 / 2 - 151, var7 + 1);
			DrawingArea.method411(30, 9179409, var2 * 3, var4 / 2 - 150, 0, var7 + 2);
			DrawingArea.method411(30, 0, 300 - var2 * 3, var4 / 2 - 150 + var2 * 3, 0, var7 + 2);
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(var4 / 2, var5 / 2 + 5 - var6, 16777215, var1);
			this.aComponentImageProducer_1041.drawComponentImage(super.graphics, 202, 171);
			if (this.aBoolean917) {
				this.aBoolean917 = false;
				if (!this.aBoolean906) {
					this.aComponentImageProducer_1042.drawComponentImage(super.graphics, 0, 0);
					this.aComponentImageProducer_1043.drawComponentImage(super.graphics, 637, 0);
				}

				this.aComponentImageProducer_1039.drawComponentImage(super.graphics, 128, 0);
				this.aComponentImageProducer_1040.drawComponentImage(super.graphics, 202, 371);
				this.aComponentImageProducer_1044.drawComponentImage(super.graphics, 0, 265);
				this.aComponentImageProducer_1045.drawComponentImage(super.graphics, 562, 265);
				this.aComponentImageProducer_1046.drawComponentImage(super.graphics, 128, 171);
				this.aComponentImageProducer_1047.drawComponentImage(super.graphics, 562, 171);
			}

		}
	}

	public Component getGameWindow(byte var1) {
		if (var1 == 7) {
			boolean var2 = false;
		} else {
			this.anInt907 = -291;
		}

		if (signlink.mainapp != null) {
			return signlink.mainapp;
		} else {
			return (Component)(super.gameWindow != null ? super.gameWindow : this);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-568"
	)
	public void method85() {
		this.aBoolean976 = true;

		try {
			long var1 = System.currentTimeMillis();
			int var3 = 0;
			int var4 = 20;

			while (this.aBoolean906) {
				++this.anInt966;
				this.method86((byte)9);
				this.method86((byte)9);
				this.method128();
				++var3;
				if (var3 > 10) {
					long var5 = System.currentTimeMillis();
					int var7 = (int)(var5 - var1) / 10 - var4;
					var4 = 40 - var7;
					if (var4 < 5) {
						var4 = 5;
					}

					var3 = 0;
					var1 = var5;
				}

				try {
					Thread.sleep((long)var4);
				} catch (Exception var8) {
				}
			}
		} catch (Exception var9) {
		}

		this.aBoolean976 = false;
	}

	public void method114(int var1) {
		this.aBoolean906 = false;

		while (this.aBoolean976) {
			this.aBoolean906 = false;

			try {
				Thread.sleep(50L);
			} catch (Exception var3) {
			}
		}

		this.aClass44_Sub3_Sub1_Sub3_1263 = null;
		this.aClass44_Sub3_Sub1_Sub3_1264 = null;
		this.aClass44_Sub3_Sub1_Sub3Array1229 = null;
		this.anIntArray936 = null;
		this.anIntArray937 = null;
		this.anIntArray938 = null;
		this.anIntArray939 = null;
		this.anIntArray1111 = null;
		this.anInt1219 += var1;
		this.anIntArray1112 = null;
		this.anIntArray977 = null;
		this.anIntArray978 = null;
		this.aClass44_Sub3_Sub1_Sub2_891 = null;
		this.aClass44_Sub3_Sub1_Sub2_892 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15447"
	)
	public void method108() {
		Graphics var1 = this.getGameWindow((byte)7).getGraphics();
		var1.setColor(Color.black);
		var1.fillRect(0, 0, 765, 503);
		this.method4(-27605, 1);
		byte var2;
		int var3;
		if (this.aBoolean1174) {
			this.aBoolean906 = false;
			var1.setFont(new Font("Helvetica", 1, 16));
			var1.setColor(Color.yellow);
			var2 = 35;
			var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var2);
			var3 = var2 + 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, var3);
			var3 += 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var3);
			var3 += 30;
			var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var3);
			var3 += 30;
			var1.drawString("3: Try using a different game-world", 30, var3);
			var3 += 30;
			var1.drawString("4: Try rebooting your computer", 30, var3);
			var3 += 30;
			var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var3);
		}

		if (this.aBoolean898) {
			this.aBoolean906 = false;
			var1.setFont(new Font("Helvetica", 1, 20));
			var1.setColor(Color.white);
			var1.drawString("Error - unable to load game!", 50, 50);
			var1.drawString("To play RuneScape make sure you play from", 50, 100);
			var1.drawString("http://www.runescape.com", 50, 150);
		}

		if (this.aBoolean1035) {
			this.aBoolean906 = false;
			var1.setColor(Color.yellow);
			var2 = 35;
			var1.drawString("Error a copy of RuneScape already appears to be loaded", 30, var2);
			var3 = var2 + 50;
			var1.setColor(Color.white);
			var1.drawString("To fix this try the following (in order):", 30, var3);
			var3 += 50;
			var1.setColor(Color.white);
			var1.setFont(new Font("Helvetica", 1, 12));
			var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var3);
			var3 += 30;
			var1.drawString("2: Try rebooting your computer, and reloading", 30, var3);
			var3 += 30;
		}

	}

	public URL getCodeBase() {
		if (signlink.mainapp != null) {
			return signlink.mainapp.getCodeBase();
		} else {
			try {
				if (super.gameWindow != null) {
					return new URL("http://127.0.0.1:" + (portOffset + 80));
				}
			} catch (Exception var2) {
			}

			return super.getCodeBase();
		}
	}

	public void method30(int var1, int var2, int var3, int var4) {
		if (var2 >= 128 && var3 >= 128 && var2 <= 13056 && var3 <= 13056) {
			int var5 = this.method50(var2, var3, 0, this.clientPlane) - var4;
			var2 -= this.anInt820;
			var5 -= this.anInt821;
			var3 -= this.anInt822;
			int var6 = Model.anIntArray1585[this.anInt823];
			int var7 = Model.anIntArray1586[this.anInt823];
			int var8 = Model.anIntArray1585[this.anInt824];
			int var9 = Model.anIntArray1586[this.anInt824];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			var3 = var3 * var9 - var8 * var2 >> 16;
			var2 = var10;
			var10 = var5 * var7 - var3 * var6 >> 16;
			var3 = var5 * var6 + var3 * var7 >> 16;
			if (var3 >= 50) {
				this.anInt999 = (var2 << 9) / var3 + Class44_Sub3_Sub1_Sub1.anInt1403;
				this.anInt1000 = (var10 << 9) / var3 + Class44_Sub3_Sub1_Sub1.anInt1404;
			} else {
				this.anInt999 = -1;
				this.anInt1000 = -1;
			}

		} else {
			this.anInt999 = -1;
			this.anInt1000 = -1;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method80() {
		try {
			if (this.aClass7_1108 != null) {
				this.aClass7_1108.method191();
			}
		} catch (Exception var2) {
		}

		this.aClass7_1108 = null;
		this.aBoolean905 = false;
		this.anInt1005 = 0;
		this.aString1147 = "";
		this.aString1148 = "";
		this.method125();
		this.worldController.method278();

		for (int var1 = 0; var1 < 4; ++var1) {
			this.collisionMap[var1].method231((byte)5);
		}

		System.gc();
		this.method78();
		this.anInt1030 = -1;
		this.anInt1183 = -1;
		this.anInt927 = 0;
	}

	public void method33(int var1, int var2, byte var3, Class44_Sub3_Sub1_Sub2 var4) {
		if (var3 != this.aByte1251) {
			this.aBoolean899 = !this.aBoolean899;
		}

		int var5 = this.anInt1206 + this.anInt1217 & 2047;
		int var6 = var1 * var1 + var2 * var2;
		if (var6 <= 6400) {
			int var7 = Model.anIntArray1585[var5];
			int var8 = Model.anIntArray1586[var5];
			var7 = var7 * 256 / (this.anInt1170 + 256);
			var8 = var8 * 256 / (this.anInt1170 + 256);
			int var9 = var7 * var1 + var8 * var2 >> 16;
			int var10 = var8 * var1 - var7 * var2 >> 16;
			if (var6 > 2500) {
				var4.method446(945, var9 + 94 - var4.anInt1436 / 2 + 4, this.aClass44_Sub3_Sub1_Sub3_1202, 83 - var10 - var4.anInt1437 / 2 - 4);
			} else {
				var4.method440(this.aByte1070, var9 + 94 - var4.anInt1436 / 2 + 4, 83 - var10 - var4.anInt1437 / 2 - 4);
			}

		}
	}

	public void method71(int var1) {
		if (this.anInt1223 > 0) {
			this.method80();
		} else {
			this.componentImageProducer.initDrawingArea();
			this.aClass44_Sub3_Sub1_Sub4_1076.method455(257, 144, 0, "Connection lost");
			this.aClass44_Sub3_Sub1_Sub4_1076.method455(256, 143, 16777215, "Connection lost");
			this.anInt1219 += var1;
			this.aClass44_Sub3_Sub1_Sub4_1076.method455(257, 159, 0, "Please wait - attempting to reestablish");
			this.aClass44_Sub3_Sub1_Sub4_1076.method455(256, 158, 16777215, "Please wait - attempting to reestablish");
			this.componentImageProducer.drawComponentImage(super.graphics, 4, 4);
			this.anInt1031 = 0;
			this.anInt1025 = 0;
			Class7 var2 = this.aClass7_1108;
			this.aBoolean905 = false;
			this.method48(this.aString1147, this.aString1148, true);
			if (!this.aBoolean905) {
				this.method80();
			}

			try {
				var2.method191();
			} catch (Exception var4) {
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "22257"
	)
	public void method8() {
		signlink.reporterror = false;

		try {
			if (this.aClass7_1108 != null) {
				this.aClass7_1108.method191();
			}
		} catch (Exception var2) {
		}

		this.aClass7_1108 = null;
		this.method78();
		if (this.aClass10_1160 != null) {
			this.aClass10_1160.aBoolean259 = false;
		}

		this.aClass10_1160 = null;
		this.aClass43_Sub1_1015.method384();
		this.aClass43_Sub1_1015 = null;
		this.aBuffer_843 = null;
		this.aBuffer_1106 = null;
		this.aBuffer_1135 = null;
		this.anIntArray830 = null;
		this.aByteArrayArray886 = null;
		this.aByteArrayArray953 = null;
		this.anIntArray831 = null;
		this.anIntArray832 = null;
		this.anIntArrayArrayArray957 = null;
		this.tileFlags = null;
		this.worldController = null;
		this.collisionMap = null;
		this.anIntArrayArray986 = null;
		this.anIntArrayArray1084 = null;
		this.anIntArray838 = null;
		this.anIntArray839 = null;
		this.aByteArray1088 = null;
		this.aComponentImageProducer_862 = null;
		this.aComponentImageProducer_863 = null;
		this.componentImageProducer = null;
		this.aComponentImageProducer_865 = null;
		this.aComponentImageProducer_990 = null;
		this.aComponentImageProducer_991 = null;
		this.aComponentImageProducer_992 = null;
		this.aComponentImageProducer_852 = null;
		this.aComponentImageProducer_853 = null;
		this.aComponentImageProducer_854 = null;
		this.aComponentImageProducer_855 = null;
		this.aComponentImageProducer_856 = null;
		this.aComponentImageProducer_857 = null;
		this.aComponentImageProducer_858 = null;
		this.aComponentImageProducer_859 = null;
		this.aComponentImageProducer_860 = null;
		this.aClass44_Sub3_Sub1_Sub3_1201 = null;
		this.aClass44_Sub3_Sub1_Sub3_1202 = null;
		this.aClass44_Sub3_Sub1_Sub3_1203 = null;
		this.aClass44_Sub3_Sub1_Sub3_1178 = null;
		this.aClass44_Sub3_Sub1_Sub3_1179 = null;
		this.aClass44_Sub3_Sub1_Sub3_1180 = null;
		this.aClass44_Sub3_Sub1_Sub3Array952 = null;
		this.aClass44_Sub3_Sub1_Sub3_875 = null;
		this.aClass44_Sub3_Sub1_Sub3_876 = null;
		this.aClass44_Sub3_Sub1_Sub3_877 = null;
		this.aClass44_Sub3_Sub1_Sub3_878 = null;
		this.aClass44_Sub3_Sub1_Sub3_879 = null;
		this.aClass44_Sub3_Sub1_Sub3_1210 = null;
		this.aClass44_Sub3_Sub1_Sub3_1211 = null;
		this.aClass44_Sub3_Sub1_Sub3_1212 = null;
		this.aClass44_Sub3_Sub1_Sub3_1213 = null;
		this.aClass44_Sub3_Sub1_Sub3_1214 = null;
		this.aClass44_Sub3_Sub1_Sub2_1085 = null;
		this.aClass44_Sub3_Sub1_Sub2Array935 = null;
		this.aClass44_Sub3_Sub1_Sub2Array1001 = null;
		this.aClass44_Sub3_Sub1_Sub2Array1215 = null;
		this.aClass44_Sub3_Sub1_Sub2_1187 = null;
		this.aClass44_Sub3_Sub1_Sub2_1188 = null;
		this.aClass44_Sub3_Sub1_Sub2_1189 = null;
		this.aClass44_Sub3_Sub1_Sub2_1190 = null;
		this.aClass44_Sub3_Sub1_Sub3Array1018 = null;
		this.aClass44_Sub3_Sub1_Sub2Array943 = null;
		this.anIntArrayArray1020 = null;
		this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120 = null;
		this.anIntArray1122 = null;
		this.anIntArray1124 = null;
		this.aBufferArray1125 = null;
		this.anIntArray1065 = null;
		this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259 = null;
		this.anIntArray1261 = null;
		this.aClass28ArrayArrayArray816 = null;
		this.pendingObjectSpawns = null;
		this.aClass28_1156 = null;
		this.aClass28_924 = null;
		this.anIntArray1191 = null;
		this.anIntArray1192 = null;
		this.anIntArray1193 = null;
		this.anIntArray1194 = null;
		this.aStringArray1114 = null;
		this.anIntArray1107 = null;
		this.anIntArray988 = null;
		this.anIntArray989 = null;
		this.aClass44_Sub3_Sub1_Sub2Array1204 = null;
		this.aClass44_Sub3_Sub1_Sub2_1027 = null;
		this.aStringArray833 = null;
		this.aLongArray1159 = null;
		this.anIntArray1073 = null;
		this.aComponentImageProducer_1042 = null;
		this.aComponentImageProducer_1043 = null;
		this.aComponentImageProducer_1039 = null;
		this.aComponentImageProducer_1040 = null;
		this.aComponentImageProducer_1041 = null;
		this.aComponentImageProducer_1044 = null;
		this.aComponentImageProducer_1045 = null;
		this.aComponentImageProducer_1046 = null;
		this.aComponentImageProducer_1047 = null;
		this.method114(0);
		GameObjectDefinition.method198((byte)1);
		Class12.method213((byte)1);
		Class14.method219();
		Class20.aClass20Array423 = null;
		Class22.aClass22Array455 = null;
		Class5.aClass5Array103 = null;
		Class24.aClass24Array480 = null;
		Class26.aClass26Array497 = null;
		Class32.aClass32Array547 = null;
		Class32.aClass39_559 = null;
		Class38.aClass38Array660 = null;
		super.aComponentImageProducer_15 = null;
		Class44_Sub3_Sub4_Sub6_Sub1.aClass39_1680 = null;
		Class44_Sub3_Sub1_Sub1.method418((byte)1);
		Class36.method277((byte)1);
		Model.method499((byte)1);
		Class11.method209();
		System.gc();
	}

	@Export("startup")
	public void startup() {
		this.drawString("Starting up", 20, 7);
		if (signlink.sunjava) {
			super.anInt8 = 5;
		}

		if (aBoolean926) {
			this.aBoolean1035 = true;
		} else {
			aBoolean926 = true;
			boolean var1 = false;
			String var2 = this.method93(879);
			if (var2.endsWith("jagex.com")) {
				var1 = true;
			}

			if (var2.endsWith("runescape.com")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.2")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.246")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.247")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.249")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.253")) {
				var1 = true;
			}

			if (var2.endsWith("192.168.1.254")) {
				var1 = true;
			}

			if (var2.endsWith("127.0.0.1")) {
				var1 = true;
			}

			if (!var1) {
				this.aBoolean898 = true;
			} else {
				if (signlink.cache_dat != null) {
					for (int var3 = 0; var3 < 5; ++var3) {
						this.aClass45Array1225[var3] = new Class45(signlink.cache_dat, 29615, signlink.cache_idx[var3], var3 + 1, 500000);
					}
				}

				try {
					this.method147(0);
					this.aClass47_942 = this.method61("title screen", 1, "title", this.anIntArray885[1], (byte)46, 25);
					this.aClass44_Sub3_Sub1_Sub4_1075 = new Class44_Sub3_Sub1_Sub4(this.aClass47_942, false, "p11_full", (byte)0);
					this.aClass44_Sub3_Sub1_Sub4_1076 = new Class44_Sub3_Sub1_Sub4(this.aClass47_942, false, "p12_full", (byte)0);
					this.aClass44_Sub3_Sub1_Sub4_1077 = new Class44_Sub3_Sub1_Sub4(this.aClass47_942, false, "b12_full", (byte)0);
					this.aClass44_Sub3_Sub1_Sub4_1078 = new Class44_Sub3_Sub1_Sub4(this.aClass47_942, true, "q8_full", (byte)0);
					this.method59(0);
					this.method91();
					Class47 var32 = this.method61("config", 2, "config", this.anIntArray885[2], (byte)46, 30);
					Class47 var4 = this.method61("interface", 3, "interface", this.anIntArray885[3], (byte)46, 35);
					Class47 var5 = this.method61("2d graphics", 4, "media", this.anIntArray885[4], (byte)46, 40);
					Class47 var6 = this.method61("textures", 6, "textures", this.anIntArray885[6], (byte)46, 45);
					Class47 var7 = this.method61("chat system", 7, "wordenc", this.anIntArray885[7], (byte)46, 50);
					Class47 var8 = this.method61("sound effects", 8, "sounds", this.anIntArray885[8], (byte)46, 55);
					this.tileFlags = new byte[4][104][104];
					this.anIntArrayArrayArray957 = new int[4][105][105];
					this.worldController = new Class36(4, 104, 104, this.anIntArrayArrayArray957, (byte)6);

					for (int var9 = 0; var9 < 4; ++var9) {
						this.collisionMap[var9] = new Class18(104, 104, true);
					}

					this.aClass44_Sub3_Sub1_Sub2_1027 = new Class44_Sub3_Sub1_Sub2(512, 512);
					Class47 var33 = this.method61("update list", 5, "versionlist", this.anIntArray885[5], (byte)46, 60);
					this.drawString("Connecting to update server", 60, 7);
					this.aClass43_Sub1_1015 = new Class43_Sub1();
					this.aClass43_Sub1_1015.method383(var33, this);
					Class11.method207(this.aClass43_Sub1_1015.method386());
					Model.method500(this.aClass43_Sub1_1015.method385(anInt1235, 0), this.aClass43_Sub1_1015);
					if (!isLowMemory) {
						this.anInt1183 = 0;

						try {
							this.anInt1183 = Integer.parseInt(this.getParameter("music"));
						} catch (Exception var26) {
						}

						this.aBoolean1184 = true;
						this.aClass43_Sub1_1015.method392(2, this.anInt1183);

						while (this.aClass43_Sub1_1015.method393() > 0) {
							this.method23();

							try {
								Thread.sleep(100L);
							} catch (Exception var25) {
							}

							if (this.aClass43_Sub1_1015.anInt1300 > 3) {
								this.method132("ondemand");
								return;
							}
						}
					}

					this.drawString("Requesting animations", 65, 7);
					int var10 = this.aClass43_Sub1_1015.method385(anInt1235, 1);

					int var11;
					for (var11 = 0; var11 < var10; ++var11) {
						this.aClass43_Sub1_1015.method392(1, var11);
					}

					while (this.aClass43_Sub1_1015.method393() > 0) {
						var11 = var10 - this.aClass43_Sub1_1015.method393();
						if (var11 > 0) {
							this.drawString("Loading animations - " + var11 * 100 / var10 + "%", 65, 7);
						}

						this.method23();

						try {
							Thread.sleep(100L);
						} catch (Exception var24) {
						}

						if (this.aClass43_Sub1_1015.anInt1300 > 3) {
							this.method132("ondemand");
							return;
						}
					}

					this.drawString("Requesting models", 70, 7);
					var10 = this.aClass43_Sub1_1015.method385(anInt1235, 0);

					int var12;
					for (var11 = 0; var11 < var10; ++var11) {
						var12 = this.aClass43_Sub1_1015.method390(var11, (byte)9);
						if ((var12 & 1) != 0) {
							this.aClass43_Sub1_1015.method392(0, var11);
						}
					}

					var10 = this.aClass43_Sub1_1015.method393();

					while (this.aClass43_Sub1_1015.method393() > 0) {
						var11 = var10 - this.aClass43_Sub1_1015.method393();
						if (var11 > 0) {
							this.drawString("Loading models - " + var11 * 100 / var10 + "%", 70, 7);
						}

						this.method23();

						try {
							Thread.sleep(100L);
						} catch (Exception var23) {
						}
					}

					if (this.aClass45Array1225[0] != null) {
						this.drawString("Requesting maps", 75, 7);
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(0, 47, false, 48));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(1, 47, false, 48));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(0, 48, false, 48));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(1, 48, false, 48));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(0, 49, false, 48));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(1, 49, false, 48));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(0, 47, false, 47));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(1, 47, false, 47));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(0, 48, false, 47));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(1, 48, false, 47));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(0, 48, false, 148));
						this.aClass43_Sub1_1015.method392(3, this.aClass43_Sub1_1015.method387(1, 48, false, 148));
						var10 = this.aClass43_Sub1_1015.method393();

						while (this.aClass43_Sub1_1015.method393() > 0) {
							var11 = var10 - this.aClass43_Sub1_1015.method393();
							if (var11 > 0) {
								this.drawString("Loading maps - " + var11 * 100 / var10 + "%", 75, 7);
							}

							this.method23();

							try {
								Thread.sleep(100L);
							} catch (Exception var22) {
							}
						}
					}

					var10 = this.aClass43_Sub1_1015.method385(anInt1235, 0);

					for (var11 = 0; var11 < var10; ++var11) {
						var12 = this.aClass43_Sub1_1015.method390(var11, (byte)9);
						byte var13 = 0;
						if ((var12 & 8) != 0) {
							var13 = 10;
						} else if ((var12 & 32) != 0) {
							var13 = 9;
						} else if ((var12 & 16) != 0) {
							var13 = 8;
						} else if ((var12 & 64) != 0) {
							var13 = 7;
						} else if ((var12 & 128) != 0) {
							var13 = 6;
						} else if ((var12 & 2) != 0) {
							var13 = 5;
						} else if ((var12 & 4) != 0) {
							var13 = 4;
						}

						if ((var12 & 1) != 0) {
							var13 = 3;
						}

						if (var13 != 0) {
							this.aClass43_Sub1_1015.method395((byte)5, var11, 0, var13);
						}
					}

					this.aClass43_Sub1_1015.method388(isMembersWorld);
					if (!isLowMemory) {
						var11 = this.aClass43_Sub1_1015.method385(anInt1235, 2);

						for (var12 = 1; var12 < var11; ++var12) {
							if (this.aClass43_Sub1_1015.method391(var12)) {
								this.aClass43_Sub1_1015.method395((byte)5, var12, 2, (byte)1);
							}
						}
					}

					this.drawString("Unpacking media", 80, 7);
					this.aClass44_Sub3_Sub1_Sub3_1201 = new Class44_Sub3_Sub1_Sub3(var5, "invback", 0);
					this.aClass44_Sub3_Sub1_Sub3_1203 = new Class44_Sub3_Sub1_Sub3(var5, "chatback", 0);
					this.aClass44_Sub3_Sub1_Sub3_1202 = new Class44_Sub3_Sub1_Sub3(var5, "mapback", 0);
					this.aClass44_Sub3_Sub1_Sub3_1178 = new Class44_Sub3_Sub1_Sub3(var5, "backbase1", 0);
					this.aClass44_Sub3_Sub1_Sub3_1179 = new Class44_Sub3_Sub1_Sub3(var5, "backbase2", 0);
					this.aClass44_Sub3_Sub1_Sub3_1180 = new Class44_Sub3_Sub1_Sub3(var5, "backhmid1", 0);

					for (var11 = 0; var11 < 13; ++var11) {
						this.aClass44_Sub3_Sub1_Sub3Array952[var11] = new Class44_Sub3_Sub1_Sub3(var5, "sideicons", var11);
					}

					this.aClass44_Sub3_Sub1_Sub2_1085 = new Class44_Sub3_Sub1_Sub2(var5, "compass", 0);
					this.aClass44_Sub3_Sub1_Sub2_1126 = new Class44_Sub3_Sub1_Sub2(var5, "mapedge", 0);
					this.aClass44_Sub3_Sub1_Sub2_1126.method437((byte)3);

					try {
						for (var11 = 0; var11 < 100; ++var11) {
							this.aClass44_Sub3_Sub1_Sub3Array1018[var11] = new Class44_Sub3_Sub1_Sub3(var5, "mapscene", var11);
						}
					} catch (Exception var30) {
					}

					try {
						for (var11 = 0; var11 < 100; ++var11) {
							this.aClass44_Sub3_Sub1_Sub2Array943[var11] = new Class44_Sub3_Sub1_Sub2(var5, "mapfunction", var11);
						}
					} catch (Exception var29) {
					}

					try {
						for (var11 = 0; var11 < 20; ++var11) {
							this.aClass44_Sub3_Sub1_Sub2Array935[var11] = new Class44_Sub3_Sub1_Sub2(var5, "hitmarks", var11);
						}
					} catch (Exception var28) {
					}

					try {
						for (var11 = 0; var11 < 20; ++var11) {
							this.aClass44_Sub3_Sub1_Sub2Array1001[var11] = new Class44_Sub3_Sub1_Sub2(var5, "headicons", var11);
						}
					} catch (Exception var27) {
					}

					this.aClass44_Sub3_Sub1_Sub2_964 = new Class44_Sub3_Sub1_Sub2(var5, "mapmarker", 0);
					this.aClass44_Sub3_Sub1_Sub2_965 = new Class44_Sub3_Sub1_Sub2(var5, "mapmarker", 1);

					for (var11 = 0; var11 < 8; ++var11) {
						this.aClass44_Sub3_Sub1_Sub2Array1215[var11] = new Class44_Sub3_Sub1_Sub2(var5, "cross", var11);
					}

					this.aClass44_Sub3_Sub1_Sub2_1187 = new Class44_Sub3_Sub1_Sub2(var5, "mapdots", 0);
					this.aClass44_Sub3_Sub1_Sub2_1188 = new Class44_Sub3_Sub1_Sub2(var5, "mapdots", 1);
					this.aClass44_Sub3_Sub1_Sub2_1189 = new Class44_Sub3_Sub1_Sub2(var5, "mapdots", 2);
					this.aClass44_Sub3_Sub1_Sub2_1190 = new Class44_Sub3_Sub1_Sub2(var5, "mapdots", 3);
					this.aClass44_Sub3_Sub1_Sub3_1154 = new Class44_Sub3_Sub1_Sub3(var5, "scrollbar", 0);
					this.aClass44_Sub3_Sub1_Sub3_1155 = new Class44_Sub3_Sub1_Sub3(var5, "scrollbar", 1);
					this.aClass44_Sub3_Sub1_Sub3_875 = new Class44_Sub3_Sub1_Sub3(var5, "redstone1", 0);
					this.aClass44_Sub3_Sub1_Sub3_876 = new Class44_Sub3_Sub1_Sub3(var5, "redstone2", 0);
					this.aClass44_Sub3_Sub1_Sub3_877 = new Class44_Sub3_Sub1_Sub3(var5, "redstone3", 0);
					this.aClass44_Sub3_Sub1_Sub3_878 = new Class44_Sub3_Sub1_Sub3(var5, "redstone1", 0);
					this.aClass44_Sub3_Sub1_Sub3_878.method450();
					this.aClass44_Sub3_Sub1_Sub3_879 = new Class44_Sub3_Sub1_Sub3(var5, "redstone2", 0);
					this.aClass44_Sub3_Sub1_Sub3_879.method450();
					this.aClass44_Sub3_Sub1_Sub3_1210 = new Class44_Sub3_Sub1_Sub3(var5, "redstone1", 0);
					this.aClass44_Sub3_Sub1_Sub3_1210.method451();
					this.aClass44_Sub3_Sub1_Sub3_1211 = new Class44_Sub3_Sub1_Sub3(var5, "redstone2", 0);
					this.aClass44_Sub3_Sub1_Sub3_1211.method451();
					this.aClass44_Sub3_Sub1_Sub3_1212 = new Class44_Sub3_Sub1_Sub3(var5, "redstone3", 0);
					this.aClass44_Sub3_Sub1_Sub3_1212.method451();
					this.aClass44_Sub3_Sub1_Sub3_1213 = new Class44_Sub3_Sub1_Sub3(var5, "redstone1", 0);
					this.aClass44_Sub3_Sub1_Sub3_1213.method450();
					this.aClass44_Sub3_Sub1_Sub3_1213.method451();
					this.aClass44_Sub3_Sub1_Sub3_1214 = new Class44_Sub3_Sub1_Sub3(var5, "redstone2", 0);
					this.aClass44_Sub3_Sub1_Sub3_1214.method450();
					this.aClass44_Sub3_Sub1_Sub3_1214.method451();

					for (var11 = 0; var11 < 2; ++var11) {
						this.aClass44_Sub3_Sub1_Sub3Array914[var11] = new Class44_Sub3_Sub1_Sub3(var5, "mod_icons", var11);
					}

					Class44_Sub3_Sub1_Sub2 var39 = new Class44_Sub3_Sub1_Sub2(var5, "backleft1", 0);
					this.aComponentImageProducer_852 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backleft2", 0);
					this.aComponentImageProducer_853 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backright1", 0);
					this.aComponentImageProducer_854 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backright2", 0);
					this.aComponentImageProducer_855 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backtop1", 0);
					this.aComponentImageProducer_856 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backvmid1", 0);
					this.aComponentImageProducer_857 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backvmid2", 0);
					this.aComponentImageProducer_858 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backvmid3", 0);
					this.aComponentImageProducer_859 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var39 = new Class44_Sub3_Sub1_Sub2(var5, "backhmid2", 0);
					this.aComponentImageProducer_860 = new ComponentImageProducer(var39.anInt1433, var39.anInt1432, this.getGameWindow((byte)7));
					var39.method438(0, false, 0);
					var12 = (int)(Math.random() * 21.0D) - 10;
					int var34 = (int)(Math.random() * 21.0D) - 10;
					int var14 = (int)(Math.random() * 21.0D) - 10;
					int var15 = (int)(Math.random() * 41.0D) - 20;

					for (int var16 = 0; var16 < 100; ++var16) {
						if (this.aClass44_Sub3_Sub1_Sub2Array943[var16] != null) {
							this.aClass44_Sub3_Sub1_Sub2Array943[var16].method436(var14 + var15, 6, var12 + var15, var34 + var15);
						}

						if (this.aClass44_Sub3_Sub1_Sub3Array1018[var16] != null) {
							this.aClass44_Sub3_Sub1_Sub3Array1018[var16].method452(var14 + var15, 6, var12 + var15, var34 + var15);
						}
					}

					this.drawString("Unpacking textures", 83, 7);
					Class44_Sub3_Sub1_Sub1.method423(var6);
					Class44_Sub3_Sub1_Sub1.method427(-42222, 0.8D);
					Class44_Sub3_Sub1_Sub1.method422(20);
					this.drawString("Unpacking config", 86, 7);
					Class26.method253(false, var32);
					GameObjectDefinition.method197(var32);
					Class20.method243(false, var32);
					Class14.method218(var32);
					Class12.method212(var32);
					Class22.method247(false, var32);
					Class32.method269(false, var32);
					Class38.method337(false, var32);
					Class35.method275(false, var32);
					Class14.aBoolean324 = isMembersWorld;
					if (!isLowMemory) {
						this.drawString("Unpacking sounds", 90, 7);
						byte[] var35 = var8.method546("sounds.dat", (byte[])null);
						Buffer var17 = new Buffer(var35, (byte)1);
						Class4.method175(false, var17);
					}

					this.drawString("Unpacking interfaces", 95, 7);
					Class44_Sub3_Sub1_Sub4[] var36 = new Class44_Sub3_Sub1_Sub4[]{this.aClass44_Sub3_Sub1_Sub4_1075, this.aClass44_Sub3_Sub1_Sub4_1076, this.aClass44_Sub3_Sub1_Sub4_1077, this.aClass44_Sub3_Sub1_Sub4_1078};
					Class5.method181(var4, var5, var36);
					this.drawString("Preparing game engine", 100, 7);

					int var18;
					int var19;
					int var20;
					int var37;
					for (var37 = 0; var37 < 33; ++var37) {
						var18 = 999;
						var19 = 0;

						for (var20 = 0; var20 < 34; ++var20) {
							if (this.aClass44_Sub3_Sub1_Sub3_1202.aByteArray1445[var20 + this.aClass44_Sub3_Sub1_Sub3_1202.anInt1447 * var37] == 0) {
								if (var18 == 999) {
									var18 = var20;
								}
							} else if (var18 != 999) {
								var19 = var20;
								break;
							}
						}

						this.anIntArray883[var37] = var18;
						this.anIntArray1054[var37] = var19 - var18;
					}

					for (var37 = 5; var37 < 156; ++var37) {
						var18 = 999;
						var19 = 0;

						for (var20 = 25; var20 < 172; ++var20) {
							if (this.aClass44_Sub3_Sub1_Sub3_1202.aByteArray1445[var20 + this.aClass44_Sub3_Sub1_Sub3_1202.anInt1447 * var37] == 0 && (var20 > 34 || var37 > 34)) {
								if (var18 == 999) {
									var18 = var20;
								}
							} else if (var18 != 999) {
								var19 = var20;
								break;
							}
						}

						this.anIntArray1136[var37 - 5] = var18 - 25;
						this.anIntArray1150[var37 - 5] = var19 - var18;
					}

					Class44_Sub3_Sub1_Sub1.method420(479, 6487, 96);
					this.anIntArray1243 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
					Class44_Sub3_Sub1_Sub1.method420(190, 6487, 261);
					this.anIntArray1244 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
					Class44_Sub3_Sub1_Sub1.method420(512, 6487, 334);
					this.anIntArray1245 = Class44_Sub3_Sub1_Sub1.anIntArray1409;
					int[] var38 = new int[9];

					for (var18 = 0; var18 < 9; ++var18) {
						var19 = var18 * 32 + 15 + 128;
						var20 = var19 * 3 + 600;
						int var21 = Class44_Sub3_Sub1_Sub1.anIntArray1407[var19];
						var38[var18] = var20 * var21 >> 16;
					}

					Class36.method314(334, false, 800, 512, 500, var38);
					Class41.method342(var7);
					this.aClass10_1160 = new Class10(anInt1224, this);
					this.startRunnable(this.aClass10_1160, 10);
				} catch (Exception var31) {
					signlink.reporterror("loaderror " + this.aString828 + " " + this.anInt908);
					this.aBoolean1174 = true;
				}
			}
		}
	}

	public int method50(int var1, int var2, int var3, int var4) {
		int var5 = var1 >> 7;
		int var6 = var2 >> 7;
		if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
			int var7 = var4;
			if (var4 < 3 && (this.tileFlags[1][var5][var6] & 2) == 2) {
				var7 = var4 + 1;
			}

			int var8 = var1 & 127;
			int var9 = var2 & 127;
			int var10 = this.anIntArrayArrayArray957[var7][var5][var6] * (128 - var8) + this.anIntArrayArrayArray957[var7][var5 + 1][var6] * var8 >> 7;
			int var11 = var8 * this.anIntArrayArrayArray957[var7][var5 + 1][var6 + 1] + this.anIntArrayArrayArray957[var7][var5][var6 + 1] * (128 - var8) >> 7;
			return var10 * (128 - var9) + var11 * var9 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(LClass44_Sub3_Sub2;IB)V",
		garbageValue = "-85"
	)
	public void method119(Buffer var1, int var2) {
		var1.accessBits((byte)4);
		int var3 = var1.readBit(1, (byte)-96);
		if (var3 != 0) {
			int var4 = var1.readBit(2, (byte)-96);
			if (var4 == 0) {
				this.anIntArray1124[this.anInt1123++] = this.anInt1119;
			} else {
				int var5;
				int var6;
				if (var4 == 1) {
					var5 = var1.readBit(3, (byte)-96);
					aClass44_Sub3_Sub4_Sub6_Sub1_1252.method530(true, var5, false);
					var6 = var1.readBit(1, (byte)-96);
					if (var6 == 1) {
						this.anIntArray1124[this.anInt1123++] = this.anInt1119;
					}

				} else {
					int var7;
					if (var4 == 2) {
						var5 = var1.readBit(3, (byte)-96);
						aClass44_Sub3_Sub4_Sub6_Sub1_1252.method530(true, var5, true);
						var6 = var1.readBit(3, (byte)-96);
						aClass44_Sub3_Sub4_Sub6_Sub1_1252.method530(true, var6, true);
						var7 = var1.readBit(1, (byte)-96);
						if (var7 == 1) {
							this.anIntArray1124[this.anInt1123++] = this.anInt1119;
						}

					} else {
						if (var4 == 3) {
							this.clientPlane = var1.readBit(2, (byte)-96);
							var5 = var1.readBit(7, (byte)-96);
							var6 = var1.readBit(7, (byte)-96);
							var7 = var1.readBit(1, (byte)-96);
							aClass44_Sub3_Sub4_Sub6_Sub1_1252.method529(var5, var7 == 1, false, var6);
							int var8 = var1.readBit(1, (byte)-96);
							if (var8 == 1) {
								this.anIntArray1124[this.anInt1123++] = this.anInt1119;
							}
						}

					}
				}
			}
		}
	}

	public void method37(int var1) {
		++this.anInt868;
		this.method105(0, true);
		this.method32(true, true);
		this.method105(0, false);
		this.method32(false, true);
		this.method55(this.aBoolean1152);
		this.method70();
		int var2;
		int var3;
		if (!this.aBoolean1008) {
			var2 = this.anInt1205;
			if (this.anInt1072 / 256 > var2) {
				var2 = this.anInt1072 / 256;
			}

			if (this.aBooleanArray1161[4] && this.anIntArray904[4] + 128 > var2) {
				var2 = this.anIntArray904[4] + 128;
			}

			var3 = this.anInt1206 + this.anInt888 & 2047;
			this.method17(this.anInt1022, true, var2, this.method50(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600, 0, this.clientPlane) - 50, this.anInt1021, var3, var2 * 3 + 600);
		}

		if (!this.aBoolean1008) {
			var2 = this.method120();
		} else {
			var2 = this.method121(0);
		}

		var3 = this.anInt820;
		int var4 = this.anInt821;
		int var5 = this.anInt822;
		int var6 = this.anInt823;
		int var7 = this.anInt824;

		int var8;
		for (var8 = 0; var8 < 5; ++var8) {
			if (this.aBooleanArray1161[var8]) {
				int var9 = (int)(Math.random() * (double)(this.anIntArray998[var8] * 2 + 1) - (double)this.anIntArray998[var8] + Math.sin((double)this.anIntArray968[var8] * ((double)this.anIntArray844[var8] / 100.0D)) * (double)this.anIntArray904[var8]);
				if (var8 == 0) {
					this.anInt820 += var9;
				}

				if (var8 == 1) {
					this.anInt821 += var9;
				}

				if (var8 == 2) {
					this.anInt822 += var9;
				}

				if (var8 == 3) {
					this.anInt824 = var9 + this.anInt824 & 2047;
				}

				if (var8 == 4) {
					this.anInt823 += var9;
					if (this.anInt823 < 128) {
						this.anInt823 = 128;
					}

					if (this.anInt823 > 383) {
						this.anInt823 = 383;
					}
				}
			}
		}

		var8 = Class44_Sub3_Sub1_Sub1.anInt1418;
		Model.aBoolean1580 = true;
		Model.anInt1583 = 0;
		Model.anInt1581 = super.anInt22 - 4;
		Model.anInt1582 = super.anInt23 - 4;
		DrawingArea.method409();
		this.worldController.method317(this.anInt820, -41301, this.anInt822, this.anInt824, this.anInt821, var2, this.anInt823);
		this.worldController.method292();
		this.method115();
		this.method126();
		this.method57(var8, 502);
		this.method18();
		this.componentImageProducer.drawComponentImage(super.graphics, 4, 4);
		this.anInt820 = var3;
		this.anInt821 = var4;
		this.anInt822 = var5;
		this.anInt823 = var6;
		this.anInt824 = var7;
		this.anInt1219 += var1;
	}

	public void method105(int var1, boolean var2) {
		if (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7 == this.anInt1025 && aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7 == this.anInt1026) {
			this.anInt1025 = 0;
			++anInt981;
			if (anInt981 > 122) {
				anInt981 = 0;
				this.aBuffer_843.writeOpcode(188);
				this.aBuffer_843.writeByte(62);
			}
		}

		int var3 = this.anInt1121;
		if (var2) {
			var3 = 1;
		}

		for (int var4 = 0; var4 < var3; ++var4) {
			Class44_Sub3_Sub4_Sub6_Sub1 var5;
			int var6;
			if (var2) {
				var5 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
				var6 = this.anInt1119 << 14;
			} else {
				var5 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var4]];
				var6 = this.anIntArray1122[var4] << 14;
			}

			if (var5 != null && var5.method532()) {
				var5.aBoolean1677 = (isLowMemory && this.anInt1121 > 50 || this.anInt1121 > 200) && !var2 && var5.anInt1624 == var5.anInt1604;
				int var7 = var5.anInt1599 >> 7;
				int var8 = var5.anInt1600 >> 7;
				if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
					if (var5.aModel_1672 != null && tick >= var5.anInt1667 && tick < var5.anInt1668) {
						var5.aBoolean1677 = false;
						var5.anInt1666 = this.method50(var5.anInt1599, var5.anInt1600, 0, this.clientPlane);
						this.worldController.method290(-23687, var5.anInt1676, var5.anInt1601, var5.anInt1675, var5.anInt1666, var5.anInt1673, 60, var5.anInt1599, this.clientPlane, var5, var5.anInt1600, var5.anInt1674, var6);
					} else {
						if ((var5.anInt1599 & 127) == 64 && (var5.anInt1600 & 127) == 64) {
							if (this.anIntArrayArray1020[var7][var8] == this.anInt868) {
								continue;
							}

							this.anIntArrayArray1020[var7][var8] = this.anInt868;
						}

						var5.anInt1666 = this.method50(var5.anInt1599, var5.anInt1600, 0, this.clientPlane);
						this.worldController.method289(var5.anInt1666, var5, var5.anInt1599, var6, var5.anInt1600, (byte)1, 60, var5.anInt1601, this.clientPlane, var5.aBoolean1602);
					}
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "33993"
	)
	public void method78() {
		signlink.midifade = 0;
		signlink.midi = "stop";
	}

	public Socket method72(int var1) throws IOException {
		return signlink.mainapp != null ? signlink.opensocket(var1) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), var1);
	}

	public int method34(boolean var1, Class5 var2, int var3) {
		this.aBoolean905 &= var1;
		if (var2.anIntArrayArray118 != null && var3 < var2.anIntArrayArray118.length) {
			try {
				int[] var4 = var2.anIntArrayArray118[var3];
				int var5 = 0;
				int var6 = 0;
				byte var7 = 0;

				while (true) {
					int var8 = var4[var6++];
					int var9 = 0;
					byte var10 = 0;
					if (var8 == 0) {
						return var5;
					}

					if (var8 == 1) {
						var9 = this.anIntArray884[var4[var6++]];
					}

					if (var8 == 2) {
						var9 = this.anIntArray1153[var4[var6++]];
					}

					if (var8 == 3) {
						var9 = this.anIntArray1253[var4[var6++]];
					}

					Class5 var11;
					int var12;
					int var13;
					if (var8 == 4) {
						var11 = Class5.aClass5Array103[var4[var6++]];
						var12 = var4[var6++];
						if (var12 >= 0 && var12 < Class14.anInt319 && (!Class14.method220(var12).aBoolean340 || isMembersWorld)) {
							for (var13 = 0; var13 < var11.anIntArray104.length; ++var13) {
								if (var12 + 1 == var11.anIntArray104[var13]) {
									var9 += var11.anIntArray105[var13];
								}
							}
						}
					}

					if (var8 == 5) {
						var9 = this.anIntArray1107[var4[var6++]];
					}

					if (var8 == 6) {
						var9 = anIntArray1236[this.anIntArray1153[var4[var6++]] - 1];
					}

					if (var8 == 7) {
						var9 = this.anIntArray1107[var4[var6++]] * 100 / 46875;
					}

					if (var8 == 8) {
						var9 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663;
					}

					int var18;
					if (var8 == 9) {
						for (var18 = 0; var18 < 25; ++var18) {
							if (Class29.aBooleanArray527[var18]) {
								var9 += this.anIntArray1153[var18];
							}
						}
					}

					if (var8 == 10) {
						var11 = Class5.aClass5Array103[var4[var6++]];
						var12 = var4[var6++] + 1;
						if (var12 >= 0 && var12 < Class14.anInt319 && (!Class14.method220(var12).aBoolean340 || isMembersWorld)) {
							for (var13 = 0; var13 < var11.anIntArray104.length; ++var13) {
								if (var12 == var11.anIntArray104[var13]) {
									var9 = 999999999;
									break;
								}
							}
						}
					}

					if (var8 == 11) {
						var9 = this.anInt840;
					}

					if (var8 == 12) {
						var9 = this.anInt921;
					}

					if (var8 == 13) {
						var18 = this.anIntArray1107[var4[var6++]];
						var12 = var4[var6++];
						var9 = (var18 & 1 << var12) == 0 ? 0 : 1;
					}

					if (var8 == 14) {
						var18 = var4[var6++];
						Class35 var19 = Class35.aClass35Array580[var18];
						var13 = var19.anInt582;
						int var14 = var19.anInt583;
						int var15 = var19.anInt584;
						int var16 = anIntArray809[var15 - var14];
						var9 = this.anIntArray1107[var13] >> var14 & var16;
					}

					if (var8 == 15) {
						var10 = 1;
					}

					if (var8 == 16) {
						var10 = 2;
					}

					if (var8 == 17) {
						var10 = 3;
					}

					if (var8 == 18) {
						var9 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7) + this.anInt1055;
					}

					if (var8 == 19) {
						var9 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7) + this.anInt1056;
					}

					if (var8 == 20) {
						var9 = var4[var6++];
					}

					if (var10 == 0) {
						if (var7 == 0) {
							var5 += var9;
						}

						if (var7 == 1) {
							var5 -= var9;
						}

						if (var7 == 2 && var9 != 0) {
							var5 /= var9;
						}

						if (var7 == 3) {
							var5 *= var9;
						}

						var7 = 0;
					} else {
						var7 = var10;
					}
				}
			} catch (Exception var17) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	public void method49(int var1, int var2, String var3, String var4) {
		if (var2 == 0 && this.anInt1110 != -1) {
			this.aString829 = var4;
			super.anInt28 = 0;
		}

		if (this.anInt1011 == -1) {
			this.aBoolean1109 = true;
		}

		for (int var5 = 99; var5 > 0; --var5) {
			this.anIntArray948[var5] = this.anIntArray948[var5 - 1];
			this.aStringArray949[var5] = this.aStringArray949[var5 - 1];
			this.aStringArray950[var5] = this.aStringArray950[var5 - 1];
		}

		this.anIntArray948[0] = var2;
		this.aStringArray949[0] = var3;
		this.aStringArray950[0] = var4;
	}

	public void method10(int var1) {
		var1 = 43 / var1;
		this.aBoolean917 = true;
	}

	public int method43(byte var1) {
		if (var1 == 2) {
			boolean var7 = false;
		} else {
			this.aBuffer_843.writeByte(128);
		}

		for (int var2 = 0; var2 < this.aByteArrayArray886.length; ++var2) {
			if (this.aByteArrayArray886[var2] == null && this.anIntArray831[var2] != -1) {
				return -1;
			}

			if (this.aByteArrayArray953[var2] == null && this.anIntArray832[var2] != -1) {
				return -2;
			}
		}

		boolean var8 = true;

		for (int var3 = 0; var3 < this.aByteArrayArray886.length; ++var3) {
			byte[] var4 = this.aByteArrayArray953[var3];
			if (var4 != null) {
				int var5 = (this.anIntArray830[var3] >> 8) * 64 - this.anInt1055;
				int var6 = (this.anIntArray830[var3] & 255) * 64 - this.anInt1056;
				var8 &= Class3.method159((byte)106, var4, var6, var5);
			}
		}

		if (!var8) {
			return -3;
		} else if (this.aBoolean1249) {
			return -4;
		} else {
			this.loadingState = 2;
			Class3.anInt68 = this.clientPlane;
			this.method19();
			this.aBuffer_843.writeOpcode(214);
			return 0;
		}
	}

	public void method66(int var1, int var2, Buffer var3) {
		int var10000 = var2 + var1;
		var3.accessBits((byte)4);
		int var4 = var3.readBit(8, (byte)-96);
		int var5;
		if (var4 < this.anInt1260) {
			for (var5 = var4; var5 < this.anInt1260; ++var5) {
				this.anIntArray1065[this.anInt1064++] = this.anIntArray1261[var5];
			}
		}

		if (var4 > this.anInt1260) {
			signlink.reporterror(this.aString1147 + " Too many npcs");
			throw new RuntimeException("eek");
		} else {
			this.anInt1260 = 0;

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = this.anIntArray1261[var5];
				Class44_Sub3_Sub4_Sub6_Sub2 var7 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var6];
				int var8 = var3.readBit(1, (byte)-96);
				if (var8 == 0) {
					this.anIntArray1261[this.anInt1260++] = var6;
					var7.anInt1644 = tick;
				} else {
					int var9 = var3.readBit(2, (byte)-96);
					if (var9 == 0) {
						this.anIntArray1261[this.anInt1260++] = var6;
						var7.anInt1644 = tick;
						this.anIntArray1124[this.anInt1123++] = var6;
					} else {
						int var10;
						int var11;
						if (var9 == 1) {
							this.anIntArray1261[this.anInt1260++] = var6;
							var7.anInt1644 = tick;
							var10 = var3.readBit(3, (byte)-96);
							var7.method530(true, var10, false);
							var11 = var3.readBit(1, (byte)-96);
							if (var11 == 1) {
								this.anIntArray1124[this.anInt1123++] = var6;
							}
						} else if (var9 == 2) {
							this.anIntArray1261[this.anInt1260++] = var6;
							var7.anInt1644 = tick;
							var10 = var3.readBit(3, (byte)-96);
							var7.method530(true, var10, true);
							var11 = var3.readBit(3, (byte)-96);
							var7.method530(true, var11, true);
							int var12 = var3.readBit(1, (byte)-96);
							if (var12 == 1) {
								this.anIntArray1124[this.anInt1123++] = var6;
							}
						} else if (var9 == 3) {
							this.anIntArray1065[this.anInt1064++] = var6;
						}
					}
				}
			}

		}
	}

	public void method94(int var1, Buffer var2, int var3) {
		int var4 = var2.readBit(8, (byte)-96);
		int var10000 = var3 + var1;
		int var5;
		if (var4 < this.anInt1121) {
			for (var5 = var4; var5 < this.anInt1121; ++var5) {
				this.anIntArray1065[this.anInt1064++] = this.anIntArray1122[var5];
			}
		}

		if (var4 > this.anInt1121) {
			signlink.reporterror(this.aString1147 + " Too many players");
			throw new RuntimeException("eek");
		} else {
			this.anInt1121 = 0;

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = this.anIntArray1122[var5];
				Class44_Sub3_Sub4_Sub6_Sub1 var7 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var6];
				int var8 = var2.readBit(1, (byte)-96);
				if (var8 == 0) {
					this.anIntArray1122[this.anInt1121++] = var6;
					var7.anInt1644 = tick;
				} else {
					int var9 = var2.readBit(2, (byte)-96);
					if (var9 == 0) {
						this.anIntArray1122[this.anInt1121++] = var6;
						var7.anInt1644 = tick;
						this.anIntArray1124[this.anInt1123++] = var6;
					} else {
						int var10;
						int var11;
						if (var9 == 1) {
							this.anIntArray1122[this.anInt1121++] = var6;
							var7.anInt1644 = tick;
							var10 = var2.readBit(3, (byte)-96);
							var7.method530(true, var10, false);
							var11 = var2.readBit(1, (byte)-96);
							if (var11 == 1) {
								this.anIntArray1124[this.anInt1123++] = var6;
							}
						} else if (var9 == 2) {
							this.anIntArray1122[this.anInt1121++] = var6;
							var7.anInt1644 = tick;
							var10 = var2.readBit(3, (byte)-96);
							var7.method530(true, var10, true);
							var11 = var2.readBit(3, (byte)-96);
							var7.method530(true, var11, true);
							int var12 = var2.readBit(1, (byte)-96);
							if (var12 == 1) {
								this.anIntArray1124[this.anInt1123++] = var6;
							}
						} else if (var9 == 3) {
							this.anIntArray1065[this.anInt1064++] = var6;
						}
					}
				}
			}

		}
	}

	public void method32(boolean var1, boolean var2) {
		for (int var3 = 0; var3 < this.anInt1260; ++var3) {
			Class44_Sub3_Sub4_Sub6_Sub2 var4 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anIntArray1261[var3]];
			int var5 = (this.anIntArray1261[var3] << 14) + 536870912;
			if (var4 != null && var4.method532() && var4.aClass12_1682.aBoolean301 == var1) {
				int var6 = var4.anInt1599 >> 7;
				int var7 = var4.anInt1600 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var4.anInt1603 == 1 && (var4.anInt1599 & 127) == 64 && (var4.anInt1600 & 127) == 64) {
						if (this.anIntArrayArray1020[var6][var7] == this.anInt868) {
							continue;
						}

						this.anIntArrayArray1020[var6][var7] = this.anInt868;
					}

					this.worldController.method289(this.method50(var4.anInt1599, var4.anInt1600, 0, this.clientPlane), var4, var4.anInt1599, var5, var4.anInt1600, (byte)1, (var4.anInt1603 - 1) * 64 + 60, var4.anInt1601, this.clientPlane, var4.aBoolean1602);
				}
			}
		}

		this.aBoolean905 &= var2;
	}

	public void method136(Class44_Sub3_Sub4_Sub6 var1, int var2, int var3) {
		if (var1.anInt1599 < 128 || var1.anInt1600 < 128 || var1.anInt1599 >= 13184 || var1.anInt1600 >= 13184) {
			var1.anInt1627 = -1;
			var1.anInt1632 = -1;
			var1.anInt1641 = 0;
			var1.anInt1642 = 0;
			var1.anInt1599 = var1.anInt1603 * 64 + var1.anIntArray1649[0] * 128;
			var1.anInt1600 = var1.anInt1603 * 64 + var1.anIntArray1650[0] * 128;
			var1.method531();
		}

		if (var1 == aClass44_Sub3_Sub4_Sub6_Sub1_1252 && (var1.anInt1599 < 1536 || var1.anInt1600 < 1536 || var1.anInt1599 >= 11776 || var1.anInt1600 >= 11776)) {
			var1.anInt1627 = -1;
			var1.anInt1632 = -1;
			var1.anInt1641 = 0;
			var1.anInt1642 = 0;
			var1.anInt1599 = var1.anInt1603 * 64 + var1.anIntArray1649[0] * 128;
			var1.anInt1600 = var1.anInt1603 * 64 + var1.anIntArray1650[0] * 128;
			var1.method531();
		}

		if (var1.anInt1641 > tick) {
			this.method137(var1, 896);
		} else if (var1.anInt1642 >= tick) {
			this.method138(var1, this.anInt1133);
		} else {
			this.method139(0, var1);
		}

		this.method140(var1);
		this.method141(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(ZZ)V",
		garbageValue = "0"
	)
	public void loginScreen(boolean var1, boolean var2) {
		this.method16(this.anInt845);
		this.aComponentImageProducer_1041.initDrawingArea();
		this.aClass44_Sub3_Sub1_Sub3_1263.method453(this.aByte1070, 0, 0);
		short var3 = 360;
		short var4 = 200;
		int var5;
		int var6;
		int var7;
		if (this.anInt1005 == 0) {
			var5 = var4 / 2 + 80;
			this.aClass44_Sub3_Sub1_Sub4_1075.method456(0, var3 / 2, var5, this.aClass43_Sub1_1015.loginScreenBottomText, 7711145, true);
			var5 = var4 / 2 - 20;
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5, "Welcome to RuneScape", 16776960, true);
			var5 += 30;
			var6 = var3 / 2 - 80;
			var7 = var4 / 2 + 20;
			this.aClass44_Sub3_Sub1_Sub3_1264.method453(this.aByte1070, var6 - 73, var7 - 20);
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var6, var7 + 5, "New User", 16777215, true);
			var6 = var3 / 2 + 80;
			this.aClass44_Sub3_Sub1_Sub3_1264.method453(this.aByte1070, var6 - 73, var7 - 20);
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var6, var7 + 5, "Existing User", 16777215, true);
		}

		if (this.anInt1005 == 2) {
			var5 = var4 / 2 - 40;
			if (this.aString932.length() > 0) {
				this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5 - 15, this.aString932, 16776960, true);
				this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5, this.aString933, 16776960, true);
				var5 += 30;
			} else {
				this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5 - 7, this.aString933, 16776960, true);
				var5 += 30;
			}

			this.aClass44_Sub3_Sub1_Sub4_1077.method460("Username: " + this.aString1147 + (this.anInt955 == 0 & tick % 40 < 20 ? "@yel@|" : ""), this.anInt1033, true, var5, var3 / 2 - 90, 16777215);
			var5 += 15;
			this.aClass44_Sub3_Sub1_Sub4_1077.method460("Password: " + Class48.method553(this.aString1148) + (this.anInt955 == 1 & tick % 40 < 20 ? "@yel@|" : ""), this.anInt1033, true, var5, var3 / 2 - 88, 16777215);
			var5 += 15;
			if (!var1) {
				var6 = var3 / 2 - 80;
				var7 = var4 / 2 + 50;
				this.aClass44_Sub3_Sub1_Sub3_1264.method453(this.aByte1070, var6 - 73, var7 - 20);
				this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var6, var7 + 5, "Login", 16777215, true);
				var6 = var3 / 2 + 80;
				this.aClass44_Sub3_Sub1_Sub3_1264.method453(this.aByte1070, var6 - 73, var7 - 20);
				this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var6, var7 + 5, "Cancel", 16777215, true);
			}
		}

		if (this.anInt1005 == 3) {
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var4 / 2 - 60, "Create a free account", 16776960, true);
			var5 = var4 / 2 - 35;
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5, "To create a new account you need to", 16777215, true);
			var5 += 15;
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5, "go back to the main RuneScape webpage", 16777215, true);
			var5 += 15;
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5, "and choose the red 'create account'", 16777215, true);
			var5 += 15;
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var3 / 2, var5, "button at the top right of that page.", 16777215, true);
			var5 += 15;
			var6 = var3 / 2;
			var7 = var4 / 2 + 50;
			this.aClass44_Sub3_Sub1_Sub3_1264.method453(this.aByte1070, var6 - 73, var7 - 20);
			this.aClass44_Sub3_Sub1_Sub4_1077.method456(0, var6, var7 + 5, "Cancel", 16777215, true);
		}

		this.aComponentImageProducer_1041.drawComponentImage(super.graphics, 202, 171);
		if (this.aBoolean917) {
			this.aBoolean917 = false;
			this.aComponentImageProducer_1039.drawComponentImage(super.graphics, 128, 0);
			this.aComponentImageProducer_1040.drawComponentImage(super.graphics, 202, 371);
			this.aComponentImageProducer_1044.drawComponentImage(super.graphics, 0, 265);
			this.aComponentImageProducer_1045.drawComponentImage(super.graphics, 562, 265);
			this.aComponentImageProducer_1046.drawComponentImage(super.graphics, 128, 171);
			this.aComponentImageProducer_1047.drawComponentImage(super.graphics, 562, 171);
		}

	}

	public void method25(int var1, Buffer var2, int var3) {
		while (true) {
			if (var2.anInt1375 + 21 < var3 * 8) {
				int var4 = var2.readBit(14, (byte)-96);
				if (var4 != 16383) {
					if (this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var4] == null) {
						this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var4] = new Class44_Sub3_Sub4_Sub6_Sub2();
					}

					Class44_Sub3_Sub4_Sub6_Sub2 var5 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var4];
					this.anIntArray1261[this.anInt1260++] = var4;
					var5.anInt1644 = tick;
					var5.aClass12_1682 = Class12.method214(var2.readBit(11, (byte)-96));
					var5.anInt1603 = var5.aClass12_1682.aByte283;
					var5.anInt1647 = var5.aClass12_1682.anInt305;
					var5.anInt1606 = var5.aClass12_1682.anInt287;
					var5.anInt1607 = var5.aClass12_1682.anInt288;
					var5.anInt1608 = var5.aClass12_1682.anInt289;
					var5.anInt1609 = var5.aClass12_1682.anInt290;
					var5.anInt1604 = var5.aClass12_1682.anInt286;
					int var6 = var2.readBit(5, (byte)-96);
					if (var6 > 15) {
						var6 -= 32;
					}

					int var7 = var2.readBit(5, (byte)-96);
					if (var7 > 15) {
						var7 -= 32;
					}

					int var8 = var2.readBit(1, (byte)-96);
					var5.method529(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0] + var6, var8 == 1, false, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0] + var7);
					int var9 = var2.readBit(1, (byte)-96);
					if (var9 == 1) {
						this.anIntArray1124[this.anInt1123++] = var4;
					}
					continue;
				}
			}

			var2.accessBytes(941);
			return;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method83() {
		if (this.anInt1074 != 0) {
			int var1 = 0;
			if (this.anInt803 != 0) {
				var1 = 1;
			}

			for (int var2 = 0; var2 < 100; ++var2) {
				if (this.aStringArray950[var2] != null) {
					int var3 = this.anIntArray948[var2];
					String var4 = this.aStringArray949[var2];
					boolean var5 = false;
					boolean var6;
					if (var4 != null && var4.startsWith("@cr1@")) {
						var4 = var4.substring(5);
						var6 = true;
					}

					if (var4 != null && var4.startsWith("@cr2@")) {
						var4 = var4.substring(5);
						var6 = true;
					}

					if ((var3 == 3 || var3 == 7) && (var3 == 7 || this.anInt972 == 0 || this.anInt972 == 1 && this.method22(-238, var4))) {
						int var8 = 329 - var1 * 13;
						if (super.anInt22 > 4 && super.anInt23 - 4 > var8 - 10 && super.anInt23 - 4 <= var8 + 3) {
							int var7 = this.aClass44_Sub3_Sub1_Sub4_1076.method457(-43341, "From:  " + var4 + this.aStringArray950[var2]) + 25;
							if (var7 > 450) {
								var7 = 450;
							}

							if (super.anInt22 < var7 + 4) {
								if (this.anInt866 >= 1) {
									this.aStringArray1114[this.anInt980] = "Report abuse @whi@" + var4;
									this.anIntArray1193[this.anInt980] = 2524;
									++this.anInt980;
								}

								this.aStringArray1114[this.anInt980] = "Add ignore @whi@" + var4;
								this.anIntArray1193[this.anInt980] = 2047;
								++this.anInt980;
								this.aStringArray1114[this.anInt980] = "Add friend @whi@" + var4;
								this.anIntArray1193[this.anInt980] = 2605;
								++this.anInt980;
							}
						}

						++var1;
						if (var1 >= 5) {
							return;
						}
					}

					if ((var3 == 5 || var3 == 6) && this.anInt972 < 2) {
						++var1;
						if (var1 >= 5) {
							return;
						}
					}
				}
			}

		}
	}

	public void method145(Buffer var1, int var2, int var3) {
		while (true) {
			if (var1.anInt1375 + 10 < var2 * 8) {
				int var4 = var1.readBit(11, (byte)-96);
				if (var4 != 2047) {
					if (this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var4] == null) {
						this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var4] = new Class44_Sub3_Sub4_Sub6_Sub1();
						if (this.aBufferArray1125[var4] != null) {
							this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var4].method534(this.aBufferArray1125[var4], this.anInt801);
						}
					}

					this.anIntArray1122[this.anInt1121++] = var4;
					Class44_Sub3_Sub4_Sub6_Sub1 var5 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var4];
					var5.anInt1644 = tick;
					int var6 = var1.readBit(5, (byte)-96);
					if (var6 > 15) {
						var6 -= 32;
					}

					int var7 = var1.readBit(5, (byte)-96);
					if (var7 > 15) {
						var7 -= 32;
					}

					int var8 = var1.readBit(1, (byte)-96);
					var5.method529(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0] + var6, var8 == 1, false, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0] + var7);
					int var9 = var1.readBit(1, (byte)-96);
					if (var9 == 1) {
						this.anIntArray1124[this.anInt1123++] = var4;
					}
					continue;
				}
			}

			var1.accessBytes(941);
			var3 = 7 / var3;
			return;
		}
	}

	public void method101(int var1, int var2, byte var3, Class44_Sub3_Sub4_Sub6_Sub1 var4, Buffer var5) {
		if (var3 == this.aByte836) {
			int var6;
			if ((var1 & 1) == 1) {
				var6 = var5.readUByte();
				byte[] var7 = new byte[var6];
				Buffer var8 = new Buffer(var7, (byte)1);
				var5.readArray(var6, var7, 0, 0);
				this.aBufferArray1125[var2] = var8;
				var4.method534(var8, this.anInt801);
			}

			int var15;
			int var16;
			if ((var1 & 2) == 2) {
				var6 = var5.readUShort();
				if (var6 == 65535) {
					var6 = -1;
				}

				if (var4.anInt1627 == var6) {
					var4.anInt1631 = 0;
				}

				var15 = var5.readUByte();
				if (var4.anInt1627 == var6 && var6 != -1) {
					var16 = Class26.aClass26Array497[var6].anInt511;
					if (var16 == 1) {
						var4.anInt1628 = 0;
						var4.anInt1629 = 0;
						var4.anInt1630 = var15;
						var4.anInt1631 = 0;
					}

					if (var16 == 2) {
						var4.anInt1631 = 0;
					}
				} else if (var6 == -1 || var4.anInt1627 == -1 || Class26.aClass26Array497[var6].anInt505 >= Class26.aClass26Array497[var4.anInt1627].anInt505) {
					var4.anInt1627 = var6;
					var4.anInt1628 = 0;
					var4.anInt1629 = 0;
					var4.anInt1630 = var15;
					var4.anInt1631 = 0;
					var4.anInt1653 = var4.anInt1648;
				}
			}

			if ((var1 & 4) == 4) {
				var4.anInt1621 = var5.readUShort();
				if (var4.anInt1621 == 65535) {
					var4.anInt1621 = -1;
				}
			}

			if ((var1 & 8) == 8) {
				var4.aString1611 = var5.readString();
				var4.anInt1613 = 0;
				var4.anInt1614 = 0;
				var4.anInt1612 = 150;
				this.method49(-476, 2, var4.aString1657, var4.aString1611);
			}

			if ((var1 & 16) == 16) {
				var6 = var5.readUByte();
				var15 = var5.readUByte();
				var4.method533(tick, (byte)8, var6, var15);
				var4.anInt1618 = tick + 300;
				var4.anInt1619 = var5.readUByte();
				var4.anInt1620 = var5.readUByte();
			}

			if ((var1 & 32) == 32) {
				var4.anInt1622 = var5.readUShort();
				var4.anInt1623 = var5.readUShort();
			}

			if ((var1 & 64) == 64) {
				var6 = var5.readUShort();
				var15 = var5.readUByte();
				var16 = var5.readUByte();
				int var9 = var5.offset;
				if (var4.aString1657 != null && var4.aBoolean1658) {
					long var10 = Class48.method547(var4.aString1657);
					boolean var12 = false;
					if (var15 <= 1) {
						for (int var13 = 0; var13 < this.anInt961; ++var13) {
							if (this.aLongArray817[var13] == var10) {
								var12 = true;
								break;
							}
						}
					}

					if (!var12 && this.anInt890 == 0) {
						try {
							String var17 = Class49.method554((byte)8, var16, var5);
							var17 = Class41.method352((byte)3, var17);
							var4.aString1611 = var17;
							var4.anInt1613 = var6 >> 8;
							var4.anInt1614 = var6 & 255;
							var4.anInt1612 = 150;
							if (var15 != 2 && var15 != 3) {
								if (var15 == 1) {
									this.method49(-476, 1, "@cr1@" + var4.aString1657, var17);
								} else {
									this.method49(-476, 2, var4.aString1657, var17);
								}
							} else {
								this.method49(-476, 1, "@cr2@" + var4.aString1657, var17);
							}
						} catch (Exception var14) {
							signlink.reporterror("cde2");
						}
					}
				}

				var5.offset = var9 + var16;
			}

			if ((var1 & 256) == 256) {
				var4.anInt1632 = var5.readUShort();
				var6 = var5.readInt();
				var4.anInt1636 = var6 >> 16;
				var4.anInt1635 = (var6 & 65535) + tick;
				var4.anInt1633 = 0;
				var4.anInt1634 = 0;
				if (var4.anInt1635 > tick) {
					var4.anInt1633 = -1;
				}

				if (var4.anInt1632 == 65535) {
					var4.anInt1632 = -1;
				}
			}

			if ((var1 & 512) == 512) {
				var4.anInt1637 = var5.readUByte();
				var4.anInt1639 = var5.readUByte();
				var4.anInt1638 = var5.readUByte();
				var4.anInt1640 = var5.readUByte();
				var4.anInt1641 = var5.readUShort() + tick;
				var4.anInt1642 = var5.readUShort() + tick;
				var4.anInt1643 = var5.readUByte();
				var4.method531();
			}

			if ((var1 & 1024) == 1024) {
				var6 = var5.readUByte();
				var15 = var5.readUByte();
				var4.method533(tick, (byte)8, var6, var15);
				var4.anInt1618 = tick + 300;
				var4.anInt1619 = var5.readUByte();
				var4.anInt1620 = var5.readUByte();
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "0"
	)
	public boolean method112() {
		if (this.aClass7_1108 == null) {
			return false;
		} else {
			int var3;
			try {
				int var1 = this.aClass7_1108.method193();
				if (var1 == 0) {
					return false;
				}

				if (this.anInt1220 == -1) {
					this.aClass7_1108.method194(this.aBuffer_1135.array, 0, 1);
					this.anInt1220 = this.aBuffer_1135.array[0] & 255;
					if (this.aClass46_944 != null) {
						this.anInt1220 = this.anInt1220 - this.aClass46_944.method542() & 255;
					}

					this.anInt1219 = Class16.anIntArray393[this.anInt1220];
					--var1;
				}

				if (this.anInt1219 == -1) {
					if (var1 <= 0) {
						return false;
					}

					this.aClass7_1108.method194(this.aBuffer_1135.array, 0, 1);
					this.anInt1219 = this.aBuffer_1135.array[0] & 255;
					--var1;
				}

				if (this.anInt1219 == -2) {
					if (var1 <= 1) {
						return false;
					}

					this.aClass7_1108.method194(this.aBuffer_1135.array, 0, 2);
					this.aBuffer_1135.offset = 0;
					this.anInt1219 = this.aBuffer_1135.readUShort();
					var1 -= 2;
				}

				if (var1 < this.anInt1219) {
					return false;
				}

				this.aBuffer_1135.offset = 0;
				this.aClass7_1108.method194(this.aBuffer_1135.array, 0, this.anInt1219);
				this.anInt1221 = 0;
				this.anInt1140 = this.anInt1139;
				this.anInt1139 = this.anInt1138;
				this.anInt1138 = this.anInt1220;
				if (this.anInt1220 == 207) {
					this.anInt818 = this.aBuffer_1135.readUByte();
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 241) {
					this.anInt1013 = this.aBuffer_1135.readUByte();
					this.aBoolean928 = true;
					this.aBoolean841 = true;
					this.anInt1220 = -1;
					return true;
				}

				int var22;
				if (this.anInt1220 == 203) {
					var22 = this.aBuffer_1135.readUShort();
					byte var48 = this.aBuffer_1135.readByte();
					this.anIntArray1172[var22] = var48;
					if (var48 != this.anIntArray1107[var22]) {
						this.anIntArray1107[var22] = var48;
						this.method40(false, var22);
						this.aBoolean928 = true;
						if (this.anInt1110 != -1) {
							this.aBoolean1109 = true;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 115) {
					this.anInt1025 = 0;
					this.anInt1220 = -1;
					return true;
				}

				int var4;
				int var5;
				if (this.anInt1220 == 64) {
					var22 = this.aBuffer_1135.readUByte();
					var3 = this.aBuffer_1135.readUByte();
					var4 = this.aBuffer_1135.readUByte();
					var5 = this.aBuffer_1135.readUByte();
					this.aBooleanArray1161[var22] = true;
					this.anIntArray998[var22] = var3;
					this.anIntArray904[var22] = var4;
					this.anIntArray844[var22] = var5;
					this.anIntArray968[var22] = 0;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 95 || this.anInt1220 == 176 || this.anInt1220 == 219 || this.anInt1220 == 85 || this.anInt1220 == 107 || this.anInt1220 == 52 || this.anInt1220 == 81 || this.anInt1220 == 48 || this.anInt1220 == 173 || this.anInt1220 == 138) {
					this.method67(this.anInt1220, 220, this.aBuffer_1135);
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 211) {
					var22 = this.aBuffer_1135.readUShort();
					this.method28(var22);
					if (this.anInt1216 != -1) {
						this.anInt1216 = -1;
						this.aBoolean928 = true;
						this.aBoolean841 = true;
					}

					if (this.anInt1011 != -1) {
						this.anInt1011 = -1;
						this.aBoolean1109 = true;
					}

					if (this.aBoolean1104) {
						this.aBoolean1104 = false;
						this.aBoolean1109 = true;
					}

					this.anInt1037 = var22;
					this.aBoolean1168 = false;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 192) {
					var22 = this.aBuffer_1135.readUShort();
					Class5.aClass5Array103[var22].anInt152 = 3;
					Class5.aClass5Array103[var22].anInt153 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1662[4] << 18) + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1662[0] << 24) + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[0] << 12) + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[11] + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1661[8] << 6);
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 210) {
					this.aBoolean1265 = false;
					this.aBoolean1104 = true;
					this.aString1182 = "";
					this.aBoolean1109 = true;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 130) {
					var22 = this.aBuffer_1135.readShort();
					this.anInt1110 = var22;
					this.aBoolean1109 = true;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 167) {
					this.method111(this.anInt1219, (byte)-44, this.aBuffer_1135);
					this.aBoolean1249 = false;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 34) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUByte();
					var4 = this.aBuffer_1135.readUShort();
					if (this.aBoolean1080 && !isLowMemory && this.anInt929 < 50) {
						this.anIntArray1048[this.anInt929] = var22;
						this.anIntArray804[this.anInt929] = var3;
						this.anIntArray1083[this.anInt929] = Class4.anIntArray95[var22] + var4;
						++this.anInt929;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 91) {
					this.anInt970 = this.aBuffer_1135.readInt();
					this.anInt1010 = this.aBuffer_1135.readUShort();
					this.anInt1029 = this.aBuffer_1135.readUByte();
					this.anInt887 = this.aBuffer_1135.readUShort();
					this.anInt1100 = this.aBuffer_1135.readUByte();
					if (this.anInt970 != 0 && this.anInt1037 == -1) {
						signlink.dnslookup(Class48.method550((byte)94, this.anInt970));
						this.method45();
						short var49 = 650;
						if (this.anInt1029 != 201 || this.anInt1100 == 1) {
							var49 = 655;
						}

						this.aString951 = "";
						this.aBoolean1128 = false;

						for (var3 = 0; var3 < Class5.aClass5Array103.length; ++var3) {
							if (Class5.aClass5Array103[var3] != null && var49 == Class5.aClass5Array103[var3].anInt112) {
								this.anInt1037 = Class5.aClass5Array103[var3].anInt109;
								break;
							}
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 88) {
					this.method80();
					this.anInt1220 = -1;
					return false;
				}

				Class5 var39;
				if (this.anInt1220 == 134) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readShort();
					var39 = Class5.aClass5Array103[var22];
					var39.anInt156 = var3;
					if (var3 == -1) {
						var39.anInt106 = 0;
						var39.anInt107 = 0;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 156) {
					this.anInt1200 = this.aBuffer_1135.readUByte();
					if (this.anInt1200 == 1) {
						this.anInt920 = this.aBuffer_1135.readUShort();
					}

					if (this.anInt1200 >= 2 && this.anInt1200 <= 6) {
						if (this.anInt1200 == 2) {
							this.anInt1165 = 64;
							this.anInt1166 = 64;
						}

						if (this.anInt1200 == 3) {
							this.anInt1165 = 0;
							this.anInt1166 = 64;
						}

						if (this.anInt1200 == 4) {
							this.anInt1165 = 128;
							this.anInt1166 = 64;
						}

						if (this.anInt1200 == 5) {
							this.anInt1165 = 64;
							this.anInt1166 = 0;
						}

						if (this.anInt1200 == 6) {
							this.anInt1165 = 64;
							this.anInt1166 = 128;
						}

						this.anInt1200 = 2;
						this.anInt1162 = this.aBuffer_1135.readUShort();
						this.anInt1163 = this.aBuffer_1135.readUShort();
						this.anInt1164 = this.aBuffer_1135.readUByte();
					}

					if (this.anInt1200 == 10) {
						this.anInt1181 = this.aBuffer_1135.readUShort();
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 67) {
					if (this.anInt1013 == 12) {
						this.aBoolean928 = true;
					}

					this.anInt921 = this.aBuffer_1135.readShort();
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 3) {
					this.anInt961 = this.anInt1219 / 8;

					for (var22 = 0; var22 < this.anInt961; ++var22) {
						this.aLongArray817[var22] = this.aBuffer_1135.readLong(0);
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 142) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					Class5.aClass5Array103[var22].anInt152 = 2;
					Class5.aClass5Array103[var22].anInt153 = var3;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 215) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUByte();
					if (var22 == 65535) {
						var22 = -1;
					}

					this.anIntArray954[var3] = var22;
					this.aBoolean928 = true;
					this.aBoolean841 = true;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 153) {
					this.anInt918 = this.aBuffer_1135.readUByte();
					this.anInt919 = this.aBuffer_1135.readUByte();

					for (var22 = this.anInt918; var22 < this.anInt918 + 8; ++var22) {
						for (var3 = this.anInt919; var3 < this.anInt919 + 8; ++var3) {
							if (this.aClass28ArrayArrayArray816[this.clientPlane][var22][var3] != null) {
								this.aClass28ArrayArrayArray816[this.clientPlane][var22][var3] = null;
								this.method52(var22, var3);
							}
						}
					}

					for (GameObjectSpawnRequest var47 = (GameObjectSpawnRequest)this.pendingObjectSpawns.peekFront(); var47 != null; var47 = (GameObjectSpawnRequest)this.pendingObjectSpawns.getPrevious(this.aByte958)) {
						if (var47.anInt1312 >= this.anInt918 && var47.anInt1312 < this.anInt918 + 8 && var47.anInt1313 >= this.anInt919 && var47.anInt1313 < this.anInt919 + 8 && var47.anInt1310 == this.clientPlane) {
							var47.delayUntilSpawn = 0;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 114) {
					this.anInt967 = this.aBuffer_1135.readUByte();
					this.anInt972 = this.aBuffer_1135.readUByte();
					this.anInt805 = this.aBuffer_1135.readUByte();
					this.aBoolean1141 = true;
					this.aBoolean1109 = true;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 158) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					if (this.anInt1011 != -1) {
						this.anInt1011 = -1;
						this.aBoolean1109 = true;
					}

					if (this.aBoolean1104) {
						this.aBoolean1104 = false;
						this.aBoolean1109 = true;
					}

					this.anInt1037 = var22;
					this.anInt1216 = var3;
					this.aBoolean928 = true;
					this.aBoolean841 = true;
					this.aBoolean1168 = false;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 240) {
					var22 = this.aBuffer_1135.readShort();
					if (var22 >= 0) {
						this.method28(var22);
					}

					this.anInt1103 = var22;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 195) {
					this.anInt918 = this.aBuffer_1135.readUByte();
					this.anInt919 = this.aBuffer_1135.readUByte();

					while (this.aBuffer_1135.offset < this.anInt1219) {
						var22 = this.aBuffer_1135.readUByte();
						this.method67(var22, 220, this.aBuffer_1135);
					}

					this.anInt1220 = -1;
					return true;
				}

				boolean var6;
				int var7;
				String var37;
				if (this.anInt1220 == 161) {
					String var43 = this.aBuffer_1135.readString();
					long var44;
					if (var43.endsWith(":tradereq:")) {
						var37 = var43.substring(0, var43.indexOf(":"));
						var44 = Class48.method547(var37);
						var6 = false;

						for (var7 = 0; var7 < this.anInt961; ++var7) {
							if (this.aLongArray817[var7] == var44) {
								var6 = true;
								break;
							}
						}

						if (!var6 && this.anInt890 == 0) {
							this.method49(-476, 4, var37, "wishes to trade with you.");
						}
					} else if (!var43.endsWith(":duelreq:")) {
						this.method49(-476, 0, "", var43);
					} else {
						var37 = var43.substring(0, var43.indexOf(":"));
						var44 = Class48.method547(var37);
						var6 = false;

						for (var7 = 0; var7 < this.anInt961; ++var7) {
							if (this.aLongArray817[var7] == var44) {
								var6 = true;
								break;
							}
						}

						if (!var6 && this.anInt890 == 0) {
							this.method49(-476, 8, var37, "wishes to duel with you.");
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 101) {
					this.aBoolean1008 = false;

					for (var22 = 0; var22 < 5; ++var22) {
						this.aBooleanArray1161[var22] = false;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 16) {
					var22 = this.aBuffer_1135.readUShort();
					this.method28(var22);
					if (this.anInt1011 != -1) {
						this.anInt1011 = -1;
						this.aBoolean1109 = true;
					}

					if (this.aBoolean1104) {
						this.aBoolean1104 = false;
						this.aBoolean1109 = true;
					}

					this.anInt1216 = var22;
					this.aBoolean928 = true;
					this.aBoolean841 = true;
					this.anInt1037 = -1;
					this.aBoolean1168 = false;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 44) {
					var22 = this.aBuffer_1135.readUShort();
					var37 = this.aBuffer_1135.readString();
					Class5.aClass5Array103[var22].aString144 = var37;
					if (Class5.aClass5Array103[var22].anInt109 == this.anIntArray954[this.anInt1013]) {
						this.aBoolean928 = true;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 245) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readInt();
					this.anIntArray1172[var22] = var3;
					if (var3 != this.anIntArray1107[var22]) {
						this.anIntArray1107[var22] = var3;
						this.method40(false, var22);
						this.aBoolean928 = true;
						if (this.anInt1110 != -1) {
							this.aBoolean1109 = true;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 166) {
					var22 = this.aBuffer_1135.readUShort();
					this.method28(var22);
					if (this.anInt1216 != -1) {
						this.anInt1216 = -1;
						this.aBoolean928 = true;
						this.aBoolean841 = true;
					}

					this.anInt1011 = var22;
					this.aBoolean1109 = true;
					this.anInt1037 = -1;
					this.aBoolean1168 = false;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 28) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					var4 = this.aBuffer_1135.readUShort();
					Class14 var45 = Class14.method220(var3);
					Class5.aClass5Array103[var22].anInt152 = 4;
					Class5.aClass5Array103[var22].anInt153 = var3;
					Class5.aClass5Array103[var22].anInt159 = var45.anInt332;
					Class5.aClass5Array103[var22].anInt160 = var45.anInt333;
					Class5.aClass5Array103[var22].anInt158 = var45.anInt331 * 100 / var4;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 54) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
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

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 47) {
					Class44_Sub3_Sub4_Sub6_Sub1[] var29 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120;
					var3 = var29.length;

					for (var4 = 0; var4 < var3; ++var4) {
						Class44_Sub3_Sub4_Sub6_Sub1 var40 = var29[var4];
						if (var40 != null) {
							var40.anInt1627 = -1;
						}
					}

					Class44_Sub3_Sub4_Sub6_Sub2[] var31 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259;
					var3 = var31.length;

					for (var4 = 0; var4 < var3; ++var4) {
						Class44_Sub3_Sub4_Sub6_Sub2 var41 = var31[var4];
						if (var41 != null) {
							var41.anInt1627 = -1;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 194) {
					this.anInt1031 = this.aBuffer_1135.readUByte();
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 90) {
					this.anInt1173 = this.aBuffer_1135.readUByte();
					if (this.anInt1173 == this.anInt1013) {
						if (this.anInt1173 == 3) {
							this.anInt1013 = 1;
						} else {
							this.anInt1013 = 3;
						}

						this.aBoolean928 = true;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 89) {
					this.anInt803 = this.aBuffer_1135.readUShort() * 30;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 190) {
					for (var22 = 0; var22 < this.anIntArray1107.length; ++var22) {
						if (this.anIntArray1107[var22] != this.anIntArray1172[var22]) {
							this.anIntArray1107[var22] = this.anIntArray1172[var22];
							this.method40(false, var22);
							this.aBoolean928 = true;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 83) {
					if (this.anInt1013 == 12) {
						this.aBoolean928 = true;
					}

					this.anInt840 = this.aBuffer_1135.readUByte();
					this.anInt1220 = -1;
					return true;
				}

				int var8;
				int var27;
				if (this.anInt1220 == 231) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					if (var22 == this.anInt922 && var3 == this.anInt923 && this.loadingState == 2) {
						this.anInt1220 = -1;
						return true;
					}

					this.anInt922 = var22;
					this.anInt923 = var3;
					this.anInt1055 = (this.anInt922 - 6) * 8;
					this.anInt1056 = (this.anInt923 - 6) * 8;
					this.aBoolean1169 = (this.anInt922 / 8 == 48 || this.anInt922 / 8 == 49) && this.anInt923 / 8 == 48;
					if (this.anInt922 / 8 == 48 && this.anInt923 / 8 == 148) {
						this.aBoolean1169 = true;
					}

					this.loadingState = 1;
					this.aLong1127 = System.currentTimeMillis();
					this.componentImageProducer.initDrawingArea();
					this.aClass44_Sub3_Sub1_Sub4_1076.method455(257, 151, 0, "Loading - please wait.");
					this.aClass44_Sub3_Sub1_Sub4_1076.method455(256, 150, 16777215, "Loading - please wait.");
					this.componentImageProducer.drawComponentImage(super.graphics, 4, 4);
					var4 = 0;

					for (var5 = (this.anInt922 - 6) / 8; var5 <= (this.anInt922 + 6) / 8; ++var5) {
						for (var27 = (this.anInt923 - 6) / 8; var27 <= (this.anInt923 + 6) / 8; ++var27) {
							++var4;
						}
					}

					this.aByteArrayArray886 = new byte[var4][];
					this.aByteArrayArray953 = new byte[var4][];
					this.anIntArray830 = new int[var4];
					this.anIntArray831 = new int[var4];
					this.anIntArray832 = new int[var4];
					var4 = 0;

					for (var5 = (this.anInt922 - 6) / 8; var5 <= (this.anInt922 + 6) / 8; ++var5) {
						for (var27 = (this.anInt923 - 6) / 8; var27 <= (this.anInt923 + 6) / 8; ++var27) {
							this.anIntArray830[var4] = var27 + (var5 << 8);
							if (!this.aBoolean1169 || var27 != 49 && var27 != 149 && var27 != 147 && var5 != 50 && (var5 != 49 || var27 != 47)) {
								var7 = this.anIntArray831[var4] = this.aClass43_Sub1_1015.method387(0, var5, false, var27);
								if (var7 != -1) {
									this.aClass43_Sub1_1015.method392(3, var7);
								}

								var8 = this.anIntArray832[var4] = this.aClass43_Sub1_1015.method387(1, var5, false, var27);
								if (var8 != -1) {
									this.aClass43_Sub1_1015.method392(3, var8);
								}

								++var4;
							} else {
								this.anIntArray831[var4] = -1;
								this.anIntArray832[var4] = -1;
								++var4;
							}
						}
					}

					var5 = this.anInt1055 - this.anInt1057;
					var27 = this.anInt1056 - this.anInt1058;
					this.anInt1057 = this.anInt1055;
					this.anInt1058 = this.anInt1056;

					int[] var10000;
					int var33;
					for (var7 = 0; var7 < 16384; ++var7) {
						Class44_Sub3_Sub4_Sub6_Sub2 var32 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var7];
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

					for (var7 = 0; var7 < this.anInt1118; ++var7) {
						Class44_Sub3_Sub4_Sub6_Sub1 var34 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var7];
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

					this.aBoolean1249 = true;
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
									this.aClass28ArrayArrayArray816[var17][var13][var14] = this.aClass28ArrayArrayArray816[var17][var15][var16];
								} else {
									this.aClass28ArrayArrayArray816[var17][var13][var14] = null;
								}
							}
						}
					}

					for (GameObjectSpawnRequest var46 = (GameObjectSpawnRequest)this.pendingObjectSpawns.peekFront(); var46 != null; var46 = (GameObjectSpawnRequest)this.pendingObjectSpawns.getPrevious(this.aByte958)) {
						var46.anInt1312 -= var5;
						var46.anInt1313 -= var27;
						if (var46.anInt1312 < 0 || var46.anInt1313 < 0 || var46.anInt1312 >= 104 || var46.anInt1313 >= 104) {
							var46.removeNode();
						}
					}

					if (this.anInt1025 != 0) {
						this.anInt1025 -= var5;
						this.anInt1026 -= var27;
					}

					this.aBoolean1008 = false;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 171) {
					if (this.anInt1216 != -1) {
						this.anInt1216 = -1;
						this.aBoolean928 = true;
						this.aBoolean841 = true;
					}

					if (this.anInt1011 != -1) {
						this.anInt1011 = -1;
						this.aBoolean1109 = true;
					}

					if (this.aBoolean1104) {
						this.aBoolean1104 = false;
						this.aBoolean1109 = true;
					}

					this.anInt1037 = -1;
					this.aBoolean1168 = false;
					this.anInt1220 = -1;
					return true;
				}

				long var21;
				if (this.anInt1220 == 247) {
					var21 = this.aBuffer_1135.readLong(0);
					var4 = this.aBuffer_1135.readUByte();
					String var30 = Class48.method551(131, Class48.method548(0, var21));

					for (var27 = 0; var27 < this.anInt1115; ++var27) {
						if (var21 == this.aLongArray1159[var27]) {
							if (var4 != this.anIntArray1073[var27]) {
								this.anIntArray1073[var27] = var4;
								this.aBoolean928 = true;
								if (var4 > 0) {
									this.method49(-476, 5, "", var30 + " has logged in.");
								}

								if (var4 == 0) {
									this.method49(-476, 5, "", var30 + " has logged out.");
								}
							}

							var30 = null;
							break;
						}
					}

					if (var30 != null && this.anInt1115 < 200) {
						this.aLongArray1159[this.anInt1115] = var21;
						this.aStringArray833[this.anInt1115] = var30;
						this.anIntArray1073[this.anInt1115] = var4;
						++this.anInt1115;
						this.aBoolean928 = true;
					}

					var6 = false;

					while (!var6) {
						var6 = true;

						for (var7 = 0; var7 < this.anInt1115 - 1; ++var7) {
							if (localWorldId != this.anIntArray1073[var7] && this.anIntArray1073[var7 + 1] == localWorldId || this.anIntArray1073[var7] == 0 && this.anIntArray1073[var7 + 1] != 0) {
								var8 = this.anIntArray1073[var7];
								this.anIntArray1073[var7] = this.anIntArray1073[var7 + 1];
								this.anIntArray1073[var7 + 1] = var8;
								String var9 = this.aStringArray833[var7];
								this.aStringArray833[var7] = this.aStringArray833[var7 + 1];
								this.aStringArray833[var7 + 1] = var9;
								long var10 = this.aLongArray1159[var7];
								this.aLongArray1159[var7] = this.aLongArray1159[var7 + 1];
								this.aLongArray1159[var7 + 1] = var10;
								this.aBoolean928 = true;
								var6 = false;
							}
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 10) {
					var22 = this.aBuffer_1135.readUShort();
					boolean var26 = this.aBuffer_1135.readUByte() == 1;
					Class5.aClass5Array103[var22].aBoolean124 = var26;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 105) {
					this.aBoolean928 = true;
					var22 = this.aBuffer_1135.readUByte();
					var3 = this.aBuffer_1135.readInt();
					var4 = this.aBuffer_1135.readUByte();
					this.anIntArray1253[var22] = var3;
					this.anIntArray884[var22] = var4;
					this.anIntArray1153[var22] = 1;

					for (var5 = 0; var5 < 98; ++var5) {
						if (var3 >= anIntArray1236[var5]) {
							this.anIntArray1153[var22] = var5 + 2;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 23) {
					var22 = this.aBuffer_1135.readUShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					if (var22 != this.anInt1030 && this.aBoolean1069 && !isLowMemory && this.anInt927 == 0) {
						this.anInt1183 = var22;
						this.aBoolean1184 = true;
						this.aClass43_Sub1_1015.method392(2, this.anInt1183);
					}

					this.anInt1030 = var22;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 15) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					if (this.aBoolean1069 && !isLowMemory) {
						this.anInt1183 = var22;
						this.aBoolean1184 = false;
						this.aClass43_Sub1_1015.method392(2, this.anInt1183);
						this.anInt927 = var3;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 200) {
					this.aBoolean1008 = true;
					this.anInt869 = this.aBuffer_1135.readUByte();
					this.anInt870 = this.aBuffer_1135.readUByte();
					this.anInt871 = this.aBuffer_1135.readUShort();
					this.anInt872 = this.aBuffer_1135.readUByte();
					this.anInt873 = this.aBuffer_1135.readUByte();
					if (this.anInt873 >= 100) {
						this.anInt820 = this.anInt869 * 128 + 64;
						this.anInt822 = this.anInt870 * 128 + 64;
						this.anInt821 = this.method50(this.anInt820, this.anInt822, 0, this.clientPlane) - this.anInt871;
					}

					this.anInt1220 = -1;
					return true;
				}

				Class5 var23;
				if (this.anInt1220 == 172) {
					this.aBoolean928 = true;
					var22 = this.aBuffer_1135.readUShort();
					var23 = Class5.aClass5Array103[var22];

					while (this.aBuffer_1135.offset < this.anInt1219) {
						var4 = this.aBuffer_1135.readUByte();
						var5 = this.aBuffer_1135.readUShort();
						var27 = this.aBuffer_1135.readUByte();
						if (var27 == 255) {
							var27 = this.aBuffer_1135.readInt();
						}

						if (var4 >= 0 && var4 < var23.anIntArray104.length) {
							var23.anIntArray104[var4] = var5;
							var23.anIntArray105[var4] = var27;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 17) {
					var22 = this.aBuffer_1135.readUByte();
					var3 = this.aBuffer_1135.readUByte();
					String var25 = this.aBuffer_1135.readString();
					if (var22 >= 1 && var22 <= 5) {
						if (var25.equalsIgnoreCase("null")) {
							var25 = null;
						}

						this.aStringArray799[var22 - 1] = var25;
						this.aBooleanArray800[var22 - 1] = var3 == 0;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 32) {
					this.anInt918 = this.aBuffer_1135.readUByte();
					this.anInt919 = this.aBuffer_1135.readUByte();
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 106) {
					this.aBoolean928 = true;
					var22 = this.aBuffer_1135.readUShort();
					var23 = Class5.aClass5Array103[var22];
					var4 = this.aBuffer_1135.readUByte();

					for (var5 = 0; var5 < var4; ++var5) {
						var23.anIntArray104[var5] = this.aBuffer_1135.readUShort();
						var27 = this.aBuffer_1135.readUByte();
						if (var27 == 255) {
							var27 = this.aBuffer_1135.readInt();
						}

						var23.anIntArray105[var5] = var27;
					}

					for (var5 = var4; var5 < var23.anIntArray104.length; ++var5) {
						var23.anIntArray104[var5] = 0;
						var23.anIntArray105[var5] = 0;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 133) {
					this.anInt947 = this.aBuffer_1135.readUShort();
					this.anInt808 = this.aBuffer_1135.readUByte();
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 129) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					Class5.aClass5Array103[var22].anInt152 = 1;
					Class5.aClass5Array103[var22].anInt153 = var3;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 233) {
					this.aBoolean1008 = true;
					this.anInt909 = this.aBuffer_1135.readUByte();
					this.anInt910 = this.aBuffer_1135.readUByte();
					this.anInt911 = this.aBuffer_1135.readUShort();
					this.anInt912 = this.aBuffer_1135.readUByte();
					this.anInt913 = this.aBuffer_1135.readUByte();
					if (this.anInt913 >= 100) {
						var22 = this.anInt909 * 128 + 64;
						var3 = this.anInt910 * 128 + 64;
						var4 = this.method50(var22, var3, 0, this.clientPlane) - this.anInt911;
						var5 = var22 - this.anInt820;
						var27 = var4 - this.anInt821;
						var7 = var3 - this.anInt822;
						var8 = (int)Math.sqrt((double)(var5 * var5 + var7 * var7));
						this.anInt823 = (int)(Math.atan2((double)var27, (double)var8) * 325.949D) & 2047;
						this.anInt824 = (int)(Math.atan2((double)var5, (double)var7) * -325.949D) & 2047;
						if (this.anInt823 < 128) {
							this.anInt823 = 128;
						}

						if (this.anInt823 > 383) {
							this.anInt823 = 383;
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 227) {
					var22 = this.aBuffer_1135.readUShort();
					var23 = Class5.aClass5Array103[var22];

					for (var4 = 0; var4 < var23.anIntArray104.length; ++var4) {
						var23.anIntArray104[var4] = -1;
						var23.anIntArray104[var4] = 0;
					}

					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 77) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readShort();
					var4 = this.aBuffer_1135.readShort();
					Class5 var24 = Class5.aClass5Array103[var22];
					var24.anInt116 = var3;
					var24.anInt117 = var4;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 185) {
					this.anInt1116 = this.aBuffer_1135.readUByte();
					this.aBoolean928 = true;
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 197) {
					this.method143(0, this.anInt1219, this.aBuffer_1135);
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 183) {
					var22 = this.aBuffer_1135.readUShort();
					var3 = this.aBuffer_1135.readUShort();
					var4 = var3 >> 10 & 31;
					var5 = var3 >> 5 & 31;
					var27 = var3 & 31;
					Class5.aClass5Array103[var22].anInt146 = (var5 << 11) + (var4 << 19) + (var27 << 3);
					this.anInt1220 = -1;
					return true;
				}

				if (this.anInt1220 == 235) {
					var21 = this.aBuffer_1135.readLong(0);
					var4 = this.aBuffer_1135.readInt();
					var5 = this.aBuffer_1135.readUByte();
					var6 = false;

					for (var7 = 0; var7 < 100; ++var7) {
						if (var4 == this.anIntArray1068[var7]) {
							var6 = true;
							break;
						}
					}

					if (var5 <= 1) {
						for (var7 = 0; var7 < this.anInt961; ++var7) {
							if (this.aLongArray817[var7] == var21) {
								var6 = true;
								break;
							}
						}
					}

					if (!var6 && this.anInt890 == 0) {
						try {
							this.anIntArray1068[this.anInt1186] = var4;
							this.anInt1186 = (this.anInt1186 + 1) % 100;
							String var28 = Class49.method554((byte)8, this.anInt1219 - 13, this.aBuffer_1135);
							var28 = Class41.method352((byte)3, var28);
							if (var5 != 2 && var5 != 3) {
								if (var5 == 1) {
									this.method49(-476, 7, "@cr1@" + Class48.method551(131, Class48.method548(0, var21)), var28);
								} else {
									this.method49(-476, 3, Class48.method551(131, Class48.method548(0, var21)), var28);
								}
							} else {
								this.method49(-476, 7, "@cr2@" + Class48.method551(131, Class48.method548(0, var21)), var28);
							}
						} catch (Exception var18) {
							signlink.reporterror("cde1");
						}
					}

					this.anInt1220 = -1;
					return true;
				}

				signlink.reporterror("T1 - " + this.anInt1220 + "," + this.anInt1219 + " - " + this.anInt1139 + "," + this.anInt1140);
				this.method80();
			} catch (IOException var19) {
				this.method71(0);
			} catch (Exception var20) {
				StringBuilder var2 = new StringBuilder("T2 - " + this.anInt1220 + "," + this.anInt1139 + "," + this.anInt1140 + " - " + this.anInt1219 + "," + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0] + this.anInt1055) + "," + (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0] + this.anInt1056) + " - ");

				for (var3 = 0; var3 < this.anInt1219 && var3 < 50; ++var3) {
					var2.append(this.aBuffer_1135.array[var3]).append(",");
				}

				signlink.reporterror(var2.toString());
				this.method80();
			}

			return true;
		}
	}

	public void method81(int var1, GameObjectSpawnRequest var2) {
		int var3 = 0;
		int var4 = -1;
		int var5 = 0;
		int var6 = 0;
		if (var2.anInt1311 == 0) {
			var3 = this.worldController.getWallObjectHash(var2.anInt1310, var2.anInt1312, var2.anInt1313);
		}

		if (var2.anInt1311 == 1) {
			var3 = this.worldController.getWallDecorationHash(var2.anInt1313, var2.anInt1312, var2.anInt1310, this.anInt1003);
		}

		if (var2.anInt1311 == 2) {
			var3 = this.worldController.getDynamicObjectHash(var2.anInt1310, var2.anInt1312, var2.anInt1313);
		}

		if (var2.anInt1311 == 3) {
			var3 = this.worldController.getGroundDecorationHash(var2.anInt1310, var2.anInt1312, var2.anInt1313);
		}

		if (var3 != 0) {
			int var7 = this.worldController.getConfig(var2.anInt1310, var2.anInt1312, var2.anInt1313, var3);
			var4 = var3 >> 14 & 32767;
			var5 = var7 & 31;
			var6 = var7 >> 6;
		}

		var2.id = var4;
		var2.type = var5;
		var2.anInt1315 = var6;
	}

	public void method86(byte var1) {
		if (this.aByte1014 != var1) {
			for (int var2 = 1; var2 > 0; ++var2) {
			}
		}

		short var7 = 256;

		int var3;
		int var4;
		for (var3 = 10; var3 < 117; ++var3) {
			var4 = (int)(Math.random() * 100.0D);
			if (var4 < 50) {
				this.anIntArray977[var3 + (var7 - 2 << 7)] = 255;
			}
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 100; ++var3) {
			var4 = (int)(Math.random() * 124.0D) + 2;
			var5 = (int)(Math.random() * 128.0D) + 128;
			var6 = var4 + (var5 << 7);
			this.anIntArray977[var6] = 192;
		}

		for (var3 = 1; var3 < var7 - 1; ++var3) {
			for (var4 = 1; var4 < 127; ++var4) {
				var5 = var4 + (var3 << 7);
				this.anIntArray978[var5] = (this.anIntArray977[var5 - 128] + this.anIntArray977[var5 + 1] + this.anIntArray977[var5 + 128] + this.anIntArray977[var5 - 1]) / 4;
			}
		}

		this.anInt1063 += 128;
		if (this.anInt1063 > this.anIntArray1111.length) {
			this.anInt1063 -= this.anIntArray1111.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method100(512, this.aClass44_Sub3_Sub1_Sub3Array1229[var3]);
		}

		for (var3 = 1; var3 < var7 - 1; ++var3) {
			for (var4 = 1; var4 < 127; ++var4) {
				var5 = var4 + (var3 << 7);
				var6 = this.anIntArray978[var5 + 128] - this.anIntArray1111[var5 + this.anInt1063 & this.anIntArray1111.length - 1] / 5;
				if (var6 < 0) {
					var6 = 0;
				}

				this.anIntArray977[var5] = var6;
			}
		}

		System.arraycopy(this.anIntArray903, 1, this.anIntArray903, 0, var7 - 1);
		this.anIntArray903[var7 - 1] = (int)(Math.sin((double)tick / 14.0D) * 16.0D + Math.sin((double)tick / 15.0D) * 14.0D + Math.sin((double)tick / 16.0D) * 12.0D);
		if (this.anInt994 > 0) {
			this.anInt994 -= 4;
		}

		if (this.anInt995 > 0) {
			this.anInt995 -= 4;
		}

		if (this.anInt994 == 0 && this.anInt995 == 0) {
			var3 = (int)(Math.random() * 2000.0D);
			if (var3 == 0) {
				this.anInt994 = 1024;
			}

			if (var3 == 1) {
				this.anInt995 = 1024;
			}
		}

	}

	public void method99(int var1, byte var2, Buffer var3) {
		for (int var4 = 0; var4 < this.anInt1123; ++var4) {
			int var5 = this.anIntArray1124[var4];
			Class44_Sub3_Sub4_Sub6_Sub2 var6 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var5];
			int var7 = var3.readUByte();
			int var8;
			int var9;
			if ((var7 & 1) == 1) {
				var8 = var3.readUByte();
				var9 = var3.readUByte();
				var6.method533(tick, (byte)8, var8, var9);
				var6.anInt1618 = tick + 300;
				var6.anInt1619 = var3.readUByte();
				var6.anInt1620 = var3.readUByte();
			}

			if ((var7 & 2) == 2) {
				var8 = var3.readUShort();
				if (var8 == 65535) {
					var8 = -1;
				}

				if (var8 == var6.anInt1627) {
					var6.anInt1631 = 0;
				}

				var9 = var3.readUByte();
				if (var8 == var6.anInt1627 && var8 != -1) {
					int var10 = Class26.aClass26Array497[var8].anInt511;
					if (var10 == 1) {
						var6.anInt1628 = 0;
						var6.anInt1629 = 0;
						var6.anInt1630 = var9;
						var6.anInt1631 = 0;
					}

					if (var10 == 2) {
						var6.anInt1631 = 0;
					}
				} else if (var8 == -1 || var6.anInt1627 == -1 || Class26.aClass26Array497[var8].anInt505 >= Class26.aClass26Array497[var6.anInt1627].anInt505) {
					var6.anInt1627 = var8;
					var6.anInt1628 = 0;
					var6.anInt1629 = 0;
					var6.anInt1630 = var9;
					var6.anInt1631 = 0;
					var6.anInt1653 = var6.anInt1648;
				}
			}

			if ((var7 & 4) == 4) {
				var6.anInt1621 = var3.readUShort();
				if (var6.anInt1621 == 65535) {
					var6.anInt1621 = -1;
				}
			}

			if ((var7 & 8) == 8) {
				var6.aString1611 = var3.readString();
				var6.anInt1612 = 100;
			}

			if ((var7 & 16) == 16) {
				var8 = var3.readUByte();
				var9 = var3.readUByte();
				var6.method533(tick, (byte)8, var8, var9);
				var6.anInt1618 = tick + 300;
				var6.anInt1619 = var3.readUByte();
				var6.anInt1620 = var3.readUByte();
			}

			if ((var7 & 32) == 32) {
				var6.aClass12_1682 = Class12.method214(var3.readUShort());
				var6.anInt1603 = var6.aClass12_1682.aByte283;
				var6.anInt1647 = var6.aClass12_1682.anInt305;
				var6.anInt1606 = var6.aClass12_1682.anInt287;
				var6.anInt1607 = var6.aClass12_1682.anInt288;
				var6.anInt1608 = var6.aClass12_1682.anInt289;
				var6.anInt1609 = var6.aClass12_1682.anInt290;
				var6.anInt1604 = var6.aClass12_1682.anInt286;
			}

			if ((var7 & 64) == 64) {
				var6.anInt1632 = var3.readUShort();
				var8 = var3.readInt();
				var6.anInt1636 = var8 >> 16;
				var6.anInt1635 = (var8 & 65535) + tick;
				var6.anInt1633 = 0;
				var6.anInt1634 = 0;
				if (var6.anInt1635 > tick) {
					var6.anInt1633 = -1;
				}

				if (var6.anInt1632 == 65535) {
					var6.anInt1632 = -1;
				}
			}

			if ((var7 & 128) == 128) {
				var6.anInt1622 = var3.readUShort();
				var6.anInt1623 = var3.readUShort();
			}
		}

	}

	public void method75(Buffer var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.anInt1123; ++var4) {
			int var5 = this.anIntArray1124[var4];
			Class44_Sub3_Sub4_Sub6_Sub1 var6 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var5];
			int var7 = var1.readUByte();
			if ((var7 & 128) == 128) {
				var7 += var1.readUByte() << 8;
			}

			this.method101(var7, var5, (byte)3, var6, var1);
		}

	}

	public String method93(int var1) {
		var1 = 90 / var1;
		if (signlink.mainapp != null) {
			return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
		} else {
			return super.gameWindow != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-501"
	)
	public void method125() {
		GameObjectDefinition.aClass39_252.method341();
		GameObjectDefinition.aClass39_253.method341();
		Class12.aClass39_306.method341();
		Class14.aClass39_364.method341();
		Class14.aClass39_365.method341();
		Class44_Sub3_Sub4_Sub6_Sub1.aClass39_1680.method341();
		Class32.aClass39_559.method341();
	}

	public void method109(int var1, boolean var2, int var3) {
		this.anInt1219 += var1;
		signlink.midivol = var3;
		if (var2) {
			signlink.midi = "voladjust";
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3"
	)
	public void method87() {
		int var1;
		int var2;
		if (this.anInt1005 == 0) {
			var1 = super.gameWidth / 2 - 80;
			var2 = super.gameHeight / 2 + 20;
			var2 += 20;
			if (super.anInt28 == 1 && super.anInt29 >= var1 - 75 && super.anInt29 <= var1 + 75 && super.anInt30 >= var2 - 20 && super.anInt30 <= var2 + 20) {
				this.anInt1005 = 3;
				this.anInt955 = 0;
			}

			var1 = super.gameWidth / 2 + 80;
			if (super.anInt28 == 1 && super.anInt29 >= var1 - 75 && super.anInt29 <= var1 + 75 && super.anInt30 >= var2 - 20 && super.anInt30 <= var2 + 20) {
				this.aString932 = "";
				this.aString933 = "Enter your username & password.";
				this.anInt1005 = 2;
				this.anInt955 = 0;
			}
		} else {
			if (this.anInt1005 == 2) {
				var1 = super.gameHeight / 2 - 40;
				var1 += 30;
				var1 += 25;
				if (super.anInt28 == 1 && super.anInt30 >= var1 - 15 && super.anInt30 < var1) {
					this.anInt955 = 0;
				}

				var1 += 15;
				if (super.anInt28 == 1 && super.anInt30 >= var1 - 15 && super.anInt30 < var1) {
					this.anInt955 = 1;
				}

				var1 += 15;
				var2 = super.gameWidth / 2 - 80;
				int var3 = super.gameHeight / 2 + 50;
				var3 += 20;
				if (super.anInt28 == 1 && super.anInt29 >= var2 - 75 && super.anInt29 <= var2 + 75 && super.anInt30 >= var3 - 20 && super.anInt30 <= var3 + 20) {
					this.method48(this.aString1147, this.aString1148, false);
					if (this.aBoolean905) {
						return;
					}
				}

				var2 = super.gameWidth / 2 + 80;
				if (super.anInt28 == 1 && super.anInt29 >= var2 - 75 && super.anInt29 <= var2 + 75 && super.anInt30 >= var3 - 20 && super.anInt30 <= var3 + 20) {
					this.anInt1005 = 0;
					this.aString1147 = "";
					this.aString1148 = "";
				}

				while (true) {
					while (true) {
						int var4 = this.method5();
						if (var4 == -1) {
							return;
						}

						boolean var5 = false;

						for (int var6 = 0; var6 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var6) {
							if (var4 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var6)) {
								var5 = true;
								break;
							}
						}

						if (this.anInt955 == 0) {
							if (var4 == 8 && this.aString1147.length() > 0) {
								this.aString1147 = this.aString1147.substring(0, this.aString1147.length() - 1);
							}

							if (var4 == 9 || var4 == 10 || var4 == 13) {
								this.anInt955 = 1;
							}

							if (var5) {
								this.aString1147 = this.aString1147 + (char)var4;
							}

							if (this.aString1147.length() > 12) {
								this.aString1147 = this.aString1147.substring(0, 12);
							}
						} else if (this.anInt955 == 1) {
							if (var4 == 8 && this.aString1148.length() > 0) {
								this.aString1148 = this.aString1148.substring(0, this.aString1148.length() - 1);
							}

							if (var4 == 9 || var4 == 10 || var4 == 13) {
								this.anInt955 = 0;
							}

							if (var5) {
								this.aString1148 = this.aString1148 + (char)var4;
							}

							if (this.aString1148.length() > 20) {
								this.aString1148 = this.aString1148.substring(0, 20);
							}
						}
					}
				}
			}

			if (this.anInt1005 == 3) {
				var1 = super.gameWidth / 2;
				var2 = super.gameHeight / 2 + 50;
				var2 += 20;
				if (super.anInt28 == 1 && super.anInt29 >= var1 - 75 && super.anInt29 <= var1 + 75 && super.anInt30 >= var2 - 20 && super.anInt30 <= var2 + 20) {
					this.anInt1005 = 0;
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "41329"
	)
	public void drawFull(int var1) {
		if (this.aBoolean917) {
			this.aBoolean917 = false;
			this.aComponentImageProducer_852.drawComponentImage(super.graphics, 0, 4);
			this.aComponentImageProducer_853.drawComponentImage(super.graphics, 0, 357);
			this.aComponentImageProducer_854.drawComponentImage(super.graphics, 722, 4);
			this.aComponentImageProducer_855.drawComponentImage(super.graphics, 743, 205);
			this.aComponentImageProducer_856.drawComponentImage(super.graphics, 0, 0);
			this.aComponentImageProducer_857.drawComponentImage(super.graphics, 516, 4);
			this.aComponentImageProducer_858.drawComponentImage(super.graphics, 516, 205);
			this.aComponentImageProducer_859.drawComponentImage(super.graphics, 496, 357);
			this.aComponentImageProducer_860.drawComponentImage(super.graphics, 0, 338);
			this.aBoolean928 = true;
			this.aBoolean1109 = true;
			this.aBoolean841 = true;
			this.aBoolean1141 = true;
			if (this.loadingState != 2) {
				this.componentImageProducer.drawComponentImage(super.graphics, 4, 4);
				this.aComponentImageProducer_863.drawComponentImage(super.graphics, 550, 4);
			}
		}

		if (this.loadingState == 2) {
			this.method37(0);
		}

		if (this.aBoolean851 && this.anInt1254 == 1) {
			this.aBoolean928 = true;
		}

		boolean var2;
		if (this.anInt1216 != -1) {
			var2 = this.method14(this.anInt975, 753, this.anInt1216);
			if (var2) {
				this.aBoolean928 = true;
			}
		}

		if (this.anInt850 == 2) {
			this.aBoolean928 = true;
		}

		if (this.anInt895 == 2) {
			this.aBoolean928 = true;
		}

		if (this.aBoolean928) {
			this.method98();
			this.aBoolean928 = false;
		}

		if (this.anInt1011 == -1) {
			this.aClass5_861.anInt123 = this.anInt931 - this.anInt1082 - 77;
			if (super.anInt22 > 448 && super.anInt22 < 560 && super.anInt23 > 332) {
				this.method64(-782, 77, this.aClass5_861, super.anInt23 - 357, 0, 463, super.anInt22 - 17, false, this.anInt931);
			}

			int var3 = this.anInt931 - 77 - this.aClass5_861.anInt123;
			if (var3 < 0) {
				var3 = 0;
			}

			if (var3 > this.anInt931 - 77) {
				var3 = this.anInt931 - 77;
			}

			if (var3 != this.anInt1082) {
				this.anInt1082 = var3;
				this.aBoolean1109 = true;
			}
		}

		if (this.anInt1011 != -1) {
			var2 = this.method14(this.anInt975, 753, this.anInt1011);
			if (var2) {
				this.aBoolean1109 = true;
			}
		}

		if (this.anInt850 == 3) {
			this.aBoolean1109 = true;
		}

		if (this.anInt895 == 3) {
			this.aBoolean1109 = true;
		}

		if (this.aString829 != null) {
			this.aBoolean1109 = true;
		}

		if (this.aBoolean851 && this.anInt1254 == 2) {
			this.aBoolean1109 = true;
		}

		if (this.aBoolean1109) {
			this.method63();
			this.aBoolean1109 = false;
		}

		if (this.loadingState == 2) {
			this.method103((byte)5);
			this.aComponentImageProducer_863.drawComponentImage(super.graphics, 550, 4);
		}

		if (this.anInt1173 != -1) {
			this.aBoolean841 = true;
		}

		if (this.aBoolean841) {
			if (this.anInt1173 != -1 && this.anInt1173 == this.anInt1013) {
				this.anInt1173 = -1;
				this.aBuffer_843.writeOpcode(94);
				this.aBuffer_843.writeByte(this.anInt1013);
			}

			this.aBoolean841 = false;
			this.aComponentImageProducer_992.initDrawingArea();
			this.aClass44_Sub3_Sub1_Sub3_1180.method453(this.aByte1070, 0, 0);
			if (this.anInt1216 == -1) {
				if (this.anIntArray954[this.anInt1013] != -1) {
					if (this.anInt1013 == 0) {
						this.aClass44_Sub3_Sub1_Sub3_875.method453(this.aByte1070, 22, 10);
					}

					if (this.anInt1013 == 1) {
						this.aClass44_Sub3_Sub1_Sub3_876.method453(this.aByte1070, 54, 8);
					}

					if (this.anInt1013 == 2) {
						this.aClass44_Sub3_Sub1_Sub3_876.method453(this.aByte1070, 82, 8);
					}

					if (this.anInt1013 == 3) {
						this.aClass44_Sub3_Sub1_Sub3_877.method453(this.aByte1070, 110, 8);
					}

					if (this.anInt1013 == 4) {
						this.aClass44_Sub3_Sub1_Sub3_879.method453(this.aByte1070, 153, 8);
					}

					if (this.anInt1013 == 5) {
						this.aClass44_Sub3_Sub1_Sub3_879.method453(this.aByte1070, 181, 8);
					}

					if (this.anInt1013 == 6) {
						this.aClass44_Sub3_Sub1_Sub3_878.method453(this.aByte1070, 209, 9);
					}
				}

				if (this.anIntArray954[0] != -1 && (this.anInt1173 != 0 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[0].method453(this.aByte1070, 29, 13);
				}

				if (this.anIntArray954[1] != -1 && (this.anInt1173 != 1 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[1].method453(this.aByte1070, 53, 11);
				}

				if (this.anIntArray954[2] != -1 && (this.anInt1173 != 2 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[2].method453(this.aByte1070, 82, 11);
				}

				if (this.anIntArray954[3] != -1 && (this.anInt1173 != 3 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[3].method453(this.aByte1070, 115, 12);
				}

				if (this.anIntArray954[4] != -1 && (this.anInt1173 != 4 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[4].method453(this.aByte1070, 153, 13);
				}

				if (this.anIntArray954[5] != -1 && (this.anInt1173 != 5 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[5].method453(this.aByte1070, 180, 11);
				}

				if (this.anIntArray954[6] != -1 && (this.anInt1173 != 6 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[6].method453(this.aByte1070, 208, 13);
				}
			}

			this.aComponentImageProducer_992.drawComponentImage(super.graphics, 516, 160);
			this.aComponentImageProducer_991.initDrawingArea();
			this.aClass44_Sub3_Sub1_Sub3_1179.method453(this.aByte1070, 0, 0);
			if (this.anInt1216 == -1) {
				if (this.anIntArray954[this.anInt1013] != -1) {
					if (this.anInt1013 == 7) {
						this.aClass44_Sub3_Sub1_Sub3_1210.method453(this.aByte1070, 42, 0);
					}

					if (this.anInt1013 == 8) {
						this.aClass44_Sub3_Sub1_Sub3_1211.method453(this.aByte1070, 74, 0);
					}

					if (this.anInt1013 == 9) {
						this.aClass44_Sub3_Sub1_Sub3_1211.method453(this.aByte1070, 102, 0);
					}

					if (this.anInt1013 == 10) {
						this.aClass44_Sub3_Sub1_Sub3_1212.method453(this.aByte1070, 130, 1);
					}

					if (this.anInt1013 == 11) {
						this.aClass44_Sub3_Sub1_Sub3_1214.method453(this.aByte1070, 173, 0);
					}

					if (this.anInt1013 == 12) {
						this.aClass44_Sub3_Sub1_Sub3_1214.method453(this.aByte1070, 201, 0);
					}

					if (this.anInt1013 == 13) {
						this.aClass44_Sub3_Sub1_Sub3_1213.method453(this.aByte1070, 229, 0);
					}
				}

				if (this.anIntArray954[8] != -1 && (this.anInt1173 != 8 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[7].method453(this.aByte1070, 74, 2);
				}

				if (this.anIntArray954[9] != -1 && (this.anInt1173 != 9 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[8].method453(this.aByte1070, 102, 3);
				}

				if (this.anIntArray954[10] != -1 && (this.anInt1173 != 10 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[9].method453(this.aByte1070, 137, 4);
				}

				if (this.anIntArray954[11] != -1 && (this.anInt1173 != 11 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[10].method453(this.aByte1070, 174, 2);
				}

				if (this.anIntArray954[12] != -1 && (this.anInt1173 != 12 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[11].method453(this.aByte1070, 201, 2);
				}

				if (this.anIntArray954[13] != -1 && (this.anInt1173 != 13 || tick % 20 < 10)) {
					this.aClass44_Sub3_Sub1_Sub3Array952[12].method453(this.aByte1070, 226, 2);
				}
			}

			this.aComponentImageProducer_991.drawComponentImage(super.graphics, 496, 466);
			this.componentImageProducer.initDrawingArea();
		}

		if (this.aBoolean1141) {
			this.aBoolean1141 = false;
			this.aComponentImageProducer_990.initDrawingArea();
			this.aClass44_Sub3_Sub1_Sub3_1178.method453(this.aByte1070, 0, 0);
			this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 28, "Public chat", 16777215, true);
			if (this.anInt967 == 0) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "On", 65280, true);
			}

			if (this.anInt967 == 1) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "Friends", 16776960, true);
			}

			if (this.anInt967 == 2) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "Off", 16711680, true);
			}

			if (this.anInt967 == 3) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 55, 41, "Hide", 65535, true);
			}

			this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 28, "Private chat", 16777215, true);
			if (this.anInt972 == 0) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 41, "On", 65280, true);
			}

			if (this.anInt972 == 1) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 41, "Friends", 16776960, true);
			}

			if (this.anInt972 == 2) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 184, 41, "Off", 16711680, true);
			}

			this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 28, "Trade/duel", 16777215, true);
			if (this.anInt805 == 0) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 41, "On", 65280, true);
			}

			if (this.anInt805 == 1) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 41, "Friends", 16776960, true);
			}

			if (this.anInt805 == 2) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 324, 41, "Off", 16711680, true);
			}

			this.aClass44_Sub3_Sub1_Sub4_1076.method456(0, 458, 33, "Report abuse", 16777215, true);
			this.aComponentImageProducer_990.drawComponentImage(super.graphics, 0, 453);
			this.componentImageProducer.initDrawingArea();
		}

		this.anInt975 = 0;
	}

	public int method124(int var1, int var2, int var3, int var4) {
		int var5 = 256 - var2;
		return ((var4 & 16711935) * var2 + var5 * (var1 & 16711935) & -16711936) + ((var4 & 65280) * var2 + var5 * (var1 & 65280) & 16711680) >> 8;
	}

	public String getParameter(String var1) {
		return signlink.mainapp != null ? signlink.mainapp.getParameter(var1) : super.getParameter(var1);
	}

	public void method20(int var1, int var2) {
		var1 = 15 / var1;
		signlink.wavevol = var2;
	}

	public void method122(int var1) {
		if (this.anInt803 > 1) {
			--this.anInt803;
		}

		if (this.anInt1223 > 0) {
			--this.anInt1223;
		}

		int var2;
		for (var2 = 0; var2 < 5 && this.method112(); ++var2) {
		}

		if (this.aBoolean905) {
			int var3;
			int var4;
			int var5;
			int var6;
			int var8;
			synchronized(this.aClass10_1160.anObject260) {
				if (!aBoolean1167) {
					this.aClass10_1160.anInt261 = 0;
				} else if (super.anInt28 != 0 || this.aClass10_1160.anInt261 >= 40) {
					this.aBuffer_843.writeOpcode(222);
					this.aBuffer_843.writeByte(0);
					var3 = this.aBuffer_843.offset;
					var4 = 0;

					for (var5 = 0; var5 < this.aClass10_1160.anInt261 && var3 - this.aBuffer_843.offset < 240; ++var5) {
						++var4;
						var6 = this.aClass10_1160.anIntArray263[var5];
						if (var6 < 0) {
							var6 = 0;
						} else if (var6 > 502) {
							var6 = 502;
						}

						int var7 = this.aClass10_1160.anIntArray262[var5];
						if (var7 < 0) {
							var7 = 0;
						} else if (var7 > 764) {
							var7 = 764;
						}

						var8 = var6 * 765 + var7;
						if (this.aClass10_1160.anIntArray263[var5] == -1 && this.aClass10_1160.anIntArray262[var5] == -1) {
							var7 = -1;
							var6 = -1;
							var8 = 524287;
						}

						if (var7 == this.anInt1233 && var6 == this.anInt1234) {
							if (this.anInt983 < 2047) {
								++this.anInt983;
							}
						} else {
							int var9 = var7 - this.anInt1233;
							this.anInt1233 = var7;
							int var10 = var6 - this.anInt1234;
							this.anInt1234 = var6;
							if (this.anInt983 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
								var9 += 32;
								var10 += 32;
								this.aBuffer_843.writeShort(var10 + (var9 << 6) + (this.anInt983 << 12));
								this.anInt983 = 0;
							} else if (this.anInt983 < 8) {
								this.aBuffer_843.writeMedium(var8 + (this.anInt983 << 19) + 8388608);
								this.anInt983 = 0;
							} else {
								this.aBuffer_843.writeInt(var8 + (this.anInt983 << 19) + -1073741824);
								this.anInt983 = 0;
							}
						}
					}

					this.aBuffer_843.writeSize(this.aBuffer_843.offset - var3, this.anInt797);
					if (var4 >= this.aClass10_1160.anInt261) {
						this.aClass10_1160.anInt261 = 0;
					} else {
						Class10 var10000 = this.aClass10_1160;
						var10000.anInt261 -= var4;

						for (var5 = 0; var5 < this.aClass10_1160.anInt261; ++var5) {
							this.aClass10_1160.anIntArray262[var5] = this.aClass10_1160.anIntArray262[var5 + var4];
							this.aClass10_1160.anIntArray263[var5] = this.aClass10_1160.anIntArray263[var5 + var4];
						}
					}
				}
			}

			if (super.anInt28 != 0) {
				long var15 = (super.aLong31 - this.aLong1230) / 50L;
				if (var15 > 4095L) {
					var15 = 4095L;
				}

				this.aLong1230 = super.aLong31;
				var4 = super.anInt30;
				if (var4 < 0) {
					var4 = 0;
				} else if (var4 > 502) {
					var4 = 502;
				}

				var5 = super.anInt29;
				if (var5 < 0) {
					var5 = 0;
				} else if (var5 > 764) {
					var5 = 764;
				}

				var6 = var4 * 765 + var5;
				byte var19 = 0;
				if (super.anInt28 == 2) {
					var19 = 1;
				}

				var8 = (int)var15;
				this.aBuffer_843.writeOpcode(20);
				this.aBuffer_843.writeInt((var8 << 20) + var6 + (var19 << 19));
			}

			if (this.anInt1023 > 0) {
				--this.anInt1023;
			}

			if (super.anIntArray32[1] == 1 || super.anIntArray32[2] == 1 || super.anIntArray32[3] == 1 || super.anIntArray32[4] == 1) {
				this.aBoolean1024 = true;
			}

			if (this.aBoolean1024 && this.anInt1023 <= 0) {
				this.anInt1023 = 20;
				this.aBoolean1024 = false;
				this.aBuffer_843.writeOpcode(53);
				this.aBuffer_843.writeShort(this.anInt1205);
				this.aBuffer_843.writeShort(this.anInt1206);
			}

			if (super.aBoolean19 && !this.aBoolean945) {
				this.aBoolean945 = true;
				this.aBuffer_843.writeOpcode(73);
				this.aBuffer_843.writeByte(1);
			}

			if (!super.aBoolean19 && this.aBoolean945) {
				this.aBoolean945 = false;
				this.aBuffer_843.writeOpcode(73);
				this.aBuffer_843.writeByte(0);
			}

			this.method42(503);
			this.method144();
			this.method27();
			++this.anInt1221;
			if (this.anInt1221 > 750) {
				this.method71(0);
			}

			this.method104(true);
			this.method135();
			this.method117();
			++this.anInt975;
			if (this.anInt1145 != 0) {
				this.anInt1144 += 20;
				if (this.anInt1144 >= 400) {
					this.anInt1145 = 0;
				}
			}

			if (this.anInt850 != 0) {
				++this.anInt847;
				if (this.anInt847 >= 15) {
					if (this.anInt850 == 2) {
						this.aBoolean928 = true;
					}

					if (this.anInt850 == 3) {
						this.aBoolean1109 = true;
					}

					this.anInt850 = 0;
				}
			}

			if (this.anInt895 != 0) {
				++this.anInt1250;
				if (super.anInt22 > this.anInt896 + 5 || super.anInt22 < this.anInt896 - 5 || super.anInt23 > this.anInt897 + 5 || super.anInt23 < this.anInt897 - 5) {
					this.aBoolean1146 = true;
				}

				if (super.lastMouseButtonPressed == 0) {
					if (this.anInt895 == 2) {
						this.aBoolean928 = true;
					}

					if (this.anInt895 == 3) {
						this.aBoolean1109 = true;
					}

					this.anInt895 = 0;
					if (this.aBoolean1146 && this.anInt1250 >= 5) {
						this.anInt963 = -1;
						this.method68();
						if (this.anInt963 == this.anInt893 && this.anInt962 != this.anInt894) {
							Class5 var17 = Class5.aClass5Array103[this.anInt893];
							byte var16 = 0;
							if (this.anInt882 == 1 && var17.anInt112 == 206) {
								var16 = 1;
							}

							if (var17.anIntArray104[this.anInt962] <= 0) {
								var16 = 0;
							}

							if (var17.aBoolean133) {
								var4 = this.anInt894;
								var5 = this.anInt962;
								var17.anIntArray104[var5] = var17.anIntArray104[var4];
								var17.anIntArray105[var5] = var17.anIntArray105[var4];
								var17.anIntArray104[var4] = -1;
								var17.anIntArray105[var4] = 0;
							} else if (var16 == 1) {
								var4 = this.anInt894;
								var5 = this.anInt962;

								while (var4 != var5) {
									if (var4 > var5) {
										var17.method182(var4, var4 - 1, 865);
										--var4;
									} else if (var4 < var5) {
										var17.method182(var4, var4 + 1, 865);
										++var4;
									}
								}
							} else {
								var17.method182(this.anInt894, this.anInt962, 865);
							}

							this.aBuffer_843.writeOpcode(93);
							this.aBuffer_843.writeShort(this.anInt893);
							this.aBuffer_843.writeShort(this.anInt894);
							this.aBuffer_843.writeShort(this.anInt962);
							this.aBuffer_843.writeByte(var16);
						}
					} else if ((this.anInt1049 == 1 || this.method65(this.anInt980 - 1)) && this.anInt980 > 2) {
						this.method95(0);
					} else if (this.anInt980 > 0) {
						this.method60((byte)6, this.anInt980 - 1);
					}

					this.anInt847 = 10;
					super.anInt28 = 0;
				}
			}

			++anInt1227;
			if (anInt1227 > 62) {
				anInt1227 = 0;
				this.aBuffer_843.writeOpcode(89);
			}

			if (Class36.anInt627 != -1) {
				var2 = Class36.anInt627;
				var3 = Class36.anInt628;
				boolean var18 = this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var2, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, true, 0, var3, (byte)9, 0);
				Class36.anInt627 = -1;
				if (var18) {
					this.anInt1142 = super.anInt29;
					this.anInt1143 = super.anInt30;
					this.anInt1145 = 1;
					this.anInt1144 = 0;
				}
			}

			if (super.anInt28 == 1 && this.aString829 != null) {
				this.aString829 = null;
				this.aBoolean1109 = true;
				super.anInt28 = 0;
			}

			this.method21((byte)1);
			this.method130(-48671);
			this.method58();
			this.method38(this.aBoolean1002);
			if (super.lastMouseButtonPressed == 1 || super.anInt28 == 1) {
				++this.anInt993;
			}

			if (this.loadingState == 2) {
				this.method129(true);
			}

			if (this.loadingState == 2 && this.aBoolean1008) {
				this.method116();
			}

			for (var2 = 0; var2 < 5; ++var2) {
				int var10002 = this.anIntArray968[var2]++;
			}

			this.method131();
			++super.mouseIdleMs;
			if (super.mouseIdleMs > 4500) {
				this.anInt1223 = 250;
				super.mouseIdleMs -= 500;
				this.aBuffer_843.writeOpcode(209);
			}

			++this.anInt837;
			if (var1 != 5) {
				this.anInt1220 = this.aBuffer_1135.readUByte();
			}

			if (this.anInt837 > 500) {
				this.anInt837 = 0;
				var2 = (int)(Math.random() * 8.0D);
				if ((var2 & 1) == 1) {
					this.anInt1246 += this.anInt1247;
				}

				if ((var2 & 2) == 2) {
					this.anInt834 += this.anInt835;
				}

				if ((var2 & 4) == 4) {
					this.anInt888 += this.anInt889;
				}
			}

			if (this.anInt1246 < -50) {
				this.anInt1247 = 2;
			}

			if (this.anInt1246 > 50) {
				this.anInt1247 = -2;
			}

			if (this.anInt834 < -55) {
				this.anInt835 = 2;
			}

			if (this.anInt834 > 55) {
				this.anInt835 = -2;
			}

			if (this.anInt888 < -40) {
				this.anInt889 = 1;
			}

			if (this.anInt888 > 40) {
				this.anInt889 = -1;
			}

			++this.anInt916;
			if (this.anInt916 > 500) {
				this.anInt916 = 0;
				var2 = (int)(Math.random() * 8.0D);
				if ((var2 & 1) == 1) {
					this.anInt1217 += this.anInt1218;
				}

				if ((var2 & 2) == 2) {
					this.anInt1170 += this.anInt1171;
				}
			}

			if (this.anInt1217 < -60) {
				this.anInt1218 = 2;
			}

			if (this.anInt1217 > 60) {
				this.anInt1218 = -2;
			}

			if (this.anInt1170 < -20) {
				this.anInt1171 = 1;
			}

			if (this.anInt1170 > 10) {
				this.anInt1171 = -1;
			}

			++this.anInt1222;
			if (this.anInt1222 > 50) {
				this.aBuffer_843.writeOpcode(120);
			}

			try {
				if (this.aClass7_1108 != null && this.aBuffer_843.offset > 0) {
					this.aClass7_1108.method195(this.aBuffer_843.offset, -2584, this.aBuffer_843.array, 0);
					this.aBuffer_843.offset = 0;
					this.anInt1222 = 0;
				}
			} catch (IOException var12) {
				this.method71(0);
			} catch (Exception var13) {
				this.method80();
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	public void method19() {
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		int var12;
		try {
			this.anInt934 = -1;
			this.aClass28_924.method263();
			this.aClass28_1156.method263();
			Class44_Sub3_Sub1_Sub1.method421();
			this.method125();
			this.worldController.method278();

			for (var1 = 0; var1 < 4; ++var1) {
				this.collisionMap[var1].method231((byte)5);
			}

			System.gc();
			Class3 var10 = new Class3(104, this.anIntArrayArrayArray957, 104, -127, this.tileFlags);
			var2 = this.aByteArrayArray886.length;
			Class3.aBoolean67 = Class36.aBoolean593;

			for (var3 = 0; var3 < var2; ++var3) {
				var4 = this.anIntArray830[var3] >> 8;
				var5 = this.anIntArray830[var3] & 255;
				if (var4 == 33 && var5 >= 71 && var5 <= 73) {
					Class3.aBoolean67 = false;
					break;
				}
			}

			if (Class3.aBoolean67) {
				this.worldController.method279((byte)4, this.clientPlane);
			} else {
				this.worldController.method279((byte)4, 0);
			}

			this.aBuffer_843.writeOpcode(120);

			byte[] var6;
			for (var3 = 0; var3 < var2; ++var3) {
				var4 = (this.anIntArray830[var3] >> 8) * 64 - this.anInt1055;
				var5 = (this.anIntArray830[var3] & 255) * 64 - this.anInt1056;
				var6 = this.aByteArrayArray886[var3];
				if (var6 != null) {
					var10.method158(false, (this.anInt922 - 6) * 8, var6, var5, (this.anInt923 - 6) * 8, var4);
				}
			}

			for (var3 = 0; var3 < var2; ++var3) {
				var4 = (this.anIntArray830[var3] >> 8) * 64 - this.anInt1055;
				var5 = (this.anIntArray830[var3] & 255) * 64 - this.anInt1056;
				var6 = this.aByteArrayArray886[var3];
				if (var6 == null && this.anInt923 < 800) {
					var10.method157(var5, var4, 587, 64, 64);
				}
			}

			this.aBuffer_843.writeOpcode(120);

			for (var3 = 0; var3 < var2; ++var3) {
				byte[] var11 = this.aByteArrayArray953[var3];
				if (var11 != null) {
					var5 = (this.anIntArray830[var3] >> 8) * 64 - this.anInt1055;
					var12 = (this.anIntArray830[var3] & 255) * 64 - this.anInt1056;
					var10.method161(var12, var11, false, this.worldController, var5, this.collisionMap);
				}
			}

			this.aBuffer_843.writeOpcode(120);
			var10.method163(this.collisionMap, false, this.worldController);
			this.componentImageProducer.initDrawingArea();
			this.aBuffer_843.writeOpcode(120);

			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					this.method52(var3, var4);
				}
			}

			this.method89((byte)4);
		} catch (Exception var9) {
		}

		GameObjectDefinition.aClass39_252.method341();
		if (isLowMemory && signlink.cache_dat != null) {
			var1 = this.aClass43_Sub1_1015.method385(anInt1235, 0);

			for (var2 = 0; var2 < var1; ++var2) {
				var3 = this.aClass43_Sub1_1015.method390(var2, (byte)9);
				if ((var3 & 121) == 0) {
					Model.method502(var2);
				}
			}
		}

		System.gc();
		Class44_Sub3_Sub1_Sub1.method422(20);
		this.aClass43_Sub1_1015.method396();
		var1 = (this.anInt922 - 6) / 8 - 1;
		var2 = (this.anInt922 + 6) / 8 + 1;
		var3 = (this.anInt923 - 6) / 8 - 1;
		var4 = (this.anInt923 + 6) / 8 + 1;
		if (this.aBoolean1169) {
			var1 = 49;
			var2 = 50;
			var3 = 49;
			var4 = 50;
		}

		for (var5 = var1; var5 <= var2; ++var5) {
			for (var12 = var3; var12 <= var4; ++var12) {
				if (var5 == var1 || var5 == var2 || var12 == var3 || var12 == var4) {
					int var7 = this.aClass43_Sub1_1015.method387(0, var5, false, var12);
					if (var7 != -1) {
						this.aClass43_Sub1_1015.method397(-21322, 3, var7);
					}

					int var8 = this.aClass43_Sub1_1015.method387(1, var5, false, var12);
					if (var8 != -1) {
						this.aClass43_Sub1_1015.method397(-21322, 3, var8);
					}
				}
			}
		}

	}

	public void method55(boolean var1) {
		for (Class44_Sub3_Sub4_Sub3 var2 = (Class44_Sub3_Sub4_Sub3)this.aClass28_1156.peekFront(); var2 != null; var2 = (Class44_Sub3_Sub4_Sub3)this.aClass28_1156.getPrevious(this.aByte958)) {
			if (var2.anInt1485 == this.clientPlane && tick <= var2.anInt1491) {
				if (tick >= var2.anInt1490) {
					if (var2.anInt1494 > 0) {
						Class44_Sub3_Sub4_Sub6_Sub2 var3 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var2.anInt1494 - 1];
						if (var3 != null && var3.anInt1599 >= 0 && var3.anInt1599 < 13312 && var3.anInt1600 >= 0 && var3.anInt1600 < 13312) {
							var2.method497(tick, this.method50(var3.anInt1599, var3.anInt1600, 0, var2.anInt1485) - var2.anInt1489, var3.anInt1599, (byte)7, var3.anInt1600);
						}
					}

					if (var2.anInt1494 < 0) {
						int var6 = -var2.anInt1494 - 1;
						Class44_Sub3_Sub4_Sub6_Sub1 var4;
						if (var6 == this.anInt947) {
							var4 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
						} else {
							var4 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var6];
						}

						if (var4 != null && var4.anInt1599 >= 0 && var4.anInt1599 < 13312 && var4.anInt1600 >= 0 && var4.anInt1600 < 13312) {
							var2.method497(tick, this.method50(var4.anInt1599, var4.anInt1600, 0, var2.anInt1485) - var2.anInt1489, var4.anInt1599, (byte)7, var4.anInt1600);
						}
					}

					var2.method498(this.anInt975);
					this.worldController.method289((int)var2.aDouble1498, var2, (int)var2.aDouble1496, -1, (int)var2.aDouble1497, (byte)1, 60, var2.anInt1504, this.clientPlane, false);
				}
			} else {
				var2.removeNode();
			}
		}

		++anInt997;
		this.aBoolean905 &= var1;
		if (anInt997 > 1174) {
			anInt997 = 0;
			this.aBuffer_843.writeOpcode(12);
			this.aBuffer_843.writeByte(0);
			int var5 = this.aBuffer_843.offset;
			if ((int)(Math.random() * 2.0D) == 0) {
				this.aBuffer_843.writeShort(11499);
			}

			this.aBuffer_843.writeShort(10548);
			if ((int)(Math.random() * 2.0D) == 0) {
				this.aBuffer_843.writeByte(139);
			}

			if ((int)(Math.random() * 2.0D) == 0) {
				this.aBuffer_843.writeByte(94);
			}

			this.aBuffer_843.writeShort(51693);
			this.aBuffer_843.writeByte(16);
			this.aBuffer_843.writeShort(15036);
			if ((int)(Math.random() * 2.0D) == 0) {
				this.aBuffer_843.writeByte(65);
			}

			this.aBuffer_843.writeByte((int)(Math.random() * 256.0D));
			this.aBuffer_843.writeShort(22990);
			this.aBuffer_843.writeSize(this.aBuffer_843.offset - var5, this.anInt797);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "35604"
	)
	public void method128() {
		short var1 = 256;
		int var2;
		if (this.anInt994 > 0) {
			for (var2 = 0; var2 < 256; ++var2) {
				if (this.anInt994 > 768) {
					this.anIntArray936[var2] = this.method124(this.anIntArray937[var2], 1024 - this.anInt994, 264, this.anIntArray938[var2]);
				} else if (this.anInt994 > 256) {
					this.anIntArray936[var2] = this.anIntArray938[var2];
				} else {
					this.anIntArray936[var2] = this.method124(this.anIntArray938[var2], 256 - this.anInt994, 264, this.anIntArray937[var2]);
				}
			}
		} else if (this.anInt995 > 0) {
			for (var2 = 0; var2 < 256; ++var2) {
				if (this.anInt995 > 768) {
					this.anIntArray936[var2] = this.method124(this.anIntArray937[var2], 1024 - this.anInt995, 264, this.anIntArray939[var2]);
				} else if (this.anInt995 > 256) {
					this.anIntArray936[var2] = this.anIntArray939[var2];
				} else {
					this.anIntArray936[var2] = this.method124(this.anIntArray939[var2], 256 - this.anInt995, 264, this.anIntArray937[var2]);
				}
			}
		} else {
			System.arraycopy(this.anIntArray937, 0, this.anIntArray936, 0, 256);
		}

		System.arraycopy(this.aClass44_Sub3_Sub1_Sub2_891.anIntArray1431, 0, this.aComponentImageProducer_1042.pixels, 0, 33920);
		var2 = 0;
		int var3 = 1152;

		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		for (var4 = 1; var4 < var1 - 1; ++var4) {
			var5 = (var1 - var4) * this.anIntArray903[var4] / var1;
			var6 = var5 + 22;
			if (var6 < 0) {
				var6 = 0;
			}

			var2 += var6;

			for (var7 = var6; var7 < 128; ++var7) {
				var8 = this.anIntArray977[var2++];
				if (var8 != 0) {
					var9 = var8;
					var10 = 256 - var8;
					var8 = this.anIntArray936[var8];
					var11 = this.aComponentImageProducer_1042.pixels[var3];
					this.aComponentImageProducer_1042.pixels[var3++] = ((var8 & 16711935) * var9 + (var11 & 16711935) * var10 & -16711936) + (var9 * (var8 & 65280) + var10 * (var11 & 65280) & 16711680) >> 8;
				} else {
					++var3;
				}
			}

			var3 += var6;
		}

		this.aComponentImageProducer_1042.drawComponentImage(super.graphics, 0, 0);
		System.arraycopy(this.aClass44_Sub3_Sub1_Sub2_892.anIntArray1431, 0, this.aComponentImageProducer_1043.pixels, 0, 33920);
		var2 = 0;
		var3 = 1176;

		for (var4 = 1; var4 < var1 - 1; ++var4) {
			var5 = (var1 - var4) * this.anIntArray903[var4] / var1;
			var6 = 103 - var5;
			var3 += var5;

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = this.anIntArray977[var2++];
				if (var8 != 0) {
					var9 = var8;
					var10 = 256 - var8;
					var8 = this.anIntArray936[var8];
					var11 = this.aComponentImageProducer_1043.pixels[var3];
					this.aComponentImageProducer_1043.pixels[var3++] = ((var8 & 16711935) * var9 + (var11 & 16711935) * var10 & -16711936) + (var9 * (var8 & 65280) + var10 * (var11 & 65280) & 16711680) >> 8;
				} else {
					++var3;
				}
			}

			var2 += 128 - var6;
			var3 += 128 - var6 - var5;
		}

		this.aComponentImageProducer_1043.drawComponentImage(super.graphics, 637, 0);
	}

	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "0"
	)
	public boolean method46() {
		return signlink.wavereplay();
	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-147"
	)
	public void method28(int var1) {
		Class5 var2 = Class5.aClass5Array103[var1];

		for (int var3 = 0; var3 < var2.anIntArray125.length && var2.anIntArray125[var3] != -1; ++var3) {
			Class5 var4 = Class5.aClass5Array103[var2.anIntArray125[var3]];
			if (var4.anInt110 == 1) {
				this.method28(var4.anInt108);
			}

			var4.anInt106 = 0;
			var4.anInt107 = 0;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method23() {
		while (true) {
			Class44_Sub3_Sub3 var1 = this.aClass43_Sub1_1015.method394();
			if (var1 == null) {
				return;
			}

			if (var1.anInt1387 == 0) {
				Model.method501(var1.anInt1388, var1.aByteArray1389);
				if ((this.aClass43_Sub1_1015.method390(var1.anInt1388, (byte)9) & 98) != 0) {
					this.aBoolean928 = true;
					if (this.anInt1011 != -1) {
						this.aBoolean1109 = true;
					}
				}
			}

			if (var1.anInt1387 == 1 && var1.aByteArray1389 != null) {
				Class11.method208(-958, var1.aByteArray1389);
			}

			if (var1.anInt1387 == 2 && var1.anInt1388 == this.anInt1183 && var1.aByteArray1389 != null) {
				this.method76(this.aBoolean1184, var1.aByteArray1389);
			}

			if (var1.anInt1387 == 3 && this.loadingState == 1) {
				for (int var2 = 0; var2 < this.aByteArrayArray886.length; ++var2) {
					if (var1.anInt1388 == this.anIntArray831[var2]) {
						this.aByteArrayArray886[var2] = var1.aByteArray1389;
						if (var1.aByteArray1389 == null) {
							this.anIntArray831[var2] = -1;
						}
						break;
					}

					if (var1.anInt1388 == this.anIntArray832[var2]) {
						this.aByteArrayArray953[var2] = var1.aByteArray1389;
						if (var1.aByteArray1389 == null) {
							this.anIntArray832[var2] = -1;
						}
						break;
					}
				}
			}

			if (var1.anInt1387 == 93 && this.aClass43_Sub1_1015.method389(var1.anInt1388)) {
				Class3.method160((byte)-47, new Buffer(var1.aByteArray1389, (byte)1), this.aClass43_Sub1_1015);
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method70() {
		for (Class44_Sub3_Sub4_Sub5 var1 = (Class44_Sub3_Sub4_Sub5)this.aClass28_924.peekFront(); var1 != null; var1 = (Class44_Sub3_Sub4_Sub5)this.aClass28_924.getPrevious(this.aByte958)) {
			if (var1.anInt1591 == this.clientPlane && !var1.aBoolean1597) {
				if (tick >= var1.anInt1590) {
					var1.method528(0, this.anInt975);
					if (var1.aBoolean1597) {
						var1.removeNode();
					} else {
						this.worldController.method289(var1.anInt1594, var1, var1.anInt1592, -1, var1.anInt1593, (byte)1, 60, 0, var1.anInt1591, false);
					}
				}
			} else {
				var1.removeNode();
			}
		}

	}

	public void startRunnable(Runnable var1, int var2) {
		if (var2 > 10) {
			var2 = 10;
		}

		super.startRunnable(var1, var2);
	}

	public void method127(int var1, Class5 var2, int var3, int var4, byte var5) {
		if (var2.anInt110 == 0 && var2.anIntArray125 != null) {
			if (!var2.aBoolean124 || var2.anInt108 == this.anInt1248 || var2.anInt108 == this.anInt1016 || var2.anInt108 == this.anInt1066) {
				int var6 = DrawingArea.anInt1356;
				int var7 = DrawingArea.anInt1354;
				int var8 = DrawingArea.anInt1357;
				int var9 = DrawingArea.anInt1355;
				DrawingArea.method408(5, var3 + var2.anInt114, var2.anInt113 + var1, var1, var3);
				int var10 = var2.anIntArray125.length;

				for (int var11 = 0; var11 < var10; ++var11) {
					int var12 = var2.anIntArray126[var11] + var1;
					int var13 = var3 + var2.anIntArray127[var11] - var4;
					Class5 var14 = Class5.aClass5Array103[var2.anIntArray125[var11]];
					var12 += var14.anInt116;
					var13 += var14.anInt117;
					if (var14.anInt112 > 0) {
						this.method35((byte)-123, var14);
					}

					if (var14.anInt110 == 0) {
						if (var14.anInt123 > var14.anInt122 - var14.anInt114) {
							var14.anInt123 = var14.anInt122 - var14.anInt114;
						}

						if (var14.anInt123 < 0) {
							var14.anInt123 = 0;
						}

						this.method127(var12, var14, var13, var14.anInt123, (byte)0);
						if (var14.anInt122 > var14.anInt114) {
							this.method56(var14.anInt123, var13, var14.anInt122, (byte)123, var12 + var14.anInt113, var14.anInt114);
						}
					} else if (var14.anInt110 != 1) {
						int var16;
						int var17;
						int var18;
						int var21;
						int var22;
						int var27;
						int var33;
						int var34;
						if (var14.anInt110 == 2) {
							var27 = 0;

							for (var16 = 0; var16 < var14.anInt114; ++var16) {
								for (var17 = 0; var17 < var14.anInt113; ++var17) {
									var18 = var17 * (var14.anInt134 + 32) + var12;
									var33 = var16 * (var14.anInt135 + 32) + var13;
									if (var27 < 20) {
										var18 += var14.anIntArray137[var27];
										var33 += var14.anIntArray138[var27];
									}

									if (var14.anIntArray104[var27] <= 0) {
										if (var14.aClass44_Sub3_Sub1_Sub2Array136 != null && var27 < 20) {
											Class44_Sub3_Sub1_Sub2 var38 = var14.aClass44_Sub3_Sub1_Sub2Array136[var27];
											if (var38 != null) {
												var38.method440(this.aByte1070, var18, var33);
											}
										}
									} else {
										var34 = 0;
										var21 = 0;
										var22 = var14.anIntArray104[var27] - 1;
										if (var18 > DrawingArea.anInt1356 - 32 && var18 < DrawingArea.anInt1357 && var33 > DrawingArea.anInt1354 - 32 && var33 < DrawingArea.anInt1355 || this.anInt895 != 0 && var27 == this.anInt894) {
											int var23 = 0;
											if (this.anInt811 == 1 && var27 == this.anInt812 && this.anInt813 == var14.anInt108) {
												var23 = 16777215;
											}

											Class44_Sub3_Sub1_Sub2 var24 = Class14.method226(var22, var23, 45926, var14.anIntArray105[var27]);
											if (var24 != null) {
												int var25;
												if (this.anInt895 != 0 && var27 == this.anInt894 && this.anInt893 == var14.anInt108) {
													var34 = super.anInt22 - this.anInt896;
													var21 = super.anInt23 - this.anInt897;
													if (var34 < 5 && var34 > -5) {
														var34 = 0;
													}

													if (var21 < 5 && var21 > -5) {
														var21 = 0;
													}

													if (this.anInt1250 < 5) {
														var34 = 0;
														var21 = 0;
													}

													var24.method442(var33 + var21, var18 + var34, -676, 128);
													if (var33 + var21 < DrawingArea.anInt1354 && var2.anInt123 > 0) {
														var25 = (DrawingArea.anInt1354 - var33 - var21) * this.anInt975 / 3;
														if (var25 > this.anInt975 * 10) {
															var25 = this.anInt975 * 10;
														}

														if (var25 > var2.anInt123) {
															var25 = var2.anInt123;
														}

														var2.anInt123 -= var25;
														this.anInt897 += var25;
													}

													if (var33 + var21 + 32 > DrawingArea.anInt1355 && var2.anInt123 < var2.anInt122 - var2.anInt114) {
														var25 = (var33 + var21 + 32 - DrawingArea.anInt1355) * this.anInt975 / 3;
														if (var25 > this.anInt975 * 10) {
															var25 = this.anInt975 * 10;
														}

														if (var25 > var2.anInt122 - var2.anInt114 - var2.anInt123) {
															var25 = var2.anInt122 - var2.anInt114 - var2.anInt123;
														}

														var2.anInt123 += var25;
														this.anInt897 -= var25;
													}
												} else if (this.anInt850 != 0 && var27 == this.anInt849 && this.anInt848 == var14.anInt108) {
													var24.method442(var33, var18, -676, 128);
												} else {
													var24.method440(this.aByte1070, var18, var33);
												}

												if (var24.anInt1436 == 33 || var14.anIntArray105[var27] != 1) {
													var25 = var14.anIntArray105[var27];
													this.aClass44_Sub3_Sub1_Sub4_1075.method458(var18 + var34 + 1, method110(5, var25), 0, var33 + var21 + 10);
													this.aClass44_Sub3_Sub1_Sub4_1075.method458(var18 + var34, method110(5, var25), 16776960, var33 + var21 + 9);
												}
											}
										}
									}

									++var27;
								}
							}
						} else if (var14.anInt110 == 3) {
							boolean var29 = this.anInt1066 == var14.anInt108 || this.anInt1016 == var14.anInt108 || this.anInt1248 == var14.anInt108;
							if (this.method134(var14)) {
								var16 = var14.anInt147;
								if (var29 && var14.anInt149 != 0) {
									var16 = var14.anInt149;
								}
							} else {
								var16 = var14.anInt146;
								if (var29 && var14.anInt148 != 0) {
									var16 = var14.anInt148;
								}
							}

							if (var14.aByte115 == 0) {
								if (var14.aBoolean140) {
									DrawingArea.method411(var14.anInt114, var16, var14.anInt113, var12, 0, var13);
								} else {
									DrawingArea.method412(var14.anInt113, var16, var14.anInt114, var12, var13);
								}
							} else if (var14.aBoolean140) {
								DrawingArea.method410(var14.anInt113, var14.anInt114, var13, var16, var12, 0, 256 - (var14.aByte115 & 255));
							} else {
								DrawingArea.method413(var14.anInt113, true, var13, var12, var16, var14.anInt114, 256 - (var14.aByte115 & 255));
							}
						} else {
							Class44_Sub3_Sub1_Sub4 var15;
							if (var14.anInt110 == 4) {
								var15 = var14.aClass44_Sub3_Sub1_Sub4_143;
								String var30 = var14.aString144;
								boolean var31 = this.anInt1066 == var14.anInt108 || this.anInt1016 == var14.anInt108 || this.anInt1248 == var14.anInt108;
								if (this.method134(var14)) {
									var18 = var14.anInt147;
									if (var31 && var14.anInt149 != 0) {
										var18 = var14.anInt149;
									}

									if (var14.aString145.length() > 0) {
										var30 = var14.aString145;
									}
								} else {
									var18 = var14.anInt146;
									if (var31 && var14.anInt148 != 0) {
										var18 = var14.anInt148;
									}
								}

								if (var14.anInt111 == 6 && this.aBoolean1168) {
									var30 = "Please wait...";
									var18 = var14.anInt146;
								}

								if (DrawingArea.anInt1352 == 479) {
									if (var18 == 16776960) {
										var18 = 255;
									}

									if (var18 == 49152) {
										var18 = 16777215;
									}
								}

								for (var33 = var13 + var15.anInt1464; var30.length() > 0; var33 += var15.anInt1464) {
									if (var30.contains("%")) {
										label388:
										while (true) {
											var34 = var30.indexOf("%1");
											if (var34 == -1) {
												while (true) {
													var34 = var30.indexOf("%2");
													if (var34 == -1) {
														while (true) {
															var34 = var30.indexOf("%3");
															if (var34 == -1) {
																while (true) {
																	var34 = var30.indexOf("%4");
																	if (var34 == -1) {
																		while (true) {
																			var34 = var30.indexOf("%5");
																			if (var34 == -1) {
																				break label388;
																			}

																			var30 = var30.substring(0, var34) + this.method26(this.aByte1117, this.method34(true, var14, 4)) + var30.substring(var34 + 2);
																		}
																	}

																	var30 = var30.substring(0, var34) + this.method26(this.aByte1117, this.method34(true, var14, 3)) + var30.substring(var34 + 2);
																}
															}

															var30 = var30.substring(0, var34) + this.method26(this.aByte1117, this.method34(true, var14, 2)) + var30.substring(var34 + 2);
														}
													}

													var30 = var30.substring(0, var34) + this.method26(this.aByte1117, this.method34(true, var14, 1)) + var30.substring(var34 + 2);
												}
											}

											var30 = var30.substring(0, var34) + this.method26(this.aByte1117, this.method34(true, var14, 0)) + var30.substring(var34 + 2);
										}
									}

									var34 = var30.indexOf("\\n");
									String var37;
									if (var34 != -1) {
										var37 = var30.substring(0, var34);
										var30 = var30.substring(var34 + 2);
									} else {
										var37 = var30;
										var30 = "";
									}

									if (var14.aBoolean141) {
										var15.method456(0, var14.anInt113 / 2 + var12, var33, var37, var18, var14.aBoolean142);
									} else {
										var15.method460(var37, this.anInt1033, var14.aBoolean142, var33, var12, var18);
									}
								}
							} else if (var14.anInt110 == 5) {
								Class44_Sub3_Sub1_Sub2 var28;
								if (this.method134(var14)) {
									var28 = var14.aClass44_Sub3_Sub1_Sub2_151;
								} else {
									var28 = var14.aClass44_Sub3_Sub1_Sub2_150;
								}

								if (var28 != null) {
									var28.method440(this.aByte1070, var12, var13);
								}
							} else if (var14.anInt110 == 6) {
								var27 = Class44_Sub3_Sub1_Sub1.anInt1403;
								var16 = Class44_Sub3_Sub1_Sub1.anInt1404;
								Class44_Sub3_Sub1_Sub1.anInt1403 = var14.anInt113 / 2 + var12;
								Class44_Sub3_Sub1_Sub1.anInt1404 = var14.anInt114 / 2 + var13;
								var17 = Class44_Sub3_Sub1_Sub1.anIntArray1407[var14.anInt159] * var14.anInt158 >> 16;
								var18 = Class44_Sub3_Sub1_Sub1.anIntArray1408[var14.anInt159] * var14.anInt158 >> 16;
								boolean var32 = this.method134(var14);
								if (var32) {
									var34 = var14.anInt157;
								} else {
									var34 = var14.anInt156;
								}

								Model var35;
								if (var34 == -1) {
									var35 = var14.method183(-1, -1, 811, var32);
								} else {
									Class26 var36 = Class26.aClass26Array497[var34];
									var35 = var14.method183(var36.primaryFrames[var14.anInt106], var36.anIntArray500[var14.anInt106], 811, var32);
								}

								if (var35 != null) {
									var35.method523(0, var14.anInt160, 0, var14.anInt159, 0, var17, var18);
								}

								Class44_Sub3_Sub1_Sub1.anInt1403 = var27;
								Class44_Sub3_Sub1_Sub1.anInt1404 = var16;
							} else if (var14.anInt110 == 7) {
								var15 = var14.aClass44_Sub3_Sub1_Sub4_143;
								var16 = 0;

								for (var17 = 0; var17 < var14.anInt114; ++var17) {
									for (var18 = 0; var18 < var14.anInt113; ++var18) {
										if (var14.anIntArray104[var16] > 0) {
											Class14 var19 = Class14.method220(var14.anIntArray104[var16] - 1);
											String var20 = var19.aString327;
											if (var19.aBoolean338 || var14.anIntArray105[var16] != 1) {
												var20 = var20 + " x" + method97(var14.anIntArray105[var16], this.aBoolean1262);
											}

											var21 = var12 + var18 * (var14.anInt134 + 115);
											var22 = var17 * (var14.anInt135 + 12) + var13;
											if (var14.aBoolean141) {
												var15.method456(0, var14.anInt113 / 2 + var21, var22, var20, var14.anInt146, var14.aBoolean142);
											} else {
												var15.method460(var20, this.anInt1033, var14.aBoolean142, var22, var21, var14.anInt146);
											}
										}

										++var16;
									}
								}
							}
						}
					}
				}

				DrawingArea.method408(5, var9, var8, var6, var7);
				if (var5 == 0) {
					boolean var26 = false;
				} else {
					this.aBuffer_843.writeByte(141);
				}

			}
		}
	}

	public boolean method14(int var1, int var2, int var3) {
		var2 = 43 / var2;
		boolean var4 = false;
		Class5 var5 = Class5.aClass5Array103[var3];

		for (int var6 = 0; var6 < var5.anIntArray125.length && var5.anIntArray125[var6] != -1; ++var6) {
			Class5 var7 = Class5.aClass5Array103[var5.anIntArray125[var6]];
			if (var7.anInt110 == 1) {
				var4 |= this.method14(var1, 753, var7.anInt108);
			}

			if (var7.anInt110 == 6 && (var7.anInt156 != -1 || var7.anInt157 != -1)) {
				boolean var8 = this.method134(var7);
				int var9;
				if (var8) {
					var9 = var7.anInt157;
				} else {
					var9 = var7.anInt156;
				}

				if (var9 != -1) {
					Class26 var10 = Class26.aClass26Array497[var9];

					for (var7.anInt107 += var1; var7.anInt107 > var10.getFrameLength(var7.anInt106, 41645); var4 = true) {
						var7.anInt107 -= var10.getFrameLength(var7.anInt106, 41645) + 1;
						++var7.anInt106;
						if (var7.anInt106 >= var10.anInt498) {
							var7.anInt106 -= var10.frameStep;
							if (var7.anInt106 < 0 || var7.anInt106 >= var10.anInt498) {
								var7.anInt106 = 0;
							}
						}
					}
				}
			}
		}

		return var4;
	}

	@ObfuscatedSignature(
		descriptor = "(Z[BI)V",
		garbageValue = "7"
	)
	public void method76(boolean var1, byte[] var2) {
		signlink.midifade = var1 ? 1 : 0;
		signlink.midisave(var2, var2.length);
	}

	public void method82(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		GameObjectSpawnRequest var11 = null;

		for (GameObjectSpawnRequest var12 = (GameObjectSpawnRequest)this.pendingObjectSpawns.peekFront(); var11 != null; var11 = (GameObjectSpawnRequest)this.pendingObjectSpawns.getPrevious(this.aByte958)) {
			if (var5 == var11.anInt1310 && var7 == var11.anInt1312 && var11.anInt1313 == var1 && var8 == var11.anInt1311) {
				var11 = var12;
				break;
			}
		}

		if (var11 == null) {
			var11 = new GameObjectSpawnRequest();
			var11.anInt1310 = var5;
			var11.anInt1311 = var8;
			var11.anInt1312 = var7;
			var11.anInt1313 = var1;
			this.method81(-452, var11);
			this.pendingObjectSpawns.method256(var11);
		}

		var11.anInt1317 = var4;
		var11.anInt1319 = var9;
		var11.anInt1318 = var6;
		var11.anInt1320 = var10;
		var11.delayUntilSpawn = var3;
	}

	public DataInputStream method84(String var1) throws IOException {
		if (!this.aBoolean1053) {
			return signlink.mainapp != null ? signlink.openurl(var1) : new DataInputStream((new URL(this.getCodeBase(), var1)).openStream());
		} else {
			if (this.aSocket1004 != null) {
				try {
					this.aSocket1004.close();
				} catch (Exception var4) {
				}

				this.aSocket1004 = null;
			}

			this.aSocket1004 = this.method72(43595);
			this.aSocket1004.setSoTimeout(10000);
			InputStream var2 = this.aSocket1004.getInputStream();
			OutputStream var3 = this.aSocket1004.getOutputStream();
			var3.write(("JAGGRAB /" + var1 + "\n\n").getBytes());
			return new DataInputStream(var2);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-593"
	)
	public void method15() {
		int var1 = this.anInt1255;
		int var2 = this.anInt1256;
		int var3 = this.anInt1257;
		int var4 = this.anInt1258;
		int var5 = 6116423;
		DrawingArea.method411(var4, var5, var3, var1, 0, var2);
		DrawingArea.method411(16, 0, var3 - 2, var1 + 1, 0, var2 + 1);
		DrawingArea.method412(var3 - 2, 0, var4 - 19, var1 + 1, var2 + 18);
		this.aClass44_Sub3_Sub1_Sub4_1077.method458(var1 + 3, "Choose Option", var5, var2 + 14);
		int var6 = super.anInt22;
		int var7 = super.anInt23;
		if (this.anInt1254 == 0) {
			var6 -= 4;
			var7 -= 4;
		}

		if (this.anInt1254 == 1) {
			var6 -= 553;
			var7 -= 205;
		}

		if (this.anInt1254 == 2) {
			var6 -= 17;
			var7 -= 357;
		}

		for (int var8 = 0; var8 < this.anInt980; ++var8) {
			int var9 = var2 + (this.anInt980 - 1 - var8) * 15 + 31;
			int var10 = 16777215;
			if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 16776960;
			}

			this.aClass44_Sub3_Sub1_Sub4_1077.method460(this.aStringArray1114[var8], this.anInt1033, true, var9, var1 + 3, var10);
		}

	}

	public void method29(Class44_Sub3_Sub4_Sub6 var1, int var2, int var3) {
		this.method30(361, var1.anInt1599, var1.anInt1600, var3);
	}

	@ObfuscatedSignature(
		descriptor = "(LClass5;I)Z",
		garbageValue = "717"
	)
	public boolean method134(Class5 var1) {
		if (var1.anIntArray119 == null) {
			return false;
		} else {
			for (int var2 = 0; var2 < var1.anIntArray119.length; ++var2) {
				int var3 = this.method34(true, var1, var2);
				int var4 = var1.anIntArray120[var2];
				if (var1.anIntArray119[var2] == 2) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var1.anIntArray119[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (var1.anIntArray119[var2] == 4) {
					if (var3 == var4) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	public void method100(int var1, Class44_Sub3_Sub1_Sub3 var2) {
		short var3 = 256;
		Arrays.fill(this.anIntArray1111, 0);

		int var4;
		int var5;
		for (var4 = 0; var4 < 5000; ++var4) {
			var5 = (int)(Math.random() * 128.0D * (double)var3);
			this.anIntArray1111[var5] = (int)(Math.random() * 256.0D);
		}

		int var6;
		int var7;
		for (var4 = 0; var4 < 20; ++var4) {
			for (var5 = 1; var5 < var3 - 1; ++var5) {
				for (var6 = 1; var6 < 127; ++var6) {
					var7 = var6 + (var5 << 7);
					this.anIntArray1112[var7] = (this.anIntArray1111[var7 - 128] + this.anIntArray1111[var7 + 1] + this.anIntArray1111[var7 + 128] + this.anIntArray1111[var7 - 1]) / 4;
				}
			}

			int[] var10 = this.anIntArray1111;
			this.anIntArray1111 = this.anIntArray1112;
			this.anIntArray1112 = var10;
		}

		if (var2 != null) {
			var4 = 0;

			for (var5 = 0; var5 < var2.anInt1448; ++var5) {
				for (var6 = 0; var6 < var2.anInt1447; ++var6) {
					if (var2.aByteArray1445[var4++] != 0) {
						var7 = var2.anInt1449 + var6 + 16;
						int var8 = var2.anInt1450 + var5 + 16;
						int var9 = var7 + (var8 << 7);
						this.anIntArray1111[var9] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "571"
	)
	public void method47() {
		if (this.anInt811 == 0 && this.anInt1196 == 0) {
			this.aStringArray1114[this.anInt980] = "Walk here";
			this.anIntArray1193[this.anInt980] = 718;
			this.anIntArray1191[this.anInt980] = super.anInt22;
			this.anIntArray1192[this.anInt980] = super.anInt23;
			++this.anInt980;
		}

		int var1 = -1;

		for (int var2 = 0; var2 < Model.anInt1583; ++var2) {
			int var3 = Model.anIntArray1584[var2];
			int var4 = var3 & 127;
			int var5 = var3 >> 7 & 127;
			int var6 = var3 >> 29 & 3;
			int var7 = var3 >> 14 & 32767;
			if (var3 != var1) {
				var1 = var3;
				int var9;
				if (var6 == 2 && this.worldController.getConfig(this.clientPlane, var4, var5, var3) >= 0) {
					GameObjectDefinition var8 = GameObjectDefinition.get(var7);
					if (this.anInt811 == 1) {
						this.aStringArray1114[this.anInt980] = "Use " + this.aString815 + " with @cya@" + var8.aString221;
						this.anIntArray1193[this.anInt980] = 810;
						this.anIntArray1194[this.anInt980] = var3;
						this.anIntArray1191[this.anInt980] = var4;
						this.anIntArray1192[this.anInt980] = var5;
						++this.anInt980;
					} else if (this.anInt1196 == 1) {
						if ((this.anInt1198 & 4) == 4) {
							this.aStringArray1114[this.anInt980] = this.aString1199 + " @cya@" + var8.aString221;
							this.anIntArray1193[this.anInt980] = 899;
							this.anIntArray1194[this.anInt980] = var3;
							this.anIntArray1191[this.anInt980] = var4;
							this.anIntArray1192[this.anInt980] = var5;
							++this.anInt980;
						}
					} else {
						if (var8.aStringArray237 != null) {
							for (var9 = 4; var9 >= 0; --var9) {
								if (var8.aStringArray237[var9] != null) {
									this.aStringArray1114[this.anInt980] = var8.aStringArray237[var9] + " @cya@" + var8.aString221;
									if (var9 == 0) {
										this.anIntArray1193[this.anInt980] = 625;
									}

									if (var9 == 1) {
										this.anIntArray1193[this.anInt980] = 721;
									}

									if (var9 == 2) {
										this.anIntArray1193[this.anInt980] = 743;
									}

									if (var9 == 3) {
										this.anIntArray1193[this.anInt980] = 357;
									}

									if (var9 == 4) {
										this.anIntArray1193[this.anInt980] = 1071;
									}

									this.anIntArray1194[this.anInt980] = var3;
									this.anIntArray1191[this.anInt980] = var4;
									this.anIntArray1192[this.anInt980] = var5;
									++this.anInt980;
								}
							}
						}

						this.aStringArray1114[this.anInt980] = "Examine @cya@" + var8.aString221;
						this.anIntArray1193[this.anInt980] = 1381;
						this.anIntArray1194[this.anInt980] = var3;
						this.anIntArray1191[this.anInt980] = var4;
						this.anIntArray1192[this.anInt980] = var5;
						++this.anInt980;
					}
				}

				Class44_Sub3_Sub4_Sub6_Sub2 var10;
				Class44_Sub3_Sub4_Sub6_Sub1 var15;
				if (var6 == 1) {
					Class44_Sub3_Sub4_Sub6_Sub2 var12 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var7];
					if (var12.aClass12_1682.aByte283 == 1 && (var12.anInt1599 & 127) == 64 && (var12.anInt1600 & 127) == 64) {
						for (var9 = 0; var9 < this.anInt1260; ++var9) {
							var10 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anIntArray1261[var9]];
							if (var10 != null && var10 != var12 && var10.aClass12_1682.aByte283 == 1 && var10.anInt1599 == var12.anInt1599 && var10.anInt1600 == var12.anInt1600) {
								this.method133(0, var4, var5, var10.aClass12_1682, this.anIntArray1261[var9]);
							}
						}

						for (var9 = 0; var9 < this.anInt1121; ++var9) {
							var15 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var9]];
							if (var15 != null && var15.anInt1599 == var12.anInt1599 && var15.anInt1600 == var12.anInt1600) {
								this.method36(var4, this.anIntArray1122[var9], var5, var15);
							}
						}
					}

					this.method133(0, var4, var5, var12.aClass12_1682, var7);
				}

				if (var6 == 0) {
					Class44_Sub3_Sub4_Sub6_Sub1 var13 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var7];
					if ((var13.anInt1599 & 127) == 64 && (var13.anInt1600 & 127) == 64) {
						for (var9 = 0; var9 < this.anInt1260; ++var9) {
							var10 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anIntArray1261[var9]];
							if (var10 != null && var10.aClass12_1682.aByte283 == 1 && var10.anInt1599 == var13.anInt1599 && var10.anInt1600 == var13.anInt1600) {
								this.method133(0, var4, var5, var10.aClass12_1682, this.anIntArray1261[var9]);
							}
						}

						for (var9 = 0; var9 < this.anInt1121; ++var9) {
							var15 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var9]];
							if (var15 != null && var15 != var13 && var15.anInt1599 == var13.anInt1599 && var15.anInt1600 == var13.anInt1600) {
								this.method36(var4, this.anIntArray1122[var9], var5, var15);
							}
						}
					}

					this.method36(var4, var7, var5, var13);
				}

				if (var6 == 3) {
					Class28 var14 = this.aClass28ArrayArrayArray816[this.clientPlane][var4][var5];
					if (var14 != null) {
						for (Class44_Sub3_Sub4_Sub2 var17 = (Class44_Sub3_Sub4_Sub2)var14.method260(); var17 != null; var17 = (Class44_Sub3_Sub4_Sub2)var14.method262()) {
							Class14 var16 = Class14.method220(var17.anInt1480);
							if (this.anInt811 == 1) {
								this.aStringArray1114[this.anInt980] = "Use " + this.aString815 + " with @lre@" + var16.aString327;
								this.anIntArray1193[this.anInt980] = 111;
								this.anIntArray1194[this.anInt980] = var17.anInt1480;
								this.anIntArray1191[this.anInt980] = var4;
								this.anIntArray1192[this.anInt980] = var5;
								++this.anInt980;
							} else if (this.anInt1196 == 1) {
								if ((this.anInt1198 & 1) == 1) {
									this.aStringArray1114[this.anInt980] = this.aString1199 + " @lre@" + var16.aString327;
									this.anIntArray1193[this.anInt980] = 370;
									this.anIntArray1194[this.anInt980] = var17.anInt1480;
									this.anIntArray1191[this.anInt980] = var4;
									this.anIntArray1192[this.anInt980] = var5;
									++this.anInt980;
								}
							} else {
								for (int var11 = 4; var11 >= 0; --var11) {
									if (var16.aStringArray341 != null && var16.aStringArray341[var11] != null) {
										this.aStringArray1114[this.anInt980] = var16.aStringArray341[var11] + " @lre@" + var16.aString327;
										if (var11 == 0) {
											this.anIntArray1193[this.anInt980] = 139;
										}

										if (var11 == 1) {
											this.anIntArray1193[this.anInt980] = 778;
										}

										if (var11 == 2) {
											this.anIntArray1193[this.anInt980] = 617;
										}

										if (var11 == 3) {
											this.anIntArray1193[this.anInt980] = 224;
										}

										if (var11 == 4) {
											this.anIntArray1193[this.anInt980] = 662;
										}

										this.anIntArray1194[this.anInt980] = var17.anInt1480;
										this.anIntArray1191[this.anInt980] = var4;
										this.anIntArray1192[this.anInt980] = var5;
										++this.anInt980;
									} else if (var11 == 2) {
										this.aStringArray1114[this.anInt980] = "Take @lre@" + var16.aString327;
										this.anIntArray1193[this.anInt980] = 617;
										this.anIntArray1194[this.anInt980] = var17.anInt1480;
										this.anIntArray1191[this.anInt980] = var4;
										this.anIntArray1192[this.anInt980] = var5;
										++this.anInt980;
									}
								}

								this.aStringArray1114[this.anInt980] = "Examine @lre@" + var16.aString327;
								this.anIntArray1193[this.anInt980] = 1152;
								this.anIntArray1194[this.anInt980] = var17.anInt1480;
								this.anIntArray1191[this.anInt980] = var4;
								this.anIntArray1192[this.anInt980] = var5;
								++this.anInt980;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "9"
	)
	public boolean method65(int var1) {
		if (var1 < 0) {
			return false;
		} else {
			int var2 = this.anIntArray1193[var1];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 605;
		}
	}

	public void method60(byte var1, int var2) {
		if (var2 >= 0) {
			if (this.aBoolean1104) {
				this.aBoolean1104 = false;
				this.aBoolean1109 = true;
			}

			int var3 = this.anIntArray1191[var2];
			int var4 = this.anIntArray1192[var2];
			int var5 = this.anIntArray1193[var2];
			int var6 = this.anIntArray1194[var2];
			if (this.aByte1071 == var1) {
				boolean var13 = false;
			} else {
				this.anInt1113 = -128;
			}

			if (var5 >= 2000) {
				var5 -= 2000;
			}

			Class44_Sub3_Sub4_Sub6_Sub2 var7;
			if (var5 == 829) {
				var7 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var6];
				if (var7 != null) {
					this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var7.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var7.anIntArray1650[0], (byte)9, 2);
					this.anInt1142 = super.anInt29;
					this.anInt1143 = super.anInt30;
					this.anInt1145 = 2;
					this.anInt1144 = 0;
					this.aBuffer_843.writeOpcode(150);
					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(this.anInt814);
					this.aBuffer_843.writeShort(this.anInt812);
					this.aBuffer_843.writeShort(this.anInt813);
				}
			}

			int var8;
			String var14;
			if (var5 == 524) {
				var14 = this.aStringArray1114[var2];
				var8 = var14.indexOf("@whi@");
				if (var8 != -1) {
					this.method45();
					this.aString951 = var14.substring(var8 + 5).trim();
					this.aBoolean1128 = false;

					for (int var9 = 0; var9 < Class5.aClass5Array103.length; ++var9) {
						if (Class5.aClass5Array103[var9] != null && Class5.aClass5Array103[var9].anInt112 == 600) {
							this.anInt1081 = this.anInt1037 = Class5.aClass5Array103[var9].anInt109;
							break;
						}
					}
				}
			}

			Class44_Sub3_Sub4_Sub6_Sub1 var15;
			if (var5 == 275) {
				var15 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var6];
				if (var15 != null) {
					this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var15.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var15.anIntArray1650[0], (byte)9, 2);
					this.anInt1142 = super.anInt29;
					this.anInt1143 = super.anInt30;
					this.anInt1145 = 2;
					this.anInt1144 = 0;
					this.aBuffer_843.writeOpcode(36);
					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(this.anInt814);
					this.aBuffer_843.writeShort(this.anInt812);
					this.aBuffer_843.writeShort(this.anInt813);
				}
			}

			if (var5 == 743) {
				++anInt969;
				if (anInt969 >= 124) {
					this.aBuffer_843.writeOpcode(201);
					this.aBuffer_843.writeShort(37954);
				}

				this.method51(var4, 74, var3, 187, var6);
			}

			if (var5 == 718) {
				if (!this.aBoolean851) {
					this.worldController.method316(super.anInt29 - 4, super.anInt30 - 4, this.aByte1034);
				} else {
					this.worldController.method316(var3 - 4, var4 - 4, this.aByte1034);
				}
			}

			if (var5 == 721) {
				anInt1232 += var4;
				if (anInt1232 >= 139) {
					this.aBuffer_843.writeOpcode(219);
					this.aBuffer_843.writeInt(0);
				}

				this.method51(var4, 74, var3, 103, var6);
			}

			long var20;
			if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
				var14 = this.aStringArray1114[var2];
				var8 = var14.indexOf("@whi@");
				if (var8 != -1) {
					var20 = Class48.method547(var14.substring(var8 + 5).trim());
					if (var5 == 605) {
						this.method102(199, var20);
					}

					if (var5 == 47) {
						this.method96(var20);
					}

					if (var5 == 513) {
						this.method62(0, var20);
					}

					if (var5 == 884) {
						this.method123(this.aBoolean974, var20);
					}
				}
			}

			if (var5 == 563) {
				this.aBuffer_843.writeOpcode(135);
				this.aBuffer_843.writeShort(var6);
				this.aBuffer_843.writeShort(var3);
				this.aBuffer_843.writeShort(var4);
				this.aBuffer_843.writeShort(this.anInt1197);
				this.anInt847 = 0;
				this.anInt848 = var4;
				this.anInt849 = var3;
				this.anInt850 = 2;
				if (Class5.aClass5Array103[var4].anInt109 == this.anInt1037) {
					this.anInt850 = 1;
				}

				if (Class5.aClass5Array103[var4].anInt109 == this.anInt1011) {
					this.anInt850 = 3;
				}
			}

			Class5 var16;
			if (var5 == 435) {
				this.aBuffer_843.writeOpcode(9);
				this.aBuffer_843.writeShort(var4);
				var16 = Class5.aClass5Array103[var4];
				if (var16.anIntArrayArray118 != null && var16.anIntArrayArray118[0][0] == 5) {
					var8 = var16.anIntArrayArray118[0][1];
					this.anIntArray1107[var8] = 1 - this.anIntArray1107[var8];
					this.method40(false, var8);
					this.aBoolean928 = true;
				}
			}

			if (var5 == 810 && this.method51(var4, 74, var3, 60, var6)) {
				this.aBuffer_843.writeShort(this.anInt814);
				this.aBuffer_843.writeShort(this.anInt812);
				this.aBuffer_843.writeShort(this.anInt813);
			}

			if (var5 == 102) {
				this.anInt811 = 1;
				this.anInt812 = var3;
				this.anInt813 = var4;
				this.anInt814 = var6;
				this.aString815 = Class14.method220(var6).aString327;
				this.anInt1196 = 0;
				this.aBoolean928 = true;
			} else {
				Class14 var17;
				String var21;
				if (var5 == 1328) {
					var17 = Class14.method220(var6);
					Class5 var18 = Class5.aClass5Array103[var4];
					if (var18 != null && var18.anIntArray105[var3] >= 100000) {
						var21 = var18.anIntArray105[var3] + " x " + var17.aString327;
					} else if (var17.aByteArray328 != null) {
						var21 = new String(var17.aByteArray328);
					} else {
						var21 = "It's a " + var17.aString327 + ".";
					}

					this.method49(-476, 0, "", var21);
				}

				if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
					var15 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var6];
					if (var15 != null) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var15.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var15.anIntArray1650[0], (byte)9, 2);
						this.anInt1142 = super.anInt29;
						this.anInt1143 = super.anInt30;
						this.anInt1145 = 2;
						this.anInt1144 = 0;
						if (var5 == 387) {
							anInt1052 += var6;
							if (anInt1052 >= 66) {
								this.aBuffer_843.writeOpcode(235);
								this.aBuffer_843.writeByte(154);
							}

							this.aBuffer_843.writeOpcode(98);
						}

						if (var5 == 185) {
							this.aBuffer_843.writeOpcode(174);
						}

						if (var5 == 639) {
							++anInt900;
							if (anInt900 >= 52) {
								this.aBuffer_843.writeOpcode(80);
								this.aBuffer_843.writeByte(131);
							}

							this.aBuffer_843.writeOpcode(109);
						}

						if (var5 == 27) {
							this.aBuffer_843.writeOpcode(196);
						}

						if (var5 == 499) {
							this.aBuffer_843.writeOpcode(166);
						}

						this.aBuffer_843.writeShort(var6);
					}
				}

				if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
					var7 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var6];
					if (var7 != null) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var7.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var7.anIntArray1650[0], (byte)9, 2);
						this.anInt1142 = super.anInt29;
						this.anInt1143 = super.anInt30;
						this.anInt1145 = 2;
						this.anInt1144 = 0;
						if (var5 == 309) {
							this.aBuffer_843.writeOpcode(223);
						}

						if (var5 == 242) {
							this.aBuffer_843.writeOpcode(236);
						}

						if (var5 == 852) {
							this.aBuffer_843.writeOpcode(147);
						}

						if (var5 == 793) {
							this.aBuffer_843.writeOpcode(189);
						}

						if (var5 == 209) {
							this.aBuffer_843.writeOpcode(233);
						}

						this.aBuffer_843.writeShort(var6);
					}
				}

				if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
					if (var5 == 331) {
						this.aBuffer_843.writeOpcode(179);
					}

					if (var5 == 113) {
						this.aBuffer_843.writeOpcode(82);
					}

					if (var5 == 555) {
						this.aBuffer_843.writeOpcode(239);
					}

					if (var5 == 354) {
						this.aBuffer_843.writeOpcode(46);
					}

					if (var5 == 582) {
						if ((var6 & 3) == 0) {
							++anInt1157;
						}

						if (anInt1157 >= 133) {
							this.aBuffer_843.writeOpcode(250);
							this.aBuffer_843.writeShort(6118);
						}

						this.aBuffer_843.writeOpcode(74);
					}

					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(var3);
					this.aBuffer_843.writeShort(var4);
					this.anInt847 = 0;
					this.anInt848 = var4;
					this.anInt849 = var3;
					this.anInt850 = 2;
					if (Class5.aClass5Array103[var4].anInt109 == this.anInt1037) {
						this.anInt850 = 1;
					}

					if (Class5.aClass5Array103[var4].anInt109 == this.anInt1011) {
						this.anInt850 = 3;
					}
				}

				if (var5 == 997 && !this.aBoolean1168) {
					this.aBuffer_843.writeOpcode(72);
					this.aBuffer_843.writeShort(var4);
					this.aBoolean1168 = true;
				}

				String var19;
				if (var5 == 1714) {
					var7 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var6];
					if (var7 != null) {
						if (var7.aClass12_1682.aByteArray282 != null) {
							var19 = new String(var7.aClass12_1682.aByteArray282);
						} else {
							var19 = "It's a " + var7.aClass12_1682.aString281 + ".";
						}

						this.method49(-476, 0, "", var19);
					}
				}

				if (var5 == 240) {
					var7 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var6];
					if (var7 != null) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var7.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var7.anIntArray1650[0], (byte)9, 2);
						this.anInt1142 = super.anInt29;
						this.anInt1143 = super.anInt30;
						this.anInt1145 = 2;
						this.anInt1144 = 0;
						this.aBuffer_843.writeOpcode(181);
						this.aBuffer_843.writeShort(var6);
						this.aBuffer_843.writeShort(this.anInt1197);
					}
				}

				int var11;
				if (var5 == 902) {
					var14 = this.aStringArray1114[var2];
					var8 = var14.indexOf("@whi@");
					if (var8 != -1) {
						var20 = Class48.method547(var14.substring(var8 + 5).trim());
						var11 = -1;

						for (int var12 = 0; var12 < this.anInt1115; ++var12) {
							if (this.aLongArray1159[var12] == var20) {
								var11 = var12;
								break;
							}
						}

						if (var11 != -1 && this.anIntArray1073[var11] > 0) {
							this.aBoolean1109 = true;
							this.aBoolean1104 = false;
							this.aBoolean1265 = true;
							this.aString984 = "";
							this.anInt1051 = 3;
							this.aLong867 = this.aLongArray1159[var11];
							this.aString1019 = "Enter message to send to " + this.aStringArray833[var11];
						}
					}
				}

				if (var5 == 1381) {
					int var22 = var6 >> 14 & 32767;
					GameObjectDefinition var23 = GameObjectDefinition.get(var22);
					if (var23.aByteArray222 != null) {
						var21 = new String(var23.aByteArray222);
					} else {
						var21 = "It's a " + var23.aString221 + ".";
					}

					this.method49(-476, 0, "", var21);
				}

				if (var5 == 231) {
					var16 = Class5.aClass5Array103[var4];
					boolean var24 = true;
					if (var16.anInt112 > 0) {
						var24 = this.method113(var16, this.anInt1185);
					}

					if (var24) {
						this.aBuffer_843.writeOpcode(9);
						this.aBuffer_843.writeShort(var4);
					}
				}

				boolean var25;
				if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
					var25 = this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var4, (byte)9, 2);
					if (!var25) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var4, (byte)9, 2);
					}

					this.anInt1142 = super.anInt29;
					this.anInt1143 = super.anInt30;
					this.anInt1145 = 2;
					this.anInt1144 = 0;
					if (var5 == 662) {
						anInt1151 += this.anInt1056;
						if (anInt1151 >= 118) {
							this.aBuffer_843.writeOpcode(41);
							this.aBuffer_843.writeInt(0);
						}

						this.aBuffer_843.writeOpcode(117);
					}

					if (var5 == 139) {
						if ((var3 & 3) == 0) {
							++anInt1195;
						}

						if (anInt1195 >= 123) {
							this.aBuffer_843.writeOpcode(25);
							this.aBuffer_843.writeInt(0);
						}

						this.aBuffer_843.writeOpcode(247);
					}

					if (var5 == 224) {
						anInt880 += var4;
						if (anInt880 >= 75) {
							this.aBuffer_843.writeOpcode(0);
							this.aBuffer_843.writeByte(19);
						}

						this.aBuffer_843.writeOpcode(62);
					}

					if (var5 == 617) {
						this.aBuffer_843.writeOpcode(108);
					}

					if (var5 == 778) {
						this.aBuffer_843.writeOpcode(169);
					}

					this.aBuffer_843.writeShort(var3 + this.anInt1055);
					this.aBuffer_843.writeShort(var4 + this.anInt1056);
					this.aBuffer_843.writeShort(var6);
				}

				if (var5 == 1071) {
					this.method51(var4, 74, var3, 127, var6);
				}

				if (var5 == 507 || var5 == 957) {
					var14 = this.aStringArray1114[var2];
					var8 = var14.indexOf("@whi@");
					if (var8 != -1) {
						var14 = var14.substring(var8 + 5).trim();
						var21 = Class48.method551(131, Class48.method548(0, Class48.method547(var14)));
						boolean var10 = false;

						for (var11 = 0; var11 < this.anInt1121; ++var11) {
							Class44_Sub3_Sub4_Sub6_Sub1 var26 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var11]];
							if (var26 != null && var26.aString1657 != null && var26.aString1657.equalsIgnoreCase(var21)) {
								this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var26.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var26.anIntArray1650[0], (byte)9, 2);
								if (var5 == 507) {
									anInt1052 += var6;
									if (anInt1052 >= 66) {
										this.aBuffer_843.writeOpcode(235);
										this.aBuffer_843.writeByte(154);
									}

									this.aBuffer_843.writeOpcode(98);
								}

								if (var5 == 957) {
									++anInt900;
									if (anInt900 >= 52) {
										this.aBuffer_843.writeOpcode(80);
										this.aBuffer_843.writeByte(131);
									}

									this.aBuffer_843.writeOpcode(109);
								}

								this.aBuffer_843.writeShort(this.anIntArray1122[var11]);
								var10 = true;
								break;
							}
						}

						if (!var10) {
							this.method49(-476, 0, "", "Unable to find " + var21);
						}
					}
				}

				if (var5 == 131) {
					var15 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var6];
					if (var15 != null) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var15.anIntArray1649[0], 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var15.anIntArray1650[0], (byte)9, 2);
						this.anInt1142 = super.anInt29;
						this.anInt1143 = super.anInt30;
						this.anInt1145 = 2;
						this.anInt1144 = 0;
						this.aBuffer_843.writeOpcode(240);
						this.aBuffer_843.writeShort(var6);
						this.aBuffer_843.writeShort(this.anInt1197);
					}
				}

				if (var5 == 398) {
					this.aBuffer_843.writeOpcode(136);
					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(var3);
					this.aBuffer_843.writeShort(var4);
					this.aBuffer_843.writeShort(this.anInt814);
					this.aBuffer_843.writeShort(this.anInt812);
					this.aBuffer_843.writeShort(this.anInt813);
					this.anInt847 = 0;
					this.anInt848 = var4;
					this.anInt849 = var3;
					this.anInt850 = 2;
					if (Class5.aClass5Array103[var4].anInt109 == this.anInt1037) {
						this.anInt850 = 1;
					}

					if (Class5.aClass5Array103[var4].anInt109 == this.anInt1011) {
						this.anInt850 = 3;
					}
				}

				if (var5 == 737) {
					this.method45();
				}

				if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
					if (var5 == 681) {
						++anInt1028;
						if (anInt1028 >= 116) {
							this.aBuffer_843.writeOpcode(24);
							this.aBuffer_843.writeMedium(13018169);
						}

						this.aBuffer_843.writeOpcode(216);
					}

					if (var5 == 100) {
						this.aBuffer_843.writeOpcode(42);
					}

					if (var5 == 694) {
						this.aBuffer_843.writeOpcode(185);
					}

					if (var5 == 962) {
						this.aBuffer_843.writeOpcode(2);
					}

					if (var5 == 795) {
						this.aBuffer_843.writeOpcode(123);
					}

					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(var3);
					this.aBuffer_843.writeShort(var4);
					this.anInt847 = 0;
					this.anInt848 = var4;
					this.anInt849 = var3;
					this.anInt850 = 2;
					if (Class5.aClass5Array103[var4].anInt109 == this.anInt1037) {
						this.anInt850 = 1;
					}

					if (Class5.aClass5Array103[var4].anInt109 == this.anInt1011) {
						this.anInt850 = 3;
					}
				}

				if (var5 == 357) {
					this.method51(var4, 74, var3, 157, var6);
				}

				if (var5 == 1152) {
					var17 = Class14.method220(var6);
					if (var17.aByteArray328 != null) {
						var19 = new String(var17.aByteArray328);
					} else {
						var19 = "It's a " + var17.aString327 + ".";
					}

					this.method49(-476, 0, "", var19);
				}

				if (var5 == 370) {
					var25 = this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var4, (byte)9, 2);
					if (!var25) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var4, (byte)9, 2);
					}

					this.anInt1142 = super.anInt29;
					this.anInt1143 = super.anInt30;
					this.anInt1145 = 2;
					this.anInt1144 = 0;
					this.aBuffer_843.writeOpcode(91);
					this.aBuffer_843.writeShort(var3 + this.anInt1055);
					this.aBuffer_843.writeShort(var4 + this.anInt1056);
					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(this.anInt1197);
				}

				if (var5 == 899 && this.method51(var4, 74, var3, 213, var6)) {
					this.aBuffer_843.writeShort(this.anInt1197);
				}

				if (var5 == 625) {
					this.method51(var4, 74, var3, 215, var6);
				}

				if (var5 == 111) {
					var25 = this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var4, (byte)9, 2);
					if (!var25) {
						this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 1, 1, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var4, (byte)9, 2);
					}

					this.anInt1142 = super.anInt29;
					this.anInt1143 = super.anInt30;
					this.anInt1145 = 2;
					this.anInt1144 = 0;
					this.aBuffer_843.writeOpcode(39);
					this.aBuffer_843.writeShort(var3 + this.anInt1055);
					this.aBuffer_843.writeShort(var4 + this.anInt1056);
					this.aBuffer_843.writeShort(var6);
					this.aBuffer_843.writeShort(this.anInt814);
					this.aBuffer_843.writeShort(this.anInt812);
					this.aBuffer_843.writeShort(this.anInt813);
				}

				if (var5 == 274) {
					var16 = Class5.aClass5Array103[var4];
					this.anInt1196 = 1;
					this.anInt1197 = var4;
					this.anInt1198 = var16.anInt163;
					this.anInt811 = 0;
					this.aBoolean928 = true;
					var19 = var16.aString161;
					if (var19.contains(" ")) {
						var19 = var19.substring(0, var19.indexOf(" "));
					}

					var21 = var16.aString161;
					if (var21.contains(" ")) {
						var21 = var21.substring(var21.indexOf(" ") + 1);
					}

					this.aString1199 = var19 + " " + var16.aString162 + " " + var21;
					if (this.anInt1198 == 16) {
						this.aBoolean928 = true;
						this.anInt1013 = 3;
						this.aBoolean841 = true;
					}

				} else {
					if (var5 == 225) {
						this.aBuffer_843.writeOpcode(9);
						this.aBuffer_843.writeShort(var4);
						var16 = Class5.aClass5Array103[var4];
						if (var16.anIntArrayArray118 != null && var16.anIntArrayArray118[0][0] == 5) {
							var8 = var16.anIntArrayArray118[0][1];
							if (var16.anIntArray120[0] != this.anIntArray1107[var8]) {
								this.anIntArray1107[var8] = var16.anIntArray120[0];
								this.method40(false, var8);
								this.aBoolean928 = true;
							}
						}
					}

					this.anInt811 = 0;
					this.anInt1196 = 0;
					this.aBoolean928 = true;
				}
			}
		}
	}

	public void despawnGameObject(int var1, int var2, int var3, int var4, boolean var5, int var6, int var7, int var8) {
		if (var3 >= 1 && var8 >= 1 && var3 <= 102 && var8 <= 102) {
			if (isLowMemory && var7 != this.clientPlane) {
				return;
			}

			int var9 = 0;
			if (var2 == 0) {
				var9 = this.worldController.getWallObjectHash(var7, var3, var8);
			}

			if (var2 == 1) {
				var9 = this.worldController.getWallDecorationHash(var8, var3, var7, this.anInt1003);
			}

			if (var2 == 2) {
				var9 = this.worldController.getDynamicObjectHash(var7, var3, var8);
			}

			if (var2 == 3) {
				var9 = this.worldController.getGroundDecorationHash(var7, var3, var8);
			}

			int var10;
			if (var9 != 0) {
				var10 = this.worldController.getConfig(var7, var3, var8, var9);
				int var11 = var9 >> 14 & 32767;
				int var12 = var10 & 31;
				int var13 = var10 >> 6;
				GameObjectDefinition var14;
				if (var2 == 0) {
					this.worldController.removeWallObject(var7, var8, var3, 45735);
					var14 = GameObjectDefinition.get(var11);
					if (var14.solid) {
						this.collisionMap[var7].unmarkWall((byte)3, var12, var14.walkable, var13, var8, var3);
					}
				}

				if (var2 == 1) {
					this.worldController.removeWallDecoration(var8, var7, var3, this.aByte846);
				}

				if (var2 == 2) {
					this.worldController.removeDynamicObject(var8, var7, var3, -870);
					var14 = GameObjectDefinition.get(var11);
					if (var3 + var14.sizeX > 103 || var8 + var14.sizeX > 103 || var3 + var14.sizeY > 103 || var8 + var14.sizeY > 103) {
						return;
					}

					if (var14.solid) {
						this.collisionMap[var7].removeCollisionArea(-585, var14.sizeX, var3, var8, var13, var14.walkable, var14.sizeY);
					}
				}

				if (var2 == 3) {
					this.worldController.removeGroundDecoration(var3, (byte)4, var7, var8);
					var14 = GameObjectDefinition.get(var11);
					if (var14.solid && var14.hasActions) {
						this.collisionMap[var7].unmarkHidden(var3, 0, var8);
					}
				}
			}

			if (var6 >= 0) {
				var10 = var7;
				if (var7 < 3 && (this.tileFlags[1][var3][var8] & 2) == 2) {
					var10 = var7 + 1;
				}

				Class3.forceRenderObject(this.worldController, var10, var7, this.aBoolean1149, var6, var4, var1, this.collisionMap[var7], this.anIntArrayArrayArray957, var8, var3);
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "0"
	)
	public void method45() {
		this.aBuffer_843.writeOpcode(51);
		if (this.anInt1216 != -1) {
			this.anInt1216 = -1;
			this.aBoolean928 = true;
			this.aBoolean1168 = false;
			this.aBoolean841 = true;
		}

		if (this.anInt1011 != -1) {
			this.anInt1011 = -1;
			this.aBoolean1109 = true;
			this.aBoolean1168 = false;
		}

		this.anInt1037 = -1;
	}

	public boolean method22(int var1, String var2) {
		if (var2 == null) {
			return false;
		} else {
			for (int var3 = 0; var3 < this.anInt1115; ++var3) {
				if (var2.equalsIgnoreCase(this.aStringArray833[var3])) {
					return true;
				}
			}

			return var2.equalsIgnoreCase(aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657);
		}
	}

	public void method69(int var1, int var2, int var3, Class5 var4, int var5, int var6, int var7) {
		if (var4.anInt110 == 0 && var4.anIntArray125 != null && !var4.aBoolean124) {
			if (var2 >= var7 && var1 >= var3 && var2 <= var4.anInt113 + var7 && var1 <= var3 + var4.anInt114) {
				int var8 = var4.anIntArray125.length;
				this.anInt1219 += var5;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var4.anIntArray126[var9] + var7;
					int var11 = var3 + var4.anIntArray127[var9] - var6;
					Class5 var12 = Class5.aClass5Array103[var4.anIntArray125[var9]];
					var10 += var12.anInt116;
					var11 += var12.anInt117;
					if ((var12.anInt121 >= 0 || var12.anInt148 != 0) && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
						if (var12.anInt121 >= 0) {
							this.anInt1130 = var12.anInt121;
						} else {
							this.anInt1130 = var12.anInt108;
						}
					}

					if (var12.anInt110 == 0) {
						this.method69(var1, var2, var11, var12, 0, var12.anInt123, var10);
						if (var12.anInt122 > var12.anInt114) {
							this.method64(-782, var12.anInt114, var12, var1, var11, var10 + var12.anInt113, var2, true, var12.anInt122);
						}
					} else {
						if (var12.anInt111 == 1 && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
							boolean var13 = false;
							if (var12.anInt112 != 0) {
								var13 = this.method24(var12);
							}

							if (!var13) {
								this.aStringArray1114[this.anInt980] = var12.aString164;
								this.anIntArray1193[this.anInt980] = 231;
								this.anIntArray1192[this.anInt980] = var12.anInt108;
								++this.anInt980;
							}
						}

						if (var12.anInt111 == 2 && this.anInt1196 == 0 && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
							String var20 = var12.aString161;
							if (var20.contains(" ")) {
								var20 = var20.substring(0, var20.indexOf(" "));
							}

							this.aStringArray1114[this.anInt980] = var20 + " @gre@" + var12.aString162;
							this.anIntArray1193[this.anInt980] = 274;
							this.anIntArray1192[this.anInt980] = var12.anInt108;
							++this.anInt980;
						}

						if (var12.anInt111 == 3 && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
							this.aStringArray1114[this.anInt980] = "Close";
							this.anIntArray1193[this.anInt980] = 737;
							this.anIntArray1192[this.anInt980] = var12.anInt108;
							++this.anInt980;
						}

						if (var12.anInt111 == 4 && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
							this.aStringArray1114[this.anInt980] = var12.aString164;
							this.anIntArray1193[this.anInt980] = 435;
							this.anIntArray1192[this.anInt980] = var12.anInt108;
							++this.anInt980;
						}

						if (var12.anInt111 == 5 && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
							this.aStringArray1114[this.anInt980] = var12.aString164;
							this.anIntArray1193[this.anInt980] = 225;
							this.anIntArray1192[this.anInt980] = var12.anInt108;
							++this.anInt980;
						}

						if (var12.anInt111 == 6 && !this.aBoolean1168 && var2 >= var10 && var1 >= var11 && var2 < var10 + var12.anInt113 && var1 < var11 + var12.anInt114) {
							this.aStringArray1114[this.anInt980] = var12.aString164;
							this.anIntArray1193[this.anInt980] = 997;
							this.anIntArray1192[this.anInt980] = var12.anInt108;
							++this.anInt980;
						}

						if (var12.anInt110 == 2) {
							int var21 = 0;

							for (int var14 = 0; var14 < var12.anInt114; ++var14) {
								for (int var15 = 0; var15 < var12.anInt113; ++var15) {
									int var16 = var15 * (var12.anInt134 + 32) + var10;
									int var17 = var14 * (var12.anInt135 + 32) + var11;
									if (var21 < 20) {
										var16 += var12.anIntArray137[var21];
										var17 += var12.anIntArray138[var21];
									}

									if (var2 >= var16 && var1 >= var17 && var2 < var16 + 32 && var1 < var17 + 32) {
										this.anInt962 = var21;
										this.anInt963 = var12.anInt108;
										if (var12.anIntArray104[var21] > 0) {
											Class14 var18 = Class14.method220(var12.anIntArray104[var21] - 1);
											if (this.anInt811 == 1 && var12.aBoolean131) {
												if (var12.anInt108 != this.anInt813 || var21 != this.anInt812) {
													this.aStringArray1114[this.anInt980] = "Use " + this.aString815 + " with @lre@" + var18.aString327;
													this.anIntArray1193[this.anInt980] = 398;
													this.anIntArray1194[this.anInt980] = var18.anInt325;
													this.anIntArray1191[this.anInt980] = var21;
													this.anIntArray1192[this.anInt980] = var12.anInt108;
													++this.anInt980;
												}
											} else if (this.anInt1196 == 1 && var12.aBoolean131) {
												if ((this.anInt1198 & 16) == 16) {
													this.aStringArray1114[this.anInt980] = this.aString1199 + " @lre@" + var18.aString327;
													this.anIntArray1193[this.anInt980] = 563;
													this.anIntArray1194[this.anInt980] = var18.anInt325;
													this.anIntArray1191[this.anInt980] = var21;
													this.anIntArray1192[this.anInt980] = var12.anInt108;
													++this.anInt980;
												}
											} else {
												int var19;
												if (var12.aBoolean131) {
													for (var19 = 4; var19 >= 3; --var19) {
														if (var18.aStringArray342 != null && var18.aStringArray342[var19] != null) {
															this.aStringArray1114[this.anInt980] = var18.aStringArray342[var19] + " @lre@" + var18.aString327;
															if (var19 == 3) {
																this.anIntArray1193[this.anInt980] = 681;
															}

															if (var19 == 4) {
																this.anIntArray1193[this.anInt980] = 100;
															}

															this.anIntArray1194[this.anInt980] = var18.anInt325;
															this.anIntArray1191[this.anInt980] = var21;
															this.anIntArray1192[this.anInt980] = var12.anInt108;
															++this.anInt980;
														} else if (var19 == 4) {
															this.aStringArray1114[this.anInt980] = "Drop @lre@" + var18.aString327;
															this.anIntArray1193[this.anInt980] = 100;
															this.anIntArray1194[this.anInt980] = var18.anInt325;
															this.anIntArray1191[this.anInt980] = var21;
															this.anIntArray1192[this.anInt980] = var12.anInt108;
															++this.anInt980;
														}
													}
												}

												if (var12.aBoolean132) {
													this.aStringArray1114[this.anInt980] = "Use @lre@" + var18.aString327;
													this.anIntArray1193[this.anInt980] = 102;
													this.anIntArray1194[this.anInt980] = var18.anInt325;
													this.anIntArray1191[this.anInt980] = var21;
													this.anIntArray1192[this.anInt980] = var12.anInt108;
													++this.anInt980;
												}

												if (var12.aBoolean131 && var18.aStringArray342 != null) {
													for (var19 = 2; var19 >= 0; --var19) {
														if (var18.aStringArray342[var19] != null) {
															this.aStringArray1114[this.anInt980] = var18.aStringArray342[var19] + " @lre@" + var18.aString327;
															if (var19 == 0) {
																this.anIntArray1193[this.anInt980] = 694;
															}

															if (var19 == 1) {
																this.anIntArray1193[this.anInt980] = 962;
															}

															if (var19 == 2) {
																this.anIntArray1193[this.anInt980] = 795;
															}

															this.anIntArray1194[this.anInt980] = var18.anInt325;
															this.anIntArray1191[this.anInt980] = var21;
															this.anIntArray1192[this.anInt980] = var12.anInt108;
															++this.anInt980;
														}
													}
												}

												if (var12.aStringArray139 != null) {
													for (var19 = 4; var19 >= 0; --var19) {
														if (var12.aStringArray139[var19] != null) {
															this.aStringArray1114[this.anInt980] = var12.aStringArray139[var19] + " @lre@" + var18.aString327;
															if (var19 == 0) {
																this.anIntArray1193[this.anInt980] = 582;
															}

															if (var19 == 1) {
																this.anIntArray1193[this.anInt980] = 113;
															}

															if (var19 == 2) {
																this.anIntArray1193[this.anInt980] = 555;
															}

															if (var19 == 3) {
																this.anIntArray1193[this.anInt980] = 331;
															}

															if (var19 == 4) {
																this.anIntArray1193[this.anInt980] = 354;
															}

															this.anIntArray1194[this.anInt980] = var18.anInt325;
															this.anIntArray1191[this.anInt980] = var21;
															this.anIntArray1192[this.anInt980] = var12.anInt108;
															++this.anInt980;
														}
													}
												}

												this.aStringArray1114[this.anInt980] = "Examine @lre@" + var18.aString327;
												this.anIntArray1193[this.anInt980] = 1328;
												this.anIntArray1194[this.anInt980] = var18.anInt325;
												this.anIntArray1191[this.anInt980] = var21;
												this.anIntArray1192[this.anInt980] = var12.anInt108;
												++this.anInt980;
											}
										}
									}

									++var21;
								}
							}
						}
					}
				}

			}
		}
	}

	public void method95(int var1) {
		int var2 = this.aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, "Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < this.anInt980; ++var3) {
			var4 = this.aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, this.aStringArray1114[var3]);
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		this.anInt1219 += var1;
		var3 = this.anInt980 * 15 + 21;
		int var5;
		if (super.anInt29 > 4 && super.anInt30 > 4 && super.anInt29 < 516 && super.anInt30 < 338) {
			var4 = super.anInt29 - 4 - var2 / 2;
			if (var4 + var2 > 512) {
				var4 = 512 - var2;
			}

			if (var4 < 0) {
				var4 = 0;
			}

			var5 = super.anInt30 - 4;
			if (var5 + var3 > 334) {
				var5 = 334 - var3;
			}

			if (var5 < 0) {
				var5 = 0;
			}

			this.aBoolean851 = true;
			this.anInt1254 = 0;
			this.anInt1255 = var4;
			this.anInt1256 = var5;
			this.anInt1257 = var2;
			this.anInt1258 = this.anInt980 * 15 + 22;
		}

		if (super.anInt29 > 553 && super.anInt30 > 205 && super.anInt29 < 743 && super.anInt30 < 466) {
			var4 = super.anInt29 - 553 - var2 / 2;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 + var2 > 190) {
				var4 = 190 - var2;
			}

			var5 = super.anInt30 - 205;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 + var3 > 261) {
				var5 = 261 - var3;
			}

			this.aBoolean851 = true;
			this.anInt1254 = 1;
			this.anInt1255 = var4;
			this.anInt1256 = var5;
			this.anInt1257 = var2;
			this.anInt1258 = this.anInt980 * 15 + 22;
		}

		if (super.anInt29 > 17 && super.anInt30 > 357 && super.anInt29 < 496 && super.anInt30 < 453) {
			var4 = super.anInt29 - 17 - var2 / 2;
			if (var4 < 0) {
				var4 = 0;
			} else if (var4 + var2 > 479) {
				var4 = 479 - var2;
			}

			var5 = super.anInt30 - 357;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 + var3 > 96) {
				var5 = 96 - var3;
			}

			this.aBoolean851 = true;
			this.anInt1254 = 2;
			this.anInt1255 = var4;
			this.anInt1256 = var5;
			this.anInt1257 = var2;
			this.anInt1258 = this.anInt980 * 15 + 22;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "15485"
	)
	public void method41(int var1, int var2, int var3, int var4, int var5) {
		int var6 = this.worldController.getWallObjectHash(var5, var1, var3);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var6 != 0) {
			var7 = this.worldController.getConfig(var5, var1, var3, var6);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var2;
			if (var6 > 0) {
				var10 = var4;
			}

			int[] var11 = this.aClass44_Sub3_Sub1_Sub2_1027.anIntArray1431;
			var12 = var1 * 4 + (103 - var3) * 512 * 4 + 24624;
			var13 = var6 >> 14 & 32767;
			GameObjectDefinition var14 = GameObjectDefinition.get(var13);
			if (var14.anInt239 != -1) {
				Class44_Sub3_Sub1_Sub3 var15 = this.aClass44_Sub3_Sub1_Sub3Array1018[var14.anInt239];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.anInt1447) / 2;
					int var17 = (var14.sizeY * 4 - var15.anInt1448) / 2;
					var15.method453(this.aByte1070, var16 + var1 * 4 + 48, var17 + (104 - var3 - var14.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var6 = this.worldController.getDynamicObjectHash(var5, var1, var3);
		if (var6 != 0) {
			var7 = this.worldController.getConfig(var5, var1, var3, var6);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var6 >> 14 & 32767;
			GameObjectDefinition var20 = GameObjectDefinition.get(var10);
			int var24;
			if (var20.anInt239 != -1) {
				Class44_Sub3_Sub1_Sub3 var22 = this.aClass44_Sub3_Sub1_Sub3Array1018[var20.anInt239];
				if (var22 != null) {
					var13 = (var20.sizeX * 4 - var22.anInt1447) / 2;
					var24 = (var20.sizeY * 4 - var22.anInt1448) / 2;
					var22.method453(this.aByte1070, var13 + var1 * 4 + 48, var24 + (104 - var3 - var20.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (var6 > 0) {
					var12 = 15597568;
				}

				int[] var23 = this.aClass44_Sub3_Sub1_Sub2_1027.anIntArray1431;
				var24 = var1 * 4 + (103 - var3) * 512 * 4 + 24624;
				if (var8 != 0 && var8 != 2) {
					var23[var24] = var12;
					var23[var24 + 1 + 512] = var12;
					var23[var24 + 1024 + 2] = var12;
					var23[var24 + 1536 + 3] = var12;
				} else {
					var23[var24 + 1536] = var12;
					var23[var24 + 1 + 1024] = var12;
					var23[var24 + 512 + 2] = var12;
					var23[var24 + 3] = var12;
				}
			}
		}

		var6 = this.worldController.getGroundDecorationHash(var5, var1, var3);
		if (var6 != 0) {
			var7 = var6 >> 14 & 32767;
			GameObjectDefinition var18 = GameObjectDefinition.get(var7);
			if (var18.anInt239 != -1) {
				Class44_Sub3_Sub1_Sub3 var19 = this.aClass44_Sub3_Sub1_Sub3Array1018[var18.anInt239];
				if (var19 != null) {
					var10 = (var18.sizeX * 4 - var19.anInt1447) / 2;
					int var21 = (var18.sizeY * 4 - var19.anInt1448) / 2;
					var19.method453(this.aByte1070, var10 + var1 * 4 + 48, var21 + (104 - var3 - var18.sizeY) * 4 + 48);
				}
			}
		}

	}

	public void method52(int var1, int var2) {
		Class28 var3 = this.aClass28ArrayArrayArray816[this.clientPlane][var1][var2];
		if (var3 == null) {
			this.worldController.method299(this.clientPlane, var1, var2);
		} else {
			int var4 = -99999999;
			Class44_Sub3_Sub4_Sub2 var5 = null;

			Class44_Sub3_Sub4_Sub2 var6;
			int var8;
			for (var6 = (Class44_Sub3_Sub4_Sub2)var3.peekFront(); var6 != null; var6 = (Class44_Sub3_Sub4_Sub2)var3.getPrevious(this.aByte958)) {
				Class14 var7 = Class14.method220(var6.anInt1480);
				var8 = var7.anInt339;
				if (var7.aBoolean338) {
					var8 *= var6.anInt1481 + 1;
				}

				if (var8 > var4) {
					var4 = var8;
					var5 = var6;
				}
			}

			var3.method257(false, var5);
			var6 = null;
			Class44_Sub3_Sub4_Sub2 var9 = null;

			for (Class44_Sub3_Sub4_Sub2 var10 = (Class44_Sub3_Sub4_Sub2)var3.peekFront(); var10 != null; var10 = (Class44_Sub3_Sub4_Sub2)var3.getPrevious(this.aByte958)) {
				if (var10.anInt1480 != var5.anInt1480 && var6 == null) {
					var6 = var10;
				}

				if (var10.anInt1480 != var5.anInt1480 && var10.anInt1480 != var6.anInt1480 && var9 == null) {
					var9 = var10;
				}
			}

			var8 = (var2 << 7) + var1 + 1610612736;
			this.worldController.method285(var2, var8, this.clientPlane, var6, var5, (byte)5, var1, this.method50(var1 * 128 + 64, var2 * 128 + 64, 0, this.clientPlane), var9);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public void method98() {
		this.aComponentImageProducer_862.initDrawingArea();
		Class44_Sub3_Sub1_Sub1.anIntArray1409 = this.anIntArray1244;
		this.aClass44_Sub3_Sub1_Sub3_1201.method453(this.aByte1070, 0, 0);
		if (this.anInt1216 != -1) {
			this.method127(0, Class5.aClass5Array103[this.anInt1216], 0, 0, (byte)0);
		} else if (this.anIntArray954[this.anInt1013] != -1) {
			this.method127(0, Class5.aClass5Array103[this.anIntArray954[this.anInt1013]], 0, 0, (byte)0);
		}

		if (this.aBoolean851 && this.anInt1254 == 1) {
			this.method15();
		}

		this.aComponentImageProducer_862.drawComponentImage(super.graphics, 553, 205);
		this.componentImageProducer.initDrawingArea();
		Class44_Sub3_Sub1_Sub1.anIntArray1409 = this.anIntArray1245;
	}

	public boolean method39(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, byte var11, int var12) {
		byte var13 = 104;
		byte var14 = 104;

		int var15;
		int var16;
		for (var15 = 0; var15 < var13; ++var15) {
			for (var16 = 0; var16 < var14; ++var16) {
				this.anIntArrayArray986[var15][var16] = 0;
				this.anIntArrayArray1084[var15][var16] = 99999999;
			}
		}

		if (var11 == 9) {
			boolean var27 = false;
		} else {
			anInt901 = this.aClass46_944.method542();
		}

		var15 = var6;
		var16 = var1;
		this.anIntArrayArray986[var6][var1] = 99;
		this.anIntArrayArray1084[var6][var1] = 0;
		byte var17 = 0;
		int var18 = 0;
		this.anIntArray838[var17] = var6;
		int var28 = var17 + 1;
		this.anIntArray839[var17] = var1;
		boolean var19 = false;
		int var20 = this.anIntArray838.length;
		int[][] var21 = this.collisionMap[this.clientPlane].anIntArrayArray411;

		int var22;
		while (var18 != var28) {
			var15 = this.anIntArray838[var18];
			var16 = this.anIntArray839[var18];
			var18 = (var18 + 1) % var20;
			if (var15 == var2 && var10 == var16) {
				var19 = true;
				break;
			}

			if (var7 != 0) {
				if ((var7 < 5 || var7 == 10) && this.collisionMap[this.clientPlane].method240(false, var15, var9, var2, var10, var7 - 1, var16)) {
					var19 = true;
					break;
				}

				if (var7 < 10 && this.collisionMap[this.clientPlane].method241(var2, var10, var15, var7 - 1, var9, var16)) {
					var19 = true;
					break;
				}
			}

			if (var3 != 0 && var4 != 0 && this.collisionMap[this.clientPlane].method242(var2, var3, var5, 1, var10, var16, var15, var4)) {
				var19 = true;
				break;
			}

			var22 = this.anIntArrayArray1084[var15][var16] + 1;
			if (var15 > 0 && this.anIntArrayArray986[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 2621704) == 0) {
				this.anIntArray838[var28] = var15 - 1;
				this.anIntArray839[var28] = var16;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15 - 1][var16] = 2;
				this.anIntArrayArray1084[var15 - 1][var16] = var22;
			}

			if (var15 < var13 - 1 && this.anIntArrayArray986[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 2621824) == 0) {
				this.anIntArray838[var28] = var15 + 1;
				this.anIntArray839[var28] = var16;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15 + 1][var16] = 8;
				this.anIntArrayArray1084[var15 + 1][var16] = var22;
			}

			if (var16 > 0 && this.anIntArrayArray986[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
				this.anIntArray838[var28] = var15;
				this.anIntArray839[var28] = var16 - 1;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15][var16 - 1] = 1;
				this.anIntArrayArray1084[var15][var16 - 1] = var22;
			}

			if (var16 < var14 - 1 && this.anIntArrayArray986[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
				this.anIntArray838[var28] = var15;
				this.anIntArray839[var28] = var16 + 1;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15][var16 + 1] = 4;
				this.anIntArrayArray1084[var15][var16 + 1] = var22;
			}

			if (var15 > 0 && var16 > 0 && this.anIntArrayArray986[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 2621710) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
				this.anIntArray838[var28] = var15 - 1;
				this.anIntArray839[var28] = var16 - 1;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15 - 1][var16 - 1] = 3;
				this.anIntArrayArray1084[var15 - 1][var16 - 1] = var22;
			}

			if (var15 < var13 - 1 && var16 > 0 && this.anIntArrayArray986[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 2621827) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
				this.anIntArray838[var28] = var15 + 1;
				this.anIntArray839[var28] = var16 - 1;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15 + 1][var16 - 1] = 9;
				this.anIntArrayArray1084[var15 + 1][var16 - 1] = var22;
			}

			if (var15 > 0 && var16 < var14 - 1 && this.anIntArrayArray986[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 2621752) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
				this.anIntArray838[var28] = var15 - 1;
				this.anIntArray839[var28] = var16 + 1;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15 - 1][var16 + 1] = 6;
				this.anIntArrayArray1084[var15 - 1][var16 + 1] = var22;
			}

			if (var15 < var13 - 1 && var16 < var14 - 1 && this.anIntArrayArray986[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 2621920) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
				this.anIntArray838[var28] = var15 + 1;
				this.anIntArray839[var28] = var16 + 1;
				var28 = (var28 + 1) % var20;
				this.anIntArrayArray986[var15 + 1][var16 + 1] = 12;
				this.anIntArrayArray1084[var15 + 1][var16 + 1] = var22;
			}
		}

		this.anInt1006 = 0;
		int var23;
		int var24;
		int var25;
		if (!var19) {
			if (var8) {
				var22 = 100;

				for (var23 = 1; var23 < 2; ++var23) {
					for (var24 = var2 - var23; var24 <= var23 + var2; ++var24) {
						for (var25 = var10 - var23; var25 <= var10 + var23; ++var25) {
							if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && this.anIntArrayArray1084[var24][var25] < var22) {
								var22 = this.anIntArrayArray1084[var24][var25];
								var15 = var24;
								var16 = var25;
								this.anInt1006 = 1;
								var19 = true;
							}
						}
					}

					if (var19) {
						break;
					}
				}
			}

			if (!var19) {
				return false;
			}
		}

		byte var29 = 0;
		this.anIntArray838[var29] = var15;
		var18 = var29 + 1;
		this.anIntArray839[var29] = var16;

		for (var23 = var22 = this.anIntArrayArray986[var15][var16]; var15 != var6 || var16 != var1; var23 = this.anIntArrayArray986[var15][var16]) {
			if (var23 != var22) {
				var22 = var23;
				this.anIntArray838[var18] = var15;
				this.anIntArray839[var18++] = var16;
			}

			if ((var23 & 2) != 0) {
				++var15;
			} else if ((var23 & 8) != 0) {
				--var15;
			}

			if ((var23 & 1) != 0) {
				++var16;
			} else if ((var23 & 4) != 0) {
				--var16;
			}
		}

		if (var18 <= 0) {
			return var12 != 1;
		} else {
			var23 = var18;
			if (var18 > 25) {
				var23 = 25;
			}

			--var18;
			var24 = this.anIntArray838[var18];
			var25 = this.anIntArray839[var18];
			if (var12 == 0) {
				this.aBuffer_843.writeOpcode(207);
				this.aBuffer_843.writeByte(var23 + var23 + 3);
			}

			if (var12 == 1) {
				this.aBuffer_843.writeOpcode(86);
				this.aBuffer_843.writeByte(var23 + var23 + 3 + 14);
			}

			if (var12 == 2) {
				this.aBuffer_843.writeOpcode(138);
				this.aBuffer_843.writeByte(var23 + var23 + 3);
			}

			if (super.anIntArray32[5] == 1) {
				this.aBuffer_843.writeByte(1);
			} else {
				this.aBuffer_843.writeByte(0);
			}

			this.aBuffer_843.writeShort(var24 + this.anInt1055);
			this.aBuffer_843.writeShort(var25 + this.anInt1056);
			this.anInt1025 = this.anIntArray838[0];
			this.anInt1026 = this.anIntArray839[0];

			for (int var26 = 1; var26 < var23; ++var26) {
				--var18;
				this.aBuffer_843.writeByte(this.anIntArray838[var18] - var24);
				this.aBuffer_843.writeByte(this.anIntArray839[var18] - var25);
			}

			return true;
		}
	}

	@ObfuscatedSignature(
		descriptor = "([BIB)Z",
		garbageValue = "9"
	)
	public boolean method146(byte[] var1, int var2) {
		return var1 == null ? true : signlink.wavesave(var1, var2);
	}

	public void method48(String var1, String var2, boolean var3) {
		signlink.errorname = var1;

		try {
			if (!var3) {
				this.aString932 = "";
				this.aString933 = "Connecting to server...";
				this.loginScreen(true, false);
			}

			this.aClass7_1108 = new Class7(-158, this.method72(portOffset + 43594), this);
			long var4 = Class48.method547(var1);
			int var6 = (int)(var4 >> 16 & 31L);
			this.aBuffer_843.offset = 0;
			this.aBuffer_843.writeByte(14);
			this.aBuffer_843.writeByte(var6);
			this.aClass7_1108.method195(2, -2584, this.aBuffer_843.array, 0);

			int var7;
			for (var7 = 0; var7 < 8; ++var7) {
				this.aClass7_1108.method192();
			}

			var7 = this.aClass7_1108.method192();
			int var9;
			if (var7 == 0) {
				this.aClass7_1108.method194(this.aBuffer_1135.array, 0, 8);
				this.aBuffer_1135.offset = 0;
				this.aLong1231 = this.aBuffer_1135.readLong(0);
				int[] var8 = new int[]{(int)(Math.random() * 9.9999999E7D), (int)(Math.random() * 9.9999999E7D), (int)(this.aLong1231 >> 32), (int)this.aLong1231};
				this.aBuffer_843.offset = 0;
				this.aBuffer_843.writeByte(10);
				this.aBuffer_843.writeInt(var8[0]);
				this.aBuffer_843.writeInt(var8[1]);
				this.aBuffer_843.writeInt(var8[2]);
				this.aBuffer_843.writeInt(var8[3]);
				this.aBuffer_843.writeInt(signlink.uid);
				this.aBuffer_843.writeString(var1);
				this.aBuffer_843.writeString(var2);
				this.aBuffer_843.rsa(modulus, exponent);
				this.aBuffer_1106.offset = 0;
				if (var3) {
					this.aBuffer_1106.writeByte(18);
				} else {
					this.aBuffer_1106.writeByte(16);
				}

				this.aBuffer_1106.writeByte(this.aBuffer_843.offset + 1 + 1 + 36 + 2);
				this.aBuffer_1106.writeByte(255);
				this.aBuffer_1106.writeShort(274);
				this.aBuffer_1106.writeByte(isLowMemory ? 1 : 0);

				for (var9 = 0; var9 < 9; ++var9) {
					this.aBuffer_1106.writeInt(this.anIntArray885[var9]);
				}

				this.aBuffer_1106.writeArray(this.aBuffer_843.array, false, 0, this.aBuffer_843.offset);
				this.aBuffer_843.aClass46_1378 = new Class46(true, var8);

				for (var9 = 0; var9 < 4; ++var9) {
					var8[var9] += 50;
				}

				this.aClass46_944 = new Class46(true, var8);
				this.aClass7_1108.method195(this.aBuffer_1106.offset, -2584, this.aBuffer_1106.array, 0);
				var7 = this.aClass7_1108.method192();
			}

			if (var7 == 1) {
				try {
					Thread.sleep(2000L);
				} catch (Exception var11) {
				}

				this.method48(var1, var2, var3);
			} else {
				int var14;
				if (var7 == 2) {
					this.anInt866 = this.aClass7_1108.method192();
					aBoolean1167 = this.aClass7_1108.method192() == 1;
					this.aLong1230 = 0L;
					this.anInt983 = 0;
					this.aClass10_1160.anInt261 = 0;
					super.aBoolean19 = true;
					this.aBoolean945 = true;
					this.aBoolean905 = true;
					this.aBuffer_843.offset = 0;
					this.aBuffer_1135.offset = 0;
					this.anInt1220 = -1;
					this.anInt1138 = -1;
					this.anInt1139 = -1;
					this.anInt1140 = -1;
					this.anInt1219 = 0;
					this.anInt1221 = 0;
					this.anInt803 = 0;
					this.anInt1223 = 0;
					this.anInt1200 = 0;
					this.anInt980 = 0;
					this.aBoolean851 = false;
					super.mouseIdleMs = 0;

					for (var14 = 0; var14 < 100; ++var14) {
						this.aStringArray950[var14] = null;
					}

					this.anInt811 = 0;
					this.anInt1196 = 0;
					this.loadingState = 0;
					this.anInt929 = 0;
					this.anInt1246 = (int)(Math.random() * 100.0D) - 50;
					this.anInt834 = (int)(Math.random() * 110.0D) - 55;
					this.anInt888 = (int)(Math.random() * 80.0D) - 40;
					this.anInt1217 = (int)(Math.random() * 120.0D) - 60;
					this.anInt1170 = (int)(Math.random() * 30.0D) - 20;
					this.anInt1206 = (int)(Math.random() * 20.0D) - 10 & 2047;
					this.anInt1031 = 0;
					this.anInt934 = -1;
					this.anInt1025 = 0;
					this.anInt1026 = 0;
					this.anInt1121 = 0;
					this.anInt1260 = 0;

					for (var14 = 0; var14 < this.anInt1118; ++var14) {
						this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var14] = null;
						this.aBufferArray1125[var14] = null;
					}

					for (var14 = 0; var14 < 16384; ++var14) {
						this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var14] = null;
					}

					aClass44_Sub3_Sub4_Sub6_Sub1_1252 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anInt1119] = new Class44_Sub3_Sub4_Sub6_Sub1();
					this.aClass28_1156.method263();
					this.aClass28_924.method263();

					for (var14 = 0; var14 < 4; ++var14) {
						for (var9 = 0; var9 < 104; ++var9) {
							for (int var10 = 0; var10 < 104; ++var10) {
								this.aClass28ArrayArrayArray816[var14][var9][var10] = null;
							}
						}
					}

					this.pendingObjectSpawns = new Class28(-822);
					this.anInt1116 = 0;
					this.anInt1115 = 0;
					this.anInt1110 = -1;
					this.anInt1011 = -1;
					this.anInt1037 = -1;
					this.anInt1216 = -1;
					this.anInt1103 = -1;
					this.aBoolean1168 = false;
					this.anInt1013 = 3;
					this.aBoolean1104 = false;
					this.aBoolean851 = false;
					this.aBoolean1265 = false;
					this.aString829 = null;
					this.anInt818 = 0;
					this.anInt1173 = -1;
					this.aBoolean982 = true;
					this.method106();

					for (var14 = 0; var14 < 5; ++var14) {
						this.anIntArray1089[var14] = 0;
					}

					for (var14 = 0; var14 < 5; ++var14) {
						this.aStringArray799[var14] = null;
						this.aBooleanArray800[var14] = false;
					}

					anInt1232 = 0;
					anInt969 = 0;
					anInt1151 = 0;
					anInt900 = 0;
					anInt1052 = 0;
					anInt1157 = 0;
					anInt1195 = 0;
					anInt880 = 0;
					anInt1028 = 0;
					anInt1137 = 0;
					this.method92(70);
				} else if (var7 == 3) {
					this.aString932 = "";
					this.aString933 = "Invalid username or password.";
				} else if (var7 == 4) {
					this.aString932 = "Your account has been disabled.";
					this.aString933 = "Please check your message-centre for details.";
				} else if (var7 == 5) {
					this.aString932 = "Your account is already logged in.";
					this.aString933 = "Try again in 60 secs...";
				} else if (var7 == 6) {
					this.aString932 = "RuneScape has been updated!";
					this.aString933 = "Please reload this page.";
				} else if (var7 == 7) {
					this.aString932 = "This world is full.";
					this.aString933 = "Please use a different world.";
				} else if (var7 == 8) {
					this.aString932 = "Unable to connect.";
					this.aString933 = "Login server offline.";
				} else if (var7 == 9) {
					this.aString932 = "Login limit exceeded.";
					this.aString933 = "Too many connections from your address.";
				} else if (var7 == 10) {
					this.aString932 = "Unable to connect.";
					this.aString933 = "Bad session id.";
				} else if (var7 == 11) {
					this.aString933 = "Login server rejected session.";
					this.aString933 = "Please try again.";
				} else if (var7 == 12) {
					this.aString932 = "You need a members account to login to this world.";
					this.aString933 = "Please subscribe, or use a different world.";
				} else if (var7 == 13) {
					this.aString932 = "Could not complete login.";
					this.aString933 = "Please try using a different world.";
				} else if (var7 == 14) {
					this.aString932 = "The server is being updated.";
					this.aString933 = "Please wait 1 minute and try again.";
				} else if (var7 == 15) {
					this.aBoolean905 = true;
					this.aBuffer_843.offset = 0;
					this.aBuffer_1135.offset = 0;
					this.anInt1220 = -1;
					this.anInt1138 = -1;
					this.anInt1139 = -1;
					this.anInt1140 = -1;
					this.anInt1219 = 0;
					this.anInt1221 = 0;
					this.anInt803 = 0;
					this.anInt980 = 0;
					this.aBoolean851 = false;
					this.aLong1127 = System.currentTimeMillis();
				} else if (var7 == 16) {
					this.aString932 = "Login attempts exceeded.";
					this.aString933 = "Please wait 1 minute and try again.";
				} else if (var7 == 17) {
					this.aString932 = "You are standing in a members-only area.";
					this.aString933 = "To play on this world move to a free area first";
				} else if (var7 == 20) {
					this.aString932 = "Invalid loginserver requested";
					this.aString933 = "Please try using a different world.";
				} else if (var7 != 21) {
					if (var7 == -1) {
						this.aString932 = "No response from server";
						this.aString933 = "Please try using a different world.";
					} else {
						System.out.println("response:" + var7);
						this.aString932 = "Unexpected server response";
						this.aString933 = "Please try using a different world.";
					}
				} else {
					for (var14 = this.aClass7_1108.method192(); var14 >= 0; --var14) {
						this.aString932 = "You have only just left another world";
						this.aString933 = "Your profile will be transferred in: " + var14 + " seconds";
						this.loginScreen(true, false);

						try {
							Thread.sleep(1000L);
						} catch (Exception var12) {
						}
					}

					this.method48(var1, var2, var3);
				}
			}
		} catch (IOException var13) {
			this.aString932 = "";
			this.aString933 = "Error connecting to server.";
		}
	}

	@ObfuscatedSignature(
		descriptor = "(IIILClass44_Sub3_Sub4_Sub6_Sub1;Z)V",
		garbageValue = "1"
	)
	public void method36(int var1, int var2, int var3, Class44_Sub3_Sub4_Sub6_Sub1 var4) {
		if (var4 != aClass44_Sub3_Sub4_Sub6_Sub1_1252) {
			if (this.anInt980 < 400) {
				String var5;
				if (var4.anInt1664 == 0) {
					var5 = var4.aString1657 + method77(-684, var4.anInt1663, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663) + " (level-" + var4.anInt1663 + ")";
				} else {
					var5 = var4.aString1657 + " (skill-" + var4.anInt1664 + ")";
				}

				int var6;
				if (this.anInt811 == 1) {
					this.aStringArray1114[this.anInt980] = "Use " + this.aString815 + " with @whi@" + var5;
					this.anIntArray1193[this.anInt980] = 275;
					this.anIntArray1194[this.anInt980] = var2;
					this.anIntArray1191[this.anInt980] = var1;
					this.anIntArray1192[this.anInt980] = var3;
					++this.anInt980;
				} else if (this.anInt1196 == 1) {
					if ((this.anInt1198 & 8) == 8) {
						this.aStringArray1114[this.anInt980] = this.aString1199 + " @whi@" + var5;
						this.anIntArray1193[this.anInt980] = 131;
						this.anIntArray1194[this.anInt980] = var2;
						this.anIntArray1191[this.anInt980] = var1;
						this.anIntArray1192[this.anInt980] = var3;
						++this.anInt980;
					}
				} else {
					for (var6 = 4; var6 >= 0; --var6) {
						if (this.aStringArray799[var6] != null) {
							this.aStringArray1114[this.anInt980] = this.aStringArray799[var6] + " @whi@" + var5;
							short var7 = 0;
							if (this.aStringArray799[var6].equalsIgnoreCase("attack")) {
								if (var4.anInt1663 > aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663) {
									var7 = 2000;
								}
							} else if (this.aBooleanArray800[var6]) {
								var7 = 2000;
							}

							if (var6 == 0) {
								this.anIntArray1193[this.anInt980] = var7 + 639;
							}

							if (var6 == 1) {
								this.anIntArray1193[this.anInt980] = var7 + 499;
							}

							if (var6 == 2) {
								this.anIntArray1193[this.anInt980] = var7 + 27;
							}

							if (var6 == 3) {
								this.anIntArray1193[this.anInt980] = var7 + 387;
							}

							if (var6 == 4) {
								this.anIntArray1193[this.anInt980] = var7 + 185;
							}

							this.anIntArray1194[this.anInt980] = var2;
							this.anIntArray1191[this.anInt980] = var1;
							this.anIntArray1192[this.anInt980] = var3;
							++this.anInt980;
						}
					}
				}

				for (var6 = 0; var6 < this.anInt980; ++var6) {
					if (this.anIntArray1193[var6] == 718) {
						this.aStringArray1114[var6] = "Walk here @whi@" + var5;
						return;
					}
				}

			}
		}
	}

	public void method147(int var1) {
		int var2 = 5;
		this.anIntArray885[8] = 0;
		this.anInt1219 += var1;
		int var3 = 0;

		while (this.anIntArray885[8] == 0) {
			String var4 = "Unknown problem";
			this.drawString("Connecting to web server", 20, 7);

			try {
				DataInputStream var5 = this.method84("crc" + (int)(Math.random() * 9.9999999E7D) + "-" + 274);
				Buffer var6 = new Buffer(new byte[40], (byte)1);
				var5.readFully(var6.array, 0, 40);
				var5.close();

				int var7;
				for (var7 = 0; var7 < 9; ++var7) {
					this.anIntArray885[var7] = var6.readInt();
				}

				var7 = var6.readInt();
				int var8 = 1234;

				for (int var9 = 0; var9 < 9; ++var9) {
					var8 = (var8 << 1) + this.anIntArray885[var9];
				}

				if (var7 != var8) {
					var4 = "checksum problem";
					this.anIntArray885[8] = 0;
				}
			} catch (EOFException var11) {
				var4 = "EOF problem";
				this.anIntArray885[8] = 0;
			} catch (IOException var12) {
				var4 = "connection problem";
				this.anIntArray885[8] = 0;
			} catch (Exception var13) {
				var4 = "logic problem";
				this.anIntArray885[8] = 0;
				if (!signlink.reporterror) {
					return;
				}
			}

			if (this.anIntArray885[8] == 0) {
				++var3;

				for (int var14 = var2; var14 > 0; --var14) {
					if (var3 >= 10) {
						this.drawString("Game updated - please reload page", 10, 7);
						var14 = 10;
					} else {
						this.drawString(var4 + " - Will retry in " + var14 + " secs.", 10, 7);
					}

					try {
						Thread.sleep(1000L);
					} catch (Exception var10) {
					}
				}

				var2 *= 2;
				if (var2 > 60) {
					var2 = 60;
				}

				this.aBoolean1053 = !this.aBoolean1053;
			}
		}

	}

	public void method133(int var1, int var2, int var3, Class12 var4, int var5) {
		if (this.anInt980 < 400) {
			String var6 = var4.aString281;
			if (var4.anInt298 != 0) {
				var6 = var6 + method77(-684, var4.anInt298, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663) + " (level-" + var4.anInt298 + ")";
			}

			if (this.anInt811 == 1) {
				this.aStringArray1114[this.anInt980] = "Use " + this.aString815 + " with @yel@" + var6;
				this.anIntArray1193[this.anInt980] = 829;
				this.anIntArray1194[this.anInt980] = var5;
				this.anIntArray1191[this.anInt980] = var2;
				this.anIntArray1192[this.anInt980] = var3;
				++this.anInt980;
			} else {
				if (this.anInt1196 == 1) {
					if ((this.anInt1198 & 2) == 2) {
						this.aStringArray1114[this.anInt980] = this.aString1199 + " @yel@" + var6;
						this.anIntArray1193[this.anInt980] = 240;
						this.anIntArray1194[this.anInt980] = var5;
						this.anIntArray1191[this.anInt980] = var2;
						this.anIntArray1192[this.anInt980] = var3;
						++this.anInt980;
					}
				} else {
					int var7;
					if (var4.aStringArray293 != null) {
						for (var7 = 4; var7 >= 0; --var7) {
							if (var4.aStringArray293[var7] != null && !var4.aStringArray293[var7].equalsIgnoreCase("attack")) {
								this.aStringArray1114[this.anInt980] = var4.aStringArray293[var7] + " @yel@" + var6;
								if (var7 == 0) {
									this.anIntArray1193[this.anInt980] = 242;
								}

								if (var7 == 1) {
									this.anIntArray1193[this.anInt980] = 209;
								}

								if (var7 == 2) {
									this.anIntArray1193[this.anInt980] = 309;
								}

								if (var7 == 3) {
									this.anIntArray1193[this.anInt980] = 852;
								}

								if (var7 == 4) {
									this.anIntArray1193[this.anInt980] = 793;
								}

								this.anIntArray1194[this.anInt980] = var5;
								this.anIntArray1191[this.anInt980] = var2;
								this.anIntArray1192[this.anInt980] = var3;
								++this.anInt980;
							}
						}
					}

					if (var4.aStringArray293 != null) {
						for (var7 = 4; var7 >= 0; --var7) {
							if (var4.aStringArray293[var7] != null && var4.aStringArray293[var7].equalsIgnoreCase("attack")) {
								short var8 = 0;
								if (var4.anInt298 > aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1663) {
									var8 = 2000;
								}

								this.aStringArray1114[this.anInt980] = var4.aStringArray293[var7] + " @yel@" + var6;
								if (var7 == 0) {
									this.anIntArray1193[this.anInt980] = var8 + 242;
								}

								if (var7 == 1) {
									this.anIntArray1193[this.anInt980] = var8 + 209;
								}

								if (var7 == 2) {
									this.anIntArray1193[this.anInt980] = var8 + 309;
								}

								if (var7 == 3) {
									this.anIntArray1193[this.anInt980] = var8 + 852;
								}

								if (var7 == 4) {
									this.anIntArray1193[this.anInt980] = var8 + 793;
								}

								this.anIntArray1194[this.anInt980] = var5;
								this.anIntArray1191[this.anInt980] = var2;
								this.anIntArray1192[this.anInt980] = var3;
								++this.anInt980;
							}
						}
					}

					this.aStringArray1114[this.anInt980] = "Examine @yel@" + var6;
					this.anIntArray1193[this.anInt980] = 1714;
					this.anIntArray1194[this.anInt980] = var5;
					this.anIntArray1191[this.anInt980] = var2;
					this.anIntArray1192[this.anInt980] = var3;
					++this.anInt980;
				}

			}
		}
	}

	public void method35(byte var1, Class5 var2) {
		int var3 = var2.anInt112;
		if (this.aByte1032 == var1) {
			int var4;
			if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
				if (var3 == 1 && this.anInt1116 == 0) {
					var2.aString144 = "Loading friend list";
					var2.anInt111 = 0;
				} else if (var3 == 1 && this.anInt1116 == 1) {
					var2.aString144 = "Connecting to friendserver";
					var2.anInt111 = 0;
				} else if (var3 == 2 && this.anInt1116 != 2) {
					var2.aString144 = "Please wait...";
					var2.anInt111 = 0;
				} else {
					var4 = this.anInt1115;
					if (this.anInt1116 != 2) {
						var4 = 0;
					}

					if (var3 > 700) {
						var3 -= 601;
					} else {
						--var3;
					}

					if (var3 >= var4) {
						var2.aString144 = "";
						var2.anInt111 = 0;
					} else {
						var2.aString144 = this.aStringArray833[var3];
						var2.anInt111 = 1;
					}
				}
			} else if ((var3 < 101 || var3 > 200) && (var3 < 801 || var3 > 900)) {
				if (var3 == 203) {
					var4 = this.anInt1115;
					if (this.anInt1116 != 2) {
						var4 = 0;
					}

					var2.anInt122 = var4 * 15 + 20;
					if (var2.anInt122 <= var2.anInt114) {
						var2.anInt122 = var2.anInt114 + 1;
					}

				} else if (var3 >= 401 && var3 <= 500) {
					var3 -= 401;
					if (var3 >= this.anInt961) {
						var2.aString144 = "";
						var2.anInt111 = 0;
					} else {
						var2.aString144 = Class48.method551(131, Class48.method548(0, this.aLongArray817[var3]));
						var2.anInt111 = 1;
					}
				} else if (var3 == 503) {
					var2.anInt122 = this.anInt961 * 15 + 20;
					if (var2.anInt122 <= var2.anInt114) {
						var2.anInt122 = var2.anInt114 + 1;
					}

				} else if (var3 == 327) {
					var2.anInt159 = 150;
					var2.anInt160 = (int)(Math.sin((double)tick / 40.0D) * 256.0D) & 2047;
					if (this.aBoolean971) {
						int var5;
						for (var4 = 0; var4 < 7; ++var4) {
							var5 = this.anIntArray810[var4];
							if (var5 >= 0 && !Class22.aClass22Array455[var5].method249()) {
								return;
							}
						}

						this.aBoolean971 = false;
						Model[] var10 = new Model[7];
						var5 = 0;

						int var7;
						for (int var6 = 0; var6 < 7; ++var6) {
							var7 = this.anIntArray810[var6];
							if (var7 >= 0) {
								var10[var5++] = Class22.aClass22Array455[var7].method250((byte)0);
							}
						}

						Model var9 = new Model(var5, -643, var10);

						for (var7 = 0; var7 < 5; ++var7) {
							if (this.anIntArray1089[var7] != 0) {
								var9.method517(anIntArrayArray1241[var7][0], anIntArrayArray1241[var7][this.anIntArray1089[var7]]);
								if (var7 == 1) {
									var9.method517(anIntArray1134[0], anIntArray1134[this.anIntArray1089[var7]]);
								}
							}
						}

						var9.method510();
						var9.method511(Class26.aClass26Array497[aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1604].primaryFrames[0]);
						var9.method520(64, 850, -30, -50, -30, true);
						var2.anInt152 = 5;
						var2.anInt153 = 0;
						Class5.method185(0, 0, var9, 5);
					}

				} else if (var3 == 324) {
					if (this.aClass44_Sub3_Sub1_Sub2_1059 == null) {
						this.aClass44_Sub3_Sub1_Sub2_1059 = var2.aClass44_Sub3_Sub1_Sub2_150;
						this.aClass44_Sub3_Sub1_Sub2_1060 = var2.aClass44_Sub3_Sub1_Sub2_151;
					}

					if (this.aBoolean982) {
						var2.aClass44_Sub3_Sub1_Sub2_150 = this.aClass44_Sub3_Sub1_Sub2_1060;
					} else {
						var2.aClass44_Sub3_Sub1_Sub2_150 = this.aClass44_Sub3_Sub1_Sub2_1059;
					}
				} else if (var3 == 325) {
					if (this.aClass44_Sub3_Sub1_Sub2_1059 == null) {
						this.aClass44_Sub3_Sub1_Sub2_1059 = var2.aClass44_Sub3_Sub1_Sub2_150;
						this.aClass44_Sub3_Sub1_Sub2_1060 = var2.aClass44_Sub3_Sub1_Sub2_151;
					}

					if (this.aBoolean982) {
						var2.aClass44_Sub3_Sub1_Sub2_150 = this.aClass44_Sub3_Sub1_Sub2_1059;
					} else {
						var2.aClass44_Sub3_Sub1_Sub2_150 = this.aClass44_Sub3_Sub1_Sub2_1060;
					}
				} else if (var3 == 600) {
					var2.aString144 = this.aString951;
					if (tick % 20 < 10) {
						var2.aString144 = var2.aString144 + "|";
					} else {
						var2.aString144 = var2.aString144 + " ";
					}
				} else {
					if (var3 == 613) {
						if (this.anInt866 >= 1) {
							if (this.aBoolean1128) {
								var2.anInt146 = 16711680;
								var2.aString144 = "Moderator option: Mute player for 48 hours: <ON>";
							} else {
								var2.anInt146 = 16777215;
								var2.aString144 = "Moderator option: Mute player for 48 hours: <OFF>";
							}
						} else {
							var2.aString144 = "";
						}
					}

					String var8;
					if (var3 == 650 || var3 == 655) {
						if (this.anInt970 != 0) {
							if (this.anInt1010 == 0) {
								var8 = "earlier today";
							} else if (this.anInt1010 == 1) {
								var8 = "yesterday";
							} else {
								var8 = this.anInt1010 + " days ago";
							}

							var2.aString144 = "You last logged in " + var8 + " from: " + signlink.dns;
						} else {
							var2.aString144 = "";
						}
					}

					if (var3 == 651) {
						if (this.anInt887 == 0) {
							var2.aString144 = "0 unread messages";
							var2.anInt146 = 16776960;
						}

						if (this.anInt887 == 1) {
							var2.aString144 = "1 unread message";
							var2.anInt146 = 65280;
						}

						if (this.anInt887 > 1) {
							var2.aString144 = this.anInt887 + " unread messages";
							var2.anInt146 = 65280;
						}
					}

					if (var3 == 652) {
						if (this.anInt1029 == 201) {
							if (this.anInt1100 == 1) {
								var2.aString144 = "@yel@This is a non-members world: @whi@Since you are a member we";
							} else {
								var2.aString144 = "";
							}
						} else if (this.anInt1029 == 200) {
							var2.aString144 = "You have not yet set any password recovery questions.";
						} else {
							if (this.anInt1029 == 0) {
								var8 = "Earlier today";
							} else if (this.anInt1029 == 1) {
								var8 = "Yesterday";
							} else {
								var8 = this.anInt1029 + " days ago";
							}

							var2.aString144 = var8 + " you changed your recovery questions";
						}
					}

					if (var3 == 653) {
						if (this.anInt1029 == 201) {
							if (this.anInt1100 == 1) {
								var2.aString144 = "@whi@recommend you use a members world instead. You may use";
							} else {
								var2.aString144 = "";
							}
						} else if (this.anInt1029 == 200) {
							var2.aString144 = "We strongly recommend you do so now to secure your account.";
						} else {
							var2.aString144 = "If you do not remember making this change then cancel it immediately";
						}
					}

					if (var3 == 654) {
						if (this.anInt1029 == 201) {
							if (this.anInt1100 == 1) {
								var2.aString144 = "@whi@this world but member benefits are unavailable whilst here.";
								return;
							}

							var2.aString144 = "";
							return;
						}

						if (this.anInt1029 == 200) {
							var2.aString144 = "Do this from the 'account management' area on our front webpage";
							return;
						}

						var2.aString144 = "Do this from the 'account management' area on our front webpage";
					}

				}
			} else {
				var4 = this.anInt1115;
				if (this.anInt1116 != 2) {
					var4 = 0;
				}

				if (var3 > 800) {
					var3 -= 701;
				} else {
					var3 -= 101;
				}

				if (var3 >= var4) {
					var2.aString144 = "";
					var2.anInt111 = 0;
				} else {
					if (this.anIntArray1073[var3] == 0) {
						var2.aString144 = "@red@Offline";
					} else if (localWorldId == this.anIntArray1073[var3]) {
						var2.aString144 = "@gre@World-" + (this.anIntArray1073[var3] - 9);
					} else {
						var2.aString144 = "@yel@World-" + (this.anIntArray1073[var3] - 9);
					}

					var2.anInt111 = 1;
				}
			}
		}
	}

	public void method56(int var1, int var2, int var3, byte var4, int var5, int var6) {
		this.aClass44_Sub3_Sub1_Sub3_1154.method453(this.aByte1070, var5, var2);
		this.aClass44_Sub3_Sub1_Sub3_1155.method453(this.aByte1070, var5, var2 + var6 - 16);
		DrawingArea.method411(var6 - 32, this.anInt1158, 16, var5, 0, var2 + 16);
		int var7 = (var6 - 32) * var6 / var3;
		if (var7 < 8) {
			var7 = 8;
		}

		int var8 = (var6 - 32 - var7) * var1 / (var3 - var6);
		DrawingArea.method411(var7, this.anInt1007, 16, var5, 0, var8 + var2 + 16);
		DrawingArea.method416(this.anInt1177, var7, var5, 384, var8 + var2 + 16);
		DrawingArea.method416(this.anInt1177, var7, var5 + 1, 384, var8 + var2 + 16);
		DrawingArea.method414(16, this.anInt1177, var5, (byte)125, var8 + var2 + 16);
		DrawingArea.method414(16, this.anInt1177, var5, (byte)125, var8 + var2 + 17);
		DrawingArea.method416(this.anInt825, var7, var5 + 15, 384, var8 + var2 + 16);
		DrawingArea.method416(this.anInt825, var7 - 1, var5 + 14, 384, var8 + var2 + 17);
		DrawingArea.method414(16, this.anInt825, var5, (byte)125, var8 + var7 + var2 + 15);
		DrawingArea.method414(15, this.anInt825, var5 + 1, (byte)125, var8 + var7 + var2 + 14);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "0"
	)
	public void method79(int var1) {
		int[] var2 = this.aClass44_Sub3_Sub1_Sub2_1027.anIntArray1431;
		int var3 = var2.length;

		int var4;
		for (var4 = 0; var4 < var3; ++var4) {
			var2[var4] = 0;
		}

		int var5;
		int var6;
		for (var4 = 1; var4 < 103; ++var4) {
			var5 = (103 - var4) * 512 * 4 + 24628;

			for (var6 = 1; var6 < 103; ++var6) {
				if ((this.tileFlags[var1][var6][var4] & 24) == 0) {
					this.worldController.method313(var2, var5, 512, var1, var6, var4);
				}

				if (var1 < 3 && (this.tileFlags[var1 + 1][var6][var4] & 8) != 0) {
					this.worldController.method313(var2, var5, 512, var1 + 1, var6, var4);
				}

				var5 += 4;
			}
		}

		var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		this.aClass44_Sub3_Sub1_Sub2_1027.method435(aBoolean960);

		int var7;
		for (var6 = 1; var6 < 103; ++var6) {
			for (var7 = 1; var7 < 103; ++var7) {
				if ((this.tileFlags[var1][var7][var6] & 24) == 0) {
					this.method41(var7, var4, var6, var5, var1);
				}

				if (var1 < 3 && (this.tileFlags[var1 + 1][var7][var6] & 8) != 0) {
					this.method41(var7, var4, var6, var5, var1 + 1);
				}
			}
		}

		this.componentImageProducer.initDrawingArea();
		this.anInt987 = 0;

		for (var6 = 0; var6 < 104; ++var6) {
			for (var7 = 0; var7 < 104; ++var7) {
				int var8 = this.worldController.getGroundDecorationHash(this.clientPlane, var6, var7);
				if (var8 != 0) {
					var8 = var8 >> 14 & 32767;
					int var9 = GameObjectDefinition.get(var8).anInt238;
					if (var9 >= 0) {
						int var10 = var6;
						int var11 = var7;
						if (var9 != 22 && var9 != 29 && var9 != 34 && var9 != 36 && var9 != 46 && var9 != 47 && var9 != 48) {
							byte var12 = 104;
							byte var13 = 104;
							int[][] var14 = this.collisionMap[this.clientPlane].anIntArrayArray411;

							for (int var15 = 0; var15 < 10; ++var15) {
								int var16 = (int)(Math.random() * 4.0D);
								if (var16 == 0 && var10 > 0 && var10 > var6 - 3 && (var14[var10 - 1][var11] & 2621704) == 0) {
									--var10;
								}

								if (var16 == 1 && var10 < var12 - 1 && var10 < var6 + 3 && (var14[var10 + 1][var11] & 2621824) == 0) {
									++var10;
								}

								if (var16 == 2 && var11 > 0 && var11 > var7 - 3 && (var14[var10][var11 - 1] & 2621698) == 0) {
									--var11;
								}

								if (var16 == 3 && var11 < var13 - 1 && var11 < var7 + 3 && (var14[var10][var11 + 1] & 2621728) == 0) {
									++var11;
								}
							}
						}

						this.aClass44_Sub3_Sub1_Sub2Array1204[this.anInt987] = this.aClass44_Sub3_Sub1_Sub2Array943[var9];
						this.anIntArray988[this.anInt987] = var10;
						this.anIntArray989[this.anInt987] = var11;
						++this.anInt987;
					}
				}
			}
		}

		++anInt996;
		if (anInt996 > 112) {
			anInt996 = 0;
			this.aBuffer_843.writeOpcode(52);
			this.aBuffer_843.writeByte(50);
		}

	}

	public Class47 method61(String var1, int var2, String var3, int var4, byte var5, int var6) {
		byte[] var7 = null;
		int var8 = 5;

		try {
			if (this.aClass45Array1225[0] != null) {
				var7 = this.aClass45Array1225[0].method538((byte)2, var2);
			}
		} catch (Exception var23) {
		}

		int var9;
		if (var7 != null) {
			this.aCRC32_979.reset();
			this.aCRC32_979.update(var7);
			var9 = (int)this.aCRC32_979.getValue();
			if (var9 != var4) {
				var7 = null;
			}
		}

		if (var7 != null) {
			Class47 var28 = new Class47(0, var7);
			return var28;
		} else {
			var9 = 0;

			while (var7 == null) {
				String var10 = "Unknown error";
				this.drawString("Requesting " + var1, var6, 7);
				Object var11 = null;

				int var12;
				try {
					var12 = 0;
					DataInputStream var13 = this.method84(var3 + var4);
					byte[] var14 = new byte[6];
					var13.readFully(var14, 0, 6);
					Buffer var15 = new Buffer(var14, (byte)1);
					var15.offset = 3;
					int var16 = var15.readMedium() + 6;
					int var17 = 6;
					var7 = new byte[var16];
					System.arraycopy(var14, 0, var7, 0, 6);

					int var18;
					int var20;
					for (; var17 < var16; var12 = var20) {
						var18 = var16 - var17;
						if (var18 > 1000) {
							var18 = 1000;
						}

						int var19 = var13.read(var7, var17, var18);
						if (var19 < 0) {
							(new StringBuilder()).append("Length error: ").append(var17).append("/").append(var16).toString();
							throw new IOException("EOF");
						}

						var17 += var19;
						var20 = var17 * 100 / var16;
						if (var20 != var12) {
							this.drawString("Loading " + var1 + " - " + var20 + "%", var6, 7);
						}
					}

					var13.close();

					try {
						if (this.aClass45Array1225[0] != null) {
							this.aClass45Array1225[0].method539(var7.length, var2, var7, (byte)8);
						}
					} catch (Exception var22) {
						this.aClass45Array1225[0] = null;
					}

					if (var7 != null) {
						this.aCRC32_979.reset();
						this.aCRC32_979.update(var7);
						var18 = (int)this.aCRC32_979.getValue();
						if (var18 != var4) {
							var7 = null;
							++var9;
							var10 = "Checksum error: " + var18;
						}
					}
				} catch (IOException var24) {
					if (var10.equals("Unknown error")) {
						var10 = "Connection error";
					}

					var7 = null;
				} catch (NullPointerException var25) {
					var10 = "Null error";
					var7 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (ArrayIndexOutOfBoundsException var26) {
					var10 = "Bounds error";
					var7 = null;
					if (!signlink.reporterror) {
						return null;
					}
				} catch (Exception var27) {
					var10 = "Unexpected error";
					var7 = null;
					if (!signlink.reporterror) {
						return null;
					}
				}

				if (var7 == null) {
					for (var12 = var8; var12 > 0; --var12) {
						if (var9 >= 3) {
							this.drawString("Game updated - please reload page", var6, 7);
							var12 = 10;
						} else {
							this.drawString(var10 + " - Retrying in " + var12, var6, 7);
						}

						try {
							Thread.sleep(1000L);
						} catch (Exception var21) {
						}
					}

					var8 *= 2;
					if (var8 > 60) {
						var8 = 60;
					}

					this.aBoolean1053 = !this.aBoolean1053;
				}
			}

			Class47 var29 = new Class47(0, var7);
			return var29;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "940"
	)
	public void method107() {
		this.anInt890 = 0;
		int var1 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7) + this.anInt1055;
		int var2 = (aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7) + this.anInt1056;
		if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
			this.anInt890 = 1;
		}

		if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
			this.anInt890 = 1;
		}

		if (this.anInt890 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
			this.anInt890 = 0;
		}

	}

	public void method17(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = 2048 - var3 & 2047;
		int var9 = 2048 - var6 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		this.aBoolean905 &= var2;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Model.anIntArray1585[var8];
			var14 = Model.anIntArray1586[var8];
			var15 = var11 * var14 - var7 * var13 >> 16;
			var12 = var11 * var13 + var7 * var14 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Model.anIntArray1585[var9];
			var14 = Model.anIntArray1586[var9];
			var15 = var12 * var13 + var10 * var14 >> 16;
			var12 = var12 * var14 - var10 * var13 >> 16;
			var10 = var15;
		}

		this.anInt820 = var5 - var10;
		this.anInt821 = var4 - var11;
		this.anInt822 = var1 - var12;
		this.anInt823 = var3;
		this.anInt824 = var6;
	}

	public void method102(int var1, long var2) {
		if (var2 != 0L) {
			if (this.anInt1115 >= 100 && this.anInt808 != 1) {
				this.method49(-476, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else if (this.anInt1115 >= 200) {
				this.method49(-476, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
			} else {
				String var4 = Class48.method551(131, Class48.method548(0, var2));

				int var5;
				for (var5 = 0; var5 < this.anInt1115; ++var5) {
					if (this.aLongArray1159[var5] == var2) {
						this.method49(-476, 0, "", var4 + " is already on your friend list");
						return;
					}
				}

				var1 = 88 / var1;

				for (var5 = 0; var5 < this.anInt961; ++var5) {
					if (this.aLongArray817[var5] == var2) {
						this.method49(-476, 0, "", "Please remove " + var4 + " from your ignore list first");
						return;
					}
				}

				if (!var4.equals(aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657)) {
					this.aStringArray833[this.anInt1115] = var4;
					this.aLongArray1159[this.anInt1115] = var2;
					this.anIntArray1073[this.anInt1115] = 0;
					++this.anInt1115;
					this.aBoolean928 = true;
					this.aBuffer_843.writeOpcode(13);
					this.aBuffer_843.writeLong(var2, 0);
				}
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-253"
	)
	public int method120() {
		int var1 = 3;
		if (this.anInt823 < 310) {
			int var2 = this.anInt820 >> 7;
			int var3 = this.anInt822 >> 7;
			int var4 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7;
			int var5 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7;
			if ((this.tileFlags[this.clientPlane][var2][var3] & 4) != 0) {
				var1 = this.clientPlane;
			}

			int var6;
			if (var4 > var2) {
				var6 = var4 - var2;
			} else {
				var6 = var2 - var4;
			}

			int var7;
			if (var5 > var3) {
				var7 = var5 - var3;
			} else {
				var7 = var3 - var5;
			}

			int var8;
			int var9;
			if (var6 > var7) {
				var8 = var7 * 65536 / var6;
				var9 = 32768;

				while (var2 != var4) {
					if (var2 < var4) {
						++var2;
					} else if (var2 > var4) {
						--var2;
					}

					if ((this.tileFlags[this.clientPlane][var2][var3] & 4) != 0) {
						var1 = this.clientPlane;
					}

					var9 += var8;
					if (var9 >= 65536) {
						var9 -= 65536;
						if (var3 < var5) {
							++var3;
						} else if (var3 > var5) {
							--var3;
						}

						if ((this.tileFlags[this.clientPlane][var2][var3] & 4) != 0) {
							var1 = this.clientPlane;
						}
					}
				}
			} else {
				var8 = var6 * 65536 / var7;
				var9 = 32768;

				while (var3 != var5) {
					if (var3 < var5) {
						++var3;
					} else if (var3 > var5) {
						--var3;
					}

					if ((this.tileFlags[this.clientPlane][var2][var3] & 4) != 0) {
						var1 = this.clientPlane;
					}

					var9 += var8;
					if (var9 >= 65536) {
						var9 -= 65536;
						if (var2 < var4) {
							++var2;
						} else if (var2 > var4) {
							--var2;
						}

						if ((this.tileFlags[this.clientPlane][var2][var3] & 4) != 0) {
							var1 = this.clientPlane;
						}
					}
				}
			}
		}

		if ((this.tileFlags[this.clientPlane][aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7][aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 >> 7] & 4) != 0) {
			var1 = this.clientPlane;
		}

		return var1;
	}

	public int method121(int var1) {
		int var2 = this.method50(this.anInt820, this.anInt822, 0, this.clientPlane);
		this.anInt1219 += var1;
		return var2 - this.anInt821 < 800 && (this.tileFlags[this.clientPlane][this.anInt820 >> 7][this.anInt822 >> 7] & 4) != 0 ? this.clientPlane : 3;
	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public void method118() {
		System.out.println("============");
		System.out.println("flame-cycle:" + this.anInt966);
		if (this.aClass43_Sub1_1015 != null) {
			System.out.println("Od-cycle:" + this.aClass43_Sub1_1015.anInt1309);
		}

		System.out.println("loop-cycle:" + tick);
		System.out.println("draw-cycle:" + anInt842);
		System.out.println("ptype:" + this.anInt1220);
		System.out.println("psize:" + this.anInt1219);
		if (this.aClass7_1108 != null) {
			this.aClass7_1108.method196();
		}

		super.aBoolean11 = true;
	}

	public void method62(int var1, long var2) {
		if (var2 != 0L) {
			for (int var4 = 0; var4 < this.anInt1115; ++var4) {
				if (this.aLongArray1159[var4] == var2) {
					--this.anInt1115;
					this.aBoolean928 = true;

					for (int var5 = var4; var5 < this.anInt1115; ++var5) {
						this.aStringArray833[var5] = this.aStringArray833[var5 + 1];
						this.anIntArray1073[var5] = this.anIntArray1073[var5 + 1];
						this.aLongArray1159[var5] = this.aLongArray1159[var5 + 1];
					}

					this.aBuffer_843.writeOpcode(106);
					this.aBuffer_843.writeLong(var2, 0);
					return;
				}
			}

		}
	}

	public void method64(int var1, int var2, Class5 var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
		if (this.aBoolean1017) {
			this.anInt1086 = 32;
		} else {
			this.anInt1086 = 0;
		}

		this.aBoolean1017 = false;
		if (var7 >= var6 && var7 < var6 + 16 && var4 >= var5 && var4 < var5 + 16) {
			var3.anInt123 -= this.anInt993 * 4;
			if (var8) {
				this.aBoolean928 = true;
			}
		} else if (var7 >= var6 && var7 < var6 + 16 && var4 >= var5 + var2 - 16 && var4 < var5 + var2) {
			var3.anInt123 += this.anInt993 * 4;
			if (var8) {
				this.aBoolean928 = true;
			}
		} else if (var7 >= var6 - this.anInt1086 && var7 < this.anInt1086 + var6 + 16 && var4 >= var5 + 16 && var4 < var5 + var2 - 16 && this.anInt993 > 0) {
			int var10 = (var2 - 32) * var2 / var9;
			if (var10 < 8) {
				var10 = 8;
			}

			int var11 = var4 - var5 - 16 - var10 / 2;
			int var12 = var2 - 32 - var10;
			var3.anInt123 = var11 * (var9 - var2) / var12;
			if (var8) {
				this.aBoolean928 = true;
			}

			this.aBoolean1017 = true;
		}

	}

	public void method59(int var1) {
		byte[] var2 = this.aClass47_942.method546("title.dat", (byte[])null);
		Class44_Sub3_Sub1_Sub2 var3 = new Class44_Sub3_Sub1_Sub2(var2, this);
		this.aComponentImageProducer_1042.initDrawingArea();
		var3.method438(0, false, 0);
		this.aComponentImageProducer_1043.initDrawingArea();
		var3.method438(0, false, -637);
		this.aComponentImageProducer_1039.initDrawingArea();
		var3.method438(0, false, -128);
		this.aComponentImageProducer_1040.initDrawingArea();
		var3.method438(-371, false, -202);
		this.aComponentImageProducer_1041.initDrawingArea();
		var3.method438(-171, false, -202);
		this.aComponentImageProducer_1044.initDrawingArea();
		var3.method438(-265, false, 0);
		this.aComponentImageProducer_1045.initDrawingArea();
		var3.method438(-265, false, -562);
		this.aComponentImageProducer_1046.initDrawingArea();
		var3.method438(-171, false, -128);
		this.aComponentImageProducer_1047.initDrawingArea();
		var3.method438(-171, false, -562);
		int[] var4 = new int[var3.anInt1432];

		for (int var5 = 0; var5 < var3.anInt1433; ++var5) {
			for (int var6 = 0; var6 < var3.anInt1432; ++var6) {
				var4[var6] = var3.anIntArray1431[var3.anInt1432 - var6 - 1 + var5 * var3.anInt1432];
			}

			if (var3.anInt1432 >= 0) {
				System.arraycopy(var4, 0, var3.anIntArray1431, var5 * var3.anInt1432, var3.anInt1432);
			}
		}

		this.aComponentImageProducer_1042.initDrawingArea();
		var3.method438(0, false, 382);
		this.aComponentImageProducer_1043.initDrawingArea();
		var3.method438(0, false, -255);
		this.aComponentImageProducer_1039.initDrawingArea();
		var3.method438(0, false, 254);
		this.aComponentImageProducer_1040.initDrawingArea();
		var3.method438(-371, false, 180);
		this.aComponentImageProducer_1041.initDrawingArea();
		var3.method438(-171, false, 180);
		this.aComponentImageProducer_1044.initDrawingArea();
		var3.method438(-265, false, 382);
		this.aComponentImageProducer_1045.initDrawingArea();
		var3.method438(-265, false, -180);
		this.aComponentImageProducer_1046.initDrawingArea();
		this.anInt1219 += var1;
		var3.method438(-171, false, 254);
		this.aComponentImageProducer_1047.initDrawingArea();
		var3.method438(-171, false, -180);
		var3 = new Class44_Sub3_Sub1_Sub2(this.aClass47_942, "logo", 0);
		this.aComponentImageProducer_1039.initDrawingArea();
		var3.method440(this.aByte1070, 382 - var3.anInt1432 / 2 - 128, 18);
		var3 = null;
		Object var7 = null;
		Object var8 = null;
		System.gc();
	}

	public void method88(int var1, int var2, int var3, Class44_Sub3_Sub1_Sub2 var4) {
		int var5 = var1 * var1 + var2 * var2;
		if (var5 > 4225 && var5 < 90000) {
			int var6 = this.anInt1206 + this.anInt1217 & 2047;
			int var7 = Model.anIntArray1585[var6];
			int var8 = Model.anIntArray1586[var6];
			var7 = var7 * 256 / (this.anInt1170 + 256);
			var8 = var8 * 256 / (this.anInt1170 + 256);
			int var9 = var8 * var1 + var7 * var2 >> 16;
			int var10 = var8 * var2 - var7 * var1 >> 16;
			double var11 = Math.atan2((double)var9, (double)var10);
			int var13 = (int)(Math.sin(var11) * 63.0D);
			int var14 = (int)(Math.cos(var11) * 57.0D);
			this.aClass44_Sub3_Sub1_Sub2_1126.method445(15, 20, var13 + 94 + 4 - 10, 83 - var14 - 20, var11, 256, (byte)-32, 15, 20);
		} else {
			this.method33(var2, var1, (byte)-111, var4);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public void method9() {
		if (!this.aBoolean1035 && !this.aBoolean1174 && !this.aBoolean898) {
			++anInt842;
			if (!this.aBoolean905) {
				this.loginScreen(false, false);
			} else {
				this.drawFull(41329);
			}

			this.anInt993 = 0;
		} else {
			this.method108();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	public void method91() {
		this.aClass44_Sub3_Sub1_Sub3_1263 = new Class44_Sub3_Sub1_Sub3(this.aClass47_942, "titlebox", 0);
		this.aClass44_Sub3_Sub1_Sub3_1264 = new Class44_Sub3_Sub1_Sub3(this.aClass47_942, "titlebutton", 0);
		this.aClass44_Sub3_Sub1_Sub3Array1229 = new Class44_Sub3_Sub1_Sub3[12];
		int var1 = 0;

		try {
			var1 = Integer.parseInt(this.getParameter("fl_icon"));
		} catch (Exception var3) {
		}

		int var2;
		if (var1 == 0) {
			for (var2 = 0; var2 < 12; ++var2) {
				this.aClass44_Sub3_Sub1_Sub3Array1229[var2] = new Class44_Sub3_Sub1_Sub3(this.aClass47_942, "runes", var2);
			}
		} else {
			for (var2 = 0; var2 < 12; ++var2) {
				this.aClass44_Sub3_Sub1_Sub3Array1229[var2] = new Class44_Sub3_Sub1_Sub3(this.aClass47_942, "runes", (var2 & 3) + 12);
			}
		}

		this.aClass44_Sub3_Sub1_Sub2_891 = new Class44_Sub3_Sub1_Sub2(128, 265);
		this.aClass44_Sub3_Sub1_Sub2_892 = new Class44_Sub3_Sub1_Sub2(128, 265);
		System.arraycopy(this.aComponentImageProducer_1042.pixels, 0, this.aClass44_Sub3_Sub1_Sub2_891.anIntArray1431, 0, 33920);
		System.arraycopy(this.aComponentImageProducer_1043.pixels, 0, this.aClass44_Sub3_Sub1_Sub2_892.anIntArray1431, 0, 33920);
		this.anIntArray937 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray937[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray937[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray937[var2 + 128] = var2 * 4 + 16776960;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray937[var2 + 192] = 16777215;
		}

		this.anIntArray938 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray938[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray938[var2 + 64] = var2 * 4 + 65280;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray938[var2 + 128] = var2 * 262144 + 65535;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray938[var2 + 192] = 16777215;
		}

		this.anIntArray939 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray939[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray939[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray939[var2 + 128] = var2 * 1024 + 16711935;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.anIntArray939[var2 + 192] = 16777215;
		}

		this.anIntArray936 = new int[256];
		this.anIntArray1111 = new int[32768];
		this.anIntArray1112 = new int[32768];
		this.method100(512, (Class44_Sub3_Sub1_Sub3)null);
		this.anIntArray977 = new int[32768];
		this.anIntArray978 = new int[32768];
		this.drawString("Connecting to fileserver", 10, 7);
		if (!this.aBoolean906) {
			this.aBoolean1175 = true;
			this.aBoolean906 = true;
			this.startRunnable(this, 2);
		}

	}

	public void method89(byte var1) {
		if (var1 == 4) {
			boolean var3 = false;
		} else {
			for (int var2 = 1; var2 > 0; ++var2) {
			}
		}

		for (GameObjectSpawnRequest var4 = (GameObjectSpawnRequest)this.pendingObjectSpawns.peekFront(); var4 != null; var4 = (GameObjectSpawnRequest)this.pendingObjectSpawns.getPrevious(this.aByte958)) {
			if (var4.delayUntilSpawn == -1) {
				var4.anInt1320 = 0;
				this.method81(-452, var4);
			} else {
				var4.removeNode();
			}
		}

	}

	public void method137(Class44_Sub3_Sub4_Sub6 var1, int var2) {
		int var3 = var1.anInt1641 - tick;
		var2 = 25 / var2;
		int var4 = var1.anInt1637 * 128 + var1.anInt1603 * 64;
		int var5 = var1.anInt1639 * 128 + var1.anInt1603 * 64;
		var1.anInt1599 += (var4 - var1.anInt1599) / var3;
		var1.anInt1600 += (var5 - var1.anInt1600) / var3;
		var1.anInt1652 = 0;
		if (var1.anInt1643 == 0) {
			var1.anInt1646 = 1024;
		}

		if (var1.anInt1643 == 1) {
			var1.anInt1646 = 1536;
		}

		if (var1.anInt1643 == 2) {
			var1.anInt1646 = 0;
		}

		if (var1.anInt1643 == 3) {
			var1.anInt1646 = 512;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(LClass5;B)Z",
		garbageValue = "15"
	)
	public boolean method24(Class5 var1) {
		int var2 = var1.anInt112;
		if (var2 >= 1 && var2 <= 200 || var2 >= 701 && var2 <= 900) {
			if (var2 >= 801) {
				var2 -= 701;
			} else if (var2 >= 701) {
				var2 -= 601;
			} else if (var2 >= 101) {
				var2 -= 101;
			} else {
				--var2;
			}

			this.aStringArray1114[this.anInt980] = "Remove @whi@" + this.aStringArray833[var2];
			this.anIntArray1193[this.anInt980] = 513;
			++this.anInt980;
			this.aStringArray1114[this.anInt980] = "Message @whi@" + this.aStringArray833[var2];
			this.anIntArray1193[this.anInt980] = 902;
			++this.anInt980;
			return true;
		} else if (var2 >= 401 && var2 <= 500) {
			this.aStringArray1114[this.anInt980] = "Remove @whi@" + var1.aString144;
			this.anIntArray1193[this.anInt980] = 884;
			++this.anInt980;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(LClass44_Sub3_Sub4_Sub6;I)V",
		garbageValue = "-1672"
	)
	public void method140(Class44_Sub3_Sub4_Sub6 var1) {
		if (var1.anInt1647 != 0) {
			int var3;
			int var4;
			if (var1.anInt1621 != -1 && var1.anInt1621 < 32768) {
				Class44_Sub3_Sub4_Sub6_Sub2 var2 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var1.anInt1621];
				if (var2 != null) {
					var3 = var1.anInt1599 - var2.anInt1599;
					var4 = var1.anInt1600 - var2.anInt1600;
					if (var3 != 0 || var4 != 0) {
						var1.anInt1646 = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				}
			}

			int var6;
			if (var1.anInt1621 >= 32768) {
				var6 = var1.anInt1621 - 32768;
				if (var6 == this.anInt947) {
					var6 = this.anInt1119;
				}

				Class44_Sub3_Sub4_Sub6_Sub1 var7 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var6];
				if (var7 != null) {
					var4 = var1.anInt1599 - var7.anInt1599;
					int var5 = var1.anInt1600 - var7.anInt1600;
					if (var4 != 0 || var5 != 0) {
						var1.anInt1646 = (int)(Math.atan2((double)var4, (double)var5) * 325.949D) & 2047;
					}
				}
			}

			if ((var1.anInt1622 != 0 || var1.anInt1623 != 0) && (var1.anInt1648 == 0 || var1.anInt1652 > 0)) {
				var6 = var1.anInt1599 - (var1.anInt1622 - this.anInt1055 - this.anInt1055) * 64;
				var3 = var1.anInt1600 - (var1.anInt1623 - this.anInt1056 - this.anInt1056) * 64;
				if (var6 != 0 || var3 != 0) {
					var1.anInt1646 = (int)(Math.atan2((double)var6, (double)var3) * 325.949D) & 2047;
				}

				var1.anInt1622 = 0;
				var1.anInt1623 = 0;
			}

			var6 = var1.anInt1646 - var1.anInt1601 & 2047;
			if (var6 != 0) {
				if (var6 >= var1.anInt1647 && var6 <= 2048 - var1.anInt1647) {
					if (var6 > 1024) {
						var1.anInt1601 -= var1.anInt1647;
					} else {
						var1.anInt1601 += var1.anInt1647;
					}
				} else {
					var1.anInt1601 = var1.anInt1646;
				}

				var1.anInt1601 &= 2047;
				if (var1.anInt1624 == var1.anInt1604 && var1.anInt1601 != var1.anInt1646) {
					if (var1.anInt1605 != -1) {
						var1.anInt1624 = var1.anInt1605;
						return;
					}

					var1.anInt1624 = var1.anInt1606;
				}
			}

		}
	}

	public void method139(int var1, Class44_Sub3_Sub4_Sub6 var2) {
		var2.anInt1624 = var2.anInt1604;
		if (var2.anInt1648 == 0) {
			var2.anInt1652 = 0;
		} else {
			if (var2.anInt1627 != -1 && var2.anInt1630 == 0) {
				Class26 var3 = Class26.aClass26Array497[var2.anInt1627];
				if (var2.anInt1653 > 0 && var3.anInt509 == 0) {
					++var2.anInt1652;
					return;
				}

				if (var2.anInt1653 <= 0 && var3.anInt510 == 0) {
					++var2.anInt1652;
					return;
				}
			}

			int var10 = var2.anInt1599;
			int var4 = var2.anInt1600;
			int var5 = var2.anInt1603 * 64 + var2.anIntArray1649[var2.anInt1648 - 1] * 128;
			int var6 = var2.anInt1603 * 64 + var2.anIntArray1650[var2.anInt1648 - 1] * 128;
			if (var5 - var10 <= 256 && var5 - var10 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
				if (var10 < var5) {
					if (var4 < var6) {
						var2.anInt1646 = 1280;
					} else if (var4 > var6) {
						var2.anInt1646 = 1792;
					} else {
						var2.anInt1646 = 1536;
					}
				} else if (var10 > var5) {
					if (var4 < var6) {
						var2.anInt1646 = 768;
					} else if (var4 > var6) {
						var2.anInt1646 = 256;
					} else {
						var2.anInt1646 = 512;
					}
				} else if (var4 < var6) {
					var2.anInt1646 = 1024;
				} else {
					var2.anInt1646 = 0;
				}

				int var7 = var2.anInt1646 - var2.anInt1601 & 2047;
				if (var7 > 1024) {
					var7 -= 2048;
				}

				int var8 = var2.anInt1607;
				if (var7 >= -256 && var7 <= 256) {
					var8 = var2.anInt1606;
				} else if (var7 >= 256 && var7 < 768) {
					var8 = var2.anInt1609;
				} else if (var7 >= -768 && var7 <= -256) {
					var8 = var2.anInt1608;
				}

				if (var8 == -1) {
					var8 = var2.anInt1606;
				}

				var2.anInt1624 = var8;
				int var9 = 4;
				if (var2.anInt1601 != var2.anInt1646 && var2.anInt1621 == -1 && var2.anInt1647 != 0) {
					var9 = 2;
				}

				if (var2.anInt1648 > 2) {
					var9 = 6;
				}

				if (var2.anInt1648 > 3) {
					var9 = 8;
				}

				if (var2.anInt1652 > 0 && var2.anInt1648 > 1) {
					var9 = 8;
					--var2.anInt1652;
				}

				if (var2.aBooleanArray1651[var2.anInt1648 - 1]) {
					var9 <<= 1;
				}

				if (var9 >= 8 && var2.anInt1624 == var2.anInt1606 && var2.anInt1610 != -1) {
					var2.anInt1624 = var2.anInt1610;
				}

				if (var10 < var5) {
					var2.anInt1599 += var9;
					if (var2.anInt1599 > var5) {
						var2.anInt1599 = var5;
					}
				} else if (var10 > var5) {
					var2.anInt1599 -= var9;
					if (var2.anInt1599 < var5) {
						var2.anInt1599 = var5;
					}
				}

				if (var4 < var6) {
					var2.anInt1600 += var9;
					if (var2.anInt1600 > var6) {
						var2.anInt1600 = var6;
					}
				} else if (var4 > var6) {
					var2.anInt1600 -= var9;
					if (var2.anInt1600 < var6) {
						var2.anInt1600 = var6;
					}
				}

				if (var2.anInt1599 == var5 && var2.anInt1600 == var6) {
					--var2.anInt1648;
					if (var2.anInt1653 > 0) {
						--var2.anInt1653;
					}
				}

			} else {
				var2.anInt1599 = var5;
				var2.anInt1600 = var6;
			}
		}
	}

	public void method138(Class44_Sub3_Sub4_Sub6 var1, int var2) {
		this.anInt1219 += var2;
		if (tick == var1.anInt1642 || var1.anInt1627 == -1 || var1.anInt1630 != 0 || var1.anInt1629 + 1 > Class26.aClass26Array497[var1.anInt1627].getFrameLength(var1.anInt1628, 41645)) {
			int var3 = var1.anInt1642 - var1.anInt1641;
			int var4 = tick - var1.anInt1641;
			int var5 = var1.anInt1637 * 128 + var1.anInt1603 * 64;
			int var6 = var1.anInt1639 * 128 + var1.anInt1603 * 64;
			int var7 = var1.anInt1638 * 128 + var1.anInt1603 * 64;
			int var8 = var1.anInt1640 * 128 + var1.anInt1603 * 64;
			var1.anInt1599 = (var7 * var4 + var5 * (var3 - var4)) / var3;
			var1.anInt1600 = (var8 * var4 + var6 * (var3 - var4)) / var3;
		}

		var1.anInt1652 = 0;
		if (var1.anInt1643 == 0) {
			var1.anInt1646 = 1024;
		}

		if (var1.anInt1643 == 1) {
			var1.anInt1646 = 1536;
		}

		if (var1.anInt1643 == 2) {
			var1.anInt1646 = 0;
		}

		if (var1.anInt1643 == 3) {
			var1.anInt1646 = 512;
		}

		var1.anInt1601 = var1.anInt1646;
	}

	@ObfuscatedSignature(
		descriptor = "(LClass44_Sub3_Sub4_Sub6;I)V",
		garbageValue = "3186"
	)
	public void method141(Class44_Sub3_Sub4_Sub6 var1) {
		var1.aBoolean1602 = false;
		Class26 var2;
		if (var1.anInt1624 != -1) {
			var2 = Class26.aClass26Array497[var1.anInt1624];
			++var1.anInt1626;
			if (var1.anInt1625 < var2.anInt498 && var1.anInt1626 > var2.getFrameLength(var1.anInt1625, 41645)) {
				var1.anInt1626 = 0;
				++var1.anInt1625;
			}

			if (var1.anInt1625 >= var2.anInt498) {
				var1.anInt1626 = 0;
				var1.anInt1625 = 0;
			}
		}

		if (var1.anInt1632 != -1 && tick >= var1.anInt1635) {
			if (var1.anInt1633 < 0) {
				var1.anInt1633 = 0;
			}

			var2 = Class32.aClass32Array547[var1.anInt1632].aClass26_551;
			++var1.anInt1634;

			while (var1.anInt1633 < var2.anInt498 && var1.anInt1634 > var2.getFrameLength(var1.anInt1633, 41645)) {
				var1.anInt1634 -= var2.getFrameLength(var1.anInt1633, 41645);
				++var1.anInt1633;
			}

			if (var1.anInt1633 >= var2.anInt498 && (var1.anInt1633 < 0 || var1.anInt1633 >= var2.anInt498)) {
				var1.anInt1632 = -1;
			}
		}

		if (var1.anInt1627 != -1 && var1.anInt1630 <= 1) {
			var2 = Class26.aClass26Array497[var1.anInt1627];
			if (var2.anInt509 == 1 && var1.anInt1653 > 0 && var1.anInt1641 <= tick && var1.anInt1642 < tick) {
				var1.anInt1630 = 1;
				return;
			}
		}

		if (var1.anInt1627 != -1 && var1.anInt1630 == 0) {
			var2 = Class26.aClass26Array497[var1.anInt1627];
			++var1.anInt1629;

			while (var1.anInt1628 < var2.anInt498 && var1.anInt1629 > var2.getFrameLength(var1.anInt1628, 41645)) {
				var1.anInt1629 -= var2.getFrameLength(var1.anInt1628, 41645);
				++var1.anInt1628;
			}

			if (var1.anInt1628 >= var2.anInt498) {
				var1.anInt1628 -= var2.frameStep;
				++var1.anInt1631;
				if (var1.anInt1631 >= var2.anInt508) {
					var1.anInt1627 = -1;
				}

				if (var1.anInt1628 < 0 || var1.anInt1628 >= var2.anInt498) {
					var1.anInt1627 = -1;
				}
			}

			var1.aBoolean1602 = var2.aBoolean504;
		}

		if (var1.anInt1630 > 0) {
			--var1.anInt1630;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(JZ)V",
		garbageValue = "0"
	)
	public void method96(long var1) {
		if (var1 != 0L) {
			if (this.anInt961 >= 100) {
				this.method49(-476, 0, "", "Your ignore list is full. Max of 100 hit");
			} else {
				String var3 = Class48.method551(131, Class48.method548(0, var1));

				int var4;
				for (var4 = 0; var4 < this.anInt961; ++var4) {
					if (this.aLongArray817[var4] == var1) {
						this.method49(-476, 0, "", var3 + " is already on your ignore list");
						return;
					}
				}

				for (var4 = 0; var4 < this.anInt1115; ++var4) {
					if (this.aLongArray1159[var4] == var1) {
						this.method49(-476, 0, "", "Please remove " + var3 + " from your friend list first");
						return;
					}
				}

				this.aLongArray817[this.anInt961++] = var1;
				this.aBoolean928 = true;
				this.aBuffer_843.writeOpcode(255);
				this.aBuffer_843.writeLong(var1, 0);
			}
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	public void method68() {
		if (this.anInt895 == 0) {
			this.aStringArray1114[0] = "Cancel";
			this.anIntArray1193[0] = 1106;
			this.anInt980 = 1;
			this.method83();
			this.anInt1130 = 0;
			if (super.anInt22 > 4 && super.anInt23 > 4 && super.anInt22 < 516 && super.anInt23 < 338) {
				if (this.anInt1037 != -1) {
					this.method69(super.anInt23, super.anInt22, 4, Class5.aClass5Array103[this.anInt1037], 0, 0, 4);
				} else {
					this.method47();
				}
			}

			if (this.anInt1130 != this.anInt1248) {
				this.anInt1248 = this.anInt1130;
			}

			this.anInt1130 = 0;
			if (super.anInt22 > 553 && super.anInt23 > 205 && super.anInt22 < 743 && super.anInt23 < 466) {
				if (this.anInt1216 != -1) {
					this.method69(super.anInt23, super.anInt22, 205, Class5.aClass5Array103[this.anInt1216], 0, 0, 553);
				} else if (this.anIntArray954[this.anInt1013] != -1) {
					this.method69(super.anInt23, super.anInt22, 205, Class5.aClass5Array103[this.anIntArray954[this.anInt1013]], 0, 0, 553);
				}
			}

			if (this.anInt1130 != this.anInt1016) {
				this.aBoolean928 = true;
				this.anInt1016 = this.anInt1130;
			}

			this.anInt1130 = 0;
			if (super.anInt22 > 17 && super.anInt23 > 357 && super.anInt22 < 496 && super.anInt23 < 453) {
				if (this.anInt1011 != -1) {
					this.method69(super.anInt23, super.anInt22, 357, Class5.aClass5Array103[this.anInt1011], 0, 0, 17);
				} else if (super.anInt23 < 434 && super.anInt22 < 426) {
					this.method90(super.anInt22 - 17, true, super.anInt23 - 357);
				}
			}

			if (this.anInt1011 != -1 && this.anInt1130 != this.anInt1066) {
				this.aBoolean1109 = true;
				this.anInt1066 = this.anInt1130;
			}

			boolean var1 = false;

			while (!var1) {
				var1 = true;

				for (int var2 = 0; var2 < this.anInt980 - 1; ++var2) {
					if (this.anIntArray1193[var2] < 1000 && this.anIntArray1193[var2 + 1] > 1000) {
						String var3 = this.aStringArray1114[var2];
						this.aStringArray1114[var2] = this.aStringArray1114[var2 + 1];
						this.aStringArray1114[var2 + 1] = var3;
						int var4 = this.anIntArray1193[var2];
						this.anIntArray1193[var2] = this.anIntArray1193[var2 + 1];
						this.anIntArray1193[var2 + 1] = var4;
						var4 = this.anIntArray1191[var2];
						this.anIntArray1191[var2] = this.anIntArray1191[var2 + 1];
						this.anIntArray1191[var2 + 1] = var4;
						var4 = this.anIntArray1192[var2];
						this.anIntArray1192[var2] = this.anIntArray1192[var2 + 1];
						this.anIntArray1192[var2 + 1] = var4;
						var4 = this.anIntArray1194[var2];
						this.anIntArray1194[var2] = this.anIntArray1194[var2 + 1];
						this.anIntArray1194[var2 + 1] = var4;
						var1 = false;
					}
				}
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-303"
	)
	public void method31() {
		if (this.anInt980 >= 2 || this.anInt811 != 0 || this.anInt1196 != 0) {
			String var1;
			if (this.anInt811 == 1 && this.anInt980 < 2) {
				var1 = "Use " + this.aString815 + " with...";
			} else if (this.anInt1196 == 1 && this.anInt980 < 2) {
				var1 = this.aString1199 + "...";
			} else {
				var1 = this.aStringArray1114[this.anInt980 - 1];
			}

			if (this.anInt980 > 2) {
				var1 = var1 + "@whi@ / " + (this.anInt980 - 2) + " more options";
			}

			this.aClass44_Sub3_Sub1_Sub4_1077.method461(this.anInt946, 4, var1, 15, 16777215, tick / 1000);
		}
	}

	public void method7(int var1) {
		if (!this.aBoolean1035 && !this.aBoolean1174 && !this.aBoolean898) {
			++tick;
			if (!this.aBoolean905) {
				this.method87();
			} else {
				this.method122(this.anInt1113);
			}

			this.method23();
			if (var1 != 0) {
				this.startup();
			}

		}
	}

	public boolean method51(int var1, int var2, int var3, int var4, int var5) {
		int var6 = var5 >> 14 & 32767;
		int var7 = this.worldController.getConfig(this.clientPlane, var3, var1, var5);
		if (var7 == -1) {
			return false;
		} else {
			int var8 = var7 & 31;
			int var9 = var7 >> 6 & 3;
			++anInt1132;
			if (anInt1132 > 1086) {
				anInt1132 = 0;
				this.aBuffer_843.writeOpcode(149);
				this.aBuffer_843.writeByte(0);
				int var10 = this.aBuffer_843.offset;
				if ((int)(Math.random() * 2.0D) == 0) {
					this.aBuffer_843.writeShort(16791);
				}

				this.aBuffer_843.writeByte(254);
				this.aBuffer_843.writeShort((int)(Math.random() * 65536.0D));
				this.aBuffer_843.writeShort(16128);
				this.aBuffer_843.writeShort(52610);
				this.aBuffer_843.writeShort((int)(Math.random() * 65536.0D));
				this.aBuffer_843.writeShort(55420);
				if ((int)(Math.random() * 2.0D) == 0) {
					this.aBuffer_843.writeShort(35025);
				}

				this.aBuffer_843.writeShort(46628);
				this.aBuffer_843.writeByte((int)(Math.random() * 256.0D));
				this.aBuffer_843.writeSize(this.aBuffer_843.offset - var10, this.anInt797);
			}

			if (var8 != 10 && var8 != 11 && var8 != 22) {
				this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], var8 + 1, false, var9, var1, (byte)9, 2);
			} else {
				GameObjectDefinition var14 = GameObjectDefinition.get(var6);
				int var11;
				int var12;
				if (var9 != 0 && var9 != 2) {
					var11 = var14.sizeY;
					var12 = var14.sizeX;
				} else {
					var11 = var14.sizeX;
					var12 = var14.sizeY;
				}

				int var13 = var14.anInt248;
				if (var9 != 0) {
					var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
				}

				this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var3, var11, var12, var13, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, false, 0, var1, (byte)9, 2);
			}

			this.anInt1142 = super.anInt29;
			this.anInt1143 = super.anInt30;
			this.anInt1145 = 2;
			this.anInt1144 = 0;
			this.aBuffer_843.writeOpcode(var4);
			this.aBuffer_843.writeShort(var3 + this.anInt1055);
			this.aBuffer_843.writeShort(this.anInt1056 + var1);
			this.aBuffer_843.writeShort(var6);
			return true;
		}
	}

	public void method123(boolean var1, long var2) {
		if (var1) {
			this.anInt1220 = this.aBuffer_1135.readUByte();
		}

		if (var2 != 0L) {
			for (int var4 = 0; var4 < this.anInt961; ++var4) {
				if (this.aLongArray817[var4] == var2) {
					--this.anInt961;
					this.aBoolean928 = true;
					if (this.anInt961 - var4 >= 0) {
						System.arraycopy(this.aLongArray817, var4 + 1, this.aLongArray817, var4, this.anInt961 - var4);
					}

					this.aBuffer_843.writeOpcode(101);
					this.aBuffer_843.writeLong(var2, 0);
					return;
				}
			}

		}
	}

	public void method90(int var1, boolean var2, int var3) {
		int var4 = 0;

		for (int var5 = 0; var5 < 100; ++var5) {
			if (this.aStringArray950[var5] != null) {
				int var6 = this.anIntArray948[var5];
				int var7 = 70 - var4 * 14 + this.anInt1082 + 4;
				if (var7 < -20) {
					break;
				}

				String var8 = this.aStringArray949[var5];
				boolean var9 = false;
				boolean var10;
				if (var8 != null && var8.startsWith("@cr1@")) {
					var8 = var8.substring(5);
					var10 = true;
				}

				if (var8 != null && var8.startsWith("@cr2@")) {
					var8 = var8.substring(5);
					var10 = true;
				}

				if (var6 == 0) {
					++var4;
				}

				if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.anInt967 == 0 || this.anInt967 == 1 && this.method22(-238, var8))) {
					if (var3 > var7 - 14 && var3 <= var7 && !var8.equals(aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657)) {
						if (this.anInt866 >= 1) {
							this.aStringArray1114[this.anInt980] = "Report abuse @whi@" + var8;
							this.anIntArray1193[this.anInt980] = 524;
							++this.anInt980;
						}

						this.aStringArray1114[this.anInt980] = "Add ignore @whi@" + var8;
						this.anIntArray1193[this.anInt980] = 47;
						++this.anInt980;
						this.aStringArray1114[this.anInt980] = "Add friend @whi@" + var8;
						this.anIntArray1193[this.anInt980] = 605;
						++this.anInt980;
					}

					++var4;
				}

				if ((var6 == 3 || var6 == 7) && this.anInt1074 == 0 && (var6 == 7 || this.anInt972 == 0 || this.anInt972 == 1 && this.method22(-238, var8))) {
					if (var3 > var7 - 14 && var3 <= var7) {
						if (this.anInt866 >= 1) {
							this.aStringArray1114[this.anInt980] = "Report abuse @whi@" + var8;
							this.anIntArray1193[this.anInt980] = 524;
							++this.anInt980;
						}

						this.aStringArray1114[this.anInt980] = "Add ignore @whi@" + var8;
						this.anIntArray1193[this.anInt980] = 47;
						++this.anInt980;
						this.aStringArray1114[this.anInt980] = "Add friend @whi@" + var8;
						this.anIntArray1193[this.anInt980] = 605;
						++this.anInt980;
					}

					++var4;
				}

				if (var6 == 4 && (this.anInt805 == 0 || this.anInt805 == 1 && this.method22(-238, var8))) {
					if (var3 > var7 - 14 && var3 <= var7) {
						this.aStringArray1114[this.anInt980] = "Accept trade @whi@" + var8;
						this.anIntArray1193[this.anInt980] = 507;
						++this.anInt980;
					}

					++var4;
				}

				if ((var6 == 5 || var6 == 6) && this.anInt1074 == 0 && this.anInt972 < 2) {
					++var4;
				}

				if (var6 == 8 && (this.anInt805 == 0 || this.anInt805 == 1 && this.method22(-238, var8))) {
					if (var3 > var7 - 14 && var3 <= var7) {
						this.aStringArray1114[this.anInt980] = "Accept duel @whi@" + var8;
						this.anIntArray1193[this.anInt980] = 957;
						++this.anInt980;
					}

					++var4;
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "814"
	)
	public void method106() {
		this.aBoolean971 = true;

		for (int var1 = 0; var1 < 7; ++var1) {
			this.anIntArray810[var1] = -1;

			for (int var2 = 0; var2 < Class22.anInt454; ++var2) {
				if (!Class22.aClass22Array455[var2].aBoolean461 && Class22.aClass22Array455[var2].anInt456 == var1 + (this.aBoolean982 ? 0 : 7)) {
					this.anIntArray810[var1] = var2;
					break;
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method115() {
		this.anInt1090 = 0;

		int var1;
		int var3;
		int var5;
		for (var1 = -1; var1 < this.anInt1121 + this.anInt1260; ++var1) {
			Object var2;
			if (var1 == -1) {
				var2 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
			} else if (var1 < this.anInt1121) {
				var2 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var1]];
			} else {
				var2 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anIntArray1261[var1 - this.anInt1121]];
			}

			if (var2 != null && ((Class44_Sub3_Sub4_Sub6)var2).method532()) {
				if (var1 >= this.anInt1121) {
					Class12 var12 = ((Class44_Sub3_Sub4_Sub6_Sub2)var2).aClass12_1682;
					if (var12.anInt304 >= 0 && var12.anInt304 < this.aClass44_Sub3_Sub1_Sub2Array1001.length) {
						this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645 + 15);
						if (this.anInt999 > -1) {
							this.aClass44_Sub3_Sub1_Sub2Array1001[var12.anInt304].method440(this.aByte1070, this.anInt999 - 12, this.anInt1000 - 30);
						}
					}

					if (this.anInt1200 == 1 && this.anIntArray1261[var1 - this.anInt1121] == this.anInt920 && tick % 20 < 10) {
						this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645 + 15);
						if (this.anInt999 > -1) {
							this.aClass44_Sub3_Sub1_Sub2Array1001[2].method440(this.aByte1070, this.anInt999 - 12, this.anInt1000 - 28);
						}
					}
				} else {
					var3 = 30;
					Class44_Sub3_Sub4_Sub6_Sub1 var4 = (Class44_Sub3_Sub4_Sub6_Sub1)var2;
					if (var4.anInt1660 != 0) {
						this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645 + 15);
						if (this.anInt999 > -1) {
							for (var5 = 0; var5 < 8; ++var5) {
								if ((var4.anInt1660 & 1 << var5) != 0) {
									this.aClass44_Sub3_Sub1_Sub2Array1001[var5].method440(this.aByte1070, this.anInt999 - 12, this.anInt1000 - var3);
									var3 -= 25;
								}
							}
						}
					}

					if (var1 >= 0 && this.anInt1200 == 10 && this.anInt1181 == this.anIntArray1122[var1]) {
						this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645 + 15);
						if (this.anInt999 > -1) {
							this.aClass44_Sub3_Sub1_Sub2Array1001[7].method440(this.aByte1070, this.anInt999 - 12, this.anInt1000 - var3);
						}
					}
				}

				if (((Class44_Sub3_Sub4_Sub6)var2).aString1611 != null && (var1 >= this.anInt1121 || this.anInt967 == 0 || this.anInt967 == 3 || this.anInt967 == 1 && this.method22(-238, ((Class44_Sub3_Sub4_Sub6_Sub1)var2).aString1657))) {
					this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645);
					if (this.anInt999 > -1 && this.anInt1090 < this.anInt1091) {
						this.anIntArray1095[this.anInt1090] = this.aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, ((Class44_Sub3_Sub4_Sub6)var2).aString1611) / 2;
						this.anIntArray1094[this.anInt1090] = this.aClass44_Sub3_Sub1_Sub4_1077.anInt1464;
						this.anIntArray1092[this.anInt1090] = this.anInt999;
						this.anIntArray1093[this.anInt1090] = this.anInt1000;
						this.anIntArray1096[this.anInt1090] = ((Class44_Sub3_Sub4_Sub6)var2).anInt1613;
						this.anIntArray1097[this.anInt1090] = ((Class44_Sub3_Sub4_Sub6)var2).anInt1614;
						this.anIntArray1098[this.anInt1090] = ((Class44_Sub3_Sub4_Sub6)var2).anInt1612;
						this.aStringArray1099[this.anInt1090++] = ((Class44_Sub3_Sub4_Sub6)var2).aString1611;
						if (this.anInt1061 == 0 && ((Class44_Sub3_Sub4_Sub6)var2).anInt1614 == 1) {
							int[] var10000 = this.anIntArray1094;
							int var10001 = this.anInt1090;
							var10000[var10001] += 10;
							var10000 = this.anIntArray1093;
							var10001 = this.anInt1090;
							var10000[var10001] += 5;
						}

						if (this.anInt1061 == 0 && ((Class44_Sub3_Sub4_Sub6)var2).anInt1614 == 2) {
							this.anIntArray1095[this.anInt1090] = 60;
						}
					}
				}

				if (((Class44_Sub3_Sub4_Sub6)var2).anInt1618 > tick) {
					this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645 + 15);
					if (this.anInt999 > -1) {
						var3 = ((Class44_Sub3_Sub4_Sub6)var2).anInt1619 * 30 / ((Class44_Sub3_Sub4_Sub6)var2).anInt1620;
						if (var3 > 30) {
							var3 = 30;
						}

						DrawingArea.method411(5, 65280, var3, this.anInt999 - 15, 0, this.anInt1000 - 3);
						DrawingArea.method411(5, 16711680, 30 - var3, var3 + (this.anInt999 - 15), 0, this.anInt1000 - 3);
					}
				}

				for (var3 = 0; var3 < 4; ++var3) {
					if (((Class44_Sub3_Sub4_Sub6)var2).anIntArray1617[var3] > tick) {
						this.method29((Class44_Sub3_Sub4_Sub6)var2, -213, ((Class44_Sub3_Sub4_Sub6)var2).anInt1645 / 2);
						if (this.anInt999 > -1) {
							if (var3 == 1) {
								this.anInt1000 -= 20;
							}

							if (var3 == 2) {
								this.anInt999 -= 15;
								this.anInt1000 -= 10;
							}

							if (var3 == 3) {
								this.anInt999 += 15;
								this.anInt1000 -= 10;
							}

							this.aClass44_Sub3_Sub1_Sub2Array935[((Class44_Sub3_Sub4_Sub6)var2).anIntArray1616[var3]].method440(this.aByte1070, this.anInt999 - 12, this.anInt1000 - 12);
							this.aClass44_Sub3_Sub1_Sub4_1075.method455(this.anInt999, this.anInt1000 + 4, 0, String.valueOf(((Class44_Sub3_Sub4_Sub6)var2).anIntArray1615[var3]));
							this.aClass44_Sub3_Sub1_Sub4_1075.method455(this.anInt999 - 1, this.anInt1000 + 3, 16777215, String.valueOf(((Class44_Sub3_Sub4_Sub6)var2).anIntArray1615[var3]));
						}
					}
				}
			}
		}

		for (var1 = 0; var1 < this.anInt1090; ++var1) {
			int var11 = this.anIntArray1092[var1];
			var3 = this.anIntArray1093[var1];
			int var13 = this.anIntArray1095[var1];
			var5 = this.anIntArray1094[var1];
			boolean var6 = true;

			while (var6) {
				var6 = false;

				for (int var7 = 0; var7 < var1; ++var7) {
					if (var3 + 2 > this.anIntArray1093[var7] - this.anIntArray1094[var7] && var3 - var5 < this.anIntArray1093[var7] + 2 && var11 - var13 < this.anIntArray1092[var7] + this.anIntArray1095[var7] && var11 + var13 > this.anIntArray1092[var7] - this.anIntArray1095[var7] && this.anIntArray1093[var7] - this.anIntArray1094[var7] < var3) {
						var3 = this.anIntArray1093[var7] - this.anIntArray1094[var7];
						var6 = true;
					}
				}
			}

			this.anInt999 = this.anIntArray1092[var1];
			this.anInt1000 = this.anIntArray1093[var1] = var3;
			String var14 = this.aStringArray1099[var1];
			if (this.anInt1061 == 0) {
				int var8 = 16776960;
				if (this.anIntArray1096[var1] < 6) {
					var8 = this.anIntArray985[this.anIntArray1096[var1]];
				}

				if (this.anIntArray1096[var1] == 6) {
					var8 = this.anInt868 % 20 >= 10 ? 16776960 : 16711680;
				}

				if (this.anIntArray1096[var1] == 7) {
					var8 = this.anInt868 % 20 >= 10 ? '\uffff' : 255;
				}

				if (this.anIntArray1096[var1] == 8) {
					var8 = this.anInt868 % 20 >= 10 ? 8454016 : 45056;
				}

				int var9;
				if (this.anIntArray1096[var1] == 9) {
					var9 = 150 - this.anIntArray1098[var1];
					if (var9 < 50) {
						var8 = var9 * 1280 + 16711680;
					} else if (var9 < 100) {
						var8 = 16776960 - (var9 - 50) * 327680;
					} else if (var9 < 150) {
						var8 = (var9 - 100) * 5 + 65280;
					}
				}

				if (this.anIntArray1096[var1] == 10) {
					var9 = 150 - this.anIntArray1098[var1];
					if (var9 < 50) {
						var8 = var9 * 5 + 16711680;
					} else if (var9 < 100) {
						var8 = 16711935 - (var9 - 50) * 327680;
					} else if (var9 < 150) {
						var8 = (var9 - 100) * 327680 + 255 - (var9 - 100) * 5;
					}
				}

				if (this.anIntArray1096[var1] == 11) {
					var9 = 150 - this.anIntArray1098[var1];
					if (var9 < 50) {
						var8 = 16777215 - var9 * 327685;
					} else if (var9 < 100) {
						var8 = (var9 - 50) * 327685 + 65280;
					} else if (var9 < 150) {
						var8 = 16777215 - (var9 - 100) * 327680;
					}
				}

				if (this.anIntArray1097[var1] == 0) {
					this.aClass44_Sub3_Sub1_Sub4_1077.method455(this.anInt999, this.anInt1000 + 1, 0, var14);
					this.aClass44_Sub3_Sub1_Sub4_1077.method455(this.anInt999, this.anInt1000, var8, var14);
				}

				if (this.anIntArray1097[var1] == 1) {
					this.aClass44_Sub3_Sub1_Sub4_1077.method459(var14, this.anInt1000 + 1, this.anInt999, 0, 6, this.anInt868);
					this.aClass44_Sub3_Sub1_Sub4_1077.method459(var14, this.anInt1000, this.anInt999, var8, 6, this.anInt868);
				}

				if (this.anIntArray1097[var1] == 2) {
					var9 = this.aClass44_Sub3_Sub1_Sub4_1077.method457(-43341, var14);
					int var10 = (150 - this.anIntArray1098[var1]) * (var9 + 100) / 150;
					DrawingArea.method408(5, 334, this.anInt999 + 50, this.anInt999 - 50, 0);
					this.aClass44_Sub3_Sub1_Sub4_1077.method458(this.anInt999 + 50 - var10, var14, 0, this.anInt1000 + 1);
					this.aClass44_Sub3_Sub1_Sub4_1077.method458(this.anInt999 + 50 - var10, var14, var8, this.anInt1000);
					DrawingArea.method407();
				}
			} else {
				this.aClass44_Sub3_Sub1_Sub4_1077.method455(this.anInt999, this.anInt1000 + 1, 0, var14);
				this.aClass44_Sub3_Sub1_Sub4_1077.method455(this.anInt999, this.anInt1000, 16776960, var14);
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "6905"
	)
	public void method126() {
		if (this.anInt1200 == 2) {
			this.method30(361, (this.anInt1162 - this.anInt1055 << 7) + this.anInt1165, (this.anInt1163 - this.anInt1056 << 7) + this.anInt1166, this.anInt1164 * 2);
			if (this.anInt999 > -1 && tick % 20 < 10) {
				this.aClass44_Sub3_Sub1_Sub2Array1001[2].method440(this.aByte1070, this.anInt999 - 12, this.anInt1000 - 28);
			}

		}
	}

	public void method57(int var1, int var2) {
		var2 = 49 / var2;
		if (!isLowMemory) {
			Class44_Sub3_Sub1_Sub3 var3;
			int var4;
			int var5;
			byte[] var6;
			byte[] var7;
			int var8;
			if (Class44_Sub3_Sub1_Sub1.anIntArray1417[17] >= var1) {
				var3 = Class44_Sub3_Sub1_Sub1.aClass44_Sub3_Sub1_Sub3Array1411[17];
				var4 = var3.anInt1447 * var3.anInt1448 - 1;
				var5 = var3.anInt1447 * this.anInt975 * 2;
				var6 = var3.aByteArray1445;
				var7 = this.aByteArray1088;

				for (var8 = 0; var8 <= var4; ++var8) {
					var7[var8] = var6[var8 - var5 & var4];
				}

				var3.aByteArray1445 = var7;
				this.aByteArray1088 = var6;
				Class44_Sub3_Sub1_Sub1.method425(17);
			}

			if (Class44_Sub3_Sub1_Sub1.anIntArray1417[24] >= var1) {
				var3 = Class44_Sub3_Sub1_Sub1.aClass44_Sub3_Sub1_Sub3Array1411[24];
				var4 = var3.anInt1447 * var3.anInt1448 - 1;
				var5 = var3.anInt1447 * this.anInt975 * 2;
				var6 = var3.aByteArray1445;
				var7 = this.aByteArray1088;

				for (var8 = 0; var8 <= var4; ++var8) {
					var7[var8] = var6[var8 - var5 & var4];
				}

				var3.aByteArray1445 = var7;
				this.aByteArray1088 = var6;
				Class44_Sub3_Sub1_Sub1.method425(24);
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "31037"
	)
	public void method18() {
		this.method74();
		if (this.anInt1145 == 1) {
			this.aClass44_Sub3_Sub1_Sub2Array1215[this.anInt1144 / 100].method440(this.aByte1070, this.anInt1142 - 8 - 4, this.anInt1143 - 8 - 4);
		}

		if (this.anInt1145 == 2) {
			this.aClass44_Sub3_Sub1_Sub2Array1215[this.anInt1144 / 100 + 4].method440(this.aByte1070, this.anInt1142 - 8 - 4, this.anInt1143 - 8 - 4);
			++anInt1101;
			if (anInt1101 > 57) {
				anInt1101 = 0;
				this.aBuffer_843.writeOpcode(100);
			}
		}

		if (this.anInt1103 != -1) {
			this.method14(this.anInt975, 753, this.anInt1103);
			this.method127(0, Class5.aClass5Array103[this.anInt1103], 0, 0, (byte)0);
		}

		if (this.anInt1037 != -1) {
			this.method14(this.anInt975, 753, this.anInt1037);
			this.method127(0, Class5.aClass5Array103[this.anInt1037], 0, 0, (byte)0);
		}

		this.method107();
		if (!this.aBoolean851) {
			this.method68();
			this.method31();
		} else if (this.anInt1254 == 0) {
			this.method15();
		}

		if (this.anInt818 == 1) {
			this.aClass44_Sub3_Sub1_Sub2Array1001[1].method440(this.aByte1070, 472, 296);
		}

		if (this.anInt803 != 0) {
			int var1 = this.anInt803 / 50;
			int var2 = var1 / 60;
			var1 %= 60;
			if (var1 < 10) {
				this.aClass44_Sub3_Sub1_Sub4_1076.method458(4, "System update in: " + var2 + ":0" + var1, 16776960, 329);
				return;
			}

			this.aClass44_Sub3_Sub1_Sub4_1076.method458(4, "System update in: " + var2 + ":" + var1, 16776960, 329);
		}

	}

	public String method26(byte var1, int var2) {
		if (this.aByte959 != var1) {
			this.startup();
		}

		return var2 < 999999999 ? String.valueOf(var2) : "*";
	}

	public void method67(int var1, int var2, Buffer var3) {
		var2 = 58 / var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var1 != 138 && var1 != 173) {
			int var12;
			int var13;
			int var14;
			int var35;
			if (var1 == 48) {
				var4 = var3.readUByte();
				var5 = (var4 >> 4 & 7) + this.anInt918;
				var6 = (var4 & 7) + this.anInt919;
				var7 = var3.readUByte();
				var8 = var7 >> 2;
				var9 = var7 & 3;
				var10 = this.anIntArray973[var8];
				var11 = var3.readUShort();
				if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
					var12 = this.anIntArrayArrayArray957[this.clientPlane][var5][var6];
					var13 = this.anIntArrayArrayArray957[this.clientPlane][var5 + 1][var6];
					var14 = this.anIntArrayArrayArray957[this.clientPlane][var5 + 1][var6 + 1];
					var35 = this.anIntArrayArrayArray957[this.clientPlane][var5][var6 + 1];
					if (var10 == 0) {
						Class33 var37 = this.worldController.method300((byte)-31, var6, this.clientPlane, var5);
						if (var37 != null) {
							int var41 = var37.anInt567 >> 14 & 32767;
							if (var8 == 2) {
								var37.aRenderable_565 = new GameObject(2, var9 + 4, var11, var41, var14, this.anInt907, false, var13, var35, var12);
								var37.aRenderable_566 = new GameObject(2, var9 + 1 & 3, var11, var41, var14, this.anInt907, false, var13, var35, var12);
							} else {
								var37.aRenderable_565 = new GameObject(var8, var9, var11, var41, var14, this.anInt907, false, var13, var35, var12);
							}
						}
					}

					if (var10 == 1) {
						Class13 var38 = this.worldController.method301(var5, (byte)1, this.clientPlane, var6);
						if (var38 != null) {
							var38.aRenderable_312 = new GameObject(4, 0, var11, var38.anInt313 >> 14 & 32767, var14, this.anInt907, false, var13, var35, var12);
						}
					}

					if (var10 == 2) {
						Class30 var39 = this.worldController.method302(var5, this.clientPlane, this.aBoolean881, var6);
						if (var8 == 11) {
							var8 = 10;
						}

						if (var39 != null) {
							var39.aRenderable_532 = new GameObject(var8, var9, var11, var39.anInt540 >> 14 & 32767, var14, this.anInt907, false, var13, var35, var12);
						}
					}

					if (var10 == 3) {
						Class17 var42 = this.worldController.method303(var5, this.clientPlane, var6);
						if (var42 != null) {
							var42.aRenderable_397 = new GameObject(22, var9, var11, var42.anInt398 >> 14 & 32767, var14, this.anInt907, false, var13, var35, var12);
						}
					}
				}

			} else {
				Class44_Sub3_Sub4_Sub2 var31;
				if (var1 == 81) {
					var4 = var3.readUByte();
					var5 = (var4 >> 4 & 7) + this.anInt918;
					var6 = (var4 & 7) + this.anInt919;
					var7 = var3.readUShort();
					var8 = var3.readUShort();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var31 = new Class44_Sub3_Sub4_Sub2();
						var31.anInt1480 = var7;
						var31.anInt1481 = var8;
						if (this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6] == null) {
							this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6] = new Class28(-822);
						}

						this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6].method256(var31);
						this.method52(var5, var6);
					}

				} else if (var1 == 52) {
					var4 = var3.readUByte();
					var5 = (var4 >> 4 & 7) + this.anInt918;
					var6 = (var4 & 7) + this.anInt919;
					var7 = var3.readUShort();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						Class28 var29 = this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6];
						if (var29 != null) {
							for (var31 = (Class44_Sub3_Sub4_Sub2)var29.peekFront(); var31 != null; var31 = (Class44_Sub3_Sub4_Sub2)var29.getPrevious(this.aByte958)) {
								if ((var7 & 32767) == var31.anInt1480) {
									var31.removeNode();
									break;
								}
							}

							if (var29.peekFront() == null) {
								this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6] = null;
							}

							this.method52(var5, var6);
						}
					}

				} else if (var1 == 107) {
					var4 = var3.readUByte();
					var5 = (var4 >> 4 & 7) + this.anInt918;
					var6 = (var4 & 7) + this.anInt919;
					var7 = var5 + var3.readByte();
					var8 = var6 + var3.readByte();
					var9 = var3.readShort();
					var10 = var3.readUShort();
					var11 = var3.readUByte() * 4;
					var12 = var3.readUByte() * 4;
					var13 = var3.readUShort();
					var14 = var3.readUShort();
					var35 = var3.readUByte();
					int var36 = var3.readUByte();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var5 = var5 * 128 + 64;
						var6 = var6 * 128 + 64;
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						Class44_Sub3_Sub4_Sub3 var40 = new Class44_Sub3_Sub4_Sub3(var5, var36, var12, var14 + tick, var35, var13 + tick, this.clientPlane, var10, this.aBoolean930, this.method50(var5, var6, 0, this.clientPlane) - var11, var9, var6);
						var40.method497(var13 + tick, this.method50(var7, var8, 0, this.clientPlane) - var12, var7, (byte)7, var8);
						this.aClass28_1156.method256(var40);
					}

				} else if (var1 == 85) {
					var4 = var3.readUByte();
					var5 = (var4 >> 4 & 7) + this.anInt918;
					var6 = (var4 & 7) + this.anInt919;
					var7 = var3.readUShort();
					var8 = var3.readUByte();
					var9 = var3.readUShort();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var5 = var5 * 128 + 64;
						var6 = var6 * 128 + 64;
						Class44_Sub3_Sub4_Sub5 var33 = new Class44_Sub3_Sub4_Sub5(var9, var6, var5, this.clientPlane, 0, this.method50(var5, var6, 0, this.clientPlane) - var8, var7, tick);
						this.aClass28_924.method256(var33);
					}

				} else if (var1 == 219) {
					var4 = var3.readUByte();
					var5 = (var4 >> 4 & 7) + this.anInt918;
					var6 = (var4 & 7) + this.anInt919;
					var7 = var3.readUShort();
					var8 = var3.readUShort();
					var9 = var3.readUShort();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var9 != this.anInt947) {
						Class44_Sub3_Sub4_Sub2 var32 = new Class44_Sub3_Sub4_Sub2();
						var32.anInt1480 = var7;
						var32.anInt1481 = var8;
						if (this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6] == null) {
							this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6] = new Class28(-822);
						}

						this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6].method256(var32);
						this.method52(var5, var6);
					}

				} else {
					if (var1 == 176) {
						var4 = var3.readUByte();
						var5 = (var4 >> 4 & 7) + this.anInt918;
						var6 = (var4 & 7) + this.anInt919;
						var7 = var3.readUByte();
						var8 = var7 >> 2;
						var9 = var7 & 3;
						var10 = this.anIntArray973[var8];
						var11 = var3.readUShort();
						var12 = var3.readUShort();
						var13 = var3.readUShort();
						var14 = var3.readUShort();
						byte var15 = var3.readByte();
						byte var16 = var3.readByte();
						byte var17 = var3.readByte();
						byte var18 = var3.readByte();
						Class44_Sub3_Sub4_Sub6_Sub1 var19;
						if (var14 == this.anInt947) {
							var19 = aClass44_Sub3_Sub4_Sub6_Sub1_1252;
						} else {
							var19 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var14];
						}

						if (var19 != null) {
							GameObjectDefinition var20 = GameObjectDefinition.get(var11);
							int var21 = this.anIntArrayArrayArray957[this.clientPlane][var5][var6];
							int var22 = this.anIntArrayArrayArray957[this.clientPlane][var5 + 1][var6];
							int var23 = this.anIntArrayArrayArray957[this.clientPlane][var5 + 1][var6 + 1];
							int var24 = this.anIntArrayArrayArray957[this.clientPlane][var5][var6 + 1];
							Model var25 = var20.getModel(var8, var9, var21, var22, var23, var24, -1);
							if (var25 != null) {
								this.method82(var6, 4823, var13 + 1, -1, this.clientPlane, 0, var5, var10, 0, var12 + 1);
								var19.anInt1667 = var12 + tick;
								var19.anInt1668 = var13 + tick;
								var19.aModel_1672 = var25;
								int var26 = var20.sizeX;
								int var27 = var20.sizeY;
								if (var9 == 1 || var9 == 3) {
									var26 = var20.sizeY;
									var27 = var20.sizeX;
								}

								var19.anInt1669 = var26 * 64 + var5 * 128;
								var19.anInt1671 = var27 * 64 + var6 * 128;
								var19.anInt1670 = this.method50(var19.anInt1669, var19.anInt1671, 0, this.clientPlane);
								byte var28;
								if (var15 > var17) {
									var28 = var15;
									var15 = var17;
									var17 = var28;
								}

								if (var16 > var18) {
									var28 = var16;
									var16 = var18;
									var18 = var28;
								}

								var19.anInt1673 = var5 + var15;
								var19.anInt1675 = var5 + var17;
								var19.anInt1674 = var6 + var16;
								var19.anInt1676 = var6 + var18;
							}
						}
					}

					if (var1 == 95) {
						var4 = var3.readUByte();
						var5 = (var4 >> 4 & 7) + this.anInt918;
						var6 = (var4 & 7) + this.anInt919;
						var7 = var3.readUShort();
						var8 = var3.readUShort();
						var9 = var3.readUShort();
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							Class28 var30 = this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6];
							if (var30 != null) {
								for (Class44_Sub3_Sub4_Sub2 var34 = (Class44_Sub3_Sub4_Sub2)var30.peekFront(); var34 != null; var34 = (Class44_Sub3_Sub4_Sub2)var30.getPrevious(this.aByte958)) {
									if ((var7 & 32767) == var34.anInt1480 && var8 == var34.anInt1481) {
										var34.anInt1481 = var9;
										break;
									}
								}

								this.method52(var5, var6);
							}
						}
					}

				}
			}
		} else {
			var4 = var3.readUByte();
			var5 = (var4 >> 4 & 7) + this.anInt918;
			var6 = (var4 & 7) + this.anInt919;
			var7 = var3.readUByte();
			var8 = var7 >> 2;
			var9 = var7 & 3;
			var10 = this.anIntArray973[var8];
			if (var1 == 173) {
				var11 = -1;
			} else {
				var11 = var3.readUShort();
			}

			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				this.method82(var6, 4823, -1, var11, this.clientPlane, var9, var5, var10, var8, 0);
			}

		}
	}

	public void method40(boolean var1, int var2) {
		int var3 = Class38.aClass38Array660[var2].anInt668;
		if (var3 != 0) {
			int var4 = this.anIntArray1107[var2];
			if (var3 == 1) {
				if (var4 == 1) {
					Class44_Sub3_Sub1_Sub1.method427(-42222, 0.9D);
				}

				if (var4 == 2) {
					Class44_Sub3_Sub1_Sub1.method427(-42222, 0.8D);
				}

				if (var4 == 3) {
					Class44_Sub3_Sub1_Sub1.method427(-42222, 0.7D);
				}

				if (var4 == 4) {
					Class44_Sub3_Sub1_Sub1.method427(-42222, 0.6D);
				}

				Class14.aClass39_365.method341();
				this.aBoolean917 = true;
			}

			if (var3 == 3) {
				boolean var5 = this.aBoolean1069;
				if (var4 == 0) {
					this.method109(0, this.aBoolean1069, 0);
					this.aBoolean1069 = true;
				}

				if (var4 == 1) {
					this.method109(0, this.aBoolean1069, -400);
					this.aBoolean1069 = true;
				}

				if (var4 == 2) {
					this.method109(0, this.aBoolean1069, -800);
					this.aBoolean1069 = true;
				}

				if (var4 == 3) {
					this.method109(0, this.aBoolean1069, -1200);
					this.aBoolean1069 = true;
				}

				if (var4 == 4) {
					this.aBoolean1069 = false;
				}

				if (var5 != this.aBoolean1069 && !isLowMemory) {
					if (this.aBoolean1069) {
						this.anInt1183 = this.anInt1030;
						this.aBoolean1184 = true;
						this.aClass43_Sub1_1015.method392(2, this.anInt1183);
					} else {
						this.method78();
					}

					this.anInt927 = 0;
				}
			}

			if (var3 == 4) {
				if (var4 == 0) {
					this.aBoolean1080 = true;
					this.method20(678, 0);
				}

				if (var4 == 1) {
					this.aBoolean1080 = true;
					this.method20(678, -400);
				}

				if (var4 == 2) {
					this.aBoolean1080 = true;
					this.method20(678, -800);
				}

				if (var4 == 3) {
					this.aBoolean1080 = true;
					this.method20(678, -1200);
				}

				if (var4 == 4) {
					this.aBoolean1080 = false;
				}
			}

			if (var3 == 5) {
				this.anInt1049 = var4;
			}

			if (var3 == 6) {
				this.anInt1061 = var4;
			}

			if (var3 == 8) {
				this.anInt1074 = var4;
				this.aBoolean1109 = true;
			}

			if (var3 == 9) {
				this.anInt882 = var4;
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	public void method63() {
		this.aComponentImageProducer_865.initDrawingArea();
		Class44_Sub3_Sub1_Sub1.anIntArray1409 = this.anIntArray1243;
		this.aClass44_Sub3_Sub1_Sub3_1203.method453(this.aByte1070, 0, 0);
		if (this.aBoolean1265) {
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(239, 40, 0, this.aString1019);
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(239, 60, 128, this.aString984 + "*");
		} else if (this.aBoolean1104) {
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(239, 40, 0, "Enter amount:");
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(239, 60, 128, this.aString1182 + "*");
		} else if (this.aString829 != null) {
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(239, 40, 0, this.aString829);
			this.aClass44_Sub3_Sub1_Sub4_1077.method455(239, 60, 128, "Click to continue");
		} else if (this.anInt1011 != -1) {
			this.method127(0, Class5.aClass5Array103[this.anInt1011], 0, 0, (byte)0);
		} else if (this.anInt1110 != -1) {
			this.method127(0, Class5.aClass5Array103[this.anInt1110], 0, 0, (byte)0);
		} else {
			Class44_Sub3_Sub1_Sub4 var1 = this.aClass44_Sub3_Sub1_Sub4_1076;
			int var2 = 0;
			DrawingArea.method408(5, 77, 463, 0, 0);

			for (int var3 = 0; var3 < 100; ++var3) {
				if (this.aStringArray950[var3] != null) {
					int var4 = this.anIntArray948[var3];
					int var5 = 70 - var2 * 14 + this.anInt1082;
					String var6 = this.aStringArray949[var3];
					byte var7 = 0;
					if (var6 != null && var6.startsWith("@cr1@")) {
						var6 = var6.substring(5);
						var7 = 1;
					}

					if (var6 != null && var6.startsWith("@cr2@")) {
						var6 = var6.substring(5);
						var7 = 2;
					}

					if (var4 == 0) {
						if (var5 > 0 && var5 < 110) {
							var1.method458(4, this.aStringArray950[var3], 0, var5);
						}

						++var2;
					}

					int var8;
					if ((var4 == 1 || var4 == 2) && (var4 == 1 || this.anInt967 == 0 || this.anInt967 == 1 && this.method22(-238, var6))) {
						if (var5 > 0 && var5 < 110) {
							var8 = 4;
							if (var7 == 1) {
								this.aClass44_Sub3_Sub1_Sub3Array914[0].method453(this.aByte1070, var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								this.aClass44_Sub3_Sub1_Sub3Array914[1].method453(this.aByte1070, var8, var5 - 12);
								var8 += 14;
							}

							var1.method458(var8, var6 + ":", 0, var5);
							var8 += var1.method457(-43341, var6) + 8;
							var1.method458(var8, this.aStringArray950[var3], 255, var5);
						}

						++var2;
					}

					if ((var4 == 3 || var4 == 7) && this.anInt1074 == 0 && (var4 == 7 || this.anInt972 == 0 || this.anInt972 == 1 && this.method22(-238, var6))) {
						if (var5 > 0 && var5 < 110) {
							byte var10 = 4;
							var1.method458(var10, "From", 0, var5);
							var8 = var10 + var1.method457(-43341, "From ");
							if (var7 == 1) {
								this.aClass44_Sub3_Sub1_Sub3Array914[0].method453(this.aByte1070, var8, var5 - 12);
								var8 += 14;
							}

							if (var7 == 2) {
								this.aClass44_Sub3_Sub1_Sub3Array914[1].method453(this.aByte1070, var8, var5 - 12);
								var8 += 14;
							}

							var1.method458(var8, var6 + ":", 0, var5);
							var8 += var1.method457(-43341, var6) + 8;
							var1.method458(var8, this.aStringArray950[var3], 8388608, var5);
						}

						++var2;
					}

					if (var4 == 4 && (this.anInt805 == 0 || this.anInt805 == 1 && this.method22(-238, var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method458(4, var6 + " " + this.aStringArray950[var3], 8388736, var5);
						}

						++var2;
					}

					if (var4 == 5 && this.anInt1074 == 0 && this.anInt972 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method458(4, this.aStringArray950[var3], 8388608, var5);
						}

						++var2;
					}

					if (var4 == 6 && this.anInt1074 == 0 && this.anInt972 < 2) {
						if (var5 > 0 && var5 < 110) {
							var1.method458(4, "To " + var6 + ":", 0, var5);
							var1.method458(12 + var1.method457(-43341, "To " + var6), this.aStringArray950[var3], 8388608, var5);
						}

						++var2;
					}

					if (var4 == 8 && (this.anInt805 == 0 || this.anInt805 == 1 && this.method22(-238, var6))) {
						if (var5 > 0 && var5 < 110) {
							var1.method458(4, var6 + " " + this.aStringArray950[var3], 8270336, var5);
						}

						++var2;
					}
				}
			}

			DrawingArea.method407();
			this.anInt931 = var2 * 14 + 7;
			if (this.anInt931 < 78) {
				this.anInt931 = 78;
			}

			this.method56(this.anInt931 - this.anInt1082 - 77, 0, this.anInt931, (byte)123, 463, 77);
			String var9;
			if (aClass44_Sub3_Sub4_Sub6_Sub1_1252 != null && aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657 != null) {
				var9 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657;
			} else {
				var9 = Class48.method551(131, this.aString1147);
			}

			var1.method458(4, var9 + ":", 0, 90);
			var1.method458(6 + var1.method457(-43341, var9 + ": "), this.aString1009 + "*", 255, 90);
			DrawingArea.method414(479, 0, 0, (byte)125, 77);
		}

		if (this.aBoolean851 && this.anInt1254 == 2) {
			this.method15();
		}

		this.aComponentImageProducer_865.drawComponentImage(super.graphics, 17, 357);
		this.componentImageProducer.initDrawingArea();
		Class44_Sub3_Sub1_Sub1.anIntArray1409 = this.anIntArray1245;
	}

	public void method103(byte var1) {
		this.aComponentImageProducer_863.initDrawingArea();
		int var4;
		int var5;
		if (this.anInt1031 == 2) {
			byte[] var14 = this.aClass44_Sub3_Sub1_Sub3_1202.aByteArray1445;
			int[] var15 = DrawingArea.anIntArray1351;
			var4 = var14.length;

			for (var5 = 0; var5 < var4; ++var5) {
				if (var14[var5] == 0) {
					var15[var5] = 0;
				}
			}

			this.aClass44_Sub3_Sub1_Sub2_1085.method444(256, 25, 33, 33, 0, this.anIntArray1054, 25, this.anIntArray883, -582, this.anInt1206, 0);
			this.componentImageProducer.initDrawingArea();
		} else {
			int var2 = this.anInt1206 + this.anInt1217 & 2047;
			int var3 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32 + 48;
			var4 = 464 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
			this.aClass44_Sub3_Sub1_Sub2_1027.method444(this.anInt1170 + 256, var3, 146, 151, 25, this.anIntArray1150, var4, this.anIntArray1136, -582, var2, 5);
			if (this.aByte798 == var1) {
				boolean var13 = false;
				this.aClass44_Sub3_Sub1_Sub2_1085.method444(256, 25, 33, 33, 0, this.anIntArray1054, 25, this.anIntArray883, -582, this.anInt1206, 0);

				int var6;
				int var7;
				for (var5 = 0; var5 < this.anInt987; ++var5) {
					var6 = this.anIntArray988[var5] * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
					var7 = this.anIntArray989[var5] * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
					this.method33(var7, var6, (byte)-111, this.aClass44_Sub3_Sub1_Sub2Array1204[var5]);
				}

				int var8;
				for (var5 = 0; var5 < 104; ++var5) {
					for (var6 = 0; var6 < 104; ++var6) {
						Class28 var17 = this.aClass28ArrayArrayArray816[this.clientPlane][var5][var6];
						if (var17 != null) {
							var8 = var5 * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
							int var9 = var6 * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
							this.method33(var9, var8, (byte)-111, this.aClass44_Sub3_Sub1_Sub2_1187);
						}
					}
				}

				for (var5 = 0; var5 < this.anInt1260; ++var5) {
					Class44_Sub3_Sub4_Sub6_Sub2 var16 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anIntArray1261[var5]];
					if (var16 != null && var16.method532() && var16.aClass12_1682.aBoolean297) {
						var7 = var16.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
						var8 = var16.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
						this.method33(var8, var7, (byte)-111, this.aClass44_Sub3_Sub1_Sub2_1188);
					}
				}

				for (var5 = 0; var5 < this.anInt1121; ++var5) {
					Class44_Sub3_Sub4_Sub6_Sub1 var18 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var5]];
					if (var18 != null && var18.method532()) {
						var7 = var18.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
						var8 = var18.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
						boolean var21 = false;
						long var10 = Class48.method547(var18.aString1657);

						for (int var12 = 0; var12 < this.anInt1115; ++var12) {
							if (var10 == this.aLongArray1159[var12] && this.anIntArray1073[var12] != 0) {
								var21 = true;
								break;
							}
						}

						if (var21) {
							this.method33(var8, var7, (byte)-111, this.aClass44_Sub3_Sub1_Sub2_1190);
						} else {
							this.method33(var8, var7, (byte)-111, this.aClass44_Sub3_Sub1_Sub2_1189);
						}
					}
				}

				if (this.anInt1200 != 0 && tick % 20 < 10) {
					if (this.anInt1200 == 1 && this.anInt920 >= 0 && this.anInt920 < this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259.length) {
						Class44_Sub3_Sub4_Sub6_Sub2 var19 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anInt920];
						if (var19 != null) {
							var6 = var19.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
							var7 = var19.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
							this.method88(var6, var7, 4, this.aClass44_Sub3_Sub1_Sub2_965);
						}
					}

					if (this.anInt1200 == 2) {
						var5 = (this.anInt1162 - this.anInt1055) * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
						var6 = (this.anInt1163 - this.anInt1056) * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
						this.method88(var5, var6, 4, this.aClass44_Sub3_Sub1_Sub2_965);
					}

					if (this.anInt1200 == 10 && this.anInt1181 >= 0 && this.anInt1181 < this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120.length) {
						Class44_Sub3_Sub4_Sub6_Sub1 var20 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anInt1181];
						if (var20 != null) {
							var6 = var20.anInt1599 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
							var7 = var20.anInt1600 / 32 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
							this.method88(var6, var7, 4, this.aClass44_Sub3_Sub1_Sub2_965);
						}
					}
				}

				if (this.anInt1025 != 0) {
					var5 = this.anInt1025 * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 / 32;
					var6 = this.anInt1026 * 4 + 2 - aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 / 32;
					this.method33(var6, var5, (byte)-111, this.aClass44_Sub3_Sub1_Sub2_964);
				}

				DrawingArea.method411(3, 16777215, 3, 97, 0, 78);
				this.componentImageProducer.initDrawingArea();
			}
		}
	}

	public void method42(int var1) {
		var1 = 15 / var1;
		if (isLowMemory && this.loadingState == 2 && this.clientPlane != Class3.anInt68) {
			this.componentImageProducer.initDrawingArea();
			this.aClass44_Sub3_Sub1_Sub4_1076.method455(257, 151, 0, "Loading - please wait.");
			this.aClass44_Sub3_Sub1_Sub4_1076.method455(256, 150, 16777215, "Loading - please wait.");
			this.componentImageProducer.drawComponentImage(super.graphics, 4, 4);
			this.loadingState = 1;
			this.aLong1127 = System.currentTimeMillis();
		}

		if (this.loadingState == 1) {
			int var2 = this.method43((byte)2);
			if (var2 != 0 && System.currentTimeMillis() - this.aLong1127 > 360000L) {
				signlink.reporterror(this.aString1147 + " glcfb " + this.aLong1231 + "," + var2 + "," + isLowMemory + "," + this.aClass45Array1225[0] + "," + this.aClass43_Sub1_1015.method393() + "," + this.clientPlane + "," + this.anInt922 + "," + this.anInt923);
				this.aLong1127 = System.currentTimeMillis();
			}
		}

		if (this.loadingState == 2 && this.clientPlane != this.anInt934) {
			this.anInt934 = this.clientPlane;
			this.method79(this.clientPlane);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "42825"
	)
	public void method144() {
		if (this.loadingState == 2) {
			for (GameObjectSpawnRequest var1 = (GameObjectSpawnRequest)this.pendingObjectSpawns.peekFront(); var1 != null; var1 = (GameObjectSpawnRequest)this.pendingObjectSpawns.getPrevious(this.aByte958)) {
				if (var1.delayUntilSpawn > 0) {
					--var1.delayUntilSpawn;
				}

				if (var1.delayUntilSpawn == 0) {
					if (var1.id < 0 || Class3.isModelCached(var1.id, var1.type, 469)) {
						this.despawnGameObject(var1.anInt1315, var1.anInt1311, var1.anInt1312, var1.type, false, var1.id, var1.anInt1310, var1.anInt1313);
						var1.removeNode();
					}
				} else {
					if (var1.anInt1320 > 0) {
						--var1.anInt1320;
					}

					if (var1.anInt1320 == 0 && var1.anInt1312 >= 1 && var1.anInt1313 >= 1 && var1.anInt1312 <= 102 && var1.anInt1313 <= 102 && (var1.anInt1317 < 0 || Class3.isModelCached(var1.anInt1317, var1.anInt1319, 469))) {
						this.despawnGameObject(var1.anInt1318, var1.anInt1311, var1.anInt1312, var1.anInt1319, false, var1.anInt1317, var1.anInt1310, var1.anInt1313);
						var1.anInt1320 = -1;
						if (var1.anInt1317 == var1.id && var1.id == -1) {
							var1.removeNode();
						} else if (var1.anInt1317 == var1.id && var1.anInt1318 == var1.anInt1315 && var1.anInt1319 == var1.type) {
							var1.removeNode();
						}
					}
				}
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "0"
	)
	public void method27() {
		for (int var1 = 0; var1 < this.anInt929; ++var1) {
			if (this.anIntArray1083[var1] <= 0) {
				boolean var2 = false;

				try {
					if (this.anInt1242 == this.anIntArray1048[var1] && this.anInt1131 == this.anIntArray804[var1]) {
						if (!this.method46()) {
							var2 = true;
						}
					} else {
						Buffer var3 = Class4.method176(this.anIntArray1048[var1], this.anIntArray804[var1]);
						if (System.currentTimeMillis() + (long)(var3.offset / 22) > this.aLong1079 + (long)(this.anInt874 / 22)) {
							this.anInt874 = var3.offset;
							this.aLong1079 = System.currentTimeMillis();
							if (this.method146(var3.array, var3.offset)) {
								this.anInt1242 = this.anIntArray1048[var1];
								this.anInt1131 = this.anIntArray804[var1];
							} else {
								var2 = true;
							}
						}
					}
				} catch (Exception var4) {
				}

				if (var2 && this.anIntArray1083[var1] != -5) {
					this.anIntArray1083[var1] = -5;
				} else {
					--this.anInt929;

					for (int var5 = var1; var5 < this.anInt929; ++var5) {
						this.anIntArray1048[var5] = this.anIntArray1048[var5 + 1];
						this.anIntArray804[var5] = this.anIntArray804[var5 + 1];
						this.anIntArray1083[var5] = this.anIntArray1083[var5 + 1];
					}

					--var1;
				}
			} else {
				int var10002 = this.anIntArray1083[var1]--;
			}
		}

		if (this.anInt927 > 0) {
			this.anInt927 -= 20;
			if (this.anInt927 < 0) {
				this.anInt927 = 0;
			}

			if (this.anInt927 == 0 && this.aBoolean1069 && !isLowMemory) {
				this.anInt1183 = this.anInt1030;
				this.aBoolean1184 = true;
				this.aClass43_Sub1_1015.method392(2, this.anInt1183);
			}
		}

	}

	public void method111(int var1, byte var2, Buffer var3) {
		this.anInt1064 = 0;
		this.anInt1123 = 0;
		this.method119(var3, var1);
		this.method94(0, var3, var1);
		this.method145(var3, var1, this.anInt806);
		this.method75(var3, -45473, var1);
		if (var2 == this.aByte1087) {
			int var4;
			for (var4 = 0; var4 < this.anInt1064; ++var4) {
				int var5 = this.anIntArray1065[var4];
				if (this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var5].anInt1644 != tick) {
					this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var5] = null;
				}
			}

			if (var3.offset != var1) {
				signlink.reporterror("Error packet size mismatch in getplayer pos:" + var3.offset + " psize:" + var1);
				throw new RuntimeException("eek");
			} else {
				for (var4 = 0; var4 < this.anInt1121; ++var4) {
					if (this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[this.anIntArray1122[var4]] == null) {
						signlink.reporterror(this.aString1147 + " null entry in pl list - pos:" + var4 + " size:" + this.anInt1121);
						throw new RuntimeException("eek");
					}
				}

			}
		}
	}

	public void method104(boolean var1) {
		for (int var2 = -1; var2 < this.anInt1121; ++var2) {
			int var3;
			if (var2 == -1) {
				var3 = this.anInt1119;
			} else {
				var3 = this.anIntArray1122[var2];
			}

			Class44_Sub3_Sub4_Sub6_Sub1 var4 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var3];
			if (var4 != null) {
				this.method136(var4, 0, 1);
			}
		}

		this.aBoolean905 &= var1;
	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	public void method135() {
		for (int var1 = 0; var1 < this.anInt1260; ++var1) {
			int var2 = this.anIntArray1261[var1];
			Class44_Sub3_Sub4_Sub6_Sub2 var3 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var2];
			if (var3 != null) {
				this.method136(var3, 0, var3.aClass12_1682.aByte283);
			}
		}

	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "46415"
	)
	public void method117() {
		int var1;
		int var2;
		for (var1 = -1; var1 < this.anInt1121; ++var1) {
			if (var1 == -1) {
				var2 = this.anInt1119;
			} else {
				var2 = this.anIntArray1122[var1];
			}

			Class44_Sub3_Sub4_Sub6_Sub1 var3 = this.aClass44_Sub3_Sub4_Sub6_Sub1Array1120[var2];
			if (var3 != null && var3.anInt1612 > 0) {
				--var3.anInt1612;
				if (var3.anInt1612 == 0) {
					var3.aString1611 = null;
				}
			}
		}

		for (var1 = 0; var1 < this.anInt1260; ++var1) {
			var2 = this.anIntArray1261[var1];
			Class44_Sub3_Sub4_Sub6_Sub2 var4 = this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var2];
			if (var4 != null && var4.anInt1612 > 0) {
				--var4.anInt1612;
				if (var4.anInt1612 == 0) {
					var4.aString1611 = null;
				}
			}
		}

	}

	public void method132(String var1) {
		System.out.println(var1);

		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + var1 + ".html"));
		} catch (Exception var3) {
			var3.printStackTrace();
		}

		while (true) {
			while (true) {
				try {
					Thread.sleep(1000L);
				} catch (Exception var4) {
				}
			}
		}
	}

	public void method92(int var1) {
		if (this.aComponentImageProducer_865 == null) {
			this.method114(0);
			super.aComponentImageProducer_15 = null;
			this.aComponentImageProducer_1039 = null;
			this.aComponentImageProducer_1040 = null;
			this.aComponentImageProducer_1041 = null;
			this.aComponentImageProducer_1042 = null;
			this.aComponentImageProducer_1043 = null;
			var1 = 12 / var1;
			this.aComponentImageProducer_1044 = null;
			this.aComponentImageProducer_1045 = null;
			this.aComponentImageProducer_1046 = null;
			this.aComponentImageProducer_1047 = null;
			this.aComponentImageProducer_865 = new ComponentImageProducer(96, 479, this.getGameWindow((byte)7));
			this.aComponentImageProducer_863 = new ComponentImageProducer(156, 172, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aClass44_Sub3_Sub1_Sub3_1202.method453(this.aByte1070, 0, 0);
			this.aComponentImageProducer_862 = new ComponentImageProducer(261, 190, this.getGameWindow((byte)7));
			this.componentImageProducer = new ComponentImageProducer(334, 512, this.getGameWindow((byte)7));
			DrawingArea.method409();
			this.aComponentImageProducer_990 = new ComponentImageProducer(50, 496, this.getGameWindow((byte)7));
			this.aComponentImageProducer_991 = new ComponentImageProducer(37, 269, this.getGameWindow((byte)7));
			this.aComponentImageProducer_992 = new ComponentImageProducer(45, 249, this.getGameWindow((byte)7));
			this.aBoolean917 = true;
		}

	}

	public void method143(int var1, int var2, Buffer var3) {
		this.anInt1064 = 0;
		this.anInt1123 = 0;
		var2 += var1;
		this.method66(var2, this.anInt925, var3);
		this.method25(-196, var3, var2);
		this.method99(var2, (byte)4, var3);

		int var4;
		for (var4 = 0; var4 < this.anInt1064; ++var4) {
			int var5 = this.anIntArray1065[var4];
			if (this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var5].anInt1644 != tick) {
				this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var5].aClass12_1682 = null;
				this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[var5] = null;
			}
		}

		if (var3.offset != var2) {
			signlink.reporterror(this.aString1147 + " size mismatch in getnpcpos - pos:" + var3.offset + " psize:" + var2);
			throw new RuntimeException("eek");
		} else {
			for (var4 = 0; var4 < this.anInt1260; ++var4) {
				if (this.aClass44_Sub3_Sub4_Sub6_Sub2Array1259[this.anIntArray1261[var4]] == null) {
					signlink.reporterror(this.aString1147 + " null entry in npc list - pos:" + var4 + " size:" + this.anInt1260);
					throw new RuntimeException("eek");
				}
			}

		}
	}

	public void method21(byte var1) {
		if (this.anInt895 == 0) {
			int var2 = super.anInt28;
			if (var1 == 1) {
				boolean var11 = false;
				if (this.anInt1196 == 1 && super.anInt29 >= 516 && super.anInt30 >= 160 && super.anInt29 <= 765 && super.anInt30 <= 205) {
					var2 = 0;
				}

				int var3;
				int var4;
				int var5;
				if (this.aBoolean851) {
					if (var2 != 1) {
						var3 = super.anInt22;
						var4 = super.anInt23;
						if (this.anInt1254 == 0) {
							var3 -= 4;
							var4 -= 4;
						}

						if (this.anInt1254 == 1) {
							var3 -= 553;
							var4 -= 205;
						}

						if (this.anInt1254 == 2) {
							var3 -= 17;
							var4 -= 357;
						}

						if (var3 < this.anInt1255 - 10 || var3 > this.anInt1255 + this.anInt1257 + 10 || var4 < this.anInt1256 - 10 || var4 > this.anInt1256 + this.anInt1258 + 10) {
							this.aBoolean851 = false;
							if (this.anInt1254 == 1) {
								this.aBoolean928 = true;
							}

							if (this.anInt1254 == 2) {
								this.aBoolean1109 = true;
							}
						}
					}

					if (var2 == 1) {
						var3 = this.anInt1255;
						var4 = this.anInt1256;
						var5 = this.anInt1257;
						int var12 = super.anInt29;
						int var7 = super.anInt30;
						if (this.anInt1254 == 0) {
							var12 -= 4;
							var7 -= 4;
						}

						if (this.anInt1254 == 1) {
							var12 -= 553;
							var7 -= 205;
						}

						if (this.anInt1254 == 2) {
							var12 -= 17;
							var7 -= 357;
						}

						int var8 = -1;

						for (int var9 = 0; var9 < this.anInt980; ++var9) {
							int var10 = var4 + (this.anInt980 - 1 - var9) * 15 + 31;
							if (var12 > var3 && var12 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
								var8 = var9;
							}
						}

						if (var8 != -1) {
							this.method60((byte)6, var8);
						}

						this.aBoolean851 = false;
						if (this.anInt1254 == 1) {
							this.aBoolean928 = true;
						}

						if (this.anInt1254 == 2) {
							this.aBoolean1109 = true;
						}
					}
				} else {
					if (var2 == 1 && this.anInt980 > 0) {
						var3 = this.anIntArray1193[this.anInt980 - 1];
						if (var3 == 582 || var3 == 113 || var3 == 555 || var3 == 331 || var3 == 354 || var3 == 694 || var3 == 962 || var3 == 795 || var3 == 681 || var3 == 100 || var3 == 102 || var3 == 1328) {
							var4 = this.anIntArray1191[this.anInt980 - 1];
							var5 = this.anIntArray1192[this.anInt980 - 1];
							Class5 var6 = Class5.aClass5Array103[var5];
							if (var6.aBoolean130 || var6.aBoolean133) {
								this.aBoolean1146 = false;
								this.anInt1250 = 0;
								this.anInt893 = var5;
								this.anInt894 = var4;
								this.anInt895 = 2;
								this.anInt896 = super.anInt29;
								this.anInt897 = super.anInt30;
								if (Class5.aClass5Array103[var5].anInt109 == this.anInt1037) {
									this.anInt895 = 1;
								}

								if (Class5.aClass5Array103[var5].anInt109 == this.anInt1011) {
									this.anInt895 = 3;
								}

								return;
							}
						}
					}

					if (var2 == 1 && (this.anInt1049 == 1 || this.method65(this.anInt980 - 1)) && this.anInt980 > 2) {
						var2 = 2;
					}

					if (var2 == 1 && this.anInt980 > 0) {
						this.method60((byte)6, this.anInt980 - 1);
					}

					if (var2 == 2 && this.anInt980 > 0) {
						this.method95(0);
					}
				}

			}
		}
	}

	public void method130(int var1) {
		if (this.anInt1176 != var1) {
			this.startup();
		}

		if (this.anInt1031 == 0) {
			if (super.anInt28 == 1) {
				int var2 = super.anInt29 - 25 - 550;
				int var3 = super.anInt30 - 5 - 4;
				if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
					var2 -= 73;
					var3 -= 75;
					int var4 = this.anInt1206 + this.anInt1217 & 2047;
					int var5 = Class44_Sub3_Sub1_Sub1.anIntArray1407[var4];
					int var6 = Class44_Sub3_Sub1_Sub1.anIntArray1408[var4];
					var5 = var5 * (this.anInt1170 + 256) >> 8;
					var6 = var6 * (this.anInt1170 + 256) >> 8;
					int var7 = var3 * var5 + var2 * var6 >> 11;
					int var8 = var3 * var6 - var2 * var5 >> 11;
					int var9 = var7 + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 >> 7;
					int var10 = aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 - var8 >> 7;
					boolean var11 = this.method39(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1650[0], var9, 0, 0, 0, aClass44_Sub3_Sub4_Sub6_Sub1_1252.anIntArray1649[0], 0, true, 0, var10, (byte)9, 1);
					if (var11) {
						this.aBuffer_843.writeByte(var2);
						this.aBuffer_843.writeByte(var3);
						this.aBuffer_843.writeShort(this.anInt1206);
						this.aBuffer_843.writeByte(57);
						this.aBuffer_843.writeByte(this.anInt1217);
						this.aBuffer_843.writeByte(this.anInt1170);
						this.aBuffer_843.writeByte(89);
						this.aBuffer_843.writeShort(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599);
						this.aBuffer_843.writeShort(aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600);
						this.aBuffer_843.writeByte(this.anInt1006);
						this.aBuffer_843.writeByte(63);
					}
				}
			}

		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "25675"
	)
	public void method58() {
		if (super.anInt28 == 1) {
			if (super.anInt29 >= 539 && super.anInt29 <= 573 && super.anInt30 >= 169 && super.anInt30 < 205 && this.anIntArray954[0] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 0;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 569 && super.anInt29 <= 599 && super.anInt30 >= 168 && super.anInt30 < 205 && this.anIntArray954[1] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 1;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 597 && super.anInt29 <= 627 && super.anInt30 >= 168 && super.anInt30 < 205 && this.anIntArray954[2] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 2;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 625 && super.anInt29 <= 669 && super.anInt30 >= 168 && super.anInt30 < 203 && this.anIntArray954[3] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 3;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 666 && super.anInt29 <= 696 && super.anInt30 >= 168 && super.anInt30 < 205 && this.anIntArray954[4] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 4;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 694 && super.anInt29 <= 724 && super.anInt30 >= 168 && super.anInt30 < 205 && this.anIntArray954[5] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 5;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 722 && super.anInt29 <= 756 && super.anInt30 >= 169 && super.anInt30 < 205 && this.anIntArray954[6] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 6;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 540 && super.anInt29 <= 574 && super.anInt30 >= 466 && super.anInt30 < 502 && this.anIntArray954[7] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 7;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 572 && super.anInt29 <= 602 && super.anInt30 >= 466 && super.anInt30 < 503 && this.anIntArray954[8] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 8;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 599 && super.anInt29 <= 629 && super.anInt30 >= 466 && super.anInt30 < 503 && this.anIntArray954[9] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 9;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 627 && super.anInt29 <= 671 && super.anInt30 >= 467 && super.anInt30 < 502 && this.anIntArray954[10] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 10;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 669 && super.anInt29 <= 699 && super.anInt30 >= 466 && super.anInt30 < 503 && this.anIntArray954[11] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 11;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 696 && super.anInt29 <= 726 && super.anInt30 >= 466 && super.anInt30 < 503 && this.anIntArray954[12] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 12;
				this.aBoolean841 = true;
			}

			if (super.anInt29 >= 724 && super.anInt29 <= 758 && super.anInt30 >= 466 && super.anInt30 < 502 && this.anIntArray954[13] != -1) {
				this.aBoolean928 = true;
				this.anInt1013 = 13;
				this.aBoolean841 = true;
			}
		}

	}

	public void method38(boolean var1) {
		if (var1) {
			this.anInt1220 = -1;
		}

		if (super.anInt28 == 1) {
			if (super.anInt29 >= 6 && super.anInt29 <= 106 && super.anInt30 >= 467 && super.anInt30 <= 499) {
				this.anInt967 = (this.anInt967 + 1) % 4;
				this.aBoolean1141 = true;
				this.aBoolean1109 = true;
				this.aBuffer_843.writeOpcode(154);
				this.aBuffer_843.writeByte(this.anInt967);
				this.aBuffer_843.writeByte(this.anInt972);
				this.aBuffer_843.writeByte(this.anInt805);
			}

			if (super.anInt29 >= 135 && super.anInt29 <= 235 && super.anInt30 >= 467 && super.anInt30 <= 499) {
				this.anInt972 = (this.anInt972 + 1) % 3;
				this.aBoolean1141 = true;
				this.aBoolean1109 = true;
				this.aBuffer_843.writeOpcode(154);
				this.aBuffer_843.writeByte(this.anInt967);
				this.aBuffer_843.writeByte(this.anInt972);
				this.aBuffer_843.writeByte(this.anInt805);
			}

			if (super.anInt29 >= 273 && super.anInt29 <= 373 && super.anInt30 >= 467 && super.anInt30 <= 499) {
				this.anInt805 = (this.anInt805 + 1) % 3;
				this.aBoolean1141 = true;
				this.aBoolean1109 = true;
				this.aBuffer_843.writeOpcode(154);
				this.aBuffer_843.writeByte(this.anInt967);
				this.aBuffer_843.writeByte(this.anInt972);
				this.aBuffer_843.writeByte(this.anInt805);
			}

			if (super.anInt29 >= 412 && super.anInt29 <= 512 && super.anInt30 >= 467 && super.anInt30 <= 499) {
				this.method45();
				this.aString951 = "";
				this.aBoolean1128 = false;

				for (int var2 = 0; var2 < Class5.aClass5Array103.length; ++var2) {
					if (Class5.aClass5Array103[var2] != null && Class5.aClass5Array103[var2].anInt112 == 600) {
						this.anInt1081 = this.anInt1037 = Class5.aClass5Array103[var2].anInt109;
						return;
					}
				}
			}
		}

	}

	public void method129(boolean var1) {
		this.aBoolean905 &= var1;

		try {
			int var2 = this.anInt1246 + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599;
			int var3 = this.anInt834 + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600;
			if (this.anInt1021 - var2 < -500 || this.anInt1021 - var2 > 500 || this.anInt1022 - var3 < -500 || this.anInt1022 - var3 > 500) {
				this.anInt1021 = var2;
				this.anInt1022 = var3;
			}

			if (var2 != this.anInt1021) {
				this.anInt1021 += (var2 - this.anInt1021) / 16;
			}

			if (var3 != this.anInt1022) {
				this.anInt1022 += (var3 - this.anInt1022) / 16;
			}

			if (super.anIntArray32[1] == 1) {
				this.anInt1207 += (-24 - this.anInt1207) / 2;
			} else if (super.anIntArray32[2] == 1) {
				this.anInt1207 += (24 - this.anInt1207) / 2;
			} else {
				this.anInt1207 /= 2;
			}

			if (super.anIntArray32[3] == 1) {
				this.anInt1208 += (12 - this.anInt1208) / 2;
			} else if (super.anIntArray32[4] == 1) {
				this.anInt1208 += (-12 - this.anInt1208) / 2;
			} else {
				this.anInt1208 /= 2;
			}

			this.anInt1206 = this.anInt1207 / 2 + this.anInt1206 & 2047;
			this.anInt1205 += this.anInt1208 / 2;
			if (this.anInt1205 < 128) {
				this.anInt1205 = 128;
			}

			if (this.anInt1205 > 383) {
				this.anInt1205 = 383;
			}

			int var4 = this.anInt1021 >> 7;
			int var5 = this.anInt1022 >> 7;
			int var6 = this.method50(this.anInt1021, this.anInt1022, 0, this.clientPlane);
			int var7 = 0;
			int var8;
			if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
				for (var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
					for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
						int var10 = this.clientPlane;
						if (var10 < 3 && (this.tileFlags[1][var8][var9] & 2) == 2) {
							++var10;
						}

						int var11 = var6 - this.anIntArrayArrayArray957[var10][var8][var9];
						if (var11 > var7) {
							var7 = var11;
						}
					}
				}
			}

			var8 = var7 * 192;
			if (var8 > 98048) {
				var8 = 98048;
			}

			if (var8 < 32768) {
				var8 = 32768;
			}

			if (var8 > this.anInt1072) {
				this.anInt1072 += (var8 - this.anInt1072) / 24;
			} else {
				if (var8 < this.anInt1072) {
					this.anInt1072 += (var8 - this.anInt1072) / 80;
				}

			}
		} catch (Exception var12) {
			signlink.reporterror("glfc_ex " + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1599 + "," + aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1600 + "," + this.anInt1021 + "," + this.anInt1022 + "," + this.anInt922 + "," + this.anInt923 + "," + this.anInt1055 + "," + this.anInt1056);
			throw new RuntimeException("eek");
		}
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-630"
	)
	public void method116() {
		int var1 = this.anInt869 * 128 + 64;
		int var2 = this.anInt870 * 128 + 64;
		int var3 = this.method50(var1, var2, 0, this.clientPlane) - this.anInt871;
		if (this.anInt820 < var1) {
			this.anInt820 += this.anInt872 + (var1 - this.anInt820) * this.anInt873 / 1000;
			if (this.anInt820 > var1) {
				this.anInt820 = var1;
			}
		}

		if (this.anInt820 > var1) {
			this.anInt820 -= (this.anInt820 - var1) * this.anInt873 / 1000 + this.anInt872;
			if (this.anInt820 < var1) {
				this.anInt820 = var1;
			}
		}

		if (this.anInt821 < var3) {
			this.anInt821 += this.anInt872 + (var3 - this.anInt821) * this.anInt873 / 1000;
			if (this.anInt821 > var3) {
				this.anInt821 = var3;
			}
		}

		if (this.anInt821 > var3) {
			this.anInt821 -= (this.anInt821 - var3) * this.anInt873 / 1000 + this.anInt872;
			if (this.anInt821 < var3) {
				this.anInt821 = var3;
			}
		}

		if (this.anInt822 < var2) {
			this.anInt822 += this.anInt872 + (var2 - this.anInt822) * this.anInt873 / 1000;
			if (this.anInt822 > var2) {
				this.anInt822 = var2;
			}
		}

		if (this.anInt822 > var2) {
			this.anInt822 -= (this.anInt822 - var2) * this.anInt873 / 1000 + this.anInt872;
			if (this.anInt822 < var2) {
				this.anInt822 = var2;
			}
		}

		var1 = this.anInt909 * 128 + 64;
		var2 = this.anInt910 * 128 + 64;
		var3 = this.method50(var1, var2, 0, this.clientPlane) - this.anInt911;
		int var4 = var1 - this.anInt820;
		int var5 = var3 - this.anInt821;
		int var6 = var2 - this.anInt822;
		int var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
		int var8 = (int)(Math.atan2((double)var5, (double)var7) * 325.949D) & 2047;
		int var9 = (int)(Math.atan2((double)var4, (double)var6) * -325.949D) & 2047;
		if (var8 < 128) {
			var8 = 128;
		}

		if (var8 > 383) {
			var8 = 383;
		}

		if (this.anInt823 < var8) {
			this.anInt823 += this.anInt912 + (var8 - this.anInt823) * this.anInt913 / 1000;
			if (this.anInt823 > var8) {
				this.anInt823 = var8;
			}
		}

		if (this.anInt823 > var8) {
			this.anInt823 -= (this.anInt823 - var8) * this.anInt913 / 1000 + this.anInt912;
			if (this.anInt823 < var8) {
				this.anInt823 = var8;
			}
		}

		int var10 = var9 - this.anInt824;
		if (var10 > 1024) {
			var10 -= 2048;
		}

		if (var10 < -1024) {
			var10 += 2048;
		}

		if (var10 > 0) {
			this.anInt824 += this.anInt912 + var10 * this.anInt913 / 1000;
			this.anInt824 &= 2047;
		}

		if (var10 < 0) {
			this.anInt824 -= this.anInt912 + -var10 * this.anInt913 / 1000;
			this.anInt824 &= 2047;
		}

		int var11 = var9 - this.anInt824;
		if (var11 > 1024) {
			var11 -= 2048;
		}

		if (var11 < -1024) {
			var11 += 2048;
		}

		if (var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
			this.anInt824 = var9;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-39"
	)
	public void method131() {
		++anInt1038;
		if (anInt1038 > 192) {
			anInt1038 = 0;
			this.aBuffer_843.writeOpcode(230);
			this.aBuffer_843.writeByte(232);
		}

		while (true) {
			int var1;
			do {
				while (true) {
					var1 = this.method5();
					if (var1 == -1) {
						return;
					}

					if (this.anInt1037 != -1 && this.anInt1037 == this.anInt1081) {
						if (var1 == 8 && this.aString951.length() > 0) {
							this.aString951 = this.aString951.substring(0, this.aString951.length() - 1);
						}
						break;
					}

					int var2;
					if (this.aBoolean1265) {
						if (var1 >= 32 && var1 <= 122 && this.aString984.length() < 80) {
							this.aString984 = this.aString984 + (char)var1;
							this.aBoolean1109 = true;
						}

						if (var1 == 8 && this.aString984.length() > 0) {
							this.aString984 = this.aString984.substring(0, this.aString984.length() - 1);
							this.aBoolean1109 = true;
						}

						if (var1 == 13 || var1 == 10) {
							this.aBoolean1265 = false;
							this.aBoolean1109 = true;
							long var7;
							if (this.anInt1051 == 1) {
								var7 = Class48.method547(this.aString984);
								this.method102(199, var7);
							}

							if (this.anInt1051 == 2 && this.anInt1115 > 0) {
								var7 = Class48.method547(this.aString984);
								this.method62(0, var7);
							}

							if (this.anInt1051 == 3 && this.aString984.length() > 0) {
								this.aBuffer_843.writeOpcode(139);
								this.aBuffer_843.writeByte(0);
								var2 = this.aBuffer_843.offset;
								this.aBuffer_843.writeLong(this.aLong867, 0);
								Class49.method555(this.aString984, (byte)126, this.aBuffer_843);
								this.aBuffer_843.writeSize(this.aBuffer_843.offset - var2, this.anInt797);
								this.aString984 = Class48.method552(this.aString984);
								this.aString984 = Class41.method352((byte)3, this.aString984);
								this.method49(-476, 6, Class48.method551(131, Class48.method548(0, this.aLong867)), this.aString984);
								if (this.anInt972 == 2) {
									this.anInt972 = 1;
									this.aBoolean1141 = true;
									this.aBuffer_843.writeOpcode(154);
									this.aBuffer_843.writeByte(this.anInt967);
									this.aBuffer_843.writeByte(this.anInt972);
									this.aBuffer_843.writeByte(this.anInt805);
								}
							}

							if (this.anInt1051 == 4 && this.anInt961 < 100) {
								var7 = Class48.method547(this.aString984);
								this.method96(var7);
							}

							if (this.anInt1051 == 5 && this.anInt961 > 0) {
								var7 = Class48.method547(this.aString984);
								this.method123(this.aBoolean974, var7);
							}
						}
					} else if (this.aBoolean1104) {
						if (var1 >= 48 && var1 <= 57 && this.aString1182.length() < 10) {
							this.aString1182 = this.aString1182 + (char)var1;
							this.aBoolean1109 = true;
						}

						if (var1 == 8 && this.aString1182.length() > 0) {
							this.aString1182 = this.aString1182.substring(0, this.aString1182.length() - 1);
							this.aBoolean1109 = true;
						}

						if (var1 == 13 || var1 == 10) {
							if (this.aString1182.length() > 0) {
								var2 = 0;

								try {
									var2 = Integer.parseInt(this.aString1182);
								} catch (Exception var5) {
								}

								this.aBuffer_843.writeOpcode(102);
								this.aBuffer_843.writeInt(var2);
							}

							this.aBoolean1104 = false;
							this.aBoolean1109 = true;
						}
					} else if (this.anInt1011 == -1) {
						if (var1 >= 32 && var1 <= 122 && this.aString1009.length() < 80) {
							this.aString1009 = this.aString1009 + (char)var1;
							this.aBoolean1109 = true;
						}

						if (var1 == 8 && this.aString1009.length() > 0) {
							this.aString1009 = this.aString1009.substring(0, this.aString1009.length() - 1);
							this.aBoolean1109 = true;
						}

						if ((var1 == 13 || var1 == 10) && this.aString1009.length() > 0) {
							if (this.anInt866 == 2) {
								if (this.aString1009.equals("::clientdrop")) {
									this.method71(0);
								}

								if (this.aString1009.equals("::lag")) {
									this.method118();
								}

								if (this.aString1009.equals("::prefetchmusic")) {
									for (var2 = 0; var2 < this.aClass43_Sub1_1015.method385(anInt1235, 2); ++var2) {
										this.aClass43_Sub1_1015.method395((byte)5, var2, 2, (byte)1);
									}
								}
							}

							if (this.aString1009.startsWith("::")) {
								this.aBuffer_843.writeOpcode(224);
								this.aBuffer_843.writeByte(this.aString1009.length() - 1);
								this.aBuffer_843.writeString(this.aString1009.substring(2));
							} else {
								byte var6 = 0;
								if (this.aString1009.startsWith("yellow:")) {
									var6 = 0;
									this.aString1009 = this.aString1009.substring(7);
								}

								if (this.aString1009.startsWith("red:")) {
									var6 = 1;
									this.aString1009 = this.aString1009.substring(4);
								}

								if (this.aString1009.startsWith("green:")) {
									var6 = 2;
									this.aString1009 = this.aString1009.substring(6);
								}

								if (this.aString1009.startsWith("cyan:")) {
									var6 = 3;
									this.aString1009 = this.aString1009.substring(5);
								}

								if (this.aString1009.startsWith("purple:")) {
									var6 = 4;
									this.aString1009 = this.aString1009.substring(7);
								}

								if (this.aString1009.startsWith("white:")) {
									var6 = 5;
									this.aString1009 = this.aString1009.substring(6);
								}

								if (this.aString1009.startsWith("flash1:")) {
									var6 = 6;
									this.aString1009 = this.aString1009.substring(7);
								}

								if (this.aString1009.startsWith("flash2:")) {
									var6 = 7;
									this.aString1009 = this.aString1009.substring(7);
								}

								if (this.aString1009.startsWith("flash3:")) {
									var6 = 8;
									this.aString1009 = this.aString1009.substring(7);
								}

								if (this.aString1009.startsWith("glow1:")) {
									var6 = 9;
									this.aString1009 = this.aString1009.substring(6);
								}

								if (this.aString1009.startsWith("glow2:")) {
									var6 = 10;
									this.aString1009 = this.aString1009.substring(6);
								}

								if (this.aString1009.startsWith("glow3:")) {
									var6 = 11;
									this.aString1009 = this.aString1009.substring(6);
								}

								byte var3 = 0;
								if (this.aString1009.startsWith("wave:")) {
									var3 = 1;
									this.aString1009 = this.aString1009.substring(5);
								}

								if (this.aString1009.startsWith("scroll:")) {
									var3 = 2;
									this.aString1009 = this.aString1009.substring(7);
								}

								this.aBuffer_843.writeOpcode(253);
								this.aBuffer_843.writeByte(0);
								int var4 = this.aBuffer_843.offset;
								this.aBuffer_843.writeByte(var6);
								this.aBuffer_843.writeByte(var3);
								Class49.method555(this.aString1009, (byte)126, this.aBuffer_843);
								this.aBuffer_843.writeSize(this.aBuffer_843.offset - var4, this.anInt797);
								this.aString1009 = Class48.method552(this.aString1009);
								this.aString1009 = Class41.method352((byte)3, this.aString1009);
								aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611 = this.aString1009;
								aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1613 = var6;
								aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1614 = var3;
								aClass44_Sub3_Sub4_Sub6_Sub1_1252.anInt1612 = 150;
								if (this.anInt866 == 2) {
									this.method49(-476, 2, "@cr2@" + aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611);
								} else if (this.anInt866 == 1) {
									this.method49(-476, 2, "@cr1@" + aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611);
								} else {
									this.method49(-476, 2, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1657, aClass44_Sub3_Sub4_Sub6_Sub1_1252.aString1611);
								}

								if (this.anInt967 == 2) {
									this.anInt967 = 3;
									this.aBoolean1141 = true;
									this.aBuffer_843.writeOpcode(154);
									this.aBuffer_843.writeByte(this.anInt967);
									this.aBuffer_843.writeByte(this.anInt972);
									this.aBuffer_843.writeByte(this.anInt805);
								}
							}

							this.aString1009 = "";
							this.aBoolean1109 = true;
						}
					}
				}
			} while((var1 < 97 || var1 > 122) && (var1 < 65 || var1 > 90) && (var1 < 48 || var1 > 57) && var1 != 32);

			if (this.aString951.length() < 12) {
				this.aString951 = this.aString951 + (char)var1;
			}
		}
	}

	public boolean method113(Class5 var1, int var2) {
		if (var2 != 0) {
			throw new NullPointerException();
		} else {
			int var3 = var1.anInt112;
			if (this.anInt1116 == 2) {
				if (var3 == 201) {
					this.aBoolean1109 = true;
					this.aBoolean1104 = false;
					this.aBoolean1265 = true;
					this.aString984 = "";
					this.anInt1051 = 1;
					this.aString1019 = "Enter name of friend to add to list";
				}

				if (var3 == 202) {
					this.aBoolean1109 = true;
					this.aBoolean1104 = false;
					this.aBoolean1265 = true;
					this.aString984 = "";
					this.anInt1051 = 2;
					this.aString1019 = "Enter name of friend to delete from list";
				}
			}

			if (var3 == 205) {
				this.anInt1223 = 250;
				return true;
			} else {
				if (var3 == 501) {
					this.aBoolean1109 = true;
					this.aBoolean1104 = false;
					this.aBoolean1265 = true;
					this.aString984 = "";
					this.anInt1051 = 4;
					this.aString1019 = "Enter name of player to add to list";
				}

				if (var3 == 502) {
					this.aBoolean1109 = true;
					this.aBoolean1104 = false;
					this.aBoolean1265 = true;
					this.aString984 = "";
					this.anInt1051 = 5;
					this.aString1019 = "Enter name of player to delete from list";
				}

				int var4;
				int var5;
				int var6;
				if (var3 >= 300 && var3 <= 313) {
					var4 = (var3 - 300) / 2;
					var5 = var3 & 1;
					var6 = this.anIntArray810[var4];
					if (var6 != -1) {
						while (true) {
							if (var5 == 0) {
								--var6;
								if (var6 < 0) {
									var6 = Class22.anInt454 - 1;
								}
							}

							if (var5 == 1) {
								++var6;
								if (var6 >= Class22.anInt454) {
									var6 = 0;
								}
							}

							if (!Class22.aClass22Array455[var6].aBoolean461 && Class22.aClass22Array455[var6].anInt456 == var4 + (this.aBoolean982 ? 0 : 7)) {
								this.anIntArray810[var4] = var6;
								this.aBoolean971 = true;
								break;
							}
						}
					}
				}

				if (var3 >= 314 && var3 <= 323) {
					var4 = (var3 - 314) / 2;
					var5 = var3 & 1;
					var6 = this.anIntArray1089[var4];
					if (var5 == 0) {
						--var6;
						if (var6 < 0) {
							var6 = anIntArrayArray1241[var4].length - 1;
						}
					}

					if (var5 == 1) {
						++var6;
						if (var6 >= anIntArrayArray1241[var4].length) {
							var6 = 0;
						}
					}

					this.anIntArray1089[var4] = var6;
					this.aBoolean971 = true;
				}

				if (var3 == 324 && !this.aBoolean982) {
					this.aBoolean982 = true;
					this.method106();
				}

				if (var3 == 325 && this.aBoolean982) {
					this.aBoolean982 = false;
					this.method106();
				}

				if (var3 != 326) {
					if (var3 == 613) {
						this.aBoolean1128 = !this.aBoolean1128;
					}

					if (var3 >= 601 && var3 <= 612) {
						this.method45();
						if (this.aString951.length() > 0) {
							this.aBuffer_843.writeOpcode(137);
							this.aBuffer_843.writeLong(Class48.method547(this.aString951), 0);
							this.aBuffer_843.writeByte(var3 - 601);
							this.aBuffer_843.writeByte(this.aBoolean1128 ? 1 : 0);
						}
					}

					return false;
				} else {
					this.aBuffer_843.writeOpcode(125);
					this.aBuffer_843.writeByte(this.aBoolean982 ? 0 : 1);

					for (var4 = 0; var4 < 7; ++var4) {
						this.aBuffer_843.writeByte(this.anIntArray810[var4]);
					}

					for (var4 = 0; var4 < 5; ++var4) {
						this.aBuffer_843.writeByte(this.anIntArray1089[var4]);
					}

					return true;
				}
			}
		}
	}

	public void run() {
		if (this.aBoolean1175) {
			this.method85();
		} else {
			super.run();
		}

	}

	public void init() {
		System.out.println("RS2 user client - release #274");
		localWorldId = 10;
		portOffset = 0;
		isMembersWorld = true;
		method73();
		signlink.storeid = 0;

		try {
			signlink.startpriv(InetAddress.getLocalHost());
		} catch (UnknownHostException var2) {
			throw new RuntimeException(var2);
		}

		client = this;
		client.createClientFrame(false, 765, 503);
	}

	public void start() {
		client.createClientFramePost();
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "10969"
	)
	public static void method73() {
		Class36.aBoolean593 = false;
		Class44_Sub3_Sub1_Sub1.aBoolean1398 = false;
		isLowMemory = false;
		Class3.aBoolean67 = false;
	}

	public static String method77(int var0, int var1, int var2) {
		int var3 = var2 - var1;
		if (var3 < -9) {
			return "@red@";
		} else if (var3 < -6) {
			return "@or3@";
		} else if (var3 < -3) {
			return "@or2@";
		} else if (var3 < 0) {
			return "@or1@";
		} else if (var3 > 9) {
			return "@gre@";
		} else if (var3 > 6) {
			return "@gr3@";
		} else if (var3 > 3) {
			return "@gr2@";
		} else {
			return var3 > 0 ? "@gr1@" : "@yel@";
		}
	}

	public static String method97(int var0, boolean var1) {
		String var2 = String.valueOf(var0);
		if (var1) {
			throw new NullPointerException();
		} else {
			for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
				var2 = var2.substring(0, var3) + "," + var2.substring(var3);
			}

			if (var2.length() > 8) {
				var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
			} else if (var2.length() > 4) {
				var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
			}

			return " " + var2;
		}
	}

	public static String method110(int var0, int var1) {
		if (var1 < 100000) {
			return String.valueOf(var1);
		} else {
			return var1 < 10000000 ? var1 / 1000 + "K" : var1 / 1000000 + "M";
		}
	}
}
