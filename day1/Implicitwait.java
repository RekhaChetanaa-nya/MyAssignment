package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//selenium wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.manage().window().maximize();
		//create new account
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//real time application- java wait
		//Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("rek");
		
		driver.findElement(By.name("lastname")).sendKeys("V");
		
		driver.findElement(By.name("reg_email__")).sendKeys("rekha@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
		
		WebElement s1 = driver.findElement(By.name("birthday_day"));
		Select sc1=new Select(s1);
		sc1.selectByVisibleText("26");
		
		WebElement s2 = driver.findElement(By.name("birthday_month"));
		Select sc2=new Select(s2);
		sc2.selectByVisibleText("Oct");
		
		WebElement s3 = driver.findElement(By.name("birthday_year"));
		Select sc3=new Select(s3);
		sc3.selectByVisibleText("1992");
		
		driver.findElement(By.name("sex")).click();
		
		
	}

}
