package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {


	public static void main(String[] args) throws IOException {
		
    
	   	@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");					
		 XSSFSheet sheet = wb.getSheet("Sheet1");
		 XSSFRow row = sheet.getRow(1);
		 XSSFCell cell = row.getCell(1);
		 String cellValue = cell.getStringCellValue();
		 System.out.println(cellValue);
		 
		 String cellValue2 = cell.getStringCellValue();
		 System.out.println(cellValue2);

	}

}
