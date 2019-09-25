package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class HomePage extends TestBase {

//	@FindBy(xpath="//a[@class='venue-active']")
//	WebElement Menu;
	
//	@FindBy(xpath="//a[@class='schedules']")
//	WebElement FoodItems;
	
	@FindBy(xpath="//div[@class='dash_board_nav_bar']//a[contains(text(),'My Account')]")
	WebElement MyAccount;
	
	@FindBy(xpath="//a[contains(text(),'Grand - 21 Aug,2018')]")
	WebElement Restaurant;
	//Initializing the P.O
	public HomePage() {
		PageFactory.initElements(driver, this);
   }
	
//		public HomePage ClickOnMenu() {
//			Menu.click();
//			return new HomePage();
//		}
//		public HomePage ClickOnFoodItems() {
//			FoodItems.click();
//			return new HomePage();
//		}
		public HomePage ClickOnMyAccount() {
			MyAccount.click();
			return new HomePage();
		}
		public HomePage ClickOnRestaurant() {
			Restaurant.click();
			return new HomePage();
		}
}
