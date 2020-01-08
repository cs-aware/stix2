
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;
import eu.csaware.stix2.marking.GranularMarking;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * report
 * <p>
 * Reports are collections of threat intelligence focused on one or more topics, such as a description of a threat actor, malware, or attack technique, including context and related details.
 */
public class Report extends Core {

    /**
     * The name used to identify the Report.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * A description that provides more details and context about Report.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    @SerializedName("published")
    @Expose
    @NotNull
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime published;
    /**
     * Specifies the STIX Objects that are referred to by this Report.
     * (Required)
     */
    @SerializedName("object_refs")
    @Expose
    @Size(min = 1)
    @Valid
    @NotNull
    private List<String> objectRefs = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     */
    public Report() {
    }

    public Report(String id, List<String> labels, String name, String description, LocalDateTime published, List<String> objectRefs,
                  String createdByRef, LocalDateTime created, LocalDateTime modified) {
        super(id, createdByRef, labels, created, modified);
        this.name = name;
        this.description = description;
        this.published = published;
        this.objectRefs = objectRefs;
    }

    public Report(String id, List<String> labels, String name, String description, LocalDateTime published, List<String> objectRefs,
                  String createdByRef, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                  List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.published = published;
        this.objectRefs = objectRefs;
    }

    /**
     * The name used to identify the Report.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Report.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about Report.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about Report.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public LocalDateTime getPublished() {
        return published;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public void setPublished(LocalDateTime published) {
        this.published = published;
    }

    /**
     * Specifies the STIX Objects that are referred to by this Report.
     * (Required)
     */
    public List<String> getObjectRefs() {
        return objectRefs;
    }

    /**
     * Specifies the STIX Objects that are referred to by this Report.
     * (Required)
     */
    public void setObjectRefs(List<String> objectRefs) {
        this.objectRefs = objectRefs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Report.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("published");
        sb.append('=');
        sb.append(((this.published == null) ? "<null>" : this.published));
        sb.append(',');
        sb.append("objectRefs");
        sb.append('=');
        sb.append(((this.objectRefs == null) ? "<null>" : this.objectRefs));
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
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.objectRefs == null) ? 0 : this.objectRefs.hashCode()));
        result = ((result * 31) + ((this.published == null) ? 0 : this.published.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Report) == false) {
            return false;
        }
        Report rhs = ((Report) other);
        return (((((((super.equals(rhs) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.objectRefs == rhs.objectRefs) || ((this.objectRefs != null) && this.objectRefs.equals(rhs.objectRefs))))) && ((this.published == rhs.published) || ((this.published != null) && this.published.equals(rhs.published))))));
    }

}
