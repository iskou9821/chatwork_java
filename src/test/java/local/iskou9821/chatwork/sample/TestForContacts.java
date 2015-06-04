package local.iskou9821.chatwork.sample;

import com.google.common.collect.Lists;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import local.iskou9821.chatwork.model.Contact;
import local.iskou9821.chatwork.token.TokenProvider;
import local.iskou9821.chatwork.token.impl.PropertyFileTokenProviderImpl;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

public class TestForContacts {

	@Ignore
	@Test
	public void コンタクトリストを取得() {
		TokenProvider provider = new PropertyFileTokenProviderImpl("/var/conf/chatwork.properties");
		Client client = Client.create();

		WebResource resource = client.resource("https://api.chatwork.com/v1/contacts");
		ClientResponse res =
				resource.accept(MediaType.APPLICATION_JSON_TYPE)
						.header("X-ChatWorkToken", provider.getToken().getValue()).get(ClientResponse.class);

		String json = res.getEntity(String.class);
		ObjectMapper mapper = new ObjectMapper();
		List<Contact> list;
		try {
			list = Lists.newArrayList(mapper.readValue(json, Contact[].class));
			for (Contact c : list) {
				System.out.println(ToStringBuilder.reflectionToString(c));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
