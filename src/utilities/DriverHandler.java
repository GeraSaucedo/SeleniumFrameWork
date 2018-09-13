package utilities;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DriverHandler {
	
	static JavascriptExecutor js;
	static Actions action;
	static Select select;

	public void ElementAction(WebDriver driver, WebElement element, SeleniumActions action, String value) {
		
		js = ((JavascriptExecutor)driver); 
		
		switch(action) {
		case Type:
			Type(element, value);
			break;
		case DropDownSelectByValue:
			DropDownSelectByValue(element, value);
			break;
		case Clear:
			Clear(element);
			break;
		default: System.out.println("PerformAction ACCION NO VALIDA O METODO USADO INCORRECTAMENTE");
		}
	}
	
public void ElementAction(WebDriver driver, WebElement element, SeleniumActions action) {
		
		js = ((JavascriptExecutor)driver); 
		
		switch(action) {
		case Click:
				Click(element);
			break;
			
		case HightLight:
				Highlight(element);
			break;
		case MouseHover:
				MouseHover(driver, element);
			break;
		case Clear:
				Clear(element);
				break;
		default: System.out.println("PerformAction ACCION NO VALIDA O METODO USADO INCORRECTAMENTE");
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
	
	private void Clear(WebElement element) {
		try {
			element.clear();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void Highlight(WebElement element) {
	      String border;
	      border = "#f00 solid 5px";
	      js.executeScript("arguments[0].style.outline = '" + border + "'; ", element);
	 
	   }
	
	private void MouseHover(WebDriver driver, WebElement element){
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	private void DropDownSelectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}
	
	
	public static class DriverActions {
		public static void Scroll(WebDriver driver, int x, int y) {
			 js = ((JavascriptExecutor)driver);
			 js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
		public static void switchToWindows(WebDriver driver) {
			String currentWindow = driver.getWindowHandle(); //obtiene el identificador de la ventana activa
			Set<String> windows = driver.getWindowHandles(); // obtiene las variables de todas las ventanas
			//windows.remove(currentWindow);		// remueve la ventana activa
			
			for(String x: windows) {
				if(x != currentWindow) {
					driver.switchTo().window(x);
				}
			}
		}
		
		public static void switchToTab(WebDriver driver, int tab) {
			 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(tab));
		}
	}
	
}