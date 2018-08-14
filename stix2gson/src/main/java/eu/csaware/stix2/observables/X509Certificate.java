
package eu.csaware.stix2.observables;


/**
 * x509-certificate
 * <p>
 * The X509 Certificate Object represents the properties of an X.509 certificate.
 */
public class X509Certificate {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X509Certificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof X509Certificate) == false) {
            return false;
        }
        X509Certificate rhs = ((X509Certificate) other);
        return true;
    }

}
