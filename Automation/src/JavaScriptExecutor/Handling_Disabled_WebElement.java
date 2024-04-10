package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Disabled_WebElement {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Launch the web application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('name').value='vitthal';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='biradarvitthal001@gmail.com';");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('password').value='Vitthal@123';");
	}
	}


