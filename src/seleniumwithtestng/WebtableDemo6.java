package seleniumwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableDemo6 
{
	@Test
	public void funA() 
	{
        System.out.println("funA of WebtableDemo6");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
		List<WebElement> tablealldata=driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td"));
		int alldata=tablealldata.size();
		System.out.println("alldata :"+alldata);
		for(int i=0; i<alldata;i++)
		{
			String tablealldata1 =tablealldata.get(i).getText();
			System.out.println(tablealldata1);

		}
	}
}
