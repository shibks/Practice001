package AccountRegistration;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	WebDriver driver;
	Properties p;
	
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException {
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			
			DesiredCapabilities cap=new DesiredCapabilities();
			
			if(os.equalsIgnoreCase("linux")) {
				cap.setPlatform(Platform.LINUX);
			}
			else if(os.equalsIgnoreCase("mac")) {
				cap.setPlatform(Platform.MAC);
			}
			else if(os.equalsIgnoreCase("chrome")) {
				cap.setPlatform(Platform.WIN11);
			}
			
			switch(br.toLowerCase()) {
			 case "chrome" : cap.setBrowserName("chrome");
			  break;
			 case "edge" : cap.setBrowserName("edge");
			  break;
			 case "firefox" : cap.setBrowserName("firefox");
			  break;
			  default : System.out.println("No matching browser");
			  return;
			  
			 
			}
			try {
				URL huburl=new URL("http://localhost:4444/wd/hub");
				driver=new RemoteWebDriver(huburl, cap);
			} catch (MalformedURLException e) {
			    System.out.println("Invalid URL: " + e.getMessage());
			} catch (WebDriverException e) {
			    System.out.println("WebDriver error: " + e.getMessage());
			} catch (Exception e) {
			    System.out.println("General error: " + e.getMessage());
			}
		}
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
			switch(br.toLowerCase()) {
			  case "chrome" : driver=new ChromeDriver();
			  break;
			  case "edge" : driver=new EdgeDriver();
			  break;
			  case "firefox" :driver=new FirefoxDriver();
			  break;
			  default : System.out.println("Invalid browserName");
			  return;
			  }
		}
		  
			driver.manage().deleteAllCookies();
			driver.get(p.getProperty("appURL2"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	@AfterClass
	public void teardown() {
		
		driver.quit();
		
	}

}
