package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class RemoteWebDriver_DownCasting {

	public static void main(String[] args) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.apple.com");
	
	RemoteWebDriver driver1 =(RemoteWebDriver) driver;
	File src =driver1.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot/apple.png");
	Files.copy(src, dest);
	}

}
