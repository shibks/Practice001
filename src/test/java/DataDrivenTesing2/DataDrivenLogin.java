package DataDrivenTesing2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenLogin {
	
	@Test
	public void Reg() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shibi@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shibin123");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		driver.quit();
	}

}
