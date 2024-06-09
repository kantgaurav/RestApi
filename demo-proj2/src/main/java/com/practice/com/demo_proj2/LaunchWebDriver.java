package com.practice.com.demo_proj2;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchWebDriver {
	static WebDriver driver =null;
	static Wait<WebDriver> wait = null;
	 
	 ///driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	
 public static <E> void main(String args[]) throws IOException, InterruptedException {
	  WebDriverManager.firefoxdriver().setup();
	 ///System.setProperty("webdriver.chrome.driver", "/Users/07.gaurav/Documents/chromedriver-mac-arm64/chromedriver.exe");
	  driver= new ChromeDriver();
	 
	 wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	 String url = "https://www.bing.com/";
	 URL urlObj= new URL(url);
		
		driver.manage().window().maximize();
 	  //driver.get("https://www.bing.com/");
		
		driver.navigate().to(urlObj);
	 driver.manage().window().maximize();
	 System.out.println(driver.getTitle());
	 Thread.sleep(500);
	 WebElement searchBtn= driver.findElement(By.xpath("//*[@id='sb_form_q']"));
	 
	 try {
		waitForWebElementToBeVisible(driver, searchBtn);
		searchBtn.click();
		Thread.sleep(500);
		
		List<WebElement> elm = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		
		Iterator<WebElement> itr = elm.iterator();
		
		while(itr.hasNext()) {
			String text=itr.next().getText();
			 System.out.println(text);
			  if(text=="Chat") {
				  Thread.sleep(500);
				  itr.next().click();
				  Thread.sleep(1500);
			  }
			
		}
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
	 
	/*
	 * driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	 * Thread.sleep(300);
	 * driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.HOME);
	 */
	 
	 
 }
  public static  void waitForWebElementToBeVisible(WebDriver driver, WebElement e) {
	  
	    wait.until(ExpectedConditions.visibilityOf(e));
  }
  public static void pageLoaded() {
	  
	  
	  
  }
}
