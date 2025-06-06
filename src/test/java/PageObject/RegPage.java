package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage extends Base {
	WebDriver driver;
	
	public RegPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement frstName;
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lstName;
	@FindBy(xpath="//input[@id='user_login']")
	WebElement userName;
	@FindBy(xpath="//input[@id='user_email']")
	WebElement eMail;
	@FindBy(xpath="//input[@id='user_pass']")
	WebElement userPass;
	@FindBy(xpath="//input[@id='user_confirm_password']")
	WebElement confmPass;
	@FindBy(xpath="//textarea[@id='description']")
	WebElement bIO;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//ul[normalize-space()='User successfully registered.']")
	WebElement sucssMsg;
	@FindBy(xpath="//li[normalize-space()='Username already exists.']")
	WebElement errorMsg;
	
	
	public void setFirstname(String fname) {
		frstName.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		lstName.sendKeys(lname);
	}
	
	public void setUsername(String uname) {
		userName.sendKeys(uname);
	}
	
	
	public void setEmail(String email) {
		eMail.sendKeys(email);
	}
	
	
	public void setUserpass(String pass) {
		userPass.sendKeys(pass);
	}
	
	public void setConfmpass(String confmpass) {
		confmPass.sendKeys(confmpass);
	}
	
	public void bIo(String bio) {
		bIO.sendKeys(bio);
		
	}
	
	public void submitBtn() {
		submit.click();
	}
	
	
		
	
	public String validation() {
		return errorMsg.getText();
	}

}
