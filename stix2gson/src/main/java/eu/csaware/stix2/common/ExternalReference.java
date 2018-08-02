
package eu.csaware.stix2.common;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * external-reference
 * <p>
 * External references are used to describe pointers to information represented outside of STIX.
 * 
 */
public class ExternalReference {

    /**
     * A human readable description
     * 
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * 
     */
    @SerializedName("url")
    @Expose
    @Pattern(regexp = "^([a-zA-Z][a-zA-Z0-9+.-]*):(?:\\/\\/((?:(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:]|%[0-9a-fA-F]{2})*))(\\3)@)?(?=((?:\\[?(?:::[a-fA-F0-9]+(?::[a-fA-F0-9]+)?|(?:[a-fA-F0-9]+:)+(?::[a-fA-F0-9]+)+|(?:[a-fA-F0-9]+:)+(?::|(?:[a-fA-F0-9]+:?)*))\\]?)|(?:[a-zA-Z0-9-._~!$&'()*+,;=]|%[0-9a-fA-F]{2})*))\\5(?::(?=(\\d*))\\6)?)(\\/(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/]|%[0-9a-fA-F]{2})*))\\8)?|(\\/?(?!\\/)(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/]|%[0-9a-fA-F]{2})*))\\10)?)(?:\\?(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/?]|%[0-9a-fA-F]{2})*))\\11)?(?:#(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/?]|%[0-9a-fA-F]{2})*))\\12)?$")
    private String url;
    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    @SerializedName("hashes")
    @Expose
    @Valid
    private HashesType hashes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalReference() {
    }

    /**
     * 
     * @param hashes
     * @param description
     * @param url
     */
    public ExternalReference(String description, String url, HashesType hashes) {
        super();
        this.description = description;
        this.url = url;
        this.hashes = hashes;
    }

    /**
     * A human readable description
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * A human readable description
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * 
     */
    public String getUrl() {
        return url;
    }

    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * 
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    public HashesType getHashes() {
        return hashes;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     * 
     */
    public void setHashes(HashesType hashes) {
        this.hashes = hashes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("hashes");
        sb.append('=');
        sb.append(((this.hashes == null)?"<null>":this.hashes));
        sb.append(',');
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
        result = ((result* 31)+((this.hashes == null)? 0 :this.hashes.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalReference) == false) {
            return false;
        }
        ExternalReference rhs = ((ExternalReference) other);
        return ((((this.hashes == rhs.hashes)||((this.hashes!= null)&&this.hashes.equals(rhs.hashes)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))));
    }

}
