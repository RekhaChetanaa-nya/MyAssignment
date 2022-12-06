package week3.day2;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("STOCK MARKET")).click();
		driver.findElement(By.partialLinkText("NSE Bulk Deals")).click();
		//div[@class='table-responsive']/table/tbody/tr
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]"));
        
		Set<String> s1=new TreeSet<String>();		
		for (WebElement w1 :findElements) 
		{
			String str1 = w1.getText();
			s1.add(str1);
		}
		System.out.println(s1);
		int size = findElements.size();
		System.out.println("The total names found in the column are-- "+size);
		int size2 = s1.size();
		if(size!=size2)
		{
			System.out.println("Duplicates found");
		}
		System.out.println("The total names after removing duplicates are - "+size2);
		//driver.close();
	}

}
