package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.sros.Sighting;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.Stix2Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 *
 */
class SightingTest {

    private static final String PATH = "reference/sighting.json";
    private static Sighting sighting;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        sighting = Stix2Gson.DEBUG.fromJson(jsonString, Sighting.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.SIGHTING, sighting.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.SIGHTING_ID, sighting.getId());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, sighting.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, sighting.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertNull(sighting.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(sighting.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(sighting.getGranularMarkings());
        Assertions.assertEquals(0, sighting.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(sighting.getObjectMarkingRefs());
        Assertions.assertEquals(0, sighting.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(sighting.getLabels());
        Assertions.assertEquals(0, sighting.getLabels().size());
    }

    @Test
    void testObjectRefs() {
        Assertions.assertNotNull(sighting.getWhereSightedRefs());
        Assertions.assertEquals(1, sighting.getWhereSightedRefs().size());
        Assertions.assertEquals(TestConstants.IDENTITY_ID, sighting.getWhereSightedRefs().get(0));
    }

    @Test
    void testNullSafety() {
        Sighting sighting = new Sighting();
        Assertions.assertNotNull(sighting.getWhereSightedRefs());
        Assertions.assertNotNull(sighting.getObservedDataRefs());
        Assertions.assertNotNull(sighting.getGranularMarkings());
        Assertions.assertNotNull(sighting.getObjectMarkingRefs());
        Assertions.assertNotNull(sighting.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        List<String> whereSightedRefs = Collections.singletonList(TestConstants.IDENTITY_ID);
        Sighting report = new Sighting(
            TestConstants.SIGHTING_ID,
            TestConstants.INDICATOR_ID,
            whereSightedRefs,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(report);
        String created = Stix2Gson.DEBUG.toJson(report);
        String jsonString = TestUtil.readResourceFile(PATH);
        TestUtil.writeSerializedOutputFile(PATH, created);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Sighting);
    }
}
