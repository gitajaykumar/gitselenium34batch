package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mousehourDemo1 
{
	
  @Test
  public void funA() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement countryFlag	=driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[2]"));
		
       Actions action=new Actions(driver);
       action.moveToElement(countryFlag).perform();
       
      Thread.sleep(3000);
       
       driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]")).click();
        System.out.println("Done");
        driver.quit();
  }
}
