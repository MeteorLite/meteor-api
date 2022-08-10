package com.jagex.runescape.config;
import java.math.BigInteger;

public class Configuration {

    /**
     * IP Address or Hostname of the server to establish a connection.
     */
    public static String SERVER_ADDRESS = "127.0.0.1";

    /**
     * Name of the cache folder located in the users home directory.
     */
    public static String CACHE_NAME = ".377cache";

    /**
     * Port for establishing a connection to the game server.
     */
    public static int GAME_PORT = 43594;

    /**
     * Port for establishing a connection to the on demand service.
     */
    public static int ONDEMAND_PORT = 43594;

    /**
     * Port for establishing a connection to the update server.
     */
    public static int JAGGRAB_PORT = 43595;

    /**
     * Port for establishing a backup connection to the update
     * server in case the initial JAGGRAB connection fails.
     */
    public static int HTTP_PORT = 80;

    /**
     * Whether or not the update server should be used.
     */
    public static boolean JAGGRAB_ENABLED = true;

    /**
     * Whether or not the network packets should be encrypted.
     */
    public static boolean RSA_ENABLED = true;

    /**
     * Public key to be used in RSA network encryption.
     */
    public static BigInteger RSA_PUBLIC_KEY = new BigInteger("65537");

    /**
     * Modulus to be used in the RSA network encryption.
     */
    public static BigInteger RSA_MODULUS = new BigInteger("131176393330490699777455718339849617948322211238858296511313125167851391809401499284663920008272380570700530821682561642684310652313761597517491850635075253498226972776232870122875555395595403113854799115248303057535515466543652163717119680437543157778981497052960131433863122212497421865035451685856885994593");

    /**
     * Use static username/password pair.
     */
    public static boolean USE_STATIC_DETAILS = false;

    /**
     * Static username and password
     */

    public static String USERNAME = "Promises";
    public static String PASSWORD = "Testing";

    /**
     * Do you want to render roofs
     */
    public static boolean ROOFS_ENABLED = true;

    /**
     * Always light up teleports
     */
    public static boolean FREE_TELEPORTS = false;

    /**
     * When rightclicking objects show id and location
     */
    public static boolean DEBUG_CONTEXT = true;


}
