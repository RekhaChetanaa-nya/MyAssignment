package week4.day3assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OppWithMandatory extends Baseclasses {

		@DataProvider(name="Mandatory")
		public String[][] mandatoryCreate(){
			String [][] s=new String[2][1];
			s[0][0]="Salesforce Automation by Rekha1";
			s[1][0]="Salesforce Automation by Rekha2";
			return s;
			
		}
		@Test(dataProvider="Mandatory")
		public void opp(String oppname) throws InterruptedException{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click()", opp);

		driver.findElement(By.xpath("//div[text()='New']")).click();
		WebElement element = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following-sibling::div/input"));
		element.sendKeys(oppname);
		driver.executeScript("arguments[0].click();", element);
		String text2 = element.getText();
		System.out.println(text2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left slds-dropdown_length-with-icon-7']//span/span[text()='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		WebElement findElement = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String text = findElement.getText();
		System.out.println(text);
		driver.close();
}
}
