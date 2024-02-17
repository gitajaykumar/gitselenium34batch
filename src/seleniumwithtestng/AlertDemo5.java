package seleniumwithtestng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertDemo5 
{
  @Test
  public void funA() throws InterruptedException 
  {
	  
	    System.out.println("funA of AlertDemo5" );
		WebDriver driver=new ChromeDriver();
		SoftAssert aassert=new SoftAssert();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		WebElement alertbox=driver.findElement(By.xpath("//button[@id='alertBox']"));
		WebElement outbox=driver.findElement(By.xpath("//div[@id='output']"));
        alertbox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String Actuallabel=outbox.getText();
		String Exepectedlabel="You selected alert popup";
		aassert.assertEquals(Actuallabel, Exepectedlabel);
		System.out.println("Actuallabel :"+Actuallabel);
		
		Thread.sleep(3000);
		
		WebElement confirmbox=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		confirmbox.click();
		alert.accept();
		String Actuallabe2=outbox.getText();
		String excepectedlabel2="You pressed OK in confirmation popup";
		aassert.assertEquals(Actuallabe2, excepectedlabel2);
		System.out.println("Actuallabe2 :"+Actuallabe2);
		
		Thread.sleep(4000);

        WebElement confirmbox1=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		confirmbox1.click();
		alert.dismiss();
		String actuallabe3=outbox.getText();
		String excepectedlabel3="You pressed Cancel in confirmation popup ";
		aassert.assertEquals(actuallabe3, excepectedlabel3);
        System.out.println("actuallabe3 :"+actuallabe3);
        
        Thread.sleep(5000);

		WebElement promptbox=driver.findElement(By.xpath("//button[@id='promptBox']"));
		promptbox.click();
		alert.sendKeys("rbg");
		alert.accept();
		String actuallabel4=outbox.getText();
		String excepectedlabel4="You entered text rbg in propmt popup";
		aassert.assertEquals(actuallabel4, excepectedlabel4);
        System.out.println("actuallabel4 :"+actuallabel4);
        
        Thread.sleep(6000);
        
    	WebElement promptbox1=driver.findElement(By.xpath("//button[@id='promptBox']"));
		promptbox1.click();
		alert.sendKeys("rbg");
		alert.dismiss();
		String actuallabel5=outbox.getText();
		String excepectedlabel5="You pressed Cancel in prompt popup. ";
		aassert.assertEquals(actuallabel5, excepectedlabel5);
    	System.out.println("actuallabel5 :"+actuallabel5);
		
		
  }
  }

