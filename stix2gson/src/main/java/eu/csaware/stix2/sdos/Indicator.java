
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
 * indicator
 * <p>
 * Indicators contain a pattern that can be used to detect suspicious or malicious cyber activity.
 */
public class Indicator extends Core {

    /**
     * The name used to identify the Indicator.
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * The detection pattern for this indicator. The default language is STIX Patterning.
     * (Required)
     */
    @SerializedName("pattern")
    @Expose
    @NotNull
    private String pattern; //TODO pattern class
    /**
     * The time from which this indicator should be considered valuable intelligence.
     * (Required)
     */
    @SerializedName("valid_from")
    @Expose
    @NotNull
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime validFrom;
    /**
     * The time at which this indicator should no longer be considered valuable intelligence.
     */
    @SerializedName("valid_until")
    @Expose
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime validUntil;
    /**
     * The phases of the kill chain that this indicator detects.
     */
    @SerializedName("kill_chain_phases")
    @Expose
    @Size(min = 1)
    @Valid
    private List<KillChainPhase> killChainPhases = new ArrayList<KillChainPhase>();

    /**
     * No args constructor for use in serialization
     */
    public Indicator() {
    }

    public Indicator(String id, List<String> labels, String pattern, LocalDateTime validFrom,
                     LocalDateTime created, LocalDateTime modified) {
        super(id, labels, created, modified);
        this.pattern = pattern;
        this.validFrom = validFrom;
    }

    public Indicator(String id, List<String> labels, String name, String description, String pattern, LocalDateTime validFrom,
                     LocalDateTime validUntil, List<KillChainPhase> killChainPhases, String createdByRef, LocalDateTime created,
                     LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs,
                     List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.pattern = pattern;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.killChainPhases = killChainPhases;
    }

    /**
     * The name used to identify the Indicator.
     */
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Indicator.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.
     */
    public String getDescription() {
        return description;
    }

    /**
     * A description that provides the recipient with context about this Indicator potentially including its purpose and its key characteristics.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The detection pattern for this indicator. The default language is STIX Patterning.
     * (Required)
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * The detection pattern for this indicator. The default language is STIX Patterning.
     * (Required)
     */
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * The time from which this indicator should be considered valuable intelligence.
     * (Required)
     */
    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    /**
     * The time from which this indicator should be considered valuable intelligence.
     * (Required)
     */
    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * The time at which this indicator should no longer be considered valuable intelligence.
     */
    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * The time at which this indicator should no longer be considered valuable intelligence.
     */
    public void setValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
    }

    /**
     * The phases of the kill chain that this indicator detects.
     */
    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    /**
     * The phases of the kill chain that this indicator detects.
     */
    public void setKillChainPhases(List<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Indicator.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("pattern");
        sb.append('=');
        sb.append(((this.pattern == null) ? "<null>" : this.pattern));
        sb.append(',');
        sb.append("validFrom");
        sb.append('=');
        sb.append(((this.validFrom == null) ? "<null>" : this.validFrom));
        sb.append(',');
        sb.append("validUntil");
        sb.append('=');
        sb.append(((this.validUntil == null) ? "<null>" : this.validUntil));
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
        result = ((result * 31) + ((this.killChainPhases == null) ? 0 : this.killChainPhases.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.pattern == null) ? 0 : this.pattern.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + ((this.validUntil == null) ? 0 : this.validUntil.hashCode()));
        result = ((result * 31) + ((this.validFrom == null) ? 0 : this.validFrom.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Indicator) == false) {
            return false;
        }
        Indicator rhs = ((Indicator) other);
        return (((((((((super.equals(rhs) && ((this.killChainPhases == rhs.killChainPhases) || ((this.killChainPhases != null) && this.killChainPhases.equals(rhs.killChainPhases)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.pattern == rhs.pattern) || ((this.pattern != null) && this.pattern.equals(rhs.pattern)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.validUntil == rhs.validUntil) || ((this.validUntil != null) && this.validUntil.equals(rhs.validUntil))))) && ((this.validFrom == rhs.validFrom) || ((this.validFrom != null) && this.validFrom.equals(rhs.validFrom))))));
    }

}
