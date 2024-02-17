package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class TestngAnnotationsDemo3 {
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestngnnotationsDemo3");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod of TestngAnnotationsDemo3");

	  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestngAnnotationsDemo3");
  
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of TestngAnnotationsDemo3");

  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestngAnnotationsDemo3");

  }

}
