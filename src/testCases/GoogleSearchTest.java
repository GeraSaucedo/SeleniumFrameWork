package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObject.GoogleWebSite;
import utilities.DriverBuilder;
import utilities.DriverHandler;
import utilities.DriverType;
import utilities.SeleniumActions;

public class GoogleSearchTest extends DriverHandler {
	
	WebDriver driver;
	
	public GoogleSearchTest(DriverType driverType){
		driver = new DriverBuilder(driverType).withDefaultOptions().build();
		
		driver.navigate().to("https://www.google.com");
		
		performAction(driver, GoogleWebSite.HomePage.SearchInput(driver),SeleniumActions.HightLight, "Hexaware");
		
		//GoogleWebSite.HomePage.SearchInput(driver).sendKeys(Keys.ENTER);
	}
}
