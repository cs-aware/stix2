
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.HashMap;
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
    private Stix2Type type = Stix2Type.OBSERVED_DATA;
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
    @NotNull
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime firstObserved;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    @SerializedName("last_observed")
    @Expose
    @NotNull
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime lastObserved;
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
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     */
    @SerializedName("objects")
    @Expose
    @Valid
    @NotNull
    private Map<String, Object> objects = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public ObservedData() {
    }

    public ObservedData(String id, LocalDateTime firstObserved, LocalDateTime lastObserved, Integer numberObserved,
                        Map<String, Object> objects, String createdByRef, LocalDateTime created, LocalDateTime modified) {
        super(createdByRef, created, modified);
        this.id = id;
        this.firstObserved = firstObserved;
        this.lastObserved = lastObserved;
        this.numberObserved = numberObserved;
        this.objects = objects;
    }

    public ObservedData(String id, LocalDateTime firstObserved, LocalDateTime lastObserved, Integer numberObserved,
                        Map<String, Object> objects, String createdByRef, List<String> labels, LocalDateTime created,
                        LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                        List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.id = id;
        this.firstObserved = firstObserved;
        this.lastObserved = lastObserved;
        this.numberObserved = numberObserved;
        this.objects = objects;
    }

    /**
     * The type of this object, which MUST be the literal `observed-data`.
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
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public LocalDateTime getFirstObserved() {
        return firstObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public void setFirstObserved(LocalDateTime firstObserved) {
        this.firstObserved = firstObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public LocalDateTime getLastObserved() {
        return lastObserved;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     * (Required)
     */
    public void setLastObserved(LocalDateTime lastObserved) {
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
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     */
    public Map<String, Object> getObjects() {
        return objects;
    }

    /**
     * A dictionary of Cyber Observable Objects that describes the single 'fact' that was observed.
     * (Required)
     */
    public void setObjects(Map<String, Object> objects) {
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
        result = ((result * 31) + ((this.firstObserved == null) ? 0 : this.firstObserved.hashCode()));
        result = ((result * 31) + ((this.numberObserved == null) ? 0 : this.numberObserved.hashCode()));
        result = ((result * 31) + ((this.lastObserved == null) ? 0 : this.lastObserved.hashCode()));
        result = ((result * 31) + ((this.objects == null) ? 0 : this.objects.hashCode()));
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
        return ((((((((super.equals(rhs) && ((this.firstObserved == rhs.firstObserved) || ((this.firstObserved != null) && this.firstObserved.equals(rhs.firstObserved)))) && ((this.numberObserved == rhs.numberObserved) || ((this.numberObserved != null) && this.numberObserved.equals(rhs.numberObserved)))) && ((this.lastObserved == rhs.lastObserved) || ((this.lastObserved != null) && this.lastObserved.equals(rhs.lastObserved)))) && ((this.objects == rhs.objects) || ((this.objects != null) && this.objects.equals(rhs.objects))))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))));
    }
}
