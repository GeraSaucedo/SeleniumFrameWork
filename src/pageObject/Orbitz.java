//COMPRAR VUELO + HOTEL
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orbitz {

	static WebElement element = null;
	
	public static class HomePage{
		
		public static WebElement FlightHotelButton(WebDriver driver) {
			try {
				element = driver.findElement(By.id("fh-fh-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement CityOrgTextBox(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-origin-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement CitySelector(WebDriver driver) {
			try {
				element = driver.findElement(By.id("aria-option-0"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement CityDestTextBox(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-destination-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement DepartCalendar(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-departing-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement ReturnCalendar(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-returning-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement RoomsDropDown(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-rooms-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		public static WebElement AdultsDropDown(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-1-adults-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		public static WebElement ChildDropDown(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-1-children-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement ChildAge(WebDriver driver) {
			try {
				element = driver.findElement(By.id("package-1-age-select-1-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		public static WebElement SearchButton(WebDriver driver) {
			try {
				element = driver.findElement(By.id("search-button-hp-package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
	}
	
	public static class ChooseHotel{
		public static WebElement SearchButton(WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("(//a[@class=\"flex-link\"])[1]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
	}
	
	public static class SelectDeparture {
		public static WebElement SearchButton(WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("(//a[contains(@class,\"book-button\")])[1]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
	}
	
	public static class SelectReturn{
		public static WebElement SearchButton(WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("(//button[@data-test-id=\"select-button\"])[1]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
	}
	
	public static class SelectCar{
		public static WebElement SearchButtonCar (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("(//a[contains(@href,\"Details?\")])[1]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
	}
	
	public static class FinalPage{
		public static WebElement FirstNameTxt (WebDriver driver) {
			try {
				element = driver.findElement(By.id("firstname[0]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement MiddleNameTxt (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"0].middleName\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement LastNameTxt (WebDriver driver) {
			try {
				element = driver.findElement(By.id("lastname[0]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement PhoneCodeNumberTxt (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"0].phoneCountryCode\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement PhoneNumberTxt (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"phoneNumber\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement PassportTxt (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"0].passportCountryId\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement MaleRadioButton (WebDriver driver) {
			try {
				element = driver.findElement(By.id("maleRadio0"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement BirthMonthDD (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"0].dateOfBirth.month\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement BirthDayDD (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"0].dateOfBirth.day\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement BirthYearDD (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"0].dateOfBirth.year\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		//-----------------------------------------------------
		
		public static WebElement FirstNameTxt1 (WebDriver driver) {
			try {
				element = driver.findElement(By.id("firstname[1]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement MiddleNameTxt1 (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"1].middleName\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement LastNameTxt1 (WebDriver driver) {
			try {
				element = driver.findElement(By.id("lastname[1]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement PassportTxt1 (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"1].passportCountryId\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement MaleRadioButton1 (WebDriver driver) {
			try {
				element = driver.findElement(By.id("maleRadio0"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement BirthMonthDD1 (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"1].dateOfBirth.month\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement BirthDayDD1 (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"1].dateOfBirth.day\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement BirthYearDD1 (WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@name,\"1].dateOfBirth.year\")]"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement NoInsurPackRadioButton (WebDriver driver) {
			try {
				element = driver.findElement(By.id("no_insurance_package"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		public static WebElement NoInsureCarRadioButton (WebDriver driver) {
			try {
				element = driver.findElement(By.id("no_insurance_car"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
			return element;
		}
		
		
	 public static WebElement FinalStepButton (WebDriver driver) {
				try {
					element = driver.findElement(By.xpath("(//*[text()=\"Go to Final Step\"])[1]"));
				}catch(Exception e) { System.out.println(e.getMessage()); }
				return element;
			}
		
		
	}
	
}
