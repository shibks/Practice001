package windowHandles;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/wiki/2025_Indian_Premier_League"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"vector-page-titlebar-toc-checkbox\"]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js=driver;
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"vector-page-titlebar-toc\"]/div"));
		
		js.executeScript("arguments[0].scrollTop = 500", ele);
	}

}
