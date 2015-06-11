package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName
public class MyTask {
	@JsonProperty("task_id") private String taskId;
	@JsonProperty("message_id") private String messageId;
	@JsonProperty("body") private String body;
	@JsonProperty("limit_time") private Long limitTime;
	@JsonProperty("status") private String status;

	@JsonProperty("room") private MyTaskRoom room;
	@JsonProperty("assigned_by_account") private Account assignedBy;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getLimitTime() {
		return limitTime;
	}

	public void setLimitTime(Long limitTime) {
		this.limitTime = limitTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MyTaskRoom getRoom() {
		return room;
	}

	public void setRoom(MyTaskRoom room) {
		this.room = room;
	}

	public Account getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(Account assignedBy) {
		this.assignedBy = assignedBy;
	}
}
