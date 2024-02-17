package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class InputboxDemo2 
{

	public void funA()
	{
		System.out.println("funA of InputboxDemo2 ");

		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		WebElement usernameinputbox=	driver.findElement(By.xpath("//input[@id='identifierId']"));
        SoftAssert sassert =new SoftAssert();
        
		boolean inputboxdispaly =usernameinputbox.isDisplayed();
		sassert.assertTrue(inputboxdispaly);
		sassert.assertFalse(inputboxdispaly);
        System.out.println("inputboxdispaly:"+inputboxdispaly);

		boolean inputboxenabled =usernameinputbox.isEnabled();
		sassert.assertTrue(inputboxenabled);
		sassert.assertFalse(inputboxenabled);
		System.out.println("inputboxenabled:"+inputboxenabled);

		
		usernameinputbox.sendKeys("RBG TECH");
		String actualwatermarks=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("aria-label");
	    System.out.println("actualwatermarks:"+actualwatermarks);
		String expectedwatermarks="Email or phone";
		sassert.assertEquals(actualwatermarks, expectedwatermarks,"data is not working");
		System.out.println("data is working");
		
		driver.findElement(By.xpath("//input[@id='identifierId']"));
		String actualenterdata=usernameinputbox	.getAttribute("value");
		String Excpetedenterdata="Email or phone";
		sassert.assertEquals(actualenterdata,Excpetedenterdata,"data is not matching");
		
		System.out.println("data is matching");
		

	

	}

}
