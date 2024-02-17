package seleniumwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllinksDemo1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	 
	System.out.println("linkcount:"+links.size());

	}

}
