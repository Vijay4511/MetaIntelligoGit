package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptPropertiesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");*/
		
		Properties prop = new Properties();
		// C:\Users\vjred\Desktop\AutomationTraining\CoreBasics
		
		System.out.println(System.getProperty("os.name"));
		String filepath = 	System.getProperty("user.dir")+"\\ConfigDetails.Properties";
		
		FileInputStream fis = new FileInputStream(filepath);
		
		prop.load(fis);
		String strbrowser = prop.getProperty("browser");
		System.out.println(strbrowser);
		
		String strurl = prop.getProperty("url");
		System.out.println(strurl);
		
		prop.setProperty("browser", "IE");
		
		FileOutputStream fos = new FileOutputStream(filepath);
		
		prop.store(fos, "Browser name updated");
		
		
	}

}
