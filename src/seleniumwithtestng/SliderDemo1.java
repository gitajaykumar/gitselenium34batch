package seleniumwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderDemo1 {
	@Test
	public void funA () throws InterruptedException 
	{
		System.out.println("SliderDemo1");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.xpath("//a[text()='Slider']")).click();

		driver.switchTo().frame(0);

		WebElement slider=  driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		WebElement slider1=  driver.findElement(By.id("slider"));
		System.out.println("slider1 length and width :"+slider1.getSize());//21 21
		System.out.println(" slider size :"+slider.getSize());//441 ,15
		System.out.println("slider location :"+slider.getLocation());//8,8

		Actions action=new Actions(driver);
		action.dragAndDropBy(slider1, 300, 0).perform();
		Thread.sleep(5000);

		action.dragAndDropBy(slider1, -200, 0).perform();

		driver.quit();


	}
}
