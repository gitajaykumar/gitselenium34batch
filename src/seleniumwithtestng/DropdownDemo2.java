package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownDemo2 
{
	@Test
	public void funA() throws InterruptedException 
	{
		System.out.println("funA of DropdownDemo2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select=new Select(dropdown);

		Thread.sleep(3000);
		select.selectByIndex(3);
		System.out.println("Done");

		Thread.sleep(3000);
		select.selectByVisibleText("Paris");
		System.out.println("Done");

		Thread.sleep(3000);
		select.selectByValue("1");
		System.out.println("Done");



	}
}
