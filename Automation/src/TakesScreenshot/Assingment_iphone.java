package TakesScreenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Assingment_iphone {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//use implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Launch the web application
        driver.get("https://www.apple.com/in/iphone/");
        //click on Apple Tv
        Thread.sleep(1000);
       driver.findElement(By.xpath("(//a[text()='Find a Store'])[2]")).click();
       // click on Search text
       Thread.sleep(1000);
     WebElement click= driver.findElement(By.xpath("//input[@placeholder='Search by location, postcode or store name']"));
     Thread.sleep(1000);
     click.clear();
     click.sendKeys("Pimpri Chinchwad",Keys.ENTER);
     //Robot class object 
     Robot r= new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_A);
     Thread.sleep(1000);
     r.keyPress(KeyEvent.VK_ENTER);
  
  
  	//use getScreenshotAs() method---> form 
  			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  		//we have to give a file name & file it's class--> We Have Create an Object of File Class
  			File dest= new File("./screenshot/find a store.png");
  			
  			//Files 3rd party Class and copy() it's method (Static method)
  			Files.copy(src, dest);
  			
	}

}
