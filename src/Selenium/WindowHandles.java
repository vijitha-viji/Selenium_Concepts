package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		Set<String> window = driver.getWindowHandles();
	    Iterator<String> it = window.iterator();
	    String parentId = it.next();
	    String childID = it.next();
	    driver.switchTo().window(childID);
	    System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
	    driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	    String email= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
	   driver.switchTo().window(parentId);
	   driver.findElement(By.cssSelector("#username")).sendKeys(email);
	    
	    
	}

}
