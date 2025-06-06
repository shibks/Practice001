package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void ifram() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(5000);
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[3]/p/iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='mobile_menu_toggler']")).click();
		
		driver.quit();
		
	}

}
