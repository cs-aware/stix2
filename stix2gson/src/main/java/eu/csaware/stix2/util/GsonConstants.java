package eu.csaware.stix2.util;

import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Bundle;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.extension.CSAwareVulnerability;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.observables.Process;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

/**
 *
 */
class GsonConstants {

    /**
     * Default RuntimeTypeAdapterFactory for standard compliant STIX 2 classes
     */
    static final RuntimeTypeAdapterFactory<TypedStixObject> RUNTIME_TYPE_ADAPTER_FACTORY =
        RuntimeTypeAdapterFactory.of(TypedStixObject.class, "type");


    static {
        Stix2Type.VULNERABILITY.setImplementation(CSAwareVulnerability.class);
        for (Stix2Type value : Stix2Type.values()) {
            RUNTIME_TYPE_ADAPTER_FACTORY.registerSubtype(value.getImplementation(), value.toJsonString());
        }
    }

}
