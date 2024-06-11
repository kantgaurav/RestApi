package way2Automation.com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSLCertificate_Handle {
	
	
	String url = "https://self-signed.badssl.com";
	
	@Test
	public void  handleSSLCertidication() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.navigate().to(url);
		Thread.sleep(5000);
		String title = driver.getTitle();
		
		
		System.out.println(title);
		
		
		
		
		
	}

}
