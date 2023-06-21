package test1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticListbox {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in");
		
		driver.findElement(By.partialLinkText("eTicket")).click();
		
		driver.findElement(By.linkText("SignUp")).click();
		
		WebElement gender = driver.findElement(By.id("genderId"));

		Select genselect = new Select(gender);
		
		genselect.selectByVisibleText("FEMALE");
		
		CpatureScreenshot(driver, "SelectGender");
		
		Select nationselect = new Select(driver.findElement(By.id("nationalityId")));
		
		nationselect.selectByVisibleText("NRI");
		
		List<WebElement> nationlist = nationselect.getOptions();
		
			for(WebElement option:nationlist)
					System.out.println(option.getText());

		Select IdCardTypeSelect = new Select(driver.findElement(By.id("proofTypeId")));
		IdCardTypeSelect.selectByValue("71");
		
		CpatureScreenshot(driver, "LastSnapshot");
		
		List<WebElement> IDList = IdCardTypeSelect.getOptions();
		
		for(WebElement option:IDList)
				System.out.println(option.getText());
		

	}
	
	public static void CpatureScreenshot(WebDriver driver, String ScreenName) throws IOException
	{
		
		File src = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\vjred\\Desktop\\AutomationTraining\\"+ScreenName+".jpeg"));
	}

}
