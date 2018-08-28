package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.OpenVocabularyDefaults;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.Identity;
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
class IdentityTest {

    private static final String PATH = "reference/identity.json";
    private static Identity identity;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        identity = Stix2Gson.DEBUG.fromJson(jsonString, Identity.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.IDENTITY_TYPE, identity.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, identity.getId());
    }

    @Test
    void testIdentityClass() {
        Assertions.assertEquals(OpenVocabularyDefaults.IDENTITY_CLASS_INDIVIDUAL, identity.getIdentityClass());
    }

    @Test
    void testName() {
        Assertions.assertEquals("John Smith", identity.getName());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, identity.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, identity.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertNull(identity.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(identity.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(identity.getGranularMarkings());
        Assertions.assertEquals(0, identity.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(identity.getObjectMarkingRefs());
        Assertions.assertEquals(0, identity.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(identity.getLabels());
        Assertions.assertEquals(0, identity.getLabels().size());
    }

    @Test
    void testNullSafety() {
        Identity identity = new Identity();
        Assertions.assertNotNull(identity.getSectors());
        Assertions.assertNotNull(identity.getGranularMarkings());
        Assertions.assertNotNull(identity.getObjectMarkingRefs());
        Assertions.assertNotNull(identity.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        Identity identity = new Identity(
            TestConstants.IDENTITY_ID,
            "John Smith",
            OpenVocabularyDefaults.IDENTITY_CLASS_INDIVIDUAL,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(identity);
        String created = Stix2Gson.DEBUG.toJson(identity);
        String jsonString = TestUtil.readResourceFile(PATH);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Identity);
    }
}
