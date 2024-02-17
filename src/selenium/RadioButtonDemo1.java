package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1 
{

	public static void main(String[] args) 
	{

		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/reservation.php");
			WebElement radiobutton =driver.findElement(By.xpath("//input[@name='tripType' and @value='oneway']"));

			boolean radiobuttonisdisplayed = radiobutton.isDisplayed();
			System.out.println("radiobuttonisdisplayed"+radiobuttonisdisplayed);
			if(radiobuttonisdisplayed == true)
			{
				System.out.println(" radiobutton is displying");
			}
			else
			{
				System.out.println("radiobutton is  not displying ");  
			}

			boolean radiobuttonisenabled =  radiobutton.isEnabled();
			System.out.println("radiobuttonisenabled:"+radiobuttonisenabled);

			if(radiobuttonisenabled == true )
			{
				System.out.println("radiobutton is enabled");
			}
			else
			{
				System.out.println("radiobutton is not enabled ");
			}

			boolean radiobuttonisselected = radiobutton.isSelected();
			System.out.println("radiobuttonisselected:"+radiobuttonisselected);
			if(radiobuttonisselected == true )
			{
				System.out.println("radiobutton is selected");
			}
			else
			{
				System.out.println("radiobutton is not selected");
			}

			radiobutton.click();
			boolean radiobuttonisselected1 = radiobutton.isSelected();
			System.out.println("radiobuttonisselected:"+radiobuttonisselected1);
			if(radiobuttonisselected1 == true )
			{
				System.out.println("radiobutton is selected");
			}
			else
			{
				System.out.println("radiobutton is not selected");
			}
        }
	}
}

	




	







