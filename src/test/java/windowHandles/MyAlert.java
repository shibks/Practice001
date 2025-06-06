package windowHandles;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();

		
		driver.get("https://vinothqaacademy.com/alert-and-popup/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	    Alert alert=driver.switchTo().alert();
	    
		
		
	}

}
