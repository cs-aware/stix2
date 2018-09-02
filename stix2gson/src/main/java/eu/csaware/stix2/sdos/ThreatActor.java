
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.common.GranularMarking;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * threat-actor
 * <p>
 * Threat Actors are actual individuals, groups, or organizations believed to be operating with malicious intent.
 */
public class ThreatActor extends Core {

    /**
     * The type of this object, which MUST be the literal `threat-actor`.
     */
    @SerializedName("type")
    @Expose
    private Stix2Type type = Stix2Type.THREAT_ACTOR;
    /**
     * id
     * <p>
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^threat-actor--")
    private String id;
    /**
     * A name used to identify this Threat Actor or Threat Actor group.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * A description that provides more details and context about the Threat Actor.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * A list of other names that this Threat Actor is believed to use.
     */
    @SerializedName("aliases")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> aliases = new ArrayList<>();
    /**
     * This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov
     */
    @SerializedName("roles")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> roles = new ArrayList<>();
    /**
     * The high level goals of this Threat Actor, namely, what are they trying to do.
     */
    @SerializedName("goals")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> goals = new ArrayList<>();
    /**
     * The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov
     */
    @SerializedName("sophistication")
    @Expose
    private String sophistication;
    /**
     * This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov
     */
    @SerializedName("resource_level")
    @Expose
    private String resourceLevel;
    /**
     * The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov
     */
    @SerializedName("primary_motivation")
    @Expose
    private String primaryMotivation;
    /**
     * The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov
     */
    @SerializedName("secondary_motivations")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> secondaryMotivations = new ArrayList<>();
    /**
     * The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov
     */
    @SerializedName("personal_motivations")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> personalMotivations = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     */
    public ThreatActor() {
    }

    public ThreatActor(String id, List<String> labels, String name, String description, String createdByRef,
                       LocalDateTime created, LocalDateTime modified) {
        super(createdByRef, labels, created, modified);
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ThreatActor(String id, List<String> labels, String name, String description, List<String> aliases,
                       List<String> roles, List<String> goals, String sophistication, String resourceLevel, String primaryMotivation,
                       List<String> secondaryMotivations, List<String> personalMotivations, String createdByRef, LocalDateTime created,
                       LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs,
                       List<GranularMarking> granularMarkings) {
        super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.id = id;
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.roles = roles;
        this.goals = goals;
        this.sophistication = sophistication;
        this.resourceLevel = resourceLevel;
        this.primaryMotivation = primaryMotivation;
        this.secondaryMotivations = secondaryMotivations;
        this.personalMotivations = personalMotivations;
    }

    /**
     * The type of this object, which MUST be the literal `threat-actor`.
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
     * A name used to identify this Threat Actor or Threat Actor group.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * A name used to identify this Threat Actor or Threat Actor group.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Threat Actor.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Threat Actor.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A list of other names that this Threat Actor is believed to use.
     */
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * A list of other names that this Threat Actor is believed to use.
     */
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov
     */
    public List<String> getRoles() {
        return roles;
    }

    /**
     * This is a list of roles the Threat Actor plays. Open Vocab - threat-actor-role-ov
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * The high level goals of this Threat Actor, namely, what are they trying to do.
     */
    public List<String> getGoals() {
        return goals;
    }

    /**
     * The high level goals of this Threat Actor, namely, what are they trying to do.
     */
    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    /**
     * The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov
     */
    public String getSophistication() {
        return sophistication;
    }

    /**
     * The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. Open Vocab - threat-actor-sophistication-ov
     */
    public void setSophistication(String sophistication) {
        this.sophistication = sophistication;
    }

    /**
     * This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov
     */
    public String getResourceLevel() {
        return resourceLevel;
    }

    /**
     * This defines the organizational level at which this Threat Actor typically works. Open Vocab - attack-resource-level-ov
     */
    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    /**
     * The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov
     */
    public String getPrimaryMotivation() {
        return primaryMotivation;
    }

    /**
     * The primary reason, motivation, or purpose behind this Threat Actor. Open Vocab - attack-motivation-ov
     */
    public void setPrimaryMotivation(String primaryMotivation) {
        this.primaryMotivation = primaryMotivation;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov
     */
    public List<String> getSecondaryMotivations() {
        return secondaryMotivations;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Threat Actor. Open Vocab - attack-motivation-ov
     */
    public void setSecondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
    }

    /**
     * The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov
     */
    public List<String> getPersonalMotivations() {
        return personalMotivations;
    }

    /**
     * The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Open Vocab - attack-motivation-ov
     */
    public void setPersonalMotivations(List<String> personalMotivations) {
        this.personalMotivations = personalMotivations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThreatActor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("aliases");
        sb.append('=');
        sb.append(((this.aliases == null) ? "<null>" : this.aliases));
        sb.append(',');
        sb.append("roles");
        sb.append('=');
        sb.append(((this.roles == null) ? "<null>" : this.roles));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null) ? "<null>" : this.goals));
        sb.append(',');
        sb.append("sophistication");
        sb.append('=');
        sb.append(((this.sophistication == null) ? "<null>" : this.sophistication));
        sb.append(',');
        sb.append("resourceLevel");
        sb.append('=');
        sb.append(((this.resourceLevel == null) ? "<null>" : this.resourceLevel));
        sb.append(',');
        sb.append("primaryMotivation");
        sb.append('=');
        sb.append(((this.primaryMotivation == null) ? "<null>" : this.primaryMotivation));
        sb.append(',');
        sb.append("secondaryMotivations");
        sb.append('=');
        sb.append(((this.secondaryMotivations == null) ? "<null>" : this.secondaryMotivations));
        sb.append(',');
        sb.append("personalMotivations");
        sb.append('=');
        sb.append(((this.personalMotivations == null) ? "<null>" : this.personalMotivations));
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
        result = ((result * 31) + ((this.aliases == null) ? 0 : this.aliases.hashCode()));
        result = ((result * 31) + ((this.sophistication == null) ? 0 : this.sophistication.hashCode()));
        result = ((result * 31) + ((this.roles == null) ? 0 : this.roles.hashCode()));
        result = ((result * 31) + ((this.resourceLevel == null) ? 0 : this.resourceLevel.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.primaryMotivation == null) ? 0 : this.primaryMotivation.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.personalMotivations == null) ? 0 : this.personalMotivations.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.secondaryMotivations == null) ? 0 : this.secondaryMotivations.hashCode()));
        result = ((result * 31) + ((this.goals == null) ? 0 : this.goals.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreatActor) == false) {
            return false;
        }
        ThreatActor rhs = ((ThreatActor) other);
        return (((((((((((((super.equals(rhs) && ((this.aliases == rhs.aliases) || ((this.aliases != null) && this.aliases.equals(rhs.aliases)))) && ((this.sophistication == rhs.sophistication) || ((this.sophistication != null) && this.sophistication.equals(rhs.sophistication)))) && ((this.roles == rhs.roles) || ((this.roles != null) && this.roles.equals(rhs.roles)))) && ((this.resourceLevel == rhs.resourceLevel) || ((this.resourceLevel != null) && this.resourceLevel.equals(rhs.resourceLevel)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))) && ((this.primaryMotivation == rhs.primaryMotivation) || ((this.primaryMotivation != null) && this.primaryMotivation.equals(rhs.primaryMotivation)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.personalMotivations == rhs.personalMotivations) || ((this.personalMotivations != null) && this.personalMotivations.equals(rhs.personalMotivations)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.secondaryMotivations == rhs.secondaryMotivations) || ((this.secondaryMotivations != null) && this.secondaryMotivations.equals(rhs.secondaryMotivations)))) && ((this.goals == rhs.goals) || ((this.goals != null) && this.goals.equals(rhs.goals))));
    }

}
