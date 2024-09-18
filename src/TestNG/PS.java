package TestNG;

import org.testng.annotations.Test;

public class PS extends PS1 {
    
	@Test
	public void testRun()
	{
		PS2 ps2 = new PS2(3);
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiplyByTwo());
	}
}
