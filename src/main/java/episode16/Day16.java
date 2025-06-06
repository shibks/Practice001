package episode16;

import org.openqa.selenium.chrome.ChromeDriver;

public class Day16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://letcode.in/buttons");
	}

}
