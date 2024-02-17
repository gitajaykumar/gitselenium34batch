package seleniumwithmigrestion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class CheckboxDemo1 {

	public static void main(String[] args) 
	{


		WebDriver driver = new ChromeDriver();

		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");



		WebElement checkbox3G =driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		SoftAssert sassert=new SoftAssert();

		boolean chechbox3Gisdisplyed = checkbox3G.isDisplayed();
        sassert.assertTrue(chechbox3Gisdisplyed);
		sassert.assertFalse(chechbox3Gisdisplyed);
		System.out.println("chechbox3Gisdisplyed: "+chechbox3Gisdisplyed);

		
		
		boolean chechbox3Gisenabled =  checkbox3G.isEnabled();
        sassert.assertTrue(chechbox3Gisenabled);
		sassert.assertFalse(chechbox3Gisenabled);
		System.out.println("chechbox3Gisenabled:"+chechbox3Gisenabled);
		
		boolean chechbox3Gisselected =  checkbox3G.isSelected();
        sassert.assertTrue(chechbox3Gisselected);
		sassert.assertFalse(chechbox3Gisselected);
		System.out.println("chechbox3Gisselected:"+chechbox3Gisselected);
		//WebElement checkbox3g =  driver.findElement(By.id("ContentHolder_lbFeatures_TG_D"));
		checkbox3G.click();

		boolean chechbox3Gisselected2 =  checkbox3G.isSelected();
        sassert.assertTrue(chechbox3Gisselected2);
		sassert.assertFalse(chechbox3Gisselected2);
		System.out.println("chechbox3Gisselected2 :"+chechbox3Gisselected2);

	}






}


