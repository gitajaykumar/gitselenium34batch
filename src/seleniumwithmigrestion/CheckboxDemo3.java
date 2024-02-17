package seleniumwithmigrestion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class CheckboxDemo3 
{

	public void funA()
	{
		System.out.println("funA of CheckboxDemo3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		WebElement checkbox3G =driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));

		SoftAssert sassert=new SoftAssert();

		boolean checkbox3Gisdisplyed = checkbox3G.isDisplayed();
		sassert.assertTrue(checkbox3Gisdisplyed);
		sassert.assertFalse(checkbox3Gisdisplyed);
		System.out.println("checkbox3Gisdisplyed: "+checkbox3Gisdisplyed);

		boolean checkbox3Gisenabled =  checkbox3G.isEnabled();
		sassert.assertTrue(checkbox3Gisenabled);
		sassert.assertFalse(checkbox3Gisenabled);

		System.out.println("chechbox3Gisenabled :"+checkbox3Gisenabled);

		boolean checkbox3Gisselected =  checkbox3G.isSelected();
		sassert.assertTrue(checkbox3Gisselected);
		sassert.assertFalse(checkbox3Gisselected);
		System.out.println("checkbox3Gisselected :"+checkbox3Gisselected);

		checkbox3G.click();

		boolean checkbox3Gisselected2 =  checkbox3G.isSelected();
		sassert.assertTrue(checkbox3Gisselected);
		sassert.assertFalse(checkbox3Gisselected);
		System.out.println("checkbox3Gisselected2 :"+checkbox3Gisselected2);


	}

}







