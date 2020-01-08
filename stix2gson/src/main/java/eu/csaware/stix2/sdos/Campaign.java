
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
 * campaign
 * <p>
 * A Campaign is a grouping of adversary behavior that describes a set of malicious activities or attacks that occur over a period of time against a specific set of targets.
 */
public class Campaign extends Core {

    /**
     * The name used to identify the Campaign.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * Alternative names used to identify this campaign.
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
     * This field defines the Campaign’s primary goal, objective, desired outcome, or intended effect.
     */
    @SerializedName("objective")
    @Expose
    private String objective;

    /**
     * No args constructor for use in serialization
     */
    public Campaign() {
    }

    public Campaign(String id, String name, String description, String createdByRef, LocalDateTime created, LocalDateTime modified) {
        super(id, createdByRef, created, modified);
        this.name = name;
        this.description = description;
    }

    public Campaign(String id, String name, String description, List<String> aliases, String firstSeen, String lastSeen,
                    String objective, String createdByRef, List<String> labels, LocalDateTime created, LocalDateTime modified,
                    Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.aliases = aliases;
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
        this.objective = objective;
    }

    /**
     * The name used to identify the Campaign.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Campaign.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Alternative names used to identify this campaign.
     */
    public List<String> getAliases() {
        return aliases;
    }

    /**
     * Alternative names used to identify this campaign.
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
     * This field defines the Campaign’s primary goal, objective, desired outcome, or intended effect.
     */
    public String getObjective() {
        return objective;
    }

    /**
     * This field defines the Campaign’s primary goal, objective, desired outcome, or intended effect.
     */
    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Campaign.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("objective");
        sb.append('=');
        sb.append(((this.objective == null) ? "<null>" : this.objective));
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
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.objective == null) ? 0 : this.objective.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Campaign) == false) {
            return false;
        }
        Campaign rhs = ((Campaign) other);
        return ((((((((super.equals(rhs) && ((this.aliases == rhs.aliases) || ((this.aliases != null) && this.aliases.equals(rhs.aliases)))) && ((this.lastSeen == rhs.lastSeen) || ((this.lastSeen != null) && this.lastSeen.equals(rhs.lastSeen)))) && ((this.firstSeen == rhs.firstSeen) || ((this.firstSeen != null) && this.firstSeen.equals(rhs.firstSeen)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))))) && ((this.objective == rhs.objective) || ((this.objective != null) && this.objective.equals(rhs.objective))));
    }

}
