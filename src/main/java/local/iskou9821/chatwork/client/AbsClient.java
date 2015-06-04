package local.iskou9821.chatwork.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import local.iskou9821.chatwork.token.Token;

public abstract class AbsClient {
	protected static final String BASE_URL = "https://api.chatwork.com/v1";
	protected Client client = Client.create();

	protected String endpointToUrl(String endpoint) {
		return endpoint.startsWith("/") ? BASE_URL + endpoint : BASE_URL + "/" + endpoint;
	}

	protected WebResource.Builder resource(String endpoint, Token token) {
		String url = endpointToUrl(endpoint);
		WebResource resource = client.resource(url);
		return resource.header("X-ChatWorkToken", token.getValue());
	}

}
