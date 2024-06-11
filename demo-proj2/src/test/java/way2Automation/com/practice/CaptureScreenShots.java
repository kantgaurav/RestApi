package way2Automation.com.practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.TakesScreenshot;


public class CaptureScreenShots {
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	String url = "https://demo.nopcommerce.com/";
	
	@BeforeTest
	public void setUp() {
	driver = new ChromeDriver();
	
	wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get(url);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@type='submit']"))));
	driver.manage().window().maximize();
	}
	  @AfterTest
	  public void tearDown() {
		  
		  
	  }
	@Test(description = "Take ScreenShot")
	
	public void  screenShot() {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		String str= System.getProperty("user.dir")+"//target//fullpage.png";
		
		File targetFile = new File(str);
		
		sourceFile.renameTo(targetFile);
		
		//Take specific area of page //Selenium 4 
		
		
	WebElement featureproducts= driver.findElement(By.xpath("//*[@id=\"main\"]//div[@class='product-grid home-page-product-grid']"));
		
		
		File specArea=featureproducts.getScreenshotAs(OutputType.FILE);
		
		
	     File targetScreen = new File(System.getProperty("user.dir")+"//target//featureProduct.jpg");
	     
	     specArea.renameTo(targetScreen);
	}
		


}
