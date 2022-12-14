package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public RemoteWebDriver driver;
	
	@Parameters({"browser","url","username","password"})
	
	
	@BeforeMethod
	public void beforeClass(String browser ,String url,String username,String password) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup(); 
			driver=new EdgeDriver();
		}
		
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys(username);
		
		driver.findElement(By.name("PASSWORD")).sendKeys(password);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	
	}
}
