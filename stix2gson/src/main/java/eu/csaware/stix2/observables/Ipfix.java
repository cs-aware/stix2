
package eu.csaware.stix2.observables;


public class Ipfix {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ipfix.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Ipfix) == false) {
            return false;
        }
        Ipfix rhs = ((Ipfix) other);
        return true;
    }

}
