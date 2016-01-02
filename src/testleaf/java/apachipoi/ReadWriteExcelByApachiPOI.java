package testleaf.java.apachipoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelByApachiPOI {

	public static void main(String[] args) throws Exception  {

		// Read file path from physical location

		FileInputStream filePath = new FileInputStream(
				new File("C:/Users/Karim-9884439520/Desktop/TestLeafSample.xlsx"));

		// Use Apachi POI to read the excel file

		XSSFWorkbook xssfWorkBook = new XSSFWorkbook(filePath);

		// From xssf work book choose the xl sheet either by index or name if
		// you know

		XSSFSheet sheet = xssfWorkBook.getSheet("Sheet1");

		// From sheet choose row - Hint Row starts from "0"
		//		XSSFRow row = sheet.getRow(0);

		// Here all cell are object, to read the actual we should use few
		// inbuild methods like
		// getStringCellValue - String, getBooleanCellValue - Boolean, etc

		// Iterate throw rows , this 1st for loop will iterate through rows

		// From sheet read the max of rows

		int maxOfRows = sheet.getLastRowNum();
		for (int i = 0; i <= maxOfRows; i++) {

			XSSFRow rowObject = sheet.getRow(i);

			// Iterate throw cells or columns , this 1st for loop will iterate
			// through colums

			// From sheet read the max of columns

			int cellCount = rowObject.getLastCellNum();
			for (int j = 0; j < cellCount; j++) {
					System.out.println(rowObject.getCell(j).getStringCellValue());
			
			}

		}
		
		xssfWorkBook.close();

	}

}
