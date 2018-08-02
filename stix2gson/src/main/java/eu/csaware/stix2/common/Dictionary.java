
package eu.csaware.stix2.common;


import java.util.HashMap;
import java.util.Map;

/**
 * dictionary
 * <p>
 * A dictionary captures a set of key/value pairs
 */
public class Dictionary {

	private Map<String, Object> map;

	public Dictionary() {
		this.map = new HashMap<>();
	}

	public Dictionary(Map<String, Object> map) {
		this.map = map;
	}

	public Map<String, Object> getMap () {
		return map;
	}

	public void add(String key, Object value) {
		map.putIfAbsent(key, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Dictionary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		result = (result * 31) + map.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Dictionary) == false) {
			return false;
		}
		Dictionary rhs = ((Dictionary) other);
		return true;
	}

}
