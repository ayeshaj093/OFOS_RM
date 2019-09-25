package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()  {
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Ayesha\\eclipse-workspace\\OFOS_RM\\src\\main\\java\\Config\\Config.Properties");
			prop.load(ip);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void initialization() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver.exe");
		driver=new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\gecko.exe");
		driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url1"));
	}
}
