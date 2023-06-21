package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MisslaneousTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		//links count
		//findelements
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/");
	    List<WebElement> lnkObj	 = driver.findElements(By.tagName("a"));
	    System.out.println(lnkObj.size());
	    for(WebElement lnk:lnkObj)
	    	System.out.println(lnk.getText());
	    System.out.println("*********Footer Links Only *************");
	    
	 WebElement footerObj  =   driver.findElement(By.id("fotter-bg"));
	   List<WebElement> footerlnkObj = footerObj.findElements(By.tagName("a"));
	    System.out.println(footerlnkObj.size());
	    for(WebElement lnk:footerlnkObj)
	    	System.out.println(lnk.getText());
	    

	}

}
