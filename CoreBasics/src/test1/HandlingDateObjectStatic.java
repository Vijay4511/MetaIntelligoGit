package test1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingDateObjectStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tsrtconline.in");
		
		driver.findElement(By.partialLinkText("eTicket")).click();
		
		driver.findElement(By.linkText("SignUp")).click();
		driver.findElement(By.name("txtDob")).click();
		
		/*
		String day = "30";
		String xpathday = "//a[text()='"+day+"']";
		driver.findElement(By.xpath(xpathday)).click();*/
		
		String daytoSelect = "24";
				
		List<WebElement> daysobj = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
				
		System.out.println(daysobj.size());
		for(WebElement day :daysobj)
		{
			if(day.getText().equalsIgnoreCase(daytoSelect))
			{
				day.click();
				break;
			}
				
		}
		

	}

}
