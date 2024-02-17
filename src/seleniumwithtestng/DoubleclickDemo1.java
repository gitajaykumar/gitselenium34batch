package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleclickDemo1 
{
  @Test
  public void funA() throws InterruptedException 
  {
	  System.out.println("DoubleclickDemo1");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  
	  WebElement douclick=driver.findElement(By.xpath("//input[@type='text']"));
	  Thread.sleep(3000);
	  douclick.sendKeys("data");
	  Actions action=new Actions(driver);
	  action.doubleClick(douclick).perform();
	  
	  Thread.sleep(5000);
	  driver.quit();
  }
}
