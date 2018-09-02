package eu.csaware.stix2.util;

import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Bundle;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.observables.Process;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

/**
 *
 */
class GsonConstants {

    /**
     * Default RuntimeTypeAdapterFactory for standard compliant STIX 2 classes
     */
    static final RuntimeTypeAdapterFactory<TypedStixObject> RUNTIME_TYPE_ADAPTER_FACTORY = com.google.gson.typeadapters.RuntimeTypeAdapterFactory
        .of(TypedStixObject.class, "type")
        .registerSubtype(Bundle.class, Stix2Type.BUNDLE.toJsonString())
        //Core
        .registerSubtype(AttackPattern.class, Stix2Type.ATTACK_PATTERN.toJsonString())
        .registerSubtype(Campaign.class, Stix2Type.CAMPAIGN.toJsonString())
        .registerSubtype(CourseOfAction.class, Stix2Type.COURSE_OF_ACTION.toJsonString())
        .registerSubtype(Identity.class, Stix2Type.IDENTITY.toJsonString())
        .registerSubtype(Indicator.class, Stix2Type.INDICATOR.toJsonString())
        .registerSubtype(IntrusionSet.class, Stix2Type.INTRUSION_SET.toJsonString())
        .registerSubtype(Malware.class, Stix2Type.MALWARE.toJsonString())
        .registerSubtype(ObservedData.class, Stix2Type.OBSERVED_DATA.toJsonString())
        .registerSubtype(Report.class, Stix2Type.REPORT.toJsonString())
        .registerSubtype(ThreatActor.class, Stix2Type.THREAT_ACTOR.toJsonString())
        .registerSubtype(Relationship.class, Stix2Type.RELATIONSHIP.toJsonString())
        .registerSubtype(Sighting.class, Stix2Type.SIGHTING.toJsonString())
        .registerSubtype(Tool.class, Stix2Type.TOOL.toJsonString())
        .registerSubtype(Vulnerability.class, Stix2Type.VULNERABILITY.toJsonString())
        //CyberObservableCore
        .registerSubtype(Artifact.class, Stix2Type.ARTIFACT.toJsonString())
        .registerSubtype(AutonomousSystem.class, Stix2Type.AUTONOMOUS_SYSTEM.toJsonString())
        .registerSubtype(Directory.class, Stix2Type.DIRECTORY.toJsonString())
        .registerSubtype(DomainName.class, Stix2Type.DOMAIN_NAME.toJsonString())
        .registerSubtype(EmailAddr.class, Stix2Type.EMAIL_ADDR.toJsonString())
        .registerSubtype(EmailMessage.class, Stix2Type.EMAIL_MESSAGE.toJsonString())
        .registerSubtype(File.class, Stix2Type.FILE.toJsonString())
        .registerSubtype(Ipv4Addr.class, Stix2Type.IPV4_ADDR.toJsonString())
        .registerSubtype(Ipv6Addr.class, Stix2Type.IPV6_ADDR.toJsonString())
        .registerSubtype(MacAddr.class, Stix2Type.MAC_ADDR.toJsonString())
        .registerSubtype(Mutex.class, Stix2Type.MUTEX.toJsonString())
        .registerSubtype(NetworkTraffic.class, Stix2Type.NETWORK_TRAFFIC.toJsonString())
        .registerSubtype(Process.class, Stix2Type.PROCESS.toJsonString())
        .registerSubtype(Software.class, Stix2Type.SOFTWARE.toJsonString())
        .registerSubtype(Url.class, Stix2Type.URL.toJsonString())
        .registerSubtype(UserAccount.class, Stix2Type.USER_ACCOUNT.toJsonString())
        .registerSubtype(WindowsRegistryKey.class, Stix2Type.WINDOWS_REGISTRY_KEY.toJsonString())
        .registerSubtype(X509Certificate.class, Stix2Type.X_509_CERTIFICATE.toJsonString());

}
