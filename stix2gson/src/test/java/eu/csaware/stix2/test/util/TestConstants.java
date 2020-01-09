package eu.csaware.stix2.test.util;

import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.util.Stix2Util;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Constant used for test cases.
 */
public class TestConstants {

    public static LocalDateTime DATE_TIME_CREATED = LocalDateTime.of(2016, 5, 12, 8, 17, 27);
    public static LocalDateTime DATE_TIME_MODIFIED = LocalDateTime.of(2017, 3, 20, 1, 27, 32);
    public static LocalDateTime DATE_TIME_FIRST_OBSERVED = LocalDateTime.of(2011, 8, 1, 10, 30, 21);
    public static LocalDateTime DATE_TIME_LAST_OBSERVED = LocalDateTime.of(2012, 8, 1, 10, 30, 21);
    public static LocalDateTime DATE_TIME_EXTRA = LocalDateTime.of(2015, 8, 1, 10, 30, 21);

    public static UUID ATTACK_PATTERN_UUID = UUID.fromString("0c7b5b88-8ff7-4a4d-aa9d-feb398cd0061");
    public static String ATTACK_PATTERN_ID = Stix2Util.assembleId(Stix2Type.ATTACK_PATTERN, ATTACK_PATTERN_UUID);

    public static UUID BUNDLE_UUID = UUID.fromString("00000000-0000-4000-8000-000000000007");
    public static String BUNDLE_ID = Stix2Util.assembleId(Stix2Type.BUNDLE, BUNDLE_UUID);

    public static UUID CAMPAIGN_UUID = UUID.fromString("8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f");
    public static String CAMPAIGN_ID = Stix2Util.assembleId(Stix2Type.CAMPAIGN, CAMPAIGN_UUID);

    public static UUID COURSE_OF_ACTION_UUID = UUID.fromString("8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f");
    public static String COURSE_OF_ACTION_ID = Stix2Util.assembleId(Stix2Type.COURSE_OF_ACTION, COURSE_OF_ACTION_UUID);

    public static UUID IDENTITY_UUID = UUID.fromString("311b2d2d-f010-4473-83ec-1edf84858f4c");
    public static String IDENTITY_ID = Stix2Util.assembleId(Stix2Type.IDENTITY, IDENTITY_UUID);

    public static UUID INDICATOR_UUID = UUID.fromString("a740531e-63ff-4e49-a9e1-a0a3eed0e3e7");
    public static String INDICATOR_ID = Stix2Util.assembleId(Stix2Type.INDICATOR, INDICATOR_UUID);

    public static UUID INTRUSION_SET_UUID = UUID.fromString("4e78f46f-a023-4e5f-bc24-71b3ca22ec29");
    public static String INTRUSION_SET_ID = Stix2Util.assembleId(Stix2Type.INTRUSION_SET, INTRUSION_SET_UUID);

    public static UUID MALWARE_UUID = UUID.fromString("9c4638ec-f1de-4ddb-abf4-1b760417654e");
    public static String MALWARE_ID = Stix2Util.assembleId(Stix2Type.MALWARE, MALWARE_UUID);

    public static UUID MARKING_DEFINITION_UUID = UUID.fromString("613f2e26-407d-48c7-9eca-b8e91df99dc9");
    public static String MARKING_DEFINITION_ID = Stix2Util.assembleId(Stix2Type.MARKING_DEFINITION, MARKING_DEFINITION_UUID);

    public static UUID OBSERVED_DATA_UUID = UUID.fromString("b67d30ff-02ac-498a-92f9-32f845f448cf");
    public static String OBSERVED_DATA_ID = Stix2Util.assembleId(Stix2Type.OBSERVED_DATA, OBSERVED_DATA_UUID);

    public static UUID RELATIONSHIP_UUID = UUID.fromString("df7c87eb-75d2-4948-af81-9d49d246f301");
    public static String RELATIONSHIP_ID = Stix2Util.assembleId(Stix2Type.RELATIONSHIP, RELATIONSHIP_UUID);

    public static UUID REPORT_UUID = UUID.fromString("84e4d88f-44ea-4bcd-bbf3-b2c1c320bcb3");
    public static String REPORT_ID = Stix2Util.assembleId(Stix2Type.REPORT, REPORT_UUID);

    public static UUID SIGHTING_UUID = UUID.fromString("bfbc19db-ec35-4e45-beed-f8bde2a772fb");
    public static String SIGHTING_ID = Stix2Util.assembleId(Stix2Type.SIGHTING, SIGHTING_UUID);

    public static UUID THREAT_ACTOR_UUID = UUID.fromString("8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f");
    public static String THREAT_ACTOR_ID = Stix2Util.assembleId(Stix2Type.THREAT_ACTOR, THREAT_ACTOR_UUID);

    public static UUID TOOL_UUID = UUID.fromString("8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f");
    public static String TOOL_ID = Stix2Util.assembleId(Stix2Type.TOOL, TOOL_UUID);

    public static UUID VULNERABILITY_UUID = UUID.fromString("0c7b5b88-8ff7-4a4d-aa9d-feb398cd0061");
    public static String VULNERABILITY_ID = Stix2Util.assembleId(Stix2Type.VULNERABILITY, VULNERABILITY_UUID);
}
