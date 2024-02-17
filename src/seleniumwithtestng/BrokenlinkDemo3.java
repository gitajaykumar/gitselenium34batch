package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinkDemo3 
{
  @Test
  public void funA() 
  {
	  System.out.println("funA of BrokenlinkDemo3");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/BrokenLink1%20(1).html");
		WebElement brokenlink=driver.findElement(By.xpath("//a"));
		String link=brokenlink.getAttribute("href");
       if(link.equals(""))
       {
      	 System.out.println("link is not working");
       }
       else
       {
      	 System.out.println("link is working");
       }
  }
}
