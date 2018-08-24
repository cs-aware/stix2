package eu.csaware.stix2.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class OpenVocabularyDefaults {



    public static final String ATTACK_MOTIVATION_ACCIDENTAL = "accidental";
    public static final String ATTACK_MOTIVATION_COERCION = "coercion";
    public static final String ATTACK_MOTIVATION_DOMINANCE = "dominance";
    public static final String ATTACK_MOTIVATION_IDEOLOGY = "ideology";
    public static final String ATTACK_MOTIVATION_NOTORIETY = "notoriety";
    public static final String ATTACK_MOTIVATION_ORGANIZATIONAL_GAIN = "organizational-gain";
    public static final String ATTACK_MOTIVATION_PERSONAL_GAIN = "personal-gain";
    public static final String ATTACK_MOTIVATION_PERSONAL_SATISFACTION = "personal-satisfaction";
    public static final String ATTACK_MOTIVATION_REVENGE = "revenge";
    public static final String ATTACK_MOTIVATION_UNPREDICTABLE = "unpredictable";

    public static final String[] ATTACK_MOTIVATION_VOCABULARY = new String[]{
        ATTACK_MOTIVATION_ACCIDENTAL,
        ATTACK_MOTIVATION_COERCION,
        ATTACK_MOTIVATION_DOMINANCE,
        ATTACK_MOTIVATION_IDEOLOGY,
        ATTACK_MOTIVATION_NOTORIETY,
        ATTACK_MOTIVATION_ORGANIZATIONAL_GAIN,
        ATTACK_MOTIVATION_PERSONAL_GAIN,
        ATTACK_MOTIVATION_PERSONAL_SATISFACTION,
        ATTACK_MOTIVATION_REVENGE,
        ATTACK_MOTIVATION_UNPREDICTABLE
    };

    public static final String ATTACK_RESOURCE_LEVEL_INDIVIDUAL = "individual";
    public static final String ATTACK_RESOURCE_LEVEL_CLUB = "club";
    public static final String ATTACK_RESOURCE_LEVEL_CONTEST = "contest";
    public static final String ATTACK_RESOURCE_LEVEL_TEAM = "team";
    public static final String ATTACK_RESOURCE_LEVEL_ORGANIZATION = "organization";
    public static final String ATTACK_RESOURCE_LEVEL_GOVERNMENT = "government";

    public static final String[] ATTACK_RESOURCE_LEVEL_VOCABULARY = new String[]{
        ATTACK_RESOURCE_LEVEL_INDIVIDUAL,
        ATTACK_RESOURCE_LEVEL_CLUB,
        ATTACK_RESOURCE_LEVEL_CONTEST,
        ATTACK_RESOURCE_LEVEL_TEAM,
        ATTACK_RESOURCE_LEVEL_ORGANIZATION,
        ATTACK_RESOURCE_LEVEL_GOVERNMENT
    };

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
