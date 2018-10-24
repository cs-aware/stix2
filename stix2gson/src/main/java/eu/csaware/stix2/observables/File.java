
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.HashesType;
import eu.csaware.stix2.common.LocalDateTimeTypeAdapter;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;


/**
 * file
 * <p>
 * The File Object represents the properties of a file.
 */
public class File extends CyberObservableCore {

    @SerializedName("extensions")
    @Expose
    @Valid
    private FileExtensionsDictionary extensions;
    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    @SerializedName("hashes")
    @Expose
    @Valid
    private HashesType hashes;
    /**
     * Specifies the size of the file, in bytes, as a non-negative integer.
     */
    @SerializedName("size")
    @Expose
    @DecimalMin("0")
    private Integer size;
    /**
     * Specifies the name of the file.
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Specifies the observed encoding for the name of the file.
     */
    @SerializedName("name_enc")
    @Expose
    @Pattern(regexp = "^[a-zA-Z0-9/\\.+_:-]{2,250}$")
    private String nameEnc;
    /**
     * hex
     * <p>
     * The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.
     */
    @SerializedName("magic_number_hex")
    @Expose
    @Pattern(regexp = "^([a-fA-F0-9]{2})+$")
    private String magicNumberHex;
    /**
     * Specifies the MIME type name specified for the file, e.g., 'application/msword'.
     */
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("created")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime created;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("modified")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    @JsonAdapter(LocalDateTimeTypeAdapter.class)
    private LocalDateTime modified;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("accessed")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String accessed;
    /**
     * Specifies the parent directory of the file, as a reference to a Directory Object.
     */
    @SerializedName("parent_directory_ref")
    @Expose
    private String parentDirectoryRef;
    /**
     * Specifies a list of references to other Observable Objects contained within the file.
     */
    @SerializedName("contains_refs")
    @Expose
    @Size(min = 1)
    @Valid
    private List<String> containsRefs;
    /**
     * Specifies the content of the file, represented as an Artifact Object.
     */
    @SerializedName("content_ref")
    @Expose
    private String contentRef;

    /**
     * No args constructor for use in serialization
     */
    public File() {
    }

    public File(String name) {
        super();
        this.name = name;
    }

    public File(FileExtensionsDictionary extensions, HashesType hashes, Integer size, String name,
                String nameEnc, String magicNumberHex, String mimeType, LocalDateTime created, LocalDateTime modified, String accessed, String parentDirectoryRef, List<String> containsRefs, String contentRef) {
        super(extensions);
        this.extensions = extensions;
        this.hashes = hashes;
        this.size = size;
        this.name = name;
        this.nameEnc = nameEnc;
        this.magicNumberHex = magicNumberHex;
        this.mimeType = mimeType;
        this.created = created;
        this.modified = modified;
        this.accessed = accessed;
        this.parentDirectoryRef = parentDirectoryRef;
        this.containsRefs = containsRefs;
        this.contentRef = contentRef;
    }

    public FileExtensionsDictionary getExtensions() {
        return extensions;
    }

    public void setExtensions(FileExtensionsDictionary extensions) {
        this.extensions = extensions;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    public HashesType getHashes() {
        return hashes;
    }

    /**
     * hashes
     * <p>
     * A dictionary captures a set of key/value pairs
     */
    public void setHashes(HashesType hashes) {
        this.hashes = hashes;
    }

    /**
     * Specifies the size of the file, in bytes, as a non-negative integer.
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Specifies the size of the file, in bytes, as a non-negative integer.
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Specifies the name of the file.
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the file.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the observed encoding for the name of the file.
     */
    public String getNameEnc() {
        return nameEnc;
    }

    /**
     * Specifies the observed encoding for the name of the file.
     */
    public void setNameEnc(String nameEnc) {
        this.nameEnc = nameEnc;
    }

    /**
     * hex
     * <p>
     * The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.
     */
    public String getMagicNumberHex() {
        return magicNumberHex;
    }

    /**
     * hex
     * <p>
     * The hex data type encodes an array of octets (8-bit bytes) as hexadecimal. The string MUST consist of an even number of hexadecimal characters, which are the digits '0' through '9' and the letters 'a' through 'f'.  In order to allow pattern matching on custom objects, all properties that use the hex type, the property name MUST end with '_hex'.
     */
    public void setMagicNumberHex(String magicNumberHex) {
        this.magicNumberHex = magicNumberHex;
    }

    /**
     * Specifies the MIME type name specified for the file, e.g., 'application/msword'.
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Specifies the MIME type name specified for the file, e.g., 'application/msword'.
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public LocalDateTime getModified() {
        return modified;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getAccessed() {
        return accessed;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setAccessed(String accessed) {
        this.accessed = accessed;
    }

    /**
     * Specifies the parent directory of the file, as a reference to a Directory Object.
     */
    public String getParentDirectoryRef() {
        return parentDirectoryRef;
    }

    /**
     * Specifies the parent directory of the file, as a reference to a Directory Object.
     */
    public void setParentDirectoryRef(String parentDirectoryRef) {
        this.parentDirectoryRef = parentDirectoryRef;
    }

    /**
     * Specifies a list of references to other Observable Objects contained within the file.
     */
    public List<String> getContainsRefs() {
        return containsRefs;
    }

    /**
     * Specifies a list of references to other Observable Objects contained within the file.
     */
    public void setContainsRefs(List<String> containsRefs) {
        this.containsRefs = containsRefs;
    }

    /**
     * Specifies the content of the file, represented as an Artifact Object.
     */
    public String getContentRef() {
        return contentRef;
    }

    /**
     * Specifies the content of the file, represented as an Artifact Object.
     */
    public void setContentRef(String contentRef) {
        this.contentRef = contentRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(File.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("extensions");
        sb.append('=');
        sb.append(((this.extensions == null) ? "<null>" : this.extensions));
        sb.append(',');
        sb.append("hashes");
        sb.append('=');
        sb.append(((this.hashes == null) ? "<null>" : this.hashes));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null) ? "<null>" : this.size));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("nameEnc");
        sb.append('=');
        sb.append(((this.nameEnc == null) ? "<null>" : this.nameEnc));
        sb.append(',');
        sb.append("magicNumberHex");
        sb.append('=');
        sb.append(((this.magicNumberHex == null) ? "<null>" : this.magicNumberHex));
        sb.append(',');
        sb.append("mimeType");
        sb.append('=');
        sb.append(((this.mimeType == null) ? "<null>" : this.mimeType));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("modified");
        sb.append('=');
        sb.append(((this.modified == null) ? "<null>" : this.modified));
        sb.append(',');
        sb.append("accessed");
        sb.append('=');
        sb.append(((this.accessed == null) ? "<null>" : this.accessed));
        sb.append(',');
        sb.append("parentDirectoryRef");
        sb.append('=');
        sb.append(((this.parentDirectoryRef == null) ? "<null>" : this.parentDirectoryRef));
        sb.append(',');
        sb.append("containsRefs");
        sb.append('=');
        sb.append(((this.containsRefs == null) ? "<null>" : this.containsRefs));
        sb.append(',');
        sb.append("contentRef");
        sb.append('=');
        sb.append(((this.contentRef == null) ? "<null>" : this.contentRef));
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
        result = ((result * 31) + ((this.containsRefs == null) ? 0 : this.containsRefs.hashCode()));
        result = ((result * 31) + ((this.created == null) ? 0 : this.created.hashCode()));
        result = ((result * 31) + ((this.mimeType == null) ? 0 : this.mimeType.hashCode()));
        result = ((result * 31) + ((this.accessed == null) ? 0 : this.accessed.hashCode()));
        result = ((result * 31) + ((this.nameEnc == null) ? 0 : this.nameEnc.hashCode()));
        result = ((result * 31) + ((this.magicNumberHex == null) ? 0 : this.magicNumberHex.hashCode()));
        result = ((result * 31) + ((this.extensions == null) ? 0 : this.extensions.hashCode()));
        result = ((result * 31) + ((this.parentDirectoryRef == null) ? 0 : this.parentDirectoryRef.hashCode()));
        result = ((result * 31) + ((this.size == null) ? 0 : this.size.hashCode()));
        result = ((result * 31) + ((this.hashes == null) ? 0 : this.hashes.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.modified == null) ? 0 : this.modified.hashCode()));
        result = ((result * 31) + ((this.contentRef == null) ? 0 : this.contentRef.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof File) == false) {
            return false;
        }
        File rhs = ((File) other);
        return ((((((((((((((super.equals(rhs) && ((this.containsRefs == rhs.containsRefs) || ((this.containsRefs != null) && this.containsRefs.equals(rhs.containsRefs)))) && ((this.created == rhs.created) || ((this.created != null) && this.created.equals(rhs.created)))) && ((this.mimeType == rhs.mimeType) || ((this.mimeType != null) && this.mimeType.equals(rhs.mimeType))))) && ((this.accessed == rhs.accessed) || ((this.accessed != null) && this.accessed.equals(rhs.accessed)))) && ((this.nameEnc == rhs.nameEnc) || ((this.nameEnc != null) && this.nameEnc.equals(rhs.nameEnc)))) && ((this.magicNumberHex == rhs.magicNumberHex) || ((this.magicNumberHex != null) && this.magicNumberHex.equals(rhs.magicNumberHex)))) && ((this.extensions == rhs.extensions) || ((this.extensions != null) && this.extensions.equals(rhs.extensions)))) && ((this.parentDirectoryRef == rhs.parentDirectoryRef) || ((this.parentDirectoryRef != null) && this.parentDirectoryRef.equals(rhs.parentDirectoryRef)))) && ((this.size == rhs.size) || ((this.size != null) && this.size.equals(rhs.size)))) && ((this.hashes == rhs.hashes) || ((this.hashes != null) && this.hashes.equals(rhs.hashes)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.modified == rhs.modified) || ((this.modified != null) && this.modified.equals(rhs.modified)))) && ((this.contentRef == rhs.contentRef) || ((this.contentRef != null) && this.contentRef.equals(rhs.contentRef))));
    }

}
