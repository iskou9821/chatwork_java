package local.iskou9821.chatwork;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import local.iskou9821.chatwork.model.Me;
import local.iskou9821.chatwork.token.TokenProvider;
import local.iskou9821.chatwork.token.impl.PropertyFileTokenProviderImpl;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.io.IOException;

public class ClientSampleTest {

	@Ignore
	@Test
	public void 自分の情報を取得するテスト() {
		//下準備としてAPIの動作確認をしてみるテスト。
		TokenProvider provider = new PropertyFileTokenProviderImpl("/var/conf/chatwork.properties");
		Client client = Client.create();

		WebResource resource = client.resource("https://api.chatwork.com/v1/me");
		ClientResponse res =
				resource.accept(MediaType.APPLICATION_JSON_TYPE)
						.header("X-ChatWorkToken", provider.getToken()).get(ClientResponse.class);

		String json = res.getEntity(String.class);
		ObjectMapper mapper = new ObjectMapper();
		Me me = null;
		try {
			me = mapper.readValue(json, Me.class);
			System.out.println(ToStringBuilder.reflectionToString(me));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
