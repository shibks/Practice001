package AccountRegistration;

import java.time.Duration;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import FlipkartPage.SearchPage;

public class TC04_Flipkart {

	WebDriver driver;
	
	
	
	
	@Test
	public void flipkartTest () throws InterruptedException {
		
		
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
			SearchPage pg=new SearchPage(driver);
			
			pg.moveSlider(driver);
		
			pg.clickApple();
			pg.clickFirst();
		
			pg.clickScnd();
			pg.clickCompare();
		
			driver.quit();
		
		
	}
}
