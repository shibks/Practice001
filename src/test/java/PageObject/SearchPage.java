package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	WaitHelper waitHelper;
	public SearchPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
        waitHelper= new WaitHelper(driver);

	}
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	WebElement searchbox;
	@FindBy(css="svg[width='24']")
	WebElement button;
	
	public void search(String product) {
		searchbox.clear();
		searchbox.sendKeys(product);
	}
	public void clickButton() {
		button.click();
	}
	
}
