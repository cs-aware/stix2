
package eu.csaware.stix2.sdos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * tool
 * <p>
 * Tools are legitimate software that can be used by threat actors to perform attacks.
 */
public class Tool extends Core {

    /**
     * The name used to identify the Tool.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * Provides more context and details about the Tool object.
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * The version identifier associated with the tool.
     */
    @SerializedName("tool_version")
    @Expose
    private String toolVersion;
    /**
     * The list of kill chain phases for which this Tool instance can be used.
     */
    @SerializedName("kill_chain_phases")
    @Expose
    @Size(min = 1)
    @Valid
    private List<KillChainPhase> killChainPhases = new ArrayList<KillChainPhase>();

    /**
     * No args constructor for use in serialization
     */
    public Tool() {
    }

    public Tool(String id, List<String> labels, String name, String createdByRef,
                LocalDateTime created, LocalDateTime modified) {
        super(id, createdByRef, labels, created, modified);
        this.name = name;
    }


    public Tool(String id, List<String> labels, String name, String description, String createdByRef,
                LocalDateTime created, LocalDateTime modified) {
        super(id, createdByRef, labels, created, modified);
        this.name = name;
        this.description = description;
    }

    public Tool(String id, List<String> labels, String name, String description, String toolVersion, List<KillChainPhase> killChainPhases,
                String createdByRef, LocalDateTime created, LocalDateTime modified, Boolean revoked, List<ExternalReference> externalReferences,
                List<String> objectMarkingRefs, List<GranularMarking> granularMarkings) {
        super(id, createdByRef, labels, created, modified, revoked, externalReferences, objectMarkingRefs, granularMarkings);
        this.name = name;
        this.description = description;
        this.toolVersion = toolVersion;
        this.killChainPhases = killChainPhases;
    }

    /**
     * The name used to identify the Tool.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * The name used to identify the Tool.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Provides more context and details about the Tool object.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Provides more context and details about the Tool object.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The version identifier associated with the tool.
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * The version identifier associated with the tool.
     */
    public void setToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
    }

    /**
     * The list of kill chain phases for which this Tool instance can be used.
     */
    public List<KillChainPhase> getKillChainPhases() {
        return killChainPhases;
    }

    /**
     * The list of kill chain phases for which this Tool instance can be used.
     */
    public void setKillChainPhases(List<KillChainPhase> killChainPhases) {
        this.killChainPhases = killChainPhases;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tool.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("toolVersion");
        sb.append('=');
        sb.append(((this.toolVersion == null) ? "<null>" : this.toolVersion));
        sb.append(',');
        sb.append("killChainPhases");
        sb.append('=');
        sb.append(((this.killChainPhases == null) ? "<null>" : this.killChainPhases));
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
        result = ((result * 31) + ((this.toolVersion == null) ? 0 : this.toolVersion.hashCode()));
        result = ((result * 31) + ((this.killChainPhases == null) ? 0 : this.killChainPhases.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.description == null) ? 0 : this.description.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tool) == false) {
            return false;
        }
        Tool rhs = ((Tool) other);
        return (((((((super.equals(rhs) && ((this.toolVersion == rhs.toolVersion) || ((this.toolVersion != null) && this.toolVersion.equals(rhs.toolVersion)))) && ((this.killChainPhases == rhs.killChainPhases) || ((this.killChainPhases != null) && this.killChainPhases.equals(rhs.killChainPhases)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.description == rhs.description) || ((this.description != null) && this.description.equals(rhs.description)))))));
    }

}
