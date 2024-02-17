package seleniumwithtestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo3 
{
  @Test
  public void f() throws InterruptedException 
  {
	    System.out.println("funA of AlertDemo1");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		WebElement manegebooking=driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		manegebooking.click();
		Thread.sleep(3000);
		WebElement searchbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		searchbutton.click();

		Thread.sleep(4000);
		driver.switchTo().alert();
		
		String alert1 = driver.switchTo().alert().getText();
		
		System.out.println("alert:"+alert1);
		
		driver.switchTo().alert().dismiss();
  }
}
