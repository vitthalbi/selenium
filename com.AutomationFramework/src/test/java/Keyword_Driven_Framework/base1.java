package Keyword_Driven_Framework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base1 implements IAuto1{
	static WebDriver driver;
	public void set() throws IOException
	{
		FLib1 lib= new FLib1();
		String URL = lib.getDataFromProperty(prop_path, "url");
		String browser = lib.getDataFromProperty(prop_path, "browser");
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("invalidData");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do");
		
		
	}
	public void tearDown() {
		
		driver.quit();
	}

}
