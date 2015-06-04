package local.iskou9821.chatwork.get;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.model.Contact;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import java.io.IOException;

import static local.iskou9821.chatwork.util.TestTokenProvider.getToken;

public class ContactTest {

	@Test
	public void コンタクトリストを取得() throws IOException {
		for (Contact item : new GetClient().list("contacts", Contact.class, getToken())) {
			System.out.println(ToStringBuilder.reflectionToString(item));
		}
	}

}
