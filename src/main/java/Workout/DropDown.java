package Workout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/"); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement desktop=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"));
		Actions act=new Actions(driver);
		act.moveToElement(computer).moveToElement(desktop).click().build().perform();
		
		
		WebElement dropNum=driver.findElement(By.id("products-pagesize"));
		Select dropelem=new Select(dropNum);
		dropelem.deselectByVisibleText("6");
		
	}

}
