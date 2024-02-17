package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon 
{
	@Test
	public void Amazon() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[9]")).click();
      //  driver.quit();
        
    //   WebElement se= driver.findElement(By.xpath("(//ul[@class=\"a-unordered-list a-nostyle a-vertical a-spacing-medium\"])[6]"));
    //    se.getSize();
    //    System.out.println(se.getSize());
       
	}

}
