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

    public static final String[] ATTACK_MOTIVATION_VOCABULARY = new String[] {
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

    public static final String[] ATTACK_RESOURCE_LEVEL_VOCABULARY = new String[] {
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

    public static final String[] IDENTITY_CLASS_VOCABULARY = new String[] {
        IDENTITY_CLASS_INDIVIDUAL,
        IDENTITY_CLASS_GROUP,
        IDENTITY_CLASS_ORGANIZATION,
        IDENTITY_CLASS_CLASS,
        IDENTITY_CLASS_UNKNOWN
    };

    public static final String INDICATOR_LABEL_ANOMALOUS_ACTIVITY = "anomalous-activity";
    public static final String INDICATOR_LABEL_ANONYMIZATION = "anonymization";
    public static final String INDICATOR_LABEL_BENIGN = "benign";
    public static final String INDICATOR_LABEL_COMPROMISED = "compromised";
    public static final String INDICATOR_LABEL_MALICIOUS_ACTIVITY = "malicious-activity";
    public static final String INDICATOR_LABEL_ATTRIBUTION = "attribution";

    public static final String[] INDICATOR_LABEL_VOCABULARY = new String[] {
        INDICATOR_LABEL_ANOMALOUS_ACTIVITY,
        INDICATOR_LABEL_ANONYMIZATION,
        INDICATOR_LABEL_BENIGN,
        INDICATOR_LABEL_COMPROMISED,
        INDICATOR_LABEL_MALICIOUS_ACTIVITY,
        INDICATOR_LABEL_ATTRIBUTION
    };

    public static final String INDUSTRY_SECTOR_AGRICULTURE = "agriculture";
    public static final String INDUSTRY_SECTOR_AEROSPACE = "aerospace";
    public static final String INDUSTRY_SECTOR_AUTOMOTIVE = "automotive";
    public static final String INDUSTRY_SECTOR_COMMUNICATIONS = "communications";
    public static final String INDUSTRY_SECTOR_CONSTRUCTION = "construction";
    public static final String INDUSTRY_SECTOR_DEFENCE = "defence";
    public static final String INDUSTRY_SECTOR_EDUCATION = "education";
    public static final String INDUSTRY_SECTOR_ENERGY = "energy";
    public static final String INDUSTRY_SECTOR_ENTERTAINMENT = "entertainment";
    public static final String INDUSTRY_SECTOR_FINANCIAL_SERVICES = "financial-services";
    public static final String INDUSTRY_SECTOR_GOVERNMENT_NATIONAL = "government-national";
    public static final String INDUSTRY_SECTOR_GOVERNMENT_REGIONAL = "government-regional";
    public static final String INDUSTRY_SECTOR_GOVERNMENT_LOCAL = "government-local";
    public static final String INDUSTRY_SECTOR_GOVERNMENT_PUBLIC_SERVICES = "government-public-services";
    public static final String INDUSTRY_SECTOR_HEALTHCARE = "healthcare";
    public static final String INDUSTRY_SECTOR_HOSPITALITY_LEISURE = "hospitality-leisure";
    public static final String INDUSTRY_SECTOR_INFRASTRUCTURE = "infrastructure";
    public static final String INDUSTRY_SECTOR_INSURANCE = "insurance";
    public static final String INDUSTRY_SECTOR_MANUFACTURING = "manufacturing";
    public static final String INDUSTRY_SECTOR_MINING = "mining";
    public static final String INDUSTRY_SECTOR_NON_PROFIT = "non-profit";
    public static final String INDUSTRY_SECTOR_PHARMACEUTICALS = "pharmaceuticals";
    public static final String INDUSTRY_SECTOR_RETAIL = "retail";
    public static final String INDUSTRY_SECTOR_TECHNOLOGY = "technology";
    public static final String INDUSTRY_SECTOR_TELECOMMUNICATIONS = "telecommunications";
    public static final String INDUSTRY_SECTOR_TRANSPORTATION = "transportation";
    public static final String INDUSTRY_SECTOR_UTILITIES = "utilities";

    public static final String[] INDUSTRY_SECTOR_VOCABULARY = new String[] {
        INDUSTRY_SECTOR_AGRICULTURE,
        INDUSTRY_SECTOR_AEROSPACE,
        INDUSTRY_SECTOR_AUTOMOTIVE,
        INDUSTRY_SECTOR_COMMUNICATIONS,
        INDUSTRY_SECTOR_CONSTRUCTION,
        INDUSTRY_SECTOR_DEFENCE,
        INDUSTRY_SECTOR_EDUCATION,
        INDUSTRY_SECTOR_ENERGY,
        INDUSTRY_SECTOR_ENTERTAINMENT,
        INDUSTRY_SECTOR_FINANCIAL_SERVICES,
        INDUSTRY_SECTOR_GOVERNMENT_NATIONAL,
        INDUSTRY_SECTOR_GOVERNMENT_REGIONAL,
        INDUSTRY_SECTOR_GOVERNMENT_LOCAL,
        INDUSTRY_SECTOR_GOVERNMENT_PUBLIC_SERVICES,
        INDUSTRY_SECTOR_HEALTHCARE,
        INDUSTRY_SECTOR_HOSPITALITY_LEISURE,
        INDUSTRY_SECTOR_INFRASTRUCTURE,
        INDUSTRY_SECTOR_INSURANCE,
        INDUSTRY_SECTOR_MANUFACTURING,
        INDUSTRY_SECTOR_MINING,
        INDUSTRY_SECTOR_NON_PROFIT,
        INDUSTRY_SECTOR_PHARMACEUTICALS,
        INDUSTRY_SECTOR_RETAIL,
        INDUSTRY_SECTOR_TECHNOLOGY,
        INDUSTRY_SECTOR_TELECOMMUNICATIONS,
        INDUSTRY_SECTOR_TRANSPORTATION,
        INDUSTRY_SECTOR_UTILITIES
    };

}
