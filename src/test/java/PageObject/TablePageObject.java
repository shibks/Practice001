package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablePageObject extends Base {
	WebDriver driver;
	
	public TablePageObject(WebDriver driver) {
		super(driver);
		

}
	@FindBy(xpath="//table[@id='example']")
	WebElement table;
	@FindBy(xpath="//table[@id='example']//tbody//tr")
	WebElement row;
	@FindBy(xpath="//a[@id='example_next']")
	WebElement next;
	@FindBy(xpath="//table[@id='example']//tbody//tr//td[4]")
	List<WebElement> ages;
	
	public void names() {
		for(int p=1;p<=6;p++) {
			if(p>1) {
				next.click();
			}
			
			for(int r=1;r<=ages.size();r++) {
				String age=table.findElement(By.xpath("//tbody//tr["+r+"]//td[4]")).getText();
				int ageNum = Integer.parseInt(age);
				if(ageNum>=45) {
					String name=table.findElement(By.xpath("//tbody//tr["+r+"]//td[2]/preceding-sibling::td")).getText();
					System.out.println("People above age 45 is "+name);
				}
			}
	}
}
}
