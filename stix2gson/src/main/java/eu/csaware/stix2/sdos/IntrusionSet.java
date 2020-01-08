
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.marking.GranularMarking;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * intrusion-set
 * <p>
 * An Intrusion Set is a grouped set of adversary behavior and resources with common properties that is believed to be orchestrated by a single organization.
 */
public class IntrusionSet extends Core {

    /**
     * The name used to identify the Intrusion Set.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * Provides more context and details about the Intrusion Set object.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * Alternative names used to identify this Intrusion Set.
     */
    @SerializedName("aliases")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> aliases = new ArrayList<String>();
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("first_seen")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String firstSeen;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("last_seen")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String lastSeen;
    /**
     * The high level goals of this Intrusion Set, namely, what are they trying to do.
     */
    @SerializedName("goals")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> goals = new ArrayList<String>();
    /**
     * This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov
     */
    @SerializedName("resource_level")
    @Expose
    private String resourceLevel;
    /**
     * The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov
     */
    @SerializedName("primary_motivation")
    @Expose
    private String primaryMotivation;
    /**
     * The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov
     */
    @SerializedName("secondary_motivations")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> secondaryMotivations = new ArrayList<String>();

    /**
     * No args constructor for use in serialization
     */
    public IntrusionSet() {
    }

    public IntrusionSet(String id, String name, String description, List<String> aliases,
                        List<String> goals, String createdByRef, LocalDateTime created, LocalDateTime modified) {
        super(id, createdByRef, created, modified);
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.goals = goals;
    }

    public IntrusionSet(String id, String name, String description, List<String> aliases, String firstSeen, String lastSeen,
                        List<String> goals, String resourceLevel, String primaryMotivation, List<String> secondaryMotivations,
                        String createdByRef, List<String> labels, LocalDateTime created, LocalDateTime modified, Boolean revoked,
                        List<ExternalReference> externalReferences, List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
        this.goals = goals;
        this.resourceLevel = resourceLevel;
        this.primaryMotivation = primaryMotivation;
        this.secondaryMotivations = secondaryMotivations;
    }

    /**
     * The name used to identify the Intrusion Set.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Intrusion Set.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Provides more context and details about the Intrusion Set object.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Provides more context and details about the Intrusion Set object.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Alternative names used to identify this Intrusion Set.
     */
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Alternative names used to identify this Intrusion Set.
     */
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getFirstSeen() {
        return firstSeen;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getLastSeen() {
        return lastSeen;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * The high level goals of this Intrusion Set, namely, what are they trying to do.
     */
    public List<String> getGoals() {
        return goals;
    }

    /**
     * The high level goals of this Intrusion Set, namely, what are they trying to do.
     */
    public void setGoals(List<String> goals) {
        this.goals = goals;
    }

    /**
     * This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov
     */
    public String getResourceLevel() {
        return resourceLevel;
    }

    /**
     * This defines the organizational level at which this Intrusion Set typically works. Open Vocab - attack-resource-level-ov
     */
    public void setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
    }

    /**
     * The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov
     */
    public String getPrimaryMotivation() {
        return primaryMotivation;
    }

    /**
     * The primary reason, motivation, or purpose behind this Intrusion Set. Open Vocab - attack-motivation-ov
     */
    public void setPrimaryMotivation(String primaryMotivation) {
        this.primaryMotivation = primaryMotivation;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov
     */
    public List<String> getSecondaryMotivations() {
        return secondaryMotivations;
    }

    /**
     * The secondary reasons, motivations, or purposes behind this Intrusion Set. Open Vocab - attack-motivation-ov
     */
    public void setSecondaryMotivations(List<String> secondaryMotivations) {
        this.secondaryMotivations = secondaryMotivations;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IntrusionSet.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("aliases");
        sb.append('=');
        sb.append(((this.aliases == null) ? "<null>" : this.aliases));
        sb.append(',');
        sb.append("firstSeen");
        sb.append('=');
        sb.append(((this.firstSeen == null) ? "<null>" : this.firstSeen));
        sb.append(',');
        sb.append("lastSeen");
        sb.append('=');
        sb.append(((this.lastSeen == null) ? "<null>" : this.lastSeen));
        sb.append(',');
        sb.append("goals");
        sb.append('=');
        sb.append(((this.goals == null) ? "<null>" : this.goals));
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
        result = ((result * 31) + ((this.lastSeen == null) ? 0 : this.lastSeen.hashCode()));
        result = ((result * 31) + ((this.firstSeen == null) ? 0 : this.firstSeen.hashCode()));
        result = ((result * 31) + ((this.resourceLevel == null) ? 0 : this.resourceLevel.hashCode()));
        result = ((result * 31) + ((this.primaryMotivation == null) ? 0 : this.primaryMotivation.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
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
        if ((other instanceof IntrusionSet) == false) {
            return false;
        }
        IntrusionSet rhs = ((IntrusionSet) other);
        return (((((((((((super.equals(rhs) && ((this.aliases == rhs.aliases) || ((this.aliases != null) && this.aliases.equals(rhs.aliases)))) && ((this.lastSeen == rhs.lastSeen) || ((this.lastSeen != null) && this.lastSeen.equals(rhs.lastSeen)))) && ((this.firstSeen == rhs.firstSeen) || ((this.firstSeen != null) && this.firstSeen.equals(rhs.firstSeen)))) && ((this.resourceLevel == rhs.resourceLevel) || ((this.resourceLevel != null) && this.resourceLevel.equals(rhs.resourceLevel)))) && ((this.primaryMotivation == rhs.primaryMotivation) || ((this.primaryMotivation != null) && this.primaryMotivation.equals(rhs.primaryMotivation)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description))))) && ((this.secondaryMotivations == rhs.secondaryMotivations) || ((this.secondaryMotivations != null) && this.secondaryMotivations.equals(rhs.secondaryMotivations))))) && ((this.goals == rhs.goals) || ((this.goals != null) && this.goals.equals(rhs.goals))));
    }
}
