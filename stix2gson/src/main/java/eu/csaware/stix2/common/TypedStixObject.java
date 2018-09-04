package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 */
public abstract class TypedStixObject {

    /**
     * The type of this object, which is determined automatically from the class.
     */
    @SerializedName("type")
    @Expose
    private final Stix2Type type = Stix2Type.fromImplementation(this.getClass());

    /**
     * The type of this object.
     */
    public Stix2Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.toJsonString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypedStixObject)) return false;

        TypedStixObject that = (TypedStixObject) o;

        return type == that.type;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
}
