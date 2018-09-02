package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.OpenVocabularyDefaults;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.sdos.ThreatActor;
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
class ThreatActorTest {

    private static final String PATH = "reference/threat_actor.json";
    private static ThreatActor threatActor;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        threatActor = Stix2Gson.DEBUG.fromJson(jsonString, ThreatActor.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Stix2Type.THREAT_ACTOR, threatActor.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.THREAT_ACTOR_ID, threatActor.getId());
    }

    @Test
    void testName() {
        Assertions.assertEquals("Evil Org", threatActor.getName());
    }

    @Test
    void testDescription() {
        Assertions.assertEquals("The Evil Org threat actor group", threatActor.getDescription());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME_CREATED, threatActor.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME_MODIFIED, threatActor.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, threatActor.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(threatActor.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(threatActor.getGranularMarkings());
        Assertions.assertEquals(0, threatActor.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(threatActor.getObjectMarkingRefs());
        Assertions.assertEquals(0, threatActor.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(threatActor.getLabels());
        Assertions.assertEquals(1, threatActor.getLabels().size());
        String label = threatActor.getLabels().get(0);
        Assertions.assertEquals(OpenVocabularyDefaults.THREAT_ACTOR_LABEL_CRIME_SYNDICATE, label);
    }

    @Test
    void testNullSafety() {
        ThreatActor threatActor = new ThreatActor();
        Assertions.assertNotNull(threatActor.getAliases());
        Assertions.assertNotNull(threatActor.getRoles());
        Assertions.assertNotNull(threatActor.getGoals());
        Assertions.assertNotNull(threatActor.getSecondaryMotivations());
        Assertions.assertNotNull(threatActor.getPersonalMotivations());
        Assertions.assertNotNull(threatActor.getGranularMarkings());
        Assertions.assertNotNull(threatActor.getObjectMarkingRefs());
        Assertions.assertNotNull(threatActor.getLabels());
    }

    @Test
    void testCreation() throws IOException {
        List<String> labels = Collections.singletonList(OpenVocabularyDefaults.THREAT_ACTOR_LABEL_CRIME_SYNDICATE);
        ThreatActor threatActor = new ThreatActor(
            TestConstants.THREAT_ACTOR_ID,
            labels,
            "Evil Org",
            "The Evil Org threat actor group",
            TestConstants.IDENTITY_ID,
            TestConstants.DATE_TIME_CREATED,
            TestConstants.DATE_TIME_MODIFIED
        );
        Assertions.assertNotNull(threatActor);
        String created = Stix2Gson.DEBUG.toJson(threatActor);
        String jsonString = TestUtil.readResourceFile(PATH);
        TestUtil.writeSerializedOutputFile(PATH, created);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof ThreatActor);
    }
}
