package eu.csaware.stix2.test.reference;

import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.sdos.AttackPattern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 */
class CoreTest {

    @Test
    void testNullSafety() {
        Core core = new AttackPattern(); // instantiate any Core class here
        Assertions.assertNotNull(core.getLabels());
        Assertions.assertNotNull(core.getExternalReferences());
        Assertions.assertNotNull(core.getObjectMarkingRefs());
        Assertions.assertNotNull(core.getGranularMarkings());
    }

}
