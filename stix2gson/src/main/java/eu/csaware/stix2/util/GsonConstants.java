package eu.csaware.stix2.util;

import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

/**
 *
 */
class GsonConstants {

    static final RuntimeTypeAdapterFactory<Core> RUNTIME_TYPE_ADAPTER_FACTORY = com.google.gson.typeadapters.RuntimeTypeAdapterFactory
        .of(Core.class, "type")
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
        .registerSubtype(Vulnerability.class, Types.VULNERABILITY_TYPE);

    static final RuntimeTypeAdapterFactory<Core> coreTypeAdptor = RuntimeTypeAdapterFactory
        .of(Core.class, "type")
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
        .registerSubtype(Vulnerability.class, Types.VULNERABILITY_TYPE);

}
