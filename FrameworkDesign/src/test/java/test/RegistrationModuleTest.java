package test;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.init;
import objectRepository.HomePageRepo;
import objectRepository.LoginPageRepo;
import objectRepository.RegistrationPageRepo;

public class RegistrationModuleTest extends init{

	
	WebDriver driver;
	public ArrayList<String> Tcdata;
		
	@BeforeClass(alwaysRun=true)
	public void ApplicationNavigation() throws IOException
	{
	
		driver = BrowserInitilization();
		driver.get(prop.getProperty("TsrtcUrl"));
	}

	@Test(groups= {"smoke"})
	public void FullNameValid() throws IOException
	{
		
		CommonMethods cm = new CommonMethods();
		Tcdata = cm.getTestcasedata("Regestration", "FullNameValid");
		
		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		LoginPageRepo lp = new LoginPageRepo(driver);
		lp.Signup().click();
		RegistrationPageRepo rp = new RegistrationPageRepo(driver);
		rp.Loginname().sendKeys(Tcdata.get(1));
		rp.Fullname().sendKeys(Tcdata.get(2));
		rp.Email().sendKeys(Tcdata.get(4));
		rp.SelectGender("MALE");
		rp.SelectDOB("24-Jun-1992");
		rp.MobileNumber().sendKeys(Tcdata.get(3));
		rp.Submit().click();
			
	}
	
	@Test(groups= {"Regression"})
	public void LoginNameValid() throws IOException
	{
	
		CommonMethods cm = new CommonMethods();
		Tcdata = cm.getTestcasedata("Regestration", "LoginNameValid");
		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		
		LoginPageRepo lp = new LoginPageRepo(driver);
		lp.Signup().click();
		RegistrationPageRepo rp = new RegistrationPageRepo(driver);
		rp.Loginname().sendKeys(Tcdata.get(1));
		rp.Fullname().sendKeys(Tcdata.get(2));
		rp.Email().sendKeys(Tcdata.get(4));
		rp.SelectGender("MALE");
		rp.SelectDOB("24-Jun-1992");
		rp.MobileNumber().sendKeys(Tcdata.get(3));
		rp.Submit().click();
		
		
	}
	
	@Test(groups= {"Regression"})
	public void MobileFieldValidation() throws IOException
	{
		CommonMethods cm = new CommonMethods();
		Tcdata = cm.getTestcasedata("Regestration", "FieldValidation");
		
		HomePageRepo hp = new HomePageRepo(driver);
		hp.EticketLogin().click();
		
		LoginPageRepo lp = new LoginPageRepo(driver);
		lp.Signup().click();
		RegistrationPageRepo rp = new RegistrationPageRepo(driver);
		rp.Loginname().sendKeys(Tcdata.get(1));
		rp.Fullname().sendKeys(Tcdata.get(2));
		rp.Email().sendKeys(Tcdata.get(4));
		rp.SelectGender("MALE");
		rp.SelectDOB("24-Jun-1992");
		rp.MobileNumber().sendKeys(Tcdata.get(3));
		rp.Submit().click();
		
	}

}
