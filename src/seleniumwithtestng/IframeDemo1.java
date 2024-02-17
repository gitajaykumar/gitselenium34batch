package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IframeDemo1 
{
  @Test
  public void funA() throws InterruptedException 
  {
	  System.out.println("funA of LabelDemo2");
	  WebDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
		//SoftAssert sassert=new SoftAssert();
		driver.switchTo().frame(0);
	    WebElement label=driver.findElement(By.xpath("(//*[@id='Blog1']/div[1]/div/h2/span)[1]"));
	    String actualdata=label.getText();
		String excpeteddata="Saturday, 3 January 2015";
		System.out.println("actualdata:"+actualdata);
		Assert.assertEquals(excpeteddata, actualdata,"label is not matching");
		
	    driver.switchTo().defaultContent();
	    WebElement inputboxenterdata=driver.findElement(By.xpath("//input[@name='Town']"));
	   
	    inputboxenterdata.sendKeys("hyderabad");

	 
	    
	 //   String actualdata=label.getText();
	//	String excpeteddata="Saturday, 3 January 2015";
	//	System.out.println("actualdata:"+actualdata);
	//	Assert.assertEquals(excpeteddata, actualdata,"label is not matching");
		
		System.out.println("Done");
		
		
		
		
		
		
		//System.out.println("\"\"");
  }
}
