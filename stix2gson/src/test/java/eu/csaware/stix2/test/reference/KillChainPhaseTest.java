package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.KillChainPhase;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.Stix2Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 *
 */
class KillChainPhaseTest {

    private static final String PATH = "reference/kill_chain_phase_pre_attack.json";
    private static KillChainPhase killChainPhase;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        killChainPhase = Stix2Gson.DEBUG.fromJson(jsonString, KillChainPhase.class);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testPhaseName() {
        Assertions.assertEquals("reconnaissance", killChainPhase.getPhaseName());
    }

    @Test
    void testKillChainName() {
        Assertions.assertEquals("lockheed-martin-cyber-kill-chain", killChainPhase.getKillChainName());
    }

    @Test
    void testCreation() throws IOException {
        KillChainPhase killChainPhase = new KillChainPhase(
            "lockheed-martin-cyber-kill-chain",
            "reconnaissance"
        );
        Assertions.assertNotNull(killChainPhase);
        String created = Stix2Gson.DEBUG.toJson(killChainPhase);
        String jsonString = TestUtil.readResourceFile(PATH);
        Assertions.assertEquals(TestUtil.sanitizeJson(jsonString), TestUtil.sanitizeJson(created));
        TestUtil.writeSerializedOutputFile(PATH, created);
    }

}
