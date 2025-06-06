package windowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringExtraction {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://mui.com/x/react-date-pickers/date-picker/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.xpath("(//button[contains(@aria-label, 'Choose date')])[1]")).click();
		String text=driver.findElement(By.xpath("(//div[contains(@class, 'MuiPickersCalendarHeader-label')])[4]")).getText();
		
		String month = text.split(" ")[0];
		System.out.println(month);
	}

}
