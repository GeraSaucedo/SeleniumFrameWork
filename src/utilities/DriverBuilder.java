package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverBuilder {
	
	private DriverType driverType;
	private String[] defaultOptions;
	
	public DriverBuilder(DriverType _driverType) {
		driverType = _driverType;
	}
	
	public DriverBuilder withDefaultOptions() {
		switch(driverType) {
		case Chrome:
				defaultOptions = new String[] {"--start-maximized","incognito", "disable-extensions","--disable-notifications"};
			break;
		default:
			break;
		}
		return this;
	}
	
	public WebDriver build() {
		
		WebDriver driver = null;
		
		switch(driverType) {
		case Chrome:
				System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments(defaultOptions);
				
				driver = new ChromeDriver(options);
			break;
		
		case FireFox: 
				FirefoxOptions fxOptions = new FirefoxOptions();
				fxOptions.addArguments(defaultOptions);
				
				driver = new FirefoxDriver();
			break;
		
		default:
			break;
		}
		return driver;
		
	}
	
	
	
}
