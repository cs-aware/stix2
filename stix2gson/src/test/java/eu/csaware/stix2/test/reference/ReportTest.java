package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.OpenVocabularyDefaults;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.Report;
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
class ReportTest {

    private static final String PATH = "reference/report.json";
    private static Report report;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        report = Stix2Gson.DEBUG.fromJson(jsonString, Report.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.REPORT_TYPE, report.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.REPORT_ID, report.getId());
    }

    @Test
    void testName() {
        Assertions.assertEquals("The Black Vine Cyberespionage Group", report.getName());
    }

    @Test
    void testDescription() {
        Assertions.assertEquals("A simple report with an indicator and campaign", report.getDescription());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, report.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, report.getModified());
    }

    @Test
    void testPublished() {
        Assertions.assertEquals(TestConstants.DATE_TIME_EXTRA, report.getPublished());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, report.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(report.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(report.getGranularMarkings());
        Assertions.assertEquals(0, report.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(report.getObjectMarkingRefs());
        Assertions.assertEquals(0, report.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(report.getLabels());
        Assertions.assertEquals(1, report.getLabels().size());
        Assertions.assertEquals(OpenVocabularyDefaults.REPORT_LABEL_CAMPAIGN, report.getLabels().get(0));
    }

    @Test
    void testObjectRefs() {
        Assertions.assertNotNull(report.getObjectRefs());
        Assertions.assertEquals(3, report.getObjectRefs().size());
        Assertions.assertEquals(TestConstants.INDICATOR_ID, report.getObjectRefs().get(0));
        Assertions.assertEquals(TestConstants.CAMPAIGN_ID, report.getObjectRefs().get(1));
        Assertions.assertEquals(TestConstants.RELATIONSHIP_ID, report.getObjectRefs().get(2));
    }

    @Test
    void testNullSafety() {
        Report report = new Report();
        Assertions.assertNotNull(report.getObjectRefs());
        Assertions.assertNotNull(report.getGranularMarkings());
        Assertions.assertNotNull(report.getObjectMarkingRefs());
        Assertions.assertNotNull(report.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        List<String> labels = Collections.singletonList(OpenVocabularyDefaults.REPORT_LABEL_CAMPAIGN);
        List<String> objectsRefs = Arrays.asList(TestConstants.INDICATOR_ID, TestConstants.CAMPAIGN_ID, TestConstants.RELATIONSHIP_ID);
        Report report = new Report(
            TestConstants.REPORT_ID,
            labels,
            "The Black Vine Cyberespionage Group",
            "A simple report with an indicator and campaign",
            TestConstants.DATE_TIME_EXTRA,
            objectsRefs,
            TestConstants.IDENTITY_ID,
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
        Assertions.assertTrue(core instanceof Report);
    }
}
