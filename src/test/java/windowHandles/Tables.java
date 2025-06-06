package windowHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tables {
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get("https://cosmocode.io/automation-practice-webtable/"); 
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@id,'countries')]//tr"));
		int row_size=rows.size();
		System.out.println(row_size);
		
	}
		
	

}
