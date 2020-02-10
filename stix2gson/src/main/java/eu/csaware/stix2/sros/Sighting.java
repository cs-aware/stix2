
package eu.csaware.stix2.sros;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;
import eu.csaware.stix2.marking.GranularMarking;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * sighting
 * <p>
 * A Sighting denotes the belief that something in CTI (e.g., an indicator, malware, tool, threat actor, etc.) was seen.
 */
public class Sighting extends Core {

    /**
     * The beginning of the time window during which the SDO referenced by the sighting_of_ref property was sighted.
     */
    @SerializedName("first_seen")
    @Expose
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime firstSeen;
    /**
     * The end of the time window during which the SDO referenced by the sighting_of_ref property was sighted.
     */
    @SerializedName("last_seen")
    @Expose
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime lastSeen;
    /**
     * This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.
     */
    @SerializedName("count")
    @Expose
    @DecimalMin("0")
    @DecimalMax("999999999")
    private Integer count;
    /**
     * An ID reference to the object that has been sighted.
     * (Required)
     */
    @SerializedName("sighting_of_ref")
    @Expose
    @NotNull
    private String sightingOfRef;
    /**
     * A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.
     */
    @SerializedName("observed_data_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> observedDataRefs = new ArrayList<>();
    /**
     * The ID of the Victim Target objects of the entities that saw the sighting.
     */
    @SerializedName("where_sighted_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> whereSightedRefs = new ArrayList<>();
    /**
     * The summary property indicates whether the Sighting should be considered summary data.
     */
    @SerializedName("summary")
    @Expose
    private Boolean summary;

    /**
     * No args constructor for use in serialization
     */
    public Sighting() {
    }

    public Sighting(UUID id, String sightingOfRef,
                    LocalDateTime created, LocalDateTime modified) {
        super(id, created, modified);
        this.sightingOfRef = sightingOfRef;
    }
    public Sighting(UUID id, List<String> whereSightedRefs,
                    LocalDateTime created, LocalDateTime modified) {
        super(id, created, modified);
        this.whereSightedRefs = whereSightedRefs;
    }

    public Sighting(UUID id, String sightingOfRef, List<String> whereSightedRefs,
                    LocalDateTime created, LocalDateTime modified) {
        super(id, created, modified);
        this.sightingOfRef = sightingOfRef;
        this.whereSightedRefs = whereSightedRefs;
    }

    public Sighting(UUID id, LocalDateTime firstSeen, LocalDateTime lastSeen, Integer count, String sightingOfRef,
                    List<String> observedDataRefs, List<String> whereSightedRefs, Boolean summary, String createdByRef,
                    List<String> labels, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                    List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.firstSeen = firstSeen;
        this.lastSeen = lastSeen;
        this.count = count;
        this.sightingOfRef = sightingOfRef;
        this.observedDataRefs = observedDataRefs;
        this.whereSightedRefs = whereSightedRefs;
        this.summary = summary;
    }

    /**
     * The beginning of the time window during which the SDO referenced by the sighting_of_ref property was sighted.
     */
    public LocalDateTime getFirstSeen() {
        return firstSeen;
    }

    /**
     * The beginning of the time window during which the SDO referenced by the sighting_of_ref property was sighted.
     */
    public void setFirstSeen(LocalDateTime firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * The end of the time window during which the SDO referenced by the sighting_of_ref property was sighted.
     */
    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    /**
     * The end of the time window during which the SDO referenced by the sighting_of_ref property was sighted.
     */
    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This is an integer between 0 and 999,999,999 inclusive and represents the number of times the object was sighted.
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * An ID reference to the object that has been sighted.
     * (Required)
     */
    public String getSightingOfRef() {
        return sightingOfRef;
    }

    /**
     * An ID reference to the object that has been sighted.
     * (Required)
     */
    public void setSightingOfRef(String sightingOfRef) {
        this.sightingOfRef = sightingOfRef;
    }

    /**
     * A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.
     */
    public List<String> getObservedDataRefs() {
        return observedDataRefs;
    }

    /**
     * A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting.
     */
    public void setObservedDataRefs(List<String> observedDataRefs) {
        this.observedDataRefs = observedDataRefs;
    }

    /**
     * The ID of the Victim Target objects of the entities that saw the sighting.
     */
    public List<String> getWhereSightedRefs() {
        return whereSightedRefs;
    }

    /**
     * The ID of the Victim Target objects of the entities that saw the sighting.
     */
    public void setWhereSightedRefs(List<String> whereSightedRefs) {
        this.whereSightedRefs = whereSightedRefs;
    }

    /**
     * The summary property indicates whether the Sighting should be considered summary data.
     */
    public Boolean getSummary() {
        return summary;
    }

    /**
     * The summary property indicates whether the Sighting should be considered summary data.
     */
    public void setSummary(Boolean summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sighting.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("firstSeen");
        sb.append('=');
        sb.append(((this.firstSeen == null) ? "<null>" : this.firstSeen));
        sb.append(',');
        sb.append("lastSeen");
        sb.append('=');
        sb.append(((this.lastSeen == null) ? "<null>" : this.lastSeen));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null) ? "<null>" : this.count));
        sb.append(',');
        sb.append("sightingOfRef");
        sb.append('=');
        sb.append(((this.sightingOfRef == null) ? "<null>" : this.sightingOfRef));
        sb.append(',');
        sb.append("observedDataRefs");
        sb.append('=');
        sb.append(((this.observedDataRefs == null) ? "<null>" : this.observedDataRefs));
        sb.append(',');
        sb.append("whereSightedRefs");
        sb.append('=');
        sb.append(((this.whereSightedRefs == null) ? "<null>" : this.whereSightedRefs));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null) ? "<null>" : this.summary));
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
        result = ((result * 31) + ((this.summary == null) ? 0 : this.summary.hashCode()));
        result = ((result * 31) + ((this.lastSeen == null) ? 0 : this.lastSeen.hashCode()));
        result = ((result * 31) + ((this.firstSeen == null) ? 0 : this.firstSeen.hashCode()));
        result = ((result * 31) + ((this.count == null) ? 0 : this.count.hashCode()));
        result = ((result * 31) + ((this.whereSightedRefs == null) ? 0 : this.whereSightedRefs.hashCode()));
        result = ((result * 31) + ((this.observedDataRefs == null) ? 0 : this.observedDataRefs.hashCode()));
        result = ((result * 31) + ((this.sightingOfRef == null) ? 0 : this.sightingOfRef.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sighting) == false) {
            return false;
        }
        Sighting rhs = ((Sighting) other);
        return (((((((((super.equals(rhs) && ((this.summary == rhs.summary) || ((this.summary != null) && this.summary.equals(rhs.summary)))) && ((this.lastSeen == rhs.lastSeen) || ((this.lastSeen != null) && this.lastSeen.equals(rhs.lastSeen)))) && ((this.firstSeen == rhs.firstSeen) || ((this.firstSeen != null) && this.firstSeen.equals(rhs.firstSeen)))) && ((this.count == rhs.count) || ((this.count != null) && this.count.equals(rhs.count)))) && ((this.whereSightedRefs == rhs.whereSightedRefs) || ((this.whereSightedRefs != null) && this.whereSightedRefs.equals(rhs.whereSightedRefs)))) && ((this.observedDataRefs == rhs.observedDataRefs) || ((this.observedDataRefs != null) && this.observedDataRefs.equals(rhs.observedDataRefs)))))) && ((this.sightingOfRef == rhs.sightingOfRef) || ((this.sightingOfRef != null) && this.sightingOfRef.equals(rhs.sightingOfRef))));
    }

}
