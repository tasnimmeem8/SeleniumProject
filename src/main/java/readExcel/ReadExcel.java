package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {


	public static void main(String[] args) throws IOException {

	
		
		 @SuppressWarnings("resource")
		 XSSFWorkbook workbook = new XSSFWorkbook ("./data/ReadData.xlsx");
		 XSSFSheet sheet = workbook.getSheet("FamilyName");
		 XSSFRow row = sheet.getRow(3);
		 XSSFCell cell = row.getCell(2);
		 String cellValue = cell.getStringCellValue();
		 System.out.println(cellValue);

	}

	

}
