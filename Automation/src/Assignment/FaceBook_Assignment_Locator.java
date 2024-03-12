package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Assignment_Locator {

	public static void main(String[] args) {
		// launch the browser
		WebDriver driver  =new ChromeDriver();
		
		//maximize the browser 
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the web application
		driver.get("https://www.facebook.com/");
		
		//identify the user-name text field
	WebElement element = driver.findElement(By.id("email"));

	element.sendKeys("7758889730");
	
	//identify the password  text field
	WebElement element1 = driver.findElement(By.name("pass"));

	element1.sendKeys("Vitthal@123");
	
	//click on login button 
	WebElement element2 = driver.findElement(By.name("login"));

	element2.click();
	}

}
