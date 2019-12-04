package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.observables.File;
import eu.csaware.stix2.sdos.ObservedData;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.Stix2Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
class ObservedDataTest {

    private static final String PATH = "reference/observed_data.json";
    private static final String PATH_EMPTY_MAP = "reference/observed_data_empty_map.json";
    private static ObservedData observedData;

    @BeforeAll
    static void setUp() throws Exception {
        observedData = Stix2Gson.DEBUG.fromJson(TestUtil.readResourceFile(PATH), ObservedData.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.OBSERVED_DATA, observedData.getType());
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
    void testObservables() {
        Map<String, TypedStixObject> objects = observedData.getObjects();
        Assertions.assertNotNull(objects);
        Assertions.assertEquals(1, observedData.getObjects().size());
        for (TypedStixObject typedStixObject : objects.values()) {
            Assertions.assertNotNull(typedStixObject);
            Assertions.assertTrue(typedStixObject instanceof File);
        }
    }

    @Test
    void testFileObservable() {
        TypedStixObject typedStixObject = observedData.getObjects().values().iterator().next();
        Assertions.assertNotNull(typedStixObject);
        Assertions.assertTrue(typedStixObject instanceof File);
        File file = (File) typedStixObject;
        Assertions.assertEquals("foo.exe", file.getName());
    }

    @Test
    void testNullSafety() {
        ObservedData observedData = new ObservedData();
        Assertions.assertNotNull(observedData.getGranularMarkings());
        Assertions.assertNotNull(observedData.getObjectMarkingRefs());
        Assertions.assertNotNull(observedData.getLabels());
        Assertions.assertNotNull(observedData.getObjects());
    }

    @Test
    void testCreation() throws IOException {
        HashMap<String, TypedStixObject> objects = new HashMap<>();

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
        String created = Stix2Gson.DEBUG.toJson(observedData);
        String reserialized = Stix2Gson.DEBUG.toJson(ObservedDataTest.observedData);
        Assertions.assertEquals(reserialized, created);
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testSerializationOfEmptyMap() throws IOException {
        ObservedData observedData = new ObservedData(
            TestConstants.OBSERVED_DATA_ID,
            TestConstants.DATE_TIME_FIRST_OBSERVED,
            TestConstants.DATE_TIME_LAST_OBSERVED,
            50,
            new HashMap<>(),
            TestConstants.IDENTITY_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(observedData);
        String created = Stix2Gson.DEBUG.toJson(observedData);
        String jsonString = TestUtil.readResourceFile(PATH_EMPTY_MAP);
        TestUtil.writeSerializedOutputFile(PATH_EMPTY_MAP, created);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof ObservedData);
    }
}
