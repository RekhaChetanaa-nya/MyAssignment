package week3.day4;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com");	
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		//selenium wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Thread.sleep(1000);
		Set<String> w=driver.getWindowHandles(); 
		List<String> windows=new ArrayList<String>(w);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//div[@class='dialog']/button[2]")).click();
		Thread.sleep(2000);
		
		Shadow shadow=new Shadow(driver);
		//shadow.findElementByXPath("(//div[@id='l1-2-0'])[3]").click();-- Timed out receiving message
		shadow.findElementByXPath("//span[text()='Learning']").click();
		
		Thread.sleep(1000);
		WebElement a = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions obj=new Actions(driver);
		obj.moveToElement(a).perform();
		
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		Set<String> w1=driver.getWindowHandles(); 
		List<String> windows1=new ArrayList<String>(w1);
		driver.switchTo().window(windows1.get(1));
		driver.findElement(By.xpath("(//div[contains(text(),'Salesforce')])[5]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement b = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
		String text = b.getText();
		System.out.println("---------------------------------");
		System.out.println(text);
		System.out.println("---------------------------------");
		
		List<WebElement> s= driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		
		List<String> values=new ArrayList<String>();
		
		for(WebElement webe:s)
		{
		values.add(webe.getText());
	    }
	     System.out.println(values);
		
	     System.out.println("---------------------------------");
			
	     driver.findElement(By.xpath("//div[@class='credentials-card_title']/a[text()='Application Architect']")).click();
	     
	     List<WebElement> s1= driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			
			List<String> values1=new ArrayList<String>();
			
			for(WebElement webe1:s1)
			{
			values1.add(webe1.getText());
		    }
		     System.out.println(values1);
			
		     System.out.println("---------------------------------");
	     
	     //driver.close();
		
	}

}
