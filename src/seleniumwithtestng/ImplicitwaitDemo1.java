package seleniumwithtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitwaitDemo1 
{
	@Test
	public void funA() throws InterruptedException 
	{
		System.out.println("funA of ExplicitwaitDemo1");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement checkbox3G=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		checkbox3G.click();



		WebElement model10=driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']"));
		model10.click();

		WebElement BlueTooth=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']"));
		BlueTooth.click();



		WebElement Model11=driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']"));
		Model11.click();

	}
}
