package learnTestNGParameters_excel_1;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static String[][] readExcel() throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./data1/RecordData.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		String [][]data= new String [rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				
				data [i-1][j]= cellValue;
			}
		}

		return data;
	}

}
