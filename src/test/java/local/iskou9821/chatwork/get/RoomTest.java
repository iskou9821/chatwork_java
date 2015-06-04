package local.iskou9821.chatwork.get;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.model.Room;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import java.io.IOException;

import static local.iskou9821.chatwork.util.TestTokenProvider.getToken;

public class RoomTest {

	@Test
	public void ルーム一覧を取得() throws IOException {
		for (Room item : new GetClient().list("rooms", Room.class, getToken())) {
			System.out.println(ToStringBuilder.reflectionToString(item));
		}
	}

}
