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
		
		ElementAction(driver, GameBattles.HomePage.LoginHeaderButton(driver), SeleniumActions.Click);
		//Cuenta desechable no hay problema si se usa 
		ElementAction(driver, GameBattles.LoginPage.LoginTextBox(driver), SeleniumActions.Type, "GBDubsSec");
		ElementAction(driver, GameBattles.LoginPage.LoginPasswordBox(driver), SeleniumActions.Type, "SelTest01");
		ElementAction(driver, GameBattles.LoginPage.LoginButton(driver), SeleniumActions.Click);
		Thread.sleep(3000);
		ElementAction(driver, GameBattles.LogedInPage.MyTeams(driver), SeleniumActions.MouseHover);
		Thread.sleep(2000);
		ElementAction(driver, GameBattles.LogedInPage.SinglesTeam(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		ElementAction(driver, GameBattles.TeamPage.DimmisAlertButton(driver), SeleniumActions.Click);
		ElementAction(driver, GameBattles.CloseCookiesPoli(driver), SeleniumActions.Click);
		Thread.sleep(1500);
		ElementAction(driver, GameBattles.TeamPage.FindMatchButton(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		ElementAction(driver, GameBattles.MatchFinderPage.ChallengeButton(driver), SeleniumActions.Click);
		Thread.sleep(2000);
		DriverActions.Scroll(driver, 0, 500);
		Thread.sleep(2000);
		ElementAction(driver, GameBattles.ChallengePage.MapSetExecution(driver), SeleniumActions.DropDownSelectByValue, "1711");
		Thread.sleep(2000);
		ElementAction(driver, GameBattles.ChallengePage.RegionNA(driver), SeleniumActions.DropDownSelectByValue, "North America");
		ElementAction(driver, GameBattles.ChallengePage.TunningCompetitiveRadio(driver), SeleniumActions.Click);
		ElementAction(driver, GameBattles.ChallengePage.MapVariatonForge(driver), SeleniumActions.DropDownSelectByValue,"Forge");
		//ElementAction(driver, GameBattles.ChallengePage.AceptTermCheckBox(driver), SeleniumActions.Click);
		//ElementAction(driver, GameBattles.ChallengePage.PostMatchButton(driver), SeleniumActions.Click);
		
	}
	
}
