
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.marking.GranularMarking;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * identity
 * <p>
 * Identities can represent actual individuals, organizations, or groups (e.g., ACME, Inc.) as well as classes of individuals, organizations, or groups.
 */
public class Identity extends Core {

    /**
     * The name of this Identity.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * A description that provides more details and context about the Identity.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov
     * (Required)
     */
    @SerializedName("identity_class")
    @Expose
    @NotNull
    private String identityClass;
    /**
     * The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov
     */
    @SerializedName("sectors")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> sectors = new ArrayList<>();
    /**
     * The contact information (e-mail, phone number, etc.) for this Identity.
     */
    @SerializedName("contact_information")
    @Expose
    private String contactInformation;

    /**
     * No args constructor for use in serialization
     */
    public Identity() {
    }

    public Identity(UUID id, String name, String identityClass, LocalDateTime created, LocalDateTime modified) {
        super(id, created, modified);
        this.name = name;
        this.identityClass = identityClass;
    }

    public Identity(UUID id, List<String> labels, String name, String description, String identityClass,
                    List<String> sectors, String contactInformation, String createdByRef, LocalDateTime created, LocalDateTime modified,
                    Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.identityClass = identityClass;
        this.sectors = sectors;
        this.contactInformation = contactInformation;
    }

    /**
     * The name of this Identity.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * The name of this Identity.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Identity.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Identity.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov
     * (Required)
     */
    public String getIdentityClass() {
        return identityClass;
    }

    /**
     * The type of entity that this Identity describes, e.g., an individual or organization. Open Vocab - identity-class-ov
     * (Required)
     */
    public void setIdentityClass(String identityClass) {
        this.identityClass = identityClass;
    }

    /**
     * The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov
     */
    public List<String> getSectors() {
        return sectors;
    }

    /**
     * The list of sectors that this Identity belongs to. Open Vocab - industry-sector-ov
     */
    public void setSectors(List<String> sectors) {
        this.sectors = sectors;
    }

    /**
     * The contact information (e-mail, phone number, etc.) for this Identity.
     */
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * The contact information (e-mail, phone number, etc.) for this Identity.
     */
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Identity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("identityClass");
        sb.append('=');
        sb.append(((this.identityClass == null) ? "<null>" : this.identityClass));
        sb.append(',');
        sb.append("sectors");
        sb.append('=');
        sb.append(((this.sectors == null) ? "<null>" : this.sectors));
        sb.append(',');
        sb.append("contactInformation");
        sb.append('=');
        sb.append(((this.contactInformation == null) ? "<null>" : this.contactInformation));
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
        result = ((result * 31) + ((this.sectors == null) ? 0 : this.sectors.hashCode()));
        result = ((result * 31) + ((this.identityClass == null) ? 0 : this.identityClass.hashCode()));
        result = ((result * 31) + ((this.contactInformation == null) ? 0 : this.contactInformation.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Identity) == false) {
            return false;
        }
        Identity rhs = ((Identity) other);
        return ((((((((super.equals(rhs) && ((this.sectors == rhs.sectors) || ((this.sectors != null) && this.sectors.equals(rhs.sectors))))
            && ((this.identityClass == rhs.identityClass) || ((this.identityClass != null) && this.identityClass.equals(rhs.identityClass))))
            && ((this.contactInformation == rhs.contactInformation) || ((this.contactInformation != null)
            && this.contactInformation.equals(rhs.contactInformation))))
            && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
            && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))))
            ));
    }
}
