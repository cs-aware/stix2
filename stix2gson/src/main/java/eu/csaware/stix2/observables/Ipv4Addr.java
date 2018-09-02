
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * ipv4-addr
 * <p>
 * The IPv4 Address Object represents one or more IPv4 addresses expressed using CIDR notation.
 */
public class Ipv4Addr extends CyberObservableCore {

    /**
     * The value of this property MUST be `ipv4-addr`.
     */
    @SerializedName("type")
    @Expose
    private Stix2Type type = Stix2Type.IPV4_ADDR;
    /**
     * Specifies one or more IPv4 addresses expressed using CIDR notation.
     * (Required)
     */
    @SerializedName("value")
    @Expose
    @NotNull
    private String value;
    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv4 address resolves to.
     */
    @SerializedName("resolves_to_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> resolvesToRefs = new ArrayList<String>();
    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv4 address belongs to.
     */
    @SerializedName("belongs_to_refs")
    @Expose
    @Valid
    private List<String> belongsToRefs = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     */
    public Ipv4Addr() {
    }

    public Ipv4Addr(String value, List<String> resolvesToRefs, List<String> belongsToRefs, Dictionary extensions) {
        super(extensions);
        this.value = value;
        this.resolvesToRefs = resolvesToRefs;
        this.belongsToRefs = belongsToRefs;
    }

    /**
     * The value of this property MUST be `ipv4-addr`.
     */
    public Stix2Type getType() {
        return type;
    }

    /**
     * Specifies one or more IPv4 addresses expressed using CIDR notation.
     * (Required)
     */
    public String getValue() {
        return value;
    }

    /**
     * Specifies one or more IPv4 addresses expressed using CIDR notation.
     * (Required)
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv4 address resolves to.
     */
    public List<String> getResolvesToRefs() {
        return resolvesToRefs;
    }

    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv4 address resolves to.
     */
    public void setResolvesToRefs(List<String> resolvesToRefs) {
        this.resolvesToRefs = resolvesToRefs;
    }

    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv4 address belongs to.
     */
    public List<String> getBelongsToRefs() {
        return belongsToRefs;
    }

    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv4 address belongs to.
     */
    public void setBelongsToRefs(List<String> belongsToRefs) {
        this.belongsToRefs = belongsToRefs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ipv4Addr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null) ? "<null>" : this.value));
        sb.append(',');
        sb.append("resolvesToRefs");
        sb.append('=');
        sb.append(((this.resolvesToRefs == null) ? "<null>" : this.resolvesToRefs));
        sb.append(',');
        sb.append("belongsToRefs");
        sb.append('=');
        sb.append(((this.belongsToRefs == null) ? "<null>" : this.belongsToRefs));
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
        result = ((result * 31) + ((this.resolvesToRefs == null) ? 0 : this.resolvesToRefs.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.value == null) ? 0 : this.value.hashCode()));
        result = ((result * 31) + ((this.belongsToRefs == null) ? 0 : this.belongsToRefs.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ipv4Addr) == false) {
            return false;
        }
        Ipv4Addr rhs = ((Ipv4Addr) other);
        return ((((super.equals(rhs) && ((this.resolvesToRefs == rhs.resolvesToRefs) || ((this.resolvesToRefs != null) && this.resolvesToRefs.equals(rhs.resolvesToRefs)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value)))) && ((this.belongsToRefs == rhs.belongsToRefs) || ((this.belongsToRefs != null) && this.belongsToRefs.equals(rhs.belongsToRefs))));
    }

}
