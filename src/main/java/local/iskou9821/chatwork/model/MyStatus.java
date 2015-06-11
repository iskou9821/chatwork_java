package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName
public class MyStatus {
	@JsonProperty("unread_room_num") private Integer unreadRoomNum;
	@JsonProperty("mention_room_num") private Integer mentionRoomNum;
	@JsonProperty("mytask_room_num") private Integer mytaskRoomNum;
	@JsonProperty("unread_num") private Integer unreadNum;
	@JsonProperty("mention_num") private Integer mentionNum;
	@JsonProperty("mytask_num") private Integer mytaskNum;

	public Integer getUnreadRoomNum() {
		return unreadRoomNum;
	}

	public void setUnreadRoomNum(Integer unreadRoomNum) {
		this.unreadRoomNum = unreadRoomNum;
	}

	public Integer getMentionRoomNum() {
		return mentionRoomNum;
	}

	public void setMentionRoomNum(Integer mentionRoomNum) {
		this.mentionRoomNum = mentionRoomNum;
	}

	public Integer getMytaskRoomNum() {
		return mytaskRoomNum;
	}

	public void setMytaskRoomNum(Integer mytaskRoomNum) {
		this.mytaskRoomNum = mytaskRoomNum;
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
}
