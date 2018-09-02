package eu.csaware.stix2.util;

import java.util.UUID;

/**
 *
 */
public class Stix2Util {

    public static final String ID_SEPARATOR = "--";

    public static String assembleId(String type, UUID uuid) {
        return type + ID_SEPARATOR + uuid;
    }

    public static String extractTypeFromId(String id) {
        String[] split = id.split(ID_SEPARATOR);
        return split[0];
    }

    public static UUID extractUUIDFromId(String id) {
        String[] split = id.split(ID_SEPARATOR);
        return UUID.fromString(split[1]);
    }


}
