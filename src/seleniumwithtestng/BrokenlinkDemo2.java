package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenlinkDemo2 
{
	@Test
	public void funA() 

	{
		System.out.println("funA of BrokenlinkDemo2");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/link2%20(2).html");
		WebElement brokenlink=driver.findElement(By.xpath("//a"));
		String link=brokenlink.getAttribute("href");
		if(link.equals(""))
		{
			System.out.println("link is  working");
		}
		else
		{
			System.out.println("link is not working");

		}
	}
}

