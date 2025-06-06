package Workout;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) { 
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(0); 
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions builder = new Actions (driver); 
		builder.dragAndDrop (source, target).perform();
		driver.quit();
	}
}