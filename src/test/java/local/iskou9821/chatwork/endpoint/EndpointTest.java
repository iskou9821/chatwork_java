package local.iskou9821.chatwork.endpoint;

import local.iskou9821.chatwork.model.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Before;
import org.junit.Test;

import static local.iskou9821.chatwork.util.TestTokenProvider.getTokenProvider;

public class EndpointTest {
	private ClientFactory factory = null;

	@Before
	public void setup() {
		if (factory == null) {
			factory = new ClientFactory(getTokenProvider());
		}
	}

	@Test
	public void 自分の情報を取得() {
		Me me = factory.create(MyInfoClient.class).getMe();
		System.out.println(ToStringBuilder.reflectionToString(me));
	}

	@Test
	public void 自分のステータスを取得() {
		MyStatus sts = factory.create(MyInfoClient.class).getMyStatus();
		System.out.println(ToStringBuilder.reflectionToString(sts));
	}

	@Test
	public void タスクリストを取得() {
		for (MyTask c : factory.create(MyInfoClient.class).getMyTaskList()) {
			System.out.println(ToStringBuilder.reflectionToString(c));
		}
	}

	@Test
	public void コンタクトリストを取得() {
		for (Contact c : factory.create(MyInfoClient.class).getContactList()) {
			System.out.println(ToStringBuilder.reflectionToString(c));
		}
	}

	@Test
	public void ルームに投稿() {
		MessagePostResult r = factory.create(RoomClient.class).postMessage(getMyChat(), "Test Message");
		System.out.println(ToStringBuilder.reflectionToString(r));
	}


	@Test
	public void ルームのメッセージを取得() {
		for (Message c : factory.create(RoomClient.class).getMessageList(getMyChat())) {
			System.out.println(ToStringBuilder.reflectionToString(c));
		}
	}


	private Room getMyChat() {
		Room mychat = null;
		for (Room r : factory.create(MyInfoClient.class).getRoomList()) {
			if (r.getName().equals("マイチャット")) {
				mychat = r;
				break;
			}
		}
		return mychat;
	}
}
