package local.iskou9821.chatwork.sample;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import local.iskou9821.chatwork.token.TokenProvider;
import local.iskou9821.chatwork.token.impl.PropertyFileTokenProviderImpl;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

public class TestRoomPost {

	@Ignore
	@Test
	public void チャットルームに投稿する() {
		TokenProvider provider = new PropertyFileTokenProviderImpl("/var/conf/chatwork.properties");
		Client client = Client.create();
		String roomId = "[ルームID]";
		WebResource resource = client.resource("https://api.chatwork.com/v1/rooms/" + roomId + "/messages");

		MultivaluedMap formData = new MultivaluedMapImpl();
		formData.add("body", "テストメッセージ");
		ClientResponse res =
				resource.accept(MediaType.APPLICATION_JSON_TYPE)
						.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
						.header("X-ChatWorkToken", provider.getToken().getValue())
						.post(ClientResponse.class, formData);
		String json = res.getEntity(String.class);
		System.out.println(json);
	}

}
