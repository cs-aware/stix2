package eu.csaware.stix2.util;

import eu.csaware.stix2.common.Stix2Type;

import java.util.UUID;

/**
 *
 */
public class Stix2Util {

    public static final String ID_SEPARATOR = "--";

    public static String assembleId(Stix2Type type, UUID uuid) {
        return type + ID_SEPARATOR + uuid;
    }

    public static Stix2Type extractTypeFromId(String id) {
        String[] split = id.split(ID_SEPARATOR);
        return Stix2Type.fromJsonString(split[0]);
    }

    public static UUID extractUUIDFromId(String id) {
        String[] split = id.split(ID_SEPARATOR);
        return UUID.fromString(split[1]);
    }

    public static boolean isValidId(String id) {
        if (!id.contains(ID_SEPARATOR))
            return false;
        String[] split = id.split(ID_SEPARATOR);
        Stix2Type stix2Type = Stix2Type.fromJsonString(split[0]);
        UUID uuid = null;
        try {
            uuid = UUID.fromString(split[1]);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return stix2Type != null && uuid != null && uuid.toString().length() > 1;
    }

}
