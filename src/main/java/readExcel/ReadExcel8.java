package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel8 {
	@Test
	public void excel() throws IOException {
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		
			for (int i = 1; i < rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
				short cellCount = row.getLastCellNum();
				for (int j = 0; j < cellCount; j++) {
					XSSFCell cell = row.getCell(j);
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
				}
			}
		}
	

}
