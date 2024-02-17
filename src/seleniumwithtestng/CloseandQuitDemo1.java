package seleniumwithtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseandQuitDemo1 
{
  @Test
  public void funA() 
  {
	    System.out.println("funA of CloseandQuitDemo1");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		System.out.println("Done");
		driver.close();
		
		
  }
}
