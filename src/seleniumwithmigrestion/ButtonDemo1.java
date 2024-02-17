package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ButtonDemo1 
{
	@Test
	public void funA()
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement button=	driver.findElement(By.xpath("//button[@value='1']"));
		SoftAssert sassert=new SoftAssert();

		boolean buttonDisplayed=button.isDisplayed();
		sassert.assertTrue(buttonDisplayed);

		boolean buttonenabled=button.isEnabled();
		sassert.assertTrue(buttonenabled);

		String actualwatermarks=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println("actualwatermarks:"+actualwatermarks);
		String expectedwatermarks="Email or phone";
		sassert.assertEquals(actualwatermarks,expectedwatermarks );

		String actualvalue=button.getText();
		String expectedvalue="Log in";
		Assert.assertEquals(actualvalue,expectedvalue );

		button.click();

	}


}


