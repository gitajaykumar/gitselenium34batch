package seleniumwithtestng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopwindowhandleDemo2 
{
	@Test
	public void funA() 
	{
		System.out.println("funA OF PopwindowhandleDemo2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        WebElement windowhandle=driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		windowhandle.click();

        Set<String> multiplewindows=driver.getWindowHandles();
        System.out.println("windowshandle  :"+multiplewindows+driver.getTitle());
		Iterator<String>itertor1=multiplewindows.iterator();
		
		String parentid=itertor1.next();
		String childid=itertor1.next();
		
        driver.switchTo().window(childid);
        
        WebElement xpath=driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        String xpaths= xpath.getText();
		System.out.println(xpaths);
		
		
		

		  
			
			
	}  

}

