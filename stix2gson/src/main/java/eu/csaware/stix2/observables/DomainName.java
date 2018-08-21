
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;


/**
 * domain-name
 * <p>
 * The Domain Name represents the properties of a network domain name.
 */
public class DomainName extends CyberObservableCore {

    /**
     * The value of this property MUST be `domain-name`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.DOMAIN_NAME_TYPE)
    private String type = Types.DOMAIN_NAME_TYPE;
    /**
     * Specifies the value of the domain name.
     * (Required)
     */
    @SerializedName("value")
    @Expose
    @NotNull
    private String value;
    /**
     * Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.
     */
    @SerializedName("resolves_to_refs")
    @Expose
    @Valid
    private List<String> resolvesToRefs = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     */
    public DomainName() {
    }

    public DomainName(String value, List<String> resolvesToRefs, Dictionary extensions) {
        super(extensions);
        this.value = value;
        this.resolvesToRefs = resolvesToRefs;
    }

    /**
     * The value of this property MUST be `domain-name`.
     */
    public String getType() {
        return type;
    }

    /**
     * Specifies the value of the domain name.
     * (Required)
     */
    public String getValue() {
        return value;
    }

    /**
     * Specifies the value of the domain name.
     * (Required)
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.
     */
    public List<String> getResolvesToRefs() {
        return resolvesToRefs;
    }

    /**
     * Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to.
     */
    public void setResolvesToRefs(List<String> resolvesToRefs) {
        this.resolvesToRefs = resolvesToRefs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomainName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainName) == false) {
            return false;
        }
        DomainName rhs = ((DomainName) other);
        return (((super.equals(rhs) && ((this.resolvesToRefs == rhs.resolvesToRefs) || ((this.resolvesToRefs != null) && this.resolvesToRefs.equals(rhs.resolvesToRefs)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value))));
    }

}
