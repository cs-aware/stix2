
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * attack-pattern
 * <p>
 * Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets.
 */
public class AttackPattern extends Core {

    /**
     * The type of this object, which MUST be the literal `attack-pattern`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.ATTACK_PATTERN_TYPE)
    private String type = Types.ATTACK_PATTERN_TYPE;
    /**
     * id
     * <p>
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^attack-pattern--")
    private String id;
    /**
     * The name used to identify the Attack Pattern.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * The list of kill chain phases for which this attack pattern is used.
     */
    @SerializedName("kill_chain_phases")
    @Expose
    @Size(min = 1)
    @Valid
    private List<KillChainPhase> killChainPhases = new ArrayList<KillChainPhase>();

    /**
     * No args constructor for use in serialization
     */
    public AttackPattern() {
    }

    /**
     * @param externalReferences
     * @param killChainPhases
     * @param created
     * @param description
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
    public AttackPattern(String type, String id, String name, String description, List<KillChainPhase> killChainPhases, String createdByRef,
                         List<String> labels, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                         List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        if (!type.equals(Types.ATTACK_PATTERN_TYPE)) {
            type = Types.ATTACK_PATTERN_TYPE;
        }
        this.type = type;
        this.id = id;
        this.name = name;
        this.description = description;
        this.killChainPhases = killChainPhases;
    }

    /**
     * The type of this object, which MUST be the literal `attack-pattern`.
     */
    public String getType() {
        return type;
    }

    /**
     * The type of this object, which MUST be the literal `attack-pattern`.
     */
    public void setType(String type) {
        if (!type.equals(Types.ATTACK_PATTERN_TYPE)) {
            type = Types.ATTACK_PATTERN_TYPE;
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
     * The name used to identify the Attack Pattern.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Attack Pattern.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The list of kill chain phases for which this attack pattern is used.
     */
    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    /**
     * The list of kill chain phases for which this attack pattern is used.
     */
    public void setKillChainPhases(List<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttackPattern.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("killChainPhases");
        sb.append('=');
        sb.append(((this.killChainPhases == null) ? "<null>" : this.killChainPhases));
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
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.killChainPhases == null) ? 0 : this.killChainPhases.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttackPattern) == false) {
            return false;
        }
        AttackPattern rhs = ((AttackPattern) other);
        return (((((super.equals(rhs) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.killChainPhases == rhs.killChainPhases) || ((this.killChainPhases != null) && this.killChainPhases.equals(rhs.killChainPhases)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))));
    }

}
