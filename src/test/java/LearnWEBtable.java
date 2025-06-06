import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnWEBtable {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement table=driver.findElement(By.className("table-display"));
		
		List<WebElement> headers=table.findElements(By.tagName("th"));
		System.out.println(headers.size());
		List<WebElement> allrows=table.findElements(By.cssSelector("tbody tr"));
		int rows=allrows.size();
		
		for(int i=0;i<rows;i++) {
			List<WebElement> row=allrows.get(i).findElements(By.tagName("td"));
			WebElement num=row.get(i);
			String text=num.getText();
			System.out.println(text);
		}
	}
}
