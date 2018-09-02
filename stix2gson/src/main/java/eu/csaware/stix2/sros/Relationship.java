
package eu.csaware.stix2.sros;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.common.GranularMarking;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;


/**
 * relationship
 * <p>
 * The Relationship object is used to link together two SDOs in order to describe how they are related to each other.
 */
public class Relationship extends Core {

    public static final transient String TYPE_TARGETS = "target";
    public static final transient String TYPE_USES = "uses";
    public static final transient String TYPE_ATTRIBUTED_TO = "attributed-to";
    public static final transient String TYPE_MITIGATES = "mitigates";
    public static final transient String TYPE_INDICATES = "indicates";
    public static final transient String TYPE_VARIANT_OF = "variant-of";
    public static final transient String TYPE_IMPERSONATES = "impersonates";

    /**
     * The type of this object, which MUST be the literal `relationship`.
     */
    @SerializedName("type")
    @Expose
    private Stix2Type type = Stix2Type.RELATIONSHIP;
    /**
     * id
     * <p>
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^relationship--")
    private String id;
    /**
     * relationship_type
     * <p>
     * The name used to identify the type of relationship.
     * (Required)
     */
    @SerializedName("relationship_type")
    @Expose
    @Pattern(regexp = "^[a-z0-9\\-]+$")
    @NotNull
    private String relationshipType;
    /**
     * A description that helps provide context about the relationship.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * The ID of the source (from) object.
     * (Required)
     */
    @SerializedName("source_ref")
    @Expose
    @NotNull
    private String sourceRef;
    /**
     * The ID of the target (to) object.
     * (Required)
     */
    @SerializedName("target_ref")
    @Expose
    @NotNull
    private String targetRef;

    /**
     * No args constructor for use in serialization
     */
    public Relationship() {
    }

    public Relationship(String id, String relationshipType, String sourceRef, String targetRef,
                        LocalDateTime created, LocalDateTime modified) {
        super(created, modified);
        this.id = id;
        this.relationshipType = relationshipType;
        this.sourceRef = sourceRef;
        this.targetRef = targetRef;
    }

    public Relationship(String id, String relationshipType, String description, String sourceRef, String targetRef,
                        String createdByRef, List<String> labels, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.id = id;
        this.relationshipType = relationshipType;
        this.description = description;
        this.sourceRef = sourceRef;
        this.targetRef = targetRef;
    }

    /**
     * The type of this object, which MUST be the literal `relationship`.
     */
    public Stix2Type getType() {
        return type;
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
     * relationship_type
     * <p>
     * The name used to identify the type of relationship.
     * (Required)
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * relationship_type
     * <p>
     * The name used to identify the type of relationship.
     * (Required)
     */
    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * A description that helps provide context about the relationship.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that helps provide context about the relationship.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The ID of the source (from) object.
     * (Required)
     */
    public String getSourceRef() {
        return sourceRef;
    }

    /**
     * The ID of the source (from) object.
     * (Required)
     */
    public void setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
    }

    /**
     * The ID of the target (to) object.
     * (Required)
     */
    public String getTargetRef() {
        return targetRef;
    }

    /**
     * The ID of the target (to) object.
     * (Required)
     */
    public void setTargetRef(String targetRef) {
        this.targetRef = targetRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Relationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("relationshipType");
        sb.append('=');
        sb.append(((this.relationshipType == null) ? "<null>" : this.relationshipType));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("sourceRef");
        sb.append('=');
        sb.append(((this.sourceRef == null) ? "<null>" : this.sourceRef));
        sb.append(',');
        sb.append("targetRef");
        sb.append('=');
        sb.append(((this.targetRef == null) ? "<null>" : this.targetRef));
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
        result = ((result * 31) + ((this.targetRef == null) ? 0 : this.targetRef.hashCode()));
        result = ((result * 31) + ((this.relationshipType == null) ? 0 : this.relationshipType.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.sourceRef == null) ? 0 : this.sourceRef.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Relationship) == false) {
            return false;
        }
        Relationship rhs = ((Relationship) other);
        return ((((((super.equals(rhs) && ((this.targetRef == rhs.targetRef) || ((this.targetRef != null) && this.targetRef.equals(rhs.targetRef)))) && ((this.relationshipType == rhs.relationshipType) || ((this.relationshipType != null) && this.relationshipType.equals(rhs.relationshipType)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.sourceRef == rhs.sourceRef) || ((this.sourceRef != null) && this.sourceRef.equals(rhs.sourceRef))));
    }

}
