package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.linkText("Help")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String> windowids = driver.getWindowHandles();
		
		Iterator<String> it = windowids.iterator();
		String parentid = it.next();
		String childid = it.next();
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		

	}

}
