package testCases;

import org.openqa.selenium.WebDriver;

import pageObject.GameBattles;
import utilities.DriverBuilder;
import utilities.DriverHandler;
import utilities.DriverType;
import utilities.SeleniumActions;

public class MLGSinglesChallengeTest extends DriverHandler {

WebDriver driver;
	
	public MLGSinglesChallengeTest(DriverType driverType) throws InterruptedException{
		driver = new DriverBuilder(driverType).withDefaultOptions().build();
		
		driver.navigate().to("http://gamebattles.majorleaguegaming.com/");
		
		performAction(driver, GameBattles.HomePage.LoginHeaderButton(driver), SeleniumActions.Click);
		performAction(driver, GameBattles.LoginPage.LoginTextBox(driver), SeleniumActions.Type, "GBDubsSec");
		performAction(driver, GameBattles.LoginPage.LoginPasswordBox(driver), SeleniumActions.Type, "SelTest01");
		performAction(driver, GameBattles.LoginPage.LoginButton(driver), SeleniumActions.Click);
		Thread.sleep(3000);
		performAction(driver, GameBattles.LogedInPage.MyTeams(driver), SeleniumActions.MouseHover);
		Thread.sleep(2000);
		performAction(driver, GameBattles.LogedInPage.SinglesTeam(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		performAction(driver, GameBattles.TeamPage.DimmisAlertButton(driver), SeleniumActions.Click);
		performAction(driver, GameBattles.CloseCookiesPoli(driver), SeleniumActions.Click);
		Thread.sleep(1500);
		performAction(driver, GameBattles.TeamPage.FindMatchButton(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		performAction(driver, GameBattles.MatchFinderPage.ChallengeButton(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		Scroll(driver, 0, 500);
		Thread.sleep(2000);
		performAction(driver, GameBattles.ChallengePage.MapSetExecution(driver), SeleniumActions.DropDownSelectByValue, "1711");
		Thread.sleep(2000);
		performAction(driver, GameBattles.ChallengePage.RegionNA(driver), SeleniumActions.DropDownSelectByValue, "North America");
		performAction(driver, GameBattles.ChallengePage.TunningCompetitiveRadio(driver), SeleniumActions.Click);
		performAction(driver, GameBattles.ChallengePage.MapVariatonForge(driver), SeleniumActions.DropDownSelectByValue,"Forge");
		//performAction(driver, GameBattles.ChallengePage.AceptTermCheckBox(driver), SeleniumActions.Click);
		//performAction(driver, GameBattles.ChallengePage.PostMatchButton(driver), SeleniumActions.Click);
		
	}
	
}
