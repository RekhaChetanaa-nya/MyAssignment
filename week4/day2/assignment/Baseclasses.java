package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasses{
	public RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	
	
	@BeforeMethod
	public void beforeClass(String browser ,String url,String username,String password) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			ChromeOptions option=new ChromeOptions();
			option.addArguments("-disable-notifications");
			 driver=new ChromeDriver(option);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
				driver.manage().window().maximize();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup(); 
			EdgeOptions option=new EdgeOptions();
			option.addArguments("-disable-notifications");
			driver=new EdgeDriver(option);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
			driver.manage().window().maximize();
		}
		
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		
		
	
	}
}
