package FlipkartPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slider {

	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 
		WebElement slider=driver.findElement(By.xpath("//div[@class='hZmZbn AQNm5W']"));

		Actions actions = new Actions(driver);
		
		 actions.clickAndHold(slider).moveByOffset(50, 50).release().perform();
		 Thread.sleep(2000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element = driver.findElement(By.xpath("//div[@title='Apple']//div[@class='_6i1qKy']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		 Thread.sleep(5000);
          WebElement frst=driver.findElement(By.xpath("(//div[@class='XqNaEv'])[18]"));
          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", frst);
          
          
          WebElement scnd=driver.findElement(By.xpath("(//input[contains(@class, 'vn9L2C')])[18]"));
          ((JavascriptExecutor) driver).executeScript("arguments[0].click();", scnd);
          
          WebElement compare = wait.until(
                  ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'COMPARE')]"))
              );
          compare.click();
		 Thread.sleep(5000);
		 WebElement diff=driver.findElement(By.xpath("//div[@class='XqNaEv']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", diff);
		 
		 WebElement price=driver.findElement(By.xpath("//div[@class='Q9-Qh2']//div[@class='Nx9bqj'][contains(text(),'₹14,999')]"));
		System.out.println(price.getText());
		 driver.quit();
	}
}
