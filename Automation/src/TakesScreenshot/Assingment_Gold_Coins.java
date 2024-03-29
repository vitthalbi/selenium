package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Assingment_Gold_Coins {

	public static void main(String[] args) throws IOException, InterruptedException {
		// creating an object of specific class
				ChromeDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//use implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Launch the web application
				driver.get("https://www.bluestone.com/");
				
				driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
				
				WebElement web=driver.findElement(By.xpath("//a[@title='Coins']"));
				Actions a= new Actions(driver);
				a.moveToElement(web).perform();
				web.click();
				WebElement web2=driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
//				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//				wait.until(ExpectedConditions.visibilityOf(web2));
				if(web2.isDisplayed())
				{
				File src =web2.getScreenshotAs(OutputType.FILE);
				Thread.sleep(2000);
				File dest= new File("./screenshot/gold2.png");
				Thread.sleep(1000);
				Files.copy(src, dest);
				}

	}

}
