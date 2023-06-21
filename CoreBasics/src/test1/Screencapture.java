package test1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screencapture {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in");
		
		File src = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\vjred\\Desktop\\AutomationTraining\\Screenshot1.jpeg"));
		
		
		
	}

}
