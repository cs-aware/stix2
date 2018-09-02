
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.constraints.NotNull;


/**
 * mutex
 * <p>
 * The Mutex Object represents the properties of a mutual exclusion (mutex) object.
 */
public class Mutex extends CyberObservableCore {

    /**
     * The value of this property MUST be `mutex`.
     */
    @SerializedName("type")
    @Expose
    private Stix2Type type = Stix2Type.MUTEX;
    /**
     * Specifies the name of the mutex object.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;

    /**
     * No args constructor for use in serialization
     */
    public Mutex() {
    }

    public Mutex(String name, Dictionary extensions) {
        super(extensions);
        this.name = name;
    }

    /**
     * The value of this property MUST be `mutex`.
     */
    public Stix2Type getType() {
        return type;
    }

    /**
     * Specifies the name of the mutex object.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the mutex object.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Mutex.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString != null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0) && (contentEnd > contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length() > baseLength) {
            sb.append(',');
        }
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
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
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Mutex) == false) {
            return false;
        }
        Mutex rhs = ((Mutex) other);
        return ((super.equals(rhs) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))));
    }

}
