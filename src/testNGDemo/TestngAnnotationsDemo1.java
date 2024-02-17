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

public class TestngAnnotationsDemo1 {
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestngAnntationDemo1");
  }
  @Test
  public void funB() 
  {
	  System.out.println("funB of TestngAnntationDemo1");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("beforeMethod of TestngAnntationDemo1");

	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod of TestngAnntationDemo1");

	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestngAnntationDemo1");

  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestngAnntationDemo1");

	  
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of TestngAnntationDemo1");

	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("afterTest of TestngAnntationDemo1");

  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of TestngAnntationDemo1");

  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println(" afterSuite of TestngAnntationDemo1");

  }

}
