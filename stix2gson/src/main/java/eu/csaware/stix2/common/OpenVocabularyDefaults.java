package eu.csaware.stix2.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class OpenVocabularyDefaults {

    public static final String IDENTITY_CLASS_INDIVIDUAL = "individual";
    public static final String IDENTITY_CLASS_GROUP = "group";
    public static final String IDENTITY_CLASS_ORGANIZATION = "organization";
    public static final String IDENTITY_CLASS_CLASS = "class";
    public static final String IDENTITY_CLASS_UNKNOWN = "unknown";

    public static final String[] IDENTITY_CLASS_VOCABULARY = new String[]{
        IDENTITY_CLASS_INDIVIDUAL,
        IDENTITY_CLASS_GROUP,
        IDENTITY_CLASS_ORGANIZATION,
        IDENTITY_CLASS_CLASS,
        IDENTITY_CLASS_UNKNOWN
    };

}
