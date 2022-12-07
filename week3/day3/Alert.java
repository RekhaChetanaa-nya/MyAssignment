package week3.day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/alert.xhtml");	
		//selenium wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.manage().window().maximize();
		
		//simple Alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println("Simple Alert");
		System.out.println(text);
		System.out.println("-----------------------------------");
		
		//Confirm Alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		driver.switchTo().alert().accept();
		String text1 = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println("Confirm Alert");
		System.out.println(text1);
		System.out.println("-----------------------------------");
		
		//PromptAlert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		driver.switchTo().alert().sendKeys("Rekha");
		driver.switchTo().alert().accept();
		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Prompt Alert");
		System.out.println(text2);
		System.out.println("-----------------------------------");
		
		//Sweet Alert
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']")).click();		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		System.out.println("Sweet Alert");
		System.out.println("-----------------------------------");
		
		
		//Sweet Modal Dialog
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		Thread.sleep(1000);
		System.out.println("Sweet modal Alert");
		System.out.println("-----------------------------------");
		
		//Sweet Alert (Confirmation)
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		System.out.println("Sweet Alert (Confirmation)");
		System.out.println("-----------------------------------");
		
		//Minimize and Maximize
		//Maximize
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		System.out.println("Maximized");
		System.out.println("-----------------------------------");
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		Thread.sleep(1000);
		//Minimize
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		System.out.println("Minimized");
		System.out.println("-----------------------------------");
		
		driver.close();
		
	}

}
