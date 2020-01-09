package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.sros.Relationship;
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
class RelationshipTest {

    private static final String PATH = "reference/relationship.json";
    private static Relationship relationship;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        relationship = Stix2Gson.DEBUG.fromJson(jsonString, Relationship.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.RELATIONSHIP, relationship.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.RELATIONSHIP_ID, relationship.getId());
    }

    @Test
    void testRelationshipType() {
        Assertions.assertEquals(Relationship.TYPE_INDICATES, relationship.getRelationshipType());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, relationship.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, relationship.getModified());
    }

    @Test
    void testSourceRef() {
        Assertions.assertEquals(TestConstants.INDICATOR_ID, relationship.getSourceRef());
    }

    @Test
    void testTargetRef() {
        Assertions.assertEquals(TestConstants.MALWARE_ID, relationship.getTargetRef());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertNull(relationship.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(relationship.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(relationship.getGranularMarkings());
        Assertions.assertEquals(0, relationship.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(relationship.getObjectMarkingRefs());
        Assertions.assertEquals(0, relationship.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(relationship.getLabels());
        Assertions.assertEquals(0, relationship.getLabels().size());
    }

    @Test
    void testNullSafety() {
        Relationship relationship = new Relationship();
        Assertions.assertNotNull(relationship.getGranularMarkings());
        Assertions.assertNotNull(relationship.getObjectMarkingRefs());
        Assertions.assertNotNull(relationship.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        Relationship relationship = new Relationship(
            TestConstants.RELATIONSHIP_UUID,
            Relationship.TYPE_INDICATES,
            TestConstants.INDICATOR_ID,
            TestConstants.MALWARE_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(relationship);
        String created = Stix2Gson.DEBUG.toJson(relationship);
        String jsonString = TestUtil.readResourceFile(PATH);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Relationship);
    }
}
