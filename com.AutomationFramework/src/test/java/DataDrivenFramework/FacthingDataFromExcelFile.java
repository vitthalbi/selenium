package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FacthingDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis= new FileInputStream("./src/test/resources/IPL.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("IPL");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		System.out.println(username);
		Cell cell1 = row.getCell(1);

		String password = cell1.getStringCellValue();
		System.out.println(password);
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);

	}

}
