
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;


/**
 * observed-data
 * <p>
 * Observed data conveys information that was observed on systems and networks, such as log data or network traffic, using the Cyber Observable specification.
 */
public class ObservedData extends Core {

    /**
     * The type of this object, which MUST be the literal `observed-data`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.OBSERVED_DATA_TYPE)
    private String type = Types.OBSERVED_DATA_TYPE;
    /**
     * id
     * <p>
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^observed-data--")
    private String id;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    @SerializedName("first_observed")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    @NotNull
    private String firstObserved;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    @SerializedName("last_observed")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    @NotNull
    private String lastObserved;
    /**
     * The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.
     * (Required)
     */
    @SerializedName("number_observed")
    @Expose
    @DecimalMin("1")
    @DecimalMax("999999999")
    @NotNull
    private Integer numberObserved;
    /**
     * Custóm field describing the severity of the incident. The field describes a general clasification that may be defined by other parties (national secutiry authority etc.)
     */
    @SerializedName("x_da_threat_severity")
    @Expose
    @DecimalMin("1")
    @DecimalMax("10")
    private Integer xDaThreatSeverity;
    /**
     * Custom field describing the risk that the observed threat will be exploited
     */
    @SerializedName("x_da_risk_level")
    @Expose
    @DecimalMin("1")
    @DecimalMax("100")
    private Integer xDaRiskLevel;
    /**
     * Custom field describing how easy it is to exploit the threat in a given context (Local Public Administration or the like)
     */
    @SerializedName("x_da_exploitability_level")
    @Expose
    @DecimalMin("1")
    @DecimalMax("100")
    private Integer xDaExploitabilityLevel;
    /**
     * Custom field describing the overall group the observed data belongs to
     */
    @SerializedName("x_da_threat_group")
    @Expose
    private String xDaThreatGroup;
    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     */
    @SerializedName("objects")
    @Expose
    @Valid
    @NotNull
//	private Objects objects;
    private Map<String, CyberObservableCore> objects;

    /**
     * No args constructor for use in serialization
     */
    public ObservedData() {
    }

    public ObservedData(String id, String firstObserved, String lastObserved, Integer numberObserved, Integer xDaThreatSeverity,
                        Integer xDaRiskLevel, Integer xDaExploitabilityLevel, String xDaThreatGroup, Map<String, CyberObservableCore> objects, String createdByRef,
                        List<String> labels, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                        List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.id = id;
        this.firstObserved = firstObserved;
        this.lastObserved = lastObserved;
        this.numberObserved = numberObserved;
        this.xDaThreatSeverity = xDaThreatSeverity;
        this.xDaRiskLevel = xDaRiskLevel;
        this.xDaExploitabilityLevel = xDaExploitabilityLevel;
        this.xDaThreatGroup = xDaThreatGroup;
        this.objects = objects;
    }

    /**
     * The type of this object, which MUST be the literal `observed-data`.
     */
    public String getType() {
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
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public String getFirstObserved() {
        return firstObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public void setFirstObserved(String firstObserved) {
        this.firstObserved = firstObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public String getLastObserved() {
        return lastObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public void setLastObserved(String lastObserved) {
        this.lastObserved = lastObserved;
    }

    /**
     * The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.
     * (Required)
     */
    public Integer getNumberObserved() {
        return numberObserved;
    }

    /**
     * The number of times the data represented in the objects property was observed. This MUST be an integer between 1 and 999,999,999 inclusive.
     * (Required)
     */
    public void setNumberObserved(Integer numberObserved) {
        this.numberObserved = numberObserved;
    }

    /**
     * Custóm field describing the severity of the incident. The field describes a general clasification that may be defined by other parties (national secutiry authority etc.)
     */
    public Integer getxDaThreatSeverity() {
        return xDaThreatSeverity;
    }

    /**
     * Custóm field describing the severity of the incident. The field describes a general clasification that may be defined by other parties (national secutiry authority etc.)
     */
    public void setxDaThreatSeverity(Integer xDaThreatSeverity) {
        this.xDaThreatSeverity = xDaThreatSeverity;
    }

    /**
     * Custom field describing the risk that the observed threat will be exploited
     */
    public Integer getxDaRiskLevel() {
        return xDaRiskLevel;
    }

    /**
     * Custom field describing the risk that the observed threat will be exploited
     */
    public void setxDaRiskLevel(Integer xDaRiskLevel) {
        this.xDaRiskLevel = xDaRiskLevel;
    }

    /**
     * Custom field describing how easy it is to exploit the threat in a given context (Local Public Administration or the like)
     */
    public Integer getxDaExploitabilityLevel() {
        return xDaExploitabilityLevel;
    }

    /**
     * Custom field describing how easy it is to exploit the threat in a given context (Local Public Administration or the like)
     */
    public void setxDaExploitabilityLevel(Integer xDaExploitabilityLevel) {
        this.xDaExploitabilityLevel = xDaExploitabilityLevel;
    }

    /**
     * Custom field describing the overall group the observed data belongs to
     */
    public String getxDaThreatGroup() {
        return xDaThreatGroup;
    }

    /**
     * Custom field describing the overall group the observed data belongs to
     */
    public void setxDaThreatGroup(String xDaThreatGroup) {
        this.xDaThreatGroup = xDaThreatGroup;
    }

    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     */
    public Map<String, CyberObservableCore> getObjects() {
        return objects;
    }

    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     */
    public void setObjects(Map<String, CyberObservableCore> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ObservedData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("firstObserved");
        sb.append('=');
        sb.append(((this.firstObserved == null) ? "<null>" : this.firstObserved));
        sb.append(',');
        sb.append("lastObserved");
        sb.append('=');
        sb.append(((this.lastObserved == null) ? "<null>" : this.lastObserved));
        sb.append(',');
        sb.append("numberObserved");
        sb.append('=');
        sb.append(((this.numberObserved == null) ? "<null>" : this.numberObserved));
        sb.append(',');
        sb.append("xDaThreatSeverity");
        sb.append('=');
        sb.append(((this.xDaThreatSeverity == null) ? "<null>" : this.xDaThreatSeverity));
        sb.append(',');
        sb.append("xDaRiskLevel");
        sb.append('=');
        sb.append(((this.xDaRiskLevel == null) ? "<null>" : this.xDaRiskLevel));
        sb.append(',');
        sb.append("xDaExploitabilityLevel");
        sb.append('=');
        sb.append(((this.xDaExploitabilityLevel == null) ? "<null>" : this.xDaExploitabilityLevel));
        sb.append(',');
        sb.append("xDaThreatGroup");
        sb.append('=');
        sb.append(((this.xDaThreatGroup == null) ? "<null>" : this.xDaThreatGroup));
        sb.append(',');
        sb.append("objects");
        sb.append('=');
        sb.append(((this.objects == null) ? "<null>" : this.objects));
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
        result = ((result * 31) + ((this.xDaRiskLevel == null) ? 0 : this.xDaRiskLevel.hashCode()));
        result = ((result * 31) + ((this.xDaThreatGroup == null) ? 0 : this.xDaThreatGroup.hashCode()));
        result = ((result * 31) + ((this.firstObserved == null) ? 0 : this.firstObserved.hashCode()));
        result = ((result * 31) + ((this.numberObserved == null) ? 0 : this.numberObserved.hashCode()));
        result = ((result * 31) + ((this.lastObserved == null) ? 0 : this.lastObserved.hashCode()));
        result = ((result * 31) + ((this.xDaExploitabilityLevel == null) ? 0 : this.xDaExploitabilityLevel.hashCode()));
        result = ((result * 31) + ((this.objects == null) ? 0 : this.objects.hashCode()));
        result = ((result * 31) + ((this.xDaThreatSeverity == null) ? 0 : this.xDaThreatSeverity.hashCode()));
        result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ObservedData) == false) {
            return false;
        }
        ObservedData rhs = ((ObservedData) other);
        return ((((((((((super.equals(rhs) && ((this.xDaRiskLevel == rhs.xDaRiskLevel) || ((this.xDaRiskLevel != null) && this.xDaRiskLevel.equals(rhs.xDaRiskLevel)))) && ((this.xDaThreatGroup == rhs.xDaThreatGroup) || ((this.xDaThreatGroup != null) && this.xDaThreatGroup.equals(rhs.xDaThreatGroup)))) && ((this.firstObserved == rhs.firstObserved) || ((this.firstObserved != null) && this.firstObserved.equals(rhs.firstObserved)))) && ((this.numberObserved == rhs.numberObserved) || ((this.numberObserved != null) && this.numberObserved.equals(rhs.numberObserved)))) && ((this.lastObserved == rhs.lastObserved) || ((this.lastObserved != null) && this.lastObserved.equals(rhs.lastObserved)))) && ((this.xDaExploitabilityLevel == rhs.xDaExploitabilityLevel) || ((this.xDaExploitabilityLevel != null) && this.xDaExploitabilityLevel.equals(rhs.xDaExploitabilityLevel)))) && ((this.objects == rhs.objects) || ((this.objects != null) && this.objects.equals(rhs.objects)))) && ((this.xDaThreatSeverity == rhs.xDaThreatSeverity) || ((this.xDaThreatSeverity != null) && this.xDaThreatSeverity.equals(rhs.xDaThreatSeverity)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))));
    }
}
