package com.java.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public void verifyTitle() {
	
	
	driver.get("https://www.google.co.in/");
	
	driver.manage().window().maximize();
	
	String actTitle = driver.getTitle().trim();
	
	String expTitle= "Google";
	
	Assert.assertEquals(actTitle, expTitle);
	
	System.out.println("Pass");
	
	
	
}

@AfterMethod
public void closeBrowser() {
	driver.close();
	
	
}



	}


