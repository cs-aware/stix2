package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.observables.File;
import eu.csaware.stix2.sdos.Campaign;
import eu.csaware.stix2.sdos.ObservedData;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.GsonSingleton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

/**
 *
 */
class ObservedDataTest {

    private static final String PATH = "reference/observed_data.json";
    private static ObservedData observedData;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        observedData = GsonSingleton.DEBUG.fromJson(jsonString, ObservedData.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.OBSERVED_DATA_TYPE, observedData.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.OBSERVED_DATA_ID, observedData.getId());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, observedData.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, observedData.getModified());
    }

    @Test
    void testFirstObserved() {
        Assertions.assertEquals(TestConstants.DATE_TIME_FIRST_OBSERVED, observedData.getFirstObserved());
    }

    @Test
    void testLastObserved() {
        Assertions.assertEquals(TestConstants.DATE_TIME_LAST_OBSERVED, observedData.getLastObserved());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, observedData.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(observedData.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(observedData.getGranularMarkings());
        Assertions.assertEquals(0, observedData.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(observedData.getObjectMarkingRefs());
        Assertions.assertEquals(0, observedData.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(observedData.getLabels());
        Assertions.assertEquals(0, observedData.getLabels().size());
    }

    @Test
    void testNullSafety() {
        Campaign campaign = new Campaign();
        Assertions.assertNotNull(campaign.getGranularMarkings());
        Assertions.assertNotNull(campaign.getObjectMarkingRefs());
        Assertions.assertNotNull(campaign.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        HashMap<String, Object> objects = new HashMap<>();

        objects.put("0", new File("foo.exe"));

        ObservedData observedData = new ObservedData(
            TestConstants.OBSERVED_DATA_ID,
            TestConstants.DATE_TIME_FIRST_OBSERVED,
            TestConstants.DATE_TIME_LAST_OBSERVED,
            50,
            objects,
            TestConstants.IDENTITY_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(observedData);
        String created = GsonSingleton.DEBUG.toJson(observedData);
        String reserialized = GsonSingleton.DEBUG.toJson(ObservedDataTest.observedData);
        Assertions.assertEquals(reserialized, created);
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = GsonSingleton.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof ObservedData);
    }
}
