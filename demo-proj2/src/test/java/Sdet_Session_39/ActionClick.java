package Sdet_Session_39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class ActionClick {
	String url = "https://www.google.co.in/";
	@Test
	public void clickOnIcon() {
		ChromeDriver driver = new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(url);
		
		
		JavascriptExecutor jse =   (JavascriptExecutor) driver;
		
		String title =(String) jse.executeScript("return document.title");
		
		System.out.println(title);

		driver.manage().window().maximize();

		WebElement icon= driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a"));

		//icon.click(); //It working 

		///class="v7bWUd

		//Using Action click method //

		Actions act = new Actions(driver);

		//act.click(icon).build().perform();// it working fine
		
		//Using movetoElement 
		
		act.moveToElement(icon).click().build().perform();
		











	}


}
