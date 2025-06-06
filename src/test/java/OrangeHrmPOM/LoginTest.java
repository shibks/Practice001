package OrangeHrmPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	void testLogin() {
		
		Login lp=new Login(driver);
		lp.setUserName("Admin");
		lp.setPasssword("admin123");
		lp.click();
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
		
	}

}
