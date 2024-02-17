package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coockies 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		//System.out.println(driver);
		driver.get("https://www.amazon.in/");
		Set<Cookie> cookies=driver.manage().getCookies();
        System.out.println(cookies.size());
        /*for(Cookie cookie:cookies)
        {
        	System.out.println(cookie.getName()+" "+cookie.getValue());
        }
       System.out.println(driver.manage().getCookieNamed("session-id-time"));
	}*/
	Cookie coobj=new Cookie("Ajaykumar", "12345678");
	driver.manage().addCookie(coobj);
	cookies=driver.manage().getCookies();
	
    System.out.println(cookies.size());
    
    for(Cookie cookie:cookies)
    {
    	System.out.println(cookie.getName()+" "+cookie.getValue());
    }

}
}

