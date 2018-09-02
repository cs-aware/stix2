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
        Stix2Type stix2Type = Stix2Type.fromJsonString(split[0]);
        return stix2Type;
    }

    public static UUID extractUUIDFromId(String id) {
        String[] split = id.split(ID_SEPARATOR);
        return UUID.fromString(split[1]);
    }

}
