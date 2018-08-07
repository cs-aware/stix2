package eu.csaware.stix2.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eu.csaware.stix2.sdos.CourseOfAction;
import eu.csaware.stix2.sdos.Identity;
import eu.csaware.stix2.sdos.ObservedData;
import eu.csaware.stix2.sdos.Vulnerability;
import eu.csaware.stix2.sros.Relationship;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Map;


public class BundleTest {

	private Bundle testBundle;
	private String jsonString;

	@Before
	public void setUp() throws Exception {
		StringBuffer sb = new StringBuffer();
		String line;
		InputStream inputStream = this.getClass().getResourceAsStream("bundle_test.json");
		if (inputStream != null) {
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			inputStream.close();
		} else {
			System.out.println("input stream not found");
			return;
		}
		jsonString = sb.toString();

		Gson gson = new GsonBuilder()
				  .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
				  .registerTypeAdapter(HashesType.class, new HashesTypeTypeAdapter())
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