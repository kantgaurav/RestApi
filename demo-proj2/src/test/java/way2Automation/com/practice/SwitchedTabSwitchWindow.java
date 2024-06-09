package way2Automation.com.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchedTabSwitchWindow {
	
	public static void main(String[] args) {
		
		String url = "https://www.drikpanchang.com/";
		String url1= "https://www.bing.com/";
		
		String mailUrl = "https://www.yahoo.com/";
		WebDriverManager.chromedriver().setup();
		
		WebDriver drv = new ChromeDriver();
		
		drv.navigate().to(url);
		
		drv.manage().window().maximize();
		
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		drv.switchTo().newWindow(WindowType.TAB);
		
		
		drv.get(url1);
		
		System.out.println(drv.getTitle());
		
		
		WebElement elm = drv.findElement(By.xpath( "//*[@id=\"sb_form_q\"]"));
		elm.click();
		elm.sendKeys("Selenium 4");
		elm.sendKeys(Keys.ENTER);
		
		
		drv.switchTo().newWindow(WindowType.WINDOW);
		drv.get(mailUrl);

		
	   Set<String> winId= drv.getWindowHandles();
	   List<String> winLi= new ArrayList<String>();
	     Iterator<String> itr = winId.iterator();
	     
	     while(itr.hasNext()) {
	    	 
	    	 
	    	 winLi.add(itr.next());
	    	
	    	 
	     }
	     
	     System.out.println(winLi.size());
		//close  2nd Windows. 
	     
	     
	     drv.switchTo().window(winLi.get(1));
	     
	     drv.close();
	     
	     drv.switchTo().window(winLi.get(0));
	     
	    System.out.println(drv.getTitle());
	}  

}
