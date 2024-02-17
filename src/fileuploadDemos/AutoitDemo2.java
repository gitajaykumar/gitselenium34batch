package fileuploadDemos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoitDemo2 
{
	

		@Test
		public void Autoit() throws IOException, InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/admin/Downloads/FileUploadDemo1.html");
			driver.manage().window().maximize();
			WebElement chooseFile=driver.findElement(By.xpath("//input[@id='RBG']"));
			//chooseFile.click();
			Thread.sleep( 10000);
			Runtime.getRuntime().exec("‪C:\\Users\\admin\\Desktop\\fileupload\\FileUpload.exe");
			System.out.println("Done");

		}
	}


