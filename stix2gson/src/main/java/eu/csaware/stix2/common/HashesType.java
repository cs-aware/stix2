
package eu.csaware.stix2.common;

/**
 * hashes
 * <p>
 * A dictionary captures a set of key/value pairs
 * 
 */
public class HashesType {



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HashesType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HashesType) == false) {
            return false;
        }
        HashesType rhs = ((HashesType) other);
        return true;
    }

}
