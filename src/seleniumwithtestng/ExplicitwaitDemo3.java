package seleniumwithtestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitwaitDemo3 
{
  @Test
  public void funA() throws InterruptedException 
  {
	    System.out.println("funA of ExplicitwaitDemo1");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		
	
		WebElement checkbox3G=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		checkbox3G.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='ContentHolder_lbModels_LBI0C']")));
		
		
		WebElement model10=driver.findElement(By.xpath("//td[@id='ContentHolder_lbModels_LBI0C']"));
		model10.click();

  }
}
