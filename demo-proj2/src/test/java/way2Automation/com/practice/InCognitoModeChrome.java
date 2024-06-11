package way2Automation.com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InCognitoModeChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.way2automation.com/";
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable -automation"});
		
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get(url);
		
	  System.out.println(driver.getTitle());
			

	}

}
