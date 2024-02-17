package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo3 {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernameinputbox=driver.findElement(By.xpath("//input[@id='email']"));

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
		usernameinputbox.sendKeys("rbg technologies");
		
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
		}
		driver.findElement(By.xpath("//input[@id='email']"));
		String actualenterdata=usernameinputbox	.getAttribute("value");
		System.out.println("actualenterdata:"+actualenterdata);
		if(actualenterdata.equals("rbg technologies"))
		{
			System.out.println("data entered sucueesfully");
		}
		else
		{
		System.out.println("data entered  not sucueesfully");
		}

	

	}

}
