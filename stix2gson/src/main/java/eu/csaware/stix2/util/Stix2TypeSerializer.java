package eu.csaware.stix2.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import eu.csaware.stix2.common.Stix2Type;

import java.lang.reflect.Type;
import java.util.Collection;

/**
 * Prevent the serialization of empty Collections to JSON. Things like empty lists
 */
public class Stix2TypeSerializer implements JsonSerializer<Stix2Type> {

    @Override
    public JsonElement serialize(Stix2Type src, Type typeOfSrc, JsonSerializationContext context) {
        JsonElement element = context.serialize(src.toJsonString());
        return element;
    }



}