package eu.csaware.stix2.util;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/**
 * Prevent the serialization of empty Maps to JSON.
 */
public class EmptyMapNonSerializer implements JsonSerializer<Map<?, ?>> {

    @Override
    public JsonElement serialize(Map<?, ?> src, Type typeOfSrc, JsonSerializationContext context) {
        if (src == null || src.isEmpty())
            return null; //don't serialize and empty collection at all

        JsonObject obj = new JsonObject();
        for (Map.Entry<?, ?> entry : src.entrySet()) {
            obj.add(entry.getKey().toString(), context.serialize(entry.getValue()));
        }
        return obj;
    }
}