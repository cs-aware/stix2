
package eu.csaware.stix2.common;

/**
 * cyber-observable-core
 * <p>
 * Common properties and behavior across all Cyber Observable Objects.
 */
public abstract class CyberObservableCore implements TypedStixObject {

    /**
     * Indicates that this object is an Observable Object. The value of this property MUST be a valid Observable Object type name, but to allow for custom objects this has been removed from the schema.
     * (Required)
     *
     */
    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     */
//    @SerializedName("extensions")
//    @Expose
//    @Valid
//    private Dictionary extensions;

    /**
     * No args constructor for use in serialization
     */
    public CyberObservableCore() {
    }

    /**
     * @param extensions //     * @param type
     */
    public CyberObservableCore(Dictionary extensions) {
        super();
//        this.type = type;
//        this.extensions = extensions;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     */
//    public Dictionary getExtensions() {
//        return extensions;
//    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     */
//    public void setExtensions(Dictionary extensions) {
//        this.extensions = extensions;
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CyberObservableCore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append(',');
//        sb.append("extensions");
//        sb.append('=');
//        sb.append(((this.extensions == null) ? "<null>" : this.extensions));
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
//        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
//        result = ((result * 31) + ((this.extensions == null) ? 0 : this.extensions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CyberObservableCore) == false) {
            return false;
        }
        CyberObservableCore rhs = ((CyberObservableCore) other);
//        return (((this.extensions == rhs.extensions) || ((this.extensions != null) && this.extensions.equals(rhs.extensions))));
        return false;
    }

}
