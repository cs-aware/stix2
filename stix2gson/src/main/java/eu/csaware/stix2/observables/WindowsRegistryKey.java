
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;


/**
 * windows-registry-key
 * <p>
 * The Registry Key Object represents the properties of a Windows registry key.
 */
public class WindowsRegistryKey
		  extends CyberObservableCore {

	/**
	 * The value of this property MUST be `windows-registry-key`.
	 */
	@SerializedName("type")
	@Expose
	@Pattern(regexp = Types.WINDOWS_REGISTRY_KEY_TYPE)
	private String type = Types.WINDOWS_REGISTRY_KEY_TYPE;
	/**
	 * Specifies the full registry key including the hive.
	 * (Required)
	 */
	@SerializedName("key")
	@Expose
	@Pattern(regexp = "^HKEY_LOCAL_MACHINE|hkey_local_machine|HKEY_CURRENT_USER|hkey_current_user|HKEY_CLASSES_ROOT|hkey_classes_root|HKEY_CURRENT_CONFIG|hkey_current_config|HKEY_PERFORMANCE_DATA|hkey_performance_data|HKEY_USERS|hkey_users|HKEY_DYN_DATA")
	@NotNull
	private String key;
	/**
	 * Specifies the values found under the registry key.
	 */
	@SerializedName("values")
	@Expose
	@Valid
	private List<WindowsRegistryValueType> values = new ArrayList<WindowsRegistryValueType>();
	/**
	 * timestamp
	 * <p>
	 * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
	 */
	@SerializedName("modified")
	@Expose
	@Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
	private DateTime modified;
	/**
	 * Specifies a reference to a user account, represented as a User Account Object, that created the registry key.
	 */
	@SerializedName("creator_user_ref")
	@Expose
	private String creatorUserRef;
	/**
	 * Specifies the number of subkeys contained under the registry key.
	 */
	@SerializedName("number_of_subkeys")
	@Expose
	private Integer numberOfSubkeys;

	/**
	 * No args constructor for use in serialization
	 */
	public WindowsRegistryKey() {
	}

	/**
	 * @param extensions
	 * @param creatorUserRef
	 * @param values
	 * @param modified
	 * @param type
	 * @param numberOfSubkeys
	 * @param key
	 */
	public WindowsRegistryKey(String type, String key, List<WindowsRegistryValueType> values, DateTime modified, String creatorUserRef, Integer numberOfSubkeys, Dictionary extensions) {
		super(extensions);
		if (!type.equals(Types.WINDOWS_REGISTRY_KEY_TYPE)) {
			type = Types.WINDOWS_REGISTRY_KEY_TYPE;
		}
		this.type = type;
		this.key = key;
		this.values = values;
		this.modified = modified;
		this.creatorUserRef = creatorUserRef;
		this.numberOfSubkeys = numberOfSubkeys;
	}

	/**
	 * The value of this property MUST be `windows-registry-key`.
	 */
	public String getType() {
		return type;
	}

	/**
	 * The value of this property MUST be `windows-registry-key`.
	 */
	public void setType(String type) {
		if (!type.equals(Types.WINDOWS_REGISTRY_KEY_TYPE)) {
			type = Types.WINDOWS_REGISTRY_KEY_TYPE;
		}
		this.type = type;
	}

	/**
	 * Specifies the full registry key including the hive.
	 * (Required)
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Specifies the full registry key including the hive.
	 * (Required)
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Specifies the values found under the registry key.
	 */
	public List<WindowsRegistryValueType> getValues() {
		return values;
	}

	/**
	 * Specifies the values found under the registry key.
	 */
	public void setValues(List<WindowsRegistryValueType> values) {
		this.values = values;
	}

	/**
	 * timestamp
	 * <p>
	 * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
	 */
	public DateTime getModified() {
		return modified;
	}

	/**
	 * timestamp
	 * <p>
	 * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
	 */
	public void setModified(DateTime modified) {
		this.modified = modified;
	}

	/**
	 * Specifies a reference to a user account, represented as a User Account Object, that created the registry key.
	 */
	public String getCreatorUserRef() {
		return creatorUserRef;
	}

	/**
	 * Specifies a reference to a user account, represented as a User Account Object, that created the registry key.
	 */
	public void setCreatorUserRef(String creatorUserRef) {
		this.creatorUserRef = creatorUserRef;
	}

	/**
	 * Specifies the number of subkeys contained under the registry key.
	 */
	public Integer getNumberOfSubkeys() {
		return numberOfSubkeys;
	}

	/**
	 * Specifies the number of subkeys contained under the registry key.
	 */
	public void setNumberOfSubkeys(Integer numberOfSubkeys) {
		this.numberOfSubkeys = numberOfSubkeys;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(WindowsRegistryKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		sb.append("key");
		sb.append('=');
		sb.append(((this.key == null) ? "<null>" : this.key));
		sb.append(',');
		sb.append("values");
		sb.append('=');
		sb.append(((this.values == null) ? "<null>" : this.values));
		sb.append(',');
		sb.append("modified");
		sb.append('=');
		sb.append(((this.modified == null) ? "<null>" : this.modified));
		sb.append(',');
		sb.append("creatorUserRef");
		sb.append('=');
		sb.append(((this.creatorUserRef == null) ? "<null>" : this.creatorUserRef));
		sb.append(',');
		sb.append("numberOfSubkeys");
		sb.append('=');
		sb.append(((this.numberOfSubkeys == null) ? "<null>" : this.numberOfSubkeys));
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
		result = ((result * 31) + ((this.creatorUserRef == null) ? 0 : this.creatorUserRef.hashCode()));
		result = ((result * 31) + ((this.values == null) ? 0 : this.values.hashCode()));
		result = ((result * 31) + ((this.modified == null) ? 0 : this.modified.hashCode()));
		result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
		result = ((result * 31) + ((this.numberOfSubkeys == null) ? 0 : this.numberOfSubkeys.hashCode()));
		result = ((result * 31) + ((this.key == null) ? 0 : this.key.hashCode()));
		result = ((result * 31) + super.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof WindowsRegistryKey) == false) {
			return false;
		}
		WindowsRegistryKey rhs = ((WindowsRegistryKey) other);
		return ((((((super.equals(rhs) && ((this.creatorUserRef == rhs.creatorUserRef) || ((this.creatorUserRef != null) && this.creatorUserRef.equals(rhs.creatorUserRef)))) && ((this.values == rhs.values) || ((this.values != null) && this.values.equals(rhs.values)))) && ((this.modified == rhs.modified) || ((this.modified != null) && this.modified.equals(rhs.modified)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.numberOfSubkeys == rhs.numberOfSubkeys) || ((this.numberOfSubkeys != null) && this.numberOfSubkeys.equals(rhs.numberOfSubkeys)))) && ((this.key == rhs.key) || ((this.key != null) && this.key.equals(rhs.key))));
	}

}
