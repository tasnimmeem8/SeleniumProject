package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel6 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();
		short cellCount = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < cellCount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}

	}

}
