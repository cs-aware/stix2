
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.HashesType;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;


/**
 * x509-certificate
 * <p>
 * The X509 Certificate Object represents the properties of an X.509 certificate.
 */
public class X509Certificate extends CyberObservableCore {

    /**
     * Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.
     */
    @SerializedName("is_self_signed")
    @Expose
    private Boolean isSelfSigned;
    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    @SerializedName("hashes")
    @Expose
    @Valid
    private HashesType hashes;
    /**
     * Specifies the version of the encoded certificate.
     */
    @SerializedName("version")
    @Expose
    private String version;
    /**
     * Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.
     */
    @SerializedName("serial_number")
    @Expose
    private String serialNumber;
    /**
     * Specifies the name of the algorithm used to sign the certificate.
     */
    @SerializedName("signature_algorithm")
    @Expose
    private String signatureAlgorithm;
    /**
     * Specifies the name of the Certificate Authority that issued the certificate.
     */
    @SerializedName("issuer")
    @Expose
    private String issuer;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("validity_not_before")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String validityNotBefore;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("validity_not_after")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String validityNotAfter;
    /**
     * Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.
     */
    @SerializedName("subject")
    @Expose
    private String subject;
    /**
     * Specifies the name of the algorithm with which to encrypt data being sent to the subject.
     */
    @SerializedName("subject_public_key_algorithm")
    @Expose
    private String subjectPublicKeyAlgorithm;
    /**
     * Specifies the modulus portion of the subject’s public RSA key.
     */
    @SerializedName("subject_public_key_modulus")
    @Expose
    private String subjectPublicKeyModulus;
    /**
     * Specifies the exponent portion of the subject’s public RSA key, as an integer.
     */
    @SerializedName("subject_public_key_exponent")
    @Expose
    private Integer subjectPublicKeyExponent;
    @SerializedName("x509_v3_extensions")
    @Expose
    @Valid
    private X509V3ExtensionsType x509V3Extensions;

    /**
     * No args constructor for use in serialization
     */
    public X509Certificate() {
    }

    public X509Certificate(Boolean isSelfSigned, HashesType hashes, String version, String serialNumber,
                           String signatureAlgorithm, String issuer, String validityNotBefore, String validityNotAfter,
                           String subject, String subjectPublicKeyAlgorithm, String subjectPublicKeyModulus,
                           Integer subjectPublicKeyExponent, X509V3ExtensionsType x509V3Extensions,
                           Dictionary extensions) {
        super(extensions);
        this.isSelfSigned = isSelfSigned;
        this.hashes = hashes;
        this.version = version;
        this.serialNumber = serialNumber;
        this.signatureAlgorithm = signatureAlgorithm;
        this.issuer = issuer;
        this.validityNotBefore = validityNotBefore;
        this.validityNotAfter = validityNotAfter;
        this.subject = subject;
        this.subjectPublicKeyAlgorithm = subjectPublicKeyAlgorithm;
        this.subjectPublicKeyModulus = subjectPublicKeyModulus;
        this.subjectPublicKeyExponent = subjectPublicKeyExponent;
        this.x509V3Extensions = x509V3Extensions;
    }

    /**
     * Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.
     */
    public Boolean getIsSelfSigned() {
        return isSelfSigned;
    }

    /**
     * Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies.
     */
    public void setIsSelfSigned(Boolean isSelfSigned) {
        this.isSelfSigned = isSelfSigned;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    public HashesType getHashes() {
        return hashes;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    public void setHashes(HashesType hashes) {
        this.hashes = hashes;
    }

    /**
     * Specifies the version of the encoded certificate.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Specifies the version of the encoded certificate.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Specifies the name of the algorithm used to sign the certificate.
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * Specifies the name of the algorithm used to sign the certificate.
     */
    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * Specifies the name of the Certificate Authority that issued the certificate.
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Specifies the name of the Certificate Authority that issued the certificate.
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getValidityNotBefore() {
        return validityNotBefore;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setValidityNotBefore(String validityNotBefore) {
        this.validityNotBefore = validityNotBefore;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getValidityNotAfter() {
        return validityNotAfter;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setValidityNotAfter(String validityNotAfter) {
        this.validityNotAfter = validityNotAfter;
    }

    /**
     * Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Specifies the name of the algorithm with which to encrypt data being sent to the subject.
     */
    public String getSubjectPublicKeyAlgorithm() {
        return subjectPublicKeyAlgorithm;
    }

    /**
     * Specifies the name of the algorithm with which to encrypt data being sent to the subject.
     */
    public void setSubjectPublicKeyAlgorithm(String subjectPublicKeyAlgorithm) {
        this.subjectPublicKeyAlgorithm = subjectPublicKeyAlgorithm;
    }

    /**
     * Specifies the modulus portion of the subject’s public RSA key.
     */
    public String getSubjectPublicKeyModulus() {
        return subjectPublicKeyModulus;
    }

    /**
     * Specifies the modulus portion of the subject’s public RSA key.
     */
    public void setSubjectPublicKeyModulus(String subjectPublicKeyModulus) {
        this.subjectPublicKeyModulus = subjectPublicKeyModulus;
    }

    /**
     * Specifies the exponent portion of the subject’s public RSA key, as an integer.
     */
    public Integer getSubjectPublicKeyExponent() {
        return subjectPublicKeyExponent;
    }

    /**
     * Specifies the exponent portion of the subject’s public RSA key, as an integer.
     */
    public void setSubjectPublicKeyExponent(Integer subjectPublicKeyExponent) {
        this.subjectPublicKeyExponent = subjectPublicKeyExponent;
    }

    public X509V3ExtensionsType getX509V3Extensions() {
        return x509V3Extensions;
    }

    public void setX509V3Extensions(X509V3ExtensionsType x509V3Extensions) {
        this.x509V3Extensions = x509V3Extensions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X509Certificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString != null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0) && (contentEnd > contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length() > baseLength) {
            sb.append(',');
        }
        sb.append("isSelfSigned");
        sb.append('=');
        sb.append(((this.isSelfSigned == null) ? "<null>" : this.isSelfSigned));
        sb.append(',');
        sb.append("hashes");
        sb.append('=');
        sb.append(((this.hashes == null) ? "<null>" : this.hashes));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null) ? "<null>" : this.version));
        sb.append(',');
        sb.append("serialNumber");
        sb.append('=');
        sb.append(((this.serialNumber == null) ? "<null>" : this.serialNumber));
        sb.append(',');
        sb.append("signatureAlgorithm");
        sb.append('=');
        sb.append(((this.signatureAlgorithm == null) ? "<null>" : this.signatureAlgorithm));
        sb.append(',');
        sb.append("issuer");
        sb.append('=');
        sb.append(((this.issuer == null) ? "<null>" : this.issuer));
        sb.append(',');
        sb.append("validityNotBefore");
        sb.append('=');
        sb.append(((this.validityNotBefore == null) ? "<null>" : this.validityNotBefore));
        sb.append(',');
        sb.append("validityNotAfter");
        sb.append('=');
        sb.append(((this.validityNotAfter == null) ? "<null>" : this.validityNotAfter));
        sb.append(',');
        sb.append("subject");
        sb.append('=');
        sb.append(((this.subject == null) ? "<null>" : this.subject));
        sb.append(',');
        sb.append("subjectPublicKeyAlgorithm");
        sb.append('=');
        sb.append(((this.subjectPublicKeyAlgorithm == null) ? "<null>" : this.subjectPublicKeyAlgorithm));
        sb.append(',');
        sb.append("subjectPublicKeyModulus");
        sb.append('=');
        sb.append(((this.subjectPublicKeyModulus == null) ? "<null>" : this.subjectPublicKeyModulus));
        sb.append(',');
        sb.append("subjectPublicKeyExponent");
        sb.append('=');
        sb.append(((this.subjectPublicKeyExponent == null) ? "<null>" : this.subjectPublicKeyExponent));
        sb.append(',');
        sb.append("x509V3Extensions");
        sb.append('=');
        sb.append(((this.x509V3Extensions == null) ? "<null>" : this.x509V3Extensions));
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
        result = ((result * 31) + ((this.subjectPublicKeyExponent == null) ? 0 : this.subjectPublicKeyExponent.hashCode()));
        result = ((result * 31) + ((this.serialNumber == null) ? 0 : this.serialNumber.hashCode()));
        result = ((result * 31) + ((this.subject == null) ? 0 : this.subject.hashCode()));
        result = ((result * 31) + ((this.validityNotBefore == null) ? 0 : this.validityNotBefore.hashCode()));
        result = ((result * 31) + ((this.version == null) ? 0 : this.version.hashCode()));
        result = ((result * 31) + ((this.signatureAlgorithm == null) ? 0 : this.signatureAlgorithm.hashCode()));
        result = ((result * 31) + ((this.issuer == null) ? 0 : this.issuer.hashCode()));
        result = ((result * 31) + ((this.subjectPublicKeyAlgorithm == null) ? 0 : this.subjectPublicKeyAlgorithm.hashCode()));
        result = ((result * 31) + ((this.isSelfSigned == null) ? 0 : this.isSelfSigned.hashCode()));
        result = ((result * 31) + ((this.subjectPublicKeyModulus == null) ? 0 : this.subjectPublicKeyModulus.hashCode()));
        result = ((result * 31) + ((this.x509V3Extensions == null) ? 0 : this.x509V3Extensions.hashCode()));
        result = ((result * 31) + ((this.hashes == null) ? 0 : this.hashes.hashCode()));
        result = ((result * 31) + ((this.validityNotAfter == null) ? 0 : this.validityNotAfter.hashCode()));
        result = ((result * 31) + super.hashCode());
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
        return ((((((((((((((super.equals(rhs) && ((this.subjectPublicKeyExponent == rhs.subjectPublicKeyExponent) || ((this.subjectPublicKeyExponent != null) && this.subjectPublicKeyExponent.equals(rhs.subjectPublicKeyExponent)))) && ((this.serialNumber == rhs.serialNumber) || ((this.serialNumber != null) && this.serialNumber.equals(rhs.serialNumber)))) && ((this.subject == rhs.subject) || ((this.subject != null) && this.subject.equals(rhs.subject)))) && ((this.validityNotBefore == rhs.validityNotBefore) || ((this.validityNotBefore != null) && this.validityNotBefore.equals(rhs.validityNotBefore))))) && ((this.version == rhs.version) || ((this.version != null) && this.version.equals(rhs.version)))) && ((this.signatureAlgorithm == rhs.signatureAlgorithm) || ((this.signatureAlgorithm != null) && this.signatureAlgorithm.equals(rhs.signatureAlgorithm)))) && ((this.issuer == rhs.issuer) || ((this.issuer != null) && this.issuer.equals(rhs.issuer)))) && ((this.subjectPublicKeyAlgorithm == rhs.subjectPublicKeyAlgorithm) || ((this.subjectPublicKeyAlgorithm != null) && this.subjectPublicKeyAlgorithm.equals(rhs.subjectPublicKeyAlgorithm)))) && ((this.isSelfSigned == rhs.isSelfSigned) || ((this.isSelfSigned != null) && this.isSelfSigned.equals(rhs.isSelfSigned)))) && ((this.subjectPublicKeyModulus == rhs.subjectPublicKeyModulus) || ((this.subjectPublicKeyModulus != null) && this.subjectPublicKeyModulus.equals(rhs.subjectPublicKeyModulus)))) && ((this.x509V3Extensions == rhs.x509V3Extensions) || ((this.x509V3Extensions != null) && this.x509V3Extensions.equals(rhs.x509V3Extensions)))) && ((this.hashes == rhs.hashes) || ((this.hashes != null) && this.hashes.equals(rhs.hashes)))) && ((this.validityNotAfter == rhs.validityNotAfter) || ((this.validityNotAfter != null) && this.validityNotAfter.equals(rhs.validityNotAfter))));
    }
}
