package PageObject;

import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

public class MonthObjec extends Base{
	
	
	    public MonthObjec(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		static Month convertMonth(String month) {
	        HashMap<String, Month> monthMap = new HashMap<String, Month>();
	        monthMap.put("January", Month.JANUARY);
	        monthMap.put("February", Month.FEBRUARY);
	        monthMap.put("March", Month.MARCH);
	        monthMap.put("April", Month.APRIL);
	        monthMap.put("May", Month.MAY);
	        monthMap.put("June", Month.JUNE);
	        monthMap.put("July", Month.JULY);
	        monthMap.put("August", Month.AUGUST);
	        monthMap.put("September", Month.SEPTEMBER);
	        monthMap.put("October", Month.OCTOBER);
	        monthMap.put("November", Month.NOVEMBER);
	        monthMap.put("December", Month.DECEMBER);

	        Month vmonth = monthMap.get(month);
	        if (vmonth == null) {
	            System.out.println("Invalid Month...");
	        }
	        return vmonth;
	    }
	}

