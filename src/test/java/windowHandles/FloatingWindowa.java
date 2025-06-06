package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FloatingWindowa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.ikea.cn/cn/en/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement products=driver.findElement(By.xpath("//span[contains(text(),'All products')]"));
		WebElement subproduct=driver.findElement(By.xpath("//a[text()='Sofas & armchairs']"));
		WebElement sofa=driver.findElement(By.xpath("//div[contains(text(),'Sofas')]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(products).click().pause(1000).moveToElement(subproduct).click().moveToElement(sofa).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
