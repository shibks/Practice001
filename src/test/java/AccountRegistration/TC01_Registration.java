package AccountRegistration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.RegPage;
import Utilities.DataReader;

public class TC01_Registration extends BaseClass{
	
	//public WebDriver driver;
	
	@Test(dataProvider="loginData", dataProviderClass = DataReader.class)
	 public void account_registration(String fname, String lname,String uname,String email,String pass,String confmpass,String bio) throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		  
			
			RegPage reg=new RegPage(driver);
			Thread.sleep(2000);
			
			reg.setFirstname(fname);
			reg.setLastname(lname);
			reg.setUsername(uname);
			reg.setEmail(email);
			reg.setUserpass(pass);
			reg.setConfmpass(confmpass);
			reg.bIo(bio);
		
			reg.submitBtn();

			
			Thread.sleep(2000);
			
			System.out.println(reg.validation());
			

}
}
