package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageRepo {
	
	public WebDriver driver;
	
	//@FindBy(locator="locator value") 
	//Webelement <WebElementname>;
	
	@FindBy(id="userName")  //findelement(By.id("userName")) --> driver.findelement(By.id("userName")) 
	WebElement txtUserName;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="submitBtn")
	WebElement btnLogin;
	
	@FindBy(linkText="SignUp")
	WebElement lnkSignup;
	
	@FindBy(linkText="Forgot Password")
	WebElement lnkForgetPwd;
	
	public LoginPageRepo(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Login(String username,String password)
	{
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
		
	}
	
	public WebElement Signup()
	{
		return lnkSignup;
	}
	
	public WebElement ForgetPassword()
	{
		return lnkForgetPwd;
	}
	
	
	
}
