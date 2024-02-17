package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardassertionDemo2 {
  @Test
  public void funA() 
  {
	  
			System.out.println("funA of HardAssertionDemo1");
			String excepeteddata="selenium";
			String actualdata="selenium";
			Assert.assertEquals(excepeteddata,actualdata,"data is  matching for funA"); 
			System.out.println("Done");

		}

		@Test
		public void funB() 
		{
			System.out.println("funB of HardAssertionDemo1");
			String excepeteddata="selenium";
			String actualdata="java";
			Assert.assertEquals(actualdata,excepeteddata,"data is not matching for funB"); 
			System.out.println("Done");
		
	  
  }
}
