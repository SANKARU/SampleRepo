package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	static FileInputStream f; // it is an in built class in java
	static XSSFWorkbook w; // to fetch workbook from file
	static XSSFSheet s; // in workbook there are multiple sheets

	public static String getStringData(int a, int b) throws IOException {
		f = new FileInputStream("C:\\Users\\gauth\\OneDrive\\Desktop\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);

		return c.getStringCellValue(); // to return value inside the cell

	}

	// In java by default the Data type will be double
	public static int getIntegerData(int a, int b) throws IOException {
		f = new FileInputStream("C:\\Users\\gauth\\OneDrive\\Desktop\\Book1.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(a);
		XSSFCell c = r.getCell(b);

		// we are converting double to int
		// in java by default it is java we are changing it to int so we are doint
		// typecasting
		int x = (int) c.getNumericCellValue();
		return x;
	}

	public static void main(String[] args) throws IOException {

		System.out.println(ExcelRead1.getStringData(1, 0));
		System.out.println(ExcelRead1.getIntegerData(1, 1));
	}

}
