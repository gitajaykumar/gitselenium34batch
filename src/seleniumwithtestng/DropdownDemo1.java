package seleniumwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo1 {
	@Test
	public void funA() 
	{
		System.out.println("funA of DropdownDemo1"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='toMonth']"));

		Select s1=new Select(dropdown);
		s1.selectByIndex(3);
		System.out.println("Done");
		s1.selectByVisibleText("June");
		System.out.println("Done");
		s1.selectByValue("11");
		System.out.println("Done");

	}
}
