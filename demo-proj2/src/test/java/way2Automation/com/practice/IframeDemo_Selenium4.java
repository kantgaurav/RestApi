package way2Automation.com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo_Selenium4 {
	
	WebDriver driver = null;
	String url = "";
	@BeforeTest
	public void configSetUp() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		
	}
    @Test
    public void findLinkCountAndAllurl() {
    	
    	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> iframes= driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		
    	
    }
}
