package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class youtube {

	public static void main(String[] args) throws IOException {
		// we are doing Up-casting----> RemoteWebDriver consist of Parent  Class and ChromeDriver consist of child class
		RemoteWebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Launch the web application
		driver.get("https://www.youtube.com/");
		
		//use getScreenshotAs() method---> form 
		File src =driver.getScreenshotAs(OutputType.FILE);
		
		//we have to give a file name & file it's class--> We Have Create an Object of File Class
		File dest=new File("./screenshot/youtube.png");
	
		//Files 3rd party Class and copy() it's method (Static method)
		Files.copy(src, dest);
		
		
	}

}
