package fileuploadDemos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoitDemo1 
{
	 
	
		@Test
		public void Autoit() throws IOException
		{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/FileUploadDemo1.html");
		driver.manage().window().maximize();
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='RBG']"));
		chooseFile.click();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\autoltdemo\\fileupload.exe");

		System.out.println("Done");
		}
	}

