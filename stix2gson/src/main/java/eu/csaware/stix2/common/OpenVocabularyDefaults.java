package eu.csaware.stix2.common;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class OpenVocabularyDefaults {

    /**
     * A non-hostile actor whose benevolent or harmless intent inadvertently causes harm.
     * For example, a well-meaning and dedicated employee who through distraction or poor training unintentionally
     * causes harm to his or her organization.
     */
    public static final String ATTACK_MOTIVATION_ACCIDENTAL = "accidental";
    /**
     * Being forced to act on someone else's behalf.
     * Adversaries who are motivated by coercion are often forced through intimidation or blackmail to act illegally
     * for someone else’s benefit. Unlike the other motivations, a coerced person does not act for personal gain,
     * but out of fear of incurring a loss.
     */
    public static final String ATTACK_MOTIVATION_COERCION = "coercion";
    /**
     * A desire to assert superiority over someone or something else.
     * Adversaries who are seeking dominance over a target are focused on using their power to force their target
     * into submission or irrelevance. Dominance may be found with ideology in some state-sponsored attacks and with
     * notoriety in some cyber vandalism based attacks.
     */
    public static final String ATTACK_MOTIVATION_DOMINANCE = "dominance";
    /**
     * A passion to express a set of ideas, beliefs, and values that may shape and drive harmful and illegal acts.
     * Adversaries who act for ideological reasons (e.g., political, religious, human rights, environmental, desire
     * to cause chaos/anarchy, etc.) are not usually motivated primarily by the desire for profit; they are acting
     * on their own sense of morality, justice, or political loyalty.
     * For example, an activist group may sabotage a company’s equipment because they believe the company is
     * harming the environment.
     */
    public static final String ATTACK_MOTIVATION_IDEOLOGY = "ideology";
    /**
     * Seeking prestige or to become well known through some activity.
     * Adversaries motivated by notoriety are often seeking either personal validation or respect within a community
     * and staying covert is not a priority. In fact one of the main goals is to garner the respect of their target
     * audience.
     */
    public static final String ATTACK_MOTIVATION_NOTORIETY = "notoriety";
    /**
     * Seeking advantage over a competing organization, including a military organization.
     * Adversaries motivated by increased profit or other gains through an unfairly obtained competitive advantage are
     * often seeking theft of intellectual property, business processes, or supply chain agreements and thus
     * accelerating their position in a market or capability.
     */
    public static final String ATTACK_MOTIVATION_ORGANIZATIONAL_GAIN = "organizational-gain";
    /**
     * The desire to improve one’s own financial status.
     * Adversaries motivated by a selfish desire for personal gain are often out for gains that come from financial
     * fraud, hacking for hire, or intellectual property theft.
     * While a Threat Actor or Intrusion Set may be seeking personal gain this does not mean they are acting alone.
     * Individuals can band together solely to maximize their own personal profits.
     */
    public static final String ATTACK_MOTIVATION_PERSONAL_GAIN = "personal-gain";
    /**
     * A desire to satisfy a strictly personal goal, including curiosity, thrill-seeking, amusement, etc.
     * Threat Actors or Intrusion Set driven by personal satisfaction may incidentally receive some other gain from
     * their actions, such as a profit, but their primary motivation is to gratify a personal, emotional need.
     * Individuals can band together with others toward a mutual, but not necessarily organizational, objective.
     */
    public static final String ATTACK_MOTIVATION_PERSONAL_SATISFACTION = "personal-satisfaction";
    /**
     * A desire to avenge perceived wrongs through harmful actions such as sabotage, violence, theft, fraud, or
     * embarrassing certain individuals or the organization.
     * A disgruntled Threat Actor or Intrusion Set seeking revenge can include current or former employees, who may
     * have extensive knowledge to leverage when conducting attacks. Individuals can band together with others if the
     * individual believes that doing so will enable them to cause more harm.
     */
    public static final String ATTACK_MOTIVATION_REVENGE = "revenge";
    /**
     * Acting without identifiable reason or purpose and creating unpredictable events.
     * Unpredictable is not a miscellaneous or default category. Unpredictable means a truly random and likely
     * bizarre event, which seems to have no logical purpose to the victims.
     */
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
