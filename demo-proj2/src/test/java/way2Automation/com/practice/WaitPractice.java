package way2Automation.com.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WaitPractice {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	

	}
	
	public static  WebElement waitForElementPresence(By locator, int timeOut){
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		  return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

}
	
	public  static void waitElementToBeClickable(WebElement elm, int timeOut) {
		
		new WebDriverWait(driver, Duration.ofSeconds(timeOut)).until(ExpectedConditions.elementToBeClickable(elm));
	}
}