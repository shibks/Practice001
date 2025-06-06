package Workout;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//FINDING ELEMENTS FROM A TABLE USING ID
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> headers=table.findElements(By.tagName("th"));
		for(WebElement header : headers) { 
		String text = header.getText(); 
		System.out.println(text); 
		} 
		driver.quit();
		
		//FINDING USIMG XPATH
		String siteName=driver.findElement(By.xpath("//span[normalize-space()='Meta']")).getText();
		System.out.println(siteName);
	}

}
