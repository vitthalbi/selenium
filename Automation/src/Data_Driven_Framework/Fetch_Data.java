package Data_Driven_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetch_Data {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/CommonData.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		
		System.out.println(url);
		
		String username = prop.getProperty("username");
	
	System.out.println(username);
	

	String password = prop.getProperty("password");

System.out.println(password);


String DOB = prop.getProperty("DOB");

System.out.println(DOB);
	}

}
