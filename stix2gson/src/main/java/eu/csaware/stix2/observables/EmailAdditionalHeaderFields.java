
package eu.csaware.stix2.observables;



/**
 * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
 * 
 */
public class EmailAdditionalHeaderFields {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailAdditionalHeaderFields.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof EmailAdditionalHeaderFields) == false) {
            return false;
        }
        EmailAdditionalHeaderFields rhs = ((EmailAdditionalHeaderFields) other);
        return true;
    }

}
