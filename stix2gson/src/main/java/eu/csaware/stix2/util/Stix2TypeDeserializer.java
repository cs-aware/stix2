package eu.csaware.stix2.util;

import com.google.gson.*;
import eu.csaware.stix2.common.Stix2Type;

import java.lang.reflect.Type;

/**
 * Prevent the serialization of empty Collections to JSON. Things like empty lists
 */
public class Stix2TypeDeserializer implements JsonDeserializer<Stix2Type> {

    @Override
    public Stix2Type deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return Stix2Type.fromJsonString(json.getAsString());
    }
}