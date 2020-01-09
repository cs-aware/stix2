package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.IdentifiedStixObject;
import eu.csaware.stix2.sdos.AttackPattern;
import eu.csaware.stix2.test.util.TestConstants;
import eu.csaware.stix2.util.Stix2Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.UUID;


/**
 *
 */
class IdentifiedStixObjectTest {

    private static final UUID VALID_ID = UUID.fromString("8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f");

    private IdentifiedStixObject createStixObject(UUID validId) {
        // instantiate any IdentifiedStixObject class here
        return new AttackPattern(validId, "Name", "Description",
            TestConstants.DATE_TIME_CREATED, TestConstants.DATE_TIME_MODIFIED);
    }

    @Test
    void testValidId() {
        IdentifiedStixObject identifiedStixObject = createStixObject(VALID_ID);
        Assertions.assertNotNull(identifiedStixObject);
        Assertions.assertNotNull(identifiedStixObject.getId());
        Assertions.assertEquals(VALID_ID, Stix2Util.extractUUIDFromId(identifiedStixObject.getId()));
    }

    @Test
    void testUUID() {
        AttackPattern attackPattern = new AttackPattern(TestConstants.ATTACK_PATTERN_UUID,
            "Name", "Description",
            TestConstants.DATE_TIME_CREATED, TestConstants.DATE_TIME_MODIFIED);
        Assertions.assertEquals(TestConstants.ATTACK_PATTERN_ID, attackPattern.getId());
    }

}
