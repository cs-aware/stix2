package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.AttackPattern;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.GsonSingleton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 */
class AttackPatternTest {

    private static final String PATH = "reference/attack_pattern.json";
    private static AttackPattern attackPattern;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);

        attackPattern = GsonSingleton.DEBUG.fromJson(jsonString, AttackPattern.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void writeToFile() throws Exception {
        String content = GsonSingleton.DEBUG.toJson(attackPattern);
        TestUtil.writeSerializedOutputFile(PATH, content);
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.ATTACK_PATTERS_TYPE, attackPattern.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.ATTACK_PATTERN_ID, attackPattern.getId());
    }

    @Test
    void testName() {
        Assertions.assertEquals("Spear Phishing", attackPattern.getName());
    }

    @Test
    void testDescription() {
        Assertions.assertEquals("...", attackPattern.getDescription());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME, attackPattern.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME, attackPattern.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertNull(attackPattern.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(attackPattern.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNull(attackPattern.getGranularMarkings());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNull(attackPattern.getObjectMarkingRefs());
    }

    @Test
    void testLabels() {
        Assertions.assertNull(attackPattern.getLabels());
    }

    @Test
    void testExternalReference() {
        Assertions.assertNotNull(attackPattern.getExternalReferences());
        Assertions.assertEquals(1, attackPattern.getExternalReferences().size());
    }

    @Test
    void testExternalReferenceSourceName() {
        Assertions.assertEquals("capec", attackPattern.getExternalReferences().get(0).getSourceName());
    }

    @Test
    void testExternalReferenceExternalId() {
        Assertions.assertEquals("CAPEC-163", attackPattern.getExternalReferences().get(0).getExternalId());
    }

    @Test
    void testExternalReferenceDescription() {
        Assertions.assertNull(attackPattern.getExternalReferences().get(0).getDescription());
    }

    @Test
    void testExternalReferenceUrl() {
        Assertions.assertNull(attackPattern.getExternalReferences().get(0).getUrl());
    }

    @Test
    void testExternalReferenceHashes() {
        Assertions.assertNull(attackPattern.getExternalReferences().get(0).getHashes());
    }

    @Test
    void testNullSafety() {
        AttackPattern attackPattern = new AttackPattern();
        Assertions.assertNotNull(attackPattern.getKillChainPhases());
    }

}
