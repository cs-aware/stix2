
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;

import javax.validation.constraints.Pattern;


/**
 * artifact
 * <p>
 * The Artifact Object permits capturing an array of bytes (8-bits), as a base64-encoded string string, or linking to a file-like payload.
 */
public class Artifact
		  extends CyberObservableCore {

	/**
	 * The value of this property MUST be `artifact`.
	 */
	@SerializedName("type")
	@Expose
	@Pattern(regexp = Types.ARTIFACT_TYPE)
	private String type = Types.ARTIFACT_TYPE;
	/**
	 * The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.
	 */
	@SerializedName("mime_type")
	@Expose
	@Pattern(regexp = "^(application|audio|font|image|message|model|multipart|text|video)/[a-zA-Z0-9.+_-]+")
	private String mimeType;

	/**
	 * No args constructor for use in serialization
	 */
	public Artifact() {
	}

	/**
	 * @param extensions
	 * @param mimeType
	 * @param type
	 */
	public Artifact(String type, String mimeType, Dictionary extensions) {
		super(extensions);
		if (!type.equals(Types.ARTIFACT_TYPE)) {
			type = Types.ARTIFACT_TYPE;
		}
		this.type = type;
		this.mimeType = mimeType;
	}

	/**
	 * The value of this property MUST be `artifact`.
	 */
	public String getType() {
		return type;
	}

	/**
	 * The value of this property MUST be `artifact`.
	 */
	public void setType(String type) {
		if (!type.equals(Types.ARTIFACT_TYPE)) {
			type = Types.ARTIFACT_TYPE;
		}
		this.type = type;
	}

	/**
	 * The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * The value of this property MUST be a valid MIME type as specified in the IANA Media Types registry.
	 */
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Artifact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		sb.append("mimeType");
		sb.append('=');
		sb.append(((this.mimeType == null) ? "<null>" : this.mimeType));
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
		result = ((result * 31) + ((this.mimeType == null) ? 0 : this.mimeType.hashCode()));
		result = ((result * 31) + super.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Artifact) == false) {
			return false;
		}
		Artifact rhs = ((Artifact) other);
		return ((super.equals(rhs) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.mimeType == rhs.mimeType) || ((this.mimeType != null) && this.mimeType.equals(rhs.mimeType))));
	}

}
