package Keyword_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Vitthal Biradar
 */

public class BaseTest implements IAutoConstant {

	static WebDriver driver;

	//launching the browser
	public void setUp() throws IOException {
		FLib lib = new FLib();
		String URL = lib.getDataFromProperty(PROP_PATH, "Url");
		String browser = lib.getDataFromProperty(PROP_PATH, "browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get("http://127.0.0.1/login.do");
	}
	
	//close the browse
	public void tearDown()
	{
		driver.quit();
	}

}