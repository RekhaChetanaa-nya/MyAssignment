package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OppWithOutMandatory extends Baseclasses {

	
	@Test
	public void opp() throws InterruptedException{
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	driver.executeScript("arguments[0].click()", opp);

	driver.findElement(By.xpath("//div[text()='New']")).click();
	//WebElement element = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div/input")); 
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
	driver.findElement(By.xpath("//span[text()='15']")).click();
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
	WebElement findElement = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
	String text = findElement.getText();
	WebElement findElement2 = driver.findElement(By.xpath("//label[text()='Opportunity Name']"));
	String text2 = findElement2.getText();
	if(text.contains("Complete this field."))
	{
		System.out.println("Complete this field.-- is displayed in "+text2+"--tab");
	}
	//Complete this field.
	
			WebElement findElement3 = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));
			String text3 = findElement3.getText();
			WebElement findElement4 = driver.findElement(By.xpath("//label[text()='Stage']"));
			String text4 = findElement4.getText();
			if(text3.contains("Complete this field."))
			{
				System.out.println("Complete this field.-- is displayed in "+text4+"--tab");
			}
	
	driver.close();
	}
	}
