package session3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.fi

public class Openffbrowser {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",);
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.selenium.org/download/");
        String title=driver.getTitle();
        
        System.out.println(driver.getTitle());
        driver.close();
	}

}
