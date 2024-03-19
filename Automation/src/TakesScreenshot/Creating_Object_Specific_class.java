package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Creating_Object_Specific_class {

	public static void main(String[] args) throws IOException {
		
		// creating an object of specific class
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch the web application
		driver.get("https://www.flipkart.com");
		//use getScreenshotAs() method---> form 
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		//we have to give a file name & file it's class--> We Have Create an Object of File Class
		File dest= new File("./screenshot/flipkart.png");
		
		//Files 3rd party Class and copy() it's method (Static method)
		Files.copy(src, dest);
	}

}
