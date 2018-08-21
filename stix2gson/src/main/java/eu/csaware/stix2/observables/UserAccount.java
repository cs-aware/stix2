
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Types;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * user-account
 * <p>
 * The User Account Object represents an instance of any type of user account, including but not limited to operating system, device, messaging service, and social media platform accounts.
 */
public class UserAccount extends CyberObservableCore {

    /**
     * The value of this property MUST be `user-account`.
     */
    @SerializedName("type")
    @Expose
    @Pattern(regexp = Types.USER_ACCOUNT_TYPE)
    private String type = Types.USER_ACCOUNT_TYPE;
    @SerializedName("extensions")
    @Expose
    @Valid
    private UserAccountExtensionsDictionary extensions;
    /**
     * Specifies the identifier of the account.
     * (Required)
     */
    @SerializedName("user_id")
    @Expose
    @NotNull
    private String userId;
    /**
     * Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.
     */
    @SerializedName("account_login")
    @Expose
    private String accountLogin;
    /**
     * Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.
     */
    @SerializedName("account_type")
    @Expose
    private String accountType;
    /**
     * Specifies the display name of the account, to be shown in user interfaces, if applicable.
     */
    @SerializedName("display_name")
    @Expose
    private String displayName;
    /**
     * Indicates that the account is associated with a network service or system process (daemon), not a specific individual.
     */
    @SerializedName("is_service_account")
    @Expose
    private Boolean isServiceAccount;
    /**
     * Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).
     */
    @SerializedName("is_privileged")
    @Expose
    private Boolean isPrivileged;
    /**
     * Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).
     */
    @SerializedName("can_escalate_privs")
    @Expose
    private Boolean canEscalatePrivs;
    /**
     * Specifies if the account is disabled.
     */
    @SerializedName("is_disabled")
    @Expose
    private Boolean isDisabled;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("account_created")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String accountCreated;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("account_expires")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String accountExpires;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("password_last_changed")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String passwordLastChanged;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("account_first_login")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String accountFirstLogin;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("account_last_login")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String accountLastLogin;

    /**
     * No args constructor for use in serialization
     */
    public UserAccount() {
    }

    public UserAccount(UserAccountExtensionsDictionary extensions, String userId, String accountLogin, String accountType, String displayName, Boolean isServiceAccount, Boolean isPrivileged, Boolean canEscalatePrivs, Boolean isDisabled, String accountCreated, String accountExpires, String passwordLastChanged, String accountFirstLogin, String accountLastLogin) {
        super(extensions);
        this.extensions = extensions;
        this.userId = userId;
        this.accountLogin = accountLogin;
        this.accountType = accountType;
        this.displayName = displayName;
        this.isServiceAccount = isServiceAccount;
        this.isPrivileged = isPrivileged;
        this.canEscalatePrivs = canEscalatePrivs;
        this.isDisabled = isDisabled;
        this.accountCreated = accountCreated;
        this.accountExpires = accountExpires;
        this.passwordLastChanged = passwordLastChanged;
        this.accountFirstLogin = accountFirstLogin;
        this.accountLastLogin = accountLastLogin;
    }

    /**
     * The value of this property MUST be `user-account`.
     */
    public String getType() {
        return type;
    }

    public UserAccountExtensionsDictionary getExtensions() {
        return extensions;
    }

    public void setExtensions(UserAccountExtensionsDictionary extensions) {
        this.extensions = extensions;
    }

    /**
     * Specifies the identifier of the account.
     * (Required)
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Specifies the identifier of the account.
     * (Required)
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.
     */
    public String getAccountLogin() {
        return accountLogin;
    }

    /**
     * Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login.
     */
    public void setAccountLogin(String accountLogin) {
        this.accountLogin = accountLogin;
    }

    /**
     * Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov vocabulary.
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * Specifies the display name of the account, to be shown in user interfaces, if applicable.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Specifies the display name of the account, to be shown in user interfaces, if applicable.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Indicates that the account is associated with a network service or system process (daemon), not a specific individual.
     */
    public Boolean getIsServiceAccount() {
        return isServiceAccount;
    }

    /**
     * Indicates that the account is associated with a network service or system process (daemon), not a specific individual.
     */
    public void setIsServiceAccount(Boolean isServiceAccount) {
        this.isServiceAccount = isServiceAccount;
    }

    /**
     * Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).
     */
    public Boolean getIsPrivileged() {
        return isPrivileged;
    }

    /**
     * Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account).
     */
    public void setIsPrivileged(Boolean isPrivileged) {
        this.isPrivileged = isPrivileged;
    }

    /**
     * Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).
     */
    public Boolean getCanEscalatePrivs() {
        return canEscalatePrivs;
    }

    /**
     * Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account).
     */
    public void setCanEscalatePrivs(Boolean canEscalatePrivs) {
        this.canEscalatePrivs = canEscalatePrivs;
    }

    /**
     * Specifies if the account is disabled.
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    /**
     * Specifies if the account is disabled.
     */
    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getAccountCreated() {
        return accountCreated;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setAccountCreated(String accountCreated) {
        this.accountCreated = accountCreated;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getAccountExpires() {
        return accountExpires;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getPasswordLastChanged() {
        return passwordLastChanged;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setPasswordLastChanged(String passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getAccountFirstLogin() {
        return accountFirstLogin;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setAccountFirstLogin(String accountFirstLogin) {
        this.accountFirstLogin = accountFirstLogin;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getAccountLastLogin() {
        return accountLastLogin;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setAccountLastLogin(String accountLastLogin) {
        this.accountLastLogin = accountLastLogin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null) ? "<null>" : this.extensions));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null) ? "<null>" : this.userId));
        sb.append(',');
        sb.append("accountLogin");
        sb.append('=');
        sb.append(((this.accountLogin == null) ? "<null>" : this.accountLogin));
        sb.append(',');
        sb.append("accountType");
        sb.append('=');
        sb.append(((this.accountType == null) ? "<null>" : this.accountType));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null) ? "<null>" : this.displayName));
        sb.append(',');
        sb.append("isServiceAccount");
        sb.append('=');
        sb.append(((this.isServiceAccount == null) ? "<null>" : this.isServiceAccount));
        sb.append(',');
        sb.append("isPrivileged");
        sb.append('=');
        sb.append(((this.isPrivileged == null) ? "<null>" : this.isPrivileged));
        sb.append(',');
        sb.append("canEscalatePrivs");
        sb.append('=');
        sb.append(((this.canEscalatePrivs == null) ? "<null>" : this.canEscalatePrivs));
        sb.append(',');
        sb.append("isDisabled");
        sb.append('=');
        sb.append(((this.isDisabled == null) ? "<null>" : this.isDisabled));
        sb.append(',');
        sb.append("accountCreated");
        sb.append('=');
        sb.append(((this.accountCreated == null) ? "<null>" : this.accountCreated));
        sb.append(',');
        sb.append("accountExpires");
        sb.append('=');
        sb.append(((this.accountExpires == null) ? "<null>" : this.accountExpires));
        sb.append(',');
        sb.append("passwordLastChanged");
        sb.append('=');
        sb.append(((this.passwordLastChanged == null) ? "<null>" : this.passwordLastChanged));
        sb.append(',');
        sb.append("accountFirstLogin");
        sb.append('=');
        sb.append(((this.accountFirstLogin == null) ? "<null>" : this.accountFirstLogin));
        sb.append(',');
        sb.append("accountLastLogin");
        sb.append('=');
        sb.append(((this.accountLastLogin == null) ? "<null>" : this.accountLastLogin));
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
        result = ((result * 31) + ((this.accountCreated == null) ? 0 : this.accountCreated.hashCode()));
        result = ((result * 31) + ((this.accountLogin == null) ? 0 : this.accountLogin.hashCode()));
        result = ((result * 31) + ((this.displayName == null) ? 0 : this.displayName.hashCode()));
        result = ((result * 31) + ((this.accountExpires == null) ? 0 : this.accountExpires.hashCode()));
        result = ((result * 31) + ((this.accountType == null) ? 0 : this.accountType.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.userId == null) ? 0 : this.userId.hashCode()));
        result = ((result * 31) + ((this.extensions == null) ? 0 : this.extensions.hashCode()));
        result = ((result * 31) + ((this.isPrivileged == null) ? 0 : this.isPrivileged.hashCode()));
        result = ((result * 31) + ((this.passwordLastChanged == null) ? 0 : this.passwordLastChanged.hashCode()));
        result = ((result * 31) + ((this.accountLastLogin == null) ? 0 : this.accountLastLogin.hashCode()));
        result = ((result * 31) + ((this.accountFirstLogin == null) ? 0 : this.accountFirstLogin.hashCode()));
        result = ((result * 31) + ((this.canEscalatePrivs == null) ? 0 : this.canEscalatePrivs.hashCode()));
        result = ((result * 31) + ((this.isDisabled == null) ? 0 : this.isDisabled.hashCode()));
        result = ((result * 31) + ((this.isServiceAccount == null) ? 0 : this.isServiceAccount.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserAccount) == false) {
            return false;
        }
        UserAccount rhs = ((UserAccount) other);
        return (((((((((((((((super.equals(rhs) && ((this.accountCreated == rhs.accountCreated) || ((this.accountCreated != null) && this.accountCreated.equals(rhs.accountCreated)))) && ((this.accountLogin == rhs.accountLogin) || ((this.accountLogin != null) && this.accountLogin.equals(rhs.accountLogin)))) && ((this.displayName == rhs.displayName) || ((this.displayName != null) && this.displayName.equals(rhs.displayName)))) && ((this.accountExpires == rhs.accountExpires) || ((this.accountExpires != null) && this.accountExpires.equals(rhs.accountExpires)))) && ((this.accountType == rhs.accountType) || ((this.accountType != null) && this.accountType.equals(rhs.accountType)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.userId == rhs.userId) || ((this.userId != null) && this.userId.equals(rhs.userId)))) && ((this.extensions == rhs.extensions) || ((this.extensions != null) && this.extensions.equals(rhs.extensions)))) && ((this.isPrivileged == rhs.isPrivileged) || ((this.isPrivileged != null) && this.isPrivileged.equals(rhs.isPrivileged)))) && ((this.passwordLastChanged == rhs.passwordLastChanged) || ((this.passwordLastChanged != null) && this.passwordLastChanged.equals(rhs.passwordLastChanged)))) && ((this.accountLastLogin == rhs.accountLastLogin) || ((this.accountLastLogin != null) && this.accountLastLogin.equals(rhs.accountLastLogin)))) && ((this.accountFirstLogin == rhs.accountFirstLogin) || ((this.accountFirstLogin != null) && this.accountFirstLogin.equals(rhs.accountFirstLogin)))) && ((this.canEscalatePrivs == rhs.canEscalatePrivs) || ((this.canEscalatePrivs != null) && this.canEscalatePrivs.equals(rhs.canEscalatePrivs)))) && ((this.isDisabled == rhs.isDisabled) || ((this.isDisabled != null) && this.isDisabled.equals(rhs.isDisabled)))) && ((this.isServiceAccount == rhs.isServiceAccount) || ((this.isServiceAccount != null) && this.isServiceAccount.equals(rhs.isServiceAccount))));
    }

}
