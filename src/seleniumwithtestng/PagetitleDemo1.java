package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PagetitleDemo1 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of PagetitleDemo1");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		String Excepetedtitle="Find a Flight: Mercury Tours:";
		WebElement title=driver.findElement(By.xpath("//title[text()=  \"Find a Flight: Mercury Tours: \" ]"));
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		Assert.assertEquals(Excepetedtitle, actualtitle,"actual and excepeted  not matched");
		
	  
  }
}
