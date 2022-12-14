package week4.day2.assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends Baseclasses{
	
		@Test
		public void Create(){
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", opp);
		
		WebElement acc = driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']/span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()", acc);
		
		
		driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral']//div")).click();
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']/input)[1]")).sendKeys("Rekha");
		WebElement element = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']/span[text()='--None--'])[3]"));
		element.click();
//		Select s=new Select(element);
//		s.selectByVisibleText("Public");
		driver.findElement(By.xpath("(//span[text()='Public'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		WebElement element2 = driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a[text()='Rekha']"));
		String text = element2.getText();
		System.out.println("The account with name "+text+" is created successfully");
		//driver.close();
		}
		}

