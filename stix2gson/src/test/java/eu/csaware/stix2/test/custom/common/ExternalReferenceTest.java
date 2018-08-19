package eu.csaware.stix2.test.custom.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.common.HashType;
import eu.csaware.stix2.common.HashesType;
import eu.csaware.stix2.test.util.TestUtil;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ExternalReferenceTest {

    private static ExternalReference externalReference;

    @BeforeAll
    static void setUp() throws Exception {
        externalReference = new ExternalReference();
        HashesType hashes = new HashesType();
        hashes.setHashType(HashType.SHA256);
        hashes.setKey("35a01331e9ad96f751278b891b6ea09699806faedfa237d40513d92ad1b7100f");
        externalReference.setHashes(hashes);

        externalReference.setExternalId("CVE-1234-0321");
        externalReference.setSourceName("cve");
    }

    @AfterAll
    static void tearDown() throws Exception {
    }

    @Test
    void writeToFile() throws Exception {
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

        String content = gson.toJson(externalReference);
        TestUtil.writeSerializedOutputFile("external_refence.json", content);
        System.out.println(content);
    }

    @Test
    void readFromFile() throws Exception {
        Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

        String jsonString = TestUtil.readResourceFile("common/externalRefence.json");
        ExternalReference er = gson.fromJson(jsonString, ExternalReference.class);
        System.out.println("er: " + gson.toJson(er));
    }

//
//	@Test
//	public void getDescription() {
//	}
//
//	@Test
//	public void setDescription() {
//	}
//
//	@Test
//	public void getUrl() {
//	}
//
//	@Test
//	public void setUrl() {
//	}
//
//	@Test
//	public void getSourceName() {
//	}
//
//	@Test
//	public void setSourceName() {
//	}
//
//	@Test
//	public void getExternalId() {
//	}
//
//	@Test
//	public void setExternalId() {
//	}
//
//	@Test
//	public void getHashes() {
//	}
//
//	@Test
//	public void setHashes() {
//	}
//
//	@Test
//	public String toString() {
//		return "";
//	}
//
//	@Test
//	public int hashCode() {
//		return 0;
//	}
//
//	@Test
//	public void equals() {
//	}
}