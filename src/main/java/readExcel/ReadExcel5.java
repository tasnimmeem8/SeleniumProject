package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel5 {

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int RowCount = sheet.getLastRowNum();
		int CellCount = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <= RowCount; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < CellCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}

	}

}
