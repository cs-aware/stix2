package eu.csaware.stix2.common;

import com.google.gson.annotations.SerializedName;

/**
 * Represent the type of a STIX 2 object in Java as a type-safe enum with
 * Gson serialisation support.
 */
public enum Stix2Type {
    @SerializedName("attack-pattern") ATTACK_PATTERN("attack-pattern"),
    @SerializedName("campaign") CAMPAIGN("campaign"),
    @SerializedName("course-of-action") COURSE_OF_ACTION("course-of-action"),
    @SerializedName("identity") IDENTITY("identity"),
    @SerializedName("indicator") INDICATOR("indicator"),
    @SerializedName("intrusion-set") INTRUSION_SET("intrusion-set"),
    @SerializedName("malware") MALWARE("malware"),
    @SerializedName("observed-data") OBSERVED_DATA("observed-data"),
    @SerializedName("report") REPORT("report"),
    @SerializedName("threat-actor") THREAT_ACTOR("threat-actor"),
    @SerializedName("tool") TOOL("tool"),
    @SerializedName("vulnerability") VULNERABILITY("vulnerability"),
    @SerializedName("relationship") RELATIONSHIP("relationship"),
    @SerializedName("sighting") SIGHTING("sighting"),
    @SerializedName("bundle") BUNDLE("bundle"),
    @SerializedName("marking-definition") MARKING_DEFINITION("marking-definition"),
    @SerializedName("artifact") ARTIFACT("artifact"),
    @SerializedName("autonomous-system") AUTONOMOUS_SYSTEM("autonomous-system"),
    @SerializedName("directory") DIRECTORY("directory"),
    @SerializedName("domain-name") DOMAIN_NAME("domain-name"),
    @SerializedName("email-addr") EMAIL_ADDR("email-addr"),
    @SerializedName("email-message") EMAIL_MESSAGE("email-message"),
    @SerializedName("file") FILE("file"),
    @SerializedName("ipv4-addr") IPV4_ADDR("ipv4-addr"),
    @SerializedName("ipv6-addr") IPV6_ADDR("ipv6-addr"),
    @SerializedName("mac-addr") MAC_ADDR("mac-addr"),
    @SerializedName("mutex") MUTEX("mutex"),
    @SerializedName("network-traffic") NETWORK_TRAFFIC("network-traffic"),
    @SerializedName("process") PROCESS("process"),
    @SerializedName("software") SOFTWARE("software"),
    @SerializedName("url") URL("url"),
    @SerializedName("user-account") USER_ACCOUNT("user-account"),
    @SerializedName("windows-registry-key") WINDOWS_REGISTRY_KEY("windows-registry-key"),
    @SerializedName("x509-certificate") X_509_CERTIFICATE("x509-certificate");

    private String jsonString;

    Stix2Type(String stixType) {
        this.jsonString = stixType;
    }

    /**
     * Convert this Java enum type to the standardized STIX Json serialisation.
     */
    public String toJsonString() {
        return jsonString;
    }

    /**
     * Convert from the standardized STIX Json serialisation to the Java enum type.
     */
    public static Stix2Type fromJsonString(String type) {
        for (Stix2Type value : values()) {
            if (value.jsonString.equals(type))
                return value;
        }
        return null;
    }

    @Override
    public String toString() {
        return toJsonString();
    }


}