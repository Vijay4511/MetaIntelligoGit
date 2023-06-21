package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageRepo {
	
public WebDriver driver;
	
	@FindBy(name="loginName")  //findelement(By.id("userName")) --> driver.findelement(By.id("userName")) 
	WebElement txtLoginName;
	
	@FindBy(id="fullName")
	WebElement txtFullName;
	
	@FindBy(id="email")
	WebElement txtEmail;
	
	@FindBy(id="genderId")
	WebElement lstGender;
	
	@FindBy(id="mobileNo")
	WebElement txtMobileNumber;
	
	@FindBy(name="SaveBtn")
	WebElement btnSubmit;
	
	@FindBy(name="txtDob")
	WebElement txtDOB;
		
	@FindBy(className="ui-datepicker-year")
	WebElement lstYear;

	@FindBy(className="ui-datepicker-month")
	WebElement lstMonth;	
				
	@FindBy(xpath="//td[@data-handler='selectDay']/a")  //--> findelements(By.xpath(""))
	List<WebElement> daysObj;

	public RegistrationPageRepo(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Loginname()
	{
		return txtLoginName;
	}
	
	public WebElement Fullname()
	{
		return txtFullName;
	}
	
	public WebElement Email()
	{
		return txtEmail;
	}
	
	public void SelectGender(String gender)
	{
		Select genselect = new Select(lstGender);
		genselect.selectByVisibleText(gender);
		
	}
	
	public WebElement MobileNumber()
	{
		return txtMobileNumber;
	}
	
	public WebElement Submit()
	{
		return btnSubmit;
	}
	
	public void SelectDOB(String dob) // dob = 24-Jun-1992
	{
		
		String[] strarr = dob.split("-");
		String monthselect = strarr[1];
		String YeartoSelect = strarr[2];
		String daytoSelect = strarr[0];
		txtDOB.click();
			
		Select year = new Select(lstYear);
		year.selectByValue(YeartoSelect);

		Select month = new Select(lstMonth);
		month.selectByVisibleText(monthselect);
					
		System.out.println(daysObj.size());
		for(WebElement day :daysObj)
		{
			if(day.getText().equalsIgnoreCase(daytoSelect))
			{
				day.click();
				break;
			}
				
		}
	}
}
