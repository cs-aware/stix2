package eu.csaware.stix2.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Collection;

/**
 * Provides Singletons for Gson instances. Based on enum rather than the Class-based Singleton pattern,
 * to solve multithreading issues without a locking solution. Provides a PRODUCTION instance which is intended
 * for usage in live systems and a DEBUG instance which is intended for development and comes with pretty
 * printing to make development easier.
 */
public enum GsonSingleton {
    //prefix these with SINGLETON to make autocomplete pick up the PRODUCTION and DEBUG instances below directly
    SINGLETON_PRODUCTION(commonGsonBuilder().create()),
    SINGLETON_DEBUG(commonGsonBuilder().setPrettyPrinting().create());

    private static GsonBuilder commonGsonBuilder() {
        return new GsonBuilder()
            .disableHtmlEscaping() //without this patterns don't serialize correctly
            .registerTypeHierarchyAdapter(Collection.class, new EmptyCollectionNonSerializer())
            .registerTypeAdapterFactory(GsonConstants.RUNTIME_TYPE_ADAPTER_FACTORY);
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

    GsonSingleton(Gson gson) {
        this.gson = gson;
    }

    private Gson getGson() {
        return gson;
    }

}
