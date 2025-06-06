package Workout;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException { 
		System.setProperty("webdriver.chrome.driver", 
		"./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/"); 
		File firstSrc = driver.getScreenshotAs(OutputType.FILE); 
		File dest = new File("./snaps/img.png"); 
		FileHandler.copy(firstSrc, dest); 
		
		//Capturing screenshot for particular web element
		
		WebElement ele =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File firstSrc001 = ele.getScreenshotAs(OutputType.FILE); 
		File dest001 = new File("./snaps/img003.png"); 
		FileHandler.copy(firstSrc001, dest001); 
		
		
		driver.quit();
		}

}
