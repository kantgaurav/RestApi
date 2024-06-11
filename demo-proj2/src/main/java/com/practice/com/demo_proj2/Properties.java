package com.practice.com.demo_proj2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Properties {
	
 public static void main(String[] args) throws InterruptedException {

	
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://play1.automationcamp.ir/advanced.html");

Thread.sleep(3004);
JavascriptExecutor js =    (JavascriptExecutor) driver;
Object text =js.executeScript("return window.getComputedStyle( document.querySelector('.star-rating'), '::after').getPropertyValue('content') ");
String orgText= text.toString();
System.out.println(orgText);
String starVal = orgText.replaceAll("\"", "");
System.out.println(starVal);
}

}
