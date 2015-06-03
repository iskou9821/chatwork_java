package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName
public class Me extends Contact {
	@JsonProperty("title") private String title;
	@JsonProperty("url") private String url;
	@JsonProperty("introduction") private String introduction;
	@JsonProperty("mail") private String mail;
	@JsonProperty("tel_organization") private String telOrganization;
	@JsonProperty("tel_extension") private String telExtension;
	@JsonProperty("tel_mobile") private String telMobile;
	@JsonProperty("skype") private String skype;
	@JsonProperty("facebook") private String facebook;
	@JsonProperty("twitter") private String twitter;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelOrganization() {
		return telOrganization;
	}

	public void setTelOrganization(String telOrganization) {
		this.telOrganization = telOrganization;
	}

	public String getTelMobile() {
		return telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getTelExtension() {
		return telExtension;
	}

	public void setTelExtension(String telExtension) {
		this.telExtension = telExtension;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}
}
