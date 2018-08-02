
package eu.csaware.stix2.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.sdos.*;
import eu.csaware.stix2.sros.Relationship;
import eu.csaware.stix2.sros.Sighting;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * bundle
 * <p>
 * A Bundle is a collection of arbitrary STIX Objects and Marking Definitions grouped together in a single container.
 */
public class Bundle {

	/**
	 * The type of this object, which MUST be the literal `bundle`.
	 * (Required)
	 */
	@SerializedName("type")
	@Expose
	@Pattern(regexp = Types.BUNDLE_TYPE)
	@NotNull
	private String type = Types.BUNDLE_TYPE;
	/**
	 * id
	 * <p>
	 * <p>
	 * (Required)
	 */
	@SerializedName("id")
	@Expose
	@Pattern(regexp = "^bundle--[a-z][a-z-]+[a-z]--[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")
	@NotNull
	private String id;
	/**
	 * The version of the STIX specification used to represent the content in this bundle.
	 * (Required)
	 */
	@SerializedName("spec_version")
	@Expose
	@NotNull
	private String specVersion;
	/**
	 * Specifies a set of one or more STIX Objects.
	 */
	@SerializedName("objects")
	@Expose
	@Size(min = 1)
	@Valid
	private List<Object> objects = new ArrayList<Object>();

	/**
	 * No args constructor for use in serialization
	 */
	public Bundle() {
	}

	/**
	 * @param specVersion
	 * @param objects
	 * @param id
	 * @param type
	 */
	public Bundle(String type, String id, String specVersion, List<Object> objects) {
		super();
		if (!type.equals(Types.BUNDLE_TYPE)) {
			type = Types.BUNDLE_TYPE;
		}
		this.type = type;
		this.id = id;
		this.specVersion = specVersion;
		this.objects = objects;
	}

	public static Bundle buildFromString (String jsonString) {

		Gson gson = new GsonBuilder()
				  .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter())
				  .setPrettyPrinting()
				  .create();
//		Map<String, Object> jsonMap = gson.fromJson(jsonString, new TypeToken<Map<String, Object>>() {
//		}.getType());

		Bundle bundle = gson.fromJson(jsonString, Bundle.class);
		Bundle resultBundle = new Bundle();
		resultBundle.setType(Types.BUNDLE_TYPE);
		resultBundle.setId(bundle.getId());
		if (bundle.getSpecVersion() != null) {
			resultBundle.setSpecVersion(bundle.getSpecVersion());
		}

		bundle.getObjects().forEach((obj) -> {
			Map<String, Object> objMap = (Map<String, Object>) obj;
			String type = (String) objMap.get("type");
			String objectString = gson.toJson(obj);
			switch (type) {
				case Types.ATTACK_PATTERS_TYPE:
					AttackPattern attackPattern = gson.fromJson(objectString, AttackPattern.class);
					resultBundle.getObjects().add(attackPattern);
					break;
				case Types.CAMPAIGN_TYPE:
					Campaign campaign = gson.fromJson(objectString, Campaign.class);
					resultBundle.getObjects().add(campaign);
				case Types.COURSE_OF_ACTION_TYPE:
					CourseOfAction courseOfAction = gson.fromJson(objectString, CourseOfAction.class);
					resultBundle.getObjects().add(courseOfAction);
					break;
				case Types.IDENTITY_TYPE:
					Identity identity = gson.fromJson(objectString, Identity.class);
					resultBundle.getObjects().add(identity);
					break;
				case Types.INDICATOR_TYPE:
					Indicator indicator = gson.fromJson(objectString, Indicator.class);
					resultBundle.getObjects().add(indicator);
					break;
				case Types.INTRUSION_SET_TYPE:
					IntrusionSet intrusionSet = gson.fromJson(objectString, IntrusionSet.class);
					resultBundle.getObjects().add(intrusionSet);
					break;
				case Types.MALWARE_TYPE:
					Malware malware = gson.fromJson(objectString, Malware.class);
					resultBundle.getObjects().add(malware);
					break;
				case Types.OBSERVED_DATA_TYPE:
					ObservedData observedData = gson.fromJson(objectString, ObservedData.class);
					resultBundle.getObjects().add(observedData);
					break;
				case Types.REPORT_TYPE:
					Report report = gson.fromJson(objectString, Report.class);
					resultBundle.getObjects().add(report);
					break;
				case Types.THREAT_ACTOR_TYPE:
					ThreatActor threatActor = gson.fromJson(objectString, ThreatActor.class);
					resultBundle.getObjects().add(threatActor);
				case Types.RELATIONSHIP_TYPE:
					Relationship relationship = gson.fromJson(objectString, Relationship.class);
					resultBundle.getObjects().add(relationship);
					break;
				case Types.SIGHTING_TYPE:
					Sighting sighting = gson.fromJson(objectString, Sighting.class);
					resultBundle.getObjects().add(sighting);
					break;
				case Types.TOOL_TYPE:
					Tool tool = gson.fromJson(objectString, Tool.class);
					resultBundle.getObjects().add(tool);
					break;
				case Types.VULNERABILITY_TYPE:
					Vulnerability vulnerability = gson.fromJson(objectString, Vulnerability.class);
					resultBundle.getObjects().add(vulnerability);
					break;
				default:
					throw new IllegalArgumentException("found unknown object type: " + type);
			}
		});
		return resultBundle;
	}
	/**
	 * The type of this object, which MUST be the literal `bundle`.
	 * (Required)
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of this object, which MUST be the literal `bundle`.
	 * (Required)
	 */
	public void setType(String type) {
		if (!type.equals(Types.BUNDLE_TYPE)) {
			type = Types.BUNDLE_TYPE;
		}
		this.type = type;
	}

	/**
	 * id
	 * <p>
	 * <p>
	 * (Required)
	 */
	public String getId() {
		return id;
	}

	/**
	 * id
	 * <p>
	 * <p>
	 * (Required)
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The version of the STIX specification used to represent the content in this bundle.
	 * (Required)
	 */
	public String getSpecVersion() {
		return specVersion;
	}

	/**
	 * The version of the STIX specification used to represent the content in this bundle.
	 * (Required)
	 */
	public void setSpecVersion(String specVersion) {
		this.specVersion = specVersion;
	}

	/**
	 * Specifies a set of one or more STIX Objects.
	 */
	public List<Object> getObjects() {
		return objects;
	}

	/**
	 * Specifies a set of one or more STIX Objects.
	 */
	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Bundle.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("type");
		sb.append('=');
		sb.append(((this.type == null) ? "<null>" : this.type));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("specVersion");
		sb.append('=');
		sb.append(((this.specVersion == null) ? "<null>" : this.specVersion));
		sb.append(',');
		sb.append("objects");
		sb.append('=');
		if (this.objects == null)  {
			sb.append("<null>");
		} else {
			sb.append("[");
			this.objects.forEach((obj) -> {
//				String type = obj.toString();
				Map<String, Object> objMap = (Map<String, Object>) obj;
				String type = (String)objMap.get("type");
				String id = (String) objMap.get("id");
				sb.append( "\ntype: "+ type + " id: " + id + " - " + obj.toString());
//				sb.append("\n ("+ obj.getClass().getCanonicalName() + ") " + obj.toString());
			});
			sb.append("]");
		}
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
		result = ((result * 31) + ((this.specVersion == null) ? 0 : this.specVersion.hashCode()));
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
		result = ((result * 31) + ((this.objects == null) ? 0 : this.objects.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Bundle) == false) {
			return false;
		}
		Bundle rhs = ((Bundle) other);
		return (((((this.specVersion == rhs.specVersion) || ((this.specVersion != null) && this.specVersion.equals(rhs.specVersion))) && ((this.id == rhs.id) || ((this.id != null) && this.id.equals(rhs.id)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.objects == rhs.objects) || ((this.objects != null) && this.objects.equals(rhs.objects))));
	}
}
