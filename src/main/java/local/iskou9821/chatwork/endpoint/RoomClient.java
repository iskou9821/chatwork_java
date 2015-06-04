package local.iskou9821.chatwork.endpoint;

import local.iskou9821.chatwork.client.PostClient;
import local.iskou9821.chatwork.model.Room;
import local.iskou9821.chatwork.token.Token;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RoomClient {
	private Token token;
	private PostClient postClient;

	public RoomClient(Token token) {
		this.token = token;
		postClient = new PostClient();
	}

	public Integer postMessage(Room room, String text) {
		Map<String, Object> map =new HashMap<>();
		map.put("body", text);
		try {
			String res = new PostClient().send(
								"rooms/" + room.getRoomId() + "/messages", map, String.class, token);
			return 0;
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
