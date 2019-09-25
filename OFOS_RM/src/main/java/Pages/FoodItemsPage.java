package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class FoodItemsPage extends TestBase {
//PageFActory
	
	@FindBy(xpath="//a[@class='schedules-active']")
	WebElement FoodItems;
	
	@FindBy(linkText="Add Food Item")
	WebElement AddFood;
	@FindBy(id="activity_name")
	WebElement FoodName;
	@FindBy(id="activity_price")
	WebElement Price;
	@FindBy(id="add_fooditem")
	WebElement Add;
	
	//Initializing the P.O
	public FoodItemsPage( ) {
		PageFactory.initElements(driver, this);
	}
	public void AddFood(String Name,String price) throws InterruptedException {
		
		FoodItems.click();
		Thread.sleep(3000);
		AddFood.click();
		Thread.sleep(3000);
		FoodName.sendKeys(Name);
		Thread.sleep(3000);
		Price.sendKeys(price);
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
	}
}
