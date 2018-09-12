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
		
		performAction(driver, SeleniumActions.HightLight, GoogleWebSite.HomePage.SearchInput(driver), "Hexaware");
		
		//GoogleWebSite.HomePage.SearchInput(driver).sendKeys(Keys.ENTER);
	}
}
