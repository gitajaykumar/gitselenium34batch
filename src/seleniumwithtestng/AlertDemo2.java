package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertDemo2 
{
  @Test
  public void f() throws InterruptedException 
  {

		System.out.println("funA of AlertDemo2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meghanabus.in/index.html");
		WebElement manegebooking=driver.findElement(By.xpath("//a[@href='manage-bookings.html']"));
		manegebooking.click();
		Thread.sleep(3000);
		WebElement searchbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		searchbutton.click();

		Thread.sleep(4000);
		
		String alert=driver.switchTo().alert().getText();
		System.out.println("alert:"+alert);
		driver.switchTo().alert().accept();
		
		
		
//		WebElement text= driver.findElement(By.xpath("//span[text()='Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.']"));
//		String actualdata=text.getText();
//		String expecteddata="Please enter the details for Print, Update, Cancel and Pre/Postpone Ticket.";
//		System.out.println(actualdata);
//		Assert.assertEquals(actualdata, expecteddata);
//		//   String actualdata=label.getText();


	
	  
  }
}
