package way2Automation.com.practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExp {

//https://www.lambdatest.com/blog/webdrivermanager-in-selenium/
String url = "https://www.rediff.com/";
WebDriver driver;
WebDriverWait wait = null;
@BeforeTest
public void setUp(){

  WebDriverManager.chromedriver().setup();
 
driver = new ChromeDriver();

driver.manage().window().maximize();

}

 @Test
 public void checkStaleElementException() throws InterruptedException{
    
    driver.get(url);
    
    String windowId= driver.getWindowHandle();
    System.out.println(windowId);
    Thread.sleep(700);
    
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    
    jse.executeScript("window.scrollTo(0, 500)");
   
   List<WebElement> links= driver.findElements(By.xpath("//div[@class=\"footer alignC\"]/a"));
   System.out.println(links.size());
   for(int i=0; i<links.size(); i++){
        links.get(i).click();
        Thread.sleep(700);
        
        driver.get(url);
        //driver.switchTo().window( windowId);
       links= driver.findElements(By.xpath("//div[@class=\"footer alignC\"]/a"));
   
   }
 }  
    
}
