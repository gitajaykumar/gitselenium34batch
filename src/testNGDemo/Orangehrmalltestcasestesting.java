package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Orangehrmalltestcasestesting 
{
     @Test	
	public void Orangehrmalltestcasestesting() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Admin");
		Thread.sleep(2000);
	    WebElement drop=driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
	    drop.click();
	    Select select=new Select(drop);
	    Thread.sleep(2000);
	    select.selectByIndex(1);
	    Thread.sleep(2000);
	    select.selectByVisibleText("Admin");
	    Thread.sleep(3000);
	    select.selectByValue("2");
	    
		
			
			
				
			
		
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("")).click();
	//	Thread.sleep(3000);
     //   driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("\r\n"+ "Mike Tyson");
        
        		
	}

}
