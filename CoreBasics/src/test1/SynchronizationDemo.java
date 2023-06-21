package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
					
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("vjkumarb998877");
		
		
		driver.findElement(By.id("identifierId")).sendKeys("vjkumarb998877");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.RETURN);
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
		
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(30));
		fwait.pollingEvery(Duration.ofSeconds(5));
		fwait.ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
		
		driver.findElement(By.name("Passwd")).sendKeys("Kavali@123");
		driver.findElement(By.name("Passwd")).sendKeys(Keys.RETURN);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Compose')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		

	}

}
