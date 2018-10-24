package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.sdos.AttackPattern;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.Stix2Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 *
 */
class AttackPatternTest {

    private static final String PATH = "reference/attack_pattern.json";
    private static AttackPattern attackPattern;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        attackPattern = Stix2Gson.DEBUG.fromJson(jsonString, AttackPattern.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.ATTACK_PATTERN, attackPattern.getType());
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
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, attackPattern.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, attackPattern.getModified());
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
        Assertions.assertNotNull(attackPattern.getGranularMarkings());
        Assertions.assertEquals(0, attackPattern.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(attackPattern.getObjectMarkingRefs());
        Assertions.assertEquals(0, attackPattern.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(attackPattern.getLabels());
        Assertions.assertEquals(0, attackPattern.getLabels().size());
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
        Assertions.assertNotNull(attackPattern.getGranularMarkings());
        Assertions.assertNotNull(attackPattern.getObjectMarkingRefs());
        Assertions.assertNotNull(attackPattern.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        AttackPattern createdAttackPattern = new AttackPattern(
            TestConstants.ATTACK_PATTERN_ID,
            "Spear Phishing",
            "...",
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        createdAttackPattern.getExternalReferences().add(new ExternalReference("capec", "CAPEC-163"));
        Assertions.assertNotNull(createdAttackPattern);
        String created = Stix2Gson.DEBUG.toJson(createdAttackPattern);
        String jsonString = TestUtil.readResourceFile(PATH);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof AttackPattern);
    }
}
