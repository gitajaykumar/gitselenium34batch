package seleniumwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableDemo4 
{
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");

	  List<WebElement> allrows=driver.findElements(By.xpath("(//table)[3]/thead/tr/td[2]"));
	    int rowsize=allrows.size();
	    System.out.println("rowsize :"+rowsize);
	    
	    
	    for(int i=0; i<rowsize; i++ )
	    {
	    	String allrowsnames=allrows.get(i).getText();
	    	System.out.println(allrowsnames);
    	
  }
}
}
