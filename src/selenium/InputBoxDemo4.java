package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo4 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement button=	driver.findElement(By.xpath("//input[@name='userName']"));
		button.sendKeys("ajay");
		boolean buttonisdisplyed=button.isDisplayed();
		if(buttonisdisplyed==true)
		{
			System.out.println("button is displyed  ");
		}
		else
		{
			System.out.println("button is not displyed");
		}
		boolean buttonisenabled=button.isEnabled();
		if(buttonisenabled==true)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}

	}

}
