package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MenuPage;

public class MenuPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MenuPage menuPage;
	
	public MenuPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	}
	@Test
	public void AddMenu() throws InterruptedException {
		
		homePage = homePage.ClickOnRestaurant();
		Thread.sleep(3000);
//		homePage = homePage.ClickOnMenu();
//		Thread.sleep(3000);
		menuPage = new MenuPage();
		Thread.sleep(3000);
		menuPage.AddMenu("Snacks");
		Thread.sleep(3000);
		
	}
	}
