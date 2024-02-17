package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		Thread.sleep(5000);
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		

		boolean inputboxdispaly =inputbox.isDisplayed();
		if(inputboxdispaly==true)
		{
			System.out.println("inputbox is diplayed");
		}
		else
		{
			System.out.println("inputbox is not dispalyed");
		}
		boolean inputboxenabled =inputbox.isEnabled();
		if(inputboxenabled==true)
		{
			System.out.println("inputbox is enabled");
		}
		else
		{
			System.out.println("inputbox is not enabled");
		}
		String actualwatermarks=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label"); 
		String expectedwatermarks="Email or phone";
		if(actualwatermarks.equals(expectedwatermarks))
		{
			System.out.println("watermarks is displayed");
		}
		else
		{
			System.out.println("watermarks is not dispayed");
		}
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ajay");
		String actualenterdata=	driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("value");
		if(actualenterdata.equals("ajay"))
		{
			System.out.println("data entered sucueesfully");
		}
		else
		{
			System.out.println("data entered  not sucueesfully");


		}

	}
}
