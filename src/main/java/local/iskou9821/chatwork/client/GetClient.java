package local.iskou9821.chatwork.client;

import com.google.common.collect.Lists;
import com.sun.jersey.api.client.ClientResponse;
import local.iskou9821.chatwork.token.Token;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class GetClient extends AbsClient {
	public <T> T singleResult(String endpoint, Class<T> cls, Token token) throws IOException {
		String json = getJson(endpoint, token);
		ObjectMapper mapper = new ObjectMapper();
		T result = mapper.readValue(json, cls);
		return result;
	}

	public <T> List<T> list(String endpoint, Class<T> cls, Token token) throws IOException {
		String json = getJson(endpoint, token);
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		T[] ts = (T[]) Array.newInstance(cls, 0);

		ObjectMapper m = new ObjectMapper();

		@SuppressWarnings("unchecked")
		List<T> res = (List<T>) Lists.newArrayList((T[]) m.readValue(json, ts.getClass()));
		return res;
	}


	private String getJson(String endpoint, Token token) throws IOException {
		ClientResponse res =
				resource(endpoint, token).accept(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
		return res.getEntity(String.class);
	}
}
