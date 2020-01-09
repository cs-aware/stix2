
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;
import eu.csaware.stix2.marking.GranularMarking;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * attack-pattern
 * <p>
 * Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets.
 */
public class AttackPattern extends Core {

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
    private List<KillChainPhase> killChainPhases = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     */
    public AttackPattern() {
    }

    public AttackPattern(UUID uuid, String name, String description,
                         LocalDateTime created, LocalDateTime modified) {
        super(uuid, created, modified);
        this.name = name;
        this.description = description;
    }

    public AttackPattern(UUID id, String name, String description, List<KillChainPhase> killChainPhases, String createdByRef,
                         List<String> labels, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                         List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.killChainPhases = killChainPhases;
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
        result = ((result * 31) + ((this.killChainPhases == null) ? 0 : this.killChainPhases.hashCode()));
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
        return (((
            (
                (super.equals(rhs) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))))
                && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))
            )
        )
            && ((this.killChainPhases == rhs.killChainPhases) || ((this.killChainPhases != null) && this.killChainPhases.equals(rhs.killChainPhases)))
        ));
    }

}
