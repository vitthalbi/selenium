package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshot_Assingment {

	public static void main(String[] args) throws IOException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch the browser
		driver.get("https://www.amazon.in/");
		
		//Explicit type Casting 
		TakesScreenshot ts =  (TakesScreenshot) driver;
		
			//use getScreenshotAs() method---> form 
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		//we have to give a file name & file it's class--> We Have Create an Object of File Class
		File dest=new File("./screenshot/image.png");
		
		//Files 3rd party Class and copy() it's method (Static method)
		Files.copy(src, dest);
	}

	}

