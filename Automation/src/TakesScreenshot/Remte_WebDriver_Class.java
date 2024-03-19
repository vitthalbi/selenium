package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Remte_WebDriver_Class {

	public static void main(String[] args) throws IOException {
		// Launch the browser
		RemoteWebDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// launch the web application
		driver.get("https://shoppersStack.com");
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/shoppersStack.png");
		
		Files.copy(src, dest);
		
		

	}

}
