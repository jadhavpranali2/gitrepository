package session3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchromebrowser
{

	public static void main(String[] args) 
	{
		String relative_path="D:\\Selenium\\Workspace\\Seleniumbasic4\\driverexe\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",relative_path);
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
      String url=driver.getCurrentUrl();
      System.out.println(url);
      
      
        String title=driver.getTitle();
        
        System.out.println(title);
        
        driver.navigate().to("http://WWW.facebook.com");
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        driver.navigate().refresh();
        
        
      //  driver.close();
        
	}

}
