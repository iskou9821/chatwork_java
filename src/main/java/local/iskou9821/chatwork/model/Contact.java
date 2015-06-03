package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName
public class Contact {
	@JsonProperty("account_id") private String accountId;
	@JsonProperty("room_id") private String roomId;
	@JsonProperty("name") private String name;
	@JsonProperty("chatwork_id") private String chatworkId;
	@JsonProperty("organization_id") private String organizationId;
	@JsonProperty("organization_name") private String organizationName;
	@JsonProperty("department") private String department;
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

	public String getAvatarImageUrl() {
		return avatarImageUrl;
	}

	public void setAvatarImageUrl(String avatarImageUrl) {
		this.avatarImageUrl = avatarImageUrl;
	}
}
