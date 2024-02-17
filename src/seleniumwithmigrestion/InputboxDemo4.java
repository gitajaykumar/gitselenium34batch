package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InputboxDemo4 
{
    @Test
	public void funA()
	{
		System.out.println("funA of InputboxDemo4");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        WebElement usernameinputbox =driver.findElement(By.xpath("//input[@id='email']"));
        SoftAssert sassert=new SoftAssert();
        
		boolean inputboxisdisplyed = usernameinputbox.isDisplayed();
		sassert.assertTrue(inputboxisdisplyed);
		sassert.assertFalse(inputboxisdisplyed);
        System.out.println("inputboxisdisplyed: "+inputboxisdisplyed);

        boolean inputboxisenabled =  usernameinputbox.isEnabled();
        sassert.assertTrue(inputboxisenabled);
		sassert.assertFalse(inputboxisenabled);
        System.out.println("inputboxisenabled :"+inputboxisenabled);

		
		String actualwatermark = usernameinputbox.getAttribute("placeholder");
		System.out.println("actualwatermark :"+actualwatermark);
        String expectedwatermark = "Email or phone";
        sassert.assertNotEquals(actualwatermark,expectedwatermark,"data is matching");
        System.out.println("data is not matching");
	//	System.out.println("actualwatermark :"+actualwatermark);

	
			
		//				usernameinputbox.sendKeys("");
		//				String actualenterdata = usernameinputbox.getAttribute("value");
		//				System.out.println("actualenterdata :"+ actualenterdata);
		//
		//				if(actualenterdata.equals("rbg technologies"))
		//				{
		//					System.out.println("data entered successfully");
		//				}
		//				else
		//				{
		//					System.out.println("data entered not successfully");
		//				}
	}






}


