package ddfwDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo4 
{
	@Test(dataProvider = "setData")
	public void logintest(String username,String password) throws InterruptedException 
	{
		System.out.println("funA of DataProviderDemo4 ");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.tagName("button")).click();

		driver.quit();

   }
	
	@DataProvider(name="setData")
	public String[][] setData()
	{
		String[][] s1= {{"Admin","admin123"},{"Admin","rbg123"},{"rbg","admin123"},{"Rbg","rbg123"}};


		return s1;
	}
}
