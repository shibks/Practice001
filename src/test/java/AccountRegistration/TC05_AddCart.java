package AccountRegistration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.AddToCart;

public class TC05_AddCart {
	WebDriver driver;
	@Test
	public void AddCartTest() {
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/search?q=beardo&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		AddToCart add=new AddToCart(driver);
		add.lapTop();
		String mainwindow=driver.getWindowHandle();
		for(String window:driver.getWindowHandles()) {
			if(!window.equals(mainwindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		add.pinCode("629151", driver);
		add.checking();
	}

}
