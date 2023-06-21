package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class init {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver BrowserInitilization() throws IOException
	{
		
		prop = new Properties();
		String filepath = 	System.getProperty("user.dir")+"\\Resources\\Config.Properties";
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		String Browser;
		Browser = System.getProperty("browser");
		
		if(Browser ==null)
		{
			Browser = prop.getProperty("Browser");
		}
		
		if(Browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
					
		}else if(Browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();

		}else
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		return driver;
	}

	
	public String GetScreenshot(String Tcname,WebDriver driver) throws IOException
	{
		File src = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String ScreenshotPath = System.getProperty("user.dir")+"\\Reports\\"+Tcname+".png";
		
		FileHandler.copy(src, new File(ScreenshotPath));
		
		return ScreenshotPath;
	
	}
	
	
}
