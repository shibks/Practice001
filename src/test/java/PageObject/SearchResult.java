package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult{
	
	WebDriver driver;
	WaitHelper waitHelper;
	public SearchResult(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper= new WaitHelper(driver);
	}
	@FindBy(css="._9Wy27C")
	WebElement cart;
	
	public boolean isdisplayed() {
		 waitHelper.waitForElementToBeVisible(cart,Duration.ofSeconds(5));
		 return cart.isDisplayed();
	}
}
	
