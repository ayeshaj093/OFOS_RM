package TestCASES;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.FoodItemsPage;
import Pages.HomePage;
import Pages.LoginPage;

public class FoodItemsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	FoodItemsPage fooditemsPage;
	
	public FoodItemsPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
	initialization();
	loginPage=new LoginPage();
	homePage=loginPage.login(prop.getProperty("username1"), prop.getProperty("password1"));
	}
	@Test
	public void AddFood() throws InterruptedException {
		
		homePage=homePage.ClickOnRestaurant();
		Thread.sleep(3000);
		fooditemsPage=new FoodItemsPage();
		Thread.sleep(3000);
		fooditemsPage.AddFood("payasam", "90");
		Thread.sleep(3000);
	
	}
}
