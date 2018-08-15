
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * email-addr
 * <p>
 * The Email Address Object represents a single email address.
 */
public class EmailAddr extends CyberObservableCore {

    /**
     * The value of this property MUST be `email-addr`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.EMAIL_ADDR_TYPE)
    private String type = Types.EMAIL_ADDR_TYPE;
    /**
     * Specifies a single email address. This MUST not include the display name.
     * (Required)
     */
    @SerializedName("value")
    @Expose
    @Pattern(regexp = "(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$)")
    @NotNull
    private String value;
    /**
     * Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.
     */
    @SerializedName("display_name")
    @Expose
    private String displayName;
    /**
     * Specifies the user account that the email address belongs to, as a reference to a User Account Object.
     */
    @SerializedName("belongs_to_ref")
    @Expose
    private String belongsToRef;

    /**
     * No args constructor for use in serialization
     */
    public EmailAddr() {
    }

    /**
     * @param extensions
     * @param belongsToRef
     * @param displayName
     * @param type
     * @param value
     */
    public EmailAddr(String type, String value, String displayName, String belongsToRef, Dictionary extensions) {
        super(extensions);
        if (!type.equals(Types.EMAIL_ADDR_TYPE)) {
            type = Types.EMAIL_ADDR_TYPE;
        }
        this.type = type;
        this.value = value;
        this.displayName = displayName;
        this.belongsToRef = belongsToRef;
    }

    /**
     * The value of this property MUST be `email-addr`.
     */
    public String getType() {
        return type;
    }

    /**
     * The value of this property MUST be `email-addr`.
     */
    public void setType(String type) {
        if (!type.equals(Types.EMAIL_ADDR_TYPE)) {
            type = Types.EMAIL_ADDR_TYPE;
        }
        this.type = type;
    }

    /**
     * Specifies a single email address. This MUST not include the display name.
     * (Required)
     */
    public String getValue() {
        return value;
    }

    /**
     * Specifies a single email address. This MUST not include the display name.
     * (Required)
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Specifies the user account that the email address belongs to, as a reference to a User Account Object.
     */
    public String getBelongsToRef() {
        return belongsToRef;
    }

    /**
     * Specifies the user account that the email address belongs to, as a reference to a User Account Object.
     */
    public void setBelongsToRef(String belongsToRef) {
        this.belongsToRef = belongsToRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailAddr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null) ? "<null>" : this.displayName));
        sb.append(',');
        sb.append("belongsToRef");
        sb.append('=');
        sb.append(((this.belongsToRef == null) ? "<null>" : this.belongsToRef));
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
        result = ((result * 31) + ((this.belongsToRef == null) ? 0 : this.belongsToRef.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.value == null) ? 0 : this.value.hashCode()));
        result = ((result * 31) + ((this.displayName == null) ? 0 : this.displayName.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailAddr) == false) {
            return false;
        }
        EmailAddr rhs = ((EmailAddr) other);
        return ((((super.equals(rhs) && ((this.belongsToRef == rhs.belongsToRef) || ((this.belongsToRef != null) && this.belongsToRef.equals(rhs.belongsToRef)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.value == rhs.value) || ((this.value != null) && this.value.equals(rhs.value)))) && ((this.displayName == rhs.displayName) || ((this.displayName != null) && this.displayName.equals(rhs.displayName))));
    }

}
