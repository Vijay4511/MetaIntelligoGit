package base;

import static org.testng.Assert.fail;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SignInModuleTest {

	@BeforeSuite
	public void ClearCache()
	{
		System.out.println("Am the first to get executed");
	}
	
	@Test(groups= {"Regression"})
	public void SiginNegValidation()
	{
		System.out.println("SiginNegValidation");
	}
	
	
	@Test(dependsOnMethods ="SuccessfulRegistration",dataProvider = "getLoginData") 
	public void SuccessfSigin(String uname,String password)
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.apsrtconline.in");
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.id("userName")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submitBtn")).click();
		driver.close();
		//Validation
	}
	
	//@Parameters({"url","uname"})
	@Test(groups= {"smoke"})
	public void Forgetpassword()
	{
		System.out.println("Forgetpassword");
		//System.out.println(url);
		//System.out.println(uname);
	}
	
	@AfterTest
	public void CloseInstance()
	{
		System.out.println("Closing open instances");
	}
	
	@AfterSuite
	public void Closingbrowser()
	{
		System.out.println("Am the last method to be executed");
	}

	@Test
	public void SuccessfulRegistration()
	{
		System.out.println("SuccessfullRegistration");
		//Assert.fail("Test case failed");
	}
	
	@DataProvider
	public Object[][] getLoginData()
	{
		Object[][] dataArray = new Object[2][2];
		
		//First set of data
		dataArray[0][0]=  "VjayInvalid";
		dataArray[0][1]=  "Validpassword";
		
		//Second Set data
		dataArray[1][0]=  "Vjay451";
		dataArray[1][1]=  "InvalidPass";
		
		return dataArray;
		
	
		
		
	}
	
	
	
}
