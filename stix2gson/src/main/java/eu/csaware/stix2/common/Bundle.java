
package eu.csaware.stix2.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import eu.csaware.stix2.observables.*;
import eu.csaware.stix2.observables.Process;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * bundle
 * <p>
 * A Bundle is a collection of arbitrary STIX Objects and Marking Definitions grouped together in a single container.
 */
public class Bundle {


    public static final String SPEC_VERSION = "2.1";

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.BUNDLE_TYPE)
    @NotNull
    private String type = Types.BUNDLE_TYPE;
    /**
     * id
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^bundle--[a-z][a-z-]+[a-z]--[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
    @NotNull
    private String id;
    /**
     * The version of the STIX specification used to represent the content in this bundle.
     * (Required)
     */
    @SerializedName("spec_version")
    @Expose
    @NotNull
    private String specVersion;
    /**
     * Specifies a set of one or more STIX Objects.
     */
    @SerializedName("objects")
    @Expose
    @Size(min = 1)
    @Valid
    private List<Object> objects = new ArrayList<Object>();

    /**
     * No args constructor for use in serialization
     */
    public Bundle() {
    }

    /**
     * @param specVersion
     * @param objects
     * @param id
     * @param type
     */
    public Bundle(String type, String id, String specVersion, List<Object> objects) {
        super();
        if (!type.equals(Types.BUNDLE_TYPE)) {
            type = Types.BUNDLE_TYPE;
        }
        this.type = type;
        this.id = id;
        this.specVersion = specVersion;
        this.objects = objects;
    }


    /**
     * Build a Bundle object from a JSON string.
     * The list of objects in Bundle will be added objects of the type stated in the string.
     *
     * @param jsonString String with valid JSON structure
     * @return Bundle object with data from the jsonString string
     */
    public static Bundle buildFromString(String jsonString) {

        final RuntimeTypeAdapterFactory<CyberObservableCore> cyberObservableTypeAdaptor = RuntimeTypeAdapterFactory
            .of(CyberObservableCore.class, "type")
            .registerSubtype(Artifact.class, Types.ARTIFACT_TYPE)
            .registerSubtype(AutonomousSystem.class, Types.AUTONOMOUS_SYSTEM_TYPE)
            .registerSubtype(Directory.class, Types.DIRECTORY_TYPE)
            .registerSubtype(DomainName.class, Types.DOMAIN_NAME_TYPE)
            .registerSubtype(EmailAddr.class, Types.EMAIL_ADDR_TYPE)
            .registerSubtype(EmailMessage.class, Types.EMAIL_MESSAGE_TYPE)
            .registerSubtype(File.class, Types.FILE_TYPE)
            .registerSubtype(Ipv4Addr.class, Types.IPV4_ADDR_TYPE)
            .registerSubtype(Ipv6Addr.class, Types.IPV6_ADDR_TYPE)
            .registerSubtype(MacAddr.class, Types.MAC_ADDR_TYPE)
            .registerSubtype(Mutex.class, Types.MUTEX_TYPE)
            .registerSubtype(NetworkTraffic.class, Types.NETWORK_TRAFFIC_TYPE)
            .registerSubtype(Process.class, Types.PROCESS)
            .registerSubtype(Software.class, Types.SOFTWARE_TYPE)
            .registerSubtype(Url.class, Types.URL_TYPE)
            .registerSubtype(UserAccount.class, Types.USER_ACCOUNT_TYPE)
            .registerSubtype(WindowsRegistryKey.class, Types.WINDOWS_REGISTRY_KEY_TYPE)
            .registerSubtype(X509Certificate.class, Types.X_509_CERTIFICATE);

        final RuntimeTypeAdapterFactory<Core> coreTypeAdptor = RuntimeTypeAdapterFactory
            .of(Core.class, "type")
            .registerSubtype(AttackPattern.class, Types.ATTACK_PATTERN_TYPE)
            .registerSubtype(Campaign.class, Types.CAMPAIGN_TYPE)
            .registerSubtype(CourseOfAction.class, Types.COURSE_OF_ACTION_TYPE)
            .registerSubtype(Identity.class, Types.IDENTITY_TYPE)
            .registerSubtype(Indicator.class, Types.INDICATOR_TYPE)
            .registerSubtype(IntrusionSet.class, Types.INTRUSION_SET_TYPE)
            .registerSubtype(Malware.class, Types.MALWARE_TYPE)
            .registerSubtype(ObservedData.class, Types.OBSERVED_DATA_TYPE)
            .registerSubtype(Report.class, Types.REPORT_TYPE)
            .registerSubtype(ThreatActor.class, Types.THREAT_ACTOR_TYPE)
            .registerSubtype(Relationship.class, Types.RELATIONSHIP_TYPE)
            .registerSubtype(Sighting.class, Types.SIGHTING_TYPE)
            .registerSubtype(Tool.class, Types.TOOL_TYPE)
            .registerSubtype(Vulnerability.class, Types.VULNERABILITY_TYPE);


        Gson gson = new GsonBuilder()
            .registerTypeAdapterFactory(cyberObservableTypeAdaptor)
            .registerTypeAdapterFactory(coreTypeAdptor)
            .setPrettyPrinting()
            .create();

        Bundle bundle = gson.fromJson(jsonString, Bundle.class);

        return bundle;
    }

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     */
    public void setType(String type) {
        if (!type.equals(Types.BUNDLE_TYPE)) {
            type = Types.BUNDLE_TYPE;
        }
        this.type = type;
    }

    /**
     * id
     * <p>
     * <p>
     * (Required)
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * <p>
     * <p>
     * (Required)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The version of the STIX specification used to represent the content in this bundle.
     * (Required)
     */
    public String getSpecVersion() {
        return specVersion;
    }

    /**
     * The version of the STIX specification used to represent the content in this bundle.
     * (Required)
     */
    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    /**
     * Specifies a set of one or more STIX Objects.
     */
    public List<Object> getObjects() {
        return objects;
    }

    /**
     * Specifies a set of one or more STIX Objects.
     */
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bundle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("specVersion");
        sb.append('=');
        sb.append(((this.specVersion == null) ? "<null>" : this.specVersion));
        sb.append(',');
        sb.append("objects");
        sb.append('=');
        if (this.objects == null) {
            sb.append("<null>");
        } else {
            sb.append("[");
            this.objects.forEach((obj) -> {
//				String type = obj.toString();
                Map<String, Object> objMap = (Map<String, Object>) obj;
                String type = (String) objMap.get("type");
                String id = (String) objMap.get("id");
                sb.append("\ntype: " + type + " id: " + id + " - " + obj.toString());
//				sb.append("\n ("+ obj.getClass().getCanonicalName() + ") " + obj.toString());
            });
            sb.append("]");
        }
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.specVersion == null) ? 0 : this.specVersion.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.objects == null) ? 0 : this.objects.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bundle) == false) {
            return false;
        }
        Bundle rhs = ((Bundle) other);
        return (((((this.specVersion == rhs.specVersion) || ((this.specVersion != null) && this.specVersion.equals(rhs.specVersion))) &&
            ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) &&
            ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) &&
            ((this.objects == rhs.objects) || ((this.objects != null) && this.objects.equals(rhs.objects))));
    }
}
