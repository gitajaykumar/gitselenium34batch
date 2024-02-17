package testNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngAnnotationsDemo4 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestngAnnotationsDemo4");
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod of TestngAnnotationsDemo4");

	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod of TestngAnnotationsDemo4");

  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestngAnnotationsDemo4");

  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestngAnnotationsDemo4");

  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of TestngAnnotationsDemo4");

  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("afterTest of TestngAnnotationsDemo4");

  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestngAnnotationsDemo4");

  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("afterSuite of TestngAnnotationsDemo4");

  }

}
