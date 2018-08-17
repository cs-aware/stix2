package eu.csaware.stix2.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eu.csaware.stix2.util.TestUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDateTime;

public class BundleTest {

    private Bundle testBundle;
    private String jsonString;

    @Before
    public void setUp() throws Exception {
        String jsonString = TestUtil.readResourceFile("common/bundle_test.json");

        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

//		Map<String, Object> jsonMap = gson.fromJson(jsonString, new TypeToken<Map<String, Object>>() {
//		}.getType());

        testBundle = Bundle.buildFromString(jsonString);

        URL url = this.getClass().getResource("bundle_test.json");
        String path = url.getPath();
        String newPath = path.replace("bundle_test.json", "bundle_test_out.json");
        PrintWriter pw = new PrintWriter(newPath);
        if (pw != null) {
            System.out.println("writing to: " + newPath);
            pw.write(gson.toJson(testBundle));
            pw.close();
        } else {
            System.out.println("output not found: " + newPath);
        }
        System.out.println("bundle: " + gson.toJson(testBundle));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getType() {

        assert (testBundle.getType().equals(Types.BUNDLE_TYPE));
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