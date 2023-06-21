package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingDynamicListbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in");
		
		String fromcity = "KAVALI";
		String ToCity = "HYDERABAD";
		SelectCity(driver,fromcity,"fromPlaceName");
		SelectCity(driver,ToCity,"toPlaceName");
		driver.close();

	}
	
	public static void SelectCity(WebDriver driver,String CityName, String place) throws InterruptedException
	{
		
		driver.findElement(By.name(place)).sendKeys(CityName);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Smart wait
		
		//Thread.sleep(5000); // Hard wait
		
		CityName = CityName.toUpperCase();
		
		String XpathCity = "//span[text()='"+CityName+"']";
		
		driver.findElement(By.xpath(XpathCity)).click();
	}

}
