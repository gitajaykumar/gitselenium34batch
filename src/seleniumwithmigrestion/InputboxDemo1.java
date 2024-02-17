package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InputboxDemo1 
{
	@Test
	public void funA()
	{
		System.out.println("funA of InputboxDemo1");

	 
	    WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
         SoftAssert sassert=new SoftAssert();
		boolean inputboxdispaly =inputbox.isDisplayed();
		sassert.assertTrue(inputboxdispaly);
		sassert.assertTrue(inputboxdispaly);
		System.out.println("inputboxdispaly:"+inputboxdispaly);
		
		boolean inputboxenabled =inputbox.isEnabled();
		sassert.assertTrue(inputboxenabled);
		sassert.assertTrue(inputboxenabled);
		System.out.println("inputboxenabled:"+inputboxenabled);
		
		
		String actualwatermarks=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label"); 
		String expectedwatermarks="Email or phone";
	    sassert.assertEquals(expectedwatermarks, actualwatermarks,"watermarks is  matching");
	    sassert.assertNotEquals(expectedwatermarks, actualwatermarks,"watermarks is not matching");

		System.out.println("actualwatermarks :"+actualwatermarks);
			
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ajay");
		String actualenterdata=	driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("value");
		String excpeteddata="Email or phone";
	    sassert.assertEquals(excpeteddata, actualenterdata,"data is not matching");
	    System.out.println("data is matching");
	    
       

		
		



	}

}
