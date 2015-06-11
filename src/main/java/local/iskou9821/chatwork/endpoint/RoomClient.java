package local.iskou9821.chatwork.endpoint;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.client.PostClient;
import local.iskou9821.chatwork.model.Message;
import local.iskou9821.chatwork.model.MessagePostResult;
import local.iskou9821.chatwork.model.Room;
import local.iskou9821.chatwork.token.Token;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomClient {
	private Token token;
	private PostClient postClient;
	private GetClient getClient;

	public RoomClient(Token token) {
		this.token = token;
		postClient = new PostClient();
		getClient = new GetClient();
	}

	public List<Message> getMessageList(Room room) {
		try {
			return getClient.list("rooms/" +room.getRoomId() + "/messages", Message.class, token);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	public MessagePostResult postMessage(Room room, String text) {
		Map<String, Object> map =new HashMap<>();
		map.put("body", text);
		try {
			return postClient.send(
					"rooms/" + room.getRoomId() + "/messages", map, MessagePostResult.class, token);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
