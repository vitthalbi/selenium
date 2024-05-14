package BatchExcutaion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Web_Shop_Locators {
@Test
public void Demo()
{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
	
	//click on gender 
		WebElement element = driver.findElement(By.id("gender-male"));
		element.click();
		//pass First-Name 
		WebElement element2 = driver.findElement(By.name("FirstName"));
	element2.sendKeys("Vitthal ");
	//pass the Last-Name
	WebElement element3 = driver.findElement(By.name("LastName"));
	element3.sendKeys("Biradar");
	//pass the E-mail Address
	WebElement element4 = driver.findElement(By.id("Email"));
	element4.sendKeys("biradarvitthal001@gmail.com");
	//pass the Password
	WebElement element5 = driver.findElement(By.name("Password"));
	element5.sendKeys("Vitthal@123");
	//Confirm password
	WebElement element6 = driver.findElement(By.name("ConfirmPassword"));
	element6.sendKeys("Vitthal@123");
 	//click on register button
	WebElement element7 = driver.findElement(By.name("register-button"));
	element7.click();
	}

}
