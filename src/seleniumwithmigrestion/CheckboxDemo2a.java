package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckboxDemo2a 
{
	@Test
	public void funA()
	{
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/mortgage-calculator.html");
        WebElement checkbox3G =driver.findElement(By.xpath("//*[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/span"));
		WebElement checkboxelementselected = driver.findElement(By.xpath("//input[@id='caddoptional']"));
		
		SoftAssert sassert=new SoftAssert();
		boolean checkbox3Gisdisplyed = checkbox3G.isDisplayed();
        sassert.assertTrue(checkbox3Gisdisplyed);
		sassert.assertFalse(checkbox3Gisdisplyed);
        System.out.println("checkbox3Gisdisplyed: "+checkbox3Gisdisplyed);
		
        boolean checkbox3Gisenabled =  checkbox3G.isEnabled();
		sassert.assertTrue(checkbox3Gisenabled);
		sassert.assertFalse(checkbox3Gisenabled);
		
        System.out.println("checkbox3Gisenabled :"+checkbox3Gisenabled);
        boolean checkbox3Gisselected = checkboxelementselected.isSelected();
		sassert.assertTrue(checkbox3Gisselected);
		sassert.assertFalse(checkbox3Gisselected);
        System.out.println("checkbox3Gisselected:"+checkbox3Gisselected);
		
        checkbox3G.click();
		boolean checkbox3Gisselected1 = checkboxelementselected.isSelected();
		sassert.assertTrue(checkbox3Gisselected1);
		sassert.assertFalse(checkbox3Gisselected1);
		System.out.println("checkbox3Gisselected1:"+checkbox3Gisselected1);


	}
}








