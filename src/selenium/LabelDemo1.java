package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com/");
	    WebElement lable=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		String actuallabeltext=lable.getText();
        String expectedlabeltext="to continue to Gmail";
       
        if(actuallabeltext.equals(expectedlabeltext))
        {
        	System.out.println("label is matching");
        }
        else
        {
        	System.out.println("label is not matching");
        }
	}

}
