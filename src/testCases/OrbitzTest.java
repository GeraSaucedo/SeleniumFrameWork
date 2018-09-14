package testCases;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.matcher.ElementMatcher;
import pageObject.GoogleWebSite;
import pageObject.Orbitz;
import utilities.DriverBuilder;
import utilities.DriverHandler;
import utilities.DriverType;
import utilities.SeleniumActions;
import utilities.DriverHandler.DriverActions;

public class OrbitzTest extends DriverHandler{
	static WebDriver driver;

	public OrbitzTest(DriverType driverType) throws InterruptedException{
		driver = new DriverBuilder(driverType).withDefaultOptions().build();
		
		driver.navigate().to("https://www.orbitz.com");
		
		
		//ElementAction(driver, Orbitz.HomePage.FlightHotelButton(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.HomePage.CityOrgTextBox(driver), SeleniumActions.Type,"Saltillo");
		Thread.sleep(2000);
		ElementAction(driver, Orbitz.HomePage.CitySelector(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.HomePage.CityDestTextBox(driver), SeleniumActions.Type,"Dubai");
		Thread.sleep(2000);
		ElementAction(driver, Orbitz.HomePage.CitySelector(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.HomePage.DepartCalendartxt(driver), SeleniumActions.Type,"09/30/2018");
		ElementAction(driver, Orbitz.HomePage.ReturnCalendartxt(driver), SeleniumActions.Click);
		Thread.sleep(1000);
		ElementAction(driver, Orbitz.HomePage.ReturnCalendarPicker(driver), SeleniumActions.Click);
		Thread.sleep(1000);
		
		
		ElementAction(driver, Orbitz.HomePage.RoomsDropDown(driver), SeleniumActions.DropDownSelectByValue, "1");
		ElementAction(driver, Orbitz.HomePage.AdultsDropDown(driver), SeleniumActions.DropDownSelectByValue, "1");
		ElementAction(driver, Orbitz.HomePage.ChildDropDown(driver), SeleniumActions.DropDownSelectByValue, "1");
		ElementAction(driver, Orbitz.HomePage.ChildAge(driver), SeleniumActions.DropDownSelectByValue, "10");
		ElementAction(driver, Orbitz.HomePage.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(20000);
		
		//CHOOSE YOUR HOTEL
		ElementAction(driver, Orbitz.ChooseHotel.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		DriverActions.switchToTab(driver, 1);
		
		//CHOOSE YOUR ROOM
		Thread.sleep(6000);
		DriverActions.Scroll(driver, 0, 800);
		Thread.sleep(3000);
		ElementAction(driver, Orbitz.ChooseRoom.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(8000);
		
		
		System.out.println("CHOOSE YOUR FLIGHT???");
		//select your departure
		ElementAction(driver, Orbitz.ChooseFlight.SelectButton(driver), SeleniumActions.Click);
		Thread.sleep(3000);
		//select your return
		ElementAction(driver, Orbitz.ChooseFlight.SelectButton(driver), SeleniumActions.Click);
		Thread.sleep(6000);
		
		//Order Details
		ElementAction(driver, Orbitz.OrderDetails.GoToFinalStepButton(driver), SeleniumActions.Click);
		Thread.sleep(5000);
		
		//Final screen | pay screen
		
		ElementAction(driver, Orbitz.ReviewAndBook.FirstNameTxt(driver), SeleniumActions.Type,"Juan");
		ElementAction(driver, Orbitz.ReviewAndBook.MiddleNameTxt(driver), SeleniumActions.Type,"Pedro");
		ElementAction(driver, Orbitz.ReviewAndBook.LastNameTxt(driver), SeleniumActions.Type,"Lopez Mon");
		ElementAction(driver, Orbitz.ReviewAndBook.PhoneCodeNumberTxt(driver), SeleniumActions.DropDownSelectByValue,"52");
		ElementAction(driver, Orbitz.ReviewAndBook.PhoneNumberTxt(driver), SeleniumActions.Type,"8441231233");
		ElementAction(driver, Orbitz.ReviewAndBook.PassportTxt(driver), SeleniumActions.DropDownSelectByValue,"5784909");
		//ElementAction(driver, Orbitz.ReviewAndBook.MaleRadioButton(driver), SeleniumActions.Click);
		//ElementAction(driver, Orbitz.ReviewAndBook.BirthMonthDD(driver), SeleniumActions.DropDownSelectByValue,"12");
		//ElementAction(driver, Orbitz.ReviewAndBook.BirthDayDD(driver), SeleniumActions.DropDownSelectByValue,"31");
		//ElementAction(driver, Orbitz.ReviewAndBook.BirthYearDD(driver), SeleniumActions.DropDownSelectByValue,"1995");
		
		ElementAction(driver, Orbitz.ReviewAndBook.FirstNameTxt1(driver), SeleniumActions.Type,"Omar");
		ElementAction(driver, Orbitz.ReviewAndBook.MiddleNameTxt1(driver), SeleniumActions.Type,"Pedro");
		ElementAction(driver, Orbitz.ReviewAndBook.LastNameTxt1(driver), SeleniumActions.Type,"Lopez Mon");
		ElementAction(driver, Orbitz.ReviewAndBook.PassportTxt1(driver), SeleniumActions.DropDownSelectByValue,"5784909");
		//ElementAction(driver, Orbitz.ReviewAndBook.MaleRadioButton1(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.ReviewAndBook.BirthMonthDD1(driver), SeleniumActions.DropDownSelectByValue,"10");
		ElementAction(driver, Orbitz.ReviewAndBook.BirthDayDD1(driver), SeleniumActions.DropDownSelectByValue,"11");
		ElementAction(driver, Orbitz.ReviewAndBook.BirthYearDD1(driver), SeleniumActions.DropDownSelectByValue,"2008");
		
		ElementAction(driver, Orbitz.ReviewAndBook.NoInsurPackRadioButton(driver), SeleniumActions.Click);
		//ElementAction(driver, Orbitz.ReviewAndBook.NoInsureCarRadioButton(driver), SeleniumActions.Click);		
		
		ElementAction(driver, Orbitz.ReviewAndBook.CompleteBookingButton(driver), SeleniumActions.Click);
		
				
	}
	
	
	
	
	
	
}
