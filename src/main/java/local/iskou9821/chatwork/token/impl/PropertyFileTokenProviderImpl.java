package local.iskou9821.chatwork.token.impl;

import local.iskou9821.chatwork.token.Token;
import local.iskou9821.chatwork.token.TokenProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileTokenProviderImpl implements TokenProvider {
	private static final String TOKEN_KEY="token";
	private String fileName = null;
	private Token token = null;

	public PropertyFileTokenProviderImpl(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public Token getToken() {
		if (token != null) {
			return token;
		}

		try (InputStream input = new FileInputStream(this.fileName)) {
			Properties props = new Properties();
			props.load(input);
			token = new Token(props.getProperty(TOKEN_KEY));
			return token;
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}
