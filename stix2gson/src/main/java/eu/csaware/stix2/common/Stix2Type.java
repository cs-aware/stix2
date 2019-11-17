package eu.csaware.stix2.common;

import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.observables.Process;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represent the type of a STIX 2 object in Java as a type-safe enum with
 * Gson serialisation support.
 */
public class Stix2Type {

    @SerializedName("attack-pattern") public static Stix2Type ATTACK_PATTERN = new Stix2Type("attack-pattern", AttackPattern.class, AttackPattern.class);
    @SerializedName("campaign") public static Stix2Type CAMPAIGN = new Stix2Type("campaign", Campaign.class, Campaign.class);
    @SerializedName("course-of-action") public static Stix2Type COURSE_OF_ACTION = new Stix2Type("course-of-action", CourseOfAction.class, CourseOfAction.class);
    @SerializedName("identity") public static Stix2Type IDENTITY = new Stix2Type("identity", Identity.class, Identity.class);
    @SerializedName("indicator") public static Stix2Type INDICATOR = new Stix2Type("indicator", Indicator.class, Indicator.class);
    @SerializedName("intrusion-set") public static Stix2Type INTRUSION_SET = new Stix2Type("intrusion-set", IntrusionSet.class, IntrusionSet.class);
    @SerializedName("malware") public static Stix2Type MALWARE = new Stix2Type("malware", Malware.class, Malware.class);
    @SerializedName("observed-data") public static Stix2Type OBSERVED_DATA = new Stix2Type("observed-data", ObservedData.class, ObservedData.class);
    @SerializedName("report") public static Stix2Type REPORT = new Stix2Type("report", Report.class, Report.class);
    @SerializedName("threat-actor") public static Stix2Type THREAT_ACTOR = new Stix2Type("threat-actor", ThreatActor.class, ThreatActor.class);
    @SerializedName("tool") public static Stix2Type TOOL = new Stix2Type("tool", Tool.class, Tool.class);
    @SerializedName("vulnerability") public static Stix2Type VULNERABILITY = new Stix2Type("vulnerability", Vulnerability.class, Vulnerability.class);
    @SerializedName("relationship") public static Stix2Type RELATIONSHIP = new Stix2Type("relationship", Relationship.class, Relationship.class);
    @SerializedName("sighting") public static Stix2Type SIGHTING = new Stix2Type("sighting", Sighting.class, Sighting.class);
    @SerializedName("bundle") public static Stix2Type BUNDLE = new Stix2Type("bundle", Bundle.class, Bundle.class);
    @SerializedName("marking-definition") public static Stix2Type MARKING_DEFINITION = new Stix2Type("marking-definition", MarkingDefinition.class, MarkingDefinition.class);
    @SerializedName("artifact") public static Stix2Type ARTIFACT = new Stix2Type("artifact", Artifact.class, Artifact.class);
    @SerializedName("autonomous-system") public static Stix2Type AUTONOMOUS_SYSTEM = new Stix2Type("autonomous-system", AutonomousSystem.class, AutonomousSystem.class);
    @SerializedName("directory") public static Stix2Type DIRECTORY = new Stix2Type("directory", Directory.class, Directory.class);
    @SerializedName("domain-name") public static Stix2Type DOMAIN_NAME = new Stix2Type("domain-name", DomainName.class, DomainName.class);
    @SerializedName("email-addr") public static Stix2Type EMAIL_ADDR = new Stix2Type("email-addr", EmailAddr.class, EmailAddr.class);
    @SerializedName("email-message") public static Stix2Type EMAIL_MESSAGE = new Stix2Type("email-message", EmailMessage.class, EmailMessage.class);
    @SerializedName("file") public static Stix2Type FILE = new Stix2Type("file", File.class, File.class);
    @SerializedName("ipv4-addr") public static Stix2Type IPV4_ADDR = new Stix2Type("ipv4-addr", Ipv4Addr.class, Ipv4Addr.class);
    @SerializedName("ipv6-addr") public static Stix2Type IPV6_ADDR = new Stix2Type("ipv6-addr", Ipv6Addr.class, Ipv6Addr.class);
    @SerializedName("mac-addr") public static Stix2Type MAC_ADDR = new Stix2Type("mac-addr", MacAddr.class, MacAddr.class);
    @SerializedName("mutex") public static Stix2Type MUTEX = new Stix2Type("mutex", Mutex.class, Mutex.class);
    @SerializedName("network-traffic") public static Stix2Type NETWORK_TRAFFIC = new Stix2Type("network-traffic", NetworkTraffic.class, NetworkTraffic.class);
    @SerializedName("process") public static Stix2Type PROCESS = new Stix2Type("process", Process.class, Process.class);
    @SerializedName("software") public static Stix2Type SOFTWARE = new Stix2Type("software", Software.class, Software.class);
    @SerializedName("url") public static Stix2Type URL = new Stix2Type("url", Url.class, Url.class);
    @SerializedName("user-account") public static Stix2Type USER_ACCOUNT = new Stix2Type("user-account", UserAccount.class, UserAccount.class);
    @SerializedName("windows-registry-key") public static Stix2Type WINDOWS_REGISTRY_KEY = new Stix2Type("windows-registry-key", WindowsRegistryKey.class, WindowsRegistryKey.class);
    @SerializedName("x509-certificate") public static Stix2Type X_509_CERTIFICATE = new Stix2Type("x509-certificate", X509Certificate.class, X509Certificate.class);

    public static List<Stix2Type> TYPES = new ArrayList<>(List.of(
        ATTACK_PATTERN,
        CAMPAIGN,
        COURSE_OF_ACTION,
        IDENTITY,
        INDICATOR,
        INTRUSION_SET,
        MALWARE,
        OBSERVED_DATA,
        REPORT,
        THREAT_ACTOR,
        TOOL,
        VULNERABILITY,
        RELATIONSHIP,
        SIGHTING,
        BUNDLE,
        MARKING_DEFINITION,
        ARTIFACT,
        AUTONOMOUS_SYSTEM,
        DIRECTORY,
        DOMAIN_NAME,
        EMAIL_ADDR,
        EMAIL_MESSAGE,
        FILE,
        IPV4_ADDR,
        IPV6_ADDR,
        MAC_ADDR,
        MUTEX,
        NETWORK_TRAFFIC,
        PROCESS,
        SOFTWARE,
        URL,
        USER_ACCOUNT,
        WINDOWS_REGISTRY_KEY,
        X_509_CERTIFICATE
    ));

    private final String jsonString;
    private final Class<? extends TypedStixObject> defaultImplementation;
    private Class<? extends TypedStixObject> implementation; // not final to allow changing the implementation dynamically


    public Stix2Type(String stixType, Class<? extends TypedStixObject> defaultImplementation, Class<? extends TypedStixObject> implementation) {
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
        for (Stix2Type value : TYPES) {
            if (value.jsonString.equals(type))
                return value;
        }
        return null;
    }

    /**
     * Convert from the implementation class to the Java enum type.
     */
    public static Stix2Type fromImplementation(Class implementation) {
        for (Stix2Type value : TYPES) {
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
        for (Stix2Type value : TYPES) {
            value.implementation = value.defaultImplementation;
        }
    }

    @Override
    public String toString() {
        return toJsonString();
    }


}