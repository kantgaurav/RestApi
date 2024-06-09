package way2Automation.com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	static WebDriver driver = new ChromeDriver();
     public static boolean isElementPresent(String locator) {
    	 boolean flag = false; 
    	 
    	
    		try {
			driver.findElement(By.xpath(locator));
               flag = true;
               return flag;
			} catch (Throwable t) {
				// TODO Auto-generated catch block
		  return flag;
			}    	 
    	 
    	
    
     }

}
