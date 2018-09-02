package eu.csaware.stix2.extension;

import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Bundle;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.observables.Process;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

/**
 *
 */
public class CSAwareConstants {

    /**
     * Custom RuntimeTypeAdapterFactory with STIX 2 extension classes specific to CS-Aware
     */
    static final RuntimeTypeAdapterFactory<TypedStixObject> RUNTIME_TYPE_ADAPTER_FACTORY = com.google.gson.typeadapters.RuntimeTypeAdapterFactory
        .of(TypedStixObject.class, "type")
        .registerSubtype(Bundle.class, Types.BUNDLE_TYPE)
        //Core
        .registerSubtype(AttackPattern.class, Types.ATTACK_PATTERN_TYPE)
        .registerSubtype(Campaign.class, Types.CAMPAIGN_TYPE)
        .registerSubtype(CourseOfAction.class, Types.COURSE_OF_ACTION_TYPE)
        .registerSubtype(Identity.class, Types.IDENTITY_TYPE)
        .registerSubtype(Indicator.class, Types.INDICATOR_TYPE)
        .registerSubtype(IntrusionSet.class, Types.INTRUSION_SET_TYPE)
        .registerSubtype(Malware.class, Types.MALWARE_TYPE)
        .registerSubtype(ObservedData.class, Types.OBSERVED_DATA_TYPE)
        .registerSubtype(Report.class, Types.REPORT_TYPE)
        .registerSubtype(ThreatActor.class, Types.THREAT_ACTOR_TYPE)
        .registerSubtype(Relationship.class, Types.RELATIONSHIP_TYPE)
        .registerSubtype(Sighting.class, Types.SIGHTING_TYPE)
        .registerSubtype(Tool.class, Types.TOOL_TYPE)
        .registerSubtype(CSAwareVulnerability.class, Types.VULNERABILITY_TYPE)
        //CyberObservableCore
        .registerSubtype(Artifact.class, Types.ARTIFACT_TYPE)
        .registerSubtype(AutonomousSystem.class, Types.AUTONOMOUS_SYSTEM_TYPE)
        .registerSubtype(Directory.class, Types.DIRECTORY_TYPE)
        .registerSubtype(DomainName.class, Types.DOMAIN_NAME_TYPE)
        .registerSubtype(EmailAddr.class, Types.EMAIL_ADDR_TYPE)
        .registerSubtype(EmailMessage.class, Types.EMAIL_MESSAGE_TYPE)
        .registerSubtype(File.class, Types.FILE_TYPE)
        .registerSubtype(Ipv4Addr.class, Types.IPV4_ADDR_TYPE)
        .registerSubtype(Ipv6Addr.class, Types.IPV6_ADDR_TYPE)
        .registerSubtype(MacAddr.class, Types.MAC_ADDR_TYPE)
        .registerSubtype(Mutex.class, Types.MUTEX_TYPE)
        .registerSubtype(NetworkTraffic.class, Types.NETWORK_TRAFFIC_TYPE)
        .registerSubtype(Process.class, Types.PROCESS)
        .registerSubtype(Software.class, Types.SOFTWARE_TYPE)
        .registerSubtype(Url.class, Types.URL_TYPE)
        .registerSubtype(UserAccount.class, Types.USER_ACCOUNT_TYPE)
        .registerSubtype(WindowsRegistryKey.class, Types.WINDOWS_REGISTRY_KEY_TYPE)
        .registerSubtype(X509Certificate.class, Types.X_509_CERTIFICATE);

}
