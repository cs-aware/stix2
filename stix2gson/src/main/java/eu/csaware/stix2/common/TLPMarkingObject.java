
package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


/**
 * Traffic light protocol marking object
 */
public class TLPMarkingObject implements MarkingObject {

    @SerializedName("tlp")
    @Expose
    private String tlp;

    /**
     * No args constructor for use in serialization
     */
    public TLPMarkingObject() {
    }

    public TLPMarkingObject(String tlp) {
        this.tlp = tlp;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TLPMarkingObject)) return false;
        TLPMarkingObject that = (TLPMarkingObject) o;
        return Objects.equals(tlp, that.tlp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tlp);
    }
}
