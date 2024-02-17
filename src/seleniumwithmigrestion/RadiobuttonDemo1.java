package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RadiobuttonDemo1 
{
   @Test
	public void funA() 
	{
	   System.out.println("funA of RadiobuttonDemo1");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement radiobutton =driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));
        SoftAssert sassert=new SoftAssert();
		boolean radiobuttonisdisplayed = radiobutton.isDisplayed();
		sassert.assertTrue(radiobuttonisdisplayed);
		sassert.assertFalse(radiobuttonisdisplayed);
		System.out.println("radiobuttonisdisplayed"+radiobuttonisdisplayed);
		

		boolean radiobuttonisenabled =  radiobutton.isEnabled();
		sassert.assertTrue(radiobuttonisenabled);
		sassert.assertFalse(radiobuttonisenabled);
		System.out.println("radiobuttonisenabled:"+radiobuttonisenabled);

	

		boolean radiobuttonisselected = radiobutton.isSelected();
		sassert.assertTrue(radiobuttonisselected);
		sassert.assertFalse(radiobuttonisselected);
		System.out.println("radiobuttonisselected:"+radiobuttonisselected);
		

		radiobutton.click();
		boolean radiobuttonisselected1 = radiobutton.isSelected();
		sassert.assertTrue(radiobuttonisselected1);
		sassert.assertFalse(radiobuttonisselected1);
		System.out.println("radiobuttonisselected:"+radiobuttonisselected1);
    

	}

}
