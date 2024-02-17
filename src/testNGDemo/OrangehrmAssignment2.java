package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangehrmAssignment2 
{
	@Test
	public void OrangehrmAssignment2() throws InterruptedException 
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
        driver.findElement(By.xpath("//span[text()='PIM']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("ajay");
        
		Thread.sleep(2000);
        driver.findElement(By.name("middleName")).sendKeys("kumar");
        
		Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("gangapatnam");

		Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("4433");

		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();

		Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();


	}

}
