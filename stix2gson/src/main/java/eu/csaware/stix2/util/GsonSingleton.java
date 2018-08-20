package eu.csaware.stix2.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Provides Singletons for Gson instances. Based on enum rather than the Class-based Singleton pattern,
 * to solve multithreading issues without a locking solution. Provides a PRODUCTION instance which is intended
 * for usage in live systems and a DEBUG instance which is intended for development and comes with pretty
 * printing to make development easier.
 */
public enum GsonSingleton {
    //prefix these with SINGLETON to make autocomplete pick up the PRODUCTION and DEBUG instances below directly
    SINGLETON_PRODUCTION(new GsonBuilder().create()),
    SINGLETON_DEBUG(new GsonBuilder().setPrettyPrinting().create());

    /**
     * Convenience method to fetch the debug Gson instance directly.
     */
    public static final Gson DEBUG = SINGLETON_DEBUG.getGson();
    /**
     * Convenience method to fetch the production Gson instance directly.
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
