package testNGDemo;

import org.testng.annotations.Test;

public class TestngDemo4 
{
	@Test(priority = 0 )
	public void loginTest()
	{
		System.out.println("loginTest of TestngDemo4");
		System.out.println(0/0);
		
	}
	@Test(priority = 1,dependsOnMethods ="loginTest" )
	public void customerDetails()
	{
		System.out.println("customerDetails of TestngDemo4");
		
	}

}
