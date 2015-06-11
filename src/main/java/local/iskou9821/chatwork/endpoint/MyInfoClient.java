package local.iskou9821.chatwork.endpoint;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.model.Contact;
import local.iskou9821.chatwork.model.Me;
import local.iskou9821.chatwork.model.MyStatus;
import local.iskou9821.chatwork.model.Room;
import local.iskou9821.chatwork.token.Token;

import java.io.IOException;
import java.util.List;

public class MyInfoClient {
	private Token token;
	private GetClient getClient;

	public MyInfoClient(Token token) {
		this.token = token;
		getClient = new GetClient();
	}

	public Me getMe() {
		try {
			return getClient.singleResult("me", Me.class, token);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	public MyStatus getMyStatus() {
		try {
			return getClient.singleResult("my/status", MyStatus.class, token);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	public List<Contact> getContactList() {
		try {
			return getClient.list("contacts", Contact.class, token);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}

	public List<Room> getRoomList() {
		try {
			return new GetClient().list("rooms", Room.class, token);
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
