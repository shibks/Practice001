package Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//input[@id='comboBox']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[normalize-space()='Item 100']")).click();
	    driver.quit();
		
	}

}
