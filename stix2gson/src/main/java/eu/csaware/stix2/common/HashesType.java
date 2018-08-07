
package eu.csaware.stix2.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * hashes
 * <p>
 * A dictionary captures a set of key/value pairs
 */

// example
// "hashes": {
//			"SHA-256": "effb46bba03f6c8aea5c653f9cf984f170dcdd3bbbe2ff6843c3e5da0e698766"
//			}

public class HashesType {

	@SerializedName("hashes")
	@Expose
	HashType hashType;

	@SerializedName("key")
	@Expose
	String key;

	/**
	 * No args constructor for use in serialization
	 */
	public HashesType() {
	}

	/**
	 * @param hashType
	 * @param key
	 */
	public HashesType (HashType hashType, String key) {
		super();
		this.hashType = hashType;
		this.key = key;
	}

	public HashType getHashType() {
		return hashType;
	}

	public void setHashType(HashType hashType) {
		this.hashType = hashType;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(HashesType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		 result = ((result * 31) + ((hashType == null) ? 0 : hashType.hashCode()));
		result = ((result * 31) + ((key == null) ? 0 : key.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof HashesType) == false) {
			return false;
		}
		HashesType rhs = ((HashesType) other);

		return (((this.hashType == rhs.hashType) || ((this.hashType != null) && this.hashType.equals(rhs.hashType))) &&
		((this.key == rhs.key)|| ((this.key != null) && this.key.equals(rhs.key))));
	}
}
