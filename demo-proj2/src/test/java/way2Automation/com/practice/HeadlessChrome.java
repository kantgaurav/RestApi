package way2Automation.com.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;

public class HeadlessChrome {
// TODO Auto-generated method stub
	
	
	String url= "https://demo.nopcommerce.com/";
		
		@Test
		public void getTitleInHeadlessMode() {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());	
			
			
		}
		
	

	}

