package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jqueary 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.xpath("//a[@href='https://jqueryui.com/tooltip/']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("25");
		driver.quit();

	}

}
