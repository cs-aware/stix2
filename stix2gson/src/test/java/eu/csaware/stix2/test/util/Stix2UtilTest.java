package eu.csaware.stix2.test.util;

import eu.csaware.stix2.common.Types;
import eu.csaware.stix2.util.Stix2Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 *
 */
class Stix2UtilTest {

    private static UUID TEST_UUID = UUID.fromString("44444444-5555-2222-3333-11111111111");
    private static String TEST_ID = Types.ATTACK_PATTERN_TYPE + Stix2Util.ID_SEPARATOR + TEST_UUID;

    @Test
    void testAssembleId() {
        Assertions.assertEquals(
            TEST_ID,
            Stix2Util.assembleId(Types.ATTACK_PATTERN_TYPE, TEST_UUID));
    }

    @Test
    void testextractType() {
        Assertions.assertEquals(
            Types.ATTACK_PATTERN_TYPE,
            Stix2Util.extractTypeFromId(TEST_ID));
    }

    @Test
    void testExtractUUID() {
        Assertions.assertEquals(
            TEST_UUID,
            Stix2Util.extractUUIDFromId(TEST_ID));
    }

}
