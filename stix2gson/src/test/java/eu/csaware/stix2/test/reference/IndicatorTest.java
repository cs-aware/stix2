package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.OpenVocabularyDefaults;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.Indicator;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.GsonSingleton;
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
class IndicatorTest {

    private static final String PATH = "reference/indicator.json";
    private static Indicator indicator;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        indicator = GsonSingleton.DEBUG.fromJson(jsonString, Indicator.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.INDICATOR_TYPE, indicator.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.INDICATOR_ID, indicator.getId());
    }

    @Test
    void testPattern() {
        Assertions.assertEquals("[file:hashes.MD5 = 'd41d8cd98f00b204e9800998ecf8427e']", indicator.getPattern());
    }

    @Test
    void testValidFrom() {
        Assertions.assertEquals(TestConstants.DATE_TIME_EXTRA, indicator.getValidFrom());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, indicator.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, indicator.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertNull(indicator.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(indicator.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(indicator.getGranularMarkings());
        Assertions.assertEquals(0, indicator.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(indicator.getObjectMarkingRefs());
        Assertions.assertEquals(0, indicator.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(indicator.getLabels());
        Assertions.assertEquals(1, indicator.getLabels().size());
        String label = indicator.getLabels().get(0);
        Assertions.assertEquals(OpenVocabularyDefaults.INDICATOR_LABEL_MALICIOUS_ACTIVITY, label);
    }

    @Test
    void testNullSafety() {
        Indicator indicator = new Indicator();
        Assertions.assertNotNull(indicator.getKillChainPhases());
        Assertions.assertNotNull(indicator.getGranularMarkings());
        Assertions.assertNotNull(indicator.getObjectMarkingRefs());
        Assertions.assertNotNull(indicator.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        List<String> labels = Collections.singletonList(OpenVocabularyDefaults.INDICATOR_LABEL_MALICIOUS_ACTIVITY);
        Indicator indicator = new Indicator(
            TestConstants.INDICATOR_ID,
            labels,
            "[file:hashes.MD5 = 'd41d8cd98f00b204e9800998ecf8427e']",
            TestConstants.DATE_TIME_EXTRA,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(indicator);
        String created = GsonSingleton.DEBUG.toJson(indicator);
        String jsonString = TestUtil.readResourceFile(PATH);
        TestUtil.writeSerializedOutputFile(PATH, created);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = GsonSingleton.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Indicator);
    }
}
