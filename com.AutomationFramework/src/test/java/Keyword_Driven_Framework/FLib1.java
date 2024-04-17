package Keyword_Driven_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FLib1 {
	public String getDataFromProperty(String filepath, String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(filepath);
		Properties prop = new Properties();
		prop.load(fis);
	String value = prop.getProperty(key);
	return value;
	
	
	}
	

}
