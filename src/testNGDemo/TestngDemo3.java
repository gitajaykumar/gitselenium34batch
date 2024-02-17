package testNGDemo;

import org.testng.annotations.Test;

public class TestngDemo3 
{
	@Test(priority = 3)
	public void funA() 
	{
		System.out.println("funA of TestngDemo3");
		
	}
	@Test(priority = 0)
	public void funB() 
	{
		System.out.println("funB of TestngDemo3");
		
	}
	@Test(priority = 1)
	public void funC() 
	{
		System.out.println("funC of TestngDemo3");
		
	}
	@Test(priority = 2)
	public void funD() 
	{
		System.out.println("funD of TestngDemo3");
		
	}

}
