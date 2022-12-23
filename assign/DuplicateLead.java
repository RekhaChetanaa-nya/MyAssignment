package week2.day2.assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("rekhayogesh1997@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text2);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();

		String text = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
	
		if(text=="Duplicate Lead") {
			System.out.println("The title -"+text+"-is verified");
		}
	
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text3);
		
		if(text2.equals(text3))
		{
			System.out.println("Duplicate Lead is created successfully");
		}
		driver.close();
	}

}
