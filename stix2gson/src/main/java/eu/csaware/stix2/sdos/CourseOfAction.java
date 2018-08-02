
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.Core;
import eu.csaware.stix2.common.ExternalReference;
import eu.csaware.stix2.common.GranularMarking;
import eu.csaware.stix2.common.Types;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;


/**
 * course-of-action
 * <p>
 * A Course of Action is an action taken either to prevent an attack or to respond to an attack that is in progress.
 */
public class CourseOfAction
		  extends Core {

	/**
	 * The type of this object, which MUST be the literal `course-of-action`.
	 */
	@SerializedName("type")
	@Expose
	@Pattern(regexp = Types.COURSE_OF_ACTION_TYPE)
	private String type = Types.COURSE_OF_ACTION_TYPE;
	/**
	 * id
	 * <p>
	 */
	@SerializedName("id")
	@Expose
	@Pattern(regexp = "^course-of-action--")
	private String id;
	/**
	 * The name used to identify the Course of Action.
	 * (Required)
	 */
	@SerializedName("name")
	@Expose
	@NotNull
	private String name;
	/**
	 * A description that provides more details and context about this object, potentially including its purpose and its key characteristics.
	 */
	@SerializedName("description")
	@Expose
	private String description;

	/**
	 * No args constructor for use in serialization
	 */
	public CourseOfAction() {
	}

	/**
	 * @param externalReferences
	 * @param created
	 * @param granularMarkings
	 * @param name
	 * @param description
	 * @param modified
	 * @param createdByRef
	 * @param id
	 * @param objectMarkingRefs
	 * @param type
	 * @param revoked
	 * @param labels
	 */
	public CourseOfAction(String type, String id, String name, String description, String createdByRef, List<String> labels,
								 LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences, List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
		super(createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
		if (!type.equals(Types.COURSE_OF_ACTION_TYPE)) {
			type = Types.COURSE_OF_ACTION_TYPE;
		}
		this.type = type;
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/**
	 * The type of this object, which MUST be the literal `course-of-action`.
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of this object, which MUST be the literal `course-of-action`.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * id
	 * <p>
	 */
	public String getId() {
		return id;
	}

	/**
	 * id
	 * <p>
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The name used to identify the Course of Action.
	 * (Required)
	 */
	public String getName() {
		return name;
	}

	/**
	 * The name used to identify the Course of Action.
	 * (Required)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * A description that provides more details and context about this object, potentially including its purpose and its key characteristics.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * A description that provides more details and context about this object, potentially including its purpose and its key characteristics.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(CourseOfAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null) ? "<null>" : this.name));
		sb.append(',');
		sb.append("description");
		sb.append('=');
		sb.append(((this.description == null) ? "<null>" : this.description));
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
		result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
		result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
		result = ((result * 31) + super.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof CourseOfAction) == false) {
			return false;
		}
		CourseOfAction rhs = ((CourseOfAction) other);
		return ((((super.equals(rhs) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))));
	}

}
