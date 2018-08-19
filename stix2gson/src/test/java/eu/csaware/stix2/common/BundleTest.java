package eu.csaware.stix2.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eu.csaware.stix2.util.TestUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BundleTest {

    private static Bundle testBundle;

    @BeforeAll
    static void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile("common/bundle_test.json");
        testBundle = Bundle.buildFromString(jsonString);
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void writeToFile() throws Exception {
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

        String content = gson.toJson(testBundle);
        TestUtil.writeSerializedOutputFile("bundle.json", content);
        System.out.println("bundle: " + content);
    }

    @Test
    void getType() {
        assertEquals(Types.BUNDLE_TYPE, testBundle.getType());
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