package eu.csaware.stix2.common;

import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.observables.Process;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

/**
 * Represent the type of a STIX 2 object in Java as a type-safe enum with
 * Gson serialisation support.
 */
public enum Stix2Type {
    @SerializedName("attack-pattern") ATTACK_PATTERN("attack-pattern", AttackPattern.class, AttackPattern.class),
    @SerializedName("campaign") CAMPAIGN("campaign", Campaign.class, Campaign.class),
    @SerializedName("course-of-action") COURSE_OF_ACTION("course-of-action", CourseOfAction.class, CourseOfAction.class),
    @SerializedName("identity") IDENTITY("identity", Identity.class, Identity.class),
    @SerializedName("indicator") INDICATOR("indicator", Indicator.class, Indicator.class),
    @SerializedName("intrusion-set") INTRUSION_SET("intrusion-set", IntrusionSet.class, IntrusionSet.class),
    @SerializedName("malware") MALWARE("malware", Malware.class, Malware.class),
    @SerializedName("observed-data") OBSERVED_DATA("observed-data", ObservedData.class, ObservedData.class),
    @SerializedName("report") REPORT("report", Report.class, Report.class),
    @SerializedName("threat-actor") THREAT_ACTOR("threat-actor", ThreatActor.class, ThreatActor.class),
    @SerializedName("tool") TOOL("tool", Tool.class, Tool.class),
    @SerializedName("vulnerability") VULNERABILITY("vulnerability", Vulnerability.class, Vulnerability.class),
    @SerializedName("relationship") RELATIONSHIP("relationship", Relationship.class, Relationship.class),
    @SerializedName("sighting") SIGHTING("sighting", Sighting.class, Sighting.class),
    @SerializedName("bundle") BUNDLE("bundle", Bundle.class, Bundle.class),
    @SerializedName("marking-definition") MARKING_DEFINITION("marking-definition", MarkingDefinition.class, MarkingDefinition.class),
    @SerializedName("artifact") ARTIFACT("artifact", Artifact.class, Artifact.class),
    @SerializedName("autonomous-system") AUTONOMOUS_SYSTEM("autonomous-system", AutonomousSystem.class, AutonomousSystem.class),
    @SerializedName("directory") DIRECTORY("directory", Directory.class, Directory.class),
    @SerializedName("domain-name") DOMAIN_NAME("domain-name", DomainName.class, DomainName.class),
    @SerializedName("email-addr") EMAIL_ADDR("email-addr", EmailAddr.class, EmailAddr.class),
    @SerializedName("email-message") EMAIL_MESSAGE("email-message", EmailMessage.class, EmailMessage.class),
    @SerializedName("file") FILE("file", File.class, File.class),
    @SerializedName("ipv4-addr") IPV4_ADDR("ipv4-addr", Ipv4Addr.class, Ipv4Addr.class),
    @SerializedName("ipv6-addr") IPV6_ADDR("ipv6-addr", Ipv6Addr.class, Ipv6Addr.class),
    @SerializedName("mac-addr") MAC_ADDR("mac-addr", MacAddr.class, MacAddr.class),
    @SerializedName("mutex") MUTEX("mutex", Mutex.class, Mutex.class),
    @SerializedName("network-traffic") NETWORK_TRAFFIC("network-traffic", NetworkTraffic.class, NetworkTraffic.class),
    @SerializedName("process") PROCESS("process", Process.class, Process.class),
    @SerializedName("software") SOFTWARE("software", Software.class, Software.class),
    @SerializedName("url") URL("url", Url.class, Url.class),
    @SerializedName("user-account") USER_ACCOUNT("user-account", UserAccount.class, UserAccount.class),
    @SerializedName("windows-registry-key") WINDOWS_REGISTRY_KEY("windows-registry-key", WindowsRegistryKey.class, WindowsRegistryKey.class),
    @SerializedName("x509-certificate") X_509_CERTIFICATE("x509-certificate", X509Certificate.class, X509Certificate.class);

    private final String jsonString;
    private final Class<? extends TypedStixObject> defaultImplementation;
    private Class<? extends TypedStixObject> implementation; // not final to allow changing the implementation dynamically

    Stix2Type(String stixType, Class<? extends TypedStixObject> defaultImplementation, Class<? extends TypedStixObject> implementation) {
        this.jsonString = stixType;
        this.defaultImplementation = defaultImplementation;
        this.implementation = implementation;
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

    /**
     * Convert from the implementation class to the Java enum type.
     */
    public static Stix2Type fromImplementation(Class implementation) {
        for (Stix2Type value : values()) {
            if (value.implementation == implementation ||
                //the following two cases should not be necessary, but in case of a mixed configuration as it can
                //happen during unit testing, they can fix the situation
                value.implementation == implementation.getSuperclass() ||
                value.implementation.getSuperclass() == implementation)
                return value;
        }
        return null;
    }

    public Class<? extends TypedStixObject> getImplementation() {
        return implementation;
    }

    /**
     * Change the implementation (typically to a subclass of the default implementation).
     */
    public void setImplementation(Class<? extends TypedStixObject> implementation) {
        this.implementation = implementation;
    }

    /**
     * Reset every STIX type to the default implementation class.
     */
    public static void resetToDefaultImplementation() {
        for (Stix2Type value : values()) {
            value.implementation = value.defaultImplementation;
        }
    }

    @Override
    public String toString() {
        return toJsonString();
    }


}