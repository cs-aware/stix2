package eu.csaware.stix2.common;

import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

import java.lang.Process;

/**
 * Represent the type of a STIX 2 object in Java as a type-safe enum with
 * Gson serialisation support.
 */
public enum Stix2Type {
    @SerializedName("attack-pattern") ATTACK_PATTERN("attack-pattern", AttackPattern.class),
    @SerializedName("campaign") CAMPAIGN("campaign", Campaign.class),
    @SerializedName("course-of-action") COURSE_OF_ACTION("course-of-action", CourseOfAction.class),
    @SerializedName("identity") IDENTITY("identity", Identity.class),
    @SerializedName("indicator") INDICATOR("indicator", Indicator.class),
    @SerializedName("intrusion-set") INTRUSION_SET("intrusion-set", IntrusionSet.class),
    @SerializedName("malware") MALWARE("malware", Malware.class),
    @SerializedName("observed-data") OBSERVED_DATA("observed-data", ObservedData.class),
    @SerializedName("report") REPORT("report", Report.class),
    @SerializedName("threat-actor") THREAT_ACTOR("threat-actor", ThreatActor.class),
    @SerializedName("tool") TOOL("tool", Tool.class),
    @SerializedName("vulnerability") VULNERABILITY("vulnerability", Vulnerability.class),
    @SerializedName("relationship") RELATIONSHIP("relationship", Relationship.class),
    @SerializedName("sighting") SIGHTING("sighting", Sighting.class),
    @SerializedName("bundle") BUNDLE("bundle", Bundle.class),
    @SerializedName("marking-definition") MARKING_DEFINITION("marking-definition", MarkingDefinition.class),
    @SerializedName("artifact") ARTIFACT("artifact", Artifact.class),
    @SerializedName("autonomous-system") AUTONOMOUS_SYSTEM("autonomous-system", AutonomousSystem.class),
    @SerializedName("directory") DIRECTORY("directory", Directory.class),
    @SerializedName("domain-name") DOMAIN_NAME("domain-name", DomainName.class),
    @SerializedName("email-addr") EMAIL_ADDR("email-addr", EmailAddr.class),
    @SerializedName("email-message") EMAIL_MESSAGE("email-message", EmailMessage.class),
    @SerializedName("file") FILE("file", File.class),
    @SerializedName("ipv4-addr") IPV4_ADDR("ipv4-addr", Ipv4Addr.class),
    @SerializedName("ipv6-addr") IPV6_ADDR("ipv6-addr", Ipv6Addr.class),
    @SerializedName("mac-addr") MAC_ADDR("mac-addr", MacAddr.class),
    @SerializedName("mutex") MUTEX("mutex", Mutex.class),
    @SerializedName("network-traffic") NETWORK_TRAFFIC("network-traffic", NetworkTraffic.class),
    @SerializedName("process") PROCESS("process", Process.class),
    @SerializedName("software") SOFTWARE("software", Software.class),
    @SerializedName("url") URL("url", Url.class),
    @SerializedName("user-account") USER_ACCOUNT("user-account", UserAccount.class),
    @SerializedName("windows-registry-key") WINDOWS_REGISTRY_KEY("windows-registry-key", WindowsRegistryKey.class),
    @SerializedName("x509-certificate") X_509_CERTIFICATE("x509-certificate", X509Certificate.class);

    private final String jsonString;
    private Class implementation;

    Stix2Type(String stixType, Class implementation) {
        this.jsonString = stixType;
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

    public Class getImplementation() {
        return implementation;
    }

    public void setImplementation(Class implementation) {
        this.implementation = implementation;
    }

    @Override
    public String toString() {
        return toJsonString();
    }


}