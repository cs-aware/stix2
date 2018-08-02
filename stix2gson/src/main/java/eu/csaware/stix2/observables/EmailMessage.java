
package eu.csaware.stix2.observables;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import eu.csaware.stix2.common.CyberObservableCore;
import eu.csaware.stix2.common.Dictionary;
import eu.csaware.stix2.common.Types;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;


/**
 * email-message
 * <p>
 * The Email Message Object represents an instance of an email message.
 */
public class EmailMessage
		  extends CyberObservableCore {

	/**
	 * The value of this property MUST be `email-message`.
	 */
	@SerializedName("type")
	@Expose
	@Pattern(regexp = Types.EMAIL_MESSAGE_TYPE)
	private String type = Types.EMAIL_MESSAGE_TYPE;
	/**
	 * timestamp
	 * <p>
	 * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
	 */
	@SerializedName("date")
	@Expose
	@Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])T([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9]|60)(\\.[0-9]+)?Z$")
	private String date;
	/**
	 * Specifies the value of the 'Content-Type' header of the email message.
	 */
	@SerializedName("content_type")
	@Expose
	private String contentType;
	/**
	 * Specifies the value of the 'From:' header of the email message.
	 */
	@SerializedName("from_ref")
	@Expose
	private String fromRef;
	/**
	 * Specifies the value of the 'From' field of the email message
	 */
	@SerializedName("sender_ref")
	@Expose
	private String senderRef;
	/**
	 * Specifies the mailboxes that are 'To:' recipients of the email message
	 */
	@SerializedName("to_refs")
	@Expose
	@Valid
	private List<String> toRefs = new ArrayList<String>();
	/**
	 * Specifies the mailboxes that are 'CC:' recipients of the email message
	 */
	@SerializedName("cc_refs")
	@Expose
	@Valid
	private List<String> ccRefs = new ArrayList<String>();
	/**
	 * Specifies the mailboxes that are 'BCC:' recipients of the email message.
	 */
	@SerializedName("bcc_refs")
	@Expose
	@Valid
	private List<String> bccRefs = new ArrayList<String>();
	/**
	 * Specifies the subject of the email message.
	 */
	@SerializedName("subject")
	@Expose
	private String subject;
	/**
	 * Specifies one or more Received header fields that may be included in the email headers.
	 */
	@SerializedName("received_lines")
	@Expose
	@Valid
	private List<String> receivedLines = new ArrayList<String>();
	/**
	 * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
	 */
	@SerializedName("additional_header_fields")
	@Expose
	@Valid
	private EmailAdditionalHeaderFields additionalHeaderFields;
	/**
	 * Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.
	 */
	@SerializedName("raw_email_ref")
	@Expose
	private String rawEmailRef;

	/**
	 * No args constructor for use in serialization
	 */
	public EmailMessage() {
	}

	/**
	 * @param date
	 * @param subject
	 * @param additionalHeaderFields
	 * @param ccRefs
	 * @param type
	 * @param rawEmailRef
	 * @param toRefs
	 * @param bccRefs
	 * @param receivedLines
	 * @param extensions
	 * @param senderRef
	 * @param fromRef
	 * @param contentType
	 */
	public EmailMessage(String type, String date, String contentType, String fromRef, String senderRef, List<String> toRefs, List<String> ccRefs, List<String> bccRefs, String subject, List<String> receivedLines, EmailAdditionalHeaderFields additionalHeaderFields, String rawEmailRef, Dictionary extensions) {
		super(extensions);
		if (!type.equals(Types.EMAIL_MESSAGE_TYPE)) {
			type = Types.EMAIL_MESSAGE_TYPE;
		}
		this.type = type;
		this.date = date;
		this.contentType = contentType;
		this.fromRef = fromRef;
		this.senderRef = senderRef;
		this.toRefs = toRefs;
		this.ccRefs = ccRefs;
		this.bccRefs = bccRefs;
		this.subject = subject;
		this.receivedLines = receivedLines;
		this.additionalHeaderFields = additionalHeaderFields;
		this.rawEmailRef = rawEmailRef;
	}

	/**
	 * The value of this property MUST be `email-message`.
	 */
	public String getType() {
		return type;
	}

	/**
	 * The value of this property MUST be `email-message`.
	 */
	public void setType(String type) {
		if (!type.equals(Types.EMAIL_MESSAGE_TYPE)) {
			type = Types.EMAIL_MESSAGE_TYPE;
		}
		this.type = type;
	}

	/**
	 * timestamp
	 * <p>
	 * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * timestamp
	 * <p>
	 * Represents timestamps across the CTI specifications. The format is an RFC3339 timestamp, with a required timezone specification of 'Z'.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Specifies the value of the 'Content-Type' header of the email message.
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * Specifies the value of the 'Content-Type' header of the email message.
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * Specifies the value of the 'From:' header of the email message.
	 */
	public String getFromRef() {
		return fromRef;
	}

	/**
	 * Specifies the value of the 'From:' header of the email message.
	 */
	public void setFromRef(String fromRef) {
		this.fromRef = fromRef;
	}

	/**
	 * Specifies the value of the 'From' field of the email message
	 */
	public String getSenderRef() {
		return senderRef;
	}

	/**
	 * Specifies the value of the 'From' field of the email message
	 */
	public void setSenderRef(String senderRef) {
		this.senderRef = senderRef;
	}

	/**
	 * Specifies the mailboxes that are 'To:' recipients of the email message
	 */
	public List<String> getToRefs() {
		return toRefs;
	}

	/**
	 * Specifies the mailboxes that are 'To:' recipients of the email message
	 */
	public void setToRefs(List<String> toRefs) {
		this.toRefs = toRefs;
	}

	/**
	 * Specifies the mailboxes that are 'CC:' recipients of the email message
	 */
	public List<String> getCcRefs() {
		return ccRefs;
	}

	/**
	 * Specifies the mailboxes that are 'CC:' recipients of the email message
	 */
	public void setCcRefs(List<String> ccRefs) {
		this.ccRefs = ccRefs;
	}

	/**
	 * Specifies the mailboxes that are 'BCC:' recipients of the email message.
	 */
	public List<String> getBccRefs() {
		return bccRefs;
	}

	/**
	 * Specifies the mailboxes that are 'BCC:' recipients of the email message.
	 */
	public void setBccRefs(List<String> bccRefs) {
		this.bccRefs = bccRefs;
	}

	/**
	 * Specifies the subject of the email message.
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Specifies the subject of the email message.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Specifies one or more Received header fields that may be included in the email headers.
	 */
	public List<String> getReceivedLines() {
		return receivedLines;
	}

	/**
	 * Specifies one or more Received header fields that may be included in the email headers.
	 */
	public void setReceivedLines(List<String> receivedLines) {
		this.receivedLines = receivedLines;
	}

	/**
	 * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
	 */
	public EmailAdditionalHeaderFields getAdditionalHeaderFields() {
		return additionalHeaderFields;
	}

	/**
	 * Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary.
	 */
	public void setAdditionalHeaderFields(EmailAdditionalHeaderFields additionalHeaderFields) {
		this.additionalHeaderFields = additionalHeaderFields;
	}

	/**
	 * Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.
	 */
	public String getRawEmailRef() {
		return rawEmailRef;
	}

	/**
	 * Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact Object.
	 */
	public void setRawEmailRef(String rawEmailRef) {
		this.rawEmailRef = rawEmailRef;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(EmailMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		sb.append("date");
		sb.append('=');
		sb.append(((this.date == null) ? "<null>" : this.date));
		sb.append(',');
		sb.append("contentType");
		sb.append('=');
		sb.append(((this.contentType == null) ? "<null>" : this.contentType));
		sb.append(',');
		sb.append("fromRef");
		sb.append('=');
		sb.append(((this.fromRef == null) ? "<null>" : this.fromRef));
		sb.append(',');
		sb.append("senderRef");
		sb.append('=');
		sb.append(((this.senderRef == null) ? "<null>" : this.senderRef));
		sb.append(',');
		sb.append("toRefs");
		sb.append('=');
		sb.append(((this.toRefs == null) ? "<null>" : this.toRefs));
		sb.append(',');
		sb.append("ccRefs");
		sb.append('=');
		sb.append(((this.ccRefs == null) ? "<null>" : this.ccRefs));
		sb.append(',');
		sb.append("bccRefs");
		sb.append('=');
		sb.append(((this.bccRefs == null) ? "<null>" : this.bccRefs));
		sb.append(',');
		sb.append("subject");
		sb.append('=');
		sb.append(((this.subject == null) ? "<null>" : this.subject));
		sb.append(',');
		sb.append("receivedLines");
		sb.append('=');
		sb.append(((this.receivedLines == null) ? "<null>" : this.receivedLines));
		sb.append(',');
		sb.append("additionalHeaderFields");
		sb.append('=');
		sb.append(((this.additionalHeaderFields == null) ? "<null>" : this.additionalHeaderFields));
		sb.append(',');
		sb.append("rawEmailRef");
		sb.append('=');
		sb.append(((this.rawEmailRef == null) ? "<null>" : this.rawEmailRef));
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
		result = ((result * 31) + ((this.date == null) ? 0 : this.date.hashCode()));
		result = ((result * 31) + ((this.subject == null) ? 0 : this.subject.hashCode()));
		result = ((result * 31) + ((this.additionalHeaderFields == null) ? 0 : this.additionalHeaderFields.hashCode()));
		result = ((result * 31) + ((this.ccRefs == null) ? 0 : this.ccRefs.hashCode()));
		result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
		result = ((result * 31) + ((this.rawEmailRef == null) ? 0 : this.rawEmailRef.hashCode()));
		result = ((result * 31) + ((this.toRefs == null) ? 0 : this.toRefs.hashCode()));
		result = ((result * 31) + ((this.bccRefs == null) ? 0 : this.bccRefs.hashCode()));
		result = ((result * 31) + ((this.receivedLines == null) ? 0 : this.receivedLines.hashCode()));
		result = ((result * 31) + ((this.senderRef == null) ? 0 : this.senderRef.hashCode()));
		result = ((result * 31) + ((this.fromRef == null) ? 0 : this.fromRef.hashCode()));
		result = ((result * 31) + ((this.contentType == null) ? 0 : this.contentType.hashCode()));
		result = ((result * 31) + super.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof EmailMessage) == false) {
			return false;
		}
		EmailMessage rhs = ((EmailMessage) other);
		return ((((((((((((super.equals(rhs) && ((this.date == rhs.date) || ((this.date != null) && this.date.equals(rhs.date)))) && ((this.subject == rhs.subject) || ((this.subject != null) && this.subject.equals(rhs.subject)))) && ((this.additionalHeaderFields == rhs.additionalHeaderFields) || ((this.additionalHeaderFields != null) && this.additionalHeaderFields.equals(rhs.additionalHeaderFields)))) && ((this.ccRefs == rhs.ccRefs) || ((this.ccRefs != null) && this.ccRefs.equals(rhs.ccRefs)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.rawEmailRef == rhs.rawEmailRef) || ((this.rawEmailRef != null) && this.rawEmailRef.equals(rhs.rawEmailRef)))) && ((this.toRefs == rhs.toRefs) || ((this.toRefs != null) && this.toRefs.equals(rhs.toRefs)))) && ((this.bccRefs == rhs.bccRefs) || ((this.bccRefs != null) && this.bccRefs.equals(rhs.bccRefs)))) && ((this.receivedLines == rhs.receivedLines) || ((this.receivedLines != null) && this.receivedLines.equals(rhs.receivedLines)))) && ((this.senderRef == rhs.senderRef) || ((this.senderRef != null) && this.senderRef.equals(rhs.senderRef)))) && ((this.fromRef == rhs.fromRef) || ((this.fromRef != null) && this.fromRef.equals(rhs.fromRef)))) && ((this.contentType == rhs.contentType) || ((this.contentType != null) && this.contentType.equals(rhs.contentType))));
	}

}
