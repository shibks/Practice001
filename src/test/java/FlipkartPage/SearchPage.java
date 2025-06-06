package FlipkartPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SearchPage {
	
	WebDriver driver;
	WaitHelper waitHelper;
	public SearchPage(WebDriver driver) {
		 this.driver = driver;
	        PageFactory.initElements(driver, this);
	        
		
		waitHelper=new WaitHelper(driver);
		
	}
	
	@FindBy(xpath="//div[@class='hZmZbn AQNm5W']")
	WebElement slider;
	@FindBy(xpath="//div[@title='OPPO']//div[@class='XqNaEv']")
	WebElement chckboxOppo;
	@FindBy(xpath="(//div[@class='A8uQAd'])[1]")
	WebElement compareFirst;
	@FindBy(xpath="(//div[@class='A8uQAd'])[2]")
	WebElement compareScnd;
	@FindBy(xpath="//span[contains(text(),'COMPARE')]")
	WebElement compareBtn;
	@FindBy(xpath="//div[@class='XqNaEv']")
	WebElement diffCheck;
	@FindBy(xpath="//div[@class='Q9-Qh2']//div[@class='Nx9bqj'][contains(text(),'₹14,999')]")
	WebElement price;
	
	public void moveSlider(WebDriver driver) {
		 //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slider);
		waitHelper.waitForElementToBeVisible(slider, Duration.ofSeconds(5));
        new Actions(driver).clickAndHold(slider)
        .moveByOffset(50, 0) // Only X-axis
        .release()
        .perform();
      //  waitHelper.waitForSeconds(3);
	}
	public void clickApple() {
		waitHelper.waitForElementToBeClickable(chckboxOppo, Duration.ofSeconds(5));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", chckboxOppo);
		// waitHelper.waitForSeconds(3);
	}
	public void clickFirst() {
		waitHelper.waitForElementToBeClickable(compareFirst, Duration.ofSeconds(5));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", compareFirst);
	}
	public void clickScnd() {
		waitHelper.waitForElementToBeClickable(compareScnd, Duration.ofSeconds(5));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", compareScnd);
		// waitHelper.waitForSeconds(3);
	}
	public void clickCompare() {
		waitHelper.waitForElementToBeClickable(compareBtn, Duration.ofSeconds(5));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", compareBtn);
		//waitHelper.waitForSeconds(5);
		
		
	}
}