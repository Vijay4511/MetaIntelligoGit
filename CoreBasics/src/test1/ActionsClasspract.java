package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClasspract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.in/");
		//WebElement AccountsSignin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			
		Actions act = new Actions(driver);
		//act.moveToElement(AccountsSignin).build().perform();
		
	//	WebElement amaxonTextbox = driver.findElement(By.id("twotabsearchtextbox"));
		
	//	amaxonTextbox.sendKeys("Vijaykumar");
		
	//	act.moveToElement(amaxonTextbox).click().sendKeys("Vijaykumar").doubleClick().build().perform();
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		int cnt = driver.findElements(By.tagName("iframe")).size();
		System.out.println(cnt);
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).build().perform();

	}

}
