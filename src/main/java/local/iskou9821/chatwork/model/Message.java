package local.iskou9821.chatwork.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Message {
	@JsonProperty("message_id") private String messageId;
	@JsonProperty("account") private Account account;
	@JsonProperty("body") private String body;
	@JsonProperty("send_time") private Long sendTime;
	@JsonProperty("update_time") private Long updateTime;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getSendTime() {
		return sendTime;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
}
