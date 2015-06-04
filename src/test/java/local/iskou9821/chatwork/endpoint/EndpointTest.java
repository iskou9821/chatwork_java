package local.iskou9821.chatwork.endpoint;

import local.iskou9821.chatwork.model.Contact;
import local.iskou9821.chatwork.model.Me;
import local.iskou9821.chatwork.model.Room;
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
	public void コンタクトリストを取得() {
		for (Contact c : factory.create(MyInfoClient.class).getContactList()) {
			System.out.println(ToStringBuilder.reflectionToString(c));
		}
	}

	@Test
	public void ルームに投稿() {
		Room mychat = null;
		for (Room r : factory.create(MyInfoClient.class).getRoomList()) {
			if (r.getName().equals("マイチャット")) {
				mychat = r;
				break;
			}
		}
		factory.create(RoomClient.class).postMessage(mychat, "Test Message");
	}

}
