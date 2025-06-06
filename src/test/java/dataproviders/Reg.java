package dataproviders;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import DataDriven.ReadData;

public class Reg {
	
	@DataProvider(name="login")
	public String[][] getData() throws IOException {
		
		String[][] excelData=ReadData.getExcelData();
		return excelData;
		/*
		 * String[][] data =new String[2][6]; data[0][0]="sanya"; data[0][1]="Shibi";
		 * data[0][2]="sanya@gmail.com"; data[0][3]="cp"; data[0][4]="1234567";
		 * data[0][5]="1234567";
		 * 
		 * data[1][0]="shib"; data[1][1]="chris"; data[1][2]="shibi@gmail.com";
		 * data[1][3]="cp"; data[1][4]="12345678"; data[1][5]="12345678";
		 * 
		 * 
		 * return data;
		 */
	}
   
	@Test(dataProvider = "login")
	public void register(String fname, String lname, String email, String company, String pass, String confmPass) throws InterruptedException {
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
		/*try {
		  Thread.sleep(3000); 
		  String expecMsg=driver.findElement(By.xpath("//h1[normalize-space()='Register']")).getText(); 
		  String actualMsg="Register"; Assert.assertEquals(expecMsg,
		  actualMsg);
		 */
	    
	    String title=driver.getTitle();
	    System.out.println("Title is :"+title);
	    driver.quit();
		/*
		 * }catch(Exception e) { e.printStackTrace(); }finally { driver.quit(); }
		 */
	}
}
