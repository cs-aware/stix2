package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.util.Stix2Util;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 *
 */
public abstract class IdentifiedStixObject implements TypedStixObject {

    /**
     * id
     * <p>
     */
    @SerializedName("id")
    @Expose
    @Pattern(regexp = "^[a-z][a-z-]+[a-z]--[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
    @NotNull
    private String id;

    /**
     * No args constructor for use in serialization
     */
    public IdentifiedStixObject() {
    }

    public IdentifiedStixObject(String id) {
        this.id = id;
        if (!Stix2Util.isValidId(id))
            throw new IllegalArgumentException("Invalid STIX id: " + id);
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

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdentifiedStixObject)) return false;

        IdentifiedStixObject that = (IdentifiedStixObject) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
