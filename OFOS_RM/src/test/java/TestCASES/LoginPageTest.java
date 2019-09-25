package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	 LoginPage loginPage;
	 HomePage homePage;
	 
	 public LoginPageTest() {
		 super();
	 }
	 
	 @BeforeMethod
	 public void setup() {
		 initialization() ;
		 loginPage = new LoginPage();
	 }
	 @Test
	 public void loginTest() throws InterruptedException {
		 homePage = loginPage.login(prop.getProperty("username1"),prop.getProperty("password1"));
	 }
}
