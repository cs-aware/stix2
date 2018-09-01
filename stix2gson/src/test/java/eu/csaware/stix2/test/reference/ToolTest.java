package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.OpenVocabularyDefaults;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.Tool;
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
class ToolTest {

    private static final String PATH = "reference/tool.json";
    private static Tool tool;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        tool = Stix2Gson.DEBUG.fromJson(jsonString, Tool.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.TOOL_TYPE, tool.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.TOOL_ID, tool.getId());
    }

    @Test
    void testName() {
        Assertions.assertEquals("VNC", tool.getName());
    }

    @Test
    void testDescription() {
        Assertions.assertNull(tool.getDescription());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, tool.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, tool.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, tool.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(tool.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(tool.getGranularMarkings());
        Assertions.assertEquals(0, tool.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(tool.getObjectMarkingRefs());
        Assertions.assertEquals(0, tool.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(tool.getLabels());
        Assertions.assertEquals(1, tool.getLabels().size());
        String label = tool.getLabels().get(0);
        Assertions.assertEquals(OpenVocabularyDefaults.TOOL_LABEL_REMOTE_ACCESS, label);
    }

    @Test
    void testNullSafety() {
        Tool tool = new Tool();
        Assertions.assertNotNull(tool.getKillChainPhases());
        Assertions.assertNotNull(tool.getGranularMarkings());
        Assertions.assertNotNull(tool.getObjectMarkingRefs());
        Assertions.assertNotNull(tool.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        List<String> labels = Collections.singletonList(OpenVocabularyDefaults.TOOL_LABEL_REMOTE_ACCESS);
        Tool tool = new Tool(
            TestConstants.TOOL_ID,
            labels,
            "VNC",
            TestConstants.IDENTITY_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(tool);
        String created = Stix2Gson.DEBUG.toJson(tool);
        String jsonString = TestUtil.readResourceFile(PATH);
        TestUtil.writeSerializedOutputFile(PATH, created);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Tool);
    }
}
