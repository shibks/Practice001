package windowHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String year="2023";
		String month="April";
		String date="24";
		
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		
		while (true) {
			String disMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String disYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (disMonth.equals(month) && disYear.equals(year)) {
                    break;
			} 
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:dates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

}
