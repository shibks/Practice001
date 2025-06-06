package AccountRegistration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.DatePage;


@Test
public class TC03_DatePickers {

	WebDriver driver;
	public void datePicker() throws InterruptedException {
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://mui.com/x/react-date-pickers/date-picker/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		DatePage dt=new DatePage(driver);
		
		Thread.sleep(1000);
		
		dt.chooseDrpDwn();
		dt.chooseYear("2026");
		Thread.sleep(1000);
		try {
			dt.chooseDate("July", "24");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(1000);
		
		driver.quit();
		
	}
}
