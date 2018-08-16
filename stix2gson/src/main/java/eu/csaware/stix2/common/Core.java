
package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * core
 * <p>
 * Common properties and behavior across all STIX Domain Objects and STIX Relationship Objects.
 */
public abstract class Core {

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     */
    @SerializedName("created_by_ref")
    @Expose
    @Pattern(regexp = "^[a-z][a-z-]+[a-z]--[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
    private String createdByRef;
    /**
     * The labels property specifies a set of classifications.
     */
    @SerializedName("labels")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> labels;
    /**
     * The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     */
    @SerializedName("created")
    @Expose
    @NotNull
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime created;
    /**
     * The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     */
    @SerializedName("modified")
    @Expose
    @NotNull
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime modified;
    /**
     * The revoked property indicates whether the object has been revoked.
     */
    @SerializedName("revoked")
    @Expose
    private Boolean revoked;
    /**
     * A list of external references which refers to non-STIX information.
     */
    @SerializedName("external_references")
    @Expose
    @Size(min = 1)
    @Valid
    private List<ExternalReference> externalReferences;
    /**
     * The list of marking-definition objects to be applied to this object.
     */
    @SerializedName("object_marking_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> objectMarkingRefs;
    /**
     * The set of granular markings that apply to this object.
     */
    @SerializedName("granular_markings")
    @Expose
    @Size(min = 1)
    @Valid
    private List<GranularMarking> granularMarkings;

    /**
     * No args constructor for use in serialization
     */
    public Core() {
    }

    /**
     * @param externalReferences
     * @param created
     * @param granularMarkings
     * @param modified
     * @param createdByRef
     * @param objectMarkingRefs
     * @param revoked
     * @param labels
     */
    public Core(String createdByRef, List<String> labels, LocalDateTime created, LocalDateTime modified,
                Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs,
                List<GranularMarking> granularMarkings) {
        super();
//		this.id = id;
        this.createdByRef = createdByRef;
        this.labels = labels;
        this.created = created;
        this.modified = modified;
        this.revoked = revoked;
        this.externalReferences = externalReferences;
        this.objectMarkingRefs = objectMarkingRefs;
        this.granularMarkings = granularMarkings;
    }

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     */
    public String getCreatedByRef() {
        return createdByRef;
    }

    /**
     * identifier
     * <p>
     * Represents identifiers across the CTI specifications. The format consists of the name of the top-level object being identified, followed by two dashes (--), followed by a UUIDv4.
     */
    public void setCreatedByRef(String createdByRef) {
        this.createdByRef = createdByRef;
    }

    /**
     * The labels property specifies a set of classifications.
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * The labels property specifies a set of classifications.
     */
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * The created property represents the time at which the first version of this object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     */
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    /**
     * The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     */
    public LocalDateTime getModified() {
        return modified;
    }

    /**
     * The modified property represents the time that this particular version of the object was created. The timstamp value MUST be precise to the nearest millisecond.
     * (Required)
     */
    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    /**
     * The revoked property indicates whether the object has been revoked.
     */
    public Boolean getRevoked() {
        return revoked;
    }

    /**
     * The revoked property indicates whether the object has been revoked.
     */
    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    /**
     * A list of external references which refers to non-STIX information.
     */
    public List<ExternalReference> getExternalReferences() {
        return externalReferences;
    }

    /**
     * A list of external references which refers to non-STIX information.
     */
    public void setExternalReferences(List<ExternalReference> externalReferences) {
        this.externalReferences = externalReferences;
    }

    /**
     * The list of marking-definition objects to be applied to this object.
     */
    public List<String> getObjectMarkingRefs() {
        return objectMarkingRefs;
    }

    /**
     * The list of marking-definition objects to be applied to this object.
     */
    public void setObjectMarkingRefs(List<String> objectMarkingRefs) {
        this.objectMarkingRefs = objectMarkingRefs;
    }

    /**
     * The set of granular markings that apply to this object.
     */
    public List<GranularMarking> getGranularMarkings() {
        return granularMarkings;
    }

    /**
     * The set of granular markings that apply to this object.
     */
    public void setGranularMarkings(List<GranularMarking> granularMarkings) {
        this.granularMarkings = granularMarkings;
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Core.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("createdByRef");
		sb.append('=');
		sb.append(((this.createdByRef == null) ? "<null>" : this.createdByRef));
		sb.append(',');
		sb.append("labels");
		sb.append('=');
		sb.append(((this.labels == null) ? "<null>" : this.labels));
		sb.append(',');
		sb.append("created");
		sb.append('=');
		sb.append(((this.created == null) ? "<null>" : this.created));
		sb.append(',');
		sb.append("modified");
		sb.append('=');
		sb.append(((this.modified == null) ? "<null>" : this.modified));
		sb.append(',');
		sb.append("revoked");
		sb.append('=');
		sb.append(((this.revoked == null) ? "<null>" : this.revoked));
		sb.append(',');
		sb.append("externalReferences");
		sb.append('=');
		sb.append(((this.externalReferences == null) ? "<null>" : this.externalReferences));
		sb.append(',');
		sb.append("objectMarkingRefs");
		sb.append('=');
		sb.append(((this.objectMarkingRefs == null) ? "<null>" : this.objectMarkingRefs));
		sb.append(',');
		sb.append("granularMarkings");
		sb.append('=');
		sb.append(((this.granularMarkings == null) ? "<null>" : this.granularMarkings));
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
		result = ((result * 31) + ((this.externalReferences == null) ? 0 : this.externalReferences.hashCode()));
		result = ((result * 31) + ((this.created == null) ? 0 : this.created.hashCode()));
		result = ((result * 31) + ((this.granularMarkings == null) ? 0 : this.granularMarkings.hashCode()));
		result = ((result * 31) + ((this.modified == null) ? 0 : this.modified.hashCode()));
		result = ((result * 31) + ((this.createdByRef == null) ? 0 : this.createdByRef.hashCode()));
		result = ((result * 31) + ((this.objectMarkingRefs == null) ? 0 : this.objectMarkingRefs.hashCode()));
		result = ((result * 31) + ((this.revoked == null) ? 0 : this.revoked.hashCode()));
		result = ((result * 31) + ((this.labels == null) ? 0 : this.labels.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Core) == false) {
			return false;
		}
		Core rhs = ((Core) other);
		return (((((((((this.externalReferences == rhs.externalReferences) || ((this.externalReferences != null) && this.externalReferences.equals(rhs.externalReferences))) &&
				  ((this.created == rhs.created) || ((this.created != null) && this.created.equals(rhs.created)))) &&
				  ((this.granularMarkings == rhs.granularMarkings) || ((this.granularMarkings != null) && this.granularMarkings.equals(rhs.granularMarkings)))) &&
				  ((this.modified == rhs.modified) || ((this.modified != null) && this.modified.equals(rhs.modified)))) &&
				  ((this.createdByRef == rhs.createdByRef) || ((this.createdByRef != null) && this.createdByRef.equals(rhs.createdByRef)))) &&
				  ((this.objectMarkingRefs == rhs.objectMarkingRefs) || ((this.objectMarkingRefs != null) && this.objectMarkingRefs.equals(rhs.objectMarkingRefs)))) &&
				  ((this.revoked == rhs.revoked) || ((this.revoked != null) && this.revoked.equals(rhs.revoked)))) &&
				  ((this.labels == rhs.labels) || ((this.labels != null) && this.labels.equals(rhs.labels))));
	}
}
