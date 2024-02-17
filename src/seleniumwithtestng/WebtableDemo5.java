package seleniumwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableDemo5 {
  @Test
  public void funA() 
  {
	    System.out.println("funA of WebtableDemo5");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
	    List<WebElement> rows=	driver.findElements(By.xpath("(//table)[3]/child::tbody/child::tr[1]/child::td"));
	    int row=rows.size();
	    System.out.println(row);
	    for(int i=0;i<row;i++)
	    {
	    	String arow=rows.get(i).getText();
	    	System.out.println(arow);
	    }
	         
		
		
		
		
		
  }
}
