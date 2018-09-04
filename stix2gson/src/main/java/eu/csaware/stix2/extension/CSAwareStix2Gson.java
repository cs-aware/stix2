package eu.csaware.stix2.extension;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.extension.CSAwareVulnerability;
import eu.csaware.stix2.util.Stix2Gson;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides Singletons for Gson instances. Provides a PRODUCTION instance which is intended
 * for usage in live systems and a DEBUG instance which is intended for development and comes with pretty
 * printing to make development easier.
 */
public class CSAwareStix2Gson {

    public static final Gson PRODUCTION = Stix2Gson.commonGsonBuilder(
        Map.of(Stix2Type.VULNERABILITY, CSAwareVulnerability.class))
        .create();
    public static final Gson DEBUG = Stix2Gson.commonGsonBuilder(
        Map.of(Stix2Type.VULNERABILITY, CSAwareVulnerability.class))
        .setPrettyPrinting().create();

}
