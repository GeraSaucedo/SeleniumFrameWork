//COMPRAR VUELO + HOTEL
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Orbitz {

	static WebElement element = null;
	
	public static class HomePage{
		
		public static WebElement Searchsomething(WebDriver driver) {
			try {
				element = driver.findElement(By.name("q"));
			}catch(Exception e) { System.out.println(e.getMessage()); }
		
			return element;
		}
		
		
		
	}
	
	public static class NextPage{
		
	}
	
}
