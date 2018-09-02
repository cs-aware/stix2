
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Stix2Type;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;


/**
 * network-traffic
 * <p>
 * The Network Traffic Object represents arbitrary network traffic that originates from a source and is addressed to a destination.
 */
public class NetworkTraffic extends CyberObservableCore {

    /**
     * The value of this property MUST be `network-traffic`.
     */
    @SerializedName("type")
    @Expose
    private Stix2Type type = Stix2Type.NETWORK_TRAFFIC;

    @SerializedName("extensions")
    @Expose
    @Valid
    private NetworkTrafficExtensionsDictionary extensions;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("start")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String start;
    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    @SerializedName("end")
    @Expose
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
    private String end;
    /**
     * Specifies the source of the network traffic, as a reference to one or more Observable Objects.
     */
    @SerializedName("src_ref")
    @Expose
    private String srcRef;
    /**
     * Specifies the destination of the network traffic, as a reference to one or more Observable Objects.
     */
    @SerializedName("dst_ref")
    @Expose
    private String dstRef;
    /**
     * Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     */
    @SerializedName("src_port")
    @Expose
    @DecimalMin("0")
    @DecimalMax("65535")
    private Integer srcPort;
    /**
     * Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     */
    @SerializedName("dst_port")
    @Expose
    @DecimalMin("0")
    @DecimalMax("65535")
    private Integer dstPort;
    /**
     * Specifies the protocols observed in the network traffic, along with their corresponding state.
     * (Required)
     */
    @SerializedName("protocols")
    @Expose
    @Size(min = 1)
    @Valid
    @NotNull
    private List<String> protocols = new ArrayList<String>();
    /**
     * Specifies the number of bytes sent from the source to the destination.
     */
    @SerializedName("src_byte_count")
    @Expose
    private Integer srcByteCount;
    /**
     * Specifies the number of bytes sent from the destination to the source.
     */
    @SerializedName("dst_byte_count")
    @Expose
    private Integer dstByteCount;
    /**
     * Specifies the number of packets sent from the source to the destination.
     */
    @SerializedName("src_packets")
    @Expose
    private Integer srcPackets;
    /**
     * Specifies the number of packets sent destination to the source.
     */
    @SerializedName("dst_packets")
    @Expose
    private Integer dstPackets;
    @SerializedName("ipfix")
    @Expose
    @Valid
    private Ipfix ipfix;
    /**
     * Specifies the bytes sent from the source to the destination.
     */
    @SerializedName("src_payload_ref")
    @Expose
    private String srcPayloadRef;
    /**
     * Specifies the bytes sent from the source to the destination.
     */
    @SerializedName("dst_payload_ref")
    @Expose
    private String dstPayloadRef;
    /**
     * Links to other network-traffic objects encapsulated by a network-traffic.
     */
    @SerializedName("encapsulates_refs")
    @Expose
    @Valid
    private List<String> encapsulatesRefs = new ArrayList<String>();
    /**
     * Links to another network-traffic object which encapsulates this object.
     */
    @SerializedName("encapsulated_by_ref")
    @Expose
    private String encapsulatedByRef;

    /**
     * No args constructor for use in serialization
     */
    public NetworkTraffic() {
    }

    public NetworkTraffic(NetworkTrafficExtensionsDictionary extensions, String start, String end, String srcRef, String dstRef, Integer srcPort, Integer dstPort, List<String> protocols, Integer srcByteCount, Integer dstByteCount, Integer srcPackets, Integer dstPackets, Ipfix ipfix, String srcPayloadRef, String dstPayloadRef, List<String> encapsulatesRefs, String encapsulatedByRef) {
        super(extensions);
        this.extensions = extensions;
        this.start = start;
        this.end = end;
        this.srcRef = srcRef;
        this.dstRef = dstRef;
        this.srcPort = srcPort;
        this.dstPort = dstPort;
        this.protocols = protocols;
        this.srcByteCount = srcByteCount;
        this.dstByteCount = dstByteCount;
        this.srcPackets = srcPackets;
        this.dstPackets = dstPackets;
        this.ipfix = ipfix;
        this.srcPayloadRef = srcPayloadRef;
        this.dstPayloadRef = dstPayloadRef;
        this.encapsulatesRefs = encapsulatesRefs;
        this.encapsulatedByRef = encapsulatedByRef;
    }

    /**
     * The value of this property MUST be `network-traffic`.
     */
    public Stix2Type getType() {
        return type;
    }

    public NetworkTrafficExtensionsDictionary getExtensions() {
        return extensions;
    }

    public void setExtensions(NetworkTrafficExtensionsDictionary extensions) {
        this.extensions = extensions;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getStart() {
        return start;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public String getEnd() {
        return end;
    }

    /**
     * timestamp
     * <p>
     * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Specifies the source of the network traffic, as a reference to one or more Observable Objects.
     */
    public String getSrcRef() {
        return srcRef;
    }

    /**
     * Specifies the source of the network traffic, as a reference to one or more Observable Objects.
     */
    public void setSrcRef(String srcRef) {
        this.srcRef = srcRef;
    }

    /**
     * Specifies the destination of the network traffic, as a reference to one or more Observable Objects.
     */
    public String getDstRef() {
        return dstRef;
    }

    /**
     * Specifies the destination of the network traffic, as a reference to one or more Observable Objects.
     */
    public void setDstRef(String dstRef) {
        this.dstRef = dstRef;
    }

    /**
     * Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     */
    public Integer getSrcPort() {
        return srcPort;
    }

    /**
     * Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     */
    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    /**
     * Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     */
    public Integer getDstPort() {
        return dstPort;
    }

    /**
     * Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535.
     */
    public void setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
    }

    /**
     * Specifies the protocols observed in the network traffic, along with their corresponding state.
     * (Required)
     */
    public List<String> getProtocols() {
        return protocols;
    }

    /**
     * Specifies the protocols observed in the network traffic, along with their corresponding state.
     * (Required)
     */
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    /**
     * Specifies the number of bytes sent from the source to the destination.
     */
    public Integer getSrcByteCount() {
        return srcByteCount;
    }

    /**
     * Specifies the number of bytes sent from the source to the destination.
     */
    public void setSrcByteCount(Integer srcByteCount) {
        this.srcByteCount = srcByteCount;
    }

    /**
     * Specifies the number of bytes sent from the destination to the source.
     */
    public Integer getDstByteCount() {
        return dstByteCount;
    }

    /**
     * Specifies the number of bytes sent from the destination to the source.
     */
    public void setDstByteCount(Integer dstByteCount) {
        this.dstByteCount = dstByteCount;
    }

    /**
     * Specifies the number of packets sent from the source to the destination.
     */
    public Integer getSrcPackets() {
        return srcPackets;
    }

    /**
     * Specifies the number of packets sent from the source to the destination.
     */
    public void setSrcPackets(Integer srcPackets) {
        this.srcPackets = srcPackets;
    }

    /**
     * Specifies the number of packets sent destination to the source.
     */
    public Integer getDstPackets() {
        return dstPackets;
    }

    /**
     * Specifies the number of packets sent destination to the source.
     */
    public void setDstPackets(Integer dstPackets) {
        this.dstPackets = dstPackets;
    }

    public Ipfix getIpfix() {
        return ipfix;
    }

    public void setIpfix(Ipfix ipfix) {
        this.ipfix = ipfix;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     */
    public String getSrcPayloadRef() {
        return srcPayloadRef;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     */
    public void setSrcPayloadRef(String srcPayloadRef) {
        this.srcPayloadRef = srcPayloadRef;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     */
    public String getDstPayloadRef() {
        return dstPayloadRef;
    }

    /**
     * Specifies the bytes sent from the source to the destination.
     */
    public void setDstPayloadRef(String dstPayloadRef) {
        this.dstPayloadRef = dstPayloadRef;
    }

    /**
     * Links to other network-traffic objects encapsulated by a network-traffic.
     */
    public List<String> getEncapsulatesRefs() {
        return encapsulatesRefs;
    }

    /**
     * Links to other network-traffic objects encapsulated by a network-traffic.
     */
    public void setEncapsulatesRefs(List<String> encapsulatesRefs) {
        this.encapsulatesRefs = encapsulatesRefs;
    }

    /**
     * Links to another network-traffic object which encapsulates this object.
     */
    public String getEncapsulatedByRef() {
        return encapsulatedByRef;
    }

    /**
     * Links to another network-traffic object which encapsulates this object.
     */
    public void setEncapsulatedByRef(String encapsulatedByRef) {
        this.encapsulatedByRef = encapsulatedByRef;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NetworkTraffic.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null) ? "<null>" : this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null) ? "<null>" : this.end));
        sb.append(',');
        sb.append("srcRef");
        sb.append('=');
        sb.append(((this.srcRef == null) ? "<null>" : this.srcRef));
        sb.append(',');
        sb.append("dstRef");
        sb.append('=');
        sb.append(((this.dstRef == null) ? "<null>" : this.dstRef));
        sb.append(',');
        sb.append("srcPort");
        sb.append('=');
        sb.append(((this.srcPort == null) ? "<null>" : this.srcPort));
        sb.append(',');
        sb.append("dstPort");
        sb.append('=');
        sb.append(((this.dstPort == null) ? "<null>" : this.dstPort));
        sb.append(',');
        sb.append("protocols");
        sb.append('=');
        sb.append(((this.protocols == null) ? "<null>" : this.protocols));
        sb.append(',');
        sb.append("srcByteCount");
        sb.append('=');
        sb.append(((this.srcByteCount == null) ? "<null>" : this.srcByteCount));
        sb.append(',');
        sb.append("dstByteCount");
        sb.append('=');
        sb.append(((this.dstByteCount == null) ? "<null>" : this.dstByteCount));
        sb.append(',');
        sb.append("srcPackets");
        sb.append('=');
        sb.append(((this.srcPackets == null) ? "<null>" : this.srcPackets));
        sb.append(',');
        sb.append("dstPackets");
        sb.append('=');
        sb.append(((this.dstPackets == null) ? "<null>" : this.dstPackets));
        sb.append(',');
        sb.append("ipfix");
        sb.append('=');
        sb.append(((this.ipfix == null) ? "<null>" : this.ipfix));
        sb.append(',');
        sb.append("srcPayloadRef");
        sb.append('=');
        sb.append(((this.srcPayloadRef == null) ? "<null>" : this.srcPayloadRef));
        sb.append(',');
        sb.append("dstPayloadRef");
        sb.append('=');
        sb.append(((this.dstPayloadRef == null) ? "<null>" : this.dstPayloadRef));
        sb.append(',');
        sb.append("encapsulatesRefs");
        sb.append('=');
        sb.append(((this.encapsulatesRefs == null) ? "<null>" : this.encapsulatesRefs));
        sb.append(',');
        sb.append("encapsulatedByRef");
        sb.append('=');
        sb.append(((this.encapsulatedByRef == null) ? "<null>" : this.encapsulatedByRef));
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
        result = ((result * 31) + ((this.dstRef == null) ? 0 : this.dstRef.hashCode()));
        result = ((result * 31) + ((this.srcPayloadRef == null) ? 0 : this.srcPayloadRef.hashCode()));
        result = ((result * 31) + ((this.start == null) ? 0 : this.start.hashCode()));
        result = ((result * 31) + ((this.encapsulatedByRef == null) ? 0 : this.encapsulatedByRef.hashCode()));
        result = ((result * 31) + ((this.dstByteCount == null) ? 0 : this.dstByteCount.hashCode()));
        result = ((result * 31) + ((this.srcPort == null) ? 0 : this.srcPort.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.srcByteCount == null) ? 0 : this.srcByteCount.hashCode()));
        result = ((result * 31) + ((this.srcPackets == null) ? 0 : this.srcPackets.hashCode()));
        result = ((result * 31) + ((this.extensions == null) ? 0 : this.extensions.hashCode()));
        result = ((result * 31) + ((this.dstPackets == null) ? 0 : this.dstPackets.hashCode()));
        result = ((result * 31) + ((this.ipfix == null) ? 0 : this.ipfix.hashCode()));
        result = ((result * 31) + ((this.dstPort == null) ? 0 : this.dstPort.hashCode()));
        result = ((result * 31) + ((this.dstPayloadRef == null) ? 0 : this.dstPayloadRef.hashCode()));
        result = ((result * 31) + ((this.end == null) ? 0 : this.end.hashCode()));
        result = ((result * 31) + ((this.protocols == null) ? 0 : this.protocols.hashCode()));
        result = ((result * 31) + ((this.srcRef == null) ? 0 : this.srcRef.hashCode()));
        result = ((result * 31) + ((this.encapsulatesRefs == null) ? 0 : this.encapsulatesRefs.hashCode()));
        result = ((result * 31) + super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkTraffic) == false) {
            return false;
        }
        NetworkTraffic rhs = ((NetworkTraffic) other);
        return ((((((((((((((((((super.equals(rhs) && ((this.dstRef == rhs.dstRef) || ((this.dstRef != null) && this.dstRef.equals(rhs.dstRef)))) && ((this.srcPayloadRef == rhs.srcPayloadRef) || ((this.srcPayloadRef != null) && this.srcPayloadRef.equals(rhs.srcPayloadRef)))) && ((this.start == rhs.start) || ((this.start != null) && this.start.equals(rhs.start)))) && ((this.encapsulatedByRef == rhs.encapsulatedByRef) || ((this.encapsulatedByRef != null) && this.encapsulatedByRef.equals(rhs.encapsulatedByRef)))) && ((this.dstByteCount == rhs.dstByteCount) || ((this.dstByteCount != null) && this.dstByteCount.equals(rhs.dstByteCount)))) && ((this.srcPort == rhs.srcPort) || ((this.srcPort != null) && this.srcPort.equals(rhs.srcPort)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.srcByteCount == rhs.srcByteCount) || ((this.srcByteCount != null) && this.srcByteCount.equals(rhs.srcByteCount)))) && ((this.srcPackets == rhs.srcPackets) || ((this.srcPackets != null) && this.srcPackets.equals(rhs.srcPackets)))) && ((this.extensions == rhs.extensions) || ((this.extensions != null) && this.extensions.equals(rhs.extensions)))) && ((this.dstPackets == rhs.dstPackets) || ((this.dstPackets != null) && this.dstPackets.equals(rhs.dstPackets)))) && ((this.ipfix == rhs.ipfix) || ((this.ipfix != null) && this.ipfix.equals(rhs.ipfix)))) && ((this.dstPort == rhs.dstPort) || ((this.dstPort != null) && this.dstPort.equals(rhs.dstPort)))) && ((this.dstPayloadRef == rhs.dstPayloadRef) || ((this.dstPayloadRef != null) && this.dstPayloadRef.equals(rhs.dstPayloadRef)))) && ((this.end == rhs.end) || ((this.end != null) && this.end.equals(rhs.end)))) && ((this.protocols == rhs.protocols) || ((this.protocols != null) && this.protocols.equals(rhs.protocols)))) && ((this.srcRef == rhs.srcRef) || ((this.srcRef != null) && this.srcRef.equals(rhs.srcRef)))) && ((this.encapsulatesRefs == rhs.encapsulatesRefs) || ((this.encapsulatesRefs != null) && this.encapsulatesRefs.equals(rhs.encapsulatesRefs))));
    }

}
