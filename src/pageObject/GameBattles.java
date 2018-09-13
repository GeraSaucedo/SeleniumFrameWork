package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GameBattles {
	static WebElement element = null;
	
	public static class HomePage{
		public static WebElement LoginHeaderButton(WebDriver driver) {
			try {
				element = driver.findElement(By.cssSelector(".mlg-header-right-button"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			
			return element;
		}
	}
	
	public static class LoginPage {
		public static  WebElement LoginTextBox(WebDriver driver) {
			try {
				element = driver.findElement(By.id("login"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static  WebElement LoginPasswordBox(WebDriver driver) {
			try {
				element = driver.findElement(By.id("login_password"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static  WebElement LoginButton(WebDriver driver) {
			try {
				element = driver.findElement(By.id("login_button"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
	}
	
	public static class LogedInPage{
		public static  WebElement MyTeams(WebDriver driver) {
			try {
				element = driver.findElement(By.cssSelector(".login-myteams-icon-active"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static  WebElement SinglesTeam(WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(text(),\"Singles\")]"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
	}
	
	public static class TeamPage{
		public static  WebElement FindMatchButton(WebDriver driver) {
			try {
				element = driver.findElement(By.xpath("//*[contains(@href,\"match-finder\")]"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static WebElement DimmisAlertButton(WebDriver driver) {
			try {
			element = driver.findElement(By.xpath("//*[contains(@onclick,\"gbDismissArenaAlert\")]"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
	}
	
	public static class MatchFinderPage{
		public static  WebElement ChallengeButton(WebDriver driver){
			try {
				element = driver.findElement(By.xpath("//a[contains(text(),\"Challenge\")]"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
	}
	
	public static class ChallengePage{
		public static  WebElement MapSetExecution(WebDriver driver) {
			try {
				element = driver.findElement(By.id("mapset"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static WebElement RegionNA(WebDriver driver) {
			try {
				element = driver.findElement(By.name("fields[53078]"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static  WebElement TunningCompetitiveRadio(WebDriver driver){
			try {
				element = driver.findElement(By.id("field_55426_1"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static  WebElement MapVariatonForge(WebDriver driver){
			try {
				element = driver.findElement(By.name("fields[58156]"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static  WebElement AceptTermCheckBox(WebDriver driver){
			try {
				element = driver.findElement(By.name("rules"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		public static WebElement PostMatchButton(WebDriver driver) {
			try {
				element = driver.findElement(By.id("post_challenge_button"));
			}catch(Exception e) { System.out.println(e.getMessage());}
			return element;
		}
		
		
	}
	
	public static WebElement CloseCookiesPoli(WebDriver driver) {
		try {
			element = driver.findElement(By.cssSelector(".cookie-close"));
		}catch(Exception e) { System.out.println(e.getMessage());}
		return element;
	}
	
	
	
	

}
