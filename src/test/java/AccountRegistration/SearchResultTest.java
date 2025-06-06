package AccountRegistration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.SearchResult;

public class SearchResultTest {
	
	WebDriver driver;
	@Test
	public void searchResult() throws InterruptedException {
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/search?q=Laptop&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SearchResult res=new SearchResult(driver);
		
		boolean result=res.isdisplayed();
		
		 Assert.assertTrue(result, "Search result not displayed!");
		 driver.quit();
	}

}
