package PageObject;

import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePage extends MonthObjec{
	
	public DatePage(WebDriver driver){
		super(driver);
	}
     
	@FindBy(xpath="(//button[contains(@aria-label, 'Choose date')])[1]")
	WebElement button;
	@FindBy(xpath="(//div[contains(@class, 'MuiPickersCalendarHeader-label')])[4]")
	WebElement date_yr;
	@FindBy(xpath="(//button[@type='button' and contains(@aria-label, 'switch to year view')])[4]")
	WebElement yr_drpdown;
	@FindBy(xpath="(//div[contains(@class, 'MuiPickersCalendarHeader-label')])[4]")
	WebElement txt;
	@FindBy(xpath="(//button[contains(@class, 'MuiPickersArrowSwitcher-previousIconButton')])[4]")
	WebElement prev;
	@FindBy(xpath="(//button[contains(@class, 'MuiPickersArrowSwitcher-nextIconButton')])[4]")
	WebElement next;
	@FindBy(xpath="//div[@class='MuiPickersLayout-root css-16juibx']//div[@class='MuiPickersLayout-contentWrapper css-1nc6gt7']//div[@role='rowgroup']//div[@role='row']//button[@role='gridcell']")
	List<WebElement> dates;
	
	
	public WebElement getYearElement(String year) {
	    return driver.findElement(By.xpath("//button[contains(text(),'" + year + "')]"));
	}
	
	public void chooseDrpDwn() {
		button.click();
	}
	
	public void chooseYear(String year) {
		date_yr.click();
		getYearElement(year).click();
	}
	
	public void chooseDate(String requiredmonth, String requireddate) {
		while(true) {
			String text=txt.getText();
			String month = text.split(" ")[0];
			
			Month dis_month=convertMonth(month);
			Month req_month=convertMonth(requiredmonth);
			
			int result=req_month.compareTo(dis_month);
			
		
				if(result<0) {
					prev.click();
				}
				else if(result>0) {
					next.click();
				}
				else
					break;
			} ;
			
		
		for(WebElement dt:dates) {
			if(dt.getText().equals(requireddate)) {
				dt.click();
				break;
	}
}
	}	
}
