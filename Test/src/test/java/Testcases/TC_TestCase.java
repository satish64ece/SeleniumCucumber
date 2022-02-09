package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

import Pages.Page_GoogleSearch;
import Utils.Browser;

public class TC_TestCase {
	
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {{"Chrome", "suresh"},{"FF", "satish"}};
    }
	
//	@Parameters({"browser"})
	@Test(dataProvider = "data-provider")	
	public void tc_searchInGoogle(String browser, String value)
	{
		System.out.println(browser);
		WebDriver driver = Browser.getDriver(browser);
		driver.get("https://www.google.com/");
		
		Page_GoogleSearch po_search = new Page_GoogleSearch(driver);
		po_search.EnterInSearchBox(value);
		po_search.ClickOnSearchButton();
	}
	
}
