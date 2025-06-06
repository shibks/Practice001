package AccountRegistration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.TablePageObject;

public class TCO2_Tables {
	WebDriver driver;
	
	@Test
public void tablePagination() throws InterruptedException {
	driver = new ChromeDriver(); 
	driver.manage().deleteAllCookies();
	driver.get("http://www.combio.pl/t_regs/assets/my/plugins/DataTables-1.10.15/examples/basic_init/alt_pagination.html"); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Thread.sleep(2000);
	TablePageObject tb=new TablePageObject(driver);
	tb.names();

	Thread.sleep(1000);
	
	driver.quit();
	
}
}
