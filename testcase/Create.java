package testcase;


	
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Create {
		//making driver public
		ChromeDriver driver;
		@BeforeMethod
		public void beforeClass() {
			WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
		
		}
		
@Test
		public void runCreate() {
			// TODO Auto-generated method stub
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rekha");
			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
			
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
			
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rekhayogesh1997@gmail.com");
			
			WebElement sele1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select scr=new Select(sele1);
			
			scr.selectByVisibleText("New York");
			
			driver.findElement(By.className("smallSubmit")).click();
			
			
	}
@AfterMethod
public void postCondition() {
	driver.close();
	}

	}
