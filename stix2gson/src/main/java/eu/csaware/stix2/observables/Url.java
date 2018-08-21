
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * url
 * <p>
 * The URL Object represents the properties of a uniform resource locator (URL).
 */
public class Url extends CyberObservableCore {

    /**
     * The value of this property MUST be `url`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.URL_TYPE)
    private String type = Types.URL_TYPE;
    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * (Required)
     */
    @SerializedName("value")
    @Expose
    @Pattern(regexp = "^([a-zA-Z][a-zA-Z0-9+.-]*):(?:\\/\\/((?:(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:]|%[0-9a-fA-F]{2})*))(\\3)@)?(?=((?:\\[?(?:::[a-fA-F0-9]+(?::[a-fA-F0-9]+)?|(?:[a-fA-F0-9]+:)+(?::[a-fA-F0-9]+)+|(?:[a-fA-F0-9]+:)+(?::|(?:[a-fA-F0-9]+:?)*))\\]?)|(?:[a-zA-Z0-9-._~!$&'()*+,;=]|%[0-9a-fA-F]{2})*))\\5(?::(?=(\\d*))\\6)?)(\\/(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/]|%[0-9a-fA-F]{2})*))\\8)?|(\\/?(?!\\/)(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/]|%[0-9a-fA-F]{2})*))\\10)?)(?:\\?(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/?]|%[0-9a-fA-F]{2})*))\\11)?(?:#(?=((?:[a-zA-Z0-9-._~!$&'()*+,;=:@\\/?]|%[0-9a-fA-F]{2})*))\\12)?$")
    @NotNull
    private String value;

    /**
     * No args constructor for use in serialization
     */
    public Url() {
    }

    public Url(String value, Dictionary extensions) {
        super(extensions);
        this.value = value;
    }

    /**
     * The value of this property MUST be `url`.
     */
    public String getType() {
        return type;
    }

    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * (Required)
     */
    public String getValue() {
        return value;
    }

    /**
     * url-regex
     * <p>
     * Matches the elements of a URL using a regular expression.
     * (Required)
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Url.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null) ? "<null>" : this.value));
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
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.value == null) ? 0 : this.value.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Url) == false) {
            return false;
        }
        Url rhs = ((Url) other);
        return ((super.equals(rhs) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value))));
    }

}
