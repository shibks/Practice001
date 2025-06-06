package PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	WebDriver driver;
	WaitHelper waitHelper;
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		waitHelper=new WaitHelper(driver);
	}

	@FindBy(xpath="//a[@title='BEARDO Godfather Lite Beard and Oil, 30 ml Hair Oil']")
	WebElement beardo;
	@FindBy(xpath="//input[@id='pincodeInputId']")
	WebElement pin;
	@FindBy(css=".i40dM4")
	WebElement check;
	
	public void lapTop() {
		waitHelper.waitForElementToBeVisible(beardo, Duration.ofSeconds(5));
		beardo.click();
	}
	
	public void pinCode(String pincode,WebDriver driver) {
		//waitHelper.waitForElementToBeVisible(pin, Duration.ofSeconds(5));
		//pin.clear();
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].value=arguments[1];", pin, pincode);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 int attempts = 0;
		    while(attempts < 3) {
		        try {
		            WebElement pinCodeElement = wait.until(ExpectedConditions.visibilityOf(pin));
		            pinCodeElement.clear();
		            JavascriptExecutor js = (JavascriptExecutor)driver;
		    		js.executeScript("arguments[0].value=arguments[1];", pinCodeElement, pincode);
		            break;
		        } catch(StaleElementReferenceException e) {
		            attempts++;
		            if(attempts == 3) throw e;
		        }
		    }
		
		 
	}
	public void checking() {
		waitHelper.waitForElementToBeClickable(check, Duration.ofSeconds(5));
		check.click();
	}
	
}
