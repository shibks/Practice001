package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

       
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		
		search.clear();
		search.sendKeys("Laptop");
		
		WebElement button=driver.findElement(By.cssSelector("svg[width='24']"));
		button.click();
	}
}
