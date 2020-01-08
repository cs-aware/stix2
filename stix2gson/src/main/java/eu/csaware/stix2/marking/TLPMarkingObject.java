
package eu.csaware.stix2.marking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;


/**
 * Traffic light protocol marking object
 * https://www.first.org/tlp/
 */
public class TLPMarkingObject implements MarkingObject {
    public static String DEFINITION_TYPE = "tlp";

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

    @Override
    public String getDefinitionType() {
        return DEFINITION_TYPE;
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
