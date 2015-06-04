package local.iskou9821.chatwork.util;

import local.iskou9821.chatwork.token.Token;
import local.iskou9821.chatwork.token.TokenProvider;
import local.iskou9821.chatwork.token.impl.PropertyFileTokenProviderImpl;

public class TestTokenProvider {
	public static TokenProvider getTokenProvider() {
		return new PropertyFileTokenProviderImpl("/var/conf/chatwork.properties");
	}


	public static Token getToken() {
		TokenProvider provider = getTokenProvider();
		return provider.getToken();
	}

}