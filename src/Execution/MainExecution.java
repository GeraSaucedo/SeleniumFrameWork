package Execution;

import org.openqa.selenium.WebDriver;

import pageObject.GoogleWebSite;
import testCases.GoogleSearchTest;
import testCases.OrbitzTest;
import utilities.DriverBuilder;
import utilities.DriverType;

public class MainExecution {
	public static void main(String [] args) {
		try {
			//GoogleSearchTest g = new GoogleSearchTest(DriverType.Chrome);
			OrbitzTest test = new OrbitzTest(DriverType.Chrome);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
