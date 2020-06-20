package smartbytes.testng.testcases;

import java.util.UUID;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuthenticationTest {
private  static String auth_token="";
	@BeforeClass
	public void signin_test() {
		System.out.println("Signing in to get token....");
		auth_token = UUID.randomUUID().toString();
	}
	
	@Test
	public void create_employee_test() {
	 System.out.println("create_employee_Test:: Employee API with token "+ auth_token);
	}
	@Test(dependsOnMethods= {"create_employee_test"})
	public void update_employee_test() {
	 System.out.println("update_employee_Test:: Employee API with token "+ auth_token);
	}
	@Test(dependsOnMethods= {"update_employee_test"})
	public void delete_employee_test() {
	 System.out.println("delete_employee_Test::Employee API with token "+ auth_token);
	}
	@AfterClass
	public void signout_test() {
		auth_token = "";
		System.out.println("Signing Out....");
	}
}
