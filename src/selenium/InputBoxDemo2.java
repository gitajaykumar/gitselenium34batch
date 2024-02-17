package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		WebElement usernameinputbox=driver.findElement(By.xpath("//input[@id='identifierId']"));

		boolean inputboxdispaly =usernameinputbox.isDisplayed();
		System.out.println("inputboxdispaly:"+inputboxdispaly);

		if(inputboxdispaly==true)
		{
			System.out.println("inputbox is diplayed");
		}
		else
		{
			System.out.println("inputbox is not dispalyed");
		}
		boolean inputboxenabled =usernameinputbox.isEnabled();
		System.out.println("inputboxenabled:"+inputboxenabled);

		if(inputboxenabled==true)

		{
			System.out.println("inputbox is enabled");
		}
		else
		{
			System.out.println("inputbox is not enabled");
		}
		usernameinputbox.sendKeys("RBG TECH");
		String actualwatermarks=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
		System.out.println("actualwatermarks:"+actualwatermarks);
		String expectedwatermarks="Email or phone";
		if(actualwatermarks.equals(expectedwatermarks))
		{
			System.out.println("watermarks is displayed");
		}
		else
		{
			System.out.println("watermarks is not dispayed");
		}
		driver.findElement(By.xpath("//input[@id='identifierId']"));
		String actualenterdata=usernameinputbox	.getAttribute("value");
		System.out.println("actualenterdata:"+actualenterdata);
		if(actualenterdata.equals("RBG TECH"))
		{
			System.out.println("data entered sucueesfully");
		}
		else
		{
		System.out.println("data entered  not sucueesfully");
		}

	}

}
