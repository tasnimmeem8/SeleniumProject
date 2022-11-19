package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel7 {

	@Test
	public void excel() throws IOException {

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowNum = sheet.getLastRowNum();
		for (int i = 1; i < rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			int cellNum = row.getLastCellNum();

			for (int j = 0; j < cellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}

	}

}
