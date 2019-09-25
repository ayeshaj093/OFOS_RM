package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
//Page Factory
	@FindBy(id="txtUsername")
	WebElement username1;
	@FindBy(id="txtPassword")
	WebElement password1;
	@FindBy(xpath="//input[@class='login_btn']")
	WebElement login;
	
	//Initializing the P.O
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un,String pwd) throws InterruptedException {
		username1.sendKeys(un);
		Thread.sleep(3000);
		password1.sendKeys(pwd);
		Thread.sleep(3000);
		login.click();
		Thread.sleep(3000);
		
		return new HomePage();
	}
}
