package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseLinks {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1 Get list of links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2 -> Get all the links on Footer session
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3 Find number of links on the first section
		
		WebElement columnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		//4 Click on all the 4 elemenst
		
		for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
		String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(3000);
		}
		
		Set<String> windowTitles = driver.getWindowHandles();
		Iterator<String> it = windowTitles.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
	}

}
