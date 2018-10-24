package eu.csaware.stix2.test.custom.common;

import eu.csaware.stix2.common.Bundle;
import eu.csaware.stix2.common.TypedStixObject;
import eu.csaware.stix2.common.Stix2Type;
import eu.csaware.stix2.test.util.TestUtil;
import eu.csaware.stix2.util.Stix2Gson;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BundleTest {

    private static final String PATH = "custom/common/bundle_test.json";
    private static Bundle testBundle;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        testBundle = (Bundle) core;
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void testAutoType() throws IOException {
        String jsonString = TestUtil.readResourceFile(PATH);
        TypedStixObject core = Stix2Gson.DEBUG.fromJson(jsonString, TypedStixObject.class);
        Assertions.assertTrue(core instanceof Bundle);
    }

    @Test
    void writeToFile() throws Exception {
        String content = Stix2Gson.DEBUG.toJson(testBundle);
        TestUtil.writeSerializedOutputFile(PATH, content);
        System.out.println("bundle: " + content);
    }

    @Test
    void getType() {
        Assertions.assertEquals(Stix2Type.BUNDLE, testBundle.getType());
    }
//
//	@Test
//	public void setType() {
//	}
//
//	@Test
//	public void getId() {
//	}
//
//	@Test
//	public void setId() {
//	}
//
//	@Test
//	public void getSpecVersion() {
//	}
//
//	@Test
//	public void setSpecVersion() {
//	}
//
//	@Test
//	public void getObjects() {
//	}
//
//	@Test
//	public void setObjects() {
//	}
//
//	@Test
//	public void toStringTest() {
//		System.out.println(testBundle.toString());
//	}
}