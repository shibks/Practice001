package AccountRegistration;

import java.time.Duration;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.SearchPage;



public class SearchTest {
	WebDriver driver;
	
	@Test
	public void searchTest() {
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SearchPage page=new SearchPage(driver);
		page.search("Laptop");
		page.clickButton();
		driver.quit();
		
	}

}
