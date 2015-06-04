package local.iskou9821.chatwork.get;

import static local.iskou9821.chatwork.util.TestTokenProvider.*;

import local.iskou9821.chatwork.client.GetClient;
import local.iskou9821.chatwork.model.Me;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import java.io.IOException;

public class MeTest {

	@Test
	public void 自分の情報を取得() throws IOException {
		GetClient client = new GetClient();
		Me me = client.singleResult("me", Me.class, getToken());
		System.out.println(ToStringBuilder.reflectionToString(me));
	}


}
