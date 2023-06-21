package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Vijaykumar");
		Thread.sleep(600);
		driver.switchTo().alert().dismiss();
		
		
	}

}
