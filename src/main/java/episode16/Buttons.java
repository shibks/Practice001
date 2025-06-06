package episode16;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/");
	    WebElement ele = driver.findElement(By.xpath("//a[@class='ico-login']")); 
		Point point = ele.getLocation(); 
		int x = point.getX(); 
		int y = point.getY(); 
		System.out.println("x => "+x +" y => "+y);
	}

}
