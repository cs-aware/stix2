
package eu.csaware.stix2.observables;



/**
 * process
 * <p>
 * The Process Object represents common properties of an instance of a computer program as executed on an operating system.
 * 
 */
public class Process {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Process.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Process) == false) {
            return false;
        }
        Process rhs = ((Process) other);
        return true;
    }

}
