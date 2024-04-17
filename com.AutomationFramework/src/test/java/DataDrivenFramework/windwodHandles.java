package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windwodHandles {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		BaseClass c= new BaseClass();
		FileInputStream fis= new FileInputStream("./src/test/resources/CommonData.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String property = prop.getProperty("url");
		//maximize the browser
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int fetchRowCount = c.FetchRowCount("./src/test/resources/URL.xlsx", "URL");
		driver.get(property);
		for(int i=1; i<=fetchRowCount;i++) {
			driver.switchTo().newWindow(WindowType.TAB);
		String p = c.FetchUsername("./src/test/resources/URL.xlsx", "URL", i);
		driver.get(p);

		}

	}

}
