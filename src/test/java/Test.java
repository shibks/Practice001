import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	
	
	
	
	public static void main(String[] args) throws IOException {
		String fileLocation="./excel_data/Reg_Data.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet=workbook.getSheetAt(1);
		int rownum=sheet.getLastRowNum();
		System.out.println("rownum is :"+rownum);
		int cellNum=sheet.getRow(0).getLastCellNum();
		System.out.println("Cell munber is :"+cellNum);
	
		
	}
}
