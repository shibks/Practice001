package DataDriven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTables {
	
	@Test
	public void table() {
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe"); 
				ChromeDriver driver = new ChromeDriver(); 
				driver.get("https://cosmocode.io/automation-practice-webtable/");
				
				//driver.quit();
	}

}
