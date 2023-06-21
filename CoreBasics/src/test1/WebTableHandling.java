package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://codenboxautomationlab.com/practice/");
	//Print all the rows data in the webtable
	
	WebElement InstructTableObj = driver.findElement(By.id("product"));

	List<WebElement> lstTrows =	InstructTableObj.findElements(By.tagName("tr"));
	//System.out.println(lstTrows.size());
	
	for(int i=1;i<lstTrows.size();i++)  //Iterating thru rows --> 11
	{
		
		List<WebElement> lstColmns =lstTrows.get(11).findElements(By.tagName("td"));
		for(int j =0;j<lstColmns.size();j++) //Iterating thru columns -->3
		{
			String colText = lstColmns.get(j).getText();
			System.out.print(colText+"--");
		}
		
		System.out.println();
		break;
		
	}
	
	
	
	

	}

}
