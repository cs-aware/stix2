package eu.csaware.stix2.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.common.TypedStixObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Provides Singletons for Gson instances. Provides a PRODUCTION instance which is intended
 * for usage in live systems and a DEBUG instance which is intended for development and comes with pretty
 * printing to make development easier.
 */
public class Stix2Gson {

    public static final Gson PRODUCTION = commonGsonBuilder().create();
    public static final Gson DEBUG = commonGsonBuilder().setPrettyPrinting().create();

    public static GsonBuilder commonGsonBuilder() {
        return commonGsonBuilder(new HashMap<>());
    }

    public static GsonBuilder commonGsonBuilder(Map<Stix2Type, Class<? extends TypedStixObject>> customImplementations) {
        RuntimeTypeAdapterFactory<TypedStixObject> factory =
            RuntimeTypeAdapterFactory.of(TypedStixObject.class, "type");

        for (Stix2Type stix2Type : customImplementations.keySet()) {
            stix2Type.setImplementation(customImplementations.get(stix2Type));
        }

        for (Stix2Type value : Stix2Type.TYPES) {
            factory.registerSubtype(value.getImplementation(), value.toJsonString());
        }

        return new GsonBuilder()
            .disableHtmlEscaping() //without this patterns don't serialize correctly
            .registerTypeHierarchyAdapter(Collection.class, new EmptyCollectionNonSerializer())
            .registerTypeHierarchyAdapter(Stix2Type.class, new Stix2TypeSerializer())
            .registerTypeHierarchyAdapter(Stix2Type.class, new Stix2TypeDeserializer())
            .registerTypeAdapterFactory(factory);
    }

}
