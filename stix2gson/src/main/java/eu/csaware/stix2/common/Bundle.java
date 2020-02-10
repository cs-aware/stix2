
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
import java.util.UUID;


/**
 * bundle
 * <p>
 * A Bundle is a collection of arbitrary STIX Objects and Marking Definitions grouped together in a single container.
 */
public class Bundle extends IdentifiedStixObject {

    public static final transient String SPEC_VERSION = "2.1";

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

    public Bundle(UUID uuid) {
        super(uuid);
        this.specVersion = SPEC_VERSION;
    }

    public Bundle(UUID uuid, String specVersion) {
        super(uuid);
        this.specVersion = specVersion;
    }

    public Bundle(UUID uuid, List<TypedStixObject> objects) {
        super(uuid);
        this.specVersion = SPEC_VERSION;
        this.objects = objects;
    }

    public Bundle(UUID uuid, String specVersion, List<TypedStixObject> objects) {
        super(uuid);
        this.specVersion = specVersion;
        this.objects = objects;
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

    /**
     * Get only the STIX Objects of the specified type.
     */
    public <T extends TypedStixObject> List<T> getObjects(Class<T> clazz) {
        List<T> filtered = new ArrayList<>();
        for (TypedStixObject typedStixObject : objects) {
            //check by fully qualified name in case we are dealing with multiple classloaders
            if (typedStixObject.getClass().getName().equals(clazz.getName()))
                filtered.add((T) typedStixObject);
        }
        return filtered;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bundle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(super.toString());
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
        result = ((result * 31) + ((this.objects == null) ? 0 : this.objects.hashCode()));
        result = ((result * 31) + super.hashCode());
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
            super.equals(rhs))) &&
            ((this.objects == rhs.objects) || ((this.objects != null) && this.objects.equals(rhs.objects))));
    }
}
