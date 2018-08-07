package eu.csaware.stix2.common;

import org.jetbrains.annotations.Contract;

public enum HashType {

	MD5("MD5", "^MD5$", "^[a-fA-F0-9]{32}$", "Specifies the MD5 message digest algorithm."),
	MD6("MD6", "^MD6$", "^[a-fA-F0-9]{32}|[a-fA-F0-9]{40}|[a-fA-F0-9]{56}|[a-fA-F0-9]{64}|[a-fA-F0-9]{96}|[a-fA-F0-9]{128}$", "Specifies the MD6 message digest algorithm."),
	RIPEMD160("RIPEMD-160", "^RIPEMD-160$", "^[a-fA-F0-9]{40}$", "Specifies the RIPEMD\u00ad-160 (R​ACE​ Integrity Primitives Evaluation Message Digest)​ cryptographic hash function."),
	SHA1("SHA-1", "^SHA-1$", "^[a-fA-F0-9]{40}$", "Specifies the SHA-1 (secure-hash algorithm 1) cryptographic hash function."),
	SHA224("SHA-224", "^SHA-224$", "^[a-fA-F0-9]{56}$", "Specifies the SHA-224 cryptographic hash function (part of the SHA2 family)."),
	SHA256("SHA-256", "^SHA-256$", "^[a-fA-F0-9]{64}$", "Specifies the SHA-256 cryptographic hash function (part of the SHA2 family)."),
	SHA384("SHA-384", "^SHA-384$", "^[a-fA-F0-9]{96}$", "Specifies the SHA-384 cryptographic hash function (part of the SHA2 family)."),
	SHA512("SHA-512", "^SHA-512$", "^[a-fA-F0-9]{128}$", "Specifies the SHA-512 cryptographic hash function (part of the SHA2 family)."),
	SHA3223("SHA3-224", "^SHA3-224$", "^[a-fA-F0-9]{56}$", "Specifies the SHA3-224 cryptographic hash function."),
	SHA3256("SHA3-256", "^SHA3-256$", "^[a-fA-F0-9]{64}$", "Specifies the SHA3-256 cryptographic hash function."),
	SHA3384("SHA3-384", "^SHA3-384$", "^[a-fA-F0-9]{96}$", "Specifies the SHA3-384 cryptographic hash function."),
	SHA3512("SHA3-512", "^SHA3-512$", "^[a-fA-F0-9]{128}$", "Specifies the SHA3-512 cryptographic hash function."),
	SSDEEP("ssdeep", "^ssdeep$", "^[a-zA-Z0-9/+:.]{1,128}$", "Specifies the ssdeep fuzzy hashing algorithm."),
	WHIRLPOOL("WHIRLPOOL", "^WHIRLPOOL$", "^[a-fA-F0-9]{128}$", "Specifies the whirlpool cryptographic hash function"),
	CUSTOM("CUSTOM", "*", "^[a-zA-Z0-9_-]{3,256}$", "Custom hash key");

	private final String hashName;
	private final String hashNamePattern;
	private final String hashKeyPattern;
	private final String description;

	HashType(String hashName, String hashNamePattern, String hashKeyPattern, String description) {
		this.hashName = hashName;
		this.hashNamePattern = hashNamePattern;
		this.hashKeyPattern = hashKeyPattern;
		this.description = description;
	}

	public String getHashName() {
		return this.hashName;
	}

	public String getHashNamePattern() {
		return this.hashNamePattern;
	}

	public String getHashKeyPattern() {
		return this.hashKeyPattern;
	}

	public String getDescription() {
		return this.description;
	}

	public static HashType fromHashName(String hashName) {
		for (HashType h : HashType.values()) {
			if (h.getHashName().equals(hashName)) {
				return h;
			}
		}
		return null;
	}
}
