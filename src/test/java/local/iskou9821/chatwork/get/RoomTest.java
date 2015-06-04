package local.iskou9821.chatwork.get;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.client.PostClient;
import local.iskou9821.chatwork.model.Room;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static local.iskou9821.chatwork.util.TestTokenProvider.getToken;

public class RoomTest {

	@Test
	public void ルーム一覧を取得() throws IOException {
		for (Room item : new GetClient().list("rooms", Room.class, getToken())) {
			System.out.println(ToStringBuilder.reflectionToString(item));
		}
	}

	@Test
	public void ルームに投稿() throws IOException {
		List<Room> rooms = new GetClient().list("rooms", Room.class, getToken());
		Room mychat = null;
		for (Room room : rooms) {
			if (room.getName().equals("マイチャット")) {
				mychat = room; break;
			}
		}

		Map<String, Object> map =new HashMap<>();
		map.put("body", "テストのメッセージです");
		String res = new PostClient().send("rooms/" + mychat.getRoomId() + "/messages", map, String.class, getToken());
		System.out.println(res);
	}
}
