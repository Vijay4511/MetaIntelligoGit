package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumdriver {

	public static void main(String[] args) {
			
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.apsrtconline.in");
		
		//Title Validation
		
		String ExpectedTitle = "APSRTC Official Website for Online Bus Ticket Booking - APSRTConline.in";
		
		String ActualTitle =	driver.getTitle() ;
				
		if(ExpectedTitle.equalsIgnoreCase(ActualTitle))
			System.out.println("Navigated to the APSRTC Website");
		else
			System.out.println("Landed in wrong website");

		//Click on the eticket login button  --> Instruction // Information --> Eticket login button location
		
		//driver.findElement(By.linkText("eTicket Login")).click();
		
		driver.findElement(By.partialLinkText("eTicket")).click();
		
		//Login page Validation
		
		String ExpectedPageHeader = "Login Here";
		
		String ActualPageHeader = driver.findElement(By.className("subHeaderText")).getText();
		
		if(ExpectedPageHeader.equalsIgnoreCase(ActualPageHeader))
			System.out.println("Navigated to Login Page");
		else
			System.out.println("Landed in wrong page");
		
		driver.findElement(By.linkText("SignUp")).click();
		
		//Registration page Validation
		
		driver.findElement(By.id("loginName")).sendKeys("Vijaykumar@#$");

		driver.findElement(By.name("fullName")).sendKeys("Vijay kumar reddy");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vijus45556@gmail.com");
		
		driver.findElement(By.cssSelector("input#mobileNo")).sendKeys("9878765653");
		
		driver.findElement(By.className("continueBtn")).click();
		
		String ExectedErrorMsg = "Login Name has invalid characters.";
		
		String ActualErrroMsg =	driver.findElement(By.tagName("strong")).getText();
			
		if(ExectedErrorMsg.equalsIgnoreCase(ActualErrroMsg))
			System.out.println("Validation is Successfull. Test case got passed");
		else
			System.out.println("Validation failed");
		
		
		// Links
		// Textbox
		// button 
		

	}

}
