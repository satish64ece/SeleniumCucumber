package Utils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.jodah.failsafe.internal.util.Assert;

public class Browser {
 public static WebDriver getDriver(String BrowserType)
 {	WebDriver driver= null;
 
	 if(BrowserType.equalsIgnoreCase("Chrome"))
	 {
		 	ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("start-maximized");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(options);
	 }
	 else if(BrowserType.equalsIgnoreCase("FF"))
	 {
//		 	ChromeOptions options = new ChromeOptions();
//			options.addArguments("--incognito");
//			options.addArguments("start-maximized");
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			driver=new ChromeDriver(options);
	 }
	 else
	 {
		 Assert.isTrue(false, "Browser is not created"); 
	 }
		
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
 }
}
