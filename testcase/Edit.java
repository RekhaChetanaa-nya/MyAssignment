package testcase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Edit {
	ChromeDriver driver;
	@BeforeTest
	public void pre() {
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
			
	}
@Test
	public  void runEditLead() {
		
			
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rekha");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				driver.findElement(By.linkText("Edit")).click();
				
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf-AfterEdit");
				
				driver.findElement(By.className("smallSubmit")).click();
				
				
			}

		@AfterTest
		public void post() {
			driver.close();
		}

	}


