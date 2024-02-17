package seleniumwithtestng;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinkDemo4 
{
  @Test
  public void funA() throws IOException 
  {
	  System.out.println("funA of BrokenlinkDemo1");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/admin/Downloads/BrokenLink1%20(1).html");
	   WebElement link=driver.findElement(By.tagName("a"));
		String linkattribute=link.getAttribute("href");
		
		
		if(linkattribute.equals(""))
		{
			System.out.println("link is not working");
		}
		else
		{
			URL url=new URL(linkattribute);
			HttpURLConnection hurl=(HttpURLConnection)url.openConnection();
			int responsecode=hurl.getResponseCode();
			if(responsecode>=400)
			{
				System.out.println("link is not working");
			}
			else
			{
				System.out.println("link is working");
				
			}
			
		}
	  
  }
}
