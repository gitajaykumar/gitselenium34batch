package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonDemo2 
{
    @Test
	public void funA()  
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/button/");
		
		WebElement button =driver.findElement(By.xpath("(/html/body/input[@type='submit'])"));
         

		boolean buttonisdisplyed =  button.isDisplayed();
		System.out.println("buttonisdisplyed :"+buttonisdisplyed);
		if(buttonisdisplyed == true)
		{
			System.out.println(" button is displying");
		}
		else
		{
			System.out.println("button is  not displying ");  
		}

		boolean buttonisenabled =  button.isEnabled();

		System.out.println("buttonisenabled :"+ buttonisenabled);

		if(buttonisenabled == true )
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled ");
		}

		String actualloginbutton = button.getAttribute("value");
		String expectedloginbutton = "A submit button";

		if (actualloginbutton.equals(expectedloginbutton))
		{
			System.out.println("login name is correct");
		}
		else 
		{
			System.out.println("login name is not correct");
		}

		WebElement login =  driver.findElement(By.name("A submit button"));
		login.click();
	}






}


