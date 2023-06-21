package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPwdObjRepo {
	
	public WebDriver driver;
	

	@FindBy(id="userName")   
	WebElement txtLoginId;
	
	@FindBy(id="submitBtn")
	WebElement btnSubmit;
	
	@FindBy(id="errorMsg")
	WebElement lblErrormsg;
	
	
	public ForgetPwdObjRepo(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement LoginId()
	{
		return txtLoginId;
	}
	
	
	public WebElement Submit()
	{
		return btnSubmit;
	}
	
	
	public WebElement ErrorMsg()
	{
		return lblErrormsg;
	}

}
