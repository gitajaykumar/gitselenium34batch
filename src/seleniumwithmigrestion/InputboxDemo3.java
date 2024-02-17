package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InputboxDemo3 
{
	@Test
	public void funA() 
	{

		System.out.println("funA");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernameinputbox=driver.findElement(By.xpath("//input[@id='email']"));
		SoftAssert sassert=new SoftAssert();
		boolean inputboxdispaly =usernameinputbox.isDisplayed();
		sassert.assertTrue(inputboxdispaly);
		sassert.assertFalse(inputboxdispaly);
		System.out.println("inputboxdispaly:"+inputboxdispaly);

		boolean inputboxenabled =usernameinputbox.isEnabled();
		sassert.assertTrue(inputboxenabled);
		sassert.assertFalse(inputboxenabled);
		System.out.println("inputboxenabled:"+inputboxenabled);

		usernameinputbox.sendKeys("rbg technologies");

		String actualwatermarks=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println("actualwatermarks:"+actualwatermarks);

		String expectedwatermarks="Email or phone";
		sassert.assertNotEquals(actualwatermarks, expectedwatermarks,"data is not matching");
		System.out.println("data is matching");

		driver.findElement(By.xpath("//input[@id='email']"));
		String actualenterdata=usernameinputbox	.getAttribute("value");
		String expectedenterdata="rbg technologies";
		sassert.assertEquals(actualenterdata, expectedenterdata,"data is not matching");
		System.out.println("data is matching");

		System.out.println("actualenterdata:"+actualenterdata);






	}

}
