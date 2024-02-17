package testNGDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;



public class TestngDemo5 
{
	@Test
	public void funA()
	{
		System.out.println("funA of TestngDemo5");
	}
	@Test
	public void funB()
	{
		System.out.println("funB of TestngDemo5");
		System.out.println(0/0);
	}
	@Test
	public void funC() throws Exception
	{
		System.out.println("funC of TestngDemo5");
		throw new Exception();
		//throw new SkipException("TestngDemo5 skipException");
	}
	@Test(enabled = false)
	public void funD()
	{
		System.out.println("funD of TestngDemo5");
	}
	

}
