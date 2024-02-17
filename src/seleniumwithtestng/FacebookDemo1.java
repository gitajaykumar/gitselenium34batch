package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookDemo1 
{
  @Test
  public void funA() throws InterruptedException 
  {
	   System.out.println();
	   System.out.println();
	   WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/following::span[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]/preceding::label")).click();
		
		driver.quit();
  }
}
