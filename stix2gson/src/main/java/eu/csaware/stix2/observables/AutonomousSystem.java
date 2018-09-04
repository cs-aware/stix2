
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.constraints.NotNull;


/**
 * autonomous-system
 * <p>
 * The AS object represents the properties of an Autonomous Systems (AS).
 */
public class AutonomousSystem extends CyberObservableCore {

    /**
     * Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).
     * (Required)
     */
    @SerializedName("number")
    @Expose
    @NotNull
    private Integer number;
    /**
     * Specifies the name of the AS.
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.
     */
    @SerializedName("rir")
    @Expose
    private String rir;

    /**
     * No args constructor for use in serialization
     */
    public AutonomousSystem() {
    }

    public AutonomousSystem(Integer number, String name, String rir, Dictionary extensions) {
        super(extensions);
        this.number = number;
        this.name = name;
        this.rir = rir;
    }

    /**
     * Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).
     * (Required)
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registries (RIR).
     * (Required)
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Specifies the name of the AS.
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the AS.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.
     */
    public String getRir() {
        return rir;
    }

    /**
     * Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS.
     */
    public void setRir(String rir) {
        this.rir = rir;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AutonomousSystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null) ? "<null>" : this.number));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("rir");
        sb.append('=');
        sb.append(((this.rir == null) ? "<null>" : this.rir));
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
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.number == null) ? 0 : this.number.hashCode()));
        result = ((result * 31) + ((this.rir == null) ? 0 : this.rir.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutonomousSystem) == false) {
            return false;
        }
        AutonomousSystem rhs = ((AutonomousSystem) other);
        return ((((super.equals(rhs) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.number == rhs.number) || ((this.number != null) && this.number.equals(rhs.number)))) && ((this.rir == rhs.rir) || ((this.rir != null) && this.rir.equals(rhs.rir)))));
    }

}
