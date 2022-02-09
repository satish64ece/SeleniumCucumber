package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Page_GoogleSearch {

	WebDriver driver;

	public Page_GoogleSearch(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	private By Txt_SearchBox = By.xpath("//input[@name='q']");
	private By Btn_SearchButton = By.xpath("(//input[@name='btnK'])[2]");
	
	public void EnterInSearchBox(String Value)
	{ 
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		
		driver.findElement(Txt_SearchBox).sendKeys(Value);
		Reporter.log("the value is set "+Value);
	}
	
	public void ClickOnSearchButton(){
		driver.findElement(Btn_SearchButton).click(); 
		Reporter.log("The searhch box si clicked");
	}
}
