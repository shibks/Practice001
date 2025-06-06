package OrangeHrmPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement txt_login;
	
	//Actions
	public void setUserName(String user) {
	txt_username.sendKeys(user);
	}
	
	public void setPasssword(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void click() {
		txt_login.click();
	}
}
