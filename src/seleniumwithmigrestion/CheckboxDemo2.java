package seleniumwithmigrestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckboxDemo2 
{
	@Test
	public void funA() 
	{

		System.out.println("funA of CheckboxDemo2"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement checkbox3G =driver.findElement(By.xpath("//*[@id='content']/div[4]/div/table/tbody/tr[6]/td/label/span"));
		SoftAssert sassert=new SoftAssert();
		boolean checkbox3Gisdisplyed = checkbox3G.isDisplayed();
		sassert.assertTrue(checkbox3Gisdisplyed);
		sassert.assertFalse(checkbox3Gisdisplyed);
		System.out.println("checkbox3Gisdisplyed: "+checkbox3Gisdisplyed);


		boolean checkbox3Gisenabled =  checkbox3G.isEnabled();
		sassert.assertTrue(checkbox3Gisenabled);
		sassert.assertFalse(checkbox3Gisenabled);
		System.out.println("checkbox3Gisenabled :"+checkbox3Gisenabled);

		boolean checkbox3Gisselected =  checkbox3G.isSelected();
		sassert.assertTrue(checkbox3Gisselected);
		sassert.assertFalse(checkbox3Gisselected);
		System.out.println("checkbox3Gisselected :"+checkbox3Gisselected);


		//WebElement checkbox3g =  driver.findElement(By.id("ContentHolder_lbFeatures_TG_D"));
		checkbox3G.click();

		boolean checkbox3Gisselected2 =  checkbox3G.isSelected();
		sassert.assertTrue(checkbox3Gisselected2);
		sassert.assertFalse(checkbox3Gisselected2);

		System.out.println("checkbox3Gisselected2 :"+checkbox3Gisselected2);



	}
}








