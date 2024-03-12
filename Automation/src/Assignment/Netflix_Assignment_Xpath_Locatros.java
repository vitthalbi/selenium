package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_Assignment_Xpath_Locatros {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[@autocomplete='email']"));
		
		element.sendKeys("biradarvitthal001@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vityhal@123");
		
		WebElement element2 = driver.findElement(By.xpath("//button[text()='Sign In']"));
		element2.click();
	}

}
