package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String t = element.getText();
		System.out.println(t);
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
		
		//String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	//	System.out.println(text2);
		
//		driver.findElement(By.linkText("Edit")).click();
//		
//		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf-AfterEdit");
//		
//		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("123");
		//String text3 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		//System.out.println(text3);
		//String text = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
	
//		if(text=="Duplicate Lead") {
//			System.out.println("The title -"+text+"-is verified");
//		}
	
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
//		String text3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
//		System.out.println(text3);
		
//		if(text2.equals(text3))
//		{
//			System.out.println("Duplicate Lead is created successfully");
//		}
		
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("The selected is deleted");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-plain-bwrap']//input")).sendKeys(t);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("(//div[@class='x-panel x-panel-noborder x-grid-panel x-panel-collapsed']//span)[1]")).getText();
		System.out.println(text);
		
		//driver.close();
		
		
		
		
	}

}
