package Sdet_Session_39;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollHorizontalUsingActionClass {
	
	
	@Test(description= "Scroll Horizontal")
	public void scrollPageHorizontally() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url ="https://the-internet.herokuapp.com/";
		
		
	}

}
