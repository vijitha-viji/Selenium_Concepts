package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 {
	
	public void doThis()
	{
		System.out.println("Iam here");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("I will run first");
	}
    @AfterMethod
	public void afterRun()
	{
		System.out.println("I will execute last");
	}
}
