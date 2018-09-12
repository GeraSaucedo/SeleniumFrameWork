package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverHandler {
	
	static JavascriptExecutor js;

	public void performAction(WebDriver driver, SeleniumActions action, WebElement element, String value) {
		
		js = ((JavascriptExecutor)driver); 
		
		switch(action) {
		case Type:
			Type(element, value);
			break;
		
		case Click:
			Click(element);
			break;
			
		case HightLight:
				Highlight(element);
			break;
		default:
		}
	}
	
	private void Type(WebElement element, String value) {
		try {
			element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void Click(WebElement element) {
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void Highlight(WebElement element) {
	      String border;
	      border = "#f00 solid 5px";
	      js.executeScript("arguments[0].style.outline = '" + border + "'; ", element);
	 
	   }
	
	
}
