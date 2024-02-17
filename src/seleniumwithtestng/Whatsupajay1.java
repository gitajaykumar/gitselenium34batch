package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Whatsupajay1 
{
  @Test
  public void ajay() 
  {
	    WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		
		WebElement text=driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']"));
		text.click();
		
  }
}
