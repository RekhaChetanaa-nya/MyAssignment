package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");	
		//selenium wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(findElement);		
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("rek");
		

		Thread.sleep(1000);
		WebElement findElement2 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(findElement2);
		driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		WebElement findElement3 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(findElement3);
		Thread.sleep(1000);
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(findElement4);
		s.selectByVisibleText("Big Baby Cat");
		driver.close();

	}

}
