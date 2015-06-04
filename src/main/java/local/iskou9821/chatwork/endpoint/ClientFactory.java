package local.iskou9821.chatwork.endpoint;

import local.iskou9821.chatwork.token.Token;
import local.iskou9821.chatwork.token.TokenProvider;

public class ClientFactory {
	private TokenProvider provider;
	private Token token = null;

	public ClientFactory(TokenProvider provider) {
		this.provider =provider;
	}

	public <T> T create(Class<T> cls) {
		if (token == null) {
			token = provider.getToken();
		}
		try {
			return cls.getConstructor(new Class[]{ Token.class }).newInstance(new Object[]{ token });
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

}
