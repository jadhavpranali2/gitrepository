package session3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium..ChromeDriver;

public class Openchromebrowser
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium software\\chromedriver_win32\\ch");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.selenium.org/download/");
        String title=driver.getTitle();
        
        System.out.println(driver.getTitle());
        driver.close();
        
	}

}

