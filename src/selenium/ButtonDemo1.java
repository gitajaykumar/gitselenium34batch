package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement button=	driver.findElement(By.xpath("//button[@name='login']"));

		boolean buttondisplay  =button.isDisplayed();
		if(buttondisplay==true)
		{
			System.out.println("button is displayed");
		}
		else
		{
			System.out.println("button is not displayed");


		}
		boolean buttonenabled=button.isEnabled();
		if(buttonenabled==true)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled" );
		}
		String actualwatermarks=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println("actualwatermarks:"+actualwatermarks);
		String expectedwatermarks="Email or phone";
		if(actualwatermarks.equals(expectedwatermarks))
		{
			System.out.println("watermarks is displayed");
		}
		else
		{
			System.out.println("watermarks is not dispayed");


			String actualvalue=button.getText();
			String expectedvalue="Log in";
			if(actualvalue.equals(expectedvalue))
			{
				System.out.println("login  is verifyed");
			}
			else
			{
				System.out.println("login  is not verifyed");
			}
			button.click();

		}

	}
}
