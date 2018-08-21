
package eu.csaware.stix2.common;

import javax.validation.constraints.NotNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * kill-chain-phase
 * <p>
 * The kill-chain-phase represents a phase in a kill chain.
 */
public class KillChainPhase {

    /**
     * The name of the kill chain.
     * (Required)
     */
    @SerializedName("kill_chain_name")
    @Expose
    @NotNull
    private String killChainName;
    /**
     * The name of the phase in the kill chain.
     * (Required)
     */
    @SerializedName("phase_name")
    @Expose
    @NotNull
    private String phaseName;

    /**
     * No args constructor for use in serialization
     */
    public KillChainPhase() {
    }

    public KillChainPhase(String killChainName, String phaseName) {
        super();
        this.killChainName = killChainName;
        this.phaseName = phaseName;
    }

    /**
     * The name of the kill chain.
     * (Required)
     */
    public String getKillChainName() {
        return killChainName;
    }

    /**
     * The name of the kill chain.
     * (Required)
     */
    public void setKillChainName(String killChainName) {
        this.killChainName = killChainName;
    }

    /**
     * The name of the phase in the kill chain.
     * (Required)
     */
    public String getPhaseName() {
        return phaseName;
    }

    /**
     * The name of the phase in the kill chain.
     * (Required)
     */
    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KillChainPhase.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("killChainName");
        sb.append('=');
        sb.append(((this.killChainName == null) ? "<null>" : this.killChainName));
        sb.append(',');
        sb.append("phaseName");
        sb.append('=');
        sb.append(((this.phaseName == null) ? "<null>" : this.phaseName));
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
        result = ((result * 31) + ((this.killChainName == null) ? 0 : this.killChainName.hashCode()));
        result = ((result * 31) + ((this.phaseName == null) ? 0 : this.phaseName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KillChainPhase) == false) {
            return false;
        }
        KillChainPhase rhs = ((KillChainPhase) other);
        return (((this.killChainName == rhs.killChainName) || ((this.killChainName != null) && this.killChainName.equals(rhs.killChainName))) && ((this.phaseName == rhs.phaseName) || ((this.phaseName != null) && this.phaseName.equals(rhs.phaseName))));
    }

}
