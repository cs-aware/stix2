
package eu.csaware.stix2.common;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * granular-marking
 * <p>
 * The granular-marking type defines how the list of marking-definition objects referenced by the marking_refs property to apply to a set of content identified by the list of selectors in the selectors property.
 */
public class GranularMarking {

    /**
     * A list of selectors for content contained within the STIX object in which this property appears.
     * (Required)
     */
    @SerializedName("selectors")
    @Expose
    @Size(min = 1)
    @Valid
    @NotNull
    private List<String> selectors = new ArrayList<String>();
    /**
     * (Required)
     */
    @SerializedName("marking_ref")
    @Expose
    @NotNull
    private Object markingRef;

    /**
     * No args constructor for use in serialization
     */
    public GranularMarking() {
    }

    /**
     * @param markingRef
     * @param selectors
     */
    public GranularMarking(List<String> selectors, Object markingRef) {
        super();
        this.selectors = selectors;
        this.markingRef = markingRef;
    }

    /**
     * A list of selectors for content contained within the STIX object in which this property appears.
     * (Required)
     */
    public List<String> getSelectors() {
        return selectors;
    }

    /**
     * A list of selectors for content contained within the STIX object in which this property appears.
     * (Required)
     */
    public void setSelectors(List<String> selectors) {
        this.selectors = selectors;
    }

    /**
     * (Required)
     */
    public Object getMarkingRef() {
        return markingRef;
    }

    /**
     * (Required)
     */
    public void setMarkingRef(Object markingRef) {
        this.markingRef = markingRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GranularMarking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("selectors");
        sb.append('=');
        sb.append(((this.selectors == null) ? "<null>" : this.selectors));
        sb.append(',');
        sb.append("markingRef");
        sb.append('=');
        sb.append(((this.markingRef == null) ? "<null>" : this.markingRef));
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
        result = ((result * 31) + ((this.selectors == null) ? 0 : this.selectors.hashCode()));
        result = ((result * 31) + ((this.markingRef == null) ? 0 : this.markingRef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GranularMarking) == false) {
            return false;
        }
        GranularMarking rhs = ((GranularMarking) other);
        return (((this.selectors == rhs.selectors) || ((this.selectors != null) && this.selectors.equals(rhs.selectors))) && ((this.markingRef == rhs.markingRef) || ((this.markingRef != null) && this.markingRef.equals(rhs.markingRef))));
    }

}
