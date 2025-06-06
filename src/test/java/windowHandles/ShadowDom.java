package windowHandles;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://practice.expandtesting.com/shadowdom"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String str="return document.querySelector('#shadow-host').shadowRoot.querySelector('#my-btn')";
		JavascriptExecutor js=driver;
		WebElement ele=(WebElement) js.executeScript(str);
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
