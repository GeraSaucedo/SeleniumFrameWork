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
		/*
		
		ElementAction(driver, Orbitz.HomePage.FlightHotelButton(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.HomePage.CityOrgTextBox(driver), SeleniumActions.Type,"Saltillo");
		Thread.sleep(2000);
		ElementAction(driver, Orbitz.HomePage.CitySelector(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.HomePage.CityDestTextBox(driver), SeleniumActions.Type,"Dubai");
		Thread.sleep(2000);
		ElementAction(driver, Orbitz.HomePage.CitySelector(driver), SeleniumActions.Click);
		*/
		
		ElementAction(driver, Orbitz.HomePage.DepartCalendar(driver), SeleniumActions.Type,"09/30/2018");
		//ElementAction(driver, Orbitz.HomePage.ReturnCalendar(driver), SeleniumActions.Click);
		//Thread.sleep(3000);
		ElementAction(driver, Orbitz.HomePage.ReturnCalendar(driver), SeleniumActions.Clear);
		ElementAction(driver, Orbitz.HomePage.ReturnCalendar(driver), SeleniumActions.Type,"10/10/2018");
		//Thread.sleep(1000);
		
		/*
		ElementAction(driver, Orbitz.HomePage.RoomsDropDown(driver), SeleniumActions.DropDownSelectByValue, "1");
		ElementAction(driver, Orbitz.HomePage.AdultsDropDown(driver), SeleniumActions.DropDownSelectByValue, "1");
		ElementAction(driver, Orbitz.HomePage.ChildDropDown(driver), SeleniumActions.DropDownSelectByValue, "1");
		ElementAction(driver, Orbitz.HomePage.ChildAge(driver), SeleniumActions.DropDownSelectByValue, "10");
		ElementAction(driver, Orbitz.HomePage.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(30000);
		
		ElementAction(driver, Orbitz.ChooseHotel.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		DriverActions.switchToTab(driver, 1);
		Thread.sleep(6000);
		DriverActions.Scroll(driver, 0, 800);
		Thread.sleep(3000);
		ElementAction(driver, Orbitz.SelectDeparture.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(5000);
		ElementAction(driver, Orbitz.SelectReturn.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(5000);
		ElementAction(driver, Orbitz.SelectReturn.SearchButton(driver), SeleniumActions.Click);
		Thread.sleep(8000);
		ElementAction(driver, Orbitz.SelectCar.SearchButtonCar(driver), SeleniumActions.Click);
		//Final screen
		
		ElementAction(driver, Orbitz.FinalPage.FinalStepButton(driver), SeleniumActions.Click);
		DriverActions.Scroll(driver, 0, 1200);
		
		ElementAction(driver, Orbitz.FinalPage.FirstNameTxt(driver), SeleniumActions.Type,"Juan");
		ElementAction(driver, Orbitz.FinalPage.MiddleNameTxt(driver), SeleniumActions.Type,"Pedro");
		ElementAction(driver, Orbitz.FinalPage.LastNameTxt(driver), SeleniumActions.Type,"Lopez Mon");
		ElementAction(driver, Orbitz.FinalPage.PhoneCodeNumberTxt(driver), SeleniumActions.DropDownSelectByValue,"52");
		ElementAction(driver, Orbitz.FinalPage.PhoneNumberTxt(driver), SeleniumActions.Type,"8441231233");
		ElementAction(driver, Orbitz.FinalPage.PassportTxt(driver), SeleniumActions.DropDownSelectByValue,"5784909");
		ElementAction(driver, Orbitz.FinalPage.MaleRadioButton(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.FinalPage.BirthMonthDD(driver), SeleniumActions.DropDownSelectByValue,"12");
		ElementAction(driver, Orbitz.FinalPage.BirthDayDD(driver), SeleniumActions.DropDownSelectByValue,"31");
		ElementAction(driver, Orbitz.FinalPage.BirthYearDD(driver), SeleniumActions.DropDownSelectByValue,"1995");
		
		ElementAction(driver, Orbitz.FinalPage.FirstNameTxt1(driver), SeleniumActions.Type,"Omar");
		ElementAction(driver, Orbitz.FinalPage.MiddleNameTxt1(driver), SeleniumActions.Type,"Pedro");
		ElementAction(driver, Orbitz.FinalPage.LastNameTxt1(driver), SeleniumActions.Type,"Lopez Mon");
		ElementAction(driver, Orbitz.FinalPage.PassportTxt1(driver), SeleniumActions.DropDownSelectByValue,"5784909");
		ElementAction(driver, Orbitz.FinalPage.MaleRadioButton1(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.FinalPage.BirthMonthDD1(driver), SeleniumActions.DropDownSelectByValue,"10");
		ElementAction(driver, Orbitz.FinalPage.BirthDayDD1(driver), SeleniumActions.DropDownSelectByValue,"11");
		ElementAction(driver, Orbitz.FinalPage.BirthYearDD1(driver), SeleniumActions.DropDownSelectByValue,"2008");
		
		ElementAction(driver, Orbitz.FinalPage.NoInsurPackRadioButton(driver), SeleniumActions.Click);
		ElementAction(driver, Orbitz.FinalPage.NoInsureCarRadioButton(driver), SeleniumActions.Click);		
		
		*/
				
	}
	
	
	
	
	
	
}
