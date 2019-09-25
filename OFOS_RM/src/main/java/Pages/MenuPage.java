package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class MenuPage extends TestBase {
//Page Factory
	
	@FindBy(linkText="2. Menu")
	WebElement Menu;
	
	@FindBy(xpath="//a[@class='addmore_class jQAddServiceFn']")
	WebElement AddMenu;
	@FindBy(id="class_name")
	WebElement MenuName;
	@FindBy(xpath="//input[@id='start_time']")
	WebElement StartTime;
	@FindBy(xpath="//li[contains(text(),'01:00 am')]")
	WebElement StrtTime;
	@FindBy(xpath="//input[@id='end_time']")
	WebElement EndTime;
	@FindBy(xpath="//li[contains(text(),'02:00 am')]")
	WebElement Endtime;
	@FindBy(id="//input[@name='add']")
	WebElement Add;
	
	//Initializing the P.O
	public MenuPage() {
		PageFactory.initElements(driver, this);
	}
	public void AddMenu(String Men) throws InterruptedException {
		
		Menu.click();
		Thread.sleep(3000);
		AddMenu.click();
		Thread.sleep(3000);
		MenuName.sendKeys(Men);
		Thread.sleep(3000);
		StartTime.click();
		Thread.sleep(3000);
		StrtTime.click();
		Thread.sleep(3000);
		EndTime.click();
		Thread.sleep(3000);
		Endtime.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(3000);
	}
}
