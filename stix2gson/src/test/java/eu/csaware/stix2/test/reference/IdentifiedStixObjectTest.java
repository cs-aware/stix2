package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.IdentifiedStixObject;
import eu.csaware.stix2.sdos.AttackPattern;
import eu.csaware.stix2.test.util.TestConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 *
 */
class IdentifiedStixObjectTest {


    private static final String VALID_ID = "attack-pattern--8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f";
    private static final String INVALID_TYPE = "invalid--8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f";
    private static final String INVALID_UUID = "attack-pattern--0000000000";
    private static final String INVALID_SEPARATOR = "attack-pattern++8e2e2d2b-17d4-4cbf-938f-98ee46b3cd3f";

    private IdentifiedStixObject createStixObject(String validId) {
        // instantiate any IdentifiedStixObject class here
        return new AttackPattern(validId, "Name", "Description",
            TestConstants.DATE_TIME_CREATED, TestConstants.DATE_TIME_MODIFIED);
    }

    @Test
    void testValidId() {
        IdentifiedStixObject identifiedStixObject = createStixObject(VALID_ID);
        Assertions.assertNotNull(identifiedStixObject);
        Assertions.assertNotNull(identifiedStixObject.getId());
        Assertions.assertEquals(VALID_ID, identifiedStixObject.getId());
    }

    @Test
    void testInValidType() {
        Executable code = () -> createStixObject(INVALID_TYPE);
        Assertions.assertThrows(IllegalArgumentException.class, code);
    }

    @Test
    void testInValidUUID() {
        Executable code = () -> createStixObject(INVALID_UUID);
        Assertions.assertThrows(IllegalArgumentException.class, code);
    }

    @Test
    void testInValidSeparator() {
        Executable code = () -> createStixObject(INVALID_SEPARATOR);
        Assertions.assertThrows(IllegalArgumentException.class, code);
    }

    @Test
    void testUUID() {
        AttackPattern attackPattern = new AttackPattern(TestConstants.ATTACK_PATTERN_UUID,
            "Name", "Description",
            TestConstants.DATE_TIME_CREATED, TestConstants.DATE_TIME_MODIFIED);
        Assertions.assertEquals(TestConstants.ATTACK_PATTERN_ID, attackPattern.getId());
    }

}
