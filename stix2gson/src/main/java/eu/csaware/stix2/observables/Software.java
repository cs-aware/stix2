
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * software
 * <p>
 * The Software Object represents high-level properties associated with software, including software products.
 */
public class Software extends CyberObservableCore {

    /**
     * The value of this property MUST be `software`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.SOFTWARE_TYPE)
    private String type = Types.SOFTWARE_TYPE;
    /**
     * Specifies the name of the software.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.
     */
    @SerializedName("cpe")
    @Expose
    @Pattern(regexp = "cpe:2\\.3:[aho](?::(?:[a-zA-Z0-9!\"#$%&'()*+,\\\\-_./;<=>?@\\[\\]^`{|}~]|\\:)+){10}$")
    private String cpe;
    /**
     * Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.
     */
    @SerializedName("languages")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> languages;
    /**
     * Specifies the name of the vendor of the software.
     */
    @SerializedName("vendor")
    @Expose
    private String vendor;
    /**
     * Specifies the version of the software.
     */
    @SerializedName("version")
    @Expose
    private String version;

    /**
     * No args constructor for use in serialization
     */
    public Software() {
    }

    /**
     * @param extensions
     * @param languages
     * @param vendor
     * @param name
     * @param cpe
     * @param type
     * @param version
     */
    public Software(String type, String name, String cpe, List<String> languages, String vendor, String version, Dictionary extensions) {
        super(extensions);
        if (!type.equals(Types.SOFTWARE_TYPE)) {
            type = Types.SOFTWARE_TYPE;
        }
        this.type = type;
        this.name = name;
        this.cpe = cpe;
        this.languages = languages;
        this.vendor = vendor;
        this.version = version;
    }

    /**
     * The value of this property MUST be `software`.
     */
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `software`.
     */
    public void setType(String type) {
        if (!type.equals(Types.SOFTWARE_TYPE)) {
            type = Types.SOFTWARE_TYPE;
        }
        this.type = type;
    }

    /**
     * Specifies the name of the software.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the software.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.
     */
    public String getCpe() {
        return cpe;
    }

    /**
     * Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary.
     */
    public void setCpe(String cpe) {
        this.cpe = cpe;
    }

    /**
     * Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.
     */
    public List<String> getLanguages() {
        return languages;
    }

    /**
     * Specifies the languages supported by the software. The value of each list member MUST be an ISO 639-2 language code.
     */
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    /**
     * Specifies the name of the vendor of the software.
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Specifies the name of the vendor of the software.
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * Specifies the version of the software.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Specifies the version of the software.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Software.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("cpe");
        sb.append('=');
        sb.append(((this.cpe == null) ? "<null>" : this.cpe));
        sb.append(',');
        sb.append("languages");
        sb.append('=');
        sb.append(((this.languages == null) ? "<null>" : this.languages));
        sb.append(',');
        sb.append("vendor");
        sb.append('=');
        sb.append(((this.vendor == null) ? "<null>" : this.vendor));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null) ? "<null>" : this.version));
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
        result = ((result * 31) + ((this.languages == null) ? 0 : this.languages.hashCode()));
        result = ((result * 31) + ((this.vendor == null) ? 0 : this.vendor.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.cpe == null) ? 0 : this.cpe.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.version == null) ? 0 : this.version.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Software) == false) {
            return false;
        }
        Software rhs = ((Software) other);
        return ((((((super.equals(rhs) && ((this.languages == rhs.languages) || ((this.languages != null) && this.languages.equals(rhs.languages)))) && ((this.vendor == rhs.vendor) || ((this.vendor != null) && this.vendor.equals(rhs.vendor)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.cpe == rhs.cpe) || ((this.cpe != null) && this.cpe.equals(rhs.cpe)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.version == rhs.version) || ((this.version != null) && this.version.equals(rhs.version))));
    }

}
