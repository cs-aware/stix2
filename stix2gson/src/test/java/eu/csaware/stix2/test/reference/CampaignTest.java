package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.sdos.Campaign;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.GsonSingleton;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 *
 */
class CampaignTest {

    private static final String PATH = "reference/campaign.json";
    private static Campaign campaign;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        campaign = GsonSingleton.DEBUG.fromJson(jsonString, Campaign.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testType() {
        Assertions.assertEquals(Types.CAMPAIGN_TYPE, campaign.getType());
    }

    @Test
    void testId() {
        Assertions.assertEquals(TestConstants.CAMPAIGN_ID, campaign.getId());
    }

    @Test
    void testName() {
        Assertions.assertEquals("Green Group Attacks Against Finance", campaign.getName());
    }

    @Test
    void testDescription() {
        Assertions.assertEquals("Campaign by Green Group against a series of targets in the financial services sector.", campaign.getDescription());
    }

    @Test
    void testCreated() {
        Assertions.assertEquals(TestConstants.DATE_TIME, campaign.getCreated());
    }

    @Test
    void testModified() {
        Assertions.assertEquals(TestConstants.DATE_TIME, campaign.getModified());
    }

    @Test
    void testCreatedByRef() {
        Assertions.assertEquals(TestConstants.IDENTITY_ID, campaign.getCreatedByRef());
    }

    @Test
    void testRevoked() {
        Assertions.assertNull(campaign.getRevoked());
    }

    @Test
    void testGranularMarkings() {
        Assertions.assertNotNull(campaign.getGranularMarkings());
        Assertions.assertEquals(0, campaign.getGranularMarkings().size());
    }

    @Test
    void testObjectMarkingRefs() {
        Assertions.assertNotNull(campaign.getObjectMarkingRefs());
        Assertions.assertEquals(0, campaign.getObjectMarkingRefs().size());
    }

    @Test
    void testLabels() {
        Assertions.assertNotNull(campaign.getLabels());
        Assertions.assertEquals(0, campaign.getLabels().size());
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
        Campaign createdCampaign = new Campaign(
            TestConstants.CAMPAIGN_ID,
            "Green Group Attacks Against Finance",
            "Campaign by Green Group against a series of targets in the financial services sector.",
            TestConstants.IDENTITY_ID,
            TestConstants.DATE_TIME,
            TestConstants.DATE_TIME
        );
        Assertions.assertNotNull(createdCampaign);
        String created = GsonSingleton.DEBUG.toJson(createdCampaign);
        String reserialized = GsonSingleton.DEBUG.toJson(campaign);
        Assertions.assertEquals(reserialized, created);
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        Core core = GsonSingleton.DEBUG.fromJson(jsonString, Core.class);
        Assertions.assertTrue(core instanceof Campaign);
    }
}
