package seleniumwithtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseandQuitDemo2 
{
  @Test
  public void funA() 
  {
	    System.out.println(" funA of CloseandQuitDemo2");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		System.out.println("Done");
		
		driver.quit();
  }
}
