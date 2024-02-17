package seleniumwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableDemo3 
{
	@Test
	public void funA() 
	{
		System.out.println("funA of WebTableDemo3");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		List<WebElement> allcolumn=driver.findElements(By.xpath("//*[@id=\"fontSize\"]/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr/td"));
		int tablesize=allcolumn.size();
		System.out.println("tablesize : "+tablesize);
		for(int i=0; i<tablesize; i++)
		{
			String allcolumnnames=allcolumn.get(i).getText();
			System.out.println(allcolumnnames);

		}

	}
}


