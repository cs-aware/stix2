package eu.csaware.stix2.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 */
public class TestUtil {
    private static final String RESOURCE_BASE_PATH = "src/test/resources/eu/csaware/stix2/";
    private static final String SERIALIZED_BASE_PATH = "out/test/serialized/";

    public static String readResourceFile(String path) throws IOException {
        return readFile(RESOURCE_BASE_PATH + path);
    }

    public static File getSerializedOutputFile(String filename) throws IOException {
        File base = new File(SERIALIZED_BASE_PATH);
        base.mkdirs();
        return new File(base, filename);
    }

    public static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, StandardCharsets.UTF_8);
    }

}
