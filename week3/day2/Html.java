package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;
public class Html {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		//selenium wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//print number of rows
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		int s=findElements.size();
		System.out.println(s);
		
		//print number of columns
		List<WebElement> findElements1 = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));
		int s1=findElements1.size();
		System.out.println(s1);
		driver.close();
	}

}
