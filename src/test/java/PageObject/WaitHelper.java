package PageObject;


	

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class WaitHelper {
		
	    WebDriver driver;
	    public WaitHelper(WebDriver driver) {
	    	this.driver=driver;
	    }


		public void waitForElementToBeVisible(WebElement element, Duration i) {
	        WebDriverWait wait = new WebDriverWait(driver, i);
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	    public void waitForElementToBeClickable(WebElement element, Duration i) {
	        WebDriverWait wait = new WebDriverWait(driver, i);
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	    
	    
	}

	
