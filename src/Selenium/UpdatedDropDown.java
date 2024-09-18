package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
//	int i=1;
//	while(i<5)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//	}
	//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	//System.out.println(driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isEnabled());
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	//System.out.println(driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isEnabled());
	
     if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
     {
    	 System.out.println("Enabled");
    	 Assert.assertTrue(true);
     }
     else
     {
    	 Assert.assertFalse(false);
     }
	System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(3000);
	
	for(int i=1;i<5;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	Thread.sleep(2000);
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	//driver.close();
}
}
