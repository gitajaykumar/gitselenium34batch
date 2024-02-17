package collections;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class ListDemo5 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement radiobutton=	driver.findElement(By.xpath("//input[@type='radio' and @value='roundtrip']"));
		WebElement onewaybutton=driver.findElement(By.xpath("//input[@type='radio' and @value='oneway']"));
		WebElement economybutton=driver.findElement(By.xpath("//input[@type='radio' and @value='Coach']"));
		WebElement bussinessbutton=driver.findElement(By.xpath("//input[@type='radio' and @value='Business']"));
		WebElement firstbutton=driver.findElement(By.xpath("//input[@type='radio' and @value='First']"));


		List<WebElement>list=new ArrayList<WebElement>();
		list.add(radiobutton);
		list.add(onewaybutton);
		list.add(economybutton);
		list.add(bussinessbutton);
		list.add(firstbutton);

		int listsize= list.size();
		System.out.println("listsize:"+listsize);//5

		WebElement element=	list.get(4);
		element.click();
		System.out.println("Done");


	}

}
