package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel4 {

	public static void main(String[] args) throws IOException {

	
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(2);
		double numericCellValue = cell.getNumericCellValue();
		System.out.println(numericCellValue);
		
		XSSFRow row2 = sheet.getRow(0);
		XSSFCell cell2 = row2.getCell(0);
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		

	}

}
