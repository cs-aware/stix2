package eu.csaware.stix2.common;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class HashesTypeTypeAdapter extends TypeAdapter<HashesType> {

//	"hashes": {
//		"SHA-256": "effb46bba03f6c8aea5c653f9cf984f170dcdd3bbbe2ff6843c3e5da0e698766"
//	}

    @Override
    public void write(JsonWriter out, HashesType value) throws IOException {
        out.beginObject(); // { // open new object
        out.name(value.hashType.getHashName()).value(value.getKey());
        out.endObject(); // }} // olose object
    }

    @Override
    public HashesType read(JsonReader in) throws IOException {
        in.beginObject();
        String hashTypeString = in.nextName();
        String hashKeyString = in.nextString();
        in.endObject();
        HashesType hashesType = new HashesType();
        HashType hashType = HashType.fromHashName(hashTypeString);
        if (hashType == null) {
            throw new IllegalArgumentException("HashType not found: " + hashTypeString);
        }
        hashesType.setHashType(hashType);
        hashesType.setKey(hashKeyString);

        return hashesType;
    }
}
