package local.iskou9821.chatwork.get;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.model.Room;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static local.iskou9821.chatwork.util.TestTokenProvider.getToken;

public class RoomTest {

	@Test
	public void ルーム一覧を取得() throws IOException {
		GetClient client = new GetClient();
		List<Room> items = client.list("rooms", Room.class, getToken());
		for (Room item : items) {
			System.out.println(ToStringBuilder.reflectionToString(item));
		}
	}

}
