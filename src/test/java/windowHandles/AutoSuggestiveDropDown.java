package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoSuggestiveDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/AutoComplete.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Afghanistan");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//a[contains(text(),'Afghanistan,ivvvaaa')]")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Afghanistan,ivvvaaa')]")).click();
		
		Thread.sleep(2000);
		
		String str=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect-item']")).getText();
		
		System.out.println(str);
		
		Assert.assertTrue(str.contains("Afghanistan,ivvvaaa"));
		driver.quit();
		
	}

}
