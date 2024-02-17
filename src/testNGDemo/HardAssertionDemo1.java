package testNGDemo;




import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertionDemo1 {
	@Test
	public void funA() 
	{
		System.out.println("funA of HardAssertionDemo1");
		String excepeteddata="selenium";
		String actualdata="selenium";
		Assert.assertEquals(actualdata,excepeteddata); 
		System.out.println("Done");

	}

	@Test
	public void funB() 
	{
		System.out.println("funB of HardAssertionDemo1");
		String excepeteddata="selenium";
		String actualdata="java";
		Assert.assertEquals(excepeteddata,actualdata); 
		System.out.println("Done");
	}
	@Test
	public void funC() 
	{
		System.out.println("funC of HardAssertionDemo1");

		String excepeteddata="selenium";
		String actualdata="java";
		Assert.assertNotEquals(excepeteddata,actualdata); 
		System.out.println("Done");
	}
	@Test
	public void funD() 
	{
		System.out.println("funD of HardAssertionDemo1");

		String excepeteddata="selenium";
		String actualdata="selenium";
		Assert.assertNotEquals(excepeteddata,actualdata); 
		System.out.println("Done");

	}
	@Test
	public void funE() 
	{
		System.out.println("funE of HardAssertionDemo1");
        Assert.assertTrue(true); 		
		System.out.println("Done");
	}
	@Test
	public void funF() 
	{
		System.out.println("funF of HardAssertionDemo1");
        Assert.assertTrue(false);  
		System.out.println("Done");

	}
	@Test
	public void funG() 
	{
		System.out.println("funG of HardAssertionDemo1");

		Assert.assertFalse(false);  
		System.out.println("Done");
	}
	@Test
	public void funH() 
	{
		System.out.println("funH of HardAssertionDemo1");

		Assert.assertFalse(true);  
		System.out.println(" funH Done");

}
}