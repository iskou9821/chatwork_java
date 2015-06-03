package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName
public class Room {
	@JsonProperty("room_id") private String roomId;
	@JsonProperty("name") private String name;
	@JsonProperty("type") private String type;
	@JsonProperty("role") private String role;
	@JsonProperty("sticky") private Boolean sticky;
	@JsonProperty("unread_num") private Integer unreadNum;
	@JsonProperty("mention_num") private Integer mentionNum;
	@JsonProperty("mytask_num") private Integer mytaskNum;
	@JsonProperty("message_num") private Integer messageNum;
	@JsonProperty("file_num") private Integer fileNum;
	@JsonProperty("task_num") private Integer taskNum;
	@JsonProperty("icon_path") private String iconPath;
	@JsonProperty("last_update_time") private Long lastUpdateTime;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getSticky() {
		return sticky;
	}

	public void setSticky(Boolean sticky) {
		this.sticky = sticky;
	}

	public Integer getUnreadNum() {
		return unreadNum;
	}

	public void setUnreadNum(Integer unreadNum) {
		this.unreadNum = unreadNum;
	}

	public Integer getMentionNum() {
		return mentionNum;
	}

	public void setMentionNum(Integer mentionNum) {
		this.mentionNum = mentionNum;
	}

	public Integer getMytaskNum() {
		return mytaskNum;
	}

	public void setMytaskNum(Integer mytaskNum) {
		this.mytaskNum = mytaskNum;
	}

	public Integer getMessageNum() {
		return messageNum;
	}

	public void setMessageNum(Integer messageNum) {
		this.messageNum = messageNum;
	}

	public Integer getFileNum() {
		return fileNum;
	}

	public void setFileNum(Integer fileNum) {
		this.fileNum = fileNum;
	}

	public Integer getTaskNum() {
		return taskNum;
	}

	public void setTaskNum(Integer taskNum) {
		this.taskNum = taskNum;
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public Long getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}
