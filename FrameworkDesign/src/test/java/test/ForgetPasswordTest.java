package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.init;
import objectRepository.ForgetPwdObjRepo;
import objectRepository.HomePageRepo;
import objectRepository.LoginPageRepo;

public class ForgetPasswordTest extends init {
	
	
	
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void ApplicationNavigation() throws IOException
	{
	
		driver = BrowserInitilization();
		driver.get(prop.getProperty("TsrtcUrl"));
	}
	
	@Test(groups= {"smoke"})
	public void EmailfieldValidaiton()
	{
			
		String expErrormsg = "Login Name not found in the system.";
		
		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		LoginPageRepo lp = new LoginPageRepo(driver);
		lp.ForgetPassword().click();
		
		ForgetPwdObjRepo fp = new ForgetPwdObjRepo(driver);
		fp.LoginId().sendKeys("kdjfglkf@#*%67");
		fp.Submit().click();
		//Validation
		String actErrormsg = fp.ErrorMsg().getText();
		
		if(actErrormsg.equalsIgnoreCase(expErrormsg))
		{
			System.out.println("Validation is successfull");
	
			
		}else
		{
			System.out.println("Validation is NOT successfull");
			Assert.fail();
		}
		
		
	}
	@Test(groups= {"Regression"})
	public void EmailCheck()
	{

		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		
		ForgetPwdObjRepo fp = new ForgetPwdObjRepo(driver);
		fp.LoginId().sendKeys("viju45134@#gmail.com");
		fp.Submit().click();
		
	}

}
