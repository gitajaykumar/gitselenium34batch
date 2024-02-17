package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseandQuitDemo1A 
{
	@Test
	public void funA() throws InterruptedException 
	{
		System.out.println("CloseandQuitDemo1A");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement learnmore=driver.findElement(By.xpath("//a[ text()='Learn more']"));
		learnmore.click();
		Thread.sleep(5000);

		driver.close();
		System.out.println("Done"); 

	}
}
