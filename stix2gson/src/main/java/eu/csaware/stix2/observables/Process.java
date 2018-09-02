
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;


/**
 * process
 * <p>
 * The Process Object represents common properties of an instance of a computer program as executed on an operating system.
 */
public class Process extends CyberObservableCore {

    /**
     * The value of this property MUST be `process`.
     */
    @SerializedName("type")
    @Expose
    private Stix2Type type = Stix2Type.PROCESS;

    @SerializedName("extensions")
    @Expose
    @Valid
    private ProcessExtensionsDictionary extensions;
    /**
     * Specifies whether the process is hidden.
     */
    @SerializedName("is_hidden")
    @Expose
    private Boolean isHidden;
    /**
     * Specifies the Process ID, or PID, of the process.
     */
    @SerializedName("pid")
    @Expose
    private Integer pid;
    /**
     * Specifies the name of the process.
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("created")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String created;
    /**
     * Specifies the current working directory of the process.
     */
    @SerializedName("cwd")
    @Expose
    private String cwd;
    /**
     * Specifies the list of arguments used in executing the process.
     */
    @SerializedName("arguments")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> arguments;
    /**
     * Specifies the full command line used in executing the process, including the process name (depending on the operating system).
     */
    @SerializedName("command_line")
    @Expose
    private String commandLine;
    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    @SerializedName("environment_variables")
    @Expose
    @Valid
    private Dictionary environmentVariables;
    /**
     * Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.
     */
    @SerializedName("opened_connection_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> openedConnectionRefs;
    /**
     * Specifies the user that created the process, as a reference to a User Account Object.
     */
    @SerializedName("creator_user_ref")
    @Expose
    private String creatorUserRef;
    /**
     * Specifies the executable binary that was executed as the process, as a reference to a File Object.
     */
    @SerializedName("binary_ref")
    @Expose
    private String binaryRef;
    /**
     * Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.
     */
    @SerializedName("parent_ref")
    @Expose
    private String parentRef;
    /**
     * Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.
     */
    @SerializedName("child_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> childRefs;

    /**
     * No args constructor for use in serialization
     */
    public Process() {
    }

    public Process(ProcessExtensionsDictionary extensions, Boolean isHidden, Integer pid, String name, String created, String cwd, List<String> arguments, String commandLine, Dictionary environmentVariables, List<String> openedConnectionRefs, String creatorUserRef, String binaryRef, String parentRef, List<String> childRefs) {
        super(extensions);
        this.extensions = extensions;
        this.isHidden = isHidden;
        this.pid = pid;
        this.name = name;
        this.created = created;
        this.cwd = cwd;
        this.arguments = arguments;
        this.commandLine = commandLine;
        this.environmentVariables = environmentVariables;
        this.openedConnectionRefs = openedConnectionRefs;
        this.creatorUserRef = creatorUserRef;
        this.binaryRef = binaryRef;
        this.parentRef = parentRef;
        this.childRefs = childRefs;
    }

    /**
     * The value of this property MUST be `process`.
     */
    public Stix2Type getType() {
        return type;
    }

    public ProcessExtensionsDictionary getExtensions() {
        return extensions;
    }

    public void setExtensions(ProcessExtensionsDictionary extensions) {
        this.extensions = extensions;
    }

    /**
     * Specifies whether the process is hidden.
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Specifies whether the process is hidden.
     */
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Specifies the Process ID, or PID, of the process.
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * Specifies the Process ID, or PID, of the process.
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Specifies the name of the process.
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the process.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getCreated() {
        return created;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Specifies the current working directory of the process.
     */
    public String getCwd() {
        return cwd;
    }

    /**
     * Specifies the current working directory of the process.
     */
    public void setCwd(String cwd) {
        this.cwd = cwd;
    }

    /**
     * Specifies the list of arguments used in executing the process.
     */
    public List<String> getArguments() {
        return arguments;
    }

    /**
     * Specifies the list of arguments used in executing the process.
     */
    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    /**
     * Specifies the full command line used in executing the process, including the process name (depending on the operating system).
     */
    public String getCommandLine() {
        return commandLine;
    }

    /**
     * Specifies the full command line used in executing the process, including the process name (depending on the operating system).
     */
    public void setCommandLine(String commandLine) {
        this.commandLine = commandLine;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    public Dictionary getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * dictionary
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    public void setEnvironmentVariables(Dictionary environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    /**
     * Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.
     */
    public List<String> getOpenedConnectionRefs() {
        return openedConnectionRefs;
    }

    /**
     * Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic Objects.
     */
    public void setOpenedConnectionRefs(List<String> openedConnectionRefs) {
        this.openedConnectionRefs = openedConnectionRefs;
    }

    /**
     * Specifies the user that created the process, as a reference to a User Account Object.
     */
    public String getCreatorUserRef() {
        return creatorUserRef;
    }

    /**
     * Specifies the user that created the process, as a reference to a User Account Object.
     */
    public void setCreatorUserRef(String creatorUserRef) {
        this.creatorUserRef = creatorUserRef;
    }

    /**
     * Specifies the executable binary that was executed as the process, as a reference to a File Object.
     */
    public String getBinaryRef() {
        return binaryRef;
    }

    /**
     * Specifies the executable binary that was executed as the process, as a reference to a File Object.
     */
    public void setBinaryRef(String binaryRef) {
        this.binaryRef = binaryRef;
    }

    /**
     * Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.
     */
    public String getParentRef() {
        return parentRef;
    }

    /**
     * Specifies the other process that spawned (i.e. is the parent of) this one, as represented by a Process Object.
     */
    public void setParentRef(String parentRef) {
        this.parentRef = parentRef;
    }

    /**
     * Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.
     */
    public List<String> getChildRefs() {
        return childRefs;
    }

    /**
     * Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process Objects.
     */
    public void setChildRefs(List<String> childRefs) {
        this.childRefs = childRefs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Process.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("isHidden");
        sb.append('=');
        sb.append(((this.isHidden == null) ? "<null>" : this.isHidden));
        sb.append(',');
        sb.append("pid");
        sb.append('=');
        sb.append(((this.pid == null) ? "<null>" : this.pid));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("cwd");
        sb.append('=');
        sb.append(((this.cwd == null) ? "<null>" : this.cwd));
        sb.append(',');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null) ? "<null>" : this.arguments));
        sb.append(',');
        sb.append("commandLine");
        sb.append('=');
        sb.append(((this.commandLine == null) ? "<null>" : this.commandLine));
        sb.append(',');
        sb.append("environmentVariables");
        sb.append('=');
        sb.append(((this.environmentVariables == null) ? "<null>" : this.environmentVariables));
        sb.append(',');
        sb.append("openedConnectionRefs");
        sb.append('=');
        sb.append(((this.openedConnectionRefs == null) ? "<null>" : this.openedConnectionRefs));
        sb.append(',');
        sb.append("creatorUserRef");
        sb.append('=');
        sb.append(((this.creatorUserRef == null) ? "<null>" : this.creatorUserRef));
        sb.append(',');
        sb.append("binaryRef");
        sb.append('=');
        sb.append(((this.binaryRef == null) ? "<null>" : this.binaryRef));
        sb.append(',');
        sb.append("parentRef");
        sb.append('=');
        sb.append(((this.parentRef == null) ? "<null>" : this.parentRef));
        sb.append(',');
        sb.append("childRefs");
        sb.append('=');
        sb.append(((this.childRefs == null) ? "<null>" : this.childRefs));
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
        result = ((result * 31) + ((this.created == null) ? 0 : this.created.hashCode()));
        result = ((result * 31) + ((this.pid == null) ? 0 : this.pid.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.childRefs == null) ? 0 : this.childRefs.hashCode()));
        result = ((result * 31) + ((this.isHidden == null) ? 0 : this.isHidden.hashCode()));
        result = ((result * 31) + ((this.parentRef == null) ? 0 : this.parentRef.hashCode()));
        result = ((result * 31) + ((this.cwd == null) ? 0 : this.cwd.hashCode()));
        result = ((result * 31) + ((this.extensions == null) ? 0 : this.extensions.hashCode()));
        result = ((result * 31) + ((this.binaryRef == null) ? 0 : this.binaryRef.hashCode()));
        result = ((result * 31) + ((this.creatorUserRef == null) ? 0 : this.creatorUserRef.hashCode()));
        result = ((result * 31) + ((this.environmentVariables == null) ? 0 : this.environmentVariables.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.openedConnectionRefs == null) ? 0 : this.openedConnectionRefs.hashCode()));
        result = ((result * 31) + ((this.arguments == null) ? 0 : this.arguments.hashCode()));
        result = ((result * 31) + ((this.commandLine == null) ? 0 : this.commandLine.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Process) == false) {
            return false;
        }
        Process rhs = ((Process) other);
        return (((((((((((((((super.equals(rhs) && ((this.created == rhs.created) || ((this.created != null) && this.created.equals(rhs.created)))) && ((this.pid == rhs.pid) || ((this.pid != null) && this.pid.equals(rhs.pid)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.childRefs == rhs.childRefs) || ((this.childRefs != null) && this.childRefs.equals(rhs.childRefs)))) && ((this.isHidden == rhs.isHidden) || ((this.isHidden != null) && this.isHidden.equals(rhs.isHidden)))) && ((this.parentRef == rhs.parentRef) || ((this.parentRef != null) && this.parentRef.equals(rhs.parentRef)))) && ((this.cwd == rhs.cwd) || ((this.cwd != null) && this.cwd.equals(rhs.cwd)))) && ((this.extensions == rhs.extensions) || ((this.extensions != null) && this.extensions.equals(rhs.extensions)))) && ((this.binaryRef == rhs.binaryRef) || ((this.binaryRef != null) && this.binaryRef.equals(rhs.binaryRef)))) && ((this.creatorUserRef == rhs.creatorUserRef) || ((this.creatorUserRef != null) && this.creatorUserRef.equals(rhs.creatorUserRef)))) && ((this.environmentVariables == rhs.environmentVariables) || ((this.environmentVariables != null) && this.environmentVariables.equals(rhs.environmentVariables)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.openedConnectionRefs == rhs.openedConnectionRefs) || ((this.openedConnectionRefs != null) && this.openedConnectionRefs.equals(rhs.openedConnectionRefs)))) && ((this.arguments == rhs.arguments) || ((this.arguments != null) && this.arguments.equals(rhs.arguments)))) && ((this.commandLine == rhs.commandLine) || ((this.commandLine != null) && this.commandLine.equals(rhs.commandLine))));
    }
}
