
package eu.csaware.stix2.observables;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindowsRegistryValueType {

    /**
     * Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.
     * (Required)
     */
    @SerializedName("name")
    @Expose
    @NotNull
    private String name;
    /**
     * Specifies the data contained in the registry value.
     */
    @SerializedName("data")
    @Expose
    private String data;
    /**
     * Specifies the registry (REG_*) data type used in the registry value.
     */
    @SerializedName("data_type")
    @Expose
    private DataType dataType;

    /**
     * No args constructor for use in serialization
     */
    public WindowsRegistryValueType() {
    }

    /**
     * @param data
     * @param dataType
     * @param name
     */
    public WindowsRegistryValueType(String name, String data, DataType dataType) {
        super();
        this.name = name;
        this.data = data;
        this.dataType = dataType;
    }

    /**
     * Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used.
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the data contained in the registry value.
     */
    public String getData() {
        return data;
    }

    /**
     * Specifies the data contained in the registry value.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Specifies the registry (REG_*) data type used in the registry value.
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Specifies the registry (REG_*) data type used in the registry value.
     */
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WindowsRegistryValueType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null) ? "<null>" : this.data));
        sb.append(',');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null) ? "<null>" : this.dataType));
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
        result = ((result * 31) + ((this.data == null) ? 0 : this.data.hashCode()));
        result = ((result * 31) + ((this.dataType == null) ? 0 : this.dataType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WindowsRegistryValueType) == false) {
            return false;
        }
        WindowsRegistryValueType rhs = ((WindowsRegistryValueType) other);
        return ((((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name))) && ((this.data == rhs.data) || ((this.data != null) && this.data.equals(rhs.data)))) && ((this.dataType == rhs.dataType) || ((this.dataType != null) && this.dataType.equals(rhs.dataType))));
    }

    public enum DataType {

        @SerializedName("REG_NONE")
        REG_NONE("REG_NONE"),
        @SerializedName("REG_SZ")
        REG_SZ("REG_SZ"),
        @SerializedName("REG_EXPAND_SZ")
        REG_EXPAND_SZ("REG_EXPAND_SZ"),
        @SerializedName("REG_BINARY")
        REG_BINARY("REG_BINARY"),
        @SerializedName("REG_DWORD")
        REG_DWORD("REG_DWORD"),
        @SerializedName("REG_DWORD_BIG_ENDIAN")
        REG_DWORD_BIG_ENDIAN("REG_DWORD_BIG_ENDIAN"),
        @SerializedName("REG_LINK")
        REG_LINK("REG_LINK"),
        @SerializedName("REG_MULTI_SZ")
        REG_MULTI_SZ("REG_MULTI_SZ"),
        @SerializedName("REG_RESOURCE_LIST")
        REG_RESOURCE_LIST("REG_RESOURCE_LIST"),
        @SerializedName("REG_FULL_RESOURCE_DESCRIPTION")
        REG_FULL_RESOURCE_DESCRIPTION("REG_FULL_RESOURCE_DESCRIPTION"),
        @SerializedName("REG_RESOURCE_REQUIREMENTS_LIST")
        REG_RESOURCE_REQUIREMENTS_LIST("REG_RESOURCE_REQUIREMENTS_LIST"),
        @SerializedName("REG_QWORD")
        REG_QWORD("REG_QWORD"),
        @SerializedName("REG_INVALID_TYPE")
        REG_INVALID_TYPE("REG_INVALID_TYPE");
        private final String value;
        private final static Map<String, DataType> CONSTANTS = new HashMap<String, DataType>();

        static {
            for (DataType c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DataType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static DataType fromValue(String value) {
            DataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
