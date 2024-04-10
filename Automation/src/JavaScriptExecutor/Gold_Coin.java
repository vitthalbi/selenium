package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Gold_Coin {
	public static void main(String[] args) throws InterruptedException, IOException {
		// creating an object of specific class
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch the web application
		driver.get("https://www.bluestone.com/");
		
		//move to element
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		WebElement web=driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions a= new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(web).perform();
	    
		//click on 2 gram
		driver.findElement(By.xpath("(//span[text()='2 gram'])[1]")).click();
		
		// get screenshot particular web-element
		WebElement element = driver.findElement(By.xpath("//h1[text()=' 2 Gram 24 KT Gold Coins ']"));
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot./g.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		
		//screenshot of full page
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./screenshot./g1.png");
		Files.copy(src1, dest1);
		Thread.sleep(2000);
		
		//Scroll-down till Email TextField At Bottom
		WebElement email=driver.findElement(By.xpath("//input[@id='newsletter_subscriber']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", email);
		
		//fill email in email text field and click on subscribe button
		driver.findElement(By.xpath("//input[@id='newsletter_subscriber']")).sendKeys("xyz@gmail.com",Keys.ENTER);

		
		
		
		
                
             
                
	
	}

}
