package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class netflix {

	public static void main(String[] args) throws IOException, InterruptedException {
		// creating an object of specific class
				ChromeDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//use implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Launch the web application
				driver.get("https://www.netflix.com/in/");
						
				WebElement logo=driver.findElement(By.xpath("//span[@data-uia='nmhp-card-header+logo']"));
				
				File src =logo.getScreenshotAs(OutputType.FILE);
				File dest= new File("./screenshot/net.png");
				Files.copy(src, dest);
			

	}

}
