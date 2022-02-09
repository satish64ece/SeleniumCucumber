package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class testRunOrder {
	@Test
	public void tese123()
	{
		System.out.println("@Test1");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
	}
	
	@Test
	public void tese12323()
	{
		System.out.println("@Test2");
	}
	@BeforeTest
	public void tese1234()
	{
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void tese12234()
	{
		System.out.println("@AfterTest");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
	}
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("@BeforeSuite");	
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("@AfterSuite");
	}
}
