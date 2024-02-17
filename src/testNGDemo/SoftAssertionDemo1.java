package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo1 {
  @Test
  public void funA() 
  
  {
	  System.out.println("funA of SoftAssertionDemo1");
	    String excepeteddata="selenium";
		String actualdata="selenium";
		SoftAssert sassert=new SoftAssert();
		sassert.assertEquals(actualdata,excepeteddata); 
		System.out.println("testcase1");
	  
		sassert.assertEquals("selenium","java" );
		System.out.println("testcase2");
		
		sassert.assertNotEquals("selenium", "java");
		System.out.println("testcase3");
		
		
		sassert.assertNotEquals("selenium", "java");
		System.out.println("testcase4");
		
		sassert.assertTrue(true);
		System.out.println("testcase5");
		
		sassert.assertTrue(false);
		System.out.println("testcase6");
		 
		sassert.assertFalse(true);
		System.out.println("testcase7");
				
				
		sassert.assertFalse(false);
		System.out.println("testcase8");
		
		sassert.assertAll();
		System.out.println("Done");
		
  }
}
