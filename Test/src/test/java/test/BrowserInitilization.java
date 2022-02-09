package test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrowserInitilization {
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() 
	{
		//chrome with desired capabilities	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");	
	}
	
	
	@Test
	public void TestMethod() 
	{
		//chrome with desired capabilities	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com/");	
	}
	
	@AfterMethod
	public void getScreenShot(ITestResult result) throws IOException
	{
		// Takes screen shot
				 TakesScreenshot scrShot = (TakesScreenshot)driver;
				 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				 //Move image file to new destination
				 System.out.println("D:\\New folder\\test1"+java.time.LocalTime.now().toString()+".png");
		         File DestFile=new File("D:\\New folder\\"+result.getName()+java.time.LocalTime.now().toString().replace(":", "")+"_.png");
		         //Copy file at destination
		         FileUtils.copyFile(SrcFile, DestFile);	
	}

	
}
