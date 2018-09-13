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
	
	public GoogleSearchTest(DriverType driverType) throws InterruptedException{
		driver = new DriverBuilder(driverType).withDefaultOptions().build();
		
		driver.navigate().to("https://www.google.com");
		
		ElementAction(driver, GoogleWebSite.HomePage.SearchInput(driver),SeleniumActions.HightLight, "Hexaware");
		Thread.sleep(5000);
		ElementAction(driver, GoogleWebSite.HomePage.SearchInput(driver), SeleniumActions.Clear);
		
		//GoogleWebSite.HomePage.SearchInput(driver).sendKeys(Keys.ENTER);
	}
}
