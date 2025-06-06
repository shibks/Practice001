package windowHandles;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		for(int p=1;p<=5;p++) {
			if(p>1) {
				driver.findElement(By.xpath("//div[@class='dt-paging']//button[contains(., '"+p+"')]")).click();
			}
			
			int rows_size=driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
			for(int r=1;r<=rows_size;r++) {
				
				String exp_position="Director";
				
				String position=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[2]")).getText();
				
				if(position.equals(exp_position)) {
					String name=driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+r+"]//td[2]/preceding-sibling::td")).getText();
					
					System.out.println("Name of the director is ="+name);
					break;
				}
			}
			
		}
		 driver.quit();
	}

}
