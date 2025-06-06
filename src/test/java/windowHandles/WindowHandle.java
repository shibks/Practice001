package windowHandles;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WindowHandle {
	WebDriver driver;
	
	@Test
	public void handlingWindow() {
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Windows.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Set<String> handles=driver.getWindowHandles();
		System.out.println(handles);
		List<String> list=new ArrayList<String>(handles);
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
	}

}
