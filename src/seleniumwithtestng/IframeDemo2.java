package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemo2 {
	@Test
	public void funA() 
	{
		System.out.println("funA of IframeDemo2");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/Iframe1%20(1)%20(1).html");

		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement saturday3 =driver.findElement(By.xpath("//span[text()='Saturday, 3 January 2015']"));
		String actual=saturday3.getText();

		driver.switchTo().defaultContent();

		driver.switchTo().frame(0);

		WebElement town =driver.findElement(By.xpath("//input[@name='Town']"));
		town.sendKeys(actual);



		WebElement saturday31 =driver.findElement(By.xpath("//span[text()='Saturday, 31 January 2015']"));
		String actualdata=saturday31.getText();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement username =driver.findElement(By.xpath("//input[@name='userName']"));
		username.sendKeys(actualdata);
		
		
		//	   
		//	   driver.switchTo().defaultContent();
		//	   driver.switchTo().frame(0);
		//	   driver.switchTo().frame(0);
		//	   WebElement saturday3 =driver.findElement(By.xpath("//span[text()='Saturday, 3 January 2015']"));
		//	   String actual=saturday3.getText();
		//	   
		//	   driver.switchTo().parentFrame();
		//	   WebElement town =driver.findElement(By.xpath("//input[@name='Town']"));
		//	  town.sendKeys(actual);
		// 
		//	   



	}
}
