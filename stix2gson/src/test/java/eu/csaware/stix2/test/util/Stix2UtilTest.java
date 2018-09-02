package eu.csaware.stix2.test.util;

import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.util.Stix2Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 *
 */
class Stix2UtilTest {

    private static UUID TEST_UUID = UUID.fromString("44444444-5555-2222-3333-11111111111");
    private static String TEST_ID = Stix2Type.ATTACK_PATTERN.toJsonString() + Stix2Util.ID_SEPARATOR + TEST_UUID;

    @Test
    void testAssembleId() {
        Assertions.assertEquals(
            TEST_ID,
            Stix2Util.assembleId(Stix2Type.ATTACK_PATTERN, TEST_UUID));
    }

    @Test
    void testExtractType() {
        Assertions.assertEquals(
            Stix2Type.ATTACK_PATTERN,
            Stix2Util.extractTypeFromId(TEST_ID));
    }

    @Test
    void testExtractUUID() {
        Assertions.assertEquals(
            TEST_UUID,
            Stix2Util.extractUUIDFromId(TEST_ID));
    }

}
