package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName
public class Me {
	@JsonProperty("account_id") private String accountId;
	@JsonProperty("room_id") private String roomId;
	@JsonProperty("name") private String name;
	@JsonProperty("chatwork_id") private String chatworkId;
	@JsonProperty("organization_id") private String organizationId;
	@JsonProperty("organization_name") private String organizationName;
	@JsonProperty("department") private String department;
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
	@JsonProperty("avatar_image_url") private String avatarImageUrl;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChatworkId() {
		return chatworkId;
	}

	public void setChatworkId(String chatworkId) {
		this.chatworkId = chatworkId;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

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

	public String getAvatarImageUrl() {
		return avatarImageUrl;
	}

	public void setAvatarImageUrl(String avatarImageUrl) {
		this.avatarImageUrl = avatarImageUrl;
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
