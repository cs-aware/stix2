package eu.csaware.stix2.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.extension.CSAwareVulnerability;

import java.util.Collection;

/**
 * Provides Singletons for Gson instances. Based on enum rather than the Class-based Singleton pattern,
 * to solve multithreading issues without a locking solution. Provides a PRODUCTION instance which is intended
 * for usage in live systems and a DEBUG instance which is intended for development and comes with pretty
 * printing to make development easier.
 */
public enum Stix2Gson {
    //prefix these with SINGLETON to make autocomplete pick up the PRODUCTION and DEBUG instances below directly
    SINGLETON_PRODUCTION(commonGsonBuilder().create()),
    SINGLETON_DEBUG(commonGsonBuilder().setPrettyPrinting().create());

    private static GsonBuilder commonGsonBuilder() {
        RuntimeTypeAdapterFactory<TypedStixObject> factory =
            RuntimeTypeAdapterFactory.of(TypedStixObject.class, "type");

        //TODO provide way to register custom classes
//        Stix2Type.VULNERABILITY.setImplementation(CSAwareVulnerability.class);
        for (Stix2Type value : Stix2Type.values()) {
            factory.registerSubtype(value.getImplementation(), value.toJsonString());
        }

        return new GsonBuilder()
            .disableHtmlEscaping() //without this patterns don't serialize correctly
            .registerTypeHierarchyAdapter(Collection.class, new EmptyCollectionNonSerializer())
            .registerTypeAdapterFactory(factory);
    }

    /**
     * Convenience field to fetch the debug Gson instance directly.
     */
    public static final Gson DEBUG = SINGLETON_DEBUG.getGson();
    /**
     * Convenience field to fetch the production Gson instance directly.
     */
    public static final Gson PRODUCTION = SINGLETON_PRODUCTION.getGson();

    private Gson gson;

    Stix2Gson(Gson gson) {
        this.gson = gson;
    }

    private Gson getGson() {
        return gson;
    }

}
