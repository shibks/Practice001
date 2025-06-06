package DataDrivenTesing2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
String fileLocation="./excel_data/Reg_Data.xlsx";
		
		XSSFWorkbook workbook=new XSSFWorkbook(fileLocation);
		
		XSSFSheet sheet=workbook.getSheetAt(1);
		int row_num=sheet.getLastRowNum();
		int cell_value=sheet.getRow(0).getLastCellNum();
		int cell_num=cell_value-1;
		for(int i=1;i<=row_num;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<=cell_num;j++) {
				XSSFCell cell=row.getCell(j);
				String value=cell.getStringCellValue();
				System.out.println(value);
			}
		}
		
	}

}
