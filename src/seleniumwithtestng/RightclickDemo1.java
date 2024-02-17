package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightclickDemo1 
{
	@Test
	public void funA() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement context= driver.findElement(By.xpath("//a[text()='Button']"));

		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.contextClick(context).perform();

		Thread.sleep(4000);
		driver.quit();



	}
}
