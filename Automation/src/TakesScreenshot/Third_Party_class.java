package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Third_Party_class {

	public static void main(String[] args) throws IOException {
		
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch the web application
		driver.get("https://www.redbus.com");
		
		//using third party class
		EventFiringWebDriver driver1= new EventFiringWebDriver(driver);
		
		
		File src= driver1.getScreenshotAs(OutputType.FILE);
		
		//we have to give a file name & file it's class--> We Have Create an Object of File Class
		File dest=new File("./screenshot/redbus.png");
		
		//Files 3rd party Class and copy() it's method (Static method)
		Files.copy(src, dest);

	}

}
