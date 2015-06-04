package local.iskou9821.chatwork.client;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import local.iskou9821.chatwork.token.Token;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.util.Map;

public class PostClient extends AbsClient {

	public <T> T send(String endpoint, Map<String, Object> formData, Class<T> cls, Token token) throws IOException {
		MultivaluedMap form = new MultivaluedMapImpl();

		for (Map.Entry entry : formData.entrySet()) {
			form.add(entry.getKey(), entry.getValue());
		}

		ClientResponse res =
				resource(endpoint, token)
						.accept(MediaType.APPLICATION_JSON_TYPE)
						.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
						.post(ClientResponse.class, form);
		String json = res.getEntity(String.class);
		if (cls.equals(String.class)) {
			return (T)json;
		}
		ObjectMapper m = new ObjectMapper();
		return m.readValue(json, cls);
	}


}
