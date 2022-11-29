package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Attribute based Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//partial
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		
		//collection
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		//attribute
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//partial text
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[(text()='Leads')]")).click();
		
		//text or partial text with index
		//driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Lead')])[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rekha");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}

}
