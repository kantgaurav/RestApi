package com.java.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {
	
	WebDriver driver = null;
	
@BeforeMethod
public void launchBrowser() {
	
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();

}

@Test
public void verifyTitle() throws InterruptedException {
	
	
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
	String actTitle = driver.getTitle().trim();
	
	String expTitle= "Google";
	
	Assert.assertEquals(actTitle, expTitle);
	
	System.out.println("Pass");
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	///boolean val=driver.findElement(By.xpath("//descendant::div[@class='RNNXgb']")).isDisplayed();

		//driver.findElement(By.xpath("//descendant::div[@class='RNNXgb']")).clear();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//descendant::div[@class='RNNXgb']")));
		driver.findElement(By.xpath("//descendant::div[@class='RNNXgb']")).sendKeys("Test");
		
		
		
	
	
}

@AfterMethod
public void closeBrowser() {
	driver.close();
	
	
}



	}


