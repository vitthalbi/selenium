package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class XYZ {

	public static void main(String[] args) throws IllegalStateException, IOException {
		BaseClass b=new BaseClass();
		String fetchUsername = b.FetchUsername("./src/test/resources/IPL.xlsx", "IPL", 1);
		System.out.println(fetchUsername);
		
		String fetchPassword = b.FetchPassword("./src/test/resources/IPL.xlsx", "IPL", 1);
				
      System.out.println(fetchPassword);
      
      int fetchRowCount = b.FetchRowCount("./src/test/resources/IPL.xlsx", "IPL");
      System.out.println(fetchRowCount);
	}

}
