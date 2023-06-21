package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingDynamicDateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	
		String datetoSelect = "29-Apr-2024";
		SelectDate(datetoSelect,driver);

	}
	
	public static void SelectDate(String datetoSelect,WebDriver driver)
	{
				
		String[] strarr = datetoSelect.split("-");
		
		String day = strarr[0];
		String MonthYear = strarr[1] +" "+strarr[2];
				
		driver.findElement(By.id("onward_cal")).click();
		  
		while(  !(driver.findElement(By.className("monthTitle")).getText().equalsIgnoreCase(MonthYear))   )  
		{
			driver.findElement(By.xpath("//button[text()='>']")).click();
		
		}
		
		String xpathday = "//td[text()='"+day+"']"; 
		driver.findElement(By.xpath(xpathday)).click();
	}

}
