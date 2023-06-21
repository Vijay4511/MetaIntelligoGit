package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.init;
import objectRepository.HomePageRepo;
import objectRepository.LoginPageRepo;

public class LoginModuleTest extends init {
	
	

	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void ApplicationNavigation() throws IOException
	{
	
		driver = BrowserInitilization();
		driver.get(prop.getProperty("ApsrtcUrl"));
	}
	
	@Test(groups= {"Regression"})
	public void InvalidLoginValidPassword()
	{
		
		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		LoginPageRepo lp = new LoginPageRepo(driver);
		lp.Login("Invaliduser", "validpassword");
		//Validation may differ
	}
	
	@Test(groups= {"smoke"})
	public void ValidUsernameInvalidPassword()
	{

		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		LoginPageRepo lp = new LoginPageRepo(driver);
		lp.Login("Validusername", "Invalidpassword");
		//Validation may differ
	}
}
