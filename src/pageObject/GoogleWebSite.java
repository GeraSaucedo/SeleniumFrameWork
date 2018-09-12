package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleWebSite {
	
	public static class HomePage{

		public static WebElement SearchInput(WebDriver driver) {
		
			WebElement element = null;
		
			try {
				element = driver.findElement(By.name("q"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
		
			return element;
		}
	
	}
	
	
}
