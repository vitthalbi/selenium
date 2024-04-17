package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class BaseClass {
	public String FetchUsername(String path, String sheetName, int rowNum) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(path);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheetName);
	Row row = sheet.getRow(rowNum);
	
	// Username
	Cell value = row.getCell(0);
	
	
	String Value=value.getStringCellValue();
	
	return Value;		
}



public String FetchPassword(String path, String sheetName, int rowNum) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis = new FileInputStream(path);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheetName);
	Row row = sheet.getRow(rowNum);
	
	// Username
	Cell value = row.getCell(1);
	
	String Value=value.getStringCellValue();
	
	return Value;		
}

public int FetchRowCount(String path, String sheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(path);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(sheetName);
	int last = sheet.getLastRowNum();
	
	return last;
	
}
	

}
