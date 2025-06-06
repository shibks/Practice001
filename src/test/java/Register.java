import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Register {
    @Parameters({"firstName","lastName","email","company","pass","confirmpass"})
	@Test
	public void register(String fname , String lname, String email, String company, String pass, String confmPass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='ico-register']")).click(); 
		Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#gender-male")).click();
	    driver.findElement(By.cssSelector("#FirstName")).sendKeys(fname);
	    driver.findElement(By.cssSelector("#LastName")).sendKeys(lname);
	    driver.findElement(By.cssSelector("#Email")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(company);
	    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
	    driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confmPass);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@id='register-button']")).click();	
		try {
		  Thread.sleep(3000); 
		  String expecMsg=driver.findElement(By.xpath("//h1[normalize-space()='Register']")).getText(); 
		  String actualMsg="Register"; Assert.assertEquals(expecMsg,
		  actualMsg);
		 
	    
	    //String title=driver.getTitle();
	    //System.out.println("Title is :"+title);
	    
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}
	}
}
