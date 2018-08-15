
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.common.GranularMarking;
import eu.csaware.stix2.common.Types;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
     * The type of this object, which MUST be the literal `report`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.REPORT_TYPE)
    private String type = Types.REPORT_TYPE;
    /**
     * id
     * <p>
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^report--")
    private String id;
    /**
     * This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.
     * (Required)
     */
    @SerializedName("labels")
    @Expose
    @Size(min = 1)
    @Valid
    @NotNull
    private List<String> labels = new ArrayList<String>();
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
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    @NotNull
    private String published;
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

    /**
     * @param externalReferences
     * @param created
     * @param description
     * @param objectRefs
     * @param published
     * @param type
     * @param revoked
     * @param labels
     * @param granularMarkings
     * @param name
     * @param modified
     * @param createdByRef
     * @param id
     * @param objectMarkingRefs
     */
    public Report(String type, String id, List<String> labels, String name, String description, String published, List<String> objectRefs,
                  String createdByRef, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                  List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        if (!type.equals(Types.REPORT_TYPE)) {
            type = Types.REPORT_TYPE;
        }
        this.type = type;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.description = description;
        this.published = published;
        this.objectRefs = objectRefs;
    }

    /**
     * The type of this object, which MUST be the literal `report`.
     */
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `report`.
     */
    public void setType(String type) {
        if (!type.equals(Types.REPORT_TYPE)) {
            type = Types.REPORT_TYPE;
        }
        this.type = type;
    }

    /**
     * id
     * <p>
     */
    public String getId() {
        return id;
    }

    /**
     * id
     * <p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.
     * (Required)
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * This field is an Open Vocabulary that specifies the primary subject of this report. The suggested values for this field are in report-label-ov.
     * (Required)
     */
    public void setLabels(List<String> labels) {
        this.labels = labels;
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
    public String getPublished() {
        return published;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public void setPublished(String published) {
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
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
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.published == null) ? 0 : this.published.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.labels == null) ? 0 : this.labels.hashCode()));
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
        return (((((((super.equals(rhs) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.objectRefs == rhs.objectRefs) || ((this.objectRefs != null) && this.objectRefs.equals(rhs.objectRefs)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.published == rhs.published) || ((this.published != null) && this.published.equals(rhs.published)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.labels == rhs.labels) || ((this.labels != null) && this.labels.equals(rhs.labels))));
    }

}
