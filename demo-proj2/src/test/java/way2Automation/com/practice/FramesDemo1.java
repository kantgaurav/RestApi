package way2Automation.com.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo1 {
	
	WebDriver driver = null;
	String url = "https://docs.oracle.com/javase/8/docs/api/";
	@BeforeTest
	public void configSetUp() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		
	}
	
	@Test
	public void switched2Frame() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to(url);
		
		List<WebElement> frames= driver.findElements(By.tagName("frame"));
		
		System.out.println(frames.size());
		
		driver.switchTo().frame(2); 
	JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		Long val1 = (Long) executor.executeScript("return window.pageYOffset;");
		
		System.out.println(val1);
		
		driver.findElement(By.linkText("Description")).click();
		
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		
		Long val = (Long) executor1.executeScript("return window.pageYOffset;");
		
		System.out.println(val);
		
		
		driver.switchTo().parentFrame();
		
		WebElement elm =driver.findElement(By.tagName("frame"));
		
		   System.out.println(elm.getAttribute("title"));
	}
	
	@AfterTest
	public void tearDown() {
		
		//driver.close();
	}

}
