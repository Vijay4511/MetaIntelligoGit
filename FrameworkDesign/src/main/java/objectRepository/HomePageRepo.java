package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageRepo {
	
	public WebDriver driver;
	
	By lnkEticketLogin = By.linkText("eTicket Login");
	
	By lnkAgetnLogin = By.linkText("ATB/OPR Login");
	
	public HomePageRepo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement EticketLogin()
	{
		
		return driver.findElement(lnkEticketLogin);
	}
	
	
	public WebElement AgentLogin()
	{
		
		return driver.findElement(lnkAgetnLogin);
	}
	
	
}
