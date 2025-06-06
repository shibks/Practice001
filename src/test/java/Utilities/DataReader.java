package Utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataReader {
	
	@DataProvider(name = "loginData")
	public static String[][] getExcelData() throws IOException {
		String fileLocation="./excel_data/Reg_Data.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet=workbook.getSheetAt(1);
		int rownum=sheet.getLastRowNum();
		System.out.println("rownum is :"+rownum);
		int cellNum=sheet.getRow(0).getLastCellNum();
		System.out.println("Cell munber is :"+cellNum);
		String[][] data =new String[rownum][cellNum];
		
		  for(int j=1;j<=rownum;j++) { 
			  XSSFRow row=sheet.getRow(j); 
			  for (int i = 0; i < cellNum;i++) { 
				  XSSFCell cell = row.getCell(i);
				  String value=cell.getStringCellValue();
		          data[j-1][i]=value;	
		          } }
		  return data;
		 
	}

}
