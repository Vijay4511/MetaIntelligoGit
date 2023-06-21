package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Navigate to Redbus website home page
		//Click on face icon/down arrow
		//Click on signin/signup link/button
		//Enter the mobile number into the edit box
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.redbus.in");
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("9878767876");*/
		//mobileNoInp
		
	/*	driver.get("https://the-internet.herokuapp.com/");		
		driver.findElement(By.linkText("Frames")).click();		
		driver.findElement(By.linkText("Nested Frames")).click();		
		int framescount = driver.findElements(By.tagName("frame")).size();
		System.out.println(framescount);		
		driver.switchTo().frame(0);		
		driver.switchTo().frame("frame-middle");
		String txtMiddleframe = driver.findElement(By.id("content")).getText();
		System.out.println(txtMiddleframe);
		
		driver.switchTo().defaultContent();*/
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();	
		driver.findElement(By.linkText("iFrame")).click();
		
		WebElement iframeobj = driver.findElement(By.id("mce_0_ifr"));
		
		driver.switchTo().frame(iframeobj);
		driver.findElement(By.id("tinymce")).sendKeys("Vijay kumar");


	}

}
