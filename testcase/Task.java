package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	@Test
	public  void main() {
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com");	
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input")).sendKeys("task"+Keys.ENTER);
		WebElement e = driver.findElement(By.xpath("//p[@class='slds-truncate']"));
		String text = e.getText();
		if(text.equalsIgnoreCase("Tasks"))
		{
			
			System.out.println("Task is present");
			e.click();
		}
		else
		{
			System.out.println("Task is not present");
		}
		driver.findElement(By.xpath("(//lightning-icon[@class='slds-icon-utility-down slds-button__icon slds-icon_container forceIcon']/lightning-primitive-icon)[2]")).click();
		driver.findElement(By.xpath("//div[@class='branding-actions actionMenu']/ul//a")).click();
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp1");
		driver.findElement(By.xpath("//div[@class='uiPopupTrigger']//div/a[text()='Not Started']")).click();
		driver.findElement(By.xpath("//div[@class='select-options']//li/a[text()='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		WebElement s1 = driver.findElement(By.xpath("//span[text()='Bootcamp1']"));
		String text2 = s1.getText();
		if(text2.equals("Bootcamp1"))
		{
			System.out.println("Task created successfully");
		}
		else
		{
			System.out.println("Task not created");
		}
		
	}
}
