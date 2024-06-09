package way2Automation.com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Find_TotalLinks_inWebSite {

	
	static String url = "https://www.mayoclinic.org/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		   List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		   
		   System.out.println(totalLinks.size());
		
		       
     //Print All the Link  
		   //https://www.youtube.com/watch?v=TNrF_1c-MfQ
		   
		   for( WebElement e: totalLinks) {
			    //Find All Links 
			   ///System.out.println(e.getText().trim());
			   
			   //Find All URL ; 
			   String urlName= e.getAttribute("href");
			   
			   System.out.println(urlName);
			   
		   }
	}

}
