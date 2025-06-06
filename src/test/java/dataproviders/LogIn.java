package dataproviders;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LogIn {
	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement login=driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sf@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("098765");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		try {
		 String title=driver.getTitle();
		    System.out.println("Title is :"+title);
		//Thread.sleep(4000);
		//WebElement booksLink=driver.findElement(By.xpath("//a[@class='ico-logout']"));
	    //booksLink.click();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}

}
}
