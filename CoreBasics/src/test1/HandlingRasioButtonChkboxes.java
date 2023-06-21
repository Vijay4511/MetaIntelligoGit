package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingRasioButtonChkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805955&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9298655%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw98ujBhCgARIsAD7QeAi5K190Qwu9FZc4_DCbEz7S7zbOyy8isyATvrl_VT_n_jtzYwFQjJMaAgSvEALw_wcB");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[text()='Female']")).click();*/
		
		
		driver.get("https://www.tnstc.in/");
		
		//driver.findElement(By.partialLinkText("E-Ticket")).click();
		
		driver.findElement(By.xpath("//a[text()='E-Ticket Login']")).click();
		
		driver.findElement(By.linkText("Create an account")).click();
		
		boolean bln = 	driver.findElement(By.name("chkRules")).isSelected();
		
		System.out.println(bln);
		Thread.sleep(3000);
		
		bln = 	driver.findElement(By.name("chkRules")).isSelected();
		
		System.out.println(bln);
		
		if(!(driver.findElement(By.name("chkRules")).isSelected()))
		{
			driver.findElement(By.name("chkRules")).click();
			System.out.println("If block executed");
		}
			
		System.out.println("End line of the Script");
	
	}

}
