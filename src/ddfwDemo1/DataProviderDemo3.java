package ddfwDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3 
{
  @Test(dataProvider = "setData")
  public void funA(int a, int b) 
  {
	  System.out.println("funA of DataProviderDemo1");
	  System.out.println(a);
	  System.out.println(b);
	  
  }
  
  @DataProvider
  public Object[][] setData()
  {
	  Object[][] o1=new Object[4][2];
	 
	  o1[0][0]=10;
	  o1[0][1]=20;
	  o1[1][0]=30;
	  o1[1][1]=40;
	  o1[2][0]=50;
	  o1[2][1]=60;
	  o1[3][0]=70;
	  o1[3][1]=80;
	  
	  return o1;
	 
  }
}
