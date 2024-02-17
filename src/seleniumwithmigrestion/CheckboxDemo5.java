package seleniumwithmigrestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo5 
{

	public void funA()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		List<WebElement> checkbox3G = driver.findElements(By.xpath("(//input[@type='checkbox'])[6]"));
		int totalcheckboxes = checkbox3G.size();
		for(int i=0;i<totalcheckboxes;i++)
		{
			checkbox3G.get(6).click();
		}


		



		
	}

}








