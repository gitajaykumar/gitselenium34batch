package ddfwDemo1;

import org.testng.annotations.Test;

public class TestngInwokeDemo2 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of TestnginwokeDemo1");
	  
  }
  @Test
  public void funB(int a) 
  {
	  System.out.println("funB  of TestnginwokeDemo1");
	  System.out.println(a);
	  
  }
  
}
