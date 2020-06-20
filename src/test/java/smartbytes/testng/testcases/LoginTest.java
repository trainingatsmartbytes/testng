package smartbytes.testng.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	@Parameters({ "username", "password" })
	public void login_test(String username,String password) {
		System.out.println("Signing in with username : " + username + " pwd:" + password);
	}
}
