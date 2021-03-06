
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
 * ipv6-addr
 * <p>
 * The IPv6 Address Object represents one or more IPv6 addresses expressed using CIDR notation.
 */
public class Ipv6Addr extends CyberObservableCore {

    /**
     * Specifies one or more IPv6 addresses expressed using CIDR notation.
     * (Required)
     */
    @SerializedName("value")
    @Expose
    @NotNull
    private String value;
    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.
     */
    @SerializedName("resolves_to_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> resolvesToRefs = new ArrayList<String>();
    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.
     */
    @SerializedName("belongs_to_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> belongsToRefs = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     */
    public Ipv6Addr() {
    }

    public Ipv6Addr(String value, List<String> resolvesToRefs, List<String> belongsToRefs, Dictionary extensions) {
        super(extensions);
        this.value = value;
        this.resolvesToRefs = resolvesToRefs;
        this.belongsToRefs = belongsToRefs;
    }

    /**
     * Specifies one or more IPv6 addresses expressed using CIDR notation.
     * (Required)
     */
    public String getValue() {
        return value;
    }

    /**
     * Specifies one or more IPv6 addresses expressed using CIDR notation.
     * (Required)
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.
     */
    public List<String> getResolvesToRefs() {
        return resolvesToRefs;
    }

    /**
     * Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to.
     */
    public void setResolvesToRefs(List<String> resolvesToRefs) {
        this.resolvesToRefs = resolvesToRefs;
    }

    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.
     */
    public List<String> getBelongsToRefs() {
        return belongsToRefs;
    }

    /**
     * Specifies a reference to one or more autonomous systems (AS) that the IPv6 address belongs to.
     */
    public void setBelongsToRefs(List<String> belongsToRefs) {
        this.belongsToRefs = belongsToRefs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ipv6Addr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Ipv6Addr) == false) {
            return false;
        }
        Ipv6Addr rhs = ((Ipv6Addr) other);
        return ((((super.equals(rhs) && ((this.resolvesToRefs == rhs.resolvesToRefs) || ((this.resolvesToRefs != null) && this.resolvesToRefs.equals(rhs.resolvesToRefs))))) && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value)))) && ((this.belongsToRefs == rhs.belongsToRefs) || ((this.belongsToRefs != null) && this.belongsToRefs.equals(rhs.belongsToRefs))));
    }

}
