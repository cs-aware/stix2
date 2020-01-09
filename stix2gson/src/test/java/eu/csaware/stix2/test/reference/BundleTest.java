package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.*;
import eu.csaware.stix2.sdos.Indicator;
import eu.csaware.stix2.sdos.Malware;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.Stix2Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
class BundleTest {

    private static final String PATH = "reference/bundle.json";
    private static Bundle bundle;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        bundle = Stix2Gson.DEBUG.fromJson(jsonString, Bundle.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.BUNDLE, bundle.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.BUNDLE_ID, bundle.getId());
    }

    @Test
    void testSpecVersion() {
        Assertions.assertEquals("2.0", bundle.getSpecVersion());
    }

    @Test
    void testObjectsSize() {
        Assertions.assertNotNull(bundle.getObjects());
        Assertions.assertEquals(3, bundle.getObjects().size());
    }

    @Test
    void testIndicatorType() {
        TypedStixObject indicator = bundle.getObjects().get(0);
        Assertions.assertNotNull(indicator);
        Assertions.assertTrue(indicator instanceof Indicator);
    }

    @Test
    void testMalwareType() {
        TypedStixObject malware = bundle.getObjects().get(1);
        Assertions.assertNotNull(malware);
        Assertions.assertTrue(malware instanceof Malware);
    }

    @Test
    void testRelationshipType() {
        TypedStixObject indicator = bundle.getObjects().get(2);
        Assertions.assertNotNull(indicator);
        Assertions.assertTrue(indicator instanceof Relationship);
    }

    @Test
    void testIndicatorId() {
        Indicator indicator = (Indicator) bundle.getObjects().get(0);
        Assertions.assertEquals(TestConstants.INDICATOR_ID, indicator.getId());
    }

    @Test
    void testMalwareId() {
        Malware malware = (Malware) bundle.getObjects().get(1);
        Assertions.assertEquals(TestConstants.MALWARE_ID, malware.getId());
    }

    @Test
    void testRelationshipId() {
        Relationship relationship = (Relationship) bundle.getObjects().get(2);
        Assertions.assertEquals(TestConstants.RELATIONSHIP_ID, relationship.getId());
    }

    @Test
    void testNullSafety() {
        Bundle bundle = new Bundle();
        Assertions.assertNotNull(bundle.getObjects());
    }

    @Test
    void testCreation() throws IOException {
        List<String> labelsIndicator = Collections.singletonList(OpenVocabularyDefaults.INDICATOR_LABEL_MALICIOUS_ACTIVITY);
        Indicator indicator = new Indicator(
            TestConstants.INDICATOR_UUID,
            labelsIndicator,
            "[file:hashes.MD5 = 'd41d8cd98f00b204e9800998ecf8427e']",
            TestConstants.DATE_TIME_EXTRA,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        List<String> labelsMalware = Collections.singletonList(OpenVocabularyDefaults.MALWARE_LABEL_RANSOMWARE);
        Malware malware = new Malware(
            TestConstants.MALWARE_UUID,
            labelsMalware,
            "Cryptolocker",
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Relationship relationship = new Relationship(
            TestConstants.RELATIONSHIP_UUID,
            Relationship.TYPE_INDICATES,
            TestConstants.INDICATOR_ID,
            TestConstants.MALWARE_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        List<TypedStixObject> objects = Arrays.asList(indicator, malware, relationship);
        Bundle bundle = new Bundle(
            TestConstants.BUNDLE_UUID,
            "2.0",
            objects
        );
        Assertions.assertNotNull(bundle);
        String created = Stix2Gson.DEBUG.toJson(bundle);
        String jsonString = TestUtil.readResourceFile(PATH);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Bundle);
    }
}
