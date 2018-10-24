package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.sdos.IntrusionSet;
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
class IntrusionSetTest {

    private static final String PATH = "reference/intrusion_set.json";
    private static IntrusionSet intrusionSet;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        intrusionSet = Stix2Gson.DEBUG.fromJson(jsonString, IntrusionSet.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.INTRUSION_SET, intrusionSet.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.INTRUSION_SET_ID, intrusionSet.getId());
    }

    @Test
    void testName() {
        Assertions.assertEquals("Bobcat Breakin", intrusionSet.getName());
    }

    @Test
    void testDescription() {
        Assertions.assertEquals("Incidents usually feature a shared TTP of a bobcat being released...", intrusionSet.getDescription());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, intrusionSet.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, intrusionSet.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, intrusionSet.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(intrusionSet.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(intrusionSet.getGranularMarkings());
        Assertions.assertEquals(0, intrusionSet.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(intrusionSet.getObjectMarkingRefs());
        Assertions.assertEquals(0, intrusionSet.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(intrusionSet.getLabels());
        Assertions.assertEquals(0, intrusionSet.getLabels().size());
    }

    @Test
    void testAliases() {
        Assertions.assertNotNull(intrusionSet.getAliases());
        Assertions.assertEquals(1, intrusionSet.getAliases().size());
        Assertions.assertEquals("Zookeeper", intrusionSet.getAliases().get(0));
    }

    @Test
    void testGoals() {
        Assertions.assertNotNull(intrusionSet.getGoals());
        Assertions.assertEquals(3, intrusionSet.getGoals().size());
        Assertions.assertEquals("acquisition-theft", intrusionSet.getGoals().get(0));
        Assertions.assertEquals("harassment", intrusionSet.getGoals().get(1));
        Assertions.assertEquals("damage", intrusionSet.getGoals().get(2));
    }

    @Test
    void testNullSafety() {
        IntrusionSet intrusionSet = new IntrusionSet();
        Assertions.assertNotNull(intrusionSet.getAliases());
        Assertions.assertNotNull(intrusionSet.getGoals());
        Assertions.assertNotNull(intrusionSet.getSecondaryMotivations());
        Assertions.assertNotNull(intrusionSet.getGranularMarkings());
        Assertions.assertNotNull(intrusionSet.getObjectMarkingRefs());
        Assertions.assertNotNull(intrusionSet.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        List<String> aliases = Collections.singletonList("Zookeeper");
        List<String> goals = Arrays.asList("acquisition-theft", "harassment", "damage");
        IntrusionSet intrusionSet = new IntrusionSet(
            TestConstants.INTRUSION_SET_ID,
            "Bobcat Breakin",
            "Incidents usually feature a shared TTP of a bobcat being released...",
            aliases,
            goals,
            TestConstants.IDENTITY_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(intrusionSet);
        String created = Stix2Gson.DEBUG.toJson(intrusionSet);
        String jsonString = TestUtil.readResourceFile(PATH);
        TestUtil.writeSerializedOutputFile(PATH, created);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof IntrusionSet);
    }
}
