
package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
public class Bundle implements TypedStixObject {

    public static final transient String SPEC_VERSION = "2.1";

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     */
    @SerializedName("type")
    @Expose
    @NotNull
    private Stix2Type type = Stix2Type.BUNDLE;
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
    private List<TypedStixObject> objects = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     */
    public Bundle() {
    }

    public Bundle(String id, String specVersion) {
        super();
        this.id = id;
        this.specVersion = specVersion;
    }

    public Bundle(String id, String specVersion, List<TypedStixObject> objects) {
        super();
        this.id = id;
        this.specVersion = specVersion;
        this.objects = objects;
    }

    /**
     * The type of this object, which MUST be the literal `bundle`.
     * (Required)
     */
    public Stix2Type getType() {
        return type;
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
    public List<TypedStixObject> getObjects() {
        return objects;
    }

    /**
     * Specifies a set of one or more STIX Objects.
     */
    public void setObjects(List<TypedStixObject> objects) {
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
