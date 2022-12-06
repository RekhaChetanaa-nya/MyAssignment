package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"searchVal\"]")).sendKeys("bags"+Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(@class,'facet-linkname-genderfilter facet-linkname-Men')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		String text = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).getText();
		System.out.println("The number of men's "+text);
//		String text2 = driver.findElement(By.xpath("(//div[@class='facet-head ']/span)[4]")).getText();
//		System.out.println(text2);
		
//		Set<WebElement> n=new TreeSet<WebElement>();
//		List<WebElement> s =driver.findElements(By.xpath("//input[@name='brand']")).getText();;
//		for(WebElement w:s)
//		{
//			String t1=w.getText();
//			n.add(t1);
//			
//		System.out.println(n);
		//Brands
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
        Set<String> s=new TreeSet<String>();
		
		for (WebElement w : brand) 
		{
			String str = w.getText();
			s.add(str);
		}
		System.out.println(s);
	//Bags	
		List<WebElement> bg = driver.findElements(By.xpath("//div[@class='nameCls']"));
        Set<String> s1=new TreeSet<String>();		
		for (WebElement w1 : bg) 
		{
			String str1 = w1.getText();
			s1.add(str1);
		}
		System.out.println(s1);
		
}
}